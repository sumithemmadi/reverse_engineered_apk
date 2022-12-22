package com.google.android.gms.internal.ads;

final class a01 implements tb0 {
  a01(xz0 paramxz0, ci1 paramci1, nh1 paramnh1, jv0 paramjv0) {}
  
  public final void W0() {
    xz0.c(this.d).execute(new yz0(this, this.a, this.b, this.c));
  }
  
  public final void a(int paramInt) {
    String str = String.valueOf(this.c.a);
    if (str.length() != 0) {
      str = "Fail to initialize adapter ".concat(str);
    } else {
      str = new String("Fail to initialize adapter ");
    } 
    cm.i(str);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/a01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */