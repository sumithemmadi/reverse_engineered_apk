package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.an;

public final class z0 {
  private final View a;
  
  private Activity b;
  
  private boolean c;
  
  private boolean d;
  
  private boolean e;
  
  private ViewTreeObserver.OnGlobalLayoutListener f;
  
  private ViewTreeObserver.OnScrollChangedListener g;
  
  public z0(Activity paramActivity, View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener) {
    this.b = paramActivity;
    this.a = paramView;
    this.f = paramOnGlobalLayoutListener;
    this.g = null;
  }
  
  private static ViewTreeObserver d(Activity paramActivity) {
    if (paramActivity == null)
      return null; 
    Window window = paramActivity.getWindow();
    if (window == null)
      return null; 
    View view = window.getDecorView();
    return (view == null) ? null : view.getViewTreeObserver();
  }
  
  private final void g() {
    if (!this.c) {
      ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
      if (onGlobalLayoutListener != null) {
        Activity activity = this.b;
        if (activity != null) {
          ViewTreeObserver viewTreeObserver = d(activity);
          if (viewTreeObserver != null)
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener); 
        } 
        q.z();
        an.a(this.a, this.f);
      } 
      this.c = true;
    } 
  }
  
  private final void h() {
    Activity activity = this.b;
    if (activity == null)
      return; 
    if (this.c) {
      ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
      if (onGlobalLayoutListener != null) {
        ViewTreeObserver viewTreeObserver = d(activity);
        if (viewTreeObserver != null) {
          q.e();
          viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } 
      } 
      this.c = false;
    } 
  }
  
  public final void a() {
    this.d = true;
    if (this.e)
      g(); 
  }
  
  public final void b() {
    this.d = false;
    h();
  }
  
  public final void c(Activity paramActivity) {
    this.b = paramActivity;
  }
  
  public final void e() {
    this.e = true;
    if (this.d)
      g(); 
  }
  
  public final void f() {
    this.e = false;
    h();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */