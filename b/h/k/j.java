package b.h.k;

import android.view.MotionEvent;

public final class j {
  @Deprecated
  public static int a(MotionEvent paramMotionEvent, int paramInt) {
    return paramMotionEvent.findPointerIndex(paramInt);
  }
  
  @Deprecated
  public static int b(MotionEvent paramMotionEvent) {
    return paramMotionEvent.getActionIndex();
  }
  
  @Deprecated
  public static int c(MotionEvent paramMotionEvent) {
    return paramMotionEvent.getActionMasked();
  }
  
  @Deprecated
  public static int d(MotionEvent paramMotionEvent, int paramInt) {
    return paramMotionEvent.getPointerId(paramInt);
  }
  
  @Deprecated
  public static float e(MotionEvent paramMotionEvent, int paramInt) {
    return paramMotionEvent.getX(paramInt);
  }
  
  @Deprecated
  public static float f(MotionEvent paramMotionEvent, int paramInt) {
    return paramMotionEvent.getY(paramInt);
  }
  
  public static boolean g(MotionEvent paramMotionEvent, int paramInt) {
    boolean bool;
    if ((paramMotionEvent.getSource() & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */