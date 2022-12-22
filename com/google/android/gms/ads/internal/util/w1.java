package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(19)
public class w1 extends t1 {
  public final boolean b(View paramView) {
    return paramView.isAttachedToWindow();
  }
  
  public final ViewGroup.LayoutParams p() {
    return new ViewGroup.LayoutParams(-1, -1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/w1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */