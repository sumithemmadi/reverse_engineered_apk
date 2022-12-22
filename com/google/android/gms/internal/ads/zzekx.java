package com.google.android.gms.internal.ads;

enum zzekx {
  b, c, d, e;
  
  private final boolean zziqd;
  
  static {
    zzekx zzekx1 = new zzekx("SCALAR", 0, false);
    b = zzekx1;
    zzekx zzekx2 = new zzekx("VECTOR", 1, true);
    c = zzekx2;
    zzekx zzekx3 = new zzekx("PACKED_VECTOR", 2, true);
    d = zzekx3;
    zzekx zzekx4 = new zzekx("MAP", 3, false);
    e = zzekx4;
    f = new zzekx[] { zzekx1, zzekx2, zzekx3, zzekx4 };
  }
  
  zzekx(boolean paramBoolean) {
    this.zziqd = paramBoolean;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzekx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */