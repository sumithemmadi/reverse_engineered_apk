package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.zzn;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n10 implements p {
  private final n50 b;
  
  private AtomicBoolean c = new AtomicBoolean(false);
  
  public n10(n50 paramn50) {
    this.b = paramn50;
  }
  
  public final void M0() {}
  
  public final void R5(zzn paramzzn) {
    this.c.set(true);
    this.b.b1();
  }
  
  public final boolean a() {
    return this.c.get();
  }
  
  public final void onPause() {}
  
  public final void onResume() {}
  
  public final void u9() {
    this.b.d1();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */