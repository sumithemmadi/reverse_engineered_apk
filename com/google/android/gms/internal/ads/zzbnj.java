package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

public final class zzbnj extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
  private final Context b;
  
  private View c;
  
  private zzbnj(Context paramContext) {
    super(paramContext);
    this.b = paramContext;
  }
  
  public static zzbnj a(Context paramContext, View paramView, nh1 paramnh1) {
    zzbnj zzbnj1 = new zzbnj(paramContext);
    zzbnj1.c = paramView;
    zzbnj1.addView(paramView);
    q.z();
    an.b((View)zzbnj1, zzbnj1);
    q.z();
    an.a((View)zzbnj1, zzbnj1);
    JSONObject jSONObject = paramnh1.c0;
    if (jSONObject != null) {
      RelativeLayout relativeLayout = new RelativeLayout(zzbnj1.b);
      JSONObject jSONObject1 = jSONObject.optJSONObject("header");
      if (jSONObject1 != null)
        zzbnj1.b(jSONObject1, relativeLayout, 10); 
      jSONObject = jSONObject.optJSONObject("footer");
      if (jSONObject != null)
        zzbnj1.b(jSONObject, relativeLayout, 12); 
      zzbnj1.addView((View)relativeLayout);
    } 
    return zzbnj1;
  }
  
  private final void b(JSONObject paramJSONObject, RelativeLayout paramRelativeLayout, int paramInt) {
    TextView textView = new TextView(this.b);
    textView.setTextColor(-1);
    textView.setBackgroundColor(-16777216);
    textView.setGravity(17);
    textView.setText(paramJSONObject.optString("text", ""));
    textView.setTextSize((float)paramJSONObject.optDouble("text_size", 11.0D));
    int i = c(paramJSONObject.optDouble("padding", 0.0D));
    textView.setPadding(0, i, 0, i);
    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, c(paramJSONObject.optDouble("height", 15.0D)));
    layoutParams.addRule(paramInt);
    paramRelativeLayout.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
  }
  
  private final int c(double paramDouble) {
    er2.a();
    return sl.r(this.b, (int)paramDouble);
  }
  
  public final void onGlobalLayout() {
    int[] arrayOfInt = new int[2];
    getLocationInWindow(arrayOfInt);
    this.c.setY(-arrayOfInt[1]);
  }
  
  public final void onScrollChanged() {
    int[] arrayOfInt = new int[2];
    getLocationInWindow(arrayOfInt);
    this.c.setY(-arrayOfInt[1]);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzbnj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */