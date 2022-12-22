package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class Loader {
  public static final c a = g(false, -9223372036854775807L);
  
  public static final c b = g(true, -9223372036854775807L);
  
  public static final c c = new c(2, -9223372036854775807L, null);
  
  public static final c d = new c(3, -9223372036854775807L, null);
  
  private final ExecutorService e;
  
  private d<? extends e> f;
  
  private IOException g;
  
  public Loader(String paramString) {
    this.e = h0.b0(paramString);
  }
  
  public static c g(boolean paramBoolean, long paramLong) {
    return new c(paramBoolean, paramLong, null);
  }
  
  public void e() {
    ((d)com.google.android.exoplayer2.util.e.h(this.f)).a(false);
  }
  
  public void f() {
    this.g = null;
  }
  
  public boolean h() {
    boolean bool;
    if (this.g != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean i() {
    boolean bool;
    if (this.f != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void j() {
    k(-2147483648);
  }
  
  public void k(int paramInt) {
    d<? extends e> d1;
    IOException iOException = this.g;
    if (iOException == null) {
      d1 = this.f;
      if (d1 != null) {
        int i = paramInt;
        if (paramInt == Integer.MIN_VALUE)
          i = d1.b; 
        d1.e(i);
      } 
      return;
    } 
    throw d1;
  }
  
  public void l() {
    m(null);
  }
  
  public void m(f paramf) {
    d<? extends e> d1 = this.f;
    if (d1 != null)
      d1.a(true); 
    if (paramf != null)
      this.e.execute(new g(paramf)); 
    this.e.shutdown();
  }
  
  public <T extends e> long n(T paramT, b<T> paramb, int paramInt) {
    Looper looper = (Looper)com.google.android.exoplayer2.util.e.h(Looper.myLooper());
    this.g = null;
    long l = SystemClock.elapsedRealtime();
    (new d<e>(this, looper, (e)paramT, paramb, paramInt, l)).f(0L);
    return l;
  }
  
  public static final class UnexpectedLoaderException extends IOException {
    public UnexpectedLoaderException(Throwable param1Throwable) {
      super(stringBuilder.toString(), param1Throwable);
    }
  }
  
  public static interface b<T extends e> {
    void c(T param1T, long param1Long1, long param1Long2, boolean param1Boolean);
    
    void e(T param1T, long param1Long1, long param1Long2);
    
    Loader.c n(T param1T, long param1Long1, long param1Long2, IOException param1IOException, int param1Int);
  }
  
  public static final class c {
    private final int a;
    
    private final long b;
    
    private c(int param1Int, long param1Long) {
      this.a = param1Int;
      this.b = param1Long;
    }
    
    public boolean c() {
      int i = this.a;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i != 0)
        if (i == 1) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }  
      return bool2;
    }
  }
  
  @SuppressLint({"HandlerLeak"})
  private final class d<T extends e> extends Handler implements Runnable {
    public final int b;
    
    private final T c;
    
    private final long d;
    
    private Loader.b<T> e;
    
    private IOException f;
    
    private int g;
    
    private volatile Thread h;
    
    private volatile boolean i;
    
    private volatile boolean j;
    
    public d(Loader this$0, Looper param1Looper, T param1T, Loader.b<T> param1b, int param1Int, long param1Long) {
      super(param1Looper);
      this.c = param1T;
      this.e = param1b;
      this.b = param1Int;
      this.d = param1Long;
    }
    
    private void b() {
      this.f = null;
      Loader.d(this.k).execute((Runnable)com.google.android.exoplayer2.util.e.e(Loader.a(this.k)));
    }
    
    private void c() {
      Loader.b(this.k, null);
    }
    
    private long d() {
      return Math.min((this.g - 1) * 1000, 5000);
    }
    
    public void a(boolean param1Boolean) {
      this.j = param1Boolean;
      this.f = null;
      if (hasMessages(0)) {
        removeMessages(0);
        if (!param1Boolean)
          sendEmptyMessage(1); 
      } else {
        this.i = true;
        this.c.a();
        Thread thread = this.h;
        if (thread != null)
          thread.interrupt(); 
      } 
      if (param1Boolean) {
        c();
        long l = SystemClock.elapsedRealtime();
        ((Loader.b<T>)com.google.android.exoplayer2.util.e.e(this.e)).c(this.c, l, l - this.d, true);
        this.e = null;
      } 
    }
    
    public void e(int param1Int) {
      IOException iOException = this.f;
      if (iOException == null || this.g <= param1Int)
        return; 
      throw iOException;
    }
    
    public void f(long param1Long) {
      boolean bool;
      if (Loader.a(this.k) == null) {
        bool = true;
      } else {
        bool = false;
      } 
      com.google.android.exoplayer2.util.e.f(bool);
      Loader.b(this.k, this);
      if (param1Long > 0L) {
        sendEmptyMessageDelayed(0, param1Long);
      } else {
        b();
      } 
    }
    
    public void handleMessage(Message param1Message) {
      if (this.j)
        return; 
      int i = param1Message.what;
      if (i == 0) {
        b();
        return;
      } 
      if (i != 4) {
        c();
        long l1 = SystemClock.elapsedRealtime();
        long l2 = l1 - this.d;
        Loader.b<T> b1 = (Loader.b)com.google.android.exoplayer2.util.e.e(this.e);
        if (this.i) {
          b1.c(this.c, l1, l2, false);
          return;
        } 
        i = param1Message.what;
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              IOException iOException = (IOException)param1Message.obj;
              this.f = iOException;
              i = this.g + 1;
              this.g = i;
              Loader.c c = b1.n(this.c, l1, l2, iOException, i);
              if (Loader.c.a(c) == 3) {
                Loader.c(this.k, this.f);
              } else if (Loader.c.a(c) != 2) {
                if (Loader.c.a(c) == 1)
                  this.g = 1; 
                if (Loader.c.b(c) != -9223372036854775807L) {
                  l1 = Loader.c.b(c);
                } else {
                  l1 = d();
                } 
                f(l1);
              } 
            } 
          } else {
            try {
              b1.e(this.c, l1, l2);
            } catch (RuntimeException runtimeException) {
              o.d("LoadTask", "Unexpected exception handling load completed", runtimeException);
              Loader.c(this.k, new Loader.UnexpectedLoaderException(runtimeException));
            } 
          } 
        } else {
          b1.c(this.c, l1, l2, false);
        } 
        return;
      } 
      throw (Error)runtimeException.obj;
    }
    
    public void run() {
      try {
        this.h = Thread.currentThread();
        if (!this.i) {
          null = new StringBuilder();
          this();
          null.append("load:");
          null.append(this.c.getClass().getSimpleName());
          f0.a(null.toString());
          try {
            this.c.b();
          } finally {
            f0.c();
          } 
        } 
        if (!this.j)
          sendEmptyMessage(2); 
      } catch (IOException iOException) {
        if (!this.j)
          obtainMessage(3, iOException).sendToTarget(); 
      } catch (InterruptedException interruptedException) {
        com.google.android.exoplayer2.util.e.f(this.i);
        if (!this.j)
          sendEmptyMessage(2); 
      } catch (Exception exception) {
        o.d("LoadTask", "Unexpected exception loading stream", exception);
        if (!this.j)
          obtainMessage(3, new Loader.UnexpectedLoaderException(exception)).sendToTarget(); 
      } catch (OutOfMemoryError outOfMemoryError) {
        o.d("LoadTask", "OutOfMemory error loading stream", outOfMemoryError);
        if (!this.j)
          obtainMessage(3, new Loader.UnexpectedLoaderException(outOfMemoryError)).sendToTarget(); 
      } catch (Error error) {
        o.d("LoadTask", "Unexpected error loading stream", error);
        if (!this.j)
          obtainMessage(4, error).sendToTarget(); 
        throw error;
      } 
    }
  }
  
  public static interface e {
    void a();
    
    void b();
  }
  
  public static interface f {
    void b();
  }
  
  private static final class g implements Runnable {
    private final Loader.f b;
    
    public g(Loader.f param1f) {
      this.b = param1f;
    }
    
    public void run() {
      this.b.b();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/Loader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */