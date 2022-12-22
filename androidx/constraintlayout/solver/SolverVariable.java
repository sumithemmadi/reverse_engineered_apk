package androidx.constraintlayout.solver;

import java.util.Arrays;
import java.util.HashSet;

public class SolverVariable {
  private static int a = 1;
  
  public boolean b;
  
  private String c;
  
  public int d = -1;
  
  int e = -1;
  
  public int f = 0;
  
  public float g;
  
  public boolean h = false;
  
  float[] i = new float[9];
  
  float[] j = new float[9];
  
  Type k;
  
  b[] l = new b[16];
  
  int m = 0;
  
  public int n = 0;
  
  boolean o = false;
  
  int p = -1;
  
  float q = 0.0F;
  
  HashSet<b> r = null;
  
  public SolverVariable(Type paramType, String paramString) {
    this.k = paramType;
  }
  
  static void b() {
    a++;
  }
  
  public final void a(b paramb) {
    int i = 0;
    while (true) {
      int j = this.m;
      if (i < j) {
        if (this.l[i] == paramb)
          return; 
        i++;
        continue;
      } 
      b[] arrayOfB = this.l;
      if (j >= arrayOfB.length)
        this.l = Arrays.<b>copyOf(arrayOfB, arrayOfB.length * 2); 
      arrayOfB = this.l;
      i = this.m;
      arrayOfB[i] = paramb;
      this.m = i + 1;
      return;
    } 
  }
  
  public final void c(b paramb) {
    int i = this.m;
    for (int j = 0; j < i; j++) {
      if (this.l[j] == paramb) {
        while (j < i - 1) {
          b[] arrayOfB = this.l;
          int k = j + 1;
          arrayOfB[j] = arrayOfB[k];
          j = k;
        } 
        this.m--;
        return;
      } 
    } 
  }
  
  public void d() {
    this.c = null;
    this.k = Type.f;
    this.f = 0;
    this.d = -1;
    this.e = -1;
    this.g = 0.0F;
    this.h = false;
    this.o = false;
    this.p = -1;
    this.q = 0.0F;
    int i = this.m;
    for (byte b1 = 0; b1 < i; b1++)
      this.l[b1] = null; 
    this.m = 0;
    this.n = 0;
    this.b = false;
    Arrays.fill(this.j, 0.0F);
  }
  
  public void e(d paramd, float paramFloat) {
    this.g = paramFloat;
    this.h = true;
    this.o = false;
    this.p = -1;
    this.q = 0.0F;
    int i = this.m;
    this.e = -1;
    for (byte b1 = 0; b1 < i; b1++)
      this.l[b1].A(paramd, this, false); 
    this.m = 0;
  }
  
  public void f(Type paramType, String paramString) {
    this.k = paramType;
  }
  
  public final void g(d paramd, b paramb) {
    int i = this.m;
    for (byte b1 = 0; b1 < i; b1++)
      this.l[b1].B(paramd, paramb, false); 
    this.m = 0;
  }
  
  public String toString() {
    String str;
    if (this.c != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append(this.c);
      str = stringBuilder.toString();
    } else {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("");
      stringBuilder.append(this.d);
      str = stringBuilder.toString();
    } 
    return str;
  }
  
  public enum Type {
    b, c, d, e, f;
    
    static {
      Type type1 = new Type("UNRESTRICTED", 0);
      b = type1;
      Type type2 = new Type("CONSTANT", 1);
      c = type2;
      Type type3 = new Type("SLACK", 2);
      d = type3;
      Type type4 = new Type("ERROR", 3);
      e = type4;
      Type type5 = new Type("UNKNOWN", 4);
      f = type5;
      g = new Type[] { type1, type2, type3, type4, type5 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/SolverVariable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */