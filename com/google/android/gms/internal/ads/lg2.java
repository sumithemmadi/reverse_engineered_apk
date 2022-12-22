package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class lg2 {
  private static final jg2 a = jg2.f("OMX.google.raw.decoder");
  
  private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
  
  private static final HashMap<a, List<jg2>> c = new HashMap<a, List<jg2>>();
  
  private static final SparseIntArray d;
  
  private static final SparseIntArray e;
  
  private static final Map<String, Integer> f;
  
  private static int g = -1;
  
  static {
    SparseIntArray sparseIntArray = new SparseIntArray();
    d = sparseIntArray;
    sparseIntArray.put(66, 1);
    sparseIntArray.put(77, 2);
    sparseIntArray.put(88, 4);
    sparseIntArray.put(100, 8);
    sparseIntArray = new SparseIntArray();
    e = sparseIntArray;
    sparseIntArray.put(10, 1);
    sparseIntArray.put(11, 4);
    sparseIntArray.put(12, 8);
    sparseIntArray.put(13, 16);
    sparseIntArray.put(20, 32);
    sparseIntArray.put(21, 64);
    sparseIntArray.put(22, 128);
    sparseIntArray.put(30, 256);
    sparseIntArray.put(31, 512);
    sparseIntArray.put(32, 1024);
    sparseIntArray.put(40, 2048);
    sparseIntArray.put(41, 4096);
    sparseIntArray.put(42, 8192);
    sparseIntArray.put(50, 16384);
    sparseIntArray.put(51, 32768);
    sparseIntArray.put(52, 65536);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    f = (Map)hashMap;
    hashMap.put("L30", Integer.valueOf(1));
    hashMap.put("L60", Integer.valueOf(4));
    hashMap.put("L63", Integer.valueOf(16));
    hashMap.put("L90", Integer.valueOf(64));
    hashMap.put("L93", Integer.valueOf(256));
    hashMap.put("L120", Integer.valueOf(1024));
    hashMap.put("L123", Integer.valueOf(4096));
    hashMap.put("L150", Integer.valueOf(16384));
    hashMap.put("L153", Integer.valueOf(65536));
    hashMap.put("L156", Integer.valueOf(262144));
    hashMap.put("L180", Integer.valueOf(1048576));
    hashMap.put("L183", Integer.valueOf(4194304));
    hashMap.put("L186", Integer.valueOf(16777216));
    hashMap.put("H30", Integer.valueOf(2));
    hashMap.put("H60", Integer.valueOf(8));
    hashMap.put("H63", Integer.valueOf(32));
    hashMap.put("H90", Integer.valueOf(128));
    hashMap.put("H93", Integer.valueOf(512));
    hashMap.put("H120", Integer.valueOf(2048));
    hashMap.put("H123", Integer.valueOf(8192));
    hashMap.put("H150", Integer.valueOf(32768));
    hashMap.put("H153", Integer.valueOf(131072));
    hashMap.put("H156", Integer.valueOf(524288));
    hashMap.put("H180", Integer.valueOf(2097152));
    hashMap.put("H183", Integer.valueOf(8388608));
    hashMap.put("H186", Integer.valueOf(33554432));
  }
  
  private static Pair<Integer, Integer> a(String paramString, String[] paramArrayOfString) {
    StringBuilder stringBuilder;
    if (paramArrayOfString.length < 2) {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0) {
        paramString = "Ignoring malformed AVC codec string: ".concat(paramString);
      } else {
        paramString = new String("Ignoring malformed AVC codec string: ");
      } 
      Log.w("MediaCodecUtil", paramString);
      return null;
    } 
    try {
      Integer integer2;
      String str2;
      String str1;
      if (paramArrayOfString[1].length() == 6) {
        Integer integer5 = Integer.valueOf(Integer.parseInt(paramArrayOfString[1].substring(0, 2), 16));
        Integer integer6 = Integer.valueOf(Integer.parseInt(paramArrayOfString[1].substring(4), 16));
        integer2 = integer5;
        Integer integer4 = integer6;
      } else {
        Integer integer;
        if (integer2.length >= 3) {
          int i = Integer.parseInt((String)integer2[1]);
          Integer integer4 = Integer.valueOf(Integer.parseInt((String)integer2[2]));
          integer2 = Integer.valueOf(i);
          integer = integer4;
        } else {
          str2 = String.valueOf(integer);
          if (str2.length() != 0) {
            str2 = "Ignoring malformed AVC codec string: ".concat(str2);
          } else {
            str2 = new String("Ignoring malformed AVC codec string: ");
          } 
          Log.w("MediaCodecUtil", str2);
          return null;
        } 
      } 
      Integer integer3 = Integer.valueOf(d.get(str2.intValue()));
      if (integer3 == null) {
        str2 = String.valueOf(str2);
        stringBuilder = new StringBuilder(str2.length() + 21);
        stringBuilder.append("Unknown AVC profile: ");
        stringBuilder.append(str2);
        Log.w("MediaCodecUtil", stringBuilder.toString());
        return null;
      } 
      Integer integer1 = Integer.valueOf(e.get(stringBuilder.intValue()));
      if (integer1 == null) {
        str1 = String.valueOf(stringBuilder);
        stringBuilder = new StringBuilder(str1.length() + 19);
        stringBuilder.append("Unknown AVC level: ");
        stringBuilder.append(str1);
        Log.w("MediaCodecUtil", stringBuilder.toString());
        return null;
      } 
      return new Pair(integer3, str1);
    } catch (NumberFormatException numberFormatException) {
      String str = String.valueOf(stringBuilder);
      if (str.length() != 0) {
        str = "Ignoring malformed AVC codec string: ".concat(str);
      } else {
        str = new String("Ignoring malformed AVC codec string: ");
      } 
      Log.w("MediaCodecUtil", str);
      return null;
    } 
  }
  
  private static List<jg2> b(a parama, pg2 parampg2) {
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
    //   22: invokeinterface c : ()Z
    //   27: istore #5
    //   29: iconst_0
    //   30: istore #6
    //   32: iload #6
    //   34: iload #4
    //   36: if_icmpge -> 1032
    //   39: aload_1
    //   40: iload #6
    //   42: invokeinterface a : (I)Landroid/media/MediaCodecInfo;
    //   47: astore #7
    //   49: aload #7
    //   51: invokevirtual getName : ()Ljava/lang/String;
    //   54: astore #8
    //   56: aload #7
    //   58: invokevirtual isEncoder : ()Z
    //   61: istore #9
    //   63: iload #9
    //   65: ifne -> 585
    //   68: iload #5
    //   70: ifne -> 86
    //   73: aload #8
    //   75: ldc '.secure'
    //   77: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   80: ifeq -> 86
    //   83: goto -> 585
    //   86: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   89: istore #10
    //   91: iload #10
    //   93: bipush #21
    //   95: if_icmpge -> 167
    //   98: ldc_w 'CIPAACDecoder'
    //   101: aload #8
    //   103: invokevirtual equals : (Ljava/lang/Object;)Z
    //   106: ifne -> 585
    //   109: ldc_w 'CIPMP3Decoder'
    //   112: aload #8
    //   114: invokevirtual equals : (Ljava/lang/Object;)Z
    //   117: ifne -> 585
    //   120: ldc_w 'CIPVorbisDecoder'
    //   123: aload #8
    //   125: invokevirtual equals : (Ljava/lang/Object;)Z
    //   128: ifne -> 585
    //   131: ldc_w 'CIPAMRNBDecoder'
    //   134: aload #8
    //   136: invokevirtual equals : (Ljava/lang/Object;)Z
    //   139: ifne -> 585
    //   142: ldc_w 'AACDecoder'
    //   145: aload #8
    //   147: invokevirtual equals : (Ljava/lang/Object;)Z
    //   150: ifne -> 585
    //   153: ldc_w 'MP3Decoder'
    //   156: aload #8
    //   158: invokevirtual equals : (Ljava/lang/Object;)Z
    //   161: ifeq -> 167
    //   164: goto -> 585
    //   167: iload #10
    //   169: bipush #18
    //   171: if_icmpge -> 188
    //   174: ldc_w 'OMX.SEC.MP3.Decoder'
    //   177: aload #8
    //   179: invokevirtual equals : (Ljava/lang/Object;)Z
    //   182: ifeq -> 188
    //   185: goto -> 585
    //   188: iload #10
    //   190: bipush #18
    //   192: if_icmpge -> 221
    //   195: ldc_w 'OMX.MTK.AUDIO.DECODER.AAC'
    //   198: aload #8
    //   200: invokevirtual equals : (Ljava/lang/Object;)Z
    //   203: ifeq -> 221
    //   206: ldc_w 'a70'
    //   209: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   212: invokevirtual equals : (Ljava/lang/Object;)Z
    //   215: ifeq -> 221
    //   218: goto -> 585
    //   221: iload #10
    //   223: bipush #16
    //   225: if_icmpne -> 379
    //   228: ldc_w 'OMX.qcom.audio.decoder.mp3'
    //   231: aload #8
    //   233: invokevirtual equals : (Ljava/lang/Object;)Z
    //   236: ifeq -> 379
    //   239: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   242: astore #11
    //   244: ldc_w 'dlxu'
    //   247: aload #11
    //   249: invokevirtual equals : (Ljava/lang/Object;)Z
    //   252: ifne -> 585
    //   255: ldc_w 'protou'
    //   258: aload #11
    //   260: invokevirtual equals : (Ljava/lang/Object;)Z
    //   263: ifne -> 585
    //   266: ldc_w 'ville'
    //   269: aload #11
    //   271: invokevirtual equals : (Ljava/lang/Object;)Z
    //   274: ifne -> 585
    //   277: ldc_w 'villeplus'
    //   280: aload #11
    //   282: invokevirtual equals : (Ljava/lang/Object;)Z
    //   285: ifne -> 585
    //   288: ldc_w 'villec2'
    //   291: aload #11
    //   293: invokevirtual equals : (Ljava/lang/Object;)Z
    //   296: ifne -> 585
    //   299: aload #11
    //   301: ldc_w 'gee'
    //   304: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   307: ifne -> 585
    //   310: ldc_w 'C6602'
    //   313: aload #11
    //   315: invokevirtual equals : (Ljava/lang/Object;)Z
    //   318: ifne -> 585
    //   321: ldc_w 'C6603'
    //   324: aload #11
    //   326: invokevirtual equals : (Ljava/lang/Object;)Z
    //   329: ifne -> 585
    //   332: ldc_w 'C6606'
    //   335: aload #11
    //   337: invokevirtual equals : (Ljava/lang/Object;)Z
    //   340: ifne -> 585
    //   343: ldc_w 'C6616'
    //   346: aload #11
    //   348: invokevirtual equals : (Ljava/lang/Object;)Z
    //   351: ifne -> 585
    //   354: ldc_w 'L36h'
    //   357: aload #11
    //   359: invokevirtual equals : (Ljava/lang/Object;)Z
    //   362: ifne -> 585
    //   365: ldc_w 'SO-02E'
    //   368: aload #11
    //   370: invokevirtual equals : (Ljava/lang/Object;)Z
    //   373: ifeq -> 379
    //   376: goto -> 585
    //   379: iload #10
    //   381: bipush #16
    //   383: if_icmpne -> 453
    //   386: ldc_w 'OMX.qcom.audio.decoder.aac'
    //   389: aload #8
    //   391: invokevirtual equals : (Ljava/lang/Object;)Z
    //   394: ifeq -> 453
    //   397: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   400: astore #11
    //   402: ldc_w 'C1504'
    //   405: aload #11
    //   407: invokevirtual equals : (Ljava/lang/Object;)Z
    //   410: ifne -> 585
    //   413: ldc_w 'C1505'
    //   416: aload #11
    //   418: invokevirtual equals : (Ljava/lang/Object;)Z
    //   421: ifne -> 585
    //   424: ldc_w 'C1604'
    //   427: aload #11
    //   429: invokevirtual equals : (Ljava/lang/Object;)Z
    //   432: ifne -> 585
    //   435: ldc_w 'C1605'
    //   438: aload #11
    //   440: invokevirtual equals : (Ljava/lang/Object;)Z
    //   443: istore #9
    //   445: iload #9
    //   447: ifeq -> 453
    //   450: goto -> 585
    //   453: iload #10
    //   455: bipush #19
    //   457: if_icmpgt -> 546
    //   460: ldc_w 'OMX.SEC.vp8.dec'
    //   463: aload #8
    //   465: invokevirtual equals : (Ljava/lang/Object;)Z
    //   468: ifeq -> 546
    //   471: ldc_w 'samsung'
    //   474: getstatic com/google/android/gms/internal/ads/wj2.c : Ljava/lang/String;
    //   477: invokevirtual equals : (Ljava/lang/Object;)Z
    //   480: ifeq -> 546
    //   483: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   486: astore #11
    //   488: aload #11
    //   490: ldc_w 'd2'
    //   493: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   496: ifne -> 585
    //   499: aload #11
    //   501: ldc_w 'serrano'
    //   504: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   507: ifne -> 585
    //   510: aload #11
    //   512: ldc_w 'jflte'
    //   515: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   518: ifne -> 585
    //   521: aload #11
    //   523: ldc_w 'santos'
    //   526: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   529: ifne -> 585
    //   532: aload #11
    //   534: ldc_w 't0'
    //   537: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   540: ifeq -> 546
    //   543: goto -> 585
    //   546: iload #10
    //   548: bipush #19
    //   550: if_icmpgt -> 579
    //   553: getstatic com/google/android/gms/internal/ads/wj2.b : Ljava/lang/String;
    //   556: ldc_w 'jflte'
    //   559: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   562: ifeq -> 579
    //   565: ldc_w 'OMX.qcom.video.decoder.vp8'
    //   568: aload #8
    //   570: invokevirtual equals : (Ljava/lang/Object;)Z
    //   573: ifeq -> 579
    //   576: goto -> 585
    //   579: iconst_1
    //   580: istore #12
    //   582: goto -> 588
    //   585: iconst_0
    //   586: istore #12
    //   588: iload #4
    //   590: istore #10
    //   592: iload #12
    //   594: ifeq -> 1022
    //   597: aload #7
    //   599: invokevirtual getSupportedTypes : ()[Ljava/lang/String;
    //   602: astore #13
    //   604: aload #13
    //   606: arraylength
    //   607: istore #14
    //   609: iconst_0
    //   610: istore #12
    //   612: iload #4
    //   614: istore #10
    //   616: iload #12
    //   618: iload #14
    //   620: if_icmpge -> 1022
    //   623: aload #13
    //   625: iload #12
    //   627: aaload
    //   628: astore #15
    //   630: aload #15
    //   632: aload_3
    //   633: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   636: istore #9
    //   638: iload #9
    //   640: ifeq -> 1016
    //   643: aload #7
    //   645: aload #15
    //   647: invokevirtual getCapabilitiesForType : (Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   650: astore #11
    //   652: aload_1
    //   653: aload_3
    //   654: aload #11
    //   656: invokeinterface d : (Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    //   661: istore #16
    //   663: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   666: istore #10
    //   668: iload #10
    //   670: bipush #22
    //   672: if_icmpgt -> 735
    //   675: getstatic com/google/android/gms/internal/ads/wj2.d : Ljava/lang/String;
    //   678: astore #17
    //   680: aload #17
    //   682: ldc_w 'ODROID-XU3'
    //   685: invokevirtual equals : (Ljava/lang/Object;)Z
    //   688: ifne -> 702
    //   691: aload #17
    //   693: ldc_w 'Nexus 10'
    //   696: invokevirtual equals : (Ljava/lang/Object;)Z
    //   699: ifeq -> 735
    //   702: ldc_w 'OMX.Exynos.AVC.Decoder'
    //   705: aload #8
    //   707: invokevirtual equals : (Ljava/lang/Object;)Z
    //   710: ifne -> 724
    //   713: ldc_w 'OMX.Exynos.AVC.Decoder.secure'
    //   716: aload #8
    //   718: invokevirtual equals : (Ljava/lang/Object;)Z
    //   721: ifeq -> 735
    //   724: iconst_1
    //   725: istore #9
    //   727: goto -> 738
    //   730: astore #11
    //   732: goto -> 846
    //   735: iconst_0
    //   736: istore #9
    //   738: iload #5
    //   740: ifeq -> 758
    //   743: aload_0
    //   744: getfield b : Z
    //   747: iload #16
    //   749: if_icmpeq -> 755
    //   752: goto -> 758
    //   755: goto -> 773
    //   758: iload #5
    //   760: ifne -> 794
    //   763: aload_0
    //   764: getfield b : Z
    //   767: ifne -> 794
    //   770: goto -> 755
    //   773: aload_2
    //   774: aload #8
    //   776: aload_3
    //   777: aload #11
    //   779: iload #9
    //   781: iconst_0
    //   782: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Lcom/google/android/gms/internal/ads/jg2;
    //   785: invokeinterface add : (Ljava/lang/Object;)Z
    //   790: pop
    //   791: goto -> 1016
    //   794: iload #5
    //   796: ifne -> 841
    //   799: iload #16
    //   801: ifeq -> 841
    //   804: aload #8
    //   806: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   809: ldc '.secure'
    //   811: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   814: astore #17
    //   816: aload_2
    //   817: aload #17
    //   819: aload_3
    //   820: aload #11
    //   822: iload #9
    //   824: iconst_1
    //   825: invokestatic a : (Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZ)Lcom/google/android/gms/internal/ads/jg2;
    //   828: invokeinterface add : (Ljava/lang/Object;)Z
    //   833: pop
    //   834: aload_2
    //   835: areturn
    //   836: astore #11
    //   838: goto -> 846
    //   841: goto -> 1016
    //   844: astore #11
    //   846: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   849: istore #10
    //   851: iload #10
    //   853: bipush #23
    //   855: if_icmpgt -> 932
    //   858: aload_2
    //   859: invokeinterface isEmpty : ()Z
    //   864: ifne -> 932
    //   867: aload #8
    //   869: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   872: invokevirtual length : ()I
    //   875: istore #10
    //   877: new java/lang/StringBuilder
    //   880: astore #11
    //   882: aload #11
    //   884: iload #10
    //   886: bipush #46
    //   888: iadd
    //   889: invokespecial <init> : (I)V
    //   892: aload #11
    //   894: ldc_w 'Skipping codec '
    //   897: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   900: pop
    //   901: aload #11
    //   903: aload #8
    //   905: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   908: pop
    //   909: aload #11
    //   911: ldc_w ' (failed to query capabilities)'
    //   914: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   917: pop
    //   918: ldc 'MediaCodecUtil'
    //   920: aload #11
    //   922: invokevirtual toString : ()Ljava/lang/String;
    //   925: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   928: pop
    //   929: goto -> 1016
    //   932: aload #8
    //   934: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   937: invokevirtual length : ()I
    //   940: istore #10
    //   942: aload #15
    //   944: invokevirtual length : ()I
    //   947: istore #4
    //   949: new java/lang/StringBuilder
    //   952: astore_0
    //   953: aload_0
    //   954: iload #10
    //   956: bipush #25
    //   958: iadd
    //   959: iload #4
    //   961: iadd
    //   962: invokespecial <init> : (I)V
    //   965: aload_0
    //   966: ldc_w 'Failed to query codec '
    //   969: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   972: pop
    //   973: aload_0
    //   974: aload #8
    //   976: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   979: pop
    //   980: aload_0
    //   981: ldc_w ' ('
    //   984: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   987: pop
    //   988: aload_0
    //   989: aload #15
    //   991: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   994: pop
    //   995: aload_0
    //   996: ldc_w ')'
    //   999: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1002: pop
    //   1003: ldc 'MediaCodecUtil'
    //   1005: aload_0
    //   1006: invokevirtual toString : ()Ljava/lang/String;
    //   1009: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   1012: pop
    //   1013: aload #11
    //   1015: athrow
    //   1016: iinc #12, 1
    //   1019: goto -> 612
    //   1022: iinc #6, 1
    //   1025: iload #10
    //   1027: istore #4
    //   1029: goto -> 32
    //   1032: aload_2
    //   1033: areturn
    //   1034: astore_0
    //   1035: new com/google/android/gms/internal/ads/zzmd
    //   1038: dup
    //   1039: aload_0
    //   1040: aconst_null
    //   1041: invokespecial <init> : (Ljava/lang/Throwable;Lcom/google/android/gms/internal/ads/og2;)V
    //   1044: astore_0
    //   1045: goto -> 1050
    //   1048: aload_0
    //   1049: athrow
    //   1050: goto -> 1048
    // Exception table:
    //   from	to	target	type
    //   0	29	1034	java/lang/Exception
    //   39	63	1034	java/lang/Exception
    //   73	83	1034	java/lang/Exception
    //   86	91	1034	java/lang/Exception
    //   98	164	1034	java/lang/Exception
    //   174	185	1034	java/lang/Exception
    //   195	218	1034	java/lang/Exception
    //   228	376	1034	java/lang/Exception
    //   386	445	1034	java/lang/Exception
    //   460	543	1034	java/lang/Exception
    //   553	576	1034	java/lang/Exception
    //   597	609	1034	java/lang/Exception
    //   630	638	1034	java/lang/Exception
    //   643	668	844	java/lang/Exception
    //   675	702	730	java/lang/Exception
    //   702	724	730	java/lang/Exception
    //   743	752	730	java/lang/Exception
    //   763	770	730	java/lang/Exception
    //   773	791	730	java/lang/Exception
    //   804	816	730	java/lang/Exception
    //   816	834	836	java/lang/Exception
    //   846	851	1034	java/lang/Exception
    //   858	929	1034	java/lang/Exception
    //   932	1016	1034	java/lang/Exception
  }
  
  public static Pair<Integer, Integer> c(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_0
    //   7: ldc_w '\.'
    //   10: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   13: astore_1
    //   14: iconst_0
    //   15: istore_2
    //   16: aload_1
    //   17: iconst_0
    //   18: aaload
    //   19: astore_3
    //   20: aload_3
    //   21: invokevirtual hashCode : ()I
    //   24: pop
    //   25: aload_3
    //   26: invokevirtual hashCode : ()I
    //   29: istore #4
    //   31: iconst_2
    //   32: istore #5
    //   34: iload #4
    //   36: lookupswitch default -> 80, 3006243 -> 139, 3006244 -> 121, 3199032 -> 103, 3214780 -> 85
    //   80: iconst_m1
    //   81: istore_2
    //   82: goto -> 152
    //   85: aload_3
    //   86: ldc_w 'hvc1'
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: ifne -> 98
    //   95: goto -> 80
    //   98: iconst_3
    //   99: istore_2
    //   100: goto -> 152
    //   103: aload_3
    //   104: ldc_w 'hev1'
    //   107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   110: ifne -> 116
    //   113: goto -> 80
    //   116: iconst_2
    //   117: istore_2
    //   118: goto -> 152
    //   121: aload_3
    //   122: ldc_w 'avc2'
    //   125: invokevirtual equals : (Ljava/lang/Object;)Z
    //   128: ifne -> 134
    //   131: goto -> 80
    //   134: iconst_1
    //   135: istore_2
    //   136: goto -> 152
    //   139: aload_3
    //   140: ldc_w 'avc1'
    //   143: invokevirtual equals : (Ljava/lang/Object;)Z
    //   146: ifne -> 152
    //   149: goto -> 80
    //   152: iload_2
    //   153: tableswitch default -> 184, 0 -> 441, 1 -> 441, 2 -> 186, 3 -> 186
    //   184: aconst_null
    //   185: areturn
    //   186: aload_1
    //   187: arraylength
    //   188: iconst_4
    //   189: if_icmpge -> 230
    //   192: aload_0
    //   193: invokevirtual length : ()I
    //   196: ifeq -> 210
    //   199: ldc_w 'Ignoring malformed HEVC codec string: '
    //   202: aload_0
    //   203: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   206: astore_0
    //   207: goto -> 221
    //   210: new java/lang/String
    //   213: dup
    //   214: ldc_w 'Ignoring malformed HEVC codec string: '
    //   217: invokespecial <init> : (Ljava/lang/String;)V
    //   220: astore_0
    //   221: ldc 'MediaCodecUtil'
    //   223: aload_0
    //   224: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   227: pop
    //   228: aconst_null
    //   229: areturn
    //   230: getstatic com/google/android/gms/internal/ads/lg2.b : Ljava/util/regex/Pattern;
    //   233: aload_1
    //   234: iconst_1
    //   235: aaload
    //   236: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
    //   239: astore_3
    //   240: aload_3
    //   241: invokevirtual matches : ()Z
    //   244: ifne -> 285
    //   247: aload_0
    //   248: invokevirtual length : ()I
    //   251: ifeq -> 265
    //   254: ldc_w 'Ignoring malformed HEVC codec string: '
    //   257: aload_0
    //   258: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   261: astore_0
    //   262: goto -> 276
    //   265: new java/lang/String
    //   268: dup
    //   269: ldc_w 'Ignoring malformed HEVC codec string: '
    //   272: invokespecial <init> : (Ljava/lang/String;)V
    //   275: astore_0
    //   276: ldc 'MediaCodecUtil'
    //   278: aload_0
    //   279: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   282: pop
    //   283: aconst_null
    //   284: areturn
    //   285: aload_3
    //   286: iconst_1
    //   287: invokevirtual group : (I)Ljava/lang/String;
    //   290: astore_0
    //   291: ldc_w '1'
    //   294: aload_0
    //   295: invokevirtual equals : (Ljava/lang/Object;)Z
    //   298: ifeq -> 306
    //   301: iconst_1
    //   302: istore_2
    //   303: goto -> 319
    //   306: ldc_w '2'
    //   309: aload_0
    //   310: invokevirtual equals : (Ljava/lang/Object;)Z
    //   313: ifeq -> 398
    //   316: iload #5
    //   318: istore_2
    //   319: getstatic com/google/android/gms/internal/ads/lg2.f : Ljava/util/Map;
    //   322: aload_1
    //   323: iconst_3
    //   324: aaload
    //   325: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   330: checkcast java/lang/Integer
    //   333: astore_0
    //   334: aload_0
    //   335: ifnonnull -> 385
    //   338: aload_3
    //   339: iconst_1
    //   340: invokevirtual group : (I)Ljava/lang/String;
    //   343: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   346: astore_0
    //   347: aload_0
    //   348: invokevirtual length : ()I
    //   351: ifeq -> 365
    //   354: ldc_w 'Unknown HEVC level string: '
    //   357: aload_0
    //   358: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   361: astore_0
    //   362: goto -> 376
    //   365: new java/lang/String
    //   368: dup
    //   369: ldc_w 'Unknown HEVC level string: '
    //   372: invokespecial <init> : (Ljava/lang/String;)V
    //   375: astore_0
    //   376: ldc 'MediaCodecUtil'
    //   378: aload_0
    //   379: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   382: pop
    //   383: aconst_null
    //   384: areturn
    //   385: new android/util/Pair
    //   388: dup
    //   389: iload_2
    //   390: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   393: aload_0
    //   394: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   397: areturn
    //   398: aload_0
    //   399: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   402: astore_0
    //   403: aload_0
    //   404: invokevirtual length : ()I
    //   407: ifeq -> 421
    //   410: ldc_w 'Unknown HEVC profile string: '
    //   413: aload_0
    //   414: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   417: astore_0
    //   418: goto -> 432
    //   421: new java/lang/String
    //   424: dup
    //   425: ldc_w 'Unknown HEVC profile string: '
    //   428: invokespecial <init> : (Ljava/lang/String;)V
    //   431: astore_0
    //   432: ldc 'MediaCodecUtil'
    //   434: aload_0
    //   435: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   438: pop
    //   439: aconst_null
    //   440: areturn
    //   441: aload_0
    //   442: aload_1
    //   443: invokestatic a : (Ljava/lang/String;[Ljava/lang/String;)Landroid/util/Pair;
    //   446: areturn
  }
  
  public static jg2 d(String paramString, boolean paramBoolean) {
    List<jg2> list = e(paramString, paramBoolean);
    return list.isEmpty() ? null : list.get(0);
  }
  
  private static List<jg2> e(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: ldc com/google/android/gms/internal/ads/lg2
    //   2: monitorenter
    //   3: new com/google/android/gms/internal/ads/lg2$a
    //   6: astore_2
    //   7: aload_2
    //   8: aload_0
    //   9: iload_1
    //   10: invokespecial <init> : (Ljava/lang/String;Z)V
    //   13: getstatic com/google/android/gms/internal/ads/lg2.c : Ljava/util/HashMap;
    //   16: astore_3
    //   17: aload_3
    //   18: aload_2
    //   19: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: checkcast java/util/List
    //   25: astore #4
    //   27: aload #4
    //   29: ifnull -> 38
    //   32: ldc com/google/android/gms/internal/ads/lg2
    //   34: monitorexit
    //   35: aload #4
    //   37: areturn
    //   38: getstatic com/google/android/gms/internal/ads/wj2.a : I
    //   41: istore #5
    //   43: iload #5
    //   45: bipush #21
    //   47: if_icmplt -> 64
    //   50: new com/google/android/gms/internal/ads/qg2
    //   53: astore #4
    //   55: aload #4
    //   57: iload_1
    //   58: invokespecial <init> : (Z)V
    //   61: goto -> 74
    //   64: new com/google/android/gms/internal/ads/rg2
    //   67: dup
    //   68: aconst_null
    //   69: invokespecial <init> : (Lcom/google/android/gms/internal/ads/og2;)V
    //   72: astore #4
    //   74: aload_2
    //   75: aload #4
    //   77: invokestatic b : (Lcom/google/android/gms/internal/ads/lg2$a;Lcom/google/android/gms/internal/ads/pg2;)Ljava/util/List;
    //   80: astore #6
    //   82: aload #6
    //   84: astore #4
    //   86: iload_1
    //   87: ifeq -> 260
    //   90: aload #6
    //   92: astore #4
    //   94: aload #6
    //   96: invokeinterface isEmpty : ()Z
    //   101: ifeq -> 260
    //   104: aload #6
    //   106: astore #4
    //   108: bipush #21
    //   110: iload #5
    //   112: if_icmpgt -> 260
    //   115: aload #6
    //   117: astore #4
    //   119: iload #5
    //   121: bipush #23
    //   123: if_icmpgt -> 260
    //   126: new com/google/android/gms/internal/ads/rg2
    //   129: astore #4
    //   131: aload #4
    //   133: aconst_null
    //   134: invokespecial <init> : (Lcom/google/android/gms/internal/ads/og2;)V
    //   137: aload_2
    //   138: aload #4
    //   140: invokestatic b : (Lcom/google/android/gms/internal/ads/lg2$a;Lcom/google/android/gms/internal/ads/pg2;)Ljava/util/List;
    //   143: astore #6
    //   145: aload #6
    //   147: astore #4
    //   149: aload #6
    //   151: invokeinterface isEmpty : ()Z
    //   156: ifne -> 260
    //   159: aload #6
    //   161: iconst_0
    //   162: invokeinterface get : (I)Ljava/lang/Object;
    //   167: checkcast com/google/android/gms/internal/ads/jg2
    //   170: getfield a : Ljava/lang/String;
    //   173: astore #4
    //   175: aload_0
    //   176: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   179: invokevirtual length : ()I
    //   182: istore #7
    //   184: aload #4
    //   186: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   189: invokevirtual length : ()I
    //   192: istore #5
    //   194: new java/lang/StringBuilder
    //   197: astore #8
    //   199: aload #8
    //   201: iload #7
    //   203: bipush #63
    //   205: iadd
    //   206: iload #5
    //   208: iadd
    //   209: invokespecial <init> : (I)V
    //   212: aload #8
    //   214: ldc_w 'MediaCodecList API didn't list secure decoder for: '
    //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   220: pop
    //   221: aload #8
    //   223: aload_0
    //   224: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: aload #8
    //   230: ldc_w '. Assuming: '
    //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload #8
    //   239: aload #4
    //   241: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   244: pop
    //   245: ldc 'MediaCodecUtil'
    //   247: aload #8
    //   249: invokevirtual toString : ()Ljava/lang/String;
    //   252: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   255: pop
    //   256: aload #6
    //   258: astore #4
    //   260: aload #4
    //   262: invokestatic unmodifiableList : (Ljava/util/List;)Ljava/util/List;
    //   265: astore_0
    //   266: aload_3
    //   267: aload_2
    //   268: aload_0
    //   269: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   272: pop
    //   273: ldc com/google/android/gms/internal/ads/lg2
    //   275: monitorexit
    //   276: aload_0
    //   277: areturn
    //   278: astore_0
    //   279: ldc com/google/android/gms/internal/ads/lg2
    //   281: monitorexit
    //   282: aload_0
    //   283: athrow
    // Exception table:
    //   from	to	target	type
    //   3	27	278	finally
    //   38	43	278	finally
    //   50	61	278	finally
    //   64	74	278	finally
    //   74	82	278	finally
    //   94	104	278	finally
    //   126	145	278	finally
    //   149	256	278	finally
    //   260	273	278	finally
  }
  
  public static jg2 f() {
    return a;
  }
  
  public static int g() {
    if (g == -1) {
      int i = 0;
      byte b = 0;
      jg2 jg21 = d("video/avc", false);
      if (jg21 != null) {
        MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = jg21.j();
        int j = arrayOfCodecProfileLevel.length;
        int k = 0;
        while (b < j) {
          int m = (arrayOfCodecProfileLevel[b]).level;
          i = 9437184;
          if (m != 1 && m != 2) {
            switch (m) {
              default:
                i = -1;
                break;
              case 16384:
                i = 5652480;
                break;
              case 8192:
                i = 2228224;
                break;
              case 2048:
              case 4096:
                i = 2097152;
                break;
              case 1024:
                i = 1310720;
                break;
              case 512:
                i = 921600;
                break;
              case 128:
              case 256:
                i = 414720;
                break;
              case 64:
                i = 202752;
                break;
              case 8:
              case 16:
              case 32:
                i = 101376;
                break;
              case 32768:
              case 65536:
                break;
            } 
          } else {
            i = 25344;
          } 
          k = Math.max(i, k);
          b++;
        } 
        if (wj2.a >= 21) {
          i = 345600;
        } else {
          i = 172800;
        } 
        i = Math.max(k, i);
      } 
      g = i;
    } 
    return g;
  }
  
  private static final class a {
    public final String a;
    
    public final boolean b;
    
    public a(String param1String, boolean param1Boolean) {
      this.a = param1String;
      this.b = param1Boolean;
    }
    
    public final boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object != null && param1Object.getClass() == a.class) {
        param1Object = param1Object;
        if (TextUtils.equals(this.a, ((a)param1Object).a) && this.b == ((a)param1Object).b)
          return true; 
      } 
      return false;
    }
    
    public final int hashCode() {
      int i;
      char c;
      String str = this.a;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      } 
      if (this.b) {
        c = 'ӏ';
      } else {
        c = 'ӕ';
      } 
      return (i + 31) * 31 + c;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */