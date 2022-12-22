package com.google.android.exoplayer2.ui.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

class h extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {
  private final PointF b = new PointF();
  
  private final PointF c = new PointF();
  
  private final a d;
  
  private final float e;
  
  private final GestureDetector f;
  
  private volatile float g;
  
  private g h;
  
  public h(Context paramContext, a parama, float paramFloat) {
    this.d = parama;
    this.e = paramFloat;
    this.f = new GestureDetector(paramContext, (GestureDetector.OnGestureListener)this);
    this.g = 3.1415927F;
  }
  
  public void a(float[] paramArrayOffloat, float paramFloat) {
    this.g = -paramFloat;
  }
  
  public void b(g paramg) {
    this.h = paramg;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent) {
    this.b.set(paramMotionEvent.getX(), paramMotionEvent.getY());
    return true;
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2) {
    paramFloat1 = (paramMotionEvent2.getX() - this.b.x) / this.e;
    paramFloat2 = paramMotionEvent2.getY();
    PointF pointF = this.b;
    float f1 = (paramFloat2 - pointF.y) / this.e;
    pointF.set(paramMotionEvent2.getX(), paramMotionEvent2.getY());
    double d = this.g;
    float f2 = (float)Math.cos(d);
    paramFloat2 = (float)Math.sin(d);
    pointF = this.c;
    pointF.x -= f2 * paramFloat1 - paramFloat2 * f1;
    paramFloat1 = pointF.y + paramFloat2 * paramFloat1 + f2 * f1;
    pointF.y = paramFloat1;
    pointF.y = Math.max(-45.0F, Math.min(45.0F, paramFloat1));
    this.d.b(this.c);
    return true;
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent) {
    g g1 = this.h;
    return (g1 != null) ? g1.onSingleTapUp(paramMotionEvent) : false;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    return this.f.onTouchEvent(paramMotionEvent);
  }
  
  static interface a {
    void b(PointF param1PointF);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/spherical/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */