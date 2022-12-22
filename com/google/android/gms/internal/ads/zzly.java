package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

public final class zzly extends Exception {
  private final String mimeType;
  
  private final boolean zzbcv;
  
  private final String zzbcw;
  
  private final String zzbcx;
  
  public zzly(zzht paramzzht, Throwable paramThrowable, boolean paramBoolean, int paramInt) {
    super(stringBuilder2.toString(), paramThrowable);
    String str1;
    this.mimeType = paramzzht.g;
    this.zzbcv = false;
    this.zzbcw = null;
    if (paramInt < 0) {
      str1 = "neg_";
    } else {
      str1 = "";
    } 
    paramInt = Math.abs(paramInt);
    StringBuilder stringBuilder1 = new StringBuilder(str1.length() + 64);
    stringBuilder1.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
    stringBuilder1.append(str1);
    stringBuilder1.append(paramInt);
    this.zzbcx = stringBuilder1.toString();
  }
  
  public zzly(zzht paramzzht, Throwable paramThrowable, boolean paramBoolean, String paramString) {
    super(stringBuilder.toString(), paramThrowable);
    this.mimeType = paramzzht.g;
    this.zzbcv = false;
    this.zzbcw = paramString;
    int i = wj2.a;
    paramString = null;
    String str1 = paramString;
    if (i >= 21) {
      str1 = paramString;
      if (paramThrowable instanceof MediaCodec.CodecException)
        str1 = ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo(); 
    } 
    this.zzbcx = str1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */