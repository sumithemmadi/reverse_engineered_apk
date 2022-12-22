package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

public class d {
  public static boolean a = false;
  
  public static boolean b = true;
  
  public static boolean c = true;
  
  public static boolean d = true;
  
  public static boolean e = false;
  
  private static int f = 1000;
  
  public static e g;
  
  public static long h;
  
  public static long i;
  
  public boolean j = false;
  
  int k = 0;
  
  private HashMap<String, SolverVariable> l = null;
  
  private a m;
  
  private int n = 32;
  
  private int o = 32;
  
  b[] p = null;
  
  public boolean q = false;
  
  public boolean r = false;
  
  private boolean[] s = new boolean[32];
  
  int t = 1;
  
  int u = 0;
  
  private int v = 32;
  
  final c w;
  
  private SolverVariable[] x = new SolverVariable[f];
  
  private int y = 0;
  
  private a z;
  
  public d() {
    this.p = new b[32];
    C();
    c c1 = new c();
    this.w = c1;
    this.m = new h(c1);
    if (e) {
      this.z = new b(this, c1);
    } else {
      this.z = new b(c1);
    } 
  }
  
  private final int B(a parama, boolean paramBoolean) {
    if (g == null) {
      int i;
      for (i = 0; i < this.t; i++)
        this.s[i] = false; 
      boolean bool = false;
      i = 0;
      while (!bool) {
        if (g == null) {
          int j = i + 1;
          if (j >= this.t * 2)
            return j; 
          if (parama.getKey() != null)
            this.s[(parama.getKey()).d] = true; 
          SolverVariable solverVariable = parama.b(this, this.s);
          if (solverVariable != null) {
            boolean[] arrayOfBoolean = this.s;
            i = solverVariable.d;
            if (arrayOfBoolean[i])
              return j; 
            arrayOfBoolean[i] = true;
          } 
          if (solverVariable != null) {
            float f = Float.MAX_VALUE;
            i = 0;
            int k;
            for (k = -1; i < this.u; k = m) {
              float f1;
              int m;
              b b1 = this.p[i];
              if (b1.a.k == SolverVariable.Type.b) {
                f1 = f;
                m = k;
              } else if (b1.f) {
                f1 = f;
                m = k;
              } else {
                f1 = f;
                m = k;
                if (b1.t(solverVariable)) {
                  float f2 = b1.e.f(solverVariable);
                  f1 = f;
                  m = k;
                  if (f2 < 0.0F) {
                    f2 = -b1.b / f2;
                    f1 = f;
                    m = k;
                    if (f2 < f) {
                      m = i;
                      f1 = f2;
                    } 
                  } 
                } 
              } 
              i++;
              f = f1;
            } 
            i = j;
            if (k > -1) {
              b b1 = this.p[k];
              b1.a.e = -1;
              if (g == null) {
                b1.x(solverVariable);
                solverVariable = b1.a;
                solverVariable.e = k;
                solverVariable.g(this, b1);
                i = j;
                continue;
              } 
              throw null;
            } 
            continue;
          } 
          bool = true;
          i = j;
          continue;
        } 
        throw null;
      } 
      return i;
    } 
    throw null;
  }
  
  private void C() {
    boolean bool = e;
    byte b1 = 0;
    byte b2 = 0;
    if (bool) {
      for (b1 = b2; b1 < this.u; b1++) {
        b b3 = this.p[b1];
        if (b3 != null)
          this.w.a.c(b3); 
        this.p[b1] = null;
      } 
    } else {
      while (b1 < this.u) {
        b b3 = this.p[b1];
        if (b3 != null)
          this.w.b.c(b3); 
        this.p[b1] = null;
        b1++;
      } 
    } 
  }
  
  private SolverVariable a(SolverVariable.Type paramType, String paramString) {
    SolverVariable solverVariable1;
    SolverVariable solverVariable2 = this.w.c.b();
    if (solverVariable2 == null) {
      solverVariable2 = new SolverVariable(paramType, paramString);
      solverVariable2.f(paramType, paramString);
      solverVariable1 = solverVariable2;
    } else {
      solverVariable2.d();
      solverVariable2.f((SolverVariable.Type)solverVariable1, paramString);
      solverVariable1 = solverVariable2;
    } 
    int i = this.y;
    int j = f;
    if (i >= j) {
      j *= 2;
      f = j;
      this.x = Arrays.<SolverVariable>copyOf(this.x, j);
    } 
    SolverVariable[] arrayOfSolverVariable = this.x;
    j = this.y;
    this.y = j + 1;
    arrayOfSolverVariable[j] = solverVariable1;
    return solverVariable1;
  }
  
  private final void l(b paramb) {
    if (c && paramb.f) {
      paramb.a.e(this, paramb.b);
    } else {
      b[] arrayOfB = this.p;
      int i = this.u;
      arrayOfB[i] = paramb;
      SolverVariable solverVariable = paramb.a;
      solverVariable.e = i;
      this.u = i + 1;
      solverVariable.g(this, paramb);
    } 
    if (c && this.j) {
      for (int i = 0; i < this.u; i = j + 1) {
        if (this.p[i] == null)
          System.out.println("WTF"); 
        b[] arrayOfB = this.p;
        int j = i;
        if (arrayOfB[i] != null) {
          j = i;
          if ((arrayOfB[i]).f) {
            b b1 = arrayOfB[i];
            b1.a.e(this, b1.b);
            if (e) {
              this.w.a.c(b1);
            } else {
              this.w.b.c(b1);
            } 
            this.p[i] = null;
            j = i + 1;
            int k = j;
            while (true) {
              int m = this.u;
              if (j < m) {
                b[] arrayOfB1 = this.p;
                k = j - 1;
                arrayOfB1[k] = arrayOfB1[j];
                if ((arrayOfB1[k]).a.e == j)
                  (arrayOfB1[k]).a.e = k; 
                k = j;
                j++;
                continue;
              } 
              if (k < m)
                this.p[k] = null; 
              this.u = m - 1;
              j = i - 1;
              break;
            } 
          } 
        } 
      } 
      this.j = false;
    } 
  }
  
  private void n() {
    for (byte b1 = 0; b1 < this.u; b1++) {
      b b2 = this.p[b1];
      b2.a.g = b2.b;
    } 
  }
  
  public static b s(d paramd, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, float paramFloat) {
    return paramd.r().j(paramSolverVariable1, paramSolverVariable2, paramFloat);
  }
  
  private int u(a parama) {
    int i = 0;
    while (true) {
      if (i < this.u) {
        b[] arrayOfB = this.p;
        if ((arrayOfB[i]).a.k != SolverVariable.Type.b && (arrayOfB[i]).b < 0.0F) {
          i = 1;
          break;
        } 
        i++;
        continue;
      } 
      i = 0;
      break;
    } 
    if (i != 0) {
      boolean bool = false;
      i = 0;
      while (!bool) {
        if (g == null) {
          int j = i + 1;
          float f = Float.MAX_VALUE;
          i = 0;
          byte b1 = -1;
          byte b2 = -1;
          byte b3;
          for (b3 = 0; i < this.u; b3 = b6) {
            float f1;
            byte b4;
            byte b5;
            byte b6;
            parama = this.p[i];
            if (((b)parama).a.k == SolverVariable.Type.b) {
              f1 = f;
              b4 = b1;
              b5 = b2;
              b6 = b3;
            } else if (((b)parama).f) {
              f1 = f;
              b4 = b1;
              b5 = b2;
              b6 = b3;
            } else {
              f1 = f;
              b4 = b1;
              b5 = b2;
              b6 = b3;
              if (((b)parama).b < 0.0F) {
                byte b7;
                if (d) {
                  int k = ((b)parama).e.a();
                  b7 = 0;
                  while (true) {
                    f1 = f;
                    b4 = b1;
                    b5 = b2;
                    b6 = b3;
                    if (b7 < k) {
                      SolverVariable solverVariable = ((b)parama).e.b(b7);
                      float f2 = ((b)parama).e.f(solverVariable);
                      if (f2 <= 0.0F) {
                        f1 = f;
                        b4 = b1;
                        b5 = b2;
                        b6 = b3;
                        continue;
                      } 
                      b6 = 0;
                      byte b8 = b2;
                      b2 = b6;
                      while (true) {
                        f1 = f;
                        b4 = b1;
                        b5 = b8;
                        b6 = b3;
                        b2++;
                        b3 = b6;
                      } 
                      continue;
                    } 
                    break;
                    b7++;
                    f = f1;
                    b1 = b4;
                    b2 = b5;
                    b3 = b6;
                  } 
                } else {
                  byte b8 = 1;
                  while (true) {
                    f1 = f;
                    b4 = b1;
                    b5 = b2;
                    b6 = b3;
                    if (b8 < this.t) {
                      SolverVariable solverVariable = this.w.d[b8];
                      float f2 = ((b)parama).e.f(solverVariable);
                      if (f2 <= 0.0F) {
                        f1 = f;
                        b7 = b1;
                        b4 = b2;
                        b5 = b3;
                        continue;
                      } 
                      b4 = 0;
                      b6 = b2;
                      b2 = b4;
                      while (true) {
                        f1 = f;
                        b7 = b1;
                        b4 = b6;
                        b5 = b3;
                        b2++;
                        b3 = b4;
                      } 
                      continue;
                    } 
                    break;
                    b8++;
                    f = f1;
                    b1 = b7;
                    b2 = b4;
                    b3 = b5;
                  } 
                } 
              } 
            } 
            i++;
            f = f1;
            b1 = b4;
            b2 = b5;
          } 
          if (b1 != -1) {
            parama = this.p[b1];
            ((b)parama).a.e = -1;
            if (g == null) {
              parama.x(this.w.d[b2]);
              SolverVariable solverVariable = ((b)parama).a;
              solverVariable.e = b1;
              solverVariable.g(this, (b)parama);
            } else {
              throw null;
            } 
          } else {
            bool = true;
          } 
          i = j;
          if (j > this.t / 2) {
            bool = true;
            i = j;
          } 
          continue;
        } 
        throw null;
      } 
    } else {
      i = 0;
    } 
    return i;
  }
  
  public static e w() {
    return g;
  }
  
  private void y() {
    int i = this.n * 2;
    this.n = i;
    this.p = Arrays.<b>copyOf(this.p, i);
    c c1 = this.w;
    c1.d = Arrays.<SolverVariable>copyOf(c1.d, this.n);
    i = this.n;
    this.s = new boolean[i];
    this.o = i;
    this.v = i;
    if (g == null)
      return; 
    throw null;
  }
  
  void A(a parama) {
    if (g == null) {
      u(parama);
      B(parama, false);
      n();
      return;
    } 
    throw null;
  }
  
  public void D() {
    byte b1 = 0;
    while (true) {
      SolverVariable solverVariable;
      c c1 = this.w;
      SolverVariable[] arrayOfSolverVariable = c1.d;
      if (b1 < arrayOfSolverVariable.length) {
        solverVariable = arrayOfSolverVariable[b1];
        if (solverVariable != null)
          solverVariable.d(); 
        b1++;
        continue;
      } 
      ((c)solverVariable).c.d(this.x, this.y);
      this.y = 0;
      Arrays.fill((Object[])this.w.d, (Object)null);
      HashMap<String, SolverVariable> hashMap = this.l;
      if (hashMap != null)
        hashMap.clear(); 
      this.k = 0;
      this.m.clear();
      this.t = 1;
      for (b1 = 0; b1 < this.u; b1++) {
        b[] arrayOfB = this.p;
        if (arrayOfB[b1] != null)
          (arrayOfB[b1]).c = false; 
      } 
      C();
      this.u = 0;
      if (e) {
        this.z = new b(this, this.w);
      } else {
        this.z = new b(this.w);
      } 
      return;
    } 
  }
  
  public void b(ConstraintWidget paramConstraintWidget1, ConstraintWidget paramConstraintWidget2, float paramFloat, int paramInt) {
    ConstraintAnchor.Type type1 = ConstraintAnchor.Type.c;
    SolverVariable solverVariable3 = q(paramConstraintWidget1.p(type1));
    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.d;
    SolverVariable solverVariable5 = q(paramConstraintWidget1.p(type2));
    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.e;
    SolverVariable solverVariable7 = q(paramConstraintWidget1.p(type3));
    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f;
    SolverVariable solverVariable1 = q(paramConstraintWidget1.p(type4));
    SolverVariable solverVariable2 = q(paramConstraintWidget2.p(type1));
    SolverVariable solverVariable4 = q(paramConstraintWidget2.p(type2));
    SolverVariable solverVariable6 = q(paramConstraintWidget2.p(type3));
    SolverVariable solverVariable8 = q(paramConstraintWidget2.p(type4));
    b b2 = r();
    double d1 = paramFloat;
    double d2 = Math.sin(d1);
    double d3 = paramInt;
    Double.isNaN(d3);
    b2.q(solverVariable5, solverVariable1, solverVariable4, solverVariable8, (float)(d2 * d3));
    d(b2);
    b b1 = r();
    d2 = Math.cos(d1);
    Double.isNaN(d3);
    b1.q(solverVariable3, solverVariable7, solverVariable2, solverVariable6, (float)(d2 * d3));
    d(b1);
  }
  
  public void c(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, float paramFloat, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, int paramInt2, int paramInt3) {
    b b1 = r();
    b1.h(paramSolverVariable1, paramSolverVariable2, paramInt1, paramFloat, paramSolverVariable3, paramSolverVariable4, paramInt2);
    if (paramInt3 != 8)
      b1.d(this, paramInt3); 
    d(b1);
  }
  
  public void d(b paramb) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 5
    //   4: return
    //   5: getstatic androidx/constraintlayout/solver/d.g : Landroidx/constraintlayout/solver/e;
    //   8: ifnonnull -> 269
    //   11: aload_0
    //   12: getfield u : I
    //   15: istore_2
    //   16: iconst_1
    //   17: istore_3
    //   18: iload_2
    //   19: iconst_1
    //   20: iadd
    //   21: aload_0
    //   22: getfield v : I
    //   25: if_icmpge -> 41
    //   28: aload_0
    //   29: getfield t : I
    //   32: iconst_1
    //   33: iadd
    //   34: aload_0
    //   35: getfield o : I
    //   38: if_icmplt -> 45
    //   41: aload_0
    //   42: invokespecial y : ()V
    //   45: iconst_0
    //   46: istore_2
    //   47: aload_1
    //   48: getfield f : Z
    //   51: ifne -> 259
    //   54: aload_1
    //   55: aload_0
    //   56: invokevirtual D : (Landroidx/constraintlayout/solver/d;)V
    //   59: aload_1
    //   60: invokevirtual isEmpty : ()Z
    //   63: ifeq -> 67
    //   66: return
    //   67: aload_1
    //   68: invokevirtual r : ()V
    //   71: aload_1
    //   72: aload_0
    //   73: invokevirtual f : (Landroidx/constraintlayout/solver/d;)Z
    //   76: ifeq -> 249
    //   79: aload_0
    //   80: invokevirtual p : ()Landroidx/constraintlayout/solver/SolverVariable;
    //   83: astore #4
    //   85: aload_1
    //   86: aload #4
    //   88: putfield a : Landroidx/constraintlayout/solver/SolverVariable;
    //   91: aload_0
    //   92: getfield u : I
    //   95: istore_2
    //   96: aload_0
    //   97: aload_1
    //   98: invokespecial l : (Landroidx/constraintlayout/solver/b;)V
    //   101: aload_0
    //   102: getfield u : I
    //   105: iload_2
    //   106: iconst_1
    //   107: iadd
    //   108: if_icmpne -> 249
    //   111: aload_0
    //   112: getfield z : Landroidx/constraintlayout/solver/d$a;
    //   115: aload_1
    //   116: invokeinterface c : (Landroidx/constraintlayout/solver/d$a;)V
    //   121: aload_0
    //   122: aload_0
    //   123: getfield z : Landroidx/constraintlayout/solver/d$a;
    //   126: iconst_1
    //   127: invokespecial B : (Landroidx/constraintlayout/solver/d$a;Z)I
    //   130: pop
    //   131: iload_3
    //   132: istore_2
    //   133: aload #4
    //   135: getfield e : I
    //   138: iconst_m1
    //   139: if_icmpne -> 251
    //   142: aload_1
    //   143: getfield a : Landroidx/constraintlayout/solver/SolverVariable;
    //   146: aload #4
    //   148: if_acmpne -> 181
    //   151: aload_1
    //   152: aload #4
    //   154: invokevirtual v : (Landroidx/constraintlayout/solver/SolverVariable;)Landroidx/constraintlayout/solver/SolverVariable;
    //   157: astore #4
    //   159: aload #4
    //   161: ifnull -> 181
    //   164: getstatic androidx/constraintlayout/solver/d.g : Landroidx/constraintlayout/solver/e;
    //   167: ifnonnull -> 179
    //   170: aload_1
    //   171: aload #4
    //   173: invokevirtual x : (Landroidx/constraintlayout/solver/SolverVariable;)V
    //   176: goto -> 181
    //   179: aconst_null
    //   180: athrow
    //   181: aload_1
    //   182: getfield f : Z
    //   185: ifne -> 197
    //   188: aload_1
    //   189: getfield a : Landroidx/constraintlayout/solver/SolverVariable;
    //   192: aload_0
    //   193: aload_1
    //   194: invokevirtual g : (Landroidx/constraintlayout/solver/d;Landroidx/constraintlayout/solver/b;)V
    //   197: getstatic androidx/constraintlayout/solver/d.e : Z
    //   200: ifeq -> 220
    //   203: aload_0
    //   204: getfield w : Landroidx/constraintlayout/solver/c;
    //   207: getfield a : Landroidx/constraintlayout/solver/f;
    //   210: aload_1
    //   211: invokeinterface c : (Ljava/lang/Object;)Z
    //   216: pop
    //   217: goto -> 234
    //   220: aload_0
    //   221: getfield w : Landroidx/constraintlayout/solver/c;
    //   224: getfield b : Landroidx/constraintlayout/solver/f;
    //   227: aload_1
    //   228: invokeinterface c : (Ljava/lang/Object;)Z
    //   233: pop
    //   234: aload_0
    //   235: aload_0
    //   236: getfield u : I
    //   239: iconst_1
    //   240: isub
    //   241: putfield u : I
    //   244: iload_3
    //   245: istore_2
    //   246: goto -> 251
    //   249: iconst_0
    //   250: istore_2
    //   251: aload_1
    //   252: invokevirtual s : ()Z
    //   255: ifne -> 259
    //   258: return
    //   259: iload_2
    //   260: ifne -> 268
    //   263: aload_0
    //   264: aload_1
    //   265: invokespecial l : (Landroidx/constraintlayout/solver/b;)V
    //   268: return
    //   269: aconst_null
    //   270: athrow
  }
  
  public b e(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2) {
    if (b && paramInt2 == 8 && paramSolverVariable2.h && paramSolverVariable1.e == -1) {
      paramSolverVariable1.e(this, paramSolverVariable2.g + paramInt1);
      return null;
    } 
    b b1 = r();
    b1.n(paramSolverVariable1, paramSolverVariable2, paramInt1);
    if (paramInt2 != 8)
      b1.d(this, paramInt2); 
    d(b1);
    return b1;
  }
  
  public void f(SolverVariable paramSolverVariable, int paramInt) {
    if (b && paramSolverVariable.e == -1) {
      float f = paramInt;
      paramSolverVariable.e(this, f);
      for (paramInt = 0; paramInt < this.k + 1; paramInt++) {
        SolverVariable solverVariable = this.w.d[paramInt];
        if (solverVariable != null && solverVariable.o && solverVariable.p == paramSolverVariable.d)
          solverVariable.e(this, solverVariable.q + f); 
      } 
      return;
    } 
    int i = paramSolverVariable.e;
    if (i != -1) {
      b b1 = this.p[i];
      if (b1.f) {
        b1.b = paramInt;
      } else if (b1.e.a() == 0) {
        b1.f = true;
        b1.b = paramInt;
      } else {
        b1 = r();
        b1.m(paramSolverVariable, paramInt);
        d(b1);
      } 
    } else {
      b b1 = r();
      b1.i(paramSolverVariable, paramInt);
      d(b1);
    } 
  }
  
  public void g(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt, boolean paramBoolean) {
    b b1 = r();
    SolverVariable solverVariable = t();
    solverVariable.f = 0;
    b1.o(paramSolverVariable1, paramSolverVariable2, solverVariable, paramInt);
    d(b1);
  }
  
  public void h(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2) {
    b b1 = r();
    SolverVariable solverVariable = t();
    solverVariable.f = 0;
    b1.o(paramSolverVariable1, paramSolverVariable2, solverVariable, paramInt1);
    if (paramInt2 != 8)
      m(b1, (int)(b1.e.f(solverVariable) * -1.0F), paramInt2); 
    d(b1);
  }
  
  public void i(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt, boolean paramBoolean) {
    b b1 = r();
    SolverVariable solverVariable = t();
    solverVariable.f = 0;
    b1.p(paramSolverVariable1, paramSolverVariable2, solverVariable, paramInt);
    d(b1);
  }
  
  public void j(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, int paramInt1, int paramInt2) {
    b b1 = r();
    SolverVariable solverVariable = t();
    solverVariable.f = 0;
    b1.p(paramSolverVariable1, paramSolverVariable2, solverVariable, paramInt1);
    if (paramInt2 != 8)
      m(b1, (int)(b1.e.f(solverVariable) * -1.0F), paramInt2); 
    d(b1);
  }
  
  public void k(SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, SolverVariable paramSolverVariable3, SolverVariable paramSolverVariable4, float paramFloat, int paramInt) {
    b b1 = r();
    b1.k(paramSolverVariable1, paramSolverVariable2, paramSolverVariable3, paramSolverVariable4, paramFloat);
    if (paramInt != 8)
      b1.d(this, paramInt); 
    d(b1);
  }
  
  void m(b paramb, int paramInt1, int paramInt2) {
    paramb.e(o(paramInt2, null), paramInt1);
  }
  
  public SolverVariable o(int paramInt, String paramString) {
    if (g == null) {
      if (this.t + 1 >= this.o)
        y(); 
      SolverVariable solverVariable = a(SolverVariable.Type.e, paramString);
      int i = this.k + 1;
      this.k = i;
      this.t++;
      solverVariable.d = i;
      solverVariable.f = paramInt;
      this.w.d[i] = solverVariable;
      this.m.a(solverVariable);
      return solverVariable;
    } 
    throw null;
  }
  
  public SolverVariable p() {
    if (g == null) {
      if (this.t + 1 >= this.o)
        y(); 
      SolverVariable solverVariable = a(SolverVariable.Type.d, null);
      int i = this.k + 1;
      this.k = i;
      this.t++;
      solverVariable.d = i;
      this.w.d[i] = solverVariable;
      return solverVariable;
    } 
    throw null;
  }
  
  public SolverVariable q(Object paramObject) {
    SolverVariable solverVariable = null;
    if (paramObject == null)
      return null; 
    if (this.t + 1 >= this.o)
      y(); 
    if (paramObject instanceof ConstraintAnchor) {
      ConstraintAnchor constraintAnchor = (ConstraintAnchor)paramObject;
      solverVariable = constraintAnchor.i();
      paramObject = solverVariable;
      if (solverVariable == null) {
        constraintAnchor.s(this.w);
        paramObject = constraintAnchor.i();
      } 
      i = ((SolverVariable)paramObject).d;
      if (i != -1 && i <= this.k) {
        Object object = paramObject;
        if (this.w.d[i] == null) {
          if (i != -1)
            paramObject.d(); 
          i = this.k + 1;
          this.k = i;
          this.t++;
          ((SolverVariable)paramObject).d = i;
          ((SolverVariable)paramObject).k = SolverVariable.Type.b;
          this.w.d[i] = (SolverVariable)paramObject;
          return (SolverVariable)paramObject;
        } 
        return (SolverVariable)object;
      } 
    } else {
      return solverVariable;
    } 
    if (i != -1)
      paramObject.d(); 
    int i = this.k + 1;
    this.k = i;
    this.t++;
    ((SolverVariable)paramObject).d = i;
    ((SolverVariable)paramObject).k = SolverVariable.Type.b;
    this.w.d[i] = (SolverVariable)paramObject;
    return (SolverVariable)paramObject;
  }
  
  public b r() {
    b b1;
    if (e) {
      b1 = this.w.a.b();
      if (b1 == null) {
        b1 = new b(this, this.w);
        i++;
      } else {
        b1.y();
      } 
    } else {
      b1 = this.w.b.b();
      if (b1 == null) {
        b1 = new b(this.w);
        h++;
      } else {
        b1.y();
      } 
    } 
    SolverVariable.b();
    return b1;
  }
  
  public SolverVariable t() {
    if (g == null) {
      if (this.t + 1 >= this.o)
        y(); 
      SolverVariable solverVariable = a(SolverVariable.Type.d, null);
      int i = this.k + 1;
      this.k = i;
      this.t++;
      solverVariable.d = i;
      this.w.d[i] = solverVariable;
      return solverVariable;
    } 
    throw null;
  }
  
  public c v() {
    return this.w;
  }
  
  public int x(Object paramObject) {
    paramObject = ((ConstraintAnchor)paramObject).i();
    return (paramObject != null) ? (int)(((SolverVariable)paramObject).g + 0.5F) : 0;
  }
  
  public void z() {
    if (g == null) {
      if (this.m.isEmpty()) {
        n();
        return;
      } 
      if (this.q || this.r) {
        if (g == null) {
          boolean bool = false;
          byte b1 = 0;
          while (true) {
            if (b1 < this.u) {
              if (!(this.p[b1]).f) {
                b1 = bool;
                break;
              } 
              b1++;
              continue;
            } 
            b1 = 1;
            break;
          } 
          if (b1 == 0) {
            A(this.m);
          } else {
            if (g == null) {
              n();
              return;
            } 
            throw null;
          } 
          return;
        } 
        throw null;
      } 
      A(this.m);
      return;
    } 
    throw null;
  }
  
  static interface a {
    void a(SolverVariable param1SolverVariable);
    
    SolverVariable b(d param1d, boolean[] param1ArrayOfboolean);
    
    void c(a param1a);
    
    void clear();
    
    SolverVariable getKey();
    
    boolean isEmpty();
  }
  
  class b extends b {
    public b(d this$0, c param1c) {
      this.e = new i(this, param1c);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */