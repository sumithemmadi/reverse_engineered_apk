package com.allinone.callerid.customview.e;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public class a {
  private final d a;
  
  private final View[] b;
  
  private final List<Animator> c = new ArrayList<Animator>();
  
  private boolean d;
  
  private boolean e = false;
  
  private Interpolator f = null;
  
  public a(d paramd, View... paramVarArgs) {
    this.a = paramd;
    this.b = paramVarArgs;
  }
  
  public a a(View... paramVarArgs) {
    return this.a.g(paramVarArgs);
  }
  
  protected List<Animator> b() {
    return this.c;
  }
  
  public d c() {
    return this.a.k((Interpolator)new DecelerateInterpolator());
  }
  
  public a d() {
    this.e = true;
    return this;
  }
  
  public Interpolator e() {
    return this.f;
  }
  
  protected float[] f(float... paramVarArgs) {
    if (!this.e)
      return paramVarArgs; 
    float[] arrayOfFloat = new float[paramVarArgs.length];
    for (byte b = 0; b < paramVarArgs.length; b++)
      arrayOfFloat[b] = j(paramVarArgs[b]); 
    return arrayOfFloat;
  }
  
  public View g() {
    return this.b[0];
  }
  
  public boolean h() {
    return this.d;
  }
  
  public a i(String paramString, float... paramVarArgs) {
    for (View view : this.b)
      this.c.add(ObjectAnimator.ofFloat(view, paramString, f(paramVarArgs))); 
    return this;
  }
  
  protected float j(float paramFloat) {
    return paramFloat * (this.b[0].getContext().getResources().getDisplayMetrics()).density;
  }
  
  public a k(float... paramVarArgs) {
    return i("translationX", paramVarArgs);
  }
  
  public a l(float... paramVarArgs) {
    return i("translationY", paramVarArgs);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */