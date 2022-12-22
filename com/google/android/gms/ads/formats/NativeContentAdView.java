package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.cm;

@Deprecated
public final class NativeContentAdView extends NativeAdView {
  public NativeContentAdView(Context paramContext) {
    super(paramContext);
  }
  
  public NativeContentAdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public NativeContentAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final View getAdvertiserView() {
    return b("1004");
  }
  
  public final View getBodyView() {
    return b("1002");
  }
  
  public final View getCallToActionView() {
    return b("1003");
  }
  
  public final View getHeadlineView() {
    return b("1001");
  }
  
  public final View getImageView() {
    return b("1005");
  }
  
  public final View getLogoView() {
    return b("1006");
  }
  
  public final MediaView getMediaView() {
    View view = b("1009");
    if (view instanceof MediaView)
      return (MediaView)view; 
    if (view != null)
      cm.e("View is not an instance of MediaView"); 
    return null;
  }
  
  public final void setAdvertiserView(View paramView) {
    a("1004", paramView);
  }
  
  public final void setBodyView(View paramView) {
    a("1002", paramView);
  }
  
  public final void setCallToActionView(View paramView) {
    a("1003", paramView);
  }
  
  public final void setHeadlineView(View paramView) {
    a("1001", paramView);
  }
  
  public final void setImageView(View paramView) {
    a("1005", paramView);
  }
  
  public final void setLogoView(View paramView) {
    a("1006", paramView);
  }
  
  public final void setMediaView(MediaView paramMediaView) {
    a("1009", (View)paramMediaView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/formats/NativeContentAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */