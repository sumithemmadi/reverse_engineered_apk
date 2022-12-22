package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.a;
import com.google.android.gms.ads.internal.util.h1;

public final class tp extends a {
  final eo d;
  
  final up e;
  
  private final String f;
  
  private final String[] g;
  
  tp(eo parameo, up paramup, String paramString, String[] paramArrayOfString) {
    this.d = parameo;
    this.e = paramup;
    this.f = paramString;
    this.g = paramArrayOfString;
    q.y().a(this);
  }
  
  public final void b() {
    try {
      this.e.u(this.f, this.g);
      return;
    } finally {
      h1.a.post(new sp(this));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */