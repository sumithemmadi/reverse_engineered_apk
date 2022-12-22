package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.j;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.v;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class h implements v.a<g> {
  private static final Pattern A;
  
  private static final Pattern B;
  
  private static final Pattern C;
  
  private static final Pattern D;
  
  private static final Pattern E;
  
  private static final Pattern F;
  
  private static final Pattern G;
  
  private static final Pattern H;
  
  private static final Pattern I;
  
  private static final Pattern J;
  
  private static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
  
  private static final Pattern b = Pattern.compile("VIDEO=\"(.+?)\"");
  
  private static final Pattern c = Pattern.compile("AUDIO=\"(.+?)\"");
  
  private static final Pattern d = Pattern.compile("SUBTITLES=\"(.+?)\"");
  
  private static final Pattern e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
  
  private static final Pattern f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
  
  private static final Pattern g = Pattern.compile("CHANNELS=\"(.+?)\"");
  
  private static final Pattern h = Pattern.compile("CODECS=\"(.+?)\"");
  
  private static final Pattern i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
  
  private static final Pattern j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
  
  private static final Pattern k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
  
  private static final Pattern l = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
  
  private static final Pattern m = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
  
  private static final Pattern n = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
  
  private static final Pattern o = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
  
  private static final Pattern p = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
  
  private static final Pattern q = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
  
  private static final Pattern r = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
  
  private static final Pattern s = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
  
  private static final Pattern t = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
  
  private static final Pattern u = Pattern.compile("KEYFORMAT=\"(.+?)\"");
  
  private static final Pattern v = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
  
  private static final Pattern w = Pattern.compile("URI=\"(.+?)\"");
  
  private static final Pattern x = Pattern.compile("IV=([^,.*]+)");
  
  private static final Pattern y = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
  
  private static final Pattern z = Pattern.compile("LANGUAGE=\"(.+?)\"");
  
  private final e K;
  
  static {
    A = Pattern.compile("NAME=\"(.+?)\"");
    B = Pattern.compile("GROUP-ID=\"(.+?)\"");
    C = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    D = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    E = c("AUTOSELECT");
    F = c("DEFAULT");
    G = c("FORCED");
    H = Pattern.compile("VALUE=\"(.+?)\"");
    I = Pattern.compile("IMPORT=\"(.+?)\"");
    J = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
  }
  
  public h() {
    this(e.d);
  }
  
  public h(e parame) {
    this.K = parame;
  }
  
  private static boolean b(BufferedReader paramBufferedReader) {
    int i = paramBufferedReader.read();
    int j = i;
    if (i == 239) {
      if (paramBufferedReader.read() != 187 || paramBufferedReader.read() != 191)
        return false; 
      j = paramBufferedReader.read();
    } 
    i = v(paramBufferedReader, true, j);
    for (j = 0; j < 7; j++) {
      if (i != "#EXTM3U".charAt(j))
        return false; 
      i = paramBufferedReader.read();
    } 
    return h0.V(v(paramBufferedReader, false, i));
  }
  
  private static Pattern c(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString);
    stringBuilder.append("=(");
    stringBuilder.append("NO");
    stringBuilder.append("|");
    stringBuilder.append("YES");
    stringBuilder.append(")");
    return Pattern.compile(stringBuilder.toString());
  }
  
  private static e.b d(ArrayList<e.b> paramArrayList, String paramString) {
    for (byte b = 0; b < paramArrayList.size(); b++) {
      e.b b1 = paramArrayList.get(b);
      if (paramString.equals(b1.d))
        return b1; 
    } 
    return null;
  }
  
  private static e.b e(ArrayList<e.b> paramArrayList, String paramString) {
    for (byte b = 0; b < paramArrayList.size(); b++) {
      e.b b1 = paramArrayList.get(b);
      if (paramString.equals(b1.c))
        return b1; 
    } 
    return null;
  }
  
  private static double g(String paramString, Pattern paramPattern) {
    return Double.parseDouble(t(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private static DrmInitData.SchemeData h(String paramString1, String paramString2, Map<String, String> paramMap) {
    String str = p(paramString1, v, "1", paramMap);
    if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(paramString2)) {
      paramString1 = t(paramString1, w, paramMap);
      return new DrmInitData.SchemeData(v.d, "video/mp4", Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0));
    } 
    if ("com.widevine".equals(paramString2))
      return new DrmInitData.SchemeData(v.d, "hls", h0.R(paramString1)); 
    if ("com.microsoft.playready".equals(paramString2) && "1".equals(str)) {
      paramString1 = t(paramString1, w, paramMap);
      byte[] arrayOfByte = Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0);
      UUID uUID = v.e;
      return new DrmInitData.SchemeData(uUID, "video/mp4", j.a(uUID, arrayOfByte));
    } 
    return null;
  }
  
  private static String i(String paramString) {
    return ("SAMPLE-AES-CENC".equals(paramString) || "SAMPLE-AES-CTR".equals(paramString)) ? "cenc" : "cbcs";
  }
  
  private static int j(String paramString, Pattern paramPattern) {
    return Integer.parseInt(t(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private static long k(String paramString, Pattern paramPattern) {
    return Long.parseLong(t(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private static e l(a parama, String paramString) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: new java/util/HashMap
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore_3
    //   16: new java/util/ArrayList
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore #4
    //   25: new java/util/ArrayList
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore #5
    //   34: new java/util/ArrayList
    //   37: dup
    //   38: invokespecial <init> : ()V
    //   41: astore #6
    //   43: new java/util/ArrayList
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: astore #7
    //   52: new java/util/ArrayList
    //   55: dup
    //   56: invokespecial <init> : ()V
    //   59: astore #8
    //   61: new java/util/ArrayList
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: astore #9
    //   70: new java/util/ArrayList
    //   73: dup
    //   74: invokespecial <init> : ()V
    //   77: astore #10
    //   79: new java/util/ArrayList
    //   82: dup
    //   83: invokespecial <init> : ()V
    //   86: astore #11
    //   88: iconst_0
    //   89: istore #12
    //   91: iconst_0
    //   92: istore #13
    //   94: aload_0
    //   95: invokevirtual a : ()Z
    //   98: ifeq -> 638
    //   101: aload_0
    //   102: invokevirtual b : ()Ljava/lang/String;
    //   105: astore #14
    //   107: aload #14
    //   109: ldc_w '#EXT'
    //   112: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   115: ifeq -> 126
    //   118: aload #11
    //   120: aload #14
    //   122: invokevirtual add : (Ljava/lang/Object;)Z
    //   125: pop
    //   126: aload #14
    //   128: ldc_w '#EXT-X-DEFINE'
    //   131: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   134: ifeq -> 163
    //   137: aload_3
    //   138: aload #14
    //   140: getstatic com/google/android/exoplayer2/source/hls/playlist/h.A : Ljava/util/regex/Pattern;
    //   143: aload_3
    //   144: invokestatic t : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   147: aload #14
    //   149: getstatic com/google/android/exoplayer2/source/hls/playlist/h.H : Ljava/util/regex/Pattern;
    //   152: aload_3
    //   153: invokestatic t : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   156: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   159: pop
    //   160: goto -> 635
    //   163: aload #14
    //   165: ldc_w '#EXT-X-INDEPENDENT-SEGMENTS'
    //   168: invokevirtual equals : (Ljava/lang/Object;)Z
    //   171: ifeq -> 180
    //   174: iconst_1
    //   175: istore #12
    //   177: goto -> 94
    //   180: aload #14
    //   182: ldc_w '#EXT-X-MEDIA'
    //   185: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   188: ifeq -> 202
    //   191: aload #9
    //   193: aload #14
    //   195: invokevirtual add : (Ljava/lang/Object;)Z
    //   198: pop
    //   199: goto -> 160
    //   202: aload #14
    //   204: ldc_w '#EXT-X-SESSION-KEY'
    //   207: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   210: ifeq -> 278
    //   213: aload #14
    //   215: aload #14
    //   217: getstatic com/google/android/exoplayer2/source/hls/playlist/h.u : Ljava/util/regex/Pattern;
    //   220: ldc_w 'identity'
    //   223: aload_3
    //   224: invokestatic p : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   227: aload_3
    //   228: invokestatic h : (Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;
    //   231: astore #15
    //   233: aload #15
    //   235: ifnull -> 275
    //   238: aload #10
    //   240: new com/google/android/exoplayer2/drm/DrmInitData
    //   243: dup
    //   244: aload #14
    //   246: getstatic com/google/android/exoplayer2/source/hls/playlist/h.t : Ljava/util/regex/Pattern;
    //   249: aload_3
    //   250: invokestatic t : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   253: invokestatic i : (Ljava/lang/String;)Ljava/lang/String;
    //   256: iconst_1
    //   257: anewarray com/google/android/exoplayer2/drm/DrmInitData$SchemeData
    //   260: dup
    //   261: iconst_0
    //   262: aload #15
    //   264: aastore
    //   265: invokespecial <init> : (Ljava/lang/String;[Lcom/google/android/exoplayer2/drm/DrmInitData$SchemeData;)V
    //   268: invokevirtual add : (Ljava/lang/Object;)Z
    //   271: pop
    //   272: goto -> 635
    //   275: goto -> 635
    //   278: aload #14
    //   280: ldc_w '#EXT-X-STREAM-INF'
    //   283: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   286: ifeq -> 635
    //   289: aload #14
    //   291: ldc_w 'CLOSED-CAPTIONS=NONE'
    //   294: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   297: istore #16
    //   299: aload #14
    //   301: getstatic com/google/android/exoplayer2/source/hls/playlist/h.f : Ljava/util/regex/Pattern;
    //   304: invokestatic j : (Ljava/lang/String;Ljava/util/regex/Pattern;)I
    //   307: istore #17
    //   309: aload #14
    //   311: getstatic com/google/android/exoplayer2/source/hls/playlist/h.a : Ljava/util/regex/Pattern;
    //   314: iconst_m1
    //   315: invokestatic o : (Ljava/lang/String;Ljava/util/regex/Pattern;I)I
    //   318: pop
    //   319: aload #14
    //   321: getstatic com/google/android/exoplayer2/source/hls/playlist/h.h : Ljava/util/regex/Pattern;
    //   324: aload_3
    //   325: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   328: astore #15
    //   330: aload #14
    //   332: getstatic com/google/android/exoplayer2/source/hls/playlist/h.i : Ljava/util/regex/Pattern;
    //   335: aload_3
    //   336: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   339: astore #18
    //   341: aload #18
    //   343: ifnull -> 397
    //   346: aload #18
    //   348: ldc_w 'x'
    //   351: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   354: astore #18
    //   356: aload #18
    //   358: iconst_0
    //   359: aaload
    //   360: invokestatic parseInt : (Ljava/lang/String;)I
    //   363: istore #19
    //   365: aload #18
    //   367: iconst_1
    //   368: aaload
    //   369: invokestatic parseInt : (Ljava/lang/String;)I
    //   372: istore #20
    //   374: iload #19
    //   376: ifle -> 388
    //   379: iload #20
    //   381: istore #21
    //   383: iload #20
    //   385: ifgt -> 394
    //   388: iconst_m1
    //   389: istore #21
    //   391: iconst_m1
    //   392: istore #19
    //   394: goto -> 403
    //   397: iconst_m1
    //   398: istore #19
    //   400: iconst_m1
    //   401: istore #21
    //   403: aload #14
    //   405: getstatic com/google/android/exoplayer2/source/hls/playlist/h.j : Ljava/util/regex/Pattern;
    //   408: aload_3
    //   409: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   412: astore #18
    //   414: aload #18
    //   416: ifnull -> 429
    //   419: aload #18
    //   421: invokestatic parseFloat : (Ljava/lang/String;)F
    //   424: fstore #22
    //   426: goto -> 434
    //   429: ldc_w -1.0
    //   432: fstore #22
    //   434: aload #14
    //   436: getstatic com/google/android/exoplayer2/source/hls/playlist/h.b : Ljava/util/regex/Pattern;
    //   439: aload_3
    //   440: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   443: astore #23
    //   445: aload #14
    //   447: getstatic com/google/android/exoplayer2/source/hls/playlist/h.c : Ljava/util/regex/Pattern;
    //   450: aload_3
    //   451: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   454: astore #18
    //   456: aload #14
    //   458: getstatic com/google/android/exoplayer2/source/hls/playlist/h.d : Ljava/util/regex/Pattern;
    //   461: aload_3
    //   462: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   465: astore #24
    //   467: aload #14
    //   469: getstatic com/google/android/exoplayer2/source/hls/playlist/h.e : Ljava/util/regex/Pattern;
    //   472: aload_3
    //   473: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   476: astore #25
    //   478: aload_0
    //   479: invokevirtual a : ()Z
    //   482: ifeq -> 624
    //   485: aload_1
    //   486: aload_0
    //   487: invokevirtual b : ()Ljava/lang/String;
    //   490: aload_3
    //   491: invokestatic u : (Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    //   494: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //   497: astore #26
    //   499: aload #4
    //   501: new com/google/android/exoplayer2/source/hls/playlist/e$b
    //   504: dup
    //   505: aload #26
    //   507: aload #4
    //   509: invokevirtual size : ()I
    //   512: invokestatic toString : (I)Ljava/lang/String;
    //   515: aconst_null
    //   516: ldc_w 'application/x-mpegURL'
    //   519: aconst_null
    //   520: aload #15
    //   522: aconst_null
    //   523: iload #17
    //   525: iload #19
    //   527: iload #21
    //   529: fload #22
    //   531: aconst_null
    //   532: iconst_0
    //   533: iconst_0
    //   534: invokestatic C : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/exoplayer2/metadata/Metadata;IIIFLjava/util/List;II)Lcom/google/android/exoplayer2/Format;
    //   537: aload #23
    //   539: aload #18
    //   541: aload #24
    //   543: aload #25
    //   545: invokespecial <init> : (Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   548: invokevirtual add : (Ljava/lang/Object;)Z
    //   551: pop
    //   552: aload_2
    //   553: aload #26
    //   555: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   558: checkcast java/util/ArrayList
    //   561: astore #14
    //   563: aload #14
    //   565: astore #15
    //   567: aload #14
    //   569: ifnonnull -> 590
    //   572: new java/util/ArrayList
    //   575: dup
    //   576: invokespecial <init> : ()V
    //   579: astore #15
    //   581: aload_2
    //   582: aload #26
    //   584: aload #15
    //   586: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   589: pop
    //   590: aload #15
    //   592: new com/google/android/exoplayer2/source/hls/HlsTrackMetadataEntry$VariantInfo
    //   595: dup
    //   596: iload #17
    //   598: i2l
    //   599: aload #23
    //   601: aload #18
    //   603: aload #24
    //   605: aload #25
    //   607: invokespecial <init> : (JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   610: invokevirtual add : (Ljava/lang/Object;)Z
    //   613: pop
    //   614: iload #13
    //   616: iload #16
    //   618: ior
    //   619: istore #13
    //   621: goto -> 635
    //   624: new com/google/android/exoplayer2/ParserException
    //   627: dup
    //   628: ldc_w '#EXT-X-STREAM-INF tag must be followed by another line'
    //   631: invokespecial <init> : (Ljava/lang/String;)V
    //   634: athrow
    //   635: goto -> 94
    //   638: new java/util/ArrayList
    //   641: dup
    //   642: invokespecial <init> : ()V
    //   645: astore #18
    //   647: new java/util/HashSet
    //   650: dup
    //   651: invokespecial <init> : ()V
    //   654: astore_0
    //   655: iconst_0
    //   656: istore #19
    //   658: aload_2
    //   659: astore #15
    //   661: iload #19
    //   663: aload #4
    //   665: invokevirtual size : ()I
    //   668: if_icmpge -> 789
    //   671: aload #4
    //   673: iload #19
    //   675: invokevirtual get : (I)Ljava/lang/Object;
    //   678: checkcast com/google/android/exoplayer2/source/hls/playlist/e$b
    //   681: astore #14
    //   683: aload_0
    //   684: aload #14
    //   686: getfield a : Landroid/net/Uri;
    //   689: invokevirtual add : (Ljava/lang/Object;)Z
    //   692: ifeq -> 783
    //   695: aload #14
    //   697: getfield b : Lcom/google/android/exoplayer2/Format;
    //   700: getfield h : Lcom/google/android/exoplayer2/metadata/Metadata;
    //   703: ifnonnull -> 712
    //   706: iconst_1
    //   707: istore #16
    //   709: goto -> 715
    //   712: iconst_0
    //   713: istore #16
    //   715: iload #16
    //   717: invokestatic f : (Z)V
    //   720: new com/google/android/exoplayer2/source/hls/HlsTrackMetadataEntry
    //   723: dup
    //   724: aconst_null
    //   725: aconst_null
    //   726: aload #15
    //   728: aload #14
    //   730: getfield a : Landroid/net/Uri;
    //   733: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   736: invokestatic e : (Ljava/lang/Object;)Ljava/lang/Object;
    //   739: checkcast java/util/List
    //   742: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    //   745: astore_2
    //   746: aload #18
    //   748: aload #14
    //   750: aload #14
    //   752: getfield b : Lcom/google/android/exoplayer2/Format;
    //   755: new com/google/android/exoplayer2/metadata/Metadata
    //   758: dup
    //   759: iconst_1
    //   760: anewarray com/google/android/exoplayer2/metadata/Metadata$Entry
    //   763: dup
    //   764: iconst_0
    //   765: aload_2
    //   766: aastore
    //   767: invokespecial <init> : ([Lcom/google/android/exoplayer2/metadata/Metadata$Entry;)V
    //   770: invokevirtual j : (Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/Format;
    //   773: invokevirtual a : (Lcom/google/android/exoplayer2/Format;)Lcom/google/android/exoplayer2/source/hls/playlist/e$b;
    //   776: invokevirtual add : (Ljava/lang/Object;)Z
    //   779: pop
    //   780: goto -> 783
    //   783: iinc #19, 1
    //   786: goto -> 661
    //   789: aconst_null
    //   790: astore_0
    //   791: aload_0
    //   792: astore_2
    //   793: iconst_0
    //   794: istore #21
    //   796: iload #13
    //   798: istore #19
    //   800: iload #21
    //   802: aload #9
    //   804: invokevirtual size : ()I
    //   807: if_icmpge -> 1672
    //   810: aload #9
    //   812: iload #21
    //   814: invokevirtual get : (I)Ljava/lang/Object;
    //   817: checkcast java/lang/String
    //   820: astore #14
    //   822: aload #14
    //   824: getstatic com/google/android/exoplayer2/source/hls/playlist/h.B : Ljava/util/regex/Pattern;
    //   827: aload_3
    //   828: invokestatic t : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   831: astore #25
    //   833: aload #14
    //   835: getstatic com/google/android/exoplayer2/source/hls/playlist/h.A : Ljava/util/regex/Pattern;
    //   838: aload_3
    //   839: invokestatic t : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   842: astore #26
    //   844: aload #14
    //   846: getstatic com/google/android/exoplayer2/source/hls/playlist/h.w : Ljava/util/regex/Pattern;
    //   849: aload_3
    //   850: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   853: astore #15
    //   855: aload #15
    //   857: ifnonnull -> 866
    //   860: aconst_null
    //   861: astore #23
    //   863: goto -> 874
    //   866: aload_1
    //   867: aload #15
    //   869: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    //   872: astore #23
    //   874: aload #14
    //   876: getstatic com/google/android/exoplayer2/source/hls/playlist/h.z : Ljava/util/regex/Pattern;
    //   879: aload_3
    //   880: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   883: astore #27
    //   885: aload #14
    //   887: invokestatic s : (Ljava/lang/String;)I
    //   890: istore #28
    //   892: aload #14
    //   894: aload_3
    //   895: invokestatic r : (Ljava/lang/String;Ljava/util/Map;)I
    //   898: istore #29
    //   900: new java/lang/StringBuilder
    //   903: dup
    //   904: invokespecial <init> : ()V
    //   907: astore #15
    //   909: aload #15
    //   911: aload #25
    //   913: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   916: pop
    //   917: aload #15
    //   919: ldc_w ':'
    //   922: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   925: pop
    //   926: aload #15
    //   928: aload #26
    //   930: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   933: pop
    //   934: aload #15
    //   936: invokevirtual toString : ()Ljava/lang/String;
    //   939: astore #30
    //   941: new com/google/android/exoplayer2/metadata/Metadata
    //   944: dup
    //   945: iconst_1
    //   946: anewarray com/google/android/exoplayer2/metadata/Metadata$Entry
    //   949: dup
    //   950: iconst_0
    //   951: new com/google/android/exoplayer2/source/hls/HlsTrackMetadataEntry
    //   954: dup
    //   955: aload #25
    //   957: aload #26
    //   959: invokestatic emptyList : ()Ljava/util/List;
    //   962: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    //   965: aastore
    //   966: invokespecial <init> : ([Lcom/google/android/exoplayer2/metadata/Metadata$Entry;)V
    //   969: astore #31
    //   971: aload #14
    //   973: getstatic com/google/android/exoplayer2/source/hls/playlist/h.y : Ljava/util/regex/Pattern;
    //   976: aload_3
    //   977: invokestatic t : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   980: astore #15
    //   982: aload #15
    //   984: invokevirtual hashCode : ()I
    //   987: pop
    //   988: aload #15
    //   990: invokevirtual hashCode : ()I
    //   993: lookupswitch default -> 1036, -959297733 -> 1102, -333210994 -> 1082, 62628790 -> 1062, 81665115 -> 1042
    //   1036: iconst_m1
    //   1037: istore #13
    //   1039: goto -> 1119
    //   1042: aload #15
    //   1044: ldc_w 'VIDEO'
    //   1047: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1050: ifne -> 1056
    //   1053: goto -> 1036
    //   1056: iconst_3
    //   1057: istore #13
    //   1059: goto -> 1119
    //   1062: aload #15
    //   1064: ldc_w 'AUDIO'
    //   1067: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1070: ifne -> 1076
    //   1073: goto -> 1036
    //   1076: iconst_2
    //   1077: istore #13
    //   1079: goto -> 1119
    //   1082: aload #15
    //   1084: ldc_w 'CLOSED-CAPTIONS'
    //   1087: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1090: ifne -> 1096
    //   1093: goto -> 1036
    //   1096: iconst_1
    //   1097: istore #13
    //   1099: goto -> 1119
    //   1102: aload #15
    //   1104: ldc_w 'SUBTITLES'
    //   1107: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1110: ifne -> 1116
    //   1113: goto -> 1036
    //   1116: iconst_0
    //   1117: istore #13
    //   1119: iload #13
    //   1121: tableswitch default -> 1152, 0 -> 1621, 1 -> 1513, 2 -> 1317, 3 -> 1155
    //   1152: goto -> 1666
    //   1155: aload #4
    //   1157: aload #25
    //   1159: invokestatic e : (Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/playlist/e$b;
    //   1162: astore #15
    //   1164: aload #15
    //   1166: ifnull -> 1219
    //   1169: aload #15
    //   1171: getfield b : Lcom/google/android/exoplayer2/Format;
    //   1174: astore #14
    //   1176: aload #14
    //   1178: getfield g : Ljava/lang/String;
    //   1181: iconst_2
    //   1182: invokestatic y : (Ljava/lang/String;I)Ljava/lang/String;
    //   1185: astore #15
    //   1187: aload #14
    //   1189: getfield o : I
    //   1192: istore #13
    //   1194: aload #14
    //   1196: getfield p : I
    //   1199: istore #20
    //   1201: aload #14
    //   1203: getfield q : F
    //   1206: fstore #22
    //   1208: iload #13
    //   1210: istore #17
    //   1212: iload #20
    //   1214: istore #13
    //   1216: goto -> 1233
    //   1219: aconst_null
    //   1220: astore #15
    //   1222: iconst_m1
    //   1223: istore #17
    //   1225: iconst_m1
    //   1226: istore #13
    //   1228: ldc_w -1.0
    //   1231: fstore #22
    //   1233: aload #15
    //   1235: ifnull -> 1248
    //   1238: aload #15
    //   1240: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1243: astore #14
    //   1245: goto -> 1251
    //   1248: aconst_null
    //   1249: astore #14
    //   1251: aload #30
    //   1253: aload #26
    //   1255: ldc_w 'application/x-mpegURL'
    //   1258: aload #14
    //   1260: aload #15
    //   1262: aconst_null
    //   1263: iconst_m1
    //   1264: iload #17
    //   1266: iload #13
    //   1268: fload #22
    //   1270: aconst_null
    //   1271: iload #28
    //   1273: iload #29
    //   1275: invokestatic C : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/exoplayer2/metadata/Metadata;IIIFLjava/util/List;II)Lcom/google/android/exoplayer2/Format;
    //   1278: aload #31
    //   1280: invokevirtual j : (Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/Format;
    //   1283: astore #15
    //   1285: aload #23
    //   1287: ifnonnull -> 1293
    //   1290: goto -> 1152
    //   1293: aload #5
    //   1295: new com/google/android/exoplayer2/source/hls/playlist/e$a
    //   1298: dup
    //   1299: aload #23
    //   1301: aload #15
    //   1303: aload #25
    //   1305: aload #26
    //   1307: invokespecial <init> : (Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Ljava/lang/String;)V
    //   1310: invokevirtual add : (Ljava/lang/Object;)Z
    //   1313: pop
    //   1314: goto -> 1152
    //   1317: aload #4
    //   1319: aload #25
    //   1321: invokestatic d : (Ljava/util/ArrayList;Ljava/lang/String;)Lcom/google/android/exoplayer2/source/hls/playlist/e$b;
    //   1324: astore #15
    //   1326: aload #15
    //   1328: ifnull -> 1348
    //   1331: aload #15
    //   1333: getfield b : Lcom/google/android/exoplayer2/Format;
    //   1336: getfield g : Ljava/lang/String;
    //   1339: iconst_1
    //   1340: invokestatic y : (Ljava/lang/String;I)Ljava/lang/String;
    //   1343: astore #24
    //   1345: goto -> 1351
    //   1348: aconst_null
    //   1349: astore #24
    //   1351: aload #24
    //   1353: ifnull -> 1366
    //   1356: aload #24
    //   1358: invokestatic e : (Ljava/lang/String;)Ljava/lang/String;
    //   1361: astore #15
    //   1363: goto -> 1369
    //   1366: aconst_null
    //   1367: astore #15
    //   1369: aload #14
    //   1371: getstatic com/google/android/exoplayer2/source/hls/playlist/h.g : Ljava/util/regex/Pattern;
    //   1374: aload_3
    //   1375: invokestatic q : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   1378: astore #32
    //   1380: aload #32
    //   1382: ifnull -> 1438
    //   1385: aload #32
    //   1387: ldc_w '/'
    //   1390: invokestatic o0 : (Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;
    //   1393: iconst_0
    //   1394: aaload
    //   1395: invokestatic parseInt : (Ljava/lang/String;)I
    //   1398: istore #13
    //   1400: aload #15
    //   1402: astore #14
    //   1404: ldc_w 'audio/eac3'
    //   1407: aload #15
    //   1409: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1412: ifeq -> 1435
    //   1415: aload #15
    //   1417: astore #14
    //   1419: aload #32
    //   1421: ldc_w '/JOC'
    //   1424: invokevirtual endsWith : (Ljava/lang/String;)Z
    //   1427: ifeq -> 1435
    //   1430: ldc_w 'audio/eac3-joc'
    //   1433: astore #14
    //   1435: goto -> 1445
    //   1438: iconst_m1
    //   1439: istore #13
    //   1441: aload #15
    //   1443: astore #14
    //   1445: aload #30
    //   1447: aload #26
    //   1449: ldc_w 'application/x-mpegURL'
    //   1452: aload #14
    //   1454: aload #24
    //   1456: aconst_null
    //   1457: iconst_m1
    //   1458: iload #13
    //   1460: iconst_m1
    //   1461: aconst_null
    //   1462: iload #28
    //   1464: iload #29
    //   1466: aload #27
    //   1468: invokestatic m : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/exoplayer2/metadata/Metadata;IIILjava/util/List;IILjava/lang/String;)Lcom/google/android/exoplayer2/Format;
    //   1471: astore #15
    //   1473: aload #23
    //   1475: ifnonnull -> 1484
    //   1478: aload #15
    //   1480: astore_2
    //   1481: goto -> 1666
    //   1484: aload #6
    //   1486: new com/google/android/exoplayer2/source/hls/playlist/e$a
    //   1489: dup
    //   1490: aload #23
    //   1492: aload #15
    //   1494: aload #31
    //   1496: invokevirtual j : (Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/Format;
    //   1499: aload #25
    //   1501: aload #26
    //   1503: invokespecial <init> : (Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Ljava/lang/String;)V
    //   1506: invokevirtual add : (Ljava/lang/Object;)Z
    //   1509: pop
    //   1510: goto -> 1666
    //   1513: aload #14
    //   1515: getstatic com/google/android/exoplayer2/source/hls/playlist/h.D : Ljava/util/regex/Pattern;
    //   1518: aload_3
    //   1519: invokestatic t : (Ljava/lang/String;Ljava/util/regex/Pattern;Ljava/util/Map;)Ljava/lang/String;
    //   1522: astore #15
    //   1524: aload #15
    //   1526: ldc_w 'CC'
    //   1529: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   1532: ifeq -> 1554
    //   1535: aload #15
    //   1537: iconst_2
    //   1538: invokevirtual substring : (I)Ljava/lang/String;
    //   1541: invokestatic parseInt : (Ljava/lang/String;)I
    //   1544: istore #13
    //   1546: ldc_w 'application/cea-608'
    //   1549: astore #14
    //   1551: goto -> 1571
    //   1554: aload #15
    //   1556: bipush #7
    //   1558: invokevirtual substring : (I)Ljava/lang/String;
    //   1561: invokestatic parseInt : (Ljava/lang/String;)I
    //   1564: istore #13
    //   1566: ldc_w 'application/cea-708'
    //   1569: astore #14
    //   1571: aload_0
    //   1572: astore #15
    //   1574: aload_0
    //   1575: ifnonnull -> 1587
    //   1578: new java/util/ArrayList
    //   1581: dup
    //   1582: invokespecial <init> : ()V
    //   1585: astore #15
    //   1587: aload #15
    //   1589: aload #30
    //   1591: aload #26
    //   1593: aconst_null
    //   1594: aload #14
    //   1596: aconst_null
    //   1597: iconst_m1
    //   1598: iload #28
    //   1600: iload #29
    //   1602: aload #27
    //   1604: iload #13
    //   1606: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;I)Lcom/google/android/exoplayer2/Format;
    //   1609: invokeinterface add : (Ljava/lang/Object;)Z
    //   1614: pop
    //   1615: aload #15
    //   1617: astore_0
    //   1618: goto -> 1666
    //   1621: aload #7
    //   1623: new com/google/android/exoplayer2/source/hls/playlist/e$a
    //   1626: dup
    //   1627: aload #23
    //   1629: aload #30
    //   1631: aload #26
    //   1633: ldc_w 'application/x-mpegURL'
    //   1636: ldc_w 'text/vtt'
    //   1639: aconst_null
    //   1640: iconst_m1
    //   1641: iload #28
    //   1643: iload #29
    //   1645: aload #27
    //   1647: invokestatic v : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)Lcom/google/android/exoplayer2/Format;
    //   1650: aload #31
    //   1652: invokevirtual j : (Lcom/google/android/exoplayer2/metadata/Metadata;)Lcom/google/android/exoplayer2/Format;
    //   1655: aload #25
    //   1657: aload #26
    //   1659: invokespecial <init> : (Landroid/net/Uri;Lcom/google/android/exoplayer2/Format;Ljava/lang/String;Ljava/lang/String;)V
    //   1662: invokevirtual add : (Ljava/lang/Object;)Z
    //   1665: pop
    //   1666: iinc #21, 1
    //   1669: goto -> 800
    //   1672: iload #19
    //   1674: ifeq -> 1681
    //   1677: invokestatic emptyList : ()Ljava/util/List;
    //   1680: astore_0
    //   1681: new com/google/android/exoplayer2/source/hls/playlist/e
    //   1684: dup
    //   1685: aload_1
    //   1686: aload #11
    //   1688: aload #18
    //   1690: aload #5
    //   1692: aload #6
    //   1694: aload #7
    //   1696: aload #8
    //   1698: aload_2
    //   1699: aload_0
    //   1700: iload #12
    //   1702: aload_3
    //   1703: aload #10
    //   1705: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/google/android/exoplayer2/Format;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;)V
    //   1708: areturn
  }
  
  private static f m(e parame, a parama, String paramString) {
    boolean bool = parame.c;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    ArrayList<f.a> arrayList = new ArrayList();
    ArrayList<String> arrayList1 = new ArrayList();
    TreeMap<Object, Object> treeMap = new TreeMap<Object, Object>();
    String str1 = "";
    long l1 = -9223372036854775807L;
    long l2 = l1;
    String str2 = "";
    boolean bool1 = false;
    boolean bool2 = false;
    Object object1 = null;
    Object object2 = null;
    long l3 = 0L;
    boolean bool3 = false;
    long l4 = 0L;
    boolean bool4 = true;
    boolean bool5 = false;
    DrmInitData drmInitData = null;
    long l5 = 0L;
    long l6 = 0L;
    Object object3 = null;
    Object object4 = null;
    boolean bool6 = false;
    long l7 = 0L;
    Object object5 = null;
    while (true) {
      long l8 = -1L;
      boolean bool7 = false;
      long l9 = 0L;
      long l10 = l6;
      String str = str2;
      while (true)
        bool7 = true; 
      if (l3 != 0L) {
        bool7 = true;
      } else {
        bool7 = false;
      } 
      return new f(bool2, paramString, arrayList1, l1, l3, bool1, bool3, l4, bool4, l2, bool, bool5, bool7, drmInitData, arrayList);
    } 
  }
  
  private static boolean n(String paramString, Pattern paramPattern, boolean paramBoolean) {
    Matcher matcher = paramPattern.matcher(paramString);
    return matcher.find() ? matcher.group(1).equals("YES") : paramBoolean;
  }
  
  private static int o(String paramString, Pattern paramPattern, int paramInt) {
    Matcher matcher = paramPattern.matcher(paramString);
    return matcher.find() ? Integer.parseInt(matcher.group(1)) : paramInt;
  }
  
  private static String p(String paramString1, Pattern paramPattern, String paramString2, Map<String, String> paramMap) {
    Matcher matcher = paramPattern.matcher(paramString1);
    if (matcher.find())
      paramString2 = matcher.group(1); 
    String str = paramString2;
    if (!paramMap.isEmpty())
      if (paramString2 == null) {
        str = paramString2;
      } else {
        str = u(paramString2, paramMap);
      }  
    return str;
  }
  
  private static String q(String paramString, Pattern paramPattern, Map<String, String> paramMap) {
    return p(paramString, paramPattern, null, paramMap);
  }
  
  private static int r(String paramString, Map<String, String> paramMap) {
    paramString = q(paramString, C, paramMap);
    boolean bool = TextUtils.isEmpty(paramString);
    int i = 0;
    if (bool)
      return 0; 
    String[] arrayOfString = h0.n0(paramString, ",");
    if (h0.p((Object[])arrayOfString, "public.accessibility.describes-video"))
      i = 512; 
    int j = i;
    if (h0.p((Object[])arrayOfString, "public.accessibility.transcribes-spoken-dialog"))
      j = i | 0x1000; 
    i = j;
    if (h0.p((Object[])arrayOfString, "public.accessibility.describes-music-and-sound"))
      i = j | 0x400; 
    j = i;
    if (h0.p((Object[])arrayOfString, "public.easy-to-read"))
      j = i | 0x2000; 
    return j;
  }
  
  private static int s(String paramString) {
    if (n(paramString, F, false)) {
      i = 1;
    } else {
      i = 0;
    } 
    int j = i;
    if (n(paramString, G, false))
      j = i | 0x2; 
    int i = j;
    if (n(paramString, E, false))
      i = j | 0x4; 
    return i;
  }
  
  private static String t(String paramString, Pattern paramPattern, Map<String, String> paramMap) {
    String str = q(paramString, paramPattern, paramMap);
    if (str != null)
      return str; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Couldn't match ");
    stringBuilder.append(paramPattern.pattern());
    stringBuilder.append(" in ");
    stringBuilder.append(paramString);
    throw new ParserException(stringBuilder.toString());
  }
  
  private static String u(String paramString, Map<String, String> paramMap) {
    Matcher matcher = J.matcher(paramString);
    StringBuffer stringBuffer = new StringBuffer();
    while (matcher.find()) {
      String str = matcher.group(1);
      if (paramMap.containsKey(str))
        matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(paramMap.get(str))); 
    } 
    matcher.appendTail(stringBuffer);
    return stringBuffer.toString();
  }
  
  private static int v(BufferedReader paramBufferedReader, boolean paramBoolean, int paramInt) {
    while (paramInt != -1 && Character.isWhitespace(paramInt) && (paramBoolean || !h0.V(paramInt)))
      paramInt = paramBufferedReader.read(); 
    return paramInt;
  }
  
  public g f(Uri paramUri, InputStream paramInputStream) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(paramInputStream));
    ArrayDeque<String> arrayDeque = new ArrayDeque();
    try {
      f f;
      if (b(bufferedReader))
        while (true) {
          String str = bufferedReader.readLine();
          if (str != null) {
            e e1;
            a a1;
            str = str.trim();
            if (str.isEmpty())
              continue; 
            if (str.startsWith("#EXT-X-STREAM-INF")) {
              arrayDeque.add(str);
              a1 = new a();
              this(arrayDeque, bufferedReader);
              e1 = l(a1, paramUri.toString());
              return e1;
            } 
            if (!a1.startsWith("#EXT-X-TARGETDURATION")) {
              if (!a1.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                if (!a1.startsWith("#EXTINF")) {
                  if (!a1.startsWith("#EXT-X-KEY")) {
                    if (!a1.startsWith("#EXT-X-BYTERANGE")) {
                      if (!a1.equals("#EXT-X-DISCONTINUITY")) {
                        if (!a1.equals("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                          if (a1.equals("#EXT-X-ENDLIST"))
                            continue; 
                          arrayDeque.add(a1);
                          continue;
                        } 
                        continue;
                      } 
                      continue;
                    } 
                    continue;
                  } 
                  continue;
                } 
                arrayDeque.add(a1);
                e e2 = this.K;
                a1 = new a();
                this(arrayDeque, bufferedReader);
                f = m(e2, a1, e1.toString());
                return f;
              } 
              continue;
            } 
            continue;
          } 
          h0.k(bufferedReader);
          throw new ParserException("Failed to parse the playlist, could not identify any tags.");
        }  
      UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException();
      this("Input does not start with the #EXTM3U header.", (Uri)f);
      throw unrecognizedInputFormatException;
    } finally {
      h0.k(bufferedReader);
    } 
  }
  
  private static class a {
    private final BufferedReader a;
    
    private final Queue<String> b;
    
    private String c;
    
    public a(Queue<String> param1Queue, BufferedReader param1BufferedReader) {
      this.b = param1Queue;
      this.a = param1BufferedReader;
    }
    
    @EnsuresNonNullIf(expression = {"next"}, result = true)
    public boolean a() {
      if (this.c != null)
        return true; 
      if (!this.b.isEmpty()) {
        this.c = (String)e.e(this.b.poll());
        return true;
      } 
      while (true) {
        String str = this.a.readLine();
        this.c = str;
        if (str != null) {
          str = str.trim();
          this.c = str;
          if (!str.isEmpty())
            return true; 
          continue;
        } 
        return false;
      } 
    }
    
    public String b() {
      if (a()) {
        String str = this.c;
        this.c = null;
        return str;
      } 
      throw new NoSuchElementException();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/playlist/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */