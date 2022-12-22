package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

final class vy implements rl {
  private File a = null;
  
  vy(Context paramContext) {}
  
  public final File g() {
    if (this.a == null)
      this.a = new File(this.b.getCacheDir(), "volley"); 
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */