package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
  long b = -1L;
  
  boolean c = false;
  
  boolean d = false;
  
  boolean e = false;
  
  private final Runnable f = new a(this);
  
  private final Runnable g = new b(this);
  
  public ContentLoadingProgressBar(Context paramContext) {
    this(paramContext, null);
  }
  
  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
  }
  
  private void a() {
    removeCallbacks(this.f);
    removeCallbacks(this.g);
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    a();
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    a();
  }
  
  class a implements Runnable {
    a(ContentLoadingProgressBar this$0) {}
    
    public void run() {
      ContentLoadingProgressBar contentLoadingProgressBar = this.b;
      contentLoadingProgressBar.c = false;
      contentLoadingProgressBar.b = -1L;
      contentLoadingProgressBar.setVisibility(8);
    }
  }
  
  class b implements Runnable {
    b(ContentLoadingProgressBar this$0) {}
    
    public void run() {
      ContentLoadingProgressBar contentLoadingProgressBar = this.b;
      contentLoadingProgressBar.d = false;
      if (!contentLoadingProgressBar.e) {
        contentLoadingProgressBar.b = System.currentTimeMillis();
        this.b.setVisibility(0);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/widget/ContentLoadingProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */