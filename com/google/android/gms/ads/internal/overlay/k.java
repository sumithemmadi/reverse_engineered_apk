package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.e;

final class k extends RelativeLayout {
  private e b;
  
  boolean c;
  
  public k(Context paramContext, String paramString1, String paramString2) {
    super(paramContext);
    e e1 = new e(paramContext, paramString1);
    this.b = e1;
    e1.j(paramString2);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.c)
      this.b.g(paramMotionEvent); 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */