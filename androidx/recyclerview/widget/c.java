package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import b.h.k.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends m {
  private static TimeInterpolator h;
  
  private ArrayList<RecyclerView.b0> i = new ArrayList<RecyclerView.b0>();
  
  private ArrayList<RecyclerView.b0> j = new ArrayList<RecyclerView.b0>();
  
  private ArrayList<j> k = new ArrayList<j>();
  
  private ArrayList<i> l = new ArrayList<i>();
  
  ArrayList<ArrayList<RecyclerView.b0>> m = new ArrayList<ArrayList<RecyclerView.b0>>();
  
  ArrayList<ArrayList<j>> n = new ArrayList<ArrayList<j>>();
  
  ArrayList<ArrayList<i>> o = new ArrayList<ArrayList<i>>();
  
  ArrayList<RecyclerView.b0> p = new ArrayList<RecyclerView.b0>();
  
  ArrayList<RecyclerView.b0> q = new ArrayList<RecyclerView.b0>();
  
  ArrayList<RecyclerView.b0> r = new ArrayList<RecyclerView.b0>();
  
  ArrayList<RecyclerView.b0> s = new ArrayList<RecyclerView.b0>();
  
  private void T(RecyclerView.b0 paramb0) {
    View view = paramb0.b;
    ViewPropertyAnimator viewPropertyAnimator = view.animate();
    this.r.add(paramb0);
    viewPropertyAnimator.setDuration(o()).alpha(0.0F).setListener((Animator.AnimatorListener)new d(this, paramb0, viewPropertyAnimator, view)).start();
  }
  
  private void W(List<i> paramList, RecyclerView.b0 paramb0) {
    for (int i = paramList.size() - 1; i >= 0; i--) {
      i i1 = paramList.get(i);
      if (Y(i1, paramb0) && i1.a == null && i1.b == null)
        paramList.remove(i1); 
    } 
  }
  
  private void X(i parami) {
    RecyclerView.b0 b0 = parami.a;
    if (b0 != null)
      Y(parami, b0); 
    b0 = parami.b;
    if (b0 != null)
      Y(parami, b0); 
  }
  
  private boolean Y(i parami, RecyclerView.b0 paramb0) {
    RecyclerView.b0 b01 = parami.b;
    boolean bool = false;
    if (b01 == paramb0) {
      parami.b = null;
    } else {
      if (parami.a == paramb0) {
        parami.a = null;
        bool = true;
        paramb0.b.setAlpha(1.0F);
        paramb0.b.setTranslationX(0.0F);
        paramb0.b.setTranslationY(0.0F);
        C(paramb0, bool);
        return true;
      } 
      return false;
    } 
    paramb0.b.setAlpha(1.0F);
    paramb0.b.setTranslationX(0.0F);
    paramb0.b.setTranslationY(0.0F);
    C(paramb0, bool);
    return true;
  }
  
  private void Z(RecyclerView.b0 paramb0) {
    if (h == null)
      h = (new ValueAnimator()).getInterpolator(); 
    paramb0.b.animate().setInterpolator(h);
    j(paramb0);
  }
  
  void Q(RecyclerView.b0 paramb0) {
    View view = paramb0.b;
    ViewPropertyAnimator viewPropertyAnimator = view.animate();
    this.p.add(paramb0);
    viewPropertyAnimator.alpha(1.0F).setDuration(l()).setListener((Animator.AnimatorListener)new e(this, paramb0, view, viewPropertyAnimator)).start();
  }
  
  void R(i parami) {
    View view1;
    RecyclerView.b0 b01 = parami.a;
    View view2 = null;
    if (b01 == null) {
      b01 = null;
    } else {
      view1 = b01.b;
    } 
    RecyclerView.b0 b02 = parami.b;
    if (b02 != null)
      view2 = b02.b; 
    if (view1 != null) {
      ViewPropertyAnimator viewPropertyAnimator = view1.animate().setDuration(m());
      this.s.add(parami.a);
      viewPropertyAnimator.translationX((parami.e - parami.c));
      viewPropertyAnimator.translationY((parami.f - parami.d));
      viewPropertyAnimator.alpha(0.0F).setListener((Animator.AnimatorListener)new g(this, parami, viewPropertyAnimator, view1)).start();
    } 
    if (view2 != null) {
      ViewPropertyAnimator viewPropertyAnimator = view2.animate();
      this.s.add(parami.b);
      viewPropertyAnimator.translationX(0.0F).translationY(0.0F).setDuration(m()).alpha(1.0F).setListener((Animator.AnimatorListener)new h(this, parami, viewPropertyAnimator, view2)).start();
    } 
  }
  
  void S(RecyclerView.b0 paramb0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = paramb0.b;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0)
      view.animate().translationX(0.0F); 
    if (paramInt2 != 0)
      view.animate().translationY(0.0F); 
    ViewPropertyAnimator viewPropertyAnimator = view.animate();
    this.q.add(paramb0);
    viewPropertyAnimator.setDuration(n()).setListener((Animator.AnimatorListener)new f(this, paramb0, paramInt1, view, paramInt2, viewPropertyAnimator)).start();
  }
  
  void U(List<RecyclerView.b0> paramList) {
    for (int i = paramList.size() - 1; i >= 0; i--)
      ((RecyclerView.b0)paramList.get(i)).b.animate().cancel(); 
  }
  
  void V() {
    if (!p())
      i(); 
  }
  
  public boolean g(RecyclerView.b0 paramb0, List<Object> paramList) {
    return (!paramList.isEmpty() || super.g(paramb0, paramList));
  }
  
  public void j(RecyclerView.b0 paramb0) {
    View view = paramb0.b;
    view.animate().cancel();
    int i;
    for (i = this.k.size() - 1; i >= 0; i--) {
      if (((j)this.k.get(i)).a == paramb0) {
        view.setTranslationY(0.0F);
        view.setTranslationX(0.0F);
        E(paramb0);
        this.k.remove(i);
      } 
    } 
    W(this.l, paramb0);
    if (this.i.remove(paramb0)) {
      view.setAlpha(1.0F);
      G(paramb0);
    } 
    if (this.j.remove(paramb0)) {
      view.setAlpha(1.0F);
      A(paramb0);
    } 
    for (i = this.o.size() - 1; i >= 0; i--) {
      ArrayList<i> arrayList = this.o.get(i);
      W(arrayList, paramb0);
      if (arrayList.isEmpty())
        this.o.remove(i); 
    } 
    for (i = this.n.size() - 1; i >= 0; i--) {
      ArrayList arrayList = this.n.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        if (((j)arrayList.get(j)).a == paramb0) {
          view.setTranslationY(0.0F);
          view.setTranslationX(0.0F);
          E(paramb0);
          arrayList.remove(j);
          if (arrayList.isEmpty())
            this.n.remove(i); 
          break;
        } 
      } 
    } 
    for (i = this.m.size() - 1; i >= 0; i--) {
      ArrayList arrayList = this.m.get(i);
      if (arrayList.remove(paramb0)) {
        view.setAlpha(1.0F);
        A(paramb0);
        if (arrayList.isEmpty())
          this.m.remove(i); 
      } 
    } 
    this.r.remove(paramb0);
    this.p.remove(paramb0);
    this.s.remove(paramb0);
    this.q.remove(paramb0);
    V();
  }
  
  public void k() {
    int i;
    for (i = this.k.size() - 1; i >= 0; i--) {
      j j = this.k.get(i);
      View view = j.a.b;
      view.setTranslationY(0.0F);
      view.setTranslationX(0.0F);
      E(j.a);
      this.k.remove(i);
    } 
    for (i = this.i.size() - 1; i >= 0; i--) {
      G(this.i.get(i));
      this.i.remove(i);
    } 
    for (i = this.j.size() - 1; i >= 0; i--) {
      RecyclerView.b0 b0 = this.j.get(i);
      b0.b.setAlpha(1.0F);
      A(b0);
      this.j.remove(i);
    } 
    for (i = this.l.size() - 1; i >= 0; i--)
      X(this.l.get(i)); 
    this.l.clear();
    if (!p())
      return; 
    for (i = this.n.size() - 1; i >= 0; i--) {
      ArrayList<j> arrayList = this.n.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        j j1 = arrayList.get(j);
        View view = j1.a.b;
        view.setTranslationY(0.0F);
        view.setTranslationX(0.0F);
        E(j1.a);
        arrayList.remove(j);
        if (arrayList.isEmpty())
          this.n.remove(arrayList); 
      } 
    } 
    for (i = this.m.size() - 1; i >= 0; i--) {
      ArrayList<RecyclerView.b0> arrayList = this.m.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        RecyclerView.b0 b0 = arrayList.get(j);
        b0.b.setAlpha(1.0F);
        A(b0);
        arrayList.remove(j);
        if (arrayList.isEmpty())
          this.m.remove(arrayList); 
      } 
    } 
    for (i = this.o.size() - 1; i >= 0; i--) {
      ArrayList<i> arrayList = this.o.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        X(arrayList.get(j));
        if (arrayList.isEmpty())
          this.o.remove(arrayList); 
      } 
    } 
    U(this.r);
    U(this.q);
    U(this.p);
    U(this.s);
    i();
  }
  
  public boolean p() {
    return (!this.j.isEmpty() || !this.l.isEmpty() || !this.k.isEmpty() || !this.i.isEmpty() || !this.q.isEmpty() || !this.r.isEmpty() || !this.p.isEmpty() || !this.s.isEmpty() || !this.n.isEmpty() || !this.m.isEmpty() || !this.o.isEmpty());
  }
  
  public void u() {
    int i = this.i.isEmpty() ^ true;
    int j = this.k.isEmpty() ^ true;
    int k = this.l.isEmpty() ^ true;
    int n = this.j.isEmpty() ^ true;
    if (i == 0 && j == 0 && n == 0 && k == 0)
      return; 
    Iterator<RecyclerView.b0> iterator = this.i.iterator();
    while (iterator.hasNext())
      T(iterator.next()); 
    this.i.clear();
    if (j != 0) {
      ArrayList<j> arrayList = new ArrayList();
      arrayList.addAll(this.k);
      this.n.add(arrayList);
      this.k.clear();
      a a = new a(this, arrayList);
      if (i != 0) {
        w.k0(((j)arrayList.get(0)).a.b, a, o());
      } else {
        a.run();
      } 
    } 
    if (k != 0) {
      ArrayList<i> arrayList = new ArrayList();
      arrayList.addAll(this.l);
      this.o.add(arrayList);
      this.l.clear();
      b b = new b(this, arrayList);
      if (i != 0) {
        w.k0(((i)arrayList.get(0)).a.b, b, o());
      } else {
        b.run();
      } 
    } 
    if (n != 0) {
      ArrayList<RecyclerView.b0> arrayList = new ArrayList();
      arrayList.addAll(this.j);
      this.m.add(arrayList);
      this.j.clear();
      c c1 = new c(this, arrayList);
      if (i != 0 || j != 0 || k != 0) {
        long l2;
        long l1 = 0L;
        if (i != 0) {
          l2 = o();
        } else {
          l2 = 0L;
        } 
        if (j != 0) {
          l3 = n();
        } else {
          l3 = 0L;
        } 
        if (k != 0)
          l1 = m(); 
        long l3 = Math.max(l3, l1);
        w.k0(((RecyclerView.b0)arrayList.get(0)).b, c1, l2 + l3);
        return;
      } 
      c1.run();
    } 
  }
  
  public boolean w(RecyclerView.b0 paramb0) {
    Z(paramb0);
    paramb0.b.setAlpha(0.0F);
    this.j.add(paramb0);
    return true;
  }
  
  public boolean x(RecyclerView.b0 paramb01, RecyclerView.b0 paramb02, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramb01 == paramb02)
      return y(paramb01, paramInt1, paramInt2, paramInt3, paramInt4); 
    float f1 = paramb01.b.getTranslationX();
    float f2 = paramb01.b.getTranslationY();
    float f3 = paramb01.b.getAlpha();
    Z(paramb01);
    int i = (int)((paramInt3 - paramInt1) - f1);
    int j = (int)((paramInt4 - paramInt2) - f2);
    paramb01.b.setTranslationX(f1);
    paramb01.b.setTranslationY(f2);
    paramb01.b.setAlpha(f3);
    if (paramb02 != null) {
      Z(paramb02);
      paramb02.b.setTranslationX(-i);
      paramb02.b.setTranslationY(-j);
      paramb02.b.setAlpha(0.0F);
    } 
    this.l.add(new i(paramb01, paramb02, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public boolean y(RecyclerView.b0 paramb0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = paramb0.b;
    paramInt1 += (int)view.getTranslationX();
    paramInt2 += (int)paramb0.b.getTranslationY();
    Z(paramb0);
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if (i == 0 && j == 0) {
      E(paramb0);
      return false;
    } 
    if (i != 0)
      view.setTranslationX(-i); 
    if (j != 0)
      view.setTranslationY(-j); 
    this.k.add(new j(paramb0, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public boolean z(RecyclerView.b0 paramb0) {
    Z(paramb0);
    this.i.add(paramb0);
    return true;
  }
  
  class a implements Runnable {
    a(c this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      for (c.j j : this.b)
        this.c.S(j.a, j.b, j.c, j.d, j.e); 
      this.b.clear();
      this.c.n.remove(this.b);
    }
  }
  
  class b implements Runnable {
    b(c this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      for (c.i i : this.b)
        this.c.R(i); 
      this.b.clear();
      this.c.o.remove(this.b);
    }
  }
  
  class c implements Runnable {
    c(c this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      for (RecyclerView.b0 b0 : this.b)
        this.c.Q(b0); 
      this.b.clear();
      this.c.m.remove(this.b);
    }
  }
  
  class d extends AnimatorListenerAdapter {
    d(c this$0, RecyclerView.b0 param1b0, ViewPropertyAnimator param1ViewPropertyAnimator, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.b.setListener(null);
      this.c.setAlpha(1.0F);
      this.d.G(this.a);
      this.d.r.remove(this.a);
      this.d.V();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.H(this.a);
    }
  }
  
  class e extends AnimatorListenerAdapter {
    e(c this$0, RecyclerView.b0 param1b0, View param1View, ViewPropertyAnimator param1ViewPropertyAnimator) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.b.setAlpha(1.0F);
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.c.setListener(null);
      this.d.A(this.a);
      this.d.p.remove(this.a);
      this.d.V();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.B(this.a);
    }
  }
  
  class f extends AnimatorListenerAdapter {
    f(c this$0, RecyclerView.b0 param1b0, int param1Int1, View param1View, int param1Int2, ViewPropertyAnimator param1ViewPropertyAnimator) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      if (this.b != 0)
        this.c.setTranslationX(0.0F); 
      if (this.d != 0)
        this.c.setTranslationY(0.0F); 
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.e.setListener(null);
      this.f.E(this.a);
      this.f.q.remove(this.a);
      this.f.V();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.f.F(this.a);
    }
  }
  
  class g extends AnimatorListenerAdapter {
    g(c this$0, c.i param1i, ViewPropertyAnimator param1ViewPropertyAnimator, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.b.setListener(null);
      this.c.setAlpha(1.0F);
      this.c.setTranslationX(0.0F);
      this.c.setTranslationY(0.0F);
      this.d.C(this.a.a, true);
      this.d.s.remove(this.a.a);
      this.d.V();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.D(this.a.a, true);
    }
  }
  
  class h extends AnimatorListenerAdapter {
    h(c this$0, c.i param1i, ViewPropertyAnimator param1ViewPropertyAnimator, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.b.setListener(null);
      this.c.setAlpha(1.0F);
      this.c.setTranslationX(0.0F);
      this.c.setTranslationY(0.0F);
      this.d.C(this.a.b, false);
      this.d.s.remove(this.a.b);
      this.d.V();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.D(this.a.b, false);
    }
  }
  
  private static class i {
    public RecyclerView.b0 a;
    
    public RecyclerView.b0 b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    private i(RecyclerView.b0 param1b01, RecyclerView.b0 param1b02) {
      this.a = param1b01;
      this.b = param1b02;
    }
    
    i(RecyclerView.b0 param1b01, RecyclerView.b0 param1b02, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this(param1b01, param1b02);
      this.c = param1Int1;
      this.d = param1Int2;
      this.e = param1Int3;
      this.f = param1Int4;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ChangeInfo{oldHolder=");
      stringBuilder.append(this.a);
      stringBuilder.append(", newHolder=");
      stringBuilder.append(this.b);
      stringBuilder.append(", fromX=");
      stringBuilder.append(this.c);
      stringBuilder.append(", fromY=");
      stringBuilder.append(this.d);
      stringBuilder.append(", toX=");
      stringBuilder.append(this.e);
      stringBuilder.append(", toY=");
      stringBuilder.append(this.f);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  private static class j {
    public RecyclerView.b0 a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    j(RecyclerView.b0 param1b0, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a = param1b0;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Int4;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */