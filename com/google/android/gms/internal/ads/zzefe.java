package com.google.android.gms.internal.ads;

public enum zzefe implements p42 {
  b, c, d, e, f;
  
  private static final o42<zzefe> g;
  
  private final int value;
  
  static {
    zzefe zzefe1 = new zzefe("UNKNOWN_FORMAT", 0, 0);
    b = zzefe1;
    zzefe zzefe2 = new zzefe("UNCOMPRESSED", 1, 1);
    c = zzefe2;
    zzefe zzefe3 = new zzefe("COMPRESSED", 2, 2);
    d = zzefe3;
    zzefe zzefe4 = new zzefe("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 3, 3);
    e = zzefe4;
    zzefe zzefe5 = new zzefe("UNRECOGNIZED", 4, -1);
    f = zzefe5;
    h = new zzefe[] { zzefe1, zzefe2, zzefe3, zzefe4, zzefe5 };
    g = new az1();
  }
  
  zzefe(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzefe zzfd(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? null : e) : d) : c) : b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzefe.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzefe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */