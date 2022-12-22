package com.google.android.gms.internal.ads;

public enum zzefs implements p42 {
  b, c, d, e, f, g;
  
  private static final o42<zzefs> h;
  
  private final int value;
  
  static {
    zzefs zzefs1 = new zzefs("UNKNOWN_CURVE", 0, 0);
    b = zzefs1;
    zzefs zzefs2 = new zzefs("NIST_P256", 1, 2);
    c = zzefs2;
    zzefs zzefs3 = new zzefs("NIST_P384", 2, 3);
    d = zzefs3;
    zzefs zzefs4 = new zzefs("NIST_P521", 3, 4);
    e = zzefs4;
    zzefs zzefs5 = new zzefs("CURVE25519", 4, 5);
    f = zzefs5;
    zzefs zzefs6 = new zzefs("UNRECOGNIZED", 5, -1);
    g = zzefs6;
    i = new zzefs[] { zzefs1, zzefs2, zzefs3, zzefs4, zzefs5, zzefs6 };
    h = new mz1();
  }
  
  zzefs(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzefs zzfg(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? ((paramInt != 5) ? null : f) : e) : d) : c) : b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzefs.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzefs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */