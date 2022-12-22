package com.google.android.gms.internal.ads;

public enum zzeft implements p42 {
  b, c, d, e, f, g;
  
  private static final o42<zzeft> h;
  
  private final int value;
  
  static {
    zzeft zzeft1 = new zzeft("UNKNOWN_HASH", 0, 0);
    b = zzeft1;
    zzeft zzeft2 = new zzeft("SHA1", 1, 1);
    c = zzeft2;
    zzeft zzeft3 = new zzeft("SHA384", 2, 2);
    d = zzeft3;
    zzeft zzeft4 = new zzeft("SHA256", 3, 3);
    e = zzeft4;
    zzeft zzeft5 = new zzeft("SHA512", 4, 4);
    f = zzeft5;
    zzeft zzeft6 = new zzeft("UNRECOGNIZED", 5, -1);
    g = zzeft6;
    i = new zzeft[] { zzeft1, zzeft2, zzeft3, zzeft4, zzeft5, zzeft6 };
    h = new oz1();
  }
  
  zzeft(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzeft zzfh(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? null : f) : e) : d) : c) : b;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzeft.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzeft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */