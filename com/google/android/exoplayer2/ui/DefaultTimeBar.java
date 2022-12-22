package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

public class DefaultTimeBar extends View implements m {
  private final float A;
  
  private int B;
  
  private long C;
  
  private int D;
  
  private Rect E;
  
  private boolean F;
  
  private long G;
  
  private long H;
  
  private long I;
  
  private long J;
  
  private int K;
  
  private long[] L;
  
  private boolean[] M;
  
  private final Rect b = new Rect();
  
  private final Rect c = new Rect();
  
  private final Rect d = new Rect();
  
  private final Rect e = new Rect();
  
  private final Paint f;
  
  private final Paint g;
  
  private final Paint h;
  
  private final Paint i;
  
  private final Paint j;
  
  private final Paint k;
  
  private final Drawable l;
  
  private final int m;
  
  private final int n;
  
  private final int o;
  
  private final int p;
  
  private final int q;
  
  private final int r;
  
  private final int s;
  
  private final int t;
  
  private final StringBuilder u;
  
  private final Formatter v;
  
  private final Runnable w;
  
  private final CopyOnWriteArraySet<m.a> x;
  
  private final int[] y;
  
  private final Point z;
  
  public DefaultTimeBar(Context paramContext) {
    this(paramContext, null);
  }
  
  public DefaultTimeBar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DefaultTimeBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    this(paramContext, paramAttributeSet, paramInt, paramAttributeSet);
  }
  
  public DefaultTimeBar(Context paramContext, AttributeSet paramAttributeSet1, int paramInt, AttributeSet paramAttributeSet2) {
    super(paramContext, paramAttributeSet1, paramInt);
    Paint paint2 = new Paint();
    this.f = paint2;
    Paint paint3 = new Paint();
    this.g = paint3;
    Paint paint1 = new Paint();
    this.h = paint1;
    Paint paint4 = new Paint();
    this.i = paint4;
    Paint paint5 = new Paint();
    this.j = paint5;
    Paint paint6 = new Paint();
    this.k = paint6;
    paint6.setAntiAlias(true);
    this.x = new CopyOnWriteArraySet<m.a>();
    this.y = new int[2];
    this.z = new Point();
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.A = f;
    this.t = b(f, -50);
    int i = b(f, 4);
    int j = b(f, 26);
    int k = b(f, 4);
    int n = b(f, 12);
    int i1 = b(f, 0);
    int i2 = b(f, 16);
    if (paramAttributeSet2 != null) {
      TypedArray typedArray = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet2, k.DefaultTimeBar, 0, 0);
      try {
        Drawable drawable1 = typedArray.getDrawable(k.DefaultTimeBar_scrubber_drawable);
        this.l = drawable1;
        paramInt = j;
        if (drawable1 != null) {
          l(drawable1);
          paramInt = Math.max(drawable1.getMinimumHeight(), j);
        } 
        this.m = typedArray.getDimensionPixelSize(k.DefaultTimeBar_bar_height, i);
        this.n = typedArray.getDimensionPixelSize(k.DefaultTimeBar_touch_target_height, paramInt);
        this.o = typedArray.getDimensionPixelSize(k.DefaultTimeBar_ad_marker_width, k);
        this.p = typedArray.getDimensionPixelSize(k.DefaultTimeBar_scrubber_enabled_size, n);
        this.q = typedArray.getDimensionPixelSize(k.DefaultTimeBar_scrubber_disabled_size, i1);
        this.r = typedArray.getDimensionPixelSize(k.DefaultTimeBar_scrubber_dragged_size, i2);
        i2 = typedArray.getInt(k.DefaultTimeBar_played_color, -1);
        n = typedArray.getInt(k.DefaultTimeBar_scrubber_color, -1);
        j = typedArray.getInt(k.DefaultTimeBar_buffered_color, -855638017);
        i = typedArray.getInt(k.DefaultTimeBar_unplayed_color, 872415231);
        paramInt = typedArray.getInt(k.DefaultTimeBar_ad_marker_color, -1291845888);
        i1 = typedArray.getInt(k.DefaultTimeBar_played_ad_marker_color, 872414976);
        paint2.setColor(i2);
        paint6.setColor(n);
        paint3.setColor(j);
        paint1.setColor(i);
        paint4.setColor(paramInt);
        paint5.setColor(i1);
      } finally {
        typedArray.recycle();
      } 
    } else {
      this.m = i;
      this.n = j;
      this.o = k;
      this.p = n;
      this.q = i1;
      this.r = i2;
      paint2.setColor(-1);
      paint6.setColor(-1);
      paint3.setColor(-855638017);
      paint1.setColor(872415231);
      paint4.setColor(-1291845888);
      paint5.setColor(872414976);
      this.l = null;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    this.u = stringBuilder;
    this.v = new Formatter(stringBuilder, Locale.getDefault());
    this.w = new b(this);
    Drawable drawable = this.l;
    if (drawable != null) {
      this.s = (drawable.getMinimumWidth() + 1) / 2;
    } else {
      this.s = (Math.max(this.q, Math.max(this.p, this.r)) + 1) / 2;
    } 
    this.H = -9223372036854775807L;
    this.C = -9223372036854775807L;
    this.B = 20;
    setFocusable(true);
    if (getImportantForAccessibility() == 0)
      setImportantForAccessibility(1); 
  }
  
  private static int b(float paramFloat, int paramInt) {
    return (int)(paramInt * paramFloat + 0.5F);
  }
  
  private void c(Canvas paramCanvas) {
    if (this.H <= 0L)
      return; 
    Rect rect = this.e;
    int i = h0.n(rect.right, rect.left, this.c.right);
    int j = this.e.centerY();
    Drawable drawable = this.l;
    if (drawable == null) {
      int k;
      if (this.F || isFocused()) {
        k = this.r;
      } else if (isEnabled()) {
        k = this.p;
      } else {
        k = this.q;
      } 
      k /= 2;
      paramCanvas.drawCircle(i, j, k, this.k);
    } else {
      int n = drawable.getIntrinsicWidth();
      int k = this.l.getIntrinsicHeight();
      drawable = this.l;
      n /= 2;
      k /= 2;
      drawable.setBounds(i - n, j - k, i + n, j + k);
      this.l.draw(paramCanvas);
    } 
  }
  
  private void d(Canvas paramCanvas) {
    int i = this.c.height();
    int j = this.c.centerY() - i / 2;
    int k = i + j;
    if (this.H <= 0L) {
      Rect rect1 = this.c;
      paramCanvas.drawRect(rect1.left, j, rect1.right, k, this.h);
      return;
    } 
    Rect rect = this.d;
    int n = rect.left;
    i = rect.right;
    int i1 = Math.max(Math.max(this.c.left, i), this.e.right);
    int i2 = this.c.right;
    if (i1 < i2)
      paramCanvas.drawRect(i1, j, i2, k, this.h); 
    n = Math.max(n, this.e.right);
    if (i > n)
      paramCanvas.drawRect(n, j, i, k, this.g); 
    if (this.e.width() > 0) {
      rect = this.e;
      paramCanvas.drawRect(rect.left, j, rect.right, k, this.f);
    } 
    if (this.K == 0)
      return; 
    long[] arrayOfLong = (long[])e.e(this.L);
    boolean[] arrayOfBoolean = (boolean[])e.e(this.M);
    n = this.o / 2;
    for (i = 0; i < this.K; i++) {
      Paint paint;
      long l = h0.o(arrayOfLong[i], 0L, this.H);
      i1 = (int)(this.c.width() * l / this.H);
      rect = this.c;
      i1 = rect.left + Math.min(rect.width() - this.o, Math.max(0, i1 - n));
      if (arrayOfBoolean[i]) {
        paint = this.j;
      } else {
        paint = this.i;
      } 
      paramCanvas.drawRect(i1, j, (i1 + this.o), k, paint);
    } 
  }
  
  private boolean e(float paramFloat1, float paramFloat2) {
    return this.b.contains((int)paramFloat1, (int)paramFloat2);
  }
  
  private long getPositionIncrement() {
    long l1 = this.C;
    long l2 = l1;
    if (l1 == -9223372036854775807L) {
      l2 = this.H;
      if (l2 == -9223372036854775807L) {
        l2 = 0L;
      } else {
        l2 /= this.B;
      } 
    } 
    return l2;
  }
  
  private String getProgressText() {
    return h0.L(this.u, this.v, this.I);
  }
  
  private long getScrubberPosition() {
    return (this.c.width() <= 0 || this.H == -9223372036854775807L) ? 0L : (this.e.width() * this.H / this.c.width());
  }
  
  private void h(float paramFloat) {
    Rect rect1 = this.e;
    int i = (int)paramFloat;
    Rect rect2 = this.c;
    rect1.right = h0.n(i, rect2.left, rect2.right);
  }
  
  private static int i(float paramFloat, int paramInt) {
    return (int)(paramInt / paramFloat);
  }
  
  private Point j(MotionEvent paramMotionEvent) {
    getLocationOnScreen(this.y);
    this.z.set((int)paramMotionEvent.getRawX() - this.y[0], (int)paramMotionEvent.getRawY() - this.y[1]);
    return this.z;
  }
  
  private boolean k(long paramLong) {
    long l2;
    long l1 = this.H;
    if (l1 <= 0L)
      return false; 
    if (this.F) {
      l2 = this.G;
    } else {
      l2 = this.I;
    } 
    paramLong = h0.o(l2 + paramLong, 0L, l1);
    if (paramLong == l2)
      return false; 
    if (!this.F) {
      o(paramLong);
    } else {
      s(paramLong);
    } 
    q();
    return true;
  }
  
  private boolean l(Drawable paramDrawable) {
    boolean bool;
    if (h0.a >= 23 && m(paramDrawable, getLayoutDirection())) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static boolean m(Drawable paramDrawable, int paramInt) {
    boolean bool;
    if (h0.a >= 23 && paramDrawable.setLayoutDirection(paramInt)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void n(int paramInt1, int paramInt2) {
    Rect rect = this.E;
    if (rect != null && rect.width() == paramInt1 && this.E.height() == paramInt2)
      return; 
    rect = new Rect(0, 0, paramInt1, paramInt2);
    this.E = rect;
    setSystemGestureExclusionRects(Collections.singletonList(rect));
  }
  
  private void o(long paramLong) {
    this.G = paramLong;
    this.F = true;
    setPressed(true);
    ViewParent viewParent = getParent();
    if (viewParent != null)
      viewParent.requestDisallowInterceptTouchEvent(true); 
    Iterator<m.a> iterator = this.x.iterator();
    while (iterator.hasNext())
      ((m.a)iterator.next()).c(this, paramLong); 
  }
  
  private void p(boolean paramBoolean) {
    removeCallbacks(this.w);
    this.F = false;
    setPressed(false);
    ViewParent viewParent = getParent();
    if (viewParent != null)
      viewParent.requestDisallowInterceptTouchEvent(false); 
    invalidate();
    Iterator<m.a> iterator = this.x.iterator();
    while (iterator.hasNext())
      ((m.a)iterator.next()).b(this, this.G, paramBoolean); 
  }
  
  private void q() {
    long l;
    this.d.set(this.c);
    this.e.set(this.c);
    if (this.F) {
      l = this.G;
    } else {
      l = this.I;
    } 
    if (this.H > 0L) {
      int i = (int)(this.c.width() * this.J / this.H);
      Rect rect1 = this.d;
      Rect rect2 = this.c;
      rect1.right = Math.min(rect2.left + i, rect2.right);
      i = (int)(this.c.width() * l / this.H);
      rect1 = this.e;
      rect2 = this.c;
      rect1.right = Math.min(rect2.left + i, rect2.right);
    } else {
      Rect rect = this.d;
      int i = this.c.left;
      rect.right = i;
      this.e.right = i;
    } 
    invalidate(this.b);
  }
  
  private void r() {
    Drawable drawable = this.l;
    if (drawable != null && drawable.isStateful() && this.l.setState(getDrawableState()))
      invalidate(); 
  }
  
  private void s(long paramLong) {
    if (this.G == paramLong)
      return; 
    this.G = paramLong;
    Iterator<m.a> iterator = this.x.iterator();
    while (iterator.hasNext())
      ((m.a)iterator.next()).a(this, paramLong); 
  }
  
  public void a(m.a parama) {
    this.x.add(parama);
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    r();
  }
  
  public long getPreferredUpdateDelay() {
    int i = i(this.A, this.c.width());
    if (i != 0) {
      long l = this.H;
      if (l == 0L || l == -9223372036854775807L)
        return Long.MAX_VALUE; 
      l /= i;
      return l;
    } 
    return Long.MAX_VALUE;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    Drawable drawable = this.l;
    if (drawable != null)
      drawable.jumpToCurrentState(); 
  }
  
  public void onDraw(Canvas paramCanvas) {
    paramCanvas.save();
    d(paramCanvas);
    c(paramCanvas);
    paramCanvas.restore();
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect) {
    super.onFocusChanged(paramBoolean, paramInt, paramRect);
    if (this.F && !paramBoolean)
      p(false); 
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 4)
      paramAccessibilityEvent.getText().add(getProgressText()); 
    paramAccessibilityEvent.setClassName("android.widget.SeekBar");
  }
  
  @TargetApi(21)
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("android.widget.SeekBar");
    paramAccessibilityNodeInfo.setContentDescription(getProgressText());
    if (this.H <= 0L)
      return; 
    if (h0.a >= 21) {
      paramAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
      paramAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    } else {
      paramAccessibilityNodeInfo.addAction(4096);
      paramAccessibilityNodeInfo.addAction(8192);
    } 
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (isEnabled()) {
      long l = getPositionIncrement();
      if (paramInt != 66) {
        long l1 = l;
        switch (paramInt) {
          default:
            return super.onKeyDown(paramInt, paramKeyEvent);
          case 21:
            l1 = -l;
          case 22:
            if (k(l1)) {
              removeCallbacks(this.w);
              postDelayed(this.w, 1000L);
              return true;
            } 
          case 23:
            break;
        } 
      } 
      if (this.F) {
        p(false);
        return true;
      } 
    } 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = paramInt3 - paramInt1;
    paramInt3 = paramInt4 - paramInt2;
    int i = (paramInt3 - this.n) / 2;
    paramInt4 = getPaddingLeft();
    int j = getPaddingRight();
    int k = this.n;
    paramInt2 = (k - this.m) / 2 + i;
    this.b.set(paramInt4, i, paramInt1 - j, k + i);
    Rect rect1 = this.c;
    Rect rect2 = this.b;
    paramInt4 = rect2.left;
    i = this.s;
    rect1.set(paramInt4 + i, paramInt2, rect2.right - i, this.m + paramInt2);
    if (h0.a >= 29)
      n(paramInt1, paramInt3); 
    q();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (i == 0) {
      paramInt2 = this.n;
    } else if (i != 1073741824) {
      paramInt2 = Math.min(this.n, paramInt2);
    } 
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), paramInt2);
    r();
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    Drawable drawable = this.l;
    if (drawable != null && m(drawable, paramInt))
      invalidate(); 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    boolean bool = isEnabled();
    boolean bool1 = false;
    if (bool && this.H > 0L) {
      Point point = j(paramMotionEvent);
      int i = point.x;
      int j = point.y;
      int k = paramMotionEvent.getAction();
      if (k != 0) {
        if (k != 1)
          if (k != 2) {
            if (k != 3)
              return false; 
          } else {
            if (this.F) {
              if (j < this.t) {
                k = this.D;
                h((k + (i - k) / 3));
              } else {
                this.D = i;
                h(i);
              } 
              s(getScrubberPosition());
              q();
              invalidate();
              return true;
            } 
            return false;
          }  
        if (this.F) {
          if (paramMotionEvent.getAction() == 3)
            bool1 = true; 
          p(bool1);
          return true;
        } 
      } else {
        float f = i;
        if (e(f, j)) {
          h(f);
          o(getScrubberPosition());
          q();
          invalidate();
          return true;
        } 
      } 
    } 
    return false;
  }
  
  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle) {
    if (super.performAccessibilityAction(paramInt, paramBundle))
      return true; 
    if (this.H <= 0L)
      return false; 
    if (paramInt == 8192) {
      if (k(-getPositionIncrement()))
        p(false); 
    } else {
      if (paramInt == 4096) {
        if (k(getPositionIncrement()))
          p(false); 
        sendAccessibilityEvent(4);
        return true;
      } 
      return false;
    } 
    sendAccessibilityEvent(4);
    return true;
  }
  
  public void setAdGroupTimesMs(long[] paramArrayOflong, boolean[] paramArrayOfboolean, int paramInt) {
    boolean bool;
    if (paramInt == 0 || (paramArrayOflong != null && paramArrayOfboolean != null)) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.K = paramInt;
    this.L = paramArrayOflong;
    this.M = paramArrayOfboolean;
    q();
  }
  
  public void setAdMarkerColor(int paramInt) {
    this.i.setColor(paramInt);
    invalidate(this.b);
  }
  
  public void setBufferedColor(int paramInt) {
    this.g.setColor(paramInt);
    invalidate(this.b);
  }
  
  public void setBufferedPosition(long paramLong) {
    this.J = paramLong;
    q();
  }
  
  public void setDuration(long paramLong) {
    this.H = paramLong;
    if (this.F && paramLong == -9223372036854775807L)
      p(true); 
    q();
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    if (this.F && !paramBoolean)
      p(true); 
  }
  
  public void setKeyCountIncrement(int paramInt) {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.B = paramInt;
    this.C = -9223372036854775807L;
  }
  
  public void setKeyTimeIncrement(long paramLong) {
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    e.a(bool);
    this.B = -1;
    this.C = paramLong;
  }
  
  public void setPlayedAdMarkerColor(int paramInt) {
    this.j.setColor(paramInt);
    invalidate(this.b);
  }
  
  public void setPlayedColor(int paramInt) {
    this.f.setColor(paramInt);
    invalidate(this.b);
  }
  
  public void setPosition(long paramLong) {
    this.I = paramLong;
    setContentDescription(getProgressText());
    q();
  }
  
  public void setScrubberColor(int paramInt) {
    this.k.setColor(paramInt);
    invalidate(this.b);
  }
  
  public void setUnplayedColor(int paramInt) {
    this.h.setColor(paramInt);
    invalidate(this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/DefaultTimeBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */