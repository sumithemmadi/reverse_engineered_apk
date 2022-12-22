package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.sl;

public final class zzp extends FrameLayout implements View.OnClickListener {
  private final ImageButton b;
  
  private final y c;
  
  public zzp(Context paramContext, r paramr, y paramy) {
    super(paramContext);
    this.c = paramy;
    setOnClickListener(this);
    ImageButton imageButton = new ImageButton(paramContext);
    this.b = imageButton;
    imageButton.setImageResource(17301527);
    imageButton.setBackgroundColor(0);
    imageButton.setOnClickListener(this);
    er2.a();
    int i = sl.r(paramContext, paramr.a);
    er2.a();
    int j = sl.r(paramContext, 0);
    er2.a();
    int k = sl.r(paramContext, paramr.b);
    er2.a();
    imageButton.setPadding(i, j, k, sl.r(paramContext, paramr.d));
    imageButton.setContentDescription("Interstitial close button");
    er2.a();
    i = sl.r(paramContext, paramr.e + paramr.a + paramr.b);
    er2.a();
    addView((View)imageButton, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(i, sl.r(paramContext, paramr.e + paramr.d), 17));
  }
  
  public final void a(boolean paramBoolean) {
    if (paramBoolean) {
      this.b.setVisibility(8);
      return;
    } 
    this.b.setVisibility(0);
  }
  
  public final void onClick(View paramView) {
    y y1 = this.c;
    if (y1 != null)
      y1.i1(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/overlay/zzp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */