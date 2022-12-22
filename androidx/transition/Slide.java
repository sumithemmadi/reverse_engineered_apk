package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import b.h.k.w;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
  private static final TimeInterpolator N = (TimeInterpolator)new DecelerateInterpolator();
  
  private static final TimeInterpolator O = (TimeInterpolator)new AccelerateInterpolator();
  
  private static final g P = new a();
  
  private static final g Q = new b();
  
  private static final g R = new c();
  
  private static final g S = new d();
  
  private static final g T = new e();
  
  private static final g U = new f();
  
  private g V = U;
  
  private int W = 80;
  
  public Slide() {
    w0(80);
  }
  
  @SuppressLint({"RestrictedApi"})
  public Slide(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.h);
    int i = androidx.core.content.d.g.g(typedArray, (XmlPullParser)paramAttributeSet, "slideEdge", 0, 80);
    typedArray.recycle();
    w0(i);
  }
  
  private void o0(y paramy) {
    View view = paramy.b;
    int[] arrayOfInt = new int[2];
    view.getLocationOnScreen(arrayOfInt);
    paramy.a.put("android:slide:screenPosition", arrayOfInt);
  }
  
  public void l(y paramy) {
    super.l(paramy);
    o0(paramy);
  }
  
  public void q(y paramy) {
    super.q(paramy);
    o0(paramy);
  }
  
  public Animator r0(ViewGroup paramViewGroup, View paramView, y paramy1, y paramy2) {
    if (paramy2 == null)
      return null; 
    int[] arrayOfInt = (int[])paramy2.a.get("android:slide:screenPosition");
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    float f3 = this.V.b(paramViewGroup, paramView);
    float f4 = this.V.a(paramViewGroup, paramView);
    return a0.a(paramView, paramy2, arrayOfInt[0], arrayOfInt[1], f3, f4, f1, f2, N, this);
  }
  
  public Animator t0(ViewGroup paramViewGroup, View paramView, y paramy1, y paramy2) {
    if (paramy1 == null)
      return null; 
    int[] arrayOfInt = (int[])paramy1.a.get("android:slide:screenPosition");
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    float f3 = this.V.b(paramViewGroup, paramView);
    float f4 = this.V.a(paramViewGroup, paramView);
    return a0.a(paramView, paramy1, arrayOfInt[0], arrayOfInt[1], f1, f2, f3, f4, O, this);
  }
  
  public void w0(int paramInt) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 48) {
          if (paramInt != 80) {
            if (paramInt != 8388611) {
              if (paramInt == 8388613) {
                this.V = T;
              } else {
                throw new IllegalArgumentException("Invalid slide direction");
              } 
            } else {
              this.V = Q;
            } 
          } else {
            this.V = U;
          } 
        } else {
          this.V = R;
        } 
      } else {
        this.V = S;
      } 
    } else {
      this.V = P;
    } 
    this.W = paramInt;
    s s = new s();
    s.j(paramInt);
    k0(s);
  }
  
  static final class a extends h {
    a() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationX() - param1ViewGroup.getWidth();
    }
  }
  
  static final class b extends h {
    b() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      float f;
      int i = w.C((View)param1ViewGroup);
      boolean bool = true;
      if (i != 1)
        bool = false; 
      if (bool) {
        f = param1View.getTranslationX() + param1ViewGroup.getWidth();
      } else {
        f = param1View.getTranslationX() - param1ViewGroup.getWidth();
      } 
      return f;
    }
  }
  
  static final class c extends i {
    c() {
      super(null);
    }
    
    public float a(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationY() - param1ViewGroup.getHeight();
    }
  }
  
  static final class d extends h {
    d() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationX() + param1ViewGroup.getWidth();
    }
  }
  
  static final class e extends h {
    e() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      float f;
      int i = w.C((View)param1ViewGroup);
      boolean bool = true;
      if (i != 1)
        bool = false; 
      if (bool) {
        f = param1View.getTranslationX() - param1ViewGroup.getWidth();
      } else {
        f = param1View.getTranslationX() + param1ViewGroup.getWidth();
      } 
      return f;
    }
  }
  
  static final class f extends i {
    f() {
      super(null);
    }
    
    public float a(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationY() + param1ViewGroup.getHeight();
    }
  }
  
  private static interface g {
    float a(ViewGroup param1ViewGroup, View param1View);
    
    float b(ViewGroup param1ViewGroup, View param1View);
  }
  
  private static abstract class h implements g {
    private h() {}
    
    public float a(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationY();
    }
  }
  
  private static abstract class i implements g {
    private i() {}
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationX();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/Slide.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */