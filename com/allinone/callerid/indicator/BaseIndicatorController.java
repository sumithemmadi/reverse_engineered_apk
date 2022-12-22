package com.allinone.callerid.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class BaseIndicatorController {
  private WeakReference<View> a;
  
  private List<c.f.a.a> b;
  
  public abstract List<c.f.a.a> a();
  
  public abstract void b(Canvas paramCanvas, Paint paramPaint);
  
  public int c() {
    boolean bool;
    if (d() != null) {
      bool = d().getHeight();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public View d() {
    WeakReference<View> weakReference = this.a;
    if (weakReference != null) {
      View view = weakReference.get();
    } else {
      weakReference = null;
    } 
    return (View)weakReference;
  }
  
  public int e() {
    boolean bool;
    if (d() != null) {
      bool = d().getWidth();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void f() {
    this.b = a();
  }
  
  public void g() {
    if (d() != null)
      d().postInvalidate(); 
  }
  
  public void h(AnimStatus paramAnimStatus) {
    List<c.f.a.a> list = this.b;
    if (list == null)
      return; 
    int i = list.size();
    for (byte b = 0; b < i; b++) {
      c.f.a.a a = this.b.get(b);
      boolean bool = a.f();
      int j = a.a[paramAnimStatus.ordinal()];
      if (j != 1) {
        if (j != 2) {
          if (j == 3 && bool)
            a.cancel(); 
        } else if (bool) {
          a.b();
        } 
      } else if (!bool) {
        a.g();
      } 
    } 
  }
  
  public void i(View paramView) {
    this.a = new WeakReference<View>(paramView);
  }
  
  public enum AnimStatus {
    b, c, d;
    
    static {
      AnimStatus animStatus1 = new AnimStatus("START", 0);
      b = animStatus1;
      AnimStatus animStatus2 = new AnimStatus("END", 1);
      c = animStatus2;
      AnimStatus animStatus3 = new AnimStatus("CANCEL", 2);
      d = animStatus3;
      e = new AnimStatus[] { animStatus1, animStatus2, animStatus3 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/indicator/BaseIndicatorController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */