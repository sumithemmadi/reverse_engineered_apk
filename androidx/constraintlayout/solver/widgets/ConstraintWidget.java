package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.c;
import androidx.constraintlayout.solver.d;
import androidx.constraintlayout.solver.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.solver.widgets.analyzer.c;
import androidx.constraintlayout.solver.widgets.analyzer.k;
import androidx.constraintlayout.solver.widgets.analyzer.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintWidget {
  public static float a = 0.5F;
  
  public boolean A;
  
  boolean A0;
  
  int B = -1;
  
  boolean B0;
  
  float C = 1.0F;
  
  int C0;
  
  private int[] D = new int[] { Integer.MAX_VALUE, Integer.MAX_VALUE };
  
  int D0;
  
  private float E = 0.0F;
  
  boolean E0;
  
  private boolean F = false;
  
  boolean F0;
  
  private boolean G;
  
  public float[] G0;
  
  private boolean H = false;
  
  protected ConstraintWidget[] H0;
  
  private int I = 0;
  
  protected ConstraintWidget[] I0;
  
  private int J = 0;
  
  ConstraintWidget J0;
  
  public ConstraintAnchor K = new ConstraintAnchor(this, ConstraintAnchor.Type.c);
  
  ConstraintWidget K0;
  
  public ConstraintAnchor L = new ConstraintAnchor(this, ConstraintAnchor.Type.d);
  
  public int L0;
  
  public ConstraintAnchor M = new ConstraintAnchor(this, ConstraintAnchor.Type.e);
  
  public int M0;
  
  public ConstraintAnchor N = new ConstraintAnchor(this, ConstraintAnchor.Type.f);
  
  public ConstraintAnchor O = new ConstraintAnchor(this, ConstraintAnchor.Type.g);
  
  ConstraintAnchor P = new ConstraintAnchor(this, ConstraintAnchor.Type.i);
  
  ConstraintAnchor Q = new ConstraintAnchor(this, ConstraintAnchor.Type.j);
  
  public ConstraintAnchor R;
  
  public ConstraintAnchor[] S;
  
  protected ArrayList<ConstraintAnchor> T;
  
  private boolean[] U;
  
  public DimensionBehaviour[] V;
  
  public ConstraintWidget W;
  
  int X;
  
  int Y;
  
  public float Z;
  
  protected int a0;
  
  public boolean b = false;
  
  protected int b0;
  
  public WidgetRun[] c = new WidgetRun[2];
  
  protected int c0;
  
  public c d;
  
  int d0;
  
  public c e;
  
  int e0;
  
  public k f = null;
  
  protected int f0;
  
  public m g = null;
  
  protected int g0;
  
  public boolean[] h = new boolean[] { true, true };
  
  int h0;
  
  boolean i = false;
  
  protected int i0;
  
  private boolean j = true;
  
  protected int j0;
  
  private boolean k = false;
  
  float k0;
  
  private boolean l = true;
  
  float l0;
  
  private boolean m = false;
  
  private Object m0;
  
  private boolean n = false;
  
  private int n0;
  
  public int o = -1;
  
  private int o0;
  
  public int p = -1;
  
  private String p0;
  
  public int q = 0;
  
  private String q0;
  
  public int r = 0;
  
  int r0;
  
  public int[] s = new int[2];
  
  int s0;
  
  public int t = 0;
  
  int t0;
  
  public int u = 0;
  
  int u0;
  
  public float v = 1.0F;
  
  boolean v0;
  
  public int w = 0;
  
  boolean w0;
  
  public int x = 0;
  
  boolean x0;
  
  public float y = 1.0F;
  
  boolean y0;
  
  public boolean z;
  
  boolean z0;
  
  public ConstraintWidget() {
    ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.h);
    this.R = constraintAnchor;
    this.S = new ConstraintAnchor[] { this.K, this.M, this.L, this.N, this.O, constraintAnchor };
    this.T = new ArrayList<ConstraintAnchor>();
    this.U = new boolean[2];
    DimensionBehaviour dimensionBehaviour = DimensionBehaviour.b;
    this.V = new DimensionBehaviour[] { dimensionBehaviour, dimensionBehaviour };
    this.W = null;
    this.X = 0;
    this.Y = 0;
    this.Z = 0.0F;
    this.a0 = -1;
    this.b0 = 0;
    this.c0 = 0;
    this.d0 = 0;
    this.e0 = 0;
    this.f0 = 0;
    this.g0 = 0;
    this.h0 = 0;
    float f = a;
    this.k0 = f;
    this.l0 = f;
    this.n0 = 0;
    this.o0 = 0;
    this.p0 = null;
    this.q0 = null;
    this.B0 = false;
    this.C0 = 0;
    this.D0 = 0;
    this.G0 = new float[] { -1.0F, -1.0F };
    this.H0 = new ConstraintWidget[] { null, null };
    this.I0 = new ConstraintWidget[] { null, null };
    this.J0 = null;
    this.K0 = null;
    this.L0 = -1;
    this.M0 = -1;
    d();
  }
  
  private boolean b0(int paramInt) {
    paramInt *= 2;
    ConstraintAnchor[] arrayOfConstraintAnchor = this.S;
    ConstraintAnchor constraintAnchor = (arrayOfConstraintAnchor[paramInt]).f;
    null = true;
    if (constraintAnchor != null && (arrayOfConstraintAnchor[paramInt]).f.f != arrayOfConstraintAnchor[paramInt])
      if ((arrayOfConstraintAnchor[++paramInt]).f != null && (arrayOfConstraintAnchor[paramInt]).f.f == arrayOfConstraintAnchor[paramInt])
        return null;  
    return false;
  }
  
  private void d() {
    this.T.add(this.K);
    this.T.add(this.L);
    this.T.add(this.M);
    this.T.add(this.N);
    this.T.add(this.P);
    this.T.add(this.Q);
    this.T.add(this.R);
    this.T.add(this.O);
  }
  
  private void i(d paramd, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, SolverVariable paramSolverVariable1, SolverVariable paramSolverVariable2, DimensionBehaviour paramDimensionBehaviour, boolean paramBoolean5, ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, boolean paramBoolean6, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, boolean paramBoolean10, int paramInt5, int paramInt6, int paramInt7, int paramInt8, float paramFloat2, boolean paramBoolean11) {
    // Byte code:
    //   0: aload_1
    //   1: aload #10
    //   3: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   6: astore #28
    //   8: aload_1
    //   9: aload #11
    //   11: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   14: astore #29
    //   16: aload_1
    //   17: aload #10
    //   19: invokevirtual j : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   22: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   25: astore #30
    //   27: aload_1
    //   28: aload #11
    //   30: invokevirtual j : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   33: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   36: astore #31
    //   38: invokestatic w : ()Landroidx/constraintlayout/solver/e;
    //   41: ifnonnull -> 2358
    //   44: aload #10
    //   46: invokevirtual o : ()Z
    //   49: istore #32
    //   51: aload #11
    //   53: invokevirtual o : ()Z
    //   56: istore #33
    //   58: aload_0
    //   59: getfield R : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   62: invokevirtual o : ()Z
    //   65: istore #34
    //   67: iload #33
    //   69: ifeq -> 81
    //   72: iload #32
    //   74: iconst_1
    //   75: iadd
    //   76: istore #35
    //   78: goto -> 85
    //   81: iload #32
    //   83: istore #35
    //   85: iload #35
    //   87: istore #36
    //   89: iload #34
    //   91: ifeq -> 100
    //   94: iload #35
    //   96: iconst_1
    //   97: iadd
    //   98: istore #36
    //   100: iload #17
    //   102: ifeq -> 111
    //   105: iconst_3
    //   106: istore #22
    //   108: goto -> 111
    //   111: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$a.b : [I
    //   114: aload #8
    //   116: invokevirtual ordinal : ()I
    //   119: iaload
    //   120: istore #35
    //   122: iload #35
    //   124: iconst_1
    //   125: if_icmpeq -> 146
    //   128: iload #35
    //   130: iconst_2
    //   131: if_icmpeq -> 146
    //   134: iload #35
    //   136: iconst_3
    //   137: if_icmpeq -> 146
    //   140: iload #35
    //   142: iconst_4
    //   143: if_icmpeq -> 152
    //   146: iconst_0
    //   147: istore #35
    //   149: goto -> 161
    //   152: iload #22
    //   154: iconst_4
    //   155: if_icmpeq -> 146
    //   158: iconst_1
    //   159: istore #35
    //   161: iload #22
    //   163: istore #37
    //   165: aload_0
    //   166: getfield o0 : I
    //   169: bipush #8
    //   171: if_icmpne -> 183
    //   174: iconst_0
    //   175: istore #13
    //   177: iconst_0
    //   178: istore #22
    //   180: goto -> 187
    //   183: iload #35
    //   185: istore #22
    //   187: iload #27
    //   189: ifeq -> 247
    //   192: iload #32
    //   194: ifne -> 218
    //   197: iload #33
    //   199: ifne -> 218
    //   202: iload #34
    //   204: ifne -> 218
    //   207: aload_1
    //   208: aload #28
    //   210: iload #12
    //   212: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   215: goto -> 247
    //   218: iload #32
    //   220: ifeq -> 247
    //   223: iload #33
    //   225: ifne -> 247
    //   228: aload_1
    //   229: aload #28
    //   231: aload #30
    //   233: aload #10
    //   235: invokevirtual f : ()I
    //   238: bipush #8
    //   240: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   243: pop
    //   244: goto -> 247
    //   247: aload #31
    //   249: astore #8
    //   251: iload #22
    //   253: ifne -> 343
    //   256: iload #9
    //   258: ifeq -> 311
    //   261: aload_1
    //   262: aload #29
    //   264: aload #28
    //   266: iconst_0
    //   267: iconst_3
    //   268: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   271: pop
    //   272: iload #14
    //   274: ifle -> 289
    //   277: aload_1
    //   278: aload #29
    //   280: aload #28
    //   282: iload #14
    //   284: bipush #8
    //   286: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   289: iload #15
    //   291: ldc 2147483647
    //   293: if_icmpge -> 324
    //   296: aload_1
    //   297: aload #29
    //   299: aload #28
    //   301: iload #15
    //   303: bipush #8
    //   305: invokevirtual j : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   308: goto -> 324
    //   311: aload_1
    //   312: aload #29
    //   314: aload #28
    //   316: iload #13
    //   318: bipush #8
    //   320: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   323: pop
    //   324: iload #24
    //   326: istore #12
    //   328: iload #25
    //   330: istore #15
    //   332: iload #22
    //   334: istore #38
    //   336: iload #12
    //   338: istore #35
    //   340: goto -> 795
    //   343: iload #36
    //   345: iconst_2
    //   346: if_icmpeq -> 419
    //   349: iload #17
    //   351: ifne -> 419
    //   354: iload #37
    //   356: iconst_1
    //   357: if_icmpeq -> 365
    //   360: iload #37
    //   362: ifne -> 419
    //   365: iload #24
    //   367: iload #13
    //   369: invokestatic max : (II)I
    //   372: istore #13
    //   374: iload #13
    //   376: istore #12
    //   378: iload #25
    //   380: ifle -> 392
    //   383: iload #25
    //   385: iload #13
    //   387: invokestatic min : (II)I
    //   390: istore #12
    //   392: aload_1
    //   393: aload #29
    //   395: aload #28
    //   397: iload #12
    //   399: bipush #8
    //   401: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   404: pop
    //   405: iload #24
    //   407: istore #12
    //   409: iload #25
    //   411: istore #15
    //   413: iconst_0
    //   414: istore #38
    //   416: goto -> 336
    //   419: iload #24
    //   421: bipush #-2
    //   423: if_icmpne -> 433
    //   426: iload #13
    //   428: istore #12
    //   430: goto -> 437
    //   433: iload #24
    //   435: istore #12
    //   437: iload #25
    //   439: bipush #-2
    //   441: if_icmpne -> 451
    //   444: iload #13
    //   446: istore #15
    //   448: goto -> 455
    //   451: iload #25
    //   453: istore #15
    //   455: iload #13
    //   457: istore #24
    //   459: iload #13
    //   461: ifle -> 477
    //   464: iload #13
    //   466: istore #24
    //   468: iload #37
    //   470: iconst_1
    //   471: if_icmpeq -> 477
    //   474: iconst_0
    //   475: istore #24
    //   477: iload #24
    //   479: istore #13
    //   481: iload #12
    //   483: ifle -> 507
    //   486: aload_1
    //   487: aload #29
    //   489: aload #28
    //   491: iload #12
    //   493: bipush #8
    //   495: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   498: iload #24
    //   500: iload #12
    //   502: invokestatic max : (II)I
    //   505: istore #13
    //   507: iload #15
    //   509: ifle -> 563
    //   512: iload_3
    //   513: ifeq -> 528
    //   516: iload #37
    //   518: iconst_1
    //   519: if_icmpne -> 528
    //   522: iconst_0
    //   523: istore #24
    //   525: goto -> 531
    //   528: iconst_1
    //   529: istore #24
    //   531: iload #24
    //   533: ifeq -> 551
    //   536: aload_1
    //   537: aload #29
    //   539: aload #28
    //   541: iload #15
    //   543: bipush #8
    //   545: invokevirtual j : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   548: goto -> 551
    //   551: iload #13
    //   553: iload #15
    //   555: invokestatic min : (II)I
    //   558: istore #13
    //   560: goto -> 563
    //   563: iload #37
    //   565: iconst_1
    //   566: if_icmpne -> 648
    //   569: iload_3
    //   570: ifeq -> 589
    //   573: aload_1
    //   574: aload #29
    //   576: aload #28
    //   578: iload #13
    //   580: bipush #8
    //   582: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   585: pop
    //   586: goto -> 645
    //   589: iload #19
    //   591: ifeq -> 621
    //   594: aload_1
    //   595: aload #29
    //   597: aload #28
    //   599: iload #13
    //   601: iconst_5
    //   602: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   605: pop
    //   606: aload_1
    //   607: aload #29
    //   609: aload #28
    //   611: iload #13
    //   613: bipush #8
    //   615: invokevirtual j : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   618: goto -> 645
    //   621: aload_1
    //   622: aload #29
    //   624: aload #28
    //   626: iload #13
    //   628: iconst_5
    //   629: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   632: pop
    //   633: aload_1
    //   634: aload #29
    //   636: aload #28
    //   638: iload #13
    //   640: bipush #8
    //   642: invokevirtual j : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   645: goto -> 332
    //   648: iload #37
    //   650: iconst_2
    //   651: if_icmpne -> 784
    //   654: aload #10
    //   656: invokevirtual k : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   659: astore #39
    //   661: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   664: astore #31
    //   666: aload #39
    //   668: aload #31
    //   670: if_acmpeq -> 722
    //   673: aload #10
    //   675: invokevirtual k : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   678: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   681: if_acmpne -> 687
    //   684: goto -> 722
    //   687: aload_1
    //   688: aload_0
    //   689: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   692: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   695: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   698: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   701: astore #31
    //   703: aload_1
    //   704: aload_0
    //   705: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   708: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   711: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   714: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   717: astore #39
    //   719: goto -> 753
    //   722: aload_1
    //   723: aload_0
    //   724: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   727: aload #31
    //   729: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   732: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   735: astore #31
    //   737: aload_1
    //   738: aload_0
    //   739: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   742: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   745: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   748: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   751: astore #39
    //   753: aload_1
    //   754: aload_1
    //   755: invokevirtual r : ()Landroidx/constraintlayout/solver/b;
    //   758: aload #29
    //   760: aload #28
    //   762: aload #39
    //   764: aload #31
    //   766: fload #26
    //   768: invokevirtual k : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;F)Landroidx/constraintlayout/solver/b;
    //   771: invokevirtual d : (Landroidx/constraintlayout/solver/b;)V
    //   774: iconst_0
    //   775: istore #38
    //   777: iload #12
    //   779: istore #35
    //   781: goto -> 795
    //   784: iconst_1
    //   785: istore #5
    //   787: iload #22
    //   789: istore #38
    //   791: iload #12
    //   793: istore #35
    //   795: aload #8
    //   797: astore #39
    //   799: aload #29
    //   801: astore #8
    //   803: iload #27
    //   805: ifeq -> 2204
    //   808: iload #19
    //   810: ifeq -> 816
    //   813: goto -> 2204
    //   816: iload #32
    //   818: ifne -> 834
    //   821: iload #33
    //   823: ifne -> 834
    //   826: iload #34
    //   828: ifne -> 834
    //   831: goto -> 2102
    //   834: iload #32
    //   836: ifeq -> 847
    //   839: iload #33
    //   841: ifne -> 847
    //   844: goto -> 2102
    //   847: iload #32
    //   849: ifne -> 948
    //   852: iload #33
    //   854: ifeq -> 948
    //   857: aload_1
    //   858: aload #8
    //   860: aload #39
    //   862: aload #11
    //   864: invokevirtual f : ()I
    //   867: ineg
    //   868: bipush #8
    //   870: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   873: pop
    //   874: iload_3
    //   875: ifeq -> 2102
    //   878: aload_0
    //   879: getfield k : Z
    //   882: ifeq -> 935
    //   885: aload #28
    //   887: getfield h : Z
    //   890: ifeq -> 935
    //   893: aload_0
    //   894: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   897: astore #31
    //   899: aload #31
    //   901: ifnull -> 935
    //   904: aload #31
    //   906: checkcast androidx/constraintlayout/solver/widgets/d
    //   909: astore #6
    //   911: iload_2
    //   912: ifeq -> 925
    //   915: aload #6
    //   917: aload #10
    //   919: invokevirtual m1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   922: goto -> 2102
    //   925: aload #6
    //   927: aload #10
    //   929: invokevirtual r1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   932: goto -> 2102
    //   935: aload_1
    //   936: aload #28
    //   938: aload #6
    //   940: iconst_0
    //   941: iconst_5
    //   942: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   945: goto -> 2102
    //   948: iload #32
    //   950: ifeq -> 2102
    //   953: iload #33
    //   955: ifeq -> 2102
    //   958: aload #10
    //   960: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   963: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   966: astore #40
    //   968: aload #11
    //   970: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   973: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   976: astore #29
    //   978: aload_0
    //   979: invokevirtual L : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   982: astore #41
    //   984: bipush #6
    //   986: istore #36
    //   988: iload #38
    //   990: ifeq -> 1419
    //   993: iload #37
    //   995: ifne -> 1149
    //   998: iload #15
    //   1000: ifne -> 1078
    //   1003: iload #35
    //   1005: ifne -> 1078
    //   1008: aload #30
    //   1010: getfield h : Z
    //   1013: ifeq -> 1058
    //   1016: aload #39
    //   1018: getfield h : Z
    //   1021: ifeq -> 1058
    //   1024: aload_1
    //   1025: aload #28
    //   1027: aload #30
    //   1029: aload #10
    //   1031: invokevirtual f : ()I
    //   1034: bipush #8
    //   1036: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   1039: pop
    //   1040: aload_1
    //   1041: aload #8
    //   1043: aload #39
    //   1045: aload #11
    //   1047: invokevirtual f : ()I
    //   1050: ineg
    //   1051: bipush #8
    //   1053: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   1056: pop
    //   1057: return
    //   1058: iconst_0
    //   1059: istore #13
    //   1061: iconst_1
    //   1062: istore #12
    //   1064: iconst_0
    //   1065: istore #15
    //   1067: bipush #8
    //   1069: istore #22
    //   1071: bipush #8
    //   1073: istore #23
    //   1075: goto -> 1093
    //   1078: iconst_1
    //   1079: istore #13
    //   1081: iconst_0
    //   1082: istore #12
    //   1084: iconst_1
    //   1085: istore #15
    //   1087: iconst_5
    //   1088: istore #22
    //   1090: iconst_5
    //   1091: istore #23
    //   1093: aload #40
    //   1095: instanceof androidx/constraintlayout/solver/widgets/a
    //   1098: ifne -> 1115
    //   1101: aload #29
    //   1103: instanceof androidx/constraintlayout/solver/widgets/a
    //   1106: ifeq -> 1112
    //   1109: goto -> 1115
    //   1112: goto -> 1118
    //   1115: iconst_4
    //   1116: istore #23
    //   1118: iload #13
    //   1120: istore #24
    //   1122: iload #12
    //   1124: istore #25
    //   1126: iload #22
    //   1128: istore #12
    //   1130: iload #23
    //   1132: istore #13
    //   1134: iload #15
    //   1136: istore #22
    //   1138: iload #25
    //   1140: istore #23
    //   1142: bipush #6
    //   1144: istore #15
    //   1146: goto -> 1529
    //   1149: iload #37
    //   1151: iconst_1
    //   1152: if_icmpne -> 1186
    //   1155: iconst_0
    //   1156: istore #23
    //   1158: bipush #6
    //   1160: istore #12
    //   1162: iconst_4
    //   1163: istore #13
    //   1165: iconst_1
    //   1166: istore #22
    //   1168: iconst_1
    //   1169: istore #24
    //   1171: bipush #8
    //   1173: istore #25
    //   1175: iload #12
    //   1177: istore #15
    //   1179: iload #25
    //   1181: istore #12
    //   1183: goto -> 1529
    //   1186: iload #37
    //   1188: iconst_3
    //   1189: if_icmpne -> 1407
    //   1192: aload_0
    //   1193: getfield B : I
    //   1196: iconst_m1
    //   1197: if_icmpne -> 1234
    //   1200: iload #20
    //   1202: ifeq -> 1221
    //   1205: iload_3
    //   1206: ifeq -> 1215
    //   1209: iconst_5
    //   1210: istore #12
    //   1212: goto -> 1225
    //   1215: iconst_4
    //   1216: istore #12
    //   1218: goto -> 1225
    //   1221: bipush #8
    //   1223: istore #12
    //   1225: iconst_1
    //   1226: istore #23
    //   1228: iconst_5
    //   1229: istore #13
    //   1231: goto -> 1165
    //   1234: iload #17
    //   1236: ifeq -> 1308
    //   1239: iload #23
    //   1241: iconst_2
    //   1242: if_icmpeq -> 1260
    //   1245: iload #23
    //   1247: iconst_1
    //   1248: if_icmpne -> 1254
    //   1251: goto -> 1260
    //   1254: iconst_0
    //   1255: istore #12
    //   1257: goto -> 1263
    //   1260: iconst_1
    //   1261: istore #12
    //   1263: iload #12
    //   1265: ifne -> 1278
    //   1268: bipush #8
    //   1270: istore #13
    //   1272: iconst_5
    //   1273: istore #12
    //   1275: goto -> 1284
    //   1278: iconst_5
    //   1279: istore #13
    //   1281: iconst_4
    //   1282: istore #12
    //   1284: iload #13
    //   1286: istore #15
    //   1288: iconst_1
    //   1289: istore #24
    //   1291: iconst_1
    //   1292: istore #23
    //   1294: iconst_1
    //   1295: istore #22
    //   1297: iload #12
    //   1299: istore #13
    //   1301: iload #15
    //   1303: istore #12
    //   1305: goto -> 1142
    //   1308: iload #15
    //   1310: ifle -> 1328
    //   1313: iconst_1
    //   1314: istore #24
    //   1316: iconst_1
    //   1317: istore #23
    //   1319: iconst_1
    //   1320: istore #22
    //   1322: iconst_5
    //   1323: istore #13
    //   1325: goto -> 1522
    //   1328: iload #15
    //   1330: ifne -> 1401
    //   1333: iload #35
    //   1335: ifne -> 1401
    //   1338: iload #20
    //   1340: ifne -> 1359
    //   1343: iconst_1
    //   1344: istore #24
    //   1346: iconst_1
    //   1347: istore #23
    //   1349: iconst_1
    //   1350: istore #22
    //   1352: bipush #8
    //   1354: istore #13
    //   1356: goto -> 1522
    //   1359: aload #40
    //   1361: aload #41
    //   1363: if_acmpeq -> 1379
    //   1366: aload #29
    //   1368: aload #41
    //   1370: if_acmpeq -> 1379
    //   1373: iconst_4
    //   1374: istore #12
    //   1376: goto -> 1382
    //   1379: iconst_5
    //   1380: istore #12
    //   1382: iconst_1
    //   1383: istore #24
    //   1385: iconst_1
    //   1386: istore #23
    //   1388: iconst_1
    //   1389: istore #22
    //   1391: bipush #6
    //   1393: istore #15
    //   1395: iconst_4
    //   1396: istore #13
    //   1398: goto -> 1529
    //   1401: iconst_1
    //   1402: istore #23
    //   1404: goto -> 1513
    //   1407: iconst_0
    //   1408: istore #24
    //   1410: iconst_0
    //   1411: istore #23
    //   1413: iconst_0
    //   1414: istore #22
    //   1416: goto -> 1519
    //   1419: aload #30
    //   1421: getfield h : Z
    //   1424: ifeq -> 1510
    //   1427: aload #39
    //   1429: getfield h : Z
    //   1432: ifeq -> 1510
    //   1435: aload_1
    //   1436: aload #28
    //   1438: aload #30
    //   1440: aload #10
    //   1442: invokevirtual f : ()I
    //   1445: fload #16
    //   1447: aload #39
    //   1449: aload #8
    //   1451: aload #11
    //   1453: invokevirtual f : ()I
    //   1456: bipush #8
    //   1458: invokevirtual c : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;IFLandroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   1461: iload_3
    //   1462: ifeq -> 1509
    //   1465: iload #5
    //   1467: ifeq -> 1509
    //   1470: aload #11
    //   1472: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1475: ifnull -> 1488
    //   1478: aload #11
    //   1480: invokevirtual f : ()I
    //   1483: istore #12
    //   1485: goto -> 1491
    //   1488: iconst_0
    //   1489: istore #12
    //   1491: aload #39
    //   1493: aload #7
    //   1495: if_acmpeq -> 1509
    //   1498: aload_1
    //   1499: aload #7
    //   1501: aload #8
    //   1503: iload #12
    //   1505: iconst_5
    //   1506: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   1509: return
    //   1510: iconst_0
    //   1511: istore #23
    //   1513: iconst_1
    //   1514: istore #24
    //   1516: iconst_1
    //   1517: istore #22
    //   1519: iconst_4
    //   1520: istore #13
    //   1522: bipush #6
    //   1524: istore #15
    //   1526: iconst_5
    //   1527: istore #12
    //   1529: iload #22
    //   1531: ifeq -> 1557
    //   1534: aload #30
    //   1536: aload #39
    //   1538: if_acmpne -> 1557
    //   1541: aload #40
    //   1543: aload #41
    //   1545: if_acmpeq -> 1557
    //   1548: iconst_0
    //   1549: istore #22
    //   1551: iconst_0
    //   1552: istore #25
    //   1554: goto -> 1560
    //   1557: iconst_1
    //   1558: istore #25
    //   1560: iload #24
    //   1562: ifeq -> 1639
    //   1565: iload #38
    //   1567: ifne -> 1610
    //   1570: iload #18
    //   1572: ifne -> 1610
    //   1575: iload #20
    //   1577: ifne -> 1610
    //   1580: aload #30
    //   1582: aload #6
    //   1584: if_acmpne -> 1610
    //   1587: aload #39
    //   1589: aload #7
    //   1591: if_acmpne -> 1610
    //   1594: iconst_0
    //   1595: istore_3
    //   1596: bipush #8
    //   1598: istore #15
    //   1600: bipush #8
    //   1602: istore #12
    //   1604: iconst_0
    //   1605: istore #25
    //   1607: goto -> 1610
    //   1610: aload_1
    //   1611: aload #28
    //   1613: aload #30
    //   1615: aload #10
    //   1617: invokevirtual f : ()I
    //   1620: fload #16
    //   1622: aload #39
    //   1624: aload #8
    //   1626: aload #11
    //   1628: invokevirtual f : ()I
    //   1631: iload #15
    //   1633: invokevirtual c : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;IFLandroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   1636: goto -> 1639
    //   1639: aload #8
    //   1641: astore #31
    //   1643: aload #41
    //   1645: astore #8
    //   1647: aload_0
    //   1648: getfield o0 : I
    //   1651: bipush #8
    //   1653: if_icmpne -> 1665
    //   1656: aload #11
    //   1658: invokevirtual m : ()Z
    //   1661: ifne -> 1665
    //   1664: return
    //   1665: iload #22
    //   1667: ifeq -> 1743
    //   1670: iload_3
    //   1671: ifeq -> 1709
    //   1674: aload #30
    //   1676: aload #39
    //   1678: if_acmpeq -> 1709
    //   1681: iload #38
    //   1683: ifne -> 1709
    //   1686: aload #40
    //   1688: instanceof androidx/constraintlayout/solver/widgets/a
    //   1691: ifne -> 1702
    //   1694: aload #29
    //   1696: instanceof androidx/constraintlayout/solver/widgets/a
    //   1699: ifeq -> 1709
    //   1702: bipush #6
    //   1704: istore #12
    //   1706: goto -> 1709
    //   1709: aload_1
    //   1710: aload #28
    //   1712: aload #30
    //   1714: aload #10
    //   1716: invokevirtual f : ()I
    //   1719: iload #12
    //   1721: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   1724: aload_1
    //   1725: aload #31
    //   1727: aload #39
    //   1729: aload #11
    //   1731: invokevirtual f : ()I
    //   1734: ineg
    //   1735: iload #12
    //   1737: invokevirtual j : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   1740: goto -> 1743
    //   1743: iload_3
    //   1744: ifeq -> 1782
    //   1747: iload #21
    //   1749: ifeq -> 1782
    //   1752: aload #40
    //   1754: instanceof androidx/constraintlayout/solver/widgets/a
    //   1757: ifne -> 1782
    //   1760: aload #29
    //   1762: instanceof androidx/constraintlayout/solver/widgets/a
    //   1765: ifne -> 1782
    //   1768: bipush #6
    //   1770: istore #12
    //   1772: iconst_1
    //   1773: istore #25
    //   1775: bipush #6
    //   1777: istore #15
    //   1779: goto -> 1790
    //   1782: iload #12
    //   1784: istore #15
    //   1786: iload #13
    //   1788: istore #12
    //   1790: iload #25
    //   1792: ifeq -> 2000
    //   1795: iload #23
    //   1797: ifeq -> 1904
    //   1800: iload #20
    //   1802: ifeq -> 1810
    //   1805: iload #4
    //   1807: ifeq -> 1904
    //   1810: aload #8
    //   1812: astore #41
    //   1814: iload #36
    //   1816: istore #13
    //   1818: aload #40
    //   1820: aload #41
    //   1822: if_acmpeq -> 1843
    //   1825: aload #29
    //   1827: aload #41
    //   1829: if_acmpne -> 1839
    //   1832: iload #36
    //   1834: istore #13
    //   1836: goto -> 1843
    //   1839: iload #12
    //   1841: istore #13
    //   1843: aload #40
    //   1845: instanceof androidx/constraintlayout/solver/widgets/f
    //   1848: ifne -> 1859
    //   1851: aload #29
    //   1853: instanceof androidx/constraintlayout/solver/widgets/f
    //   1856: ifeq -> 1862
    //   1859: iconst_5
    //   1860: istore #13
    //   1862: aload #40
    //   1864: instanceof androidx/constraintlayout/solver/widgets/a
    //   1867: ifne -> 1878
    //   1870: aload #29
    //   1872: instanceof androidx/constraintlayout/solver/widgets/a
    //   1875: ifeq -> 1881
    //   1878: iconst_5
    //   1879: istore #13
    //   1881: iload #20
    //   1883: ifeq -> 1892
    //   1886: iconst_5
    //   1887: istore #13
    //   1889: goto -> 1892
    //   1892: iload #13
    //   1894: iload #12
    //   1896: invokestatic max : (II)I
    //   1899: istore #13
    //   1901: goto -> 1908
    //   1904: iload #12
    //   1906: istore #13
    //   1908: iload #13
    //   1910: istore #12
    //   1912: iload_3
    //   1913: ifeq -> 1967
    //   1916: iload #15
    //   1918: iload #13
    //   1920: invokestatic min : (II)I
    //   1923: istore #13
    //   1925: iload #13
    //   1927: istore #12
    //   1929: iload #17
    //   1931: ifeq -> 1967
    //   1934: iload #13
    //   1936: istore #12
    //   1938: iload #20
    //   1940: ifne -> 1967
    //   1943: aload #40
    //   1945: aload #8
    //   1947: if_acmpeq -> 1961
    //   1950: iload #13
    //   1952: istore #12
    //   1954: aload #29
    //   1956: aload #8
    //   1958: if_acmpne -> 1967
    //   1961: iconst_4
    //   1962: istore #12
    //   1964: goto -> 1967
    //   1967: aload_1
    //   1968: aload #28
    //   1970: aload #30
    //   1972: aload #10
    //   1974: invokevirtual f : ()I
    //   1977: iload #12
    //   1979: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   1982: pop
    //   1983: aload_1
    //   1984: aload #31
    //   1986: aload #39
    //   1988: aload #11
    //   1990: invokevirtual f : ()I
    //   1993: ineg
    //   1994: iload #12
    //   1996: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   1999: pop
    //   2000: iload_3
    //   2001: ifeq -> 2042
    //   2004: aload #6
    //   2006: aload #30
    //   2008: if_acmpne -> 2021
    //   2011: aload #10
    //   2013: invokevirtual f : ()I
    //   2016: istore #12
    //   2018: goto -> 2024
    //   2021: iconst_0
    //   2022: istore #12
    //   2024: aload #30
    //   2026: aload #6
    //   2028: if_acmpeq -> 2042
    //   2031: aload_1
    //   2032: aload #28
    //   2034: aload #6
    //   2036: iload #12
    //   2038: iconst_5
    //   2039: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2042: iload_3
    //   2043: ifeq -> 2099
    //   2046: iload #38
    //   2048: ifeq -> 2099
    //   2051: iload #14
    //   2053: ifne -> 2099
    //   2056: iload #35
    //   2058: ifne -> 2099
    //   2061: iload #38
    //   2063: ifeq -> 2086
    //   2066: iload #37
    //   2068: iconst_3
    //   2069: if_icmpne -> 2086
    //   2072: aload_1
    //   2073: aload #31
    //   2075: aload #28
    //   2077: iconst_0
    //   2078: bipush #8
    //   2080: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2083: goto -> 2106
    //   2086: aload_1
    //   2087: aload #31
    //   2089: aload #28
    //   2091: iconst_0
    //   2092: iconst_5
    //   2093: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2096: goto -> 2106
    //   2099: goto -> 2106
    //   2102: aload #8
    //   2104: astore #31
    //   2106: iconst_0
    //   2107: istore #12
    //   2109: iload_3
    //   2110: ifeq -> 2203
    //   2113: iload #5
    //   2115: ifeq -> 2203
    //   2118: aload #11
    //   2120: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2123: ifnull -> 2133
    //   2126: aload #11
    //   2128: invokevirtual f : ()I
    //   2131: istore #12
    //   2133: aload #39
    //   2135: aload #7
    //   2137: if_acmpeq -> 2203
    //   2140: aload_0
    //   2141: getfield k : Z
    //   2144: ifeq -> 2192
    //   2147: aload #31
    //   2149: getfield h : Z
    //   2152: ifeq -> 2192
    //   2155: aload_0
    //   2156: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2159: astore #6
    //   2161: aload #6
    //   2163: ifnull -> 2192
    //   2166: aload #6
    //   2168: checkcast androidx/constraintlayout/solver/widgets/d
    //   2171: astore_1
    //   2172: iload_2
    //   2173: ifeq -> 2185
    //   2176: aload_1
    //   2177: aload #11
    //   2179: invokevirtual l1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   2182: goto -> 2191
    //   2185: aload_1
    //   2186: aload #11
    //   2188: invokevirtual q1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   2191: return
    //   2192: aload_1
    //   2193: aload #7
    //   2195: aload #31
    //   2197: iload #12
    //   2199: iconst_5
    //   2200: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2203: return
    //   2204: iconst_1
    //   2205: istore #13
    //   2207: iload #36
    //   2209: iconst_2
    //   2210: if_icmpge -> 2357
    //   2213: iload_3
    //   2214: ifeq -> 2357
    //   2217: iload #5
    //   2219: ifeq -> 2357
    //   2222: aload_1
    //   2223: aload #28
    //   2225: aload #6
    //   2227: iconst_0
    //   2228: bipush #8
    //   2230: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2233: iload_2
    //   2234: ifne -> 2256
    //   2237: aload_0
    //   2238: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2241: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2244: ifnonnull -> 2250
    //   2247: goto -> 2256
    //   2250: iconst_0
    //   2251: istore #12
    //   2253: goto -> 2259
    //   2256: iconst_1
    //   2257: istore #12
    //   2259: iload_2
    //   2260: ifne -> 2341
    //   2263: aload_0
    //   2264: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2267: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2270: astore #6
    //   2272: aload #6
    //   2274: ifnull -> 2341
    //   2277: aload #6
    //   2279: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2282: astore #6
    //   2284: aload #6
    //   2286: getfield Z : F
    //   2289: fconst_0
    //   2290: fcmpl
    //   2291: ifeq -> 2335
    //   2294: aload #6
    //   2296: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   2299: astore #6
    //   2301: aload #6
    //   2303: iconst_0
    //   2304: aaload
    //   2305: astore #10
    //   2307: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   2310: astore #11
    //   2312: aload #10
    //   2314: aload #11
    //   2316: if_acmpne -> 2335
    //   2319: aload #6
    //   2321: iconst_1
    //   2322: aaload
    //   2323: aload #11
    //   2325: if_acmpne -> 2335
    //   2328: iload #13
    //   2330: istore #12
    //   2332: goto -> 2341
    //   2335: iconst_0
    //   2336: istore #12
    //   2338: goto -> 2341
    //   2341: iload #12
    //   2343: ifeq -> 2357
    //   2346: aload_1
    //   2347: aload #7
    //   2349: aload #8
    //   2351: iconst_0
    //   2352: bipush #8
    //   2354: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2357: return
    //   2358: invokestatic w : ()Landroidx/constraintlayout/solver/e;
    //   2361: pop
    //   2362: goto -> 2367
    //   2365: aconst_null
    //   2366: athrow
    //   2367: goto -> 2365
  }
  
  public int A() {
    return this.C0;
  }
  
  public void A0(float paramFloat) {
    this.k0 = paramFloat;
  }
  
  public DimensionBehaviour B() {
    return this.V[0];
  }
  
  public void B0(int paramInt) {
    this.C0 = paramInt;
  }
  
  public int C() {
    ConstraintAnchor constraintAnchor = this.K;
    int i = 0;
    if (constraintAnchor != null)
      i = 0 + constraintAnchor.g; 
    constraintAnchor = this.M;
    int j = i;
    if (constraintAnchor != null)
      j = i + constraintAnchor.g; 
    return j;
  }
  
  public void C0(int paramInt1, int paramInt2) {
    this.b0 = paramInt1;
    paramInt1 = paramInt2 - paramInt1;
    this.X = paramInt1;
    paramInt2 = this.i0;
    if (paramInt1 < paramInt2)
      this.X = paramInt2; 
  }
  
  public int D() {
    return this.I;
  }
  
  public void D0(DimensionBehaviour paramDimensionBehaviour) {
    this.V[0] = paramDimensionBehaviour;
  }
  
  public int E() {
    return this.J;
  }
  
  public void E0(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.q = paramInt1;
    this.t = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE)
      paramInt2 = 0; 
    this.u = paramInt2;
    this.v = paramFloat;
    if (paramFloat > 0.0F && paramFloat < 1.0F && paramInt1 == 0)
      this.q = 2; 
  }
  
  public int F(int paramInt) {
    return (paramInt == 0) ? U() : ((paramInt == 1) ? y() : 0);
  }
  
  public void F0(float paramFloat) {
    this.G0[0] = paramFloat;
  }
  
  public int G() {
    return this.D[1];
  }
  
  protected void G0(int paramInt, boolean paramBoolean) {
    this.U[paramInt] = paramBoolean;
  }
  
  public int H() {
    return this.D[0];
  }
  
  public void H0(boolean paramBoolean) {
    this.G = paramBoolean;
  }
  
  public int I() {
    return this.j0;
  }
  
  public void I0(boolean paramBoolean) {
    this.H = paramBoolean;
  }
  
  public int J() {
    return this.i0;
  }
  
  public void J0(int paramInt1, int paramInt2) {
    this.I = paramInt1;
    this.J = paramInt2;
    M0(false);
  }
  
  public ConstraintWidget K(int paramInt) {
    if (paramInt == 0) {
      ConstraintAnchor constraintAnchor1 = this.M;
      ConstraintAnchor constraintAnchor2 = constraintAnchor1.f;
      if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor1)
        return constraintAnchor2.d; 
    } else if (paramInt == 1) {
      ConstraintAnchor constraintAnchor2 = this.N;
      ConstraintAnchor constraintAnchor1 = constraintAnchor2.f;
      if (constraintAnchor1 != null && constraintAnchor1.f == constraintAnchor2)
        return constraintAnchor1.d; 
    } 
    return null;
  }
  
  public void K0(int paramInt) {
    this.D[1] = paramInt;
  }
  
  public ConstraintWidget L() {
    return this.W;
  }
  
  public void L0(int paramInt) {
    this.D[0] = paramInt;
  }
  
  public ConstraintWidget M(int paramInt) {
    if (paramInt == 0) {
      ConstraintAnchor constraintAnchor1 = this.K;
      ConstraintAnchor constraintAnchor2 = constraintAnchor1.f;
      if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor1)
        return constraintAnchor2.d; 
    } else if (paramInt == 1) {
      ConstraintAnchor constraintAnchor1 = this.L;
      ConstraintAnchor constraintAnchor2 = constraintAnchor1.f;
      if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor1)
        return constraintAnchor2.d; 
    } 
    return null;
  }
  
  public void M0(boolean paramBoolean) {
    this.j = paramBoolean;
  }
  
  public int N() {
    return V() + this.X;
  }
  
  public void N0(int paramInt) {
    if (paramInt < 0) {
      this.j0 = 0;
    } else {
      this.j0 = paramInt;
    } 
  }
  
  public WidgetRun O(int paramInt) {
    return (WidgetRun)((paramInt == 0) ? this.f : ((paramInt == 1) ? this.g : null));
  }
  
  public void O0(int paramInt) {
    if (paramInt < 0) {
      this.i0 = 0;
    } else {
      this.i0 = paramInt;
    } 
  }
  
  public float P() {
    return this.l0;
  }
  
  public void P0(int paramInt1, int paramInt2) {
    this.b0 = paramInt1;
    this.c0 = paramInt2;
  }
  
  public int Q() {
    return this.D0;
  }
  
  public void Q0(ConstraintWidget paramConstraintWidget) {
    this.W = paramConstraintWidget;
  }
  
  public DimensionBehaviour R() {
    return this.V[1];
  }
  
  public void R0(float paramFloat) {
    this.l0 = paramFloat;
  }
  
  public int S() {
    ConstraintAnchor constraintAnchor = this.K;
    int i = 0;
    if (constraintAnchor != null)
      i = 0 + this.L.g; 
    int j = i;
    if (this.M != null)
      j = i + this.N.g; 
    return j;
  }
  
  public void S0(int paramInt) {
    this.D0 = paramInt;
  }
  
  public int T() {
    return this.o0;
  }
  
  public void T0(int paramInt1, int paramInt2) {
    this.c0 = paramInt1;
    paramInt2 -= paramInt1;
    this.Y = paramInt2;
    paramInt1 = this.j0;
    if (paramInt2 < paramInt1)
      this.Y = paramInt1; 
  }
  
  public int U() {
    return (this.o0 == 8) ? 0 : this.X;
  }
  
  public void U0(DimensionBehaviour paramDimensionBehaviour) {
    this.V[1] = paramDimensionBehaviour;
  }
  
  public int V() {
    ConstraintWidget constraintWidget = this.W;
    return (constraintWidget != null && constraintWidget instanceof d) ? (((d)constraintWidget).U0 + this.b0) : this.b0;
  }
  
  public void V0(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.r = paramInt1;
    this.w = paramInt2;
    paramInt2 = paramInt3;
    if (paramInt3 == Integer.MAX_VALUE)
      paramInt2 = 0; 
    this.x = paramInt2;
    this.y = paramFloat;
    if (paramFloat > 0.0F && paramFloat < 1.0F && paramInt1 == 0)
      this.r = 2; 
  }
  
  public int W() {
    ConstraintWidget constraintWidget = this.W;
    return (constraintWidget != null && constraintWidget instanceof d) ? (((d)constraintWidget).V0 + this.c0) : this.c0;
  }
  
  public void W0(float paramFloat) {
    this.G0[1] = paramFloat;
  }
  
  public boolean X() {
    return this.F;
  }
  
  public void X0(int paramInt) {
    this.o0 = paramInt;
  }
  
  public boolean Y(int paramInt) {
    byte b1;
    byte b2;
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramInt == 0) {
      if (this.K.f != null) {
        paramInt = 1;
      } else {
        paramInt = 0;
      } 
      if (this.M.f != null) {
        b1 = 1;
      } else {
        b1 = 0;
      } 
      if (paramInt + b1 >= 2)
        bool2 = false; 
      return bool2;
    } 
    if (this.L.f != null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    } 
    if (this.N.f != null) {
      b1 = 1;
    } else {
      b1 = 0;
    } 
    if (this.O.f != null) {
      b2 = 1;
    } else {
      b2 = 0;
    } 
    if (paramInt + b1 + b2 < 2) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    return bool2;
  }
  
  public void Y0(int paramInt) {
    this.X = paramInt;
    int i = this.i0;
    if (paramInt < i)
      this.X = i; 
  }
  
  public boolean Z() {
    int i = this.T.size();
    for (byte b = 0; b < i; b++) {
      if (((ConstraintAnchor)this.T.get(b)).m())
        return true; 
    } 
    return false;
  }
  
  public void Z0(int paramInt) {
    this.b0 = paramInt;
  }
  
  public void a0(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2, int paramInt1, int paramInt2) {
    p(paramType1).b(paramConstraintWidget.p(paramType2), paramInt1, paramInt2, true);
  }
  
  public void a1(int paramInt) {
    this.c0 = paramInt;
  }
  
  public void b1(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (this.B == -1)
      if (paramBoolean3 && !paramBoolean4) {
        this.B = 0;
      } else if (!paramBoolean3 && paramBoolean4) {
        this.B = 1;
        if (this.a0 == -1)
          this.C = 1.0F / this.C; 
      }  
    if (this.B == 0 && (!this.L.o() || !this.N.o())) {
      this.B = 1;
    } else if (this.B == 1 && (!this.K.o() || !this.M.o())) {
      this.B = 0;
    } 
    if (this.B == -1 && (!this.L.o() || !this.N.o() || !this.K.o() || !this.M.o()))
      if (this.L.o() && this.N.o()) {
        this.B = 0;
      } else if (this.K.o() && this.M.o()) {
        this.C = 1.0F / this.C;
        this.B = 1;
      }  
    if (this.B == -1) {
      int i = this.t;
      if (i > 0 && this.w == 0) {
        this.B = 0;
      } else if (i == 0 && this.w > 0) {
        this.C = 1.0F / this.C;
        this.B = 1;
      } 
    } 
  }
  
  public boolean c0() {
    ConstraintAnchor constraintAnchor1 = this.K;
    ConstraintAnchor constraintAnchor2 = constraintAnchor1.f;
    if (constraintAnchor2 == null || constraintAnchor2.f != constraintAnchor1) {
      constraintAnchor2 = this.M;
      constraintAnchor1 = constraintAnchor2.f;
      if (constraintAnchor1 == null || constraintAnchor1.f != constraintAnchor2)
        return false; 
    } 
    return true;
  }
  
  public void c1(boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: iload_1
    //   1: aload_0
    //   2: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   5: invokevirtual k : ()Z
    //   8: iand
    //   9: istore_3
    //   10: iload_2
    //   11: aload_0
    //   12: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   15: invokevirtual k : ()Z
    //   18: iand
    //   19: istore #4
    //   21: aload_0
    //   22: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   25: astore #5
    //   27: aload #5
    //   29: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   32: getfield g : I
    //   35: istore #6
    //   37: aload_0
    //   38: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   41: astore #7
    //   43: aload #7
    //   45: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   48: getfield g : I
    //   51: istore #8
    //   53: aload #5
    //   55: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   58: getfield g : I
    //   61: istore #9
    //   63: aload #7
    //   65: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   68: getfield g : I
    //   71: istore #10
    //   73: iload #9
    //   75: iload #6
    //   77: isub
    //   78: iflt -> 153
    //   81: iload #10
    //   83: iload #8
    //   85: isub
    //   86: iflt -> 153
    //   89: iload #6
    //   91: ldc_w -2147483648
    //   94: if_icmpeq -> 153
    //   97: iload #6
    //   99: ldc 2147483647
    //   101: if_icmpeq -> 153
    //   104: iload #8
    //   106: ldc_w -2147483648
    //   109: if_icmpeq -> 153
    //   112: iload #8
    //   114: ldc 2147483647
    //   116: if_icmpeq -> 153
    //   119: iload #9
    //   121: ldc_w -2147483648
    //   124: if_icmpeq -> 153
    //   127: iload #9
    //   129: ldc 2147483647
    //   131: if_icmpeq -> 153
    //   134: iload #10
    //   136: ldc_w -2147483648
    //   139: if_icmpeq -> 153
    //   142: iload #10
    //   144: istore #11
    //   146: iload #10
    //   148: ldc 2147483647
    //   150: if_icmpne -> 165
    //   153: iconst_0
    //   154: istore #9
    //   156: iconst_0
    //   157: istore #6
    //   159: iconst_0
    //   160: istore #11
    //   162: iconst_0
    //   163: istore #8
    //   165: iload #9
    //   167: iload #6
    //   169: isub
    //   170: istore #9
    //   172: iload #11
    //   174: iload #8
    //   176: isub
    //   177: istore #11
    //   179: iload_3
    //   180: ifeq -> 189
    //   183: aload_0
    //   184: iload #6
    //   186: putfield b0 : I
    //   189: iload #4
    //   191: ifeq -> 200
    //   194: aload_0
    //   195: iload #8
    //   197: putfield c0 : I
    //   200: aload_0
    //   201: getfield o0 : I
    //   204: bipush #8
    //   206: if_icmpne -> 220
    //   209: aload_0
    //   210: iconst_0
    //   211: putfield X : I
    //   214: aload_0
    //   215: iconst_0
    //   216: putfield Y : I
    //   219: return
    //   220: iload_3
    //   221: ifeq -> 286
    //   224: iload #9
    //   226: istore #8
    //   228: aload_0
    //   229: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   232: iconst_0
    //   233: aaload
    //   234: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   237: if_acmpne -> 261
    //   240: aload_0
    //   241: getfield X : I
    //   244: istore #6
    //   246: iload #9
    //   248: istore #8
    //   250: iload #9
    //   252: iload #6
    //   254: if_icmpge -> 261
    //   257: iload #6
    //   259: istore #8
    //   261: aload_0
    //   262: iload #8
    //   264: putfield X : I
    //   267: aload_0
    //   268: getfield i0 : I
    //   271: istore #6
    //   273: iload #8
    //   275: iload #6
    //   277: if_icmpge -> 286
    //   280: aload_0
    //   281: iload #6
    //   283: putfield X : I
    //   286: iload #4
    //   288: ifeq -> 353
    //   291: iload #11
    //   293: istore #8
    //   295: aload_0
    //   296: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   299: iconst_1
    //   300: aaload
    //   301: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   304: if_acmpne -> 328
    //   307: aload_0
    //   308: getfield Y : I
    //   311: istore #6
    //   313: iload #11
    //   315: istore #8
    //   317: iload #11
    //   319: iload #6
    //   321: if_icmpge -> 328
    //   324: iload #6
    //   326: istore #8
    //   328: aload_0
    //   329: iload #8
    //   331: putfield Y : I
    //   334: aload_0
    //   335: getfield j0 : I
    //   338: istore #11
    //   340: iload #8
    //   342: iload #11
    //   344: if_icmpge -> 353
    //   347: aload_0
    //   348: iload #11
    //   350: putfield Y : I
    //   353: return
  }
  
  public boolean d0() {
    return this.G;
  }
  
  public void d1(d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   5: invokevirtual x : (Ljava/lang/Object;)I
    //   8: istore_3
    //   9: aload_1
    //   10: aload_0
    //   11: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   14: invokevirtual x : (Ljava/lang/Object;)I
    //   17: istore #4
    //   19: aload_1
    //   20: aload_0
    //   21: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   24: invokevirtual x : (Ljava/lang/Object;)I
    //   27: istore #5
    //   29: aload_1
    //   30: aload_0
    //   31: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   34: invokevirtual x : (Ljava/lang/Object;)I
    //   37: istore #6
    //   39: iload_3
    //   40: istore #7
    //   42: iload #5
    //   44: istore #8
    //   46: iload_2
    //   47: ifeq -> 123
    //   50: aload_0
    //   51: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   54: astore #9
    //   56: iload_3
    //   57: istore #7
    //   59: iload #5
    //   61: istore #8
    //   63: aload #9
    //   65: ifnull -> 123
    //   68: aload #9
    //   70: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   73: astore_1
    //   74: iload_3
    //   75: istore #7
    //   77: iload #5
    //   79: istore #8
    //   81: aload_1
    //   82: getfield j : Z
    //   85: ifeq -> 123
    //   88: aload #9
    //   90: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   93: astore #9
    //   95: iload_3
    //   96: istore #7
    //   98: iload #5
    //   100: istore #8
    //   102: aload #9
    //   104: getfield j : Z
    //   107: ifeq -> 123
    //   110: aload_1
    //   111: getfield g : I
    //   114: istore #7
    //   116: aload #9
    //   118: getfield g : I
    //   121: istore #8
    //   123: iload #4
    //   125: istore_3
    //   126: iload #6
    //   128: istore #5
    //   130: iload_2
    //   131: ifeq -> 206
    //   134: aload_0
    //   135: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   138: astore #9
    //   140: iload #4
    //   142: istore_3
    //   143: iload #6
    //   145: istore #5
    //   147: aload #9
    //   149: ifnull -> 206
    //   152: aload #9
    //   154: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   157: astore_1
    //   158: iload #4
    //   160: istore_3
    //   161: iload #6
    //   163: istore #5
    //   165: aload_1
    //   166: getfield j : Z
    //   169: ifeq -> 206
    //   172: aload #9
    //   174: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   177: astore #9
    //   179: iload #4
    //   181: istore_3
    //   182: iload #6
    //   184: istore #5
    //   186: aload #9
    //   188: getfield j : Z
    //   191: ifeq -> 206
    //   194: aload_1
    //   195: getfield g : I
    //   198: istore_3
    //   199: aload #9
    //   201: getfield g : I
    //   204: istore #5
    //   206: iload #8
    //   208: iload #7
    //   210: isub
    //   211: iflt -> 291
    //   214: iload #5
    //   216: iload_3
    //   217: isub
    //   218: iflt -> 291
    //   221: iload #7
    //   223: ldc_w -2147483648
    //   226: if_icmpeq -> 291
    //   229: iload #7
    //   231: ldc 2147483647
    //   233: if_icmpeq -> 291
    //   236: iload_3
    //   237: ldc_w -2147483648
    //   240: if_icmpeq -> 291
    //   243: iload_3
    //   244: ldc 2147483647
    //   246: if_icmpeq -> 291
    //   249: iload #8
    //   251: ldc_w -2147483648
    //   254: if_icmpeq -> 291
    //   257: iload #8
    //   259: ldc 2147483647
    //   261: if_icmpeq -> 291
    //   264: iload #5
    //   266: ldc_w -2147483648
    //   269: if_icmpeq -> 291
    //   272: iload #7
    //   274: istore #6
    //   276: iload #8
    //   278: istore #7
    //   280: iload #5
    //   282: istore #8
    //   284: iload #5
    //   286: ldc 2147483647
    //   288: if_icmpne -> 302
    //   291: iconst_0
    //   292: istore #8
    //   294: iconst_0
    //   295: istore #6
    //   297: iconst_0
    //   298: istore_3
    //   299: iconst_0
    //   300: istore #7
    //   302: aload_0
    //   303: iload #6
    //   305: iload_3
    //   306: iload #7
    //   308: iload #8
    //   310: invokevirtual x0 : (IIII)V
    //   313: return
  }
  
  public void e(d paramd, d paramd1, HashSet<ConstraintWidget> paramHashSet, int paramInt, boolean paramBoolean) {
    if (paramBoolean) {
      if (!paramHashSet.contains(this))
        return; 
      i.a(paramd, paramd1, this);
      paramHashSet.remove(this);
      g(paramd1, paramd.G1(64));
    } 
    if (paramInt == 0) {
      HashSet<ConstraintAnchor> hashSet = this.K.d();
      if (hashSet != null) {
        Iterator<ConstraintAnchor> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((ConstraintAnchor)iterator.next()).d.e(paramd, paramd1, paramHashSet, paramInt, true); 
      } 
      hashSet = this.M.d();
      if (hashSet != null) {
        Iterator<ConstraintAnchor> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((ConstraintAnchor)iterator.next()).d.e(paramd, paramd1, paramHashSet, paramInt, true); 
      } 
    } else {
      HashSet<ConstraintAnchor> hashSet = this.L.d();
      if (hashSet != null) {
        Iterator<ConstraintAnchor> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((ConstraintAnchor)iterator.next()).d.e(paramd, paramd1, paramHashSet, paramInt, true); 
      } 
      hashSet = this.N.d();
      if (hashSet != null) {
        Iterator<ConstraintAnchor> iterator = hashSet.iterator();
        while (iterator.hasNext())
          ((ConstraintAnchor)iterator.next()).d.e(paramd, paramd1, paramHashSet, paramInt, true); 
      } 
      hashSet = this.O.d();
      if (hashSet != null) {
        Iterator<ConstraintAnchor> iterator = hashSet.iterator();
        while (true) {
          if (iterator.hasNext()) {
            ConstraintWidget constraintWidget = ((ConstraintAnchor)iterator.next()).d;
            try {
              constraintWidget.e(paramd, paramd1, paramHashSet, paramInt, true);
            } finally {}
            continue;
          } 
          return;
        } 
      } 
    } 
  }
  
  public boolean e0() {
    ConstraintAnchor constraintAnchor1 = this.L;
    ConstraintAnchor constraintAnchor2 = constraintAnchor1.f;
    if (constraintAnchor2 == null || constraintAnchor2.f != constraintAnchor1) {
      constraintAnchor1 = this.N;
      constraintAnchor2 = constraintAnchor1.f;
      if (constraintAnchor2 == null || constraintAnchor2.f != constraintAnchor1)
        return false; 
    } 
    return true;
  }
  
  boolean f() {
    return (this instanceof j || this instanceof f);
  }
  
  public boolean f0() {
    return this.H;
  }
  
  public void g(d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: aload_0
    //   2: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   5: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   8: astore_3
    //   9: aload_1
    //   10: aload_0
    //   11: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   14: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   17: astore #4
    //   19: aload_1
    //   20: aload_0
    //   21: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   24: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   27: astore #5
    //   29: aload_1
    //   30: aload_0
    //   31: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   34: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   37: astore #6
    //   39: aload_1
    //   40: aload_0
    //   41: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   44: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   47: astore #7
    //   49: aload_0
    //   50: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   53: astore #8
    //   55: aload #8
    //   57: ifnull -> 121
    //   60: aload #8
    //   62: ifnull -> 84
    //   65: aload #8
    //   67: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   70: iconst_0
    //   71: aaload
    //   72: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   75: if_acmpne -> 84
    //   78: iconst_1
    //   79: istore #9
    //   81: goto -> 87
    //   84: iconst_0
    //   85: istore #9
    //   87: aload #8
    //   89: ifnull -> 111
    //   92: aload #8
    //   94: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   97: iconst_1
    //   98: aaload
    //   99: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   102: if_acmpne -> 111
    //   105: iconst_1
    //   106: istore #10
    //   108: goto -> 114
    //   111: iconst_0
    //   112: istore #10
    //   114: iload #9
    //   116: istore #11
    //   118: goto -> 127
    //   121: iconst_0
    //   122: istore #11
    //   124: iconst_0
    //   125: istore #10
    //   127: aload_0
    //   128: getfield o0 : I
    //   131: bipush #8
    //   133: if_icmpne -> 164
    //   136: aload_0
    //   137: invokevirtual Z : ()Z
    //   140: ifne -> 164
    //   143: aload_0
    //   144: getfield U : [Z
    //   147: astore #8
    //   149: aload #8
    //   151: iconst_0
    //   152: baload
    //   153: ifne -> 164
    //   156: aload #8
    //   158: iconst_1
    //   159: baload
    //   160: ifne -> 164
    //   163: return
    //   164: aload_0
    //   165: getfield m : Z
    //   168: istore #9
    //   170: iload #9
    //   172: ifne -> 182
    //   175: aload_0
    //   176: getfield n : Z
    //   179: ifeq -> 429
    //   182: iload #9
    //   184: ifeq -> 279
    //   187: aload_1
    //   188: aload_3
    //   189: aload_0
    //   190: getfield b0 : I
    //   193: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   196: aload_1
    //   197: aload #4
    //   199: aload_0
    //   200: getfield b0 : I
    //   203: aload_0
    //   204: getfield X : I
    //   207: iadd
    //   208: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   211: iload #11
    //   213: ifeq -> 279
    //   216: aload_0
    //   217: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   220: astore #8
    //   222: aload #8
    //   224: ifnull -> 279
    //   227: aload_0
    //   228: getfield l : Z
    //   231: ifeq -> 262
    //   234: aload #8
    //   236: checkcast androidx/constraintlayout/solver/widgets/d
    //   239: astore #8
    //   241: aload #8
    //   243: aload_0
    //   244: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   247: invokevirtual r1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   250: aload #8
    //   252: aload_0
    //   253: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   256: invokevirtual l1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   259: goto -> 279
    //   262: aload_1
    //   263: aload_1
    //   264: aload #8
    //   266: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   269: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   272: aload #4
    //   274: iconst_0
    //   275: iconst_5
    //   276: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   279: aload_0
    //   280: getfield n : Z
    //   283: ifeq -> 404
    //   286: aload_1
    //   287: aload #5
    //   289: aload_0
    //   290: getfield c0 : I
    //   293: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   296: aload_1
    //   297: aload #6
    //   299: aload_0
    //   300: getfield c0 : I
    //   303: aload_0
    //   304: getfield Y : I
    //   307: iadd
    //   308: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   311: aload_0
    //   312: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   315: invokevirtual m : ()Z
    //   318: ifeq -> 336
    //   321: aload_1
    //   322: aload #7
    //   324: aload_0
    //   325: getfield c0 : I
    //   328: aload_0
    //   329: getfield h0 : I
    //   332: iadd
    //   333: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   336: iload #10
    //   338: ifeq -> 404
    //   341: aload_0
    //   342: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   345: astore #8
    //   347: aload #8
    //   349: ifnull -> 404
    //   352: aload_0
    //   353: getfield l : Z
    //   356: ifeq -> 387
    //   359: aload #8
    //   361: checkcast androidx/constraintlayout/solver/widgets/d
    //   364: astore #8
    //   366: aload #8
    //   368: aload_0
    //   369: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   372: invokevirtual r1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   375: aload #8
    //   377: aload_0
    //   378: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   381: invokevirtual q1 : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)V
    //   384: goto -> 404
    //   387: aload_1
    //   388: aload_1
    //   389: aload #8
    //   391: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   394: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   397: aload #6
    //   399: iconst_0
    //   400: iconst_5
    //   401: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   404: aload_0
    //   405: getfield m : Z
    //   408: ifeq -> 429
    //   411: aload_0
    //   412: getfield n : Z
    //   415: ifeq -> 429
    //   418: aload_0
    //   419: iconst_0
    //   420: putfield m : Z
    //   423: aload_0
    //   424: iconst_0
    //   425: putfield n : Z
    //   428: return
    //   429: getstatic androidx/constraintlayout/solver/d.g : Landroidx/constraintlayout/solver/e;
    //   432: astore #12
    //   434: aload #12
    //   436: ifnonnull -> 2633
    //   439: iload_2
    //   440: ifeq -> 694
    //   443: aload_0
    //   444: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   447: astore #13
    //   449: aload #13
    //   451: ifnull -> 694
    //   454: aload_0
    //   455: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   458: astore #8
    //   460: aload #8
    //   462: ifnull -> 694
    //   465: aload #13
    //   467: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   470: astore #14
    //   472: aload #14
    //   474: getfield j : Z
    //   477: ifeq -> 694
    //   480: aload #13
    //   482: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   485: getfield j : Z
    //   488: ifeq -> 694
    //   491: aload #8
    //   493: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   496: getfield j : Z
    //   499: ifeq -> 694
    //   502: aload #8
    //   504: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   507: getfield j : Z
    //   510: ifeq -> 694
    //   513: aload #12
    //   515: ifnonnull -> 692
    //   518: aload_1
    //   519: aload_3
    //   520: aload #14
    //   522: getfield g : I
    //   525: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   528: aload_1
    //   529: aload #4
    //   531: aload_0
    //   532: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   535: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   538: getfield g : I
    //   541: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   544: aload_1
    //   545: aload #5
    //   547: aload_0
    //   548: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   551: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   554: getfield g : I
    //   557: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   560: aload_1
    //   561: aload #6
    //   563: aload_0
    //   564: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   567: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   570: getfield g : I
    //   573: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   576: aload_1
    //   577: aload #7
    //   579: aload_0
    //   580: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   583: getfield k : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   586: getfield g : I
    //   589: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   592: aload_0
    //   593: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   596: ifnull -> 681
    //   599: iload #11
    //   601: ifeq -> 640
    //   604: aload_0
    //   605: getfield h : [Z
    //   608: iconst_0
    //   609: baload
    //   610: ifeq -> 640
    //   613: aload_0
    //   614: invokevirtual c0 : ()Z
    //   617: ifne -> 640
    //   620: aload_1
    //   621: aload_1
    //   622: aload_0
    //   623: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   626: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   629: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   632: aload #4
    //   634: iconst_0
    //   635: bipush #8
    //   637: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   640: iload #10
    //   642: ifeq -> 681
    //   645: aload_0
    //   646: getfield h : [Z
    //   649: iconst_1
    //   650: baload
    //   651: ifeq -> 681
    //   654: aload_0
    //   655: invokevirtual e0 : ()Z
    //   658: ifne -> 681
    //   661: aload_1
    //   662: aload_1
    //   663: aload_0
    //   664: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   667: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   670: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   673: aload #6
    //   675: iconst_0
    //   676: bipush #8
    //   678: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   681: aload_0
    //   682: iconst_0
    //   683: putfield m : Z
    //   686: aload_0
    //   687: iconst_0
    //   688: putfield n : Z
    //   691: return
    //   692: aconst_null
    //   693: athrow
    //   694: aload #12
    //   696: ifnonnull -> 2631
    //   699: aload_0
    //   700: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   703: ifnull -> 900
    //   706: aload_0
    //   707: iconst_0
    //   708: invokespecial b0 : (I)Z
    //   711: ifeq -> 732
    //   714: aload_0
    //   715: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   718: checkcast androidx/constraintlayout/solver/widgets/d
    //   721: aload_0
    //   722: iconst_0
    //   723: invokevirtual i1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)V
    //   726: iconst_1
    //   727: istore #9
    //   729: goto -> 738
    //   732: aload_0
    //   733: invokevirtual c0 : ()Z
    //   736: istore #9
    //   738: aload_0
    //   739: iconst_1
    //   740: invokespecial b0 : (I)Z
    //   743: ifeq -> 764
    //   746: aload_0
    //   747: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   750: checkcast androidx/constraintlayout/solver/widgets/d
    //   753: aload_0
    //   754: iconst_1
    //   755: invokevirtual i1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)V
    //   758: iconst_1
    //   759: istore #15
    //   761: goto -> 770
    //   764: aload_0
    //   765: invokevirtual e0 : ()Z
    //   768: istore #15
    //   770: iload #9
    //   772: ifne -> 828
    //   775: iload #11
    //   777: ifeq -> 828
    //   780: aload_0
    //   781: getfield o0 : I
    //   784: bipush #8
    //   786: if_icmpeq -> 828
    //   789: aload_0
    //   790: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   793: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   796: ifnonnull -> 828
    //   799: aload_0
    //   800: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   803: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   806: ifnonnull -> 828
    //   809: aload_1
    //   810: aload_1
    //   811: aload_0
    //   812: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   815: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   818: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   821: aload #4
    //   823: iconst_0
    //   824: iconst_1
    //   825: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   828: iload #15
    //   830: ifne -> 893
    //   833: iload #10
    //   835: ifeq -> 893
    //   838: aload_0
    //   839: getfield o0 : I
    //   842: bipush #8
    //   844: if_icmpeq -> 893
    //   847: aload_0
    //   848: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   851: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   854: ifnonnull -> 893
    //   857: aload_0
    //   858: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   861: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   864: ifnonnull -> 893
    //   867: aload_0
    //   868: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   871: ifnonnull -> 893
    //   874: aload_1
    //   875: aload_1
    //   876: aload_0
    //   877: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   880: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   883: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   886: aload #6
    //   888: iconst_0
    //   889: iconst_1
    //   890: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   893: iload #9
    //   895: istore #16
    //   897: goto -> 906
    //   900: iconst_0
    //   901: istore #15
    //   903: iconst_0
    //   904: istore #16
    //   906: aload_0
    //   907: getfield X : I
    //   910: istore #17
    //   912: aload_0
    //   913: getfield i0 : I
    //   916: istore #18
    //   918: iload #17
    //   920: iload #18
    //   922: if_icmpge -> 928
    //   925: goto -> 932
    //   928: iload #17
    //   930: istore #18
    //   932: aload_0
    //   933: getfield Y : I
    //   936: istore #19
    //   938: aload_0
    //   939: getfield j0 : I
    //   942: istore #20
    //   944: iload #19
    //   946: iload #20
    //   948: if_icmpge -> 954
    //   951: goto -> 958
    //   954: iload #19
    //   956: istore #20
    //   958: aload_0
    //   959: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   962: astore #14
    //   964: aload #14
    //   966: iconst_0
    //   967: aaload
    //   968: astore #8
    //   970: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   973: astore #21
    //   975: aload #8
    //   977: aload #21
    //   979: if_acmpeq -> 988
    //   982: iconst_1
    //   983: istore #9
    //   985: goto -> 991
    //   988: iconst_0
    //   989: istore #9
    //   991: aload #14
    //   993: iconst_1
    //   994: aaload
    //   995: aload #21
    //   997: if_acmpeq -> 1006
    //   1000: iconst_1
    //   1001: istore #22
    //   1003: goto -> 1009
    //   1006: iconst_0
    //   1007: istore #22
    //   1009: aload_0
    //   1010: getfield a0 : I
    //   1013: istore #23
    //   1015: aload_0
    //   1016: iload #23
    //   1018: putfield B : I
    //   1021: aload_0
    //   1022: getfield Z : F
    //   1025: fstore #24
    //   1027: aload_0
    //   1028: fload #24
    //   1030: putfield C : F
    //   1033: aload_0
    //   1034: getfield q : I
    //   1037: istore #25
    //   1039: aload_0
    //   1040: getfield r : I
    //   1043: istore #26
    //   1045: aload #4
    //   1047: astore #8
    //   1049: fload #24
    //   1051: fconst_0
    //   1052: fcmpl
    //   1053: ifle -> 1366
    //   1056: aload_0
    //   1057: getfield o0 : I
    //   1060: bipush #8
    //   1062: if_icmpeq -> 1366
    //   1065: iload #25
    //   1067: istore #27
    //   1069: aload #14
    //   1071: iconst_0
    //   1072: aaload
    //   1073: aload #21
    //   1075: if_acmpne -> 1090
    //   1078: iload #25
    //   1080: istore #27
    //   1082: iload #25
    //   1084: ifne -> 1090
    //   1087: iconst_3
    //   1088: istore #27
    //   1090: iload #26
    //   1092: istore #25
    //   1094: aload #14
    //   1096: iconst_1
    //   1097: aaload
    //   1098: aload #21
    //   1100: if_acmpne -> 1115
    //   1103: iload #26
    //   1105: istore #25
    //   1107: iload #26
    //   1109: ifne -> 1115
    //   1112: iconst_3
    //   1113: istore #25
    //   1115: aload #14
    //   1117: iconst_0
    //   1118: aaload
    //   1119: aload #21
    //   1121: if_acmpne -> 1160
    //   1124: aload #14
    //   1126: iconst_1
    //   1127: aaload
    //   1128: aload #21
    //   1130: if_acmpne -> 1160
    //   1133: iload #27
    //   1135: iconst_3
    //   1136: if_icmpne -> 1160
    //   1139: iload #25
    //   1141: iconst_3
    //   1142: if_icmpne -> 1160
    //   1145: aload_0
    //   1146: iload #11
    //   1148: iload #10
    //   1150: iload #9
    //   1152: iload #22
    //   1154: invokevirtual b1 : (ZZZZ)V
    //   1157: goto -> 1336
    //   1160: aload #14
    //   1162: iconst_0
    //   1163: aaload
    //   1164: aload #21
    //   1166: if_acmpne -> 1242
    //   1169: iload #27
    //   1171: iconst_3
    //   1172: if_icmpne -> 1242
    //   1175: aload_0
    //   1176: iconst_0
    //   1177: putfield B : I
    //   1180: fload #24
    //   1182: iload #19
    //   1184: i2f
    //   1185: fmul
    //   1186: f2i
    //   1187: istore #18
    //   1189: aload #14
    //   1191: iconst_1
    //   1192: aaload
    //   1193: aload #21
    //   1195: if_acmpeq -> 1227
    //   1198: iload #25
    //   1200: istore #27
    //   1202: iload #20
    //   1204: istore #25
    //   1206: iconst_0
    //   1207: istore #9
    //   1209: iconst_4
    //   1210: istore #26
    //   1212: iload #18
    //   1214: istore #20
    //   1216: iload #25
    //   1218: istore #18
    //   1220: iload #26
    //   1222: istore #25
    //   1224: goto -> 1385
    //   1227: iload #20
    //   1229: istore #26
    //   1231: iload #18
    //   1233: istore #20
    //   1235: iload #26
    //   1237: istore #18
    //   1239: goto -> 1348
    //   1242: aload #14
    //   1244: iconst_1
    //   1245: aaload
    //   1246: aload #21
    //   1248: if_acmpne -> 1336
    //   1251: iload #25
    //   1253: iconst_3
    //   1254: if_icmpne -> 1336
    //   1257: aload_0
    //   1258: iconst_1
    //   1259: putfield B : I
    //   1262: iload #23
    //   1264: iconst_m1
    //   1265: if_icmpne -> 1276
    //   1268: aload_0
    //   1269: fconst_1
    //   1270: fload #24
    //   1272: fdiv
    //   1273: putfield C : F
    //   1276: aload_0
    //   1277: getfield C : F
    //   1280: iload #17
    //   1282: i2f
    //   1283: fmul
    //   1284: f2i
    //   1285: istore #26
    //   1287: aload #14
    //   1289: iconst_0
    //   1290: aaload
    //   1291: astore #14
    //   1293: iload #27
    //   1295: istore #17
    //   1297: aload #14
    //   1299: aload #21
    //   1301: if_acmpeq -> 1325
    //   1304: iconst_0
    //   1305: istore #9
    //   1307: iconst_4
    //   1308: istore #27
    //   1310: iload #18
    //   1312: istore #20
    //   1314: iload #26
    //   1316: istore #18
    //   1318: iload #17
    //   1320: istore #25
    //   1322: goto -> 1385
    //   1325: iload #18
    //   1327: istore #20
    //   1329: iload #26
    //   1331: istore #18
    //   1333: goto -> 1348
    //   1336: iload #18
    //   1338: istore #26
    //   1340: iload #20
    //   1342: istore #18
    //   1344: iload #26
    //   1346: istore #20
    //   1348: iload #27
    //   1350: istore #26
    //   1352: iload #25
    //   1354: istore #27
    //   1356: iconst_1
    //   1357: istore #9
    //   1359: iload #26
    //   1361: istore #25
    //   1363: goto -> 1385
    //   1366: iload #26
    //   1368: istore #27
    //   1370: iload #18
    //   1372: istore #26
    //   1374: iload #20
    //   1376: istore #18
    //   1378: iconst_0
    //   1379: istore #9
    //   1381: iload #26
    //   1383: istore #20
    //   1385: aload_0
    //   1386: getfield s : [I
    //   1389: astore #14
    //   1391: aload #14
    //   1393: iconst_0
    //   1394: iload #25
    //   1396: iastore
    //   1397: aload #14
    //   1399: iconst_1
    //   1400: iload #27
    //   1402: iastore
    //   1403: aload_0
    //   1404: iload #9
    //   1406: putfield i : Z
    //   1409: iload #9
    //   1411: ifeq -> 1437
    //   1414: aload_0
    //   1415: getfield B : I
    //   1418: istore #26
    //   1420: iload #26
    //   1422: ifeq -> 1431
    //   1425: iload #26
    //   1427: iconst_m1
    //   1428: if_icmpne -> 1437
    //   1431: iconst_1
    //   1432: istore #28
    //   1434: goto -> 1440
    //   1437: iconst_0
    //   1438: istore #28
    //   1440: iload #9
    //   1442: ifeq -> 1469
    //   1445: aload_0
    //   1446: getfield B : I
    //   1449: istore #26
    //   1451: iload #26
    //   1453: iconst_1
    //   1454: if_icmpeq -> 1463
    //   1457: iload #26
    //   1459: iconst_m1
    //   1460: if_icmpne -> 1469
    //   1463: iconst_1
    //   1464: istore #22
    //   1466: goto -> 1472
    //   1469: iconst_0
    //   1470: istore #22
    //   1472: aload_0
    //   1473: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1476: iconst_0
    //   1477: aaload
    //   1478: astore #14
    //   1480: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1483: astore #29
    //   1485: aload #14
    //   1487: aload #29
    //   1489: if_acmpne -> 1505
    //   1492: aload_0
    //   1493: instanceof androidx/constraintlayout/solver/widgets/d
    //   1496: ifeq -> 1505
    //   1499: iconst_1
    //   1500: istore #30
    //   1502: goto -> 1508
    //   1505: iconst_0
    //   1506: istore #30
    //   1508: iload #30
    //   1510: ifeq -> 1519
    //   1513: iconst_0
    //   1514: istore #20
    //   1516: goto -> 1519
    //   1519: aload_0
    //   1520: getfield R : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1523: invokevirtual o : ()Z
    //   1526: iconst_1
    //   1527: ixor
    //   1528: istore #31
    //   1530: aload_0
    //   1531: getfield U : [Z
    //   1534: astore #14
    //   1536: aload #14
    //   1538: iconst_0
    //   1539: baload
    //   1540: istore #32
    //   1542: aload #14
    //   1544: iconst_1
    //   1545: baload
    //   1546: istore #33
    //   1548: aload_0
    //   1549: getfield o : I
    //   1552: iconst_2
    //   1553: if_icmpeq -> 1888
    //   1556: aload_0
    //   1557: getfield m : Z
    //   1560: ifne -> 1888
    //   1563: iload_2
    //   1564: ifeq -> 1691
    //   1567: aload_0
    //   1568: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   1571: astore #14
    //   1573: aload #14
    //   1575: ifnull -> 1691
    //   1578: aload #14
    //   1580: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1583: astore #12
    //   1585: aload #12
    //   1587: getfield j : Z
    //   1590: ifeq -> 1691
    //   1593: aload #14
    //   1595: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1598: getfield j : Z
    //   1601: ifne -> 1607
    //   1604: goto -> 1691
    //   1607: iload_2
    //   1608: ifeq -> 1688
    //   1611: aload_1
    //   1612: aload_3
    //   1613: aload #12
    //   1615: getfield g : I
    //   1618: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   1621: aload_1
    //   1622: aload #8
    //   1624: aload_0
    //   1625: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   1628: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1631: getfield g : I
    //   1634: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   1637: aload_0
    //   1638: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1641: ifnull -> 1685
    //   1644: iload #11
    //   1646: ifeq -> 1685
    //   1649: aload_0
    //   1650: getfield h : [Z
    //   1653: iconst_0
    //   1654: baload
    //   1655: ifeq -> 1685
    //   1658: aload_0
    //   1659: invokevirtual c0 : ()Z
    //   1662: ifne -> 1685
    //   1665: aload_1
    //   1666: aload_1
    //   1667: aload_0
    //   1668: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1671: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1674: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   1677: aload #8
    //   1679: iconst_0
    //   1680: bipush #8
    //   1682: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   1685: goto -> 1888
    //   1688: goto -> 1888
    //   1691: aload_0
    //   1692: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1695: astore #8
    //   1697: aload #8
    //   1699: ifnull -> 1716
    //   1702: aload_1
    //   1703: aload #8
    //   1705: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1708: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   1711: astore #8
    //   1713: goto -> 1719
    //   1716: aconst_null
    //   1717: astore #8
    //   1719: aload_0
    //   1720: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1723: astore #14
    //   1725: aload #14
    //   1727: ifnull -> 1744
    //   1730: aload_1
    //   1731: aload #14
    //   1733: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1736: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   1739: astore #14
    //   1741: goto -> 1747
    //   1744: aconst_null
    //   1745: astore #14
    //   1747: aload_0
    //   1748: getfield h : [Z
    //   1751: iconst_0
    //   1752: baload
    //   1753: istore #34
    //   1755: aload_0
    //   1756: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1759: astore #13
    //   1761: aload #13
    //   1763: iconst_0
    //   1764: aaload
    //   1765: astore #35
    //   1767: aload_0
    //   1768: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1771: astore #12
    //   1773: aload_0
    //   1774: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1777: astore #36
    //   1779: aload_0
    //   1780: getfield b0 : I
    //   1783: istore #17
    //   1785: aload_0
    //   1786: getfield i0 : I
    //   1789: istore #26
    //   1791: aload_0
    //   1792: getfield D : [I
    //   1795: iconst_0
    //   1796: iaload
    //   1797: istore #19
    //   1799: aload_0
    //   1800: getfield k0 : F
    //   1803: fstore #24
    //   1805: aload #13
    //   1807: iconst_1
    //   1808: aaload
    //   1809: aload #21
    //   1811: if_acmpne -> 1820
    //   1814: iconst_1
    //   1815: istore #37
    //   1817: goto -> 1823
    //   1820: iconst_0
    //   1821: istore #37
    //   1823: aload_0
    //   1824: aload_1
    //   1825: iconst_1
    //   1826: iload #11
    //   1828: iload #10
    //   1830: iload #34
    //   1832: aload #14
    //   1834: aload #8
    //   1836: aload #35
    //   1838: iload #30
    //   1840: aload #12
    //   1842: aload #36
    //   1844: iload #17
    //   1846: iload #20
    //   1848: iload #26
    //   1850: iload #19
    //   1852: fload #24
    //   1854: iload #28
    //   1856: iload #37
    //   1858: iload #16
    //   1860: iload #15
    //   1862: iload #32
    //   1864: iload #25
    //   1866: iload #27
    //   1868: aload_0
    //   1869: getfield t : I
    //   1872: aload_0
    //   1873: getfield u : I
    //   1876: aload_0
    //   1877: getfield v : F
    //   1880: iload #31
    //   1882: invokespecial i : (Landroidx/constraintlayout/solver/d;ZZZZLandroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ZLandroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;IIIIFZZZZZIIIIFZ)V
    //   1885: goto -> 1888
    //   1888: aload #6
    //   1890: astore #8
    //   1892: aload #7
    //   1894: astore #14
    //   1896: aload_3
    //   1897: astore #7
    //   1899: iload #10
    //   1901: istore #30
    //   1903: aload #4
    //   1905: astore #6
    //   1907: iload_2
    //   1908: ifeq -> 2075
    //   1911: aload_0
    //   1912: astore #4
    //   1914: aload #4
    //   1916: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   1919: astore_3
    //   1920: aload_3
    //   1921: ifnull -> 2072
    //   1924: aload_3
    //   1925: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1928: astore #12
    //   1930: aload #12
    //   1932: getfield j : Z
    //   1935: ifeq -> 2072
    //   1938: aload_3
    //   1939: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1942: getfield j : Z
    //   1945: ifeq -> 2072
    //   1948: aload #12
    //   1950: getfield g : I
    //   1953: istore #20
    //   1955: aload_1
    //   1956: astore #12
    //   1958: aload #12
    //   1960: aload #5
    //   1962: iload #20
    //   1964: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   1967: aload #4
    //   1969: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   1972: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1975: getfield g : I
    //   1978: istore #20
    //   1980: aload #8
    //   1982: astore_3
    //   1983: aload #12
    //   1985: aload_3
    //   1986: iload #20
    //   1988: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   1991: aload #12
    //   1993: aload #14
    //   1995: aload #4
    //   1997: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   2000: getfield k : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2003: getfield g : I
    //   2006: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   2009: aload #4
    //   2011: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2014: astore #13
    //   2016: aload #13
    //   2018: ifnull -> 2066
    //   2021: iload #15
    //   2023: ifne -> 2066
    //   2026: iload #30
    //   2028: ifeq -> 2066
    //   2031: aload #4
    //   2033: getfield h : [Z
    //   2036: iconst_1
    //   2037: baload
    //   2038: ifeq -> 2063
    //   2041: aload #12
    //   2043: aload #12
    //   2045: aload #13
    //   2047: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2050: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   2053: aload_3
    //   2054: iconst_0
    //   2055: bipush #8
    //   2057: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2060: goto -> 2066
    //   2063: goto -> 2066
    //   2066: iconst_0
    //   2067: istore #20
    //   2069: goto -> 2078
    //   2072: goto -> 2075
    //   2075: iconst_1
    //   2076: istore #20
    //   2078: aload_0
    //   2079: astore #12
    //   2081: aload_1
    //   2082: astore #13
    //   2084: aload #5
    //   2086: astore #4
    //   2088: aload #14
    //   2090: astore #5
    //   2092: aload #12
    //   2094: getfield p : I
    //   2097: iconst_2
    //   2098: if_icmpne -> 2107
    //   2101: iconst_0
    //   2102: istore #20
    //   2104: goto -> 2107
    //   2107: iload #20
    //   2109: ifeq -> 2503
    //   2112: aload #12
    //   2114: getfield n : Z
    //   2117: ifne -> 2503
    //   2120: aload #12
    //   2122: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   2125: iconst_1
    //   2126: aaload
    //   2127: aload #29
    //   2129: if_acmpne -> 2145
    //   2132: aload #12
    //   2134: instanceof androidx/constraintlayout/solver/widgets/d
    //   2137: ifeq -> 2145
    //   2140: iconst_1
    //   2141: istore_2
    //   2142: goto -> 2147
    //   2145: iconst_0
    //   2146: istore_2
    //   2147: iload_2
    //   2148: ifeq -> 2154
    //   2151: iconst_0
    //   2152: istore #18
    //   2154: aload #12
    //   2156: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2159: astore_3
    //   2160: aload_3
    //   2161: ifnull -> 2177
    //   2164: aload #13
    //   2166: aload_3
    //   2167: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2170: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   2173: astore_3
    //   2174: goto -> 2179
    //   2177: aconst_null
    //   2178: astore_3
    //   2179: aload #12
    //   2181: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2184: astore #14
    //   2186: aload #14
    //   2188: ifnull -> 2206
    //   2191: aload #13
    //   2193: aload #14
    //   2195: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2198: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   2201: astore #14
    //   2203: goto -> 2209
    //   2206: aconst_null
    //   2207: astore #14
    //   2209: aload #12
    //   2211: getfield h0 : I
    //   2214: ifgt -> 2227
    //   2217: aload #12
    //   2219: getfield o0 : I
    //   2222: bipush #8
    //   2224: if_icmpne -> 2349
    //   2227: aload #12
    //   2229: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2232: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2235: ifnull -> 2307
    //   2238: aload #13
    //   2240: aload #5
    //   2242: aload #4
    //   2244: aload_0
    //   2245: invokevirtual q : ()I
    //   2248: bipush #8
    //   2250: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   2253: pop
    //   2254: aload #13
    //   2256: aload #5
    //   2258: aload #13
    //   2260: aload #12
    //   2262: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2265: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2268: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   2271: iconst_0
    //   2272: bipush #8
    //   2274: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   2277: pop
    //   2278: iload #30
    //   2280: ifeq -> 2301
    //   2283: aload #13
    //   2285: aload_3
    //   2286: aload #13
    //   2288: aload #12
    //   2290: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2293: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   2296: iconst_0
    //   2297: iconst_5
    //   2298: invokevirtual h : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)V
    //   2301: iconst_0
    //   2302: istore #10
    //   2304: goto -> 2353
    //   2307: aload #12
    //   2309: getfield o0 : I
    //   2312: bipush #8
    //   2314: if_icmpne -> 2333
    //   2317: aload #13
    //   2319: aload #5
    //   2321: aload #4
    //   2323: iconst_0
    //   2324: bipush #8
    //   2326: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   2329: pop
    //   2330: goto -> 2349
    //   2333: aload #13
    //   2335: aload #5
    //   2337: aload #4
    //   2339: aload_0
    //   2340: invokevirtual q : ()I
    //   2343: bipush #8
    //   2345: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   2348: pop
    //   2349: iload #31
    //   2351: istore #10
    //   2353: aload #12
    //   2355: getfield h : [Z
    //   2358: iconst_1
    //   2359: baload
    //   2360: istore #37
    //   2362: aload #12
    //   2364: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   2367: astore #36
    //   2369: aload #36
    //   2371: iconst_1
    //   2372: aaload
    //   2373: astore #5
    //   2375: aload #12
    //   2377: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2380: astore #13
    //   2382: aload #12
    //   2384: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2387: astore #29
    //   2389: aload #12
    //   2391: getfield c0 : I
    //   2394: istore #20
    //   2396: aload #12
    //   2398: getfield j0 : I
    //   2401: istore #17
    //   2403: aload #12
    //   2405: getfield D : [I
    //   2408: iconst_1
    //   2409: iaload
    //   2410: istore #26
    //   2412: aload #12
    //   2414: getfield l0 : F
    //   2417: fstore #24
    //   2419: aload #36
    //   2421: iconst_0
    //   2422: aaload
    //   2423: aload #21
    //   2425: if_acmpne -> 2434
    //   2428: iconst_1
    //   2429: istore #28
    //   2431: goto -> 2437
    //   2434: iconst_0
    //   2435: istore #28
    //   2437: aload_0
    //   2438: aload_1
    //   2439: iconst_0
    //   2440: iload #30
    //   2442: iload #11
    //   2444: iload #37
    //   2446: aload #14
    //   2448: aload_3
    //   2449: aload #5
    //   2451: iload_2
    //   2452: aload #13
    //   2454: aload #29
    //   2456: iload #20
    //   2458: iload #18
    //   2460: iload #17
    //   2462: iload #26
    //   2464: fload #24
    //   2466: iload #22
    //   2468: iload #28
    //   2470: iload #15
    //   2472: iload #16
    //   2474: iload #33
    //   2476: iload #27
    //   2478: iload #25
    //   2480: aload #12
    //   2482: getfield w : I
    //   2485: aload #12
    //   2487: getfield x : I
    //   2490: aload #12
    //   2492: getfield y : F
    //   2495: iload #10
    //   2497: invokespecial i : (Landroidx/constraintlayout/solver/d;ZZZZLandroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ZLandroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;IIIIFZZZZZIIIIFZ)V
    //   2500: goto -> 2503
    //   2503: aload #8
    //   2505: astore_3
    //   2506: iload #9
    //   2508: ifeq -> 2565
    //   2511: aload_0
    //   2512: astore #8
    //   2514: aload #8
    //   2516: getfield B : I
    //   2519: iconst_1
    //   2520: if_icmpne -> 2544
    //   2523: aload_1
    //   2524: aload_3
    //   2525: aload #4
    //   2527: aload #6
    //   2529: aload #7
    //   2531: aload #8
    //   2533: getfield C : F
    //   2536: bipush #8
    //   2538: invokevirtual k : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;FI)V
    //   2541: goto -> 2565
    //   2544: aload_1
    //   2545: aload #6
    //   2547: aload #7
    //   2549: aload_3
    //   2550: aload #4
    //   2552: aload #8
    //   2554: getfield C : F
    //   2557: bipush #8
    //   2559: invokevirtual k : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;FI)V
    //   2562: goto -> 2565
    //   2565: aload_0
    //   2566: astore #8
    //   2568: aload #8
    //   2570: getfield R : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2573: invokevirtual o : ()Z
    //   2576: ifeq -> 2618
    //   2579: aload_1
    //   2580: aload #8
    //   2582: aload #8
    //   2584: getfield R : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2587: invokevirtual j : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2590: invokevirtual h : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2593: aload #8
    //   2595: getfield E : F
    //   2598: ldc_w 90.0
    //   2601: fadd
    //   2602: f2d
    //   2603: invokestatic toRadians : (D)D
    //   2606: d2f
    //   2607: aload #8
    //   2609: getfield R : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   2612: invokevirtual f : ()I
    //   2615: invokevirtual b : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;FI)V
    //   2618: aload #8
    //   2620: iconst_0
    //   2621: putfield m : Z
    //   2624: aload #8
    //   2626: iconst_0
    //   2627: putfield n : Z
    //   2630: return
    //   2631: aconst_null
    //   2632: athrow
    //   2633: aconst_null
    //   2634: athrow
  }
  
  public boolean g0() {
    boolean bool;
    if (this.j && this.o0 != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean h() {
    boolean bool;
    if (this.o0 != 8) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean h0() {
    return (this.m || (this.K.n() && this.M.n()));
  }
  
  public boolean i0() {
    return (this.n || (this.L.n() && this.N.n()));
  }
  
  public void j(ConstraintAnchor.Type paramType1, ConstraintWidget paramConstraintWidget, ConstraintAnchor.Type paramType2, int paramInt) {
    // Byte code:
    //   0: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.h : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   3: astore #5
    //   5: aload_1
    //   6: aload #5
    //   8: if_acmpne -> 367
    //   11: aload_3
    //   12: aload #5
    //   14: if_acmpne -> 256
    //   17: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   20: astore #6
    //   22: aload_0
    //   23: aload #6
    //   25: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   28: astore #7
    //   30: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   33: astore #8
    //   35: aload_0
    //   36: aload #8
    //   38: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   41: astore #9
    //   43: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   46: astore_3
    //   47: aload_0
    //   48: aload_3
    //   49: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   52: astore #10
    //   54: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   57: astore #11
    //   59: aload_0
    //   60: aload #11
    //   62: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   65: astore_1
    //   66: iconst_1
    //   67: istore #12
    //   69: aload #7
    //   71: ifnull -> 82
    //   74: aload #7
    //   76: invokevirtual o : ()Z
    //   79: ifne -> 95
    //   82: aload #9
    //   84: ifnull -> 101
    //   87: aload #9
    //   89: invokevirtual o : ()Z
    //   92: ifeq -> 101
    //   95: iconst_0
    //   96: istore #4
    //   98: goto -> 124
    //   101: aload_0
    //   102: aload #6
    //   104: aload_2
    //   105: aload #6
    //   107: iconst_0
    //   108: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   111: aload_0
    //   112: aload #8
    //   114: aload_2
    //   115: aload #8
    //   117: iconst_0
    //   118: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   121: iconst_1
    //   122: istore #4
    //   124: aload #10
    //   126: ifnull -> 137
    //   129: aload #10
    //   131: invokevirtual o : ()Z
    //   134: ifne -> 148
    //   137: aload_1
    //   138: ifnull -> 154
    //   141: aload_1
    //   142: invokevirtual o : ()Z
    //   145: ifeq -> 154
    //   148: iconst_0
    //   149: istore #12
    //   151: goto -> 172
    //   154: aload_0
    //   155: aload_3
    //   156: aload_2
    //   157: aload_3
    //   158: iconst_0
    //   159: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   162: aload_0
    //   163: aload #11
    //   165: aload_2
    //   166: aload #11
    //   168: iconst_0
    //   169: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   172: iload #4
    //   174: ifeq -> 202
    //   177: iload #12
    //   179: ifeq -> 202
    //   182: aload_0
    //   183: aload #5
    //   185: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   188: aload_2
    //   189: aload #5
    //   191: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   194: iconst_0
    //   195: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   198: pop
    //   199: goto -> 905
    //   202: iload #4
    //   204: ifeq -> 229
    //   207: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.i : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   210: astore_1
    //   211: aload_0
    //   212: aload_1
    //   213: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   216: aload_2
    //   217: aload_1
    //   218: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   221: iconst_0
    //   222: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   225: pop
    //   226: goto -> 905
    //   229: iload #12
    //   231: ifeq -> 905
    //   234: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.j : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   237: astore_1
    //   238: aload_0
    //   239: aload_1
    //   240: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   243: aload_2
    //   244: aload_1
    //   245: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   248: iconst_0
    //   249: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   252: pop
    //   253: goto -> 905
    //   256: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   259: astore_1
    //   260: aload_3
    //   261: aload_1
    //   262: if_acmpeq -> 328
    //   265: aload_3
    //   266: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   269: if_acmpne -> 275
    //   272: goto -> 328
    //   275: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   278: astore_1
    //   279: aload_3
    //   280: aload_1
    //   281: if_acmpeq -> 291
    //   284: aload_3
    //   285: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   288: if_acmpne -> 905
    //   291: aload_0
    //   292: aload_1
    //   293: aload_2
    //   294: aload_3
    //   295: iconst_0
    //   296: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   299: aload_0
    //   300: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   303: aload_2
    //   304: aload_3
    //   305: iconst_0
    //   306: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   309: aload_0
    //   310: aload #5
    //   312: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   315: aload_2
    //   316: aload_3
    //   317: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   320: iconst_0
    //   321: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   324: pop
    //   325: goto -> 905
    //   328: aload_0
    //   329: aload_1
    //   330: aload_2
    //   331: aload_3
    //   332: iconst_0
    //   333: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   336: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   339: astore_1
    //   340: aload_0
    //   341: aload_1
    //   342: aload_2
    //   343: aload_3
    //   344: iconst_0
    //   345: invokevirtual j : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;I)V
    //   348: aload_0
    //   349: aload #5
    //   351: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   354: aload_2
    //   355: aload_3
    //   356: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   359: iconst_0
    //   360: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   363: pop
    //   364: goto -> 905
    //   367: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.i : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   370: astore #6
    //   372: aload_1
    //   373: aload #6
    //   375: if_acmpne -> 446
    //   378: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   381: astore #9
    //   383: aload_3
    //   384: aload #9
    //   386: if_acmpeq -> 396
    //   389: aload_3
    //   390: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   393: if_acmpne -> 446
    //   396: aload_0
    //   397: aload #9
    //   399: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   402: astore_1
    //   403: aload_2
    //   404: aload_3
    //   405: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   408: astore_2
    //   409: aload_0
    //   410: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   413: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   416: astore_3
    //   417: aload_1
    //   418: aload_2
    //   419: iconst_0
    //   420: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   423: pop
    //   424: aload_3
    //   425: aload_2
    //   426: iconst_0
    //   427: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   430: pop
    //   431: aload_0
    //   432: aload #6
    //   434: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   437: aload_2
    //   438: iconst_0
    //   439: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   442: pop
    //   443: goto -> 905
    //   446: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.j : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   449: astore #11
    //   451: aload_1
    //   452: aload #11
    //   454: if_acmpne -> 521
    //   457: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   460: astore #9
    //   462: aload_3
    //   463: aload #9
    //   465: if_acmpeq -> 475
    //   468: aload_3
    //   469: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   472: if_acmpne -> 521
    //   475: aload_2
    //   476: aload_3
    //   477: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   480: astore_1
    //   481: aload_0
    //   482: aload #9
    //   484: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   487: aload_1
    //   488: iconst_0
    //   489: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   492: pop
    //   493: aload_0
    //   494: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   497: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   500: aload_1
    //   501: iconst_0
    //   502: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   505: pop
    //   506: aload_0
    //   507: aload #11
    //   509: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   512: aload_1
    //   513: iconst_0
    //   514: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   517: pop
    //   518: goto -> 905
    //   521: aload_1
    //   522: aload #6
    //   524: if_acmpne -> 590
    //   527: aload_3
    //   528: aload #6
    //   530: if_acmpne -> 590
    //   533: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   536: astore_1
    //   537: aload_0
    //   538: aload_1
    //   539: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   542: aload_2
    //   543: aload_1
    //   544: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   547: iconst_0
    //   548: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   551: pop
    //   552: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   555: astore_1
    //   556: aload_0
    //   557: aload_1
    //   558: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   561: aload_2
    //   562: aload_1
    //   563: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   566: iconst_0
    //   567: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   570: pop
    //   571: aload_0
    //   572: aload #6
    //   574: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   577: aload_2
    //   578: aload_3
    //   579: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   582: iconst_0
    //   583: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   586: pop
    //   587: goto -> 905
    //   590: aload_1
    //   591: aload #11
    //   593: if_acmpne -> 659
    //   596: aload_3
    //   597: aload #11
    //   599: if_acmpne -> 659
    //   602: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   605: astore_1
    //   606: aload_0
    //   607: aload_1
    //   608: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   611: aload_2
    //   612: aload_1
    //   613: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   616: iconst_0
    //   617: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   620: pop
    //   621: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   624: astore_1
    //   625: aload_0
    //   626: aload_1
    //   627: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   630: aload_2
    //   631: aload_1
    //   632: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   635: iconst_0
    //   636: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   639: pop
    //   640: aload_0
    //   641: aload #11
    //   643: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   646: aload_2
    //   647: aload_3
    //   648: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   651: iconst_0
    //   652: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   655: pop
    //   656: goto -> 905
    //   659: aload_0
    //   660: aload_1
    //   661: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   664: astore #9
    //   666: aload_2
    //   667: aload_3
    //   668: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   671: astore_2
    //   672: aload #9
    //   674: aload_2
    //   675: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;)Z
    //   678: ifeq -> 905
    //   681: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   684: astore_3
    //   685: aload_1
    //   686: aload_3
    //   687: if_acmpne -> 728
    //   690: aload_0
    //   691: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   694: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   697: astore_3
    //   698: aload_0
    //   699: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   702: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   705: astore_1
    //   706: aload_3
    //   707: ifnull -> 714
    //   710: aload_3
    //   711: invokevirtual q : ()V
    //   714: aload_1
    //   715: ifnull -> 722
    //   718: aload_1
    //   719: invokevirtual q : ()V
    //   722: iconst_0
    //   723: istore #12
    //   725: goto -> 896
    //   728: aload_1
    //   729: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   732: if_acmpeq -> 824
    //   735: aload_1
    //   736: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   739: if_acmpne -> 745
    //   742: goto -> 824
    //   745: aload_1
    //   746: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   749: if_acmpeq -> 763
    //   752: iload #4
    //   754: istore #12
    //   756: aload_1
    //   757: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   760: if_acmpne -> 896
    //   763: aload_0
    //   764: aload #5
    //   766: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   769: astore_3
    //   770: aload_3
    //   771: invokevirtual j : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   774: aload_2
    //   775: if_acmpeq -> 782
    //   778: aload_3
    //   779: invokevirtual q : ()V
    //   782: aload_0
    //   783: aload_1
    //   784: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   787: invokevirtual g : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   790: astore_1
    //   791: aload_0
    //   792: aload #6
    //   794: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   797: astore_3
    //   798: iload #4
    //   800: istore #12
    //   802: aload_3
    //   803: invokevirtual o : ()Z
    //   806: ifeq -> 896
    //   809: aload_1
    //   810: invokevirtual q : ()V
    //   813: aload_3
    //   814: invokevirtual q : ()V
    //   817: iload #4
    //   819: istore #12
    //   821: goto -> 896
    //   824: aload_0
    //   825: aload_3
    //   826: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   829: astore_3
    //   830: aload_3
    //   831: ifnull -> 838
    //   834: aload_3
    //   835: invokevirtual q : ()V
    //   838: aload_0
    //   839: aload #5
    //   841: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   844: astore_3
    //   845: aload_3
    //   846: invokevirtual j : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   849: aload_2
    //   850: if_acmpeq -> 857
    //   853: aload_3
    //   854: invokevirtual q : ()V
    //   857: aload_0
    //   858: aload_1
    //   859: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   862: invokevirtual g : ()Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   865: astore_1
    //   866: aload_0
    //   867: aload #11
    //   869: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   872: astore_3
    //   873: iload #4
    //   875: istore #12
    //   877: aload_3
    //   878: invokevirtual o : ()Z
    //   881: ifeq -> 896
    //   884: aload_1
    //   885: invokevirtual q : ()V
    //   888: aload_3
    //   889: invokevirtual q : ()V
    //   892: iload #4
    //   894: istore #12
    //   896: aload #9
    //   898: aload_2
    //   899: iload #12
    //   901: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
    //   904: pop
    //   905: return
    //   906: astore_1
    //   907: aload_1
    //   908: athrow
    // Exception table:
    //   from	to	target	type
    //   340	348	906	finally
  }
  
  public boolean j0() {
    DimensionBehaviour[] arrayOfDimensionBehaviour = this.V;
    boolean bool1 = false;
    DimensionBehaviour dimensionBehaviour1 = arrayOfDimensionBehaviour[0];
    DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.d;
    boolean bool2 = bool1;
    if (dimensionBehaviour1 == dimensionBehaviour2) {
      bool2 = bool1;
      if (arrayOfDimensionBehaviour[1] == dimensionBehaviour2)
        bool2 = true; 
    } 
    return bool2;
  }
  
  public void k(ConstraintAnchor paramConstraintAnchor1, ConstraintAnchor paramConstraintAnchor2, int paramInt) {
    if (paramConstraintAnchor1.h() == this)
      j(paramConstraintAnchor1.k(), paramConstraintAnchor2.h(), paramConstraintAnchor2.k(), paramInt); 
  }
  
  public void k0() {
    this.K.q();
    this.L.q();
    this.M.q();
    this.N.q();
    this.O.q();
    this.P.q();
    this.Q.q();
    this.R.q();
    this.W = null;
    this.E = 0.0F;
    this.X = 0;
    this.Y = 0;
    this.Z = 0.0F;
    this.a0 = -1;
    this.b0 = 0;
    this.c0 = 0;
    this.f0 = 0;
    this.g0 = 0;
    this.h0 = 0;
    this.i0 = 0;
    this.j0 = 0;
    float f = a;
    this.k0 = f;
    this.l0 = f;
    DimensionBehaviour[] arrayOfDimensionBehaviour = this.V;
    DimensionBehaviour dimensionBehaviour = DimensionBehaviour.b;
    arrayOfDimensionBehaviour[0] = dimensionBehaviour;
    arrayOfDimensionBehaviour[1] = dimensionBehaviour;
    this.m0 = null;
    this.n0 = 0;
    this.o0 = 0;
    this.q0 = null;
    this.z0 = false;
    this.A0 = false;
    this.C0 = 0;
    this.D0 = 0;
    this.E0 = false;
    this.F0 = false;
    float[] arrayOfFloat = this.G0;
    arrayOfFloat[0] = -1.0F;
    arrayOfFloat[1] = -1.0F;
    this.o = -1;
    this.p = -1;
    int[] arrayOfInt = this.D;
    arrayOfInt[0] = Integer.MAX_VALUE;
    arrayOfInt[1] = Integer.MAX_VALUE;
    this.q = 0;
    this.r = 0;
    this.v = 1.0F;
    this.y = 1.0F;
    this.u = Integer.MAX_VALUE;
    this.x = Integer.MAX_VALUE;
    this.t = 0;
    this.w = 0;
    this.i = false;
    this.B = -1;
    this.C = 1.0F;
    this.B0 = false;
    boolean[] arrayOfBoolean = this.h;
    arrayOfBoolean[0] = true;
    arrayOfBoolean[1] = true;
    this.H = false;
    arrayOfBoolean = this.U;
    arrayOfBoolean[0] = false;
    arrayOfBoolean[1] = false;
    this.j = true;
  }
  
  public void l(ConstraintWidget paramConstraintWidget, float paramFloat, int paramInt) {
    ConstraintAnchor.Type type = ConstraintAnchor.Type.h;
    a0(type, paramConstraintWidget, type, paramInt, 0);
    this.E = paramFloat;
  }
  
  public void l0() {
    ConstraintWidget constraintWidget = L();
    if (constraintWidget != null && constraintWidget instanceof d && ((d)L()).y1())
      return; 
    byte b = 0;
    int i = this.T.size();
    while (b < i) {
      ((ConstraintAnchor)this.T.get(b)).q();
      b++;
    } 
  }
  
  public void m(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap) {
    int[] arrayOfInt1;
    ConstraintWidget constraintWidget1;
    this.o = paramConstraintWidget.o;
    this.p = paramConstraintWidget.p;
    this.q = paramConstraintWidget.q;
    this.r = paramConstraintWidget.r;
    int[] arrayOfInt2 = this.s;
    int[] arrayOfInt3 = paramConstraintWidget.s;
    arrayOfInt2[0] = arrayOfInt3[0];
    arrayOfInt2[1] = arrayOfInt3[1];
    this.t = paramConstraintWidget.t;
    this.u = paramConstraintWidget.u;
    this.w = paramConstraintWidget.w;
    this.x = paramConstraintWidget.x;
    this.y = paramConstraintWidget.y;
    this.z = paramConstraintWidget.z;
    this.A = paramConstraintWidget.A;
    this.B = paramConstraintWidget.B;
    this.C = paramConstraintWidget.C;
    arrayOfInt2 = paramConstraintWidget.D;
    this.D = Arrays.copyOf(arrayOfInt2, arrayOfInt2.length);
    this.E = paramConstraintWidget.E;
    this.F = paramConstraintWidget.F;
    this.G = paramConstraintWidget.G;
    this.K.q();
    this.L.q();
    this.M.q();
    this.N.q();
    this.O.q();
    this.P.q();
    this.Q.q();
    this.R.q();
    this.V = Arrays.<DimensionBehaviour>copyOf(this.V, 2);
    ConstraintWidget constraintWidget3 = this.W;
    arrayOfInt3 = null;
    if (constraintWidget3 == null) {
      constraintWidget3 = null;
    } else {
      constraintWidget3 = paramHashMap.get(paramConstraintWidget.W);
    } 
    this.W = constraintWidget3;
    this.X = paramConstraintWidget.X;
    this.Y = paramConstraintWidget.Y;
    this.Z = paramConstraintWidget.Z;
    this.a0 = paramConstraintWidget.a0;
    this.b0 = paramConstraintWidget.b0;
    this.c0 = paramConstraintWidget.c0;
    this.d0 = paramConstraintWidget.d0;
    this.e0 = paramConstraintWidget.e0;
    this.f0 = paramConstraintWidget.f0;
    this.g0 = paramConstraintWidget.g0;
    this.h0 = paramConstraintWidget.h0;
    this.i0 = paramConstraintWidget.i0;
    this.j0 = paramConstraintWidget.j0;
    this.k0 = paramConstraintWidget.k0;
    this.l0 = paramConstraintWidget.l0;
    this.m0 = paramConstraintWidget.m0;
    this.n0 = paramConstraintWidget.n0;
    this.o0 = paramConstraintWidget.o0;
    this.p0 = paramConstraintWidget.p0;
    this.q0 = paramConstraintWidget.q0;
    this.r0 = paramConstraintWidget.r0;
    this.s0 = paramConstraintWidget.s0;
    this.t0 = paramConstraintWidget.t0;
    this.u0 = paramConstraintWidget.u0;
    this.v0 = paramConstraintWidget.v0;
    this.w0 = paramConstraintWidget.w0;
    this.x0 = paramConstraintWidget.x0;
    this.y0 = paramConstraintWidget.y0;
    this.z0 = paramConstraintWidget.z0;
    this.A0 = paramConstraintWidget.A0;
    this.C0 = paramConstraintWidget.C0;
    this.D0 = paramConstraintWidget.D0;
    this.E0 = paramConstraintWidget.E0;
    this.F0 = paramConstraintWidget.F0;
    float[] arrayOfFloat2 = this.G0;
    float[] arrayOfFloat1 = paramConstraintWidget.G0;
    arrayOfFloat2[0] = arrayOfFloat1[0];
    arrayOfFloat2[1] = arrayOfFloat1[1];
    ConstraintWidget[] arrayOfConstraintWidget2 = this.H0;
    ConstraintWidget[] arrayOfConstraintWidget1 = paramConstraintWidget.H0;
    arrayOfConstraintWidget2[0] = arrayOfConstraintWidget1[0];
    arrayOfConstraintWidget2[1] = arrayOfConstraintWidget1[1];
    arrayOfConstraintWidget1 = this.I0;
    arrayOfConstraintWidget2 = paramConstraintWidget.I0;
    arrayOfConstraintWidget1[0] = arrayOfConstraintWidget2[0];
    arrayOfConstraintWidget1[1] = arrayOfConstraintWidget2[1];
    ConstraintWidget constraintWidget2 = paramConstraintWidget.J0;
    if (constraintWidget2 == null) {
      constraintWidget2 = null;
    } else {
      constraintWidget2 = paramHashMap.get(constraintWidget2);
    } 
    this.J0 = constraintWidget2;
    paramConstraintWidget = paramConstraintWidget.K0;
    if (paramConstraintWidget == null) {
      arrayOfInt1 = arrayOfInt3;
    } else {
      constraintWidget1 = paramHashMap.get(arrayOfInt1);
    } 
    this.K0 = constraintWidget1;
  }
  
  public void m0() {
    byte b = 0;
    this.m = false;
    this.n = false;
    int i = this.T.size();
    while (b < i) {
      ((ConstraintAnchor)this.T.get(b)).r();
      b++;
    } 
  }
  
  public void n(d paramd) {
    paramd.q(this.K);
    paramd.q(this.L);
    paramd.q(this.M);
    paramd.q(this.N);
    if (this.h0 > 0)
      paramd.q(this.O); 
  }
  
  public void n0(c paramc) {
    this.K.s(paramc);
    this.L.s(paramc);
    this.M.s(paramc);
    this.N.s(paramc);
    this.O.s(paramc);
    this.R.s(paramc);
    this.P.s(paramc);
    this.Q.s(paramc);
  }
  
  public void o() {
    if (this.f == null)
      this.f = new k(this); 
    if (this.g == null)
      this.g = new m(this); 
  }
  
  public void o0(int paramInt) {
    boolean bool;
    this.h0 = paramInt;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.F = bool;
  }
  
  public ConstraintAnchor p(ConstraintAnchor.Type paramType) {
    switch (a.a[paramType.ordinal()]) {
      default:
        throw new AssertionError(paramType.name());
      case 9:
        return null;
      case 8:
        return this.Q;
      case 7:
        return this.P;
      case 6:
        return this.R;
      case 5:
        return this.O;
      case 4:
        return this.N;
      case 3:
        return this.M;
      case 2:
        return this.L;
      case 1:
        break;
    } 
    return this.K;
  }
  
  public void p0(Object paramObject) {
    this.m0 = paramObject;
  }
  
  public int q() {
    return this.h0;
  }
  
  public void q0(String paramString) {
    this.p0 = paramString;
  }
  
  public float r(int paramInt) {
    return (paramInt == 0) ? this.k0 : ((paramInt == 1) ? this.l0 : -1.0F);
  }
  
  public void r0(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 263
    //   4: aload_1
    //   5: invokevirtual length : ()I
    //   8: ifne -> 14
    //   11: goto -> 263
    //   14: iconst_m1
    //   15: istore_2
    //   16: aload_1
    //   17: invokevirtual length : ()I
    //   20: istore_3
    //   21: aload_1
    //   22: bipush #44
    //   24: invokevirtual indexOf : (I)I
    //   27: istore #4
    //   29: iconst_0
    //   30: istore #5
    //   32: iload_2
    //   33: istore #6
    //   35: iload #5
    //   37: istore #7
    //   39: iload #4
    //   41: ifle -> 108
    //   44: iload_2
    //   45: istore #6
    //   47: iload #5
    //   49: istore #7
    //   51: iload #4
    //   53: iload_3
    //   54: iconst_1
    //   55: isub
    //   56: if_icmpge -> 108
    //   59: aload_1
    //   60: iconst_0
    //   61: iload #4
    //   63: invokevirtual substring : (II)Ljava/lang/String;
    //   66: astore #8
    //   68: aload #8
    //   70: ldc_w 'W'
    //   73: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   76: ifeq -> 85
    //   79: iconst_0
    //   80: istore #6
    //   82: goto -> 102
    //   85: iload_2
    //   86: istore #6
    //   88: aload #8
    //   90: ldc_w 'H'
    //   93: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   96: ifeq -> 102
    //   99: iconst_1
    //   100: istore #6
    //   102: iload #4
    //   104: iconst_1
    //   105: iadd
    //   106: istore #7
    //   108: aload_1
    //   109: bipush #58
    //   111: invokevirtual indexOf : (I)I
    //   114: istore_2
    //   115: iload_2
    //   116: iflt -> 217
    //   119: iload_2
    //   120: iload_3
    //   121: iconst_1
    //   122: isub
    //   123: if_icmpge -> 217
    //   126: aload_1
    //   127: iload #7
    //   129: iload_2
    //   130: invokevirtual substring : (II)Ljava/lang/String;
    //   133: astore #8
    //   135: aload_1
    //   136: iload_2
    //   137: iconst_1
    //   138: iadd
    //   139: invokevirtual substring : (I)Ljava/lang/String;
    //   142: astore_1
    //   143: aload #8
    //   145: invokevirtual length : ()I
    //   148: ifle -> 240
    //   151: aload_1
    //   152: invokevirtual length : ()I
    //   155: ifle -> 240
    //   158: aload #8
    //   160: invokestatic parseFloat : (Ljava/lang/String;)F
    //   163: fstore #9
    //   165: aload_1
    //   166: invokestatic parseFloat : (Ljava/lang/String;)F
    //   169: fstore #10
    //   171: fload #9
    //   173: fconst_0
    //   174: fcmpl
    //   175: ifle -> 240
    //   178: fload #10
    //   180: fconst_0
    //   181: fcmpl
    //   182: ifle -> 240
    //   185: iload #6
    //   187: iconst_1
    //   188: if_icmpne -> 204
    //   191: fload #10
    //   193: fload #9
    //   195: fdiv
    //   196: invokestatic abs : (F)F
    //   199: fstore #9
    //   201: goto -> 243
    //   204: fload #9
    //   206: fload #10
    //   208: fdiv
    //   209: invokestatic abs : (F)F
    //   212: fstore #9
    //   214: goto -> 243
    //   217: aload_1
    //   218: iload #7
    //   220: invokevirtual substring : (I)Ljava/lang/String;
    //   223: astore_1
    //   224: aload_1
    //   225: invokevirtual length : ()I
    //   228: ifle -> 240
    //   231: aload_1
    //   232: invokestatic parseFloat : (Ljava/lang/String;)F
    //   235: fstore #9
    //   237: goto -> 243
    //   240: fconst_0
    //   241: fstore #9
    //   243: fload #9
    //   245: fconst_0
    //   246: fcmpl
    //   247: ifle -> 262
    //   250: aload_0
    //   251: fload #9
    //   253: putfield Z : F
    //   256: aload_0
    //   257: iload #6
    //   259: putfield a0 : I
    //   262: return
    //   263: aload_0
    //   264: fconst_0
    //   265: putfield Z : F
    //   268: return
    //   269: astore_1
    //   270: goto -> 240
    // Exception table:
    //   from	to	target	type
    //   158	171	269	java/lang/NumberFormatException
    //   191	201	269	java/lang/NumberFormatException
    //   204	214	269	java/lang/NumberFormatException
    //   231	237	269	java/lang/NumberFormatException
  }
  
  public int s() {
    return W() + this.Y;
  }
  
  public void s0(int paramInt) {
    if (!this.F)
      return; 
    int i = paramInt - this.h0;
    int j = this.Y;
    this.c0 = i;
    this.L.t(i);
    this.N.t(j + i);
    this.O.t(paramInt);
    this.n = true;
  }
  
  public Object t() {
    return this.m0;
  }
  
  public void t0(int paramInt1, int paramInt2) {
    this.K.t(paramInt1);
    this.M.t(paramInt2);
    this.b0 = paramInt1;
    this.X = paramInt2 - paramInt1;
    this.m = true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String str1 = this.q0;
    String str2 = "";
    if (str1 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("type: ");
      stringBuilder1.append(this.q0);
      stringBuilder1.append(" ");
      String str = stringBuilder1.toString();
    } else {
      str1 = "";
    } 
    stringBuilder.append(str1);
    str1 = str2;
    if (this.p0 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("id: ");
      stringBuilder1.append(this.p0);
      stringBuilder1.append(" ");
      str1 = stringBuilder1.toString();
    } 
    stringBuilder.append(str1);
    stringBuilder.append("(");
    stringBuilder.append(this.b0);
    stringBuilder.append(", ");
    stringBuilder.append(this.c0);
    stringBuilder.append(") - (");
    stringBuilder.append(this.X);
    stringBuilder.append(" x ");
    stringBuilder.append(this.Y);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public String u() {
    return this.p0;
  }
  
  public void u0(int paramInt) {
    this.K.t(paramInt);
    this.b0 = paramInt;
  }
  
  public DimensionBehaviour v(int paramInt) {
    return (paramInt == 0) ? B() : ((paramInt == 1) ? R() : null);
  }
  
  public void v0(int paramInt) {
    this.L.t(paramInt);
    this.c0 = paramInt;
  }
  
  public float w() {
    return this.Z;
  }
  
  public void w0(int paramInt1, int paramInt2) {
    this.L.t(paramInt1);
    this.N.t(paramInt2);
    this.c0 = paramInt1;
    this.Y = paramInt2 - paramInt1;
    if (this.F)
      this.O.t(paramInt1 + this.h0); 
    this.n = true;
  }
  
  public int x() {
    return this.a0;
  }
  
  public void x0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt3 - paramInt1;
    paramInt3 = paramInt4 - paramInt2;
    this.b0 = paramInt1;
    this.c0 = paramInt2;
    if (this.o0 == 8) {
      this.X = 0;
      this.Y = 0;
      return;
    } 
    DimensionBehaviour[] arrayOfDimensionBehaviour = this.V;
    DimensionBehaviour dimensionBehaviour1 = arrayOfDimensionBehaviour[0];
    DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.b;
    paramInt1 = i;
    if (dimensionBehaviour1 == dimensionBehaviour2) {
      paramInt2 = this.X;
      paramInt1 = i;
      if (i < paramInt2)
        paramInt1 = paramInt2; 
    } 
    paramInt2 = paramInt3;
    if (arrayOfDimensionBehaviour[1] == dimensionBehaviour2) {
      paramInt4 = this.Y;
      paramInt2 = paramInt3;
      if (paramInt3 < paramInt4)
        paramInt2 = paramInt4; 
    } 
    this.X = paramInt1;
    this.Y = paramInt2;
    paramInt3 = this.j0;
    if (paramInt2 < paramInt3)
      this.Y = paramInt3; 
    paramInt2 = this.i0;
    if (paramInt1 < paramInt2)
      this.X = paramInt2; 
  }
  
  public int y() {
    return (this.o0 == 8) ? 0 : this.Y;
  }
  
  public void y0(boolean paramBoolean) {
    this.F = paramBoolean;
  }
  
  public float z() {
    return this.k0;
  }
  
  public void z0(int paramInt) {
    this.Y = paramInt;
    int i = this.j0;
    if (paramInt < i)
      this.Y = i; 
  }
  
  public enum DimensionBehaviour {
    b, c, d, e;
    
    static {
      DimensionBehaviour dimensionBehaviour1 = new DimensionBehaviour("FIXED", 0);
      b = dimensionBehaviour1;
      DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
      c = dimensionBehaviour2;
      DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
      d = dimensionBehaviour3;
      DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
      e = dimensionBehaviour4;
      f = new DimensionBehaviour[] { dimensionBehaviour1, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/ConstraintWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */