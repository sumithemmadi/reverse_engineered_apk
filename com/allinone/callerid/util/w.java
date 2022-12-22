package com.allinone.callerid.util;

public class w {
  public static String a(String paramString) {
    String str = null;
    try {
      StringBuffer stringBuffer = new StringBuffer();
      this();
      try {
        String[] arrayOfString = paramString.split(",");
        byte b = 0;
        while (true) {
          StringBuffer stringBuffer1 = stringBuffer;
          if (b < arrayOfString.length) {
            stringBuffer.append((char)Integer.parseInt(arrayOfString[b]));
            b++;
            continue;
          } 
          break;
        } 
      } catch (Exception null) {
        StringBuffer stringBuffer1 = stringBuffer;
      } 
    } catch (Exception exception) {
      paramString = str;
    } 
    exception.printStackTrace();
  }
  
  public static String b(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual toCharArray : ()[C
    //   4: astore_1
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore_2
    //   13: iconst_0
    //   14: istore_3
    //   15: iload_3
    //   16: aload_1
    //   17: arraylength
    //   18: if_icmpge -> 195
    //   21: aload_0
    //   22: iload_3
    //   23: invokevirtual charAt : (I)C
    //   26: istore #4
    //   28: iload #4
    //   30: bipush #48
    //   32: if_icmplt -> 42
    //   35: iload #4
    //   37: bipush #57
    //   39: if_icmple -> 78
    //   42: iload #4
    //   44: bipush #65
    //   46: if_icmplt -> 56
    //   49: iload #4
    //   51: bipush #90
    //   53: if_icmple -> 78
    //   56: iload #4
    //   58: istore #5
    //   60: iload #4
    //   62: bipush #97
    //   64: if_icmplt -> 166
    //   67: iload #4
    //   69: istore #5
    //   71: iload #4
    //   73: bipush #122
    //   75: if_icmpgt -> 166
    //   78: iload #4
    //   80: iload_3
    //   81: iconst_5
    //   82: irem
    //   83: isub
    //   84: istore #5
    //   86: iload #5
    //   88: bipush #48
    //   90: if_icmpge -> 108
    //   93: bipush #122
    //   95: bipush #48
    //   97: iload #5
    //   99: isub
    //   100: isub
    //   101: iconst_1
    //   102: iadd
    //   103: istore #5
    //   105: goto -> 166
    //   108: iload #4
    //   110: bipush #65
    //   112: if_icmplt -> 137
    //   115: iload #5
    //   117: bipush #65
    //   119: if_icmpge -> 137
    //   122: bipush #57
    //   124: bipush #65
    //   126: iload #5
    //   128: isub
    //   129: isub
    //   130: iconst_1
    //   131: iadd
    //   132: istore #5
    //   134: goto -> 166
    //   137: iload #4
    //   139: bipush #97
    //   141: if_icmplt -> 166
    //   144: iload #5
    //   146: bipush #97
    //   148: if_icmpge -> 166
    //   151: bipush #90
    //   153: bipush #97
    //   155: iload #5
    //   157: isub
    //   158: isub
    //   159: iconst_1
    //   160: iadd
    //   161: istore #5
    //   163: goto -> 166
    //   166: aload_2
    //   167: iload #5
    //   169: invokestatic valueOf : (I)Ljava/lang/String;
    //   172: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   175: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: goto -> 189
    //   182: astore #6
    //   184: aload #6
    //   186: invokevirtual printStackTrace : ()V
    //   189: iinc #3, 1
    //   192: goto -> 15
    //   195: new java/lang/String
    //   198: astore_0
    //   199: aload_0
    //   200: aload_2
    //   201: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   204: invokestatic d : (Ljava/lang/String;)[B
    //   207: invokespecial <init> : ([B)V
    //   210: goto -> 221
    //   213: astore_0
    //   214: aload_0
    //   215: invokevirtual printStackTrace : ()V
    //   218: ldc ''
    //   220: astore_0
    //   221: aload_0
    //   222: areturn
    // Exception table:
    //   from	to	target	type
    //   166	179	182	java/lang/Exception
    //   195	210	213	java/lang/Exception
  }
  
  public static String c(String paramString) {
    // Byte code:
    //   0: new java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual getBytes : ()[B
    //   12: invokestatic j : ([B)Ljava/lang/String;
    //   15: invokevirtual toCharArray : ()[C
    //   18: astore_0
    //   19: iconst_0
    //   20: istore_2
    //   21: iload_2
    //   22: aload_0
    //   23: arraylength
    //   24: if_icmpge -> 174
    //   27: aload_0
    //   28: iload_2
    //   29: caload
    //   30: istore_3
    //   31: iload_3
    //   32: bipush #48
    //   34: if_icmplt -> 43
    //   37: iload_3
    //   38: bipush #57
    //   40: if_icmple -> 73
    //   43: iload_3
    //   44: bipush #65
    //   46: if_icmplt -> 55
    //   49: iload_3
    //   50: bipush #90
    //   52: if_icmple -> 73
    //   55: iload_3
    //   56: istore #4
    //   58: iload_3
    //   59: bipush #97
    //   61: if_icmplt -> 155
    //   64: iload_3
    //   65: istore #4
    //   67: iload_3
    //   68: bipush #122
    //   70: if_icmpgt -> 155
    //   73: iload_2
    //   74: iconst_5
    //   75: irem
    //   76: iload_3
    //   77: iadd
    //   78: istore #4
    //   80: iload #4
    //   82: bipush #122
    //   84: if_icmple -> 103
    //   87: iload #4
    //   89: bipush #122
    //   91: isub
    //   92: bipush #48
    //   94: iadd
    //   95: istore #4
    //   97: iinc #4, -1
    //   100: goto -> 155
    //   103: iload_3
    //   104: bipush #90
    //   106: if_icmpgt -> 129
    //   109: iload #4
    //   111: bipush #90
    //   113: if_icmple -> 129
    //   116: iload #4
    //   118: bipush #90
    //   120: isub
    //   121: bipush #97
    //   123: iadd
    //   124: istore #4
    //   126: goto -> 97
    //   129: iload_3
    //   130: bipush #57
    //   132: if_icmpgt -> 155
    //   135: iload #4
    //   137: bipush #57
    //   139: if_icmple -> 155
    //   142: iload #4
    //   144: bipush #57
    //   146: isub
    //   147: bipush #65
    //   149: iadd
    //   150: istore #4
    //   152: goto -> 97
    //   155: aload_1
    //   156: iload #4
    //   158: invokestatic valueOf : (I)Ljava/lang/String;
    //   161: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: iinc #2, 1
    //   171: goto -> 21
    //   174: aload_1
    //   175: invokevirtual toString : ()Ljava/lang/String;
    //   178: areturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */