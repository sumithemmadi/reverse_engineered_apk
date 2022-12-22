package com.allinone.callerid.util.t9;

import android.text.TextUtils;
import java.util.BitSet;

public final class c {
  private static T9MatchInfo a(T9MatchInfo paramT9MatchInfo) {
    T9MatchInfo t9MatchInfo = paramT9MatchInfo;
    if (paramT9MatchInfo.a()) {
      t9MatchInfo = new T9MatchInfo();
      paramT9MatchInfo.e(t9MatchInfo);
    } 
    return t9MatchInfo;
  }
  
  public static T9MatchInfo b(String paramString, char paramChar) {
    T9MatchInfo t9MatchInfo = new T9MatchInfo();
    if (!TextUtils.isEmpty(paramString)) {
      int i = paramString.indexOf(e.b(paramChar));
      if (i >= 0)
        t9MatchInfo.d(e.g(paramString, paramString.substring(0, i).lastIndexOf(';') + 1, i), 1); 
    } 
    return t9MatchInfo;
  }
  
  public static T9MatchInfo c(String paramString1, String paramString2) {
    if (TextUtils.isEmpty(paramString1) || TextUtils.isEmpty(paramString2))
      return new T9MatchInfo(); 
    int i = paramString2.length();
    int j = 0;
    if (i == 1)
      return b(paramString1, paramString2.charAt(0)); 
    T9MatchInfo t9MatchInfo = new T9MatchInfo();
    do {
      int k = paramString1.indexOf(';', j);
      i = k;
      if (k < 0)
        i = paramString1.length(); 
      if (j < i)
        e(t9MatchInfo, paramString1, j, i, paramString2); 
      j = i + 1;
    } while (!t9MatchInfo.a() && i < paramString1.length());
    return t9MatchInfo;
  }
  
  private static int d(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, int paramInt4, BitSet paramBitSet) {
    int i = paramInt3 + 1;
    int j;
    for (j = i; j < paramInt2 && !e.i(paramString1.charAt(j)); j++);
    if (j == paramInt2) {
      if (paramString1.regionMatches(i, paramString2, paramInt4 + 1, paramString2.length() - paramInt4 - 1)) {
        paramInt1 = paramInt3 - paramInt1;
        paramBitSet.set(paramInt1, paramString2.length() + paramInt1 - paramInt4);
        return 1;
      } 
      return 0;
    } 
    int k = paramInt4 + 1;
    if (e.b(paramString2.charAt(k)) == paramString1.charAt(j)) {
      if (paramString2.length() == paramInt4 + 2) {
        paramBitSet.set(paramInt3 - paramInt1);
        paramBitSet.set(j - paramInt1);
        return 2;
      } 
      int i1 = d(paramString1, paramInt1, paramInt2, j, paramString2, k, paramBitSet);
      if (i1 > 0) {
        paramBitSet.set(paramInt3 - paramInt1);
        paramInt1 = i1;
        return paramInt1 + 1;
      } 
    } 
    int m = j - paramInt3;
    int n = j - 1;
    while (paramString1.charAt(n) == ' ') {
      n--;
      m--;
    } 
    if (paramString2.length() - paramInt4 <= m) {
      if (paramString1.regionMatches(i, paramString2, k, paramString2.length() - paramInt4 - 1)) {
        paramInt1 = paramInt3 - paramInt1;
        paramBitSet.set(paramInt1, paramString2.length() + paramInt1 - paramInt4);
        return 1;
      } 
      return 0;
    } 
    paramInt4 += m;
    if (e.b(paramString2.charAt(paramInt4)) == paramString1.charAt(j) && paramString1.regionMatches(i, paramString2, k, m - 1)) {
      if (paramInt4 + 1 == paramString2.length()) {
        paramBitSet.set(paramInt3 - paramInt1, j - paramInt1 + 1);
        return 2;
      } 
      paramInt2 = d(paramString1, paramInt1, paramInt2, j, paramString2, paramInt4, paramBitSet);
      if (paramInt2 > 0) {
        paramBitSet.set(paramInt3 - paramInt1, j - paramInt1);
        paramInt1 = paramInt2;
        return paramInt1 + 1;
      } 
    } 
    return 0;
  }
  
  private static void e(T9MatchInfo paramT9MatchInfo, String paramString1, int paramInt1, int paramInt2, String paramString2) {
    BitSet bitSet2;
    if (paramInt2 - paramInt1 < paramString2.length())
      return; 
    int i = paramInt2 - paramString2.length() + 1;
    char c1 = e.b(paramString2.charAt(0));
    BitSet bitSet1 = null;
    int j = paramInt1;
    while (true) {
      if (j >= i) {
        BitSet bitSet = bitSet1;
        break;
      } 
      j = paramString1.indexOf(c1, j);
      bitSet2 = bitSet1;
      if (j >= 0) {
        if (j >= i) {
          bitSet2 = bitSet1;
          break;
        } 
        bitSet2 = bitSet1;
        if (bitSet1 == null)
          bitSet2 = e.e(); 
        bitSet2.clear();
        if (d(paramString1, paramInt1, paramInt2, j, paramString2, 0, bitSet2) > 0) {
          g(paramString1, paramT9MatchInfo, bitSet2, paramInt1);
          break;
        } 
        j++;
        bitSet1 = bitSet2;
        continue;
      } 
      break;
    } 
    if (bitSet2 != null)
      e.k(bitSet2); 
  }
  
  public static T9MatchInfo f(String paramString1, String paramString2) {
    T9MatchInfo t9MatchInfo = new T9MatchInfo();
    if (!TextUtils.isEmpty(paramString1) && !TextUtils.isEmpty(paramString2)) {
      int i = paramString1.indexOf(paramString2);
      if (i >= 0)
        t9MatchInfo.d(i, paramString2.length()); 
    } 
    return t9MatchInfo;
  }
  
  private static void g(String paramString, T9MatchInfo paramT9MatchInfo, BitSet paramBitSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual length : ()I
    //   4: istore #4
    //   6: iconst_0
    //   7: istore #5
    //   9: iload_3
    //   10: istore #6
    //   12: iconst_m1
    //   13: istore #7
    //   15: iload #6
    //   17: iload #4
    //   19: if_icmpge -> 160
    //   22: aload_0
    //   23: iload #6
    //   25: invokevirtual charAt : (I)C
    //   28: istore #8
    //   30: iload #6
    //   32: iload_3
    //   33: if_icmpeq -> 62
    //   36: iload #8
    //   38: bipush #32
    //   40: if_icmpeq -> 62
    //   43: iload #5
    //   45: istore #9
    //   47: iload #7
    //   49: istore #10
    //   51: aload_1
    //   52: astore #11
    //   54: iload #8
    //   56: invokestatic i : (C)Z
    //   59: ifeq -> 143
    //   62: aload_2
    //   63: iload #6
    //   65: iload_3
    //   66: isub
    //   67: invokevirtual get : (I)Z
    //   70: ifeq -> 103
    //   73: iload #8
    //   75: bipush #32
    //   77: if_icmpeq -> 103
    //   80: iload #7
    //   82: istore #10
    //   84: aload_1
    //   85: astore #11
    //   87: iload #7
    //   89: iconst_m1
    //   90: if_icmpne -> 137
    //   93: iload #5
    //   95: istore #10
    //   97: aload_1
    //   98: astore #11
    //   100: goto -> 137
    //   103: iload #7
    //   105: istore #10
    //   107: aload_1
    //   108: astore #11
    //   110: iload #7
    //   112: iconst_m1
    //   113: if_icmple -> 137
    //   116: aload_1
    //   117: invokestatic a : (Lcom/allinone/callerid/util/t9/T9MatchInfo;)Lcom/allinone/callerid/util/t9/T9MatchInfo;
    //   120: astore #11
    //   122: aload #11
    //   124: iload #7
    //   126: iload #5
    //   128: iload #7
    //   130: isub
    //   131: invokevirtual d : (II)V
    //   134: iconst_m1
    //   135: istore #10
    //   137: iload #5
    //   139: iconst_1
    //   140: iadd
    //   141: istore #9
    //   143: iinc #6, 1
    //   146: iload #9
    //   148: istore #5
    //   150: iload #10
    //   152: istore #7
    //   154: aload #11
    //   156: astore_1
    //   157: goto -> 15
    //   160: iload #7
    //   162: iconst_m1
    //   163: if_icmple -> 180
    //   166: aload_1
    //   167: invokestatic a : (Lcom/allinone/callerid/util/t9/T9MatchInfo;)Lcom/allinone/callerid/util/t9/T9MatchInfo;
    //   170: iload #7
    //   172: iload #5
    //   174: iload #7
    //   176: isub
    //   177: invokevirtual d : (II)V
    //   180: return
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/t9/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */