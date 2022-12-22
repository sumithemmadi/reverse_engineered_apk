package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

public final class p22 {
  private static final o22 a;
  
  private static final int b;
  
  static {
    // Byte code:
    //   0: iconst_1
    //   1: istore_0
    //   2: invokestatic c : ()Ljava/lang/Integer;
    //   5: astore_1
    //   6: aload_1
    //   7: ifnull -> 30
    //   10: aload_1
    //   11: invokevirtual intValue : ()I
    //   14: bipush #19
    //   16: if_icmplt -> 30
    //   19: new com/google/android/gms/internal/ads/u22
    //   22: astore_2
    //   23: aload_2
    //   24: invokespecial <init> : ()V
    //   27: goto -> 146
    //   30: ldc 'com.google.devtools.build.android.desugar.runtime.twr_disable_mimic'
    //   32: invokestatic getBoolean : (Ljava/lang/String;)Z
    //   35: iconst_1
    //   36: ixor
    //   37: ifeq -> 51
    //   40: new com/google/android/gms/internal/ads/s22
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore_2
    //   48: goto -> 146
    //   51: new com/google/android/gms/internal/ads/p22$a
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: astore_2
    //   59: goto -> 146
    //   62: astore_2
    //   63: goto -> 69
    //   66: astore_2
    //   67: aconst_null
    //   68: astore_1
    //   69: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   72: astore_3
    //   73: ldc com/google/android/gms/internal/ads/p22$a
    //   75: invokevirtual getName : ()Ljava/lang/String;
    //   78: astore #4
    //   80: new java/lang/StringBuilder
    //   83: dup
    //   84: aload #4
    //   86: invokevirtual length : ()I
    //   89: sipush #133
    //   92: iadd
    //   93: invokespecial <init> : (I)V
    //   96: astore #5
    //   98: aload #5
    //   100: ldc 'An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy '
    //   102: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: aload #5
    //   108: aload #4
    //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: pop
    //   114: aload #5
    //   116: ldc 'will be used. The error is: '
    //   118: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload_3
    //   123: aload #5
    //   125: invokevirtual toString : ()Ljava/lang/String;
    //   128: invokevirtual println : (Ljava/lang/String;)V
    //   131: aload_2
    //   132: getstatic java/lang/System.err : Ljava/io/PrintStream;
    //   135: invokevirtual printStackTrace : (Ljava/io/PrintStream;)V
    //   138: new com/google/android/gms/internal/ads/p22$a
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: astore_2
    //   146: aload_2
    //   147: putstatic com/google/android/gms/internal/ads/p22.a : Lcom/google/android/gms/internal/ads/o22;
    //   150: aload_1
    //   151: ifnonnull -> 157
    //   154: goto -> 162
    //   157: aload_1
    //   158: invokevirtual intValue : ()I
    //   161: istore_0
    //   162: iload_0
    //   163: putstatic com/google/android/gms/internal/ads/p22.b : I
    //   166: return
    // Exception table:
    //   from	to	target	type
    //   2	6	66	finally
    //   10	27	62	finally
    //   30	48	62	finally
    //   51	59	62	finally
  }
  
  public static void a(Throwable paramThrowable, PrintWriter paramPrintWriter) {
    a.a(paramThrowable, paramPrintWriter);
  }
  
  public static void b(Throwable paramThrowable1, Throwable paramThrowable2) {
    a.b(paramThrowable1, paramThrowable2);
  }
  
  private static Integer c() {
    try {
      return (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
    } catch (Exception exception) {
      System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
      exception.printStackTrace(System.err);
      return null;
    } 
  }
  
  static final class a extends o22 {
    public final void a(Throwable param1Throwable, PrintWriter param1PrintWriter) {
      param1Throwable.printStackTrace(param1PrintWriter);
    }
    
    public final void b(Throwable param1Throwable1, Throwable param1Throwable2) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */