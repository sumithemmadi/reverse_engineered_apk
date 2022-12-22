package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.q3;
import com.google.android.gms.internal.ads.x;

@Deprecated
public class NativeAdView extends FrameLayout {
  private final FrameLayout b;
  
  private final q3 c;
  
  public NativeAdView(Context paramContext) {
    super(paramContext);
    this.b = c(paramContext);
    this.c = d();
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.b = c(paramContext);
    this.c = d();
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = c(paramContext);
    this.c = d();
  }
  
  private final FrameLayout c(Context paramContext) {
    FrameLayout frameLayout = new FrameLayout(paramContext);
    frameLayout.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    addView((View)frameLayout);
    return frameLayout;
  }
  
  private final q3 d() {
    t.k(this.b, "createDelegate must be called after mOverlayFrame has been created");
    return isInEditMode() ? null : er2.b().a(this.b.getContext(), this, this.b);
  }
  
  protected final void a(String paramString, View paramView) {
    try {
      this.c.K3(paramString, b.a2(paramView));
      return;
    } catch (RemoteException remoteException) {
      cm.c("Unable to call setAssetView on delegate", (Throwable)remoteException);
      return;
    } 
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront((View)this.b);
  }
  
  protected final View b(String paramString) {
    try {
      a a = this.c.W6(paramString);
      if (a != null)
        return (View)b.o1(a); 
    } catch (RemoteException remoteException) {
      cm.c("Unable to call getAssetView on delegate", (Throwable)remoteException);
    } 
    return null;
  }
  
  public void bringChildToFront(View paramView) {
    super.bringChildToFront(paramView);
    FrameLayout frameLayout = this.b;
    if (frameLayout != paramView)
      super.bringChildToFront((View)frameLayout); 
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
    x x = m0.f2;
    if (((Boolean)er2.e().c(x)).booleanValue()) {
      q3 q31 = this.c;
      if (q31 != null)
        try {
          q31.P4(b.a2(paramMotionEvent));
        } catch (RemoteException remoteException) {
          cm.c("Unable to call handleTouchEvent on delegate", (Throwable)remoteException);
        }  
    } 
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public AdChoicesView getAdChoicesView() {
    View view = b("1098");
    return (view instanceof AdChoicesView) ? (AdChoicesView)view : null;
  }
  
  public void onVisibilityChanged(View paramView, int paramInt) {
    super.onVisibilityChanged(paramView, paramInt);
    q3 q31 = this.c;
    if (q31 != null)
      try {
        q31.C1(b.a2(paramView), paramInt);
        return;
      } catch (RemoteException remoteException) {
        cm.c("Unable to call onVisibilityChanged on delegate", (Throwable)remoteException);
      }  
  }
  
  public void removeAllViews() {
    super.removeAllViews();
    addView((View)this.b);
  }
  
  public void removeView(View paramView) {
    if (this.b == paramView)
      return; 
    super.removeView(paramView);
  }
  
  public void setAdChoicesView(AdChoicesView paramAdChoicesView) {
    a("1098", (View)paramAdChoicesView);
  }
  
  public void setNativeAd(a parama) {
    try {
      this.c.d1((a)parama.a());
      return;
    } catch (RemoteException remoteException) {
      cm.c("Unable to call setNativeAd on delegate", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/formats/NativeAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */