package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.tq;

public final class j {
  public final int a;
  
  public final ViewGroup.LayoutParams b;
  
  public final ViewGroup c;
  
  public final Context d;
  
  public j(tq paramtq) {
    this.b = paramtq.getLayoutParams();
    ViewParent viewParent = paramtq.getParent();
    this.d = paramtq.j0();
    if (viewParent != null && viewParent instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)viewParent;
      this.c = viewGroup;
      this.a = viewGroup.indexOfChild(paramtq.getView());
      viewGroup.removeView(paramtq.getView());
      paramtq.h0(true);
      return;
    } 
    throw new zzg("Could not get the parent of the WebView for an overlay.");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */