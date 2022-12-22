package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

final class s22 extends o22 {
  private final r22 b = new r22();
  
  public final void a(Throwable paramThrowable, PrintWriter paramPrintWriter) {
    // Byte code:
    //   0: aload_1
    //   1: aload_2
    //   2: invokevirtual printStackTrace : (Ljava/io/PrintWriter;)V
    //   5: aload_0
    //   6: getfield b : Lcom/google/android/gms/internal/ads/r22;
    //   9: aload_1
    //   10: iconst_0
    //   11: invokevirtual a : (Ljava/lang/Throwable;Z)Ljava/util/List;
    //   14: astore_1
    //   15: aload_1
    //   16: ifnonnull -> 20
    //   19: return
    //   20: aload_1
    //   21: monitorenter
    //   22: aload_1
    //   23: invokeinterface iterator : ()Ljava/util/Iterator;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface hasNext : ()Z
    //   35: ifeq -> 64
    //   38: aload_3
    //   39: invokeinterface next : ()Ljava/lang/Object;
    //   44: checkcast java/lang/Throwable
    //   47: astore #4
    //   49: aload_2
    //   50: ldc 'Suppressed: '
    //   52: invokevirtual print : (Ljava/lang/String;)V
    //   55: aload #4
    //   57: aload_2
    //   58: invokevirtual printStackTrace : (Ljava/io/PrintWriter;)V
    //   61: goto -> 29
    //   64: aload_1
    //   65: monitorexit
    //   66: return
    //   67: astore_2
    //   68: aload_1
    //   69: monitorexit
    //   70: goto -> 75
    //   73: aload_2
    //   74: athrow
    //   75: goto -> 73
    // Exception table:
    //   from	to	target	type
    //   22	29	67	finally
    //   29	61	67	finally
    //   64	66	67	finally
    //   68	70	67	finally
  }
  
  public final void b(Throwable paramThrowable1, Throwable paramThrowable2) {
    if (paramThrowable2 != paramThrowable1) {
      if (paramThrowable2 != null) {
        this.b.a(paramThrowable1, true).add(paramThrowable2);
        return;
      } 
      throw new NullPointerException("The suppressed exception cannot be null.");
    } 
    throw new IllegalArgumentException("Self suppression is not allowed.", paramThrowable2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */