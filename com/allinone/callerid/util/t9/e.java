package com.allinone.callerid.util.t9;

import java.util.BitSet;

public final class e {
  private static final char[] a = new char[] { 
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
      '+', ',', '*', '#' };
  
  private static final char[] b = new char[] { 
      '2', '2', '2', '3', '3', '3', '4', '4', '4', '5', 
      '5', '5', '6', '6', '6', '7', '7', '7', '7', '8', 
      '8', '8', '9', '9', '9', '9' };
  
  private static final b<StringBuilder> c = new b<StringBuilder>(4);
  
  private static final b<BitSet> d = new b<BitSet>(4);
  
  public static String a(String paramString, a parama) {
    StringBuilder stringBuilder = f();
    stringBuilder.append(';');
    int i = paramString.length();
    for (byte b1 = 0; b1 < i; b1++) {
      char c = paramString.charAt(b1);
      if (c < '' || c < 'ɐ' || ('Ḁ' <= c && c < 'ỿ')) {
        h(stringBuilder, String.valueOf(b(d(c))));
      } else {
        String[] arrayOfString = parama.a(c);
        if (arrayOfString == null || arrayOfString.length == 0) {
          h(stringBuilder, " ");
        } else if (arrayOfString.length == 1) {
          h(stringBuilder, c(arrayOfString[0]));
        } else {
          String str = stringBuilder.toString();
          StringBuilder stringBuilder1 = f();
          stringBuilder.setLength(0);
          int j = arrayOfString.length;
          for (byte b2 = 0; b2 < j; b2++) {
            String str1 = arrayOfString[b2];
            stringBuilder1.setLength(0);
            stringBuilder1.append(str);
            h(stringBuilder1, c(str1));
            stringBuilder.append(stringBuilder1);
          } 
          l(stringBuilder1);
        } 
      } 
    } 
    stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
    paramString = stringBuilder.toString();
    l(stringBuilder);
    return paramString;
  }
  
  static char b(char paramChar) {
    return (char)(paramChar - 35 + 67);
  }
  
  private static String c(String paramString) {
    if (paramString == null || paramString.length() == 0)
      return " "; 
    StringBuilder stringBuilder = f();
    byte b1 = 0;
    while (b1 < paramString.length()) {
      char c = paramString.charAt(b1);
      if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
        c = d(c);
        char c1 = c;
        if (b1 == 0) {
          char c2 = b(c);
          c1 = c2;
        } 
        stringBuilder.append(c1);
        b1++;
        continue;
      } 
      stringBuilder.setLength(0);
      stringBuilder.append(' ');
    } 
    paramString = stringBuilder.toString();
    l(stringBuilder);
    return paramString;
  }
  
  public static char d(char paramChar) {
    return (paramChar >= 'A' && paramChar <= 'Z') ? b[paramChar - 65] : ((paramChar >= 'a' && paramChar <= 'z') ? b[paramChar - 97] : (j(paramChar) ? paramChar : Character.MIN_VALUE));
  }
  
  static BitSet e() {
    BitSet bitSet = d.a();
    if (bitSet == null)
      bitSet = new BitSet(); 
    return bitSet;
  }
  
  static StringBuilder f() {
    StringBuilder stringBuilder = c.a();
    if (stringBuilder == null)
      stringBuilder = new StringBuilder(); 
    return stringBuilder;
  }
  
  static int g(String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual length : ()I
    //   4: istore_3
    //   5: iload_2
    //   6: istore #4
    //   8: iload_2
    //   9: iload_3
    //   10: if_icmplt -> 18
    //   13: iload_3
    //   14: iconst_1
    //   15: isub
    //   16: istore #4
    //   18: iconst_0
    //   19: istore #5
    //   21: iload_1
    //   22: istore_2
    //   23: iload_2
    //   24: iload #4
    //   26: if_icmpge -> 73
    //   29: aload_0
    //   30: iload_2
    //   31: invokevirtual charAt : (I)C
    //   34: istore #6
    //   36: iload_2
    //   37: iload_1
    //   38: if_icmpeq -> 59
    //   41: iload #6
    //   43: bipush #32
    //   45: if_icmpeq -> 59
    //   48: iload #5
    //   50: istore_3
    //   51: iload #6
    //   53: invokestatic i : (C)Z
    //   56: ifeq -> 64
    //   59: iload #5
    //   61: iconst_1
    //   62: iadd
    //   63: istore_3
    //   64: iinc #2, 1
    //   67: iload_3
    //   68: istore #5
    //   70: goto -> 23
    //   73: iload #5
    //   75: ireturn
  }
  
  private static void h(StringBuilder paramStringBuilder, String paramString) {
    if (paramString.length() == 0)
      return; 
    int i = -1;
    while (true) {
      i = paramStringBuilder.indexOf(String.valueOf(';'), i + 1);
      if (i >= 0) {
        paramStringBuilder.insert(i, paramString);
        i += paramString.length();
        continue;
      } 
      break;
    } 
  }
  
  static boolean i(char paramChar) {
    boolean bool;
    if (paramChar >= 'C' && paramChar <= 'Y') {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean j(char paramChar) {
    return ((paramChar >= '0' && paramChar <= '9') || paramChar == ',' || paramChar == '+' || paramChar == '*' || paramChar == '#');
  }
  
  static void k(BitSet paramBitSet) {
    paramBitSet.clear();
    d.c(paramBitSet);
  }
  
  static void l(StringBuilder paramStringBuilder) {
    paramStringBuilder.setLength(0);
    c.c(paramStringBuilder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/t9/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */