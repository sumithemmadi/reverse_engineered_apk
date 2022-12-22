package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.a;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.f;
import java.util.ArrayList;

public class g {
  private static b.a a = new b.a();
  
  private static boolean a(ConstraintWidget paramConstraintWidget) {
    ConstraintWidget constraintWidget;
    boolean bool2;
    boolean bool3;
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = paramConstraintWidget.B();
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = paramConstraintWidget.R();
    if (paramConstraintWidget.L() != null) {
      constraintWidget = paramConstraintWidget.L();
    } else {
      constraintWidget = null;
    } 
    if (constraintWidget != null) {
      constraintWidget.B();
      ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.b;
    } 
    if (constraintWidget != null) {
      constraintWidget.R();
      ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.b;
    } 
    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.b;
    boolean bool1 = false;
    if (dimensionBehaviour1 == dimensionBehaviour3 || dimensionBehaviour1 == ConstraintWidget.DimensionBehaviour.c || (dimensionBehaviour1 == ConstraintWidget.DimensionBehaviour.d && paramConstraintWidget.q == 0 && paramConstraintWidget.Z == 0.0F && paramConstraintWidget.Y(0)) || paramConstraintWidget.h0()) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.c || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.d && paramConstraintWidget.r == 0 && paramConstraintWidget.Z == 0.0F && paramConstraintWidget.Y(1)) || paramConstraintWidget.i0()) {
      bool3 = true;
    } else {
      bool3 = false;
    } 
    if (paramConstraintWidget.Z > 0.0F && (bool2 || bool3))
      return true; 
    boolean bool4 = bool1;
    if (bool2) {
      bool4 = bool1;
      if (bool3)
        bool4 = true; 
    } 
    return bool4;
  }
  
  private static void b(ConstraintWidget paramConstraintWidget, b.b paramb, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof androidx/constraintlayout/solver/widgets/d
    //   4: ifne -> 37
    //   7: aload_0
    //   8: invokevirtual g0 : ()Z
    //   11: ifeq -> 37
    //   14: aload_0
    //   15: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)Z
    //   18: ifeq -> 37
    //   21: aload_0
    //   22: aload_1
    //   23: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   33: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   36: pop
    //   37: aload_0
    //   38: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   41: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   44: astore_3
    //   45: aload_0
    //   46: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   49: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   52: astore #4
    //   54: aload_3
    //   55: invokevirtual e : ()I
    //   58: istore #5
    //   60: aload #4
    //   62: invokevirtual e : ()I
    //   65: istore #6
    //   67: aload_3
    //   68: invokevirtual d : ()Ljava/util/HashSet;
    //   71: ifnull -> 494
    //   74: aload_3
    //   75: invokevirtual n : ()Z
    //   78: ifeq -> 494
    //   81: aload_3
    //   82: invokevirtual d : ()Ljava/util/HashSet;
    //   85: invokevirtual iterator : ()Ljava/util/Iterator;
    //   88: astore #7
    //   90: aload #7
    //   92: invokeinterface hasNext : ()Z
    //   97: ifeq -> 494
    //   100: aload #7
    //   102: invokeinterface next : ()Ljava/lang/Object;
    //   107: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   110: astore #8
    //   112: aload #8
    //   114: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   117: astore_3
    //   118: aload_3
    //   119: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)Z
    //   122: istore #9
    //   124: aload_3
    //   125: invokevirtual g0 : ()Z
    //   128: ifeq -> 152
    //   131: iload #9
    //   133: ifeq -> 152
    //   136: aload_3
    //   137: aload_1
    //   138: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   141: dup
    //   142: invokespecial <init> : ()V
    //   145: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   148: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   151: pop
    //   152: aload_3
    //   153: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   156: astore #10
    //   158: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   161: astore #11
    //   163: aload #10
    //   165: aload #11
    //   167: if_acmpne -> 333
    //   170: iload #9
    //   172: ifeq -> 178
    //   175: goto -> 333
    //   178: aload_3
    //   179: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   182: aload #11
    //   184: if_acmpne -> 90
    //   187: aload_3
    //   188: getfield u : I
    //   191: iflt -> 90
    //   194: aload_3
    //   195: getfield t : I
    //   198: iflt -> 90
    //   201: aload_3
    //   202: invokevirtual T : ()I
    //   205: bipush #8
    //   207: if_icmpeq -> 226
    //   210: aload_3
    //   211: getfield q : I
    //   214: ifne -> 90
    //   217: aload_3
    //   218: invokevirtual w : ()F
    //   221: fconst_0
    //   222: fcmpl
    //   223: ifne -> 90
    //   226: aload_3
    //   227: invokevirtual c0 : ()Z
    //   230: ifne -> 90
    //   233: aload_3
    //   234: invokevirtual f0 : ()Z
    //   237: ifne -> 90
    //   240: aload #8
    //   242: aload_3
    //   243: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   246: if_acmpne -> 271
    //   249: aload_3
    //   250: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   253: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   256: astore #11
    //   258: aload #11
    //   260: ifnull -> 271
    //   263: aload #11
    //   265: invokevirtual n : ()Z
    //   268: ifne -> 302
    //   271: aload #8
    //   273: aload_3
    //   274: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   277: if_acmpne -> 308
    //   280: aload_3
    //   281: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   284: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   287: astore #8
    //   289: aload #8
    //   291: ifnull -> 308
    //   294: aload #8
    //   296: invokevirtual n : ()Z
    //   299: ifeq -> 308
    //   302: iconst_1
    //   303: istore #12
    //   305: goto -> 311
    //   308: iconst_0
    //   309: istore #12
    //   311: iload #12
    //   313: ifeq -> 90
    //   316: aload_3
    //   317: invokevirtual c0 : ()Z
    //   320: ifne -> 90
    //   323: aload_0
    //   324: aload_1
    //   325: aload_3
    //   326: iload_2
    //   327: invokestatic e : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)V
    //   330: goto -> 90
    //   333: aload_3
    //   334: invokevirtual g0 : ()Z
    //   337: ifeq -> 343
    //   340: goto -> 90
    //   343: aload_3
    //   344: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   347: astore #11
    //   349: aload #8
    //   351: aload #11
    //   353: if_acmpne -> 398
    //   356: aload_3
    //   357: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   360: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   363: ifnonnull -> 398
    //   366: aload #11
    //   368: invokevirtual f : ()I
    //   371: iload #5
    //   373: iadd
    //   374: istore #12
    //   376: aload_3
    //   377: iload #12
    //   379: aload_3
    //   380: invokevirtual U : ()I
    //   383: iload #12
    //   385: iadd
    //   386: invokevirtual t0 : (II)V
    //   389: aload_3
    //   390: aload_1
    //   391: iload_2
    //   392: invokestatic b : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Z)V
    //   395: goto -> 90
    //   398: aload_3
    //   399: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   402: astore #10
    //   404: aload #8
    //   406: aload #10
    //   408: if_acmpne -> 451
    //   411: aload #11
    //   413: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   416: ifnonnull -> 451
    //   419: iload #5
    //   421: aload #10
    //   423: invokevirtual f : ()I
    //   426: isub
    //   427: istore #12
    //   429: aload_3
    //   430: iload #12
    //   432: aload_3
    //   433: invokevirtual U : ()I
    //   436: isub
    //   437: iload #12
    //   439: invokevirtual t0 : (II)V
    //   442: aload_3
    //   443: aload_1
    //   444: iload_2
    //   445: invokestatic b : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Z)V
    //   448: goto -> 90
    //   451: aload #8
    //   453: aload #11
    //   455: if_acmpne -> 90
    //   458: aload #10
    //   460: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   463: astore #8
    //   465: aload #8
    //   467: ifnull -> 90
    //   470: aload #8
    //   472: invokevirtual n : ()Z
    //   475: ifeq -> 90
    //   478: aload_3
    //   479: invokevirtual c0 : ()Z
    //   482: ifne -> 90
    //   485: aload_1
    //   486: aload_3
    //   487: iload_2
    //   488: invokestatic d : (Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)V
    //   491: goto -> 90
    //   494: aload_0
    //   495: instanceof androidx/constraintlayout/solver/widgets/f
    //   498: ifeq -> 502
    //   501: return
    //   502: aload #4
    //   504: invokevirtual d : ()Ljava/util/HashSet;
    //   507: ifnull -> 910
    //   510: aload #4
    //   512: invokevirtual n : ()Z
    //   515: ifeq -> 910
    //   518: aload #4
    //   520: invokevirtual d : ()Ljava/util/HashSet;
    //   523: invokevirtual iterator : ()Ljava/util/Iterator;
    //   526: astore #7
    //   528: aload #7
    //   530: invokeinterface hasNext : ()Z
    //   535: ifeq -> 910
    //   538: aload #7
    //   540: invokeinterface next : ()Ljava/lang/Object;
    //   545: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   548: astore #4
    //   550: aload #4
    //   552: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   555: astore_3
    //   556: aload_3
    //   557: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)Z
    //   560: istore #9
    //   562: aload_3
    //   563: invokevirtual g0 : ()Z
    //   566: ifeq -> 590
    //   569: iload #9
    //   571: ifeq -> 590
    //   574: aload_3
    //   575: aload_1
    //   576: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   579: dup
    //   580: invokespecial <init> : ()V
    //   583: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   586: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   589: pop
    //   590: aload #4
    //   592: aload_3
    //   593: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   596: if_acmpne -> 621
    //   599: aload_3
    //   600: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   603: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   606: astore #8
    //   608: aload #8
    //   610: ifnull -> 621
    //   613: aload #8
    //   615: invokevirtual n : ()Z
    //   618: ifne -> 652
    //   621: aload #4
    //   623: aload_3
    //   624: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   627: if_acmpne -> 658
    //   630: aload_3
    //   631: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   634: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   637: astore #8
    //   639: aload #8
    //   641: ifnull -> 658
    //   644: aload #8
    //   646: invokevirtual n : ()Z
    //   649: ifeq -> 658
    //   652: iconst_1
    //   653: istore #12
    //   655: goto -> 661
    //   658: iconst_0
    //   659: istore #12
    //   661: aload_3
    //   662: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   665: astore #11
    //   667: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   670: astore #8
    //   672: aload #11
    //   674: aload #8
    //   676: if_acmpne -> 771
    //   679: iload #9
    //   681: ifeq -> 687
    //   684: goto -> 771
    //   687: aload_3
    //   688: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   691: aload #8
    //   693: if_acmpne -> 528
    //   696: aload_3
    //   697: getfield u : I
    //   700: iflt -> 528
    //   703: aload_3
    //   704: getfield t : I
    //   707: iflt -> 528
    //   710: aload_3
    //   711: invokevirtual T : ()I
    //   714: bipush #8
    //   716: if_icmpeq -> 735
    //   719: aload_3
    //   720: getfield q : I
    //   723: ifne -> 528
    //   726: aload_3
    //   727: invokevirtual w : ()F
    //   730: fconst_0
    //   731: fcmpl
    //   732: ifne -> 528
    //   735: aload_3
    //   736: invokevirtual c0 : ()Z
    //   739: ifne -> 528
    //   742: aload_3
    //   743: invokevirtual f0 : ()Z
    //   746: ifne -> 528
    //   749: iload #12
    //   751: ifeq -> 528
    //   754: aload_3
    //   755: invokevirtual c0 : ()Z
    //   758: ifne -> 528
    //   761: aload_0
    //   762: aload_1
    //   763: aload_3
    //   764: iload_2
    //   765: invokestatic e : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)V
    //   768: goto -> 528
    //   771: aload_3
    //   772: invokevirtual g0 : ()Z
    //   775: ifeq -> 781
    //   778: goto -> 528
    //   781: aload_3
    //   782: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   785: astore #8
    //   787: aload #4
    //   789: aload #8
    //   791: if_acmpne -> 836
    //   794: aload_3
    //   795: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   798: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   801: ifnonnull -> 836
    //   804: aload #8
    //   806: invokevirtual f : ()I
    //   809: iload #6
    //   811: iadd
    //   812: istore #12
    //   814: aload_3
    //   815: iload #12
    //   817: aload_3
    //   818: invokevirtual U : ()I
    //   821: iload #12
    //   823: iadd
    //   824: invokevirtual t0 : (II)V
    //   827: aload_3
    //   828: aload_1
    //   829: iload_2
    //   830: invokestatic b : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Z)V
    //   833: goto -> 528
    //   836: aload_3
    //   837: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   840: astore #11
    //   842: aload #4
    //   844: aload #11
    //   846: if_acmpne -> 889
    //   849: aload #8
    //   851: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   854: ifnonnull -> 889
    //   857: iload #6
    //   859: aload #11
    //   861: invokevirtual f : ()I
    //   864: isub
    //   865: istore #12
    //   867: aload_3
    //   868: iload #12
    //   870: aload_3
    //   871: invokevirtual U : ()I
    //   874: isub
    //   875: iload #12
    //   877: invokevirtual t0 : (II)V
    //   880: aload_3
    //   881: aload_1
    //   882: iload_2
    //   883: invokestatic b : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Z)V
    //   886: goto -> 528
    //   889: iload #12
    //   891: ifeq -> 528
    //   894: aload_3
    //   895: invokevirtual c0 : ()Z
    //   898: ifne -> 528
    //   901: aload_1
    //   902: aload_3
    //   903: iload_2
    //   904: invokestatic d : (Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Z)V
    //   907: goto -> 528
    //   910: return
  }
  
  private static void c(a parama, b.b paramb, int paramInt, boolean paramBoolean) {
    if (parama.g1())
      if (paramInt == 0) {
        b((ConstraintWidget)parama, paramb, paramBoolean);
      } else {
        i((ConstraintWidget)parama, paramb);
      }  
  }
  
  private static void d(b.b paramb, ConstraintWidget paramConstraintWidget, boolean paramBoolean) {
    float f = paramConstraintWidget.z();
    int i = paramConstraintWidget.K.f.e();
    int j = paramConstraintWidget.M.f.e();
    int k = paramConstraintWidget.K.f();
    int m = paramConstraintWidget.M.f();
    if (i == j) {
      f = 0.5F;
    } else {
      i = k + i;
      j -= m;
    } 
    k = paramConstraintWidget.U();
    m = j - i - k;
    if (i > j)
      m = i - j - k; 
    int n = (int)(f * m + 0.5F) + i;
    m = n + k;
    if (i > j)
      m = n - k; 
    paramConstraintWidget.t0(n, m);
    b(paramConstraintWidget, paramb, paramBoolean);
  }
  
  private static void e(ConstraintWidget paramConstraintWidget1, b.b paramb, ConstraintWidget paramConstraintWidget2, boolean paramBoolean) {
    float f = paramConstraintWidget2.z();
    int i = paramConstraintWidget2.K.f.e() + paramConstraintWidget2.K.f();
    int j = paramConstraintWidget2.M.f.e() - paramConstraintWidget2.M.f();
    if (j >= i) {
      int k = paramConstraintWidget2.U();
      int m = k;
      if (paramConstraintWidget2.T() != 8) {
        int n = paramConstraintWidget2.q;
        if (n == 2) {
          if (paramConstraintWidget1 instanceof d) {
            m = paramConstraintWidget1.U();
          } else {
            m = paramConstraintWidget1.L().U();
          } 
          m = (int)(paramConstraintWidget2.z() * 0.5F * m);
        } else {
          m = k;
          if (n == 0)
            m = j - i; 
        } 
        k = Math.max(paramConstraintWidget2.t, m);
        n = paramConstraintWidget2.u;
        m = k;
        if (n > 0)
          m = Math.min(n, k); 
      } 
      k = i + (int)(f * (j - i - m) + 0.5F);
      paramConstraintWidget2.t0(k, m + k);
      b(paramConstraintWidget2, paramb, paramBoolean);
    } 
  }
  
  private static void f(b.b paramb, ConstraintWidget paramConstraintWidget) {
    float f = paramConstraintWidget.P();
    int i = paramConstraintWidget.L.f.e();
    int j = paramConstraintWidget.N.f.e();
    int k = paramConstraintWidget.L.f();
    int m = paramConstraintWidget.N.f();
    if (i == j) {
      f = 0.5F;
    } else {
      i = k + i;
      j -= m;
    } 
    int n = paramConstraintWidget.y();
    m = j - i - n;
    if (i > j)
      m = i - j - n; 
    int i1 = (int)(f * m + 0.5F);
    m = i + i1;
    k = m + n;
    if (i > j) {
      m = i - i1;
      k = m - n;
    } 
    paramConstraintWidget.w0(m, k);
    i(paramConstraintWidget, paramb);
  }
  
  private static void g(ConstraintWidget paramConstraintWidget1, b.b paramb, ConstraintWidget paramConstraintWidget2) {
    float f = paramConstraintWidget2.P();
    int i = paramConstraintWidget2.L.f.e() + paramConstraintWidget2.L.f();
    int j = paramConstraintWidget2.N.f.e() - paramConstraintWidget2.N.f();
    if (j >= i) {
      int k = paramConstraintWidget2.y();
      int m = k;
      if (paramConstraintWidget2.T() != 8) {
        int n = paramConstraintWidget2.r;
        if (n == 2) {
          if (paramConstraintWidget1 instanceof d) {
            m = paramConstraintWidget1.y();
          } else {
            m = paramConstraintWidget1.L().y();
          } 
          m = (int)(f * 0.5F * m);
        } else {
          m = k;
          if (n == 0)
            m = j - i; 
        } 
        k = Math.max(paramConstraintWidget2.w, m);
        n = paramConstraintWidget2.x;
        m = k;
        if (n > 0)
          m = Math.min(n, k); 
      } 
      k = i + (int)(f * (j - i - m) + 0.5F);
      paramConstraintWidget2.w0(k, m + k);
      i(paramConstraintWidget2, paramb);
    } 
  }
  
  public static void h(d paramd, b.b paramb) {
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = paramd.B();
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = paramd.R();
    paramd.m0();
    ArrayList<ConstraintWidget> arrayList = paramd.e1();
    int i = arrayList.size();
    boolean bool1 = false;
    byte b1;
    for (b1 = 0; b1 < i; b1++)
      ((ConstraintWidget)arrayList.get(b1)).m0(); 
    boolean bool = paramd.C1();
    if (dimensionBehaviour1 == ConstraintWidget.DimensionBehaviour.b) {
      paramd.t0(0, paramd.U());
    } else {
      paramd.u0(0);
    } 
    byte b2 = 0;
    boolean bool2 = false;
    for (b1 = 0; b2 < i; b1 = b3) {
      f f;
      boolean bool3;
      byte b3;
      ConstraintWidget constraintWidget = arrayList.get(b2);
      if (constraintWidget instanceof f) {
        f = (f)constraintWidget;
        bool3 = bool2;
        b3 = b1;
        if (f.f1() == 1) {
          if (f.g1() != -1) {
            f.j1(f.g1());
          } else if (f.h1() != -1 && paramd.h0()) {
            f.j1(paramd.U() - f.h1());
          } else if (paramd.h0()) {
            f.j1((int)(f.i1() * paramd.U() + 0.5F));
          } 
          bool3 = true;
          b3 = b1;
        } 
      } else {
        bool3 = bool2;
        b3 = b1;
        if (f instanceof a) {
          bool3 = bool2;
          b3 = b1;
          if (((a)f).k1() == 0) {
            b3 = 1;
            bool3 = bool2;
          } 
        } 
      } 
      b2++;
      bool2 = bool3;
    } 
    if (bool2)
      for (b2 = 0; b2 < i; b2++) {
        ConstraintWidget constraintWidget = arrayList.get(b2);
        if (constraintWidget instanceof f) {
          f f = (f)constraintWidget;
          if (f.f1() == 1)
            b((ConstraintWidget)f, paramb, bool); 
        } 
      }  
    b((ConstraintWidget)paramd, paramb, bool);
    if (b1 != 0)
      for (b1 = 0; b1 < i; b1++) {
        ConstraintWidget constraintWidget = arrayList.get(b1);
        if (constraintWidget instanceof a) {
          a a1 = (a)constraintWidget;
          if (a1.k1() == 0)
            c(a1, paramb, 0, bool); 
        } 
      }  
    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.b) {
      paramd.w0(0, paramd.y());
    } else {
      paramd.v0(0);
    } 
    b2 = 0;
    bool2 = false;
    for (b1 = 0; b2 < i; b1 = b3) {
      f f;
      byte b3;
      boolean bool3;
      ConstraintWidget constraintWidget = arrayList.get(b2);
      if (constraintWidget instanceof f) {
        f = (f)constraintWidget;
        bool3 = bool2;
        b3 = b1;
        if (f.f1() == 0) {
          if (f.g1() != -1) {
            f.j1(f.g1());
          } else if (f.h1() != -1 && paramd.i0()) {
            f.j1(paramd.y() - f.h1());
          } else if (paramd.i0()) {
            f.j1((int)(f.i1() * paramd.y() + 0.5F));
          } 
          bool3 = true;
          b3 = b1;
        } 
      } else {
        bool3 = bool2;
        b3 = b1;
        if (f instanceof a) {
          bool3 = bool2;
          b3 = b1;
          if (((a)f).k1() == 1) {
            b3 = 1;
            bool3 = bool2;
          } 
        } 
      } 
      b2++;
      bool2 = bool3;
    } 
    if (bool2)
      for (b2 = 0; b2 < i; b2++) {
        ConstraintWidget constraintWidget = arrayList.get(b2);
        if (constraintWidget instanceof f) {
          f f = (f)constraintWidget;
          if (f.f1() == 0)
            i((ConstraintWidget)f, paramb); 
        } 
      }  
    i((ConstraintWidget)paramd, paramb);
    b2 = bool1;
    if (b1 != 0) {
      b1 = 0;
      while (true) {
        b2 = bool1;
        if (b1 < i) {
          ConstraintWidget constraintWidget = arrayList.get(b1);
          if (constraintWidget instanceof a) {
            a a1 = (a)constraintWidget;
            if (a1.k1() == 1)
              c(a1, paramb, 1, bool); 
          } 
          b1++;
          continue;
        } 
        break;
      } 
    } 
    while (b2 < i) {
      ConstraintWidget constraintWidget = arrayList.get(b2);
      if (constraintWidget.g0() && a(constraintWidget)) {
        d.F1(constraintWidget, paramb, a, b.a.a);
        b(constraintWidget, paramb, bool);
        i(constraintWidget, paramb);
      } 
      b2++;
    } 
  }
  
  private static void i(ConstraintWidget paramConstraintWidget, b.b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof androidx/constraintlayout/solver/widgets/d
    //   4: ifne -> 37
    //   7: aload_0
    //   8: invokevirtual g0 : ()Z
    //   11: ifeq -> 37
    //   14: aload_0
    //   15: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)Z
    //   18: ifeq -> 37
    //   21: aload_0
    //   22: aload_1
    //   23: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   26: dup
    //   27: invokespecial <init> : ()V
    //   30: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   33: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   36: pop
    //   37: aload_0
    //   38: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   41: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   44: astore_2
    //   45: aload_0
    //   46: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   49: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   52: astore_3
    //   53: aload_2
    //   54: invokevirtual e : ()I
    //   57: istore #4
    //   59: aload_3
    //   60: invokevirtual e : ()I
    //   63: istore #5
    //   65: aload_2
    //   66: invokevirtual d : ()Ljava/util/HashSet;
    //   69: ifnull -> 481
    //   72: aload_2
    //   73: invokevirtual n : ()Z
    //   76: ifeq -> 481
    //   79: aload_2
    //   80: invokevirtual d : ()Ljava/util/HashSet;
    //   83: invokevirtual iterator : ()Ljava/util/Iterator;
    //   86: astore #6
    //   88: aload #6
    //   90: invokeinterface hasNext : ()Z
    //   95: ifeq -> 481
    //   98: aload #6
    //   100: invokeinterface next : ()Ljava/lang/Object;
    //   105: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   108: astore #7
    //   110: aload #7
    //   112: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   115: astore_2
    //   116: aload_2
    //   117: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)Z
    //   120: istore #8
    //   122: aload_2
    //   123: invokevirtual g0 : ()Z
    //   126: ifeq -> 150
    //   129: iload #8
    //   131: ifeq -> 150
    //   134: aload_2
    //   135: aload_1
    //   136: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   139: dup
    //   140: invokespecial <init> : ()V
    //   143: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   146: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   149: pop
    //   150: aload_2
    //   151: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   154: astore #9
    //   156: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   159: astore #10
    //   161: aload #9
    //   163: aload #10
    //   165: if_acmpne -> 330
    //   168: iload #8
    //   170: ifeq -> 176
    //   173: goto -> 330
    //   176: aload_2
    //   177: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   180: aload #10
    //   182: if_acmpne -> 88
    //   185: aload_2
    //   186: getfield x : I
    //   189: iflt -> 88
    //   192: aload_2
    //   193: getfield w : I
    //   196: iflt -> 88
    //   199: aload_2
    //   200: invokevirtual T : ()I
    //   203: bipush #8
    //   205: if_icmpeq -> 224
    //   208: aload_2
    //   209: getfield r : I
    //   212: ifne -> 88
    //   215: aload_2
    //   216: invokevirtual w : ()F
    //   219: fconst_0
    //   220: fcmpl
    //   221: ifne -> 88
    //   224: aload_2
    //   225: invokevirtual e0 : ()Z
    //   228: ifne -> 88
    //   231: aload_2
    //   232: invokevirtual f0 : ()Z
    //   235: ifne -> 88
    //   238: aload #7
    //   240: aload_2
    //   241: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   244: if_acmpne -> 269
    //   247: aload_2
    //   248: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   251: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   254: astore #9
    //   256: aload #9
    //   258: ifnull -> 269
    //   261: aload #9
    //   263: invokevirtual n : ()Z
    //   266: ifne -> 300
    //   269: aload #7
    //   271: aload_2
    //   272: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   275: if_acmpne -> 306
    //   278: aload_2
    //   279: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   282: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   285: astore #7
    //   287: aload #7
    //   289: ifnull -> 306
    //   292: aload #7
    //   294: invokevirtual n : ()Z
    //   297: ifeq -> 306
    //   300: iconst_1
    //   301: istore #11
    //   303: goto -> 309
    //   306: iconst_0
    //   307: istore #11
    //   309: iload #11
    //   311: ifeq -> 88
    //   314: aload_2
    //   315: invokevirtual e0 : ()Z
    //   318: ifne -> 88
    //   321: aload_0
    //   322: aload_1
    //   323: aload_2
    //   324: invokestatic g : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)V
    //   327: goto -> 88
    //   330: aload_2
    //   331: invokevirtual g0 : ()Z
    //   334: ifeq -> 340
    //   337: goto -> 88
    //   340: aload_2
    //   341: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   344: astore #10
    //   346: aload #7
    //   348: aload #10
    //   350: if_acmpne -> 394
    //   353: aload_2
    //   354: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   357: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   360: ifnonnull -> 394
    //   363: aload #10
    //   365: invokevirtual f : ()I
    //   368: iload #4
    //   370: iadd
    //   371: istore #11
    //   373: aload_2
    //   374: iload #11
    //   376: aload_2
    //   377: invokevirtual y : ()I
    //   380: iload #11
    //   382: iadd
    //   383: invokevirtual w0 : (II)V
    //   386: aload_2
    //   387: aload_1
    //   388: invokestatic i : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;)V
    //   391: goto -> 88
    //   394: aload_2
    //   395: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   398: astore #9
    //   400: aload #7
    //   402: aload #9
    //   404: if_acmpne -> 446
    //   407: aload #9
    //   409: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   412: ifnonnull -> 446
    //   415: iload #4
    //   417: aload #9
    //   419: invokevirtual f : ()I
    //   422: isub
    //   423: istore #11
    //   425: aload_2
    //   426: iload #11
    //   428: aload_2
    //   429: invokevirtual y : ()I
    //   432: isub
    //   433: iload #11
    //   435: invokevirtual w0 : (II)V
    //   438: aload_2
    //   439: aload_1
    //   440: invokestatic i : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;)V
    //   443: goto -> 88
    //   446: aload #7
    //   448: aload #10
    //   450: if_acmpne -> 88
    //   453: aload #9
    //   455: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   458: astore #7
    //   460: aload #7
    //   462: ifnull -> 88
    //   465: aload #7
    //   467: invokevirtual n : ()Z
    //   470: ifeq -> 88
    //   473: aload_1
    //   474: aload_2
    //   475: invokestatic f : (Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)V
    //   478: goto -> 88
    //   481: aload_0
    //   482: instanceof androidx/constraintlayout/solver/widgets/f
    //   485: ifeq -> 489
    //   488: return
    //   489: aload_3
    //   490: invokevirtual d : ()Ljava/util/HashSet;
    //   493: ifnull -> 912
    //   496: aload_3
    //   497: invokevirtual n : ()Z
    //   500: ifeq -> 912
    //   503: aload_3
    //   504: invokevirtual d : ()Ljava/util/HashSet;
    //   507: invokevirtual iterator : ()Ljava/util/Iterator;
    //   510: astore_2
    //   511: aload_2
    //   512: invokeinterface hasNext : ()Z
    //   517: ifeq -> 912
    //   520: aload_2
    //   521: invokeinterface next : ()Ljava/lang/Object;
    //   526: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   529: astore_3
    //   530: aload_3
    //   531: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   534: astore #6
    //   536: aload #6
    //   538: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)Z
    //   541: istore #8
    //   543: aload #6
    //   545: invokevirtual g0 : ()Z
    //   548: ifeq -> 573
    //   551: iload #8
    //   553: ifeq -> 573
    //   556: aload #6
    //   558: aload_1
    //   559: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   562: dup
    //   563: invokespecial <init> : ()V
    //   566: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   569: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   572: pop
    //   573: aload_3
    //   574: aload #6
    //   576: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   579: if_acmpne -> 605
    //   582: aload #6
    //   584: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   587: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   590: astore #7
    //   592: aload #7
    //   594: ifnull -> 605
    //   597: aload #7
    //   599: invokevirtual n : ()Z
    //   602: ifne -> 637
    //   605: aload_3
    //   606: aload #6
    //   608: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   611: if_acmpne -> 643
    //   614: aload #6
    //   616: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   619: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   622: astore #7
    //   624: aload #7
    //   626: ifnull -> 643
    //   629: aload #7
    //   631: invokevirtual n : ()Z
    //   634: ifeq -> 643
    //   637: iconst_1
    //   638: istore #11
    //   640: goto -> 646
    //   643: iconst_0
    //   644: istore #11
    //   646: aload #6
    //   648: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   651: astore #7
    //   653: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   656: astore #9
    //   658: aload #7
    //   660: aload #9
    //   662: if_acmpne -> 766
    //   665: iload #8
    //   667: ifeq -> 673
    //   670: goto -> 766
    //   673: aload #6
    //   675: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   678: aload #9
    //   680: if_acmpne -> 511
    //   683: aload #6
    //   685: getfield x : I
    //   688: iflt -> 511
    //   691: aload #6
    //   693: getfield w : I
    //   696: iflt -> 511
    //   699: aload #6
    //   701: invokevirtual T : ()I
    //   704: bipush #8
    //   706: if_icmpeq -> 727
    //   709: aload #6
    //   711: getfield r : I
    //   714: ifne -> 511
    //   717: aload #6
    //   719: invokevirtual w : ()F
    //   722: fconst_0
    //   723: fcmpl
    //   724: ifne -> 511
    //   727: aload #6
    //   729: invokevirtual e0 : ()Z
    //   732: ifne -> 511
    //   735: aload #6
    //   737: invokevirtual f0 : ()Z
    //   740: ifne -> 511
    //   743: iload #11
    //   745: ifeq -> 511
    //   748: aload #6
    //   750: invokevirtual e0 : ()Z
    //   753: ifne -> 511
    //   756: aload_0
    //   757: aload_1
    //   758: aload #6
    //   760: invokestatic g : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)V
    //   763: goto -> 511
    //   766: aload #6
    //   768: invokevirtual g0 : ()Z
    //   771: ifeq -> 777
    //   774: goto -> 511
    //   777: aload #6
    //   779: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   782: astore #7
    //   784: aload_3
    //   785: aload #7
    //   787: if_acmpne -> 835
    //   790: aload #6
    //   792: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   795: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   798: ifnonnull -> 835
    //   801: aload #7
    //   803: invokevirtual f : ()I
    //   806: iload #5
    //   808: iadd
    //   809: istore #11
    //   811: aload #6
    //   813: iload #11
    //   815: aload #6
    //   817: invokevirtual y : ()I
    //   820: iload #11
    //   822: iadd
    //   823: invokevirtual w0 : (II)V
    //   826: aload #6
    //   828: aload_1
    //   829: invokestatic i : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;)V
    //   832: goto -> 511
    //   835: aload #6
    //   837: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   840: astore #9
    //   842: aload_3
    //   843: aload #9
    //   845: if_acmpne -> 890
    //   848: aload #7
    //   850: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   853: ifnonnull -> 890
    //   856: iload #5
    //   858: aload #9
    //   860: invokevirtual f : ()I
    //   863: isub
    //   864: istore #11
    //   866: aload #6
    //   868: iload #11
    //   870: aload #6
    //   872: invokevirtual y : ()I
    //   875: isub
    //   876: iload #11
    //   878: invokevirtual w0 : (II)V
    //   881: aload #6
    //   883: aload_1
    //   884: invokestatic i : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;)V
    //   887: goto -> 511
    //   890: iload #11
    //   892: ifeq -> 511
    //   895: aload #6
    //   897: invokevirtual e0 : ()Z
    //   900: ifne -> 511
    //   903: aload_1
    //   904: aload #6
    //   906: invokestatic f : (Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)V
    //   909: goto -> 511
    //   912: aload_0
    //   913: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   916: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   919: astore_0
    //   920: aload_0
    //   921: invokevirtual d : ()Ljava/util/HashSet;
    //   924: ifnull -> 1053
    //   927: aload_0
    //   928: invokevirtual n : ()Z
    //   931: ifeq -> 1053
    //   934: aload_0
    //   935: invokevirtual e : ()I
    //   938: istore #11
    //   940: aload_0
    //   941: invokevirtual d : ()Ljava/util/HashSet;
    //   944: invokevirtual iterator : ()Ljava/util/Iterator;
    //   947: astore_2
    //   948: aload_2
    //   949: invokeinterface hasNext : ()Z
    //   954: ifeq -> 1053
    //   957: aload_2
    //   958: invokeinterface next : ()Ljava/lang/Object;
    //   963: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   966: astore_3
    //   967: aload_3
    //   968: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   971: astore_0
    //   972: aload_0
    //   973: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;)Z
    //   976: istore #8
    //   978: aload_0
    //   979: invokevirtual g0 : ()Z
    //   982: ifeq -> 1006
    //   985: iload #8
    //   987: ifeq -> 1006
    //   990: aload_0
    //   991: aload_1
    //   992: new androidx/constraintlayout/solver/widgets/analyzer/b$a
    //   995: dup
    //   996: invokespecial <init> : ()V
    //   999: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   1002: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   1005: pop
    //   1006: aload_0
    //   1007: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1010: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1013: if_acmpne -> 1021
    //   1016: iload #8
    //   1018: ifeq -> 948
    //   1021: aload_0
    //   1022: invokevirtual g0 : ()Z
    //   1025: ifeq -> 1031
    //   1028: goto -> 948
    //   1031: aload_3
    //   1032: aload_0
    //   1033: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1036: if_acmpne -> 948
    //   1039: aload_0
    //   1040: iload #11
    //   1042: invokevirtual s0 : (I)V
    //   1045: aload_0
    //   1046: aload_1
    //   1047: invokestatic i : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;)V
    //   1050: goto -> 948
    //   1053: return
    //   1054: astore_0
    //   1055: goto -> 1060
    //   1058: aload_0
    //   1059: athrow
    //   1060: goto -> 1058
    // Exception table:
    //   from	to	target	type
    //   1045	1050	1054	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */