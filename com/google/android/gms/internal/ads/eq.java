package com.google.android.gms.internal.ads;

public final class eq extends up {
  public eq(eo parameo) {
    super(parameo);
  }
  
  public final void g() {}
  
  public final boolean w(String paramString) {
    eo eo = this.d.get();
    if (eo != null)
      eo.j(x(paramString), this); 
    cm.i("VideoStreamNoopCache is doing nothing.");
    n(paramString, x(paramString), "noop", "Noop cache is a noop.");
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */