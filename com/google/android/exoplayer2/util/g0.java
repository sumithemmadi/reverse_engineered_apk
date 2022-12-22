package com.google.android.exoplayer2.util;

import android.net.Uri;

public final class g0 {
  private static int[] a(String paramString) {
    // Byte code:
    //   0: iconst_4
    //   1: newarray int
    //   3: astore_1
    //   4: aload_0
    //   5: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   8: ifeq -> 17
    //   11: aload_1
    //   12: iconst_0
    //   13: iconst_m1
    //   14: iastore
    //   15: aload_1
    //   16: areturn
    //   17: aload_0
    //   18: invokevirtual length : ()I
    //   21: istore_2
    //   22: aload_0
    //   23: bipush #35
    //   25: invokevirtual indexOf : (I)I
    //   28: istore_3
    //   29: iload_3
    //   30: iconst_m1
    //   31: if_icmpne -> 37
    //   34: goto -> 39
    //   37: iload_3
    //   38: istore_2
    //   39: aload_0
    //   40: bipush #63
    //   42: invokevirtual indexOf : (I)I
    //   45: istore #4
    //   47: iload #4
    //   49: iconst_m1
    //   50: if_icmpeq -> 62
    //   53: iload #4
    //   55: istore_3
    //   56: iload #4
    //   58: iload_2
    //   59: if_icmple -> 64
    //   62: iload_2
    //   63: istore_3
    //   64: aload_0
    //   65: bipush #47
    //   67: invokevirtual indexOf : (I)I
    //   70: istore #5
    //   72: iload #5
    //   74: iconst_m1
    //   75: if_icmpeq -> 88
    //   78: iload #5
    //   80: istore #4
    //   82: iload #5
    //   84: iload_3
    //   85: if_icmple -> 91
    //   88: iload_3
    //   89: istore #4
    //   91: aload_0
    //   92: bipush #58
    //   94: invokevirtual indexOf : (I)I
    //   97: istore #6
    //   99: iload #6
    //   101: istore #5
    //   103: iload #6
    //   105: iload #4
    //   107: if_icmple -> 113
    //   110: iconst_m1
    //   111: istore #5
    //   113: iload #5
    //   115: iconst_2
    //   116: iadd
    //   117: istore #4
    //   119: iload #4
    //   121: iload_3
    //   122: if_icmpge -> 155
    //   125: aload_0
    //   126: iload #5
    //   128: iconst_1
    //   129: iadd
    //   130: invokevirtual charAt : (I)C
    //   133: bipush #47
    //   135: if_icmpne -> 155
    //   138: aload_0
    //   139: iload #4
    //   141: invokevirtual charAt : (I)C
    //   144: bipush #47
    //   146: if_icmpne -> 155
    //   149: iconst_1
    //   150: istore #4
    //   152: goto -> 158
    //   155: iconst_0
    //   156: istore #4
    //   158: iload #4
    //   160: ifeq -> 197
    //   163: aload_0
    //   164: bipush #47
    //   166: iload #5
    //   168: iconst_3
    //   169: iadd
    //   170: invokevirtual indexOf : (II)I
    //   173: istore #6
    //   175: iload #6
    //   177: iconst_m1
    //   178: if_icmpeq -> 191
    //   181: iload #6
    //   183: istore #4
    //   185: iload #6
    //   187: iload_3
    //   188: if_icmple -> 203
    //   191: iload_3
    //   192: istore #4
    //   194: goto -> 203
    //   197: iload #5
    //   199: iconst_1
    //   200: iadd
    //   201: istore #4
    //   203: aload_1
    //   204: iconst_0
    //   205: iload #5
    //   207: iastore
    //   208: aload_1
    //   209: iconst_1
    //   210: iload #4
    //   212: iastore
    //   213: aload_1
    //   214: iconst_2
    //   215: iload_3
    //   216: iastore
    //   217: aload_1
    //   218: iconst_3
    //   219: iload_2
    //   220: iastore
    //   221: aload_1
    //   222: areturn
  }
  
  private static String b(StringBuilder paramStringBuilder, int paramInt1, int paramInt2) {
    if (paramInt1 >= paramInt2)
      return paramStringBuilder.toString(); 
    int i = paramInt1;
    if (paramStringBuilder.charAt(paramInt1) == '/')
      i = paramInt1 + 1; 
    paramInt1 = i;
    int j = paramInt1;
    while (paramInt1 <= paramInt2) {
      int k;
      if (paramInt1 == paramInt2) {
        k = paramInt1;
      } else if (paramStringBuilder.charAt(paramInt1) == '/') {
        k = paramInt1 + 1;
      } else {
        paramInt1++;
        continue;
      } 
      int m = j + 1;
      if (paramInt1 == m && paramStringBuilder.charAt(j) == '.') {
        paramStringBuilder.delete(j, k);
        paramInt2 -= k - j;
      } else {
        if (paramInt1 == j + 2 && paramStringBuilder.charAt(j) == '.' && paramStringBuilder.charAt(m) == '.') {
          paramInt1 = paramStringBuilder.lastIndexOf("/", j - 2) + 1;
          if (paramInt1 > i) {
            j = paramInt1;
          } else {
            j = i;
          } 
          paramStringBuilder.delete(j, k);
          paramInt2 -= k - j;
        } else {
          paramInt1++;
        } 
        j = paramInt1;
      } 
      paramInt1 = j;
    } 
    return paramStringBuilder.toString();
  }
  
  public static String c(String paramString1, String paramString2) {
    StringBuilder stringBuilder = new StringBuilder();
    String str = paramString1;
    if (paramString1 == null)
      str = ""; 
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = ""; 
    int[] arrayOfInt1 = a(paramString1);
    if (arrayOfInt1[0] != -1) {
      stringBuilder.append(paramString1);
      b(stringBuilder, arrayOfInt1[1], arrayOfInt1[2]);
      return stringBuilder.toString();
    } 
    int[] arrayOfInt2 = a(str);
    if (arrayOfInt1[3] == 0) {
      stringBuilder.append(str, 0, arrayOfInt2[3]);
      stringBuilder.append(paramString1);
      return stringBuilder.toString();
    } 
    if (arrayOfInt1[2] == 0) {
      stringBuilder.append(str, 0, arrayOfInt2[2]);
      stringBuilder.append(paramString1);
      return stringBuilder.toString();
    } 
    if (arrayOfInt1[1] != 0) {
      int j = arrayOfInt2[0] + 1;
      stringBuilder.append(str, 0, j);
      stringBuilder.append(paramString1);
      return b(stringBuilder, arrayOfInt1[1] + j, j + arrayOfInt1[2]);
    } 
    if (paramString1.charAt(arrayOfInt1[1]) == '/') {
      stringBuilder.append(str, 0, arrayOfInt2[1]);
      stringBuilder.append(paramString1);
      return b(stringBuilder, arrayOfInt2[1], arrayOfInt2[1] + arrayOfInt1[2]);
    } 
    if (arrayOfInt2[0] + 2 < arrayOfInt2[1] && arrayOfInt2[1] == arrayOfInt2[2]) {
      stringBuilder.append(str, 0, arrayOfInt2[1]);
      stringBuilder.append('/');
      stringBuilder.append(paramString1);
      return b(stringBuilder, arrayOfInt2[1], arrayOfInt2[1] + arrayOfInt1[2] + 1);
    } 
    int i = str.lastIndexOf('/', arrayOfInt2[2] - 1);
    if (i == -1) {
      i = arrayOfInt2[1];
    } else {
      i++;
    } 
    stringBuilder.append(str, 0, i);
    stringBuilder.append(paramString1);
    return b(stringBuilder, arrayOfInt2[1], i + arrayOfInt1[2]);
  }
  
  public static Uri d(String paramString1, String paramString2) {
    return Uri.parse(c(paramString1, paramString2));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */