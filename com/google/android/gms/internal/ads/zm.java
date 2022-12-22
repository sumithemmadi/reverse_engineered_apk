package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;

final class zm extends bn implements ViewTreeObserver.OnGlobalLayoutListener {
  private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> c;
  
  public zm(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener) {
    super(paramView);
    this.c = new WeakReference<ViewTreeObserver.OnGlobalLayoutListener>(paramOnGlobalLayoutListener);
  }
  
  protected final void d(ViewTreeObserver paramViewTreeObserver) {
    paramViewTreeObserver.addOnGlobalLayoutListener(this);
  }
  
  protected final void e(ViewTreeObserver paramViewTreeObserver) {
    q.e();
    paramViewTreeObserver.removeOnGlobalLayoutListener(this);
  }
  
  public final void onGlobalLayout() {
    ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.c.get();
    if (onGlobalLayoutListener != null) {
      onGlobalLayoutListener.onGlobalLayout();
      return;
    } 
    b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */