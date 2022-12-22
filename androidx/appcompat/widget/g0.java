package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

public class g0 {
  public static void a(View paramView, CharSequence paramCharSequence) {
    if (Build.VERSION.SDK_INT >= 26) {
      paramView.setTooltipText(paramCharSequence);
    } else {
      h0.f(paramView, paramCharSequence);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */