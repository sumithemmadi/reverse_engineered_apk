package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.widgets.analyzer.h;
import androidx.constraintlayout.solver.widgets.analyzer.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {
  private HashSet<ConstraintAnchor> a = null;
  
  private int b;
  
  private boolean c;
  
  public final ConstraintWidget d;
  
  public final Type e;
  
  public ConstraintAnchor f;
  
  public int g = 0;
  
  int h = -1;
  
  SolverVariable i;
  
  public ConstraintAnchor(ConstraintWidget paramConstraintWidget, Type paramType) {
    this.d = paramConstraintWidget;
    this.e = paramType;
  }
  
  public boolean a(ConstraintAnchor paramConstraintAnchor, int paramInt) {
    return b(paramConstraintAnchor, paramInt, -1, false);
  }
  
  public boolean b(ConstraintAnchor paramConstraintAnchor, int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramConstraintAnchor == null) {
      q();
      return true;
    } 
    if (!paramBoolean && !p(paramConstraintAnchor))
      return false; 
    this.f = paramConstraintAnchor;
    if (paramConstraintAnchor.a == null)
      paramConstraintAnchor.a = new HashSet<ConstraintAnchor>(); 
    HashSet<ConstraintAnchor> hashSet = this.f.a;
    if (hashSet != null)
      hashSet.add(this); 
    if (paramInt1 > 0) {
      this.g = paramInt1;
    } else {
      this.g = 0;
    } 
    this.h = paramInt2;
    return true;
  }
  
  public void c(int paramInt, ArrayList<n> paramArrayList, n paramn) {
    HashSet<ConstraintAnchor> hashSet = this.a;
    if (hashSet != null) {
      Iterator<ConstraintAnchor> iterator = hashSet.iterator();
      while (iterator.hasNext())
        h.a(((ConstraintAnchor)iterator.next()).d, paramInt, paramArrayList, paramn); 
    } 
  }
  
  public HashSet<ConstraintAnchor> d() {
    return this.a;
  }
  
  public int e() {
    return !this.c ? 0 : this.b;
  }
  
  public int f() {
    if (this.d.T() == 8)
      return 0; 
    if (this.h > -1) {
      ConstraintAnchor constraintAnchor = this.f;
      if (constraintAnchor != null && constraintAnchor.d.T() == 8)
        return this.h; 
    } 
    return this.g;
  }
  
  public final ConstraintAnchor g() {
    switch (a.a[this.e.ordinal()]) {
      default:
        throw new AssertionError(this.e.name());
      case 5:
        return this.d.L;
      case 4:
        return this.d.N;
      case 3:
        return this.d.K;
      case 2:
        return this.d.M;
      case 1:
      case 6:
      case 7:
      case 8:
      case 9:
        break;
    } 
    return null;
  }
  
  public ConstraintWidget h() {
    return this.d;
  }
  
  public SolverVariable i() {
    return this.i;
  }
  
  public ConstraintAnchor j() {
    return this.f;
  }
  
  public Type k() {
    return this.e;
  }
  
  public boolean l() {
    HashSet<ConstraintAnchor> hashSet = this.a;
    if (hashSet == null)
      return false; 
    Iterator<ConstraintAnchor> iterator = hashSet.iterator();
    while (iterator.hasNext()) {
      if (((ConstraintAnchor)iterator.next()).g().o())
        return true; 
    } 
    return false;
  }
  
  public boolean m() {
    HashSet<ConstraintAnchor> hashSet = this.a;
    boolean bool = false;
    if (hashSet == null)
      return false; 
    if (hashSet.size() > 0)
      bool = true; 
    return bool;
  }
  
  public boolean n() {
    return this.c;
  }
  
  public boolean o() {
    boolean bool;
    if (this.f != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean p(ConstraintAnchor paramConstraintAnchor) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: iconst_0
    //   5: istore #4
    //   7: aload_1
    //   8: ifnonnull -> 13
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_1
    //   14: invokevirtual k : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   17: astore #5
    //   19: aload_0
    //   20: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   23: astore #6
    //   25: aload #5
    //   27: aload #6
    //   29: if_acmpne -> 64
    //   32: aload #6
    //   34: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   37: if_acmpne -> 62
    //   40: aload_1
    //   41: invokevirtual h : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   44: invokevirtual X : ()Z
    //   47: ifeq -> 60
    //   50: aload_0
    //   51: invokevirtual h : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   54: invokevirtual X : ()Z
    //   57: ifne -> 62
    //   60: iconst_0
    //   61: ireturn
    //   62: iconst_1
    //   63: ireturn
    //   64: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$a.a : [I
    //   67: aload #6
    //   69: invokevirtual ordinal : ()I
    //   72: iaload
    //   73: tableswitch default -> 124, 1 -> 272, 2 -> 207, 3 -> 207, 4 -> 141, 5 -> 141, 6 -> 139, 7 -> 139, 8 -> 139, 9 -> 139
    //   124: new java/lang/AssertionError
    //   127: dup
    //   128: aload_0
    //   129: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   132: invokevirtual name : ()Ljava/lang/String;
    //   135: invokespecial <init> : (Ljava/lang/Object;)V
    //   138: athrow
    //   139: iconst_0
    //   140: ireturn
    //   141: aload #5
    //   143: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   146: if_acmpeq -> 166
    //   149: aload #5
    //   151: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   154: if_acmpne -> 160
    //   157: goto -> 166
    //   160: iconst_0
    //   161: istore #7
    //   163: goto -> 169
    //   166: iconst_1
    //   167: istore #7
    //   169: iload #7
    //   171: istore_3
    //   172: aload_1
    //   173: invokevirtual h : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   176: instanceof androidx/constraintlayout/solver/widgets/f
    //   179: ifeq -> 205
    //   182: iload #7
    //   184: ifne -> 199
    //   187: iload #4
    //   189: istore #7
    //   191: aload #5
    //   193: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.j : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   196: if_acmpne -> 202
    //   199: iconst_1
    //   200: istore #7
    //   202: iload #7
    //   204: istore_3
    //   205: iload_3
    //   206: ireturn
    //   207: aload #5
    //   209: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   212: if_acmpeq -> 232
    //   215: aload #5
    //   217: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   220: if_acmpne -> 226
    //   223: goto -> 232
    //   226: iconst_0
    //   227: istore #7
    //   229: goto -> 235
    //   232: iconst_1
    //   233: istore #7
    //   235: iload #7
    //   237: istore_3
    //   238: aload_1
    //   239: invokevirtual h : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   242: instanceof androidx/constraintlayout/solver/widgets/f
    //   245: ifeq -> 270
    //   248: iload #7
    //   250: ifne -> 264
    //   253: iload_2
    //   254: istore #7
    //   256: aload #5
    //   258: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.i : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   261: if_acmpne -> 267
    //   264: iconst_1
    //   265: istore #7
    //   267: iload #7
    //   269: istore_3
    //   270: iload_3
    //   271: ireturn
    //   272: iload_3
    //   273: istore #7
    //   275: aload #5
    //   277: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   280: if_acmpeq -> 308
    //   283: iload_3
    //   284: istore #7
    //   286: aload #5
    //   288: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.i : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   291: if_acmpeq -> 308
    //   294: iload_3
    //   295: istore #7
    //   297: aload #5
    //   299: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.j : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   302: if_acmpeq -> 308
    //   305: iconst_1
    //   306: istore #7
    //   308: iload #7
    //   310: ireturn
  }
  
  public void q() {
    ConstraintAnchor constraintAnchor = this.f;
    if (constraintAnchor != null) {
      HashSet<ConstraintAnchor> hashSet = constraintAnchor.a;
      if (hashSet != null) {
        hashSet.remove(this);
        if (this.f.a.size() == 0)
          this.f.a = null; 
      } 
    } 
    this.a = null;
    this.f = null;
    this.g = 0;
    this.h = -1;
    this.c = false;
    this.b = 0;
  }
  
  public void r() {
    this.c = false;
    this.b = 0;
  }
  
  public void s(c paramc) {
    SolverVariable solverVariable = this.i;
    if (solverVariable == null) {
      this.i = new SolverVariable(SolverVariable.Type.b, null);
    } else {
      solverVariable.d();
    } 
  }
  
  public void t(int paramInt) {
    this.b = paramInt;
    this.c = true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.d.u());
    stringBuilder.append(":");
    stringBuilder.append(this.e.toString());
    return stringBuilder.toString();
  }
  
  public void u(int paramInt) {
    if (o())
      this.h = paramInt; 
  }
  
  public enum Type {
    b, c, d, e, f, g, h, i, j;
    
    static {
      Type type1 = new Type("NONE", 0);
      b = type1;
      Type type2 = new Type("LEFT", 1);
      c = type2;
      Type type3 = new Type("TOP", 2);
      d = type3;
      Type type4 = new Type("RIGHT", 3);
      e = type4;
      Type type5 = new Type("BOTTOM", 4);
      f = type5;
      Type type6 = new Type("BASELINE", 5);
      g = type6;
      Type type7 = new Type("CENTER", 6);
      h = type7;
      Type type8 = new Type("CENTER_X", 7);
      i = type8;
      Type type9 = new Type("CENTER_Y", 8);
      j = type9;
      k = new Type[] { type1, type2, type3, type4, type5, type6, type7, type8, type9 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/ConstraintAnchor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */