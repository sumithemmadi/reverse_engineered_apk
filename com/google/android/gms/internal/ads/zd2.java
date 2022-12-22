package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

public final class zd2 {
  public byte[] a;
  
  private byte[] b;
  
  private int c;
  
  public int[] d;
  
  public int[] e;
  
  private int f;
  
  private int g;
  
  private int h;
  
  private final MediaCodec.CryptoInfo i;
  
  private final be2 j;
  
  public zd2() {
    MediaCodec.CryptoInfo cryptoInfo;
    int i = wj2.a;
    be2 be21 = null;
    if (i >= 16) {
      cryptoInfo = new MediaCodec.CryptoInfo();
    } else {
      cryptoInfo = null;
    } 
    this.i = cryptoInfo;
    if (i >= 24)
      be21 = new be2(cryptoInfo, null); 
    this.j = be21;
  }
  
  public final void a(int paramInt1, int[] paramArrayOfint1, int[] paramArrayOfint2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt2) {
    this.f = paramInt1;
    this.d = paramArrayOfint1;
    this.e = paramArrayOfint2;
    this.b = paramArrayOfbyte1;
    this.a = paramArrayOfbyte2;
    this.c = paramInt2;
    this.g = 0;
    this.h = 0;
    int i = wj2.a;
    if (i >= 16) {
      MediaCodec.CryptoInfo cryptoInfo = this.i;
      cryptoInfo.numSubSamples = paramInt1;
      cryptoInfo.numBytesOfClearData = paramArrayOfint1;
      cryptoInfo.numBytesOfEncryptedData = paramArrayOfint2;
      cryptoInfo.key = paramArrayOfbyte1;
      cryptoInfo.iv = paramArrayOfbyte2;
      cryptoInfo.mode = paramInt2;
      if (i >= 24)
        be2.b(this.j, 0, 0); 
    } 
  }
  
  @TargetApi(16)
  public final MediaCodec.CryptoInfo b() {
    return this.i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */