package b.f.a.a;

public abstract class b {
  public static b a(int paramInt, double[] paramArrayOfdouble, double[][] paramArrayOfdouble1) {
    if (paramArrayOfdouble.length == 1)
      paramInt = 2; 
    return (b)((paramInt != 0) ? ((paramInt != 2) ? new d(paramArrayOfdouble, paramArrayOfdouble1) : new a(paramArrayOfdouble[0], paramArrayOfdouble1[0])) : new e(paramArrayOfdouble, paramArrayOfdouble1));
  }
  
  public static b b(int[] paramArrayOfint, double[] paramArrayOfdouble, double[][] paramArrayOfdouble1) {
    return new a(paramArrayOfint, paramArrayOfdouble, paramArrayOfdouble1);
  }
  
  public abstract double c(double paramDouble, int paramInt);
  
  public abstract void d(double paramDouble, double[] paramArrayOfdouble);
  
  public abstract void e(double paramDouble, float[] paramArrayOffloat);
  
  public abstract double f(double paramDouble, int paramInt);
  
  public abstract void g(double paramDouble, double[] paramArrayOfdouble);
  
  public abstract double[] h();
  
  static class a extends b {
    double a;
    
    double[] b;
    
    a(double param1Double, double[] param1ArrayOfdouble) {
      this.a = param1Double;
      this.b = param1ArrayOfdouble;
    }
    
    public double c(double param1Double, int param1Int) {
      return this.b[param1Int];
    }
    
    public void d(double param1Double, double[] param1ArrayOfdouble) {
      double[] arrayOfDouble = this.b;
      System.arraycopy(arrayOfDouble, 0, param1ArrayOfdouble, 0, arrayOfDouble.length);
    }
    
    public void e(double param1Double, float[] param1ArrayOffloat) {
      byte b1 = 0;
      while (true) {
        double[] arrayOfDouble = this.b;
        if (b1 < arrayOfDouble.length) {
          param1ArrayOffloat[b1] = (float)arrayOfDouble[b1];
          b1++;
          continue;
        } 
        break;
      } 
    }
    
    public double f(double param1Double, int param1Int) {
      return 0.0D;
    }
    
    public void g(double param1Double, double[] param1ArrayOfdouble) {
      for (byte b1 = 0; b1 < this.b.length; b1++)
        param1ArrayOfdouble[b1] = 0.0D; 
    }
    
    public double[] h() {
      return new double[] { this.a };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */