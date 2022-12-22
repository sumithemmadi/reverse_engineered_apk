package com.allinone.callerid.customview.e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d {
  private List<a> a = new ArrayList<a>();
  
  private long b = 3000L;
  
  private long c = 0L;
  
  private Interpolator d = null;
  
  private int e = 0;
  
  private int f = 1;
  
  private AnimatorSet g;
  
  private View h = null;
  
  private b i;
  
  private c j;
  
  private d k = null;
  
  private d l = null;
  
  public static a h(View... paramVarArgs) {
    return (new d()).g(paramVarArgs);
  }
  
  public a g(View... paramVarArgs) {
    a a = new a(this, paramVarArgs);
    this.a.add(a);
    return a;
  }
  
  protected AnimatorSet i() {
    ArrayList<Animator> arrayList = new ArrayList();
    for (a a : this.a) {
      List<Animator> list = a.b();
      if (a.e() != null) {
        Iterator<Animator> iterator = list.iterator();
        while (iterator.hasNext())
          ((Animator)iterator.next()).setInterpolator((TimeInterpolator)a.e()); 
      } 
      arrayList.addAll(list);
    } 
    for (a a : this.a) {
      if (a.h()) {
        this.h = a.g();
        break;
      } 
    } 
    for (Animator animator : arrayList) {
      if (animator instanceof ValueAnimator) {
        ValueAnimator valueAnimator = (ValueAnimator)animator;
        valueAnimator.setRepeatCount(this.e);
        valueAnimator.setRepeatMode(this.f);
      } 
    } 
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(arrayList);
    animatorSet.setDuration(this.b);
    animatorSet.setStartDelay(this.c);
    Interpolator interpolator = this.d;
    if (interpolator != null)
      animatorSet.setInterpolator((TimeInterpolator)interpolator); 
    animatorSet.addListener(new a(this));
    return animatorSet;
  }
  
  public d j(long paramLong) {
    this.b = paramLong;
    return this;
  }
  
  public d k(Interpolator paramInterpolator) {
    this.d = paramInterpolator;
    return this;
  }
  
  public d l(c paramc) {
    this.j = paramc;
    return this;
  }
  
  public d m(int paramInt) {
    this.e = paramInt;
    return this;
  }
  
  public d n() {
    d d1 = this.k;
    if (d1 != null) {
      d1.n();
    } else {
      AnimatorSet animatorSet = i();
      this.g = animatorSet;
      View view = this.h;
      if (view != null) {
        view.getViewTreeObserver().addOnPreDrawListener(new b(this));
      } else {
        animatorSet.start();
      } 
    } 
    return this;
  }
  
  class a implements Animator.AnimatorListener {
    a(d this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      if (d.b(this.a) != null)
        d.b(this.a).X(); 
      if (d.c(this.a) != null) {
        d.d(d.c(this.a), null);
        d.c(this.a).n();
      } 
    }
    
    public void onAnimationRepeat(Animator param1Animator) {}
    
    public void onAnimationStart(Animator param1Animator) {
      if (d.a(this.a) != null)
        d.a(this.a).onStart(); 
    }
  }
  
  class b implements ViewTreeObserver.OnPreDrawListener {
    b(d this$0) {}
    
    public boolean onPreDraw() {
      d.e(this.b).start();
      d.f(this.b).getViewTreeObserver().removeOnPreDrawListener(this);
      return false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */