package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b.h.k.w;

public abstract class a implements View.OnTouchListener {
  private static final int b = ViewConfiguration.getTapTimeout();
  
  final a c = new a();
  
  private final Interpolator d = (Interpolator)new AccelerateInterpolator();
  
  final View e;
  
  private Runnable f;
  
  private float[] g = new float[] { 0.0F, 0.0F };
  
  private float[] h = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
  
  private int i;
  
  private int j;
  
  private float[] k = new float[] { 0.0F, 0.0F };
  
  private float[] l = new float[] { 0.0F, 0.0F };
  
  private float[] m = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
  
  private boolean n;
  
  boolean o;
  
  boolean p;
  
  boolean q;
  
  private boolean r;
  
  private boolean s;
  
  public a(View paramView) {
    this.e = paramView;
    float f = (Resources.getSystem().getDisplayMetrics()).density;
    int i = (int)(1575.0F * f + 0.5F);
    int j = (int)(f * 315.0F + 0.5F);
    f = i;
    o(f, f);
    f = j;
    p(f, f);
    l(1);
    n(Float.MAX_VALUE, Float.MAX_VALUE);
    s(0.2F, 0.2F);
    t(1.0F, 1.0F);
    k(b);
    r(500);
    q(500);
  }
  
  private float d(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramFloat2 = h(this.g[paramInt], paramFloat2, this.h[paramInt], paramFloat1);
    if (paramFloat2 == 0.0F)
      return 0.0F; 
    float f1 = this.k[paramInt];
    float f2 = this.l[paramInt];
    paramFloat1 = this.m[paramInt];
    paramFloat3 = f1 * paramFloat3;
    return (paramFloat2 > 0.0F) ? e(paramFloat2 * paramFloat3, f2, paramFloat1) : -e(-paramFloat2 * paramFloat3, f2, paramFloat1);
  }
  
  static float e(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat1 > paramFloat3) ? paramFloat3 : ((paramFloat1 < paramFloat2) ? paramFloat2 : paramFloat1);
  }
  
  static int f(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 > paramInt3) ? paramInt3 : ((paramInt1 < paramInt2) ? paramInt2 : paramInt1);
  }
  
  private float g(float paramFloat1, float paramFloat2) {
    if (paramFloat2 == 0.0F)
      return 0.0F; 
    int i = this.i;
    if (i != 0 && i != 1) {
      if (i == 2 && paramFloat1 < 0.0F)
        return paramFloat1 / -paramFloat2; 
    } else if (paramFloat1 < paramFloat2) {
      if (paramFloat1 >= 0.0F)
        return 1.0F - paramFloat1 / paramFloat2; 
      if (this.q && i == 1)
        return 1.0F; 
    } 
    return 0.0F;
  }
  
  private float h(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    paramFloat1 = e(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat3 = g(paramFloat4, paramFloat1);
    paramFloat1 = g(paramFloat2 - paramFloat4, paramFloat1) - paramFloat3;
    if (paramFloat1 < 0.0F) {
      paramFloat1 = -this.d.getInterpolation(-paramFloat1);
    } else {
      if (paramFloat1 > 0.0F) {
        paramFloat1 = this.d.getInterpolation(paramFloat1);
        return e(paramFloat1, -1.0F, 1.0F);
      } 
      return 0.0F;
    } 
    return e(paramFloat1, -1.0F, 1.0F);
  }
  
  private void i() {
    if (this.o) {
      this.q = false;
    } else {
      this.c.i();
    } 
  }
  
  private void v() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/lang/Runnable;
    //   4: ifnonnull -> 19
    //   7: aload_0
    //   8: new androidx/core/widget/a$b
    //   11: dup
    //   12: aload_0
    //   13: invokespecial <init> : (Landroidx/core/widget/a;)V
    //   16: putfield f : Ljava/lang/Runnable;
    //   19: aload_0
    //   20: iconst_1
    //   21: putfield q : Z
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield o : Z
    //   29: aload_0
    //   30: getfield n : Z
    //   33: ifne -> 61
    //   36: aload_0
    //   37: getfield j : I
    //   40: istore_1
    //   41: iload_1
    //   42: ifle -> 61
    //   45: aload_0
    //   46: getfield e : Landroid/view/View;
    //   49: aload_0
    //   50: getfield f : Ljava/lang/Runnable;
    //   53: iload_1
    //   54: i2l
    //   55: invokestatic k0 : (Landroid/view/View;Ljava/lang/Runnable;J)V
    //   58: goto -> 70
    //   61: aload_0
    //   62: getfield f : Ljava/lang/Runnable;
    //   65: invokeinterface run : ()V
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield n : Z
    //   75: return
  }
  
  public abstract boolean a(int paramInt);
  
  public abstract boolean b(int paramInt);
  
  void c() {
    long l = SystemClock.uptimeMillis();
    MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    this.e.onTouchEvent(motionEvent);
    motionEvent.recycle();
  }
  
  public abstract void j(int paramInt1, int paramInt2);
  
  public a k(int paramInt) {
    this.j = paramInt;
    return this;
  }
  
  public a l(int paramInt) {
    this.i = paramInt;
    return this;
  }
  
  public a m(boolean paramBoolean) {
    if (this.r && !paramBoolean)
      i(); 
    this.r = paramBoolean;
    return this;
  }
  
  public a n(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.h;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a o(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.m;
    arrayOfFloat[0] = paramFloat1 / 1000.0F;
    arrayOfFloat[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Z
    //   4: istore_3
    //   5: iconst_0
    //   6: istore #4
    //   8: iload_3
    //   9: ifne -> 14
    //   12: iconst_0
    //   13: ireturn
    //   14: aload_2
    //   15: invokevirtual getActionMasked : ()I
    //   18: istore #5
    //   20: iload #5
    //   22: ifeq -> 53
    //   25: iload #5
    //   27: iconst_1
    //   28: if_icmpeq -> 46
    //   31: iload #5
    //   33: iconst_2
    //   34: if_icmpeq -> 63
    //   37: iload #5
    //   39: iconst_3
    //   40: if_icmpeq -> 46
    //   43: goto -> 140
    //   46: aload_0
    //   47: invokespecial i : ()V
    //   50: goto -> 140
    //   53: aload_0
    //   54: iconst_1
    //   55: putfield p : Z
    //   58: aload_0
    //   59: iconst_0
    //   60: putfield n : Z
    //   63: aload_0
    //   64: iconst_0
    //   65: aload_2
    //   66: invokevirtual getX : ()F
    //   69: aload_1
    //   70: invokevirtual getWidth : ()I
    //   73: i2f
    //   74: aload_0
    //   75: getfield e : Landroid/view/View;
    //   78: invokevirtual getWidth : ()I
    //   81: i2f
    //   82: invokespecial d : (IFFF)F
    //   85: fstore #6
    //   87: aload_0
    //   88: iconst_1
    //   89: aload_2
    //   90: invokevirtual getY : ()F
    //   93: aload_1
    //   94: invokevirtual getHeight : ()I
    //   97: i2f
    //   98: aload_0
    //   99: getfield e : Landroid/view/View;
    //   102: invokevirtual getHeight : ()I
    //   105: i2f
    //   106: invokespecial d : (IFFF)F
    //   109: fstore #7
    //   111: aload_0
    //   112: getfield c : Landroidx/core/widget/a$a;
    //   115: fload #6
    //   117: fload #7
    //   119: invokevirtual l : (FF)V
    //   122: aload_0
    //   123: getfield q : Z
    //   126: ifne -> 140
    //   129: aload_0
    //   130: invokevirtual u : ()Z
    //   133: ifeq -> 140
    //   136: aload_0
    //   137: invokespecial v : ()V
    //   140: iload #4
    //   142: istore_3
    //   143: aload_0
    //   144: getfield s : Z
    //   147: ifeq -> 162
    //   150: iload #4
    //   152: istore_3
    //   153: aload_0
    //   154: getfield q : Z
    //   157: ifeq -> 162
    //   160: iconst_1
    //   161: istore_3
    //   162: iload_3
    //   163: ireturn
  }
  
  public a p(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.l;
    arrayOfFloat[0] = paramFloat1 / 1000.0F;
    arrayOfFloat[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  public a q(int paramInt) {
    this.c.j(paramInt);
    return this;
  }
  
  public a r(int paramInt) {
    this.c.k(paramInt);
    return this;
  }
  
  public a s(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.g;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a t(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.k;
    arrayOfFloat[0] = paramFloat1 / 1000.0F;
    arrayOfFloat[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  boolean u() {
    boolean bool;
    a a1 = this.c;
    int i = a1.f();
    int j = a1.d();
    if ((i != 0 && b(i)) || (j != 0 && a(j))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static class a {
    private int a;
    
    private int b;
    
    private float c;
    
    private float d;
    
    private long e = Long.MIN_VALUE;
    
    private long f = 0L;
    
    private int g = 0;
    
    private int h = 0;
    
    private long i = -1L;
    
    private float j;
    
    private int k;
    
    private float e(long param1Long) {
      long l1 = this.e;
      if (param1Long < l1)
        return 0.0F; 
      long l2 = this.i;
      if (l2 < 0L || param1Long < l2)
        return a.e((float)(param1Long - l1) / this.a, 0.0F, 1.0F) * 0.5F; 
      float f = this.j;
      return 1.0F - f + f * a.e((float)(param1Long - l2) / this.k, 0.0F, 1.0F);
    }
    
    private float g(float param1Float) {
      return -4.0F * param1Float * param1Float + param1Float * 4.0F;
    }
    
    public void a() {
      if (this.f != 0L) {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        float f = g(e(l1));
        long l2 = this.f;
        this.f = l1;
        f = (float)(l1 - l2) * f;
        this.g = (int)(this.c * f);
        this.h = (int)(f * this.d);
        return;
      } 
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    
    public int b() {
      return this.g;
    }
    
    public int c() {
      return this.h;
    }
    
    public int d() {
      float f = this.c;
      return (int)(f / Math.abs(f));
    }
    
    public int f() {
      float f = this.d;
      return (int)(f / Math.abs(f));
    }
    
    public boolean h() {
      boolean bool;
      if (this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + this.k) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void i() {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.k = a.f((int)(l - this.e), 0, this.b);
      this.j = e(l);
      this.i = l;
    }
    
    public void j(int param1Int) {
      this.b = param1Int;
    }
    
    public void k(int param1Int) {
      this.a = param1Int;
    }
    
    public void l(float param1Float1, float param1Float2) {
      this.c = param1Float1;
      this.d = param1Float2;
    }
    
    public void m() {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.e = l;
      this.i = -1L;
      this.f = l;
      this.j = 0.5F;
      this.g = 0;
      this.h = 0;
    }
  }
  
  private class b implements Runnable {
    b(a this$0) {}
    
    public void run() {
      a a1 = this.b;
      if (!a1.q)
        return; 
      if (a1.o) {
        a1.o = false;
        a1.c.m();
      } 
      a.a a2 = this.b.c;
      if (a2.h() || !this.b.u()) {
        this.b.q = false;
        return;
      } 
      a1 = this.b;
      if (a1.p) {
        a1.p = false;
        a1.c();
      } 
      a2.a();
      int i = a2.b();
      int j = a2.c();
      this.b.j(i, j);
      w.j0(this.b.e, this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */