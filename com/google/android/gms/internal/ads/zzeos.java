package com.google.android.gms.internal.ads;

public enum zzeos {
  b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s;
  
  private final zzeov zziwu;
  
  private final int zziwv;
  
  static {
    zzeos zzeos1 = new zzeos("DOUBLE", 0, zzeov.e, 1);
    b = zzeos1;
    zzeos zzeos2 = new zzeos("FLOAT", 1, zzeov.d, 5);
    c = zzeos2;
    zzeov zzeov1 = zzeov.c;
    zzeos zzeos4 = new zzeos("INT64", 2, zzeov1, 0);
    d = zzeos4;
    zzeos zzeos5 = new zzeos("UINT64", 3, zzeov1, 0);
    e = zzeos5;
    zzeov zzeov2 = zzeov.b;
    zzeos zzeos7 = new zzeos("INT32", 4, zzeov2, 0);
    f = zzeos7;
    zzeos zzeos8 = new zzeos("FIXED64", 5, zzeov1, 1);
    g = zzeos8;
    zzeos zzeos9 = new zzeos("FIXED32", 6, zzeov2, 5);
    h = zzeos9;
    zzeos zzeos10 = new zzeos("BOOL", 7, zzeov.f, 0);
    i = zzeos10;
    zzeor zzeor = new zzeor("STRING", 8, zzeov.g, 2);
    j = zzeor;
    zzeov zzeov3 = zzeov.j;
    zzeou zzeou = new zzeou("GROUP", 9, zzeov3, 3);
    k = zzeou;
    zzeot zzeot = new zzeot("MESSAGE", 10, zzeov3, 2);
    l = zzeot;
    zzeow zzeow = new zzeow("BYTES", 11, zzeov.h, 2);
    m = zzeow;
    zzeos zzeos12 = new zzeos("UINT32", 12, zzeov2, 0);
    n = zzeos12;
    zzeos zzeos11 = new zzeos("ENUM", 13, zzeov.i, 0);
    o = zzeos11;
    zzeos zzeos13 = new zzeos("SFIXED32", 14, zzeov2, 5);
    p = zzeos13;
    zzeos zzeos14 = new zzeos("SFIXED64", 15, zzeov1, 1);
    q = zzeos14;
    zzeos zzeos6 = new zzeos("SINT32", 16, zzeov2, 0);
    r = zzeos6;
    zzeos zzeos3 = new zzeos("SINT64", 17, zzeov1, 0);
    s = zzeos3;
    t = new zzeos[] { 
        zzeos1, zzeos2, zzeos4, zzeos5, zzeos7, zzeos8, zzeos9, zzeos10, zzeor, zzeou, 
        zzeot, zzeow, zzeos12, zzeos11, zzeos13, zzeos14, zzeos6, zzeos3 };
  }
  
  zzeos(zzeov paramzzeov, int paramInt1) {
    this.zziwu = paramzzeov;
    this.zziwv = paramInt1;
  }
  
  public final zzeov zzbli() {
    return this.zziwu;
  }
  
  public final int zzblj() {
    return this.zziwv;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzeos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */