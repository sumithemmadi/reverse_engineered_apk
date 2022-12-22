package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class e {
  private d a;
  
  private boolean b = true;
  
  private boolean c = true;
  
  private d d;
  
  private ArrayList<WidgetRun> e = new ArrayList<WidgetRun>();
  
  private ArrayList<l> f = new ArrayList<l>();
  
  private b.b g = null;
  
  private b.a h = new b.a();
  
  ArrayList<l> i = new ArrayList<l>();
  
  public e(d paramd) {
    this.a = paramd;
    this.d = paramd;
  }
  
  private void a(DependencyNode paramDependencyNode1, int paramInt1, int paramInt2, DependencyNode paramDependencyNode2, ArrayList<l> paramArrayList, l paraml) {
    WidgetRun widgetRun = paramDependencyNode1.d;
    if (widgetRun.c == null) {
      d d1 = this.a;
      if (widgetRun != ((ConstraintWidget)d1).f && widgetRun != ((ConstraintWidget)d1).g) {
        l l1 = paraml;
        if (paraml == null) {
          l1 = new l(widgetRun, paramInt2);
          paramArrayList.add(l1);
        } 
        widgetRun.c = l1;
        l1.a(widgetRun);
        for (d d2 : widgetRun.h.k) {
          if (d2 instanceof DependencyNode)
            a((DependencyNode)d2, paramInt1, 0, paramDependencyNode2, paramArrayList, l1); 
        } 
        for (d d2 : widgetRun.i.k) {
          if (d2 instanceof DependencyNode)
            a((DependencyNode)d2, paramInt1, 1, paramDependencyNode2, paramArrayList, l1); 
        } 
        if (paramInt1 == 1 && widgetRun instanceof m)
          for (d d2 : ((m)widgetRun).k.k) {
            if (d2 instanceof DependencyNode)
              a((DependencyNode)d2, paramInt1, 2, paramDependencyNode2, paramArrayList, l1); 
          }  
        for (DependencyNode dependencyNode : widgetRun.h.l) {
          if (dependencyNode == paramDependencyNode2)
            l1.c = true; 
          a(dependencyNode, paramInt1, 0, paramDependencyNode2, paramArrayList, l1);
        } 
        for (DependencyNode dependencyNode : widgetRun.i.l) {
          if (dependencyNode == paramDependencyNode2)
            l1.c = true; 
          a(dependencyNode, paramInt1, 1, paramDependencyNode2, paramArrayList, l1);
        } 
        if (paramInt1 == 1 && widgetRun instanceof m) {
          Iterator<DependencyNode> iterator = ((m)widgetRun).k.l.iterator();
          while (true) {
            if (iterator.hasNext()) {
              DependencyNode dependencyNode = iterator.next();
              try {
                a(dependencyNode, paramInt1, 2, paramDependencyNode2, paramArrayList, l1);
              } finally {}
              continue;
            } 
            return;
          } 
        } 
      } 
    } 
  }
  
  private boolean b(d paramd) {
    // Byte code:
    //   0: aload_1
    //   1: getfield N0 : Ljava/util/ArrayList;
    //   4: invokevirtual iterator : ()Ljava/util/Iterator;
    //   7: astore_2
    //   8: aload_2
    //   9: invokeinterface hasNext : ()Z
    //   14: ifeq -> 1508
    //   17: aload_2
    //   18: invokeinterface next : ()Ljava/lang/Object;
    //   23: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   26: astore_3
    //   27: aload_3
    //   28: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   31: astore #4
    //   33: aload #4
    //   35: iconst_0
    //   36: aaload
    //   37: astore #5
    //   39: aload #4
    //   41: iconst_1
    //   42: aaload
    //   43: astore #6
    //   45: aload_3
    //   46: invokevirtual T : ()I
    //   49: bipush #8
    //   51: if_icmpne -> 62
    //   54: aload_3
    //   55: iconst_1
    //   56: putfield b : Z
    //   59: goto -> 8
    //   62: aload_3
    //   63: getfield v : F
    //   66: fconst_1
    //   67: fcmpg
    //   68: ifge -> 84
    //   71: aload #5
    //   73: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   76: if_acmpne -> 84
    //   79: aload_3
    //   80: iconst_2
    //   81: putfield q : I
    //   84: aload_3
    //   85: getfield y : F
    //   88: fconst_1
    //   89: fcmpg
    //   90: ifge -> 106
    //   93: aload #6
    //   95: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   98: if_acmpne -> 106
    //   101: aload_3
    //   102: iconst_2
    //   103: putfield r : I
    //   106: aload_3
    //   107: invokevirtual w : ()F
    //   110: fconst_0
    //   111: fcmpl
    //   112: ifle -> 220
    //   115: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   118: astore #4
    //   120: aload #5
    //   122: aload #4
    //   124: if_acmpne -> 151
    //   127: aload #6
    //   129: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   132: if_acmpeq -> 143
    //   135: aload #6
    //   137: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   140: if_acmpne -> 151
    //   143: aload_3
    //   144: iconst_3
    //   145: putfield q : I
    //   148: goto -> 220
    //   151: aload #6
    //   153: aload #4
    //   155: if_acmpne -> 182
    //   158: aload #5
    //   160: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   163: if_acmpeq -> 174
    //   166: aload #5
    //   168: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   171: if_acmpne -> 182
    //   174: aload_3
    //   175: iconst_3
    //   176: putfield r : I
    //   179: goto -> 220
    //   182: aload #5
    //   184: aload #4
    //   186: if_acmpne -> 220
    //   189: aload #6
    //   191: aload #4
    //   193: if_acmpne -> 220
    //   196: aload_3
    //   197: getfield q : I
    //   200: ifne -> 208
    //   203: aload_3
    //   204: iconst_3
    //   205: putfield q : I
    //   208: aload_3
    //   209: getfield r : I
    //   212: ifne -> 220
    //   215: aload_3
    //   216: iconst_3
    //   217: putfield r : I
    //   220: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   223: astore #7
    //   225: aload #5
    //   227: astore #4
    //   229: aload #5
    //   231: aload #7
    //   233: if_acmpne -> 277
    //   236: aload #5
    //   238: astore #4
    //   240: aload_3
    //   241: getfield q : I
    //   244: iconst_1
    //   245: if_icmpne -> 277
    //   248: aload_3
    //   249: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   252: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   255: ifnull -> 272
    //   258: aload #5
    //   260: astore #4
    //   262: aload_3
    //   263: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   266: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   269: ifnonnull -> 277
    //   272: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   275: astore #4
    //   277: aload #6
    //   279: astore #5
    //   281: aload #6
    //   283: aload #7
    //   285: if_acmpne -> 329
    //   288: aload #6
    //   290: astore #5
    //   292: aload_3
    //   293: getfield r : I
    //   296: iconst_1
    //   297: if_icmpne -> 329
    //   300: aload_3
    //   301: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   304: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   307: ifnull -> 324
    //   310: aload #6
    //   312: astore #5
    //   314: aload_3
    //   315: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   318: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   321: ifnonnull -> 329
    //   324: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   327: astore #5
    //   329: aload_3
    //   330: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   333: astore #6
    //   335: aload #6
    //   337: aload #4
    //   339: putfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   342: aload_3
    //   343: getfield q : I
    //   346: istore #8
    //   348: aload #6
    //   350: iload #8
    //   352: putfield a : I
    //   355: aload_3
    //   356: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   359: astore #6
    //   361: aload #6
    //   363: aload #5
    //   365: putfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   368: aload_3
    //   369: getfield r : I
    //   372: istore #9
    //   374: aload #6
    //   376: iload #9
    //   378: putfield a : I
    //   381: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   384: astore #6
    //   386: aload #4
    //   388: aload #6
    //   390: if_acmpeq -> 409
    //   393: aload #4
    //   395: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   398: if_acmpeq -> 409
    //   401: aload #4
    //   403: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   406: if_acmpne -> 435
    //   409: aload #5
    //   411: aload #6
    //   413: if_acmpeq -> 1349
    //   416: aload #5
    //   418: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   421: if_acmpeq -> 1349
    //   424: aload #5
    //   426: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   429: if_acmpne -> 435
    //   432: goto -> 1349
    //   435: aload #4
    //   437: aload #7
    //   439: if_acmpne -> 769
    //   442: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   445: astore #10
    //   447: aload #5
    //   449: aload #10
    //   451: if_acmpeq -> 462
    //   454: aload #5
    //   456: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   459: if_acmpne -> 769
    //   462: iload #8
    //   464: iconst_3
    //   465: if_icmpne -> 560
    //   468: aload #5
    //   470: aload #10
    //   472: if_acmpne -> 486
    //   475: aload_0
    //   476: aload_3
    //   477: aload #10
    //   479: iconst_0
    //   480: aload #10
    //   482: iconst_0
    //   483: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   486: aload_3
    //   487: invokevirtual y : ()I
    //   490: istore #9
    //   492: iload #9
    //   494: i2f
    //   495: aload_3
    //   496: getfield Z : F
    //   499: fmul
    //   500: ldc 0.5
    //   502: fadd
    //   503: f2i
    //   504: istore #8
    //   506: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   509: astore #5
    //   511: aload_0
    //   512: aload_3
    //   513: aload #5
    //   515: iload #8
    //   517: aload #5
    //   519: iload #9
    //   521: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   524: aload_3
    //   525: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   528: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   531: aload_3
    //   532: invokevirtual U : ()I
    //   535: invokevirtual d : (I)V
    //   538: aload_3
    //   539: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   542: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   545: aload_3
    //   546: invokevirtual y : ()I
    //   549: invokevirtual d : (I)V
    //   552: aload_3
    //   553: iconst_1
    //   554: putfield b : Z
    //   557: goto -> 8
    //   560: iload #8
    //   562: iconst_1
    //   563: if_icmpne -> 594
    //   566: aload_0
    //   567: aload_3
    //   568: aload #10
    //   570: iconst_0
    //   571: aload #5
    //   573: iconst_0
    //   574: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   577: aload_3
    //   578: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   581: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   584: aload_3
    //   585: invokevirtual U : ()I
    //   588: putfield m : I
    //   591: goto -> 8
    //   594: iload #8
    //   596: iconst_2
    //   597: if_icmpne -> 696
    //   600: aload_1
    //   601: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   604: astore #10
    //   606: aload #10
    //   608: iconst_0
    //   609: aaload
    //   610: astore #11
    //   612: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   615: astore #12
    //   617: aload #11
    //   619: aload #12
    //   621: if_acmpeq -> 633
    //   624: aload #10
    //   626: iconst_0
    //   627: aaload
    //   628: aload #6
    //   630: if_acmpne -> 769
    //   633: aload_0
    //   634: aload_3
    //   635: aload #12
    //   637: aload_3
    //   638: getfield v : F
    //   641: aload_1
    //   642: invokevirtual U : ()I
    //   645: i2f
    //   646: fmul
    //   647: ldc 0.5
    //   649: fadd
    //   650: f2i
    //   651: aload #5
    //   653: aload_3
    //   654: invokevirtual y : ()I
    //   657: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   660: aload_3
    //   661: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   664: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   667: aload_3
    //   668: invokevirtual U : ()I
    //   671: invokevirtual d : (I)V
    //   674: aload_3
    //   675: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   678: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   681: aload_3
    //   682: invokevirtual y : ()I
    //   685: invokevirtual d : (I)V
    //   688: aload_3
    //   689: iconst_1
    //   690: putfield b : Z
    //   693: goto -> 8
    //   696: aload_3
    //   697: getfield S : [Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   700: astore #12
    //   702: aload #12
    //   704: iconst_0
    //   705: aaload
    //   706: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   709: ifnull -> 722
    //   712: aload #12
    //   714: iconst_1
    //   715: aaload
    //   716: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   719: ifnonnull -> 769
    //   722: aload_0
    //   723: aload_3
    //   724: aload #10
    //   726: iconst_0
    //   727: aload #5
    //   729: iconst_0
    //   730: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   733: aload_3
    //   734: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   737: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   740: aload_3
    //   741: invokevirtual U : ()I
    //   744: invokevirtual d : (I)V
    //   747: aload_3
    //   748: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   751: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   754: aload_3
    //   755: invokevirtual y : ()I
    //   758: invokevirtual d : (I)V
    //   761: aload_3
    //   762: iconst_1
    //   763: putfield b : Z
    //   766: goto -> 8
    //   769: aload #5
    //   771: aload #7
    //   773: if_acmpne -> 1129
    //   776: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   779: astore #10
    //   781: aload #4
    //   783: aload #10
    //   785: if_acmpeq -> 796
    //   788: aload #4
    //   790: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   793: if_acmpne -> 1129
    //   796: iload #9
    //   798: iconst_3
    //   799: if_icmpne -> 916
    //   802: aload #4
    //   804: aload #10
    //   806: if_acmpne -> 820
    //   809: aload_0
    //   810: aload_3
    //   811: aload #10
    //   813: iconst_0
    //   814: aload #10
    //   816: iconst_0
    //   817: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   820: aload_3
    //   821: invokevirtual U : ()I
    //   824: istore #9
    //   826: aload_3
    //   827: getfield Z : F
    //   830: fstore #13
    //   832: fload #13
    //   834: fstore #14
    //   836: aload_3
    //   837: invokevirtual x : ()I
    //   840: iconst_m1
    //   841: if_icmpne -> 850
    //   844: fconst_1
    //   845: fload #13
    //   847: fdiv
    //   848: fstore #14
    //   850: iload #9
    //   852: i2f
    //   853: fload #14
    //   855: fmul
    //   856: ldc 0.5
    //   858: fadd
    //   859: f2i
    //   860: istore #8
    //   862: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   865: astore #5
    //   867: aload_0
    //   868: aload_3
    //   869: aload #5
    //   871: iload #9
    //   873: aload #5
    //   875: iload #8
    //   877: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   880: aload_3
    //   881: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   884: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   887: aload_3
    //   888: invokevirtual U : ()I
    //   891: invokevirtual d : (I)V
    //   894: aload_3
    //   895: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   898: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   901: aload_3
    //   902: invokevirtual y : ()I
    //   905: invokevirtual d : (I)V
    //   908: aload_3
    //   909: iconst_1
    //   910: putfield b : Z
    //   913: goto -> 8
    //   916: iload #9
    //   918: iconst_1
    //   919: if_icmpne -> 950
    //   922: aload_0
    //   923: aload_3
    //   924: aload #4
    //   926: iconst_0
    //   927: aload #10
    //   929: iconst_0
    //   930: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   933: aload_3
    //   934: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   937: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   940: aload_3
    //   941: invokevirtual y : ()I
    //   944: putfield m : I
    //   947: goto -> 8
    //   950: iload #9
    //   952: iconst_2
    //   953: if_icmpne -> 1056
    //   956: aload_1
    //   957: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   960: astore #12
    //   962: aload #12
    //   964: iconst_1
    //   965: aaload
    //   966: astore #10
    //   968: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   971: astore #11
    //   973: aload #10
    //   975: aload #11
    //   977: if_acmpeq -> 989
    //   980: aload #12
    //   982: iconst_1
    //   983: aaload
    //   984: aload #6
    //   986: if_acmpne -> 1129
    //   989: aload_3
    //   990: getfield y : F
    //   993: fstore #14
    //   995: aload_0
    //   996: aload_3
    //   997: aload #4
    //   999: aload_3
    //   1000: invokevirtual U : ()I
    //   1003: aload #11
    //   1005: fload #14
    //   1007: aload_1
    //   1008: invokevirtual y : ()I
    //   1011: i2f
    //   1012: fmul
    //   1013: ldc 0.5
    //   1015: fadd
    //   1016: f2i
    //   1017: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   1020: aload_3
    //   1021: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   1024: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1027: aload_3
    //   1028: invokevirtual U : ()I
    //   1031: invokevirtual d : (I)V
    //   1034: aload_3
    //   1035: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   1038: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1041: aload_3
    //   1042: invokevirtual y : ()I
    //   1045: invokevirtual d : (I)V
    //   1048: aload_3
    //   1049: iconst_1
    //   1050: putfield b : Z
    //   1053: goto -> 8
    //   1056: aload_3
    //   1057: getfield S : [Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1060: astore #6
    //   1062: aload #6
    //   1064: iconst_2
    //   1065: aaload
    //   1066: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1069: ifnull -> 1082
    //   1072: aload #6
    //   1074: iconst_3
    //   1075: aaload
    //   1076: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1079: ifnonnull -> 1129
    //   1082: aload_0
    //   1083: aload_3
    //   1084: aload #10
    //   1086: iconst_0
    //   1087: aload #5
    //   1089: iconst_0
    //   1090: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   1093: aload_3
    //   1094: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   1097: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1100: aload_3
    //   1101: invokevirtual U : ()I
    //   1104: invokevirtual d : (I)V
    //   1107: aload_3
    //   1108: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   1111: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1114: aload_3
    //   1115: invokevirtual y : ()I
    //   1118: invokevirtual d : (I)V
    //   1121: aload_3
    //   1122: iconst_1
    //   1123: putfield b : Z
    //   1126: goto -> 8
    //   1129: aload #4
    //   1131: aload #7
    //   1133: if_acmpne -> 8
    //   1136: aload #5
    //   1138: aload #7
    //   1140: if_acmpne -> 8
    //   1143: iload #8
    //   1145: iconst_1
    //   1146: if_icmpeq -> 1302
    //   1149: iload #9
    //   1151: iconst_1
    //   1152: if_icmpne -> 1158
    //   1155: goto -> 1302
    //   1158: iload #9
    //   1160: iconst_2
    //   1161: if_icmpne -> 8
    //   1164: iload #8
    //   1166: iconst_2
    //   1167: if_icmpne -> 8
    //   1170: aload_1
    //   1171: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1174: astore #6
    //   1176: aload #6
    //   1178: iconst_0
    //   1179: aaload
    //   1180: astore #4
    //   1182: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1185: astore #5
    //   1187: aload #4
    //   1189: aload #5
    //   1191: if_acmpeq -> 1203
    //   1194: aload #6
    //   1196: iconst_0
    //   1197: aaload
    //   1198: aload #5
    //   1200: if_acmpne -> 8
    //   1203: aload #6
    //   1205: iconst_1
    //   1206: aaload
    //   1207: aload #5
    //   1209: if_acmpeq -> 1221
    //   1212: aload #6
    //   1214: iconst_1
    //   1215: aaload
    //   1216: aload #5
    //   1218: if_acmpne -> 8
    //   1221: aload_3
    //   1222: getfield v : F
    //   1225: fstore #13
    //   1227: aload_3
    //   1228: getfield y : F
    //   1231: fstore #14
    //   1233: aload_0
    //   1234: aload_3
    //   1235: aload #5
    //   1237: fload #13
    //   1239: aload_1
    //   1240: invokevirtual U : ()I
    //   1243: i2f
    //   1244: fmul
    //   1245: ldc 0.5
    //   1247: fadd
    //   1248: f2i
    //   1249: aload #5
    //   1251: fload #14
    //   1253: aload_1
    //   1254: invokevirtual y : ()I
    //   1257: i2f
    //   1258: fmul
    //   1259: ldc 0.5
    //   1261: fadd
    //   1262: f2i
    //   1263: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   1266: aload_3
    //   1267: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   1270: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1273: aload_3
    //   1274: invokevirtual U : ()I
    //   1277: invokevirtual d : (I)V
    //   1280: aload_3
    //   1281: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   1284: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1287: aload_3
    //   1288: invokevirtual y : ()I
    //   1291: invokevirtual d : (I)V
    //   1294: aload_3
    //   1295: iconst_1
    //   1296: putfield b : Z
    //   1299: goto -> 8
    //   1302: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1305: astore #5
    //   1307: aload_0
    //   1308: aload_3
    //   1309: aload #5
    //   1311: iconst_0
    //   1312: aload #5
    //   1314: iconst_0
    //   1315: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   1318: aload_3
    //   1319: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   1322: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1325: aload_3
    //   1326: invokevirtual U : ()I
    //   1329: putfield m : I
    //   1332: aload_3
    //   1333: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   1336: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1339: aload_3
    //   1340: invokevirtual y : ()I
    //   1343: putfield m : I
    //   1346: goto -> 8
    //   1349: aload_3
    //   1350: invokevirtual U : ()I
    //   1353: istore #8
    //   1355: aload #4
    //   1357: aload #6
    //   1359: if_acmpne -> 1404
    //   1362: aload_1
    //   1363: invokevirtual U : ()I
    //   1366: istore #8
    //   1368: aload_3
    //   1369: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1372: getfield g : I
    //   1375: istore #9
    //   1377: aload_3
    //   1378: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1381: getfield g : I
    //   1384: istore #15
    //   1386: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1389: astore #4
    //   1391: iload #8
    //   1393: iload #9
    //   1395: isub
    //   1396: iload #15
    //   1398: isub
    //   1399: istore #8
    //   1401: goto -> 1404
    //   1404: aload_3
    //   1405: invokevirtual y : ()I
    //   1408: istore #9
    //   1410: aload #5
    //   1412: aload #6
    //   1414: if_acmpne -> 1459
    //   1417: aload_1
    //   1418: invokevirtual y : ()I
    //   1421: istore #9
    //   1423: aload_3
    //   1424: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1427: getfield g : I
    //   1430: istore #15
    //   1432: aload_3
    //   1433: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1436: getfield g : I
    //   1439: istore #16
    //   1441: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1444: astore #5
    //   1446: iload #9
    //   1448: iload #15
    //   1450: isub
    //   1451: iload #16
    //   1453: isub
    //   1454: istore #9
    //   1456: goto -> 1459
    //   1459: aload_0
    //   1460: aload_3
    //   1461: aload #4
    //   1463: iload #8
    //   1465: aload #5
    //   1467: iload #9
    //   1469: invokespecial l : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;ILandroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;I)V
    //   1472: aload_3
    //   1473: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   1476: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1479: aload_3
    //   1480: invokevirtual U : ()I
    //   1483: invokevirtual d : (I)V
    //   1486: aload_3
    //   1487: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   1490: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1493: aload_3
    //   1494: invokevirtual y : ()I
    //   1497: invokevirtual d : (I)V
    //   1500: aload_3
    //   1501: iconst_1
    //   1502: putfield b : Z
    //   1505: goto -> 8
    //   1508: iconst_0
    //   1509: ireturn
  }
  
  private int e(d paramd, int paramInt) {
    int i = this.i.size();
    long l = 0L;
    for (byte b1 = 0; b1 < i; b1++)
      l = Math.max(l, ((l)this.i.get(b1)).b(paramd, paramInt)); 
    return (int)l;
  }
  
  private void i(WidgetRun paramWidgetRun, int paramInt, ArrayList<l> paramArrayList) {
    for (d d1 : paramWidgetRun.h.k) {
      if (d1 instanceof DependencyNode) {
        a((DependencyNode)d1, paramInt, 0, paramWidgetRun.i, paramArrayList, null);
        continue;
      } 
      if (d1 instanceof WidgetRun)
        a(((WidgetRun)d1).h, paramInt, 0, paramWidgetRun.i, paramArrayList, null); 
    } 
    for (d d1 : paramWidgetRun.i.k) {
      if (d1 instanceof DependencyNode) {
        a((DependencyNode)d1, paramInt, 1, paramWidgetRun.h, paramArrayList, null);
        continue;
      } 
      if (d1 instanceof WidgetRun)
        a(((WidgetRun)d1).i, paramInt, 1, paramWidgetRun.h, paramArrayList, null); 
    } 
    if (paramInt == 1)
      for (d d1 : ((m)paramWidgetRun).k.k) {
        if (d1 instanceof DependencyNode)
          a((DependencyNode)d1, paramInt, 2, null, paramArrayList, null); 
      }  
  }
  
  private void l(ConstraintWidget paramConstraintWidget, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, int paramInt1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, int paramInt2) {
    b.a a1 = this.h;
    a1.d = paramDimensionBehaviour1;
    a1.e = paramDimensionBehaviour2;
    a1.f = paramInt1;
    a1.g = paramInt2;
    this.g.b(paramConstraintWidget, a1);
    paramConstraintWidget.Y0(this.h.h);
    paramConstraintWidget.z0(this.h.i);
    paramConstraintWidget.y0(this.h.k);
    paramConstraintWidget.o0(this.h.j);
  }
  
  public void c() {
    d(this.e);
    this.i.clear();
    l.a = 0;
    i(((ConstraintWidget)this.a).f, 0, this.i);
    i(((ConstraintWidget)this.a).g, 1, this.i);
    this.b = false;
  }
  
  public void d(ArrayList<WidgetRun> paramArrayList) {
    paramArrayList.clear();
    ((ConstraintWidget)this.d).f.f();
    ((ConstraintWidget)this.d).g.f();
    paramArrayList.add(((ConstraintWidget)this.d).f);
    paramArrayList.add(((ConstraintWidget)this.d).g);
    Iterator<ConstraintWidget> iterator = ((k)this.d).N0.iterator();
    HashSet<c> hashSet = null;
    while (iterator.hasNext()) {
      HashSet<c> hashSet1;
      ConstraintWidget constraintWidget = iterator.next();
      if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.f) {
        paramArrayList.add(new i(constraintWidget));
        continue;
      } 
      if (constraintWidget.c0()) {
        if (constraintWidget.d == null)
          constraintWidget.d = new c(constraintWidget, 0); 
        hashSet1 = hashSet;
        if (hashSet == null)
          hashSet1 = new HashSet(); 
        hashSet1.add(constraintWidget.d);
        hashSet = hashSet1;
      } else {
        paramArrayList.add(constraintWidget.f);
      } 
      if (constraintWidget.e0()) {
        if (constraintWidget.e == null)
          constraintWidget.e = new c(constraintWidget, 1); 
        hashSet1 = hashSet;
        if (hashSet == null)
          hashSet1 = new HashSet<c>(); 
        hashSet1.add(constraintWidget.e);
      } else {
        paramArrayList.add(constraintWidget.g);
        hashSet1 = hashSet;
      } 
      hashSet = hashSet1;
      if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.h) {
        paramArrayList.add(new j(constraintWidget));
        hashSet = hashSet1;
      } 
    } 
    if (hashSet != null)
      paramArrayList.addAll((Collection)hashSet); 
    null = paramArrayList.iterator();
    while (null.hasNext())
      ((WidgetRun)null.next()).f(); 
    for (WidgetRun widgetRun : paramArrayList) {
      if (widgetRun.b == this.d)
        continue; 
      widgetRun.d();
    } 
  }
  
  public boolean f(boolean paramBoolean) {
    boolean bool2;
    boolean bool1 = true;
    int i = paramBoolean & true;
    if (this.b || this.c) {
      for (ConstraintWidget constraintWidget : ((k)this.a).N0) {
        constraintWidget.o();
        constraintWidget.b = false;
        constraintWidget.f.r();
        constraintWidget.g.q();
      } 
      this.a.o();
      d d2 = this.a;
      ((ConstraintWidget)d2).b = false;
      ((ConstraintWidget)d2).f.r();
      ((ConstraintWidget)this.a).g.q();
      this.c = false;
    } 
    if (b(this.d))
      return false; 
    this.a.Z0(0);
    this.a.a1(0);
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.a.v(0);
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = this.a.v(1);
    if (this.b)
      c(); 
    int j = this.a.V();
    int k = this.a.W();
    ((ConstraintWidget)this.a).f.h.d(j);
    ((ConstraintWidget)this.a).g.h.d(k);
    m();
    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.c;
    if (dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviour1 == dimensionBehaviour3) {
      bool2 = i;
      if (i != 0) {
        Iterator<WidgetRun> iterator1 = this.e.iterator();
        while (true) {
          bool2 = i;
          if (iterator1.hasNext()) {
            if (!((WidgetRun)iterator1.next()).m()) {
              bool2 = false;
              break;
            } 
            continue;
          } 
          break;
        } 
      } 
      if (bool2 != 0 && dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.c) {
        this.a.D0(ConstraintWidget.DimensionBehaviour.b);
        d d2 = this.a;
        d2.Y0(e(d2, 0));
        d2 = this.a;
        ((ConstraintWidget)d2).f.e.d(d2.U());
      } 
      if (bool2 != 0 && dimensionBehaviour1 == ConstraintWidget.DimensionBehaviour.c) {
        this.a.U0(ConstraintWidget.DimensionBehaviour.b);
        d d2 = this.a;
        d2.z0(e(d2, 1));
        d2 = this.a;
        ((ConstraintWidget)d2).g.e.d(d2.y());
      } 
    } 
    d d1 = this.a;
    ConstraintWidget.DimensionBehaviour[] arrayOfDimensionBehaviour = ((ConstraintWidget)d1).V;
    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = arrayOfDimensionBehaviour[0];
    dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.b;
    if (dimensionBehaviour4 == dimensionBehaviour3 || arrayOfDimensionBehaviour[0] == ConstraintWidget.DimensionBehaviour.e) {
      bool2 = d1.U() + j;
      ((ConstraintWidget)this.a).f.i.d(bool2);
      ((ConstraintWidget)this.a).f.e.d(bool2 - j);
      m();
      d d2 = this.a;
      ConstraintWidget.DimensionBehaviour[] arrayOfDimensionBehaviour1 = ((ConstraintWidget)d2).V;
      if (arrayOfDimensionBehaviour1[1] == dimensionBehaviour3 || arrayOfDimensionBehaviour1[1] == ConstraintWidget.DimensionBehaviour.e) {
        bool2 = d2.y() + k;
        ((ConstraintWidget)this.a).g.i.d(bool2);
        ((ConstraintWidget)this.a).g.e.d(bool2 - k);
      } 
      m();
      bool2 = true;
    } else {
      bool2 = false;
    } 
    for (WidgetRun widgetRun : this.e) {
      if (widgetRun.b == this.a && !widgetRun.g)
        continue; 
      widgetRun.e();
    } 
    Iterator<WidgetRun> iterator = this.e.iterator();
    while (true) {
      paramBoolean = bool1;
      if (iterator.hasNext()) {
        WidgetRun widgetRun = iterator.next();
        if ((bool2 || widgetRun.b != this.a) && (!widgetRun.h.j || (!widgetRun.i.j && !(widgetRun instanceof i)) || (!widgetRun.e.j && !(widgetRun instanceof c) && !(widgetRun instanceof i)))) {
          paramBoolean = false;
          break;
        } 
        continue;
      } 
      break;
    } 
    this.a.D0(dimensionBehaviour2);
    this.a.U0(dimensionBehaviour1);
    return paramBoolean;
  }
  
  public boolean g(boolean paramBoolean) {
    if (this.b) {
      for (ConstraintWidget constraintWidget : ((k)this.a).N0) {
        constraintWidget.o();
        constraintWidget.b = false;
        k k1 = constraintWidget.f;
        k1.e.j = false;
        k1.g = false;
        k1.r();
        m m1 = constraintWidget.g;
        m1.e.j = false;
        m1.g = false;
        m1.q();
      } 
      this.a.o();
      d d1 = this.a;
      ((ConstraintWidget)d1).b = false;
      k k = ((ConstraintWidget)d1).f;
      k.e.j = false;
      k.g = false;
      k.r();
      m m = ((ConstraintWidget)this.a).g;
      m.e.j = false;
      m.g = false;
      m.q();
      c();
    } 
    if (b(this.d))
      return false; 
    this.a.Z0(0);
    this.a.a1(0);
    ((ConstraintWidget)this.a).f.h.d(0);
    ((ConstraintWidget)this.a).g.h.d(0);
    return true;
  }
  
  public boolean h(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iload_1
    //   3: iconst_1
    //   4: iand
    //   5: istore #4
    //   7: aload_0
    //   8: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   11: iconst_0
    //   12: invokevirtual v : (I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   15: astore #5
    //   17: aload_0
    //   18: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   21: iconst_1
    //   22: invokevirtual v : (I)Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   25: astore #6
    //   27: aload_0
    //   28: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   31: invokevirtual V : ()I
    //   34: istore #7
    //   36: aload_0
    //   37: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   40: invokevirtual W : ()I
    //   43: istore #8
    //   45: iload #4
    //   47: ifeq -> 257
    //   50: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   53: astore #9
    //   55: aload #5
    //   57: aload #9
    //   59: if_acmpeq -> 69
    //   62: aload #6
    //   64: aload #9
    //   66: if_acmpne -> 257
    //   69: aload_0
    //   70: getfield e : Ljava/util/ArrayList;
    //   73: invokevirtual iterator : ()Ljava/util/Iterator;
    //   76: astore #9
    //   78: iload #4
    //   80: istore #10
    //   82: aload #9
    //   84: invokeinterface hasNext : ()Z
    //   89: ifeq -> 124
    //   92: aload #9
    //   94: invokeinterface next : ()Ljava/lang/Object;
    //   99: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   102: astore #11
    //   104: aload #11
    //   106: getfield f : I
    //   109: iload_2
    //   110: if_icmpne -> 78
    //   113: aload #11
    //   115: invokevirtual m : ()Z
    //   118: ifne -> 78
    //   121: iconst_0
    //   122: istore #10
    //   124: iload_2
    //   125: ifne -> 194
    //   128: iload #10
    //   130: ifeq -> 257
    //   133: aload #5
    //   135: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   138: if_acmpne -> 257
    //   141: aload_0
    //   142: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   145: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   148: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   151: aload_0
    //   152: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   155: astore #9
    //   157: aload #9
    //   159: aload_0
    //   160: aload #9
    //   162: iconst_0
    //   163: invokespecial e : (Landroidx/constraintlayout/solver/widgets/d;I)I
    //   166: invokevirtual Y0 : (I)V
    //   169: aload_0
    //   170: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   173: astore #9
    //   175: aload #9
    //   177: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   180: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   183: aload #9
    //   185: invokevirtual U : ()I
    //   188: invokevirtual d : (I)V
    //   191: goto -> 257
    //   194: iload #10
    //   196: ifeq -> 257
    //   199: aload #6
    //   201: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   204: if_acmpne -> 257
    //   207: aload_0
    //   208: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   211: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   214: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   217: aload_0
    //   218: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   221: astore #9
    //   223: aload #9
    //   225: aload_0
    //   226: aload #9
    //   228: iconst_1
    //   229: invokespecial e : (Landroidx/constraintlayout/solver/widgets/d;I)I
    //   232: invokevirtual z0 : (I)V
    //   235: aload_0
    //   236: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   239: astore #9
    //   241: aload #9
    //   243: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   246: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   249: aload #9
    //   251: invokevirtual y : ()I
    //   254: invokevirtual d : (I)V
    //   257: iload_2
    //   258: ifne -> 340
    //   261: aload_0
    //   262: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   265: astore #9
    //   267: aload #9
    //   269: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   272: astore #11
    //   274: aload #11
    //   276: iconst_0
    //   277: aaload
    //   278: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   281: if_acmpeq -> 294
    //   284: aload #11
    //   286: iconst_0
    //   287: aaload
    //   288: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   291: if_acmpne -> 376
    //   294: aload #9
    //   296: invokevirtual U : ()I
    //   299: iload #7
    //   301: iadd
    //   302: istore #10
    //   304: aload_0
    //   305: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   308: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   311: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   314: iload #10
    //   316: invokevirtual d : (I)V
    //   319: aload_0
    //   320: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   323: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   326: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   329: iload #10
    //   331: iload #7
    //   333: isub
    //   334: invokevirtual d : (I)V
    //   337: goto -> 425
    //   340: aload_0
    //   341: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   344: astore #9
    //   346: aload #9
    //   348: getfield V : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   351: astore #11
    //   353: aload #11
    //   355: iconst_1
    //   356: aaload
    //   357: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   360: if_acmpeq -> 382
    //   363: aload #11
    //   365: iconst_1
    //   366: aaload
    //   367: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   370: if_acmpne -> 376
    //   373: goto -> 382
    //   376: iconst_0
    //   377: istore #10
    //   379: goto -> 428
    //   382: aload #9
    //   384: invokevirtual y : ()I
    //   387: iload #8
    //   389: iadd
    //   390: istore #10
    //   392: aload_0
    //   393: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   396: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   399: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   402: iload #10
    //   404: invokevirtual d : (I)V
    //   407: aload_0
    //   408: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   411: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   414: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   417: iload #10
    //   419: iload #8
    //   421: isub
    //   422: invokevirtual d : (I)V
    //   425: iconst_1
    //   426: istore #10
    //   428: aload_0
    //   429: invokevirtual m : ()V
    //   432: aload_0
    //   433: getfield e : Ljava/util/ArrayList;
    //   436: invokevirtual iterator : ()Ljava/util/Iterator;
    //   439: astore #9
    //   441: aload #9
    //   443: invokeinterface hasNext : ()Z
    //   448: ifeq -> 506
    //   451: aload #9
    //   453: invokeinterface next : ()Ljava/lang/Object;
    //   458: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   461: astore #11
    //   463: aload #11
    //   465: getfield f : I
    //   468: iload_2
    //   469: if_icmpeq -> 475
    //   472: goto -> 441
    //   475: aload #11
    //   477: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   480: aload_0
    //   481: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   484: if_acmpne -> 498
    //   487: aload #11
    //   489: getfield g : Z
    //   492: ifne -> 498
    //   495: goto -> 441
    //   498: aload #11
    //   500: invokevirtual e : ()V
    //   503: goto -> 441
    //   506: aload_0
    //   507: getfield e : Ljava/util/ArrayList;
    //   510: invokevirtual iterator : ()Ljava/util/Iterator;
    //   513: astore #9
    //   515: iload_3
    //   516: istore_1
    //   517: aload #9
    //   519: invokeinterface hasNext : ()Z
    //   524: ifeq -> 623
    //   527: aload #9
    //   529: invokeinterface next : ()Ljava/lang/Object;
    //   534: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   537: astore #11
    //   539: aload #11
    //   541: getfield f : I
    //   544: iload_2
    //   545: if_icmpeq -> 551
    //   548: goto -> 515
    //   551: iload #10
    //   553: ifne -> 571
    //   556: aload #11
    //   558: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   561: aload_0
    //   562: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   565: if_acmpne -> 571
    //   568: goto -> 515
    //   571: aload #11
    //   573: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   576: getfield j : Z
    //   579: ifne -> 587
    //   582: iconst_0
    //   583: istore_1
    //   584: goto -> 623
    //   587: aload #11
    //   589: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   592: getfield j : Z
    //   595: ifne -> 601
    //   598: goto -> 582
    //   601: aload #11
    //   603: instanceof androidx/constraintlayout/solver/widgets/analyzer/c
    //   606: ifne -> 515
    //   609: aload #11
    //   611: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   614: getfield j : Z
    //   617: ifne -> 515
    //   620: goto -> 582
    //   623: aload_0
    //   624: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   627: aload #5
    //   629: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   632: aload_0
    //   633: getfield a : Landroidx/constraintlayout/solver/widgets/d;
    //   636: aload #6
    //   638: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   641: iload_1
    //   642: ireturn
  }
  
  public void j() {
    this.b = true;
  }
  
  public void k() {
    this.c = true;
  }
  
  public void m() {
    Iterator iterator = ((k)this.a).N0.iterator();
    while (true) {
      while (true)
        break; 
      if (((ConstraintWidget)SYNTHETIC_LOCAL_VARIABLE_2).b) {
        f f = ((ConstraintWidget)SYNTHETIC_LOCAL_VARIABLE_2).g.l;
        if (f != null)
          f.d(SYNTHETIC_LOCAL_VARIABLE_2.q()); 
      } 
    } 
  }
  
  public void n(b.b paramb) {
    this.g = paramb;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */