package com.google.android.gms.internal.ads;

final class zzeju extends zzekb {
  private final int zzimc;
  
  private final int zzimd;
  
  zzeju(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    super(paramArrayOfbyte);
    zzejr.zzi(paramInt1, paramInt1 + paramInt2, paramArrayOfbyte.length);
    this.zzimc = paramInt1;
    this.zzimd = paramInt2;
  }
  
  public final int size() {
    return this.zzimd;
  }
  
  protected final void zzb(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    System.arraycopy(this.zzimk, super.zzbgp() + paramInt1, paramArrayOfbyte, paramInt2, paramInt3);
  }
  
  protected final int zzbgp() {
    return this.zzimc;
  }
  
  public final byte zzfz(int paramInt) {
    zzejr.zzab(paramInt, super.size());
    return this.zzimk[this.zzimc + paramInt];
  }
  
  final byte zzga(int paramInt) {
    return this.zzimk[this.zzimc + paramInt];
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzeju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */