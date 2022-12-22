package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

class c implements e {
  final RectF a = new RectF();
  
  private g p(Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3) {
    return new g(paramContext.getResources(), paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
  }
  
  private g q(d paramd) {
    return (g)paramd.f();
  }
  
  public void a(d paramd, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3) {
    g g = p(paramContext, paramColorStateList, paramFloat1, paramFloat2, paramFloat3);
    g.m(paramd.d());
    paramd.c(g);
    i(paramd);
  }
  
  public void b(d paramd, float paramFloat) {
    q(paramd).p(paramFloat);
    i(paramd);
  }
  
  public float c(d paramd) {
    return q(paramd).l();
  }
  
  public float d(d paramd) {
    return q(paramd).g();
  }
  
  public void e(d paramd) {}
  
  public void f(d paramd, float paramFloat) {
    q(paramd).r(paramFloat);
  }
  
  public float g(d paramd) {
    return q(paramd).i();
  }
  
  public ColorStateList h(d paramd) {
    return q(paramd).f();
  }
  
  public void i(d paramd) {
    Rect rect = new Rect();
    q(paramd).h(rect);
    paramd.b((int)Math.ceil(l(paramd)), (int)Math.ceil(k(paramd)));
    paramd.a(rect.left, rect.top, rect.right, rect.bottom);
  }
  
  public void j() {
    g.b = new a(this);
  }
  
  public float k(d paramd) {
    return q(paramd).j();
  }
  
  public float l(d paramd) {
    return q(paramd).k();
  }
  
  public void m(d paramd) {
    q(paramd).m(paramd.d());
    i(paramd);
  }
  
  public void n(d paramd, ColorStateList paramColorStateList) {
    q(paramd).o(paramColorStateList);
  }
  
  public void o(d paramd, float paramFloat) {
    q(paramd).q(paramFloat);
    i(paramd);
  }
  
  class a implements g.a {
    a(c this$0) {}
    
    public void a(Canvas param1Canvas, RectF param1RectF, float param1Float, Paint param1Paint) {
      float f1 = 2.0F * param1Float;
      float f2 = param1RectF.width() - f1 - 1.0F;
      float f3 = param1RectF.height();
      if (param1Float >= 1.0F) {
        float f4 = param1Float + 0.5F;
        RectF rectF = this.a.a;
        float f5 = -f4;
        rectF.set(f5, f5, f4, f4);
        int i = param1Canvas.save();
        param1Canvas.translate(param1RectF.left + f4, param1RectF.top + f4);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.translate(f2, 0.0F);
        param1Canvas.rotate(90.0F);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.translate(f3 - f1 - 1.0F, 0.0F);
        param1Canvas.rotate(90.0F);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.translate(f2, 0.0F);
        param1Canvas.rotate(90.0F);
        param1Canvas.drawArc(this.a.a, 180.0F, 90.0F, true, param1Paint);
        param1Canvas.restoreToCount(i);
        f2 = param1RectF.left;
        f5 = param1RectF.top;
        param1Canvas.drawRect(f2 + f4 - 1.0F, f5, param1RectF.right - f4 + 1.0F, f5 + f4, param1Paint);
        f5 = param1RectF.left;
        f2 = param1RectF.bottom;
        param1Canvas.drawRect(f5 + f4 - 1.0F, f2 - f4, param1RectF.right - f4 + 1.0F, f2, param1Paint);
      } 
      param1Canvas.drawRect(param1RectF.left, param1RectF.top + param1Float, param1RectF.right, param1RectF.bottom - param1Float, param1Paint);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/cardview/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */