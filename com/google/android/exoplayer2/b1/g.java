package com.google.android.exoplayer2.b1;

import com.google.android.exoplayer2.util.e;
import java.util.ArrayDeque;

public abstract class g<I extends e, O extends f, E extends Exception> implements c<I, O, E> {
  private final Thread a;
  
  private final Object b = new Object();
  
  private final ArrayDeque<I> c = new ArrayDeque<I>();
  
  private final ArrayDeque<O> d = new ArrayDeque<O>();
  
  private final I[] e;
  
  private final O[] f;
  
  private int g;
  
  private int h;
  
  private I i;
  
  private E j;
  
  private boolean k;
  
  private boolean l;
  
  private int m;
  
  protected g(I[] paramArrayOfI, O[] paramArrayOfO) {
    this.e = paramArrayOfI;
    this.g = paramArrayOfI.length;
    boolean bool = false;
    byte b;
    for (b = 0; b < this.g; b++)
      this.e[b] = h(); 
    this.f = paramArrayOfO;
    this.h = paramArrayOfO.length;
    for (b = bool; b < this.h; b++)
      this.f[b] = i(); 
    a a = new a(this);
    this.a = a;
    a.start();
  }
  
  private boolean g() {
    boolean bool;
    if (!this.c.isEmpty() && this.h > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private boolean l() {
    synchronized (this.b) {
      while (!this.l && !g())
        this.b.wait(); 
      if (this.l)
        return false; 
      null = (e)this.c.removeFirst();
      O[] arrayOfO = this.f;
      int i = this.h - 1;
      this.h = i;
      O o = arrayOfO[i];
      boolean bool = this.k;
      this.k = false;
      if (null.isEndOfStream()) {
        o.addFlag(4);
      } else {
        if (null.isDecodeOnly())
          o.addFlag(-2147483648); 
        try {
          this.j = k((I)null, o, bool);
        } catch (RuntimeException runtimeException) {
          this.j = j(runtimeException);
        } catch (OutOfMemoryError outOfMemoryError) {
          this.j = j(outOfMemoryError);
        } 
        if (this.j != null)
          synchronized (this.b) {
            return false;
          }  
      } 
      synchronized (this.b) {
        if (this.k) {
          o.release();
        } else if (o.isDecodeOnly()) {
          this.m++;
          o.release();
        } else {
          ((f)o).skippedOutputBufferCount = this.m;
          this.m = 0;
          this.d.addLast(o);
        } 
        r((I)null);
        return true;
      } 
    } 
  }
  
  private void o() {
    if (g())
      this.b.notify(); 
  }
  
  private void p() throws E {
    E e1 = this.j;
    if (e1 == null)
      return; 
    throw e1;
  }
  
  private void r(I paramI) {
    paramI.clear();
    I[] arrayOfI = this.e;
    int i = this.g;
    this.g = i + 1;
    arrayOfI[i] = paramI;
  }
  
  private void t(O paramO) {
    paramO.clear();
    O[] arrayOfO = this.f;
    int i = this.h;
    this.h = i + 1;
    arrayOfO[i] = paramO;
  }
  
  private void u() {
    try {
      while (true) {
        boolean bool = l();
        if (bool)
          continue; 
        break;
      } 
      return;
    } catch (InterruptedException interruptedException) {
      IllegalStateException illegalStateException = new IllegalStateException(interruptedException);
      throw illegalStateException;
    } 
  }
  
  public void a() {
    synchronized (this.b) {
      this.l = true;
      this.b.notify();
      try {
        this.a.join();
      } catch (InterruptedException interruptedException) {
        Thread.currentThread().interrupt();
      } 
      return;
    } 
  }
  
  public final void flush() {
    synchronized (this.b) {
      this.k = true;
      this.m = 0;
      I i = this.i;
      if (i != null) {
        r(i);
        this.i = null;
      } 
      while (!this.c.isEmpty())
        r(this.c.removeFirst()); 
      while (!this.d.isEmpty())
        ((f)this.d.removeFirst()).release(); 
      return;
    } 
  }
  
  protected abstract I h();
  
  protected abstract O i();
  
  protected abstract E j(Throwable paramThrowable);
  
  protected abstract E k(I paramI, O paramO, boolean paramBoolean);
  
  public final I m() throws E {
    synchronized (this.b) {
      boolean bool;
      I i1;
      p();
      if (this.i == null) {
        bool = true;
      } else {
        bool = false;
      } 
      e.f(bool);
      int i = this.g;
      if (i == 0) {
        Object object = null;
      } else {
        I[] arrayOfI = this.e;
        this.g = --i;
        i1 = arrayOfI[i];
      } 
      this.i = i1;
      return i1;
    } 
  }
  
  public final O n() throws E {
    synchronized (this.b) {
      p();
      if (this.d.isEmpty())
        return null; 
      return this.d.removeFirst();
    } 
  }
  
  public final void q(I paramI) throws E {
    synchronized (this.b) {
      boolean bool;
      p();
      if (paramI == this.i) {
        bool = true;
      } else {
        bool = false;
      } 
      e.a(bool);
      this.c.addLast(paramI);
      o();
      this.i = null;
      return;
    } 
  }
  
  protected void s(O paramO) {
    synchronized (this.b) {
      t(paramO);
      o();
      return;
    } 
  }
  
  protected final void v(int paramInt) {
    boolean bool;
    int i = this.g;
    int j = this.e.length;
    byte b = 0;
    if (i == j) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    I[] arrayOfI = this.e;
    i = arrayOfI.length;
    while (b < i) {
      arrayOfI[b].l(paramInt);
      b++;
    } 
  }
  
  class a extends Thread {
    a(g this$0) {}
    
    public void run() {
      g.f(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/b1/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */