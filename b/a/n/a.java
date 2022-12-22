package b.a.n;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class a implements TransformationMethod {
  private Locale b;
  
  public a(Context paramContext) {
    this.b = (paramContext.getResources().getConfiguration()).locale;
  }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView) {
    if (paramCharSequence != null) {
      paramCharSequence = paramCharSequence.toString().toUpperCase(this.b);
    } else {
      paramCharSequence = null;
    } 
    return paramCharSequence;
  }
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */