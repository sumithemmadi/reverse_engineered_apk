package b.f.a.a;

public class e extends b {
  private double[] a;
  
  private double[][] b;
  
  private double[][] c;
  
  public e(double[] paramArrayOfdouble, double[][] paramArrayOfdouble1) {
    int i = paramArrayOfdouble.length;
    int j = (paramArrayOfdouble1[0]).length;
    int k = i - 1;
    double[][] arrayOfDouble1 = new double[k][j];
    double[][] arrayOfDouble2 = new double[i][j];
    byte b1;
    for (b1 = 0; b1 < j; b1++) {
      int m;
      for (m = 0; m < k; m = n) {
        int n = m + 1;
        double d1 = paramArrayOfdouble[n];
        double d2 = paramArrayOfdouble[m];
        arrayOfDouble1[m][b1] = (paramArrayOfdouble1[n][b1] - paramArrayOfdouble1[m][b1]) / (d1 - d2);
        if (m == 0) {
          arrayOfDouble2[m][b1] = arrayOfDouble1[m][b1];
        } else {
          arrayOfDouble2[m][b1] = (arrayOfDouble1[m - 1][b1] + arrayOfDouble1[m][b1]) * 0.5D;
        } 
      } 
      arrayOfDouble2[k][b1] = arrayOfDouble1[i - 2][b1];
    } 
    for (b1 = 0; b1 < k; b1++) {
      for (byte b2 = 0; b2 < j; b2++) {
        if (arrayOfDouble1[b1][b2] == 0.0D) {
          arrayOfDouble2[b1][b2] = 0.0D;
          arrayOfDouble2[b1 + 1][b2] = 0.0D;
        } else {
          double d1 = arrayOfDouble2[b1][b2] / arrayOfDouble1[b1][b2];
          int m = b1 + 1;
          double d2 = arrayOfDouble2[m][b2] / arrayOfDouble1[b1][b2];
          double d3 = Math.hypot(d1, d2);
          if (d3 > 9.0D) {
            d3 = 3.0D / d3;
            arrayOfDouble2[b1][b2] = d1 * d3 * arrayOfDouble1[b1][b2];
            arrayOfDouble2[m][b2] = d3 * d2 * arrayOfDouble1[b1][b2];
          } 
        } 
      } 
    } 
    this.a = paramArrayOfdouble;
    this.b = paramArrayOfdouble1;
    this.c = arrayOfDouble2;
  }
  
  private static double i(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    double d1 = paramDouble2 * paramDouble2;
    double d2 = paramDouble2 * 6.0D;
    double d3 = 3.0D * paramDouble1;
    return -6.0D * d1 * paramDouble4 + d2 * paramDouble4 + 6.0D * d1 * paramDouble3 - d2 * paramDouble3 + d3 * paramDouble6 * d1 + d3 * paramDouble5 * d1 - 2.0D * paramDouble1 * paramDouble6 * paramDouble2 - 4.0D * paramDouble1 * paramDouble5 * paramDouble2 + paramDouble1 * paramDouble5;
  }
  
  private static double j(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6) {
    double d1 = paramDouble2 * paramDouble2;
    double d2 = d1 * paramDouble2;
    double d3 = 3.0D * d1;
    double d4 = paramDouble1 * paramDouble6;
    paramDouble6 = paramDouble1 * paramDouble5;
    return -2.0D * d2 * paramDouble4 + d3 * paramDouble4 + d2 * 2.0D * paramDouble3 - d3 * paramDouble3 + paramDouble3 + d4 * d2 + d2 * paramDouble6 - d4 * d1 - paramDouble1 * 2.0D * paramDouble5 * d1 + paramDouble6 * paramDouble2;
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
        double d1 = arrayOfDouble[i] - arrayOfDouble[j];
        double d2 = (paramDouble - arrayOfDouble[j]) / d1;
        double[][] arrayOfDouble1 = this.b;
        paramDouble = arrayOfDouble1[j][paramInt];
        double d3 = arrayOfDouble1[i][paramInt];
        arrayOfDouble1 = this.c;
        return j(d1, d2, paramDouble, d3, arrayOfDouble1[j][paramInt], arrayOfDouble1[i][paramInt]);
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
        double d1 = arrayOfDouble2[n] - arrayOfDouble2[j];
        double d2 = (paramDouble - arrayOfDouble2[j]) / d1;
        for (i = bool; i < k; i++) {
          double[][] arrayOfDouble3 = this.b;
          double d = arrayOfDouble3[j][i];
          paramDouble = arrayOfDouble3[n][i];
          arrayOfDouble3 = this.c;
          paramArrayOfdouble[i] = j(d1, d2, d, paramDouble, arrayOfDouble3[j][i], arrayOfDouble3[n][i]);
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
      arrayOfDouble = this.a;
      int n = j + 1;
      if (paramDouble < arrayOfDouble[n]) {
        double d1 = arrayOfDouble[n] - arrayOfDouble[j];
        double d2 = (paramDouble - arrayOfDouble[j]) / d1;
        for (i = bool; i < k; i++) {
          double[][] arrayOfDouble2 = this.b;
          double d = arrayOfDouble2[j][i];
          paramDouble = arrayOfDouble2[n][i];
          arrayOfDouble2 = this.c;
          paramArrayOffloat[i] = (float)j(d1, d2, d, paramDouble, arrayOfDouble2[j][i], arrayOfDouble2[n][i]);
        } 
        return;
      } 
    } 
  }
  
  public double f(double paramDouble, int paramInt) {
    double[] arrayOfDouble = this.a;
    int i = arrayOfDouble.length;
    int j = 0;
    if (paramDouble < arrayOfDouble[0]) {
      paramDouble = arrayOfDouble[0];
    } else {
      int k = i - 1;
      if (paramDouble >= arrayOfDouble[k])
        paramDouble = arrayOfDouble[k]; 
    } 
    while (j < i - 1) {
      arrayOfDouble = this.a;
      int k = j + 1;
      if (paramDouble <= arrayOfDouble[k]) {
        double d1 = arrayOfDouble[k] - arrayOfDouble[j];
        double d2 = (paramDouble - arrayOfDouble[j]) / d1;
        double[][] arrayOfDouble1 = this.b;
        paramDouble = arrayOfDouble1[j][paramInt];
        double d3 = arrayOfDouble1[k][paramInt];
        arrayOfDouble1 = this.c;
        return i(d1, d2, paramDouble, d3, arrayOfDouble1[j][paramInt], arrayOfDouble1[k][paramInt]) / d1;
      } 
      j = k;
    } 
    return 0.0D;
  }
  
  public void g(double paramDouble, double[] paramArrayOfdouble) {
    double[] arrayOfDouble = this.a;
    int i = arrayOfDouble.length;
    double[][] arrayOfDouble1 = this.b;
    byte b1 = 0;
    int j = (arrayOfDouble1[0]).length;
    if (paramDouble <= arrayOfDouble[0]) {
      paramDouble = arrayOfDouble[0];
    } else {
      int m = i - 1;
      if (paramDouble >= arrayOfDouble[m])
        paramDouble = arrayOfDouble[m]; 
    } 
    int k;
    for (k = 0; k < i - 1; k = m) {
      arrayOfDouble = this.a;
      int m = k + 1;
      if (paramDouble <= arrayOfDouble[m]) {
        double d1 = arrayOfDouble[m] - arrayOfDouble[k];
        double d2 = (paramDouble - arrayOfDouble[k]) / d1;
        while (b1 < j) {
          double[][] arrayOfDouble2 = this.b;
          double d = arrayOfDouble2[k][b1];
          paramDouble = arrayOfDouble2[m][b1];
          arrayOfDouble2 = this.c;
          paramArrayOfdouble[b1] = i(d1, d2, d, paramDouble, arrayOfDouble2[k][b1], arrayOfDouble2[m][b1]) / d1;
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/f/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */