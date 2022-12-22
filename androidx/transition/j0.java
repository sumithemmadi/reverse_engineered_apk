package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import b.h.k.w;

class j0 {
  private static final p0 a;
  
  static final Property<View, Float> b = new a(Float.class, "translationAlpha");
  
  static final Property<View, Rect> c = new b(Rect.class, "clipBounds");
  
  static void a(View paramView) {
    a.a(paramView);
  }
  
  static i0 b(View paramView) {
    return (i0)((Build.VERSION.SDK_INT >= 18) ? new h0(paramView) : g0.e(paramView));
  }
  
  static float c(View paramView) {
    return a.c(paramView);
  }
  
  static t0 d(View paramView) {
    return (t0)((Build.VERSION.SDK_INT >= 18) ? new s0(paramView) : new r0(paramView.getWindowToken()));
  }
  
  static void e(View paramView) {
    a.d(paramView);
  }
  
  static void f(View paramView, Matrix paramMatrix) {
    a.e(paramView, paramMatrix);
  }
  
  static void g(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.f(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static void h(View paramView, float paramFloat) {
    a.g(paramView, paramFloat);
  }
  
  static void i(View paramView, int paramInt) {
    a.h(paramView, paramInt);
  }
  
  static void j(View paramView, Matrix paramMatrix) {
    a.i(paramView, paramMatrix);
  }
  
  static void k(View paramView, Matrix paramMatrix) {
    a.j(paramView, paramMatrix);
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      a = new o0();
    } else if (i >= 23) {
      a = new n0();
    } else if (i >= 22) {
      a = new m0();
    } else if (i >= 21) {
      a = new l0();
    } else if (i >= 19) {
      a = new k0();
    } else {
      a = new p0();
    } 
  }
  
  static final class a extends Property<View, Float> {
    a(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Float a(View param1View) {
      return Float.valueOf(j0.c(param1View));
    }
    
    public void b(View param1View, Float param1Float) {
      j0.h(param1View, param1Float.floatValue());
    }
  }
  
  static final class b extends Property<View, Rect> {
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Rect a(View param1View) {
      return w.u(param1View);
    }
    
    public void b(View param1View, Rect param1Rect) {
      w.x0(param1View, param1Rect);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */