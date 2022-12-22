package com.danikula.videocache;

import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.c;

class l {
  private static final org.slf4j.b a = c.i("ProxyCache");
  
  private final n b;
  
  private final a c;
  
  private final Object d = new Object();
  
  private final Object e = new Object();
  
  private final AtomicInteger f;
  
  private volatile Thread g;
  
  private volatile boolean h;
  
  private volatile int i = -1;
  
  public l(n paramn, a parama) {
    this.b = k.<n>d(paramn);
    this.c = k.<a>d(parama);
    this.f = new AtomicInteger();
  }
  
  private void b() {
    int i = this.f.get();
    if (i < 1)
      return; 
    this.f.set(0);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Error reading source ");
    stringBuilder.append(i);
    stringBuilder.append(" times");
    throw new ProxyCacheException(stringBuilder.toString());
  }
  
  private void c() {
    try {
      this.b.close();
    } catch (ProxyCacheException proxyCacheException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Error closing source ");
      stringBuilder.append(this.b);
      h(new ProxyCacheException(stringBuilder.toString(), proxyCacheException));
    } 
  }
  
  private boolean d() {
    return (Thread.currentThread().isInterrupted() || this.h);
  }
  
  private void e(long paramLong1, long paramLong2) {
    f(paramLong1, paramLong2);
    synchronized (this.d) {
      this.d.notifyAll();
      return;
    } 
  }
  
  private void i() {
    this.i = 100;
    g(this.i);
  }
  
  private void k() {
    long l1 = -1L;
    long l2 = 0L;
    long l3 = l1;
    try {
      long l4 = this.c.b();
      l3 = l1;
      l2 = l4;
      this.b.a(l4);
      l3 = l1;
      l2 = l4;
      l1 = this.b.length();
      l3 = l1;
      l2 = l4;
      byte[] arrayOfByte = new byte[8192];
      while (true) {
        l3 = l1;
        l2 = l4;
        int i = this.b.read(arrayOfByte);
        if (i != -1) {
          l3 = l1;
          l2 = l4;
          Object object = this.e;
          l3 = l1;
          synchronized (l4) {
            if (d()) {
              /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
              c();
              return;
            } 
            this.c.c(arrayOfByte, i);
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            l4 += i;
            l3 = l1;
            l2 = l4;
            e(l4, l1);
          } 
          continue;
        } 
        l3 = l1;
        l2 = l4;
        n();
        l3 = l1;
        l2 = l4;
        i();
        l3 = l1;
        l2 = l4;
        c();
        return;
      } 
    } finally {
      null = null;
    } 
  }
  
  private void l() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : Ljava/lang/Thread;
    //   6: ifnull -> 27
    //   9: aload_0
    //   10: getfield g : Ljava/lang/Thread;
    //   13: invokevirtual getState : ()Ljava/lang/Thread$State;
    //   16: getstatic java/lang/Thread$State.TERMINATED : Ljava/lang/Thread$State;
    //   19: if_acmpeq -> 27
    //   22: iconst_1
    //   23: istore_1
    //   24: goto -> 29
    //   27: iconst_0
    //   28: istore_1
    //   29: aload_0
    //   30: getfield h : Z
    //   33: ifne -> 116
    //   36: aload_0
    //   37: getfield c : Lcom/danikula/videocache/a;
    //   40: invokeinterface d : ()Z
    //   45: ifne -> 116
    //   48: iload_1
    //   49: ifne -> 116
    //   52: new java/lang/Thread
    //   55: astore_2
    //   56: new com/danikula/videocache/l$b
    //   59: astore_3
    //   60: aload_3
    //   61: aload_0
    //   62: aconst_null
    //   63: invokespecial <init> : (Lcom/danikula/videocache/l;Lcom/danikula/videocache/l$a;)V
    //   66: new java/lang/StringBuilder
    //   69: astore #4
    //   71: aload #4
    //   73: invokespecial <init> : ()V
    //   76: aload #4
    //   78: ldc 'Source reader for '
    //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload #4
    //   86: aload_0
    //   87: getfield b : Lcom/danikula/videocache/n;
    //   90: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload_2
    //   95: aload_3
    //   96: aload #4
    //   98: invokevirtual toString : ()Ljava/lang/String;
    //   101: invokespecial <init> : (Ljava/lang/Runnable;Ljava/lang/String;)V
    //   104: aload_0
    //   105: aload_2
    //   106: putfield g : Ljava/lang/Thread;
    //   109: aload_0
    //   110: getfield g : Ljava/lang/Thread;
    //   113: invokevirtual start : ()V
    //   116: aload_0
    //   117: monitorexit
    //   118: return
    //   119: astore_2
    //   120: aload_0
    //   121: monitorexit
    //   122: aload_2
    //   123: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	119	finally
    //   29	48	119	finally
    //   52	116	119	finally
  }
  
  private void n() {
    synchronized (this.e) {
      if (!d() && this.c.b() == this.b.length())
        this.c.a(); 
      return;
    } 
  }
  
  private void o() {
    Exception exception;
    Object object = this.d;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      this.d.wait(1000L);
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return;
    } catch (InterruptedException null) {
      ProxyCacheException proxyCacheException = new ProxyCacheException();
      this("Waiting source data is interrupted!", exception);
      throw proxyCacheException;
    } finally {}
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    throw exception;
  }
  
  protected void f(long paramLong1, long paramLong2) {
    int i;
    boolean bool2;
    boolean bool1 = true;
    if (paramLong2 == 0L) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      i = 100;
    } else {
      i = (int)((float)paramLong1 / (float)paramLong2 * 100.0F);
    } 
    if (i != this.i) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (paramLong2 < 0L)
      bool1 = false; 
    if (bool1 && bool2)
      g(i); 
    this.i = i;
  }
  
  protected void g(int paramInt) {
    throw null;
  }
  
  protected final void h(Throwable paramThrowable) {
    if (paramThrowable instanceof InterruptedProxyCacheException) {
      a.debug("ProxyCache is interrupted");
    } else {
      a.error("ProxyCache error", paramThrowable);
    } 
  }
  
  public int j(byte[] paramArrayOfbyte, long paramLong, int paramInt) {
    m.a(paramArrayOfbyte, paramLong, paramInt);
    while (!this.c.d() && this.c.b() < paramInt + paramLong && !this.h) {
      l();
      o();
      b();
    } 
    paramInt = this.c.e(paramArrayOfbyte, paramLong, paramInt);
    if (this.c.d() && this.i != 100) {
      this.i = 100;
      g(100);
    } 
    return paramInt;
  }
  
  public void m() {
    synchronized (this.e) {
      org.slf4j.b b1 = a;
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("Shutdown proxy for ");
      stringBuilder.append(this.b);
      b1.debug(stringBuilder.toString());
      try {
        this.h = true;
        if (this.g != null)
          this.g.interrupt(); 
        this.c.close();
      } catch (ProxyCacheException proxyCacheException) {
        h(proxyCacheException);
      } 
      return;
    } 
  }
  
  private class b implements Runnable {
    private b(l this$0) {}
    
    public void run() {
      l.a(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */