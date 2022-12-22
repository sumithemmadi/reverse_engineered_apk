package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.h1;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
public final class vn {
  private final long a;
  
  private long b;
  
  private boolean c;
  
  vn() {
    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
    x<Long> x = m0.x;
    this.a = timeUnit.toNanos(((Long)er2.e().<Long>c(x)).longValue());
    this.c = true;
  }
  
  public final void a(SurfaceTexture paramSurfaceTexture, mn parammn) {
    if (parammn == null)
      return; 
    long l = paramSurfaceTexture.getTimestamp();
    if (this.c || Math.abs(l - this.b) >= this.a) {
      this.c = false;
      this.b = l;
      h1.a.post(new yn(this, parammn));
    } 
  }
  
  public final void b() {
    this.c = true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */