package com.google.android.gms.internal.ads;

import android.os.Bundle;

final class dl {
  private long a = -1L;
  
  private long b = -1L;
  
  public dl(el paramel) {}
  
  public final Bundle a() {
    Bundle bundle = new Bundle();
    bundle.putLong("topen", this.a);
    bundle.putLong("tclose", this.b);
    return bundle;
  }
  
  public final long b() {
    return this.b;
  }
  
  public final void c() {
    this.b = el.b(this.c).b();
  }
  
  public final void d() {
    this.a = el.b(this.c).b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */