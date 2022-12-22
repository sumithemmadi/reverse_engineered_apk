package com.google.android.gms.internal.ads;

public enum zzepa$zza$zzc implements p42 {
  b, c, d, e, f;
  
  private static final o42<zzepa$zza$zzc> g;
  
  private final int value;
  
  static {
    zzepa$zza$zzc zzepa$zza$zzc1 = new zzepa$zza$zzc("SAFE", 0, 0);
    b = zzepa$zza$zzc1;
    zzepa$zza$zzc zzepa$zza$zzc2 = new zzepa$zza$zzc("DANGEROUS", 1, 1);
    c = zzepa$zza$zzc2;
    zzepa$zza$zzc zzepa$zza$zzc3 = new zzepa$zza$zzc("UNKNOWN", 2, 2);
    d = zzepa$zza$zzc3;
    zzepa$zza$zzc zzepa$zza$zzc4 = new zzepa$zza$zzc("POTENTIALLY_UNWANTED", 3, 3);
    e = zzepa$zza$zzc4;
    zzepa$zza$zzc zzepa$zza$zzc5 = new zzepa$zza$zzc("DANGEROUS_HOST", 4, 4);
    f = zzepa$zza$zzc5;
    h = new zzepa$zza$zzc[] { zzepa$zza$zzc1, zzepa$zza$zzc2, zzepa$zza$zzc3, zzepa$zza$zzc4, zzepa$zza$zzc5 };
    g = new z72();
  }
  
  zzepa$zza$zzc(int paramInt1) {
    this.value = paramInt1;
  }
  
  public static zzepa$zza$zzc zzhy(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 3) ? ((paramInt != 4) ? null : f) : e) : d) : c) : b;
  }
  
  public static r42 zzw() {
    return a82.a;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("<");
    stringBuilder.append(zzepa$zza$zzc.class.getName());
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzepa$zza$zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */