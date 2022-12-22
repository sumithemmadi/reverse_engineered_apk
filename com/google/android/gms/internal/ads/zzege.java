package com.google.android.gms.internal.ads;

public enum zzege implements p42 {
  b, c, d, e, f;
  
  private static final o42<zzege> g;
  
  private final int value;
  
  static {
    zzege zzege1 = new zzege("UNKNOWN_STATUS", 0, 0);
    b = zzege1;
    zzege zzege2 = new zzege("ENABLED", 1, 1);
    c = zzege2;
    zzege zzege3 = new zzege("DISABLED", 2, 2);
    d = zzege3;
    zzege zzege4 = new zzege("DESTROYED", 3, 3);
    e = zzege4;
    zzege zzege5 = new zzege("UNRECOGNIZED", 4, -1);
    f = zzege5;
    h = new zzege[] { zzege1, zzege2, zzege3, zzege4, zzege5 };
    g = new yz1();
  }
  
  zzege(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzege zzfk(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? null : e) : d) : c) : b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzege.class.getName());
    stringBuilder.append('@');
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this != f) {
      stringBuilder.append(" number=");
      stringBuilder.append(zzv());
    } 
    stringBuilder.append(" name=");
    stringBuilder.append(name());
    stringBuilder.append('>');
    return stringBuilder.toString();
  }
  
  public final int zzv() {
    if (this != f)
      return this.value; 
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzege.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */