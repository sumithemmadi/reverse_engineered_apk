package com.google.android.gms.internal.ads;

public enum zzcm implements p42 {
  b, c, d, e, f, g;
  
  private static final o42<zzcm> h;
  
  private final int value;
  
  static {
    zzcm zzcm1 = new zzcm("UNKNOWN_ENCRYPTION_METHOD", 0, 0);
    b = zzcm1;
    zzcm zzcm2 = new zzcm("BITSLICER", 1, 1);
    c = zzcm2;
    zzcm zzcm3 = new zzcm("TINK_HYBRID", 2, 2);
    d = zzcm3;
    zzcm zzcm4 = new zzcm("UNENCRYPTED", 3, 3);
    e = zzcm4;
    zzcm zzcm5 = new zzcm("DG", 4, 4);
    f = zzcm5;
    zzcm zzcm6 = new zzcm("DG_XTEA", 5, 5);
    g = zzcm6;
    i = new zzcm[] { zzcm1, zzcm2, zzcm3, zzcm4, zzcm5, zzcm6 };
    h = new xr0();
  }
  
  zzcm(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzcm zzm(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? ((paramInt != 5) ? null : g) : f) : e) : d) : c) : b;
  }
  
  public static r42 zzw() {
    return wq0.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzcm.class.getName());
    stringBuilder.append('@');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" number=");
    stringBuilder.append(this.value);
    stringBuilder.append(" name=");
    stringBuilder.append(name());
    stringBuilder.append('>');
    return stringBuilder.toString();
  }
  
  public final int zzv() {
    return this.value;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */