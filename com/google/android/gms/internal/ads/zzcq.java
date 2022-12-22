package com.google.android.gms.internal.ads;

public enum zzcq implements p42 {
  b, c, d, e;
  
  private static final o42<zzcq> f;
  
  private final int value;
  
  static {
    zzcq zzcq1 = new zzcq("ENUM_FALSE", 0, 0);
    b = zzcq1;
    zzcq zzcq2 = new zzcq("ENUM_TRUE", 1, 1);
    c = zzcq2;
    zzcq zzcq3 = new zzcq("ENUM_FAILURE", 2, 2);
    d = zzcq3;
    zzcq zzcq4 = new zzcq("ENUM_UNKNOWN", 3, 1000);
    e = zzcq4;
    g = new zzcq[] { zzcq1, zzcq2, zzcq3, zzcq4 };
    f = new xs0();
  }
  
  zzcq(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzcq zzn(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 1000) ? null : e) : d) : c) : b;
  }
  
  public static r42 zzw() {
    return xv0.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzcq.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzcq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */