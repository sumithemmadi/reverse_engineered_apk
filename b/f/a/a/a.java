package b.f.a.a;

import java.util.Arrays;

class a extends b {
  private final double[] a;
  
  a[] b;
  
  public a(int[] paramArrayOfint, double[] paramArrayOfdouble, double[][] paramArrayOfdouble1) {
    this.a = paramArrayOfdouble;
    this.b = new a[paramArrayOfdouble.length - 1];
    int i = 0;
    byte b1 = 1;
    byte b2 = 1;
    while (true) {
      a[] arrayOfA = this.b;
      if (i < arrayOfA.length) {
        int j = paramArrayOfint[i];
        if (j != 0) {
          if (j != 1) {
            if (j != 2) {
              if (j == 3) {
                if (b1 == 1) {
                  b1 = 2;
                } else {
                  b1 = 1;
                } 
                b2 = b1;
              } 
            } else {
              b1 = 2;
              b2 = 2;
            } 
          } else {
            b1 = 1;
            b2 = 1;
          } 
        } else {
          b2 = 3;
        } 
        double d = paramArrayOfdouble[i];
        j = i + 1;
        arrayOfA[i] = new a(b2, d, paramArrayOfdouble[j], paramArrayOfdouble1[i][0], paramArrayOfdouble1[i][1], paramArrayOfdouble1[j][0], paramArrayOfdouble1[j][1]);
        i = j;
        continue;
      } 
      break;
    } 
  }
  
  public double c(double paramDouble, int paramInt) {
    double d;
    byte b2;
    a[] arrayOfA = this.b;
    byte b1 = 0;
    if (paramDouble < (arrayOfA[0]).d) {
      d = (arrayOfA[0]).d;
      b2 = b1;
    } else {
      b2 = b1;
      d = paramDouble;
      if (paramDouble > (arrayOfA[arrayOfA.length - 1]).e) {
        d = (arrayOfA[arrayOfA.length - 1]).e;
        b2 = b1;
      } 
    } 
    while (true) {
      arrayOfA = this.b;
      if (b2 < arrayOfA.length) {
        if (d <= (arrayOfA[b2]).e) {
          if ((arrayOfA[b2]).s)
            return (paramInt == 0) ? arrayOfA[b2].f(d) : arrayOfA[b2].g(d); 
          arrayOfA[b2].k(d);
          return (paramInt == 0) ? this.b[b2].h() : this.b[b2].i();
        } 
        b2++;
        continue;
      } 
      return Double.NaN;
    } 
  }
  
  public void d(double paramDouble, double[] paramArrayOfdouble) {
    a[] arrayOfA = this.b;
    double d = paramDouble;
    if (paramDouble < (arrayOfA[0]).d)
      d = (arrayOfA[0]).d; 
    paramDouble = d;
    if (d > (arrayOfA[arrayOfA.length - 1]).e)
      paramDouble = (arrayOfA[arrayOfA.length - 1]).e; 
    byte b1 = 0;
    while (true) {
      arrayOfA = this.b;
      if (b1 < arrayOfA.length) {
        if (paramDouble <= (arrayOfA[b1]).e) {
          if ((arrayOfA[b1]).s) {
            paramArrayOfdouble[0] = arrayOfA[b1].f(paramDouble);
            paramArrayOfdouble[1] = this.b[b1].g(paramDouble);
            return;
          } 
          arrayOfA[b1].k(paramDouble);
          paramArrayOfdouble[0] = this.b[b1].h();
          paramArrayOfdouble[1] = this.b[b1].i();
          return;
        } 
        b1++;
        continue;
      } 
      break;
    } 
  }
  
  public void e(double paramDouble, float[] paramArrayOffloat) {
    double d;
    a[] arrayOfA = this.b;
    if (paramDouble < (arrayOfA[0]).d) {
      d = (arrayOfA[0]).d;
    } else {
      d = paramDouble;
      if (paramDouble > (arrayOfA[arrayOfA.length - 1]).e)
        d = (arrayOfA[arrayOfA.length - 1]).e; 
    } 
    byte b1 = 0;
    while (true) {
      arrayOfA = this.b;
      if (b1 < arrayOfA.length) {
        if (d <= (arrayOfA[b1]).e) {
          if ((arrayOfA[b1]).s) {
            paramArrayOffloat[0] = (float)arrayOfA[b1].f(d);
            paramArrayOffloat[1] = (float)this.b[b1].g(d);
            return;
          } 
          arrayOfA[b1].k(d);
          paramArrayOffloat[0] = (float)this.b[b1].h();
          paramArrayOffloat[1] = (float)this.b[b1].i();
          return;
        } 
        b1++;
        continue;
      } 
      break;
    } 
  }
  
  public double f(double paramDouble, int paramInt) {
    a[] arrayOfA = this.b;
    byte b1 = 0;
    double d = paramDouble;
    if (paramDouble < (arrayOfA[0]).d)
      d = (arrayOfA[0]).d; 
    byte b2 = b1;
    paramDouble = d;
    if (d > (arrayOfA[arrayOfA.length - 1]).e) {
      paramDouble = (arrayOfA[arrayOfA.length - 1]).e;
      b2 = b1;
    } 
    while (true) {
      arrayOfA = this.b;
      if (b2 < arrayOfA.length) {
        if (paramDouble <= (arrayOfA[b2]).e) {
          if ((arrayOfA[b2]).s)
            return (paramInt == 0) ? arrayOfA[b2].d(paramDouble) : arrayOfA[b2].e(paramDouble); 
          arrayOfA[b2].k(paramDouble);
          return (paramInt == 0) ? this.b[b2].b() : this.b[b2].c();
        } 
        b2++;
        continue;
      } 
      return Double.NaN;
    } 
  }
  
  public void g(double paramDouble, double[] paramArrayOfdouble) {
    double d;
    a[] arrayOfA = this.b;
    if (paramDouble < (arrayOfA[0]).d) {
      d = (arrayOfA[0]).d;
    } else {
      d = paramDouble;
      if (paramDouble > (arrayOfA[arrayOfA.length - 1]).e)
        d = (arrayOfA[arrayOfA.length - 1]).e; 
    } 
    byte b1 = 0;
    while (true) {
      arrayOfA = this.b;
      if (b1 < arrayOfA.length) {
        if (d <= (arrayOfA[b1]).e) {
          if ((arrayOfA[b1]).s) {
            paramArrayOfdouble[0] = arrayOfA[b1].d(d);
            paramArrayOfdouble[1] = this.b[b1].e(d);
            return;
          } 
          arrayOfA[b1].k(d);
          paramArrayOfdouble[0] = this.b[b1].b();
          paramArrayOfdouble[1] = this.b[b1].c();
          return;
        } 
        b1++;
        continue;
      } 
      break;
    } 
  }
  
  public double[] h() {
    return this.a;
  }
  
  private static class a {
    private static double[] a = new double[91];
    
    double[] b;
    
    double c;
    
    double d;
    
    double e;
    
    double f;
    
    double g;
    
    double h;
    
    double i;
    
    double j;
    
    double k;
    
    double l;
    
    double m;
    
    double n;
    
    double o;
    
    double p;
    
    double q;
    
    boolean r;
    
    boolean s;
    
    a(int param1Int, double param1Double1, double param1Double2, double param1Double3, double param1Double4, double param1Double5, double param1Double6) {
      boolean bool = false;
      this.s = false;
      boolean bool1 = true;
      if (param1Int == 1)
        bool = true; 
      this.r = bool;
      this.d = param1Double1;
      this.e = param1Double2;
      this.j = 1.0D / (param1Double2 - param1Double1);
      if (3 == param1Int)
        this.s = true; 
      param1Double2 = param1Double5 - param1Double3;
      param1Double1 = param1Double6 - param1Double4;
      if (this.s || Math.abs(param1Double2) < 0.001D || Math.abs(param1Double1) < 0.001D) {
        this.s = true;
        this.f = param1Double3;
        this.g = param1Double5;
        this.h = param1Double4;
        this.i = param1Double6;
        param1Double3 = Math.hypot(param1Double1, param1Double2);
        this.c = param1Double3;
        this.o = param1Double3 * this.j;
        param1Double4 = this.e;
        param1Double3 = this.d;
        this.m = param1Double2 / (param1Double4 - param1Double3);
        this.n = param1Double1 / (param1Double4 - param1Double3);
        return;
      } 
      this.b = new double[101];
      bool = this.r;
      if (bool) {
        param1Int = -1;
      } else {
        param1Int = 1;
      } 
      double d = param1Int;
      Double.isNaN(d);
      this.k = param1Double2 * d;
      if (bool) {
        param1Int = bool1;
      } else {
        param1Int = -1;
      } 
      param1Double2 = param1Int;
      Double.isNaN(param1Double2);
      this.l = param1Double1 * param1Double2;
      if (bool) {
        param1Double1 = param1Double5;
      } else {
        param1Double1 = param1Double3;
      } 
      this.m = param1Double1;
      if (bool) {
        param1Double1 = param1Double4;
      } else {
        param1Double1 = param1Double6;
      } 
      this.n = param1Double1;
      a(param1Double3, param1Double4, param1Double5, param1Double6);
      this.o = this.c * this.j;
    }
    
    private void a(double param1Double1, double param1Double2, double param1Double3, double param1Double4) {
      byte b = 0;
      double d1 = 0.0D;
      double d2 = 0.0D;
      double d3 = 0.0D;
      while (true) {
        double[] arrayOfDouble = a;
        if (b < arrayOfDouble.length) {
          double d4 = b;
          Double.isNaN(d4);
          double d5 = (arrayOfDouble.length - 1);
          Double.isNaN(d5);
          d5 = Math.toRadians(d4 * 90.0D / d5);
          d4 = Math.sin(d5);
          d5 = Math.cos(d5);
          d4 *= param1Double3 - param1Double1;
          d5 *= param1Double2 - param1Double4;
          if (b > 0) {
            d1 = Math.hypot(d4 - d2, d5 - d3) + d1;
            a[b] = d1;
          } 
          b++;
          d3 = d5;
          d2 = d4;
          continue;
        } 
        this.c = d1;
        b = 0;
        while (true) {
          arrayOfDouble = a;
          if (b < arrayOfDouble.length) {
            arrayOfDouble[b] = arrayOfDouble[b] / d1;
            b++;
            continue;
          } 
          b = 0;
          while (true) {
            arrayOfDouble = this.b;
            if (b < arrayOfDouble.length) {
              param1Double2 = b;
              param1Double1 = (arrayOfDouble.length - 1);
              Double.isNaN(param1Double2);
              Double.isNaN(param1Double1);
              param1Double2 /= param1Double1;
              int i = Arrays.binarySearch(a, param1Double2);
              if (i >= 0) {
                this.b[b] = (i / (a.length - 1));
              } else if (i == -1) {
                this.b[b] = 0.0D;
              } else {
                int j = -i;
                i = j - 2;
                param1Double1 = i;
                arrayOfDouble = a;
                param1Double3 = (param1Double2 - arrayOfDouble[i]) / (arrayOfDouble[j - 1] - arrayOfDouble[i]);
                Double.isNaN(param1Double1);
                param1Double2 = (arrayOfDouble.length - 1);
                Double.isNaN(param1Double2);
                param1Double1 = (param1Double1 + param1Double3) / param1Double2;
                this.b[b] = param1Double1;
              } 
              b++;
              continue;
            } 
            break;
          } 
          return;
        } 
        break;
      } 
    }
    
    double b() {
      double d1 = this.k * this.q;
      double d2 = -this.l;
      double d3 = this.p;
      d3 = this.o / Math.hypot(d1, d2 * d3);
      d2 = d1;
      if (this.r)
        d2 = -d1; 
      return d2 * d3;
    }
    
    double c() {
      double d1 = this.k;
      double d2 = this.q;
      double d3 = -this.l * this.p;
      d2 = this.o / Math.hypot(d1 * d2, d3);
      if (this.r) {
        d3 = -d3 * d2;
      } else {
        d3 *= d2;
      } 
      return d3;
    }
    
    public double d(double param1Double) {
      return this.m;
    }
    
    public double e(double param1Double) {
      return this.n;
    }
    
    public double f(double param1Double) {
      double d1 = this.d;
      double d2 = this.j;
      double d3 = this.f;
      return d3 + (param1Double - d1) * d2 * (this.g - d3);
    }
    
    public double g(double param1Double) {
      double d1 = this.d;
      double d2 = this.j;
      double d3 = this.h;
      return d3 + (param1Double - d1) * d2 * (this.i - d3);
    }
    
    double h() {
      return this.m + this.k * this.p;
    }
    
    double i() {
      return this.n + this.l * this.q;
    }
    
    double j(double param1Double) {
      if (param1Double <= 0.0D)
        return 0.0D; 
      if (param1Double >= 1.0D)
        return 1.0D; 
      double[] arrayOfDouble = this.b;
      double d = (arrayOfDouble.length - 1);
      Double.isNaN(d);
      d = param1Double * d;
      int i = (int)d;
      param1Double = i;
      Double.isNaN(param1Double);
      return arrayOfDouble[i] + (d - param1Double) * (arrayOfDouble[i + 1] - arrayOfDouble[i]);
    }
    
    void k(double param1Double) {
      if (this.r) {
        param1Double = this.e - param1Double;
      } else {
        param1Double -= this.d;
      } 
      param1Double = j(param1Double * this.j) * 1.5707963267948966D;
      this.p = Math.sin(param1Double);
      this.q = Math.cos(param1Double);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */