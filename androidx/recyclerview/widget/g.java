package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class g extends RecyclerView.x {
  protected final LinearInterpolator i = new LinearInterpolator();
  
  protected final DecelerateInterpolator j = new DecelerateInterpolator();
  
  protected PointF k;
  
  private final DisplayMetrics l;
  
  private boolean m = false;
  
  private float n;
  
  protected int o = 0;
  
  protected int p = 0;
  
  public g(Context paramContext) {
    this.l = paramContext.getResources().getDisplayMetrics();
  }
  
  private float A() {
    if (!this.m) {
      this.n = v(this.l);
      this.m = true;
    } 
    return this.n;
  }
  
  private int y(int paramInt1, int paramInt2) {
    paramInt2 = paramInt1 - paramInt2;
    return (paramInt1 * paramInt2 <= 0) ? 0 : paramInt2;
  }
  
  protected int B() {
    PointF pointF = this.k;
    if (pointF != null) {
      byte b;
      float f = pointF.y;
      if (f == 0.0F)
        return 0; 
      if (f > 0.0F) {
        b = 1;
      } else {
        b = -1;
      } 
      return b;
    } 
    return 0;
  }
  
  protected void C(RecyclerView.x.a parama) {
    PointF pointF = a(f());
    if (pointF == null || (pointF.x == 0.0F && pointF.y == 0.0F)) {
      parama.b(f());
      r();
      return;
    } 
    i(pointF);
    this.k = pointF;
    this.o = (int)(pointF.x * 10000.0F);
    this.p = (int)(pointF.y * 10000.0F);
    int i = x(10000);
    parama.d((int)(this.o * 1.2F), (int)(this.p * 1.2F), (int)(i * 1.2F), (Interpolator)this.i);
  }
  
  protected void l(int paramInt1, int paramInt2, RecyclerView.y paramy, RecyclerView.x.a parama) {
    if (c() == 0) {
      r();
      return;
    } 
    this.o = y(this.o, paramInt1);
    paramInt1 = y(this.p, paramInt2);
    this.p = paramInt1;
    if (this.o == 0 && paramInt1 == 0)
      C(parama); 
  }
  
  protected void m() {}
  
  protected void n() {
    this.p = 0;
    this.o = 0;
    this.k = null;
  }
  
  protected void o(View paramView, RecyclerView.y paramy, RecyclerView.x.a parama) {
    int i = t(paramView, z());
    int j = u(paramView, B());
    int k = w((int)Math.sqrt((i * i + j * j)));
    if (k > 0)
      parama.d(-i, -j, k, (Interpolator)this.j); 
  }
  
  public int s(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 == 1)
          return paramInt4 - paramInt2; 
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
      } 
      paramInt1 = paramInt3 - paramInt1;
      if (paramInt1 > 0)
        return paramInt1; 
      paramInt1 = paramInt4 - paramInt2;
      return (paramInt1 < 0) ? paramInt1 : 0;
    } 
    return paramInt3 - paramInt1;
  }
  
  public int t(View paramView, int paramInt) {
    RecyclerView.o o = e();
    if (o == null || !o.k())
      return 0; 
    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return s(o.Q(paramView) - layoutParams.leftMargin, o.T(paramView) + layoutParams.rightMargin, o.e0(), o.o0() - o.f0(), paramInt);
  }
  
  public int u(View paramView, int paramInt) {
    RecyclerView.o o = e();
    if (o == null || !o.l())
      return 0; 
    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return s(o.U(paramView) - layoutParams.topMargin, o.O(paramView) + layoutParams.bottomMargin, o.g0(), o.W() - o.d0(), paramInt);
  }
  
  protected float v(DisplayMetrics paramDisplayMetrics) {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  protected int w(int paramInt) {
    double d = x(paramInt);
    Double.isNaN(d);
    return (int)Math.ceil(d / 0.3356D);
  }
  
  protected int x(int paramInt) {
    return (int)Math.ceil((Math.abs(paramInt) * A()));
  }
  
  protected int z() {
    PointF pointF = this.k;
    if (pointF != null) {
      byte b;
      float f = pointF.x;
      if (f == 0.0F)
        return 0; 
      if (f > 0.0F) {
        b = 1;
      } else {
        b = -1;
      } 
      return b;
    } 
    return 0;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/recyclerview/widget/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */