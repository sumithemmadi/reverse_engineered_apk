package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import b.h.k.w;

class d extends RecyclerView.n implements RecyclerView.r {
  private static final int[] a = new int[] { 16842919 };
  
  private static final int[] b = new int[0];
  
  private final int[] A = new int[2];
  
  final ValueAnimator B;
  
  int C;
  
  private final Runnable D;
  
  private final RecyclerView.s E;
  
  private final int c;
  
  private final int d;
  
  final StateListDrawable e;
  
  final Drawable f;
  
  private final int g;
  
  private final int h;
  
  private final StateListDrawable i;
  
  private final Drawable j;
  
  private final int k;
  
  private final int l;
  
  int m;
  
  int n;
  
  float o;
  
  int p;
  
  int q;
  
  float r;
  
  private int s = 0;
  
  private int t = 0;
  
  private RecyclerView u;
  
  private boolean v = false;
  
  private boolean w = false;
  
  private int x = 0;
  
  private int y = 0;
  
  private final int[] z = new int[2];
  
  d(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3) {
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    this.B = valueAnimator;
    this.C = 0;
    this.D = new a(this);
    this.E = new b(this);
    this.e = paramStateListDrawable1;
    this.f = paramDrawable1;
    this.i = paramStateListDrawable2;
    this.j = paramDrawable2;
    this.g = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    this.h = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    this.k = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    this.l = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    this.c = paramInt2;
    this.d = paramInt3;
    paramStateListDrawable1.setAlpha(255);
    paramDrawable1.setAlpha(255);
    valueAnimator.addListener((Animator.AnimatorListener)new c(this));
    valueAnimator.addUpdateListener(new d(this));
    j(paramRecyclerView);
  }
  
  private void C(float paramFloat) {
    int[] arrayOfInt = p();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(this.n - paramFloat) < 2.0F)
      return; 
    int i = x(this.o, paramFloat, arrayOfInt, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
    if (i != 0)
      this.u.scrollBy(0, i); 
    this.o = paramFloat;
  }
  
  private void k() {
    this.u.removeCallbacks(this.D);
  }
  
  private void l() {
    this.u.X0(this);
    this.u.Y0(this);
    this.u.Z0(this.E);
    k();
  }
  
  private void m(Canvas paramCanvas) {
    int i = this.t;
    int j = this.k;
    i -= j;
    int k = this.q;
    int m = this.p;
    k -= m / 2;
    this.i.setBounds(0, 0, m, j);
    this.j.setBounds(0, 0, this.s, this.l);
    paramCanvas.translate(0.0F, i);
    this.j.draw(paramCanvas);
    paramCanvas.translate(k, 0.0F);
    this.i.draw(paramCanvas);
    paramCanvas.translate(-k, -i);
  }
  
  private void n(Canvas paramCanvas) {
    int i = this.s;
    int j = this.g;
    i -= j;
    int k = this.n;
    int m = this.m;
    k -= m / 2;
    this.e.setBounds(0, 0, j, m);
    this.f.setBounds(0, 0, this.h, this.t);
    if (s()) {
      this.f.draw(paramCanvas);
      paramCanvas.translate(this.g, k);
      paramCanvas.scale(-1.0F, 1.0F);
      this.e.draw(paramCanvas);
      paramCanvas.scale(-1.0F, 1.0F);
      paramCanvas.translate(-this.g, -k);
    } else {
      paramCanvas.translate(i, 0.0F);
      this.f.draw(paramCanvas);
      paramCanvas.translate(0.0F, k);
      this.e.draw(paramCanvas);
      paramCanvas.translate(-i, -k);
    } 
  }
  
  private int[] o() {
    int[] arrayOfInt = this.A;
    int i = this.d;
    arrayOfInt[0] = i;
    arrayOfInt[1] = this.s - i;
    return arrayOfInt;
  }
  
  private int[] p() {
    int[] arrayOfInt = this.z;
    int i = this.d;
    arrayOfInt[0] = i;
    arrayOfInt[1] = this.t - i;
    return arrayOfInt;
  }
  
  private void r(float paramFloat) {
    int[] arrayOfInt = o();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(this.q - paramFloat) < 2.0F)
      return; 
    int i = x(this.r, paramFloat, arrayOfInt, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
    if (i != 0)
      this.u.scrollBy(i, 0); 
    this.r = paramFloat;
  }
  
  private boolean s() {
    int i = w.C((View)this.u);
    boolean bool = true;
    if (i != 1)
      bool = false; 
    return bool;
  }
  
  private void w(int paramInt) {
    k();
    this.u.postDelayed(this.D, paramInt);
  }
  
  private int x(float paramFloat1, float paramFloat2, int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramArrayOfint[1] - paramArrayOfint[0];
    if (i == 0)
      return 0; 
    paramFloat1 = (paramFloat2 - paramFloat1) / i;
    paramInt1 -= paramInt3;
    paramInt3 = (int)(paramFloat1 * paramInt1);
    paramInt2 += paramInt3;
    return (paramInt2 < paramInt1 && paramInt2 >= 0) ? paramInt3 : 0;
  }
  
  private void z() {
    this.u.h(this);
    this.u.k(this);
    this.u.l(this.E);
  }
  
  public void A() {
    int i = this.C;
    if (i != 0) {
      if (i != 3)
        return; 
      this.B.cancel();
    } 
    this.C = 1;
    ValueAnimator valueAnimator = this.B;
    valueAnimator.setFloatValues(new float[] { ((Float)valueAnimator.getAnimatedValue()).floatValue(), 1.0F });
    this.B.setDuration(500L);
    this.B.setStartDelay(0L);
    this.B.start();
  }
  
  void B(int paramInt1, int paramInt2) {
    boolean bool;
    int i = this.u.computeVerticalScrollRange();
    int j = this.t;
    if (i - j > 0 && j >= this.c) {
      bool = true;
    } else {
      bool = false;
    } 
    this.v = bool;
    int k = this.u.computeHorizontalScrollRange();
    int m = this.s;
    if (k - m > 0 && m >= this.c) {
      bool = true;
    } else {
      bool = false;
    } 
    this.w = bool;
    boolean bool1 = this.v;
    if (!bool1 && !bool) {
      if (this.x != 0)
        y(0); 
      return;
    } 
    if (bool1) {
      float f1 = paramInt2;
      float f2 = j;
      this.n = (int)(f2 * (f1 + f2 / 2.0F) / i);
      this.m = Math.min(j, j * j / i);
    } 
    if (this.w) {
      float f2 = paramInt1;
      float f1 = m;
      this.q = (int)(f1 * (f2 + f1 / 2.0F) / k);
      this.p = Math.min(m, m * m / k);
    } 
    paramInt1 = this.x;
    if (paramInt1 == 0 || paramInt1 == 1)
      y(1); 
  }
  
  public void a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {
    if (this.x == 0)
      return; 
    if (paramMotionEvent.getAction() == 0) {
      boolean bool1 = u(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = t(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (bool1 || bool2) {
        if (bool2) {
          this.y = 1;
          this.r = (int)paramMotionEvent.getX();
        } else if (bool1) {
          this.y = 2;
          this.o = (int)paramMotionEvent.getY();
        } 
        y(2);
      } 
    } else if (paramMotionEvent.getAction() == 1 && this.x == 2) {
      this.o = 0.0F;
      this.r = 0.0F;
      y(1);
      this.y = 0;
    } else if (paramMotionEvent.getAction() == 2 && this.x == 2) {
      A();
      if (this.y == 1)
        r(paramMotionEvent.getX()); 
      if (this.y == 2)
        C(paramMotionEvent.getY()); 
    } 
  }
  
  public boolean b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield x : I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: iload_3
    //   9: iconst_1
    //   10: if_icmpne -> 117
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual getX : ()F
    //   18: aload_2
    //   19: invokevirtual getY : ()F
    //   22: invokevirtual u : (FF)Z
    //   25: istore #5
    //   27: aload_0
    //   28: aload_2
    //   29: invokevirtual getX : ()F
    //   32: aload_2
    //   33: invokevirtual getY : ()F
    //   36: invokevirtual t : (FF)Z
    //   39: istore #6
    //   41: iload #4
    //   43: istore #7
    //   45: aload_2
    //   46: invokevirtual getAction : ()I
    //   49: ifne -> 129
    //   52: iload #5
    //   54: ifne -> 66
    //   57: iload #4
    //   59: istore #7
    //   61: iload #6
    //   63: ifeq -> 129
    //   66: iload #6
    //   68: ifeq -> 89
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield y : I
    //   76: aload_0
    //   77: aload_2
    //   78: invokevirtual getX : ()F
    //   81: f2i
    //   82: i2f
    //   83: putfield r : F
    //   86: goto -> 109
    //   89: iload #5
    //   91: ifeq -> 109
    //   94: aload_0
    //   95: iconst_2
    //   96: putfield y : I
    //   99: aload_0
    //   100: aload_2
    //   101: invokevirtual getY : ()F
    //   104: f2i
    //   105: i2f
    //   106: putfield o : F
    //   109: aload_0
    //   110: iconst_2
    //   111: invokevirtual y : (I)V
    //   114: goto -> 126
    //   117: iload #4
    //   119: istore #7
    //   121: iload_3
    //   122: iconst_2
    //   123: if_icmpne -> 129
    //   126: iconst_1
    //   127: istore #7
    //   129: iload #7
    //   131: ireturn
  }
  
  public void c(boolean paramBoolean) {}
  
  public void i(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.y paramy) {
    if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
      this.s = this.u.getWidth();
      this.t = this.u.getHeight();
      y(0);
      return;
    } 
    if (this.C != 0) {
      if (this.v)
        n(paramCanvas); 
      if (this.w)
        m(paramCanvas); 
    } 
  }
  
  public void j(RecyclerView paramRecyclerView) {
    RecyclerView recyclerView = this.u;
    if (recyclerView == paramRecyclerView)
      return; 
    if (recyclerView != null)
      l(); 
    this.u = paramRecyclerView;
    if (paramRecyclerView != null)
      z(); 
  }
  
  void q(int paramInt) {
    int i = this.C;
    if (i != 1) {
      if (i != 2)
        return; 
    } else {
      this.B.cancel();
    } 
    this.C = 3;
    ValueAnimator valueAnimator = this.B;
    valueAnimator.setFloatValues(new float[] { ((Float)valueAnimator.getAnimatedValue()).floatValue(), 0.0F });
    this.B.setDuration(paramInt);
    this.B.start();
  }
  
  boolean t(float paramFloat1, float paramFloat2) {
    if (paramFloat2 >= (this.t - this.k)) {
      int i = this.q;
      int j = this.p;
      if (paramFloat1 >= (i - j / 2) && paramFloat1 <= (i + j / 2))
        return true; 
    } 
    return false;
  }
  
  boolean u(float paramFloat1, float paramFloat2) {
    if (s() ? (paramFloat1 <= this.g) : (paramFloat1 >= (this.s - this.g))) {
      int i = this.n;
      int j = this.m;
      if (paramFloat2 >= (i - j / 2) && paramFloat2 <= (i + j / 2))
        return true; 
    } 
    return false;
  }
  
  void v() {
    this.u.invalidate();
  }
  
  void y(int paramInt) {
    if (paramInt == 2 && this.x != 2) {
      this.e.setState(a);
      k();
    } 
    if (paramInt == 0) {
      v();
    } else {
      A();
    } 
    if (this.x == 2 && paramInt != 2) {
      this.e.setState(b);
      w(1200);
    } else if (paramInt == 1) {
      w(1500);
    } 
    this.x = paramInt;
  }
  
  class a implements Runnable {
    a(d this$0) {}
    
    public void run() {
      this.b.q(500);
    }
  }
  
  class b extends RecyclerView.s {
    b(d this$0) {}
    
    public void b(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      this.a.B(param1RecyclerView.computeHorizontalScrollOffset(), param1RecyclerView.computeVerticalScrollOffset());
    }
  }
  
  private class c extends AnimatorListenerAdapter {
    private boolean a = false;
    
    c(d this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (this.a) {
        this.a = false;
        return;
      } 
      if (((Float)this.b.B.getAnimatedValue()).floatValue() == 0.0F) {
        d d1 = this.b;
        d1.C = 0;
        d1.y(0);
      } else {
        d d1 = this.b;
        d1.C = 2;
        d1.v();
      } 
    }
  }
  
  private class d implements ValueAnimator.AnimatorUpdateListener {
    d(d this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      int i = (int)(((Float)param1ValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
      this.a.e.setAlpha(i);
      this.a.f.setAlpha(i);
      this.a.v();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */