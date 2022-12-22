package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeScroll extends Transition {
  private static final String[] L = new String[] { "android:changeScroll:x", "android:changeScroll:y" };
  
  public ChangeScroll() {}
  
  public ChangeScroll(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private void o0(y paramy) {
    paramy.a.put("android:changeScroll:x", Integer.valueOf(paramy.b.getScrollX()));
    paramy.a.put("android:changeScroll:y", Integer.valueOf(paramy.b.getScrollY()));
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
    Animator animator;
    ViewGroup viewGroup = null;
    y y1 = null;
    paramViewGroup = viewGroup;
    if (paramy1 != null)
      if (paramy2 == null) {
        paramViewGroup = viewGroup;
      } else {
        ObjectAnimator objectAnimator;
        View view = paramy2.b;
        int i = ((Integer)paramy1.a.get("android:changeScroll:x")).intValue();
        int j = ((Integer)paramy2.a.get("android:changeScroll:x")).intValue();
        int k = ((Integer)paramy1.a.get("android:changeScroll:y")).intValue();
        int m = ((Integer)paramy2.a.get("android:changeScroll:y")).intValue();
        if (i != j) {
          view.setScrollX(i);
          ObjectAnimator objectAnimator1 = ObjectAnimator.ofInt(view, "scrollX", new int[] { i, j });
        } else {
          paramViewGroup = null;
        } 
        paramy1 = y1;
        if (k != m) {
          view.setScrollY(k);
          objectAnimator = ObjectAnimator.ofInt(view, "scrollY", new int[] { k, m });
        } 
        animator = x.c((Animator)paramViewGroup, (Animator)objectAnimator);
      }  
    return animator;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/ChangeScroll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */