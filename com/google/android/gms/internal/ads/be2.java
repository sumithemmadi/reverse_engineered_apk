package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
final class be2 {
  private final MediaCodec.CryptoInfo a;
  
  private final MediaCodec.CryptoInfo.Pattern b;
  
  private be2(MediaCodec.CryptoInfo paramCryptoInfo) {
    this.a = paramCryptoInfo;
    this.b = new MediaCodec.CryptoInfo.Pattern(0, 0);
  }
  
  private final void a(int paramInt1, int paramInt2) {
    this.b.set(0, 0);
    this.a.setPattern(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/be2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */