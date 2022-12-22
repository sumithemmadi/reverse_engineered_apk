package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.e;

public class MockView extends View {
  private Paint b = new Paint();
  
  private Paint c = new Paint();
  
  private Paint d = new Paint();
  
  private boolean e = true;
  
  private boolean f = true;
  
  protected String g = null;
  
  private Rect h = new Rect();
  
  private int i = Color.argb(255, 0, 0, 0);
  
  private int j = Color.argb(255, 200, 200, 200);
  
  private int k = Color.argb(255, 50, 50, 50);
  
  private int l = 4;
  
  public MockView(Context paramContext) {
    super(paramContext);
    a(paramContext, null);
  }
  
  public MockView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public MockView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet) {
    if (paramAttributeSet != null) {
      TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.MockView);
      int i = typedArray.getIndexCount();
      for (byte b = 0; b < i; b++) {
        int j = typedArray.getIndex(b);
        if (j == e.MockView_mock_label) {
          this.g = typedArray.getString(j);
        } else if (j == e.MockView_mock_showDiagonals) {
          this.e = typedArray.getBoolean(j, this.e);
        } else if (j == e.MockView_mock_diagonalsColor) {
          this.i = typedArray.getColor(j, this.i);
        } else if (j == e.MockView_mock_labelBackgroundColor) {
          this.k = typedArray.getColor(j, this.k);
        } else if (j == e.MockView_mock_labelColor) {
          this.j = typedArray.getColor(j, this.j);
        } else if (j == e.MockView_mock_showLabel) {
          this.f = typedArray.getBoolean(j, this.f);
        } 
      } 
      typedArray.recycle();
    } 
    if (this.g == null)
      try {
        this.g = paramContext.getResources().getResourceEntryName(getId());
      } catch (Exception exception) {} 
    this.b.setColor(this.i);
    this.b.setAntiAlias(true);
    this.c.setColor(this.j);
    this.c.setAntiAlias(true);
    this.d.setColor(this.k);
    this.l = Math.round(this.l * (getResources().getDisplayMetrics()).xdpi / 160.0F);
  }
  
  public void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    int k = i;
    int m = j;
    if (this.e) {
      k = i - 1;
      m = j - 1;
      float f1 = k;
      float f2 = m;
      paramCanvas.drawLine(0.0F, 0.0F, f1, f2, this.b);
      paramCanvas.drawLine(0.0F, f2, f1, 0.0F, this.b);
      paramCanvas.drawLine(0.0F, 0.0F, f1, 0.0F, this.b);
      paramCanvas.drawLine(f1, 0.0F, f1, f2, this.b);
      paramCanvas.drawLine(f1, f2, 0.0F, f2, this.b);
      paramCanvas.drawLine(0.0F, f2, 0.0F, 0.0F, this.b);
    } 
    String str = this.g;
    if (str != null && this.f) {
      this.c.getTextBounds(str, 0, str.length(), this.h);
      float f1 = (k - this.h.width()) / 2.0F;
      float f2 = (m - this.h.height()) / 2.0F + this.h.height();
      this.h.offset((int)f1, (int)f2);
      Rect rect = this.h;
      m = rect.left;
      k = this.l;
      rect.set(m - k, rect.top - k, rect.right + k, rect.bottom + k);
      paramCanvas.drawRect(this.h, this.d);
      paramCanvas.drawText(this.g, f1, f2, this.c);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/utils/widget/MockView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */