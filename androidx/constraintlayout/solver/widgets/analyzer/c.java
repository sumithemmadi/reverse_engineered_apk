package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.d;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends WidgetRun {
  ArrayList<WidgetRun> k = new ArrayList<WidgetRun>();
  
  private int l;
  
  public c(ConstraintWidget paramConstraintWidget, int paramInt) {
    super(paramConstraintWidget);
    this.f = paramInt;
    q();
  }
  
  private void q() {
    int i;
    ConstraintWidget constraintWidget1 = this.b;
    ConstraintWidget constraintWidget2;
    for (constraintWidget2 = constraintWidget1.M(this.f); constraintWidget2 != null; constraintWidget2 = constraintWidget) {
      ConstraintWidget constraintWidget = constraintWidget2.M(this.f);
      constraintWidget1 = constraintWidget2;
    } 
    this.b = constraintWidget1;
    this.k.add(constraintWidget1.O(this.f));
    for (constraintWidget2 = constraintWidget1.K(this.f); constraintWidget2 != null; constraintWidget2 = constraintWidget2.K(this.f))
      this.k.add(constraintWidget2.O(this.f)); 
    for (WidgetRun widgetRun : this.k) {
      i = this.f;
      if (i == 0) {
        widgetRun.b.d = this;
        continue;
      } 
      if (i == 1)
        widgetRun.b.e = this; 
    } 
    if (this.f == 0 && ((d)this.b.L()).C1()) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i && this.k.size() > 1) {
      ArrayList<WidgetRun> arrayList = this.k;
      this.b = ((WidgetRun)arrayList.get(arrayList.size() - 1)).b;
    } 
    if (this.f == 0) {
      i = this.b.A();
    } else {
      i = this.b.Q();
    } 
    this.l = i;
  }
  
  private ConstraintWidget r() {
    for (byte b = 0; b < this.k.size(); b++) {
      WidgetRun widgetRun = this.k.get(b);
      if (widgetRun.b.T() != 8)
        return widgetRun.b; 
    } 
    return null;
  }
  
  private ConstraintWidget s() {
    for (int i = this.k.size() - 1; i >= 0; i--) {
      WidgetRun widgetRun = this.k.get(i);
      if (widgetRun.b.T() != 8)
        return widgetRun.b; 
    } 
    return null;
  }
  
  public void a(d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   4: getfield j : Z
    //   7: ifeq -> 2478
    //   10: aload_0
    //   11: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   14: getfield j : Z
    //   17: ifne -> 23
    //   20: goto -> 2478
    //   23: aload_0
    //   24: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   27: invokevirtual L : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   30: astore_1
    //   31: aload_1
    //   32: ifnull -> 53
    //   35: aload_1
    //   36: instanceof androidx/constraintlayout/solver/widgets/d
    //   39: ifeq -> 53
    //   42: aload_1
    //   43: checkcast androidx/constraintlayout/solver/widgets/d
    //   46: invokevirtual C1 : ()Z
    //   49: istore_2
    //   50: goto -> 55
    //   53: iconst_0
    //   54: istore_2
    //   55: aload_0
    //   56: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   59: getfield g : I
    //   62: aload_0
    //   63: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   66: getfield g : I
    //   69: isub
    //   70: istore_3
    //   71: aload_0
    //   72: getfield k : Ljava/util/ArrayList;
    //   75: invokevirtual size : ()I
    //   78: istore #4
    //   80: iconst_0
    //   81: istore #5
    //   83: iconst_m1
    //   84: istore #6
    //   86: iload #5
    //   88: iload #4
    //   90: if_icmpge -> 126
    //   93: iload #5
    //   95: istore #7
    //   97: aload_0
    //   98: getfield k : Ljava/util/ArrayList;
    //   101: iload #5
    //   103: invokevirtual get : (I)Ljava/lang/Object;
    //   106: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   109: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   112: invokevirtual T : ()I
    //   115: bipush #8
    //   117: if_icmpne -> 129
    //   120: iinc #5, 1
    //   123: goto -> 83
    //   126: iconst_m1
    //   127: istore #7
    //   129: iload #4
    //   131: iconst_1
    //   132: isub
    //   133: istore #8
    //   135: iload #8
    //   137: istore #5
    //   139: iload #6
    //   141: istore #9
    //   143: iload #5
    //   145: iflt -> 181
    //   148: aload_0
    //   149: getfield k : Ljava/util/ArrayList;
    //   152: iload #5
    //   154: invokevirtual get : (I)Ljava/lang/Object;
    //   157: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   160: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   163: invokevirtual T : ()I
    //   166: bipush #8
    //   168: if_icmpne -> 177
    //   171: iinc #5, -1
    //   174: goto -> 139
    //   177: iload #5
    //   179: istore #9
    //   181: iconst_0
    //   182: istore #10
    //   184: iload #10
    //   186: iconst_2
    //   187: if_icmpge -> 616
    //   190: iconst_0
    //   191: istore #11
    //   193: iconst_0
    //   194: istore #12
    //   196: iconst_0
    //   197: istore #5
    //   199: iconst_0
    //   200: istore #6
    //   202: fconst_0
    //   203: fstore #13
    //   205: iload #11
    //   207: iload #4
    //   209: if_icmpge -> 585
    //   212: aload_0
    //   213: getfield k : Ljava/util/ArrayList;
    //   216: iload #11
    //   218: invokevirtual get : (I)Ljava/lang/Object;
    //   221: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   224: astore #14
    //   226: aload #14
    //   228: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   231: invokevirtual T : ()I
    //   234: bipush #8
    //   236: if_icmpne -> 246
    //   239: iload #5
    //   241: istore #15
    //   243: goto -> 575
    //   246: iload #6
    //   248: iconst_1
    //   249: iadd
    //   250: istore #16
    //   252: iload #12
    //   254: istore #6
    //   256: iload #11
    //   258: ifle -> 285
    //   261: iload #12
    //   263: istore #6
    //   265: iload #11
    //   267: iload #7
    //   269: if_icmplt -> 285
    //   272: iload #12
    //   274: aload #14
    //   276: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   279: getfield f : I
    //   282: iadd
    //   283: istore #6
    //   285: aload #14
    //   287: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   290: astore_1
    //   291: aload_1
    //   292: getfield g : I
    //   295: istore #17
    //   297: aload #14
    //   299: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   302: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   305: if_acmpeq -> 314
    //   308: iconst_1
    //   309: istore #12
    //   311: goto -> 317
    //   314: iconst_0
    //   315: istore #12
    //   317: iload #12
    //   319: ifeq -> 378
    //   322: aload_0
    //   323: getfield f : I
    //   326: istore #15
    //   328: iload #15
    //   330: ifne -> 351
    //   333: aload #14
    //   335: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   338: getfield f : Landroidx/constraintlayout/solver/widgets/analyzer/k;
    //   341: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   344: getfield j : Z
    //   347: ifne -> 351
    //   350: return
    //   351: iload #15
    //   353: iconst_1
    //   354: if_icmpne -> 375
    //   357: aload #14
    //   359: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   362: getfield g : Landroidx/constraintlayout/solver/widgets/analyzer/m;
    //   365: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   368: getfield j : Z
    //   371: ifne -> 375
    //   374: return
    //   375: goto -> 429
    //   378: aload #14
    //   380: getfield a : I
    //   383: iconst_1
    //   384: if_icmpne -> 404
    //   387: iload #10
    //   389: ifne -> 404
    //   392: aload_1
    //   393: getfield m : I
    //   396: istore #12
    //   398: iinc #5, 1
    //   401: goto -> 415
    //   404: aload_1
    //   405: getfield j : Z
    //   408: ifeq -> 429
    //   411: iload #17
    //   413: istore #12
    //   415: iconst_1
    //   416: istore #15
    //   418: iload #12
    //   420: istore #17
    //   422: iload #15
    //   424: istore #12
    //   426: goto -> 429
    //   429: iload #12
    //   431: ifne -> 492
    //   434: iload #5
    //   436: iconst_1
    //   437: iadd
    //   438: istore #12
    //   440: aload #14
    //   442: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   445: getfield G0 : [F
    //   448: aload_0
    //   449: getfield f : I
    //   452: faload
    //   453: fstore #18
    //   455: iload #6
    //   457: istore #17
    //   459: iload #12
    //   461: istore #5
    //   463: fload #13
    //   465: fstore #19
    //   467: fload #18
    //   469: fconst_0
    //   470: fcmpl
    //   471: iflt -> 503
    //   474: fload #13
    //   476: fload #18
    //   478: fadd
    //   479: fstore #19
    //   481: iload #6
    //   483: istore #17
    //   485: iload #12
    //   487: istore #5
    //   489: goto -> 503
    //   492: iload #6
    //   494: iload #17
    //   496: iadd
    //   497: istore #17
    //   499: fload #13
    //   501: fstore #19
    //   503: iload #17
    //   505: istore #12
    //   507: iload #5
    //   509: istore #15
    //   511: iload #16
    //   513: istore #6
    //   515: fload #19
    //   517: fstore #13
    //   519: iload #11
    //   521: iload #8
    //   523: if_icmpge -> 575
    //   526: iload #17
    //   528: istore #12
    //   530: iload #5
    //   532: istore #15
    //   534: iload #16
    //   536: istore #6
    //   538: fload #19
    //   540: fstore #13
    //   542: iload #11
    //   544: iload #9
    //   546: if_icmpge -> 575
    //   549: iload #17
    //   551: aload #14
    //   553: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   556: getfield f : I
    //   559: ineg
    //   560: iadd
    //   561: istore #12
    //   563: fload #19
    //   565: fstore #13
    //   567: iload #16
    //   569: istore #6
    //   571: iload #5
    //   573: istore #15
    //   575: iinc #11, 1
    //   578: iload #15
    //   580: istore #5
    //   582: goto -> 205
    //   585: iload #12
    //   587: iload_3
    //   588: if_icmplt -> 605
    //   591: iload #5
    //   593: ifne -> 599
    //   596: goto -> 605
    //   599: iinc #10, 1
    //   602: goto -> 184
    //   605: iload #6
    //   607: istore #17
    //   609: iload #5
    //   611: istore #6
    //   613: goto -> 628
    //   616: iconst_0
    //   617: istore #17
    //   619: iconst_0
    //   620: istore #12
    //   622: iconst_0
    //   623: istore #6
    //   625: fconst_0
    //   626: fstore #13
    //   628: aload_0
    //   629: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   632: getfield g : I
    //   635: istore #10
    //   637: iload_2
    //   638: ifeq -> 650
    //   641: aload_0
    //   642: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   645: getfield g : I
    //   648: istore #10
    //   650: iload #10
    //   652: istore #5
    //   654: iload #12
    //   656: iload_3
    //   657: if_icmple -> 699
    //   660: iload_2
    //   661: ifeq -> 683
    //   664: iload #10
    //   666: iload #12
    //   668: iload_3
    //   669: isub
    //   670: i2f
    //   671: fconst_2
    //   672: fdiv
    //   673: ldc 0.5
    //   675: fadd
    //   676: f2i
    //   677: iadd
    //   678: istore #5
    //   680: goto -> 699
    //   683: iload #10
    //   685: iload #12
    //   687: iload_3
    //   688: isub
    //   689: i2f
    //   690: fconst_2
    //   691: fdiv
    //   692: ldc 0.5
    //   694: fadd
    //   695: f2i
    //   696: isub
    //   697: istore #5
    //   699: iload #6
    //   701: ifle -> 1261
    //   704: iload_3
    //   705: iload #12
    //   707: isub
    //   708: i2f
    //   709: fstore #19
    //   711: fload #19
    //   713: iload #6
    //   715: i2f
    //   716: fdiv
    //   717: ldc 0.5
    //   719: fadd
    //   720: f2i
    //   721: istore #15
    //   723: iconst_0
    //   724: istore #20
    //   726: iconst_0
    //   727: istore #11
    //   729: iload #12
    //   731: istore #10
    //   733: iload #11
    //   735: istore #12
    //   737: iload #5
    //   739: istore #11
    //   741: iload #20
    //   743: iload #4
    //   745: if_icmpge -> 1064
    //   748: aload_0
    //   749: getfield k : Ljava/util/ArrayList;
    //   752: iload #20
    //   754: invokevirtual get : (I)Ljava/lang/Object;
    //   757: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   760: astore #14
    //   762: aload #14
    //   764: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   767: invokevirtual T : ()I
    //   770: bipush #8
    //   772: if_icmpne -> 778
    //   775: goto -> 1058
    //   778: aload #14
    //   780: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   783: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   786: if_acmpne -> 1058
    //   789: aload #14
    //   791: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   794: astore_1
    //   795: aload_1
    //   796: getfield j : Z
    //   799: ifne -> 1058
    //   802: fload #13
    //   804: fconst_0
    //   805: fcmpl
    //   806: ifle -> 837
    //   809: aload #14
    //   811: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   814: getfield G0 : [F
    //   817: aload_0
    //   818: getfield f : I
    //   821: faload
    //   822: fload #19
    //   824: fmul
    //   825: fload #13
    //   827: fdiv
    //   828: ldc 0.5
    //   830: fadd
    //   831: f2i
    //   832: istore #5
    //   834: goto -> 841
    //   837: iload #15
    //   839: istore #5
    //   841: aload_0
    //   842: getfield f : I
    //   845: ifne -> 941
    //   848: aload #14
    //   850: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   853: astore #21
    //   855: aload #21
    //   857: getfield u : I
    //   860: istore #22
    //   862: aload #21
    //   864: getfield t : I
    //   867: istore #23
    //   869: aload #14
    //   871: getfield a : I
    //   874: iconst_1
    //   875: if_icmpne -> 892
    //   878: iload #5
    //   880: aload_1
    //   881: getfield m : I
    //   884: invokestatic min : (II)I
    //   887: istore #16
    //   889: goto -> 896
    //   892: iload #5
    //   894: istore #16
    //   896: iload #23
    //   898: iload #16
    //   900: invokestatic max : (II)I
    //   903: istore #23
    //   905: iload #23
    //   907: istore #16
    //   909: iload #22
    //   911: ifle -> 923
    //   914: iload #22
    //   916: iload #23
    //   918: invokestatic min : (II)I
    //   921: istore #16
    //   923: iload #5
    //   925: istore #22
    //   927: iload #12
    //   929: istore #23
    //   931: iload #16
    //   933: iload #5
    //   935: if_icmpeq -> 1041
    //   938: goto -> 1031
    //   941: aload #14
    //   943: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   946: astore #21
    //   948: aload #21
    //   950: getfield x : I
    //   953: istore #22
    //   955: aload #21
    //   957: getfield w : I
    //   960: istore #23
    //   962: aload #14
    //   964: getfield a : I
    //   967: iconst_1
    //   968: if_icmpne -> 985
    //   971: iload #5
    //   973: aload_1
    //   974: getfield m : I
    //   977: invokestatic min : (II)I
    //   980: istore #16
    //   982: goto -> 989
    //   985: iload #5
    //   987: istore #16
    //   989: iload #23
    //   991: iload #16
    //   993: invokestatic max : (II)I
    //   996: istore #23
    //   998: iload #23
    //   1000: istore #16
    //   1002: iload #22
    //   1004: ifle -> 1016
    //   1007: iload #22
    //   1009: iload #23
    //   1011: invokestatic min : (II)I
    //   1014: istore #16
    //   1016: iload #5
    //   1018: istore #22
    //   1020: iload #12
    //   1022: istore #23
    //   1024: iload #16
    //   1026: iload #5
    //   1028: if_icmpeq -> 1041
    //   1031: iload #12
    //   1033: iconst_1
    //   1034: iadd
    //   1035: istore #23
    //   1037: iload #16
    //   1039: istore #22
    //   1041: aload #14
    //   1043: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1046: iload #22
    //   1048: invokevirtual d : (I)V
    //   1051: iload #23
    //   1053: istore #12
    //   1055: goto -> 1058
    //   1058: iinc #20, 1
    //   1061: goto -> 741
    //   1064: iload #12
    //   1066: ifle -> 1209
    //   1069: iload #6
    //   1071: iload #12
    //   1073: isub
    //   1074: istore #15
    //   1076: iconst_0
    //   1077: istore #6
    //   1079: iconst_0
    //   1080: istore #5
    //   1082: iload #6
    //   1084: iload #4
    //   1086: if_icmpge -> 1202
    //   1089: aload_0
    //   1090: getfield k : Ljava/util/ArrayList;
    //   1093: iload #6
    //   1095: invokevirtual get : (I)Ljava/lang/Object;
    //   1098: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   1101: astore_1
    //   1102: aload_1
    //   1103: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1106: invokevirtual T : ()I
    //   1109: bipush #8
    //   1111: if_icmpne -> 1117
    //   1114: goto -> 1196
    //   1117: iload #5
    //   1119: istore #10
    //   1121: iload #6
    //   1123: ifle -> 1149
    //   1126: iload #5
    //   1128: istore #10
    //   1130: iload #6
    //   1132: iload #7
    //   1134: if_icmplt -> 1149
    //   1137: iload #5
    //   1139: aload_1
    //   1140: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1143: getfield f : I
    //   1146: iadd
    //   1147: istore #10
    //   1149: iload #10
    //   1151: aload_1
    //   1152: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1155: getfield g : I
    //   1158: iadd
    //   1159: istore #10
    //   1161: iload #10
    //   1163: istore #5
    //   1165: iload #6
    //   1167: iload #8
    //   1169: if_icmpge -> 1196
    //   1172: iload #10
    //   1174: istore #5
    //   1176: iload #6
    //   1178: iload #9
    //   1180: if_icmpge -> 1196
    //   1183: iload #10
    //   1185: aload_1
    //   1186: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1189: getfield f : I
    //   1192: ineg
    //   1193: iadd
    //   1194: istore #5
    //   1196: iinc #6, 1
    //   1199: goto -> 1082
    //   1202: iload #15
    //   1204: istore #6
    //   1206: goto -> 1213
    //   1209: iload #10
    //   1211: istore #5
    //   1213: aload_0
    //   1214: getfield l : I
    //   1217: iconst_2
    //   1218: if_icmpne -> 1246
    //   1221: iload #12
    //   1223: ifne -> 1246
    //   1226: aload_0
    //   1227: iconst_0
    //   1228: putfield l : I
    //   1231: iload #5
    //   1233: istore #12
    //   1235: iload #6
    //   1237: istore #10
    //   1239: iload #11
    //   1241: istore #5
    //   1243: goto -> 1265
    //   1246: iload #5
    //   1248: istore #12
    //   1250: iload #6
    //   1252: istore #10
    //   1254: iload #11
    //   1256: istore #5
    //   1258: goto -> 1265
    //   1261: iload #6
    //   1263: istore #10
    //   1265: iload #12
    //   1267: iload_3
    //   1268: if_icmple -> 1276
    //   1271: aload_0
    //   1272: iconst_2
    //   1273: putfield l : I
    //   1276: iload #17
    //   1278: ifle -> 1298
    //   1281: iload #10
    //   1283: ifne -> 1298
    //   1286: iload #7
    //   1288: iload #9
    //   1290: if_icmpne -> 1298
    //   1293: aload_0
    //   1294: iconst_2
    //   1295: putfield l : I
    //   1298: aload_0
    //   1299: getfield l : I
    //   1302: istore #6
    //   1304: iload #6
    //   1306: iconst_1
    //   1307: if_icmpne -> 1727
    //   1310: iload #17
    //   1312: iconst_1
    //   1313: if_icmple -> 1330
    //   1316: iload_3
    //   1317: iload #12
    //   1319: isub
    //   1320: iload #17
    //   1322: iconst_1
    //   1323: isub
    //   1324: idiv
    //   1325: istore #6
    //   1327: goto -> 1350
    //   1330: iload #17
    //   1332: iconst_1
    //   1333: if_icmpne -> 1347
    //   1336: iload_3
    //   1337: iload #12
    //   1339: isub
    //   1340: iconst_2
    //   1341: idiv
    //   1342: istore #6
    //   1344: goto -> 1350
    //   1347: iconst_0
    //   1348: istore #6
    //   1350: iload #6
    //   1352: istore #17
    //   1354: iload #10
    //   1356: ifle -> 1362
    //   1359: iconst_0
    //   1360: istore #17
    //   1362: iconst_0
    //   1363: istore #6
    //   1365: iload #5
    //   1367: istore #12
    //   1369: iload #6
    //   1371: iload #4
    //   1373: if_icmpge -> 2478
    //   1376: iload_2
    //   1377: ifeq -> 1392
    //   1380: iload #4
    //   1382: iload #6
    //   1384: iconst_1
    //   1385: iadd
    //   1386: isub
    //   1387: istore #5
    //   1389: goto -> 1396
    //   1392: iload #6
    //   1394: istore #5
    //   1396: aload_0
    //   1397: getfield k : Ljava/util/ArrayList;
    //   1400: iload #5
    //   1402: invokevirtual get : (I)Ljava/lang/Object;
    //   1405: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   1408: astore #14
    //   1410: aload #14
    //   1412: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1415: invokevirtual T : ()I
    //   1418: bipush #8
    //   1420: if_icmpne -> 1450
    //   1423: aload #14
    //   1425: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1428: iload #12
    //   1430: invokevirtual d : (I)V
    //   1433: aload #14
    //   1435: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1438: iload #12
    //   1440: invokevirtual d : (I)V
    //   1443: iload #12
    //   1445: istore #5
    //   1447: goto -> 1717
    //   1450: iload #12
    //   1452: istore #5
    //   1454: iload #6
    //   1456: ifle -> 1480
    //   1459: iload_2
    //   1460: ifeq -> 1473
    //   1463: iload #12
    //   1465: iload #17
    //   1467: isub
    //   1468: istore #5
    //   1470: goto -> 1480
    //   1473: iload #12
    //   1475: iload #17
    //   1477: iadd
    //   1478: istore #5
    //   1480: iload #5
    //   1482: istore #12
    //   1484: iload #6
    //   1486: ifle -> 1533
    //   1489: iload #5
    //   1491: istore #12
    //   1493: iload #6
    //   1495: iload #7
    //   1497: if_icmplt -> 1533
    //   1500: iload_2
    //   1501: ifeq -> 1520
    //   1504: iload #5
    //   1506: aload #14
    //   1508: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1511: getfield f : I
    //   1514: isub
    //   1515: istore #12
    //   1517: goto -> 1533
    //   1520: iload #5
    //   1522: aload #14
    //   1524: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1527: getfield f : I
    //   1530: iadd
    //   1531: istore #12
    //   1533: iload_2
    //   1534: ifeq -> 1550
    //   1537: aload #14
    //   1539: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1542: iload #12
    //   1544: invokevirtual d : (I)V
    //   1547: goto -> 1560
    //   1550: aload #14
    //   1552: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1555: iload #12
    //   1557: invokevirtual d : (I)V
    //   1560: aload #14
    //   1562: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1565: astore_1
    //   1566: aload_1
    //   1567: getfield g : I
    //   1570: istore #10
    //   1572: iload #10
    //   1574: istore #5
    //   1576: aload #14
    //   1578: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1581: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1584: if_acmpne -> 1606
    //   1587: iload #10
    //   1589: istore #5
    //   1591: aload #14
    //   1593: getfield a : I
    //   1596: iconst_1
    //   1597: if_icmpne -> 1606
    //   1600: aload_1
    //   1601: getfield m : I
    //   1604: istore #5
    //   1606: iload_2
    //   1607: ifeq -> 1620
    //   1610: iload #12
    //   1612: iload #5
    //   1614: isub
    //   1615: istore #12
    //   1617: goto -> 1627
    //   1620: iload #12
    //   1622: iload #5
    //   1624: iadd
    //   1625: istore #12
    //   1627: iload_2
    //   1628: ifeq -> 1644
    //   1631: aload #14
    //   1633: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1636: iload #12
    //   1638: invokevirtual d : (I)V
    //   1641: goto -> 1654
    //   1644: aload #14
    //   1646: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1649: iload #12
    //   1651: invokevirtual d : (I)V
    //   1654: aload #14
    //   1656: iconst_1
    //   1657: putfield g : Z
    //   1660: iload #12
    //   1662: istore #5
    //   1664: iload #6
    //   1666: iload #8
    //   1668: if_icmpge -> 1717
    //   1671: iload #12
    //   1673: istore #5
    //   1675: iload #6
    //   1677: iload #9
    //   1679: if_icmpge -> 1717
    //   1682: iload_2
    //   1683: ifeq -> 1703
    //   1686: iload #12
    //   1688: aload #14
    //   1690: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1693: getfield f : I
    //   1696: ineg
    //   1697: isub
    //   1698: istore #5
    //   1700: goto -> 1717
    //   1703: iload #12
    //   1705: aload #14
    //   1707: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1710: getfield f : I
    //   1713: ineg
    //   1714: iadd
    //   1715: istore #5
    //   1717: iinc #6, 1
    //   1720: iload #5
    //   1722: istore #12
    //   1724: goto -> 1369
    //   1727: iload #6
    //   1729: ifne -> 2082
    //   1732: iload_3
    //   1733: iload #12
    //   1735: isub
    //   1736: iload #17
    //   1738: iconst_1
    //   1739: iadd
    //   1740: idiv
    //   1741: istore #17
    //   1743: iload #10
    //   1745: ifle -> 1751
    //   1748: iconst_0
    //   1749: istore #17
    //   1751: iconst_0
    //   1752: istore #6
    //   1754: iload #6
    //   1756: iload #4
    //   1758: if_icmpge -> 2478
    //   1761: iload_2
    //   1762: ifeq -> 1777
    //   1765: iload #4
    //   1767: iload #6
    //   1769: iconst_1
    //   1770: iadd
    //   1771: isub
    //   1772: istore #12
    //   1774: goto -> 1781
    //   1777: iload #6
    //   1779: istore #12
    //   1781: aload_0
    //   1782: getfield k : Ljava/util/ArrayList;
    //   1785: iload #12
    //   1787: invokevirtual get : (I)Ljava/lang/Object;
    //   1790: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   1793: astore_1
    //   1794: aload_1
    //   1795: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1798: invokevirtual T : ()I
    //   1801: bipush #8
    //   1803: if_icmpne -> 1827
    //   1806: aload_1
    //   1807: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1810: iload #5
    //   1812: invokevirtual d : (I)V
    //   1815: aload_1
    //   1816: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1819: iload #5
    //   1821: invokevirtual d : (I)V
    //   1824: goto -> 2076
    //   1827: iload_2
    //   1828: ifeq -> 1841
    //   1831: iload #5
    //   1833: iload #17
    //   1835: isub
    //   1836: istore #12
    //   1838: goto -> 1848
    //   1841: iload #5
    //   1843: iload #17
    //   1845: iadd
    //   1846: istore #12
    //   1848: iload #12
    //   1850: istore #5
    //   1852: iload #6
    //   1854: ifle -> 1899
    //   1857: iload #12
    //   1859: istore #5
    //   1861: iload #6
    //   1863: iload #7
    //   1865: if_icmplt -> 1899
    //   1868: iload_2
    //   1869: ifeq -> 1887
    //   1872: iload #12
    //   1874: aload_1
    //   1875: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1878: getfield f : I
    //   1881: isub
    //   1882: istore #5
    //   1884: goto -> 1899
    //   1887: iload #12
    //   1889: aload_1
    //   1890: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1893: getfield f : I
    //   1896: iadd
    //   1897: istore #5
    //   1899: iload_2
    //   1900: ifeq -> 1915
    //   1903: aload_1
    //   1904: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1907: iload #5
    //   1909: invokevirtual d : (I)V
    //   1912: goto -> 1924
    //   1915: aload_1
    //   1916: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   1919: iload #5
    //   1921: invokevirtual d : (I)V
    //   1924: aload_1
    //   1925: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   1928: astore #14
    //   1930: aload #14
    //   1932: getfield g : I
    //   1935: istore #10
    //   1937: iload #10
    //   1939: istore #12
    //   1941: aload_1
    //   1942: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1945: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   1948: if_acmpne -> 1975
    //   1951: iload #10
    //   1953: istore #12
    //   1955: aload_1
    //   1956: getfield a : I
    //   1959: iconst_1
    //   1960: if_icmpne -> 1975
    //   1963: iload #10
    //   1965: aload #14
    //   1967: getfield m : I
    //   1970: invokestatic min : (II)I
    //   1973: istore #12
    //   1975: iload_2
    //   1976: ifeq -> 1989
    //   1979: iload #5
    //   1981: iload #12
    //   1983: isub
    //   1984: istore #12
    //   1986: goto -> 1996
    //   1989: iload #5
    //   1991: iload #12
    //   1993: iadd
    //   1994: istore #12
    //   1996: iload_2
    //   1997: ifeq -> 2012
    //   2000: aload_1
    //   2001: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2004: iload #12
    //   2006: invokevirtual d : (I)V
    //   2009: goto -> 2021
    //   2012: aload_1
    //   2013: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2016: iload #12
    //   2018: invokevirtual d : (I)V
    //   2021: iload #12
    //   2023: istore #5
    //   2025: iload #6
    //   2027: iload #8
    //   2029: if_icmpge -> 2076
    //   2032: iload #12
    //   2034: istore #5
    //   2036: iload #6
    //   2038: iload #9
    //   2040: if_icmpge -> 2076
    //   2043: iload_2
    //   2044: ifeq -> 2063
    //   2047: iload #12
    //   2049: aload_1
    //   2050: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2053: getfield f : I
    //   2056: ineg
    //   2057: isub
    //   2058: istore #5
    //   2060: goto -> 2076
    //   2063: iload #12
    //   2065: aload_1
    //   2066: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2069: getfield f : I
    //   2072: ineg
    //   2073: iadd
    //   2074: istore #5
    //   2076: iinc #6, 1
    //   2079: goto -> 1754
    //   2082: iload #6
    //   2084: iconst_2
    //   2085: if_icmpne -> 2478
    //   2088: aload_0
    //   2089: getfield f : I
    //   2092: ifne -> 2107
    //   2095: aload_0
    //   2096: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2099: invokevirtual z : ()F
    //   2102: fstore #13
    //   2104: goto -> 2116
    //   2107: aload_0
    //   2108: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2111: invokevirtual P : ()F
    //   2114: fstore #13
    //   2116: fload #13
    //   2118: fstore #19
    //   2120: iload_2
    //   2121: ifeq -> 2130
    //   2124: fconst_1
    //   2125: fload #13
    //   2127: fsub
    //   2128: fstore #19
    //   2130: iload_3
    //   2131: iload #12
    //   2133: isub
    //   2134: i2f
    //   2135: fload #19
    //   2137: fmul
    //   2138: ldc 0.5
    //   2140: fadd
    //   2141: f2i
    //   2142: istore #6
    //   2144: iload #6
    //   2146: iflt -> 2154
    //   2149: iload #10
    //   2151: ifle -> 2157
    //   2154: iconst_0
    //   2155: istore #6
    //   2157: iload_2
    //   2158: ifeq -> 2171
    //   2161: iload #5
    //   2163: iload #6
    //   2165: isub
    //   2166: istore #5
    //   2168: goto -> 2178
    //   2171: iload #5
    //   2173: iload #6
    //   2175: iadd
    //   2176: istore #5
    //   2178: iconst_0
    //   2179: istore #6
    //   2181: iload #6
    //   2183: iload #4
    //   2185: if_icmpge -> 2478
    //   2188: iload_2
    //   2189: ifeq -> 2204
    //   2192: iload #4
    //   2194: iload #6
    //   2196: iconst_1
    //   2197: iadd
    //   2198: isub
    //   2199: istore #12
    //   2201: goto -> 2208
    //   2204: iload #6
    //   2206: istore #12
    //   2208: aload_0
    //   2209: getfield k : Ljava/util/ArrayList;
    //   2212: iload #12
    //   2214: invokevirtual get : (I)Ljava/lang/Object;
    //   2217: checkcast androidx/constraintlayout/solver/widgets/analyzer/WidgetRun
    //   2220: astore_1
    //   2221: aload_1
    //   2222: getfield b : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   2225: invokevirtual T : ()I
    //   2228: bipush #8
    //   2230: if_icmpne -> 2254
    //   2233: aload_1
    //   2234: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2237: iload #5
    //   2239: invokevirtual d : (I)V
    //   2242: aload_1
    //   2243: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2246: iload #5
    //   2248: invokevirtual d : (I)V
    //   2251: goto -> 2472
    //   2254: iload #5
    //   2256: istore #12
    //   2258: iload #6
    //   2260: ifle -> 2305
    //   2263: iload #5
    //   2265: istore #12
    //   2267: iload #6
    //   2269: iload #7
    //   2271: if_icmplt -> 2305
    //   2274: iload_2
    //   2275: ifeq -> 2293
    //   2278: iload #5
    //   2280: aload_1
    //   2281: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2284: getfield f : I
    //   2287: isub
    //   2288: istore #12
    //   2290: goto -> 2305
    //   2293: iload #5
    //   2295: aload_1
    //   2296: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2299: getfield f : I
    //   2302: iadd
    //   2303: istore #12
    //   2305: iload_2
    //   2306: ifeq -> 2321
    //   2309: aload_1
    //   2310: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2313: iload #12
    //   2315: invokevirtual d : (I)V
    //   2318: goto -> 2330
    //   2321: aload_1
    //   2322: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2325: iload #12
    //   2327: invokevirtual d : (I)V
    //   2330: aload_1
    //   2331: getfield e : Landroidx/constraintlayout/solver/widgets/analyzer/f;
    //   2334: astore #14
    //   2336: aload #14
    //   2338: getfield g : I
    //   2341: istore #5
    //   2343: aload_1
    //   2344: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   2347: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   2350: if_acmpne -> 2371
    //   2353: aload_1
    //   2354: getfield a : I
    //   2357: iconst_1
    //   2358: if_icmpne -> 2371
    //   2361: aload #14
    //   2363: getfield m : I
    //   2366: istore #5
    //   2368: goto -> 2371
    //   2371: iload_2
    //   2372: ifeq -> 2385
    //   2375: iload #12
    //   2377: iload #5
    //   2379: isub
    //   2380: istore #12
    //   2382: goto -> 2392
    //   2385: iload #12
    //   2387: iload #5
    //   2389: iadd
    //   2390: istore #12
    //   2392: iload_2
    //   2393: ifeq -> 2408
    //   2396: aload_1
    //   2397: getfield h : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2400: iload #12
    //   2402: invokevirtual d : (I)V
    //   2405: goto -> 2417
    //   2408: aload_1
    //   2409: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2412: iload #12
    //   2414: invokevirtual d : (I)V
    //   2417: iload #12
    //   2419: istore #5
    //   2421: iload #6
    //   2423: iload #8
    //   2425: if_icmpge -> 2472
    //   2428: iload #12
    //   2430: istore #5
    //   2432: iload #6
    //   2434: iload #9
    //   2436: if_icmpge -> 2472
    //   2439: iload_2
    //   2440: ifeq -> 2459
    //   2443: iload #12
    //   2445: aload_1
    //   2446: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2449: getfield f : I
    //   2452: ineg
    //   2453: isub
    //   2454: istore #5
    //   2456: goto -> 2472
    //   2459: iload #12
    //   2461: aload_1
    //   2462: getfield i : Landroidx/constraintlayout/solver/widgets/analyzer/DependencyNode;
    //   2465: getfield f : I
    //   2468: ineg
    //   2469: iadd
    //   2470: istore #5
    //   2472: iinc #6, 1
    //   2475: goto -> 2181
    //   2478: return
  }
  
  void d() {
    DependencyNode dependencyNode;
    Iterator<WidgetRun> iterator = this.k.iterator();
    while (iterator.hasNext())
      ((WidgetRun)iterator.next()).d(); 
    int i = this.k.size();
    if (i < 1)
      return; 
    ConstraintWidget constraintWidget2 = ((WidgetRun)this.k.get(0)).b;
    ConstraintWidget constraintWidget1 = ((WidgetRun)this.k.get(i - 1)).b;
    if (this.f == 0) {
      ConstraintAnchor constraintAnchor2 = constraintWidget2.K;
      ConstraintAnchor constraintAnchor1 = constraintWidget1.M;
      dependencyNode = i(constraintAnchor2, 0);
      i = constraintAnchor2.f();
      ConstraintWidget constraintWidget = r();
      if (constraintWidget != null)
        i = constraintWidget.K.f(); 
      if (dependencyNode != null)
        b(this.h, dependencyNode, i); 
      dependencyNode = i(constraintAnchor1, 0);
      i = constraintAnchor1.f();
      constraintWidget1 = s();
      if (constraintWidget1 != null)
        i = constraintWidget1.M.f(); 
      if (dependencyNode != null)
        b(this.i, dependencyNode, -i); 
    } else {
      ConstraintAnchor constraintAnchor2 = ((ConstraintWidget)dependencyNode).L;
      ConstraintAnchor constraintAnchor1 = constraintWidget1.N;
      dependencyNode = i(constraintAnchor2, 1);
      i = constraintAnchor2.f();
      ConstraintWidget constraintWidget4 = r();
      if (constraintWidget4 != null)
        i = constraintWidget4.L.f(); 
      if (dependencyNode != null)
        b(this.h, dependencyNode, i); 
      dependencyNode = i(constraintAnchor1, 1);
      i = constraintAnchor1.f();
      ConstraintWidget constraintWidget3 = s();
      if (constraintWidget3 != null)
        i = constraintWidget3.N.f(); 
      if (dependencyNode != null)
        b(this.i, dependencyNode, -i); 
    } 
    this.h.a = this;
    this.i.a = this;
  }
  
  public void e() {
    for (byte b = 0; b < this.k.size(); b++)
      ((WidgetRun)this.k.get(b)).e(); 
  }
  
  void f() {
    this.c = null;
    Iterator<WidgetRun> iterator = this.k.iterator();
    while (iterator.hasNext())
      ((WidgetRun)iterator.next()).f(); 
  }
  
  public long j() {
    int i = this.k.size();
    long l = 0L;
    for (byte b = 0; b < i; b++) {
      WidgetRun widgetRun = this.k.get(b);
      l = l + widgetRun.h.f + widgetRun.j() + widgetRun.i.f;
    } 
    return l;
  }
  
  boolean m() {
    int i = this.k.size();
    for (byte b = 0; b < i; b++) {
      if (!((WidgetRun)this.k.get(b)).m())
        return false; 
    } 
    return true;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ChainRun ");
    if (this.f == 0) {
      str = "horizontal : ";
    } else {
      str = "vertical : ";
    } 
    stringBuilder.append(str);
    String str = stringBuilder.toString();
    for (WidgetRun widgetRun : this.k) {
      StringBuilder stringBuilder3 = new StringBuilder();
      stringBuilder3.append(str);
      stringBuilder3.append("<");
      String str1 = stringBuilder3.toString();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str1);
      stringBuilder1.append(widgetRun);
      str = stringBuilder1.toString();
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append(str);
      stringBuilder2.append("> ");
      str = stringBuilder2.toString();
    } 
    return str;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/analyzer/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */