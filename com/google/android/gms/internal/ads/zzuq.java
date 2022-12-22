package com.google.android.gms.internal.ads;

public enum zzuq implements p42 {
  b, c, d;
  
  private static final o42<zzuq> e;
  
  private final int value;
  
  static {
    zzuq zzuq1 = new zzuq("ENUM_FALSE", 0, 0);
    b = zzuq1;
    zzuq zzuq2 = new zzuq("ENUM_TRUE", 1, 1);
    c = zzuq2;
    zzuq zzuq3 = new zzuq("ENUM_UNKNOWN", 2, 1000);
    d = zzuq3;
    f = new zzuq[] { zzuq1, zzuq2, zzuq3 };
    e = new op2();
  }
  
  zzuq(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzuq zzcd(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 1000) ? null : d) : c) : b;
  }
  
  public static r42 zzw() {
    return pp2.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzuq.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzuq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */