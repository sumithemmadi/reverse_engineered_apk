package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.json.JSONObject;

final class qg0 implements c3 {
  qg0(lg0 paramlg0, jh0 paramjh0, ViewGroup paramViewGroup) {}
  
  public final JSONObject Y0() {
    return this.a.Y0();
  }
  
  public final void Z0(MotionEvent paramMotionEvent) {
    this.a.onTouch(null, paramMotionEvent);
  }
  
  public final void a1() {
    if (lg0.d(this.c, this.a, jg0.b))
      this.a.onClick((View)this.b); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */