package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.h0;

public final class n {
  private final WindowManager a;
  
  private final b b;
  
  private final a c;
  
  private long d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private long h;
  
  private boolean i;
  
  private long j;
  
  private long k;
  
  private long l;
  
  public n(Context paramContext) {
    a a1 = null;
    if (paramContext != null) {
      paramContext = paramContext.getApplicationContext();
      this.a = (WindowManager)paramContext.getSystemService("window");
    } else {
      this.a = null;
    } 
    if (this.a != null) {
      if (h0.a >= 17)
        a1 = g(paramContext); 
      this.c = a1;
      this.b = b.d();
    } else {
      this.c = null;
      this.b = null;
    } 
    this.d = -9223372036854775807L;
    this.e = -9223372036854775807L;
  }
  
  private static long c(long paramLong1, long paramLong2, long paramLong3) {
    paramLong2 += (paramLong1 - paramLong2) / paramLong3 * paramLong3;
    if (paramLong1 <= paramLong2) {
      paramLong3 = paramLong2 - paramLong3;
    } else {
      long l = paramLong3 + paramLong2;
      paramLong3 = paramLong2;
      paramLong2 = l;
    } 
    if (paramLong2 - paramLong1 >= paramLong1 - paramLong3)
      paramLong2 = paramLong3; 
    return paramLong2;
  }
  
  private boolean f(long paramLong1, long paramLong2) {
    boolean bool;
    long l = this.k;
    if (Math.abs(paramLong2 - this.j - paramLong1 - l) > 20000000L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @TargetApi(17)
  private a g(Context paramContext) {
    a a1;
    DisplayManager displayManager = (DisplayManager)paramContext.getSystemService("display");
    if (displayManager == null) {
      displayManager = null;
    } else {
      a1 = new a(this, displayManager);
    } 
    return a1;
  }
  
  private void h() {
    Display display = this.a.getDefaultDisplay();
    if (display != null) {
      double d = display.getRefreshRate();
      Double.isNaN(d);
      long l = (long)(1.0E9D / d);
      this.d = l;
      this.e = l * 80L / 100L;
    } 
  }
  
  public long b(long paramLong1, long paramLong2) {
    long l1 = 1000L * paramLong1;
    if (this.i) {
      if (paramLong1 != this.f) {
        this.l++;
        this.g = this.h;
      } 
      long l = this.l;
      if (l >= 6L) {
        l = (l1 - this.k) / l;
        long l4 = this.g + l;
        if (f(l4, paramLong2)) {
          this.i = false;
        } else {
          l = this.j + l4 - this.k;
          if (!this.i) {
            this.k = l1;
            this.j = paramLong2;
            this.l = 0L;
            this.i = true;
          } 
        } 
      } else if (f(l1, paramLong2)) {
        this.i = false;
      } 
    } 
    long l2 = paramLong2;
    long l3 = l1;
    if (!this.i) {
      this.k = l1;
      this.j = paramLong2;
      this.l = 0L;
      this.i = true;
    } 
  }
  
  public void d() {
    if (this.a != null) {
      a a1 = this.c;
      if (a1 != null)
        a1.b(); 
      this.b.e();
    } 
  }
  
  public void e() {
    this.i = false;
    if (this.a != null) {
      this.b.a();
      a a1 = this.c;
      if (a1 != null)
        a1.a(); 
      h();
    } 
  }
  
  @TargetApi(17)
  private final class a implements DisplayManager.DisplayListener {
    private final DisplayManager a;
    
    public a(n this$0, DisplayManager param1DisplayManager) {
      this.a = param1DisplayManager;
    }
    
    public void a() {
      this.a.registerDisplayListener(this, null);
    }
    
    public void b() {
      this.a.unregisterDisplayListener(this);
    }
    
    public void onDisplayAdded(int param1Int) {}
    
    public void onDisplayChanged(int param1Int) {
      if (param1Int == 0)
        n.a(this.b); 
    }
    
    public void onDisplayRemoved(int param1Int) {}
  }
  
  private static final class b implements Choreographer.FrameCallback, Handler.Callback {
    private static final b b = new b();
    
    public volatile long c = -9223372036854775807L;
    
    private final Handler d;
    
    private final HandlerThread e;
    
    private Choreographer f;
    
    private int g;
    
    private b() {
      HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
      this.e = handlerThread;
      handlerThread.start();
      Handler handler = h0.s(handlerThread.getLooper(), this);
      this.d = handler;
      handler.sendEmptyMessage(0);
    }
    
    private void b() {
      int i = this.g + 1;
      this.g = i;
      if (i == 1)
        this.f.postFrameCallback(this); 
    }
    
    private void c() {
      this.f = Choreographer.getInstance();
    }
    
    public static b d() {
      return b;
    }
    
    private void f() {
      int i = this.g - 1;
      this.g = i;
      if (i == 0) {
        this.f.removeFrameCallback(this);
        this.c = -9223372036854775807L;
      } 
    }
    
    public void a() {
      this.d.sendEmptyMessage(1);
    }
    
    public void doFrame(long param1Long) {
      this.c = param1Long;
      this.f.postFrameCallbackDelayed(this, 500L);
    }
    
    public void e() {
      this.d.sendEmptyMessage(2);
    }
    
    public boolean handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != 0) {
        if (i != 1) {
          if (i != 2)
            return false; 
          f();
          return true;
        } 
        b();
        return true;
      } 
      c();
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */