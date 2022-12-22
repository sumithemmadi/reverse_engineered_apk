package com.google.android.exoplayer2.b1;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import com.google.android.exoplayer2.util.h0;

public final class b {
  public byte[] a;
  
  public byte[] b;
  
  public int c;
  
  public int[] d;
  
  public int[] e;
  
  public int f;
  
  public int g;
  
  public int h;
  
  private final MediaCodec.CryptoInfo i;
  
  private final b j;
  
  public b() {
    MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
    this.i = cryptoInfo;
    int i = h0.a;
    b b1 = null;
    if (i >= 24)
      b1 = new b(cryptoInfo, null); 
    this.j = b1;
  }
  
  public MediaCodec.CryptoInfo a() {
    return this.i;
  }
  
  public void b(int paramInt1, int[] paramArrayOfint1, int[] paramArrayOfint2, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3, int paramInt4) {
    this.f = paramInt1;
    this.d = paramArrayOfint1;
    this.e = paramArrayOfint2;
    this.b = paramArrayOfbyte1;
    this.a = paramArrayOfbyte2;
    this.c = paramInt2;
    this.g = paramInt3;
    this.h = paramInt4;
    MediaCodec.CryptoInfo cryptoInfo = this.i;
    cryptoInfo.numSubSamples = paramInt1;
    cryptoInfo.numBytesOfClearData = paramArrayOfint1;
    cryptoInfo.numBytesOfEncryptedData = paramArrayOfint2;
    cryptoInfo.key = paramArrayOfbyte1;
    cryptoInfo.iv = paramArrayOfbyte2;
    cryptoInfo.mode = paramInt2;
    if (h0.a >= 24)
      b.a(this.j, paramInt3, paramInt4); 
  }
  
  @TargetApi(24)
  private static final class b {
    private final MediaCodec.CryptoInfo a;
    
    private final MediaCodec.CryptoInfo.Pattern b;
    
    private b(MediaCodec.CryptoInfo param1CryptoInfo) {
      this.a = param1CryptoInfo;
      this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
    
    private void b(int param1Int1, int param1Int2) {
      this.b.set(param1Int1, param1Int2);
      this.a.setPattern(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/b1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */