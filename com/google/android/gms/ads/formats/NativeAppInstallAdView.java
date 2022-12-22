package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.internal.ads.cm;

@Deprecated
public final class NativeAppInstallAdView extends NativeAdView {
  public NativeAppInstallAdView(Context paramContext) {
    super(paramContext);
  }
  
  public NativeAppInstallAdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public NativeAppInstallAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final View getBodyView() {
    return b("2004");
  }
  
  public final View getCallToActionView() {
    return b("2002");
  }
  
  public final View getHeadlineView() {
    return b("2001");
  }
  
  public final View getIconView() {
    return b("2003");
  }
  
  public final View getImageView() {
    return b("2007");
  }
  
  public final MediaView getMediaView() {
    View view = b("2011");
    if (view instanceof MediaView)
      return (MediaView)view; 
    if (view != null)
      cm.e("View is not an instance of MediaView"); 
    return null;
  }
  
  public final View getPriceView() {
    return b("2006");
  }
  
  public final View getStarRatingView() {
    return b("2008");
  }
  
  public final View getStoreView() {
    return b("2005");
  }
  
  public final void setBodyView(View paramView) {
    a("2004", paramView);
  }
  
  public final void setCallToActionView(View paramView) {
    a("2002", paramView);
  }
  
  public final void setHeadlineView(View paramView) {
    a("2001", paramView);
  }
  
  public final void setIconView(View paramView) {
    a("2003", paramView);
  }
  
  public final void setImageView(View paramView) {
    a("2007", paramView);
  }
  
  public final void setMediaView(MediaView paramMediaView) {
    a("2011", (View)paramMediaView);
  }
  
  public final void setPriceView(View paramView) {
    a("2006", paramView);
  }
  
  public final void setStarRatingView(View paramView) {
    a("2008", paramView);
  }
  
  public final void setStoreView(View paramView) {
    a("2005", paramView);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/formats/NativeAppInstallAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */