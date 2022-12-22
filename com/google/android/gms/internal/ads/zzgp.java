package com.google.android.gms.internal.ads;

public enum zzgp implements p42 {
  b, c, d, e, f, g;
  
  private static final o42<zzgp> h;
  
  private final int value;
  
  static {
    zzgp zzgp1 = new zzgp("UNSUPPORTED", 0, 0);
    b = zzgp1;
    zzgp zzgp2 = new zzgp("ARM7", 1, 2);
    c = zzgp2;
    zzgp zzgp3 = new zzgp("X86", 2, 4);
    d = zzgp3;
    zzgp zzgp4 = new zzgp("ARM64", 3, 5);
    e = zzgp4;
    zzgp zzgp5 = new zzgp("X86_64", 4, 6);
    f = zzgp5;
    zzgp zzgp6 = new zzgp("UNKNOWN", 5, 999);
    g = zzgp6;
    i = new zzgp[] { zzgp1, zzgp2, zzgp3, zzgp4, zzgp5, zzgp6 };
    h = new ob2();
  }
  
  zzgp(int paramInt1) {
    this.value = paramInt1;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzgp.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzgp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */