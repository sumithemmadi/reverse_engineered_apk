package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.d;
import java.util.HashMap;

public class a extends h {
  private int P0 = 0;
  
  private boolean Q0 = true;
  
  private int R0 = 0;
  
  boolean S0 = false;
  
  public void g(d paramd, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield S : [Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   4: astore_3
    //   5: aload_3
    //   6: iconst_0
    //   7: aload_0
    //   8: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   11: aastore
    //   12: aload_3
    //   13: iconst_2
    //   14: aload_0
    //   15: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   18: aastore
    //   19: aload_3
    //   20: iconst_1
    //   21: aload_0
    //   22: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   25: aastore
    //   26: aload_3
    //   27: iconst_3
    //   28: aload_0
    //   29: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   32: aastore
    //   33: iconst_0
    //   34: istore #4
    //   36: aload_0
    //   37: getfield S : [Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   40: astore_3
    //   41: iload #4
    //   43: aload_3
    //   44: arraylength
    //   45: if_icmpge -> 69
    //   48: aload_3
    //   49: iload #4
    //   51: aaload
    //   52: aload_1
    //   53: aload_3
    //   54: iload #4
    //   56: aaload
    //   57: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   60: putfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   63: iinc #4, 1
    //   66: goto -> 36
    //   69: aload_0
    //   70: getfield P0 : I
    //   73: istore #4
    //   75: iload #4
    //   77: iflt -> 1023
    //   80: iload #4
    //   82: iconst_4
    //   83: if_icmpge -> 1023
    //   86: aload_3
    //   87: iload #4
    //   89: aaload
    //   90: astore_3
    //   91: aload_0
    //   92: getfield S0 : Z
    //   95: ifne -> 103
    //   98: aload_0
    //   99: invokevirtual g1 : ()Z
    //   102: pop
    //   103: aload_0
    //   104: getfield S0 : Z
    //   107: ifeq -> 211
    //   110: aload_0
    //   111: iconst_0
    //   112: putfield S0 : Z
    //   115: aload_0
    //   116: getfield P0 : I
    //   119: istore #4
    //   121: iload #4
    //   123: ifeq -> 180
    //   126: iload #4
    //   128: iconst_1
    //   129: if_icmpne -> 135
    //   132: goto -> 180
    //   135: iload #4
    //   137: iconst_2
    //   138: if_icmpeq -> 147
    //   141: iload #4
    //   143: iconst_3
    //   144: if_icmpne -> 210
    //   147: aload_1
    //   148: aload_0
    //   149: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   152: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   155: aload_0
    //   156: getfield c0 : I
    //   159: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   162: aload_1
    //   163: aload_0
    //   164: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   167: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   170: aload_0
    //   171: getfield c0 : I
    //   174: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   177: goto -> 210
    //   180: aload_1
    //   181: aload_0
    //   182: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   185: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   188: aload_0
    //   189: getfield b0 : I
    //   192: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   195: aload_1
    //   196: aload_0
    //   197: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   200: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   203: aload_0
    //   204: getfield b0 : I
    //   207: invokevirtual f : (Landroidx/constraintlayout/solver/SolverVariable;I)V
    //   210: return
    //   211: iconst_0
    //   212: istore #4
    //   214: iload #4
    //   216: aload_0
    //   217: getfield O0 : I
    //   220: if_icmpge -> 365
    //   223: aload_0
    //   224: getfield N0 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   227: iload #4
    //   229: aaload
    //   230: astore #5
    //   232: aload_0
    //   233: getfield Q0 : Z
    //   236: ifne -> 250
    //   239: aload #5
    //   241: invokevirtual h : ()Z
    //   244: ifne -> 250
    //   247: goto -> 359
    //   250: aload_0
    //   251: getfield P0 : I
    //   254: istore #6
    //   256: iload #6
    //   258: ifeq -> 267
    //   261: iload #6
    //   263: iconst_1
    //   264: if_icmpne -> 305
    //   267: aload #5
    //   269: invokevirtual B : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   272: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   275: if_acmpne -> 305
    //   278: aload #5
    //   280: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   283: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   286: ifnull -> 305
    //   289: aload #5
    //   291: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   294: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   297: ifnull -> 305
    //   300: iconst_1
    //   301: istore_2
    //   302: goto -> 367
    //   305: aload_0
    //   306: getfield P0 : I
    //   309: istore #6
    //   311: iload #6
    //   313: iconst_2
    //   314: if_icmpeq -> 323
    //   317: iload #6
    //   319: iconst_3
    //   320: if_icmpne -> 359
    //   323: aload #5
    //   325: invokevirtual R : ()Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   328: getstatic androidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour.d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget$DimensionBehaviour;
    //   331: if_acmpne -> 359
    //   334: aload #5
    //   336: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   339: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   342: ifnull -> 359
    //   345: aload #5
    //   347: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   350: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   353: ifnull -> 359
    //   356: goto -> 300
    //   359: iinc #4, 1
    //   362: goto -> 214
    //   365: iconst_0
    //   366: istore_2
    //   367: aload_0
    //   368: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   371: invokevirtual l : ()Z
    //   374: ifne -> 396
    //   377: aload_0
    //   378: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   381: invokevirtual l : ()Z
    //   384: ifeq -> 390
    //   387: goto -> 396
    //   390: iconst_0
    //   391: istore #4
    //   393: goto -> 399
    //   396: iconst_1
    //   397: istore #4
    //   399: aload_0
    //   400: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   403: invokevirtual l : ()Z
    //   406: ifne -> 428
    //   409: aload_0
    //   410: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   413: invokevirtual l : ()Z
    //   416: ifeq -> 422
    //   419: goto -> 428
    //   422: iconst_0
    //   423: istore #6
    //   425: goto -> 431
    //   428: iconst_1
    //   429: istore #6
    //   431: iload_2
    //   432: ifne -> 490
    //   435: aload_0
    //   436: getfield P0 : I
    //   439: istore #7
    //   441: iload #7
    //   443: ifne -> 451
    //   446: iload #4
    //   448: ifne -> 484
    //   451: iload #7
    //   453: iconst_2
    //   454: if_icmpne -> 462
    //   457: iload #6
    //   459: ifne -> 484
    //   462: iload #7
    //   464: iconst_1
    //   465: if_icmpne -> 473
    //   468: iload #4
    //   470: ifne -> 484
    //   473: iload #7
    //   475: iconst_3
    //   476: if_icmpne -> 490
    //   479: iload #6
    //   481: ifeq -> 490
    //   484: iconst_1
    //   485: istore #6
    //   487: goto -> 493
    //   490: iconst_0
    //   491: istore #6
    //   493: iconst_5
    //   494: istore #4
    //   496: iload #6
    //   498: ifne -> 504
    //   501: iconst_4
    //   502: istore #4
    //   504: iconst_0
    //   505: istore #6
    //   507: iload #6
    //   509: aload_0
    //   510: getfield O0 : I
    //   513: if_icmpge -> 705
    //   516: aload_0
    //   517: getfield N0 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   520: iload #6
    //   522: aaload
    //   523: astore #8
    //   525: aload_0
    //   526: getfield Q0 : Z
    //   529: ifne -> 543
    //   532: aload #8
    //   534: invokevirtual h : ()Z
    //   537: ifne -> 543
    //   540: goto -> 699
    //   543: aload_1
    //   544: aload #8
    //   546: getfield S : [Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   549: aload_0
    //   550: getfield P0 : I
    //   553: aaload
    //   554: invokevirtual q : (Ljava/lang/Object;)Landroidx/constraintlayout/solver/SolverVariable;
    //   557: astore #5
    //   559: aload #8
    //   561: getfield S : [Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   564: astore #8
    //   566: aload_0
    //   567: getfield P0 : I
    //   570: istore #9
    //   572: aload #8
    //   574: iload #9
    //   576: aaload
    //   577: aload #5
    //   579: putfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   582: aload #8
    //   584: iload #9
    //   586: aaload
    //   587: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   590: ifnull -> 623
    //   593: aload #8
    //   595: iload #9
    //   597: aaload
    //   598: getfield f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   601: getfield d : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   604: aload_0
    //   605: if_acmpne -> 623
    //   608: aload #8
    //   610: iload #9
    //   612: aaload
    //   613: getfield g : I
    //   616: iconst_0
    //   617: iadd
    //   618: istore #7
    //   620: goto -> 626
    //   623: iconst_0
    //   624: istore #7
    //   626: iload #9
    //   628: ifeq -> 661
    //   631: iload #9
    //   633: iconst_2
    //   634: if_icmpne -> 640
    //   637: goto -> 661
    //   640: aload_1
    //   641: aload_3
    //   642: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   645: aload #5
    //   647: aload_0
    //   648: getfield R0 : I
    //   651: iload #7
    //   653: iadd
    //   654: iload_2
    //   655: invokevirtual g : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;IZ)V
    //   658: goto -> 679
    //   661: aload_1
    //   662: aload_3
    //   663: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   666: aload #5
    //   668: aload_0
    //   669: getfield R0 : I
    //   672: iload #7
    //   674: isub
    //   675: iload_2
    //   676: invokevirtual i : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;IZ)V
    //   679: aload_1
    //   680: aload_3
    //   681: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   684: aload #5
    //   686: aload_0
    //   687: getfield R0 : I
    //   690: iload #7
    //   692: iadd
    //   693: iload #4
    //   695: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   698: pop
    //   699: iinc #6, 1
    //   702: goto -> 507
    //   705: aload_0
    //   706: getfield P0 : I
    //   709: istore #4
    //   711: iload #4
    //   713: ifne -> 789
    //   716: aload_1
    //   717: aload_0
    //   718: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   721: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   724: aload_0
    //   725: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   728: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   731: iconst_0
    //   732: bipush #8
    //   734: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   737: pop
    //   738: aload_1
    //   739: aload_0
    //   740: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   743: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   746: aload_0
    //   747: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   750: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   753: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   756: iconst_0
    //   757: iconst_4
    //   758: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   761: pop
    //   762: aload_1
    //   763: aload_0
    //   764: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   767: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   770: aload_0
    //   771: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   774: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   777: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   780: iconst_0
    //   781: iconst_0
    //   782: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   785: pop
    //   786: goto -> 1023
    //   789: iload #4
    //   791: iconst_1
    //   792: if_icmpne -> 868
    //   795: aload_1
    //   796: aload_0
    //   797: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   800: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   803: aload_0
    //   804: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   807: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   810: iconst_0
    //   811: bipush #8
    //   813: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   816: pop
    //   817: aload_1
    //   818: aload_0
    //   819: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   822: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   825: aload_0
    //   826: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   829: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   832: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   835: iconst_0
    //   836: iconst_4
    //   837: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   840: pop
    //   841: aload_1
    //   842: aload_0
    //   843: getfield K : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   846: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   849: aload_0
    //   850: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   853: getfield M : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   856: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   859: iconst_0
    //   860: iconst_0
    //   861: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   864: pop
    //   865: goto -> 1023
    //   868: iload #4
    //   870: iconst_2
    //   871: if_icmpne -> 947
    //   874: aload_1
    //   875: aload_0
    //   876: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   879: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   882: aload_0
    //   883: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   886: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   889: iconst_0
    //   890: bipush #8
    //   892: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   895: pop
    //   896: aload_1
    //   897: aload_0
    //   898: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   901: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   904: aload_0
    //   905: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   908: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   911: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   914: iconst_0
    //   915: iconst_4
    //   916: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   919: pop
    //   920: aload_1
    //   921: aload_0
    //   922: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   925: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   928: aload_0
    //   929: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   932: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   935: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   938: iconst_0
    //   939: iconst_0
    //   940: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   943: pop
    //   944: goto -> 1023
    //   947: iload #4
    //   949: iconst_3
    //   950: if_icmpne -> 1023
    //   953: aload_1
    //   954: aload_0
    //   955: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   958: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   961: aload_0
    //   962: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   965: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   968: iconst_0
    //   969: bipush #8
    //   971: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   974: pop
    //   975: aload_1
    //   976: aload_0
    //   977: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   980: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   983: aload_0
    //   984: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   987: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   990: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   993: iconst_0
    //   994: iconst_4
    //   995: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   998: pop
    //   999: aload_1
    //   1000: aload_0
    //   1001: getfield L : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1004: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   1007: aload_0
    //   1008: getfield W : Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   1011: getfield N : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   1014: getfield i : Landroidx/constraintlayout/solver/SolverVariable;
    //   1017: iconst_0
    //   1018: iconst_0
    //   1019: invokevirtual e : (Landroidx/constraintlayout/solver/SolverVariable;Landroidx/constraintlayout/solver/SolverVariable;II)Landroidx/constraintlayout/solver/b;
    //   1022: pop
    //   1023: return
  }
  
  public boolean g1() {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: iconst_1
    //   5: istore_3
    //   6: aload_0
    //   7: getfield O0 : I
    //   10: istore #4
    //   12: iload_2
    //   13: iload #4
    //   15: if_icmpge -> 122
    //   18: aload_0
    //   19: getfield N0 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   22: iload_2
    //   23: aaload
    //   24: astore #5
    //   26: aload_0
    //   27: getfield Q0 : Z
    //   30: ifne -> 47
    //   33: aload #5
    //   35: invokevirtual h : ()Z
    //   38: ifne -> 47
    //   41: iload_3
    //   42: istore #4
    //   44: goto -> 113
    //   47: aload_0
    //   48: getfield P0 : I
    //   51: istore #4
    //   53: iload #4
    //   55: ifeq -> 64
    //   58: iload #4
    //   60: iconst_1
    //   61: if_icmpne -> 78
    //   64: aload #5
    //   66: invokevirtual h0 : ()Z
    //   69: ifne -> 78
    //   72: iconst_0
    //   73: istore #4
    //   75: goto -> 113
    //   78: aload_0
    //   79: getfield P0 : I
    //   82: istore #6
    //   84: iload #6
    //   86: iconst_2
    //   87: if_icmpeq -> 99
    //   90: iload_3
    //   91: istore #4
    //   93: iload #6
    //   95: iconst_3
    //   96: if_icmpne -> 113
    //   99: iload_3
    //   100: istore #4
    //   102: aload #5
    //   104: invokevirtual i0 : ()Z
    //   107: ifne -> 113
    //   110: goto -> 72
    //   113: iinc #2, 1
    //   116: iload #4
    //   118: istore_3
    //   119: goto -> 6
    //   122: iload_3
    //   123: ifeq -> 443
    //   126: iload #4
    //   128: ifle -> 443
    //   131: iconst_0
    //   132: istore_2
    //   133: iconst_0
    //   134: istore #4
    //   136: iload_1
    //   137: aload_0
    //   138: getfield O0 : I
    //   141: if_icmpge -> 397
    //   144: aload_0
    //   145: getfield N0 : [Landroidx/constraintlayout/solver/widgets/ConstraintWidget;
    //   148: iload_1
    //   149: aaload
    //   150: astore #5
    //   152: aload_0
    //   153: getfield Q0 : Z
    //   156: ifne -> 170
    //   159: aload #5
    //   161: invokevirtual h : ()Z
    //   164: ifne -> 170
    //   167: goto -> 391
    //   170: iload_2
    //   171: istore #6
    //   173: iload #4
    //   175: istore_3
    //   176: iload #4
    //   178: ifne -> 267
    //   181: aload_0
    //   182: getfield P0 : I
    //   185: istore_3
    //   186: iload_3
    //   187: ifne -> 205
    //   190: aload #5
    //   192: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   195: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   198: invokevirtual e : ()I
    //   201: istore_2
    //   202: goto -> 262
    //   205: iload_3
    //   206: iconst_1
    //   207: if_icmpne -> 225
    //   210: aload #5
    //   212: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   215: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   218: invokevirtual e : ()I
    //   221: istore_2
    //   222: goto -> 262
    //   225: iload_3
    //   226: iconst_2
    //   227: if_icmpne -> 245
    //   230: aload #5
    //   232: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   235: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   238: invokevirtual e : ()I
    //   241: istore_2
    //   242: goto -> 262
    //   245: iload_3
    //   246: iconst_3
    //   247: if_icmpne -> 262
    //   250: aload #5
    //   252: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   255: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   258: invokevirtual e : ()I
    //   261: istore_2
    //   262: iconst_1
    //   263: istore_3
    //   264: iload_2
    //   265: istore #6
    //   267: aload_0
    //   268: getfield P0 : I
    //   271: istore #7
    //   273: iload #7
    //   275: ifne -> 301
    //   278: iload #6
    //   280: aload #5
    //   282: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.c : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   285: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   288: invokevirtual e : ()I
    //   291: invokestatic min : (II)I
    //   294: istore_2
    //   295: iload_3
    //   296: istore #4
    //   298: goto -> 391
    //   301: iload #7
    //   303: iconst_1
    //   304: if_icmpne -> 330
    //   307: iload #6
    //   309: aload #5
    //   311: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.e : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   314: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   317: invokevirtual e : ()I
    //   320: invokestatic max : (II)I
    //   323: istore_2
    //   324: iload_3
    //   325: istore #4
    //   327: goto -> 391
    //   330: iload #7
    //   332: iconst_2
    //   333: if_icmpne -> 359
    //   336: iload #6
    //   338: aload #5
    //   340: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.d : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   343: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   346: invokevirtual e : ()I
    //   349: invokestatic min : (II)I
    //   352: istore_2
    //   353: iload_3
    //   354: istore #4
    //   356: goto -> 391
    //   359: iload #6
    //   361: istore_2
    //   362: iload_3
    //   363: istore #4
    //   365: iload #7
    //   367: iconst_3
    //   368: if_icmpne -> 391
    //   371: iload #6
    //   373: aload #5
    //   375: getstatic androidx/constraintlayout/solver/widgets/ConstraintAnchor$Type.f : Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;
    //   378: invokevirtual p : (Landroidx/constraintlayout/solver/widgets/ConstraintAnchor$Type;)Landroidx/constraintlayout/solver/widgets/ConstraintAnchor;
    //   381: invokevirtual e : ()I
    //   384: invokestatic max : (II)I
    //   387: istore_2
    //   388: iload_3
    //   389: istore #4
    //   391: iinc #1, 1
    //   394: goto -> 136
    //   397: iload_2
    //   398: aload_0
    //   399: getfield R0 : I
    //   402: iadd
    //   403: istore_2
    //   404: aload_0
    //   405: getfield P0 : I
    //   408: istore_3
    //   409: iload_3
    //   410: ifeq -> 430
    //   413: iload_3
    //   414: iconst_1
    //   415: if_icmpne -> 421
    //   418: goto -> 430
    //   421: aload_0
    //   422: iload_2
    //   423: iload_2
    //   424: invokevirtual w0 : (II)V
    //   427: goto -> 436
    //   430: aload_0
    //   431: iload_2
    //   432: iload_2
    //   433: invokevirtual t0 : (II)V
    //   436: aload_0
    //   437: iconst_1
    //   438: putfield S0 : Z
    //   441: iconst_1
    //   442: ireturn
    //   443: iconst_0
    //   444: ireturn
  }
  
  public boolean h() {
    return true;
  }
  
  public boolean h0() {
    return this.S0;
  }
  
  public boolean h1() {
    return this.Q0;
  }
  
  public boolean i0() {
    return this.S0;
  }
  
  public int i1() {
    return this.P0;
  }
  
  public int j1() {
    return this.R0;
  }
  
  public int k1() {
    int i = this.P0;
    return (i != 0 && i != 1) ? ((i != 2 && i != 3) ? -1 : 1) : 0;
  }
  
  protected void l1() {
    for (byte b = 0; b < this.O0; b++) {
      ConstraintWidget constraintWidget = this.N0[b];
      int i = this.P0;
      if (i == 0 || i == 1) {
        constraintWidget.G0(0, true);
      } else if (i == 2 || i == 3) {
        constraintWidget.G0(1, true);
      } 
    } 
  }
  
  public void m(ConstraintWidget paramConstraintWidget, HashMap<ConstraintWidget, ConstraintWidget> paramHashMap) {
    super.m(paramConstraintWidget, paramHashMap);
    paramConstraintWidget = paramConstraintWidget;
    this.P0 = ((a)paramConstraintWidget).P0;
    this.Q0 = ((a)paramConstraintWidget).Q0;
    this.R0 = ((a)paramConstraintWidget).R0;
  }
  
  public void m1(boolean paramBoolean) {
    this.Q0 = paramBoolean;
  }
  
  public void n1(int paramInt) {
    this.P0 = paramInt;
  }
  
  public void o1(int paramInt) {
    this.R0 = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("[Barrier] ");
    stringBuilder1.append(u());
    stringBuilder1.append(" {");
    String str = stringBuilder1.toString();
    for (byte b = 0; b < this.O0; b++) {
      ConstraintWidget constraintWidget = this.N0[b];
      String str1 = str;
      if (b > 0) {
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str);
        stringBuilder3.append(", ");
        str1 = stringBuilder3.toString();
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str1);
      stringBuilder.append(constraintWidget.u());
      str = stringBuilder.toString();
    } 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(str);
    stringBuilder2.append("}");
    return stringBuilder2.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/solver/widgets/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */