package com.bumptech.glide.request.h;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.g;
import com.bumptech.glide.p.j;
import com.bumptech.glide.request.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
public abstract class i<T extends View, Z> extends a<Z> {
  private static boolean b;
  
  private static int c = g.glide_custom_view_target_tag;
  
  protected final T d;
  
  private final a e;
  
  private View.OnAttachStateChangeListener f;
  
  private boolean g;
  
  private boolean h;
  
  public i(T paramT) {
    this.d = (T)j.d(paramT);
    this.e = new a((View)paramT);
  }
  
  private Object i() {
    return this.d.getTag(c);
  }
  
  private void j() {
    View.OnAttachStateChangeListener onAttachStateChangeListener = this.f;
    if (onAttachStateChangeListener != null && !this.h) {
      this.d.addOnAttachStateChangeListener(onAttachStateChangeListener);
      this.h = true;
    } 
  }
  
  private void k() {
    View.OnAttachStateChangeListener onAttachStateChangeListener = this.f;
    if (onAttachStateChangeListener != null && this.h) {
      this.d.removeOnAttachStateChangeListener(onAttachStateChangeListener);
      this.h = false;
    } 
  }
  
  private void l(Object paramObject) {
    b = true;
    this.d.setTag(c, paramObject);
  }
  
  public void a(g paramg) {
    this.e.k(paramg);
  }
  
  public void c(c paramc) {
    l(paramc);
  }
  
  public void e(Drawable paramDrawable) {
    super.e(paramDrawable);
    j();
  }
  
  public c f() {
    Object object = i();
    if (object != null) {
      if (object instanceof c) {
        object = object;
      } else {
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
      } 
    } else {
      object = null;
    } 
    return (c)object;
  }
  
  public void g(Drawable paramDrawable) {
    super.g(paramDrawable);
    this.e.b();
    if (!this.g)
      k(); 
  }
  
  public void h(g paramg) {
    this.e.d(paramg);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Target for: ");
    stringBuilder.append(this.d);
    return stringBuilder.toString();
  }
  
  static final class a {
    static Integer a;
    
    private final View b;
    
    private final List<g> c = new ArrayList<g>();
    
    boolean d;
    
    private a e;
    
    a(View param1View) {
      this.b = param1View;
    }
    
    private static int c(Context param1Context) {
      if (a == null) {
        Display display = ((WindowManager)j.d(param1Context.getSystemService("window"))).getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        a = Integer.valueOf(Math.max(point.x, point.y));
      } 
      return a.intValue();
    }
    
    private int e(int param1Int1, int param1Int2, int param1Int3) {
      int i = param1Int2 - param1Int3;
      if (i > 0)
        return i; 
      if (this.d && this.b.isLayoutRequested())
        return 0; 
      param1Int1 -= param1Int3;
      if (param1Int1 > 0)
        return param1Int1; 
      if (!this.b.isLayoutRequested() && param1Int2 == -2) {
        if (Log.isLoggable("ViewTarget", 4))
          Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions."); 
        return c(this.b.getContext());
      } 
      return 0;
    }
    
    private int f() {
      boolean bool;
      int i = this.b.getPaddingTop();
      int j = this.b.getPaddingBottom();
      ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
      if (layoutParams != null) {
        bool = layoutParams.height;
      } else {
        bool = false;
      } 
      return e(this.b.getHeight(), bool, i + j);
    }
    
    private int g() {
      boolean bool;
      int i = this.b.getPaddingLeft();
      int j = this.b.getPaddingRight();
      ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
      if (layoutParams != null) {
        bool = layoutParams.width;
      } else {
        bool = false;
      } 
      return e(this.b.getWidth(), bool, i + j);
    }
    
    private boolean h(int param1Int) {
      return (param1Int > 0 || param1Int == Integer.MIN_VALUE);
    }
    
    private boolean i(int param1Int1, int param1Int2) {
      boolean bool;
      if (h(param1Int1) && h(param1Int2)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    private void j(int param1Int1, int param1Int2) {
      Iterator<?> iterator = (new ArrayList(this.c)).iterator();
      while (iterator.hasNext())
        ((g)iterator.next()).e(param1Int1, param1Int2); 
    }
    
    void a() {
      if (this.c.isEmpty())
        return; 
      int i = g();
      int j = f();
      if (!i(i, j))
        return; 
      j(i, j);
      b();
    }
    
    void b() {
      ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
      if (viewTreeObserver.isAlive())
        viewTreeObserver.removeOnPreDrawListener(this.e); 
      this.e = null;
      this.c.clear();
    }
    
    void d(g param1g) {
      int i = g();
      int j = f();
      if (i(i, j)) {
        param1g.e(i, j);
        return;
      } 
      if (!this.c.contains(param1g))
        this.c.add(param1g); 
      if (this.e == null) {
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        a a1 = new a(this);
        this.e = a1;
        viewTreeObserver.addOnPreDrawListener(a1);
      } 
    }
    
    void k(g param1g) {
      this.c.remove(param1g);
    }
    
    private static final class a implements ViewTreeObserver.OnPreDrawListener {
      private final WeakReference<i.a> b;
      
      a(i.a param2a) {
        this.b = new WeakReference<i.a>(param2a);
      }
      
      public boolean onPreDraw() {
        if (Log.isLoggable("ViewTarget", 2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("OnGlobalLayoutListener called attachStateListener=");
          stringBuilder.append(this);
          Log.v("ViewTarget", stringBuilder.toString());
        } 
        i.a a1 = this.b.get();
        if (a1 != null)
          a1.a(); 
        return true;
      }
    }
  }
  
  private static final class a implements ViewTreeObserver.OnPreDrawListener {
    private final WeakReference<i.a> b;
    
    a(i.a param1a) {
      this.b = new WeakReference<i.a>(param1a);
    }
    
    public boolean onPreDraw() {
      if (Log.isLoggable("ViewTarget", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OnGlobalLayoutListener called attachStateListener=");
        stringBuilder.append(this);
        Log.v("ViewTarget", stringBuilder.toString());
      } 
      i.a a1 = this.b.get();
      if (a1 != null)
        a1.a(); 
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/request/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */