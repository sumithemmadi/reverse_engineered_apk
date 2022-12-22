package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.e;
import androidx.constraintlayout.solver.widgets.analyzer.b;
import androidx.constraintlayout.solver.widgets.analyzer.e;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;

public class d extends k {
  b O0 = new b(this);
  
  public e P0 = new e(this);
  
  protected b.b Q0 = null;
  
  private boolean R0 = false;
  
  public e S0;
  
  protected androidx.constraintlayout.solver.d T0 = new androidx.constraintlayout.solver.d();
  
  int U0;
  
  int V0;
  
  int W0;
  
  int X0;
  
  public int Y0 = 0;
  
  public int Z0 = 0;
  
  c[] a1 = new c[4];
  
  c[] b1 = new c[4];
  
  public boolean c1 = false;
  
  public boolean d1 = false;
  
  public boolean e1 = false;
  
  public int f1 = 0;
  
  public int g1 = 0;
  
  private int h1 = 257;
  
  public boolean i1 = false;
  
  private boolean j1 = false;
  
  private boolean k1 = false;
  
  int l1 = 0;
  
  private WeakReference<ConstraintAnchor> m1 = null;
  
  private WeakReference<ConstraintAnchor> n1 = null;
  
  private WeakReference<ConstraintAnchor> o1 = null;
  
  private WeakReference<ConstraintAnchor> p1 = null;
  
  public b.a q1 = new b.a();
  
  public static boolean F1(ConstraintWidget paramConstraintWidget, b.b paramb, b.a parama, int paramInt) {
    boolean bool1;
    boolean bool2;
    if (paramb == null)
      return false; 
    parama.d = paramConstraintWidget.B();
    parama.e = paramConstraintWidget.R();
    parama.f = paramConstraintWidget.U();
    parama.g = paramConstraintWidget.y();
    parama.l = false;
    parama.m = paramInt;
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = parama.d;
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.d;
    if (dimensionBehaviour1 == dimensionBehaviour2) {
      i = 1;
    } else {
      i = 0;
    } 
    if (parama.e == dimensionBehaviour2) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (i && paramConstraintWidget.Z > 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramInt != 0 && paramConstraintWidget.Z > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    int j = i;
    if (i) {
      j = i;
      if (paramConstraintWidget.Y(0)) {
        j = i;
        if (paramConstraintWidget.q == 0) {
          j = i;
          if (!bool1) {
            parama.d = ConstraintWidget.DimensionBehaviour.c;
            if (paramInt != 0 && paramConstraintWidget.r == 0)
              parama.d = ConstraintWidget.DimensionBehaviour.b; 
            j = 0;
          } 
        } 
      } 
    } 
    int i = paramInt;
    if (paramInt != 0) {
      i = paramInt;
      if (paramConstraintWidget.Y(1)) {
        i = paramInt;
        if (paramConstraintWidget.r == 0) {
          i = paramInt;
          if (!bool2) {
            parama.e = ConstraintWidget.DimensionBehaviour.c;
            if (j != 0 && paramConstraintWidget.q == 0)
              parama.e = ConstraintWidget.DimensionBehaviour.b; 
            i = 0;
          } 
        } 
      } 
    } 
    if (paramConstraintWidget.h0()) {
      parama.d = ConstraintWidget.DimensionBehaviour.b;
      j = 0;
    } 
    if (paramConstraintWidget.i0()) {
      parama.e = ConstraintWidget.DimensionBehaviour.b;
      i = 0;
    } 
    if (bool1)
      if (paramConstraintWidget.s[0] == 4) {
        parama.d = ConstraintWidget.DimensionBehaviour.b;
      } else if (i == 0) {
        dimensionBehaviour2 = parama.e;
        dimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.b;
        if (dimensionBehaviour2 == dimensionBehaviour1) {
          paramInt = parama.g;
        } else {
          parama.d = ConstraintWidget.DimensionBehaviour.c;
          paramb.b(paramConstraintWidget, parama);
          paramInt = parama.i;
        } 
        parama.d = dimensionBehaviour1;
        i = paramConstraintWidget.a0;
        if (i == 0 || i == -1) {
          parama.f = (int)(paramConstraintWidget.w() * paramInt);
        } else {
          parama.f = (int)(paramConstraintWidget.w() / paramInt);
        } 
      }  
    if (bool2)
      if (paramConstraintWidget.s[1] == 4) {
        parama.e = ConstraintWidget.DimensionBehaviour.b;
      } else if (j == 0) {
        dimensionBehaviour1 = parama.d;
        dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.b;
        if (dimensionBehaviour1 == dimensionBehaviour2) {
          paramInt = parama.f;
        } else {
          parama.e = ConstraintWidget.DimensionBehaviour.c;
          paramb.b(paramConstraintWidget, parama);
          paramInt = parama.h;
        } 
        parama.e = dimensionBehaviour2;
        i = paramConstraintWidget.a0;
        if (i == 0 || i == -1) {
          parama.g = (int)(paramInt / paramConstraintWidget.w());
          paramb.b(paramConstraintWidget, parama);
          paramConstraintWidget.Y0(parama.h);
          paramConstraintWidget.z0(parama.i);
          paramConstraintWidget.y0(parama.k);
          paramConstraintWidget.o0(parama.j);
          parama.m = b.a.a;
          return parama.l;
        } 
        parama.g = (int)(paramInt * paramConstraintWidget.w());
      }  
    paramb.b(paramConstraintWidget, parama);
    paramConstraintWidget.Y0(parama.h);
    paramConstraintWidget.z0(parama.i);
    paramConstraintWidget.y0(parama.k);
    paramConstraintWidget.o0(parama.j);
    parama.m = b.a.a;
    return parama.l;
  }
  
  private void H1() {
    this.Y0 = 0;
    this.Z0 = 0;
  }
  
  private void k1(ConstraintWidget paramConstraintWidget) {
    int i = this.Y0;
    c[] arrayOfC = this.b1;
    if (i + 1 >= arrayOfC.length)
      this.b1 = Arrays.<c>copyOf(arrayOfC, arrayOfC.length * 2); 
    this.b1[this.Y0] = new c(paramConstraintWidget, 0, C1());
    this.Y0++;
  }
  
  private void n1(ConstraintAnchor paramConstraintAnchor, SolverVariable paramSolverVariable) {
    SolverVariable solverVariable = this.T0.q(paramConstraintAnchor);
    this.T0.h(paramSolverVariable, solverVariable, 0, 5);
  }
  
  private void o1(ConstraintAnchor paramConstraintAnchor, SolverVariable paramSolverVariable) {
    SolverVariable solverVariable = this.T0.q(paramConstraintAnchor);
    this.T0.h(solverVariable, paramSolverVariable, 0, 5);
  }
  
  private void p1(ConstraintWidget paramConstraintWidget) {
    int i = this.Z0;
    c[] arrayOfC = this.a1;
    if (i + 1 >= arrayOfC.length)
      this.a1 = Arrays.<c>copyOf(arrayOfC, arrayOfC.length * 2); 
    this.a1[this.Z0] = new c(paramConstraintWidget, 1, C1());
    this.Z0++;
  }
  
  public void A1() {
    this.P0.k();
  }
  
  public boolean B1() {
    return this.k1;
  }
  
  public boolean C1() {
    return this.R0;
  }
  
  public boolean D1() {
    return this.j1;
  }
  
  public long E1(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
    this.U0 = paramInt8;
    this.V0 = paramInt9;
    return this.O0.d(this, paramInt1, paramInt8, paramInt9, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public boolean G1(int paramInt) {
    boolean bool;
    if ((this.h1 & paramInt) == paramInt) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void I1(b.b paramb) {
    this.Q0 = paramb;
    this.P0.n(paramb);
  }
  
  public void J1(int paramInt) {
    this.h1 = paramInt;
    androidx.constraintlayout.solver.d.a = G1(512);
  }
  
  public void K1(boolean paramBoolean) {
    this.R0 = paramBoolean;
  }
  
  public void L1(androidx.constraintlayout.solver.d paramd, boolean[] paramArrayOfboolean) {
    byte b1 = 0;
    paramArrayOfboolean[2] = false;
    boolean bool = G1(64);
    d1(paramd, bool);
    int i = this.N0.size();
    while (b1 < i) {
      ((ConstraintWidget)this.N0.get(b1)).d1(paramd, bool);
      b1++;
    } 
  }
  
  public void M1() {
    this.O0.e(this);
  }
  
  public void c1(boolean paramBoolean1, boolean paramBoolean2) {
    super.c1(paramBoolean1, paramBoolean2);
    int i = this.N0.size();
    for (byte b1 = 0; b1 < i; b1++)
      ((ConstraintWidget)this.N0.get(b1)).c1(paramBoolean1, paramBoolean2); 
  }
  
  public void f1() {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield b0 : I
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield c0 : I
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield j1 : Z
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield k1 : Z
    //   20: aload_0
    //   21: getfield N0 : Ljava/util/ArrayList;
    //   24: invokevirtual size : ()I
    //   27: istore_1
    //   28: iconst_0
    //   29: aload_0
    //   30: invokevirtual U : ()I
    //   33: invokestatic max : (II)I
    //   36: istore_2
    //   37: iconst_0
    //   38: aload_0
    //   39: invokevirtual y : ()I
    //   42: invokestatic max : (II)I
    //   45: istore_3
    //   46: aload_0
    //   47: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   50: astore #4
    //   52: aload #4
    //   54: iconst_1
    //   55: aaload
    //   56: astore #5
    //   58: aload #4
    //   60: iconst_0
    //   61: aaload
    //   62: astore #4
    //   64: aload_0
    //   65: getfield S0 : Landroidx/constraintlayout/solver/e;
    //   68: ifnonnull -> 1564
    //   71: aload_0
    //   72: getfield h1 : I
    //   75: iconst_1
    //   76: invokestatic b : (II)Z
    //   79: ifeq -> 250
    //   82: aload_0
    //   83: aload_0
    //   84: invokevirtual v1 : ()Landroidx/constraintlayout/solver/widgets/analyzer/b$b;
    //   87: invokestatic h : (Landroidx/constraintlayout/solver/widgets/d;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;)V
    //   90: iconst_0
    //   91: istore #6
    //   93: iload #6
    //   95: iload_1
    //   96: if_icmpge -> 250
    //   99: aload_0
    //   100: getfield N0 : Ljava/util/ArrayList;
    //   103: iload #6
    //   105: invokevirtual get : (I)Ljava/lang/Object;
    //   108: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   111: astore #7
    //   113: aload #7
    //   115: invokevirtual g0 : ()Z
    //   118: ifeq -> 244
    //   121: aload #7
    //   123: instanceof androidx/constraintlayout/solver/widgets/f
    //   126: ifne -> 244
    //   129: aload #7
    //   131: instanceof androidx/constraintlayout/solver/widgets/a
    //   134: ifne -> 244
    //   137: aload #7
    //   139: instanceof androidx/constraintlayout/solver/widgets/j
    //   142: ifne -> 244
    //   145: aload #7
    //   147: invokevirtual f0 : ()Z
    //   150: ifne -> 244
    //   153: aload #7
    //   155: iconst_0
    //   156: invokevirtual v : (I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   159: astore #8
    //   161: aload #7
    //   163: iconst_1
    //   164: invokevirtual v : (I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   167: astore #9
    //   169: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   172: astore #10
    //   174: aload #8
    //   176: aload #10
    //   178: if_acmpne -> 212
    //   181: aload #7
    //   183: getfield q : I
    //   186: iconst_1
    //   187: if_icmpeq -> 212
    //   190: aload #9
    //   192: aload #10
    //   194: if_acmpne -> 212
    //   197: aload #7
    //   199: getfield r : I
    //   202: iconst_1
    //   203: if_icmpeq -> 212
    //   206: iconst_1
    //   207: istore #11
    //   209: goto -> 215
    //   212: iconst_0
    //   213: istore #11
    //   215: iload #11
    //   217: ifne -> 244
    //   220: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   223: dup
    //   224: invokespecial <init> : ()V
    //   227: astore #10
    //   229: aload #7
    //   231: aload_0
    //   232: getfield Q0 : Landroidx/constraintlayout/solver/widgets/analyzer/b$b;
    //   235: aload #10
    //   237: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   240: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   243: pop
    //   244: iinc #6, 1
    //   247: goto -> 93
    //   250: iload_1
    //   251: iconst_2
    //   252: if_icmple -> 396
    //   255: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   258: astore #7
    //   260: aload #4
    //   262: aload #7
    //   264: if_acmpeq -> 274
    //   267: aload #5
    //   269: aload #7
    //   271: if_acmpne -> 396
    //   274: aload_0
    //   275: getfield h1 : I
    //   278: sipush #1024
    //   281: invokestatic b : (II)Z
    //   284: ifeq -> 396
    //   287: aload_0
    //   288: aload_0
    //   289: invokevirtual v1 : ()Landroidx/constraintlayout/solver/widgets/analyzer/b$b;
    //   292: invokestatic c : (Landroidx/constraintlayout/solver/widgets/d;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;)Z
    //   295: ifeq -> 396
    //   298: iload_2
    //   299: istore #6
    //   301: aload #4
    //   303: aload #7
    //   305: if_acmpne -> 342
    //   308: iload_2
    //   309: aload_0
    //   310: invokevirtual U : ()I
    //   313: if_icmpge -> 336
    //   316: iload_2
    //   317: ifle -> 336
    //   320: aload_0
    //   321: iload_2
    //   322: invokevirtual Y0 : (I)V
    //   325: aload_0
    //   326: iconst_1
    //   327: putfield j1 : Z
    //   330: iload_2
    //   331: istore #6
    //   333: goto -> 342
    //   336: aload_0
    //   337: invokevirtual U : ()I
    //   340: istore #6
    //   342: iload_3
    //   343: istore_2
    //   344: aload #5
    //   346: aload #7
    //   348: if_acmpne -> 383
    //   351: iload_3
    //   352: aload_0
    //   353: invokevirtual y : ()I
    //   356: if_icmpge -> 378
    //   359: iload_3
    //   360: ifle -> 378
    //   363: aload_0
    //   364: iload_3
    //   365: invokevirtual z0 : (I)V
    //   368: aload_0
    //   369: iconst_1
    //   370: putfield k1 : Z
    //   373: iload_3
    //   374: istore_2
    //   375: goto -> 383
    //   378: aload_0
    //   379: invokevirtual y : ()I
    //   382: istore_2
    //   383: iload #6
    //   385: istore #11
    //   387: iconst_1
    //   388: istore #6
    //   390: iload_2
    //   391: istore #12
    //   393: goto -> 405
    //   396: iconst_0
    //   397: istore #6
    //   399: iload_3
    //   400: istore #12
    //   402: iload_2
    //   403: istore #11
    //   405: aload_0
    //   406: bipush #64
    //   408: invokevirtual G1 : (I)Z
    //   411: ifne -> 432
    //   414: aload_0
    //   415: sipush #128
    //   418: invokevirtual G1 : (I)Z
    //   421: ifeq -> 427
    //   424: goto -> 432
    //   427: iconst_0
    //   428: istore_2
    //   429: goto -> 434
    //   432: iconst_1
    //   433: istore_2
    //   434: aload_0
    //   435: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   438: astore #7
    //   440: aload #7
    //   442: iconst_0
    //   443: putfield q : Z
    //   446: aload #7
    //   448: iconst_0
    //   449: putfield r : Z
    //   452: aload_0
    //   453: getfield h1 : I
    //   456: ifeq -> 469
    //   459: iload_2
    //   460: ifeq -> 469
    //   463: aload #7
    //   465: iconst_1
    //   466: putfield r : Z
    //   469: aload_0
    //   470: getfield N0 : Ljava/util/ArrayList;
    //   473: astore #7
    //   475: aload_0
    //   476: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   479: astore #10
    //   481: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   484: astore #9
    //   486: aload #10
    //   488: aload #9
    //   490: if_acmpeq -> 511
    //   493: aload_0
    //   494: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   497: aload #9
    //   499: if_acmpne -> 505
    //   502: goto -> 511
    //   505: iconst_0
    //   506: istore #13
    //   508: goto -> 514
    //   511: iconst_1
    //   512: istore #13
    //   514: aload_0
    //   515: invokespecial H1 : ()V
    //   518: iconst_0
    //   519: istore_2
    //   520: iload_2
    //   521: iload_1
    //   522: if_icmpge -> 560
    //   525: aload_0
    //   526: getfield N0 : Ljava/util/ArrayList;
    //   529: iload_2
    //   530: invokevirtual get : (I)Ljava/lang/Object;
    //   533: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   536: astore #10
    //   538: aload #10
    //   540: instanceof androidx/constraintlayout/solver/widgets/k
    //   543: ifeq -> 554
    //   546: aload #10
    //   548: checkcast androidx/constraintlayout/solver/widgets/k
    //   551: invokevirtual f1 : ()V
    //   554: iinc #2, 1
    //   557: goto -> 520
    //   560: aload_0
    //   561: bipush #64
    //   563: invokevirtual G1 : (I)Z
    //   566: istore #14
    //   568: iconst_0
    //   569: istore_2
    //   570: iconst_1
    //   571: istore #15
    //   573: iload #15
    //   575: ifeq -> 1523
    //   578: iload_2
    //   579: iconst_1
    //   580: iadd
    //   581: istore #16
    //   583: iload #15
    //   585: istore #17
    //   587: aload_0
    //   588: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   591: invokevirtual D : ()V
    //   594: iload #15
    //   596: istore #17
    //   598: aload_0
    //   599: invokespecial H1 : ()V
    //   602: iload #15
    //   604: istore #17
    //   606: aload_0
    //   607: aload_0
    //   608: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   611: invokevirtual n : (Landroidx/constraintlayout/solver/d;)V
    //   614: iconst_0
    //   615: istore_2
    //   616: iload_2
    //   617: iload_1
    //   618: if_icmpge -> 649
    //   621: iload #15
    //   623: istore #17
    //   625: aload_0
    //   626: getfield N0 : Ljava/util/ArrayList;
    //   629: iload_2
    //   630: invokevirtual get : (I)Ljava/lang/Object;
    //   633: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   636: aload_0
    //   637: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   640: invokevirtual n : (Landroidx/constraintlayout/solver/d;)V
    //   643: iinc #2, 1
    //   646: goto -> 616
    //   649: iload #15
    //   651: istore #17
    //   653: aload_0
    //   654: aload_0
    //   655: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   658: invokevirtual j1 : (Landroidx/constraintlayout/solver/d;)Z
    //   661: istore #15
    //   663: iload #15
    //   665: istore #17
    //   667: aload_0
    //   668: getfield m1 : Ljava/lang/ref/WeakReference;
    //   671: astore #10
    //   673: aload #10
    //   675: ifnull -> 728
    //   678: iload #15
    //   680: istore #17
    //   682: aload #10
    //   684: invokevirtual get : ()Ljava/lang/Object;
    //   687: ifnull -> 728
    //   690: iload #15
    //   692: istore #17
    //   694: aload_0
    //   695: aload_0
    //   696: getfield m1 : Ljava/lang/ref/WeakReference;
    //   699: invokevirtual get : ()Ljava/lang/Object;
    //   702: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   705: aload_0
    //   706: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   709: aload_0
    //   710: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   713: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   716: invokespecial o1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/SolverVariable;)V
    //   719: iload #15
    //   721: istore #17
    //   723: aload_0
    //   724: aconst_null
    //   725: putfield m1 : Ljava/lang/ref/WeakReference;
    //   728: iload #15
    //   730: istore #17
    //   732: aload_0
    //   733: getfield o1 : Ljava/lang/ref/WeakReference;
    //   736: astore #10
    //   738: aload #10
    //   740: ifnull -> 793
    //   743: iload #15
    //   745: istore #17
    //   747: aload #10
    //   749: invokevirtual get : ()Ljava/lang/Object;
    //   752: ifnull -> 793
    //   755: iload #15
    //   757: istore #17
    //   759: aload_0
    //   760: aload_0
    //   761: getfield o1 : Ljava/lang/ref/WeakReference;
    //   764: invokevirtual get : ()Ljava/lang/Object;
    //   767: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   770: aload_0
    //   771: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   774: aload_0
    //   775: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   778: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   781: invokespecial n1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/SolverVariable;)V
    //   784: iload #15
    //   786: istore #17
    //   788: aload_0
    //   789: aconst_null
    //   790: putfield o1 : Ljava/lang/ref/WeakReference;
    //   793: iload #15
    //   795: istore #17
    //   797: aload_0
    //   798: getfield n1 : Ljava/lang/ref/WeakReference;
    //   801: astore #10
    //   803: aload #10
    //   805: ifnull -> 858
    //   808: iload #15
    //   810: istore #17
    //   812: aload #10
    //   814: invokevirtual get : ()Ljava/lang/Object;
    //   817: ifnull -> 858
    //   820: iload #15
    //   822: istore #17
    //   824: aload_0
    //   825: aload_0
    //   826: getfield n1 : Ljava/lang/ref/WeakReference;
    //   829: invokevirtual get : ()Ljava/lang/Object;
    //   832: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   835: aload_0
    //   836: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   839: aload_0
    //   840: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   843: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   846: invokespecial o1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/SolverVariable;)V
    //   849: iload #15
    //   851: istore #17
    //   853: aload_0
    //   854: aconst_null
    //   855: putfield n1 : Ljava/lang/ref/WeakReference;
    //   858: iload #15
    //   860: istore #17
    //   862: aload_0
    //   863: getfield p1 : Ljava/lang/ref/WeakReference;
    //   866: astore #10
    //   868: aload #10
    //   870: ifnull -> 923
    //   873: iload #15
    //   875: istore #17
    //   877: aload #10
    //   879: invokevirtual get : ()Ljava/lang/Object;
    //   882: ifnull -> 923
    //   885: iload #15
    //   887: istore #17
    //   889: aload_0
    //   890: aload_0
    //   891: getfield p1 : Ljava/lang/ref/WeakReference;
    //   894: invokevirtual get : ()Ljava/lang/Object;
    //   897: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   900: aload_0
    //   901: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   904: aload_0
    //   905: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   908: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   911: invokespecial n1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/SolverVariable;)V
    //   914: iload #15
    //   916: istore #17
    //   918: aload_0
    //   919: aconst_null
    //   920: putfield p1 : Ljava/lang/ref/WeakReference;
    //   923: iload #15
    //   925: istore #17
    //   927: iload #15
    //   929: ifeq -> 998
    //   932: iload #15
    //   934: istore #17
    //   936: aload_0
    //   937: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   940: invokevirtual z : ()V
    //   943: iload #15
    //   945: istore #17
    //   947: goto -> 998
    //   950: astore #9
    //   952: aload #9
    //   954: invokevirtual printStackTrace : ()V
    //   957: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   960: astore #8
    //   962: new java/lang/StringBuilder
    //   965: dup
    //   966: invokespecial <init> : ()V
    //   969: astore #10
    //   971: aload #10
    //   973: ldc_w 'EXCEPTION : '
    //   976: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   979: pop
    //   980: aload #10
    //   982: aload #9
    //   984: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   987: pop
    //   988: aload #8
    //   990: aload #10
    //   992: invokevirtual toString : ()Ljava/lang/String;
    //   995: invokevirtual println : (Ljava/lang/String;)V
    //   998: iload #17
    //   1000: ifeq -> 1017
    //   1003: aload_0
    //   1004: aload_0
    //   1005: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   1008: getstatic androidx/constraintlayout/solver/widgets/i.a : [Z
    //   1011: invokevirtual L1 : (Landroidx/constraintlayout/solver/d;[Z)V
    //   1014: goto -> 1060
    //   1017: aload_0
    //   1018: aload_0
    //   1019: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   1022: iload #14
    //   1024: invokevirtual d1 : (Landroidx/constraintlayout/solver/d;Z)V
    //   1027: iconst_0
    //   1028: istore_2
    //   1029: iload_2
    //   1030: iload_1
    //   1031: if_icmpge -> 1060
    //   1034: aload_0
    //   1035: getfield N0 : Ljava/util/ArrayList;
    //   1038: iload_2
    //   1039: invokevirtual get : (I)Ljava/lang/Object;
    //   1042: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   1045: aload_0
    //   1046: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   1049: iload #14
    //   1051: invokevirtual d1 : (Landroidx/constraintlayout/solver/d;Z)V
    //   1054: iinc #2, 1
    //   1057: goto -> 1029
    //   1060: iload #13
    //   1062: ifeq -> 1264
    //   1065: iload #16
    //   1067: bipush #8
    //   1069: if_icmpge -> 1264
    //   1072: getstatic androidx/constraintlayout/solver/widgets/i.a : [Z
    //   1075: iconst_2
    //   1076: baload
    //   1077: ifeq -> 1264
    //   1080: iconst_0
    //   1081: istore #18
    //   1083: iconst_0
    //   1084: istore_3
    //   1085: iconst_0
    //   1086: istore_2
    //   1087: iload #18
    //   1089: iload_1
    //   1090: if_icmpge -> 1145
    //   1093: aload_0
    //   1094: getfield N0 : Ljava/util/ArrayList;
    //   1097: iload #18
    //   1099: invokevirtual get : (I)Ljava/lang/Object;
    //   1102: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   1105: astore #10
    //   1107: iload_3
    //   1108: aload #10
    //   1110: getfield b0 : I
    //   1113: aload #10
    //   1115: invokevirtual U : ()I
    //   1118: iadd
    //   1119: invokestatic max : (II)I
    //   1122: istore_3
    //   1123: iload_2
    //   1124: aload #10
    //   1126: getfield c0 : I
    //   1129: aload #10
    //   1131: invokevirtual y : ()I
    //   1134: iadd
    //   1135: invokestatic max : (II)I
    //   1138: istore_2
    //   1139: iinc #18, 1
    //   1142: goto -> 1087
    //   1145: aload_0
    //   1146: getfield i0 : I
    //   1149: iload_3
    //   1150: invokestatic max : (II)I
    //   1153: istore #18
    //   1155: aload_0
    //   1156: getfield j0 : I
    //   1159: iload_2
    //   1160: invokestatic max : (II)I
    //   1163: istore_3
    //   1164: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1167: astore #10
    //   1169: aload #4
    //   1171: aload #10
    //   1173: if_acmpne -> 1207
    //   1176: aload_0
    //   1177: invokevirtual U : ()I
    //   1180: iload #18
    //   1182: if_icmpge -> 1207
    //   1185: aload_0
    //   1186: iload #18
    //   1188: invokevirtual Y0 : (I)V
    //   1191: aload_0
    //   1192: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1195: iconst_0
    //   1196: aload #10
    //   1198: aastore
    //   1199: iconst_1
    //   1200: istore #15
    //   1202: iconst_1
    //   1203: istore_2
    //   1204: goto -> 1213
    //   1207: iconst_0
    //   1208: istore #15
    //   1210: iload #6
    //   1212: istore_2
    //   1213: iload #15
    //   1215: istore #17
    //   1217: iload_2
    //   1218: istore #6
    //   1220: aload #5
    //   1222: aload #10
    //   1224: if_acmpne -> 1267
    //   1227: iload #15
    //   1229: istore #17
    //   1231: iload_2
    //   1232: istore #6
    //   1234: aload_0
    //   1235: invokevirtual y : ()I
    //   1238: iload_3
    //   1239: if_icmpge -> 1267
    //   1242: aload_0
    //   1243: iload_3
    //   1244: invokevirtual z0 : (I)V
    //   1247: aload_0
    //   1248: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1251: iconst_1
    //   1252: aload #10
    //   1254: aastore
    //   1255: iconst_1
    //   1256: istore #17
    //   1258: iconst_1
    //   1259: istore #6
    //   1261: goto -> 1267
    //   1264: iconst_0
    //   1265: istore #17
    //   1267: aload_0
    //   1268: getfield i0 : I
    //   1271: aload_0
    //   1272: invokevirtual U : ()I
    //   1275: invokestatic max : (II)I
    //   1278: istore_2
    //   1279: iload_2
    //   1280: aload_0
    //   1281: invokevirtual U : ()I
    //   1284: if_icmple -> 1307
    //   1287: aload_0
    //   1288: iload_2
    //   1289: invokevirtual Y0 : (I)V
    //   1292: aload_0
    //   1293: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1296: iconst_0
    //   1297: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1300: aastore
    //   1301: iconst_1
    //   1302: istore #17
    //   1304: iconst_1
    //   1305: istore #6
    //   1307: aload_0
    //   1308: getfield j0 : I
    //   1311: aload_0
    //   1312: invokevirtual y : ()I
    //   1315: invokestatic max : (II)I
    //   1318: istore_2
    //   1319: iload_2
    //   1320: aload_0
    //   1321: invokevirtual y : ()I
    //   1324: if_icmple -> 1350
    //   1327: aload_0
    //   1328: iload_2
    //   1329: invokevirtual z0 : (I)V
    //   1332: aload_0
    //   1333: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1336: iconst_1
    //   1337: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1340: aastore
    //   1341: iconst_1
    //   1342: istore #17
    //   1344: iconst_1
    //   1345: istore #6
    //   1347: goto -> 1350
    //   1350: iload #17
    //   1352: istore #15
    //   1354: iload #6
    //   1356: istore_3
    //   1357: iload #6
    //   1359: ifne -> 1514
    //   1362: aload_0
    //   1363: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1366: iconst_0
    //   1367: aaload
    //   1368: astore #9
    //   1370: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1373: astore #10
    //   1375: iload #17
    //   1377: istore #19
    //   1379: iload #6
    //   1381: istore_2
    //   1382: aload #9
    //   1384: aload #10
    //   1386: if_acmpne -> 1442
    //   1389: iload #17
    //   1391: istore #19
    //   1393: iload #6
    //   1395: istore_2
    //   1396: iload #11
    //   1398: ifle -> 1442
    //   1401: iload #17
    //   1403: istore #19
    //   1405: iload #6
    //   1407: istore_2
    //   1408: aload_0
    //   1409: invokevirtual U : ()I
    //   1412: iload #11
    //   1414: if_icmple -> 1442
    //   1417: aload_0
    //   1418: iconst_1
    //   1419: putfield j1 : Z
    //   1422: aload_0
    //   1423: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1426: iconst_0
    //   1427: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1430: aastore
    //   1431: aload_0
    //   1432: iload #11
    //   1434: invokevirtual Y0 : (I)V
    //   1437: iconst_1
    //   1438: istore #19
    //   1440: iconst_1
    //   1441: istore_2
    //   1442: iload #19
    //   1444: istore #15
    //   1446: iload_2
    //   1447: istore_3
    //   1448: aload_0
    //   1449: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1452: iconst_1
    //   1453: aaload
    //   1454: aload #10
    //   1456: if_acmpne -> 1514
    //   1459: iload #19
    //   1461: istore #15
    //   1463: iload_2
    //   1464: istore_3
    //   1465: iload #12
    //   1467: ifle -> 1514
    //   1470: iload #19
    //   1472: istore #15
    //   1474: iload_2
    //   1475: istore_3
    //   1476: aload_0
    //   1477: invokevirtual y : ()I
    //   1480: iload #12
    //   1482: if_icmple -> 1514
    //   1485: aload_0
    //   1486: iconst_1
    //   1487: putfield k1 : Z
    //   1490: aload_0
    //   1491: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1494: iconst_1
    //   1495: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1498: aastore
    //   1499: aload_0
    //   1500: iload #12
    //   1502: invokevirtual z0 : (I)V
    //   1505: iconst_1
    //   1506: istore #6
    //   1508: iconst_1
    //   1509: istore #15
    //   1511: goto -> 1517
    //   1514: iload_3
    //   1515: istore #6
    //   1517: iload #16
    //   1519: istore_2
    //   1520: goto -> 573
    //   1523: aload_0
    //   1524: aload #7
    //   1526: putfield N0 : Ljava/util/ArrayList;
    //   1529: iload #6
    //   1531: ifeq -> 1552
    //   1534: aload_0
    //   1535: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1538: astore #7
    //   1540: aload #7
    //   1542: iconst_0
    //   1543: aload #4
    //   1545: aastore
    //   1546: aload #7
    //   1548: iconst_1
    //   1549: aload #5
    //   1551: aastore
    //   1552: aload_0
    //   1553: aload_0
    //   1554: getfield T0 : Landroidx/constraintlayout/solver/d;
    //   1557: invokevirtual v : ()Landroidx/constraintlayout/solver/c;
    //   1560: invokevirtual n0 : (Landroidx/constraintlayout/solver/c;)V
    //   1563: return
    //   1564: goto -> 1569
    //   1567: aconst_null
    //   1568: athrow
    //   1569: goto -> 1567
    // Exception table:
    //   from	to	target	type
    //   587	594	950	java/lang/Exception
    //   598	602	950	java/lang/Exception
    //   606	614	950	java/lang/Exception
    //   625	643	950	java/lang/Exception
    //   653	663	950	java/lang/Exception
    //   667	673	950	java/lang/Exception
    //   682	690	950	java/lang/Exception
    //   694	719	950	java/lang/Exception
    //   723	728	950	java/lang/Exception
    //   732	738	950	java/lang/Exception
    //   747	755	950	java/lang/Exception
    //   759	784	950	java/lang/Exception
    //   788	793	950	java/lang/Exception
    //   797	803	950	java/lang/Exception
    //   812	820	950	java/lang/Exception
    //   824	849	950	java/lang/Exception
    //   853	858	950	java/lang/Exception
    //   862	868	950	java/lang/Exception
    //   877	885	950	java/lang/Exception
    //   889	914	950	java/lang/Exception
    //   918	923	950	java/lang/Exception
    //   936	943	950	java/lang/Exception
  }
  
  void i1(ConstraintWidget paramConstraintWidget, int paramInt) {
    if (paramInt == 0) {
      k1(paramConstraintWidget);
    } else if (paramInt == 1) {
      p1(paramConstraintWidget);
    } 
  }
  
  public boolean j1(androidx.constraintlayout.solver.d paramd) {
    boolean bool = G1(64);
    g(paramd, bool);
    int i = this.N0.size();
    byte b1 = 0;
    boolean bool1 = false;
    while (b1 < i) {
      ConstraintWidget constraintWidget = this.N0.get(b1);
      constraintWidget.G0(0, false);
      constraintWidget.G0(1, false);
      if (constraintWidget instanceof a)
        bool1 = true; 
      b1++;
    } 
    if (bool1)
      for (b1 = 0; b1 < i; b1++) {
        ConstraintWidget constraintWidget = this.N0.get(b1);
        if (constraintWidget instanceof a)
          ((a)constraintWidget).l1(); 
      }  
    for (b1 = 0; b1 < i; b1++) {
      ConstraintWidget constraintWidget = this.N0.get(b1);
      if (constraintWidget.f())
        constraintWidget.g(paramd, bool); 
    } 
    if (androidx.constraintlayout.solver.d.a) {
      HashSet<ConstraintWidget> hashSet = new HashSet();
      for (b1 = 0; b1 < i; b1++) {
        ConstraintWidget constraintWidget = this.N0.get(b1);
        if (!constraintWidget.f())
          hashSet.add(constraintWidget); 
      } 
      if (B() == ConstraintWidget.DimensionBehaviour.c) {
        b1 = 0;
      } else {
        b1 = 1;
      } 
      e(this, paramd, hashSet, b1, false);
      for (ConstraintWidget constraintWidget : hashSet) {
        i.a(this, paramd, constraintWidget);
        constraintWidget.g(paramd, bool);
      } 
    } else {
      for (b1 = 0; b1 < i; b1++) {
        ConstraintWidget constraintWidget = this.N0.get(b1);
        if (constraintWidget instanceof d) {
          ConstraintWidget.DimensionBehaviour[] arrayOfDimensionBehaviour = constraintWidget.V;
          ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = arrayOfDimensionBehaviour[0];
          ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = arrayOfDimensionBehaviour[1];
          ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.c;
          if (dimensionBehaviour1 == dimensionBehaviour3)
            constraintWidget.D0(ConstraintWidget.DimensionBehaviour.b); 
          if (dimensionBehaviour2 == dimensionBehaviour3)
            constraintWidget.U0(ConstraintWidget.DimensionBehaviour.b); 
          constraintWidget.g(paramd, bool);
          if (dimensionBehaviour1 == dimensionBehaviour3)
            constraintWidget.D0(dimensionBehaviour1); 
          if (dimensionBehaviour2 == dimensionBehaviour3)
            constraintWidget.U0(dimensionBehaviour2); 
        } else {
          i.a(this, paramd, constraintWidget);
          if (!constraintWidget.f())
            constraintWidget.g(paramd, bool); 
        } 
      } 
    } 
    if (this.Y0 > 0)
      b.b(this, paramd, null, 0); 
    if (this.Z0 > 0)
      b.b(this, paramd, null, 1); 
    return true;
  }
  
  public void k0() {
    this.T0.D();
    this.U0 = 0;
    this.W0 = 0;
    this.V0 = 0;
    this.X0 = 0;
    this.i1 = false;
    super.k0();
  }
  
  public void l1(ConstraintAnchor paramConstraintAnchor) {
    WeakReference<ConstraintAnchor> weakReference = this.p1;
    if (weakReference == null || weakReference.get() == null || paramConstraintAnchor.e() > ((ConstraintAnchor)this.p1.get()).e())
      this.p1 = new WeakReference<ConstraintAnchor>(paramConstraintAnchor); 
  }
  
  public void m1(ConstraintAnchor paramConstraintAnchor) {
    WeakReference<ConstraintAnchor> weakReference = this.n1;
    if (weakReference == null || weakReference.get() == null || paramConstraintAnchor.e() > ((ConstraintAnchor)this.n1.get()).e())
      this.n1 = new WeakReference<ConstraintAnchor>(paramConstraintAnchor); 
  }
  
  void q1(ConstraintAnchor paramConstraintAnchor) {
    WeakReference<ConstraintAnchor> weakReference = this.o1;
    if (weakReference == null || weakReference.get() == null || paramConstraintAnchor.e() > ((ConstraintAnchor)this.o1.get()).e())
      this.o1 = new WeakReference<ConstraintAnchor>(paramConstraintAnchor); 
  }
  
  void r1(ConstraintAnchor paramConstraintAnchor) {
    WeakReference<ConstraintAnchor> weakReference = this.m1;
    if (weakReference == null || weakReference.get() == null || paramConstraintAnchor.e() > ((ConstraintAnchor)this.m1.get()).e())
      this.m1 = new WeakReference<ConstraintAnchor>(paramConstraintAnchor); 
  }
  
  public boolean s1(boolean paramBoolean) {
    return this.P0.f(paramBoolean);
  }
  
  public boolean t1(boolean paramBoolean) {
    return this.P0.g(paramBoolean);
  }
  
  public boolean u1(boolean paramBoolean, int paramInt) {
    return this.P0.h(paramBoolean, paramInt);
  }
  
  public b.b v1() {
    return this.Q0;
  }
  
  public int w1() {
    return this.h1;
  }
  
  public androidx.constraintlayout.solver.d x1() {
    return this.T0;
  }
  
  public boolean y1() {
    return false;
  }
  
  public void z1() {
    this.P0.j();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */