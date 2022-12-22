package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.r;

public final class e {
  public final String a;
  
  public final String b;
  
  public final String c;
  
  public final MediaCodecInfo.CodecCapabilities d;
  
  public final boolean e;
  
  public final boolean f;
  
  public final boolean g;
  
  public final boolean h;
  
  public final boolean i;
  
  public final boolean j;
  
  public final boolean k;
  
  private final boolean l;
  
  private e(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6) {
    this.a = (String)com.google.android.exoplayer2.util.e.e(paramString1);
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramCodecCapabilities;
    this.h = paramBoolean1;
    this.i = paramBoolean2;
    this.j = paramBoolean3;
    this.k = paramBoolean4;
    paramBoolean2 = true;
    if (!paramBoolean5 && paramCodecCapabilities != null && g(paramCodecCapabilities)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    this.e = paramBoolean1;
    if (paramCodecCapabilities != null && r(paramCodecCapabilities)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    this.f = paramBoolean1;
    paramBoolean1 = paramBoolean2;
    if (!paramBoolean6)
      if (paramCodecCapabilities != null && p(paramCodecCapabilities)) {
        paramBoolean1 = paramBoolean2;
      } else {
        paramBoolean1 = false;
      }  
    this.g = paramBoolean1;
    this.l = r.n(paramString2);
  }
  
  private static int a(String paramString1, String paramString2, int paramInt) {
    byte b;
    if (paramInt > 1 || (h0.a >= 26 && paramInt > 0) || "audio/mpeg".equals(paramString2) || "audio/3gpp".equals(paramString2) || "audio/amr-wb".equals(paramString2) || "audio/mp4a-latm".equals(paramString2) || "audio/vorbis".equals(paramString2) || "audio/opus".equals(paramString2) || "audio/raw".equals(paramString2) || "audio/flac".equals(paramString2) || "audio/g711-alaw".equals(paramString2) || "audio/g711-mlaw".equals(paramString2) || "audio/gsm".equals(paramString2))
      return paramInt; 
    if ("audio/ac3".equals(paramString2)) {
      b = 6;
    } else if ("audio/eac3".equals(paramString2)) {
      b = 16;
    } else {
      b = 30;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("AssumedMaxChannelAdjustment: ");
    stringBuilder.append(paramString1);
    stringBuilder.append(", [");
    stringBuilder.append(paramInt);
    stringBuilder.append(" to ");
    stringBuilder.append(b);
    stringBuilder.append("]");
    o.f("MediaCodecInfo", stringBuilder.toString());
    return b;
  }
  
  @TargetApi(21)
  private static Point c(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2) {
    int i = paramVideoCapabilities.getWidthAlignment();
    int j = paramVideoCapabilities.getHeightAlignment();
    return new Point(h0.i(paramInt1, i) * i, h0.i(paramInt2, j) * j);
  }
  
  @TargetApi(21)
  private static boolean d(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble) {
    Point point = c(paramVideoCapabilities, paramInt1, paramInt2);
    paramInt2 = point.x;
    paramInt1 = point.y;
    return (paramDouble == -1.0D || paramDouble <= 0.0D) ? paramVideoCapabilities.isSizeSupported(paramInt2, paramInt1) : paramVideoCapabilities.areSizeAndRateSupported(paramInt2, paramInt1, Math.floor(paramDouble));
  }
  
  private static final boolean e(String paramString) {
    return !("OMX.MTK.VIDEO.DECODER.HEVC".equals(paramString) && "mcv5a".equals(h0.b));
  }
  
  private static boolean g(MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    boolean bool;
    if (h0.a >= 19 && h(paramCodecCapabilities)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @TargetApi(19)
  private static boolean h(MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    return paramCodecCapabilities.isFeatureSupported("adaptive-playback");
  }
  
  private static boolean p(MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    boolean bool;
    if (h0.a >= 21 && q(paramCodecCapabilities)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @TargetApi(21)
  private static boolean q(MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    return paramCodecCapabilities.isFeatureSupported("secure-playback");
  }
  
  private static boolean r(MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    boolean bool;
    if (h0.a >= 21 && s(paramCodecCapabilities)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @TargetApi(21)
  private static boolean s(MediaCodecInfo.CodecCapabilities paramCodecCapabilities) {
    return paramCodecCapabilities.isFeatureSupported("tunneled-playback");
  }
  
  private void u(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("AssumedSupport [");
    stringBuilder.append(paramString);
    stringBuilder.append("] [");
    stringBuilder.append(this.a);
    stringBuilder.append(", ");
    stringBuilder.append(this.b);
    stringBuilder.append("] [");
    stringBuilder.append(h0.e);
    stringBuilder.append("]");
    o.b("MediaCodecInfo", stringBuilder.toString());
  }
  
  private void v(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NoSupport [");
    stringBuilder.append(paramString);
    stringBuilder.append("] [");
    stringBuilder.append(this.a);
    stringBuilder.append(", ");
    stringBuilder.append(this.b);
    stringBuilder.append("] [");
    stringBuilder.append(h0.e);
    stringBuilder.append("]");
    o.b("MediaCodecInfo", stringBuilder.toString());
  }
  
  public static e w(String paramString1, String paramString2, String paramString3, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5) {
    return new e(paramString1, paramString2, paramString3, paramCodecCapabilities, false, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5);
  }
  
  public static e x(String paramString) {
    return new e(paramString, null, null, null, true, false, true, false, false, false);
  }
  
  @TargetApi(21)
  public Point b(int paramInt1, int paramInt2) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
    if (codecCapabilities == null)
      return null; 
    MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
    return (videoCapabilities == null) ? null : c(videoCapabilities, paramInt1, paramInt2);
  }
  
  public MediaCodecInfo.CodecProfileLevel[] f() {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
    if (codecCapabilities != null) {
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel2 = codecCapabilities.profileLevels;
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel1 = arrayOfCodecProfileLevel2;
      return (arrayOfCodecProfileLevel2 == null) ? new MediaCodecInfo.CodecProfileLevel[0] : arrayOfCodecProfileLevel1;
    } 
    return new MediaCodecInfo.CodecProfileLevel[0];
  }
  
  @TargetApi(21)
  public boolean i(int paramInt) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
    if (codecCapabilities == null) {
      v("channelCount.caps");
      return false;
    } 
    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
    if (audioCapabilities == null) {
      v("channelCount.aCaps");
      return false;
    } 
    if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) < paramInt) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("channelCount.support, ");
      stringBuilder.append(paramInt);
      v(stringBuilder.toString());
      return false;
    } 
    return true;
  }
  
  @TargetApi(21)
  public boolean j(int paramInt) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
    if (codecCapabilities == null) {
      v("sampleRate.caps");
      return false;
    } 
    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
    if (audioCapabilities == null) {
      v("sampleRate.aCaps");
      return false;
    } 
    if (!audioCapabilities.isSampleRateSupported(paramInt)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sampleRate.support, ");
      stringBuilder.append(paramInt);
      v(stringBuilder.toString());
      return false;
    } 
    return true;
  }
  
  public boolean k(Format paramFormat) {
    String str = paramFormat.g;
    if (str == null || this.b == null)
      return true; 
    str = r.e(str);
    if (str == null)
      return true; 
    if (!this.b.equals(str)) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("codec.mime ");
      stringBuilder1.append(paramFormat.g);
      stringBuilder1.append(", ");
      stringBuilder1.append(str);
      v(stringBuilder1.toString());
      return false;
    } 
    Pair<Integer, Integer> pair = MediaCodecUtil.h(paramFormat);
    if (pair == null)
      return true; 
    int i = ((Integer)pair.first).intValue();
    int j = ((Integer)pair.second).intValue();
    if (!this.l && i != 42)
      return true; 
    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : f()) {
      if (codecProfileLevel.profile == i && codecProfileLevel.level >= j)
        return true; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("codec.profileLevel, ");
    stringBuilder.append(paramFormat.g);
    stringBuilder.append(", ");
    stringBuilder.append(str);
    v(stringBuilder.toString());
    return false;
  }
  
  public boolean l(Format paramFormat) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual k : (Lcom/google/android/exoplayer2/Format;)Z
    //   5: istore_2
    //   6: iconst_0
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #4
    //   11: iload_2
    //   12: ifne -> 17
    //   15: iconst_0
    //   16: ireturn
    //   17: aload_0
    //   18: getfield l : Z
    //   21: ifeq -> 151
    //   24: aload_1
    //   25: getfield o : I
    //   28: istore #5
    //   30: iload #5
    //   32: ifle -> 149
    //   35: aload_1
    //   36: getfield p : I
    //   39: istore #6
    //   41: iload #6
    //   43: ifgt -> 49
    //   46: goto -> 149
    //   49: getstatic com/google/android/exoplayer2/util/h0.a : I
    //   52: bipush #21
    //   54: if_icmplt -> 71
    //   57: aload_0
    //   58: iload #5
    //   60: iload #6
    //   62: aload_1
    //   63: getfield q : F
    //   66: f2d
    //   67: invokevirtual t : (IID)Z
    //   70: ireturn
    //   71: iload #5
    //   73: iload #6
    //   75: imul
    //   76: invokestatic B : ()I
    //   79: if_icmpgt -> 85
    //   82: iconst_1
    //   83: istore #4
    //   85: iload #4
    //   87: ifne -> 146
    //   90: new java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial <init> : ()V
    //   97: astore #7
    //   99: aload #7
    //   101: ldc_w 'legacyFrameSize, '
    //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload #7
    //   110: aload_1
    //   111: getfield o : I
    //   114: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   117: pop
    //   118: aload #7
    //   120: ldc_w 'x'
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: aload #7
    //   129: aload_1
    //   130: getfield p : I
    //   133: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: aload_0
    //   138: aload #7
    //   140: invokevirtual toString : ()Ljava/lang/String;
    //   143: invokespecial v : (Ljava/lang/String;)V
    //   146: iload #4
    //   148: ireturn
    //   149: iconst_1
    //   150: ireturn
    //   151: getstatic com/google/android/exoplayer2/util/h0.a : I
    //   154: bipush #21
    //   156: if_icmplt -> 207
    //   159: aload_1
    //   160: getfield x : I
    //   163: istore #6
    //   165: iload #6
    //   167: iconst_m1
    //   168: if_icmpeq -> 183
    //   171: iload_3
    //   172: istore #4
    //   174: aload_0
    //   175: iload #6
    //   177: invokevirtual j : (I)Z
    //   180: ifeq -> 210
    //   183: aload_1
    //   184: getfield w : I
    //   187: istore #6
    //   189: iload #6
    //   191: iconst_m1
    //   192: if_icmpeq -> 207
    //   195: iload_3
    //   196: istore #4
    //   198: aload_0
    //   199: iload #6
    //   201: invokevirtual i : (I)Z
    //   204: ifeq -> 210
    //   207: iconst_1
    //   208: istore #4
    //   210: iload #4
    //   212: ireturn
  }
  
  public boolean m() {
    if (h0.a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = f();
      int i = arrayOfCodecProfileLevel.length;
      for (byte b = 0; b < i; b++) {
        if ((arrayOfCodecProfileLevel[b]).profile == 16384)
          return true; 
      } 
    } 
    return false;
  }
  
  public boolean n(Format paramFormat) {
    boolean bool;
    if (this.l)
      return this.e; 
    Pair<Integer, Integer> pair = MediaCodecUtil.h(paramFormat);
    if (pair != null && ((Integer)pair.first).intValue() == 42) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean o(Format paramFormat1, Format paramFormat2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Z
    //   4: istore #4
    //   6: iconst_1
    //   7: istore #5
    //   9: iconst_1
    //   10: istore #6
    //   12: iload #4
    //   14: ifeq -> 109
    //   17: aload_1
    //   18: getfield j : Ljava/lang/String;
    //   21: aload_2
    //   22: getfield j : Ljava/lang/String;
    //   25: invokevirtual equals : (Ljava/lang/Object;)Z
    //   28: ifeq -> 105
    //   31: aload_1
    //   32: getfield r : I
    //   35: aload_2
    //   36: getfield r : I
    //   39: if_icmpne -> 105
    //   42: aload_0
    //   43: getfield e : Z
    //   46: ifne -> 71
    //   49: aload_1
    //   50: getfield o : I
    //   53: aload_2
    //   54: getfield o : I
    //   57: if_icmpne -> 105
    //   60: aload_1
    //   61: getfield p : I
    //   64: aload_2
    //   65: getfield p : I
    //   68: if_icmpne -> 105
    //   71: iload_3
    //   72: ifne -> 85
    //   75: iload #6
    //   77: istore_3
    //   78: aload_2
    //   79: getfield v : Lcom/google/android/exoplayer2/video/ColorInfo;
    //   82: ifnull -> 107
    //   85: aload_1
    //   86: getfield v : Lcom/google/android/exoplayer2/video/ColorInfo;
    //   89: aload_2
    //   90: getfield v : Lcom/google/android/exoplayer2/video/ColorInfo;
    //   93: invokestatic b : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   96: ifeq -> 105
    //   99: iload #6
    //   101: istore_3
    //   102: goto -> 107
    //   105: iconst_0
    //   106: istore_3
    //   107: iload_3
    //   108: ireturn
    //   109: ldc 'audio/mp4a-latm'
    //   111: aload_0
    //   112: getfield b : Ljava/lang/String;
    //   115: invokevirtual equals : (Ljava/lang/Object;)Z
    //   118: ifeq -> 229
    //   121: aload_1
    //   122: getfield j : Ljava/lang/String;
    //   125: aload_2
    //   126: getfield j : Ljava/lang/String;
    //   129: invokevirtual equals : (Ljava/lang/Object;)Z
    //   132: ifeq -> 229
    //   135: aload_1
    //   136: getfield w : I
    //   139: aload_2
    //   140: getfield w : I
    //   143: if_icmpne -> 229
    //   146: aload_1
    //   147: getfield x : I
    //   150: aload_2
    //   151: getfield x : I
    //   154: if_icmpeq -> 160
    //   157: goto -> 229
    //   160: aload_1
    //   161: invokestatic h : (Lcom/google/android/exoplayer2/Format;)Landroid/util/Pair;
    //   164: astore_1
    //   165: aload_2
    //   166: invokestatic h : (Lcom/google/android/exoplayer2/Format;)Landroid/util/Pair;
    //   169: astore_2
    //   170: aload_1
    //   171: ifnull -> 229
    //   174: aload_2
    //   175: ifnonnull -> 181
    //   178: goto -> 229
    //   181: aload_1
    //   182: getfield first : Ljava/lang/Object;
    //   185: checkcast java/lang/Integer
    //   188: invokevirtual intValue : ()I
    //   191: istore #7
    //   193: aload_2
    //   194: getfield first : Ljava/lang/Object;
    //   197: checkcast java/lang/Integer
    //   200: invokevirtual intValue : ()I
    //   203: istore #8
    //   205: iload #7
    //   207: bipush #42
    //   209: if_icmpne -> 225
    //   212: iload #8
    //   214: bipush #42
    //   216: if_icmpne -> 225
    //   219: iload #5
    //   221: istore_3
    //   222: goto -> 227
    //   225: iconst_0
    //   226: istore_3
    //   227: iload_3
    //   228: ireturn
    //   229: iconst_0
    //   230: ireturn
  }
  
  @TargetApi(21)
  public boolean t(int paramInt1, int paramInt2, double paramDouble) {
    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
    if (codecCapabilities == null) {
      v("sizeAndRate.caps");
      return false;
    } 
    MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
    if (videoCapabilities == null) {
      v("sizeAndRate.vCaps");
      return false;
    } 
    if (!d(videoCapabilities, paramInt1, paramInt2, paramDouble)) {
      if (paramInt1 >= paramInt2 || !e(this.a) || !d(videoCapabilities, paramInt2, paramInt1, paramDouble)) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("sizeAndRate.support, ");
        stringBuilder1.append(paramInt1);
        stringBuilder1.append("x");
        stringBuilder1.append(paramInt2);
        stringBuilder1.append("x");
        stringBuilder1.append(paramDouble);
        v(stringBuilder1.toString());
        return false;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("sizeAndRate.rotated, ");
      stringBuilder.append(paramInt1);
      stringBuilder.append("x");
      stringBuilder.append(paramInt2);
      stringBuilder.append("x");
      stringBuilder.append(paramDouble);
      u(stringBuilder.toString());
    } 
    return true;
  }
  
  public String toString() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/mediacodec/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */