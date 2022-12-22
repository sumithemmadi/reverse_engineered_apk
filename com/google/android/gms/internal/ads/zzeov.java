package com.google.android.gms.internal.ads;

public enum zzeov {
  b, c, d, e, f, g, h, i, j;
  
  private final Object zzirs;
  
  static {
    zzeov zzeov1 = new zzeov("INT", 0, Integer.valueOf(0));
    b = zzeov1;
    zzeov zzeov2 = new zzeov("LONG", 1, Long.valueOf(0L));
    c = zzeov2;
    zzeov zzeov3 = new zzeov("FLOAT", 2, Float.valueOf(0.0F));
    d = zzeov3;
    zzeov zzeov4 = new zzeov("DOUBLE", 3, Double.valueOf(0.0D));
    e = zzeov4;
    zzeov zzeov5 = new zzeov("BOOLEAN", 4, Boolean.FALSE);
    f = zzeov5;
    zzeov zzeov6 = new zzeov("STRING", 5, "");
    g = zzeov6;
    zzeov zzeov7 = new zzeov("BYTE_STRING", 6, zzejr.b);
    h = zzeov7;
    zzeov zzeov8 = new zzeov("ENUM", 7, null);
    i = zzeov8;
    zzeov zzeov9 = new zzeov("MESSAGE", 8, null);
    j = zzeov9;
    k = new zzeov[] { zzeov1, zzeov2, zzeov3, zzeov4, zzeov5, zzeov6, zzeov7, zzeov8, zzeov9 };
  }
  
  zzeov(Object paramObject) {
    this.zzirs = paramObject;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzeov.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */