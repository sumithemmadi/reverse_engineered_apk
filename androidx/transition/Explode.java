package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class Explode extends Visibility {
  private static final TimeInterpolator N = (TimeInterpolator)new DecelerateInterpolator();
  
  private static final TimeInterpolator O = (TimeInterpolator)new AccelerateInterpolator();
  
  private int[] P = new int[2];
  
  public Explode() {
    k0(new c());
  }
  
  public Explode(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    k0(new c());
  }
  
  private void o0(y paramy) {
    View view = paramy.b;
    view.getLocationOnScreen(this.P);
    int[] arrayOfInt = this.P;
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    int k = view.getWidth();
    int m = view.getHeight();
    paramy.a.put("android:explode:screenBounds", new Rect(i, j, k + i, m + j));
  }
  
  private static float w0(float paramFloat1, float paramFloat2) {
    return (float)Math.sqrt((paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2));
  }
  
  private static float x0(View paramView, int paramInt1, int paramInt2) {
    paramInt1 = Math.max(paramInt1, paramView.getWidth() - paramInt1);
    paramInt2 = Math.max(paramInt2, paramView.getHeight() - paramInt2);
    return w0(paramInt1, paramInt2);
  }
  
  private void y0(View paramView, Rect paramRect, int[] paramArrayOfint) {
    int k;
    int m;
    paramView.getLocationOnScreen(this.P);
    int[] arrayOfInt = this.P;
    int i = arrayOfInt[0];
    int j = arrayOfInt[1];
    Rect rect = z();
    if (rect == null) {
      k = paramView.getWidth() / 2 + i + Math.round(paramView.getTranslationX());
      m = paramView.getHeight() / 2 + j + Math.round(paramView.getTranslationY());
    } else {
      k = rect.centerX();
      m = rect.centerY();
    } 
    int n = paramRect.centerX();
    int i1 = paramRect.centerY();
    float f1 = (n - k);
    float f2 = (i1 - m);
    float f3 = f1;
    float f4 = f2;
    if (f1 == 0.0F) {
      f3 = f1;
      f4 = f2;
      if (f2 == 0.0F) {
        f3 = (float)(Math.random() * 2.0D) - 1.0F;
        f4 = (float)(Math.random() * 2.0D) - 1.0F;
      } 
    } 
    f1 = w0(f3, f4);
    f3 /= f1;
    f4 /= f1;
    f1 = x0(paramView, k - i, m - j);
    paramArrayOfint[0] = Math.round(f3 * f1);
    paramArrayOfint[1] = Math.round(f1 * f4);
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
    Rect rect = (Rect)paramy2.a.get("android:explode:screenBounds");
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    y0((View)paramViewGroup, rect, this.P);
    int[] arrayOfInt = this.P;
    float f3 = arrayOfInt[0];
    float f4 = arrayOfInt[1];
    return a0.a(paramView, paramy2, rect.left, rect.top, f1 + f3, f2 + f4, f1, f2, N, this);
  }
  
  public Animator t0(ViewGroup paramViewGroup, View paramView, y paramy1, y paramy2) {
    float f3;
    float f4;
    if (paramy1 == null)
      return null; 
    Rect rect = (Rect)paramy1.a.get("android:explode:screenBounds");
    int i = rect.left;
    int j = rect.top;
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    int[] arrayOfInt2 = (int[])paramy1.b.getTag(p.transition_position);
    if (arrayOfInt2 != null) {
      f3 = (arrayOfInt2[0] - rect.left) + f1;
      f4 = (arrayOfInt2[1] - rect.top) + f2;
      rect.offsetTo(arrayOfInt2[0], arrayOfInt2[1]);
    } else {
      f3 = f1;
      f4 = f2;
    } 
    y0((View)paramViewGroup, rect, this.P);
    int[] arrayOfInt1 = this.P;
    return a0.a(paramView, paramy1, i, j, f1, f2, f3 + arrayOfInt1[0], f4 + arrayOfInt1[1], O, this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/Explode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */