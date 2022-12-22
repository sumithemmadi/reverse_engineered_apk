package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class x0 {
  private static Map<String, List<Map<String, Object>>> a = new HashMap<String, List<Map<String, Object>>>();
  
  private static List<MediaCodecInfo> b;
  
  private static final Object c = new Object();
  
  @TargetApi(21)
  private static Integer[] a(Range<Integer> paramRange) {
    return new Integer[] { (Integer)paramRange.getLower(), (Integer)paramRange.getUpper() };
  }
  
  @TargetApi(16)
  public static List<Map<String, Object>> b(String paramString) {
    // Byte code:
    //   0: getstatic com/google/android/gms/ads/internal/util/x0.c : Ljava/lang/Object;
    //   3: astore_1
    //   4: aload_1
    //   5: monitorenter
    //   6: getstatic com/google/android/gms/ads/internal/util/x0.a : Ljava/util/Map;
    //   9: aload_0
    //   10: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   15: ifeq -> 35
    //   18: getstatic com/google/android/gms/ads/internal/util/x0.a : Ljava/util/Map;
    //   21: aload_0
    //   22: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   27: checkcast java/util/List
    //   30: astore_0
    //   31: aload_1
    //   32: monitorexit
    //   33: aload_0
    //   34: areturn
    //   35: aload_1
    //   36: monitorenter
    //   37: getstatic com/google/android/gms/ads/internal/util/x0.b : Ljava/util/List;
    //   40: ifnull -> 48
    //   43: aload_1
    //   44: monitorexit
    //   45: goto -> 128
    //   48: getstatic android/os/Build$VERSION.SDK_INT : I
    //   51: bipush #21
    //   53: if_icmplt -> 78
    //   56: new android/media/MediaCodecList
    //   59: astore_2
    //   60: aload_2
    //   61: iconst_0
    //   62: invokespecial <init> : (I)V
    //   65: aload_2
    //   66: invokevirtual getCodecInfos : ()[Landroid/media/MediaCodecInfo;
    //   69: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   72: putstatic com/google/android/gms/ads/internal/util/x0.b : Ljava/util/List;
    //   75: goto -> 126
    //   78: invokestatic getCodecCount : ()I
    //   81: istore_3
    //   82: new java/util/ArrayList
    //   85: astore_2
    //   86: aload_2
    //   87: iload_3
    //   88: invokespecial <init> : (I)V
    //   91: aload_2
    //   92: putstatic com/google/android/gms/ads/internal/util/x0.b : Ljava/util/List;
    //   95: iconst_0
    //   96: istore #4
    //   98: iload #4
    //   100: iload_3
    //   101: if_icmpge -> 126
    //   104: iload #4
    //   106: invokestatic getCodecInfoAt : (I)Landroid/media/MediaCodecInfo;
    //   109: astore_2
    //   110: getstatic com/google/android/gms/ads/internal/util/x0.b : Ljava/util/List;
    //   113: aload_2
    //   114: invokeinterface add : (Ljava/lang/Object;)Z
    //   119: pop
    //   120: iinc #4, 1
    //   123: goto -> 98
    //   126: aload_1
    //   127: monitorexit
    //   128: new java/util/ArrayList
    //   131: astore_2
    //   132: aload_2
    //   133: invokespecial <init> : ()V
    //   136: getstatic com/google/android/gms/ads/internal/util/x0.b : Ljava/util/List;
    //   139: invokeinterface iterator : ()Ljava/util/Iterator;
    //   144: astore #5
    //   146: aload #5
    //   148: invokeinterface hasNext : ()Z
    //   153: ifeq -> 475
    //   156: aload #5
    //   158: invokeinterface next : ()Ljava/lang/Object;
    //   163: checkcast android/media/MediaCodecInfo
    //   166: astore #6
    //   168: aload #6
    //   170: invokevirtual isEncoder : ()Z
    //   173: ifne -> 146
    //   176: aload #6
    //   178: invokevirtual getSupportedTypes : ()[Ljava/lang/String;
    //   181: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   184: aload_0
    //   185: invokeinterface contains : (Ljava/lang/Object;)Z
    //   190: ifeq -> 146
    //   193: new java/util/HashMap
    //   196: astore #7
    //   198: aload #7
    //   200: invokespecial <init> : ()V
    //   203: aload #7
    //   205: ldc 'codecName'
    //   207: aload #6
    //   209: invokevirtual getName : ()Ljava/lang/String;
    //   212: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   217: pop
    //   218: aload #6
    //   220: aload_0
    //   221: invokevirtual getCapabilitiesForType : (Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;
    //   224: astore #6
    //   226: new java/util/ArrayList
    //   229: astore #8
    //   231: aload #8
    //   233: invokespecial <init> : ()V
    //   236: aload #6
    //   238: getfield profileLevels : [Landroid/media/MediaCodecInfo$CodecProfileLevel;
    //   241: astore #9
    //   243: aload #9
    //   245: arraylength
    //   246: istore_3
    //   247: iconst_0
    //   248: istore #4
    //   250: iload #4
    //   252: iload_3
    //   253: if_icmpge -> 301
    //   256: aload #9
    //   258: iload #4
    //   260: aaload
    //   261: astore #10
    //   263: aload #8
    //   265: iconst_2
    //   266: anewarray java/lang/Integer
    //   269: dup
    //   270: iconst_0
    //   271: aload #10
    //   273: getfield profile : I
    //   276: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   279: aastore
    //   280: dup
    //   281: iconst_1
    //   282: aload #10
    //   284: getfield level : I
    //   287: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   290: aastore
    //   291: invokevirtual add : (Ljava/lang/Object;)Z
    //   294: pop
    //   295: iinc #4, 1
    //   298: goto -> 250
    //   301: aload #7
    //   303: ldc 'profileLevels'
    //   305: aload #8
    //   307: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   312: pop
    //   313: getstatic android/os/Build$VERSION.SDK_INT : I
    //   316: istore #4
    //   318: iload #4
    //   320: bipush #21
    //   322: if_icmplt -> 440
    //   325: aload #6
    //   327: invokevirtual getVideoCapabilities : ()Landroid/media/MediaCodecInfo$VideoCapabilities;
    //   330: astore #8
    //   332: aload #7
    //   334: ldc 'bitRatesBps'
    //   336: aload #8
    //   338: invokevirtual getBitrateRange : ()Landroid/util/Range;
    //   341: invokestatic a : (Landroid/util/Range;)[Ljava/lang/Integer;
    //   344: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   349: pop
    //   350: aload #7
    //   352: ldc 'widthAlignment'
    //   354: aload #8
    //   356: invokevirtual getWidthAlignment : ()I
    //   359: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   362: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   367: pop
    //   368: aload #7
    //   370: ldc 'heightAlignment'
    //   372: aload #8
    //   374: invokevirtual getHeightAlignment : ()I
    //   377: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   380: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   385: pop
    //   386: aload #7
    //   388: ldc 'frameRates'
    //   390: aload #8
    //   392: invokevirtual getSupportedFrameRates : ()Landroid/util/Range;
    //   395: invokestatic a : (Landroid/util/Range;)[Ljava/lang/Integer;
    //   398: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   403: pop
    //   404: aload #7
    //   406: ldc 'widths'
    //   408: aload #8
    //   410: invokevirtual getSupportedWidths : ()Landroid/util/Range;
    //   413: invokestatic a : (Landroid/util/Range;)[Ljava/lang/Integer;
    //   416: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   421: pop
    //   422: aload #7
    //   424: ldc 'heights'
    //   426: aload #8
    //   428: invokevirtual getSupportedHeights : ()Landroid/util/Range;
    //   431: invokestatic a : (Landroid/util/Range;)[Ljava/lang/Integer;
    //   434: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   439: pop
    //   440: iload #4
    //   442: bipush #23
    //   444: if_icmplt -> 465
    //   447: aload #7
    //   449: ldc 'instancesLimit'
    //   451: aload #6
    //   453: invokevirtual getMaxSupportedInstances : ()I
    //   456: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   459: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   464: pop
    //   465: aload_2
    //   466: aload #7
    //   468: invokevirtual add : (Ljava/lang/Object;)Z
    //   471: pop
    //   472: goto -> 146
    //   475: getstatic com/google/android/gms/ads/internal/util/x0.a : Ljava/util/Map;
    //   478: aload_0
    //   479: aload_2
    //   480: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   485: pop
    //   486: aload_1
    //   487: monitorexit
    //   488: aload_2
    //   489: areturn
    //   490: astore_2
    //   491: aload_1
    //   492: monitorexit
    //   493: aload_2
    //   494: athrow
    //   495: astore_2
    //   496: goto -> 500
    //   499: astore_2
    //   500: new java/util/HashMap
    //   503: astore #5
    //   505: aload #5
    //   507: invokespecial <init> : ()V
    //   510: aload #5
    //   512: ldc 'error'
    //   514: aload_2
    //   515: invokevirtual getClass : ()Ljava/lang/Class;
    //   518: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   521: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   526: pop
    //   527: new java/util/ArrayList
    //   530: astore_2
    //   531: aload_2
    //   532: invokespecial <init> : ()V
    //   535: aload_2
    //   536: aload #5
    //   538: invokevirtual add : (Ljava/lang/Object;)Z
    //   541: pop
    //   542: getstatic com/google/android/gms/ads/internal/util/x0.a : Ljava/util/Map;
    //   545: aload_0
    //   546: aload_2
    //   547: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   552: pop
    //   553: aload_1
    //   554: monitorexit
    //   555: aload_2
    //   556: areturn
    //   557: astore_0
    //   558: aload_1
    //   559: monitorexit
    //   560: goto -> 565
    //   563: aload_0
    //   564: athrow
    //   565: goto -> 563
    // Exception table:
    //   from	to	target	type
    //   6	33	557	finally
    //   35	37	499	java/lang/RuntimeException
    //   35	37	495	java/lang/LinkageError
    //   35	37	557	finally
    //   37	45	490	finally
    //   48	75	490	finally
    //   78	95	490	finally
    //   104	120	490	finally
    //   126	128	490	finally
    //   128	146	499	java/lang/RuntimeException
    //   128	146	495	java/lang/LinkageError
    //   128	146	557	finally
    //   146	247	499	java/lang/RuntimeException
    //   146	247	495	java/lang/LinkageError
    //   146	247	557	finally
    //   263	295	499	java/lang/RuntimeException
    //   263	295	495	java/lang/LinkageError
    //   263	295	557	finally
    //   301	318	499	java/lang/RuntimeException
    //   301	318	495	java/lang/LinkageError
    //   301	318	557	finally
    //   325	440	499	java/lang/RuntimeException
    //   325	440	495	java/lang/LinkageError
    //   325	440	557	finally
    //   447	465	499	java/lang/RuntimeException
    //   447	465	495	java/lang/LinkageError
    //   447	465	557	finally
    //   465	472	499	java/lang/RuntimeException
    //   465	472	495	java/lang/LinkageError
    //   465	472	557	finally
    //   475	486	499	java/lang/RuntimeException
    //   475	486	495	java/lang/LinkageError
    //   475	486	557	finally
    //   486	488	557	finally
    //   491	493	490	finally
    //   493	495	499	java/lang/RuntimeException
    //   493	495	495	java/lang/LinkageError
    //   493	495	557	finally
    //   500	555	557	finally
    //   558	560	557	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */