package com.github.jdsjlzx.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import c.b.a.d;
import c.b.a.g.b;
import com.github.jdsjlzx.progressindicator.AVLoadingIndicatorView;
import java.util.Date;

public class ArrowRefreshHeader extends LinearLayout implements b {
  private LinearLayout b;
  
  private ImageView c;
  
  private SimpleViewSwitcher d;
  
  private TextView e;
  
  private int f = 0;
  
  private TextView g;
  
  private Animation h;
  
  private Animation i;
  
  public int j;
  
  private int k;
  
  public ArrowRefreshHeader(Context paramContext) {
    super(paramContext);
    f();
  }
  
  public ArrowRefreshHeader(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    f();
  }
  
  private View e(int paramInt) {
    AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView)LayoutInflater.from(getContext()).inflate(c.b.a.c.layout_indicator_view, null);
    aVLoadingIndicatorView.setIndicatorId(paramInt);
    aVLoadingIndicatorView.setIndicatorColor(-7829368);
    return (View)aVLoadingIndicatorView;
  }
  
  private void f() {
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
    layoutParams.setMargins(0, 0, 0, 0);
    setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    setPadding(0, 0, 0, 0);
    LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(getContext()).inflate(c.b.a.c.listview_header, null);
    this.b = linearLayout;
    addView((View)linearLayout, (ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, 0));
    setGravity(80);
    this.c = (ImageView)findViewById(c.b.a.b.listview_header_arrow);
    this.e = (TextView)findViewById(c.b.a.b.refresh_status_textview);
    SimpleViewSwitcher simpleViewSwitcher = (SimpleViewSwitcher)findViewById(c.b.a.b.listview_header_progressbar);
    this.d = simpleViewSwitcher;
    simpleViewSwitcher.setView(e(22));
    RotateAnimation rotateAnimation = new RotateAnimation(0.0F, -180.0F, 1, 0.5F, 1, 0.5F);
    this.h = (Animation)rotateAnimation;
    rotateAnimation.setDuration(180L);
    this.h.setFillAfter(true);
    rotateAnimation = new RotateAnimation(-180.0F, 0.0F, 1, 0.5F, 1, 0.5F);
    this.i = (Animation)rotateAnimation;
    rotateAnimation.setDuration(180L);
    this.i.setFillAfter(true);
    this.g = (TextView)findViewById(c.b.a.b.last_refresh_time);
    measure(-2, -2);
    this.j = getMeasuredHeight();
    this.k = 17170432;
  }
  
  private void j(int paramInt) {
    ValueAnimator valueAnimator = ValueAnimator.ofInt(new int[] { getVisibleHeight(), paramInt });
    valueAnimator.setDuration(300L).start();
    valueAnimator.addUpdateListener(new c(this));
    valueAnimator.start();
  }
  
  public void a(float paramFloat1, float paramFloat2) {
    if (getVisibleHeight() > 0 || paramFloat1 > 0.0F) {
      setVisibleHeight((int)paramFloat1 + getVisibleHeight());
      if (this.f <= 1)
        if (getVisibleHeight() > this.j) {
          g();
        } else {
          h();
        }  
    } 
  }
  
  public boolean b() {
    boolean bool;
    int i = getVisibleHeight();
    if (getVisibleHeight() > this.j && this.f < 2) {
      setState(2);
      bool = true;
    } else {
      bool = false;
    } 
    if (this.f == 2) {
      int j = this.j;
      if (i > j)
        j(j); 
    } 
    if (this.f != 2)
      j(0); 
    if (this.f == 2)
      j(this.j); 
    return bool;
  }
  
  public void c() {
    this.g.setText(d(new Date()));
    setState(3);
    (new Handler()).postDelayed(new a(this), 200L);
  }
  
  public String d(Date paramDate) {
    int i = (int)((System.currentTimeMillis() - paramDate.getTime()) / 1000L);
    if (i == 0)
      return getContext().getResources().getString(d.text_just); 
    if (i > 0 && i < 60) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(i);
      stringBuilder1.append(getContext().getResources().getString(d.text_seconds_ago));
      return stringBuilder1.toString();
    } 
    if (i >= 60 && i < 3600) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(Math.max(i / 60, 1));
      stringBuilder1.append(getContext().getResources().getString(d.text_minute_ago));
      return stringBuilder1.toString();
    } 
    if (i >= 3600 && i < 86400) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(i / 3600);
      stringBuilder1.append(getContext().getResources().getString(d.text_hour_ago));
      return stringBuilder1.toString();
    } 
    if (i >= 86400 && i < 2592000) {
      i /= 86400;
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(i);
      stringBuilder1.append(getContext().getResources().getString(d.text_day_ago));
      return stringBuilder1.toString();
    } 
    if (i >= 2592000 && i < 31104000) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(i / 2592000);
      stringBuilder1.append(getContext().getResources().getString(d.text_month_ago));
      return stringBuilder1.toString();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(i / 31104000);
    stringBuilder.append(getContext().getResources().getString(d.text_year_ago));
    return stringBuilder.toString();
  }
  
  public void g() {
    setState(1);
  }
  
  public View getHeaderView() {
    return (View)this;
  }
  
  public int getState() {
    return this.f;
  }
  
  public int getVisibleHeight() {
    return ((LinearLayout.LayoutParams)this.b.getLayoutParams()).height;
  }
  
  public void h() {
    setState(0);
  }
  
  public void i() {
    j(0);
    (new Handler()).postDelayed(new b(this), 500L);
  }
  
  public void setArrowImageView(int paramInt) {
    this.c.setImageResource(paramInt);
  }
  
  public void setHintTextColor(int paramInt) {
    this.k = paramInt;
  }
  
  public void setIndicatorColor(int paramInt) {
    if (this.d.getChildAt(0) instanceof AVLoadingIndicatorView)
      ((AVLoadingIndicatorView)this.d.getChildAt(0)).setIndicatorColor(paramInt); 
  }
  
  public void setProgressStyle(int paramInt) {
    if (paramInt == -1) {
      ProgressBar progressBar = new ProgressBar(getContext(), null, 16842871);
      this.d.setView((View)progressBar);
    } else {
      this.d.setView(e(paramInt));
    } 
  }
  
  public void setState(int paramInt) {
    if (paramInt == this.f)
      return; 
    if (paramInt == 2) {
      this.c.clearAnimation();
      this.c.setVisibility(4);
      this.d.setVisibility(0);
      j(this.j);
    } else if (paramInt == 3) {
      this.c.setVisibility(4);
      this.d.setVisibility(4);
    } else {
      this.c.setVisibility(0);
      this.d.setVisibility(4);
    } 
    this.e.setTextColor(androidx.core.content.a.d(getContext(), this.k));
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3)
            this.e.setText(d.refresh_done); 
        } else {
          this.e.setText(d.refreshing);
        } 
      } else if (this.f != 1) {
        this.c.clearAnimation();
        this.c.startAnimation(this.h);
        this.e.setText(d.listview_header_hint_release);
      } 
    } else {
      if (this.f == 1)
        this.c.startAnimation(this.i); 
      if (this.f == 2)
        this.c.clearAnimation(); 
      this.e.setText(d.listview_header_hint_normal);
    } 
    this.f = paramInt;
  }
  
  public void setViewBackgroundColor(int paramInt) {
    setBackgroundColor(androidx.core.content.a.d(getContext(), paramInt));
  }
  
  public void setVisibleHeight(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = 0; 
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.b.getLayoutParams();
    layoutParams.height = i;
    this.b.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  class a implements Runnable {
    a(ArrowRefreshHeader this$0) {}
    
    public void run() {
      this.b.i();
    }
  }
  
  class b implements Runnable {
    b(ArrowRefreshHeader this$0) {}
    
    public void run() {
      this.b.setState(0);
    }
  }
  
  class c implements ValueAnimator.AnimatorUpdateListener {
    c(ArrowRefreshHeader this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.setVisibleHeight(((Integer)param1ValueAnimator.getAnimatedValue()).intValue());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/github/jdsjlzx/view/ArrowRefreshHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */