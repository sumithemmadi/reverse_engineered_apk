package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import androidx.constraintlayout.solver.widgets.f;
import java.util.ArrayList;

public class h {
  public static n a(ConstraintWidget paramConstraintWidget, int paramInt, ArrayList<n> paramArrayList, n paramn) {
    int i;
    n n1;
    if (paramInt == 0) {
      i = paramConstraintWidget.L0;
    } else {
      i = paramConstraintWidget.M0;
    } 
    boolean bool = false;
    if (i != -1 && (paramn == null || i != paramn.c)) {
      byte b = 0;
      while (true) {
        n1 = paramn;
        if (b < paramArrayList.size()) {
          n1 = paramArrayList.get(b);
          if (n1.c() == i) {
            if (paramn != null) {
              paramn.g(paramInt, n1);
              paramArrayList.remove(paramn);
            } 
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
    } else {
      n1 = paramn;
      if (i != -1)
        return paramn; 
    } 
    paramn = n1;
    if (n1 == null) {
      paramn = n1;
      if (paramConstraintWidget instanceof androidx.constraintlayout.solver.widgets.h) {
        int j = ((androidx.constraintlayout.solver.widgets.h)paramConstraintWidget).f1(paramInt);
        paramn = n1;
        if (j != -1) {
          i = 0;
          while (true) {
            paramn = n1;
            if (i < paramArrayList.size()) {
              paramn = paramArrayList.get(i);
              if (paramn.c() == j)
                break; 
              i++;
              continue;
            } 
            break;
          } 
        } 
      } 
      n1 = paramn;
      if (paramn == null)
        n1 = new n(paramInt); 
      paramArrayList.add(n1);
      paramn = n1;
    } 
    if (paramn.a(paramConstraintWidget)) {
      if (paramConstraintWidget instanceof f) {
        f f = (f)paramConstraintWidget;
        ConstraintAnchor constraintAnchor = f.e1();
        i = bool;
        if (f.f1() == 0)
          i = 1; 
        constraintAnchor.c(i, paramArrayList, paramn);
      } 
      if (paramInt == 0) {
        paramConstraintWidget.L0 = paramn.c();
        paramConstraintWidget.K.c(paramInt, paramArrayList, paramn);
        paramConstraintWidget.M.c(paramInt, paramArrayList, paramn);
      } else {
        paramConstraintWidget.M0 = paramn.c();
        paramConstraintWidget.L.c(paramInt, paramArrayList, paramn);
        paramConstraintWidget.O.c(paramInt, paramArrayList, paramn);
        paramConstraintWidget.N.c(paramInt, paramArrayList, paramn);
      } 
      paramConstraintWidget.R.c(paramInt, paramArrayList, paramn);
    } 
    return paramn;
  }
  
  private static n b(ArrayList<n> paramArrayList, int paramInt) {
    int i = paramArrayList.size();
    for (byte b = 0; b < i; b++) {
      n n = paramArrayList.get(b);
      if (paramInt == n.c)
        return n; 
    } 
    return null;
  }
  
  public static boolean c(d paramd, b.b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual e1 : ()Ljava/util/ArrayList;
    //   4: astore_2
    //   5: aload_2
    //   6: invokevirtual size : ()I
    //   9: istore_3
    //   10: iconst_0
    //   11: istore #4
    //   13: iload #4
    //   15: iload_3
    //   16: if_icmpge -> 72
    //   19: aload_2
    //   20: iload #4
    //   22: invokevirtual get : (I)Ljava/lang/Object;
    //   25: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   28: astore #5
    //   30: aload_0
    //   31: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   34: aload_0
    //   35: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   38: aload #5
    //   40: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   43: aload #5
    //   45: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   48: invokestatic d : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)Z
    //   51: ifne -> 56
    //   54: iconst_0
    //   55: ireturn
    //   56: aload #5
    //   58: instanceof androidx/constraintlayout/solver/widgets/e
    //   61: ifeq -> 66
    //   64: iconst_0
    //   65: ireturn
    //   66: iinc #4, 1
    //   69: goto -> 13
    //   72: aload_0
    //   73: getfield S0 : Landroidx/constraintlayout/solver/e;
    //   76: ifnonnull -> 1693
    //   79: iconst_0
    //   80: istore #4
    //   82: aconst_null
    //   83: astore #6
    //   85: aconst_null
    //   86: astore #5
    //   88: aconst_null
    //   89: astore #7
    //   91: aconst_null
    //   92: astore #8
    //   94: aconst_null
    //   95: astore #9
    //   97: aconst_null
    //   98: astore #10
    //   100: iload #4
    //   102: iload_3
    //   103: if_icmpge -> 659
    //   106: aload_2
    //   107: iload #4
    //   109: invokevirtual get : (I)Ljava/lang/Object;
    //   112: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   115: astore #11
    //   117: aload_0
    //   118: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   121: aload_0
    //   122: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   125: aload #11
    //   127: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   130: aload #11
    //   132: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   135: invokestatic d : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)Z
    //   138: ifne -> 158
    //   141: aload #11
    //   143: aload_1
    //   144: aload_0
    //   145: getfield q1 : Landroidx/constraintlayout/solver/widgets/analyzer/b$a;
    //   148: getstatic androidx/constraintlayout/solver/widgets/analyzer/b$a.a : I
    //   151: invokestatic F1 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;Landroidx/constraintlayout/solver/widgets/analyzer/b$b;Landroidx/constraintlayout/solver/widgets/analyzer/b$a;I)Z
    //   154: pop
    //   155: goto -> 158
    //   158: aload #11
    //   160: instanceof androidx/constraintlayout/solver/widgets/f
    //   163: istore #12
    //   165: aload #6
    //   167: astore #13
    //   169: aload #7
    //   171: astore #14
    //   173: iload #12
    //   175: ifeq -> 274
    //   178: aload #11
    //   180: checkcast androidx/constraintlayout/solver/widgets/f
    //   183: astore #15
    //   185: aload #7
    //   187: astore #16
    //   189: aload #15
    //   191: invokevirtual f1 : ()I
    //   194: ifne -> 223
    //   197: aload #7
    //   199: astore #16
    //   201: aload #7
    //   203: ifnonnull -> 215
    //   206: new java/util/ArrayList
    //   209: dup
    //   210: invokespecial <init> : ()V
    //   213: astore #16
    //   215: aload #16
    //   217: aload #15
    //   219: invokevirtual add : (Ljava/lang/Object;)Z
    //   222: pop
    //   223: aload #6
    //   225: astore #13
    //   227: aload #16
    //   229: astore #14
    //   231: aload #15
    //   233: invokevirtual f1 : ()I
    //   236: iconst_1
    //   237: if_icmpne -> 274
    //   240: aload #6
    //   242: astore #7
    //   244: aload #6
    //   246: ifnonnull -> 258
    //   249: new java/util/ArrayList
    //   252: dup
    //   253: invokespecial <init> : ()V
    //   256: astore #7
    //   258: aload #7
    //   260: aload #15
    //   262: invokevirtual add : (Ljava/lang/Object;)Z
    //   265: pop
    //   266: aload #16
    //   268: astore #14
    //   270: aload #7
    //   272: astore #13
    //   274: aload #5
    //   276: astore #7
    //   278: aload #8
    //   280: astore #16
    //   282: aload #11
    //   284: instanceof androidx/constraintlayout/solver/widgets/h
    //   287: ifeq -> 452
    //   290: aload #11
    //   292: instanceof androidx/constraintlayout/solver/widgets/a
    //   295: ifeq -> 393
    //   298: aload #11
    //   300: checkcast androidx/constraintlayout/solver/widgets/a
    //   303: astore #15
    //   305: aload #5
    //   307: astore #6
    //   309: aload #15
    //   311: invokevirtual k1 : ()I
    //   314: ifne -> 343
    //   317: aload #5
    //   319: astore #6
    //   321: aload #5
    //   323: ifnonnull -> 335
    //   326: new java/util/ArrayList
    //   329: dup
    //   330: invokespecial <init> : ()V
    //   333: astore #6
    //   335: aload #6
    //   337: aload #15
    //   339: invokevirtual add : (Ljava/lang/Object;)Z
    //   342: pop
    //   343: aload #6
    //   345: astore #7
    //   347: aload #8
    //   349: astore #16
    //   351: aload #15
    //   353: invokevirtual k1 : ()I
    //   356: iconst_1
    //   357: if_icmpne -> 452
    //   360: aload #8
    //   362: astore #16
    //   364: aload #8
    //   366: ifnonnull -> 378
    //   369: new java/util/ArrayList
    //   372: dup
    //   373: invokespecial <init> : ()V
    //   376: astore #16
    //   378: aload #16
    //   380: aload #15
    //   382: invokevirtual add : (Ljava/lang/Object;)Z
    //   385: pop
    //   386: aload #6
    //   388: astore #7
    //   390: goto -> 452
    //   393: aload #11
    //   395: checkcast androidx/constraintlayout/solver/widgets/h
    //   398: astore #6
    //   400: aload #5
    //   402: astore #7
    //   404: aload #5
    //   406: ifnonnull -> 418
    //   409: new java/util/ArrayList
    //   412: dup
    //   413: invokespecial <init> : ()V
    //   416: astore #7
    //   418: aload #7
    //   420: aload #6
    //   422: invokevirtual add : (Ljava/lang/Object;)Z
    //   425: pop
    //   426: aload #8
    //   428: astore #16
    //   430: aload #8
    //   432: ifnonnull -> 444
    //   435: new java/util/ArrayList
    //   438: dup
    //   439: invokespecial <init> : ()V
    //   442: astore #16
    //   444: aload #16
    //   446: aload #6
    //   448: invokevirtual add : (Ljava/lang/Object;)Z
    //   451: pop
    //   452: aload #9
    //   454: astore #15
    //   456: aload #11
    //   458: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   461: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   464: ifnonnull -> 533
    //   467: aload #9
    //   469: astore #15
    //   471: aload #11
    //   473: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   476: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   479: ifnonnull -> 533
    //   482: aload #9
    //   484: astore #15
    //   486: iload #12
    //   488: ifne -> 533
    //   491: aload #9
    //   493: astore #15
    //   495: aload #11
    //   497: instanceof androidx/constraintlayout/solver/widgets/a
    //   500: ifne -> 533
    //   503: aload #9
    //   505: astore #5
    //   507: aload #9
    //   509: ifnonnull -> 521
    //   512: new java/util/ArrayList
    //   515: dup
    //   516: invokespecial <init> : ()V
    //   519: astore #5
    //   521: aload #5
    //   523: aload #11
    //   525: invokevirtual add : (Ljava/lang/Object;)Z
    //   528: pop
    //   529: aload #5
    //   531: astore #15
    //   533: aload #10
    //   535: astore #17
    //   537: aload #11
    //   539: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   542: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   545: ifnonnull -> 629
    //   548: aload #10
    //   550: astore #17
    //   552: aload #11
    //   554: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   557: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   560: ifnonnull -> 629
    //   563: aload #10
    //   565: astore #17
    //   567: aload #11
    //   569: getfield O : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   572: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   575: ifnonnull -> 629
    //   578: aload #10
    //   580: astore #17
    //   582: iload #12
    //   584: ifne -> 629
    //   587: aload #10
    //   589: astore #17
    //   591: aload #11
    //   593: instanceof androidx/constraintlayout/solver/widgets/a
    //   596: ifne -> 629
    //   599: aload #10
    //   601: astore #5
    //   603: aload #10
    //   605: ifnonnull -> 617
    //   608: new java/util/ArrayList
    //   611: dup
    //   612: invokespecial <init> : ()V
    //   615: astore #5
    //   617: aload #5
    //   619: aload #11
    //   621: invokevirtual add : (Ljava/lang/Object;)Z
    //   624: pop
    //   625: aload #5
    //   627: astore #17
    //   629: iinc #4, 1
    //   632: aload #13
    //   634: astore #6
    //   636: aload #7
    //   638: astore #5
    //   640: aload #14
    //   642: astore #7
    //   644: aload #16
    //   646: astore #8
    //   648: aload #15
    //   650: astore #9
    //   652: aload #17
    //   654: astore #10
    //   656: goto -> 100
    //   659: new java/util/ArrayList
    //   662: dup
    //   663: invokespecial <init> : ()V
    //   666: astore #16
    //   668: aload #6
    //   670: ifnull -> 708
    //   673: aload #6
    //   675: invokevirtual iterator : ()Ljava/util/Iterator;
    //   678: astore_1
    //   679: aload_1
    //   680: invokeinterface hasNext : ()Z
    //   685: ifeq -> 708
    //   688: aload_1
    //   689: invokeinterface next : ()Ljava/lang/Object;
    //   694: checkcast androidx/constraintlayout/solver/widgets/f
    //   697: iconst_0
    //   698: aload #16
    //   700: aconst_null
    //   701: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   704: pop
    //   705: goto -> 679
    //   708: aload #5
    //   710: ifnull -> 770
    //   713: aload #5
    //   715: invokevirtual iterator : ()Ljava/util/Iterator;
    //   718: astore_1
    //   719: aload_1
    //   720: invokeinterface hasNext : ()Z
    //   725: ifeq -> 770
    //   728: aload_1
    //   729: invokeinterface next : ()Ljava/lang/Object;
    //   734: checkcast androidx/constraintlayout/solver/widgets/h
    //   737: astore #5
    //   739: aload #5
    //   741: iconst_0
    //   742: aload #16
    //   744: aconst_null
    //   745: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   748: astore #6
    //   750: aload #5
    //   752: aload #16
    //   754: iconst_0
    //   755: aload #6
    //   757: invokevirtual e1 : (Ljava/util/ArrayList;ILandroidx/constraintlayout/solver/widgets/analyzer/n;)V
    //   760: aload #6
    //   762: aload #16
    //   764: invokevirtual b : (Ljava/util/ArrayList;)V
    //   767: goto -> 719
    //   770: aload_0
    //   771: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   774: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   777: astore_1
    //   778: aload_1
    //   779: invokevirtual d : ()Ljava/util/HashSet;
    //   782: ifnull -> 825
    //   785: aload_1
    //   786: invokevirtual d : ()Ljava/util/HashSet;
    //   789: invokevirtual iterator : ()Ljava/util/Iterator;
    //   792: astore_1
    //   793: aload_1
    //   794: invokeinterface hasNext : ()Z
    //   799: ifeq -> 825
    //   802: aload_1
    //   803: invokeinterface next : ()Ljava/lang/Object;
    //   808: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   811: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   814: iconst_0
    //   815: aload #16
    //   817: aconst_null
    //   818: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   821: pop
    //   822: goto -> 793
    //   825: aload_0
    //   826: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   829: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   832: astore_1
    //   833: aload_1
    //   834: invokevirtual d : ()Ljava/util/HashSet;
    //   837: ifnull -> 880
    //   840: aload_1
    //   841: invokevirtual d : ()Ljava/util/HashSet;
    //   844: invokevirtual iterator : ()Ljava/util/Iterator;
    //   847: astore_1
    //   848: aload_1
    //   849: invokeinterface hasNext : ()Z
    //   854: ifeq -> 880
    //   857: aload_1
    //   858: invokeinterface next : ()Ljava/lang/Object;
    //   863: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   866: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   869: iconst_0
    //   870: aload #16
    //   872: aconst_null
    //   873: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   876: pop
    //   877: goto -> 848
    //   880: aload_0
    //   881: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.h : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   884: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   887: astore_1
    //   888: aload_1
    //   889: invokevirtual d : ()Ljava/util/HashSet;
    //   892: ifnull -> 935
    //   895: aload_1
    //   896: invokevirtual d : ()Ljava/util/HashSet;
    //   899: invokevirtual iterator : ()Ljava/util/Iterator;
    //   902: astore_1
    //   903: aload_1
    //   904: invokeinterface hasNext : ()Z
    //   909: ifeq -> 935
    //   912: aload_1
    //   913: invokeinterface next : ()Ljava/lang/Object;
    //   918: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   921: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   924: iconst_0
    //   925: aload #16
    //   927: aconst_null
    //   928: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   931: pop
    //   932: goto -> 903
    //   935: aload #9
    //   937: ifnull -> 975
    //   940: aload #9
    //   942: invokevirtual iterator : ()Ljava/util/Iterator;
    //   945: astore_1
    //   946: aload_1
    //   947: invokeinterface hasNext : ()Z
    //   952: ifeq -> 975
    //   955: aload_1
    //   956: invokeinterface next : ()Ljava/lang/Object;
    //   961: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   964: iconst_0
    //   965: aload #16
    //   967: aconst_null
    //   968: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   971: pop
    //   972: goto -> 946
    //   975: aload #7
    //   977: ifnull -> 1015
    //   980: aload #7
    //   982: invokevirtual iterator : ()Ljava/util/Iterator;
    //   985: astore_1
    //   986: aload_1
    //   987: invokeinterface hasNext : ()Z
    //   992: ifeq -> 1015
    //   995: aload_1
    //   996: invokeinterface next : ()Ljava/lang/Object;
    //   1001: checkcast androidx/constraintlayout/solver/widgets/f
    //   1004: iconst_1
    //   1005: aload #16
    //   1007: aconst_null
    //   1008: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1011: pop
    //   1012: goto -> 986
    //   1015: aload #8
    //   1017: ifnull -> 1077
    //   1020: aload #8
    //   1022: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1025: astore #5
    //   1027: aload #5
    //   1029: invokeinterface hasNext : ()Z
    //   1034: ifeq -> 1077
    //   1037: aload #5
    //   1039: invokeinterface next : ()Ljava/lang/Object;
    //   1044: checkcast androidx/constraintlayout/solver/widgets/h
    //   1047: astore #8
    //   1049: aload #8
    //   1051: iconst_1
    //   1052: aload #16
    //   1054: aconst_null
    //   1055: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1058: astore_1
    //   1059: aload #8
    //   1061: aload #16
    //   1063: iconst_1
    //   1064: aload_1
    //   1065: invokevirtual e1 : (Ljava/util/ArrayList;ILandroidx/constraintlayout/solver/widgets/analyzer/n;)V
    //   1068: aload_1
    //   1069: aload #16
    //   1071: invokevirtual b : (Ljava/util/ArrayList;)V
    //   1074: goto -> 1027
    //   1077: aload_0
    //   1078: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1081: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1084: astore_1
    //   1085: aload_1
    //   1086: invokevirtual d : ()Ljava/util/HashSet;
    //   1089: ifnull -> 1132
    //   1092: aload_1
    //   1093: invokevirtual d : ()Ljava/util/HashSet;
    //   1096: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1099: astore_1
    //   1100: aload_1
    //   1101: invokeinterface hasNext : ()Z
    //   1106: ifeq -> 1132
    //   1109: aload_1
    //   1110: invokeinterface next : ()Ljava/lang/Object;
    //   1115: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   1118: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1121: iconst_1
    //   1122: aload #16
    //   1124: aconst_null
    //   1125: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1128: pop
    //   1129: goto -> 1100
    //   1132: aload_0
    //   1133: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.g : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1136: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1139: astore_1
    //   1140: aload_1
    //   1141: invokevirtual d : ()Ljava/util/HashSet;
    //   1144: ifnull -> 1187
    //   1147: aload_1
    //   1148: invokevirtual d : ()Ljava/util/HashSet;
    //   1151: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1154: astore_1
    //   1155: aload_1
    //   1156: invokeinterface hasNext : ()Z
    //   1161: ifeq -> 1187
    //   1164: aload_1
    //   1165: invokeinterface next : ()Ljava/lang/Object;
    //   1170: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   1173: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1176: iconst_1
    //   1177: aload #16
    //   1179: aconst_null
    //   1180: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1183: pop
    //   1184: goto -> 1155
    //   1187: aload_0
    //   1188: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1191: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1194: astore_1
    //   1195: aload_1
    //   1196: invokevirtual d : ()Ljava/util/HashSet;
    //   1199: ifnull -> 1242
    //   1202: aload_1
    //   1203: invokevirtual d : ()Ljava/util/HashSet;
    //   1206: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1209: astore_1
    //   1210: aload_1
    //   1211: invokeinterface hasNext : ()Z
    //   1216: ifeq -> 1242
    //   1219: aload_1
    //   1220: invokeinterface next : ()Ljava/lang/Object;
    //   1225: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   1228: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1231: iconst_1
    //   1232: aload #16
    //   1234: aconst_null
    //   1235: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1238: pop
    //   1239: goto -> 1210
    //   1242: aload_0
    //   1243: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.h : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   1246: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1249: astore_1
    //   1250: aload_1
    //   1251: invokevirtual d : ()Ljava/util/HashSet;
    //   1254: ifnull -> 1297
    //   1257: aload_1
    //   1258: invokevirtual d : ()Ljava/util/HashSet;
    //   1261: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1264: astore_1
    //   1265: aload_1
    //   1266: invokeinterface hasNext : ()Z
    //   1271: ifeq -> 1297
    //   1274: aload_1
    //   1275: invokeinterface next : ()Ljava/lang/Object;
    //   1280: checkcast androidx/constraintlayout/solver/widgets/ConstraintAnchor
    //   1283: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1286: iconst_1
    //   1287: aload #16
    //   1289: aconst_null
    //   1290: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1293: pop
    //   1294: goto -> 1265
    //   1297: aload #10
    //   1299: ifnull -> 1337
    //   1302: aload #10
    //   1304: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1307: astore_1
    //   1308: aload_1
    //   1309: invokeinterface hasNext : ()Z
    //   1314: ifeq -> 1337
    //   1317: aload_1
    //   1318: invokeinterface next : ()Ljava/lang/Object;
    //   1323: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   1326: iconst_1
    //   1327: aload #16
    //   1329: aconst_null
    //   1330: invokestatic a : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget;ILjava/util/ArrayList;Landroidx/constraintlayout/solver/widgets/analyzer/n;)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1333: pop
    //   1334: goto -> 1308
    //   1337: iconst_0
    //   1338: istore #4
    //   1340: iload #4
    //   1342: iload_3
    //   1343: if_icmpge -> 1423
    //   1346: aload_2
    //   1347: iload #4
    //   1349: invokevirtual get : (I)Ljava/lang/Object;
    //   1352: checkcast androidx/constraintlayout/solver/widgets/ConstraintWidget
    //   1355: astore #5
    //   1357: aload #5
    //   1359: invokevirtual j0 : ()Z
    //   1362: ifeq -> 1417
    //   1365: aload #16
    //   1367: aload #5
    //   1369: getfield L0 : I
    //   1372: invokestatic b : (Ljava/util/ArrayList;I)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1375: astore_1
    //   1376: aload #16
    //   1378: aload #5
    //   1380: getfield M0 : I
    //   1383: invokestatic b : (Ljava/util/ArrayList;I)Landroidx/constraintlayout/solver/widgets/analyzer/n;
    //   1386: astore #5
    //   1388: aload_1
    //   1389: ifnull -> 1417
    //   1392: aload #5
    //   1394: ifnull -> 1417
    //   1397: aload_1
    //   1398: iconst_0
    //   1399: aload #5
    //   1401: invokevirtual g : (ILandroidx/constraintlayout/solver/widgets/analyzer/n;)V
    //   1404: aload #5
    //   1406: iconst_2
    //   1407: invokevirtual i : (I)V
    //   1410: aload #16
    //   1412: aload_1
    //   1413: invokevirtual remove : (Ljava/lang/Object;)Z
    //   1416: pop
    //   1417: iinc #4, 1
    //   1420: goto -> 1340
    //   1423: aload #16
    //   1425: invokevirtual size : ()I
    //   1428: iconst_1
    //   1429: if_icmpgt -> 1434
    //   1432: iconst_0
    //   1433: ireturn
    //   1434: aload_0
    //   1435: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1438: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1441: if_acmpne -> 1550
    //   1444: aload #16
    //   1446: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1449: astore #8
    //   1451: iconst_0
    //   1452: istore #4
    //   1454: aconst_null
    //   1455: astore_1
    //   1456: aload #8
    //   1458: invokeinterface hasNext : ()Z
    //   1463: ifeq -> 1522
    //   1466: aload #8
    //   1468: invokeinterface next : ()Ljava/lang/Object;
    //   1473: checkcast androidx/constraintlayout/solver/widgets/analyzer/n
    //   1476: astore #5
    //   1478: aload #5
    //   1480: invokevirtual d : ()I
    //   1483: iconst_1
    //   1484: if_icmpne -> 1490
    //   1487: goto -> 1456
    //   1490: aload #5
    //   1492: iconst_0
    //   1493: invokevirtual h : (Z)V
    //   1496: aload #5
    //   1498: aload_0
    //   1499: invokevirtual x1 : ()Landroidx/constraintlayout/solver/d;
    //   1502: iconst_0
    //   1503: invokevirtual f : (Landroidx/constraintlayout/solver/d;I)I
    //   1506: istore_3
    //   1507: iload_3
    //   1508: iload #4
    //   1510: if_icmple -> 1456
    //   1513: aload #5
    //   1515: astore_1
    //   1516: iload_3
    //   1517: istore #4
    //   1519: goto -> 1456
    //   1522: aload_1
    //   1523: ifnull -> 1550
    //   1526: aload_0
    //   1527: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1530: invokevirtual D0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1533: aload_0
    //   1534: iload #4
    //   1536: invokevirtual Y0 : (I)V
    //   1539: aload_1
    //   1540: iconst_1
    //   1541: invokevirtual h : (Z)V
    //   1544: aload_1
    //   1545: astore #5
    //   1547: goto -> 1553
    //   1550: aconst_null
    //   1551: astore #5
    //   1553: aload_0
    //   1554: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1557: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1560: if_acmpne -> 1667
    //   1563: aload #16
    //   1565: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1568: astore #7
    //   1570: aconst_null
    //   1571: astore_1
    //   1572: iconst_0
    //   1573: istore #4
    //   1575: aload #7
    //   1577: invokeinterface hasNext : ()Z
    //   1582: ifeq -> 1640
    //   1585: aload #7
    //   1587: invokeinterface next : ()Ljava/lang/Object;
    //   1592: checkcast androidx/constraintlayout/solver/widgets/analyzer/n
    //   1595: astore #8
    //   1597: aload #8
    //   1599: invokevirtual d : ()I
    //   1602: ifne -> 1608
    //   1605: goto -> 1575
    //   1608: aload #8
    //   1610: iconst_0
    //   1611: invokevirtual h : (Z)V
    //   1614: aload #8
    //   1616: aload_0
    //   1617: invokevirtual x1 : ()Landroidx/constraintlayout/solver/d;
    //   1620: iconst_1
    //   1621: invokevirtual f : (Landroidx/constraintlayout/solver/d;I)I
    //   1624: istore_3
    //   1625: iload_3
    //   1626: iload #4
    //   1628: if_icmple -> 1575
    //   1631: aload #8
    //   1633: astore_1
    //   1634: iload_3
    //   1635: istore #4
    //   1637: goto -> 1575
    //   1640: aload_1
    //   1641: ifnull -> 1667
    //   1644: aload_0
    //   1645: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1648: invokevirtual U0 : (Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;)V
    //   1651: aload_0
    //   1652: iload #4
    //   1654: invokevirtual z0 : (I)V
    //   1657: aload_1
    //   1658: iconst_1
    //   1659: invokevirtual h : (Z)V
    //   1662: aload_1
    //   1663: astore_0
    //   1664: goto -> 1669
    //   1667: aconst_null
    //   1668: astore_0
    //   1669: aload #5
    //   1671: ifnonnull -> 1687
    //   1674: aload_0
    //   1675: ifnull -> 1681
    //   1678: goto -> 1687
    //   1681: iconst_0
    //   1682: istore #12
    //   1684: goto -> 1690
    //   1687: iconst_1
    //   1688: istore #12
    //   1690: iload #12
    //   1692: ireturn
    //   1693: goto -> 1698
    //   1696: aconst_null
    //   1697: athrow
    //   1698: goto -> 1696
  }
  
  public static boolean d(ConstraintWidget.DimensionBehaviour paramDimensionBehaviour1, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour2, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour3, ConstraintWidget.DimensionBehaviour paramDimensionBehaviour4) {
    // Byte code:
    //   0: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   3: astore #4
    //   5: aload_2
    //   6: aload #4
    //   8: if_acmpeq -> 44
    //   11: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   14: astore #5
    //   16: aload_2
    //   17: aload #5
    //   19: if_acmpeq -> 44
    //   22: aload_2
    //   23: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   26: if_acmpne -> 38
    //   29: aload_0
    //   30: aload #5
    //   32: if_acmpeq -> 38
    //   35: goto -> 44
    //   38: iconst_0
    //   39: istore #6
    //   41: goto -> 47
    //   44: iconst_1
    //   45: istore #6
    //   47: aload_3
    //   48: aload #4
    //   50: if_acmpeq -> 83
    //   53: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.c : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   56: astore_0
    //   57: aload_3
    //   58: aload_0
    //   59: if_acmpeq -> 83
    //   62: aload_3
    //   63: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.e : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   66: if_acmpne -> 77
    //   69: aload_1
    //   70: aload_0
    //   71: if_acmpeq -> 77
    //   74: goto -> 83
    //   77: iconst_0
    //   78: istore #7
    //   80: goto -> 86
    //   83: iconst_1
    //   84: istore #7
    //   86: iload #6
    //   88: ifne -> 101
    //   91: iload #7
    //   93: ifeq -> 99
    //   96: goto -> 101
    //   99: iconst_0
    //   100: ireturn
    //   101: iconst_1
    //   102: ireturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */