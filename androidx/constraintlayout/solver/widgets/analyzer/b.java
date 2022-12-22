package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.i;
import androidx.constraintlayout.solver.widgets.j;
import androidx.constraintlayout.solver.widgets.k;
import java.util.ArrayList;

public class b {
  private final ArrayList<ConstraintWidget> a = new ArrayList<ConstraintWidget>();
  
  private a b = new a();
  
  private d c;
  
  public b(d paramd) {
    this.c = paramd;
  }
  
  private boolean a(b paramb, ConstraintWidget paramConstraintWidget, int paramInt) {
    boolean bool;
    this.b.d = paramConstraintWidget.B();
    this.b.e = paramConstraintWidget.R();
    this.b.f = paramConstraintWidget.U();
    this.b.g = paramConstraintWidget.y();
    a a2 = this.b;
    a2.l = false;
    a2.m = paramInt;
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = a2.d;
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
    if (dimensionBehaviour1 == dimensionBehaviour2) {
      bool = true;
    } else {
      bool = false;
    } 
    if (a2.e == dimensionBehaviour2) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (bool && paramConstraintWidget.Z > 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    if (paramInt != 0 && paramConstraintWidget.Z > 0.0F) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (bool && paramConstraintWidget.s[0] == 4)
      a2.d = ConstraintWidget.DimensionBehaviour.b; 
    if (paramInt != 0 && paramConstraintWidget.s[1] == 4)
      a2.e = ConstraintWidget.DimensionBehaviour.b; 
    paramb.b(paramConstraintWidget, a2);
    paramConstraintWidget.Y0(this.b.h);
    paramConstraintWidget.z0(this.b.i);
    paramConstraintWidget.y0(this.b.k);
    paramConstraintWidget.o0(this.b.j);
    a a1 = this.b;
    a1.m = a.a;
    return a1.l;
  }
  
  private void b(d paramd) {
    // Byte code:
    //   0: aload_1
    //   1: getfield N0 : Ljava/util/ArrayList;
    //   4: invokevirtual size : ()I
    //   7: istore_2
    //   8: aload_1
    //   9: bipush #64
    //   11: invokevirtual G1 : (I)Z
    //   14: istore_3
    //   15: aload_1
    //   16: invokevirtual v1 : ()Landroidx/constraintlayout/solver/widgets/analyzer/b$b;
    //   19: astore #4
    //   21: iconst_0
    //   22: istore #5
    //   24: iload #5
    //   26: iload_2
    //   27: if_icmpge -> 400
    //   30: aload_1
    //   31: getfield N0 : Ljava/util/ArrayList;
    //   34: iload #5
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   42: astore #6
    //   44: aload #6
    //   46: instanceof androidx/constraintlayout/solver/widgets/f
    //   49: ifeq -> 55
    //   52: goto -> 392
    //   55: aload #6
    //   57: instanceof androidx/constraintlayout/solver/widgets/a
    //   60: ifeq -> 66
    //   63: goto -> 392
    //   66: aload #6
    //   68: invokevirtual f0 : ()Z
    //   71: ifeq -> 77
    //   74: goto -> 392
    //   77: iload_3
    //   78: ifeq -> 130
    //   81: aload #6
    //   83: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   86: astore #7
    //   88: aload #7
    //   90: ifnull -> 130
    //   93: aload #6
    //   95: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   98: astore #8
    //   100: aload #8
    //   102: ifnull -> 130
    //   105: aload #7
    //   107: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   110: getfield j : Z
    //   113: ifeq -> 130
    //   116: aload #8
    //   118: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   121: getfield j : Z
    //   124: ifeq -> 130
    //   127: goto -> 392
    //   130: aload #6
    //   132: iconst_0
    //   133: invokevirtual v : (I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   136: astore #8
    //   138: iconst_1
    //   139: istore #9
    //   141: aload #6
    //   143: iconst_1
    //   144: invokevirtual v : (I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   147: astore #10
    //   149: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   152: astore #7
    //   154: aload #8
    //   156: aload #7
    //   158: if_acmpne -> 192
    //   161: aload #6
    //   163: getfield q : I
    //   166: iconst_1
    //   167: if_icmpeq -> 192
    //   170: aload #10
    //   172: aload #7
    //   174: if_acmpne -> 192
    //   177: aload #6
    //   179: getfield r : I
    //   182: iconst_1
    //   183: if_icmpeq -> 192
    //   186: iconst_1
    //   187: istore #11
    //   189: goto -> 195
    //   192: iconst_0
    //   193: istore #11
    //   195: iload #11
    //   197: istore #12
    //   199: iload #11
    //   201: ifne -> 365
    //   204: iload #11
    //   206: istore #12
    //   208: aload_1
    //   209: iconst_1
    //   210: invokevirtual G1 : (I)Z
    //   213: ifeq -> 365
    //   216: iload #11
    //   218: istore #12
    //   220: aload #6
    //   222: instanceof androidx/constraintlayout/solver/widgets/j
    //   225: ifne -> 365
    //   228: iload #11
    //   230: istore #12
    //   232: aload #8
    //   234: aload #7
    //   236: if_acmpne -> 277
    //   239: iload #11
    //   241: istore #12
    //   243: aload #6
    //   245: getfield q : I
    //   248: ifne -> 277
    //   251: iload #11
    //   253: istore #12
    //   255: aload #10
    //   257: aload #7
    //   259: if_acmpeq -> 277
    //   262: iload #11
    //   264: istore #12
    //   266: aload #6
    //   268: invokevirtual c0 : ()Z
    //   271: ifne -> 277
    //   274: iconst_1
    //   275: istore #12
    //   277: iload #12
    //   279: istore #11
    //   281: aload #10
    //   283: aload #7
    //   285: if_acmpne -> 326
    //   288: iload #12
    //   290: istore #11
    //   292: aload #6
    //   294: getfield r : I
    //   297: ifne -> 326
    //   300: iload #12
    //   302: istore #11
    //   304: aload #8
    //   306: aload #7
    //   308: if_acmpeq -> 326
    //   311: iload #12
    //   313: istore #11
    //   315: aload #6
    //   317: invokevirtual c0 : ()Z
    //   320: ifne -> 326
    //   323: iconst_1
    //   324: istore #11
    //   326: aload #8
    //   328: aload #7
    //   330: if_acmpeq -> 344
    //   333: iload #11
    //   335: istore #12
    //   337: aload #10
    //   339: aload #7
    //   341: if_acmpne -> 365
    //   344: iload #11
    //   346: istore #12
    //   348: aload #6
    //   350: getfield Z : F
    //   353: fconst_0
    //   354: fcmpl
    //   355: ifle -> 365
    //   358: iload #9
    //   360: istore #12
    //   362: goto -> 365
    //   365: iload #12
    //   367: ifeq -> 373
    //   370: goto -> 392
    //   373: aload_0
    //   374: aload #4
    //   376: aload #6
    //   378: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   381: invokespecial a : (Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)Z
    //   384: pop
    //   385: aload_1
    //   386: getfield S0 : Landroidx/constraintlayout/solver/e;
    //   389: ifnonnull -> 398
    //   392: iinc #5, 1
    //   395: goto -> 24
    //   398: aconst_null
    //   399: athrow
    //   400: aload #4
    //   402: invokeinterface a : ()V
    //   407: return
  }
  
  private void c(d paramd, String paramString, int paramInt1, int paramInt2) {
    int i = paramd.J();
    int j = paramd.I();
    paramd.O0(0);
    paramd.N0(0);
    paramd.Y0(paramInt1);
    paramd.z0(paramInt2);
    paramd.O0(i);
    paramd.N0(j);
    this.c.f1();
  }
  
  public long d(d paramd, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
    b b1 = paramd.v1();
    paramInt9 = ((k)paramd).N0.size();
    int i = paramd.U();
    int j = paramd.y();
    boolean bool = i.b(paramInt1, 128);
    if (bool || i.b(paramInt1, 64)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    paramInt3 = paramInt1;
    if (paramInt1 != 0) {
      paramInt2 = 0;
      while (true) {
        paramInt3 = paramInt1;
        if (paramInt2 < paramInt9) {
          ConstraintWidget constraintWidget = ((k)paramd).N0.get(paramInt2);
          ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = constraintWidget.B();
          ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
          if (dimensionBehaviour1 == dimensionBehaviour2) {
            paramInt3 = 1;
          } else {
            paramInt3 = 0;
          } 
          if (constraintWidget.R() == dimensionBehaviour2) {
            paramInt8 = 1;
          } else {
            paramInt8 = 0;
          } 
          if (paramInt3 != 0 && paramInt8 != 0 && constraintWidget.w() > 0.0F) {
            paramInt3 = 1;
          } else {
            paramInt3 = 0;
          } 
          if ((constraintWidget.c0() && paramInt3 != 0) || (constraintWidget.e0() && paramInt3 != 0) || constraintWidget instanceof j || constraintWidget.c0() || constraintWidget.e0()) {
            paramInt3 = 0;
            break;
          } 
          paramInt2++;
          continue;
        } 
        break;
      } 
    } 
    if (paramInt3 == 0 || d.g == null) {
      if ((paramInt4 == 1073741824 && paramInt6 == 1073741824) || bool) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      } 
      int k = paramInt3 & paramInt1;
      if (k != 0) {
        boolean bool1;
        paramInt1 = Math.min(paramd.H(), paramInt5);
        paramInt2 = Math.min(paramd.G(), paramInt7);
        if (paramInt4 == 1073741824 && paramd.U() != paramInt1) {
          paramd.Y0(paramInt1);
          paramd.z1();
        } 
        if (paramInt6 == 1073741824 && paramd.y() != paramInt2) {
          paramd.z0(paramInt2);
          paramd.z1();
        } 
        if (paramInt4 == 1073741824 && paramInt6 == 1073741824) {
          bool1 = paramd.s1(bool);
          paramInt1 = 2;
        } else {
          bool1 = paramd.t1(bool);
          if (paramInt4 == 1073741824) {
            bool1 &= paramd.u1(bool, 0);
            paramInt1 = 1;
          } else {
            paramInt1 = 0;
          } 
          if (paramInt6 == 1073741824) {
            bool1 = paramd.u1(bool, 1) & bool1;
            paramInt1++;
          } 
        } 
        bool = bool1;
        paramInt2 = paramInt1;
        if (bool1) {
          boolean bool2;
          if (paramInt4 == 1073741824) {
            bool = true;
          } else {
            bool = false;
          } 
          if (paramInt6 == 1073741824) {
            bool2 = true;
          } else {
            bool2 = false;
          } 
          paramd.c1(bool, bool2);
          bool = bool1;
          paramInt2 = paramInt1;
        } 
      } else {
        bool = false;
        paramInt2 = 0;
      } 
      if (!bool || paramInt2 != 2) {
        paramInt4 = paramd.w1();
        if (paramInt9 > 0)
          b(paramd); 
        e(paramd);
        paramInt7 = this.a.size();
        if (paramInt9 > 0)
          c(paramd, "First pass", i, j); 
        if (paramInt7 > 0) {
          int m;
          boolean bool1;
          int i1;
          int i2;
          ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = paramd.B();
          ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.c;
          if (dimensionBehaviour2 == dimensionBehaviour1) {
            paramInt8 = 1;
          } else {
            paramInt8 = 0;
          } 
          if (paramd.R() == dimensionBehaviour1) {
            paramInt9 = 1;
          } else {
            paramInt9 = 0;
          } 
          paramInt2 = Math.max(paramd.U(), this.c.J());
          paramInt1 = Math.max(paramd.y(), this.c.I());
          paramInt6 = 0;
          paramInt3 = 0;
          while (paramInt6 < paramInt7) {
            boolean bool2;
            ConstraintWidget constraintWidget = this.a.get(paramInt6);
            if (!(constraintWidget instanceof j)) {
              paramInt5 = paramInt3;
            } else {
              i1 = constraintWidget.U();
              int i4 = constraintWidget.y();
              int i3 = a(b1, constraintWidget, a.b);
              if (paramd.S0 == null) {
                int i5;
                paramInt5 = constraintWidget.U();
                int i7 = constraintWidget.y();
                if (paramInt5 != i1) {
                  constraintWidget.Y0(paramInt5);
                  paramInt3 = paramInt2;
                  if (paramInt8 != 0) {
                    paramInt3 = paramInt2;
                    if (constraintWidget.N() > paramInt2)
                      paramInt3 = Math.max(paramInt2, constraintWidget.N() + constraintWidget.p(ConstraintAnchor.Type.e).f()); 
                  } 
                  paramInt5 = 1;
                  paramInt2 = paramInt3;
                } else {
                  bool2 = i3 | paramInt3;
                } 
                int i6 = paramInt1;
                if (i7 != i4) {
                  constraintWidget.z0(i7);
                  int i8 = paramInt1;
                  if (paramInt9 != 0) {
                    int i9 = paramInt1;
                    if (constraintWidget.s() > paramInt1)
                      i5 = Math.max(paramInt1, constraintWidget.s() + constraintWidget.p(ConstraintAnchor.Type.f).f()); 
                  } 
                  bool2 = true;
                } 
                bool2 |= ((j)constraintWidget).r1();
                m = i5;
              } else {
                throw null;
              } 
            } 
            paramInt6++;
            bool1 = bool2;
          } 
          byte b2 = 0;
          int n = paramInt7;
          paramInt7 = k;
          while (true) {
            int i3 = paramInt2;
            k = m;
            boolean bool2 = bool1;
            if (b2 < 2) {
              int i4;
              int i6;
              k = 0;
              boolean bool3 = bool1;
              int i5 = paramInt7;
              while (k < n) {
                ConstraintWidget constraintWidget = this.a.get(k);
                if ((constraintWidget instanceof androidx.constraintlayout.solver.widgets.g && !(constraintWidget instanceof j)) || constraintWidget instanceof androidx.constraintlayout.solver.widgets.f || constraintWidget.T() == 8 || (i5 != 0 && constraintWidget.f.e.j && constraintWidget.g.e.j) || constraintWidget instanceof j) {
                  boolean bool4 = bool3;
                } else {
                  int i10 = constraintWidget.U();
                  int i8 = constraintWidget.y();
                  int i9 = constraintWidget.q();
                  paramInt7 = a.b;
                  if (b2 == 1)
                    paramInt7 = a.c; 
                  int i7 = a(b1, constraintWidget, paramInt7);
                  if (paramd.S0 == null) {
                    int i12;
                    paramInt7 = constraintWidget.U();
                    int i13 = constraintWidget.y();
                    if (paramInt7 != i10) {
                      constraintWidget.Y0(paramInt7);
                      int i14 = paramInt2;
                      if (paramInt8 != 0) {
                        int i15 = paramInt2;
                        if (constraintWidget.N() > paramInt2)
                          i12 = Math.max(paramInt2, constraintWidget.N() + constraintWidget.p(ConstraintAnchor.Type.e).f()); 
                      } 
                      paramInt7 = 1;
                      i4 = i12;
                    } else {
                      paramInt7 = i7 | i12;
                    } 
                    int i11 = m;
                    if (i13 != i8) {
                      constraintWidget.z0(i13);
                      i11 = m;
                      if (paramInt9 != 0) {
                        i11 = m;
                        if (constraintWidget.s() > m)
                          i11 = Math.max(m, constraintWidget.s() + constraintWidget.p(ConstraintAnchor.Type.f).f()); 
                      } 
                      paramInt7 = 1;
                    } 
                    if (constraintWidget.X() && i9 != constraintWidget.q()) {
                      paramInt7 = 1;
                      m = i11;
                    } else {
                      m = i11;
                    } 
                  } else {
                    throw null;
                  } 
                } 
                k++;
                i6 = paramInt7;
              } 
              i2 = i4;
              k = m;
              i1 = i6;
              if (i6 != 0) {
                c(paramd, "intermediate pass", i, j);
                b2++;
                i6 = 0;
                paramInt7 = i5;
                i5 = i6;
                continue;
              } 
            } 
            break;
          } 
          if (i1 != 0) {
            c(paramd, "2nd pass", i, j);
            if (paramd.U() < i2) {
              paramd.Y0(i2);
              m = 1;
            } else {
              m = 0;
            } 
            if (paramd.y() < k) {
              paramd.z0(k);
              m = 1;
            } 
            if (m != 0)
              c(paramd, "3rd pass", i, j); 
          } 
        } 
        paramd.J1(paramInt4);
      } 
      return 0L;
    } 
    throw null;
  }
  
  public void e(d paramd) {
    this.a.clear();
    int i = ((k)paramd).N0.size();
    for (byte b1 = 0; b1 < i; b1++) {
      ConstraintWidget constraintWidget = ((k)paramd).N0.get(b1);
      ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = constraintWidget.B();
      ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
      if (dimensionBehaviour1 == dimensionBehaviour2 || constraintWidget.R() == dimensionBehaviour2)
        this.a.add(constraintWidget); 
    } 
    paramd.z1();
  }
  
  public static class a {
    public static int a = 0;
    
    public static int b = 1;
    
    public static int c = 2;
    
    public ConstraintWidget.DimensionBehaviour d;
    
    public ConstraintWidget.DimensionBehaviour e;
    
    public int f;
    
    public int g;
    
    public int h;
    
    public int i;
    
    public int j;
    
    public boolean k;
    
    public boolean l;
    
    public int m;
  }
  
  public static interface b {
    void a();
    
    void b(ConstraintWidget param1ConstraintWidget, b.a param1a);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */