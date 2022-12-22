package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
final class qg2 implements pg2 {
  private final int a;
  
  private MediaCodecInfo[] b;
  
  public qg2(boolean paramBoolean) {
    this.a = paramBoolean;
  }
  
  private final void e() {
    if (this.b == null)
      this.b = (new MediaCodecList(this.a)).getCodecInfos(); 
  }
  
  public final MediaCodecInfo a(int paramInt) {
    e();
    return this.b[paramInt];
  }
  
  public final int b() {
    e();
    return this.b.length;
  }
  
  public final boolean c() {
    return true;
  }
  
  public final boolean d(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    return paramCodecCapabilities.isFeatureSupported("secure-playback");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */