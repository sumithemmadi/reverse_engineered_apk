package androidx.constraintlayout.solver;

import java.util.Arrays;

public class a implements b.a {
  private static float a = 0.001F;
  
  int b = 0;
  
  private final b c;
  
  protected final c d;
  
  private int e = 8;
  
  private SolverVariable f = null;
  
  private int[] g = new int[8];
  
  private int[] h = new int[8];
  
  private float[] i = new float[8];
  
  private int j = -1;
  
  private int k = -1;
  
  private boolean l = false;
  
  a(b paramb, c paramc) {
    this.c = paramb;
    this.d = paramc;
  }
  
  public int a() {
    return this.b;
  }
  
  public SolverVariable b(int paramInt) {
    int i = this.j;
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      if (b1 == paramInt)
        return this.d.d[this.g[i]]; 
      i = this.h[i];
    } 
    return null;
  }
  
  public void c() {
    int i = this.j;
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      float[] arrayOfFloat = this.i;
      arrayOfFloat[i] = arrayOfFloat[i] * -1.0F;
      i = this.h[i];
    } 
  }
  
  public final void clear() {
    int i = this.j;
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      SolverVariable solverVariable = this.d.d[this.g[i]];
      if (solverVariable != null)
        solverVariable.c(this.c); 
      i = this.h[i];
    } 
    this.j = -1;
    this.k = -1;
    this.l = false;
    this.b = 0;
  }
  
  public float d(int paramInt) {
    int i = this.j;
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      if (b1 == paramInt)
        return this.i[i]; 
      i = this.h[i];
    } 
    return 0.0F;
  }
  
  public void e(SolverVariable paramSolverVariable, float paramFloat, boolean paramBoolean) {
    float f = a;
    if (paramFloat > -f && paramFloat < f)
      return; 
    int i = this.j;
    if (i == -1) {
      this.j = 0;
      this.i[0] = paramFloat;
      this.g[0] = paramSolverVariable.d;
      this.h[0] = -1;
      paramSolverVariable.n++;
      paramSolverVariable.a(this.c);
      this.b++;
      if (!this.l) {
        i = this.k + 1;
        this.k = i;
        arrayOfInt1 = this.g;
        if (i >= arrayOfInt1.length) {
          this.l = true;
          this.k = arrayOfInt1.length - 1;
        } 
      } 
      return;
    } 
    int j = 0;
    int k = -1;
    while (i != -1 && j < this.b) {
      int[] arrayOfInt = this.g;
      int m = arrayOfInt[i];
      int n = ((SolverVariable)arrayOfInt1).d;
      if (m == n) {
        float[] arrayOfFloat = this.i;
        f = arrayOfFloat[i] + paramFloat;
        float f1 = a;
        paramFloat = f;
        if (f > -f1) {
          paramFloat = f;
          if (f < f1)
            paramFloat = 0.0F; 
        } 
        arrayOfFloat[i] = paramFloat;
        if (paramFloat == 0.0F) {
          if (i == this.j) {
            this.j = this.h[i];
          } else {
            arrayOfInt = this.h;
            arrayOfInt[k] = arrayOfInt[i];
          } 
          if (paramBoolean)
            arrayOfInt1.c(this.c); 
          if (this.l)
            this.k = i; 
          ((SolverVariable)arrayOfInt1).n--;
          this.b--;
        } 
        return;
      } 
      if (arrayOfInt[i] < n)
        k = i; 
      i = this.h[i];
      j++;
    } 
    i = this.k;
    if (this.l) {
      int[] arrayOfInt = this.g;
      if (arrayOfInt[i] != -1)
        i = arrayOfInt.length; 
    } else {
      i++;
    } 
    int[] arrayOfInt2 = this.g;
    j = i;
    if (i >= arrayOfInt2.length) {
      j = i;
      if (this.b < arrayOfInt2.length) {
        byte b1 = 0;
        while (true) {
          arrayOfInt2 = this.g;
          j = i;
          if (b1 < arrayOfInt2.length) {
            if (arrayOfInt2[b1] == -1) {
              j = b1;
              break;
            } 
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    arrayOfInt2 = this.g;
    i = j;
    if (j >= arrayOfInt2.length) {
      i = arrayOfInt2.length;
      j = this.e * 2;
      this.e = j;
      this.l = false;
      this.k = i - 1;
      this.i = Arrays.copyOf(this.i, j);
      this.g = Arrays.copyOf(this.g, this.e);
      this.h = Arrays.copyOf(this.h, this.e);
    } 
    this.g[i] = ((SolverVariable)arrayOfInt1).d;
    this.i[i] = paramFloat;
    if (k != -1) {
      arrayOfInt2 = this.h;
      arrayOfInt2[i] = arrayOfInt2[k];
      arrayOfInt2[k] = i;
    } else {
      this.h[i] = this.j;
      this.j = i;
    } 
    ((SolverVariable)arrayOfInt1).n++;
    arrayOfInt1.a(this.c);
    this.b++;
    if (!this.l)
      this.k++; 
    i = this.k;
    int[] arrayOfInt1 = this.g;
    if (i >= arrayOfInt1.length) {
      this.l = true;
      this.k = arrayOfInt1.length - 1;
    } 
  }
  
  public final float f(SolverVariable paramSolverVariable) {
    int i = this.j;
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      if (this.g[i] == paramSolverVariable.d)
        return this.i[i]; 
      i = this.h[i];
    } 
    return 0.0F;
  }
  
  public boolean g(SolverVariable paramSolverVariable) {
    int i = this.j;
    if (i == -1)
      return false; 
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      if (this.g[i] == paramSolverVariable.d)
        return true; 
      i = this.h[i];
    } 
    return false;
  }
  
  public float h(b paramb, boolean paramBoolean) {
    float f = f(paramb.a);
    j(paramb.a, paramBoolean);
    b.a a1 = paramb.e;
    int i = a1.a();
    for (byte b1 = 0; b1 < i; b1++) {
      SolverVariable solverVariable = a1.b(b1);
      e(solverVariable, a1.f(solverVariable) * f, paramBoolean);
    } 
    return f;
  }
  
  public final void i(SolverVariable paramSolverVariable, float paramFloat) {
    if (paramFloat == 0.0F) {
      j(paramSolverVariable, true);
      return;
    } 
    int i = this.j;
    if (i == -1) {
      this.j = 0;
      this.i[0] = paramFloat;
      this.g[0] = paramSolverVariable.d;
      this.h[0] = -1;
      paramSolverVariable.n++;
      paramSolverVariable.a(this.c);
      this.b++;
      if (!this.l) {
        i = this.k + 1;
        this.k = i;
        arrayOfInt1 = this.g;
        if (i >= arrayOfInt1.length) {
          this.l = true;
          this.k = arrayOfInt1.length - 1;
        } 
      } 
      return;
    } 
    int j = 0;
    int k = -1;
    while (i != -1 && j < this.b) {
      int[] arrayOfInt = this.g;
      int m = arrayOfInt[i];
      int n = ((SolverVariable)arrayOfInt1).d;
      if (m == n) {
        this.i[i] = paramFloat;
        return;
      } 
      if (arrayOfInt[i] < n)
        k = i; 
      i = this.h[i];
      j++;
    } 
    i = this.k;
    if (this.l) {
      int[] arrayOfInt = this.g;
      if (arrayOfInt[i] != -1)
        i = arrayOfInt.length; 
    } else {
      i++;
    } 
    int[] arrayOfInt2 = this.g;
    j = i;
    if (i >= arrayOfInt2.length) {
      j = i;
      if (this.b < arrayOfInt2.length) {
        byte b1 = 0;
        while (true) {
          arrayOfInt2 = this.g;
          j = i;
          if (b1 < arrayOfInt2.length) {
            if (arrayOfInt2[b1] == -1) {
              j = b1;
              break;
            } 
            b1++;
            continue;
          } 
          break;
        } 
      } 
    } 
    arrayOfInt2 = this.g;
    i = j;
    if (j >= arrayOfInt2.length) {
      i = arrayOfInt2.length;
      j = this.e * 2;
      this.e = j;
      this.l = false;
      this.k = i - 1;
      this.i = Arrays.copyOf(this.i, j);
      this.g = Arrays.copyOf(this.g, this.e);
      this.h = Arrays.copyOf(this.h, this.e);
    } 
    this.g[i] = ((SolverVariable)arrayOfInt1).d;
    this.i[i] = paramFloat;
    if (k != -1) {
      arrayOfInt2 = this.h;
      arrayOfInt2[i] = arrayOfInt2[k];
      arrayOfInt2[k] = i;
    } else {
      this.h[i] = this.j;
      this.j = i;
    } 
    ((SolverVariable)arrayOfInt1).n++;
    arrayOfInt1.a(this.c);
    i = this.b + 1;
    this.b = i;
    if (!this.l)
      this.k++; 
    int[] arrayOfInt1 = this.g;
    if (i >= arrayOfInt1.length)
      this.l = true; 
    if (this.k >= arrayOfInt1.length) {
      this.l = true;
      this.k = arrayOfInt1.length - 1;
    } 
  }
  
  public final float j(SolverVariable paramSolverVariable, boolean paramBoolean) {
    if (this.f == paramSolverVariable)
      this.f = null; 
    int i = this.j;
    if (i == -1)
      return 0.0F; 
    byte b1 = 0;
    int j = -1;
    while (i != -1 && b1 < this.b) {
      if (this.g[i] == paramSolverVariable.d) {
        if (i == this.j) {
          this.j = this.h[i];
        } else {
          int[] arrayOfInt = this.h;
          arrayOfInt[j] = arrayOfInt[i];
        } 
        if (paramBoolean)
          paramSolverVariable.c(this.c); 
        paramSolverVariable.n--;
        this.b--;
        this.g[i] = -1;
        if (this.l)
          this.k = i; 
        return this.i[i];
      } 
      int k = this.h[i];
      b1++;
      j = i;
      i = k;
    } 
    return 0.0F;
  }
  
  public void k(float paramFloat) {
    int i = this.j;
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      float[] arrayOfFloat = this.i;
      arrayOfFloat[i] = arrayOfFloat[i] / paramFloat;
      i = this.h[i];
    } 
  }
  
  public String toString() {
    int i = this.j;
    String str = "";
    for (byte b1 = 0; i != -1 && b1 < this.b; b1++) {
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(str);
      stringBuilder2.append(" -> ");
      String str1 = stringBuilder2.toString();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append(this.i[i]);
      stringBuilder1.append(" : ");
      str1 = stringBuilder1.toString();
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append(this.d.d[this.g[i]]);
      str = stringBuilder1.toString();
      i = this.h[i];
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */