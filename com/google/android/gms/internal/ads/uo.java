package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

final class uo implements yi2 {
  private static final Pattern b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  
  private static final AtomicReference<byte[]> c = (AtomicReference)new AtomicReference<byte>();
  
  private SSLSocketFactory d = new to(this);
  
  private final int e;
  
  private final int f;
  
  private final String g;
  
  private final bj2 h;
  
  private final hj2<? super uo> i;
  
  private xi2 j;
  
  private HttpURLConnection k;
  
  private InputStream l;
  
  private boolean m;
  
  private long n;
  
  private long o;
  
  private long p;
  
  private long q;
  
  private int r;
  
  private Set<Socket> s = new HashSet<Socket>();
  
  uo(String paramString, hj2<? super uo> paramhj2, int paramInt1, int paramInt2, int paramInt3) {
    this.g = jj2.c(paramString);
    this.i = paramhj2;
    this.h = new bj2();
    this.e = paramInt1;
    this.f = paramInt2;
    this.r = paramInt3;
  }
  
  private final void e(Socket paramSocket) {
    this.s.add(paramSocket);
  }
  
  private static long f(HttpURLConnection paramHttpURLConnection) {
    String str = paramHttpURLConnection.getHeaderField("Content-Length");
    if (!TextUtils.isEmpty(str)) {
      long l1;
      try {
        l1 = Long.parseLong(str);
      } catch (NumberFormatException numberFormatException) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 28);
        stringBuilder.append("Unexpected Content-Length [");
        stringBuilder.append(str);
        stringBuilder.append("]");
        cm.g(stringBuilder.toString());
        l1 = -1L;
      } 
      String str1 = paramHttpURLConnection.getHeaderField("Content-Range");
      long l2 = l1;
      if (!TextUtils.isEmpty(str1)) {
        Matcher matcher = b.matcher(str1);
        l2 = l1;
        if (matcher.find())
          try {
            long l3 = Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1)) + 1L;
            if (l1 < 0L) {
              l2 = l3;
            } else {
              l2 = l1;
              if (l1 != l3) {
                int i = String.valueOf(str).length();
                int j = String.valueOf(str1).length();
                StringBuilder stringBuilder = new StringBuilder();
                this(i + 26 + j);
                stringBuilder.append("Inconsistent headers [");
                stringBuilder.append(str);
                stringBuilder.append("] [");
                stringBuilder.append(str1);
                stringBuilder.append("]");
                cm.i(stringBuilder.toString());
                l2 = Math.max(l1, l3);
              } 
            } 
          } catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 27);
            stringBuilder.append("Unexpected Content-Range [");
            stringBuilder.append(str1);
            stringBuilder.append("]");
            cm.g(stringBuilder.toString());
            l2 = l1;
          }  
      } 
      return l2;
    } 
    long l = -1L;
  }
  
  private final void g() {
    HttpURLConnection httpURLConnection = this.k;
    if (httpURLConnection != null) {
      try {
        httpURLConnection.disconnect();
      } catch (Exception exception) {
        cm.c("Unexpected error while disconnecting", exception);
      } 
      this.k = null;
    } 
  }
  
  public final long a(xi2 paramxi2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield j : Lcom/google/android/gms/internal/ads/xi2;
    //   5: aload_0
    //   6: lconst_0
    //   7: putfield q : J
    //   10: aload_0
    //   11: lconst_0
    //   12: putfield p : J
    //   15: new java/net/URL
    //   18: astore_2
    //   19: aload_2
    //   20: aload_1
    //   21: getfield a : Landroid/net/Uri;
    //   24: invokevirtual toString : ()Ljava/lang/String;
    //   27: invokespecial <init> : (Ljava/lang/String;)V
    //   30: aload_1
    //   31: getfield b : [B
    //   34: astore_3
    //   35: aload_1
    //   36: getfield d : J
    //   39: lstore #4
    //   41: aload_1
    //   42: getfield e : J
    //   45: lstore #6
    //   47: aload_1
    //   48: iconst_1
    //   49: invokevirtual a : (I)Z
    //   52: istore #8
    //   54: iconst_0
    //   55: istore #9
    //   57: iload #9
    //   59: iconst_1
    //   60: iadd
    //   61: istore #10
    //   63: iload #9
    //   65: bipush #20
    //   67: if_icmpgt -> 939
    //   70: aload_2
    //   71: invokevirtual openConnection : ()Ljava/net/URLConnection;
    //   74: checkcast java/net/HttpURLConnection
    //   77: astore #11
    //   79: aload #11
    //   81: instanceof javax/net/ssl/HttpsURLConnection
    //   84: ifeq -> 99
    //   87: aload #11
    //   89: checkcast javax/net/ssl/HttpsURLConnection
    //   92: aload_0
    //   93: getfield d : Ljavax/net/ssl/SSLSocketFactory;
    //   96: invokevirtual setSSLSocketFactory : (Ljavax/net/ssl/SSLSocketFactory;)V
    //   99: aload #11
    //   101: aload_0
    //   102: getfield e : I
    //   105: invokevirtual setConnectTimeout : (I)V
    //   108: aload #11
    //   110: aload_0
    //   111: getfield f : I
    //   114: invokevirtual setReadTimeout : (I)V
    //   117: aload_0
    //   118: getfield h : Lcom/google/android/gms/internal/ads/bj2;
    //   121: invokevirtual a : ()Ljava/util/Map;
    //   124: invokeinterface entrySet : ()Ljava/util/Set;
    //   129: invokeinterface iterator : ()Ljava/util/Iterator;
    //   134: astore #12
    //   136: aload #12
    //   138: invokeinterface hasNext : ()Z
    //   143: ifeq -> 186
    //   146: aload #12
    //   148: invokeinterface next : ()Ljava/lang/Object;
    //   153: checkcast java/util/Map$Entry
    //   156: astore #13
    //   158: aload #11
    //   160: aload #13
    //   162: invokeinterface getKey : ()Ljava/lang/Object;
    //   167: checkcast java/lang/String
    //   170: aload #13
    //   172: invokeinterface getValue : ()Ljava/lang/Object;
    //   177: checkcast java/lang/String
    //   180: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   183: goto -> 136
    //   186: lload #4
    //   188: lconst_0
    //   189: lcmp
    //   190: ifne -> 208
    //   193: lload #6
    //   195: ldc2_w -1
    //   198: lcmp
    //   199: ifeq -> 205
    //   202: goto -> 208
    //   205: goto -> 332
    //   208: new java/lang/StringBuilder
    //   211: astore #12
    //   213: aload #12
    //   215: bipush #27
    //   217: invokespecial <init> : (I)V
    //   220: aload #12
    //   222: ldc_w 'bytes='
    //   225: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: pop
    //   229: aload #12
    //   231: lload #4
    //   233: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload #12
    //   239: ldc_w '-'
    //   242: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   245: pop
    //   246: aload #12
    //   248: invokevirtual toString : ()Ljava/lang/String;
    //   251: astore #12
    //   253: lload #6
    //   255: ldc2_w -1
    //   258: lcmp
    //   259: ifeq -> 322
    //   262: aload #12
    //   264: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   267: astore #13
    //   269: aload #13
    //   271: invokevirtual length : ()I
    //   274: istore #9
    //   276: new java/lang/StringBuilder
    //   279: astore #12
    //   281: aload #12
    //   283: iload #9
    //   285: bipush #20
    //   287: iadd
    //   288: invokespecial <init> : (I)V
    //   291: aload #12
    //   293: aload #13
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: pop
    //   299: aload #12
    //   301: lload #4
    //   303: lload #6
    //   305: ladd
    //   306: lconst_1
    //   307: lsub
    //   308: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   311: pop
    //   312: aload #12
    //   314: invokevirtual toString : ()Ljava/lang/String;
    //   317: astore #12
    //   319: goto -> 322
    //   322: aload #11
    //   324: ldc_w 'Range'
    //   327: aload #12
    //   329: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   332: aload #11
    //   334: ldc_w 'User-Agent'
    //   337: aload_0
    //   338: getfield g : Ljava/lang/String;
    //   341: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   344: iload #8
    //   346: ifne -> 360
    //   349: aload #11
    //   351: ldc_w 'Accept-Encoding'
    //   354: ldc_w 'identity'
    //   357: invokevirtual setRequestProperty : (Ljava/lang/String;Ljava/lang/String;)V
    //   360: aload #11
    //   362: iconst_0
    //   363: invokevirtual setInstanceFollowRedirects : (Z)V
    //   366: aload_3
    //   367: ifnull -> 376
    //   370: iconst_1
    //   371: istore #14
    //   373: goto -> 379
    //   376: iconst_0
    //   377: istore #14
    //   379: aload #11
    //   381: iload #14
    //   383: invokevirtual setDoOutput : (Z)V
    //   386: aload_3
    //   387: ifnull -> 436
    //   390: aload #11
    //   392: ldc_w 'POST'
    //   395: invokevirtual setRequestMethod : (Ljava/lang/String;)V
    //   398: aload_3
    //   399: arraylength
    //   400: ifeq -> 436
    //   403: aload #11
    //   405: aload_3
    //   406: arraylength
    //   407: invokevirtual setFixedLengthStreamingMode : (I)V
    //   410: aload #11
    //   412: invokevirtual connect : ()V
    //   415: aload #11
    //   417: invokevirtual getOutputStream : ()Ljava/io/OutputStream;
    //   420: astore #12
    //   422: aload #12
    //   424: aload_3
    //   425: invokevirtual write : ([B)V
    //   428: aload #12
    //   430: invokevirtual close : ()V
    //   433: goto -> 441
    //   436: aload #11
    //   438: invokevirtual connect : ()V
    //   441: aload #11
    //   443: invokevirtual getResponseCode : ()I
    //   446: istore #9
    //   448: iload #9
    //   450: sipush #300
    //   453: if_icmpeq -> 810
    //   456: iload #9
    //   458: sipush #301
    //   461: if_icmpeq -> 810
    //   464: iload #9
    //   466: sipush #302
    //   469: if_icmpeq -> 810
    //   472: iload #9
    //   474: sipush #303
    //   477: if_icmpeq -> 810
    //   480: aload_3
    //   481: ifnonnull -> 503
    //   484: iload #9
    //   486: sipush #307
    //   489: if_icmpeq -> 810
    //   492: iload #9
    //   494: sipush #308
    //   497: if_icmpne -> 503
    //   500: goto -> 810
    //   503: aload_0
    //   504: aload #11
    //   506: putfield k : Ljava/net/HttpURLConnection;
    //   509: aload #11
    //   511: invokevirtual getResponseCode : ()I
    //   514: istore #9
    //   516: iload #9
    //   518: sipush #200
    //   521: if_icmplt -> 706
    //   524: iload #9
    //   526: sipush #299
    //   529: if_icmple -> 535
    //   532: goto -> 706
    //   535: iload #9
    //   537: sipush #200
    //   540: if_icmpne -> 559
    //   543: aload_1
    //   544: getfield d : J
    //   547: lstore #4
    //   549: lload #4
    //   551: lconst_0
    //   552: lcmp
    //   553: ifeq -> 559
    //   556: goto -> 562
    //   559: lconst_0
    //   560: lstore #4
    //   562: aload_0
    //   563: lload #4
    //   565: putfield n : J
    //   568: aload_1
    //   569: iconst_1
    //   570: invokevirtual a : (I)Z
    //   573: ifne -> 644
    //   576: aload_1
    //   577: getfield e : J
    //   580: lstore #4
    //   582: lload #4
    //   584: ldc2_w -1
    //   587: lcmp
    //   588: ifeq -> 600
    //   591: aload_0
    //   592: lload #4
    //   594: putfield o : J
    //   597: goto -> 652
    //   600: aload_0
    //   601: getfield k : Ljava/net/HttpURLConnection;
    //   604: invokestatic f : (Ljava/net/HttpURLConnection;)J
    //   607: lstore #4
    //   609: lload #4
    //   611: ldc2_w -1
    //   614: lcmp
    //   615: ifeq -> 630
    //   618: lload #4
    //   620: aload_0
    //   621: getfield n : J
    //   624: lsub
    //   625: lstore #4
    //   627: goto -> 635
    //   630: ldc2_w -1
    //   633: lstore #4
    //   635: aload_0
    //   636: lload #4
    //   638: putfield o : J
    //   641: goto -> 652
    //   644: aload_0
    //   645: aload_1
    //   646: getfield e : J
    //   649: putfield o : J
    //   652: aload_0
    //   653: aload_0
    //   654: getfield k : Ljava/net/HttpURLConnection;
    //   657: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   660: putfield l : Ljava/io/InputStream;
    //   663: aload_0
    //   664: iconst_1
    //   665: putfield m : Z
    //   668: aload_0
    //   669: getfield i : Lcom/google/android/gms/internal/ads/hj2;
    //   672: astore_2
    //   673: aload_2
    //   674: ifnull -> 685
    //   677: aload_2
    //   678: aload_0
    //   679: aload_1
    //   680: invokeinterface k : (Ljava/lang/Object;Lcom/google/android/gms/internal/ads/xi2;)V
    //   685: aload_0
    //   686: getfield o : J
    //   689: lreturn
    //   690: astore_2
    //   691: aload_0
    //   692: invokespecial g : ()V
    //   695: new com/google/android/gms/internal/ads/zzov
    //   698: dup
    //   699: aload_2
    //   700: aload_1
    //   701: iconst_1
    //   702: invokespecial <init> : (Ljava/io/IOException;Lcom/google/android/gms/internal/ads/xi2;I)V
    //   705: athrow
    //   706: aload_0
    //   707: getfield k : Ljava/net/HttpURLConnection;
    //   710: invokevirtual getHeaderFields : ()Ljava/util/Map;
    //   713: astore_2
    //   714: aload_0
    //   715: invokespecial g : ()V
    //   718: new com/google/android/gms/internal/ads/zzoy
    //   721: dup
    //   722: iload #9
    //   724: aload_2
    //   725: aload_1
    //   726: invokespecial <init> : (ILjava/util/Map;Lcom/google/android/gms/internal/ads/xi2;)V
    //   729: astore_1
    //   730: iload #9
    //   732: sipush #416
    //   735: if_icmpne -> 751
    //   738: aload_1
    //   739: new com/google/android/gms/internal/ads/zzop
    //   742: dup
    //   743: iconst_0
    //   744: invokespecial <init> : (I)V
    //   747: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   750: pop
    //   751: aload_1
    //   752: athrow
    //   753: astore_3
    //   754: aload_0
    //   755: invokespecial g : ()V
    //   758: aload_1
    //   759: getfield a : Landroid/net/Uri;
    //   762: invokevirtual toString : ()Ljava/lang/String;
    //   765: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   768: astore_2
    //   769: aload_2
    //   770: invokevirtual length : ()I
    //   773: ifeq -> 787
    //   776: ldc_w 'Unable to connect to '
    //   779: aload_2
    //   780: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   783: astore_2
    //   784: goto -> 798
    //   787: new java/lang/String
    //   790: dup
    //   791: ldc_w 'Unable to connect to '
    //   794: invokespecial <init> : (Ljava/lang/String;)V
    //   797: astore_2
    //   798: new com/google/android/gms/internal/ads/zzov
    //   801: dup
    //   802: aload_2
    //   803: aload_3
    //   804: aload_1
    //   805: iconst_1
    //   806: invokespecial <init> : (Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/xi2;I)V
    //   809: athrow
    //   810: aload #11
    //   812: ldc_w 'Location'
    //   815: invokevirtual getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   818: astore #12
    //   820: aload #11
    //   822: invokevirtual disconnect : ()V
    //   825: aload #12
    //   827: ifnull -> 926
    //   830: new java/net/URL
    //   833: astore_3
    //   834: aload_3
    //   835: aload_2
    //   836: aload #12
    //   838: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   841: aload_3
    //   842: invokevirtual getProtocol : ()Ljava/lang/String;
    //   845: astore_2
    //   846: ldc_w 'https'
    //   849: aload_2
    //   850: invokevirtual equals : (Ljava/lang/Object;)Z
    //   853: ifne -> 911
    //   856: ldc_w 'http'
    //   859: aload_2
    //   860: invokevirtual equals : (Ljava/lang/Object;)Z
    //   863: ifne -> 911
    //   866: new java/net/ProtocolException
    //   869: astore_3
    //   870: aload_2
    //   871: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   874: astore_2
    //   875: aload_2
    //   876: invokevirtual length : ()I
    //   879: ifeq -> 893
    //   882: ldc_w 'Unsupported protocol redirect: '
    //   885: aload_2
    //   886: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   889: astore_2
    //   890: goto -> 904
    //   893: new java/lang/String
    //   896: dup
    //   897: ldc_w 'Unsupported protocol redirect: '
    //   900: invokespecial <init> : (Ljava/lang/String;)V
    //   903: astore_2
    //   904: aload_3
    //   905: aload_2
    //   906: invokespecial <init> : (Ljava/lang/String;)V
    //   909: aload_3
    //   910: athrow
    //   911: aconst_null
    //   912: astore #12
    //   914: aload_3
    //   915: astore_2
    //   916: iload #10
    //   918: istore #9
    //   920: aload #12
    //   922: astore_3
    //   923: goto -> 57
    //   926: new java/net/ProtocolException
    //   929: astore_2
    //   930: aload_2
    //   931: ldc_w 'Null location redirect'
    //   934: invokespecial <init> : (Ljava/lang/String;)V
    //   937: aload_2
    //   938: athrow
    //   939: new java/net/NoRouteToHostException
    //   942: astore_2
    //   943: new java/lang/StringBuilder
    //   946: astore_3
    //   947: aload_3
    //   948: bipush #31
    //   950: invokespecial <init> : (I)V
    //   953: aload_3
    //   954: ldc_w 'Too many redirects: '
    //   957: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   960: pop
    //   961: aload_3
    //   962: iload #10
    //   964: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   967: pop
    //   968: aload_2
    //   969: aload_3
    //   970: invokevirtual toString : ()Ljava/lang/String;
    //   973: invokespecial <init> : (Ljava/lang/String;)V
    //   976: aload_2
    //   977: athrow
    //   978: astore_3
    //   979: aload_1
    //   980: getfield a : Landroid/net/Uri;
    //   983: invokevirtual toString : ()Ljava/lang/String;
    //   986: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   989: astore_2
    //   990: aload_2
    //   991: invokevirtual length : ()I
    //   994: ifeq -> 1008
    //   997: ldc_w 'Unable to connect to '
    //   1000: aload_2
    //   1001: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1004: astore_2
    //   1005: goto -> 1019
    //   1008: new java/lang/String
    //   1011: dup
    //   1012: ldc_w 'Unable to connect to '
    //   1015: invokespecial <init> : (Ljava/lang/String;)V
    //   1018: astore_2
    //   1019: new com/google/android/gms/internal/ads/zzov
    //   1022: dup
    //   1023: aload_2
    //   1024: aload_3
    //   1025: aload_1
    //   1026: iconst_1
    //   1027: invokespecial <init> : (Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/xi2;I)V
    //   1030: astore_1
    //   1031: goto -> 1036
    //   1034: aload_1
    //   1035: athrow
    //   1036: goto -> 1034
    // Exception table:
    //   from	to	target	type
    //   15	54	978	java/io/IOException
    //   70	99	978	java/io/IOException
    //   99	136	978	java/io/IOException
    //   136	183	978	java/io/IOException
    //   208	253	978	java/io/IOException
    //   262	319	978	java/io/IOException
    //   322	332	978	java/io/IOException
    //   332	344	978	java/io/IOException
    //   349	360	978	java/io/IOException
    //   360	366	978	java/io/IOException
    //   379	386	978	java/io/IOException
    //   390	433	978	java/io/IOException
    //   436	441	978	java/io/IOException
    //   441	448	978	java/io/IOException
    //   503	509	978	java/io/IOException
    //   509	516	753	java/io/IOException
    //   652	663	690	java/io/IOException
    //   810	825	978	java/io/IOException
    //   830	890	978	java/io/IOException
    //   893	904	978	java/io/IOException
    //   904	911	978	java/io/IOException
    //   926	939	978	java/io/IOException
    //   939	978	978	java/io/IOException
  }
  
  final void b(int paramInt) {
    this.r = paramInt;
    for (Socket socket : this.s) {
      if (!socket.isClosed())
        try {
          socket.setReceiveBufferSize(this.r);
        } catch (SocketException socketException) {
          cm.d("Failed to update receive buffer size.", socketException);
        }  
    } 
  }
  
  public final void close() {
    try {
      if (this.l != null) {
        HttpURLConnection httpURLConnection = this.k;
        long l = this.o;
        if (l != -1L)
          l -= this.q; 
        int i = wj2.a;
        if (i == 19 || i == 20)
          try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if ((l == -1L) ? (inputStream.read() == -1) : (l <= 2048L)) {
              String str = inputStream.getClass().getName();
              if (str.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || str.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                Method method = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                method.setAccessible(true);
                method.invoke(inputStream, new Object[0]);
              } 
            } 
          } catch (Exception exception) {} 
        try {
          this.l.close();
        } catch (IOException iOException) {
          zzov zzov = new zzov();
          this(iOException, this.j, 3);
          throw zzov;
        } 
      } 
      return;
    } finally {
      this.l = null;
      g();
      if (this.m) {
        this.m = false;
        hj2<? super uo> hj21 = this.i;
        if (hj21 != null)
          hj21.c(this); 
      } 
      this.s.clear();
    } 
  }
  
  public final Uri e0() {
    HttpURLConnection httpURLConnection = this.k;
    return (httpURLConnection == null) ? null : Uri.parse(httpURLConnection.getURL().toString());
  }
  
  public final Map<String, List<String>> getResponseHeaders() {
    HttpURLConnection httpURLConnection = this.k;
    return (httpURLConnection == null) ? null : httpURLConnection.getHeaderFields();
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      InterruptedIOException interruptedIOException;
      if (this.p != this.n) {
        byte[] arrayOfByte1 = c.getAndSet(null);
        byte[] arrayOfByte2 = arrayOfByte1;
        if (arrayOfByte1 == null)
          arrayOfByte2 = new byte[4096]; 
        while (true) {
          long l1 = this.p;
          long l2 = this.n;
          if (l1 != l2) {
            int j = (int)Math.min(l2 - l1, arrayOfByte2.length);
            j = this.l.read(arrayOfByte2, 0, j);
            if (!Thread.interrupted()) {
              if (j != -1) {
                this.p += j;
                hj2<? super uo> hj22 = this.i;
                if (hj22 != null)
                  hj22.v(this, j); 
                continue;
              } 
              EOFException eOFException = new EOFException();
              this();
              throw eOFException;
            } 
            interruptedIOException = new InterruptedIOException();
            this();
            throw interruptedIOException;
          } 
          c.set(arrayOfByte2);
          break;
        } 
      } 
      if (paramInt2 == 0)
        return 0; 
      long l = this.o;
      int i = paramInt2;
      if (l != -1L) {
        l -= this.q;
        if (l == 0L)
          return -1; 
        i = (int)Math.min(paramInt2, l);
      } 
      paramInt1 = this.l.read((byte[])interruptedIOException, paramInt1, i);
      if (paramInt1 == -1) {
        if (this.o == -1L)
          return -1; 
        EOFException eOFException = new EOFException();
        this();
        throw eOFException;
      } 
      this.q += paramInt1;
      hj2<? super uo> hj21 = this.i;
      if (hj21 != null)
        hj21.v(this, paramInt1); 
      return paramInt1;
    } catch (IOException iOException) {
      iOException = new zzov(iOException, this.j, 2);
      throw iOException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/uo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */