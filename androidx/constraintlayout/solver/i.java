package androidx.constraintlayout.solver;

import java.util.Arrays;

public class i implements b.a {
  private static float a = 0.001F;
  
  private final int b = -1;
  
  private int c = 16;
  
  private int d = 16;
  
  int[] e = new int[16];
  
  int[] f = new int[16];
  
  int[] g = new int[16];
  
  float[] h = new float[16];
  
  int[] i = new int[16];
  
  int[] j = new int[16];
  
  int k = 0;
  
  int l = -1;
  
  private final b m;
  
  protected final c n;
  
  i(b paramb, c paramc) {
    this.m = paramb;
    this.n = paramc;
    clear();
  }
  
  private void l(SolverVariable paramSolverVariable, int paramInt) {
    int j = paramSolverVariable.d % this.d;
    int[] arrayOfInt = this.e;
    int k = arrayOfInt[j];
    int m = k;
    if (k == -1) {
      arrayOfInt[j] = paramInt;
    } else {
      while (true) {
        arrayOfInt = this.f;
        if (arrayOfInt[m] != -1) {
          m = arrayOfInt[m];
          continue;
        } 
        arrayOfInt[m] = paramInt;
        this.f[paramInt] = -1;
        return;
      } 
    } 
    this.f[paramInt] = -1;
  }
  
  private void m(int paramInt, SolverVariable paramSolverVariable, float paramFloat) {
    this.g[paramInt] = paramSolverVariable.d;
    this.h[paramInt] = paramFloat;
    this.i[paramInt] = -1;
    this.j[paramInt] = -1;
    paramSolverVariable.a(this.m);
    paramSolverVariable.n++;
    this.k++;
  }
  
  private int n() {
    for (byte b1 = 0; b1 < this.c; b1++) {
      if (this.g[b1] == -1)
        return b1; 
    } 
    return -1;
  }
  
  private void o() {
    int j = this.c * 2;
    this.g = Arrays.copyOf(this.g, j);
    this.h = Arrays.copyOf(this.h, j);
    this.i = Arrays.copyOf(this.i, j);
    this.j = Arrays.copyOf(this.j, j);
    this.f = Arrays.copyOf(this.f, j);
    for (int k = this.c; k < j; k++) {
      this.g[k] = -1;
      this.f[k] = -1;
    } 
    this.c = j;
  }
  
  private void q(int paramInt, SolverVariable paramSolverVariable, float paramFloat) {
    int j = n();
    m(j, paramSolverVariable, paramFloat);
    if (paramInt != -1) {
      this.i[j] = paramInt;
      int[] arrayOfInt1 = this.j;
      arrayOfInt1[j] = arrayOfInt1[paramInt];
      arrayOfInt1[paramInt] = j;
    } else {
      this.i[j] = -1;
      if (this.k > 0) {
        this.j[j] = this.l;
        this.l = j;
      } else {
        this.j[j] = -1;
      } 
    } 
    int[] arrayOfInt = this.j;
    if (arrayOfInt[j] != -1)
      this.i[arrayOfInt[j]] = j; 
    l(paramSolverVariable, j);
  }
  
  private void r(SolverVariable paramSolverVariable) {
    int j = paramSolverVariable.d;
    int k = j % this.d;
    int[] arrayOfInt = this.e;
    int m = arrayOfInt[k];
    if (m == -1)
      return; 
    int n = m;
    if (this.g[m] == j) {
      int[] arrayOfInt1 = this.f;
      arrayOfInt[k] = arrayOfInt1[m];
      arrayOfInt1[m] = -1;
    } else {
      while (true) {
        arrayOfInt = this.f;
        if (arrayOfInt[n] != -1 && this.g[arrayOfInt[n]] != j) {
          n = arrayOfInt[n];
          continue;
        } 
        break;
      } 
      m = arrayOfInt[n];
      if (m != -1 && this.g[m] == j) {
        arrayOfInt[n] = arrayOfInt[m];
        arrayOfInt[m] = -1;
      } 
    } 
  }
  
  public int a() {
    return this.k;
  }
  
  public SolverVariable b(int paramInt) {
    int j = this.k;
    if (j == 0)
      return null; 
    int k = this.l;
    for (byte b1 = 0; b1 < j; b1++) {
      if (b1 == paramInt && k != -1)
        return this.n.d[this.g[k]]; 
      k = this.j[k];
      if (k == -1)
        break; 
    } 
    return null;
  }
  
  public void c() {
    int j = this.k;
    int k = this.l;
    for (byte b1 = 0; b1 < j; b1++) {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[k] = arrayOfFloat[k] * -1.0F;
      k = this.j[k];
      if (k == -1)
        break; 
    } 
  }
  
  public void clear() {
    int j = this.k;
    byte b1;
    for (b1 = 0; b1 < j; b1++) {
      SolverVariable solverVariable = b(b1);
      if (solverVariable != null)
        solverVariable.c(this.m); 
    } 
    for (b1 = 0; b1 < this.c; b1++) {
      this.g[b1] = -1;
      this.f[b1] = -1;
    } 
    for (b1 = 0; b1 < this.d; b1++)
      this.e[b1] = -1; 
    this.k = 0;
    this.l = -1;
  }
  
  public float d(int paramInt) {
    int j = this.k;
    int k = this.l;
    for (byte b1 = 0; b1 < j; b1++) {
      if (b1 == paramInt)
        return this.h[k]; 
      k = this.j[k];
      if (k == -1)
        break; 
    } 
    return 0.0F;
  }
  
  public void e(SolverVariable paramSolverVariable, float paramFloat, boolean paramBoolean) {
    float f = a;
    if (paramFloat > -f && paramFloat < f)
      return; 
    int j = p(paramSolverVariable);
    if (j == -1) {
      i(paramSolverVariable, paramFloat);
    } else {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[j] = arrayOfFloat[j] + paramFloat;
      f = arrayOfFloat[j];
      paramFloat = a;
      if (f > -paramFloat && arrayOfFloat[j] < paramFloat) {
        arrayOfFloat[j] = 0.0F;
        j(paramSolverVariable, paramBoolean);
      } 
    } 
  }
  
  public float f(SolverVariable paramSolverVariable) {
    int j = p(paramSolverVariable);
    return (j != -1) ? this.h[j] : 0.0F;
  }
  
  public boolean g(SolverVariable paramSolverVariable) {
    boolean bool;
    if (p(paramSolverVariable) != -1) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public float h(b paramb, boolean paramBoolean) {
    float f = f(paramb.a);
    j(paramb.a, paramBoolean);
    i i1 = (i)paramb.e;
    int j = i1.a();
    int k = 0;
    byte b1 = 0;
    while (k < j) {
      int[] arrayOfInt = i1.g;
      int m = k;
      if (arrayOfInt[b1] != -1) {
        float f1 = i1.h[b1];
        e(this.n.d[arrayOfInt[b1]], f1 * f, paramBoolean);
        m = k + 1;
      } 
      b1++;
      k = m;
    } 
    return f;
  }
  
  public void i(SolverVariable paramSolverVariable, float paramFloat) {
    float f = a;
    if (paramFloat > -f && paramFloat < f) {
      j(paramSolverVariable, true);
      return;
    } 
    int j = this.k;
    byte b1 = 0;
    if (j == 0) {
      m(0, paramSolverVariable, paramFloat);
      l(paramSolverVariable, 0);
      this.l = 0;
    } else {
      j = p(paramSolverVariable);
      if (j != -1) {
        this.h[j] = paramFloat;
      } else {
        int n;
        if (this.k + 1 >= this.c)
          o(); 
        int k = this.k;
        j = this.l;
        int m = -1;
        while (true) {
          n = m;
          if (b1 < k) {
            int[] arrayOfInt = this.g;
            int i1 = arrayOfInt[j];
            n = paramSolverVariable.d;
            if (i1 == n) {
              this.h[j] = paramFloat;
              return;
            } 
            if (arrayOfInt[j] < n)
              m = j; 
            j = this.j[j];
            if (j == -1) {
              n = m;
              break;
            } 
            b1++;
            continue;
          } 
          break;
        } 
        q(n, paramSolverVariable, paramFloat);
      } 
    } 
  }
  
  public float j(SolverVariable paramSolverVariable, boolean paramBoolean) {
    int j = p(paramSolverVariable);
    if (j == -1)
      return 0.0F; 
    r(paramSolverVariable);
    float f = this.h[j];
    if (this.l == j)
      this.l = this.j[j]; 
    this.g[j] = -1;
    int[] arrayOfInt1 = this.i;
    if (arrayOfInt1[j] != -1) {
      int[] arrayOfInt = this.j;
      arrayOfInt[arrayOfInt1[j]] = arrayOfInt[j];
    } 
    int[] arrayOfInt2 = this.j;
    if (arrayOfInt2[j] != -1)
      arrayOfInt1[arrayOfInt2[j]] = arrayOfInt1[j]; 
    this.k--;
    paramSolverVariable.n--;
    if (paramBoolean)
      paramSolverVariable.c(this.m); 
    return f;
  }
  
  public void k(float paramFloat) {
    int j = this.k;
    int k = this.l;
    for (byte b1 = 0; b1 < j; b1++) {
      float[] arrayOfFloat = this.h;
      arrayOfFloat[k] = arrayOfFloat[k] / paramFloat;
      k = this.j[k];
      if (k == -1)
        break; 
    } 
  }
  
  public int p(SolverVariable paramSolverVariable) {
    if (this.k != 0 && paramSolverVariable != null) {
      int[] arrayOfInt;
      int j = paramSolverVariable.d;
      int k = this.d;
      int m = this.e[j % k];
      if (m == -1)
        return -1; 
      k = m;
      if (this.g[m] == j)
        return m; 
      while (true) {
        arrayOfInt = this.f;
        if (arrayOfInt[k] != -1 && this.g[arrayOfInt[k]] != j) {
          k = arrayOfInt[k];
          continue;
        } 
        break;
      } 
      if (arrayOfInt[k] == -1)
        return -1; 
      if (this.g[arrayOfInt[k]] == j)
        return arrayOfInt[k]; 
    } 
    return -1;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(hashCode());
    stringBuilder1.append(" { ");
    String str = stringBuilder1.toString();
    int j = this.k;
    for (byte b1 = 0; b1 < j; b1++) {
      SolverVariable solverVariable = b(b1);
      if (solverVariable != null) {
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(str);
        stringBuilder4.append(solverVariable);
        stringBuilder4.append(" = ");
        stringBuilder4.append(d(b1));
        stringBuilder4.append(" ");
        str = stringBuilder4.toString();
        int k = p(solverVariable);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("[p: ");
        str = stringBuilder3.toString();
        if (this.i[k] != -1) {
          stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str);
          stringBuilder3.append(this.n.d[this.g[this.i[k]]]);
          str = stringBuilder3.toString();
        } else {
          stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str);
          stringBuilder3.append("none");
          str = stringBuilder3.toString();
        } 
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append(", n: ");
        str = stringBuilder3.toString();
        if (this.j[k] != -1) {
          stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str);
          stringBuilder3.append(this.n.d[this.g[this.j[k]]]);
          str = stringBuilder3.toString();
        } else {
          stringBuilder3 = new StringBuilder();
          stringBuilder3.append(str);
          stringBuilder3.append("none");
          str = stringBuilder3.toString();
        } 
        stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append("]");
        str = stringBuilder3.toString();
      } 
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append(" }");
    return stringBuilder2.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */