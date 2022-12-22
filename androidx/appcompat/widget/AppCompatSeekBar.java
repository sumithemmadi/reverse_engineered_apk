package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import b.a.a;

public class AppCompatSeekBar extends SeekBar {
  private final k b;
  
  public AppCompatSeekBar(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, a.seekBarStyle);
  }
  
  public AppCompatSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    z.a((View)this, getContext());
    k k1 = new k(this);
    this.b = k1;
    k1.c(paramAttributeSet, paramInt);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    this.b.h();
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    this.b.i();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial onDraw : (Landroid/graphics/Canvas;)V
    //   7: aload_0
    //   8: getfield b : Landroidx/appcompat/widget/k;
    //   11: aload_1
    //   12: invokevirtual g : (Landroid/graphics/Canvas;)V
    //   15: aload_0
    //   16: monitorexit
    //   17: return
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	18	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/AppCompatSeekBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */