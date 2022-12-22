package androidx.transition;

import android.view.ViewGroup;

public class r {
  private ViewGroup a;
  
  private Runnable b;
  
  public static r b(ViewGroup paramViewGroup) {
    return (r)paramViewGroup.getTag(p.transition_current_scene);
  }
  
  static void c(ViewGroup paramViewGroup, r paramr) {
    paramViewGroup.setTag(p.transition_current_scene, paramr);
  }
  
  public void a() {
    if (b(this.a) == this) {
      Runnable runnable = this.b;
      if (runnable != null)
        runnable.run(); 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */