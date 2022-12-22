package androidx.transition;

import android.view.View;
import android.view.WindowId;

class s0 implements t0 {
  private final WindowId a;
  
  s0(View paramView) {
    this.a = paramView.getWindowId();
  }
  
  public boolean equals(Object paramObject) {
    boolean bool;
    if (paramObject instanceof s0 && ((s0)paramObject).a.equals(this.a)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */