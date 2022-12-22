package com.google.android.gms.internal.ads;

public enum zzcd implements p42 {
  b, c, d, e, f;
  
  private static final o42<zzcd> g;
  
  private final int value;
  
  static {
    zzcd zzcd1 = new zzcd("ENUM_SIGNAL_SOURCE_UNKNOWN", 0, 0);
    b = zzcd1;
    zzcd zzcd2 = new zzcd("ENUM_SIGNAL_SOURCE_DISABLE", 1, 1);
    c = zzcd2;
    zzcd zzcd3 = new zzcd("ENUM_SIGNAL_SOURCE_ADSHIELD", 2, 2);
    d = zzcd3;
    zzcd zzcd4 = new zzcd("ENUM_SIGNAL_SOURCE_GASS", 3, 3);
    e = zzcd4;
    zzcd zzcd5 = new zzcd("ENUM_SIGNAL_SOURCE_CALLER_PROVIDED", 4, 4);
    f = zzcd5;
    h = new zzcd[] { zzcd1, zzcd2, zzcd3, zzcd4, zzcd5 };
    g = new lf0();
  }
  
  zzcd(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzcd zzj(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? null : f) : e) : d) : c) : b;
  }
  
  public static r42 zzw() {
    return mh0.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzcd.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzcd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */