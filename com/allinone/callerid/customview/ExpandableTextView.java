package com.allinone.callerid.customview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.allinone.callerid.R;
import com.allinone.callerid.util.j;

public class ExpandableTextView extends LinearLayout implements View.OnClickListener {
  protected TextView b;
  
  protected TextView c;
  
  private boolean d;
  
  private boolean e = true;
  
  private Drawable f;
  
  private Drawable g;
  
  private int h;
  
  private boolean i;
  
  private d j;
  
  private SparseBooleanArray k;
  
  private int l;
  
  private int m;
  
  private int n;
  
  private int o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private float s;
  
  private float t;
  
  private String u;
  
  private String v;
  
  private int w;
  
  private int x;
  
  private View y;
  
  public ExpandableTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ExpandableTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    h(paramAttributeSet);
  }
  
  @TargetApi(11)
  public ExpandableTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    h(paramAttributeSet);
  }
  
  private void f() {
    ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(2131493054, (ViewGroup)this);
    this.b = (TextView)findViewById(2131296690);
    this.y = findViewById(2131298250);
    this.b.setOnClickListener(this);
    this.c = (TextView)findViewById(2131296689);
    i();
    this.c.setOnClickListener(this);
    this.b.setTextColor(this.q);
    this.b.getPaint().setTextSize(this.s);
    this.c.setTextColor(this.r);
    this.c.getPaint().setTextSize(this.t);
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
    layoutParams.gravity = this.w;
    this.c.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
  }
  
  private static int g(TextView paramTextView) {
    return paramTextView.getLayout().getLineTop(paramTextView.getLineCount()) + paramTextView.getCompoundPaddingTop() + paramTextView.getCompoundPaddingBottom();
  }
  
  private void h(AttributeSet paramAttributeSet) {
    this.k = new SparseBooleanArray();
    TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ExpandableTextView);
    this.m = typedArray.getInt(9, 5);
    this.h = typedArray.getInt(0, 200);
    this.f = typedArray.getDrawable(8);
    this.g = typedArray.getDrawable(1);
    this.u = typedArray.getString(10);
    this.v = typedArray.getString(11);
    if (this.f == null)
      this.f = androidx.core.content.a.f(getContext(), 2131231213); 
    if (this.g == null)
      this.g = androidx.core.content.a.f(getContext(), 2131231212); 
    if (TextUtils.isEmpty(this.u))
      this.u = getContext().getString(2131755204); 
    if (TextUtils.isEmpty(this.v))
      this.v = getContext().getString(2131755352); 
    this.q = typedArray.getColor(5, androidx.core.content.a.d(getContext(), 2131099899));
    this.s = typedArray.getDimension(6, j.b(getContext(), 14.0F));
    this.r = typedArray.getColor(3, androidx.core.content.a.d(getContext(), 2131099706));
    this.t = typedArray.getDimension(4, j.b(getContext(), 14.0F));
    this.w = typedArray.getInt(2, 3);
    this.x = typedArray.getInt(7, 3);
    typedArray.recycle();
    setOrientation(1);
    setVisibility(8);
  }
  
  private void i() {
    Resources resources;
    int i;
    if (3 == this.x) {
      Drawable drawable;
      TextView textView1 = this.c;
      if (this.e) {
        drawable = this.g;
      } else {
        drawable = this.f;
      } 
      textView1.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
    } else {
      Drawable drawable;
      TextView textView1 = this.c;
      if (this.e) {
        drawable = this.g;
      } else {
        drawable = this.f;
      } 
      textView1.setCompoundDrawablesWithIntrinsicBounds(null, null, drawable, null);
    } 
    TextView textView = this.c;
    if (this.e) {
      resources = getResources();
      i = 2131755352;
    } else {
      resources = getResources();
      i = 2131755204;
    } 
    textView.setText(resources.getString(i));
    if (this.e) {
      this.y.setVisibility(0);
    } else {
      this.y.setVisibility(8);
    } 
  }
  
  public CharSequence getText() {
    TextView textView = this.b;
    return (textView == null) ? "" : textView.getText();
  }
  
  public void onClick(View paramView) {
    ValueAnimator valueAnimator;
    if (this.c.getVisibility() != 0)
      return; 
    this.e ^= 0x1;
    i();
    SparseBooleanArray sparseBooleanArray = this.k;
    if (sparseBooleanArray != null)
      sparseBooleanArray.put(this.l, this.e); 
    this.i = true;
    if (this.e) {
      new ValueAnimator();
      valueAnimator = ValueAnimator.ofInt(new int[] { getHeight(), this.n });
    } else {
      new ValueAnimator();
      valueAnimator = ValueAnimator.ofInt(new int[] { getHeight(), getHeight() + this.o - this.b.getHeight() });
    } 
    valueAnimator.addUpdateListener(new a(this));
    valueAnimator.addListener(new b(this));
    valueAnimator.setDuration(this.h);
    valueAnimator.start();
  }
  
  protected void onFinishInflate() {
    super.onFinishInflate();
    f();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    return this.i;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    if (!this.d || getVisibility() == 8) {
      super.onMeasure(paramInt1, paramInt2);
      return;
    } 
    this.d = false;
    this.c.setVisibility(8);
    this.y.setVisibility(8);
    this.b.setMaxLines(2147483647);
    super.onMeasure(paramInt1, paramInt2);
    if (this.b.getLineCount() <= this.m)
      return; 
    this.o = g(this.b);
    if (this.e)
      this.b.setMaxLines(this.m); 
    this.c.setVisibility(0);
    this.y.setVisibility(0);
    super.onMeasure(paramInt1, paramInt2);
    if (this.e) {
      this.b.post(new c(this));
      this.n = getMeasuredHeight();
    } 
  }
  
  public void setOnExpandStateChangeListener(d paramd) {
    this.j = paramd;
  }
  
  public void setOrientation(int paramInt) {
    if (paramInt != 0) {
      super.setOrientation(paramInt);
      return;
    } 
    throw new IllegalArgumentException("ExpandableTextView only supports Vertical Orientation.");
  }
  
  public void setText(CharSequence paramCharSequence) {
    boolean bool;
    this.d = true;
    this.b.setText(paramCharSequence);
    if (TextUtils.isEmpty(paramCharSequence)) {
      bool = true;
    } else {
      bool = false;
    } 
    setVisibility(bool);
  }
  
  public void setText(CharSequence paramCharSequence, int paramInt) {
    Resources resources;
    this.l = paramInt;
    this.e = this.k.get(paramInt, true);
    clearAnimation();
    i();
    TextView textView = this.c;
    if (this.e) {
      resources = getResources();
      paramInt = 2131755352;
    } else {
      resources = getResources();
      paramInt = 2131755204;
    } 
    textView.setText(resources.getString(paramInt));
    setText(paramCharSequence);
    (getLayoutParams()).height = -2;
    requestLayout();
  }
  
  class a implements ValueAnimator.AnimatorUpdateListener {
    a(ExpandableTextView this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      int i = ((Integer)param1ValueAnimator.getAnimatedValue()).intValue();
      ExpandableTextView expandableTextView = this.a;
      expandableTextView.b.setMaxHeight(i - ExpandableTextView.a(expandableTextView));
      (this.a.getLayoutParams()).height = i;
      this.a.requestLayout();
    }
  }
  
  class b implements Animator.AnimatorListener {
    b(ExpandableTextView this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      ExpandableTextView.c(this.a, false);
      if (ExpandableTextView.d(this.a) != null) {
        ExpandableTextView.d d = ExpandableTextView.d(this.a);
        ExpandableTextView expandableTextView = this.a;
        d.a(expandableTextView.b, ExpandableTextView.e(expandableTextView) ^ true);
      } 
    }
    
    public void onAnimationRepeat(Animator param1Animator) {}
    
    public void onAnimationStart(Animator param1Animator) {}
  }
  
  class c implements Runnable {
    c(ExpandableTextView this$0) {}
    
    public void run() {
      ExpandableTextView expandableTextView = this.b;
      ExpandableTextView.b(expandableTextView, expandableTextView.getHeight() - this.b.b.getHeight());
    }
  }
  
  public static interface d {
    void a(TextView param1TextView, boolean param1Boolean);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/ExpandableTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */