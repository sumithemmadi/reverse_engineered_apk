package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;

public class Layer extends ConstraintHelper {
  private boolean A;
  
  private boolean B;
  
  private float k = Float.NaN;
  
  private float l = Float.NaN;
  
  private float m = Float.NaN;
  
  ConstraintLayout n;
  
  private float o = 1.0F;
  
  private float p = 1.0F;
  
  protected float q = Float.NaN;
  
  protected float r = Float.NaN;
  
  protected float s = Float.NaN;
  
  protected float t = Float.NaN;
  
  protected float u = Float.NaN;
  
  protected float v = Float.NaN;
  
  boolean w = true;
  
  View[] x = null;
  
  private float y = 0.0F;
  
  private float z = 0.0F;
  
  public Layer(Context paramContext) {
    super(paramContext);
  }
  
  public Layer(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public Layer(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void x() {
    if (this.n == null)
      return; 
    int i = this.c;
    if (i == 0)
      return; 
    View[] arrayOfView = this.x;
    if (arrayOfView == null || arrayOfView.length != i)
      this.x = new View[i]; 
    for (i = 0; i < this.c; i++) {
      int j = this.b[i];
      this.x[i] = this.n.o(j);
    } 
  }
  
  private void y() {
    double d;
    if (this.n == null)
      return; 
    if (this.x == null)
      x(); 
    w();
    if (Float.isNaN(this.m)) {
      d = 0.0D;
    } else {
      d = Math.toRadians(this.m);
    } 
    float f1 = (float)Math.sin(d);
    float f2 = (float)Math.cos(d);
    float f3 = this.o;
    float f4 = this.p;
    float f5 = -f4;
    for (byte b = 0; b < this.c; b++) {
      View view = this.x[b];
      int i = (view.getLeft() + view.getRight()) / 2;
      int j = (view.getTop() + view.getBottom()) / 2;
      float f6 = i - this.q;
      float f7 = j - this.r;
      float f8 = this.y;
      float f9 = this.z;
      view.setTranslationX(f3 * f2 * f6 + f5 * f1 * f7 - f6 + f8);
      view.setTranslationY(f6 * f3 * f1 + f4 * f2 * f7 - f7 + f9);
      view.setScaleY(this.p);
      view.setScaleX(this.o);
      if (!Float.isNaN(this.m))
        view.setRotation(this.m); 
    } 
  }
  
  protected void n(AttributeSet paramAttributeSet) {
    super.n(paramAttributeSet);
    byte b = 0;
    this.f = false;
    if (paramAttributeSet != null) {
      TypedArray typedArray = getContext().obtainStyledAttributes(paramAttributeSet, e.ConstraintLayout_Layout);
      int i = typedArray.getIndexCount();
      while (b < i) {
        int j = typedArray.getIndex(b);
        if (j == e.ConstraintLayout_Layout_android_visibility) {
          this.A = true;
        } else if (j == e.ConstraintLayout_Layout_android_elevation) {
          this.B = true;
        } 
        b++;
      } 
      typedArray.recycle();
    } 
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.n = (ConstraintLayout)getParent();
    if (this.A || this.B) {
      float f;
      int i = getVisibility();
      if (Build.VERSION.SDK_INT >= 21) {
        f = getElevation();
      } else {
        f = 0.0F;
      } 
      for (byte b = 0; b < this.c; b++) {
        int j = this.b[b];
        View view = this.n.o(j);
        if (view != null) {
          if (this.A)
            view.setVisibility(i); 
          if (this.B && f > 0.0F && Build.VERSION.SDK_INT >= 21)
            view.setTranslationZ(view.getTranslationZ() + f); 
        } 
      } 
    } 
  }
  
  public void q(ConstraintLayout paramConstraintLayout) {
    x();
    this.q = Float.NaN;
    this.r = Float.NaN;
    ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams)getLayoutParams()).b();
    constraintWidget.Y0(0);
    constraintWidget.z0(0);
    w();
    layout((int)this.u - getPaddingLeft(), (int)this.v - getPaddingTop(), (int)this.s + getPaddingRight(), (int)this.t + getPaddingBottom());
    y();
  }
  
  public void s(ConstraintLayout paramConstraintLayout) {
    this.n = paramConstraintLayout;
    float f = getRotation();
    if (f == 0.0F) {
      if (!Float.isNaN(this.m))
        this.m = f; 
    } else {
      this.m = f;
    } 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    h();
  }
  
  public void setPivotX(float paramFloat) {
    this.k = paramFloat;
    y();
  }
  
  public void setPivotY(float paramFloat) {
    this.l = paramFloat;
    y();
  }
  
  public void setRotation(float paramFloat) {
    this.m = paramFloat;
    y();
  }
  
  public void setScaleX(float paramFloat) {
    this.o = paramFloat;
    y();
  }
  
  public void setScaleY(float paramFloat) {
    this.p = paramFloat;
    y();
  }
  
  public void setTranslationX(float paramFloat) {
    this.y = paramFloat;
    y();
  }
  
  public void setTranslationY(float paramFloat) {
    this.z = paramFloat;
    y();
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    h();
  }
  
  protected void w() {
    if (this.n == null)
      return; 
    if (!this.w && !Float.isNaN(this.q) && !Float.isNaN(this.r))
      return; 
    if (Float.isNaN(this.k) || Float.isNaN(this.l)) {
      View[] arrayOfView = m(this.n);
      byte b = 0;
      int i = arrayOfView[0].getLeft();
      int j = arrayOfView[0].getTop();
      int k = arrayOfView[0].getRight();
      int m = arrayOfView[0].getBottom();
      while (b < this.c) {
        View view = arrayOfView[b];
        i = Math.min(i, view.getLeft());
        j = Math.min(j, view.getTop());
        k = Math.max(k, view.getRight());
        m = Math.max(m, view.getBottom());
        b++;
      } 
      this.s = k;
      this.t = m;
      this.u = i;
      this.v = j;
      if (Float.isNaN(this.k)) {
        this.q = ((i + k) / 2);
      } else {
        this.q = this.k;
      } 
      if (Float.isNaN(this.l)) {
        this.r = ((j + m) / 2);
      } else {
        this.r = this.l;
      } 
      return;
    } 
    this.r = this.l;
    this.q = this.k;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/helper/widget/Layer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */