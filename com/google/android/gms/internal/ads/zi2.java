package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zi2 implements yi2 {
  private static final Pattern b = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  
  private static final AtomicReference<byte[]> c = (AtomicReference)new AtomicReference<byte>();
  
  private final boolean d;
  
  private final int e;
  
  private final int f;
  
  private final String g;
  
  private final sj2<String> h;
  
  private final bj2 i;
  
  private final bj2 j;
  
  private final hj2<? super zi2> k;
  
  private xi2 l;
  
  private HttpURLConnection m;
  
  private InputStream n;
  
  private boolean o;
  
  private long p;
  
  private long q;
  
  private long r;
  
  private long s;
  
  public zi2(String paramString, sj2<String> paramsj2, hj2<? super zi2> paramhj2, int paramInt1, int paramInt2, boolean paramBoolean, bj2 parambj2) {
    this.g = jj2.c(paramString);
    this.h = null;
    this.k = paramhj2;
    this.j = new bj2();
    this.e = paramInt1;
    this.f = paramInt2;
    this.d = true;
    this.i = null;
  }
  
  private final HttpURLConnection b(URL paramURL, byte[] paramArrayOfbyte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2) {
    HttpURLConnection httpURLConnection = (HttpURLConnection)paramURL.openConnection();
    httpURLConnection.setConnectTimeout(this.e);
    httpURLConnection.setReadTimeout(this.f);
    for (Map.Entry<String, String> entry : this.j.a().entrySet())
      httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()); 
    if (paramLong1 != 0L || paramLong2 != -1L) {
      StringBuilder stringBuilder = new StringBuilder(27);
      stringBuilder.append("bytes=");
      stringBuilder.append(paramLong1);
      stringBuilder.append("-");
      String str2 = stringBuilder.toString();
      String str1 = str2;
      if (paramLong2 != -1L) {
        str1 = String.valueOf(str2);
        StringBuilder stringBuilder1 = new StringBuilder(str1.length() + 20);
        stringBuilder1.append(str1);
        stringBuilder1.append(paramLong1 + paramLong2 - 1L);
        str1 = stringBuilder1.toString();
      } 
      httpURLConnection.setRequestProperty("Range", str1);
    } 
    httpURLConnection.setRequestProperty("User-Agent", this.g);
    if (!paramBoolean1)
      httpURLConnection.setRequestProperty("Accept-Encoding", "identity"); 
    httpURLConnection.setInstanceFollowRedirects(paramBoolean2);
    if (paramArrayOfbyte != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    httpURLConnection.setDoOutput(paramBoolean1);
    if (paramArrayOfbyte != null) {
      httpURLConnection.setRequestMethod("POST");
      if (paramArrayOfbyte.length != 0) {
        httpURLConnection.setFixedLengthStreamingMode(paramArrayOfbyte.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(paramArrayOfbyte);
        outputStream.close();
        return httpURLConnection;
      } 
    } 
    httpURLConnection.connect();
    return httpURLConnection;
  }
  
  private static long c(HttpURLConnection paramHttpURLConnection) {
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
        Log.e("DefaultHttpDataSource", stringBuilder.toString());
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
                Log.w("DefaultHttpDataSource", stringBuilder.toString());
                l2 = Math.max(l1, l3);
              } 
            } 
          } catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 27);
            stringBuilder.append("Unexpected Content-Range [");
            stringBuilder.append(str1);
            stringBuilder.append("]");
            Log.e("DefaultHttpDataSource", stringBuilder.toString());
            l2 = l1;
          }  
      } 
      return l2;
    } 
    long l = -1L;
  }
  
  private final void d() {
    HttpURLConnection httpURLConnection = this.m;
    if (httpURLConnection != null) {
      try {
        httpURLConnection.disconnect();
      } catch (Exception exception) {
        Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", exception);
      } 
      this.m = null;
    } 
  }
  
  public final long a(xi2 paramxi2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: putfield l : Lcom/google/android/gms/internal/ads/xi2;
    //   5: lconst_0
    //   6: lstore_2
    //   7: aload_0
    //   8: lconst_0
    //   9: putfield s : J
    //   12: aload_0
    //   13: lconst_0
    //   14: putfield r : J
    //   17: new java/net/URL
    //   20: astore #4
    //   22: aload #4
    //   24: aload_1
    //   25: getfield a : Landroid/net/Uri;
    //   28: invokevirtual toString : ()Ljava/lang/String;
    //   31: invokespecial <init> : (Ljava/lang/String;)V
    //   34: aload_1
    //   35: getfield b : [B
    //   38: astore #5
    //   40: aload_1
    //   41: getfield d : J
    //   44: lstore #6
    //   46: aload_1
    //   47: getfield e : J
    //   50: lstore #8
    //   52: aload_1
    //   53: iconst_1
    //   54: invokevirtual a : (I)Z
    //   57: istore #10
    //   59: aload_0
    //   60: getfield d : Z
    //   63: ifne -> 86
    //   66: aload_0
    //   67: aload #4
    //   69: aload #5
    //   71: lload #6
    //   73: lload #8
    //   75: iload #10
    //   77: iconst_1
    //   78: invokespecial b : (Ljava/net/URL;[BJJZZ)Ljava/net/HttpURLConnection;
    //   81: astore #4
    //   83: goto -> 186
    //   86: iconst_0
    //   87: istore #11
    //   89: iload #11
    //   91: iconst_1
    //   92: iadd
    //   93: istore #12
    //   95: iload #11
    //   97: bipush #20
    //   99: if_icmpgt -> 665
    //   102: aload_0
    //   103: aload #4
    //   105: aload #5
    //   107: lload #6
    //   109: lload #8
    //   111: iload #10
    //   113: iconst_0
    //   114: invokespecial b : (Ljava/net/URL;[BJJZZ)Ljava/net/HttpURLConnection;
    //   117: astore #13
    //   119: aload #13
    //   121: invokevirtual getResponseCode : ()I
    //   124: istore #11
    //   126: iload #11
    //   128: sipush #300
    //   131: if_icmpeq -> 517
    //   134: iload #11
    //   136: sipush #301
    //   139: if_icmpeq -> 517
    //   142: iload #11
    //   144: sipush #302
    //   147: if_icmpeq -> 517
    //   150: iload #11
    //   152: sipush #303
    //   155: if_icmpeq -> 517
    //   158: aload #5
    //   160: ifnonnull -> 182
    //   163: iload #11
    //   165: sipush #307
    //   168: if_icmpeq -> 517
    //   171: iload #11
    //   173: sipush #308
    //   176: if_icmpne -> 182
    //   179: goto -> 517
    //   182: aload #13
    //   184: astore #4
    //   186: aload_0
    //   187: aload #4
    //   189: putfield m : Ljava/net/HttpURLConnection;
    //   192: aload #4
    //   194: invokevirtual getResponseCode : ()I
    //   197: istore #11
    //   199: iload #11
    //   201: sipush #200
    //   204: if_icmplt -> 403
    //   207: iload #11
    //   209: sipush #299
    //   212: if_icmple -> 218
    //   215: goto -> 403
    //   218: aload_0
    //   219: getfield m : Ljava/net/HttpURLConnection;
    //   222: invokevirtual getContentType : ()Ljava/lang/String;
    //   225: pop
    //   226: lload_2
    //   227: lstore #6
    //   229: iload #11
    //   231: sipush #200
    //   234: if_icmpne -> 257
    //   237: aload_1
    //   238: getfield d : J
    //   241: lstore #8
    //   243: lload_2
    //   244: lstore #6
    //   246: lload #8
    //   248: lconst_0
    //   249: lcmp
    //   250: ifeq -> 257
    //   253: lload #8
    //   255: lstore #6
    //   257: aload_0
    //   258: lload #6
    //   260: putfield p : J
    //   263: aload_1
    //   264: iconst_1
    //   265: invokevirtual a : (I)Z
    //   268: ifne -> 336
    //   271: aload_1
    //   272: getfield e : J
    //   275: lstore #8
    //   277: ldc2_w -1
    //   280: lstore #6
    //   282: lload #8
    //   284: ldc2_w -1
    //   287: lcmp
    //   288: ifeq -> 300
    //   291: aload_0
    //   292: lload #8
    //   294: putfield q : J
    //   297: goto -> 344
    //   300: aload_0
    //   301: getfield m : Ljava/net/HttpURLConnection;
    //   304: invokestatic c : (Ljava/net/HttpURLConnection;)J
    //   307: lstore #8
    //   309: lload #8
    //   311: ldc2_w -1
    //   314: lcmp
    //   315: ifeq -> 327
    //   318: lload #8
    //   320: aload_0
    //   321: getfield p : J
    //   324: lsub
    //   325: lstore #6
    //   327: aload_0
    //   328: lload #6
    //   330: putfield q : J
    //   333: goto -> 344
    //   336: aload_0
    //   337: aload_1
    //   338: getfield e : J
    //   341: putfield q : J
    //   344: aload_0
    //   345: aload_0
    //   346: getfield m : Ljava/net/HttpURLConnection;
    //   349: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   352: putfield n : Ljava/io/InputStream;
    //   355: aload_0
    //   356: iconst_1
    //   357: putfield o : Z
    //   360: aload_0
    //   361: getfield k : Lcom/google/android/gms/internal/ads/hj2;
    //   364: astore #4
    //   366: aload #4
    //   368: ifnull -> 380
    //   371: aload #4
    //   373: aload_0
    //   374: aload_1
    //   375: invokeinterface k : (Ljava/lang/Object;Lcom/google/android/gms/internal/ads/xi2;)V
    //   380: aload_0
    //   381: getfield q : J
    //   384: lreturn
    //   385: astore #4
    //   387: aload_0
    //   388: invokespecial d : ()V
    //   391: new com/google/android/gms/internal/ads/zzov
    //   394: dup
    //   395: aload #4
    //   397: aload_1
    //   398: iconst_1
    //   399: invokespecial <init> : (Ljava/io/IOException;Lcom/google/android/gms/internal/ads/xi2;I)V
    //   402: athrow
    //   403: aload_0
    //   404: getfield m : Ljava/net/HttpURLConnection;
    //   407: invokevirtual getHeaderFields : ()Ljava/util/Map;
    //   410: astore #4
    //   412: aload_0
    //   413: invokespecial d : ()V
    //   416: new com/google/android/gms/internal/ads/zzoy
    //   419: dup
    //   420: iload #11
    //   422: aload #4
    //   424: aload_1
    //   425: invokespecial <init> : (ILjava/util/Map;Lcom/google/android/gms/internal/ads/xi2;)V
    //   428: astore_1
    //   429: iload #11
    //   431: sipush #416
    //   434: if_icmpne -> 450
    //   437: aload_1
    //   438: new com/google/android/gms/internal/ads/zzop
    //   441: dup
    //   442: iconst_0
    //   443: invokespecial <init> : (I)V
    //   446: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   449: pop
    //   450: aload_1
    //   451: athrow
    //   452: astore #5
    //   454: aload_0
    //   455: invokespecial d : ()V
    //   458: aload_1
    //   459: getfield a : Landroid/net/Uri;
    //   462: invokevirtual toString : ()Ljava/lang/String;
    //   465: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   468: astore #4
    //   470: aload #4
    //   472: invokevirtual length : ()I
    //   475: ifeq -> 491
    //   478: ldc_w 'Unable to connect to '
    //   481: aload #4
    //   483: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   486: astore #4
    //   488: goto -> 503
    //   491: new java/lang/String
    //   494: dup
    //   495: ldc_w 'Unable to connect to '
    //   498: invokespecial <init> : (Ljava/lang/String;)V
    //   501: astore #4
    //   503: new com/google/android/gms/internal/ads/zzov
    //   506: dup
    //   507: aload #4
    //   509: aload #5
    //   511: aload_1
    //   512: iconst_1
    //   513: invokespecial <init> : (Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/xi2;I)V
    //   516: athrow
    //   517: aconst_null
    //   518: astore #5
    //   520: aload #13
    //   522: ldc_w 'Location'
    //   525: invokevirtual getHeaderField : (Ljava/lang/String;)Ljava/lang/String;
    //   528: astore #14
    //   530: aload #13
    //   532: invokevirtual disconnect : ()V
    //   535: aload #14
    //   537: ifnull -> 649
    //   540: new java/net/URL
    //   543: astore #13
    //   545: aload #13
    //   547: aload #4
    //   549: aload #14
    //   551: invokespecial <init> : (Ljava/net/URL;Ljava/lang/String;)V
    //   554: aload #13
    //   556: invokevirtual getProtocol : ()Ljava/lang/String;
    //   559: astore #4
    //   561: ldc_w 'https'
    //   564: aload #4
    //   566: invokevirtual equals : (Ljava/lang/Object;)Z
    //   569: ifne -> 638
    //   572: ldc_w 'http'
    //   575: aload #4
    //   577: invokevirtual equals : (Ljava/lang/Object;)Z
    //   580: ifne -> 638
    //   583: new java/net/ProtocolException
    //   586: astore #5
    //   588: aload #4
    //   590: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   593: astore #4
    //   595: aload #4
    //   597: invokevirtual length : ()I
    //   600: ifeq -> 616
    //   603: ldc_w 'Unsupported protocol redirect: '
    //   606: aload #4
    //   608: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   611: astore #4
    //   613: goto -> 628
    //   616: new java/lang/String
    //   619: dup
    //   620: ldc_w 'Unsupported protocol redirect: '
    //   623: invokespecial <init> : (Ljava/lang/String;)V
    //   626: astore #4
    //   628: aload #5
    //   630: aload #4
    //   632: invokespecial <init> : (Ljava/lang/String;)V
    //   635: aload #5
    //   637: athrow
    //   638: iload #12
    //   640: istore #11
    //   642: aload #13
    //   644: astore #4
    //   646: goto -> 89
    //   649: new java/net/ProtocolException
    //   652: astore #4
    //   654: aload #4
    //   656: ldc_w 'Null location redirect'
    //   659: invokespecial <init> : (Ljava/lang/String;)V
    //   662: aload #4
    //   664: athrow
    //   665: new java/net/NoRouteToHostException
    //   668: astore #5
    //   670: new java/lang/StringBuilder
    //   673: astore #4
    //   675: aload #4
    //   677: bipush #31
    //   679: invokespecial <init> : (I)V
    //   682: aload #4
    //   684: ldc_w 'Too many redirects: '
    //   687: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   690: pop
    //   691: aload #4
    //   693: iload #12
    //   695: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   698: pop
    //   699: aload #5
    //   701: aload #4
    //   703: invokevirtual toString : ()Ljava/lang/String;
    //   706: invokespecial <init> : (Ljava/lang/String;)V
    //   709: aload #5
    //   711: athrow
    //   712: astore #5
    //   714: aload_1
    //   715: getfield a : Landroid/net/Uri;
    //   718: invokevirtual toString : ()Ljava/lang/String;
    //   721: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   724: astore #4
    //   726: aload #4
    //   728: invokevirtual length : ()I
    //   731: ifeq -> 747
    //   734: ldc_w 'Unable to connect to '
    //   737: aload #4
    //   739: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   742: astore #4
    //   744: goto -> 759
    //   747: new java/lang/String
    //   750: dup
    //   751: ldc_w 'Unable to connect to '
    //   754: invokespecial <init> : (Ljava/lang/String;)V
    //   757: astore #4
    //   759: new com/google/android/gms/internal/ads/zzov
    //   762: dup
    //   763: aload #4
    //   765: aload #5
    //   767: aload_1
    //   768: iconst_1
    //   769: invokespecial <init> : (Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/gms/internal/ads/xi2;I)V
    //   772: astore_1
    //   773: goto -> 778
    //   776: aload_1
    //   777: athrow
    //   778: goto -> 776
    // Exception table:
    //   from	to	target	type
    //   17	83	712	java/io/IOException
    //   102	126	712	java/io/IOException
    //   186	192	712	java/io/IOException
    //   192	199	452	java/io/IOException
    //   344	355	385	java/io/IOException
    //   520	535	712	java/io/IOException
    //   540	613	712	java/io/IOException
    //   616	628	712	java/io/IOException
    //   628	638	712	java/io/IOException
    //   649	665	712	java/io/IOException
    //   665	712	712	java/io/IOException
  }
  
  public final void close() {
    try {
      if (this.n != null) {
        HttpURLConnection httpURLConnection = this.m;
        long l = this.q;
        if (l != -1L)
          l -= this.s; 
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
          this.n.close();
        } catch (IOException iOException) {
          zzov zzov = new zzov();
          this(iOException, this.l, 3);
          throw zzov;
        } 
      } 
      return;
    } finally {
      this.n = null;
      d();
      if (this.o) {
        this.o = false;
        hj2<? super zi2> hj21 = this.k;
        if (hj21 != null)
          hj21.c(this); 
      } 
    } 
  }
  
  public final Uri e0() {
    HttpURLConnection httpURLConnection = this.m;
    return (httpURLConnection == null) ? null : Uri.parse(httpURLConnection.getURL().toString());
  }
  
  public final Map<String, List<String>> getResponseHeaders() {
    HttpURLConnection httpURLConnection = this.m;
    return (httpURLConnection == null) ? null : httpURLConnection.getHeaderFields();
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      InterruptedIOException interruptedIOException;
      if (this.r != this.p) {
        byte[] arrayOfByte1 = c.getAndSet(null);
        byte[] arrayOfByte2 = arrayOfByte1;
        if (arrayOfByte1 == null)
          arrayOfByte2 = new byte[4096]; 
        while (true) {
          long l1 = this.r;
          long l2 = this.p;
          if (l1 != l2) {
            int j = (int)Math.min(l2 - l1, arrayOfByte2.length);
            j = this.n.read(arrayOfByte2, 0, j);
            if (!Thread.interrupted()) {
              if (j != -1) {
                this.r += j;
                hj2<? super zi2> hj22 = this.k;
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
      long l = this.q;
      int i = paramInt2;
      if (l != -1L) {
        l -= this.s;
        if (l == 0L)
          return -1; 
        i = (int)Math.min(paramInt2, l);
      } 
      paramInt1 = this.n.read((byte[])interruptedIOException, paramInt1, i);
      if (paramInt1 == -1) {
        if (this.q == -1L)
          return -1; 
        EOFException eOFException = new EOFException();
        this();
        throw eOFException;
      } 
      this.s += paramInt1;
      hj2<? super zi2> hj21 = this.k;
      if (hj21 != null)
        hj21.v(this, paramInt1); 
      return paramInt1;
    } catch (IOException iOException) {
      iOException = new zzov(iOException, this.l, 2);
      throw iOException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */