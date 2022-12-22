package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

final class jk2 implements Handler.Callback, Choreographer.FrameCallback {
  private static final jk2 b = new jk2();
  
  public volatile long c;
  
  private final Handler d;
  
  private final HandlerThread e;
  
  private Choreographer f;
  
  private int g;
  
  private jk2() {
    HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
    this.e = handlerThread;
    handlerThread.start();
    Handler handler = new Handler(handlerThread.getLooper(), this);
    this.d = handler;
    handler.sendEmptyMessage(0);
  }
  
  public static jk2 b() {
    return b;
  }
  
  public final void a() {
    this.d.sendEmptyMessage(2);
  }
  
  public final void c() {
    this.d.sendEmptyMessage(1);
  }
  
  public final void doFrame(long paramLong) {
    this.c = paramLong;
    this.f.postFrameCallbackDelayed(this, 500L);
  }
  
  public final boolean handleMessage(Message paramMessage) {
    int i = paramMessage.what;
    if (i != 0) {
      if (i != 1) {
        if (i != 2)
          return false; 
        i = this.g - 1;
        this.g = i;
        if (i == 0) {
          this.f.removeFrameCallback(this);
          this.c = 0L;
        } 
        return true;
      } 
      i = this.g + 1;
      this.g = i;
      if (i == 1)
        this.f.postFrameCallback(this); 
      return true;
    } 
    this.f = Choreographer.getInstance();
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */