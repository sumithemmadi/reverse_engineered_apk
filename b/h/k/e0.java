package b.h.k;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class e0 {
  public static final e0 a;
  
  private final l b;
  
  static {
    if (Build.VERSION.SDK_INT >= 30) {
      a = k.r;
    } else {
      a = l.a;
    } 
  }
  
  private e0(WindowInsets paramWindowInsets) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      this.b = new k(this, paramWindowInsets);
    } else if (i >= 29) {
      this.b = new j(this, paramWindowInsets);
    } else if (i >= 28) {
      this.b = new i(this, paramWindowInsets);
    } else if (i >= 21) {
      this.b = new h(this, paramWindowInsets);
    } else if (i >= 20) {
      this.b = new g(this, paramWindowInsets);
    } else {
      this.b = new l(this);
    } 
  }
  
  public e0(e0 parame0) {
    if (parame0 != null) {
      l l1 = parame0.b;
      int i = Build.VERSION.SDK_INT;
      if (i >= 30 && l1 instanceof k) {
        this.b = new k(this, (k)l1);
      } else if (i >= 29 && l1 instanceof j) {
        this.b = new j(this, (j)l1);
      } else if (i >= 28 && l1 instanceof i) {
        this.b = new i(this, (i)l1);
      } else if (i >= 21 && l1 instanceof h) {
        this.b = new h(this, (h)l1);
      } else if (i >= 20 && l1 instanceof g) {
        this.b = new g(this, (g)l1);
      } else {
        this.b = new l(this);
      } 
      l1.e(this);
    } else {
      this.b = new l(this);
    } 
  }
  
  static b.h.e.b l(b.h.e.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = Math.max(0, paramb.b - paramInt1);
    int j = Math.max(0, paramb.c - paramInt2);
    int k = Math.max(0, paramb.d - paramInt3);
    int m = Math.max(0, paramb.e - paramInt4);
    return (i == paramInt1 && j == paramInt2 && k == paramInt3 && m == paramInt4) ? paramb : b.h.e.b.b(i, j, k, m);
  }
  
  public static e0 t(WindowInsets paramWindowInsets) {
    return u(paramWindowInsets, null);
  }
  
  public static e0 u(WindowInsets paramWindowInsets, View paramView) {
    e0 e01 = new e0((WindowInsets)b.h.j.i.e(paramWindowInsets));
    if (paramView != null && paramView.isAttachedToWindow()) {
      e01.q(w.K(paramView));
      e01.d(paramView.getRootView());
    } 
    return e01;
  }
  
  @Deprecated
  public e0 a() {
    return this.b.a();
  }
  
  @Deprecated
  public e0 b() {
    return this.b.b();
  }
  
  @Deprecated
  public e0 c() {
    return this.b.c();
  }
  
  void d(View paramView) {
    this.b.d(paramView);
  }
  
  @Deprecated
  public b.h.e.b e() {
    return this.b.g();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof e0))
      return false; 
    paramObject = paramObject;
    return b.h.j.d.a(this.b, ((e0)paramObject).b);
  }
  
  @Deprecated
  public int f() {
    return (this.b.i()).e;
  }
  
  @Deprecated
  public int g() {
    return (this.b.i()).b;
  }
  
  @Deprecated
  public int h() {
    return (this.b.i()).d;
  }
  
  public int hashCode() {
    int i;
    l l1 = this.b;
    if (l1 == null) {
      i = 0;
    } else {
      i = l1.hashCode();
    } 
    return i;
  }
  
  @Deprecated
  public int i() {
    return (this.b.i()).c;
  }
  
  @Deprecated
  public boolean j() {
    return this.b.i().equals(b.h.e.b.a) ^ true;
  }
  
  public e0 k(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return this.b.j(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean m() {
    return this.b.k();
  }
  
  @Deprecated
  public e0 n(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (new b(this)).c(b.h.e.b.b(paramInt1, paramInt2, paramInt3, paramInt4)).a();
  }
  
  void o(b.h.e.b[] paramArrayOfb) {
    this.b.m(paramArrayOfb);
  }
  
  void p(b.h.e.b paramb) {
    this.b.n(paramb);
  }
  
  void q(e0 parame0) {
    this.b.o(parame0);
  }
  
  void r(b.h.e.b paramb) {
    this.b.p(paramb);
  }
  
  public WindowInsets s() {
    l l1 = this.b;
    if (l1 instanceof g) {
      WindowInsets windowInsets = ((g)l1).i;
    } else {
      l1 = null;
    } 
    return (WindowInsets)l1;
  }
  
  static class a {
    private static Field a;
    
    private static Field b;
    
    private static Field c;
    
    private static boolean d;
    
    static {
      try {
        Field field = View.class.getDeclaredField("mAttachInfo");
        a = field;
        field.setAccessible(true);
        Class<?> clazz = Class.forName("android.view.View$AttachInfo");
        field = clazz.getDeclaredField("mStableInsets");
        b = field;
        field.setAccessible(true);
        field = clazz.getDeclaredField("mContentInsets");
        c = field;
        field.setAccessible(true);
        d = true;
      } catch (ReflectiveOperationException reflectiveOperationException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to get visible insets from AttachInfo ");
        stringBuilder.append(reflectiveOperationException.getMessage());
        Log.w("WindowInsetsCompat", stringBuilder.toString(), reflectiveOperationException);
      } 
    }
    
    public static e0 a(View param1View) {
      if (d && param1View.isAttachedToWindow()) {
        View view = param1View.getRootView();
        try {
          Object object = a.get(view);
          if (object != null) {
            Rect rect = (Rect)b.get(object);
            object = c.get(object);
            if (rect != null && object != null) {
              e0.b b = new e0.b();
              this();
              e0 e0 = b.b(b.h.e.b.c(rect)).c(b.h.e.b.c((Rect)object)).a();
              e0.q(e0);
              e0.d(param1View.getRootView());
              return e0;
            } 
          } 
        } catch (IllegalAccessException illegalAccessException) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Failed to get insets from AttachInfo. ");
          stringBuilder.append(illegalAccessException.getMessage());
          Log.w("WindowInsetsCompat", stringBuilder.toString(), illegalAccessException);
        } 
      } 
      return null;
    }
  }
  
  public static final class b {
    private final e0.f a;
    
    public b() {
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        this.a = new e0.e();
      } else if (i >= 29) {
        this.a = new e0.d();
      } else if (i >= 20) {
        this.a = new e0.c();
      } else {
        this.a = new e0.f();
      } 
    }
    
    public b(e0 param1e0) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 30) {
        this.a = new e0.e(param1e0);
      } else if (i >= 29) {
        this.a = new e0.d(param1e0);
      } else if (i >= 20) {
        this.a = new e0.c(param1e0);
      } else {
        this.a = new e0.f(param1e0);
      } 
    }
    
    public e0 a() {
      return this.a.b();
    }
    
    @Deprecated
    public b b(b.h.e.b param1b) {
      this.a.d(param1b);
      return this;
    }
    
    @Deprecated
    public b c(b.h.e.b param1b) {
      this.a.f(param1b);
      return this;
    }
  }
  
  private static class c extends f {
    private static Field c;
    
    private static boolean d = false;
    
    private static Constructor<WindowInsets> e;
    
    private static boolean f = false;
    
    private WindowInsets g = h();
    
    private b.h.e.b h;
    
    c() {}
    
    c(e0 param1e0) {}
    
    private static WindowInsets h() {
      if (!d) {
        try {
          c = WindowInsets.class.getDeclaredField("CONSUMED");
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException);
        } 
        d = true;
      } 
      Field field = c;
      if (field != null)
        try {
          WindowInsets windowInsets = (WindowInsets)field.get(null);
          if (windowInsets != null)
            return new WindowInsets(windowInsets); 
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException);
        }  
      if (!f) {
        try {
          e = WindowInsets.class.getConstructor(new Class[] { Rect.class });
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException);
        } 
        f = true;
      } 
      Constructor<WindowInsets> constructor = e;
      if (constructor != null)
        try {
          Rect rect = new Rect();
          this();
          return constructor.newInstance(new Object[] { rect });
        } catch (ReflectiveOperationException reflectiveOperationException) {
          Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException);
        }  
      return null;
    }
    
    e0 b() {
      a();
      e0 e0 = e0.t(this.g);
      e0.o(this.b);
      e0.r(this.h);
      return e0;
    }
    
    void d(b.h.e.b param1b) {
      this.h = param1b;
    }
    
    void f(b.h.e.b param1b) {
      WindowInsets windowInsets = this.g;
      if (windowInsets != null)
        this.g = windowInsets.replaceSystemWindowInsets(param1b.b, param1b.c, param1b.d, param1b.e); 
    }
  }
  
  private static class d extends f {
    final WindowInsets.Builder c;
    
    d() {
      this.c = new WindowInsets.Builder();
    }
    
    d(e0 param1e0) {
      WindowInsets.Builder builder;
      WindowInsets windowInsets = param1e0.s();
      if (windowInsets != null) {
        builder = new WindowInsets.Builder(windowInsets);
      } else {
        builder = new WindowInsets.Builder();
      } 
      this.c = builder;
    }
    
    e0 b() {
      a();
      e0 e0 = e0.t(this.c.build());
      e0.o(this.b);
      return e0;
    }
    
    void c(b.h.e.b param1b) {
      this.c.setMandatorySystemGestureInsets(param1b.e());
    }
    
    void d(b.h.e.b param1b) {
      this.c.setStableInsets(param1b.e());
    }
    
    void e(b.h.e.b param1b) {
      this.c.setSystemGestureInsets(param1b.e());
    }
    
    void f(b.h.e.b param1b) {
      this.c.setSystemWindowInsets(param1b.e());
    }
    
    void g(b.h.e.b param1b) {
      this.c.setTappableElementInsets(param1b.e());
    }
  }
  
  private static class e extends d {
    e() {}
    
    e(e0 param1e0) {
      super(param1e0);
    }
  }
  
  private static class f {
    private final e0 a;
    
    b.h.e.b[] b;
    
    f() {
      this(new e0(null));
    }
    
    f(e0 param1e0) {
      this.a = param1e0;
    }
    
    protected final void a() {
      b.h.e.b[] arrayOfB = this.b;
      if (arrayOfB != null) {
        b.h.e.b b1 = arrayOfB[e0.m.a(1)];
        b.h.e.b b2 = this.b[e0.m.a(2)];
        if (b1 != null && b2 != null) {
          f(b.h.e.b.a(b1, b2));
        } else if (b1 != null) {
          f(b1);
        } else if (b2 != null) {
          f(b2);
        } 
        b1 = this.b[e0.m.a(16)];
        if (b1 != null)
          e(b1); 
        b1 = this.b[e0.m.a(32)];
        if (b1 != null)
          c(b1); 
        b1 = this.b[e0.m.a(64)];
        if (b1 != null)
          g(b1); 
      } 
    }
    
    e0 b() {
      a();
      return this.a;
    }
    
    void c(b.h.e.b param1b) {}
    
    void d(b.h.e.b param1b) {}
    
    void e(b.h.e.b param1b) {}
    
    void f(b.h.e.b param1b) {}
    
    void g(b.h.e.b param1b) {}
  }
  
  private static class g extends l {
    private static boolean c = false;
    
    private static Method d;
    
    private static Class<?> e;
    
    private static Class<?> f;
    
    private static Field g;
    
    private static Field h;
    
    final WindowInsets i;
    
    private b.h.e.b[] j;
    
    private b.h.e.b k = null;
    
    private e0 l;
    
    b.h.e.b m;
    
    g(e0 param1e0, WindowInsets param1WindowInsets) {
      super(param1e0);
      this.i = param1WindowInsets;
    }
    
    g(e0 param1e0, g param1g) {
      this(param1e0, new WindowInsets(param1g.i));
    }
    
    private b.h.e.b q(View param1View) {
      if (Build.VERSION.SDK_INT < 30) {
        if (!c)
          r(); 
        Method method = d;
        Object object = null;
        if (method != null && f != null && g != null)
          try {
            Object object1 = method.invoke(param1View, new Object[0]);
            if (object1 == null) {
              object1 = new NullPointerException();
              super();
              Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", (Throwable)object1);
              return null;
            } 
            object1 = h.get(object1);
            Rect rect = (Rect)g.get(object1);
            object1 = object;
            if (rect != null)
              object1 = b.h.e.b.c(rect); 
            return (b.h.e.b)object1;
          } catch (ReflectiveOperationException reflectiveOperationException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to get visible insets. (Reflection error). ");
            stringBuilder.append(reflectiveOperationException.getMessage());
            Log.e("WindowInsetsCompat", stringBuilder.toString(), reflectiveOperationException);
          }  
        return null;
      } 
      throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    
    @SuppressLint({"PrivateApi"})
    private static void r() {
      try {
        d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
        e = Class.forName("android.view.ViewRootImpl");
        Class<?> clazz = Class.forName("android.view.View$AttachInfo");
        f = clazz;
        g = clazz.getDeclaredField("mVisibleInsets");
        h = e.getDeclaredField("mAttachInfo");
        g.setAccessible(true);
        h.setAccessible(true);
      } catch (ReflectiveOperationException reflectiveOperationException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to get visible insets. (Reflection error). ");
        stringBuilder.append(reflectiveOperationException.getMessage());
        Log.e("WindowInsetsCompat", stringBuilder.toString(), reflectiveOperationException);
      } 
      c = true;
    }
    
    void d(View param1View) {
      b.h.e.b b2 = q(param1View);
      b.h.e.b b1 = b2;
      if (b2 == null)
        b1 = b.h.e.b.a; 
      n(b1);
    }
    
    void e(e0 param1e0) {
      param1e0.q(this.l);
      param1e0.p(this.m);
    }
    
    public boolean equals(Object param1Object) {
      if (!super.equals(param1Object))
        return false; 
      param1Object = param1Object;
      return b.h.j.c.a(this.m, ((g)param1Object).m);
    }
    
    final b.h.e.b i() {
      if (this.k == null)
        this.k = b.h.e.b.b(this.i.getSystemWindowInsetLeft(), this.i.getSystemWindowInsetTop(), this.i.getSystemWindowInsetRight(), this.i.getSystemWindowInsetBottom()); 
      return this.k;
    }
    
    e0 j(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      e0.b b1 = new e0.b(e0.t(this.i));
      b1.c(e0.l(i(), param1Int1, param1Int2, param1Int3, param1Int4));
      b1.b(e0.l(h(), param1Int1, param1Int2, param1Int3, param1Int4));
      return b1.a();
    }
    
    boolean l() {
      return this.i.isRound();
    }
    
    public void m(b.h.e.b[] param1ArrayOfb) {
      this.j = param1ArrayOfb;
    }
    
    void n(b.h.e.b param1b) {
      this.m = param1b;
    }
    
    void o(e0 param1e0) {
      this.l = param1e0;
    }
  }
  
  private static class h extends g {
    private b.h.e.b n = null;
    
    h(e0 param1e0, WindowInsets param1WindowInsets) {
      super(param1e0, param1WindowInsets);
    }
    
    h(e0 param1e0, h param1h) {
      super(param1e0, param1h);
      this.n = param1h.n;
    }
    
    e0 b() {
      return e0.t(this.i.consumeStableInsets());
    }
    
    e0 c() {
      return e0.t(this.i.consumeSystemWindowInsets());
    }
    
    final b.h.e.b h() {
      if (this.n == null)
        this.n = b.h.e.b.b(this.i.getStableInsetLeft(), this.i.getStableInsetTop(), this.i.getStableInsetRight(), this.i.getStableInsetBottom()); 
      return this.n;
    }
    
    boolean k() {
      return this.i.isConsumed();
    }
    
    public void p(b.h.e.b param1b) {
      this.n = param1b;
    }
  }
  
  private static class i extends h {
    i(e0 param1e0, WindowInsets param1WindowInsets) {
      super(param1e0, param1WindowInsets);
    }
    
    i(e0 param1e0, i param1i) {
      super(param1e0, param1i);
    }
    
    e0 a() {
      return e0.t(this.i.consumeDisplayCutout());
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof i))
        return false; 
      param1Object = param1Object;
      if (!b.h.j.c.a(this.i, ((e0.g)param1Object).i) || !b.h.j.c.a(this.m, ((e0.g)param1Object).m))
        bool = false; 
      return bool;
    }
    
    d f() {
      return d.a(this.i.getDisplayCutout());
    }
    
    public int hashCode() {
      return this.i.hashCode();
    }
  }
  
  private static class j extends i {
    private b.h.e.b o = null;
    
    private b.h.e.b p = null;
    
    private b.h.e.b q = null;
    
    j(e0 param1e0, WindowInsets param1WindowInsets) {
      super(param1e0, param1WindowInsets);
    }
    
    j(e0 param1e0, j param1j) {
      super(param1e0, param1j);
    }
    
    b.h.e.b g() {
      if (this.p == null)
        this.p = b.h.e.b.d(this.i.getMandatorySystemGestureInsets()); 
      return this.p;
    }
    
    e0 j(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return e0.t(this.i.inset(param1Int1, param1Int2, param1Int3, param1Int4));
    }
    
    public void p(b.h.e.b param1b) {}
  }
  
  private static class k extends j {
    static final e0 r = e0.t(WindowInsets.CONSUMED);
    
    k(e0 param1e0, WindowInsets param1WindowInsets) {
      super(param1e0, param1WindowInsets);
    }
    
    k(e0 param1e0, k param1k) {
      super(param1e0, param1k);
    }
    
    final void d(View param1View) {}
  }
  
  private static class l {
    static final e0 a = (new e0.b()).a().a().b().c();
    
    final e0 b;
    
    l(e0 param1e0) {
      this.b = param1e0;
    }
    
    e0 a() {
      return this.b;
    }
    
    e0 b() {
      return this.b;
    }
    
    e0 c() {
      return this.b;
    }
    
    void d(View param1View) {}
    
    void e(e0 param1e0) {}
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (!(param1Object instanceof l))
        return false; 
      param1Object = param1Object;
      if (l() != param1Object.l() || k() != param1Object.k() || !b.h.j.d.a(i(), param1Object.i()) || !b.h.j.d.a(h(), param1Object.h()) || !b.h.j.d.a(f(), param1Object.f()))
        bool = false; 
      return bool;
    }
    
    d f() {
      return null;
    }
    
    b.h.e.b g() {
      return i();
    }
    
    b.h.e.b h() {
      return b.h.e.b.a;
    }
    
    public int hashCode() {
      return b.h.j.d.b(new Object[] { Boolean.valueOf(l()), Boolean.valueOf(k()), i(), h(), f() });
    }
    
    b.h.e.b i() {
      return b.h.e.b.a;
    }
    
    e0 j(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return a;
    }
    
    boolean k() {
      return false;
    }
    
    boolean l() {
      return false;
    }
    
    public void m(b.h.e.b[] param1ArrayOfb) {}
    
    void n(b.h.e.b param1b) {}
    
    void o(e0 param1e0) {}
    
    public void p(b.h.e.b param1b) {}
  }
  
  public static final class m {
    static int a(int param1Int) {
      if (param1Int != 1) {
        if (param1Int != 2) {
          if (param1Int != 4) {
            if (param1Int != 8) {
              if (param1Int != 16) {
                if (param1Int != 32) {
                  if (param1Int != 64) {
                    if (param1Int != 128) {
                      if (param1Int == 256)
                        return 8; 
                      StringBuilder stringBuilder = new StringBuilder();
                      stringBuilder.append("type needs to be >= FIRST and <= LAST, type=");
                      stringBuilder.append(param1Int);
                      throw new IllegalArgumentException(stringBuilder.toString());
                    } 
                    return 7;
                  } 
                  return 6;
                } 
                return 5;
              } 
              return 4;
            } 
            return 3;
          } 
          return 2;
        } 
        return 1;
      } 
      return 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */