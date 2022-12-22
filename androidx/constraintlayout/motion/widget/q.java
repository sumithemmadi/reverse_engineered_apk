package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.b;
import b.f.a.a.c;
import java.util.Arrays;
import java.util.LinkedHashMap;

class q implements Comparable<q> {
  static String[] b = new String[] { "position", "x", "y", "width", "height", "pathRotate" };
  
  c c;
  
  int d = 0;
  
  float e;
  
  float f;
  
  float g;
  
  float h;
  
  float i;
  
  float j;
  
  float k = Float.NaN;
  
  float l = Float.NaN;
  
  int m = c.a;
  
  LinkedHashMap<String, ConstraintAttribute> n = new LinkedHashMap<String, ConstraintAttribute>();
  
  int o = 0;
  
  double[] p = new double[18];
  
  double[] q = new double[18];
  
  public q() {}
  
  public q(int paramInt1, int paramInt2, j paramj, q paramq1, q paramq2) {
    int i = paramj.q;
    if (i != 1) {
      if (i != 2) {
        s(paramj, paramq1, paramq2);
        return;
      } 
      u(paramInt1, paramInt2, paramj, paramq1, paramq2);
      return;
    } 
    t(paramj, paramq1, paramq2);
  }
  
  private boolean f(float paramFloat1, float paramFloat2) {
    boolean bool = Float.isNaN(paramFloat1);
    boolean bool1 = true;
    boolean bool2 = true;
    if (bool || Float.isNaN(paramFloat2)) {
      if (Float.isNaN(paramFloat1) != Float.isNaN(paramFloat2)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      } 
      return bool2;
    } 
    if (Math.abs(paramFloat1 - paramFloat2) <= 1.0E-6F)
      bool2 = false; 
    return bool2;
  }
  
  public void a(b.a parama) {
    this.c = c.c(parama.c.d);
    b.c c1 = parama.c;
    this.m = c1.e;
    this.k = c1.h;
    this.d = c1.f;
    this.l = parama.b.e;
    for (String str : parama.f.keySet()) {
      ConstraintAttribute constraintAttribute = (ConstraintAttribute)parama.f.get(str);
      if (constraintAttribute.c() != ConstraintAttribute.AttributeType.f)
        this.n.put(str, constraintAttribute); 
    } 
  }
  
  public int e(q paramq) {
    return Float.compare(this.f, paramq.f);
  }
  
  void i(q paramq, boolean[] paramArrayOfboolean, String[] paramArrayOfString, boolean paramBoolean) {
    paramArrayOfboolean[0] = paramArrayOfboolean[0] | f(this.f, paramq.f);
    paramArrayOfboolean[1] = paramArrayOfboolean[1] | f(this.g, paramq.g) | paramBoolean;
    boolean bool = paramArrayOfboolean[2];
    paramArrayOfboolean[2] = paramBoolean | f(this.h, paramq.h) | bool;
    paramArrayOfboolean[3] = paramArrayOfboolean[3] | f(this.i, paramq.i);
    paramBoolean = paramArrayOfboolean[4];
    paramArrayOfboolean[4] = f(this.j, paramq.j) | paramBoolean;
  }
  
  void k(double[] paramArrayOfdouble, int[] paramArrayOfint) {
    float f1 = this.f;
    byte b = 0;
    float f2 = this.g;
    float f3 = this.h;
    float f4 = this.i;
    float f5 = this.j;
    float f6 = this.k;
    int i;
    for (i = 0; b < paramArrayOfint.length; i = j) {
      int j = i;
      if (paramArrayOfint[b] < 6) {
        j = paramArrayOfint[b];
        (new float[6])[0] = f1;
        (new float[6])[1] = f2;
        (new float[6])[2] = f3;
        (new float[6])[3] = f4;
        (new float[6])[4] = f5;
        (new float[6])[5] = f6;
        paramArrayOfdouble[i] = (new float[6])[j];
        j = i + 1;
      } 
      b++;
    } 
  }
  
  void l(int[] paramArrayOfint, double[] paramArrayOfdouble, float[] paramArrayOffloat, int paramInt) {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.i;
    float f4 = this.j;
    for (byte b = 0; b < paramArrayOfint.length; b++) {
      float f = (float)paramArrayOfdouble[b];
      int i = paramArrayOfint[b];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              f4 = f; 
          } else {
            f3 = f;
          } 
        } else {
          f2 = f;
        } 
      } else {
        f1 = f;
      } 
    } 
    paramArrayOffloat[paramInt] = f1 + f3 / 2.0F + 0.0F;
    paramArrayOffloat[paramInt + 1] = f2 + f4 / 2.0F + 0.0F;
  }
  
  int m(String paramString, double[] paramArrayOfdouble, int paramInt) {
    ConstraintAttribute constraintAttribute = this.n.get(paramString);
    if (constraintAttribute.f() == 1) {
      paramArrayOfdouble[paramInt] = constraintAttribute.d();
      return 1;
    } 
    int i = constraintAttribute.f();
    float[] arrayOfFloat = new float[i];
    constraintAttribute.e(arrayOfFloat);
    byte b = 0;
    while (b < i) {
      paramArrayOfdouble[paramInt] = arrayOfFloat[b];
      b++;
      paramInt++;
    } 
    return i;
  }
  
  int n(String paramString) {
    return ((ConstraintAttribute)this.n.get(paramString)).f();
  }
  
  void q(int[] paramArrayOfint, double[] paramArrayOfdouble, float[] paramArrayOffloat, int paramInt) {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.i;
    float f4 = this.j;
    int i;
    for (i = 0; i < paramArrayOfint.length; i++) {
      float f = (float)paramArrayOfdouble[i];
      int k = paramArrayOfint[i];
      if (k != 1) {
        if (k != 2) {
          if (k != 3) {
            if (k == 4)
              f4 = f; 
          } else {
            f3 = f;
          } 
        } else {
          f2 = f;
        } 
      } else {
        f1 = f;
      } 
    } 
    float f5 = f3 + f1;
    f4 += f2;
    Float.isNaN(Float.NaN);
    Float.isNaN(Float.NaN);
    i = paramInt + 1;
    paramArrayOffloat[paramInt] = f1 + 0.0F;
    paramInt = i + 1;
    paramArrayOffloat[i] = f2 + 0.0F;
    int j = paramInt + 1;
    paramArrayOffloat[paramInt] = f5 + 0.0F;
    i = j + 1;
    paramArrayOffloat[j] = f2 + 0.0F;
    paramInt = i + 1;
    paramArrayOffloat[i] = f5 + 0.0F;
    i = paramInt + 1;
    paramArrayOffloat[paramInt] = f4 + 0.0F;
    paramArrayOffloat[i] = f1 + 0.0F;
    paramArrayOffloat[i + 1] = f4 + 0.0F;
  }
  
  boolean r(String paramString) {
    return this.n.containsKey(paramString);
  }
  
  void s(j paramj, q paramq1, q paramq2) {
    float f1 = paramj.b / 100.0F;
    this.e = f1;
    this.d = paramj.j;
    if (Float.isNaN(paramj.k)) {
      f2 = f1;
    } else {
      f2 = paramj.k;
    } 
    if (Float.isNaN(paramj.l)) {
      f3 = f1;
    } else {
      f3 = paramj.l;
    } 
    float f4 = paramq2.i;
    float f5 = paramq1.i;
    float f6 = paramq2.j;
    float f7 = paramq1.j;
    this.f = this.e;
    float f8 = paramq1.g;
    float f9 = f5 / 2.0F;
    float f10 = paramq1.h;
    float f11 = f7 / 2.0F;
    float f12 = paramq2.g;
    float f13 = f4 / 2.0F;
    float f14 = paramq2.h;
    float f15 = f6 / 2.0F;
    f9 = f12 + f13 - f9 + f8;
    f14 = f14 + f15 - f10 + f11;
    float f2 = (f4 - f5) * f2;
    f4 = f2 / 2.0F;
    this.g = (int)(f8 + f9 * f1 - f4);
    float f3 = (f6 - f7) * f3;
    f6 = f3 / 2.0F;
    this.h = (int)(f10 + f14 * f1 - f6);
    this.i = (int)(f5 + f2);
    this.j = (int)(f7 + f3);
    if (Float.isNaN(paramj.m)) {
      f2 = f1;
    } else {
      f2 = paramj.m;
    } 
    boolean bool = Float.isNaN(paramj.p);
    f10 = 0.0F;
    if (bool) {
      f3 = 0.0F;
    } else {
      f3 = paramj.p;
    } 
    if (!Float.isNaN(paramj.n))
      f1 = paramj.n; 
    if (!Float.isNaN(paramj.o))
      f10 = paramj.o; 
    this.o = 2;
    this.g = (int)(paramq1.g + f2 * f9 + f10 * f14 - f4);
    this.h = (int)(paramq1.h + f9 * f3 + f14 * f1 - f6);
    this.c = c.c(paramj.h);
    this.m = paramj.i;
  }
  
  void t(j paramj, q paramq1, q paramq2) {
    float f1 = paramj.b / 100.0F;
    this.e = f1;
    this.d = paramj.j;
    if (Float.isNaN(paramj.k)) {
      f2 = f1;
    } else {
      f2 = paramj.k;
    } 
    if (Float.isNaN(paramj.l)) {
      f3 = f1;
    } else {
      f3 = paramj.l;
    } 
    float f4 = paramq2.i;
    float f5 = paramq1.i;
    float f6 = paramq2.j;
    float f7 = paramq1.j;
    this.f = this.e;
    if (!Float.isNaN(paramj.m))
      f1 = paramj.m; 
    float f8 = paramq1.g;
    float f9 = paramq1.i;
    float f10 = f9 / 2.0F;
    float f11 = paramq1.h;
    float f12 = paramq1.j;
    float f13 = f12 / 2.0F;
    float f14 = paramq2.g;
    float f15 = paramq2.i / 2.0F;
    float f16 = paramq2.h;
    float f17 = paramq2.j / 2.0F;
    f15 = f14 + f15 - f10 + f8;
    f16 = f16 + f17 - f13 + f11;
    f17 = f15 * f1;
    f4 = (f4 - f5) * f2;
    float f2 = f4 / 2.0F;
    this.g = (int)(f8 + f17 - f2);
    f8 = f1 * f16;
    f1 = (f6 - f7) * f3;
    float f3 = f1 / 2.0F;
    this.h = (int)(f11 + f8 - f3);
    this.i = (int)(f9 + f4);
    this.j = (int)(f12 + f1);
    if (Float.isNaN(paramj.n)) {
      f1 = 0.0F;
    } else {
      f1 = paramj.n;
    } 
    f6 = -f16;
    this.o = 1;
    f2 = (int)(paramq1.g + f17 - f2);
    this.g = f2;
    f3 = (int)(paramq1.h + f8 - f3);
    this.h = f3;
    this.g = f2 + f6 * f1;
    this.h = f3 + f15 * f1;
    this.c = c.c(paramj.h);
    this.m = paramj.i;
  }
  
  void u(int paramInt1, int paramInt2, j paramj, q paramq1, q paramq2) {
    float f1 = paramj.b / 100.0F;
    this.e = f1;
    this.d = paramj.j;
    if (Float.isNaN(paramj.k)) {
      f2 = f1;
    } else {
      f2 = paramj.k;
    } 
    if (Float.isNaN(paramj.l)) {
      f3 = f1;
    } else {
      f3 = paramj.l;
    } 
    float f4 = paramq2.i;
    float f5 = paramq1.i;
    float f6 = paramq2.j;
    float f7 = paramq1.j;
    this.f = this.e;
    float f8 = paramq1.g;
    float f9 = f5 / 2.0F;
    float f10 = paramq1.h;
    float f11 = f7 / 2.0F;
    float f12 = paramq2.g;
    float f13 = f4 / 2.0F;
    float f14 = paramq2.h;
    float f15 = f6 / 2.0F;
    float f2 = (f4 - f5) * f2;
    this.g = (int)(f8 + (f12 + f13 - f9 + f8) * f1 - f2 / 2.0F);
    float f3 = (f6 - f7) * f3;
    this.h = (int)(f10 + (f14 + f15 - f10 + f11) * f1 - f3 / 2.0F);
    this.i = (int)(f5 + f2);
    this.j = (int)(f7 + f3);
    this.o = 3;
    if (!Float.isNaN(paramj.m)) {
      paramInt1 = (int)(paramInt1 - this.i);
      this.g = (int)(paramj.m * paramInt1);
    } 
    if (!Float.isNaN(paramj.n)) {
      paramInt1 = (int)(paramInt2 - this.j);
      this.h = (int)(paramj.n * paramInt1);
    } 
    this.c = c.c(paramj.h);
    this.m = paramj.i;
  }
  
  void v(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.g = paramFloat1;
    this.h = paramFloat2;
    this.i = paramFloat3;
    this.j = paramFloat4;
  }
  
  void w(float paramFloat1, float paramFloat2, float[] paramArrayOffloat, int[] paramArrayOfint, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2) {
    byte b = 0;
    float f1 = 0.0F;
    float f2 = 0.0F;
    float f3 = 0.0F;
    float f4 = 0.0F;
    while (b < paramArrayOfint.length) {
      float f = (float)paramArrayOfdouble1[b];
      double d = paramArrayOfdouble2[b];
      int i = paramArrayOfint[b];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i == 4)
              f4 = f; 
          } else {
            f2 = f;
          } 
        } else {
          f3 = f;
        } 
      } else {
        f1 = f;
      } 
      b++;
    } 
    float f5 = f1 - 0.0F * f2 / 2.0F;
    f3 -= 0.0F * f4 / 2.0F;
    paramArrayOffloat[0] = f5 * (1.0F - paramFloat1) + (f2 * 1.0F + f5) * paramFloat1 + 0.0F;
    paramArrayOffloat[1] = f3 * (1.0F - paramFloat2) + (f4 * 1.0F + f3) * paramFloat2 + 0.0F;
  }
  
  void x(View paramView, int[] paramArrayOfint, double[] paramArrayOfdouble1, double[] paramArrayOfdouble2, double[] paramArrayOfdouble3) {
    float f1 = this.g;
    float f2 = this.h;
    float f3 = this.i;
    float f4 = this.j;
    if (paramArrayOfint.length != 0 && this.p.length <= paramArrayOfint[paramArrayOfint.length - 1]) {
      int i = paramArrayOfint[paramArrayOfint.length - 1] + 1;
      this.p = new double[i];
      this.q = new double[i];
    } 
    Arrays.fill(this.p, Double.NaN);
    byte b;
    for (b = 0; b < paramArrayOfint.length; b++) {
      this.p[paramArrayOfint[b]] = paramArrayOfdouble1[b];
      this.q[paramArrayOfint[b]] = paramArrayOfdouble2[b];
    } 
    b = 0;
    float f5 = Float.NaN;
    float f6 = 0.0F;
    float f7 = 0.0F;
    float f8 = 0.0F;
    float f9 = 0.0F;
    while (true) {
      double[] arrayOfDouble = this.p;
      if (b < arrayOfDouble.length) {
        boolean bool = Double.isNaN(arrayOfDouble[b]);
        double d = 0.0D;
        if (!bool || (paramArrayOfdouble3 != null && paramArrayOfdouble3[b] != 0.0D)) {
          if (paramArrayOfdouble3 != null)
            d = paramArrayOfdouble3[b]; 
          if (!Double.isNaN(this.p[b]))
            d = this.p[b] + d; 
          float f10 = (float)d;
          float f11 = (float)this.q[b];
          if (b != 1) {
            if (b != 2) {
              if (b != 3) {
                if (b != 4) {
                  if (b == 5)
                    f5 = f10; 
                } else {
                  f4 = f10;
                  f9 = f11;
                } 
              } else {
                f3 = f10;
                f7 = f11;
              } 
            } else {
              f2 = f10;
              f8 = f11;
            } 
          } else {
            f6 = f11;
            f1 = f10;
          } 
        } 
        b++;
        continue;
      } 
      if (Float.isNaN(f5)) {
        if (!Float.isNaN(Float.NaN))
          paramView.setRotation(Float.NaN); 
      } else {
        float f10 = Float.NaN;
        if (Float.isNaN(Float.NaN))
          f10 = 0.0F; 
        float f11 = f7 / 2.0F;
        f9 /= 2.0F;
        double d2 = f10;
        double d1 = f5;
        double d3 = Math.toDegrees(Math.atan2((f8 + f9), (f6 + f11)));
        Double.isNaN(d1);
        Double.isNaN(d2);
        paramView.setRotation((float)(d2 + d1 + d3));
      } 
      float f = f1 + 0.5F;
      int i = (int)f;
      f1 = f2 + 0.5F;
      int j = (int)f1;
      int k = (int)(f + f3);
      int m = (int)(f1 + f4);
      int n = k - i;
      int i1 = m - j;
      if (n != paramView.getMeasuredWidth() || i1 != paramView.getMeasuredHeight()) {
        b = 1;
      } else {
        b = 0;
      } 
      if (b != 0)
        paramView.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), View.MeasureSpec.makeMeasureSpec(i1, 1073741824)); 
      paramView.layout(i, j, k, m);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */