package com.google.android.gms.internal.ads;

public enum zzelq {
  b, c, d, e, f, g, h, i, j, k;
  
  private final Class<?> zzirq;
  
  private final Class<?> zzirr;
  
  private final Object zzirs;
  
  static {
    zzelq zzelq1 = new zzelq("VOID", 0, Void.class, Void.class, null);
    b = zzelq1;
    Class<int> clazz = int.class;
    zzelq zzelq3 = new zzelq("INT", 1, clazz, Integer.class, Integer.valueOf(0));
    c = zzelq3;
    zzelq zzelq4 = new zzelq("LONG", 2, long.class, Long.class, Long.valueOf(0L));
    d = zzelq4;
    zzelq zzelq5 = new zzelq("FLOAT", 3, float.class, Float.class, Float.valueOf(0.0F));
    e = zzelq5;
    zzelq zzelq6 = new zzelq("DOUBLE", 4, double.class, Double.class, Double.valueOf(0.0D));
    f = zzelq6;
    zzelq zzelq7 = new zzelq("BOOLEAN", 5, boolean.class, Boolean.class, Boolean.FALSE);
    g = zzelq7;
    zzelq zzelq8 = new zzelq("STRING", 6, String.class, String.class, "");
    h = zzelq8;
    zzelq zzelq9 = new zzelq("BYTE_STRING", 7, zzejr.class, zzejr.class, zzejr.b);
    i = zzelq9;
    zzelq zzelq10 = new zzelq("ENUM", 8, clazz, Integer.class, null);
    j = zzelq10;
    zzelq zzelq2 = new zzelq("MESSAGE", 9, Object.class, Object.class, null);
    k = zzelq2;
    l = new zzelq[] { zzelq1, zzelq3, zzelq4, zzelq5, zzelq6, zzelq7, zzelq8, zzelq9, zzelq10, zzelq2 };
  }
  
  zzelq(Class<?> paramClass1, Class<?> paramClass2, Object paramObject) {
    this.zzirq = paramClass1;
    this.zzirr = paramClass2;
    this.zzirs = paramObject;
  }
  
  public final Class<?> zzbjk() {
    return this.zzirr;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzelq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */