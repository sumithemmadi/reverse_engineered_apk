package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

@TargetApi(16)
public final class jg2 {
  public final String a;
  
  public final boolean b;
  
  public final boolean c;
  
  public final boolean d;
  
  private final String e;
  
  private final MediaCodecInfo.CodecCapabilities f;
  
  private jg2(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: invokestatic d : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: checkcast java/lang/String
    //   12: putfield a : Ljava/lang/String;
    //   15: aload_0
    //   16: aload_2
    //   17: putfield e : Ljava/lang/String;
    //   20: aload_0
    //   21: aload_3
    //   22: putfield f : Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   25: iconst_1
    //   26: istore #6
    //   28: iload #4
    //   30: ifne -> 74
    //   33: aload_3
    //   34: ifnull -> 74
    //   37: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   40: bipush #19
    //   42: if_icmplt -> 60
    //   45: aload_3
    //   46: ldc 'adaptive-playback'
    //   48: invokevirtual isFeatureSupported : (Ljava/lang/String;)Z
    //   51: ifeq -> 60
    //   54: iconst_1
    //   55: istore #7
    //   57: goto -> 63
    //   60: iconst_0
    //   61: istore #7
    //   63: iload #7
    //   65: ifeq -> 74
    //   68: iconst_1
    //   69: istore #4
    //   71: goto -> 77
    //   74: iconst_0
    //   75: istore #4
    //   77: aload_0
    //   78: iload #4
    //   80: putfield b : Z
    //   83: aload_3
    //   84: ifnull -> 124
    //   87: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   90: bipush #21
    //   92: if_icmplt -> 110
    //   95: aload_3
    //   96: ldc 'tunneled-playback'
    //   98: invokevirtual isFeatureSupported : (Ljava/lang/String;)Z
    //   101: ifeq -> 110
    //   104: iconst_1
    //   105: istore #7
    //   107: goto -> 113
    //   110: iconst_0
    //   111: istore #7
    //   113: iload #7
    //   115: ifeq -> 124
    //   118: iconst_1
    //   119: istore #4
    //   121: goto -> 127
    //   124: iconst_0
    //   125: istore #4
    //   127: aload_0
    //   128: iload #4
    //   130: putfield c : Z
    //   133: iload #6
    //   135: istore #4
    //   137: iload #5
    //   139: ifne -> 187
    //   142: aload_3
    //   143: ifnull -> 184
    //   146: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   149: bipush #21
    //   151: if_icmplt -> 169
    //   154: aload_3
    //   155: ldc 'secure-playback'
    //   157: invokevirtual isFeatureSupported : (Ljava/lang/String;)Z
    //   160: ifeq -> 169
    //   163: iconst_1
    //   164: istore #7
    //   166: goto -> 172
    //   169: iconst_0
    //   170: istore #7
    //   172: iload #7
    //   174: ifeq -> 184
    //   177: iload #6
    //   179: istore #4
    //   181: goto -> 187
    //   184: iconst_0
    //   185: istore #4
    //   187: aload_0
    //   188: iload #4
    //   190: putfield d : Z
    //   193: return
  }
  
  public static jg2 a(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2) {
    return new jg2(paramString1, paramString2, paramCodecCapabilities, paramBoolean1, paramBoolean2);
  }
  
  @TargetApi(21)
  private static boolean c(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble) {
    return (paramDouble == -1.0D || paramDouble <= 0.0D) ? paramVideoCapabilities.isSizeSupported(paramInt1, paramInt2) : paramVideoCapabilities.areSizeAndRateSupported(paramInt1, paramInt2, paramDouble);
  }
  
  public static jg2 f(String paramString) {
    return new jg2(paramString, null, null, false, false);
  }
  
  private final void h(String paramString) {
    String str1 = this.a;
    String str2 = this.e;
    String str3 = wj2.e;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 20 + String.valueOf(str1).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
    stringBuilder.append("NoSupport [");
    stringBuilder.append(paramString);
    stringBuilder.append("] [");
    stringBuilder.append(str1);
    stringBuilder.append(", ");
    stringBuilder.append(str2);
    stringBuilder.append("] [");
    stringBuilder.append(str3);
    stringBuilder.append("]");
    Log.d("MediaCodecInfo", stringBuilder.toString());
  }
  
  @TargetApi(21)
  public final boolean b(int paramInt1, int paramInt2, double paramDouble) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
    if (codecCapabilities == null) {
      h("sizeAndRate.caps");
      return false;
    } 
    MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
    if (videoCapabilities == null) {
      h("sizeAndRate.vCaps");
      return false;
    } 
    if (!c(videoCapabilities, paramInt1, paramInt2, paramDouble)) {
      if (paramInt1 >= paramInt2 || !c(videoCapabilities, paramInt2, paramInt1, paramDouble)) {
        StringBuilder stringBuilder = new StringBuilder(69);
        stringBuilder.append("sizeAndRate.support, ");
        stringBuilder.append(paramInt1);
        stringBuilder.append("x");
        stringBuilder.append(paramInt2);
        stringBuilder.append("x");
        stringBuilder.append(paramDouble);
        h(stringBuilder.toString());
        return false;
      } 
      StringBuilder stringBuilder1 = new StringBuilder(69);
      stringBuilder1.append("sizeAndRate.rotated, ");
      stringBuilder1.append(paramInt1);
      stringBuilder1.append("x");
      stringBuilder1.append(paramInt2);
      stringBuilder1.append("x");
      stringBuilder1.append(paramDouble);
      String str2 = stringBuilder1.toString();
      String str1 = this.a;
      String str3 = this.e;
      String str4 = wj2.e;
      StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str2).length() + 25 + String.valueOf(str1).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
      stringBuilder2.append("AssumedSupport [");
      stringBuilder2.append(str2);
      stringBuilder2.append("] [");
      stringBuilder2.append(str1);
      stringBuilder2.append(", ");
      stringBuilder2.append(str3);
      stringBuilder2.append("] [");
      stringBuilder2.append(str4);
      stringBuilder2.append("]");
      Log.d("MediaCodecInfo", stringBuilder2.toString());
    } 
    return true;
  }
  
  @TargetApi(21)
  public final boolean d(int paramInt) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
    if (codecCapabilities == null) {
      h("sampleRate.caps");
      return false;
    } 
    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
    if (audioCapabilities == null) {
      h("sampleRate.aCaps");
      return false;
    } 
    if (!audioCapabilities.isSampleRateSupported(paramInt)) {
      StringBuilder stringBuilder = new StringBuilder(31);
      stringBuilder.append("sampleRate.support, ");
      stringBuilder.append(paramInt);
      h(stringBuilder.toString());
      return false;
    } 
    return true;
  }
  
  @TargetApi(21)
  public final boolean e(int paramInt) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
    if (codecCapabilities == null) {
      h("channelCount.caps");
      return false;
    } 
    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
    if (audioCapabilities == null) {
      h("channelCount.aCaps");
      return false;
    } 
    if (audioCapabilities.getMaxInputChannelCount() < paramInt) {
      StringBuilder stringBuilder = new StringBuilder(33);
      stringBuilder.append("channelCount.support, ");
      stringBuilder.append(paramInt);
      h(stringBuilder.toString());
      return false;
    } 
    return true;
  }
  
  public final boolean g(String paramString) {
    if (paramString == null || this.e == null)
      return true; 
    String str = paramString.trim();
    if (str.startsWith("avc1") || str.startsWith("avc3")) {
      str = "video/avc";
    } else if (str.startsWith("hev1") || str.startsWith("hvc1")) {
      str = "video/hevc";
    } else if (str.startsWith("vp9")) {
      str = "video/x-vnd.on2.vp9";
    } else if (str.startsWith("vp8")) {
      str = "video/x-vnd.on2.vp8";
    } else if (str.startsWith("mp4a")) {
      str = "audio/mp4a-latm";
    } else if (str.startsWith("ac-3") || str.startsWith("dac3")) {
      str = "audio/ac3";
    } else if (str.startsWith("ec-3") || str.startsWith("dec3")) {
      str = "audio/eac3";
    } else if (str.startsWith("dtsc") || str.startsWith("dtse")) {
      str = "audio/vnd.dts";
    } else if (str.startsWith("dtsh") || str.startsWith("dtsl")) {
      str = "audio/vnd.dts.hd";
    } else if (str.startsWith("opus")) {
      str = "audio/opus";
    } else if (str.startsWith("vorbis")) {
      str = "audio/vorbis";
    } else {
      str = null;
    } 
    if (str == null)
      return true; 
    if (!this.e.equals(str)) {
      StringBuilder stringBuilder1 = new StringBuilder(paramString.length() + 13 + str.length());
      stringBuilder1.append("codec.mime ");
      stringBuilder1.append(paramString);
      stringBuilder1.append(", ");
      stringBuilder1.append(str);
      h(stringBuilder1.toString());
      return false;
    } 
    Pair<Integer, Integer> pair = lg2.c(paramString);
    if (pair == null)
      return true; 
    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : j()) {
      if (codecProfileLevel.profile == ((Integer)pair.first).intValue() && codecProfileLevel.level >= ((Integer)pair.second).intValue())
        return true; 
    } 
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + 22 + str.length());
    stringBuilder.append("codec.profileLevel, ");
    stringBuilder.append(paramString);
    stringBuilder.append(", ");
    stringBuilder.append(str);
    h(stringBuilder.toString());
    return false;
  }
  
  @TargetApi(21)
  public final Point i(int paramInt1, int paramInt2) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
    if (codecCapabilities == null) {
      h("align.caps");
      return null;
    } 
    MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
    if (videoCapabilities == null) {
      h("align.vCaps");
      return null;
    } 
    int i = videoCapabilities.getWidthAlignment();
    int j = videoCapabilities.getHeightAlignment();
    return new Point(wj2.p(paramInt1, i) * i, wj2.p(paramInt2, j) * j);
  }
  
  public final MediaCodecInfo.CodecProfileLevel[] j() {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
    if (codecCapabilities != null) {
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = codecCapabilities.profileLevels;
      if (arrayOfCodecProfileLevel != null)
        return arrayOfCodecProfileLevel; 
    } 
    return new MediaCodecInfo.CodecProfileLevel[0];
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */