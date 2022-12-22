package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.h.k.w;

public class ChangeClipBounds extends Transition {
  private static final String[] L = new String[] { "android:clipBounds:clip" };
  
  public ChangeClipBounds() {}
  
  public ChangeClipBounds(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void o0(y paramy) {
    View view = paramy.b;
    if (view.getVisibility() == 8)
      return; 
    Rect rect = w.u(view);
    paramy.a.put("android:clipBounds:clip", rect);
    if (rect == null) {
      Rect rect1 = new Rect(0, 0, view.getWidth(), view.getHeight());
      paramy.a.put("android:clipBounds:bounds", rect1);
    } 
  }
  
  public String[] M() {
    return L;
  }
  
  public void l(y paramy) {
    o0(paramy);
  }
  
  public void q(y paramy) {
    o0(paramy);
  }
  
  public Animator v(ViewGroup paramViewGroup, y paramy1, y paramy2) {
    ObjectAnimator objectAnimator;
    ViewGroup viewGroup = null;
    paramViewGroup = viewGroup;
    if (paramy1 != null) {
      paramViewGroup = viewGroup;
      if (paramy2 != null) {
        paramViewGroup = viewGroup;
        if (paramy1.a.containsKey("android:clipBounds:clip"))
          if (!paramy2.a.containsKey("android:clipBounds:clip")) {
            paramViewGroup = viewGroup;
          } else {
            Rect rect1;
            Rect rect2;
            boolean bool;
            Rect rect3 = (Rect)paramy1.a.get("android:clipBounds:clip");
            Rect rect4 = (Rect)paramy2.a.get("android:clipBounds:clip");
            if (rect4 == null) {
              bool = true;
            } else {
              bool = false;
            } 
            if (rect3 == null && rect4 == null)
              return null; 
            if (rect3 == null) {
              rect1 = (Rect)paramy1.a.get("android:clipBounds:bounds");
              rect2 = rect4;
            } else {
              rect1 = rect3;
              rect2 = rect4;
              if (rect4 == null) {
                rect2 = (Rect)paramy2.a.get("android:clipBounds:bounds");
                rect1 = rect3;
              } 
            } 
            if (rect1.equals(rect2))
              return null; 
            w.x0(paramy2.b, rect1);
            q q = new q(new Rect());
            ObjectAnimator objectAnimator1 = ObjectAnimator.ofObject(paramy2.b, j0.c, q, (Object[])new Rect[] { rect1, rect2 });
            objectAnimator = objectAnimator1;
            if (bool) {
              objectAnimator1.addListener((Animator.AnimatorListener)new a(this, paramy2.b));
              objectAnimator = objectAnimator1;
            } 
          }  
      } 
    } 
    return (Animator)objectAnimator;
  }
  
  class a extends AnimatorListenerAdapter {
    a(ChangeClipBounds this$0, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      w.x0(this.a, null);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/ChangeClipBounds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */