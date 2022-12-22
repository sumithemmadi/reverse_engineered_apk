package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

final class cn extends bn implements ViewTreeObserver.OnScrollChangedListener {
  private final WeakReference<ViewTreeObserver.OnScrollChangedListener> c;
  
  public cn(View paramView, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener) {
    super(paramView);
    this.c = new WeakReference<ViewTreeObserver.OnScrollChangedListener>(paramOnScrollChangedListener);
  }
  
  protected final void d(ViewTreeObserver paramViewTreeObserver) {
    paramViewTreeObserver.addOnScrollChangedListener(this);
  }
  
  protected final void e(ViewTreeObserver paramViewTreeObserver) {
    paramViewTreeObserver.removeOnScrollChangedListener(this);
  }
  
  public final void onScrollChanged() {
    ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.c.get();
    if (onScrollChangedListener != null) {
      onScrollChangedListener.onScrollChanged();
      return;
    } 
    b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */