package androidx.constraintlayout.solver;

import java.util.ArrayList;

public class b implements d.a {
  SolverVariable a = null;
  
  float b = 0.0F;
  
  boolean c = false;
  
  ArrayList<SolverVariable> d = new ArrayList<SolverVariable>();
  
  public a e;
  
  boolean f = false;
  
  public b() {}
  
  public b(c paramc) {
    this.e = new a(this, paramc);
  }
  
  private boolean u(SolverVariable paramSolverVariable, d paramd) {
    int i = paramSolverVariable.n;
    boolean bool = true;
    if (i > 1)
      bool = false; 
    return bool;
  }
  
  private SolverVariable w(boolean[] paramArrayOfboolean, SolverVariable paramSolverVariable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Landroidx/constraintlayout/solver/b$a;
    //   4: invokeinterface a : ()I
    //   9: istore_3
    //   10: aconst_null
    //   11: astore #4
    //   13: iconst_0
    //   14: istore #5
    //   16: fconst_0
    //   17: fstore #6
    //   19: iload #5
    //   21: iload_3
    //   22: if_icmpge -> 171
    //   25: aload_0
    //   26: getfield e : Landroidx/constraintlayout/solver/b$a;
    //   29: iload #5
    //   31: invokeinterface d : (I)F
    //   36: fstore #7
    //   38: aload #4
    //   40: astore #8
    //   42: fload #6
    //   44: fstore #9
    //   46: fload #7
    //   48: fconst_0
    //   49: fcmpg
    //   50: ifge -> 157
    //   53: aload_0
    //   54: getfield e : Landroidx/constraintlayout/solver/b$a;
    //   57: iload #5
    //   59: invokeinterface b : (I)Landroidx/constraintlayout/solver/SolverVariable;
    //   64: astore #10
    //   66: aload_1
    //   67: ifnull -> 88
    //   70: aload #4
    //   72: astore #8
    //   74: fload #6
    //   76: fstore #9
    //   78: aload_1
    //   79: aload #10
    //   81: getfield d : I
    //   84: baload
    //   85: ifne -> 157
    //   88: aload #4
    //   90: astore #8
    //   92: fload #6
    //   94: fstore #9
    //   96: aload #10
    //   98: aload_2
    //   99: if_acmpeq -> 157
    //   102: aload #10
    //   104: getfield k : Landroidx/constraintlayout/solver/SolverVariable$Type;
    //   107: astore #11
    //   109: aload #11
    //   111: getstatic androidx/constraintlayout/solver/SolverVariable$Type.d : Landroidx/constraintlayout/solver/SolverVariable$Type;
    //   114: if_acmpeq -> 133
    //   117: aload #4
    //   119: astore #8
    //   121: fload #6
    //   123: fstore #9
    //   125: aload #11
    //   127: getstatic androidx/constraintlayout/solver/SolverVariable$Type.e : Landroidx/constraintlayout/solver/SolverVariable$Type;
    //   130: if_acmpne -> 157
    //   133: aload #4
    //   135: astore #8
    //   137: fload #6
    //   139: fstore #9
    //   141: fload #7
    //   143: fload #6
    //   145: fcmpg
    //   146: ifge -> 157
    //   149: fload #7
    //   151: fstore #9
    //   153: aload #10
    //   155: astore #8
    //   157: iinc #5, 1
    //   160: aload #8
    //   162: astore #4
    //   164: fload #9
    //   166: fstore #6
    //   168: goto -> 19
    //   171: aload #4
    //   173: areturn
  }
  
  public void A(d paramd, SolverVariable paramSolverVariable, boolean paramBoolean) {
    if (!paramSolverVariable.h)
      return; 
    float f = this.e.f(paramSolverVariable);
    this.b += paramSolverVariable.g * f;
    this.e.j(paramSolverVariable, paramBoolean);
    if (paramBoolean)
      paramSolverVariable.c(this); 
    if (d.c && this.e.a() == 0) {
      this.f = true;
      paramd.j = true;
    } 
  }
  
  public void B(d paramd, b paramb, boolean paramBoolean) {
    float f = this.e.h(paramb, paramBoolean);
    this.b += paramb.b * f;
    if (paramBoolean)
      paramb.a.c(this); 
    if (d.c && this.a != null && this.e.a() == 0) {
      this.f = true;
      paramd.j = true;
    } 
  }
  
  public void C(d paramd, SolverVariable paramSolverVariable, boolean paramBoolean) {
    if (!paramSolverVariable.o)
      return; 
    float f = this.e.f(paramSolverVariable);
    this.b += paramSolverVariable.q * f;
    this.e.j(paramSolverVariable, paramBoolean);
    if (paramBoolean)
      paramSolverVariable.c(this); 
    this.e.e(paramd.w.d[paramSolverVariable.p], f, paramBoolean);
    if (d.c && this.e.a() == 0) {
      this.f = true;
      paramd.j = true;
    } 
  }
  
  public void D(d paramd) {
    if (paramd.p.length == 0)
      return; 
    for (boolean bool = false; !bool; bool = true) {
      int i = this.e.a();
      byte b1;
      for (b1 = 0; b1 < i; b1++) {
        SolverVariable solverVariable = this.e.b(b1);
        if (solverVariable.e != -1 || solverVariable.h || solverVariable.o)
          this.d.add(solverVariable); 
      } 
      i = this.d.size();
      if (i > 0) {
        for (b1 = 0; b1 < i; b1++) {
          SolverVariable solverVariable = this.d.get(b1);
          if (solverVariable.h) {
            A(paramd, solverVariable, true);
          } else if (solverVariable.o) {
            C(paramd, solverVariable, true);
          } else {
            B(paramd, paramd.p[solverVariable.e], true);
          } 
        } 
        this.d.clear();
        continue;
      } 
    } 
    if (d.c && this.a != null && this.e.a() == 0) {
      this.f = true;
      paramd.j = true;
    } 
  }
  
  public void a(SolverVariable paramSolverVariable) {
    int i = paramSolverVariable.f;
    float f = 1.0F;
    if (i != 1)
      if (i == 2) {
        f = 1000.0F;
      } else if (i == 3) {
        f = 1000000.0F;
      } else if (i == 4) {
        f = 1.0E9F;
      } else if (i == 5) {
        f = 1.0E12F;
      }  
    this.e.i(paramSolverVariable, f);
  }
  
  public SolverVariable b(d paramd, boolean[] paramArrayOfboolean) {
    return w(paramArrayOfboolean, null);
  }
  
  public void c(d.a parama) {
    if (parama instanceof b) {
      parama = parama;
      this.a = null;
      this.e.clear();
      for (byte b1 = 0; b1 < ((b)parama).e.a(); b1++) {
        SolverVariable solverVariable = ((b)parama).e.b(b1);
        float f = ((b)parama).e.d(b1);
        this.e.e(solverVariable, f, true);
      } 
    } 
  }
  
  public void clear() {
    this.e.clear();
    this.a = null;
    this.b = 0.0F;
  }
  
  public b d(d paramd, int paramInt) {
    this.e.i(paramd.o(paramInt, "ep"), 1.0F);
    this.e.i(paramd.o(paramInt, "em"), -1.0F);
    return this;
  }
  
  b e(SolverVariable paramSolverVariable, int paramInt) {
    this.e.i(paramSolverVariable, paramInt);
    return this;
  }
  
  boolean f(d paramd) {
    boolean bool;
    SolverVariable solverVariable = g(paramd);
    if (solverVariable == null) {
      bool = true;
    } else {
      x(solverVariable);
      bool = false;
    } 
    if (this.e.a() == 0)
      this.f = true; 
    return bool;
  }
  
  SolverVariable g(d paramd) {
    int i = this.e.a();
    SolverVariable solverVariable1 = null;
    SolverVariable solverVariable2 = null;
    byte b1 = 0;
    boolean bool1 = false;
    boolean bool2 = false;
    float f1 = 0.0F;
    float f2;
    for (f2 = 0.0F;; f2 = f4) {
      boolean bool3;
      SolverVariable solverVariable3;
      SolverVariable solverVariable4;
      boolean bool4;
      float f3;
      float f4;
      if (b1 < i) {
        float f = this.e.d(b1);
        SolverVariable solverVariable = this.e.b(b1);
        if (solverVariable.k == SolverVariable.Type.b) {
          if (solverVariable1 == null) {
            bool3 = u(solverVariable, paramd);
          } else if (f1 > f) {
            bool3 = u(solverVariable, paramd);
          } else {
            SolverVariable solverVariable5 = solverVariable1;
            SolverVariable solverVariable6 = solverVariable2;
            bool3 = bool1;
            boolean bool = bool2;
            float f5 = f1;
            float f6 = f2;
            if (!bool1) {
              solverVariable5 = solverVariable1;
              solverVariable6 = solverVariable2;
              bool3 = bool1;
              bool = bool2;
              f5 = f1;
              f6 = f2;
              if (u(solverVariable, paramd)) {
                bool3 = true;
                solverVariable5 = solverVariable;
                solverVariable6 = solverVariable2;
                bool = bool2;
                f5 = f;
                f6 = f2;
              } 
            } 
            b1++;
            solverVariable1 = solverVariable5;
            solverVariable2 = solverVariable6;
            bool1 = bool3;
            bool2 = bool;
            f1 = f5;
            f2 = f6;
          } 
          solverVariable3 = solverVariable;
          solverVariable4 = solverVariable2;
          bool4 = bool2;
          f3 = f;
          f4 = f2;
        } else {
          solverVariable3 = solverVariable1;
          solverVariable4 = solverVariable2;
          bool3 = bool1;
          bool4 = bool2;
          f3 = f1;
          f4 = f2;
          if (solverVariable1 == null) {
            solverVariable3 = solverVariable1;
            solverVariable4 = solverVariable2;
            bool3 = bool1;
            bool4 = bool2;
            f3 = f1;
            f4 = f2;
            if (f < 0.0F) {
              if (solverVariable2 == null) {
                bool3 = u(solverVariable, paramd);
              } else if (f2 > f) {
                bool3 = u(solverVariable, paramd);
              } else {
                solverVariable3 = solverVariable1;
                solverVariable4 = solverVariable2;
                bool3 = bool1;
                bool4 = bool2;
                f3 = f1;
                f4 = f2;
                if (!bool2) {
                  solverVariable3 = solverVariable1;
                  solverVariable4 = solverVariable2;
                  bool3 = bool1;
                  bool4 = bool2;
                  f3 = f1;
                  f4 = f2;
                  if (u(solverVariable, paramd)) {
                    bool4 = true;
                    f4 = f;
                    f3 = f1;
                    bool3 = bool1;
                    solverVariable4 = solverVariable;
                    solverVariable3 = solverVariable1;
                  } 
                } 
                b1++;
                solverVariable1 = solverVariable3;
                solverVariable2 = solverVariable4;
                bool1 = bool3;
                bool2 = bool4;
                f1 = f3;
                f2 = f4;
              } 
              bool4 = bool3;
              solverVariable3 = solverVariable1;
              solverVariable4 = solverVariable;
              bool3 = bool1;
              f3 = f1;
              f4 = f;
            } 
          } 
        } 
      } else {
        break;
      } 
      b1++;
      solverVariable1 = solverVariable3;
      solverVariable2 = solverVariable4;
      bool1 = bool3;
      bool2 = bool4;
      f1 = f3;
    } 
    return (solverVariable1 != null) ? solverVariable1 : solverVariable2;
  }
  
  public SolverVariable getKey() {
    return this.a;
  }
  
  b h(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, float paramFloat, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, int paramInt2) {
    if (paramSolverVariable2 == paramSolverVariable3) {
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable4, 1.0F);
      this.e.i(paramSolverVariable2, -2.0F);
      return this;
    } 
    if (paramFloat == 0.5F) {
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable2, -1.0F);
      this.e.i(paramSolverVariable3, -1.0F);
      this.e.i(paramSolverVariable4, 1.0F);
      if (paramInt1 > 0 || paramInt2 > 0)
        this.b = (-paramInt1 + paramInt2); 
    } else if (paramFloat <= 0.0F) {
      this.e.i(paramSolverVariable1, -1.0F);
      this.e.i(paramSolverVariable2, 1.0F);
      this.b = paramInt1;
    } else if (paramFloat >= 1.0F) {
      this.e.i(paramSolverVariable4, -1.0F);
      this.e.i(paramSolverVariable3, 1.0F);
      this.b = -paramInt2;
    } else {
      a a1 = this.e;
      float f = 1.0F - paramFloat;
      a1.i(paramSolverVariable1, f * 1.0F);
      this.e.i(paramSolverVariable2, f * -1.0F);
      this.e.i(paramSolverVariable3, -1.0F * paramFloat);
      this.e.i(paramSolverVariable4, 1.0F * paramFloat);
      if (paramInt1 > 0 || paramInt2 > 0)
        this.b = -paramInt1 * f + paramInt2 * paramFloat; 
    } 
    return this;
  }
  
  b i(SolverVariable paramSolverVariable, int paramInt) {
    this.a = paramSolverVariable;
    float f = paramInt;
    paramSolverVariable.g = f;
    this.b = f;
    this.f = true;
    return this;
  }
  
  public boolean isEmpty() {
    boolean bool;
    if (this.a == null && this.b == 0.0F && this.e.a() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  b j(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, float paramFloat) {
    this.e.i(paramSolverVariable1, -1.0F);
    this.e.i(paramSolverVariable2, paramFloat);
    return this;
  }
  
  public b k(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat) {
    this.e.i(paramSolverVariable1, -1.0F);
    this.e.i(paramSolverVariable2, 1.0F);
    this.e.i(paramSolverVariable3, paramFloat);
    this.e.i(paramSolverVariable4, -paramFloat);
    return this;
  }
  
  public b l(float paramFloat1, float paramFloat2, float paramFloat3, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4) {
    this.b = 0.0F;
    if (paramFloat2 == 0.0F || paramFloat1 == paramFloat3) {
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable2, -1.0F);
      this.e.i(paramSolverVariable4, 1.0F);
      this.e.i(paramSolverVariable3, -1.0F);
      return this;
    } 
    if (paramFloat1 == 0.0F) {
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable2, -1.0F);
    } else if (paramFloat3 == 0.0F) {
      this.e.i(paramSolverVariable3, 1.0F);
      this.e.i(paramSolverVariable4, -1.0F);
    } else {
      paramFloat1 = paramFloat1 / paramFloat2 / paramFloat3 / paramFloat2;
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable2, -1.0F);
      this.e.i(paramSolverVariable4, paramFloat1);
      this.e.i(paramSolverVariable3, -paramFloat1);
    } 
    return this;
  }
  
  public b m(SolverVariable paramSolverVariable, int paramInt) {
    if (paramInt < 0) {
      this.b = (paramInt * -1);
      this.e.i(paramSolverVariable, 1.0F);
    } else {
      this.b = paramInt;
      this.e.i(paramSolverVariable, -1.0F);
    } 
    return this;
  }
  
  public b n(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt) {
    int i = 0;
    int j = 0;
    if (paramInt != 0) {
      i = j;
      j = paramInt;
      if (paramInt < 0) {
        j = paramInt * -1;
        i = 1;
      } 
      this.b = j;
    } 
    if (i == 0) {
      this.e.i(paramSolverVariable1, -1.0F);
      this.e.i(paramSolverVariable2, 1.0F);
    } else {
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable2, -1.0F);
    } 
    return this;
  }
  
  public b o(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, int paramInt) {
    int i = 0;
    int j = 0;
    if (paramInt != 0) {
      i = j;
      j = paramInt;
      if (paramInt < 0) {
        j = paramInt * -1;
        i = 1;
      } 
      this.b = j;
    } 
    if (i == 0) {
      this.e.i(paramSolverVariable1, -1.0F);
      this.e.i(paramSolverVariable2, 1.0F);
      this.e.i(paramSolverVariable3, 1.0F);
    } else {
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable2, -1.0F);
      this.e.i(paramSolverVariable3, -1.0F);
    } 
    return this;
  }
  
  public b p(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, int paramInt) {
    int i = 0;
    int j = 0;
    if (paramInt != 0) {
      i = j;
      j = paramInt;
      if (paramInt < 0) {
        j = paramInt * -1;
        i = 1;
      } 
      this.b = j;
    } 
    if (i == 0) {
      this.e.i(paramSolverVariable1, -1.0F);
      this.e.i(paramSolverVariable2, 1.0F);
      this.e.i(paramSolverVariable3, -1.0F);
    } else {
      this.e.i(paramSolverVariable1, 1.0F);
      this.e.i(paramSolverVariable2, -1.0F);
      this.e.i(paramSolverVariable3, 1.0F);
    } 
    return this;
  }
  
  public b q(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat) {
    this.e.i(paramSolverVariable3, 0.5F);
    this.e.i(paramSolverVariable4, 0.5F);
    this.e.i(paramSolverVariable1, -0.5F);
    this.e.i(paramSolverVariable2, -0.5F);
    this.b = -paramFloat;
    return this;
  }
  
  void r() {
    float f = this.b;
    if (f < 0.0F) {
      this.b = f * -1.0F;
      this.e.c();
    } 
  }
  
  boolean s() {
    boolean bool;
    SolverVariable solverVariable = this.a;
    if (solverVariable != null && (solverVariable.k == SolverVariable.Type.b || this.b >= 0.0F)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean t(SolverVariable paramSolverVariable) {
    return this.e.g(paramSolverVariable);
  }
  
  public String toString() {
    return z();
  }
  
  public SolverVariable v(SolverVariable paramSolverVariable) {
    return w(null, paramSolverVariable);
  }
  
  void x(SolverVariable paramSolverVariable) {
    SolverVariable solverVariable = this.a;
    if (solverVariable != null) {
      this.e.i(solverVariable, -1.0F);
      this.a.e = -1;
      this.a = null;
    } 
    float f = this.e.j(paramSolverVariable, true) * -1.0F;
    this.a = paramSolverVariable;
    if (f == 1.0F)
      return; 
    this.b /= f;
    this.e.k(f);
  }
  
  public void y() {
    this.a = null;
    this.e.clear();
    this.b = 0.0F;
    this.f = false;
  }
  
  String z() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroidx/constraintlayout/solver/SolverVariable;
    //   4: ifnonnull -> 37
    //   7: new java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: astore_1
    //   15: aload_1
    //   16: ldc ''
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload_1
    //   23: ldc '0'
    //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload_1
    //   30: invokevirtual toString : ()Ljava/lang/String;
    //   33: astore_1
    //   34: goto -> 66
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore_1
    //   45: aload_1
    //   46: ldc ''
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload_1
    //   53: aload_0
    //   54: getfield a : Landroidx/constraintlayout/solver/SolverVariable;
    //   57: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: aload_1
    //   62: invokevirtual toString : ()Ljava/lang/String;
    //   65: astore_1
    //   66: new java/lang/StringBuilder
    //   69: dup
    //   70: invokespecial <init> : ()V
    //   73: astore_2
    //   74: aload_2
    //   75: aload_1
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: aload_2
    //   81: ldc ' = '
    //   83: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_2
    //   88: invokevirtual toString : ()Ljava/lang/String;
    //   91: astore_1
    //   92: aload_0
    //   93: getfield b : F
    //   96: fstore_3
    //   97: iconst_0
    //   98: istore #4
    //   100: fload_3
    //   101: fconst_0
    //   102: fcmpl
    //   103: ifeq -> 140
    //   106: new java/lang/StringBuilder
    //   109: dup
    //   110: invokespecial <init> : ()V
    //   113: astore_2
    //   114: aload_2
    //   115: aload_1
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: aload_2
    //   121: aload_0
    //   122: getfield b : F
    //   125: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload_2
    //   130: invokevirtual toString : ()Ljava/lang/String;
    //   133: astore_1
    //   134: iconst_1
    //   135: istore #5
    //   137: goto -> 143
    //   140: iconst_0
    //   141: istore #5
    //   143: aload_0
    //   144: getfield e : Landroidx/constraintlayout/solver/b$a;
    //   147: invokeinterface a : ()I
    //   152: istore #6
    //   154: iload #4
    //   156: iload #6
    //   158: if_icmpge -> 409
    //   161: aload_0
    //   162: getfield e : Landroidx/constraintlayout/solver/b$a;
    //   165: iload #4
    //   167: invokeinterface b : (I)Landroidx/constraintlayout/solver/SolverVariable;
    //   172: astore_2
    //   173: aload_2
    //   174: ifnonnull -> 180
    //   177: goto -> 403
    //   180: aload_0
    //   181: getfield e : Landroidx/constraintlayout/solver/b$a;
    //   184: iload #4
    //   186: invokeinterface d : (I)F
    //   191: fstore #7
    //   193: fload #7
    //   195: fconst_0
    //   196: fcmpl
    //   197: ifne -> 203
    //   200: goto -> 403
    //   203: aload_2
    //   204: invokevirtual toString : ()Ljava/lang/String;
    //   207: astore #8
    //   209: iload #5
    //   211: ifne -> 255
    //   214: aload_1
    //   215: astore_2
    //   216: fload #7
    //   218: fstore_3
    //   219: fload #7
    //   221: fconst_0
    //   222: fcmpg
    //   223: ifge -> 326
    //   226: new java/lang/StringBuilder
    //   229: dup
    //   230: invokespecial <init> : ()V
    //   233: astore_2
    //   234: aload_2
    //   235: aload_1
    //   236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: aload_2
    //   241: ldc '- '
    //   243: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   246: pop
    //   247: aload_2
    //   248: invokevirtual toString : ()Ljava/lang/String;
    //   251: astore_2
    //   252: goto -> 320
    //   255: fload #7
    //   257: fconst_0
    //   258: fcmpl
    //   259: ifle -> 294
    //   262: new java/lang/StringBuilder
    //   265: dup
    //   266: invokespecial <init> : ()V
    //   269: astore_2
    //   270: aload_2
    //   271: aload_1
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: aload_2
    //   277: ldc ' + '
    //   279: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   282: pop
    //   283: aload_2
    //   284: invokevirtual toString : ()Ljava/lang/String;
    //   287: astore_2
    //   288: fload #7
    //   290: fstore_3
    //   291: goto -> 326
    //   294: new java/lang/StringBuilder
    //   297: dup
    //   298: invokespecial <init> : ()V
    //   301: astore_2
    //   302: aload_2
    //   303: aload_1
    //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   307: pop
    //   308: aload_2
    //   309: ldc ' - '
    //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: pop
    //   315: aload_2
    //   316: invokevirtual toString : ()Ljava/lang/String;
    //   319: astore_2
    //   320: fload #7
    //   322: ldc -1.0
    //   324: fmul
    //   325: fstore_3
    //   326: fload_3
    //   327: fconst_1
    //   328: fcmpl
    //   329: ifne -> 361
    //   332: new java/lang/StringBuilder
    //   335: dup
    //   336: invokespecial <init> : ()V
    //   339: astore_1
    //   340: aload_1
    //   341: aload_2
    //   342: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: pop
    //   346: aload_1
    //   347: aload #8
    //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: pop
    //   353: aload_1
    //   354: invokevirtual toString : ()Ljava/lang/String;
    //   357: astore_1
    //   358: goto -> 400
    //   361: new java/lang/StringBuilder
    //   364: dup
    //   365: invokespecial <init> : ()V
    //   368: astore_1
    //   369: aload_1
    //   370: aload_2
    //   371: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: pop
    //   375: aload_1
    //   376: fload_3
    //   377: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   380: pop
    //   381: aload_1
    //   382: ldc ' '
    //   384: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: aload_1
    //   389: aload #8
    //   391: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   394: pop
    //   395: aload_1
    //   396: invokevirtual toString : ()Ljava/lang/String;
    //   399: astore_1
    //   400: iconst_1
    //   401: istore #5
    //   403: iinc #4, 1
    //   406: goto -> 154
    //   409: aload_1
    //   410: astore_2
    //   411: iload #5
    //   413: ifne -> 443
    //   416: new java/lang/StringBuilder
    //   419: dup
    //   420: invokespecial <init> : ()V
    //   423: astore_2
    //   424: aload_2
    //   425: aload_1
    //   426: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   429: pop
    //   430: aload_2
    //   431: ldc_w '0.0'
    //   434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   437: pop
    //   438: aload_2
    //   439: invokevirtual toString : ()Ljava/lang/String;
    //   442: astore_2
    //   443: aload_2
    //   444: areturn
  }
  
  public static interface a {
    int a();
    
    SolverVariable b(int param1Int);
    
    void c();
    
    void clear();
    
    float d(int param1Int);
    
    void e(SolverVariable param1SolverVariable, float param1Float, boolean param1Boolean);
    
    float f(SolverVariable param1SolverVariable);
    
    boolean g(SolverVariable param1SolverVariable);
    
    float h(b param1b, boolean param1Boolean);
    
    void i(SolverVariable param1SolverVariable, float param1Float);
    
    float j(SolverVariable param1SolverVariable, boolean param1Boolean);
    
    void k(float param1Float);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */