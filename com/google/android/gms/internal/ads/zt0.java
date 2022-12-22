package com.google.android.gms.internal.ads;

public final class zt0 {
  private int a = 0;
  
  private long b = 0L;
  
  private long c = 0L;
  
  private long d = 0L;
  
  private final Object e = new Object();
  
  private final Object f = new Object();
  
  private final Object g = new Object();
  
  private final Object h = new Object();
  
  public final int a() {
    synchronized (this.e) {
      return this.a;
    } 
  }
  
  public final long b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_1
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield c : J
    //   13: lstore_2
    //   14: aload_1
    //   15: monitorexit
    //   16: aload_0
    //   17: monitorexit
    //   18: lload_2
    //   19: lreturn
    //   20: astore #4
    //   22: aload_1
    //   23: monitorexit
    //   24: aload #4
    //   26: athrow
    //   27: astore #4
    //   29: aload_0
    //   30: monitorexit
    //   31: aload #4
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	27	finally
    //   9	16	20	finally
    //   22	24	20	finally
    //   24	27	27	finally
  }
  
  public final void c(int paramInt) {
    synchronized (this.e) {
      this.a = paramInt;
      return;
    } 
  }
  
  public final void d(long paramLong) {
    synchronized (this.f) {
      this.b = paramLong;
      return;
    } 
  }
  
  public final void e(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Ljava/lang/Object;
    //   6: astore_3
    //   7: aload_3
    //   8: monitorenter
    //   9: aload_0
    //   10: lload_1
    //   11: putfield d : J
    //   14: aload_3
    //   15: monitorexit
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore #4
    //   21: aload_3
    //   22: monitorexit
    //   23: aload #4
    //   25: athrow
    //   26: astore #4
    //   28: aload_0
    //   29: monitorexit
    //   30: aload #4
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	26	finally
    //   9	16	19	finally
    //   21	23	19	finally
    //   23	26	26	finally
  }
  
  public final void f(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Ljava/lang/Object;
    //   6: astore_3
    //   7: aload_3
    //   8: monitorenter
    //   9: aload_0
    //   10: lload_1
    //   11: putfield c : J
    //   14: aload_3
    //   15: monitorexit
    //   16: aload_0
    //   17: monitorexit
    //   18: return
    //   19: astore #4
    //   21: aload_3
    //   22: monitorexit
    //   23: aload #4
    //   25: athrow
    //   26: astore #4
    //   28: aload_0
    //   29: monitorexit
    //   30: aload #4
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	26	finally
    //   9	16	19	finally
    //   21	23	19	finally
    //   23	26	26	finally
  }
  
  public final long g() {
    synchronized (this.f) {
      return this.b;
    } 
  }
  
  public final long h() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield h : Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_1
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield d : J
    //   13: lstore_2
    //   14: aload_1
    //   15: monitorexit
    //   16: aload_0
    //   17: monitorexit
    //   18: lload_2
    //   19: lreturn
    //   20: astore #4
    //   22: aload_1
    //   23: monitorexit
    //   24: aload #4
    //   26: athrow
    //   27: astore #4
    //   29: aload_0
    //   30: monitorexit
    //   31: aload #4
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	27	finally
    //   9	16	20	finally
    //   22	24	20	finally
    //   24	27	27	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */