package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.e;
import java.util.ArrayList;

public final class zzcid extends FrameLayout {
  private final e b;
  
  public zzcid(Context paramContext, View paramView, e parame) {
    super(paramContext);
    setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    addView(paramView);
    this.b = parame;
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    this.b.g(paramMotionEvent);
    return false;
  }
  
  public final void removeAllViews() {
    ArrayList<tq> arrayList = new ArrayList();
    boolean bool = false;
    byte b;
    for (b = 0; b < getChildCount(); b++) {
      View view = getChildAt(b);
      if (view != null && view instanceof tq)
        arrayList.add((tq)view); 
    } 
    super.removeAllViews();
    int i = arrayList.size();
    b = bool;
    while (b < i) {
      tq tq = (tq)arrayList.get(b);
      b++;
      ((tq)tq).destroy();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzcid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */