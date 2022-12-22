package com.danikula.videocache;

import com.danikula.videocache.r.a;
import com.danikula.videocache.r.b;
import com.danikula.videocache.s.c;
import com.danikula.videocache.s.d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.slf4j.b;
import org.slf4j.c;

public class h implements n {
  private static final b a = c.i("HttpUrlSource");
  
  private final c b;
  
  private final b c;
  
  private o d;
  
  private HttpURLConnection e;
  
  private InputStream f;
  
  public h(h paramh) {
    this.d = paramh.d;
    this.b = paramh.b;
    this.c = paramh.c;
  }
  
  public h(String paramString) {
    this(paramString, d.a());
  }
  
  public h(String paramString, c paramc) {
    this(paramString, paramc, (b)new a());
  }
  
  public h(String paramString, c paramc, b paramb) {
    o o1;
    this.b = k.<c>d(paramc);
    this.c = k.<b>d(paramb);
    o o2 = paramc.get(paramString);
    if (o2 != null) {
      o1 = o2;
    } else {
      o1 = new o((String)o1, -2147483648L, m.g((String)o1));
    } 
    this.d = o1;
  }
  
  private void b() {
    // Byte code:
    //   0: getstatic com/danikula/videocache/h.a : Lorg/slf4j/b;
    //   3: astore_1
    //   4: new java/lang/StringBuilder
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_2
    //   13: ldc 'Read content info from '
    //   15: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   18: pop
    //   19: aload_2
    //   20: aload_0
    //   21: getfield d : Lcom/danikula/videocache/o;
    //   24: getfield a : Ljava/lang/String;
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: invokeinterface debug : (Ljava/lang/String;)V
    //   41: aconst_null
    //   42: astore_3
    //   43: aconst_null
    //   44: astore #4
    //   46: aconst_null
    //   47: astore_2
    //   48: aconst_null
    //   49: astore #5
    //   51: aload_0
    //   52: lconst_0
    //   53: sipush #10000
    //   56: invokespecial g : (JI)Ljava/net/HttpURLConnection;
    //   59: astore #6
    //   61: aload #6
    //   63: astore #7
    //   65: aload #5
    //   67: astore_2
    //   68: aload_3
    //   69: astore #4
    //   71: aload_0
    //   72: aload #6
    //   74: invokespecial c : (Ljava/net/HttpURLConnection;)J
    //   77: lstore #8
    //   79: aload #6
    //   81: astore #7
    //   83: aload #5
    //   85: astore_2
    //   86: aload_3
    //   87: astore #4
    //   89: aload #6
    //   91: invokevirtual getContentType : ()Ljava/lang/String;
    //   94: astore #10
    //   96: aload #6
    //   98: astore #7
    //   100: aload #5
    //   102: astore_2
    //   103: aload_3
    //   104: astore #4
    //   106: aload #6
    //   108: invokevirtual getInputStream : ()Ljava/io/InputStream;
    //   111: astore #5
    //   113: aload #6
    //   115: astore #7
    //   117: aload #5
    //   119: astore_2
    //   120: aload #5
    //   122: astore #4
    //   124: new com/danikula/videocache/o
    //   127: astore_3
    //   128: aload #6
    //   130: astore #7
    //   132: aload #5
    //   134: astore_2
    //   135: aload #5
    //   137: astore #4
    //   139: aload_3
    //   140: aload_0
    //   141: getfield d : Lcom/danikula/videocache/o;
    //   144: getfield a : Ljava/lang/String;
    //   147: lload #8
    //   149: aload #10
    //   151: invokespecial <init> : (Ljava/lang/String;JLjava/lang/String;)V
    //   154: aload #6
    //   156: astore #7
    //   158: aload #5
    //   160: astore_2
    //   161: aload #5
    //   163: astore #4
    //   165: aload_0
    //   166: aload_3
    //   167: putfield d : Lcom/danikula/videocache/o;
    //   170: aload #6
    //   172: astore #7
    //   174: aload #5
    //   176: astore_2
    //   177: aload #5
    //   179: astore #4
    //   181: aload_0
    //   182: getfield b : Lcom/danikula/videocache/s/c;
    //   185: aload_3
    //   186: getfield a : Ljava/lang/String;
    //   189: aload_3
    //   190: invokeinterface b : (Ljava/lang/String;Lcom/danikula/videocache/o;)V
    //   195: aload #6
    //   197: astore #7
    //   199: aload #5
    //   201: astore_2
    //   202: aload #5
    //   204: astore #4
    //   206: new java/lang/StringBuilder
    //   209: astore_3
    //   210: aload #6
    //   212: astore #7
    //   214: aload #5
    //   216: astore_2
    //   217: aload #5
    //   219: astore #4
    //   221: aload_3
    //   222: invokespecial <init> : ()V
    //   225: aload #6
    //   227: astore #7
    //   229: aload #5
    //   231: astore_2
    //   232: aload #5
    //   234: astore #4
    //   236: aload_3
    //   237: ldc 'Source info fetched: '
    //   239: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: pop
    //   243: aload #6
    //   245: astore #7
    //   247: aload #5
    //   249: astore_2
    //   250: aload #5
    //   252: astore #4
    //   254: aload_3
    //   255: aload_0
    //   256: getfield d : Lcom/danikula/videocache/o;
    //   259: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   262: pop
    //   263: aload #6
    //   265: astore #7
    //   267: aload #5
    //   269: astore_2
    //   270: aload #5
    //   272: astore #4
    //   274: aload_1
    //   275: aload_3
    //   276: invokevirtual toString : ()Ljava/lang/String;
    //   279: invokeinterface debug : (Ljava/lang/String;)V
    //   284: aload #5
    //   286: invokestatic c : (Ljava/io/Closeable;)V
    //   289: goto -> 410
    //   292: astore #6
    //   294: goto -> 416
    //   297: astore #5
    //   299: goto -> 315
    //   302: astore #6
    //   304: aconst_null
    //   305: astore #7
    //   307: goto -> 416
    //   310: astore #5
    //   312: aconst_null
    //   313: astore #6
    //   315: aload #6
    //   317: astore #7
    //   319: aload #4
    //   321: astore_2
    //   322: getstatic com/danikula/videocache/h.a : Lorg/slf4j/b;
    //   325: astore_3
    //   326: aload #6
    //   328: astore #7
    //   330: aload #4
    //   332: astore_2
    //   333: new java/lang/StringBuilder
    //   336: astore_1
    //   337: aload #6
    //   339: astore #7
    //   341: aload #4
    //   343: astore_2
    //   344: aload_1
    //   345: invokespecial <init> : ()V
    //   348: aload #6
    //   350: astore #7
    //   352: aload #4
    //   354: astore_2
    //   355: aload_1
    //   356: ldc 'Error fetching info from '
    //   358: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   361: pop
    //   362: aload #6
    //   364: astore #7
    //   366: aload #4
    //   368: astore_2
    //   369: aload_1
    //   370: aload_0
    //   371: getfield d : Lcom/danikula/videocache/o;
    //   374: getfield a : Ljava/lang/String;
    //   377: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload #6
    //   383: astore #7
    //   385: aload #4
    //   387: astore_2
    //   388: aload_3
    //   389: aload_1
    //   390: invokevirtual toString : ()Ljava/lang/String;
    //   393: aload #5
    //   395: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   400: aload #4
    //   402: invokestatic c : (Ljava/io/Closeable;)V
    //   405: aload #6
    //   407: ifnull -> 415
    //   410: aload #6
    //   412: invokevirtual disconnect : ()V
    //   415: return
    //   416: aload_2
    //   417: invokestatic c : (Ljava/io/Closeable;)V
    //   420: aload #7
    //   422: ifnull -> 430
    //   425: aload #7
    //   427: invokevirtual disconnect : ()V
    //   430: aload #6
    //   432: athrow
    // Exception table:
    //   from	to	target	type
    //   51	61	310	java/io/IOException
    //   51	61	302	finally
    //   71	79	297	java/io/IOException
    //   71	79	292	finally
    //   89	96	297	java/io/IOException
    //   89	96	292	finally
    //   106	113	297	java/io/IOException
    //   106	113	292	finally
    //   124	128	297	java/io/IOException
    //   124	128	292	finally
    //   139	154	297	java/io/IOException
    //   139	154	292	finally
    //   165	170	297	java/io/IOException
    //   165	170	292	finally
    //   181	195	297	java/io/IOException
    //   181	195	292	finally
    //   206	210	297	java/io/IOException
    //   206	210	292	finally
    //   221	225	297	java/io/IOException
    //   221	225	292	finally
    //   236	243	297	java/io/IOException
    //   236	243	292	finally
    //   254	263	297	java/io/IOException
    //   254	263	292	finally
    //   274	284	297	java/io/IOException
    //   274	284	292	finally
    //   322	326	292	finally
    //   333	337	292	finally
    //   344	348	292	finally
    //   355	362	292	finally
    //   369	381	292	finally
    //   388	400	292	finally
  }
  
  private long c(HttpURLConnection paramHttpURLConnection) {
    long l;
    String str = paramHttpURLConnection.getHeaderField("Content-Length");
    if (str == null) {
      l = -1L;
    } else {
      l = Long.parseLong(str);
    } 
    return l;
  }
  
  private void f(HttpURLConnection paramHttpURLConnection, String paramString) {
    for (Map.Entry entry : this.c.a(paramString).entrySet())
      paramHttpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue()); 
  }
  
  private HttpURLConnection g(long paramLong, int paramInt) {
    String str = this.d.a;
    int i = 0;
    while (true) {
      String str1;
      b b1 = a;
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("Open connection ");
      if (paramLong > 0L) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" with offset ");
        stringBuilder.append(paramLong);
        str1 = stringBuilder.toString();
      } else {
        str1 = "";
      } 
      stringBuilder2.append(str1);
      stringBuilder2.append(" to ");
      stringBuilder2.append(str);
      b1.debug(stringBuilder2.toString());
      HttpURLConnection httpURLConnection = (HttpURLConnection)(new URL(str)).openConnection();
      f(httpURLConnection, str);
      if (paramLong > 0L) {
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("bytes=");
        stringBuilder2.append(paramLong);
        stringBuilder2.append("-");
        httpURLConnection.setRequestProperty("Range", stringBuilder2.toString());
      } 
      if (paramInt > 0) {
        httpURLConnection.setConnectTimeout(paramInt);
        httpURLConnection.setReadTimeout(paramInt);
      } 
      int j = httpURLConnection.getResponseCode();
      if (j == 301 || j == 302 || j == 303) {
        j = 1;
      } else {
        j = 0;
      } 
      int k = i;
      if (j != 0) {
        str = httpURLConnection.getHeaderField("Location");
        k = i + 1;
        httpURLConnection.disconnect();
      } 
      if (k <= 5) {
        i = k;
        if (j == 0)
          return httpURLConnection; 
        continue;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Too many redirects: ");
      stringBuilder1.append(k);
      ProxyCacheException proxyCacheException = new ProxyCacheException(stringBuilder1.toString());
      throw proxyCacheException;
    } 
  }
  
  private long h(HttpURLConnection paramHttpURLConnection, long paramLong, int paramInt) {
    long l = c(paramHttpURLConnection);
    if (paramInt == 200) {
      paramLong = l;
    } else if (paramInt == 206) {
      paramLong = l + paramLong;
    } else {
      paramLong = this.d.b;
    } 
    return paramLong;
  }
  
  public void a(long paramLong) {
    try {
      HttpURLConnection httpURLConnection1 = g(paramLong, -1);
      this.e = httpURLConnection1;
      String str = httpURLConnection1.getContentType();
      BufferedInputStream bufferedInputStream = new BufferedInputStream();
      this(this.e.getInputStream(), 8192);
      this.f = bufferedInputStream;
      HttpURLConnection httpURLConnection2 = this.e;
      long l = h(httpURLConnection2, paramLong, httpURLConnection2.getResponseCode());
      o o1 = new o();
      this(this.d.a, l, str);
      this.d = o1;
      this.b.b(o1.a, o1);
      return;
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error opening connection for ");
      stringBuilder.append(this.d.a);
      stringBuilder.append(" with offset ");
      stringBuilder.append(paramLong);
      throw new ProxyCacheException(stringBuilder.toString(), iOException);
    } 
  }
  
  public void close() {
    HttpURLConnection httpURLConnection = this.e;
    if (httpURLConnection != null)
      try {
        httpURLConnection.disconnect();
      } catch (NullPointerException nullPointerException) {
        throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", nullPointerException);
      } catch (IllegalArgumentException illegalArgumentException) {
      
      } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        a.error("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :(", arrayIndexOutOfBoundsException);
      }  
  }
  
  public String d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/danikula/videocache/o;
    //   6: getfield c : Ljava/lang/String;
    //   9: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   12: ifeq -> 19
    //   15: aload_0
    //   16: invokespecial b : ()V
    //   19: aload_0
    //   20: getfield d : Lcom/danikula/videocache/o;
    //   23: getfield c : Ljava/lang/String;
    //   26: astore_1
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_1
    //   30: areturn
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	31	finally
    //   19	27	31	finally
  }
  
  public String e() {
    return this.d.a;
  }
  
  public long length() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/danikula/videocache/o;
    //   6: getfield b : J
    //   9: ldc2_w -2147483648
    //   12: lcmp
    //   13: ifne -> 20
    //   16: aload_0
    //   17: invokespecial b : ()V
    //   20: aload_0
    //   21: getfield d : Lcom/danikula/videocache/o;
    //   24: getfield b : J
    //   27: lstore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: lload_1
    //   31: lreturn
    //   32: astore_3
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_3
    //   36: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	32	finally
    //   20	28	32	finally
  }
  
  public int read(byte[] paramArrayOfbyte) {
    InputStream inputStream = this.f;
    if (inputStream != null)
      try {
        return inputStream.read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
      } catch (InterruptedIOException interruptedIOException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Reading source ");
        stringBuilder1.append(this.d.a);
        stringBuilder1.append(" is interrupted");
        throw new InterruptedProxyCacheException(stringBuilder1.toString(), interruptedIOException);
      } catch (IOException iOException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Error reading data from ");
        stringBuilder1.append(this.d.a);
        throw new ProxyCacheException(stringBuilder1.toString(), iOException);
      }  
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Error reading data from ");
    stringBuilder.append(this.d.a);
    stringBuilder.append(": connection is absent!");
    throw new ProxyCacheException(stringBuilder.toString());
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HttpUrlSource{sourceInfo='");
    stringBuilder.append(this.d);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */