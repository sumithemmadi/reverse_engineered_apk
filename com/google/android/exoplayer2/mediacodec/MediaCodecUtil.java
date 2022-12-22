package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.r;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {
  private static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
  
  private static final HashMap<b, List<e>> b = new HashMap<b, List<e>>();
  
  private static final SparseIntArray c;
  
  private static final SparseIntArray d;
  
  private static final SparseIntArray e;
  
  private static final SparseIntArray f;
  
  private static final Map<String, Integer> g;
  
  private static final Map<String, Integer> h;
  
  private static final Map<String, Integer> i;
  
  private static final SparseIntArray j;
  
  private static final SparseIntArray k;
  
  private static int l = -1;
  
  static {
    SparseIntArray sparseIntArray1 = new SparseIntArray();
    c = sparseIntArray1;
    Integer integer2 = Integer.valueOf(1);
    sparseIntArray1.put(66, 1);
    Integer integer3 = Integer.valueOf(2);
    sparseIntArray1.put(77, 2);
    Integer integer4 = Integer.valueOf(4);
    sparseIntArray1.put(88, 4);
    Integer integer5 = Integer.valueOf(8);
    sparseIntArray1.put(100, 8);
    Integer integer6 = Integer.valueOf(16);
    sparseIntArray1.put(110, 16);
    Integer integer7 = Integer.valueOf(32);
    sparseIntArray1.put(122, 32);
    Integer integer8 = Integer.valueOf(64);
    sparseIntArray1.put(244, 64);
    SparseIntArray sparseIntArray3 = new SparseIntArray();
    d = sparseIntArray3;
    sparseIntArray3.put(10, 1);
    sparseIntArray3.put(11, 4);
    sparseIntArray3.put(12, 8);
    sparseIntArray3.put(13, 16);
    sparseIntArray3.put(20, 32);
    sparseIntArray3.put(21, 64);
    Integer integer1 = Integer.valueOf(128);
    sparseIntArray3.put(22, 128);
    Integer integer9 = Integer.valueOf(256);
    sparseIntArray3.put(30, 256);
    Integer integer10 = Integer.valueOf(512);
    sparseIntArray3.put(31, 512);
    sparseIntArray3.put(32, 1024);
    sparseIntArray3.put(40, 2048);
    sparseIntArray3.put(41, 4096);
    sparseIntArray3.put(42, 8192);
    sparseIntArray3.put(50, 16384);
    sparseIntArray3.put(51, 32768);
    sparseIntArray3.put(52, 65536);
    sparseIntArray3 = new SparseIntArray();
    e = sparseIntArray3;
    sparseIntArray3.put(0, 1);
    sparseIntArray3.put(1, 2);
    sparseIntArray3.put(2, 4);
    sparseIntArray3.put(3, 8);
    sparseIntArray3 = new SparseIntArray();
    f = sparseIntArray3;
    sparseIntArray3.put(10, 1);
    sparseIntArray3.put(11, 2);
    sparseIntArray3.put(20, 4);
    sparseIntArray3.put(21, 8);
    sparseIntArray3.put(30, 16);
    sparseIntArray3.put(31, 32);
    sparseIntArray3.put(40, 64);
    sparseIntArray3.put(41, 128);
    sparseIntArray3.put(50, 256);
    sparseIntArray3.put(51, 512);
    sparseIntArray3.put(60, 2048);
    sparseIntArray3.put(61, 4096);
    sparseIntArray3.put(62, 8192);
    HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
    g = (Map)hashMap1;
    hashMap1.put("L30", integer2);
    hashMap1.put("L60", integer4);
    hashMap1.put("L63", integer6);
    hashMap1.put("L90", integer8);
    hashMap1.put("L93", integer9);
    hashMap1.put("L120", Integer.valueOf(1024));
    hashMap1.put("L123", Integer.valueOf(4096));
    hashMap1.put("L150", Integer.valueOf(16384));
    hashMap1.put("L153", Integer.valueOf(65536));
    hashMap1.put("L156", Integer.valueOf(262144));
    hashMap1.put("L180", Integer.valueOf(1048576));
    hashMap1.put("L183", Integer.valueOf(4194304));
    hashMap1.put("L186", Integer.valueOf(16777216));
    hashMap1.put("H30", integer3);
    hashMap1.put("H60", integer5);
    hashMap1.put("H63", integer7);
    hashMap1.put("H90", integer1);
    hashMap1.put("H93", integer10);
    hashMap1.put("H120", Integer.valueOf(2048));
    hashMap1.put("H123", Integer.valueOf(8192));
    hashMap1.put("H150", Integer.valueOf(32768));
    hashMap1.put("H153", Integer.valueOf(131072));
    hashMap1.put("H156", Integer.valueOf(524288));
    hashMap1.put("H180", Integer.valueOf(2097152));
    hashMap1.put("H183", Integer.valueOf(8388608));
    hashMap1.put("H186", Integer.valueOf(33554432));
    hashMap1 = new HashMap<Object, Object>();
    h = (Map)hashMap1;
    hashMap1.put("00", integer2);
    hashMap1.put("01", integer3);
    hashMap1.put("02", integer4);
    hashMap1.put("03", integer5);
    hashMap1.put("04", integer6);
    hashMap1.put("05", integer7);
    hashMap1.put("06", integer8);
    hashMap1.put("07", integer1);
    hashMap1.put("08", integer9);
    hashMap1.put("09", integer10);
    HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
    i = (Map)hashMap2;
    hashMap2.put("01", integer2);
    hashMap2.put("02", integer3);
    hashMap2.put("03", integer4);
    hashMap2.put("04", integer5);
    hashMap2.put("05", integer6);
    hashMap2.put("06", integer7);
    hashMap2.put("07", integer8);
    hashMap2.put("08", integer1);
    hashMap2.put("09", integer9);
    SparseIntArray sparseIntArray2 = new SparseIntArray();
    j = sparseIntArray2;
    sparseIntArray2.put(0, 1);
    sparseIntArray2.put(1, 2);
    sparseIntArray2.put(2, 4);
    sparseIntArray2.put(3, 8);
    sparseIntArray2.put(4, 16);
    sparseIntArray2.put(5, 32);
    sparseIntArray2.put(6, 64);
    sparseIntArray2.put(7, 128);
    sparseIntArray2.put(8, 256);
    sparseIntArray2.put(9, 512);
    sparseIntArray2.put(10, 1024);
    sparseIntArray2.put(11, 2048);
    sparseIntArray2.put(12, 4096);
    sparseIntArray2.put(13, 8192);
    sparseIntArray2.put(14, 16384);
    sparseIntArray2.put(15, 32768);
    sparseIntArray2.put(16, 65536);
    sparseIntArray2.put(17, 131072);
    sparseIntArray2.put(18, 262144);
    sparseIntArray2.put(19, 524288);
    sparseIntArray2.put(20, 1048576);
    sparseIntArray2.put(21, 2097152);
    sparseIntArray2.put(22, 4194304);
    sparseIntArray2.put(23, 8388608);
    sparseIntArray2 = new SparseIntArray();
    k = sparseIntArray2;
    sparseIntArray2.put(1, 1);
    sparseIntArray2.put(2, 2);
    sparseIntArray2.put(3, 3);
    sparseIntArray2.put(4, 4);
    sparseIntArray2.put(5, 5);
    sparseIntArray2.put(6, 6);
    sparseIntArray2.put(17, 17);
    sparseIntArray2.put(20, 20);
    sparseIntArray2.put(23, 23);
    sparseIntArray2.put(29, 29);
    sparseIntArray2.put(39, 39);
    sparseIntArray2.put(42, 42);
  }
  
  public static int B() {
    if (l == -1) {
      int i = 0;
      int j = 0;
      e e = i("video/avc", false, false);
      if (e != null) {
        MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = e.f();
        int k = arrayOfCodecProfileLevel.length;
        i = 0;
        while (j < k) {
          i = Math.max(b((arrayOfCodecProfileLevel[j]).level), i);
          j++;
        } 
        if (h0.a >= 21) {
          j = 345600;
        } else {
          j = 172800;
        } 
        i = Math.max(i, j);
      } 
      l = i;
    } 
    return l;
  }
  
  private static <T> void C(List<T> paramList, f<T> paramf) {
    Collections.sort(paramList, new d(paramf));
  }
  
  private static void a(String paramString, List<e> paramList) {
    if ("audio/raw".equals(paramString)) {
      if (h0.a < 26 && h0.b.equals("R9") && paramList.size() == 1 && ((e)paramList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW"))
        paramList.add(e.w("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false)); 
      C(paramList, a.a);
    } 
    int i = h0.a;
    if (i < 21 && paramList.size() > 1) {
      paramString = ((e)paramList.get(0)).a;
      if ("OMX.SEC.mp3.dec".equals(paramString) || "OMX.SEC.MP3.Decoder".equals(paramString) || "OMX.brcm.audio.mp3.decoder".equals(paramString))
        C(paramList, b.a); 
    } 
    if (i < 30 && paramList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((e)paramList.get(0)).a))
      paramList.add(paramList.remove(0)); 
  }
  
  private static int b(int paramInt) {
    if (paramInt != 1 && paramInt != 2) {
      switch (paramInt) {
        default:
          return -1;
        case 32768:
        case 65536:
          return 9437184;
        case 16384:
          return 5652480;
        case 8192:
          return 2228224;
        case 2048:
        case 4096:
          return 2097152;
        case 1024:
          return 1310720;
        case 512:
          return 921600;
        case 128:
        case 256:
          return 414720;
        case 64:
          return 202752;
        case 8:
        case 16:
        case 32:
          break;
      } 
      return 101376;
    } 
    return 25344;
  }
  
  private static boolean c(String paramString) {
    if (h0.a <= 22) {
      String str = h0.d;
      if (("ODROID-XU3".equals(str) || "Nexus 10".equals(str)) && ("OMX.Exynos.AVC.Decoder".equals(paramString) || "OMX.Exynos.AVC.Decoder.secure".equals(paramString)))
        return true; 
    } 
    return false;
  }
  
  private static Pair<Integer, Integer> d(String paramString, String[] paramArrayOfString) {
    StringBuilder stringBuilder;
    if (paramArrayOfString.length != 3) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring malformed MP4A codec string: ");
      stringBuilder.append(paramString);
      o.f("MediaCodecUtil", stringBuilder.toString());
      return null;
    } 
    try {
      if ("audio/mp4a-latm".equals(r.f(Integer.parseInt((String)stringBuilder[1], 16)))) {
        int i = Integer.parseInt((String)stringBuilder[2]);
        i = k.get(i, -1);
        if (i != -1)
          return new Pair(Integer.valueOf(i), Integer.valueOf(0)); 
      } 
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Ignoring malformed MP4A codec string: ");
      stringBuilder1.append(paramString);
      o.f("MediaCodecUtil", stringBuilder1.toString());
    } 
    return null;
  }
  
  private static Pair<Integer, Integer> e(String paramString, String[] paramArrayOfString, ColorInfo paramColorInfo) {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: iconst_4
    //   3: if_icmpge -> 40
    //   6: new java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial <init> : ()V
    //   13: astore_1
    //   14: aload_1
    //   15: ldc_w 'Ignoring malformed AV1 codec string: '
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload_1
    //   23: aload_0
    //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: ldc_w 'MediaCodecUtil'
    //   31: aload_1
    //   32: invokevirtual toString : ()Ljava/lang/String;
    //   35: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   38: aconst_null
    //   39: areturn
    //   40: iconst_1
    //   41: istore_3
    //   42: aload_1
    //   43: iconst_1
    //   44: aaload
    //   45: invokestatic parseInt : (Ljava/lang/String;)I
    //   48: istore #4
    //   50: aload_1
    //   51: iconst_2
    //   52: aaload
    //   53: iconst_0
    //   54: iconst_2
    //   55: invokevirtual substring : (II)Ljava/lang/String;
    //   58: invokestatic parseInt : (Ljava/lang/String;)I
    //   61: istore #5
    //   63: aload_1
    //   64: iconst_3
    //   65: aaload
    //   66: invokestatic parseInt : (Ljava/lang/String;)I
    //   69: istore #6
    //   71: iload #4
    //   73: ifeq -> 111
    //   76: new java/lang/StringBuilder
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: astore_0
    //   84: aload_0
    //   85: ldc_w 'Unknown AV1 profile: '
    //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: aload_0
    //   93: iload #4
    //   95: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: ldc_w 'MediaCodecUtil'
    //   102: aload_0
    //   103: invokevirtual toString : ()Ljava/lang/String;
    //   106: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   109: aconst_null
    //   110: areturn
    //   111: iload #6
    //   113: bipush #8
    //   115: if_icmpeq -> 160
    //   118: iload #6
    //   120: bipush #10
    //   122: if_icmpeq -> 160
    //   125: new java/lang/StringBuilder
    //   128: dup
    //   129: invokespecial <init> : ()V
    //   132: astore_0
    //   133: aload_0
    //   134: ldc_w 'Unknown AV1 bit depth: '
    //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: aload_0
    //   142: iload #6
    //   144: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: ldc_w 'MediaCodecUtil'
    //   151: aload_0
    //   152: invokevirtual toString : ()Ljava/lang/String;
    //   155: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   158: aconst_null
    //   159: areturn
    //   160: iload #6
    //   162: bipush #8
    //   164: if_icmpne -> 170
    //   167: goto -> 207
    //   170: aload_2
    //   171: ifnull -> 205
    //   174: aload_2
    //   175: getfield e : [B
    //   178: ifnonnull -> 198
    //   181: aload_2
    //   182: getfield d : I
    //   185: istore_3
    //   186: iload_3
    //   187: bipush #7
    //   189: if_icmpeq -> 198
    //   192: iload_3
    //   193: bipush #6
    //   195: if_icmpne -> 205
    //   198: sipush #4096
    //   201: istore_3
    //   202: goto -> 207
    //   205: iconst_2
    //   206: istore_3
    //   207: getstatic com/google/android/exoplayer2/mediacodec/MediaCodecUtil.j : Landroid/util/SparseIntArray;
    //   210: iload #5
    //   212: iconst_m1
    //   213: invokevirtual get : (II)I
    //   216: istore #4
    //   218: iload #4
    //   220: iconst_m1
    //   221: if_icmpne -> 259
    //   224: new java/lang/StringBuilder
    //   227: dup
    //   228: invokespecial <init> : ()V
    //   231: astore_0
    //   232: aload_0
    //   233: ldc_w 'Unknown AV1 level: '
    //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload_0
    //   241: iload #5
    //   243: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: ldc_w 'MediaCodecUtil'
    //   250: aload_0
    //   251: invokevirtual toString : ()Ljava/lang/String;
    //   254: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   257: aconst_null
    //   258: areturn
    //   259: new android/util/Pair
    //   262: dup
    //   263: iload_3
    //   264: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   267: iload #4
    //   269: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   272: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   275: areturn
    //   276: astore_1
    //   277: new java/lang/StringBuilder
    //   280: dup
    //   281: invokespecial <init> : ()V
    //   284: astore_1
    //   285: aload_1
    //   286: ldc_w 'Ignoring malformed AV1 codec string: '
    //   289: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: pop
    //   293: aload_1
    //   294: aload_0
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: pop
    //   299: ldc_w 'MediaCodecUtil'
    //   302: aload_1
    //   303: invokevirtual toString : ()Ljava/lang/String;
    //   306: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   309: aconst_null
    //   310: areturn
    // Exception table:
    //   from	to	target	type
    //   42	71	276	java/lang/NumberFormatException
  }
  
  private static Pair<Integer, Integer> f(String paramString, String[] paramArrayOfString) {
    StringBuilder stringBuilder1;
    StringBuilder stringBuilder2;
    if (paramArrayOfString.length < 2) {
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Ignoring malformed AVC codec string: ");
      stringBuilder2.append(paramString);
      o.f("MediaCodecUtil", stringBuilder2.toString());
      return null;
    } 
    try {
      int j;
      if (stringBuilder2[1].length() == 6) {
        i = Integer.parseInt(stringBuilder2[1].substring(0, 2), 16);
        j = Integer.parseInt(stringBuilder2[1].substring(4), 16);
      } else if (stringBuilder2.length >= 3) {
        i = Integer.parseInt((String)stringBuilder2[1]);
        j = Integer.parseInt((String)stringBuilder2[2]);
      } else {
        stringBuilder2 = new StringBuilder();
        this();
        stringBuilder2.append("Ignoring malformed AVC codec string: ");
        stringBuilder2.append(paramString);
        o.f("MediaCodecUtil", stringBuilder2.toString());
        return null;
      } 
      int k = c.get(i, -1);
      if (k == -1) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Unknown AVC profile: ");
        stringBuilder1.append(i);
        o.f("MediaCodecUtil", stringBuilder1.toString());
        return null;
      } 
      int i = d.get(j, -1);
      if (i == -1) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Unknown AVC level: ");
        stringBuilder1.append(j);
        o.f("MediaCodecUtil", stringBuilder1.toString());
        return null;
      } 
      return new Pair(Integer.valueOf(k), Integer.valueOf(i));
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring malformed AVC codec string: ");
      stringBuilder.append((String)stringBuilder1);
      o.f("MediaCodecUtil", stringBuilder.toString());
      return null;
    } 
  }
  
  private static String g(MediaCodecInfo paramMediaCodecInfo, String paramString1, boolean paramBoolean, String paramString2) {
    if (!q(paramMediaCodecInfo, paramString1, paramBoolean, paramString2))
      return null; 
    for (String str : paramMediaCodecInfo.getSupportedTypes()) {
      if (str.equalsIgnoreCase(paramString2))
        return str; 
    } 
    if (paramString2.equals("video/dolby-vision")) {
      if ("OMX.MS.HEVCDV.Decoder".equals(paramString1))
        return "video/hevcdv"; 
      if ("OMX.RTK.video.decoder".equals(paramString1) || "OMX.realtek.video.decoder.tunneled".equals(paramString1))
        return "video/dv_hevc"; 
    } else {
      if (paramString2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(paramString1))
        return "audio/x-lg-alac"; 
      if (paramString2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(paramString1))
        return "audio/x-lg-flac"; 
    } 
    return null;
  }
  
  public static Pair<Integer, Integer> h(Format paramFormat) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : Ljava/lang/String;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_1
    //   12: ldc_w '\.'
    //   15: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   18: astore_2
    //   19: ldc_w 'video/dolby-vision'
    //   22: aload_0
    //   23: getfield j : Ljava/lang/String;
    //   26: invokevirtual equals : (Ljava/lang/Object;)Z
    //   29: ifeq -> 41
    //   32: aload_0
    //   33: getfield g : Ljava/lang/String;
    //   36: aload_2
    //   37: invokestatic m : (Ljava/lang/String;[Ljava/lang/String;)Landroid/util/Pair;
    //   40: areturn
    //   41: iconst_0
    //   42: istore_3
    //   43: aload_2
    //   44: iconst_0
    //   45: aaload
    //   46: astore_1
    //   47: aload_1
    //   48: invokevirtual hashCode : ()I
    //   51: pop
    //   52: aload_1
    //   53: invokevirtual hashCode : ()I
    //   56: lookupswitch default -> 124, 3004662 -> 238, 3006243 -> 220, 3006244 -> 202, 3199032 -> 184, 3214780 -> 166, 3356560 -> 148, 3624515 -> 129
    //   124: iconst_m1
    //   125: istore_3
    //   126: goto -> 251
    //   129: aload_1
    //   130: ldc_w 'vp09'
    //   133: invokevirtual equals : (Ljava/lang/Object;)Z
    //   136: ifne -> 142
    //   139: goto -> 124
    //   142: bipush #6
    //   144: istore_3
    //   145: goto -> 251
    //   148: aload_1
    //   149: ldc_w 'mp4a'
    //   152: invokevirtual equals : (Ljava/lang/Object;)Z
    //   155: ifne -> 161
    //   158: goto -> 124
    //   161: iconst_5
    //   162: istore_3
    //   163: goto -> 251
    //   166: aload_1
    //   167: ldc_w 'hvc1'
    //   170: invokevirtual equals : (Ljava/lang/Object;)Z
    //   173: ifne -> 179
    //   176: goto -> 124
    //   179: iconst_4
    //   180: istore_3
    //   181: goto -> 251
    //   184: aload_1
    //   185: ldc_w 'hev1'
    //   188: invokevirtual equals : (Ljava/lang/Object;)Z
    //   191: ifne -> 197
    //   194: goto -> 124
    //   197: iconst_3
    //   198: istore_3
    //   199: goto -> 251
    //   202: aload_1
    //   203: ldc_w 'avc2'
    //   206: invokevirtual equals : (Ljava/lang/Object;)Z
    //   209: ifne -> 215
    //   212: goto -> 124
    //   215: iconst_2
    //   216: istore_3
    //   217: goto -> 251
    //   220: aload_1
    //   221: ldc_w 'avc1'
    //   224: invokevirtual equals : (Ljava/lang/Object;)Z
    //   227: ifne -> 233
    //   230: goto -> 124
    //   233: iconst_1
    //   234: istore_3
    //   235: goto -> 251
    //   238: aload_1
    //   239: ldc_w 'av01'
    //   242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   245: ifne -> 251
    //   248: goto -> 124
    //   251: iload_3
    //   252: tableswitch default -> 296, 0 -> 334, 1 -> 325, 2 -> 325, 3 -> 316, 4 -> 316, 5 -> 307, 6 -> 298
    //   296: aconst_null
    //   297: areturn
    //   298: aload_0
    //   299: getfield g : Ljava/lang/String;
    //   302: aload_2
    //   303: invokestatic p : (Ljava/lang/String;[Ljava/lang/String;)Landroid/util/Pair;
    //   306: areturn
    //   307: aload_0
    //   308: getfield g : Ljava/lang/String;
    //   311: aload_2
    //   312: invokestatic d : (Ljava/lang/String;[Ljava/lang/String;)Landroid/util/Pair;
    //   315: areturn
    //   316: aload_0
    //   317: getfield g : Ljava/lang/String;
    //   320: aload_2
    //   321: invokestatic n : (Ljava/lang/String;[Ljava/lang/String;)Landroid/util/Pair;
    //   324: areturn
    //   325: aload_0
    //   326: getfield g : Ljava/lang/String;
    //   329: aload_2
    //   330: invokestatic f : (Ljava/lang/String;[Ljava/lang/String;)Landroid/util/Pair;
    //   333: areturn
    //   334: aload_0
    //   335: getfield g : Ljava/lang/String;
    //   338: aload_2
    //   339: aload_0
    //   340: getfield v : Lcom/google/android/exoplayer2/video/ColorInfo;
    //   343: invokestatic e : (Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/exoplayer2/video/ColorInfo;)Landroid/util/Pair;
    //   346: areturn
  }
  
  public static e i(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    e e;
    List<e> list = j(paramString, paramBoolean1, paramBoolean2);
    if (list.isEmpty()) {
      list = null;
    } else {
      e = list.get(0);
    } 
    return e;
  }
  
  public static List<e> j(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: ldc com/google/android/exoplayer2/mediacodec/MediaCodecUtil
    //   2: monitorenter
    //   3: new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$b
    //   6: astore_3
    //   7: aload_3
    //   8: aload_0
    //   9: iload_1
    //   10: iload_2
    //   11: invokespecial <init> : (Ljava/lang/String;ZZ)V
    //   14: getstatic com/google/android/exoplayer2/mediacodec/MediaCodecUtil.b : Ljava/util/HashMap;
    //   17: astore #4
    //   19: aload #4
    //   21: aload_3
    //   22: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   25: checkcast java/util/List
    //   28: astore #5
    //   30: aload #5
    //   32: ifnull -> 41
    //   35: ldc com/google/android/exoplayer2/mediacodec/MediaCodecUtil
    //   37: monitorexit
    //   38: aload #5
    //   40: areturn
    //   41: getstatic com/google/android/exoplayer2/util/h0.a : I
    //   44: istore #6
    //   46: iload #6
    //   48: bipush #21
    //   50: if_icmplt -> 68
    //   53: new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$e
    //   56: astore #5
    //   58: aload #5
    //   60: iload_1
    //   61: iload_2
    //   62: invokespecial <init> : (ZZ)V
    //   65: goto -> 78
    //   68: new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$d
    //   71: dup
    //   72: aconst_null
    //   73: invokespecial <init> : (Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$a;)V
    //   76: astore #5
    //   78: aload_3
    //   79: aload #5
    //   81: invokestatic k : (Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$b;Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$c;)Ljava/util/ArrayList;
    //   84: astore #7
    //   86: aload #7
    //   88: astore #5
    //   90: iload_1
    //   91: ifeq -> 227
    //   94: aload #7
    //   96: astore #5
    //   98: aload #7
    //   100: invokevirtual isEmpty : ()Z
    //   103: ifeq -> 227
    //   106: aload #7
    //   108: astore #5
    //   110: bipush #21
    //   112: iload #6
    //   114: if_icmpgt -> 227
    //   117: aload #7
    //   119: astore #5
    //   121: iload #6
    //   123: bipush #23
    //   125: if_icmpgt -> 227
    //   128: new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$d
    //   131: astore #5
    //   133: aload #5
    //   135: aconst_null
    //   136: invokespecial <init> : (Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$a;)V
    //   139: aload_3
    //   140: aload #5
    //   142: invokestatic k : (Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$b;Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$c;)Ljava/util/ArrayList;
    //   145: astore #7
    //   147: aload #7
    //   149: astore #5
    //   151: aload #7
    //   153: invokevirtual isEmpty : ()Z
    //   156: ifne -> 227
    //   159: new java/lang/StringBuilder
    //   162: astore #5
    //   164: aload #5
    //   166: invokespecial <init> : ()V
    //   169: aload #5
    //   171: ldc_w 'MediaCodecList API didn't list secure decoder for: '
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: aload #5
    //   180: aload_0
    //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: pop
    //   185: aload #5
    //   187: ldc_w '. Assuming: '
    //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: pop
    //   194: aload #5
    //   196: aload #7
    //   198: iconst_0
    //   199: invokevirtual get : (I)Ljava/lang/Object;
    //   202: checkcast com/google/android/exoplayer2/mediacodec/e
    //   205: getfield a : Ljava/lang/String;
    //   208: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   211: pop
    //   212: ldc_w 'MediaCodecUtil'
    //   215: aload #5
    //   217: invokevirtual toString : ()Ljava/lang/String;
    //   220: invokestatic f : (Ljava/lang/String;Ljava/lang/String;)V
    //   223: aload #7
    //   225: astore #5
    //   227: aload_0
    //   228: aload #5
    //   230: invokestatic a : (Ljava/lang/String;Ljava/util/List;)V
    //   233: aload #5
    //   235: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   238: astore_0
    //   239: aload #4
    //   241: aload_3
    //   242: aload_0
    //   243: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   246: pop
    //   247: ldc com/google/android/exoplayer2/mediacodec/MediaCodecUtil
    //   249: monitorexit
    //   250: aload_0
    //   251: areturn
    //   252: astore_0
    //   253: ldc com/google/android/exoplayer2/mediacodec/MediaCodecUtil
    //   255: monitorexit
    //   256: aload_0
    //   257: athrow
    // Exception table:
    //   from	to	target	type
    //   3	30	252	finally
    //   41	46	252	finally
    //   53	65	252	finally
    //   68	78	252	finally
    //   78	86	252	finally
    //   98	106	252	finally
    //   128	147	252	finally
    //   151	223	252	finally
    //   227	247	252	finally
  }
  
  private static ArrayList<e> k(b paramb, c paramc) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial <init> : ()V
    //   8: aload_0
    //   9: getfield a : Ljava/lang/String;
    //   12: astore_3
    //   13: aload_1
    //   14: invokeinterface b : ()I
    //   19: istore #4
    //   21: aload_1
    //   22: invokeinterface e : ()Z
    //   27: istore #5
    //   29: iconst_0
    //   30: istore #6
    //   32: aload_0
    //   33: astore #7
    //   35: iload #6
    //   37: iload #4
    //   39: if_icmpge -> 549
    //   42: aload_1
    //   43: iload #6
    //   45: invokeinterface a : (I)Landroid/media/MediaCodecInfo;
    //   50: astore #8
    //   52: aload #8
    //   54: invokevirtual getName : ()Ljava/lang/String;
    //   57: astore #9
    //   59: aload #8
    //   61: aload #9
    //   63: iload #5
    //   65: aload_3
    //   66: invokestatic g : (Landroid/media/MediaCodecInfo;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;
    //   69: astore #10
    //   71: aload #10
    //   73: ifnonnull -> 79
    //   76: goto -> 484
    //   79: aload #8
    //   81: aload #10
    //   83: invokevirtual getCapabilitiesForType : (Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   86: astore #11
    //   88: aload_1
    //   89: ldc_w 'tunneled-playback'
    //   92: aload #10
    //   94: aload #11
    //   96: invokeinterface c : (Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    //   101: istore #12
    //   103: aload_1
    //   104: ldc_w 'tunneled-playback'
    //   107: aload #10
    //   109: aload #11
    //   111: invokeinterface d : (Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    //   116: istore #13
    //   118: aload #7
    //   120: getfield c : Z
    //   123: istore #14
    //   125: iload #14
    //   127: ifne -> 135
    //   130: iload #13
    //   132: ifne -> 76
    //   135: iload #14
    //   137: ifeq -> 148
    //   140: iload #12
    //   142: ifne -> 148
    //   145: goto -> 76
    //   148: aload_1
    //   149: ldc_w 'secure-playback'
    //   152: aload #10
    //   154: aload #11
    //   156: invokeinterface c : (Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    //   161: istore #14
    //   163: aload_1
    //   164: ldc_w 'secure-playback'
    //   167: aload #10
    //   169: aload #11
    //   171: invokeinterface d : (Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    //   176: istore #12
    //   178: aload #7
    //   180: getfield b : Z
    //   183: istore #13
    //   185: iload #13
    //   187: ifne -> 195
    //   190: iload #12
    //   192: ifne -> 76
    //   195: iload #13
    //   197: ifeq -> 208
    //   200: iload #14
    //   202: ifne -> 208
    //   205: goto -> 76
    //   208: aload #8
    //   210: invokestatic r : (Landroid/media/MediaCodecInfo;)Z
    //   213: istore #15
    //   215: aload #8
    //   217: invokestatic t : (Landroid/media/MediaCodecInfo;)Z
    //   220: istore #13
    //   222: aload #8
    //   224: invokestatic v : (Landroid/media/MediaCodecInfo;)Z
    //   227: istore #16
    //   229: aload #9
    //   231: invokestatic c : (Ljava/lang/String;)Z
    //   234: istore #12
    //   236: iload #5
    //   238: ifeq -> 255
    //   241: aload #7
    //   243: getfield b : Z
    //   246: istore #17
    //   248: iload #17
    //   250: iload #14
    //   252: if_icmpeq -> 272
    //   255: iload #5
    //   257: ifne -> 325
    //   260: aload #7
    //   262: getfield b : Z
    //   265: istore #17
    //   267: iload #17
    //   269: ifne -> 325
    //   272: aload_2
    //   273: aload #9
    //   275: aload_3
    //   276: aload #10
    //   278: aload #11
    //   280: iload #15
    //   282: iload #13
    //   284: iload #16
    //   286: iload #12
    //   288: iconst_0
    //   289: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/exoplayer2/mediacodec/e;
    //   292: invokevirtual add : (Ljava/lang/Object;)Z
    //   295: pop
    //   296: goto -> 484
    //   299: astore #11
    //   301: aload #9
    //   303: astore #7
    //   305: aload #11
    //   307: astore #9
    //   309: goto -> 418
    //   312: astore #11
    //   314: aload #9
    //   316: astore #7
    //   318: aload #11
    //   320: astore #9
    //   322: goto -> 418
    //   325: aload #9
    //   327: astore #7
    //   329: iload #5
    //   331: ifne -> 484
    //   334: iload #14
    //   336: ifeq -> 484
    //   339: new java/lang/StringBuilder
    //   342: dup
    //   343: invokespecial <init> : ()V
    //   346: astore #8
    //   348: aload #8
    //   350: aload #7
    //   352: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   355: pop
    //   356: aload #8
    //   358: ldc_w '.secure'
    //   361: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: pop
    //   365: aload #8
    //   367: invokevirtual toString : ()Ljava/lang/String;
    //   370: astore #9
    //   372: aload_2
    //   373: aload #9
    //   375: aload_3
    //   376: aload #10
    //   378: aload #11
    //   380: iload #15
    //   382: iload #13
    //   384: iload #16
    //   386: iload #12
    //   388: iconst_1
    //   389: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/exoplayer2/mediacodec/e;
    //   392: invokevirtual add : (Ljava/lang/Object;)Z
    //   395: pop
    //   396: aload_2
    //   397: areturn
    //   398: astore #9
    //   400: goto -> 418
    //   403: astore #9
    //   405: goto -> 418
    //   408: astore #11
    //   410: aload #9
    //   412: astore #7
    //   414: aload #11
    //   416: astore #9
    //   418: getstatic com/google/android/exoplayer2/util/h0.a : I
    //   421: istore #18
    //   423: iload #18
    //   425: bipush #23
    //   427: if_icmpgt -> 490
    //   430: aload_2
    //   431: invokevirtual isEmpty : ()Z
    //   434: ifne -> 490
    //   437: new java/lang/StringBuilder
    //   440: astore #9
    //   442: aload #9
    //   444: invokespecial <init> : ()V
    //   447: aload #9
    //   449: ldc_w 'Skipping codec '
    //   452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   455: pop
    //   456: aload #9
    //   458: aload #7
    //   460: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: pop
    //   464: aload #9
    //   466: ldc_w ' (failed to query capabilities)'
    //   469: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   472: pop
    //   473: ldc_w 'MediaCodecUtil'
    //   476: aload #9
    //   478: invokevirtual toString : ()Ljava/lang/String;
    //   481: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)V
    //   484: iinc #6, 1
    //   487: goto -> 32
    //   490: new java/lang/StringBuilder
    //   493: astore_0
    //   494: aload_0
    //   495: invokespecial <init> : ()V
    //   498: aload_0
    //   499: ldc_w 'Failed to query codec '
    //   502: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   505: pop
    //   506: aload_0
    //   507: aload #7
    //   509: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   512: pop
    //   513: aload_0
    //   514: ldc_w ' ('
    //   517: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   520: pop
    //   521: aload_0
    //   522: aload #10
    //   524: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   527: pop
    //   528: aload_0
    //   529: ldc_w ')'
    //   532: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   535: pop
    //   536: ldc_w 'MediaCodecUtil'
    //   539: aload_0
    //   540: invokevirtual toString : ()Ljava/lang/String;
    //   543: invokestatic c : (Ljava/lang/String;Ljava/lang/String;)V
    //   546: aload #9
    //   548: athrow
    //   549: aload_2
    //   550: areturn
    //   551: astore_0
    //   552: new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$DecoderQueryException
    //   555: dup
    //   556: aload_0
    //   557: aconst_null
    //   558: invokespecial <init> : (Ljava/lang/Throwable;Lcom/google/android/exoplayer2/mediacodec/MediaCodecUtil$a;)V
    //   561: astore_0
    //   562: goto -> 567
    //   565: aload_0
    //   566: athrow
    //   567: goto -> 565
    // Exception table:
    //   from	to	target	type
    //   0	29	551	java/lang/Exception
    //   42	71	551	java/lang/Exception
    //   79	125	408	java/lang/Exception
    //   148	185	408	java/lang/Exception
    //   208	236	408	java/lang/Exception
    //   241	248	408	java/lang/Exception
    //   260	267	312	java/lang/Exception
    //   272	296	299	java/lang/Exception
    //   339	348	299	java/lang/Exception
    //   348	372	403	java/lang/Exception
    //   372	396	398	java/lang/Exception
    //   418	423	551	java/lang/Exception
    //   430	484	551	java/lang/Exception
    //   490	549	551	java/lang/Exception
  }
  
  public static List<e> l(List<e> paramList, Format paramFormat) {
    paramList = new ArrayList<e>(paramList);
    C(paramList, new c(paramFormat));
    return paramList;
  }
  
  private static Pair<Integer, Integer> m(String paramString, String[] paramArrayOfString) {
    StringBuilder stringBuilder1;
    if (paramArrayOfString.length < 3) {
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Ignoring malformed Dolby Vision codec string: ");
      stringBuilder2.append(paramString);
      o.f("MediaCodecUtil", stringBuilder2.toString());
      return null;
    } 
    Matcher matcher = a.matcher(stringBuilder2[1]);
    if (!matcher.matches()) {
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Ignoring malformed Dolby Vision codec string: ");
      stringBuilder2.append(paramString);
      o.f("MediaCodecUtil", stringBuilder2.toString());
      return null;
    } 
    String str = matcher.group(1);
    Integer integer1 = h.get(str);
    if (integer1 == null) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unknown Dolby Vision profile string: ");
      stringBuilder1.append(str);
      o.f("MediaCodecUtil", stringBuilder1.toString());
      return null;
    } 
    StringBuilder stringBuilder2 = stringBuilder2[2];
    Integer integer2 = i.get(stringBuilder2);
    if (integer2 == null) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unknown Dolby Vision level string: ");
      stringBuilder1.append((String)stringBuilder2);
      o.f("MediaCodecUtil", stringBuilder1.toString());
      return null;
    } 
    return new Pair(stringBuilder1, integer2);
  }
  
  private static Pair<Integer, Integer> n(String paramString, String[] paramArrayOfString) {
    StringBuilder stringBuilder3;
    StringBuilder stringBuilder2;
    if (paramArrayOfString.length < 4) {
      stringBuilder3 = new StringBuilder();
      stringBuilder3.append("Ignoring malformed HEVC codec string: ");
      stringBuilder3.append(paramString);
      o.f("MediaCodecUtil", stringBuilder3.toString());
      return null;
    } 
    Pattern pattern = a;
    byte b = 1;
    Matcher matcher = pattern.matcher(stringBuilder3[1]);
    if (!matcher.matches()) {
      stringBuilder3 = new StringBuilder();
      stringBuilder3.append("Ignoring malformed HEVC codec string: ");
      stringBuilder3.append(paramString);
      o.f("MediaCodecUtil", stringBuilder3.toString());
      return null;
    } 
    paramString = matcher.group(1);
    if (!"1".equals(paramString))
      if ("2".equals(paramString)) {
        b = 2;
      } else {
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Unknown HEVC profile string: ");
        stringBuilder3.append(paramString);
        o.f("MediaCodecUtil", stringBuilder3.toString());
        return null;
      }  
    StringBuilder stringBuilder1 = stringBuilder3[3];
    Integer integer = g.get(stringBuilder1);
    if (integer == null) {
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Unknown HEVC level string: ");
      stringBuilder2.append((String)stringBuilder1);
      o.f("MediaCodecUtil", stringBuilder2.toString());
      return null;
    } 
    return new Pair(Integer.valueOf(b), stringBuilder2);
  }
  
  public static e o() {
    e e = i("audio/raw", false, false);
    if (e == null) {
      e = null;
    } else {
      e = e.x(e.a);
    } 
    return e;
  }
  
  private static Pair<Integer, Integer> p(String paramString, String[] paramArrayOfString) {
    StringBuilder stringBuilder1;
    StringBuilder stringBuilder2;
    if (paramArrayOfString.length < 3) {
      stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Ignoring malformed VP9 codec string: ");
      stringBuilder2.append(paramString);
      o.f("MediaCodecUtil", stringBuilder2.toString());
      return null;
    } 
    try {
      int i = Integer.parseInt((String)stringBuilder2[1]);
      int j = Integer.parseInt((String)stringBuilder2[2]);
      int k = e.get(i, -1);
      if (k == -1) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Unknown VP9 profile: ");
        stringBuilder1.append(i);
        o.f("MediaCodecUtil", stringBuilder1.toString());
        return null;
      } 
      i = f.get(j, -1);
      if (i == -1) {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Unknown VP9 level: ");
        stringBuilder1.append(j);
        o.f("MediaCodecUtil", stringBuilder1.toString());
        return null;
      } 
      return new Pair(Integer.valueOf(k), Integer.valueOf(i));
    } catch (NumberFormatException numberFormatException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Ignoring malformed VP9 codec string: ");
      stringBuilder.append((String)stringBuilder1);
      o.f("MediaCodecUtil", stringBuilder.toString());
      return null;
    } 
  }
  
  private static boolean q(MediaCodecInfo paramMediaCodecInfo, String paramString1, boolean paramBoolean, String paramString2) {
    if (paramMediaCodecInfo.isEncoder() || (!paramBoolean && paramString1.endsWith(".secure")))
      return false; 
    int i = h0.a;
    if (i < 21 && ("CIPAACDecoder".equals(paramString1) || "CIPMP3Decoder".equals(paramString1) || "CIPVorbisDecoder".equals(paramString1) || "CIPAMRNBDecoder".equals(paramString1) || "AACDecoder".equals(paramString1) || "MP3Decoder".equals(paramString1)))
      return false; 
    if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(paramString1)) {
      String str = h0.b;
      if ("a70".equals(str) || ("Xiaomi".equals(h0.c) && str.startsWith("HM")))
        return false; 
    } 
    if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(paramString1)) {
      String str = h0.b;
      if ("dlxu".equals(str) || "protou".equals(str) || "ville".equals(str) || "villeplus".equals(str) || "villec2".equals(str) || str.startsWith("gee") || "C6602".equals(str) || "C6603".equals(str) || "C6606".equals(str) || "C6616".equals(str) || "L36h".equals(str) || "SO-02E".equals(str))
        return false; 
    } 
    if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(paramString1)) {
      String str = h0.b;
      if ("C1504".equals(str) || "C1505".equals(str) || "C1604".equals(str) || "C1605".equals(str))
        return false; 
    } 
    if (i < 24 && ("OMX.SEC.aac.dec".equals(paramString1) || "OMX.Exynos.AAC.Decoder".equals(paramString1)) && "samsung".equals(h0.c)) {
      String str = h0.b;
      if (str.startsWith("zeroflte") || str.startsWith("zerolte") || str.startsWith("zenlte") || "SC-05G".equals(str) || "marinelteatt".equals(str) || "404SC".equals(str) || "SC-04G".equals(str) || "SCV31".equals(str))
        return false; 
    } 
    if (i <= 19 && "OMX.SEC.vp8.dec".equals(paramString1) && "samsung".equals(h0.c)) {
      String str = h0.b;
      if (str.startsWith("d2") || str.startsWith("serrano") || str.startsWith("jflte") || str.startsWith("santos") || str.startsWith("t0"))
        return false; 
    } 
    return (i <= 19 && h0.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(paramString1)) ? false : (!("audio/eac3-joc".equals(paramString2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(paramString1)));
  }
  
  private static boolean r(MediaCodecInfo paramMediaCodecInfo) {
    return (h0.a >= 29) ? s(paramMediaCodecInfo) : (t(paramMediaCodecInfo) ^ true);
  }
  
  @TargetApi(29)
  private static boolean s(MediaCodecInfo paramMediaCodecInfo) {
    return paramMediaCodecInfo.isHardwareAccelerated();
  }
  
  private static boolean t(MediaCodecInfo paramMediaCodecInfo) {
    if (h0.a >= 29)
      return u(paramMediaCodecInfo); 
    String str = h0.u0(paramMediaCodecInfo.getName());
    null = str.startsWith("arc.");
    boolean bool = false;
    if (null)
      return false; 
    if (!str.startsWith("omx.google.") && !str.startsWith("omx.ffmpeg.") && (!str.startsWith("omx.sec.") || !str.contains(".sw.")) && !str.equals("omx.qcom.video.decoder.hevcswvdec") && !str.startsWith("c2.android.") && !str.startsWith("c2.google.")) {
      null = bool;
      if (!str.startsWith("omx.")) {
        null = bool;
        if (!str.startsWith("c2."))
          return true; 
      } 
      return null;
    } 
    return true;
  }
  
  @TargetApi(29)
  private static boolean u(MediaCodecInfo paramMediaCodecInfo) {
    return paramMediaCodecInfo.isSoftwareOnly();
  }
  
  private static boolean v(MediaCodecInfo paramMediaCodecInfo) {
    boolean bool;
    if (h0.a >= 29)
      return w(paramMediaCodecInfo); 
    String str = h0.u0(paramMediaCodecInfo.getName());
    if (!str.startsWith("omx.google.") && !str.startsWith("c2.android.") && !str.startsWith("c2.google.")) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @TargetApi(29)
  private static boolean w(MediaCodecInfo paramMediaCodecInfo) {
    return paramMediaCodecInfo.isVendor();
  }
  
  public static class DecoderQueryException extends Exception {
    private DecoderQueryException(Throwable param1Throwable) {
      super("Failed to query underlying media codecs", param1Throwable);
    }
  }
  
  private static final class b {
    public final String a;
    
    public final boolean b;
    
    public final boolean c;
    
    public b(String param1String, boolean param1Boolean1, boolean param1Boolean2) {
      this.a = param1String;
      this.b = param1Boolean1;
      this.c = param1Boolean2;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || param1Object.getClass() != b.class)
        return false; 
      param1Object = param1Object;
      if (!TextUtils.equals(this.a, ((b)param1Object).a) || this.b != ((b)param1Object).b || this.c != ((b)param1Object).c)
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      char c2;
      int i = this.a.hashCode();
      boolean bool = this.b;
      char c1 = 'ӏ';
      if (bool) {
        c2 = 'ӏ';
      } else {
        c2 = 'ӕ';
      } 
      if (!this.c)
        c1 = 'ӕ'; 
      return ((i + 31) * 31 + c2) * 31 + c1;
    }
  }
  
  private static interface c {
    MediaCodecInfo a(int param1Int);
    
    int b();
    
    boolean c(String param1String1, String param1String2, MediaCodecInfo.CodecCapabilities param1CodecCapabilities);
    
    boolean d(String param1String1, String param1String2, MediaCodecInfo.CodecCapabilities param1CodecCapabilities);
    
    boolean e();
  }
  
  private static final class d implements c {
    private d() {}
    
    public MediaCodecInfo a(int param1Int) {
      return MediaCodecList.getCodecInfoAt(param1Int);
    }
    
    public int b() {
      return MediaCodecList.getCodecCount();
    }
    
    public boolean c(String param1String1, String param1String2, MediaCodecInfo.CodecCapabilities param1CodecCapabilities) {
      boolean bool;
      if ("secure-playback".equals(param1String1) && "video/avc".equals(param1String2)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public boolean d(String param1String1, String param1String2, MediaCodecInfo.CodecCapabilities param1CodecCapabilities) {
      return false;
    }
    
    public boolean e() {
      return false;
    }
  }
  
  @TargetApi(21)
  private static final class e implements c {
    private final int a;
    
    private MediaCodecInfo[] b;
    
    public e(boolean param1Boolean1, boolean param1Boolean2) {
      boolean bool;
      if (param1Boolean1 || param1Boolean2) {
        bool = true;
      } else {
        bool = false;
      } 
      this.a = bool;
    }
    
    @EnsuresNonNull({"mediaCodecInfos"})
    private void f() {
      if (this.b == null)
        this.b = (new MediaCodecList(this.a)).getCodecInfos(); 
    }
    
    public MediaCodecInfo a(int param1Int) {
      f();
      return this.b[param1Int];
    }
    
    public int b() {
      f();
      return this.b.length;
    }
    
    public boolean c(String param1String1, String param1String2, MediaCodecInfo.CodecCapabilities param1CodecCapabilities) {
      return param1CodecCapabilities.isFeatureSupported(param1String1);
    }
    
    public boolean d(String param1String1, String param1String2, MediaCodecInfo.CodecCapabilities param1CodecCapabilities) {
      return param1CodecCapabilities.isFeatureRequired(param1String1);
    }
    
    public boolean e() {
      return true;
    }
  }
  
  private static interface f<T> {
    int a(T param1T);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/mediacodec/MediaCodecUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */