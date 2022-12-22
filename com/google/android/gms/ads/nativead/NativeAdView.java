package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.m;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.eu2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.q3;
import com.google.android.gms.internal.ads.x;

public final class NativeAdView extends FrameLayout {
  private final FrameLayout b;
  
  private final q3 c;
  
  public NativeAdView(Context paramContext) {
    super(paramContext);
    this.b = e(paramContext);
    this.c = f();
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.b = e(paramContext);
    this.c = f();
  }
  
  public NativeAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = e(paramContext);
    this.c = f();
  }
  
  private final void a(String paramString, View paramView) {
    try {
      this.c.K3(paramString, b.a2(paramView));
      return;
    } catch (RemoteException remoteException) {
      cm.c("Unable to call setAssetView on delegate", (Throwable)remoteException);
      return;
    } 
  }
  
  private final View d(String paramString) {
    try {
      a a = this.c.W6(paramString);
      if (a != null)
        return (View)b.o1(a); 
    } catch (RemoteException remoteException) {
      cm.c("Unable to call getAssetView on delegate", (Throwable)remoteException);
    } 
    return null;
  }
  
  private final FrameLayout e(Context paramContext) {
    FrameLayout frameLayout = new FrameLayout(paramContext);
    frameLayout.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    addView((View)frameLayout);
    return frameLayout;
  }
  
  private final q3 f() {
    t.k(this.b, "createDelegate must be called after overlayFrame has been created");
    return isInEditMode() ? null : er2.b().a(this.b.getContext(), this, this.b);
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    super.addView(paramView, paramInt, paramLayoutParams);
    super.bringChildToFront((View)this.b);
  }
  
  public final void bringChildToFront(View paramView) {
    super.bringChildToFront(paramView);
    FrameLayout frameLayout = this.b;
    if (frameLayout != paramView)
      super.bringChildToFront((View)frameLayout); 
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent) {
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
  
  public final AdChoicesView getAdChoicesView() {
    View view = d("3011");
    return (view instanceof AdChoicesView) ? (AdChoicesView)view : null;
  }
  
  public final View getAdvertiserView() {
    return d("3005");
  }
  
  public final View getBodyView() {
    return d("3004");
  }
  
  public final View getCallToActionView() {
    return d("3002");
  }
  
  public final View getHeadlineView() {
    return d("3001");
  }
  
  public final View getIconView() {
    return d("3003");
  }
  
  public final View getImageView() {
    return d("3008");
  }
  
  public final MediaView getMediaView() {
    View view = d("3010");
    if (view instanceof MediaView)
      return (MediaView)view; 
    if (view != null)
      cm.e("View is not an instance of MediaView"); 
    return null;
  }
  
  public final View getPriceView() {
    return d("3007");
  }
  
  public final View getStarRatingView() {
    return d("3009");
  }
  
  public final View getStoreView() {
    return d("3006");
  }
  
  public final void onVisibilityChanged(View paramView, int paramInt) {
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
  
  public final void removeAllViews() {
    super.removeAllViews();
    addView((View)this.b);
  }
  
  public final void removeView(View paramView) {
    if (this.b == paramView)
      return; 
    super.removeView(paramView);
  }
  
  public final void setAdChoicesView(AdChoicesView paramAdChoicesView) {
    a("3011", (View)paramAdChoicesView);
  }
  
  public final void setAdvertiserView(View paramView) {
    a("3005", paramView);
  }
  
  public final void setBodyView(View paramView) {
    a("3004", paramView);
  }
  
  public final void setCallToActionView(View paramView) {
    a("3002", paramView);
  }
  
  public final void setClickConfirmingView(View paramView) {
    try {
      this.c.i0(b.a2(paramView));
      return;
    } catch (RemoteException remoteException) {
      cm.c("Unable to call setClickConfirmingView on delegate", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void setHeadlineView(View paramView) {
    a("3001", paramView);
  }
  
  public final void setIconView(View paramView) {
    a("3003", paramView);
  }
  
  public final void setImageView(View paramView) {
    a("3008", paramView);
  }
  
  public final void setMediaView(MediaView paramMediaView) {
    a("3010", (View)paramMediaView);
    if (paramMediaView != null) {
      paramMediaView.a(new d(this));
      paramMediaView.b(new e(this));
    } 
  }
  
  public final void setNativeAd(a parama) {
    throw null;
  }
  
  public final void setPriceView(View paramView) {
    a("3007", paramView);
  }
  
  public final void setStarRatingView(View paramView) {
    a("3009", paramView);
  }
  
  public final void setStoreView(View paramView) {
    a("3006", paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/nativead/NativeAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */