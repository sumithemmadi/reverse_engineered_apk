package androidx.constraintlayout.solver;

import java.util.Arrays;
import java.util.Comparator;

public class h extends b {
  private int g = 128;
  
  private SolverVariable[] h = new SolverVariable[128];
  
  private SolverVariable[] i = new SolverVariable[128];
  
  private int j = 0;
  
  b k = new b(this, this);
  
  c l;
  
  public h(c paramc) {
    super(paramc);
    this.l = paramc;
  }
  
  private final void F(SolverVariable paramSolverVariable) {
    int i = this.j;
    SolverVariable[] arrayOfSolverVariable = this.h;
    if (i + 1 > arrayOfSolverVariable.length) {
      arrayOfSolverVariable = Arrays.<SolverVariable>copyOf(arrayOfSolverVariable, arrayOfSolverVariable.length * 2);
      this.h = arrayOfSolverVariable;
      this.i = Arrays.<SolverVariable>copyOf(arrayOfSolverVariable, arrayOfSolverVariable.length * 2);
    } 
    arrayOfSolverVariable = this.h;
    i = this.j;
    arrayOfSolverVariable[i] = paramSolverVariable;
    this.j = ++i;
    if (i > 1 && (arrayOfSolverVariable[i - 1]).d > paramSolverVariable.d) {
      boolean bool = false;
      i = 0;
      while (true) {
        int j = this.j;
        if (i < j) {
          this.i[i] = this.h[i];
          i++;
          continue;
        } 
        Arrays.sort(this.i, 0, j, new a(this));
        for (i = bool; i < this.j; i++)
          this.h[i] = this.i[i]; 
        break;
      } 
    } 
    paramSolverVariable.b = true;
    paramSolverVariable.a(this);
  }
  
  private final void G(SolverVariable paramSolverVariable) {
    for (int i = 0; i < this.j; i++) {
      if (this.h[i] == paramSolverVariable)
        while (true) {
          int j = this.j;
          if (i < j - 1) {
            SolverVariable[] arrayOfSolverVariable = this.h;
            j = i + 1;
            arrayOfSolverVariable[i] = arrayOfSolverVariable[j];
            i = j;
            continue;
          } 
          this.j = j - 1;
          paramSolverVariable.b = false;
          return;
        }  
    } 
  }
  
  public void B(d paramd, b paramb, boolean paramBoolean) {
    SolverVariable solverVariable = paramb.a;
    if (solverVariable == null)
      return; 
    b.a a = paramb.e;
    int i = a.a();
    for (byte b1 = 0; b1 < i; b1++) {
      SolverVariable solverVariable1 = a.b(b1);
      float f = a.d(b1);
      this.k.e(solverVariable1);
      if (this.k.a(solverVariable, f))
        F(solverVariable1); 
      this.b += paramb.b * f;
    } 
    G(solverVariable);
  }
  
  public void a(SolverVariable paramSolverVariable) {
    this.k.e(paramSolverVariable);
    this.k.k();
    paramSolverVariable.j[paramSolverVariable.f] = 1.0F;
    F(paramSolverVariable);
  }
  
  public SolverVariable b(d paramd, boolean[] paramArrayOfboolean) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_m1
    //   3: istore #4
    //   5: iload_3
    //   6: aload_0
    //   7: getfield j : I
    //   10: if_icmpge -> 101
    //   13: aload_0
    //   14: getfield h : [Landroidx/constraintlayout/solver/SolverVariable;
    //   17: iload_3
    //   18: aaload
    //   19: astore_1
    //   20: aload_2
    //   21: aload_1
    //   22: getfield d : I
    //   25: baload
    //   26: ifeq -> 36
    //   29: iload #4
    //   31: istore #5
    //   33: goto -> 91
    //   36: aload_0
    //   37: getfield k : Landroidx/constraintlayout/solver/h$b;
    //   40: aload_1
    //   41: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;)V
    //   44: iload #4
    //   46: iconst_m1
    //   47: if_icmpne -> 67
    //   50: iload #4
    //   52: istore #5
    //   54: aload_0
    //   55: getfield k : Landroidx/constraintlayout/solver/h$b;
    //   58: invokevirtual f : ()Z
    //   61: ifeq -> 91
    //   64: goto -> 88
    //   67: iload #4
    //   69: istore #5
    //   71: aload_0
    //   72: getfield k : Landroidx/constraintlayout/solver/h$b;
    //   75: aload_0
    //   76: getfield h : [Landroidx/constraintlayout/solver/SolverVariable;
    //   79: iload #4
    //   81: aaload
    //   82: invokevirtual i : (Landroidx/constraintlayout/solver/SolverVariable;)Z
    //   85: ifeq -> 91
    //   88: iload_3
    //   89: istore #5
    //   91: iinc #3, 1
    //   94: iload #5
    //   96: istore #4
    //   98: goto -> 5
    //   101: iload #4
    //   103: iconst_m1
    //   104: if_icmpne -> 109
    //   107: aconst_null
    //   108: areturn
    //   109: aload_0
    //   110: getfield h : [Landroidx/constraintlayout/solver/SolverVariable;
    //   113: iload #4
    //   115: aaload
    //   116: areturn
  }
  
  public void clear() {
    this.j = 0;
    this.b = 0.0F;
  }
  
  public boolean isEmpty() {
    boolean bool;
    if (this.j == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append(" goal -> (");
    stringBuilder.append(this.b);
    stringBuilder.append(") : ");
    String str = stringBuilder.toString();
    for (byte b1 = 0; b1 < this.j; b1++) {
      SolverVariable solverVariable = this.h[b1];
      this.k.e(solverVariable);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      stringBuilder1.append(this.k);
      stringBuilder1.append(" ");
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  class a implements Comparator<SolverVariable> {
    a(h this$0) {}
    
    public int a(SolverVariable param1SolverVariable1, SolverVariable param1SolverVariable2) {
      return param1SolverVariable1.d - param1SolverVariable2.d;
    }
  }
  
  class b implements Comparable {
    SolverVariable b;
    
    h c;
    
    public b(h this$0, h param1h1) {
      this.c = param1h1;
    }
    
    public boolean a(SolverVariable param1SolverVariable, float param1Float) {
      boolean bool = this.b.b;
      boolean bool1 = true;
      byte b1 = 0;
      if (bool) {
        for (b1 = 0; b1 < 9; b1++) {
          float[] arrayOfFloat = this.b.j;
          arrayOfFloat[b1] = arrayOfFloat[b1] + param1SolverVariable.j[b1] * param1Float;
          if (Math.abs(arrayOfFloat[b1]) < 1.0E-4F) {
            this.b.j[b1] = 0.0F;
          } else {
            bool1 = false;
          } 
        } 
        if (bool1)
          h.E(this.d, this.b); 
        return false;
      } 
      while (b1 < 9) {
        float f = param1SolverVariable.j[b1];
        if (f != 0.0F) {
          float f1 = f * param1Float;
          f = f1;
          if (Math.abs(f1) < 1.0E-4F)
            f = 0.0F; 
          this.b.j[b1] = f;
        } else {
          this.b.j[b1] = 0.0F;
        } 
        b1++;
      } 
      return true;
    }
    
    public int compareTo(Object param1Object) {
      param1Object = param1Object;
      return this.b.d - ((SolverVariable)param1Object).d;
    }
    
    public void e(SolverVariable param1SolverVariable) {
      this.b = param1SolverVariable;
    }
    
    public final boolean f() {
      for (byte b1 = 8; b1 >= 0; b1--) {
        float f = this.b.j[b1];
        if (f > 0.0F)
          return false; 
        if (f < 0.0F)
          return true; 
      } 
      return false;
    }
    
    public final boolean i(SolverVariable param1SolverVariable) {
      byte b1 = 8;
      while (b1 >= 0) {
        float f1 = param1SolverVariable.j[b1];
        float f2 = this.b.j[b1];
        if (f2 == f1) {
          b1--;
          continue;
        } 
        if (f2 < f1)
          return true; 
      } 
      return false;
    }
    
    public void k() {
      Arrays.fill(this.b.j, 0.0F);
    }
    
    public String toString() {
      StringBuilder stringBuilder2;
      SolverVariable solverVariable = this.b;
      String str1 = "[ ";
      String str2 = str1;
      if (solverVariable != null) {
        byte b1 = 0;
        while (true) {
          str2 = str1;
          if (b1 < 9) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str1);
            stringBuilder2.append(this.b.j[b1]);
            stringBuilder2.append(" ");
            str1 = stringBuilder2.toString();
            b1++;
            continue;
          } 
          break;
        } 
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append((String)stringBuilder2);
      stringBuilder1.append("] ");
      stringBuilder1.append(this.b);
      return stringBuilder1.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */