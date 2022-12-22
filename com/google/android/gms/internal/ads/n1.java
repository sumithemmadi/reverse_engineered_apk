package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

public final class n1 {
  private MotionEvent a = MotionEvent.obtain(0L, 0L, 1, 0.0F, 0.0F, 0);
  
  private MotionEvent b = MotionEvent.obtain(0L, 0L, 0, 0.0F, 0.0F, 0);
  
  public final void a(MotionEvent paramMotionEvent) {
    if (paramMotionEvent.getAction() == 1 && paramMotionEvent.getEventTime() > this.a.getEventTime()) {
      this.a = MotionEvent.obtain(paramMotionEvent);
      return;
    } 
    if (paramMotionEvent.getAction() == 0 && paramMotionEvent.getEventTime() > this.b.getEventTime())
      this.b = MotionEvent.obtain(paramMotionEvent); 
  }
  
  public final MotionEvent b() {
    return this.a;
  }
  
  public final MotionEvent c() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */