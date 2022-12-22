package com.google.android.gms.internal.ads;

public enum zzegx implements p42 {
  b, c, d, e, f, g;
  
  private static final o42<zzegx> h;
  
  private final int value;
  
  static {
    zzegx zzegx1 = new zzegx("UNKNOWN_PREFIX", 0, 0);
    b = zzegx1;
    zzegx zzegx2 = new zzegx("TINK", 1, 1);
    c = zzegx2;
    zzegx zzegx3 = new zzegx("LEGACY", 2, 2);
    d = zzegx3;
    zzegx zzegx4 = new zzegx("RAW", 3, 3);
    e = zzegx4;
    zzegx zzegx5 = new zzegx("CRUNCHY", 4, 4);
    f = zzegx5;
    zzegx zzegx6 = new zzegx("UNRECOGNIZED", 5, -1);
    g = zzegx6;
    i = new zzegx[] { zzegx1, zzegx2, zzegx3, zzegx4, zzegx5, zzegx6 };
    h = new p02();
  }
  
  zzegx(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzegx zzfr(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? null : f) : e) : d) : c) : b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzegx.class.getName());
    stringBuilder.append('@');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this != g) {
      stringBuilder.append(" number=");
      stringBuilder.append(zzv());
    } 
    stringBuilder.append(" name=");
    stringBuilder.append(name());
    stringBuilder.append('>');
    return stringBuilder.toString();
  }
  
  public final int zzv() {
    if (this != g)
      return this.value; 
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzegx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */