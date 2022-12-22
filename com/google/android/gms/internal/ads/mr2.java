package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class mr2 extends Thread {
  private final BlockingQueue<w<?>> b;
  
  private final bo2 c;
  
  private final me2 d;
  
  private final i9 e;
  
  private volatile boolean f = false;
  
  public mr2(BlockingQueue<w<?>> paramBlockingQueue, bo2 parambo2, me2 paramme2, i9 parami9) {
    this.b = paramBlockingQueue;
    this.c = parambo2;
    this.d = paramme2;
    this.e = parami9;
  }
  
  private final void a() {
    Exception exception;
    w<?> w = this.b.take();
    long l = SystemClock.elapsedRealtime();
    w.w(3);
    try {
      w.u("network-queue-take");
      w.i();
      TrafficStats.setThreadStatsTag(w.v());
      kt2 kt2 = this.c.a(w);
      w.u("network-http-complete");
      if (kt2.e && w.G()) {
        w.x("not-modified");
        w.H();
        w.w(4);
        return;
      } 
      v4<?> v4 = w.m(kt2);
      w.u("network-parse-complete");
      if (w.C() && v4.b != null) {
        this.d.b(w.z(), v4.b);
        w.u("network-cache-written");
      } 
      w.F();
      this.e.b(w, v4);
      w.q(v4);
      w.w(4);
      return;
    } catch (zzap null) {
      exception.zza(SystemClock.elapsedRealtime() - l);
      this.e.a(w, (zzap)exception);
      w.H();
      w.w(4);
      return;
    } catch (Exception exception1) {
      ic.e(exception1, "Unhandled exception %s", new Object[] { exception1.toString() });
      exception = new zzap();
      this(exception1);
      exception.zza(SystemClock.elapsedRealtime() - l);
      this.e.a(w, (zzap)exception);
      w.H();
      w.w(4);
      return;
    } finally {}
    w.w(4);
    throw exception;
  }
  
  public final void b() {
    this.f = true;
    interrupt();
  }
  
  public final void run() {
    Process.setThreadPriority(10);
    while (true) {
      try {
        while (true)
          a(); 
        break;
      } catch (InterruptedException interruptedException) {
        if (this.f) {
          Thread.currentThread().interrupt();
          return;
        } 
        ic.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mr2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */