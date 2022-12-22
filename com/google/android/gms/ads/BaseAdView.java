package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.a;
import com.google.android.gms.internal.ads.bq2;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.wt2;

class BaseAdView extends ViewGroup {
  protected final wt2 b;
  
  public BaseAdView(Context paramContext, int paramInt) {
    super(paramContext);
    this.b = new wt2(this, paramInt);
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet);
    this.b = new wt2(this, paramAttributeSet, false, paramInt);
  }
  
  public BaseAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1);
    this.b = new wt2(this, paramAttributeSet, false, paramInt2);
  }
  
  public void a() {
    this.b.a();
  }
  
  public void b(e parame) {
    this.b.z(parame.a());
  }
  
  public void c() {
    this.b.l();
  }
  
  public void d() {
    this.b.m();
  }
  
  public b getAdListener() {
    return this.b.b();
  }
  
  public f getAdSize() {
    return this.b.c();
  }
  
  public String getAdUnitId() {
    return this.b.e();
  }
  
  @Deprecated
  public String getMediationAdapterClassName() {
    return this.b.g();
  }
  
  public s getResponseInfo() {
    return this.b.i();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = getChildAt(0);
    if (view != null && view.getVisibility() != 8) {
      int i = view.getMeasuredWidth();
      int j = view.getMeasuredHeight();
      paramInt1 = (paramInt3 - paramInt1 - i) / 2;
      paramInt2 = (paramInt4 - paramInt2 - j) / 2;
      view.layout(paramInt1, paramInt2, i + paramInt1, j + paramInt2);
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
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
  
  public void setAdListener(b paramb) {
    this.b.n(paramb);
    if (paramb == null) {
      this.b.y(null);
      this.b.x(null);
      return;
    } 
    if (paramb instanceof bq2)
      this.b.y((bq2)paramb); 
    if (paramb instanceof a)
      this.b.x((a)paramb); 
  }
  
  public void setAdSize(f paramf) {
    this.b.o(new f[] { paramf });
  }
  
  public void setAdUnitId(String paramString) {
    this.b.p(paramString);
  }
  
  public void setOnPaidEventListener(o paramo) {
    this.b.t(paramo);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/BaseAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */