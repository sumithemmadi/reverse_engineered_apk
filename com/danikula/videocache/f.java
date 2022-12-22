package com.danikula.videocache;

import android.content.Context;
import android.net.Uri;
import com.danikula.videocache.q.a;
import com.danikula.videocache.q.c;
import com.danikula.videocache.q.f;
import com.danikula.videocache.q.g;
import com.danikula.videocache.r.a;
import com.danikula.videocache.r.b;
import com.danikula.videocache.s.c;
import com.danikula.videocache.s.d;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class f {
  private static final org.slf4j.b a = org.slf4j.c.i("HttpProxyCacheServer");
  
  private final Object b = new Object();
  
  private final ExecutorService c = Executors.newFixedThreadPool(8);
  
  private final Map<String, g> d = new ConcurrentHashMap<String, g>();
  
  private final ServerSocket e;
  
  private final int f;
  
  private final Thread g;
  
  private final c h;
  
  private final j i;
  
  private f(c paramc) {
    this.h = k.<c>d(paramc);
    try {
      InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
      ServerSocket serverSocket = new ServerSocket();
      this(0, 8, inetAddress);
      this.e = serverSocket;
      int i = serverSocket.getLocalPort();
      this.f = i;
      i.a("127.0.0.1", i);
      CountDownLatch countDownLatch = new CountDownLatch();
      this(1);
      Thread thread = new Thread();
      d d = new d();
      this(this, countDownLatch);
      this(d);
      this.g = thread;
      thread.start();
      countDownLatch.await();
      j j1 = new j();
      this("127.0.0.1", i);
      this.i = j1;
      org.slf4j.b b1 = a;
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Proxy cache server started. Is it alive? ");
      stringBuilder.append(l());
      b1.info(stringBuilder.toString());
      return;
    } catch (IOException iOException) {
    
    } catch (InterruptedException interruptedException) {}
    this.c.shutdown();
    throw new IllegalStateException("Error starting local proxy server", interruptedException);
  }
  
  private String c(String paramString) {
    return String.format(Locale.US, "http://%s:%d/%s", new Object[] { "127.0.0.1", Integer.valueOf(this.f), m.f(paramString) });
  }
  
  private void d(Socket paramSocket) {
    try {
      if (!paramSocket.isClosed())
        paramSocket.close(); 
    } catch (IOException iOException) {
      n(new ProxyCacheException("Error closing socket", iOException));
    } 
  }
  
  private void e(Socket paramSocket) {
    try {
      if (!paramSocket.isInputShutdown())
        paramSocket.shutdownInput(); 
    } catch (SocketException socketException) {
      a.debug("Releasing input stream… Socket is closed by client.");
    } catch (IOException iOException) {
      n(new ProxyCacheException("Error closing socket input stream", iOException));
    } 
  }
  
  private void f(Socket paramSocket) {
    try {
      if (!paramSocket.isOutputShutdown())
        paramSocket.shutdownOutput(); 
    } catch (IOException iOException) {
      a.warn("Failed to close socket on proxy side: {}. It seems client have already closed connection.", iOException.getMessage());
    } 
  }
  
  private File g(String paramString) {
    c c1 = this.h;
    return new File(c1.a, c1.b.a(paramString));
  }
  
  private g h(String paramString) {
    synchronized (this.b) {
      g g1 = this.d.get(paramString);
      g g2 = g1;
      if (g1 == null) {
        g2 = new g();
        this(paramString, this.h);
        this.d.put(paramString, g2);
      } 
      return g2;
    } 
  }
  
  private int i() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: iconst_0
    //   8: istore_2
    //   9: aload_0
    //   10: getfield d : Ljava/util/Map;
    //   13: invokeinterface values : ()Ljava/util/Collection;
    //   18: invokeinterface iterator : ()Ljava/util/Iterator;
    //   23: astore_3
    //   24: aload_3
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 51
    //   33: iload_2
    //   34: aload_3
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast com/danikula/videocache/g
    //   43: invokevirtual b : ()I
    //   46: iadd
    //   47: istore_2
    //   48: goto -> 24
    //   51: aload_1
    //   52: monitorexit
    //   53: iload_2
    //   54: ireturn
    //   55: astore_3
    //   56: aload_1
    //   57: monitorexit
    //   58: goto -> 63
    //   61: aload_3
    //   62: athrow
    //   63: goto -> 61
    // Exception table:
    //   from	to	target	type
    //   9	24	55	finally
    //   24	48	55	finally
    //   51	53	55	finally
    //   56	58	55	finally
  }
  
  private boolean l() {
    return this.i.e(3, 70);
  }
  
  private void n(Throwable paramThrowable) {
    a.error("HttpProxyCacheServer error", paramThrowable);
  }
  
  private void o(Socket paramSocket) {
    StringBuilder stringBuilder;
    try {
      d d = d.c(paramSocket.getInputStream());
      org.slf4j.b b1 = a;
      StringBuilder stringBuilder1 = new StringBuilder();
      this();
      stringBuilder1.append("Request to cache proxy:");
      stringBuilder1.append(d);
      b1.debug(stringBuilder1.toString());
      String str = m.e(d.c);
      if (this.i.d(str)) {
        this.i.g(paramSocket);
      } else {
        h(str).d(d, paramSocket);
      } 
      p(paramSocket);
      stringBuilder = new StringBuilder();
      stringBuilder.append("Opened connections: ");
      stringBuilder.append(i());
      b1.debug(stringBuilder.toString());
    } catch (SocketException socketException) {
      org.slf4j.b b1 = a;
      b1.debug("Closing socket… Socket is closed by client.");
      p((Socket)stringBuilder);
      stringBuilder = new StringBuilder();
      stringBuilder.append("Opened connections: ");
      stringBuilder.append(i());
      b1.debug(stringBuilder.toString());
    } catch (ProxyCacheException proxyCacheException2) {
      ProxyCacheException proxyCacheException1 = new ProxyCacheException();
      this("Error processing request", proxyCacheException2);
      n(proxyCacheException1);
      p((Socket)stringBuilder);
      org.slf4j.b b1 = a;
      stringBuilder = new StringBuilder();
      stringBuilder.append("Opened connections: ");
      stringBuilder.append(i());
      b1.debug(stringBuilder.toString());
    } catch (IOException iOException) {
      ProxyCacheException proxyCacheException = new ProxyCacheException();
      this("Error processing request", iOException);
      n(proxyCacheException);
      p((Socket)stringBuilder);
      org.slf4j.b b1 = a;
      stringBuilder = new StringBuilder();
      stringBuilder.append("Opened connections: ");
      stringBuilder.append(i());
      b1.debug(stringBuilder.toString());
    } finally {
      Exception exception;
    } 
  }
  
  private void p(Socket paramSocket) {
    e(paramSocket);
    f(paramSocket);
    d(paramSocket);
  }
  
  private void q(File paramFile) {
    try {
      this.h.c.a(paramFile);
    } catch (IOException iOException) {
      org.slf4j.b b1 = a;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error touching file ");
      stringBuilder.append(paramFile);
      b1.error(stringBuilder.toString(), iOException);
    } 
  }
  
  private void r() {
    try {
      while (!Thread.currentThread().isInterrupted()) {
        Socket socket = this.e.accept();
        org.slf4j.b b1 = a;
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Accept new socket ");
        stringBuilder.append(socket);
        b1.debug(stringBuilder.toString());
        ExecutorService executorService = this.c;
        c c1 = new c();
        this(this, socket);
        executorService.submit(c1);
      } 
    } catch (IOException iOException) {
      n(new ProxyCacheException("Error during waiting connection", iOException));
    } 
  }
  
  public String j(String paramString) {
    return k(paramString, true);
  }
  
  public String k(String paramString, boolean paramBoolean) {
    File file1;
    String str;
    if (paramBoolean && m(paramString)) {
      file1 = g(paramString);
      q(file1);
      return Uri.fromFile(file1).toString();
    } 
    File file2 = file1;
    if (l())
      str = c((String)file1); 
    return str;
  }
  
  public boolean m(String paramString) {
    k.e(paramString, "Url can't be null!");
    return g(paramString).exists();
  }
  
  public static final class b {
    private File a;
    
    private c b;
    
    private a c;
    
    private c d;
    
    private b e;
    
    public b(Context param1Context) {
      this.d = d.b(param1Context);
      this.a = p.c(param1Context);
      this.c = (a)new g(536870912L);
      this.b = (c)new f();
      this.e = (b)new a();
    }
    
    private c b() {
      return new c(this.a, this.b, this.c, this.d, this.e);
    }
    
    public f a() {
      return new f(b(), null);
    }
    
    public b c(c param1c) {
      this.b = k.<c>d(param1c);
      return this;
    }
    
    public b d(long param1Long) {
      this.c = (a)new g(param1Long);
      return this;
    }
  }
  
  private final class c implements Runnable {
    private final Socket b;
    
    public c(f this$0, Socket param1Socket) {
      this.b = param1Socket;
    }
    
    public void run() {
      f.b(this.c, this.b);
    }
  }
  
  private final class d implements Runnable {
    private final CountDownLatch b;
    
    public d(f this$0, CountDownLatch param1CountDownLatch) {
      this.b = param1CountDownLatch;
    }
    
    public void run() {
      this.b.countDown();
      f.a(this.c);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */