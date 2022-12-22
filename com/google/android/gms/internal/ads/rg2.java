package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

final class rg2 implements pg2 {
  private rg2() {}
  
  public final MediaCodecInfo a(int paramInt) {
    return MediaCodecList.getCodecInfoAt(paramInt);
  }
  
  public final int b() {
    return MediaCodecList.getCodecCount();
  }
  
  public final boolean c() {
    return false;
  }
  
  public final boolean d(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    return "video/avc".equals(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */