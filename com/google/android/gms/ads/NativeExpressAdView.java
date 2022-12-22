package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;

@Deprecated
public final class NativeExpressAdView extends BaseAdView {
  public NativeExpressAdView(Context paramContext) {
    super(paramContext, 1);
  }
  
  public NativeExpressAdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 1);
  }
  
  public NativeExpressAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 1);
  }
  
  public final t getVideoController() {
    return this.b.j();
  }
  
  public final u getVideoOptions() {
    return this.b.k();
  }
  
  public final void setVideoOptions(u paramu) {
    this.b.u(paramu);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/NativeExpressAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */