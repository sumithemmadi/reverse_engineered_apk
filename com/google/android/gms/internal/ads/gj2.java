package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

@SuppressLint({"HandlerLeak"})
final class gj2<T extends fj2> extends Handler implements Runnable {
  private final T b;
  
  private final cj2<T> c;
  
  public final int d;
  
  private final long e;
  
  private IOException f;
  
  private int g;
  
  private volatile Thread h;
  
  private volatile boolean i;
  
  public gj2(ej2 paramej2, Looper paramLooper, T paramT, cj2<T> paramcj2, int paramInt, long paramLong) {
    super(paramLooper);
    this.b = paramT;
    this.c = paramcj2;
    this.d = paramInt;
    this.e = paramLong;
  }
  
  private final void a() {
    this.f = null;
    ej2.g(this.j).execute(ej2.c(this.j));
  }
  
  private final void b() {
    ej2.d(this.j, null);
  }
  
  public final void c(int paramInt) {
    IOException iOException = this.f;
    if (iOException == null || this.g <= paramInt)
      return; 
    throw iOException;
  }
  
  public final void d(long paramLong) {
    boolean bool;
    if (ej2.c(this.j) == null) {
      bool = true;
    } else {
      bool = false;
    } 
    jj2.e(bool);
    ej2.d(this.j, this);
    if (paramLong > 0L) {
      sendEmptyMessageDelayed(0, paramLong);
      return;
    } 
    a();
  }
  
  public final void e(boolean paramBoolean) {
    this.i = paramBoolean;
    this.f = null;
    if (hasMessages(0)) {
      removeMessages(0);
      if (!paramBoolean)
        sendEmptyMessage(1); 
    } else {
      this.b.a();
      if (this.h != null)
        this.h.interrupt(); 
    } 
    if (paramBoolean) {
      b();
      long l = SystemClock.elapsedRealtime();
      this.c.j(this.b, l, l - this.e, true);
    } 
  }
  
  public final void handleMessage(Message paramMessage) {
    IOException iOException;
    if (this.i)
      return; 
    int i = paramMessage.what;
    if (i == 0) {
      a();
      return;
    } 
    if (i != 4) {
      b();
      long l1 = SystemClock.elapsedRealtime();
      long l2 = l1 - this.e;
      if (this.b.c()) {
        this.c.j(this.b, l1, l2, false);
        return;
      } 
      i = paramMessage.what;
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            iOException = (IOException)paramMessage.obj;
            this.f = iOException;
            i = this.c.g(this.b, l1, l2, iOException);
            if (i == 3) {
              ej2.e(this.j, this.f);
              return;
            } 
            if (i != 2) {
              if (i == 1) {
                i = 1;
              } else {
                i = this.g + 1;
              } 
              this.g = i;
              d(Math.min((i - 1) * 1000, 5000));
            } 
          } 
          return;
        } 
        this.c.m(this.b, l1, l2);
        return;
      } 
      this.c.j(this.b, l1, l2, false);
      return;
    } 
    throw (Error)iOException.obj;
  }
  
  public final void run() {
    try {
      this.h = Thread.currentThread();
      if (!this.b.c()) {
        null = this.b.getClass().getSimpleName();
        if (null.length() != 0) {
          null = "load:".concat(null);
        } else {
          null = new String("load:");
        } 
        xj2.a(null);
        try {
          this.b.b();
        } finally {
          xj2.b();
        } 
      } 
      if (!this.i)
        sendEmptyMessage(2); 
      return;
    } catch (IOException iOException) {
      if (!this.i)
        obtainMessage(3, iOException).sendToTarget(); 
      return;
    } catch (InterruptedException interruptedException) {
      jj2.e(this.b.c());
      if (!this.i)
        sendEmptyMessage(2); 
      return;
    } catch (Exception exception) {
      Log.e("LoadTask", "Unexpected exception loading stream", exception);
      if (!this.i)
        obtainMessage(3, new zzpe(exception)).sendToTarget(); 
      return;
    } catch (OutOfMemoryError outOfMemoryError) {
      Log.e("LoadTask", "OutOfMemory error loading stream", outOfMemoryError);
      if (!this.i)
        obtainMessage(3, new zzpe(outOfMemoryError)).sendToTarget(); 
      return;
    } catch (Error error) {
      Log.e("LoadTask", "Unexpected error loading stream", error);
      if (!this.i)
        obtainMessage(4, error).sendToTarget(); 
      throw error;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gj2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */