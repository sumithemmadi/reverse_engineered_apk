package com.google.android.gms.internal.ads;

public class z42 {
  private static final y32 a = y32.b();
  
  private zzejr b;
  
  private volatile u52 c;
  
  private volatile zzejr d;
  
  private final u52 c(u52 paramu52) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Lcom/google/android/gms/internal/ads/u52;
    //   4: ifnonnull -> 59
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield c : Lcom/google/android/gms/internal/ads/u52;
    //   13: ifnull -> 21
    //   16: aload_0
    //   17: monitorexit
    //   18: goto -> 59
    //   21: aload_0
    //   22: aload_1
    //   23: putfield c : Lcom/google/android/gms/internal/ads/u52;
    //   26: aload_0
    //   27: getstatic com/google/android/gms/internal/ads/zzejr.b : Lcom/google/android/gms/internal/ads/zzejr;
    //   30: putfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   33: goto -> 49
    //   36: astore_2
    //   37: aload_0
    //   38: aload_1
    //   39: putfield c : Lcom/google/android/gms/internal/ads/u52;
    //   42: aload_0
    //   43: getstatic com/google/android/gms/internal/ads/zzejr.b : Lcom/google/android/gms/internal/ads/zzejr;
    //   46: putfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   49: aload_0
    //   50: monitorexit
    //   51: goto -> 59
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    //   59: aload_0
    //   60: getfield c : Lcom/google/android/gms/internal/ads/u52;
    //   63: areturn
    // Exception table:
    //   from	to	target	type
    //   9	18	54	finally
    //   21	33	36	com/google/android/gms/internal/ads/zzelo
    //   21	33	54	finally
    //   37	49	54	finally
    //   49	51	54	finally
    //   55	57	54	finally
  }
  
  public final zzejr a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   4: ifnull -> 12
    //   7: aload_0
    //   8: getfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   11: areturn
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   18: ifnull -> 30
    //   21: aload_0
    //   22: getfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: areturn
    //   30: aload_0
    //   31: getfield c : Lcom/google/android/gms/internal/ads/u52;
    //   34: ifnonnull -> 47
    //   37: aload_0
    //   38: getstatic com/google/android/gms/internal/ads/zzejr.b : Lcom/google/android/gms/internal/ads/zzejr;
    //   41: putfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   44: goto -> 60
    //   47: aload_0
    //   48: aload_0
    //   49: getfield c : Lcom/google/android/gms/internal/ads/u52;
    //   52: invokeinterface a : ()Lcom/google/android/gms/internal/ads/zzejr;
    //   57: putfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   60: aload_0
    //   61: getfield d : Lcom/google/android/gms/internal/ads/zzejr;
    //   64: astore_1
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_1
    //   68: areturn
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Exception table:
    //   from	to	target	type
    //   14	28	69	finally
    //   30	44	69	finally
    //   47	60	69	finally
    //   60	67	69	finally
    //   70	72	69	finally
  }
  
  public final int b() {
    return (this.d != null) ? this.d.size() : ((this.c != null) ? this.c.b() : 0);
  }
  
  public final u52 d(u52 paramu52) {
    u52 u521 = this.c;
    this.b = null;
    this.d = null;
    this.c = paramu52;
    return u521;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof z42))
      return false; 
    z42 z421 = (z42)paramObject;
    paramObject = this.c;
    u52 u521 = z421.c;
    return (paramObject == null && u521 == null) ? a().equals(z421.a()) : ((paramObject != null && u521 != null) ? paramObject.equals(u521) : ((paramObject != null) ? paramObject.equals(z421.c(paramObject.l())) : c(u521.l()).equals(u521)));
  }
  
  public int hashCode() {
    return 1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */