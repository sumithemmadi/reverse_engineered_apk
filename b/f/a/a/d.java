package b.f.a.a;

public class d extends b {
  private double[] a;
  
  private double[][] b;
  
  private double c = Double.NaN;
  
  public d(double[] paramArrayOfdouble, double[][] paramArrayOfdouble1) {
    int i = paramArrayOfdouble.length;
    i = (paramArrayOfdouble1[0]).length;
    this.a = paramArrayOfdouble;
    this.b = paramArrayOfdouble1;
    if (i > 2) {
      double d1 = 0.0D;
      double d2 = d1;
      i = 0;
      while (i < paramArrayOfdouble.length) {
        double d3 = paramArrayOfdouble1[i][0];
        double d4 = paramArrayOfdouble1[i][0];
        if (i > 0)
          Math.hypot(d3 - d1, d4 - d2); 
        i++;
        d1 = d3;
        d2 = d4;
      } 
      this.c = 0.0D;
    } 
  }
  
  public double c(double paramDouble, int paramInt) {
    double[] arrayOfDouble = this.a;
    int i = arrayOfDouble.length;
    int j = 0;
    if (paramDouble <= arrayOfDouble[0])
      return this.b[0][paramInt]; 
    int k = i - 1;
    if (paramDouble >= arrayOfDouble[k])
      return this.b[k][paramInt]; 
    while (j < k) {
      arrayOfDouble = this.a;
      if (paramDouble == arrayOfDouble[j])
        return this.b[j][paramInt]; 
      i = j + 1;
      if (paramDouble < arrayOfDouble[i]) {
        double d1 = arrayOfDouble[i];
        double d2 = arrayOfDouble[j];
        paramDouble = (paramDouble - arrayOfDouble[j]) / (d1 - d2);
        double[][] arrayOfDouble1 = this.b;
        return arrayOfDouble1[j][paramInt] * (1.0D - paramDouble) + arrayOfDouble1[i][paramInt] * paramDouble;
      } 
      j = i;
    } 
    return 0.0D;
  }
  
  public void d(double paramDouble, double[] paramArrayOfdouble) {
    double[] arrayOfDouble = this.a;
    int i = arrayOfDouble.length;
    double[][] arrayOfDouble1 = this.b;
    boolean bool = false;
    int j = 0;
    int k = (arrayOfDouble1[0]).length;
    if (paramDouble <= arrayOfDouble[0]) {
      for (j = 0; j < k; j++)
        paramArrayOfdouble[j] = this.b[0][j]; 
      return;
    } 
    int m = i - 1;
    if (paramDouble >= arrayOfDouble[m]) {
      while (j < k) {
        paramArrayOfdouble[j] = this.b[m][j];
        j++;
      } 
      return;
    } 
    for (j = 0; j < m; j = n) {
      if (paramDouble == this.a[j])
        for (i = 0; i < k; i++)
          paramArrayOfdouble[i] = this.b[j][i];  
      double[] arrayOfDouble2 = this.a;
      int n = j + 1;
      if (paramDouble < arrayOfDouble2[n]) {
        double d1 = arrayOfDouble2[n];
        double d2 = arrayOfDouble2[j];
        paramDouble = (paramDouble - arrayOfDouble2[j]) / (d1 - d2);
        for (i = bool; i < k; i++) {
          double[][] arrayOfDouble3 = this.b;
          paramArrayOfdouble[i] = arrayOfDouble3[j][i] * (1.0D - paramDouble) + arrayOfDouble3[n][i] * paramDouble;
        } 
        return;
      } 
    } 
  }
  
  public void e(double paramDouble, float[] paramArrayOffloat) {
    double[] arrayOfDouble = this.a;
    int i = arrayOfDouble.length;
    double[][] arrayOfDouble1 = this.b;
    boolean bool = false;
    int j = 0;
    int k = (arrayOfDouble1[0]).length;
    if (paramDouble <= arrayOfDouble[0]) {
      for (j = 0; j < k; j++)
        paramArrayOffloat[j] = (float)this.b[0][j]; 
      return;
    } 
    int m = i - 1;
    if (paramDouble >= arrayOfDouble[m]) {
      while (j < k) {
        paramArrayOffloat[j] = (float)this.b[m][j];
        j++;
      } 
      return;
    } 
    for (j = 0; j < m; j = n) {
      if (paramDouble == this.a[j])
        for (i = 0; i < k; i++)
          paramArrayOffloat[i] = (float)this.b[j][i];  
      double[] arrayOfDouble2 = this.a;
      int n = j + 1;
      if (paramDouble < arrayOfDouble2[n]) {
        double d1 = arrayOfDouble2[n];
        double d2 = arrayOfDouble2[j];
        paramDouble = (paramDouble - arrayOfDouble2[j]) / (d1 - d2);
        for (i = bool; i < k; i++) {
          double[][] arrayOfDouble3 = this.b;
          paramArrayOffloat[i] = (float)(arrayOfDouble3[j][i] * (1.0D - paramDouble) + arrayOfDouble3[n][i] * paramDouble);
        } 
        return;
      } 
    } 
  }
  
  public double f(double paramDouble, int paramInt) {
    double d1;
    int k;
    double[] arrayOfDouble = this.a;
    int i = arrayOfDouble.length;
    int j = 0;
    if (paramDouble < arrayOfDouble[0]) {
      d1 = arrayOfDouble[0];
      k = j;
    } else {
      int m = i - 1;
      k = j;
      d1 = paramDouble;
      if (paramDouble >= arrayOfDouble[m]) {
        d1 = arrayOfDouble[m];
        k = j;
      } 
    } 
    while (k < i - 1) {
      arrayOfDouble = this.a;
      j = k + 1;
      if (d1 <= arrayOfDouble[j]) {
        d1 = arrayOfDouble[j];
        paramDouble = arrayOfDouble[k];
        double d2 = arrayOfDouble[k];
        double[][] arrayOfDouble1 = this.b;
        d2 = arrayOfDouble1[k][paramInt];
        return (arrayOfDouble1[j][paramInt] - d2) / (d1 - paramDouble);
      } 
      k = j;
    } 
    return 0.0D;
  }
  
  public void g(double paramDouble, double[] paramArrayOfdouble) {
    double d1;
    double[] arrayOfDouble = this.a;
    int i = arrayOfDouble.length;
    double[][] arrayOfDouble1 = this.b;
    byte b1 = 0;
    int j = (arrayOfDouble1[0]).length;
    if (paramDouble <= arrayOfDouble[0]) {
      d1 = arrayOfDouble[0];
    } else {
      int m = i - 1;
      d1 = paramDouble;
      if (paramDouble >= arrayOfDouble[m])
        d1 = arrayOfDouble[m]; 
    } 
    int k;
    for (k = 0; k < i - 1; k = m) {
      arrayOfDouble = this.a;
      int m = k + 1;
      if (d1 <= arrayOfDouble[m]) {
        paramDouble = arrayOfDouble[m];
        d1 = arrayOfDouble[k];
        double d2 = arrayOfDouble[k];
        while (b1 < j) {
          double[][] arrayOfDouble2 = this.b;
          d2 = arrayOfDouble2[k][b1];
          paramArrayOfdouble[b1] = (arrayOfDouble2[m][b1] - d2) / (paramDouble - d1);
          b1++;
        } 
        break;
      } 
    } 
  }
  
  public double[] h() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */