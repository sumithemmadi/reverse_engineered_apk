package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.x;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

public class q extends g implements HttpDataSource {
  private static final Pattern f = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  
  private static final AtomicReference<byte[]> g = (AtomicReference)new AtomicReference<byte>();
  
  private final boolean h;
  
  private final int i;
  
  private final int j;
  
  private final String k;
  
  private final HttpDataSource.b l;
  
  private final HttpDataSource.b m;
  
  private x<String> n;
  
  private l o;
  
  private HttpURLConnection p;
  
  private InputStream q;
  
  private boolean r;
  
  private int s;
  
  private long t;
  
  private long u;
  
  private long v;
  
  private long w;
  
  public q(String paramString, int paramInt1, int paramInt2, boolean paramBoolean, HttpDataSource.b paramb) {
    super(true);
    this.k = e.d(paramString);
    this.m = new HttpDataSource.b();
    this.i = paramInt1;
    this.j = paramInt2;
    this.h = paramBoolean;
    this.l = paramb;
  }
  
  private void f() {
    HttpURLConnection httpURLConnection = this.p;
    if (httpURLConnection != null) {
      try {
        httpURLConnection.disconnect();
      } catch (Exception exception) {
        o.d("DefaultHttpDataSource", "Unexpected error while disconnecting", exception);
      } 
      this.p = null;
    } 
  }
  
  private static long g(HttpURLConnection paramHttpURLConnection) {
    String str = paramHttpURLConnection.getHeaderField("Content-Length");
    if (!TextUtils.isEmpty(str)) {
      long l2;
      try {
        l2 = Long.parseLong(str);
      } catch (NumberFormatException numberFormatException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected Content-Length [");
        stringBuilder.append(str);
        stringBuilder.append("]");
        o.c("DefaultHttpDataSource", stringBuilder.toString());
        l2 = -1L;
      } 
      String str1 = paramHttpURLConnection.getHeaderField("Content-Range");
      long l3 = l2;
      if (!TextUtils.isEmpty(str1)) {
        Matcher matcher = f.matcher(str1);
        l3 = l2;
        if (matcher.find())
          try {
            long l4 = Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1)) + 1L;
            if (l2 < 0L) {
              l3 = l4;
            } else {
              l3 = l2;
              if (l2 != l4) {
                StringBuilder stringBuilder = new StringBuilder();
                this();
                stringBuilder.append("Inconsistent headers [");
                stringBuilder.append(str);
                stringBuilder.append("] [");
                stringBuilder.append(str1);
                stringBuilder.append("]");
                o.f("DefaultHttpDataSource", stringBuilder.toString());
                l3 = Math.max(l2, l4);
              } 
            } 
          } catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected Content-Range [");
            stringBuilder.append(str1);
            stringBuilder.append("]");
            o.c("DefaultHttpDataSource", stringBuilder.toString());
            l3 = l2;
          }  
      } 
      return l3;
    } 
    long l1 = -1L;
  }
  
  private static URL h(URL paramURL, String paramString) {
    if (paramString != null) {
      URL uRL = new URL(paramURL, paramString);
      String str = uRL.getProtocol();
      if ("https".equals(str) || "http".equals(str))
        return uRL; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unsupported protocol redirect: ");
      stringBuilder.append(str);
      throw new ProtocolException(stringBuilder.toString());
    } 
    throw new ProtocolException("Null location redirect");
  }
  
  private static boolean i(HttpURLConnection paramHttpURLConnection) {
    return "gzip".equalsIgnoreCase(paramHttpURLConnection.getHeaderField("Content-Encoding"));
  }
  
  private HttpURLConnection j(l paraml) {
    l l1 = paraml;
    URL uRL = new URL(l1.a.toString());
    int i = l1.b;
    byte[] arrayOfByte = l1.c;
    long l2 = l1.f;
    long l3 = l1.g;
    boolean bool = l1.d(1);
    if (!this.h)
      return k(uRL, i, arrayOfByte, l2, l3, bool, true, l1.d); 
    int j = 0;
    while (true) {
      int k = j + 1;
      if (j <= 20) {
        byte[] arrayOfByte2;
        URL uRL2;
        Map<String, String> map = paraml.d;
        byte[] arrayOfByte1 = arrayOfByte;
        HttpURLConnection httpURLConnection = k(uRL, i, arrayOfByte, l2, l3, bool, false, map);
        j = httpURLConnection.getResponseCode();
        String str = httpURLConnection.getHeaderField("Location");
        if ((i == 1 || i == 3) && (j == 300 || j == 301 || j == 302 || j == 303 || j == 307 || j == 308)) {
          httpURLConnection.disconnect();
          uRL2 = h(uRL, str);
          arrayOfByte2 = arrayOfByte1;
        } else if (i == 2 && (j == 300 || j == 301 || j == 302 || j == 303)) {
          uRL2.disconnect();
          uRL2 = h((URL)arrayOfByte2, str);
          arrayOfByte2 = null;
          i = 1;
        } else {
          return (HttpURLConnection)uRL2;
        } 
        j = k;
        arrayOfByte1 = arrayOfByte2;
        URL uRL1 = uRL2;
        byte[] arrayOfByte3 = arrayOfByte1;
        continue;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Too many redirects: ");
      stringBuilder.append(k);
      NoRouteToHostException noRouteToHostException = new NoRouteToHostException(stringBuilder.toString());
      throw noRouteToHostException;
    } 
  }
  
  private HttpURLConnection k(URL paramURL, int paramInt, byte[] paramArrayOfbyte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, Map<String, String> paramMap) {
    String str;
    HttpURLConnection httpURLConnection = m(paramURL);
    httpURLConnection.setConnectTimeout(this.i);
    httpURLConnection.setReadTimeout(this.j);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    HttpDataSource.b b1 = this.l;
    if (b1 != null)
      hashMap.putAll(b1.a()); 
    hashMap.putAll(this.m.a());
    hashMap.putAll(paramMap);
    for (Map.Entry<Object, Object> entry : hashMap.entrySet())
      httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()); 
    if (paramLong1 != 0L || paramLong2 != -1L) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("bytes=");
      stringBuilder.append(paramLong1);
      stringBuilder.append("-");
      String str1 = stringBuilder.toString();
      str = str1;
      if (paramLong2 != -1L) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(str1);
        stringBuilder1.append(paramLong1 + paramLong2 - 1L);
        str = stringBuilder1.toString();
      } 
      httpURLConnection.setRequestProperty("Range", str);
    } 
    httpURLConnection.setRequestProperty("User-Agent", this.k);
    if (paramBoolean1) {
      str = "gzip";
    } else {
      str = "identity";
    } 
    httpURLConnection.setRequestProperty("Accept-Encoding", str);
    httpURLConnection.setInstanceFollowRedirects(paramBoolean2);
    if (paramArrayOfbyte != null) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    } 
    httpURLConnection.setDoOutput(paramBoolean1);
    httpURLConnection.setRequestMethod(l.b(paramInt));
    if (paramArrayOfbyte != null) {
      httpURLConnection.setFixedLengthStreamingMode(paramArrayOfbyte.length);
      httpURLConnection.connect();
      OutputStream outputStream = httpURLConnection.getOutputStream();
      outputStream.write(paramArrayOfbyte);
      outputStream.close();
    } else {
      httpURLConnection.connect();
    } 
    return httpURLConnection;
  }
  
  private static void l(HttpURLConnection paramHttpURLConnection, long paramLong) {
    int i = h0.a;
    if (i != 19 && i != 20)
      return; 
    try {
      InputStream inputStream = paramHttpURLConnection.getInputStream();
      if (paramLong == -1L) {
        if (inputStream.read() == -1)
          return; 
      } else if (paramLong <= 2048L) {
        return;
      } 
      String str = inputStream.getClass().getName();
      if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(str) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(str)) {
        Method method = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
        method.setAccessible(true);
        method.invoke(inputStream, new Object[0]);
      } 
    } catch (Exception exception) {}
  }
  
  private int n(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return 0; 
    long l1 = this.u;
    int i = paramInt2;
    if (l1 != -1L) {
      l1 -= this.w;
      if (l1 == 0L)
        return -1; 
      i = (int)Math.min(paramInt2, l1);
    } 
    paramInt1 = this.q.read(paramArrayOfbyte, paramInt1, i);
    if (paramInt1 == -1) {
      if (this.u == -1L)
        return -1; 
      throw new EOFException();
    } 
    this.w += paramInt1;
    a(paramInt1);
    return paramInt1;
  }
  
  private void o() {
    if (this.v == this.t)
      return; 
    byte[] arrayOfByte1 = g.getAndSet(null);
    byte[] arrayOfByte2 = arrayOfByte1;
    if (arrayOfByte1 == null)
      arrayOfByte2 = new byte[4096]; 
    while (true) {
      long l1 = this.v;
      long l2 = this.t;
      if (l1 != l2) {
        int i = (int)Math.min(l2 - l1, arrayOfByte2.length);
        i = this.q.read(arrayOfByte2, 0, i);
        if (!Thread.currentThread().isInterrupted()) {
          if (i != -1) {
            this.v += i;
            a(i);
            continue;
          } 
          throw new EOFException();
        } 
        throw new InterruptedIOException();
      } 
      g.set(arrayOfByte2);
      return;
    } 
  }
  
  public void close() {
    try {
      if (this.q != null) {
        l(this.p, e());
        try {
          this.q.close();
        } catch (IOException iOException) {
          HttpDataSource.HttpDataSourceException httpDataSourceException = new HttpDataSource.HttpDataSourceException();
          this(iOException, this.o, 3);
          throw httpDataSourceException;
        } 
      } 
      return;
    } finally {
      this.q = null;
      f();
      if (this.r) {
        this.r = false;
        b();
      } 
    } 
  }
  
  protected final long e() {
    long l1 = this.u;
    if (l1 != -1L)
      l1 -= this.w; 
    return l1;
  }
  
  public Uri e0() {
    Uri uri;
    HttpURLConnection httpURLConnection = this.p;
    if (httpURLConnection == null) {
      httpURLConnection = null;
    } else {
      uri = Uri.parse(httpURLConnection.getURL().toString());
    } 
    return uri;
  }
  
  public long g0(l paraml) {
    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException;
    this.o = paraml;
    long l1 = 0L;
    this.w = 0L;
    this.v = 0L;
    c(paraml);
    try {
      HttpURLConnection httpURLConnection = j(paraml);
      this.p = httpURLConnection;
      try {
        this.s = httpURLConnection.getResponseCode();
        String str = this.p.getResponseMessage();
        int i = this.s;
        if (i < 200 || i > 299) {
          Map<String, List<String>> map = this.p.getHeaderFields();
          f();
          invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(this.s, str, map, paraml);
          if (this.s == 416)
            invalidResponseCodeException.initCause(new DataSourceException(0)); 
          throw invalidResponseCodeException;
        } 
        str = this.p.getContentType();
        x<String> x1 = this.n;
        if (x1 == null || x1.a(str)) {
          long l2 = l1;
          if (this.s == 200) {
            long l3 = ((l)invalidResponseCodeException).f;
            l2 = l1;
            if (l3 != 0L)
              l2 = l3; 
          } 
          this.t = l2;
          boolean bool = i(this.p);
          if (!bool) {
            l1 = ((l)invalidResponseCodeException).g;
            l2 = -1L;
            if (l1 != -1L) {
              this.u = l1;
            } else {
              l1 = g(this.p);
              if (l1 != -1L)
                l2 = l1 - this.t; 
              this.u = l2;
            } 
          } else {
            this.u = ((l)invalidResponseCodeException).g;
          } 
          try {
            this.q = this.p.getInputStream();
            if (bool) {
              GZIPInputStream gZIPInputStream = new GZIPInputStream();
              this(this.q);
              this.q = gZIPInputStream;
            } 
            this.r = true;
            d((l)invalidResponseCodeException);
            return this.u;
          } catch (IOException iOException) {
            f();
            throw new HttpDataSource.HttpDataSourceException(iOException, invalidResponseCodeException, 1);
          } 
        } 
        f();
        throw new HttpDataSource.InvalidContentTypeException(iOException, invalidResponseCodeException);
      } catch (IOException iOException) {
        f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to connect to ");
        stringBuilder.append(((l)invalidResponseCodeException).a.toString());
        throw new HttpDataSource.HttpDataSourceException(stringBuilder.toString(), iOException, invalidResponseCodeException, 1);
      } 
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to connect to ");
      stringBuilder.append(((l)invalidResponseCodeException).a.toString());
      throw new HttpDataSource.HttpDataSourceException(stringBuilder.toString(), iOException, invalidResponseCodeException, 1);
    } 
  }
  
  public Map<String, List<String>> getResponseHeaders() {
    Map<?, ?> map;
    HttpURLConnection httpURLConnection = this.p;
    if (httpURLConnection == null) {
      map = Collections.emptyMap();
    } else {
      map = map.getHeaderFields();
    } 
    return (Map)map;
  }
  
  HttpURLConnection m(URL paramURL) {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      o();
      return n(paramArrayOfbyte, paramInt1, paramInt2);
    } catch (IOException iOException) {
      throw new HttpDataSource.HttpDataSourceException(iOException, this.o, 2);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */