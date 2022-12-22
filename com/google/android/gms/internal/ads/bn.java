package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class bn {
  private final WeakReference<View> b;
  
  public bn(View paramView) {
    this.b = new WeakReference<View>(paramView);
  }
  
  private final ViewTreeObserver c() {
    View view = this.b.get();
    if (view == null)
      return null; 
    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
    return (viewTreeObserver == null || !viewTreeObserver.isAlive()) ? null : viewTreeObserver;
  }
  
  public final void a() {
    ViewTreeObserver viewTreeObserver = c();
    if (viewTreeObserver != null)
      d(viewTreeObserver); 
  }
  
  public final void b() {
    ViewTreeObserver viewTreeObserver = c();
    if (viewTreeObserver != null)
      e(viewTreeObserver); 
  }
  
  protected abstract void d(ViewTreeObserver paramViewTreeObserver);
  
  protected abstract void e(ViewTreeObserver paramViewTreeObserver);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */