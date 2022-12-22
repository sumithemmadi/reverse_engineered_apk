package b.h.k;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import b.h.c;

public final class y {
  public static boolean a(ViewGroup paramViewGroup) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramViewGroup.isTransitionGroup(); 
    Boolean bool = (Boolean)paramViewGroup.getTag(c.tag_transition_group);
    return ((bool != null && bool.booleanValue()) || paramViewGroup.getBackground() != null || w.M((View)paramViewGroup) != null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */