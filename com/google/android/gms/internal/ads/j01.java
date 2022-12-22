package com.google.android.gms.internal.ads;

final class j01 implements y50 {
  private boolean a = false;
  
  j01(i01 parami01, jv0 paramjv0, sm paramsm) {}
  
  private final void b(zzvg paramzzvg) {
    zzdom zzdom = zzdom.b;
    x<Boolean> x = m0.a4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      zzdom = zzdom.d; 
    this.c.d(new zzcrn(zzdom, paramzzvg));
  }
  
  public final void E(zzvg paramzzvg) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_1
    //   4: putfield a : Z
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial b : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public final void Z(int paramInt) {
    if (this.a)
      return; 
    b(new zzvg(paramInt, i01.d(this.b.a, paramInt), "undefined", null, null));
  }
  
  public final void a(int paramInt, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield a : Z
    //   19: aload_2
    //   20: astore #4
    //   22: aload_2
    //   23: ifnonnull -> 39
    //   26: aload_0
    //   27: getfield b : Lcom/google/android/gms/internal/ads/jv0;
    //   30: getfield a : Ljava/lang/String;
    //   33: iload_1
    //   34: invokestatic d : (Ljava/lang/String;I)Ljava/lang/String;
    //   37: astore #4
    //   39: new com/google/android/gms/internal/ads/zzvg
    //   42: astore_2
    //   43: aload_2
    //   44: iload_1
    //   45: aload #4
    //   47: ldc 'undefined'
    //   49: aconst_null
    //   50: aconst_null
    //   51: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzvg;Landroid/os/IBinder;)V
    //   54: aload_0
    //   55: aload_2
    //   56: invokespecial b : (Lcom/google/android/gms/internal/ads/zzvg;)V
    //   59: aload_0
    //   60: monitorexit
    //   61: return
    //   62: astore_2
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_2
    //   66: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	62	finally
    //   14	19	62	finally
    //   26	39	62	finally
    //   39	59	62	finally
  }
  
  public final void i() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/google/android/gms/internal/ads/sm;
    //   6: aconst_null
    //   7: invokevirtual c : (Ljava/lang/Object;)Z
    //   10: pop
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	14	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */