package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamic.b;
import java.util.List;

public final class zzaeb extends RelativeLayout {
  private static final float[] b = new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F };
  
  private AnimationDrawable c;
  
  public zzaeb(Context paramContext, v2 paramv2, RelativeLayout.LayoutParams paramLayoutParams) {
    super(paramContext);
    t.j(paramv2);
    ShapeDrawable shapeDrawable = new ShapeDrawable((Shape)new RoundRectShape(b, null, null));
    shapeDrawable.getPaint().setColor(paramv2.T9());
    setLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
    q.e();
    setBackground((Drawable)shapeDrawable);
    paramLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    if (!TextUtils.isEmpty(paramv2.R1())) {
      RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
      TextView textView = new TextView(paramContext);
      textView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      textView.setId(1195835393);
      textView.setTypeface(Typeface.DEFAULT);
      textView.setText(paramv2.R1());
      textView.setTextColor(paramv2.U9());
      textView.setTextSize(paramv2.V9());
      er2.a();
      int i = sl.r(paramContext, 4);
      er2.a();
      textView.setPadding(i, 0, sl.r(paramContext, 4), 0);
      addView((View)textView);
      paramLayoutParams.addRule(1, textView.getId());
    } 
    ImageView imageView = new ImageView(paramContext);
    imageView.setLayoutParams((ViewGroup.LayoutParams)paramLayoutParams);
    imageView.setId(1195835394);
    List<a3> list = paramv2.W9();
    if (list != null && list.size() > 1) {
      this.c = new AnimationDrawable();
      for (a3 a3 : list) {
        try {
          Drawable drawable = (Drawable)b.o1(a3.D9());
          this.c.addFrame(drawable, paramv2.X9());
        } catch (Exception exception) {
          cm.c("Error while getting drawable.", exception);
        } 
      } 
      q.e();
      imageView.setBackground((Drawable)this.c);
    } else if (list.size() == 1) {
      try {
        imageView.setImageDrawable((Drawable)b.o1(((a3)list.get(0)).D9()));
      } catch (Exception exception) {
        cm.c("Error while getting drawable.", exception);
      } 
    } 
    addView((View)imageView);
  }
  
  public final void onAttachedToWindow() {
    AnimationDrawable animationDrawable = this.c;
    if (animationDrawable != null)
      animationDrawable.start(); 
    super.onAttachedToWindow();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzaeb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */