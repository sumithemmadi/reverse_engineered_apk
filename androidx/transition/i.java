package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.h.k.w;

@SuppressLint({"ViewConstructor"})
class i extends ViewGroup implements f {
  ViewGroup b;
  
  View c;
  
  final View d;
  
  int e;
  
  private Matrix f;
  
  private final ViewTreeObserver.OnPreDrawListener g = new a(this);
  
  i(View paramView) {
    super(paramView.getContext());
    this.d = paramView;
    setWillNotDraw(false);
    setLayerType(2, null);
  }
  
  static i b(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    if (paramView.getParent() instanceof ViewGroup) {
      Matrix matrix1;
      i i1;
      Matrix matrix2;
      g g = g.b(paramViewGroup);
      i i2 = e(paramView);
      byte b = 0;
      i i3 = i2;
      int j = b;
      if (i2 != null) {
        g g1 = (g)i2.getParent();
        i3 = i2;
        j = b;
        if (g1 != g) {
          j = i2.e;
          g1.removeView((View)i2);
          i3 = null;
        } 
      } 
      if (i3 == null) {
        g g1;
        matrix2 = paramMatrix;
        if (paramMatrix == null) {
          matrix2 = new Matrix();
          c(paramView, paramViewGroup, matrix2);
        } 
        i1 = new i(paramView);
        i1.h(matrix2);
        if (g == null) {
          g1 = new g(paramViewGroup);
        } else {
          g.g();
          g1 = g;
        } 
        d((View)paramViewGroup, (View)g1);
        d((View)paramViewGroup, (View)i1);
        g1.a(i1);
        i1.e = j;
        i i4 = i1;
      } else {
        matrix1 = matrix2;
        if (i1 != null) {
          matrix2.h((Matrix)i1);
          matrix1 = matrix2;
        } 
      } 
      ((i)matrix1).e++;
      return (i)matrix1;
    } 
    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
  }
  
  static void c(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    ViewGroup viewGroup = (ViewGroup)paramView.getParent();
    paramMatrix.reset();
    j0.j((View)viewGroup, paramMatrix);
    paramMatrix.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
    j0.k((View)paramViewGroup, paramMatrix);
  }
  
  static void d(View paramView1, View paramView2) {
    j0.g(paramView2, paramView2.getLeft(), paramView2.getTop(), paramView2.getLeft() + paramView1.getWidth(), paramView2.getTop() + paramView1.getHeight());
  }
  
  static i e(View paramView) {
    return (i)paramView.getTag(p.ghost_view);
  }
  
  static void f(View paramView) {
    i i1 = e(paramView);
    if (i1 != null) {
      int j = i1.e - 1;
      i1.e = j;
      if (j <= 0)
        ((g)i1.getParent()).removeView((View)i1); 
    } 
  }
  
  static void g(View paramView, i parami) {
    paramView.setTag(p.ghost_view, parami);
  }
  
  public void a(ViewGroup paramViewGroup, View paramView) {
    this.b = paramViewGroup;
    this.c = paramView;
  }
  
  void h(Matrix paramMatrix) {
    this.f = paramMatrix;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    g(this.d, this);
    this.d.getViewTreeObserver().addOnPreDrawListener(this.g);
    j0.i(this.d, 4);
    if (this.d.getParent() != null)
      ((View)this.d.getParent()).invalidate(); 
  }
  
  protected void onDetachedFromWindow() {
    this.d.getViewTreeObserver().removeOnPreDrawListener(this.g);
    j0.i(this.d, 0);
    g(this.d, null);
    if (this.d.getParent() != null)
      ((View)this.d.getParent()).invalidate(); 
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    b.a(paramCanvas, true);
    paramCanvas.setMatrix(this.f);
    j0.i(this.d, 0);
    this.d.invalidate();
    j0.i(this.d, 4);
    drawChild(paramCanvas, this.d, getDrawingTime());
    b.a(paramCanvas, false);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    if (e(this.d) == this) {
      if (paramInt == 0) {
        paramInt = 4;
      } else {
        paramInt = 0;
      } 
      j0.i(this.d, paramInt);
    } 
  }
  
  class a implements ViewTreeObserver.OnPreDrawListener {
    a(i this$0) {}
    
    public boolean onPreDraw() {
      w.h0((View)this.b);
      i i1 = this.b;
      ViewGroup viewGroup = i1.b;
      if (viewGroup != null) {
        View view = i1.c;
        if (view != null) {
          viewGroup.endViewTransition(view);
          w.h0((View)this.b.b);
          viewGroup = this.b;
          ((i)viewGroup).b = null;
          ((i)viewGroup).c = null;
        } 
      } 
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */