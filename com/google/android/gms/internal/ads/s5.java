package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.f;

public final class s5 {
  private final f.b a;
  
  private final f.a b;
  
  private f c;
  
  public s5(f.b paramb, f.a parama) {
    this.a = paramb;
    this.b = parama;
  }
  
  private final f d(i4 parami4) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/google/android/gms/ads/formats/f;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_2
    //   14: areturn
    //   15: new com/google/android/gms/internal/ads/j4
    //   18: astore_2
    //   19: aload_2
    //   20: aload_1
    //   21: invokespecial <init> : (Lcom/google/android/gms/internal/ads/i4;)V
    //   24: aload_0
    //   25: aload_2
    //   26: putfield c : Lcom/google/android/gms/ads/formats/f;
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_2
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	33	finally
    //   15	29	33	finally
  }
  
  public final t4 e() {
    return new t5(this, null);
  }
  
  public final s4 f() {
    return (this.b == null) ? null : new u5(this, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */