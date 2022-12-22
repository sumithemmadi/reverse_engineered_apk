package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.d;
import java.util.ArrayList;
import java.util.HashMap;

public class e extends j {
  private int A1 = 0;
  
  private int c1 = -1;
  
  private int d1 = -1;
  
  private int e1 = -1;
  
  private int f1 = -1;
  
  private int g1 = -1;
  
  private int h1 = -1;
  
  private float i1 = 0.5F;
  
  private float j1 = 0.5F;
  
  private float k1 = 0.5F;
  
  private float l1 = 0.5F;
  
  private float m1 = 0.5F;
  
  private float n1 = 0.5F;
  
  private int o1 = 0;
  
  private int p1 = 0;
  
  private int q1 = 2;
  
  private int r1 = 2;
  
  private int s1 = 0;
  
  private int t1 = -1;
  
  private int u1 = 0;
  
  private ArrayList<a> v1 = new ArrayList<a>();
  
  private ConstraintWidget[] w1 = null;
  
  private ConstraintWidget[] x1 = null;
  
  private int[] y1 = null;
  
  private ConstraintWidget[] z1;
  
  private void V1(boolean paramBoolean) {
    if (this.y1 != null && this.x1 != null && this.w1 != null) {
      ConstraintWidget constraintWidget;
      byte b;
      for (b = 0; b < this.A1; b++)
        this.z1[b].l0(); 
      int[] arrayOfInt = this.y1;
      int i = arrayOfInt[0];
      int k = arrayOfInt[1];
      arrayOfInt = null;
      b = 0;
      while (b < i) {
        byte b1;
        ConstraintWidget constraintWidget2;
        if (paramBoolean) {
          b1 = i - b - 1;
        } else {
          b1 = b;
        } 
        ConstraintWidget constraintWidget1 = this.x1[b1];
        int[] arrayOfInt1 = arrayOfInt;
        if (constraintWidget1 != null)
          if (constraintWidget1.T() == 8) {
            arrayOfInt1 = arrayOfInt;
          } else {
            if (b == 0) {
              constraintWidget1.k(constraintWidget1.K, this.K, l1());
              constraintWidget1.B0(this.c1);
              constraintWidget1.A0(this.i1);
            } 
            if (b == i - 1)
              constraintWidget1.k(constraintWidget1.M, this.M, m1()); 
            if (b > 0) {
              constraintWidget1.k(constraintWidget1.K, ((ConstraintWidget)arrayOfInt).M, this.o1);
              arrayOfInt.k(((ConstraintWidget)arrayOfInt).M, constraintWidget1.K, 0);
            } 
            constraintWidget2 = constraintWidget1;
          }  
        b++;
        constraintWidget = constraintWidget2;
      } 
      b = 0;
      while (b < k) {
        ConstraintWidget constraintWidget1 = this.w1[b];
        ConstraintWidget constraintWidget2 = constraintWidget;
        if (constraintWidget1 != null)
          if (constraintWidget1.T() == 8) {
            constraintWidget2 = constraintWidget;
          } else {
            if (b == 0) {
              constraintWidget1.k(constraintWidget1.L, this.L, n1());
              constraintWidget1.S0(this.d1);
              constraintWidget1.R0(this.j1);
            } 
            if (b == k - 1)
              constraintWidget1.k(constraintWidget1.N, this.N, k1()); 
            if (b > 0) {
              constraintWidget1.k(constraintWidget1.L, constraintWidget.N, this.p1);
              constraintWidget.k(constraintWidget.N, constraintWidget1.L, 0);
            } 
            constraintWidget2 = constraintWidget1;
          }  
        b++;
        constraintWidget = constraintWidget2;
      } 
      for (b = 0; b < i; b++) {
        for (byte b1 = 0; b1 < k; b1++) {
          int m = b1 * i + b;
          if (this.u1 == 1)
            m = b * k + b1; 
          ConstraintWidget[] arrayOfConstraintWidget = this.z1;
          if (m < arrayOfConstraintWidget.length) {
            ConstraintWidget constraintWidget1 = arrayOfConstraintWidget[m];
            if (constraintWidget1 != null && constraintWidget1.T() != 8) {
              ConstraintWidget constraintWidget2 = this.x1[b];
              ConstraintWidget constraintWidget3 = this.w1[b1];
              if (constraintWidget1 != constraintWidget2) {
                constraintWidget1.k(constraintWidget1.K, constraintWidget2.K, 0);
                constraintWidget1.k(constraintWidget1.M, constraintWidget2.M, 0);
              } 
              if (constraintWidget1 != constraintWidget3) {
                constraintWidget1.k(constraintWidget1.L, constraintWidget3.L, 0);
                constraintWidget1.k(constraintWidget1.N, constraintWidget3.N, 0);
              } 
            } 
          } 
        } 
      } 
    } 
  }
  
  private final int W1(ConstraintWidget paramConstraintWidget, int paramInt) {
    if (paramConstraintWidget == null)
      return 0; 
    if (paramConstraintWidget.R() == ConstraintWidget.DimensionBehaviour.d) {
      int i = paramConstraintWidget.r;
      if (i == 0)
        return 0; 
      if (i == 2) {
        paramInt = (int)(paramConstraintWidget.y * paramInt);
        if (paramInt != paramConstraintWidget.y()) {
          paramConstraintWidget.M0(true);
          p1(paramConstraintWidget, paramConstraintWidget.B(), paramConstraintWidget.U(), ConstraintWidget.DimensionBehaviour.b, paramInt);
        } 
        return paramInt;
      } 
      if (i == 1)
        return paramConstraintWidget.y(); 
      if (i == 3)
        return (int)(paramConstraintWidget.U() * paramConstraintWidget.Z + 0.5F); 
    } 
    return paramConstraintWidget.y();
  }
  
  private final int X1(ConstraintWidget paramConstraintWidget, int paramInt) {
    if (paramConstraintWidget == null)
      return 0; 
    if (paramConstraintWidget.B() == ConstraintWidget.DimensionBehaviour.d) {
      int i = paramConstraintWidget.q;
      if (i == 0)
        return 0; 
      if (i == 2) {
        paramInt = (int)(paramConstraintWidget.v * paramInt);
        if (paramInt != paramConstraintWidget.U()) {
          paramConstraintWidget.M0(true);
          p1(paramConstraintWidget, ConstraintWidget.DimensionBehaviour.b, paramInt, paramConstraintWidget.R(), paramConstraintWidget.y());
        } 
        return paramInt;
      } 
      if (i == 1)
        return paramConstraintWidget.U(); 
      if (i == 3)
        return (int)(paramConstraintWidget.y() * paramConstraintWidget.Z + 0.5F); 
    } 
    return paramConstraintWidget.U();
  }
  
  private void Y1(ConstraintWidget[] paramArrayOfConstraintWidget, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    // Byte code:
    //   0: iload_3
    //   1: ifne -> 120
    //   4: aload_0
    //   5: getfield t1 : I
    //   8: istore #6
    //   10: iload #6
    //   12: istore #7
    //   14: iload #6
    //   16: ifgt -> 110
    //   19: iconst_0
    //   20: istore #6
    //   22: iconst_0
    //   23: istore #8
    //   25: iconst_0
    //   26: istore #9
    //   28: iload #6
    //   30: istore #7
    //   32: iload #8
    //   34: iload_2
    //   35: if_icmpge -> 110
    //   38: iload #9
    //   40: istore #7
    //   42: iload #8
    //   44: ifle -> 56
    //   47: iload #9
    //   49: aload_0
    //   50: getfield o1 : I
    //   53: iadd
    //   54: istore #7
    //   56: aload_1
    //   57: iload #8
    //   59: aaload
    //   60: astore #10
    //   62: aload #10
    //   64: ifnonnull -> 74
    //   67: iload #7
    //   69: istore #9
    //   71: goto -> 104
    //   74: iload #7
    //   76: aload_0
    //   77: aload #10
    //   79: iload #4
    //   81: invokespecial X1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)I
    //   84: iadd
    //   85: istore #9
    //   87: iload #9
    //   89: iload #4
    //   91: if_icmple -> 101
    //   94: iload #6
    //   96: istore #7
    //   98: goto -> 110
    //   101: iinc #6, 1
    //   104: iinc #8, 1
    //   107: goto -> 28
    //   110: iload #7
    //   112: istore #9
    //   114: iconst_0
    //   115: istore #6
    //   117: goto -> 233
    //   120: aload_0
    //   121: getfield t1 : I
    //   124: istore #6
    //   126: iload #6
    //   128: istore #7
    //   130: iload #6
    //   132: ifgt -> 226
    //   135: iconst_0
    //   136: istore #6
    //   138: iconst_0
    //   139: istore #8
    //   141: iconst_0
    //   142: istore #9
    //   144: iload #6
    //   146: istore #7
    //   148: iload #8
    //   150: iload_2
    //   151: if_icmpge -> 226
    //   154: iload #9
    //   156: istore #7
    //   158: iload #8
    //   160: ifle -> 172
    //   163: iload #9
    //   165: aload_0
    //   166: getfield p1 : I
    //   169: iadd
    //   170: istore #7
    //   172: aload_1
    //   173: iload #8
    //   175: aaload
    //   176: astore #10
    //   178: aload #10
    //   180: ifnonnull -> 190
    //   183: iload #7
    //   185: istore #9
    //   187: goto -> 220
    //   190: iload #7
    //   192: aload_0
    //   193: aload #10
    //   195: iload #4
    //   197: invokespecial W1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)I
    //   200: iadd
    //   201: istore #9
    //   203: iload #9
    //   205: iload #4
    //   207: if_icmple -> 217
    //   210: iload #6
    //   212: istore #7
    //   214: goto -> 226
    //   217: iinc #6, 1
    //   220: iinc #8, 1
    //   223: goto -> 144
    //   226: iconst_0
    //   227: istore #9
    //   229: iload #7
    //   231: istore #6
    //   233: aload_0
    //   234: getfield y1 : [I
    //   237: ifnonnull -> 247
    //   240: aload_0
    //   241: iconst_2
    //   242: newarray int
    //   244: putfield y1 : [I
    //   247: iload #6
    //   249: ifne -> 265
    //   252: iload #6
    //   254: istore #11
    //   256: iload #9
    //   258: istore #12
    //   260: iload_3
    //   261: iconst_1
    //   262: if_icmpeq -> 282
    //   265: iload #9
    //   267: ifne -> 296
    //   270: iload_3
    //   271: ifne -> 296
    //   274: iload #9
    //   276: istore #12
    //   278: iload #6
    //   280: istore #11
    //   282: iconst_1
    //   283: istore #13
    //   285: iload #11
    //   287: istore #6
    //   289: iload #12
    //   291: istore #9
    //   293: goto -> 299
    //   296: iconst_0
    //   297: istore #13
    //   299: iload #13
    //   301: ifne -> 820
    //   304: iload_3
    //   305: ifne -> 324
    //   308: iload_2
    //   309: i2f
    //   310: iload #9
    //   312: i2f
    //   313: fdiv
    //   314: f2d
    //   315: invokestatic ceil : (D)D
    //   318: d2i
    //   319: istore #6
    //   321: goto -> 337
    //   324: iload_2
    //   325: i2f
    //   326: iload #6
    //   328: i2f
    //   329: fdiv
    //   330: f2d
    //   331: invokestatic ceil : (D)D
    //   334: d2i
    //   335: istore #9
    //   337: aload_0
    //   338: getfield x1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   341: astore #10
    //   343: aload #10
    //   345: ifnull -> 368
    //   348: aload #10
    //   350: arraylength
    //   351: iload #9
    //   353: if_icmpge -> 359
    //   356: goto -> 368
    //   359: aload #10
    //   361: aconst_null
    //   362: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
    //   365: goto -> 377
    //   368: aload_0
    //   369: iload #9
    //   371: anewarray androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   374: putfield x1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   377: aload_0
    //   378: getfield w1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   381: astore #10
    //   383: aload #10
    //   385: ifnull -> 408
    //   388: aload #10
    //   390: arraylength
    //   391: iload #6
    //   393: if_icmpge -> 399
    //   396: goto -> 408
    //   399: aload #10
    //   401: aconst_null
    //   402: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
    //   405: goto -> 417
    //   408: aload_0
    //   409: iload #6
    //   411: anewarray androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   414: putfield w1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   417: iconst_0
    //   418: istore #7
    //   420: iload #7
    //   422: iload #9
    //   424: if_icmpge -> 590
    //   427: iconst_0
    //   428: istore #8
    //   430: iload #8
    //   432: iload #6
    //   434: if_icmpge -> 584
    //   437: iload #8
    //   439: iload #9
    //   441: imul
    //   442: iload #7
    //   444: iadd
    //   445: istore #12
    //   447: iload_3
    //   448: iconst_1
    //   449: if_icmpne -> 462
    //   452: iload #7
    //   454: iload #6
    //   456: imul
    //   457: iload #8
    //   459: iadd
    //   460: istore #12
    //   462: iload #12
    //   464: aload_1
    //   465: arraylength
    //   466: if_icmplt -> 472
    //   469: goto -> 578
    //   472: aload_1
    //   473: iload #12
    //   475: aaload
    //   476: astore #10
    //   478: aload #10
    //   480: ifnonnull -> 486
    //   483: goto -> 578
    //   486: aload_0
    //   487: aload #10
    //   489: iload #4
    //   491: invokespecial X1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)I
    //   494: istore #12
    //   496: aload_0
    //   497: getfield x1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   500: astore #14
    //   502: aload #14
    //   504: iload #7
    //   506: aaload
    //   507: ifnull -> 523
    //   510: aload #14
    //   512: iload #7
    //   514: aaload
    //   515: invokevirtual U : ()I
    //   518: iload #12
    //   520: if_icmpge -> 532
    //   523: aload_0
    //   524: getfield x1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   527: iload #7
    //   529: aload #10
    //   531: aastore
    //   532: aload_0
    //   533: aload #10
    //   535: iload #4
    //   537: invokespecial W1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)I
    //   540: istore #12
    //   542: aload_0
    //   543: getfield w1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   546: astore #14
    //   548: aload #14
    //   550: iload #8
    //   552: aaload
    //   553: ifnull -> 569
    //   556: aload #14
    //   558: iload #8
    //   560: aaload
    //   561: invokevirtual y : ()I
    //   564: iload #12
    //   566: if_icmpge -> 578
    //   569: aload_0
    //   570: getfield w1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   573: iload #8
    //   575: aload #10
    //   577: aastore
    //   578: iinc #8, 1
    //   581: goto -> 430
    //   584: iinc #7, 1
    //   587: goto -> 420
    //   590: iconst_0
    //   591: istore #8
    //   593: iconst_0
    //   594: istore #7
    //   596: iload #8
    //   598: iload #9
    //   600: if_icmpge -> 662
    //   603: aload_0
    //   604: getfield x1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   607: iload #8
    //   609: aaload
    //   610: astore #10
    //   612: iload #7
    //   614: istore #12
    //   616: aload #10
    //   618: ifnull -> 652
    //   621: iload #7
    //   623: istore #12
    //   625: iload #8
    //   627: ifle -> 639
    //   630: iload #7
    //   632: aload_0
    //   633: getfield o1 : I
    //   636: iadd
    //   637: istore #12
    //   639: iload #12
    //   641: aload_0
    //   642: aload #10
    //   644: iload #4
    //   646: invokespecial X1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)I
    //   649: iadd
    //   650: istore #12
    //   652: iinc #8, 1
    //   655: iload #12
    //   657: istore #7
    //   659: goto -> 596
    //   662: iconst_0
    //   663: istore #12
    //   665: iconst_0
    //   666: istore #8
    //   668: iload #12
    //   670: iload #6
    //   672: if_icmpge -> 734
    //   675: aload_0
    //   676: getfield w1 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   679: iload #12
    //   681: aaload
    //   682: astore #10
    //   684: iload #8
    //   686: istore #11
    //   688: aload #10
    //   690: ifnull -> 724
    //   693: iload #8
    //   695: istore #11
    //   697: iload #12
    //   699: ifle -> 711
    //   702: iload #8
    //   704: aload_0
    //   705: getfield p1 : I
    //   708: iadd
    //   709: istore #11
    //   711: iload #11
    //   713: aload_0
    //   714: aload #10
    //   716: iload #4
    //   718: invokespecial W1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;I)I
    //   721: iadd
    //   722: istore #11
    //   724: iinc #12, 1
    //   727: iload #11
    //   729: istore #8
    //   731: goto -> 668
    //   734: aload #5
    //   736: iconst_0
    //   737: iload #7
    //   739: iastore
    //   740: aload #5
    //   742: iconst_1
    //   743: iload #8
    //   745: iastore
    //   746: iload_3
    //   747: ifne -> 785
    //   750: iload #6
    //   752: istore #11
    //   754: iload #9
    //   756: istore #12
    //   758: iload #7
    //   760: iload #4
    //   762: if_icmple -> 282
    //   765: iload #6
    //   767: istore #11
    //   769: iload #9
    //   771: istore #12
    //   773: iload #9
    //   775: iconst_1
    //   776: if_icmple -> 282
    //   779: iinc #9, -1
    //   782: goto -> 299
    //   785: iload #6
    //   787: istore #11
    //   789: iload #9
    //   791: istore #12
    //   793: iload #8
    //   795: iload #4
    //   797: if_icmple -> 282
    //   800: iload #6
    //   802: istore #11
    //   804: iload #9
    //   806: istore #12
    //   808: iload #6
    //   810: iconst_1
    //   811: if_icmple -> 282
    //   814: iinc #6, -1
    //   817: goto -> 299
    //   820: aload_0
    //   821: getfield y1 : [I
    //   824: astore_1
    //   825: aload_1
    //   826: iconst_0
    //   827: iload #9
    //   829: iastore
    //   830: aload_1
    //   831: iconst_1
    //   832: iload #6
    //   834: iastore
    //   835: return
  }
  
  private void Z1(ConstraintWidget[] paramArrayOfConstraintWidget, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    ConstraintWidget constraintWidget;
    if (paramInt1 == 0)
      return; 
    this.v1.clear();
    a a = new a(this, paramInt2, this.K, this.L, this.M, this.N, paramInt3);
    this.v1.add(a);
    if (paramInt2 == 0) {
      Object object;
      boolean bool = false;
      int i4 = 0;
      byte b = 0;
      for (a a1 = a;; a1 = a) {
        Object object1 = object;
        if (b < paramInt1) {
          boolean bool1;
          constraintWidget = paramArrayOfConstraintWidget[b];
          int i5 = X1(constraintWidget, paramInt3);
          object1 = object;
          if (constraintWidget.B() == ConstraintWidget.DimensionBehaviour.d)
            m = object + 1; 
          if ((i4 == paramInt3 || this.o1 + i4 + i5 > paramInt3) && a.a(a1) != null) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          boolean bool2 = bool1;
          if (!bool1) {
            bool2 = bool1;
            if (b > 0) {
              int i6 = this.t1;
              bool2 = bool1;
              if (i6 > 0) {
                bool2 = bool1;
                if (b % i6 == 0)
                  bool2 = true; 
              } 
            } 
          } 
          if (bool2) {
            a = new a(this, paramInt2, this.K, this.L, this.M, this.N, paramInt3);
            a.i(b);
            this.v1.add(a);
          } else {
            a = a1;
            if (b > 0) {
              i4 += this.o1 + i5;
              a = a1;
              continue;
            } 
          } 
          i4 = i5;
          continue;
        } 
        break;
        a.b((ConstraintWidget)SYNTHETIC_LOCAL_VARIABLE_12);
        b++;
        object = SYNTHETIC_LOCAL_VARIABLE_11;
      } 
    } else {
      int i4 = 0;
      int i5 = 0;
      byte b = 0;
      while (true) {
        m = i4;
        if (b < paramInt1) {
          a a1;
          constraintWidget = paramArrayOfConstraintWidget[b];
          int i6 = W1(constraintWidget, paramInt3);
          m = i4;
          if (constraintWidget.R() == ConstraintWidget.DimensionBehaviour.d)
            m = i4 + 1; 
          if ((i5 == paramInt3 || this.p1 + i5 + i6 > paramInt3) && a.a(a) != null) {
            i4 = 1;
          } else {
            i4 = 0;
          } 
          int i7 = i4;
          if (i4 == 0) {
            i7 = i4;
            if (b > 0) {
              int i8 = this.t1;
              i7 = i4;
              if (i8 > 0) {
                i7 = i4;
                if (b % i8 == 0)
                  i7 = 1; 
              } 
            } 
          } 
          if (i7 != 0) {
            a1 = new a(this, paramInt2, this.K, this.L, this.M, this.N, paramInt3);
            a1.i(b);
            this.v1.add(a1);
          } else {
            a1 = a;
            if (b > 0) {
              i5 += this.p1 + i6;
              continue;
            } 
          } 
          i5 = i6;
          a = a1;
          continue;
        } 
        break;
        a.b(constraintWidget);
        b++;
        i4 = m;
      } 
    } 
    int i3 = this.v1.size();
    ConstraintAnchor constraintAnchor1 = this.K;
    ConstraintAnchor constraintAnchor4 = this.L;
    ConstraintAnchor constraintAnchor2 = this.M;
    ConstraintAnchor constraintAnchor3 = this.N;
    int i = l1();
    int k = n1();
    int n = m1();
    int i1 = k1();
    ConstraintWidget.DimensionBehaviour dimensionBehaviour1 = B();
    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.c;
    if (dimensionBehaviour1 == dimensionBehaviour2 || R() == dimensionBehaviour2) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if (m > 0 && paramInt1 != 0)
      for (paramInt1 = 0; paramInt1 < i3; paramInt1++) {
        a a1 = this.v1.get(paramInt1);
        if (paramInt2 == 0) {
          a1.g(paramInt3 - a1.f());
        } else {
          a1.g(paramInt3 - a1.e());
        } 
      }  
    int m = 0;
    int i2 = 0;
    paramInt1 = 0;
    while (paramInt1 < i3) {
      int i4;
      a a1 = this.v1.get(paramInt1);
      if (paramInt2 == 0) {
        if (paramInt1 < i3 - 1) {
          constraintAnchor3 = (a.a((a)this.v1.get(paramInt1 + 1))).L;
          i4 = 0;
        } else {
          constraintAnchor3 = this.N;
          i4 = k1();
        } 
        ConstraintAnchor constraintAnchor = (a.a(a1)).N;
        a1.j(paramInt2, constraintAnchor1, constraintAnchor4, constraintAnchor2, constraintAnchor3, i, k, n, i4, paramInt3);
        k = Math.max(i2, a1.f());
        i1 = m + a1.e();
        m = i1;
        if (paramInt1 > 0)
          m = i1 + this.p1; 
        constraintAnchor4 = constraintAnchor;
        i2 = 0;
        i1 = i4;
        i4 = k;
        k = i2;
      } else {
        n = paramInt1;
        if (n < i3 - 1) {
          constraintAnchor2 = (a.a((a)this.v1.get(n + 1))).K;
          i4 = 0;
        } else {
          constraintAnchor2 = this.M;
          i4 = m1();
        } 
        ConstraintAnchor constraintAnchor = (a.a(a1)).M;
        a1.j(paramInt2, constraintAnchor1, constraintAnchor4, constraintAnchor2, constraintAnchor3, i, k, i4, i1, paramInt3);
        i2 += a1.f();
        i = Math.max(m, a1.e());
        m = i2;
        if (n > 0)
          m = i2 + this.o1; 
        n = i4;
        constraintAnchor1 = constraintAnchor;
        i2 = 0;
        i4 = m;
        m = i;
        i = i2;
      } 
      paramInt1++;
      i2 = i4;
    } 
    paramArrayOfint[0] = i2;
    paramArrayOfint[1] = m;
  }
  
  private void a2(ConstraintWidget[] paramArrayOfConstraintWidget, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    a a;
    if (paramInt1 == 0)
      return; 
    if (this.v1.size() == 0) {
      a = new a(this, paramInt2, this.K, this.L, this.M, this.N, paramInt3);
      this.v1.add(a);
    } else {
      a = this.v1.get(0);
      a.c();
      ConstraintAnchor constraintAnchor1 = this.K;
      ConstraintAnchor constraintAnchor2 = this.L;
      ConstraintAnchor constraintAnchor3 = this.M;
      ConstraintAnchor constraintAnchor4 = this.N;
      int i = l1();
      int k = n1();
      int m = m1();
      int n = k1();
      a.j(paramInt2, constraintAnchor1, constraintAnchor2, constraintAnchor3, constraintAnchor4, i, k, m, n, paramInt3);
    } 
    for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++)
      a.b(paramArrayOfConstraintWidget[paramInt2]); 
    paramArrayOfint[0] = a.f();
    paramArrayOfint[1] = a.e();
  }
  
  public void b2(float paramFloat) {
    this.k1 = paramFloat;
  }
  
  public void c2(int paramInt) {
    this.e1 = paramInt;
  }
  
  public void d2(float paramFloat) {
    this.l1 = paramFloat;
  }
  
  public void e2(int paramInt) {
    this.f1 = paramInt;
  }
  
  public void f2(int paramInt) {
    this.q1 = paramInt;
  }
  
  public void g(d paramd, boolean paramBoolean) {
    super.g(paramd, paramBoolean);
    if (L() != null) {
      paramBoolean = ((d)L()).C1();
    } else {
      paramBoolean = false;
    } 
    int i = this.s1;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
          V1(paramBoolean); 
      } else {
        int k = this.v1.size();
        for (i = 0; i < k; i++) {
          boolean bool;
          a a = this.v1.get(i);
          if (i == k - 1) {
            bool = true;
          } else {
            bool = false;
          } 
          a.d(paramBoolean, i, bool);
        } 
      } 
    } else if (this.v1.size() > 0) {
      ((a)this.v1.get(0)).d(paramBoolean, 0, true);
    } 
    s1(false);
  }
  
  public void g2(float paramFloat) {
    this.i1 = paramFloat;
  }
  
  public void h2(int paramInt) {
    this.o1 = paramInt;
  }
  
  public void i2(int paramInt) {
    this.c1 = paramInt;
  }
  
  public void j2(float paramFloat) {
    this.m1 = paramFloat;
  }
  
  public void k2(int paramInt) {
    this.g1 = paramInt;
  }
  
  public void l2(float paramFloat) {
    this.n1 = paramFloat;
  }
  
  public void m(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap) {
    super.m(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = paramConstraintWidget;
    this.c1 = ((e)paramConstraintWidget).c1;
    this.d1 = ((e)paramConstraintWidget).d1;
    this.e1 = ((e)paramConstraintWidget).e1;
    this.f1 = ((e)paramConstraintWidget).f1;
    this.g1 = ((e)paramConstraintWidget).g1;
    this.h1 = ((e)paramConstraintWidget).h1;
    this.i1 = ((e)paramConstraintWidget).i1;
    this.j1 = ((e)paramConstraintWidget).j1;
    this.k1 = ((e)paramConstraintWidget).k1;
    this.l1 = ((e)paramConstraintWidget).l1;
    this.m1 = ((e)paramConstraintWidget).m1;
    this.n1 = ((e)paramConstraintWidget).n1;
    this.o1 = ((e)paramConstraintWidget).o1;
    this.p1 = ((e)paramConstraintWidget).p1;
    this.q1 = ((e)paramConstraintWidget).q1;
    this.r1 = ((e)paramConstraintWidget).r1;
    this.s1 = ((e)paramConstraintWidget).s1;
    this.t1 = ((e)paramConstraintWidget).t1;
    this.u1 = ((e)paramConstraintWidget).u1;
  }
  
  public void m2(int paramInt) {
    this.h1 = paramInt;
  }
  
  public void n2(int paramInt) {
    this.t1 = paramInt;
  }
  
  public void o1(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.O0 > 0 && !q1()) {
      t1(0, 0);
      s1(false);
      return;
    } 
    int i = l1();
    int k = m1();
    int m = n1();
    int n = k1();
    int[] arrayOfInt = new int[2];
    int i1 = paramInt2 - i - k;
    int i2 = this.u1;
    if (i2 == 1)
      i1 = paramInt4 - m - n; 
    if (i2 == 0) {
      if (this.c1 == -1)
        this.c1 = 0; 
      if (this.d1 == -1)
        this.d1 = 0; 
    } else {
      if (this.c1 == -1)
        this.c1 = 0; 
      if (this.d1 == -1)
        this.d1 = 0; 
    } 
    ConstraintWidget[] arrayOfConstraintWidget = this.N0;
    int i3 = 0;
    i2 = 0;
    while (true) {
      int i4 = this.O0;
      if (i3 < i4) {
        i4 = i2;
        if (this.N0[i3].T() == 8)
          i4 = i2 + 1; 
        i3++;
        i2 = i4;
        continue;
      } 
      if (i2 > 0) {
        arrayOfConstraintWidget = new ConstraintWidget[i4 - i2];
        i3 = 0;
        for (i2 = 0; i3 < this.O0; i2 = i4) {
          ConstraintWidget constraintWidget = this.N0[i3];
          i4 = i2;
          if (constraintWidget.T() != 8) {
            arrayOfConstraintWidget[i2] = constraintWidget;
            i4 = i2 + 1;
          } 
          i3++;
        } 
      } else {
        i2 = i4;
      } 
      this.z1 = arrayOfConstraintWidget;
      this.A1 = i2;
      i3 = this.s1;
      if (i3 != 0) {
        if (i3 != 1) {
          if (i3 == 2)
            Y1(arrayOfConstraintWidget, i2, this.u1, i1, arrayOfInt); 
        } else {
          Z1(arrayOfConstraintWidget, i2, this.u1, i1, arrayOfInt);
        } 
      } else {
        a2(arrayOfConstraintWidget, i2, this.u1, i1, arrayOfInt);
      } 
      boolean bool = true;
      i1 = arrayOfInt[0] + i + k;
      i2 = arrayOfInt[1] + m + n;
      if (paramInt1 == 1073741824) {
        paramInt1 = paramInt2;
      } else if (paramInt1 == Integer.MIN_VALUE) {
        paramInt1 = Math.min(i1, paramInt2);
      } else if (paramInt1 == 0) {
        paramInt1 = i1;
      } else {
        paramInt1 = 0;
      } 
      if (paramInt3 == 1073741824) {
        paramInt2 = paramInt4;
      } else if (paramInt3 == Integer.MIN_VALUE) {
        paramInt2 = Math.min(i2, paramInt4);
      } else if (paramInt3 == 0) {
        paramInt2 = i2;
      } else {
        paramInt2 = 0;
      } 
      t1(paramInt1, paramInt2);
      Y0(paramInt1);
      z0(paramInt2);
      if (this.O0 <= 0)
        bool = false; 
      s1(bool);
      return;
    } 
  }
  
  public void o2(int paramInt) {
    this.u1 = paramInt;
  }
  
  public void p2(int paramInt) {
    this.r1 = paramInt;
  }
  
  public void q2(float paramFloat) {
    this.j1 = paramFloat;
  }
  
  public void r2(int paramInt) {
    this.p1 = paramInt;
  }
  
  public void s2(int paramInt) {
    this.d1 = paramInt;
  }
  
  public void t2(int paramInt) {
    this.s1 = paramInt;
  }
  
  private class a {
    private int a = 0;
    
    private ConstraintWidget b = null;
    
    int c = 0;
    
    private ConstraintAnchor d;
    
    private ConstraintAnchor e;
    
    private ConstraintAnchor f;
    
    private ConstraintAnchor g;
    
    private int h = 0;
    
    private int i = 0;
    
    private int j = 0;
    
    private int k = 0;
    
    private int l = 0;
    
    private int m = 0;
    
    private int n = 0;
    
    private int o = 0;
    
    private int p = 0;
    
    private int q = 0;
    
    public a(e this$0, int param1Int1, ConstraintAnchor param1ConstraintAnchor1, ConstraintAnchor param1ConstraintAnchor2, ConstraintAnchor param1ConstraintAnchor3, ConstraintAnchor param1ConstraintAnchor4, int param1Int2) {
      this.a = param1Int1;
      this.d = param1ConstraintAnchor1;
      this.e = param1ConstraintAnchor2;
      this.f = param1ConstraintAnchor3;
      this.g = param1ConstraintAnchor4;
      this.h = this$0.l1();
      this.i = this$0.n1();
      this.j = this$0.m1();
      this.k = this$0.k1();
      this.q = param1Int2;
    }
    
    private void h() {
      this.l = 0;
      this.m = 0;
      this.b = null;
      this.c = 0;
      int i = this.o;
      for (byte b = 0; b < i && this.n + b < e.P1(this.r); b++) {
        ConstraintWidget constraintWidget = e.Q1(this.r)[this.n + b];
        if (this.a == 0) {
          int j = constraintWidget.U();
          int k = e.B1(this.r);
          if (constraintWidget.T() == 8)
            k = 0; 
          this.l += j + k;
          k = e.O1(this.r, constraintWidget, this.q);
          if (this.b == null || this.c < k) {
            this.b = constraintWidget;
            this.c = k;
            this.m = k;
          } 
        } else {
          int m = e.N1(this.r, constraintWidget, this.q);
          int j = e.O1(this.r, constraintWidget, this.q);
          int k = e.C1(this.r);
          if (constraintWidget.T() == 8)
            k = 0; 
          this.m += j + k;
          if (this.b == null || this.c < m) {
            this.b = constraintWidget;
            this.c = m;
            this.l = m;
          } 
        } 
      } 
    }
    
    public void b(ConstraintWidget param1ConstraintWidget) {
      int i = this.a;
      int j = 0;
      int k = 0;
      if (i == 0) {
        i = e.N1(this.r, param1ConstraintWidget, this.q);
        if (param1ConstraintWidget.B() == ConstraintWidget.DimensionBehaviour.d) {
          this.p++;
          i = 0;
        } 
        j = e.B1(this.r);
        if (param1ConstraintWidget.T() == 8)
          j = k; 
        this.l += i + j;
        i = e.O1(this.r, param1ConstraintWidget, this.q);
        if (this.b == null || this.c < i) {
          this.b = param1ConstraintWidget;
          this.c = i;
          this.m = i;
        } 
      } else {
        int m = e.N1(this.r, param1ConstraintWidget, this.q);
        i = e.O1(this.r, param1ConstraintWidget, this.q);
        if (param1ConstraintWidget.R() == ConstraintWidget.DimensionBehaviour.d) {
          this.p++;
          i = 0;
        } 
        k = e.C1(this.r);
        if (param1ConstraintWidget.T() != 8)
          j = k; 
        this.m += i + j;
        if (this.b == null || this.c < m) {
          this.b = param1ConstraintWidget;
          this.c = m;
          this.l = m;
        } 
      } 
      this.o++;
    }
    
    public void c() {
      this.c = 0;
      this.b = null;
      this.l = 0;
      this.m = 0;
      this.n = 0;
      this.o = 0;
      this.p = 0;
    }
    
    public void d(boolean param1Boolean1, int param1Int, boolean param1Boolean2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield o : I
      //   4: istore #4
      //   6: iconst_0
      //   7: istore #5
      //   9: iload #5
      //   11: iload #4
      //   13: if_icmpge -> 69
      //   16: aload_0
      //   17: getfield n : I
      //   20: iload #5
      //   22: iadd
      //   23: aload_0
      //   24: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   27: invokestatic P1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   30: if_icmplt -> 36
      //   33: goto -> 69
      //   36: aload_0
      //   37: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   40: invokestatic Q1 : (Landroidx/constraintlayout/solver/widgets/e;)[Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   43: aload_0
      //   44: getfield n : I
      //   47: iload #5
      //   49: iadd
      //   50: aaload
      //   51: astore #6
      //   53: aload #6
      //   55: ifnull -> 63
      //   58: aload #6
      //   60: invokevirtual l0 : ()V
      //   63: iinc #5, 1
      //   66: goto -> 9
      //   69: iload #4
      //   71: ifeq -> 1672
      //   74: aload_0
      //   75: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   78: ifnonnull -> 84
      //   81: goto -> 1672
      //   84: iload_3
      //   85: ifeq -> 98
      //   88: iload_2
      //   89: ifne -> 98
      //   92: iconst_1
      //   93: istore #7
      //   95: goto -> 101
      //   98: iconst_0
      //   99: istore #7
      //   101: iconst_0
      //   102: istore #5
      //   104: iconst_m1
      //   105: istore #8
      //   107: iconst_m1
      //   108: istore #9
      //   110: iload #5
      //   112: iload #4
      //   114: if_icmpge -> 222
      //   117: iload_1
      //   118: ifeq -> 133
      //   121: iload #4
      //   123: iconst_1
      //   124: isub
      //   125: iload #5
      //   127: isub
      //   128: istore #10
      //   130: goto -> 137
      //   133: iload #5
      //   135: istore #10
      //   137: aload_0
      //   138: getfield n : I
      //   141: iload #10
      //   143: iadd
      //   144: aload_0
      //   145: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   148: invokestatic P1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   151: if_icmplt -> 157
      //   154: goto -> 222
      //   157: iload #8
      //   159: istore #11
      //   161: iload #9
      //   163: istore #12
      //   165: aload_0
      //   166: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   169: invokestatic Q1 : (Landroidx/constraintlayout/solver/widgets/e;)[Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   172: aload_0
      //   173: getfield n : I
      //   176: iload #10
      //   178: iadd
      //   179: aaload
      //   180: invokevirtual T : ()I
      //   183: ifne -> 208
      //   186: iload #8
      //   188: istore #9
      //   190: iload #8
      //   192: iconst_m1
      //   193: if_icmpne -> 200
      //   196: iload #5
      //   198: istore #9
      //   200: iload #5
      //   202: istore #12
      //   204: iload #9
      //   206: istore #11
      //   208: iinc #5, 1
      //   211: iload #11
      //   213: istore #8
      //   215: iload #12
      //   217: istore #9
      //   219: goto -> 110
      //   222: aconst_null
      //   223: astore #6
      //   225: aconst_null
      //   226: astore #13
      //   228: aload_0
      //   229: getfield a : I
      //   232: ifne -> 957
      //   235: aload_0
      //   236: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   239: astore #14
      //   241: aload #14
      //   243: aload_0
      //   244: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   247: invokestatic R1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   250: invokevirtual S0 : (I)V
      //   253: aload_0
      //   254: getfield i : I
      //   257: istore #11
      //   259: iload #11
      //   261: istore #5
      //   263: iload_2
      //   264: ifle -> 279
      //   267: iload #11
      //   269: aload_0
      //   270: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   273: invokestatic C1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   276: iadd
      //   277: istore #5
      //   279: aload #14
      //   281: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   284: aload_0
      //   285: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   288: iload #5
      //   290: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   293: pop
      //   294: iload_3
      //   295: ifeq -> 315
      //   298: aload #14
      //   300: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   303: aload_0
      //   304: getfield g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   307: aload_0
      //   308: getfield k : I
      //   311: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   314: pop
      //   315: iload_2
      //   316: ifle -> 339
      //   319: aload_0
      //   320: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   323: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   326: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   329: aload #14
      //   331: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   334: iconst_0
      //   335: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   338: pop
      //   339: aload_0
      //   340: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   343: invokestatic S1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   346: iconst_3
      //   347: if_icmpne -> 438
      //   350: aload #14
      //   352: invokevirtual X : ()Z
      //   355: ifne -> 438
      //   358: iconst_0
      //   359: istore_2
      //   360: iload_2
      //   361: iload #4
      //   363: if_icmpge -> 438
      //   366: iload_1
      //   367: ifeq -> 381
      //   370: iload #4
      //   372: iconst_1
      //   373: isub
      //   374: iload_2
      //   375: isub
      //   376: istore #5
      //   378: goto -> 384
      //   381: iload_2
      //   382: istore #5
      //   384: aload_0
      //   385: getfield n : I
      //   388: iload #5
      //   390: iadd
      //   391: aload_0
      //   392: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   395: invokestatic P1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   398: if_icmplt -> 404
      //   401: goto -> 438
      //   404: aload_0
      //   405: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   408: invokestatic Q1 : (Landroidx/constraintlayout/solver/widgets/e;)[Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   411: aload_0
      //   412: getfield n : I
      //   415: iload #5
      //   417: iadd
      //   418: aaload
      //   419: astore #6
      //   421: aload #6
      //   423: invokevirtual X : ()Z
      //   426: ifeq -> 432
      //   429: goto -> 442
      //   432: iinc #2, 1
      //   435: goto -> 360
      //   438: aload #14
      //   440: astore #6
      //   442: iconst_0
      //   443: istore_2
      //   444: iload_2
      //   445: iload #4
      //   447: if_icmpge -> 1672
      //   450: iload_1
      //   451: ifeq -> 465
      //   454: iload #4
      //   456: iconst_1
      //   457: isub
      //   458: iload_2
      //   459: isub
      //   460: istore #5
      //   462: goto -> 468
      //   465: iload_2
      //   466: istore #5
      //   468: aload_0
      //   469: getfield n : I
      //   472: iload #5
      //   474: iadd
      //   475: aload_0
      //   476: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   479: invokestatic P1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   482: if_icmplt -> 488
      //   485: goto -> 1672
      //   488: aload_0
      //   489: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   492: invokestatic Q1 : (Landroidx/constraintlayout/solver/widgets/e;)[Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   495: aload_0
      //   496: getfield n : I
      //   499: iload #5
      //   501: iadd
      //   502: aaload
      //   503: astore #15
      //   505: iload_2
      //   506: ifne -> 527
      //   509: aload #15
      //   511: aload #15
      //   513: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   516: aload_0
      //   517: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   520: aload_0
      //   521: getfield h : I
      //   524: invokevirtual k : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)V
      //   527: iload #5
      //   529: ifne -> 652
      //   532: aload_0
      //   533: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   536: invokestatic T1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   539: istore #11
      //   541: aload_0
      //   542: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   545: invokestatic U1 : (Landroidx/constraintlayout/solver/widgets/e;)F
      //   548: fstore #16
      //   550: aload_0
      //   551: getfield n : I
      //   554: ifne -> 589
      //   557: aload_0
      //   558: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   561: invokestatic D1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   564: iconst_m1
      //   565: if_icmpeq -> 589
      //   568: aload_0
      //   569: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   572: invokestatic D1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   575: istore #5
      //   577: aload_0
      //   578: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   581: invokestatic E1 : (Landroidx/constraintlayout/solver/widgets/e;)F
      //   584: fstore #17
      //   586: goto -> 638
      //   589: iload #11
      //   591: istore #5
      //   593: fload #16
      //   595: fstore #17
      //   597: iload_3
      //   598: ifeq -> 638
      //   601: iload #11
      //   603: istore #5
      //   605: fload #16
      //   607: fstore #17
      //   609: aload_0
      //   610: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   613: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   616: iconst_m1
      //   617: if_icmpeq -> 638
      //   620: aload_0
      //   621: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   624: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   627: istore #5
      //   629: aload_0
      //   630: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   633: invokestatic G1 : (Landroidx/constraintlayout/solver/widgets/e;)F
      //   636: fstore #17
      //   638: aload #15
      //   640: iload #5
      //   642: invokevirtual B0 : (I)V
      //   645: aload #15
      //   647: fload #17
      //   649: invokevirtual A0 : (F)V
      //   652: iload_2
      //   653: iload #4
      //   655: iconst_1
      //   656: isub
      //   657: if_icmpne -> 678
      //   660: aload #15
      //   662: aload #15
      //   664: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   667: aload_0
      //   668: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   671: aload_0
      //   672: getfield j : I
      //   675: invokevirtual k : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)V
      //   678: aload #13
      //   680: ifnull -> 757
      //   683: aload #15
      //   685: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   688: aload #13
      //   690: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   693: aload_0
      //   694: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   697: invokestatic B1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   700: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   703: pop
      //   704: iload_2
      //   705: iload #8
      //   707: if_icmpne -> 722
      //   710: aload #15
      //   712: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   715: aload_0
      //   716: getfield h : I
      //   719: invokevirtual u : (I)V
      //   722: aload #13
      //   724: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   727: aload #15
      //   729: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   732: iconst_0
      //   733: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   736: pop
      //   737: iload_2
      //   738: iload #9
      //   740: iconst_1
      //   741: iadd
      //   742: if_icmpne -> 757
      //   745: aload #13
      //   747: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   750: aload_0
      //   751: getfield j : I
      //   754: invokevirtual u : (I)V
      //   757: aload #15
      //   759: aload #14
      //   761: if_acmpeq -> 947
      //   764: aload_0
      //   765: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   768: invokestatic S1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   771: iconst_3
      //   772: if_icmpne -> 816
      //   775: aload #6
      //   777: invokevirtual X : ()Z
      //   780: ifeq -> 816
      //   783: aload #15
      //   785: aload #6
      //   787: if_acmpeq -> 816
      //   790: aload #15
      //   792: invokevirtual X : ()Z
      //   795: ifeq -> 816
      //   798: aload #15
      //   800: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   803: aload #6
      //   805: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   808: iconst_0
      //   809: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   812: pop
      //   813: goto -> 947
      //   816: aload_0
      //   817: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   820: invokestatic S1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   823: istore #5
      //   825: iload #5
      //   827: ifeq -> 929
      //   830: iload #5
      //   832: iconst_1
      //   833: if_icmpeq -> 911
      //   836: iload #7
      //   838: ifeq -> 878
      //   841: aload #15
      //   843: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   846: aload_0
      //   847: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   850: aload_0
      //   851: getfield i : I
      //   854: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   857: pop
      //   858: aload #15
      //   860: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   863: aload_0
      //   864: getfield g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   867: aload_0
      //   868: getfield k : I
      //   871: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   874: pop
      //   875: goto -> 947
      //   878: aload #15
      //   880: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   883: aload #14
      //   885: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   888: iconst_0
      //   889: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   892: pop
      //   893: aload #15
      //   895: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   898: aload #14
      //   900: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   903: iconst_0
      //   904: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   907: pop
      //   908: goto -> 947
      //   911: aload #15
      //   913: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   916: aload #14
      //   918: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   921: iconst_0
      //   922: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   925: pop
      //   926: goto -> 947
      //   929: aload #15
      //   931: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   934: aload #14
      //   936: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   939: iconst_0
      //   940: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   943: pop
      //   944: goto -> 947
      //   947: iinc #2, 1
      //   950: aload #15
      //   952: astore #13
      //   954: goto -> 444
      //   957: aload_0
      //   958: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   961: astore #14
      //   963: aload #14
      //   965: aload_0
      //   966: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   969: invokestatic T1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   972: invokevirtual B0 : (I)V
      //   975: aload_0
      //   976: getfield h : I
      //   979: istore #11
      //   981: iload #11
      //   983: istore #5
      //   985: iload_2
      //   986: ifle -> 1001
      //   989: iload #11
      //   991: aload_0
      //   992: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   995: invokestatic B1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   998: iadd
      //   999: istore #5
      //   1001: iload_1
      //   1002: ifeq -> 1068
      //   1005: aload #14
      //   1007: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1010: aload_0
      //   1011: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1014: iload #5
      //   1016: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1019: pop
      //   1020: iload_3
      //   1021: ifeq -> 1041
      //   1024: aload #14
      //   1026: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1029: aload_0
      //   1030: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1033: aload_0
      //   1034: getfield j : I
      //   1037: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1040: pop
      //   1041: iload_2
      //   1042: ifle -> 1128
      //   1045: aload_0
      //   1046: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1049: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   1052: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1055: aload #14
      //   1057: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1060: iconst_0
      //   1061: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1064: pop
      //   1065: goto -> 1128
      //   1068: aload #14
      //   1070: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1073: aload_0
      //   1074: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1077: iload #5
      //   1079: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1082: pop
      //   1083: iload_3
      //   1084: ifeq -> 1104
      //   1087: aload #14
      //   1089: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1092: aload_0
      //   1093: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1096: aload_0
      //   1097: getfield j : I
      //   1100: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1103: pop
      //   1104: iload_2
      //   1105: ifle -> 1128
      //   1108: aload_0
      //   1109: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1112: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   1115: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1118: aload #14
      //   1120: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1123: iconst_0
      //   1124: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1127: pop
      //   1128: iconst_0
      //   1129: istore #5
      //   1131: iload #5
      //   1133: iload #4
      //   1135: if_icmpge -> 1672
      //   1138: aload_0
      //   1139: getfield n : I
      //   1142: iload #5
      //   1144: iadd
      //   1145: aload_0
      //   1146: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1149: invokestatic P1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1152: if_icmplt -> 1158
      //   1155: goto -> 1672
      //   1158: aload_0
      //   1159: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1162: invokestatic Q1 : (Landroidx/constraintlayout/solver/widgets/e;)[Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
      //   1165: aload_0
      //   1166: getfield n : I
      //   1169: iload #5
      //   1171: iadd
      //   1172: aaload
      //   1173: astore #13
      //   1175: iload #5
      //   1177: ifne -> 1313
      //   1180: aload #13
      //   1182: aload #13
      //   1184: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1187: aload_0
      //   1188: getfield e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1191: aload_0
      //   1192: getfield i : I
      //   1195: invokevirtual k : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)V
      //   1198: aload_0
      //   1199: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1202: invokestatic R1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1205: istore #11
      //   1207: aload_0
      //   1208: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1211: invokestatic H1 : (Landroidx/constraintlayout/solver/widgets/e;)F
      //   1214: fstore #16
      //   1216: aload_0
      //   1217: getfield n : I
      //   1220: ifne -> 1254
      //   1223: aload_0
      //   1224: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1227: invokestatic I1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1230: iconst_m1
      //   1231: if_icmpeq -> 1254
      //   1234: aload_0
      //   1235: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1238: invokestatic I1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1241: istore_2
      //   1242: aload_0
      //   1243: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1246: invokestatic J1 : (Landroidx/constraintlayout/solver/widgets/e;)F
      //   1249: fstore #17
      //   1251: goto -> 1300
      //   1254: iload #11
      //   1256: istore_2
      //   1257: fload #16
      //   1259: fstore #17
      //   1261: iload_3
      //   1262: ifeq -> 1300
      //   1265: iload #11
      //   1267: istore_2
      //   1268: fload #16
      //   1270: fstore #17
      //   1272: aload_0
      //   1273: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1276: invokestatic K1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1279: iconst_m1
      //   1280: if_icmpeq -> 1300
      //   1283: aload_0
      //   1284: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1287: invokestatic K1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1290: istore_2
      //   1291: aload_0
      //   1292: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1295: invokestatic L1 : (Landroidx/constraintlayout/solver/widgets/e;)F
      //   1298: fstore #17
      //   1300: aload #13
      //   1302: iload_2
      //   1303: invokevirtual S0 : (I)V
      //   1306: aload #13
      //   1308: fload #17
      //   1310: invokevirtual R0 : (F)V
      //   1313: iload #5
      //   1315: iload #4
      //   1317: iconst_1
      //   1318: isub
      //   1319: if_icmpne -> 1340
      //   1322: aload #13
      //   1324: aload #13
      //   1326: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1329: aload_0
      //   1330: getfield g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1333: aload_0
      //   1334: getfield k : I
      //   1337: invokevirtual k : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)V
      //   1340: aload #6
      //   1342: ifnull -> 1421
      //   1345: aload #13
      //   1347: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1350: aload #6
      //   1352: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1355: aload_0
      //   1356: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1359: invokestatic C1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1362: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1365: pop
      //   1366: iload #5
      //   1368: iload #8
      //   1370: if_icmpne -> 1385
      //   1373: aload #13
      //   1375: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1378: aload_0
      //   1379: getfield i : I
      //   1382: invokevirtual u : (I)V
      //   1385: aload #6
      //   1387: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1390: aload #13
      //   1392: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1395: iconst_0
      //   1396: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1399: pop
      //   1400: iload #5
      //   1402: iload #9
      //   1404: iconst_1
      //   1405: iadd
      //   1406: if_icmpne -> 1421
      //   1409: aload #6
      //   1411: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1414: aload_0
      //   1415: getfield k : I
      //   1418: invokevirtual u : (I)V
      //   1421: aload #13
      //   1423: aload #14
      //   1425: if_acmpeq -> 1662
      //   1428: iload_1
      //   1429: ifeq -> 1526
      //   1432: aload_0
      //   1433: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1436: invokestatic M1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1439: istore_2
      //   1440: iload_2
      //   1441: ifeq -> 1508
      //   1444: iload_2
      //   1445: iconst_1
      //   1446: if_icmpeq -> 1490
      //   1449: iload_2
      //   1450: iconst_2
      //   1451: if_icmpeq -> 1457
      //   1454: goto -> 1662
      //   1457: aload #13
      //   1459: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1462: aload #14
      //   1464: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1467: iconst_0
      //   1468: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1471: pop
      //   1472: aload #13
      //   1474: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1477: aload #14
      //   1479: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1482: iconst_0
      //   1483: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1486: pop
      //   1487: goto -> 1662
      //   1490: aload #13
      //   1492: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1495: aload #14
      //   1497: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1500: iconst_0
      //   1501: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1504: pop
      //   1505: goto -> 1662
      //   1508: aload #13
      //   1510: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1513: aload #14
      //   1515: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1518: iconst_0
      //   1519: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1522: pop
      //   1523: goto -> 1662
      //   1526: aload_0
      //   1527: getfield r : Landroidx/constraintlayout/solver/widgets/e;
      //   1530: invokestatic M1 : (Landroidx/constraintlayout/solver/widgets/e;)I
      //   1533: istore_2
      //   1534: iload_2
      //   1535: ifeq -> 1644
      //   1538: iload_2
      //   1539: iconst_1
      //   1540: if_icmpeq -> 1626
      //   1543: iload_2
      //   1544: iconst_2
      //   1545: if_icmpeq -> 1551
      //   1548: goto -> 1662
      //   1551: iload #7
      //   1553: ifeq -> 1593
      //   1556: aload #13
      //   1558: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1561: aload_0
      //   1562: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1565: aload_0
      //   1566: getfield h : I
      //   1569: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1572: pop
      //   1573: aload #13
      //   1575: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1578: aload_0
      //   1579: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1582: aload_0
      //   1583: getfield j : I
      //   1586: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1589: pop
      //   1590: goto -> 1662
      //   1593: aload #13
      //   1595: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1598: aload #14
      //   1600: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1603: iconst_0
      //   1604: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1607: pop
      //   1608: aload #13
      //   1610: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1613: aload #14
      //   1615: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1618: iconst_0
      //   1619: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1622: pop
      //   1623: goto -> 1662
      //   1626: aload #13
      //   1628: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1631: aload #14
      //   1633: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1636: iconst_0
      //   1637: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1640: pop
      //   1641: goto -> 1662
      //   1644: aload #13
      //   1646: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1649: aload #14
      //   1651: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
      //   1654: iconst_0
      //   1655: invokevirtual a : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;I)Z
      //   1658: pop
      //   1659: goto -> 1662
      //   1662: iinc #5, 1
      //   1665: aload #13
      //   1667: astore #6
      //   1669: goto -> 1131
      //   1672: return
    }
    
    public int e() {
      return (this.a == 1) ? (this.m - e.C1(this.r)) : this.m;
    }
    
    public int f() {
      return (this.a == 0) ? (this.l - e.B1(this.r)) : this.l;
    }
    
    public void g(int param1Int) {
      int i = this.p;
      if (i == 0)
        return; 
      int j = this.o;
      i = param1Int / i;
      for (param1Int = 0; param1Int < j && this.n + param1Int < e.P1(this.r); param1Int++) {
        ConstraintWidget constraintWidget = e.Q1(this.r)[this.n + param1Int];
        if (this.a == 0) {
          if (constraintWidget != null && constraintWidget.B() == ConstraintWidget.DimensionBehaviour.d && constraintWidget.q == 0)
            this.r.p1(constraintWidget, ConstraintWidget.DimensionBehaviour.b, i, constraintWidget.R(), constraintWidget.y()); 
        } else if (constraintWidget != null && constraintWidget.R() == ConstraintWidget.DimensionBehaviour.d && constraintWidget.r == 0) {
          this.r.p1(constraintWidget, constraintWidget.B(), constraintWidget.U(), ConstraintWidget.DimensionBehaviour.b, i);
        } 
      } 
      h();
    }
    
    public void i(int param1Int) {
      this.n = param1Int;
    }
    
    public void j(int param1Int1, ConstraintAnchor param1ConstraintAnchor1, ConstraintAnchor param1ConstraintAnchor2, ConstraintAnchor param1ConstraintAnchor3, ConstraintAnchor param1ConstraintAnchor4, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6) {
      this.a = param1Int1;
      this.d = param1ConstraintAnchor1;
      this.e = param1ConstraintAnchor2;
      this.f = param1ConstraintAnchor3;
      this.g = param1ConstraintAnchor4;
      this.h = param1Int2;
      this.i = param1Int3;
      this.j = param1Int4;
      this.k = param1Int5;
      this.q = param1Int6;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */