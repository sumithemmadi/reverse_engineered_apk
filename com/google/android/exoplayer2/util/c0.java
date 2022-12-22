package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class c0 implements n {
  private final Handler a;
  
  public c0(Handler paramHandler) {
    this.a = paramHandler;
  }
  
  public Message a(int paramInt1, int paramInt2, int paramInt3) {
    return this.a.obtainMessage(paramInt1, paramInt2, paramInt3);
  }
  
  public boolean b(int paramInt) {
    return this.a.sendEmptyMessage(paramInt);
  }
  
  public Message c(int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
    return this.a.obtainMessage(paramInt1, paramInt2, paramInt3, paramObject);
  }
  
  public boolean d(int paramInt, long paramLong) {
    return this.a.sendEmptyMessageAtTime(paramInt, paramLong);
  }
  
  public void e(int paramInt) {
    this.a.removeMessages(paramInt);
  }
  
  public Message f(int paramInt, Object paramObject) {
    return this.a.obtainMessage(paramInt, paramObject);
  }
  
  public Looper g() {
    return this.a.getLooper();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/util/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */