package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
  public AutoTransition() {
    B0();
  }
  
  public AutoTransition(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    B0();
  }
  
  private void B0() {
    y0(1);
    q0(new Fade(2)).q0(new ChangeBounds()).q0(new Fade(1));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/AutoTransition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */