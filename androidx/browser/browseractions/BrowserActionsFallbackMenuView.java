package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b.c.a;

public class BrowserActionsFallbackMenuView extends LinearLayout {
  private final int b = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_min_padding);
  
  private final int c = getResources().getDimensionPixelOffset(a.browser_actions_context_menu_max_width);
  
  public BrowserActionsFallbackMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min((getResources().getDisplayMetrics()).widthPixels - this.b * 2, this.c), 1073741824), paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/browser/browseractions/BrowserActionsFallbackMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */