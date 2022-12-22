package b.f.a.a;

import androidx.constraintlayout.motion.widget.p;

public class g extends p {
  private float a;
  
  private float b;
  
  private float c;
  
  private float d;
  
  private float e;
  
  private float f;
  
  private float g;
  
  private float h;
  
  private float i;
  
  private int j;
  
  private String k;
  
  private boolean l = false;
  
  private float m;
  
  private float n;
  
  private float b(float paramFloat) {
    float f1 = this.d;
    if (paramFloat <= f1) {
      float f = this.a;
      return f * paramFloat + (this.b - f) * paramFloat * paramFloat / f1 * 2.0F;
    } 
    int i = this.j;
    if (i == 1)
      return this.g; 
    float f2 = paramFloat - f1;
    f1 = this.e;
    if (f2 < f1) {
      paramFloat = this.g;
      float f = this.b;
      return paramFloat + f * f2 + (this.c - f) * f2 * f2 / f1 * 2.0F;
    } 
    if (i == 2)
      return this.h; 
    f1 = f2 - f1;
    f2 = this.f;
    if (f1 < f2) {
      float f = this.h;
      paramFloat = this.c;
      return f + paramFloat * f1 - paramFloat * f1 * f1 / f2 * 2.0F;
    } 
    return this.i;
  }
  
  private void e(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    float f1 = paramFloat1;
    if (paramFloat1 == 0.0F)
      f1 = 1.0E-4F; 
    this.a = f1;
    paramFloat1 = f1 / paramFloat3;
    float f2 = paramFloat1 * f1 / 2.0F;
    if (f1 < 0.0F) {
      paramFloat1 = (float)Math.sqrt(((paramFloat2 - -f1 / paramFloat3 * f1 / 2.0F) * paramFloat3));
      if (paramFloat1 < paramFloat4) {
        this.k = "backward accelerate, decelerate";
        this.j = 2;
        this.a = f1;
        this.b = paramFloat1;
        this.c = 0.0F;
        paramFloat4 = (paramFloat1 - f1) / paramFloat3;
        this.d = paramFloat4;
        this.e = paramFloat1 / paramFloat3;
        this.g = (f1 + paramFloat1) * paramFloat4 / 2.0F;
        this.h = paramFloat2;
        this.i = paramFloat2;
        return;
      } 
      this.k = "backward accelerate cruse decelerate";
      this.j = 3;
      this.a = f1;
      this.b = paramFloat4;
      this.c = paramFloat4;
      paramFloat1 = (paramFloat4 - f1) / paramFloat3;
      this.d = paramFloat1;
      paramFloat3 = paramFloat4 / paramFloat3;
      this.f = paramFloat3;
      paramFloat1 = (f1 + paramFloat4) * paramFloat1 / 2.0F;
      paramFloat3 = paramFloat3 * paramFloat4 / 2.0F;
      this.e = (paramFloat2 - paramFloat1 - paramFloat3) / paramFloat4;
      this.g = paramFloat1;
      this.h = paramFloat2 - paramFloat3;
      this.i = paramFloat2;
      return;
    } 
    if (f2 >= paramFloat2) {
      this.k = "hard stop";
      paramFloat1 = 2.0F * paramFloat2 / f1;
      this.j = 1;
      this.a = f1;
      this.b = 0.0F;
      this.g = paramFloat2;
      this.d = paramFloat1;
      return;
    } 
    float f3 = paramFloat2 - f2;
    f2 = f3 / f1;
    if (f2 + paramFloat1 < paramFloat5) {
      this.k = "cruse decelerate";
      this.j = 2;
      this.a = f1;
      this.b = f1;
      this.c = 0.0F;
      this.g = f3;
      this.h = paramFloat2;
      this.d = f2;
      this.e = paramFloat1;
      return;
    } 
    paramFloat1 = (float)Math.sqrt((paramFloat3 * paramFloat2 + f1 * f1 / 2.0F));
    f2 = (paramFloat1 - f1) / paramFloat3;
    this.d = f2;
    paramFloat5 = paramFloat1 / paramFloat3;
    this.e = paramFloat5;
    if (paramFloat1 < paramFloat4) {
      this.k = "accelerate decelerate";
      this.j = 2;
      this.a = f1;
      this.b = paramFloat1;
      this.c = 0.0F;
      this.d = f2;
      this.e = paramFloat5;
      this.g = (f1 + paramFloat1) * f2 / 2.0F;
      this.h = paramFloat2;
      return;
    } 
    this.k = "accelerate cruse decelerate";
    this.j = 3;
    this.a = f1;
    this.b = paramFloat4;
    this.c = paramFloat4;
    paramFloat5 = (paramFloat4 - f1) / paramFloat3;
    this.d = paramFloat5;
    paramFloat1 = paramFloat4 / paramFloat3;
    this.f = paramFloat1;
    paramFloat3 = (f1 + paramFloat4) * paramFloat5 / 2.0F;
    paramFloat1 = paramFloat1 * paramFloat4 / 2.0F;
    this.e = (paramFloat2 - paramFloat3 - paramFloat1) / paramFloat4;
    this.g = paramFloat3;
    this.h = paramFloat2 - paramFloat1;
    this.i = paramFloat2;
  }
  
  public float a() {
    float f;
    if (this.l) {
      f = -d(this.n);
    } else {
      f = d(this.n);
    } 
    return f;
  }
  
  public void c(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    boolean bool;
    this.m = paramFloat1;
    if (paramFloat1 > paramFloat2) {
      bool = true;
    } else {
      bool = false;
    } 
    this.l = bool;
    if (bool) {
      e(-paramFloat3, paramFloat1 - paramFloat2, paramFloat5, paramFloat6, paramFloat4);
    } else {
      e(paramFloat3, paramFloat2 - paramFloat1, paramFloat5, paramFloat6, paramFloat4);
    } 
  }
  
  public float d(float paramFloat) {
    float f = this.d;
    if (paramFloat <= f) {
      float f1 = this.a;
      return f1 + (this.b - f1) * paramFloat / f;
    } 
    int i = this.j;
    if (i == 1)
      return 0.0F; 
    f = paramFloat - f;
    paramFloat = this.e;
    if (f < paramFloat) {
      float f1 = this.b;
      return f1 + (this.c - f1) * f / paramFloat;
    } 
    if (i == 2)
      return this.h; 
    f -= paramFloat;
    paramFloat = this.f;
    if (f < paramFloat) {
      float f1 = this.c;
      return f1 - f * f1 / paramFloat;
    } 
    return this.i;
  }
  
  public float getInterpolation(float paramFloat) {
    float f = b(paramFloat);
    this.n = paramFloat;
    if (this.l) {
      paramFloat = this.m - f;
    } else {
      paramFloat = this.m + f;
    } 
    return paramFloat;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */