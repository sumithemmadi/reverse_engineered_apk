package com.google.android.gms.ads.internal.overlay;

public enum zzn {
  b, c, d, e;
  
  private final int zzdss;
  
  static {
    zzn zzn1 = new zzn("BACK_BUTTON", 0, 0);
    b = zzn1;
    zzn zzn2 = new zzn("CLOSE_BUTTON", 1, 1);
    c = zzn2;
    zzn zzn3 = new zzn("CUSTOM_CLOSE", 2, 2);
    d = zzn3;
    zzn zzn4 = new zzn("OTHER", 3, 3);
    e = zzn4;
    f = new zzn[] { zzn1, zzn2, zzn3, zzn4 };
  }
  
  zzn(int paramInt1) {
    this.zzdss = paramInt1;
  }
  
  public final int zzwf() {
    return this.zzdss;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */