package androidx.transition;

import android.view.View;

public abstract class q0 extends w {
  private static final String[] a = new String[] { "android:visibilityPropagation:visibility", "android:visibilityPropagation:center" };
  
  private static int d(y paramy, int paramInt) {
    if (paramy == null)
      return -1; 
    int[] arrayOfInt = (int[])paramy.a.get("android:visibilityPropagation:center");
    return (arrayOfInt == null) ? -1 : arrayOfInt[paramInt];
  }
  
  public void a(y paramy) {
    View view = paramy.b;
    Integer integer1 = (Integer)paramy.a.get("android:visibility:visibility");
    Integer integer2 = integer1;
    if (integer1 == null)
      integer2 = Integer.valueOf(view.getVisibility()); 
    paramy.a.put("android:visibilityPropagation:visibility", integer2);
    int[] arrayOfInt = new int[2];
    view.getLocationOnScreen(arrayOfInt);
    arrayOfInt[0] = arrayOfInt[0] + Math.round(view.getTranslationX());
    arrayOfInt[0] = arrayOfInt[0] + view.getWidth() / 2;
    arrayOfInt[1] = arrayOfInt[1] + Math.round(view.getTranslationY());
    arrayOfInt[1] = arrayOfInt[1] + view.getHeight() / 2;
    paramy.a.put("android:visibilityPropagation:center", arrayOfInt);
  }
  
  public String[] b() {
    return a;
  }
  
  public int e(y paramy) {
    if (paramy == null)
      return 8; 
    Integer integer = (Integer)paramy.a.get("android:visibilityPropagation:visibility");
    return (integer == null) ? 8 : integer.intValue();
  }
  
  public int f(y paramy) {
    return d(paramy, 0);
  }
  
  public int g(y paramy) {
    return d(paramy, 1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */