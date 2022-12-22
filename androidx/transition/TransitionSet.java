package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.d.g;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class TransitionSet extends Transition {
  private ArrayList<Transition> L = new ArrayList<Transition>();
  
  private boolean M = true;
  
  int N;
  
  boolean O = false;
  
  private int P = 0;
  
  public TransitionSet() {}
  
  @SuppressLint({"RestrictedApi"})
  public TransitionSet(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.i);
    y0(g.g(typedArray, (XmlPullParser)paramAttributeSet, "transitionOrdering", 0, 0));
    typedArray.recycle();
  }
  
  private void A0() {
    b b = new b(this);
    Iterator<Transition> iterator = this.L.iterator();
    while (iterator.hasNext())
      ((Transition)iterator.next()).a(b); 
    this.N = this.L.size();
  }
  
  private void r0(Transition paramTransition) {
    this.L.add(paramTransition);
    paramTransition.v = this;
  }
  
  public void Y(View paramView) {
    super.Y(paramView);
    int i = this.L.size();
    for (byte b = 0; b < i; b++)
      ((Transition)this.L.get(b)).Y(paramView); 
  }
  
  public void c0(View paramView) {
    super.c0(paramView);
    int i = this.L.size();
    for (byte b = 0; b < i; b++)
      ((Transition)this.L.get(b)).c0(paramView); 
  }
  
  protected void e0() {
    if (this.L.isEmpty()) {
      m0();
      x();
      return;
    } 
    A0();
    if (!this.M) {
      for (byte b = 1; b < this.L.size(); b++)
        ((Transition)this.L.get(b - 1)).a(new a(this, this.L.get(b))); 
      Transition transition = this.L.get(0);
      if (transition != null)
        transition.e0(); 
    } else {
      Iterator<Transition> iterator = this.L.iterator();
      while (iterator.hasNext())
        ((Transition)iterator.next()).e0(); 
    } 
  }
  
  public void g0(Transition.e parame) {
    super.g0(parame);
    this.P |= 0x8;
    int i = this.L.size();
    for (byte b = 0; b < i; b++)
      ((Transition)this.L.get(b)).g0(parame); 
  }
  
  public void j0(PathMotion paramPathMotion) {
    super.j0(paramPathMotion);
    this.P |= 0x4;
    if (this.L != null)
      for (byte b = 0; b < this.L.size(); b++)
        ((Transition)this.L.get(b)).j0(paramPathMotion);  
  }
  
  public void k0(w paramw) {
    super.k0(paramw);
    this.P |= 0x2;
    int i = this.L.size();
    for (byte b = 0; b < i; b++)
      ((Transition)this.L.get(b)).k0(paramw); 
  }
  
  public void l(y paramy) {
    if (Q(paramy.b))
      for (Transition transition : this.L) {
        if (transition.Q(paramy.b)) {
          transition.l(paramy);
          paramy.c.add(transition);
        } 
      }  
  }
  
  void n(y paramy) {
    super.n(paramy);
    int i = this.L.size();
    for (byte b = 0; b < i; b++)
      ((Transition)this.L.get(b)).n(paramy); 
  }
  
  String n0(String paramString) {
    String str = super.n0(paramString);
    for (byte b = 0; b < this.L.size(); b++) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append("\n");
      Transition transition = this.L.get(b);
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(paramString);
      stringBuilder2.append("  ");
      stringBuilder1.append(transition.n0(stringBuilder2.toString()));
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  public TransitionSet o0(Transition.f paramf) {
    return (TransitionSet)super.a(paramf);
  }
  
  public TransitionSet p0(View paramView) {
    for (byte b = 0; b < this.L.size(); b++)
      ((Transition)this.L.get(b)).b(paramView); 
    return (TransitionSet)super.b(paramView);
  }
  
  public void q(y paramy) {
    if (Q(paramy.b))
      for (Transition transition : this.L) {
        if (transition.Q(paramy.b)) {
          transition.q(paramy);
          paramy.c.add(transition);
        } 
      }  
  }
  
  public TransitionSet q0(Transition paramTransition) {
    r0(paramTransition);
    long l = this.g;
    if (l >= 0L)
      paramTransition.f0(l); 
    if ((this.P & 0x1) != 0)
      paramTransition.h0(B()); 
    if ((this.P & 0x2) != 0)
      paramTransition.k0(F()); 
    if ((this.P & 0x4) != 0)
      paramTransition.j0(E()); 
    if ((this.P & 0x8) != 0)
      paramTransition.g0(A()); 
    return this;
  }
  
  public Transition s0(int paramInt) {
    return (paramInt < 0 || paramInt >= this.L.size()) ? null : this.L.get(paramInt);
  }
  
  public Transition t() {
    TransitionSet transitionSet = (TransitionSet)super.t();
    transitionSet.L = new ArrayList<Transition>();
    int i = this.L.size();
    for (byte b = 0; b < i; b++)
      transitionSet.r0(((Transition)this.L.get(b)).t()); 
    return transitionSet;
  }
  
  public int t0() {
    return this.L.size();
  }
  
  public TransitionSet u0(Transition.f paramf) {
    return (TransitionSet)super.a0(paramf);
  }
  
  public TransitionSet v0(View paramView) {
    for (byte b = 0; b < this.L.size(); b++)
      ((Transition)this.L.get(b)).b0(paramView); 
    return (TransitionSet)super.b0(paramView);
  }
  
  protected void w(ViewGroup paramViewGroup, z paramz1, z paramz2, ArrayList<y> paramArrayList1, ArrayList<y> paramArrayList2) {
    long l = H();
    int i = this.L.size();
    for (byte b = 0; b < i; b++) {
      Transition transition = this.L.get(b);
      if (l > 0L && (this.M || b == 0)) {
        long l1 = transition.H();
        if (l1 > 0L) {
          transition.l0(l1 + l);
        } else {
          transition.l0(l);
        } 
      } 
      transition.w(paramViewGroup, paramz1, paramz2, paramArrayList1, paramArrayList2);
    } 
  }
  
  public TransitionSet w0(long paramLong) {
    super.f0(paramLong);
    if (this.g >= 0L) {
      ArrayList<Transition> arrayList = this.L;
      if (arrayList != null) {
        int i = arrayList.size();
        for (byte b = 0; b < i; b++)
          ((Transition)this.L.get(b)).f0(paramLong); 
      } 
    } 
    return this;
  }
  
  public TransitionSet x0(TimeInterpolator paramTimeInterpolator) {
    this.P |= 0x1;
    ArrayList<Transition> arrayList = this.L;
    if (arrayList != null) {
      int i = arrayList.size();
      for (byte b = 0; b < i; b++)
        ((Transition)this.L.get(b)).h0(paramTimeInterpolator); 
    } 
    return (TransitionSet)super.h0(paramTimeInterpolator);
  }
  
  public TransitionSet y0(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1) {
        this.M = false;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid parameter for TransitionSet ordering: ");
        stringBuilder.append(paramInt);
        throw new AndroidRuntimeException(stringBuilder.toString());
      } 
    } else {
      this.M = true;
    } 
    return this;
  }
  
  public TransitionSet z0(long paramLong) {
    return (TransitionSet)super.l0(paramLong);
  }
  
  class a extends u {
    a(TransitionSet this$0, Transition param1Transition) {}
    
    public void c(Transition param1Transition) {
      this.a.e0();
      param1Transition.a0(this);
    }
  }
  
  static class b extends u {
    TransitionSet a;
    
    b(TransitionSet param1TransitionSet) {
      this.a = param1TransitionSet;
    }
    
    public void a(Transition param1Transition) {
      param1Transition = this.a;
      if (!((TransitionSet)param1Transition).O) {
        param1Transition.m0();
        this.a.O = true;
      } 
    }
    
    public void c(Transition param1Transition) {
      TransitionSet transitionSet = this.a;
      int i = transitionSet.N - 1;
      transitionSet.N = i;
      if (i == 0) {
        transitionSet.O = false;
        transitionSet.x();
      } 
      param1Transition.a0(this);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/TransitionSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */