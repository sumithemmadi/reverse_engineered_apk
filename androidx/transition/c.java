package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

public class c extends q0 {
  private float b = 3.0F;
  
  private static float h(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    paramFloat1 = paramFloat3 - paramFloat1;
    paramFloat2 = paramFloat4 - paramFloat2;
    return (float)Math.sqrt((paramFloat1 * paramFloat1 + paramFloat2 * paramFloat2));
  }
  
  public long c(ViewGroup paramViewGroup, Transition paramTransition, y paramy1, y paramy2) {
    boolean bool;
    int k;
    int m;
    if (paramy1 == null && paramy2 == null)
      return 0L; 
    if (paramy2 == null || e(paramy1) == 0) {
      bool = true;
    } else {
      paramy1 = paramy2;
      bool = true;
    } 
    int i = f(paramy1);
    int j = g(paramy1);
    Rect rect = paramTransition.z();
    if (rect != null) {
      k = rect.centerX();
      m = rect.centerY();
    } else {
      int[] arrayOfInt = new int[2];
      paramViewGroup.getLocationOnScreen(arrayOfInt);
      k = Math.round((arrayOfInt[0] + paramViewGroup.getWidth() / 2) + paramViewGroup.getTranslationX());
      m = Math.round((arrayOfInt[1] + paramViewGroup.getHeight() / 2) + paramViewGroup.getTranslationY());
    } 
    float f = h(i, j, k, m) / h(0.0F, 0.0F, paramViewGroup.getWidth(), paramViewGroup.getHeight());
    long l1 = paramTransition.y();
    long l2 = l1;
    if (l1 < 0L)
      l2 = 300L; 
    return Math.round((float)(l2 * bool) / this.b * f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */