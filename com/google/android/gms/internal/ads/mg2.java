package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class mg2 extends Thread {
  private static final boolean b = ic.b;
  
  private final BlockingQueue<w<?>> c;
  
  private final BlockingQueue<w<?>> d;
  
  private final me2 e;
  
  private final i9 f;
  
  private volatile boolean g = false;
  
  private final mf h;
  
  public mg2(BlockingQueue<w<?>> paramBlockingQueue1, BlockingQueue<w<?>> paramBlockingQueue2, me2 paramme2, i9 parami9) {
    this.c = paramBlockingQueue1;
    this.d = paramBlockingQueue2;
    this.e = paramme2;
    this.f = parami9;
    this.h = new mf(this, paramBlockingQueue2, parami9);
  }
  
  private final void a() {
    w<?> w = this.c.take();
    w.u("cache-queue-take");
    w.w(1);
    try {
      boolean bool;
      w.i();
      hh2 hh2 = this.e.a(w.z());
      if (hh2 == null) {
        w.u("cache-miss");
        if (!this.h.c(w))
          this.d.put(w); 
        return;
      } 
      if (hh2.a()) {
        w.u("cache-hit-expired");
        w.l(hh2);
        if (!this.h.c(w))
          this.d.put(w); 
        return;
      } 
      w.u("cache-hit");
      kt2 kt2 = new kt2();
      this(hh2.a, hh2.g);
      v4<?> v4 = w.m(kt2);
      w.u("cache-hit-parsed");
      if (!v4.a()) {
        w.u("cache-parsing-failed");
        this.e.c(w.z(), true);
        w.l(null);
        if (!this.h.c(w))
          this.d.put(w); 
        return;
      } 
      if (hh2.f < System.currentTimeMillis()) {
        bool = true;
      } else {
        bool = false;
      } 
      if (!bool) {
        this.f.b(w, v4);
      } else {
        w.u("cache-hit-refresh-needed");
        w.l(hh2);
        v4.d = true;
        if (!this.h.c(w)) {
          i9 i91 = this.f;
          dj2 dj2 = new dj2();
          this(this, w);
          i91.c(w, v4, dj2);
        } else {
          this.f.b(w, v4);
        } 
      } 
      return;
    } finally {
      w.w(2);
    } 
  }
  
  public final void b() {
    this.g = true;
    interrupt();
  }
  
  public final void run() {
    if (b)
      ic.c("start new dispatcher", new Object[0]); 
    Process.setThreadPriority(10);
    this.e.D();
    while (true) {
      try {
        while (true)
          a(); 
        break;
      } catch (InterruptedException interruptedException) {
        if (this.g) {
          Thread.currentThread().interrupt();
          return;
        } 
        ic.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */