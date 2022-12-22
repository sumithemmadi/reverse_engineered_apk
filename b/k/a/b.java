package b.k.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import b.h.k.w;
import java.util.ArrayList;

public abstract class b<T extends b<T>> implements a.b {
  public static final r a = new f("translationX");
  
  public static final r b = new g("translationY");
  
  public static final r c = new h("translationZ");
  
  public static final r d = new i("scaleX");
  
  public static final r e = new j("scaleY");
  
  public static final r f = new k("rotation");
  
  public static final r g = new l("rotationX");
  
  public static final r h = new m("rotationY");
  
  public static final r i = new n("x");
  
  public static final r j = new a("y");
  
  public static final r k = new b("z");
  
  public static final r l = new c("alpha");
  
  public static final r m = new d("scrollX");
  
  public static final r n = new e("scrollY");
  
  float o = 0.0F;
  
  float p = Float.MAX_VALUE;
  
  boolean q = false;
  
  final Object r;
  
  final c s;
  
  boolean t = false;
  
  float u = Float.MAX_VALUE;
  
  float v = -Float.MAX_VALUE;
  
  private long w = 0L;
  
  private float x;
  
  private final ArrayList<p> y = new ArrayList<p>();
  
  private final ArrayList<q> z = new ArrayList<q>();
  
  <K> b(K paramK, c<K> paramc) {
    this.r = paramK;
    this.s = paramc;
    if (paramc == f || paramc == g || paramc == h) {
      this.x = 0.1F;
      return;
    } 
    if (paramc == l) {
      this.x = 0.00390625F;
    } else {
      if (paramc == d || paramc == e) {
        this.x = 0.00390625F;
        return;
      } 
      this.x = 1.0F;
    } 
  }
  
  private void c(boolean paramBoolean) {
    byte b1 = 0;
    this.t = false;
    a.d().g(this);
    this.w = 0L;
    this.q = false;
    while (b1 < this.y.size()) {
      if (this.y.get(b1) != null)
        ((p)this.y.get(b1)).a(this, paramBoolean, this.p, this.o); 
      b1++;
    } 
    g(this.y);
  }
  
  private float d() {
    return this.s.a(this.r);
  }
  
  private static <T> void g(ArrayList<T> paramArrayList) {
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      if (paramArrayList.get(i) == null)
        paramArrayList.remove(i); 
    } 
  }
  
  private void k() {
    if (!this.t) {
      this.t = true;
      if (!this.q)
        this.p = d(); 
      float f = this.p;
      if (f <= this.u && f >= this.v) {
        a.d().a(this, 0L);
      } else {
        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
      } 
    } 
  }
  
  public boolean a(long paramLong) {
    long l = this.w;
    if (l == 0L) {
      this.w = paramLong;
      h(this.p);
      return false;
    } 
    this.w = paramLong;
    boolean bool = l(paramLong - l);
    float f = Math.min(this.p, this.u);
    this.p = f;
    f = Math.max(f, this.v);
    this.p = f;
    h(f);
    if (bool)
      c(false); 
    return bool;
  }
  
  public void b() {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      if (this.t)
        c(true); 
      return;
    } 
    throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
  }
  
  float e() {
    return this.x * 0.75F;
  }
  
  public boolean f() {
    return this.t;
  }
  
  void h(float paramFloat) {
    this.s.b(this.r, paramFloat);
    for (byte b1 = 0; b1 < this.z.size(); b1++) {
      if (this.z.get(b1) != null)
        ((q)this.z.get(b1)).a(this, this.p, this.o); 
    } 
    g(this.z);
  }
  
  public T i(float paramFloat) {
    this.p = paramFloat;
    this.q = true;
    return (T)this;
  }
  
  public void j() {
    if (Looper.myLooper() == Looper.getMainLooper()) {
      if (!this.t)
        k(); 
      return;
    } 
    throw new AndroidRuntimeException("Animations may only be started on the main thread");
  }
  
  abstract boolean l(long paramLong);
  
  static final class a extends r {
    a(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setY(param1Float);
    }
  }
  
  static final class b extends r {
    b(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return w.P(param1View);
    }
    
    public void d(View param1View, float param1Float) {
      w.M0(param1View, param1Float);
    }
  }
  
  static final class c extends r {
    c(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getAlpha();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setAlpha(param1Float);
    }
  }
  
  static final class d extends r {
    d(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScrollX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScrollX((int)param1Float);
    }
  }
  
  static final class e extends r {
    e(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScrollY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScrollY((int)param1Float);
    }
  }
  
  static final class f extends r {
    f(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getTranslationX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setTranslationX(param1Float);
    }
  }
  
  static final class g extends r {
    g(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getTranslationY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setTranslationY(param1Float);
    }
  }
  
  static final class h extends r {
    h(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return w.N(param1View);
    }
    
    public void d(View param1View, float param1Float) {
      w.K0(param1View, param1Float);
    }
  }
  
  static final class i extends r {
    i(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScaleX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScaleX(param1Float);
    }
  }
  
  static final class j extends r {
    j(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getScaleY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setScaleY(param1Float);
    }
  }
  
  static final class k extends r {
    k(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getRotation();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setRotation(param1Float);
    }
  }
  
  static final class l extends r {
    l(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getRotationX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setRotationX(param1Float);
    }
  }
  
  static final class m extends r {
    m(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getRotationY();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setRotationY(param1Float);
    }
  }
  
  static final class n extends r {
    n(String param1String) {
      super(param1String, null);
    }
    
    public float c(View param1View) {
      return param1View.getX();
    }
    
    public void d(View param1View, float param1Float) {
      param1View.setX(param1Float);
    }
  }
  
  static class o {
    float a;
    
    float b;
  }
  
  public static interface p {
    void a(b param1b, boolean param1Boolean, float param1Float1, float param1Float2);
  }
  
  public static interface q {
    void a(b param1b, float param1Float1, float param1Float2);
  }
  
  public static abstract class r extends c<View> {
    private r(String param1String) {
      super(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/k/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */