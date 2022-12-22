package com.google.android.gms.ads.appopen;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.f;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.nm2;
import com.google.android.gms.internal.ads.um2;
import com.google.android.gms.internal.ads.xr2;
import com.google.android.gms.internal.ads.zzvs;

@Deprecated
public final class AppOpenAdView extends ViewGroup {
  private a b;
  
  private b c;
  
  public AppOpenAdView(Context paramContext) {
    super(paramContext);
    t.k(paramContext, "Context cannot be null");
  }
  
  public AppOpenAdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public AppOpenAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final void a() {
    a a1 = this.b;
    if (a1 != null && this.c != null)
      a1.c((um2)new nm2(this.c)); 
  }
  
  private final f getAdSize() {
    xr2 xr2 = this.b.d();
    if (xr2 != null)
      try {
        zzvs zzvs = xr2.L9();
        if (zzvs != null)
          return zzvs.v0(); 
      } catch (RemoteException remoteException) {
        cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      }  
    return null;
  }
  
  protected final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = getChildAt(0);
    if (view != null && view.getVisibility() != 8) {
      int i = view.getMeasuredWidth();
      int j = view.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      view.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    } 
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2) {
    int i = 0;
    View view = getChildAt(0);
    if (view != null && view.getVisibility() != 8) {
      measureChild(view, paramInt1, paramInt2);
      i = view.getMeasuredWidth();
      j = view.getMeasuredHeight();
    } else {
      f f;
      view = null;
      try {
        f f1 = getAdSize();
        f = f1;
      } catch (NullPointerException nullPointerException) {
        cm.c("Unable to retrieve ad size.", nullPointerException);
      } 
      if (f != null) {
        Context context = getContext();
        i = f.d(context);
        j = f.b(context);
      } else {
        j = 0;
      } 
    } 
    i = Math.max(i, getSuggestedMinimumWidth());
    int j = Math.max(j, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSize(i, paramInt1), View.resolveSize(j, paramInt2));
  }
  
  public final void setAppOpenAd(a parama) {
    try {
      xr2 xr2 = parama.d();
      if (xr2 == null)
        return; 
      a a1 = xr2.Z2();
      if (a1 == null)
        return; 
      View view = (View)b.o1(a1);
      if (view.getParent() == null) {
        removeAllViews();
        addView(view);
        this.b = parama;
        a();
        return;
      } 
      cm.g("Trying to set AppOpenAd which is already in use.");
      return;
    } catch (RemoteException remoteException) {
      cm.f("#007 Could not call remote method.", (Throwable)remoteException);
      return;
    } 
  }
  
  public final void setAppOpenAdPresentationCallback(b paramb) {
    a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/appopen/AppOpenAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */