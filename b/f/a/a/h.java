package b.f.a.a;

import androidx.constraintlayout.motion.widget.s;

public class h {
  float a;
  
  float b;
  
  float c;
  
  float d;
  
  float e;
  
  float f;
  
  public void a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float[] paramArrayOffloat) {
    float f1 = paramArrayOffloat[0];
    float f2 = paramArrayOffloat[1];
    paramFloat1 = (paramFloat1 - 0.5F) * 2.0F;
    float f3 = (paramFloat2 - 0.5F) * 2.0F;
    float f4 = this.c;
    float f5 = this.d;
    paramFloat2 = this.a;
    float f6 = this.b;
    float f7 = (float)Math.toRadians(this.f);
    float f8 = (float)Math.toRadians(this.e);
    double d1 = (-paramInt1 * paramFloat1);
    double d2 = f7;
    double d3 = Math.sin(d2);
    Double.isNaN(d1);
    double d4 = (paramInt2 * f3);
    double d5 = Math.cos(d2);
    Double.isNaN(d4);
    f7 = (float)(d1 * d3 - d5 * d4);
    d1 = (paramInt1 * paramFloat1);
    d5 = Math.cos(d2);
    Double.isNaN(d1);
    d2 = Math.sin(d2);
    Double.isNaN(d4);
    float f9 = (float)(d1 * d5 - d4 * d2);
    paramArrayOffloat[0] = f1 + f4 + paramFloat2 * paramFloat1 + f7 * f8;
    paramArrayOffloat[1] = f2 + f5 + f6 * f3 + f8 * f9;
  }
  
  public void b() {
    this.e = 0.0F;
    this.d = 0.0F;
    this.c = 0.0F;
    this.b = 0.0F;
    this.a = 0.0F;
  }
  
  public void c(androidx.constraintlayout.motion.widget.h paramh, float paramFloat) {
    if (paramh != null)
      this.e = paramh.b(paramFloat); 
  }
  
  public void d(s params, float paramFloat) {
    if (params != null) {
      this.e = params.b(paramFloat);
      this.f = params.a(paramFloat);
    } 
  }
  
  public void e(androidx.constraintlayout.motion.widget.h paramh1, androidx.constraintlayout.motion.widget.h paramh2, float paramFloat) {
    if (paramh1 == null && paramh2 == null)
      return; 
    if (paramh1 == null)
      this.a = paramh1.b(paramFloat); 
    if (paramh2 == null)
      this.b = paramh2.b(paramFloat); 
  }
  
  public void f(s params1, s params2, float paramFloat) {
    if (params1 != null)
      this.a = params1.b(paramFloat); 
    if (params2 != null)
      this.b = params2.b(paramFloat); 
  }
  
  public void g(androidx.constraintlayout.motion.widget.h paramh1, androidx.constraintlayout.motion.widget.h paramh2, float paramFloat) {
    if (paramh1 != null)
      this.c = paramh1.b(paramFloat); 
    if (paramh2 != null)
      this.d = paramh2.b(paramFloat); 
  }
  
  public void h(s params1, s params2, float paramFloat) {
    if (params1 != null)
      this.c = params1.b(paramFloat); 
    if (params2 != null)
      this.d = params2.b(paramFloat); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */