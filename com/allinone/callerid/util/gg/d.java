package com.allinone.callerid.util.gg;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.a;
import com.google.android.gms.ads.formats.g;
import java.util.List;

public class d {
  public static void a(g paramg, UnifiedNativeAdView paramUnifiedNativeAdView) {
    paramUnifiedNativeAdView.setMediaView((MediaView)paramUnifiedNativeAdView.findViewById(2131296333));
    paramUnifiedNativeAdView.setHeadlineView(paramUnifiedNativeAdView.findViewById(2131296332));
    paramUnifiedNativeAdView.setBodyView(paramUnifiedNativeAdView.findViewById(2131296330));
    paramUnifiedNativeAdView.setCallToActionView(paramUnifiedNativeAdView.findViewById(2131296331));
    paramUnifiedNativeAdView.setIconView(paramUnifiedNativeAdView.findViewById(2131296329));
    paramUnifiedNativeAdView.setPriceView(paramUnifiedNativeAdView.findViewById(2131296334));
    paramUnifiedNativeAdView.setStarRatingView(paramUnifiedNativeAdView.findViewById(2131296335));
    paramUnifiedNativeAdView.setStoreView(paramUnifiedNativeAdView.findViewById(2131296336));
    paramUnifiedNativeAdView.setAdvertiserView(paramUnifiedNativeAdView.findViewById(2131296328));
    ((TextView)paramUnifiedNativeAdView.getHeadlineView()).setText(paramg.d());
    ((TextView)paramUnifiedNativeAdView.getBodyView()).setText(paramg.b());
    ((Button)paramUnifiedNativeAdView.getCallToActionView()).setText(paramg.c());
    if (paramg.e() == null) {
      paramUnifiedNativeAdView.getIconView().setVisibility(8);
      List<a.b> list = paramg.f();
      if (list != null && list.size() > 0) {
        ((ImageView)paramUnifiedNativeAdView.getIconView()).setImageDrawable(((a.b)list.get(0)).a());
        paramUnifiedNativeAdView.getIconView().setVisibility(0);
      } 
    } else {
      ((ImageView)paramUnifiedNativeAdView.getIconView()).setImageDrawable(paramg.e().a());
      paramUnifiedNativeAdView.getIconView().setVisibility(0);
    } 
    if (paramg.g() == null) {
      paramUnifiedNativeAdView.getPriceView().setVisibility(8);
    } else {
      paramUnifiedNativeAdView.getPriceView().setVisibility(0);
      ((TextView)paramUnifiedNativeAdView.getPriceView()).setText(paramg.g());
    } 
    if (paramg.i() == null) {
      paramUnifiedNativeAdView.getStoreView().setVisibility(8);
    } else {
      paramUnifiedNativeAdView.getStoreView().setVisibility(0);
      ((TextView)paramUnifiedNativeAdView.getStoreView()).setText(paramg.i());
    } 
    if (paramg.h() == null) {
      paramUnifiedNativeAdView.getStarRatingView().setVisibility(4);
    } else {
      ((RatingBar)paramUnifiedNativeAdView.getStarRatingView()).setRating(paramg.h().floatValue());
      paramUnifiedNativeAdView.getStarRatingView().setVisibility(0);
    } 
    if (paramg.a() == null) {
      paramUnifiedNativeAdView.getAdvertiserView().setVisibility(4);
    } else {
      ((TextView)paramUnifiedNativeAdView.getAdvertiserView()).setText(paramg.a());
      paramUnifiedNativeAdView.getAdvertiserView().setVisibility(0);
    } 
    paramUnifiedNativeAdView.setNativeAd(paramg);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/gg/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */