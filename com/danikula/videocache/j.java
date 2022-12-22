package com.danikula.videocache;

import java.io.OutputStream;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.slf4j.c;

class j {
  private static final org.slf4j.b a = c.i("Pinger");
  
  private final ExecutorService b = Executors.newSingleThreadExecutor();
  
  private final String c;
  
  private final int d;
  
  j(String paramString, int paramInt) {
    this.c = k.<String>d(paramString);
    this.d = paramInt;
  }
  
  private List<Proxy> b() {
    try {
      ProxySelector proxySelector = ProxySelector.getDefault();
      URI uRI = new URI();
      this(c());
      return proxySelector.select(uRI);
    } catch (URISyntaxException uRISyntaxException) {
      throw new IllegalStateException(uRISyntaxException);
    } 
  }
  
  private String c() {
    return String.format(Locale.US, "http://%s:%d/%s", new Object[] { this.c, Integer.valueOf(this.d), "ping" });
  }
  
  private boolean f() {
    Exception exception;
    h h = new h(c());
    try {
      byte[] arrayOfByte1 = "ping ok".getBytes();
      h.a(0L);
      byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
      h.read(arrayOfByte2);
      boolean bool = Arrays.equals(arrayOfByte1, arrayOfByte2);
      org.slf4j.b b1 = a;
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Ping response: `");
      String str = new String();
      this(arrayOfByte2);
      stringBuilder.append(str);
      stringBuilder.append("`, pinged? ");
      stringBuilder.append(bool);
      b1.info(stringBuilder.toString());
      h.close();
      return bool;
    } catch (ProxyCacheException null) {
      a.error("Error reading ping response", exception);
      h.close();
      return false;
    } finally {}
    h.close();
    throw exception;
  }
  
  boolean d(String paramString) {
    return "ping".equals(paramString);
  }
  
  boolean e(int paramInt1, int paramInt2) {
    boolean bool;
    if (paramInt1 >= 1) {
      bool = true;
    } else {
      bool = false;
    } 
    k.b(bool);
    if (paramInt2 > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    k.b(bool);
    byte b1 = 0;
    while (b1 < paramInt1) {
      try {
        ExecutorService executorService = this.b;
        b b2 = new b();
        this(this, null);
        bool = ((Boolean)executorService.<Boolean>submit(b2).get(paramInt2, TimeUnit.MILLISECONDS)).booleanValue();
        if (bool)
          return true; 
      } catch (TimeoutException timeoutException) {
        org.slf4j.b b2 = a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error pinging server (attempt: ");
        stringBuilder.append(b1);
        stringBuilder.append(", timeout: ");
        stringBuilder.append(paramInt2);
        stringBuilder.append("). ");
        b2.warn(stringBuilder.toString());
      } catch (InterruptedException interruptedException) {
        a.error("Error pinging server due to unexpected error", interruptedException);
      } catch (ExecutionException executionException) {
        a.error("Error pinging server due to unexpected error", executionException);
      } 
      b1++;
      paramInt2 *= 2;
    } 
    String str = String.format(Locale.US, "Error pinging server (attempts: %d, max timeout: %d). If you see this message, please, report at https://github.com/danikula/AndroidVideoCache/issues/134. Default proxies are: %s", new Object[] { Integer.valueOf(b1), Integer.valueOf(paramInt2 / 2), b() });
    a.error(str, new ProxyCacheException(str));
    return false;
  }
  
  void g(Socket paramSocket) {
    OutputStream outputStream = paramSocket.getOutputStream();
    outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
    outputStream.write("ping ok".getBytes());
  }
  
  private class b implements Callable<Boolean> {
    private b(j this$0) {}
    
    public Boolean a() {
      return Boolean.valueOf(j.a(this.a));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */