package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

public final class s21 implements v60 {
  private final AtomicReference<gt2> b = new AtomicReference<gt2>();
  
  public final void a(gt2 paramgt2) {
    this.b.set(paramgt2);
  }
  
  public final void t(zzvu paramzzvu) {
    se1.a(this.b, new r21(paramzzvu));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */