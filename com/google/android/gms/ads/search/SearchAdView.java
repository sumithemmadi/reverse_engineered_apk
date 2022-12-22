package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.wt2;

public final class SearchAdView extends ViewGroup {
  private final wt2 b = new wt2(this);
  
  public SearchAdView(Context paramContext) {
    super(paramContext);
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public SearchAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final b getAdListener() {
    return this.b.b();
  }
  
  public final f getAdSize() {
    return this.b.c();
  }
  
  public final String getAdUnitId() {
    return this.b.e();
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
  
  public final void setAdListener(b paramb) {
    this.b.n(paramb);
  }
  
  public final void setAdSize(f paramf) {
    this.b.o(new f[] { paramf });
  }
  
  public final void setAdUnitId(String paramString) {
    this.b.p(paramString);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/search/SearchAdView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */