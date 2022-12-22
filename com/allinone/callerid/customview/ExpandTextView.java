package com.allinone.callerid.customview;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.allinone.callerid.R;
import com.allinone.callerid.util.j;

public class ExpandTextView extends LinearLayout implements View.OnClickListener {
  private Context b;
  
  private String c;
  
  private String d;
  
  private String e;
  
  private String f;
  
  private int g;
  
  private int h;
  
  private int i;
  
  private Drawable j;
  
  private int k;
  
  private float l;
  
  private float m;
  
  private float n;
  
  private int o;
  
  private TextView p;
  
  private TextView q;
  
  private TextView r;
  
  private ImageView s;
  
  private RelativeLayout t;
  
  private TextView u;
  
  private c v;
  
  private boolean w;
  
  public ExpandTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ExpandTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ExpandTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext;
    setOrientation(1);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ExpandTextView);
    this.c = typedArray.getString(11);
    this.d = typedArray.getString(1);
    this.e = typedArray.getString(4);
    this.f = typedArray.getString(3);
    this.g = typedArray.getColor(10, -1979711488);
    this.h = typedArray.getColor(8, -570425344);
    this.i = typedArray.getColor(9, -570425344);
    this.j = typedArray.getDrawable(6);
    this.k = typedArray.getInt(7, 4);
    this.l = typedArray.getDimension(12, j.b(this.b, 16.0F));
    this.m = typedArray.getDimension(2, j.b(this.b, 14.0F));
    this.n = typedArray.getDimension(5, j.b(this.b, 12.0F));
    this.o = typedArray.getInt(0, 600);
    typedArray.recycle();
    c();
  }
  
  private void b() {
    int i;
    int j;
    if (!this.w) {
      this.w = true;
      int k = getMinMeasureHeight();
      i = getMaxMeasureHeight();
      int m = i;
      if (i < k)
        m = k; 
      this.r.setText(this.e);
      ObjectAnimator.ofFloat(this.s, "rotation", new float[] { 0.0F, 180.0F }).start();
      c c1 = this.v;
      j = k;
      i = m;
      if (c1 != null) {
        c1.b();
        j = k;
        i = m;
      } 
    } else {
      this.w = false;
      i = getMaxMeasureHeight();
      int k = getMinMeasureHeight();
      int m = i;
      if (i < k)
        m = k; 
      this.r.setText(this.f);
      ObjectAnimator.ofFloat(this.s, "rotation", new float[] { -180.0F, 0.0F }).start();
      c c1 = this.v;
      j = m;
      i = k;
      if (c1 != null) {
        c1.a();
        i = k;
        j = m;
      } 
    } 
    if (this.o < 0)
      this.o = 600; 
    ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
    ValueAnimator valueAnimator = ValueAnimator.ofInt(new int[] { j, i });
    valueAnimator.setDuration(this.o);
    valueAnimator.setInterpolator((TimeInterpolator)new AccelerateDecelerateInterpolator());
    valueAnimator.addUpdateListener(new a(this, layoutParams));
    valueAnimator.start();
  }
  
  private void c() {
    View.inflate(this.b, 2131493033, (ViewGroup)this);
    this.p = (TextView)findViewById(2131298187);
    this.q = (TextView)findViewById(2131297866);
    this.r = (TextView)findViewById(2131297981);
    this.s = (ImageView)findViewById(2131296947);
    this.t = (RelativeLayout)findViewById(2131297537);
    this.p.setText(this.c);
    this.p.setTextSize(0, this.l);
    this.p.setTextColor(this.g);
    this.q.setText(this.d);
    this.q.setTextSize(0, this.m);
    this.q.setTextColor(this.h);
    this.r.setText(this.f);
    this.r.setTextSize(0, this.n);
    this.r.setTextColor(this.i);
    if (this.j == null)
      this.j = getResources().getDrawable(2131231057); 
    this.s.setImageDrawable(this.j);
    this.t.setOnClickListener(this);
    ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
    layoutParams.height = getMinMeasureHeight();
    this.q.setLayoutParams(layoutParams);
  }
  
  public int getAnimationDuration() {
    return this.o;
  }
  
  public String getContent() {
    return this.d;
  }
  
  public int getContentTextColor() {
    return this.h;
  }
  
  public float getContentTextSize() {
    return this.m;
  }
  
  public String getExpandHint() {
    return this.f;
  }
  
  public String getFoldHint() {
    return this.e;
  }
  
  public int getHintTextColor() {
    return this.i;
  }
  
  public float getHintTextSize() {
    return this.n;
  }
  
  public Drawable getIndicateImage() {
    return this.j;
  }
  
  public int getMaxMeasureHeight() {
    int i = View.MeasureSpec.makeMeasureSpec(this.q.getMeasuredWidth(), 1073741824);
    int j = View.MeasureSpec.makeMeasureSpec(3000, -2147483648);
    this.q.measure(i, j);
    return this.q.getMeasuredHeight();
  }
  
  public int getMinMeasureHeight() {
    if (this.u == null) {
      TextView textView = new TextView(this.b);
      this.u = textView;
      textView.setTextSize(0, this.m);
      this.u.setLineSpacing(j.a(this.b, 6.0F), 1.0F);
      this.u.setLines(this.k);
    } 
    int i = View.MeasureSpec.makeMeasureSpec(this.q.getMeasuredWidth(), 1073741824);
    int j = View.MeasureSpec.makeMeasureSpec(1000, -2147483648);
    this.u.setLayoutParams(this.q.getLayoutParams());
    this.u.measure(i, j);
    return this.u.getMeasuredHeight();
  }
  
  public int getMinVisibleLines() {
    return this.k;
  }
  
  public c getReadMoreListener() {
    return this.v;
  }
  
  public String getTitle() {
    return this.c;
  }
  
  public int getTitleTextColor() {
    return this.g;
  }
  
  public float getTitleTextSize() {
    return this.l;
  }
  
  public View getTitleView() {
    return (View)this.p;
  }
  
  public void onClick(View paramView) {
    if (paramView.getId() == 2131297537)
      b(); 
  }
  
  public void setAnimationDuration(int paramInt) {
    this.o = paramInt;
  }
  
  public void setContent(String paramString) {
    this.d = paramString;
    this.q.setText(paramString);
  }
  
  public void setContentTextColor(int paramInt) {
    this.h = paramInt;
    this.q.setTextColor(paramInt);
  }
  
  public void setContentTextSize(float paramFloat) {
    this.m = j.b(this.b, paramFloat);
    this.q.setTextSize(paramFloat);
    this.u = null;
    ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
    layoutParams.height = getMinMeasureHeight();
    this.q.setLayoutParams(layoutParams);
  }
  
  public void setExpandHint(String paramString) {
    this.f = paramString;
  }
  
  public void setFoldHint(String paramString) {
    this.e = paramString;
  }
  
  public void setHintTextColor(int paramInt) {
    this.i = paramInt;
    this.r.setTextColor(paramInt);
  }
  
  public void setHintTextSize(float paramFloat) {
    this.n = j.b(this.b, paramFloat);
    this.r.setTextSize(paramFloat);
  }
  
  public void setIndicateImage(int paramInt) {
    Drawable drawable = getResources().getDrawable(paramInt);
    this.j = drawable;
    this.s.setImageDrawable(drawable);
  }
  
  public void setIndicateImage(Drawable paramDrawable) {
    this.j = paramDrawable;
    this.s.setImageDrawable(paramDrawable);
  }
  
  public void setMinVisibleLines(int paramInt) {
    this.k = paramInt;
    this.u = null;
    ViewGroup.LayoutParams layoutParams = this.q.getLayoutParams();
    layoutParams.height = getMinMeasureHeight();
    this.q.setLayoutParams(layoutParams);
  }
  
  public void setOnReadMoreListener(c paramc) {
    this.v = paramc;
  }
  
  public void setTitle(String paramString) {
    this.c = paramString;
    this.p.setText(paramString);
  }
  
  public void setTitleTextColor(int paramInt) {
    this.g = paramInt;
    this.p.setTextColor(paramInt);
  }
  
  public void setTitleTextSize(float paramFloat) {
    this.l = j.b(this.b, paramFloat);
    this.p.setTextSize(paramFloat);
  }
  
  class a implements ValueAnimator.AnimatorUpdateListener {
    a(ExpandTextView this$0, ViewGroup.LayoutParams param1LayoutParams) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.height = ((Integer)param1ValueAnimator.getAnimatedValue()).intValue();
      ExpandTextView.a(this.b).setLayoutParams(this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/ExpandTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */