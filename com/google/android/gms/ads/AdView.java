package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.wt2;

public final class AdView extends BaseAdView {
  public AdView(Context paramContext) {
    super(paramContext, 0);
    t.k(paramContext, "Context cannot be null");
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
  }
  
  public final t getVideoController() {
    wt2 wt2 = this.b;
    return (wt2 != null) ? wt2.j() : null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/AdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */