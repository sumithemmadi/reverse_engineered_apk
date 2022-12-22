package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class b implements e {
  private f p(d paramd) {
    return (f)paramd.f();
  }
  
  public void a(d paramd, Context paramContext, ColorStateList paramColorStateList, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramd.c(new f(paramColorStateList, paramFloat1));
    View view = paramd.g();
    view.setClipToOutline(true);
    view.setElevation(paramFloat2);
    o(paramd, paramFloat3);
  }
  
  public void b(d paramd, float paramFloat) {
    p(paramd).h(paramFloat);
  }
  
  public float c(d paramd) {
    return paramd.g().getElevation();
  }
  
  public float d(d paramd) {
    return p(paramd).d();
  }
  
  public void e(d paramd) {
    o(paramd, g(paramd));
  }
  
  public void f(d paramd, float paramFloat) {
    paramd.g().setElevation(paramFloat);
  }
  
  public float g(d paramd) {
    return p(paramd).c();
  }
  
  public ColorStateList h(d paramd) {
    return p(paramd).b();
  }
  
  public void i(d paramd) {
    if (!paramd.e()) {
      paramd.a(0, 0, 0, 0);
      return;
    } 
    float f1 = g(paramd);
    float f2 = d(paramd);
    int i = (int)Math.ceil(g.c(f1, f2, paramd.d()));
    int j = (int)Math.ceil(g.d(f1, f2, paramd.d()));
    paramd.a(i, j, i, j);
  }
  
  public void j() {}
  
  public float k(d paramd) {
    return d(paramd) * 2.0F;
  }
  
  public float l(d paramd) {
    return d(paramd) * 2.0F;
  }
  
  public void m(d paramd) {
    o(paramd, g(paramd));
  }
  
  public void n(d paramd, ColorStateList paramColorStateList) {
    p(paramd).f(paramColorStateList);
  }
  
  public void o(d paramd, float paramFloat) {
    p(paramd).g(paramFloat, paramd.e(), paramd.d());
    i(paramd);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/cardview/widget/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */