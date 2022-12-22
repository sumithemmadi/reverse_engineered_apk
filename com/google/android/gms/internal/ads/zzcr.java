package com.google.android.gms.internal.ads;

public enum zzcr implements p42 {
  b, c, d, e;
  
  private static final o42<zzcr> f;
  
  private final int value;
  
  static {
    zzcr zzcr1 = new zzcr("UNKNOWN_PROTO", 0, 0);
    b = zzcr1;
    zzcr zzcr2 = new zzcr("AFMA_SIGNALS", 1, 1);
    c = zzcr2;
    zzcr zzcr3 = new zzcr("UNITY_SIGNALS", 2, 2);
    d = zzcr3;
    zzcr zzcr4 = new zzcr("PARTNER_SIGNALS", 3, 3);
    e = zzcr4;
    g = new zzcr[] { zzcr1, zzcr2, zzcr3, zzcr4 };
    f = new zx0();
  }
  
  zzcr(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzcr zzo(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? null : e) : d) : c) : b;
  }
  
  public static r42 zzw() {
    return yw0.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzcr.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzcr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */