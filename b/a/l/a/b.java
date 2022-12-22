package b.a.l.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

class b extends Drawable implements Drawable.Callback {
  private d b;
  
  private Rect c;
  
  private Drawable d;
  
  private Drawable e;
  
  private int f = 255;
  
  private boolean g;
  
  private int h = -1;
  
  private boolean i;
  
  private Runnable j;
  
  private long k;
  
  private long l;
  
  private c m;
  
  private void d(Drawable paramDrawable) {
    if (this.m == null)
      this.m = new c(); 
    paramDrawable.setCallback(this.m.b(paramDrawable.getCallback()));
    try {
      if (this.b.A <= 0 && this.g)
        paramDrawable.setAlpha(this.f); 
      d d1 = this.b;
      if (d1.E) {
        paramDrawable.setColorFilter(d1.D);
      } else {
        if (d1.H)
          androidx.core.graphics.drawable.a.o(paramDrawable, d1.F); 
        d1 = this.b;
        if (d1.I)
          androidx.core.graphics.drawable.a.p(paramDrawable, d1.G); 
      } 
      paramDrawable.setVisible(isVisible(), true);
      paramDrawable.setDither(this.b.x);
      paramDrawable.setState(getState());
      paramDrawable.setLevel(getLevel());
      paramDrawable.setBounds(getBounds());
      int i = Build.VERSION.SDK_INT;
      if (i >= 23)
        androidx.core.graphics.drawable.a.m(paramDrawable, androidx.core.graphics.drawable.a.f(this)); 
      if (i >= 19)
        androidx.core.graphics.drawable.a.j(paramDrawable, this.b.C); 
      Rect rect = this.c;
      if (i >= 21 && rect != null)
        androidx.core.graphics.drawable.a.l(paramDrawable, rect.left, rect.top, rect.right, rect.bottom); 
      return;
    } finally {
      paramDrawable.setCallback(this.m.a());
    } 
  }
  
  private boolean e() {
    boolean bool = isAutoMirrored();
    boolean bool1 = true;
    if (!bool || androidx.core.graphics.drawable.a.f(this) != 1)
      bool1 = false; 
    return bool1;
  }
  
  static int f(Resources paramResources, int paramInt) {
    if (paramResources != null)
      paramInt = (paramResources.getDisplayMetrics()).densityDpi; 
    int i = paramInt;
    if (paramInt == 0)
      i = 160; 
    return i;
  }
  
  void a(boolean paramBoolean) {
    boolean bool1 = true;
    this.g = true;
    long l = SystemClock.uptimeMillis();
    Drawable drawable = this.d;
    if (drawable != null) {
      long l1 = this.k;
      if (l1 != 0L)
        if (l1 <= l) {
          drawable.setAlpha(this.f);
          this.k = 0L;
        } else {
          drawable.setAlpha((255 - (int)((l1 - l) * 255L) / this.b.A) * this.f / 255);
          boolean bool = true;
          drawable = this.e;
        }  
    } else {
      this.k = 0L;
    } 
    boolean bool2 = false;
    drawable = this.e;
  }
  
  public void applyTheme(Resources.Theme paramTheme) {
    this.b.b(paramTheme);
  }
  
  d b() {
    throw null;
  }
  
  int c() {
    return this.h;
  }
  
  public boolean canApplyTheme() {
    return this.b.canApplyTheme();
  }
  
  public void draw(Canvas paramCanvas) {
    Drawable drawable = this.d;
    if (drawable != null)
      drawable.draw(paramCanvas); 
    drawable = this.e;
    if (drawable != null)
      drawable.draw(paramCanvas); 
  }
  
  boolean g(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield h : I
    //   5: if_icmpne -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: invokestatic uptimeMillis : ()J
    //   13: lstore_2
    //   14: aload_0
    //   15: getfield b : Lb/a/l/a/b$d;
    //   18: getfield B : I
    //   21: ifle -> 90
    //   24: aload_0
    //   25: getfield e : Landroid/graphics/drawable/Drawable;
    //   28: astore #4
    //   30: aload #4
    //   32: ifnull -> 43
    //   35: aload #4
    //   37: iconst_0
    //   38: iconst_0
    //   39: invokevirtual setVisible : (ZZ)Z
    //   42: pop
    //   43: aload_0
    //   44: getfield d : Landroid/graphics/drawable/Drawable;
    //   47: astore #4
    //   49: aload #4
    //   51: ifnull -> 77
    //   54: aload_0
    //   55: aload #4
    //   57: putfield e : Landroid/graphics/drawable/Drawable;
    //   60: aload_0
    //   61: aload_0
    //   62: getfield b : Lb/a/l/a/b$d;
    //   65: getfield B : I
    //   68: i2l
    //   69: lload_2
    //   70: ladd
    //   71: putfield l : J
    //   74: goto -> 109
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield e : Landroid/graphics/drawable/Drawable;
    //   82: aload_0
    //   83: lconst_0
    //   84: putfield l : J
    //   87: goto -> 109
    //   90: aload_0
    //   91: getfield d : Landroid/graphics/drawable/Drawable;
    //   94: astore #4
    //   96: aload #4
    //   98: ifnull -> 109
    //   101: aload #4
    //   103: iconst_0
    //   104: iconst_0
    //   105: invokevirtual setVisible : (ZZ)Z
    //   108: pop
    //   109: iload_1
    //   110: iflt -> 181
    //   113: aload_0
    //   114: getfield b : Lb/a/l/a/b$d;
    //   117: astore #4
    //   119: iload_1
    //   120: aload #4
    //   122: getfield h : I
    //   125: if_icmpge -> 181
    //   128: aload #4
    //   130: iload_1
    //   131: invokevirtual g : (I)Landroid/graphics/drawable/Drawable;
    //   134: astore #4
    //   136: aload_0
    //   137: aload #4
    //   139: putfield d : Landroid/graphics/drawable/Drawable;
    //   142: aload_0
    //   143: iload_1
    //   144: putfield h : I
    //   147: aload #4
    //   149: ifnull -> 191
    //   152: aload_0
    //   153: getfield b : Lb/a/l/a/b$d;
    //   156: getfield A : I
    //   159: istore_1
    //   160: iload_1
    //   161: ifle -> 172
    //   164: aload_0
    //   165: lload_2
    //   166: iload_1
    //   167: i2l
    //   168: ladd
    //   169: putfield k : J
    //   172: aload_0
    //   173: aload #4
    //   175: invokespecial d : (Landroid/graphics/drawable/Drawable;)V
    //   178: goto -> 191
    //   181: aload_0
    //   182: aconst_null
    //   183: putfield d : Landroid/graphics/drawable/Drawable;
    //   186: aload_0
    //   187: iconst_m1
    //   188: putfield h : I
    //   191: aload_0
    //   192: getfield k : J
    //   195: lconst_0
    //   196: lcmp
    //   197: ifne -> 209
    //   200: aload_0
    //   201: getfield l : J
    //   204: lconst_0
    //   205: lcmp
    //   206: ifeq -> 246
    //   209: aload_0
    //   210: getfield j : Ljava/lang/Runnable;
    //   213: astore #4
    //   215: aload #4
    //   217: ifnonnull -> 235
    //   220: aload_0
    //   221: new b/a/l/a/b$a
    //   224: dup
    //   225: aload_0
    //   226: invokespecial <init> : (Lb/a/l/a/b;)V
    //   229: putfield j : Ljava/lang/Runnable;
    //   232: goto -> 241
    //   235: aload_0
    //   236: aload #4
    //   238: invokevirtual unscheduleSelf : (Ljava/lang/Runnable;)V
    //   241: aload_0
    //   242: iconst_1
    //   243: invokevirtual a : (Z)V
    //   246: aload_0
    //   247: invokevirtual invalidateSelf : ()V
    //   250: iconst_1
    //   251: ireturn
  }
  
  public int getAlpha() {
    return this.f;
  }
  
  public int getChangingConfigurations() {
    return super.getChangingConfigurations() | this.b.getChangingConfigurations();
  }
  
  public final Drawable.ConstantState getConstantState() {
    if (this.b.c()) {
      this.b.d = getChangingConfigurations();
      return this.b;
    } 
    return null;
  }
  
  public Drawable getCurrent() {
    return this.d;
  }
  
  public void getHotspotBounds(Rect paramRect) {
    Rect rect = this.c;
    if (rect != null) {
      paramRect.set(rect);
    } else {
      super.getHotspotBounds(paramRect);
    } 
  }
  
  public int getIntrinsicHeight() {
    byte b1;
    if (this.b.q())
      return this.b.i(); 
    Drawable drawable = this.d;
    if (drawable != null) {
      b1 = drawable.getIntrinsicHeight();
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public int getIntrinsicWidth() {
    byte b1;
    if (this.b.q())
      return this.b.m(); 
    Drawable drawable = this.d;
    if (drawable != null) {
      b1 = drawable.getIntrinsicWidth();
    } else {
      b1 = -1;
    } 
    return b1;
  }
  
  public int getMinimumHeight() {
    boolean bool;
    if (this.b.q())
      return this.b.j(); 
    Drawable drawable = this.d;
    if (drawable != null) {
      bool = drawable.getMinimumHeight();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getMinimumWidth() {
    boolean bool;
    if (this.b.q())
      return this.b.k(); 
    Drawable drawable = this.d;
    if (drawable != null) {
      bool = drawable.getMinimumWidth();
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int getOpacity() {
    Drawable drawable = this.d;
    return (drawable == null || !drawable.isVisible()) ? -2 : this.b.n();
  }
  
  public void getOutline(Outline paramOutline) {
    Drawable drawable = this.d;
    if (drawable != null)
      b.b(drawable, paramOutline); 
  }
  
  public boolean getPadding(Rect paramRect) {
    boolean bool;
    Rect rect = this.b.l();
    if (rect != null) {
      paramRect.set(rect);
      int i = rect.left;
      int j = rect.top;
      int k = rect.bottom;
      if ((rect.right | i | j | k) != 0) {
        bool = true;
      } else {
        bool = false;
      } 
    } else {
      Drawable drawable = this.d;
      if (drawable != null) {
        bool = drawable.getPadding(paramRect);
      } else {
        bool = super.getPadding(paramRect);
      } 
    } 
    if (e()) {
      int i = paramRect.left;
      paramRect.left = paramRect.right;
      paramRect.right = i;
    } 
    return bool;
  }
  
  void h(d paramd) {
    this.b = paramd;
    int i = this.h;
    if (i >= 0) {
      Drawable drawable = paramd.g(i);
      this.d = drawable;
      if (drawable != null)
        d(drawable); 
    } 
    this.e = null;
  }
  
  final void i(Resources paramResources) {
    this.b.y(paramResources);
  }
  
  public void invalidateDrawable(Drawable paramDrawable) {
    d d1 = this.b;
    if (d1 != null)
      d1.p(); 
    if (paramDrawable == this.d && getCallback() != null)
      getCallback().invalidateDrawable(this); 
  }
  
  public boolean isAutoMirrored() {
    return this.b.C;
  }
  
  public void jumpToCurrentState() {
    boolean bool2;
    Drawable drawable = this.e;
    boolean bool1 = true;
    if (drawable != null) {
      drawable.jumpToCurrentState();
      this.e = null;
      bool2 = true;
    } else {
      bool2 = false;
    } 
    drawable = this.d;
    if (drawable != null) {
      drawable.jumpToCurrentState();
      if (this.g)
        this.d.setAlpha(this.f); 
    } 
    if (this.l != 0L) {
      this.l = 0L;
      bool2 = true;
    } 
    if (this.k != 0L) {
      this.k = 0L;
      bool2 = bool1;
    } 
    if (bool2)
      invalidateSelf(); 
  }
  
  public Drawable mutate() {
    if (!this.i && super.mutate() == this) {
      d d1 = b();
      d1.r();
      h(d1);
      this.i = true;
    } 
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect) {
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.setBounds(paramRect); 
    drawable = this.d;
    if (drawable != null)
      drawable.setBounds(paramRect); 
  }
  
  public boolean onLayoutDirectionChanged(int paramInt) {
    return this.b.w(paramInt, c());
  }
  
  protected boolean onLevelChange(int paramInt) {
    Drawable drawable = this.e;
    if (drawable != null)
      return drawable.setLevel(paramInt); 
    drawable = this.d;
    return (drawable != null) ? drawable.setLevel(paramInt) : false;
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    Drawable drawable = this.e;
    if (drawable != null)
      return drawable.setState(paramArrayOfint); 
    drawable = this.d;
    return (drawable != null) ? drawable.setState(paramArrayOfint) : false;
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    if (paramDrawable == this.d && getCallback() != null)
      getCallback().scheduleDrawable(this, paramRunnable, paramLong); 
  }
  
  public void setAlpha(int paramInt) {
    if (!this.g || this.f != paramInt) {
      this.g = true;
      this.f = paramInt;
      Drawable drawable = this.d;
      if (drawable != null)
        if (this.k == 0L) {
          drawable.setAlpha(paramInt);
        } else {
          a(false);
        }  
    } 
  }
  
  public void setAutoMirrored(boolean paramBoolean) {
    d d1 = this.b;
    if (d1.C != paramBoolean) {
      d1.C = paramBoolean;
      Drawable drawable = this.d;
      if (drawable != null)
        androidx.core.graphics.drawable.a.j(drawable, paramBoolean); 
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    d d1 = this.b;
    d1.E = true;
    if (d1.D != paramColorFilter) {
      d1.D = paramColorFilter;
      Drawable drawable = this.d;
      if (drawable != null)
        drawable.setColorFilter(paramColorFilter); 
    } 
  }
  
  public void setDither(boolean paramBoolean) {
    d d1 = this.b;
    if (d1.x != paramBoolean) {
      d1.x = paramBoolean;
      Drawable drawable = this.d;
      if (drawable != null)
        drawable.setDither(paramBoolean); 
    } 
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2) {
    Drawable drawable = this.d;
    if (drawable != null)
      androidx.core.graphics.drawable.a.k(drawable, paramFloat1, paramFloat2); 
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Rect rect = this.c;
    if (rect == null) {
      this.c = new Rect(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      rect.set(paramInt1, paramInt2, paramInt3, paramInt4);
    } 
    Drawable drawable = this.d;
    if (drawable != null)
      androidx.core.graphics.drawable.a.l(drawable, paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    d d1 = this.b;
    d1.H = true;
    if (d1.F != paramColorStateList) {
      d1.F = paramColorStateList;
      androidx.core.graphics.drawable.a.o(this.d, paramColorStateList);
    } 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    d d1 = this.b;
    d1.I = true;
    if (d1.G != paramMode) {
      d1.G = paramMode;
      androidx.core.graphics.drawable.a.p(this.d, paramMode);
    } 
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable drawable = this.e;
    if (drawable != null)
      drawable.setVisible(paramBoolean1, paramBoolean2); 
    drawable = this.d;
    if (drawable != null)
      drawable.setVisible(paramBoolean1, paramBoolean2); 
    return bool;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    if (paramDrawable == this.d && getCallback() != null)
      getCallback().unscheduleDrawable(this, paramRunnable); 
  }
  
  class a implements Runnable {
    a(b this$0) {}
    
    public void run() {
      this.b.a(true);
      this.b.invalidateSelf();
    }
  }
  
  private static class b {
    public static boolean a(Drawable.ConstantState param1ConstantState) {
      return param1ConstantState.canApplyTheme();
    }
    
    public static void b(Drawable param1Drawable, Outline param1Outline) {
      param1Drawable.getOutline(param1Outline);
    }
    
    public static Resources c(Resources.Theme param1Theme) {
      return param1Theme.getResources();
    }
  }
  
  static class c implements Drawable.Callback {
    private Drawable.Callback b;
    
    public Drawable.Callback a() {
      Drawable.Callback callback = this.b;
      this.b = null;
      return callback;
    }
    
    public c b(Drawable.Callback param1Callback) {
      this.b = param1Callback;
      return this;
    }
    
    public void invalidateDrawable(Drawable param1Drawable) {}
    
    public void scheduleDrawable(Drawable param1Drawable, Runnable param1Runnable, long param1Long) {
      Drawable.Callback callback = this.b;
      if (callback != null)
        callback.scheduleDrawable(param1Drawable, param1Runnable, param1Long); 
    }
    
    public void unscheduleDrawable(Drawable param1Drawable, Runnable param1Runnable) {
      Drawable.Callback callback = this.b;
      if (callback != null)
        callback.unscheduleDrawable(param1Drawable, param1Runnable); 
    }
  }
  
  static abstract class d extends Drawable.ConstantState {
    int A;
    
    int B;
    
    boolean C;
    
    ColorFilter D;
    
    boolean E;
    
    ColorStateList F;
    
    PorterDuff.Mode G;
    
    boolean H;
    
    boolean I;
    
    final b a;
    
    Resources b;
    
    int c;
    
    int d;
    
    int e;
    
    SparseArray<Drawable.ConstantState> f;
    
    Drawable[] g;
    
    int h;
    
    boolean i;
    
    boolean j;
    
    Rect k;
    
    boolean l;
    
    boolean m;
    
    int n;
    
    int o;
    
    int p;
    
    int q;
    
    boolean r;
    
    int s;
    
    boolean t;
    
    boolean u;
    
    boolean v;
    
    boolean w;
    
    boolean x;
    
    boolean y;
    
    int z;
    
    d(d param1d, b param1b, Resources param1Resources) {
      boolean bool = false;
      this.i = false;
      this.l = false;
      this.x = true;
      this.A = 0;
      this.B = 0;
      this.a = param1b;
      b b1 = null;
      if (param1Resources != null) {
        Resources resources = param1Resources;
      } else if (param1d != null) {
        Resources resources = param1d.b;
      } else {
        param1b = null;
      } 
      this.b = (Resources)param1b;
      if (param1d != null) {
        i = param1d.c;
      } else {
        i = 0;
      } 
      int i = b.f(param1Resources, i);
      this.c = i;
      if (param1d != null) {
        this.d = param1d.d;
        this.e = param1d.e;
        this.v = true;
        this.w = true;
        this.i = param1d.i;
        this.l = param1d.l;
        this.x = param1d.x;
        this.y = param1d.y;
        this.z = param1d.z;
        this.A = param1d.A;
        this.B = param1d.B;
        this.C = param1d.C;
        this.D = param1d.D;
        this.E = param1d.E;
        this.F = param1d.F;
        this.G = param1d.G;
        this.H = param1d.H;
        this.I = param1d.I;
        if (param1d.c == i) {
          if (param1d.j) {
            Rect rect;
            param1b = b1;
            if (param1d.k != null)
              rect = new Rect(param1d.k); 
            this.k = rect;
            this.j = true;
          } 
          if (param1d.m) {
            this.n = param1d.n;
            this.o = param1d.o;
            this.p = param1d.p;
            this.q = param1d.q;
            this.m = true;
          } 
        } 
        if (param1d.r) {
          this.s = param1d.s;
          this.r = true;
        } 
        if (param1d.t) {
          this.u = param1d.u;
          this.t = true;
        } 
        Drawable[] arrayOfDrawable = param1d.g;
        this.g = new Drawable[arrayOfDrawable.length];
        this.h = param1d.h;
        SparseArray<Drawable.ConstantState> sparseArray = param1d.f;
        if (sparseArray != null) {
          this.f = sparseArray.clone();
        } else {
          this.f = new SparseArray(this.h);
        } 
        int j = this.h;
        for (i = bool; i < j; i++) {
          if (arrayOfDrawable[i] != null) {
            Drawable.ConstantState constantState = arrayOfDrawable[i].getConstantState();
            if (constantState != null) {
              this.f.put(i, constantState);
            } else {
              this.g[i] = arrayOfDrawable[i];
            } 
          } 
        } 
      } else {
        this.g = new Drawable[10];
        this.h = 0;
      } 
    }
    
    private void e() {
      SparseArray<Drawable.ConstantState> sparseArray = this.f;
      if (sparseArray != null) {
        int i = sparseArray.size();
        for (byte b1 = 0; b1 < i; b1++) {
          int j = this.f.keyAt(b1);
          Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.valueAt(b1);
          this.g[j] = s(constantState.newDrawable(this.b));
        } 
        this.f = null;
      } 
    }
    
    private Drawable s(Drawable param1Drawable) {
      if (Build.VERSION.SDK_INT >= 23)
        androidx.core.graphics.drawable.a.m(param1Drawable, this.z); 
      param1Drawable = param1Drawable.mutate();
      param1Drawable.setCallback(this.a);
      return param1Drawable;
    }
    
    public final int a(Drawable param1Drawable) {
      int i = this.h;
      if (i >= this.g.length)
        o(i, i + 10); 
      param1Drawable.mutate();
      param1Drawable.setVisible(false, true);
      param1Drawable.setCallback(this.a);
      this.g[i] = param1Drawable;
      this.h++;
      int j = this.e;
      this.e = param1Drawable.getChangingConfigurations() | j;
      p();
      this.k = null;
      this.j = false;
      this.m = false;
      this.v = false;
      return i;
    }
    
    final void b(Resources.Theme param1Theme) {
      if (param1Theme != null) {
        e();
        int i = this.h;
        Drawable[] arrayOfDrawable = this.g;
        for (byte b1 = 0; b1 < i; b1++) {
          if (arrayOfDrawable[b1] != null && androidx.core.graphics.drawable.a.b(arrayOfDrawable[b1])) {
            androidx.core.graphics.drawable.a.a(arrayOfDrawable[b1], param1Theme);
            this.e |= arrayOfDrawable[b1].getChangingConfigurations();
          } 
        } 
        y(b.b.c(param1Theme));
      } 
    }
    
    public boolean c() {
      if (this.v)
        return this.w; 
      e();
      this.v = true;
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      for (byte b1 = 0; b1 < i; b1++) {
        if (arrayOfDrawable[b1].getConstantState() == null) {
          this.w = false;
          return false;
        } 
      } 
      this.w = true;
      return true;
    }
    
    public boolean canApplyTheme() {
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      for (byte b1 = 0; b1 < i; b1++) {
        Drawable drawable = arrayOfDrawable[b1];
        if (drawable != null) {
          if (androidx.core.graphics.drawable.a.b(drawable))
            return true; 
        } else {
          Drawable.ConstantState constantState = (Drawable.ConstantState)this.f.get(b1);
          if (constantState != null && b.b.a(constantState))
            return true; 
        } 
      } 
      return false;
    }
    
    protected void d() {
      this.m = true;
      e();
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      this.o = -1;
      this.n = -1;
      byte b1 = 0;
      this.q = 0;
      this.p = 0;
      while (b1 < i) {
        Drawable drawable = arrayOfDrawable[b1];
        int j = drawable.getIntrinsicWidth();
        if (j > this.n)
          this.n = j; 
        j = drawable.getIntrinsicHeight();
        if (j > this.o)
          this.o = j; 
        j = drawable.getMinimumWidth();
        if (j > this.p)
          this.p = j; 
        j = drawable.getMinimumHeight();
        if (j > this.q)
          this.q = j; 
        b1++;
      } 
    }
    
    final int f() {
      return this.g.length;
    }
    
    public final Drawable g(int param1Int) {
      Drawable drawable = this.g[param1Int];
      if (drawable != null)
        return drawable; 
      SparseArray<Drawable.ConstantState> sparseArray = this.f;
      if (sparseArray != null) {
        int i = sparseArray.indexOfKey(param1Int);
        if (i >= 0) {
          Drawable drawable1 = s(((Drawable.ConstantState)this.f.valueAt(i)).newDrawable(this.b));
          this.g[param1Int] = drawable1;
          this.f.removeAt(i);
          if (this.f.size() == 0)
            this.f = null; 
          return drawable1;
        } 
      } 
      return null;
    }
    
    public int getChangingConfigurations() {
      return this.d | this.e;
    }
    
    public final int h() {
      return this.h;
    }
    
    public final int i() {
      if (!this.m)
        d(); 
      return this.o;
    }
    
    public final int j() {
      if (!this.m)
        d(); 
      return this.q;
    }
    
    public final int k() {
      if (!this.m)
        d(); 
      return this.p;
    }
    
    public final Rect l() {
      boolean bool = this.i;
      Rect rect1 = null;
      if (bool)
        return null; 
      Rect rect2 = this.k;
      if (rect2 != null || this.j)
        return rect2; 
      e();
      Rect rect3 = new Rect();
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      byte b1 = 0;
      while (b1 < i) {
        Rect rect = rect1;
        if (arrayOfDrawable[b1].getPadding(rect3)) {
          rect2 = rect1;
          if (rect1 == null)
            rect2 = new Rect(0, 0, 0, 0); 
          int j = rect3.left;
          if (j > rect2.left)
            rect2.left = j; 
          j = rect3.top;
          if (j > rect2.top)
            rect2.top = j; 
          j = rect3.right;
          if (j > rect2.right)
            rect2.right = j; 
          j = rect3.bottom;
          rect = rect2;
          if (j > rect2.bottom) {
            rect2.bottom = j;
            rect = rect2;
          } 
        } 
        b1++;
        rect1 = rect;
      } 
      this.j = true;
      this.k = rect1;
      return rect1;
    }
    
    public final int m() {
      if (!this.m)
        d(); 
      return this.n;
    }
    
    public final int n() {
      int j;
      if (this.r)
        return this.s; 
      e();
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      if (i > 0) {
        j = arrayOfDrawable[0].getOpacity();
      } else {
        j = -2;
      } 
      for (byte b1 = 1; b1 < i; b1++)
        j = Drawable.resolveOpacity(j, arrayOfDrawable[b1].getOpacity()); 
      this.s = j;
      this.r = true;
      return j;
    }
    
    public void o(int param1Int1, int param1Int2) {
      Drawable[] arrayOfDrawable1 = new Drawable[param1Int2];
      Drawable[] arrayOfDrawable2 = this.g;
      if (arrayOfDrawable2 != null)
        System.arraycopy(arrayOfDrawable2, 0, arrayOfDrawable1, 0, param1Int1); 
      this.g = arrayOfDrawable1;
    }
    
    void p() {
      this.r = false;
      this.t = false;
    }
    
    public final boolean q() {
      return this.l;
    }
    
    abstract void r();
    
    public final void t(boolean param1Boolean) {
      this.l = param1Boolean;
    }
    
    public final void u(int param1Int) {
      this.A = param1Int;
    }
    
    public final void v(int param1Int) {
      this.B = param1Int;
    }
    
    final boolean w(int param1Int1, int param1Int2) {
      int i = this.h;
      Drawable[] arrayOfDrawable = this.g;
      byte b1 = 0;
      boolean bool;
      for (bool = false; b1 < i; bool = bool1) {
        boolean bool1 = bool;
        if (arrayOfDrawable[b1] != null) {
          boolean bool2;
          if (Build.VERSION.SDK_INT >= 23) {
            bool2 = androidx.core.graphics.drawable.a.m(arrayOfDrawable[b1], param1Int1);
          } else {
            bool2 = false;
          } 
          bool1 = bool;
          if (b1 == param1Int2)
            bool1 = bool2; 
        } 
        b1++;
      } 
      this.z = param1Int1;
      return bool;
    }
    
    public final void x(boolean param1Boolean) {
      this.i = param1Boolean;
    }
    
    final void y(Resources param1Resources) {
      if (param1Resources != null) {
        this.b = param1Resources;
        int i = b.f(param1Resources, this.c);
        int j = this.c;
        this.c = i;
        if (j != i) {
          this.m = false;
          this.j = false;
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/l/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */