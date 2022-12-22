package b.h.k.f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {
  private final int b;
  
  private final c c;
  
  private final int d;
  
  public a(int paramInt1, c paramc, int paramInt2) {
    this.b = paramInt1;
    this.c = paramc;
    this.d = paramInt2;
  }
  
  public void onClick(View paramView) {
    Bundle bundle = new Bundle();
    bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.b);
    this.c.R(this.d, bundle);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/f0/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */