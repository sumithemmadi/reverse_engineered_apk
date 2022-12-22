package com.google.android.gms.internal.ads;

final class l32 {
  private final zzekl a;
  
  private final byte[] b;
  
  private l32(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    this.b = arrayOfByte;
    this.a = zzekl.D0(arrayOfByte);
  }
  
  public final zzejr a() {
    this.a.D();
    return new zzekb(this.b);
  }
  
  public final zzekl b() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/l32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */