package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
final class hk2 implements MediaCodec.OnFrameRenderedListener {
  private hk2(gk2 paramgk2, MediaCodec paramMediaCodec) {
    paramMediaCodec.setOnFrameRenderedListener(this, new Handler());
  }
  
  public final void onFrameRendered(MediaCodec paramMediaCodec, long paramLong1, long paramLong2) {
    gk2 gk21 = this.b;
    if (this != gk21.z0)
      return; 
    gk21.k0();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/hk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */