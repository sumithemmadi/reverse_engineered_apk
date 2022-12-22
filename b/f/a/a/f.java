package b.f.a.a;

import java.util.Arrays;

public class f {
  float[] a = new float[0];
  
  double[] b = new double[0];
  
  double[] c;
  
  int d;
  
  double e = 6.283185307179586D;
  
  private boolean f = false;
  
  public void a(double paramDouble, float paramFloat) {
    int i = this.a.length + 1;
    int j = Arrays.binarySearch(this.b, paramDouble);
    int k = j;
    if (j < 0)
      k = -j - 1; 
    this.b = Arrays.copyOf(this.b, i);
    this.a = Arrays.copyOf(this.a, i);
    this.c = new double[i];
    double[] arrayOfDouble = this.b;
    System.arraycopy(arrayOfDouble, k, arrayOfDouble, k + 1, i - k - 1);
    this.b[k] = paramDouble;
    this.a[k] = paramFloat;
    this.f = false;
  }
  
  double b(double paramDouble) {
    double d2;
    double d1 = 0.0D;
    if (paramDouble <= 0.0D) {
      d2 = 1.0E-5D;
    } else {
      d2 = paramDouble;
      if (paramDouble >= 1.0D)
        d2 = 0.999999D; 
    } 
    int i = Arrays.binarySearch(this.b, d2);
    if (i > 0)
      return 0.0D; 
    paramDouble = d1;
    if (i != 0) {
      int j = -i - 1;
      float[] arrayOfFloat = this.a;
      float f1 = arrayOfFloat[j];
      i = j - 1;
      d1 = (f1 - arrayOfFloat[i]);
      double[] arrayOfDouble = this.b;
      paramDouble = arrayOfDouble[j];
      double d = arrayOfDouble[i];
      Double.isNaN(d1);
      d1 /= paramDouble - d;
      d = arrayOfFloat[i];
      paramDouble = arrayOfDouble[i];
      Double.isNaN(d);
      paramDouble = d - d1 * paramDouble + d2 * d1;
    } 
    return paramDouble;
  }
  
  double c(double paramDouble) {
    double d2;
    double d1 = 1.0D;
    if (paramDouble < 0.0D) {
      d2 = 0.0D;
    } else {
      d2 = paramDouble;
      if (paramDouble > 1.0D)
        d2 = 1.0D; 
    } 
    int i = Arrays.binarySearch(this.b, d2);
    if (i > 0) {
      paramDouble = d1;
    } else if (i != 0) {
      int j = -i - 1;
      float[] arrayOfFloat = this.a;
      float f1 = arrayOfFloat[j];
      i = j - 1;
      double d3 = (f1 - arrayOfFloat[i]);
      double[] arrayOfDouble = this.b;
      d1 = arrayOfDouble[j];
      paramDouble = arrayOfDouble[i];
      Double.isNaN(d3);
      double d4 = d3 / (d1 - paramDouble);
      d1 = this.c[i];
      d3 = arrayOfFloat[i];
      paramDouble = arrayOfDouble[i];
      Double.isNaN(d3);
      paramDouble = d1 + (d3 - paramDouble * d4) * (d2 - arrayOfDouble[i]) + d4 * (d2 * d2 - arrayOfDouble[i] * arrayOfDouble[i]) / 2.0D;
    } else {
      paramDouble = 0.0D;
    } 
    return paramDouble;
  }
  
  public double d(double paramDouble) {
    double d1;
    double d2;
    switch (this.d) {
      default:
        d1 = this.e * b(paramDouble);
        d2 = Math.cos(this.e * c(paramDouble));
        paramDouble = d1;
        return paramDouble * d2;
      case 6:
        d1 = b(paramDouble) * 4.0D;
        d2 = (c(paramDouble) * 4.0D + 2.0D) % 4.0D - 2.0D;
        paramDouble = d1;
        return paramDouble * d2;
      case 5:
        d1 = -this.e * b(paramDouble);
        d2 = Math.sin(this.e * c(paramDouble));
        paramDouble = d1;
        return paramDouble * d2;
      case 4:
        paramDouble = -b(paramDouble);
        return paramDouble * 2.0D;
      case 3:
        paramDouble = b(paramDouble);
        return paramDouble * 2.0D;
      case 2:
        d1 = b(paramDouble) * 4.0D;
        d2 = Math.signum((c(paramDouble) * 4.0D + 3.0D) % 4.0D - 2.0D);
        paramDouble = d1;
        return paramDouble * d2;
      case 1:
        break;
    } 
    return 0.0D;
  }
  
  public double e(double paramDouble) {
    switch (this.d) {
      default:
        return Math.sin(this.e * c(paramDouble));
      case 6:
        paramDouble = 1.0D - Math.abs(c(paramDouble) * 4.0D % 4.0D - 2.0D);
        paramDouble *= paramDouble;
        return 1.0D - paramDouble;
      case 5:
        return Math.cos(this.e * c(paramDouble));
      case 4:
        paramDouble = (c(paramDouble) * 2.0D + 1.0D) % 2.0D;
        return 1.0D - paramDouble;
      case 3:
        return (c(paramDouble) * 2.0D + 1.0D) % 2.0D - 1.0D;
      case 2:
        paramDouble = Math.abs((c(paramDouble) * 4.0D + 1.0D) % 4.0D - 2.0D);
        return 1.0D - paramDouble;
      case 1:
        break;
    } 
    return Math.signum(0.5D - c(paramDouble) % 1.0D);
  }
  
  public void f() {
    double d = 0.0D;
    byte b = 0;
    while (true) {
      float[] arrayOfFloat = this.a;
      if (b < arrayOfFloat.length) {
        double d2 = arrayOfFloat[b];
        Double.isNaN(d2);
        d += d2;
        b++;
        continue;
      } 
      double d1 = 0.0D;
      b = 1;
      while (true) {
        arrayOfFloat = this.a;
        if (b < arrayOfFloat.length) {
          int i = b - 1;
          float f1 = (arrayOfFloat[i] + arrayOfFloat[b]) / 2.0F;
          double[] arrayOfDouble = this.b;
          double d2 = arrayOfDouble[b];
          double d3 = arrayOfDouble[i];
          double d4 = f1;
          Double.isNaN(d4);
          d1 += (d2 - d3) * d4;
          b++;
          continue;
        } 
        b = 0;
        while (true) {
          arrayOfFloat = this.a;
          if (b < arrayOfFloat.length) {
            double d2 = arrayOfFloat[b];
            double d3 = d / d1;
            Double.isNaN(d2);
            arrayOfFloat[b] = (float)(d2 * d3);
            b++;
            continue;
          } 
          this.c[0] = 0.0D;
          b = 1;
          while (true) {
            arrayOfFloat = this.a;
            if (b < arrayOfFloat.length) {
              int i = b - 1;
              float f1 = (arrayOfFloat[i] + arrayOfFloat[b]) / 2.0F;
              double[] arrayOfDouble = this.b;
              double d2 = arrayOfDouble[b];
              d = arrayOfDouble[i];
              arrayOfDouble = this.c;
              double d3 = arrayOfDouble[i];
              d1 = f1;
              Double.isNaN(d1);
              arrayOfDouble[b] = d3 + (d2 - d) * d1;
              b++;
              continue;
            } 
            this.f = true;
            return;
          } 
          break;
        } 
        break;
      } 
      break;
    } 
  }
  
  public void g(int paramInt) {
    this.d = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("pos =");
    stringBuilder.append(Arrays.toString(this.b));
    stringBuilder.append(" period=");
    stringBuilder.append(Arrays.toString(this.a));
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */