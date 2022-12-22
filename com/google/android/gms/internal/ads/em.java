package com.google.android.gms.internal.ads;

public final class em implements tl {
  private final String a;
  
  public em() {
    this(null);
  }
  
  public em(String paramString) {
    this.a = paramString;
  }
  
  public final void a(String paramString) {
    // Byte code:
    //   0: invokestatic a : ()Z
    //   3: ifeq -> 12
    //   6: sipush #263
    //   9: invokestatic setThreadStatsTag : (I)V
    //   12: aload_1
    //   13: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   16: astore_2
    //   17: aload_2
    //   18: invokevirtual length : ()I
    //   21: ifeq -> 34
    //   24: ldc 'Pinging URL: '
    //   26: aload_2
    //   27: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   30: astore_2
    //   31: goto -> 44
    //   34: new java/lang/String
    //   37: dup
    //   38: ldc 'Pinging URL: '
    //   40: invokespecial <init> : (Ljava/lang/String;)V
    //   43: astore_2
    //   44: aload_2
    //   45: invokestatic e : (Ljava/lang/String;)V
    //   48: new java/net/URL
    //   51: astore_2
    //   52: aload_2
    //   53: aload_1
    //   54: invokespecial <init> : (Ljava/lang/String;)V
    //   57: aload_2
    //   58: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   61: checkcast java/net/HttpURLConnection
    //   64: astore_2
    //   65: invokestatic a : ()Lcom/google/android/gms/internal/ads/sl;
    //   68: pop
    //   69: iconst_1
    //   70: aload_2
    //   71: aload_0
    //   72: getfield a : Ljava/lang/String;
    //   75: invokestatic h : (ZLjava/net/HttpURLConnection;Ljava/lang/String;)V
    //   78: new com/google/android/gms/internal/ads/wl
    //   81: astore_3
    //   82: aload_3
    //   83: invokespecial <init> : ()V
    //   86: aload_3
    //   87: aload_2
    //   88: aconst_null
    //   89: invokevirtual i : (Ljava/net/HttpURLConnection;[B)V
    //   92: aload_2
    //   93: invokevirtual getResponseCode : ()I
    //   96: istore #4
    //   98: aload_3
    //   99: aload_2
    //   100: iload #4
    //   102: invokevirtual h : (Ljava/net/HttpURLConnection;I)V
    //   105: iload #4
    //   107: sipush #200
    //   110: if_icmplt -> 121
    //   113: iload #4
    //   115: sipush #300
    //   118: if_icmplt -> 177
    //   121: aload_1
    //   122: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   125: invokevirtual length : ()I
    //   128: istore #5
    //   130: new java/lang/StringBuilder
    //   133: astore_3
    //   134: aload_3
    //   135: iload #5
    //   137: bipush #65
    //   139: iadd
    //   140: invokespecial <init> : (I)V
    //   143: aload_3
    //   144: ldc 'Received non-success response code '
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: aload_3
    //   151: iload #4
    //   153: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   156: pop
    //   157: aload_3
    //   158: ldc ' from pinging URL: '
    //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: pop
    //   164: aload_3
    //   165: aload_1
    //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload_3
    //   171: invokevirtual toString : ()Ljava/lang/String;
    //   174: invokestatic i : (Ljava/lang/String;)V
    //   177: aload_2
    //   178: invokevirtual disconnect : ()V
    //   181: invokestatic a : ()Z
    //   184: ifeq -> 371
    //   187: invokestatic clearThreadStatsTag : ()V
    //   190: return
    //   191: astore_3
    //   192: aload_2
    //   193: invokevirtual disconnect : ()V
    //   196: aload_3
    //   197: athrow
    //   198: astore_1
    //   199: goto -> 372
    //   202: astore_2
    //   203: goto -> 207
    //   206: astore_2
    //   207: aload_2
    //   208: invokevirtual getMessage : ()Ljava/lang/String;
    //   211: astore_3
    //   212: aload_1
    //   213: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   216: invokevirtual length : ()I
    //   219: istore #5
    //   221: aload_3
    //   222: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   225: invokevirtual length : ()I
    //   228: istore #4
    //   230: new java/lang/StringBuilder
    //   233: astore_2
    //   234: aload_2
    //   235: iload #5
    //   237: bipush #27
    //   239: iadd
    //   240: iload #4
    //   242: iadd
    //   243: invokespecial <init> : (I)V
    //   246: aload_2
    //   247: ldc 'Error while pinging URL: '
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload_2
    //   254: aload_1
    //   255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: pop
    //   259: aload_2
    //   260: ldc '. '
    //   262: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   265: pop
    //   266: aload_2
    //   267: aload_3
    //   268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   271: pop
    //   272: aload_2
    //   273: invokevirtual toString : ()Ljava/lang/String;
    //   276: invokestatic i : (Ljava/lang/String;)V
    //   279: invokestatic a : ()Z
    //   282: ifeq -> 371
    //   285: invokestatic clearThreadStatsTag : ()V
    //   288: return
    //   289: astore_2
    //   290: aload_2
    //   291: invokevirtual getMessage : ()Ljava/lang/String;
    //   294: astore_2
    //   295: aload_1
    //   296: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   299: invokevirtual length : ()I
    //   302: istore #4
    //   304: aload_2
    //   305: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   308: invokevirtual length : ()I
    //   311: istore #5
    //   313: new java/lang/StringBuilder
    //   316: astore_3
    //   317: aload_3
    //   318: iload #4
    //   320: bipush #32
    //   322: iadd
    //   323: iload #5
    //   325: iadd
    //   326: invokespecial <init> : (I)V
    //   329: aload_3
    //   330: ldc 'Error while parsing ping URL: '
    //   332: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   335: pop
    //   336: aload_3
    //   337: aload_1
    //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   341: pop
    //   342: aload_3
    //   343: ldc '. '
    //   345: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: pop
    //   349: aload_3
    //   350: aload_2
    //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: pop
    //   355: aload_3
    //   356: invokevirtual toString : ()Ljava/lang/String;
    //   359: invokestatic i : (Ljava/lang/String;)V
    //   362: invokestatic a : ()Z
    //   365: ifeq -> 371
    //   368: invokestatic clearThreadStatsTag : ()V
    //   371: return
    //   372: invokestatic a : ()Z
    //   375: ifeq -> 381
    //   378: invokestatic clearThreadStatsTag : ()V
    //   381: aload_1
    //   382: athrow
    // Exception table:
    //   from	to	target	type
    //   0	12	289	java/lang/IndexOutOfBoundsException
    //   0	12	206	java/io/IOException
    //   0	12	202	java/lang/RuntimeException
    //   0	12	198	finally
    //   12	31	289	java/lang/IndexOutOfBoundsException
    //   12	31	206	java/io/IOException
    //   12	31	202	java/lang/RuntimeException
    //   12	31	198	finally
    //   34	44	289	java/lang/IndexOutOfBoundsException
    //   34	44	206	java/io/IOException
    //   34	44	202	java/lang/RuntimeException
    //   34	44	198	finally
    //   44	65	289	java/lang/IndexOutOfBoundsException
    //   44	65	206	java/io/IOException
    //   44	65	202	java/lang/RuntimeException
    //   44	65	198	finally
    //   65	105	191	finally
    //   121	177	191	finally
    //   177	181	289	java/lang/IndexOutOfBoundsException
    //   177	181	206	java/io/IOException
    //   177	181	202	java/lang/RuntimeException
    //   177	181	198	finally
    //   192	198	289	java/lang/IndexOutOfBoundsException
    //   192	198	206	java/io/IOException
    //   192	198	202	java/lang/RuntimeException
    //   192	198	198	finally
    //   207	279	198	finally
    //   290	362	198	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */