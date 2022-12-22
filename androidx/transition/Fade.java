package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.d.g;
import b.h.k.w;
import org.xmlpull.v1.XmlPullParser;

public class Fade extends Visibility {
  public Fade() {}
  
  public Fade(int paramInt) {
    v0(paramInt);
  }
  
  @SuppressLint({"RestrictedApi"})
  public Fade(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.f);
    v0(g.g(typedArray, (XmlPullParser)paramAttributeSet, "fadingMode", 0, p0()));
    typedArray.recycle();
  }
  
  private Animator w0(View paramView, float paramFloat1, float paramFloat2) {
    if (paramFloat1 == paramFloat2)
      return null; 
    j0.h(paramView, paramFloat1);
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramView, j0.b, new float[] { paramFloat2 });
    objectAnimator.addListener((Animator.AnimatorListener)new b(paramView));
    a(new a(this, paramView));
    return (Animator)objectAnimator;
  }
  
  private static float x0(y paramy, float paramFloat) {
    float f = paramFloat;
    if (paramy != null) {
      Float float_ = (Float)paramy.a.get("android:fade:transitionAlpha");
      f = paramFloat;
      if (float_ != null)
        f = float_.floatValue(); 
    } 
    return f;
  }
  
  public void q(y paramy) {
    super.q(paramy);
    paramy.a.put("android:fade:transitionAlpha", Float.valueOf(j0.c(paramy.b)));
  }
  
  public Animator r0(ViewGroup paramViewGroup, View paramView, y paramy1, y paramy2) {
    float f1 = 0.0F;
    float f2 = x0(paramy1, 0.0F);
    if (f2 != 1.0F)
      f1 = f2; 
    return w0(paramView, f1, 1.0F);
  }
  
  public Animator t0(ViewGroup paramViewGroup, View paramView, y paramy1, y paramy2) {
    j0.e(paramView);
    return w0(paramView, x0(paramy1, 1.0F), 0.0F);
  }
  
  class a extends u {
    a(Fade this$0, View param1View) {}
    
    public void c(Transition param1Transition) {
      j0.h(this.a, 1.0F);
      j0.a(this.a);
      param1Transition.a0(this);
    }
  }
  
  private static class b extends AnimatorListenerAdapter {
    private final View a;
    
    private boolean b = false;
    
    b(View param1View) {
      this.a = param1View;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      j0.h(this.a, 1.0F);
      if (this.b)
        this.a.setLayerType(0, null); 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      if (w.R(this.a) && this.a.getLayerType() == 0) {
        this.b = true;
        this.a.setLayerType(2, null);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/Fade.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */