package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;

public class ActionMenuView extends LinearLayoutCompat implements g.b, n {
  private int A;
  
  d B;
  
  private g q;
  
  private Context r;
  
  private int s;
  
  private boolean t;
  
  private ActionMenuPresenter u;
  
  private m.a v;
  
  g.a w;
  
  private boolean x;
  
  private int y;
  
  private int z;
  
  public ActionMenuView(Context paramContext) {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.z = (int)(56.0F * f);
    this.A = (int)(f * 4.0F);
    this.r = paramContext;
    this.s = 0;
  }
  
  static int L(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ActionMenuItemView actionMenuItemView;
    LayoutParams layoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt3) - paramInt4, View.MeasureSpec.getMode(paramInt3));
    if (paramView instanceof ActionMenuItemView) {
      actionMenuItemView = (ActionMenuItemView)paramView;
    } else {
      actionMenuItemView = null;
    } 
    boolean bool = true;
    if (actionMenuItemView != null && actionMenuItemView.f()) {
      paramInt3 = 1;
    } else {
      paramInt3 = 0;
    } 
    paramInt4 = 2;
    if (paramInt2 > 0 && (paramInt3 == 0 || paramInt2 >= 2)) {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 * paramInt1, -2147483648), i);
      int j = paramView.getMeasuredWidth();
      int k = j / paramInt1;
      paramInt2 = k;
      if (j % paramInt1 != 0)
        paramInt2 = k + 1; 
      if (paramInt3 != 0 && paramInt2 < 2)
        paramInt2 = paramInt4; 
    } else {
      paramInt2 = 0;
    } 
    if (layoutParams.a || paramInt3 == 0)
      bool = false; 
    layoutParams.d = bool;
    layoutParams.b = paramInt2;
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, 1073741824), i);
    return paramInt2;
  }
  
  private void M(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_2
    //   1: invokestatic getMode : (I)I
    //   4: istore_3
    //   5: iload_1
    //   6: invokestatic getSize : (I)I
    //   9: istore #4
    //   11: iload_2
    //   12: invokestatic getSize : (I)I
    //   15: istore #5
    //   17: aload_0
    //   18: invokevirtual getPaddingLeft : ()I
    //   21: istore_1
    //   22: aload_0
    //   23: invokevirtual getPaddingRight : ()I
    //   26: istore #6
    //   28: aload_0
    //   29: invokevirtual getPaddingTop : ()I
    //   32: aload_0
    //   33: invokevirtual getPaddingBottom : ()I
    //   36: iadd
    //   37: istore #7
    //   39: iload_2
    //   40: iload #7
    //   42: bipush #-2
    //   44: invokestatic getChildMeasureSpec : (III)I
    //   47: istore #8
    //   49: iload #4
    //   51: iload_1
    //   52: iload #6
    //   54: iadd
    //   55: isub
    //   56: istore #9
    //   58: aload_0
    //   59: getfield z : I
    //   62: istore_2
    //   63: iload #9
    //   65: iload_2
    //   66: idiv
    //   67: istore_1
    //   68: iload_1
    //   69: ifne -> 80
    //   72: aload_0
    //   73: iload #9
    //   75: iconst_0
    //   76: invokevirtual setMeasuredDimension : (II)V
    //   79: return
    //   80: iload_2
    //   81: iload #9
    //   83: iload_2
    //   84: irem
    //   85: iload_1
    //   86: idiv
    //   87: iadd
    //   88: istore #10
    //   90: aload_0
    //   91: invokevirtual getChildCount : ()I
    //   94: istore #11
    //   96: iconst_0
    //   97: istore_2
    //   98: iconst_0
    //   99: istore #12
    //   101: iconst_0
    //   102: istore #6
    //   104: iconst_0
    //   105: istore #13
    //   107: iconst_0
    //   108: istore #14
    //   110: iconst_0
    //   111: istore #15
    //   113: lconst_0
    //   114: lstore #16
    //   116: iload #12
    //   118: iload #11
    //   120: if_icmpge -> 375
    //   123: aload_0
    //   124: iload #12
    //   126: invokevirtual getChildAt : (I)Landroid/view/View;
    //   129: astore #18
    //   131: aload #18
    //   133: invokevirtual getVisibility : ()I
    //   136: bipush #8
    //   138: if_icmpne -> 148
    //   141: iload #15
    //   143: istore #4
    //   145: goto -> 365
    //   148: aload #18
    //   150: instanceof androidx/appcompat/view/menu/ActionMenuItemView
    //   153: istore #19
    //   155: iinc #13, 1
    //   158: iload #19
    //   160: ifeq -> 183
    //   163: aload_0
    //   164: getfield A : I
    //   167: istore #4
    //   169: aload #18
    //   171: iload #4
    //   173: iconst_0
    //   174: iload #4
    //   176: iconst_0
    //   177: invokevirtual setPadding : (IIII)V
    //   180: goto -> 183
    //   183: aload #18
    //   185: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   188: checkcast androidx/appcompat/widget/ActionMenuView$LayoutParams
    //   191: astore #20
    //   193: aload #20
    //   195: iconst_0
    //   196: putfield f : Z
    //   199: aload #20
    //   201: iconst_0
    //   202: putfield c : I
    //   205: aload #20
    //   207: iconst_0
    //   208: putfield b : I
    //   211: aload #20
    //   213: iconst_0
    //   214: putfield d : Z
    //   217: aload #20
    //   219: iconst_0
    //   220: putfield leftMargin : I
    //   223: aload #20
    //   225: iconst_0
    //   226: putfield rightMargin : I
    //   229: iload #19
    //   231: ifeq -> 251
    //   234: aload #18
    //   236: checkcast androidx/appcompat/view/menu/ActionMenuItemView
    //   239: invokevirtual f : ()Z
    //   242: ifeq -> 251
    //   245: iconst_1
    //   246: istore #19
    //   248: goto -> 254
    //   251: iconst_0
    //   252: istore #19
    //   254: aload #20
    //   256: iload #19
    //   258: putfield e : Z
    //   261: aload #20
    //   263: getfield a : Z
    //   266: ifeq -> 275
    //   269: iconst_1
    //   270: istore #4
    //   272: goto -> 278
    //   275: iload_1
    //   276: istore #4
    //   278: aload #18
    //   280: iload #10
    //   282: iload #4
    //   284: iload #8
    //   286: iload #7
    //   288: invokestatic L : (Landroid/view/View;IIII)I
    //   291: istore #21
    //   293: iload #14
    //   295: iload #21
    //   297: invokestatic max : (II)I
    //   300: istore #14
    //   302: iload #15
    //   304: istore #4
    //   306: aload #20
    //   308: getfield d : Z
    //   311: ifeq -> 320
    //   314: iload #15
    //   316: iconst_1
    //   317: iadd
    //   318: istore #4
    //   320: aload #20
    //   322: getfield a : Z
    //   325: ifeq -> 331
    //   328: iconst_1
    //   329: istore #6
    //   331: iload_1
    //   332: iload #21
    //   334: isub
    //   335: istore_1
    //   336: iload_2
    //   337: aload #18
    //   339: invokevirtual getMeasuredHeight : ()I
    //   342: invokestatic max : (II)I
    //   345: istore_2
    //   346: iload #21
    //   348: iconst_1
    //   349: if_icmpne -> 365
    //   352: lload #16
    //   354: iconst_1
    //   355: iload #12
    //   357: ishl
    //   358: i2l
    //   359: lor
    //   360: lstore #16
    //   362: goto -> 365
    //   365: iinc #12, 1
    //   368: iload #4
    //   370: istore #15
    //   372: goto -> 116
    //   375: iload #6
    //   377: ifeq -> 392
    //   380: iload #13
    //   382: iconst_2
    //   383: if_icmpne -> 392
    //   386: iconst_1
    //   387: istore #12
    //   389: goto -> 395
    //   392: iconst_0
    //   393: istore #12
    //   395: iconst_0
    //   396: istore #4
    //   398: iload_1
    //   399: istore #7
    //   401: iload #12
    //   403: istore #21
    //   405: iload #9
    //   407: istore #12
    //   409: iload #15
    //   411: ifle -> 723
    //   414: iload #7
    //   416: ifle -> 723
    //   419: iconst_0
    //   420: istore #22
    //   422: iconst_0
    //   423: istore #23
    //   425: ldc 2147483647
    //   427: istore #9
    //   429: lconst_0
    //   430: lstore #24
    //   432: iload #23
    //   434: iload #11
    //   436: if_icmpge -> 557
    //   439: aload_0
    //   440: iload #23
    //   442: invokevirtual getChildAt : (I)Landroid/view/View;
    //   445: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   448: checkcast androidx/appcompat/widget/ActionMenuView$LayoutParams
    //   451: astore #20
    //   453: aload #20
    //   455: getfield d : Z
    //   458: ifne -> 475
    //   461: iload #22
    //   463: istore_1
    //   464: iload #9
    //   466: istore #26
    //   468: lload #24
    //   470: lstore #27
    //   472: goto -> 540
    //   475: aload #20
    //   477: getfield b : I
    //   480: istore #29
    //   482: iload #29
    //   484: iload #9
    //   486: if_icmpge -> 504
    //   489: lconst_1
    //   490: iload #23
    //   492: lshl
    //   493: lstore #27
    //   495: iload #29
    //   497: istore #26
    //   499: iconst_1
    //   500: istore_1
    //   501: goto -> 540
    //   504: iload #22
    //   506: istore_1
    //   507: iload #9
    //   509: istore #26
    //   511: lload #24
    //   513: lstore #27
    //   515: iload #29
    //   517: iload #9
    //   519: if_icmpne -> 540
    //   522: iload #22
    //   524: iconst_1
    //   525: iadd
    //   526: istore_1
    //   527: lload #24
    //   529: lconst_1
    //   530: iload #23
    //   532: lshl
    //   533: lor
    //   534: lstore #27
    //   536: iload #9
    //   538: istore #26
    //   540: iinc #23, 1
    //   543: iload_1
    //   544: istore #22
    //   546: iload #26
    //   548: istore #9
    //   550: lload #27
    //   552: lstore #24
    //   554: goto -> 432
    //   557: iload #4
    //   559: istore_1
    //   560: lload #16
    //   562: lload #24
    //   564: lor
    //   565: lstore #16
    //   567: iload #22
    //   569: iload #7
    //   571: if_icmple -> 577
    //   574: goto -> 726
    //   577: iconst_0
    //   578: istore_1
    //   579: iload_1
    //   580: iload #11
    //   582: if_icmpge -> 717
    //   585: aload_0
    //   586: iload_1
    //   587: invokevirtual getChildAt : (I)Landroid/view/View;
    //   590: astore #18
    //   592: aload #18
    //   594: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   597: checkcast androidx/appcompat/widget/ActionMenuView$LayoutParams
    //   600: astore #20
    //   602: iconst_1
    //   603: iload_1
    //   604: ishl
    //   605: i2l
    //   606: lstore #30
    //   608: lload #24
    //   610: lload #30
    //   612: land
    //   613: lconst_0
    //   614: lcmp
    //   615: ifne -> 648
    //   618: lload #16
    //   620: lstore #27
    //   622: aload #20
    //   624: getfield b : I
    //   627: iload #9
    //   629: iconst_1
    //   630: iadd
    //   631: if_icmpne -> 641
    //   634: lload #16
    //   636: lload #30
    //   638: lor
    //   639: lstore #27
    //   641: lload #27
    //   643: lstore #16
    //   645: goto -> 711
    //   648: iload #21
    //   650: ifeq -> 690
    //   653: aload #20
    //   655: getfield e : Z
    //   658: ifeq -> 690
    //   661: iload #7
    //   663: iconst_1
    //   664: if_icmpne -> 690
    //   667: aload_0
    //   668: getfield A : I
    //   671: istore #4
    //   673: aload #18
    //   675: iload #4
    //   677: iload #10
    //   679: iadd
    //   680: iconst_0
    //   681: iload #4
    //   683: iconst_0
    //   684: invokevirtual setPadding : (IIII)V
    //   687: goto -> 690
    //   690: aload #20
    //   692: aload #20
    //   694: getfield b : I
    //   697: iconst_1
    //   698: iadd
    //   699: putfield b : I
    //   702: aload #20
    //   704: iconst_1
    //   705: putfield f : Z
    //   708: iinc #7, -1
    //   711: iinc #1, 1
    //   714: goto -> 579
    //   717: iconst_1
    //   718: istore #4
    //   720: goto -> 409
    //   723: iload #4
    //   725: istore_1
    //   726: iload #6
    //   728: ifne -> 743
    //   731: iload #13
    //   733: iconst_1
    //   734: if_icmpne -> 743
    //   737: iconst_1
    //   738: istore #4
    //   740: goto -> 746
    //   743: iconst_0
    //   744: istore #4
    //   746: iload #7
    //   748: ifle -> 1096
    //   751: lload #16
    //   753: lconst_0
    //   754: lcmp
    //   755: ifeq -> 1096
    //   758: iload #7
    //   760: iload #13
    //   762: iconst_1
    //   763: isub
    //   764: if_icmplt -> 778
    //   767: iload #4
    //   769: ifne -> 778
    //   772: iload #14
    //   774: iconst_1
    //   775: if_icmple -> 1096
    //   778: lload #16
    //   780: invokestatic bitCount : (J)I
    //   783: i2f
    //   784: fstore #32
    //   786: iload #4
    //   788: ifne -> 887
    //   791: fload #32
    //   793: fstore #33
    //   795: lload #16
    //   797: lconst_1
    //   798: land
    //   799: lconst_0
    //   800: lcmp
    //   801: ifeq -> 832
    //   804: fload #32
    //   806: fstore #33
    //   808: aload_0
    //   809: iconst_0
    //   810: invokevirtual getChildAt : (I)Landroid/view/View;
    //   813: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   816: checkcast androidx/appcompat/widget/ActionMenuView$LayoutParams
    //   819: getfield e : Z
    //   822: ifne -> 832
    //   825: fload #32
    //   827: ldc 0.5
    //   829: fsub
    //   830: fstore #33
    //   832: iload #11
    //   834: iconst_1
    //   835: isub
    //   836: istore #4
    //   838: fload #33
    //   840: fstore #32
    //   842: lload #16
    //   844: iconst_1
    //   845: iload #4
    //   847: ishl
    //   848: i2l
    //   849: land
    //   850: lconst_0
    //   851: lcmp
    //   852: ifeq -> 887
    //   855: fload #33
    //   857: fstore #32
    //   859: aload_0
    //   860: iload #4
    //   862: invokevirtual getChildAt : (I)Landroid/view/View;
    //   865: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   868: checkcast androidx/appcompat/widget/ActionMenuView$LayoutParams
    //   871: getfield e : Z
    //   874: ifne -> 887
    //   877: fload #33
    //   879: ldc 0.5
    //   881: fsub
    //   882: fstore #32
    //   884: goto -> 887
    //   887: fload #32
    //   889: fconst_0
    //   890: fcmpl
    //   891: ifle -> 909
    //   894: iload #7
    //   896: iload #10
    //   898: imul
    //   899: i2f
    //   900: fload #32
    //   902: fdiv
    //   903: f2i
    //   904: istore #4
    //   906: goto -> 912
    //   909: iconst_0
    //   910: istore #4
    //   912: iconst_0
    //   913: istore #6
    //   915: iload_1
    //   916: istore #15
    //   918: iload #6
    //   920: iload #11
    //   922: if_icmpge -> 1099
    //   925: lload #16
    //   927: iconst_1
    //   928: iload #6
    //   930: ishl
    //   931: i2l
    //   932: land
    //   933: lconst_0
    //   934: lcmp
    //   935: ifne -> 944
    //   938: iload_1
    //   939: istore #15
    //   941: goto -> 1087
    //   944: aload_0
    //   945: iload #6
    //   947: invokevirtual getChildAt : (I)Landroid/view/View;
    //   950: astore #20
    //   952: aload #20
    //   954: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   957: checkcast androidx/appcompat/widget/ActionMenuView$LayoutParams
    //   960: astore #18
    //   962: aload #20
    //   964: instanceof androidx/appcompat/view/menu/ActionMenuItemView
    //   967: ifeq -> 1012
    //   970: aload #18
    //   972: iload #4
    //   974: putfield c : I
    //   977: aload #18
    //   979: iconst_1
    //   980: putfield f : Z
    //   983: iload #6
    //   985: ifne -> 1009
    //   988: aload #18
    //   990: getfield e : Z
    //   993: ifne -> 1009
    //   996: aload #18
    //   998: iload #4
    //   1000: ineg
    //   1001: iconst_2
    //   1002: idiv
    //   1003: putfield leftMargin : I
    //   1006: goto -> 1009
    //   1009: goto -> 1043
    //   1012: aload #18
    //   1014: getfield a : Z
    //   1017: ifeq -> 1049
    //   1020: aload #18
    //   1022: iload #4
    //   1024: putfield c : I
    //   1027: aload #18
    //   1029: iconst_1
    //   1030: putfield f : Z
    //   1033: aload #18
    //   1035: iload #4
    //   1037: ineg
    //   1038: iconst_2
    //   1039: idiv
    //   1040: putfield rightMargin : I
    //   1043: iconst_1
    //   1044: istore #15
    //   1046: goto -> 1087
    //   1049: iload #6
    //   1051: ifeq -> 1063
    //   1054: aload #18
    //   1056: iload #4
    //   1058: iconst_2
    //   1059: idiv
    //   1060: putfield leftMargin : I
    //   1063: iload_1
    //   1064: istore #15
    //   1066: iload #6
    //   1068: iload #11
    //   1070: iconst_1
    //   1071: isub
    //   1072: if_icmpeq -> 1087
    //   1075: aload #18
    //   1077: iload #4
    //   1079: iconst_2
    //   1080: idiv
    //   1081: putfield rightMargin : I
    //   1084: iload_1
    //   1085: istore #15
    //   1087: iinc #6, 1
    //   1090: iload #15
    //   1092: istore_1
    //   1093: goto -> 915
    //   1096: iload_1
    //   1097: istore #15
    //   1099: iload #15
    //   1101: ifeq -> 1172
    //   1104: iconst_0
    //   1105: istore_1
    //   1106: iload_1
    //   1107: iload #11
    //   1109: if_icmpge -> 1172
    //   1112: aload_0
    //   1113: iload_1
    //   1114: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1117: astore #20
    //   1119: aload #20
    //   1121: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1124: checkcast androidx/appcompat/widget/ActionMenuView$LayoutParams
    //   1127: astore #18
    //   1129: aload #18
    //   1131: getfield f : Z
    //   1134: ifne -> 1140
    //   1137: goto -> 1166
    //   1140: aload #20
    //   1142: aload #18
    //   1144: getfield b : I
    //   1147: iload #10
    //   1149: imul
    //   1150: aload #18
    //   1152: getfield c : I
    //   1155: iadd
    //   1156: ldc 1073741824
    //   1158: invokestatic makeMeasureSpec : (II)I
    //   1161: iload #8
    //   1163: invokevirtual measure : (II)V
    //   1166: iinc #1, 1
    //   1169: goto -> 1106
    //   1172: iload_3
    //   1173: ldc 1073741824
    //   1175: if_icmpeq -> 1181
    //   1178: goto -> 1184
    //   1181: iload #5
    //   1183: istore_2
    //   1184: aload_0
    //   1185: iload #12
    //   1187: iload_2
    //   1188: invokevirtual setMeasuredDimension : (II)V
    //   1191: return
  }
  
  public void B() {
    ActionMenuPresenter actionMenuPresenter = this.u;
    if (actionMenuPresenter != null)
      actionMenuPresenter.B(); 
  }
  
  protected LayoutParams C() {
    LayoutParams layoutParams = new LayoutParams(-2, -2);
    layoutParams.gravity = 16;
    return layoutParams;
  }
  
  public LayoutParams D(AttributeSet paramAttributeSet) {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected LayoutParams E(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams != null) {
      LayoutParams layoutParams;
      if (paramLayoutParams instanceof LayoutParams) {
        layoutParams = new LayoutParams((LayoutParams)paramLayoutParams);
      } else {
        layoutParams = new LayoutParams((ViewGroup.LayoutParams)layoutParams);
      } 
      if (layoutParams.gravity <= 0)
        layoutParams.gravity = 16; 
      return layoutParams;
    } 
    return C();
  }
  
  public LayoutParams F() {
    LayoutParams layoutParams = C();
    layoutParams.a = true;
    return layoutParams;
  }
  
  protected boolean G(int paramInt) {
    boolean bool;
    int i = 0;
    if (paramInt == 0)
      return false; 
    View view1 = getChildAt(paramInt - 1);
    View view2 = getChildAt(paramInt);
    int j = i;
    if (paramInt < getChildCount()) {
      j = i;
      if (view1 instanceof a)
        j = false | ((a)view1).a(); 
    } 
    i = j;
    if (paramInt > 0) {
      i = j;
      if (view2 instanceof a)
        bool = j | ((a)view2).b(); 
    } 
    return bool;
  }
  
  public boolean H() {
    boolean bool;
    ActionMenuPresenter actionMenuPresenter = this.u;
    if (actionMenuPresenter != null && actionMenuPresenter.E()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean I() {
    boolean bool;
    ActionMenuPresenter actionMenuPresenter = this.u;
    if (actionMenuPresenter != null && actionMenuPresenter.G()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean J() {
    boolean bool;
    ActionMenuPresenter actionMenuPresenter = this.u;
    if (actionMenuPresenter != null && actionMenuPresenter.H()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean K() {
    return this.t;
  }
  
  public g N() {
    return this.q;
  }
  
  public boolean O() {
    boolean bool;
    ActionMenuPresenter actionMenuPresenter = this.u;
    if (actionMenuPresenter != null && actionMenuPresenter.N()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean a(i parami) {
    return this.q.N((MenuItem)parami, 0);
  }
  
  public void b(g paramg) {
    this.q = paramg;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return false;
  }
  
  public Menu getMenu() {
    if (this.q == null) {
      Context context = getContext();
      g g1 = new g(context);
      this.q = g1;
      g1.V(new c(this));
      ActionMenuPresenter actionMenuPresenter1 = new ActionMenuPresenter(context);
      this.u = actionMenuPresenter1;
      actionMenuPresenter1.M(true);
      ActionMenuPresenter actionMenuPresenter2 = this.u;
      m.a a1 = this.v;
      if (a1 == null)
        a1 = new b(); 
      actionMenuPresenter2.g(a1);
      this.q.c((m)this.u, this.r);
      this.u.K(this);
    } 
    return (Menu)this.q;
  }
  
  public Drawable getOverflowIcon() {
    getMenu();
    return this.u.D();
  }
  
  public int getPopupTheme() {
    return this.s;
  }
  
  public int getWindowAnimations() {
    return 0;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    ActionMenuPresenter actionMenuPresenter = this.u;
    if (actionMenuPresenter != null) {
      actionMenuPresenter.c(false);
      if (this.u.H()) {
        this.u.E();
        this.u.N();
      } 
    } 
  }
  
  public void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    B();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!this.x) {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    int i = getChildCount();
    int j = (paramInt4 - paramInt2) / 2;
    int k = getDividerWidth();
    int m = paramInt3 - paramInt1;
    paramInt1 = m - getPaddingRight() - getPaddingLeft();
    paramBoolean = k0.b((View)this);
    paramInt2 = 0;
    paramInt4 = 0;
    paramInt3 = 0;
    while (paramInt2 < i) {
      View view = getChildAt(paramInt2);
      if (view.getVisibility() != 8) {
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        if (layoutParams.a) {
          int i3;
          int i1 = view.getMeasuredWidth();
          paramInt4 = i1;
          if (G(paramInt2))
            paramInt4 = i1 + k; 
          int i2 = view.getMeasuredHeight();
          if (paramBoolean) {
            i3 = getPaddingLeft() + layoutParams.leftMargin;
            i1 = i3 + paramInt4;
          } else {
            i1 = getWidth() - getPaddingRight() - layoutParams.rightMargin;
            i3 = i1 - paramInt4;
          } 
          int i4 = j - i2 / 2;
          view.layout(i3, i4, i1, i2 + i4);
          paramInt1 -= paramInt4;
          paramInt4 = 1;
        } else {
          paramInt1 -= view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
          G(paramInt2);
          paramInt3++;
        } 
      } 
      paramInt2++;
    } 
    if (i == 1 && paramInt4 == 0) {
      View view = getChildAt(0);
      paramInt2 = view.getMeasuredWidth();
      paramInt1 = view.getMeasuredHeight();
      paramInt3 = m / 2 - paramInt2 / 2;
      paramInt4 = j - paramInt1 / 2;
      view.layout(paramInt3, paramInt4, paramInt2 + paramInt3, paramInt1 + paramInt4);
      return;
    } 
    paramInt2 = paramInt3 - (paramInt4 ^ 0x1);
    if (paramInt2 > 0) {
      paramInt1 /= paramInt2;
    } else {
      paramInt1 = 0;
    } 
    paramInt4 = Math.max(0, paramInt1);
    if (paramBoolean) {
      paramInt2 = getWidth() - getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < i) {
        View view = getChildAt(paramInt1);
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (layoutParams.a) {
            paramInt3 = paramInt2;
          } else {
            int i2 = paramInt2 - layoutParams.rightMargin;
            paramInt2 = view.getMeasuredWidth();
            int i1 = view.getMeasuredHeight();
            paramInt3 = j - i1 / 2;
            view.layout(i2 - paramInt2, paramInt3, i2, i1 + paramInt3);
            paramInt3 = i2 - paramInt2 + layoutParams.leftMargin + paramInt4;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } else {
      paramInt2 = getPaddingLeft();
      paramInt1 = 0;
      while (paramInt1 < i) {
        View view = getChildAt(paramInt1);
        LayoutParams layoutParams = (LayoutParams)view.getLayoutParams();
        paramInt3 = paramInt2;
        if (view.getVisibility() != 8)
          if (layoutParams.a) {
            paramInt3 = paramInt2;
          } else {
            int i1 = paramInt2 + layoutParams.leftMargin;
            int i2 = view.getMeasuredWidth();
            paramInt2 = view.getMeasuredHeight();
            paramInt3 = j - paramInt2 / 2;
            view.layout(i1, paramInt3, i1 + i2, paramInt2 + paramInt3);
            paramInt3 = i1 + i2 + layoutParams.rightMargin + paramInt4;
          }  
        paramInt1++;
        paramInt2 = paramInt3;
      } 
    } 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    boolean bool2;
    boolean bool1 = this.x;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.x = bool2;
    if (bool1 != bool2)
      this.y = 0; 
    int i = View.MeasureSpec.getSize(paramInt1);
    if (this.x) {
      g g1 = this.q;
      if (g1 != null && i != this.y) {
        this.y = i;
        g1.M(true);
      } 
    } 
    int j = getChildCount();
    if (this.x && j > 0) {
      M(paramInt1, paramInt2);
    } else {
      for (i = 0; i < j; i++) {
        LayoutParams layoutParams = (LayoutParams)getChildAt(i).getLayoutParams();
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
      } 
      super.onMeasure(paramInt1, paramInt2);
    } 
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean) {
    this.u.J(paramBoolean);
  }
  
  public void setMenuCallbacks(m.a parama, g.a parama1) {
    this.v = parama;
    this.w = parama1;
  }
  
  public void setOnMenuItemClickListener(d paramd) {
    this.B = paramd;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    getMenu();
    this.u.L(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean) {
    this.t = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.s != paramInt) {
      this.s = paramInt;
      if (paramInt == 0) {
        this.r = getContext();
      } else {
        this.r = (Context)new ContextThemeWrapper(getContext(), paramInt);
      } 
    } 
  }
  
  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter) {
    this.u = paramActionMenuPresenter;
    paramActionMenuPresenter.K(this);
  }
  
  public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
    @ExportedProperty
    public boolean a;
    
    @ExportedProperty
    public int b;
    
    @ExportedProperty
    public int c;
    
    @ExportedProperty
    public boolean d;
    
    @ExportedProperty
    public boolean e;
    
    boolean f;
    
    public LayoutParams(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
      this.a = false;
    }
    
    public LayoutParams(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public LayoutParams(LayoutParams param1LayoutParams) {
      super((ViewGroup.LayoutParams)param1LayoutParams);
      this.a = param1LayoutParams.a;
    }
  }
  
  public static interface a {
    boolean a();
    
    boolean b();
  }
  
  private static class b implements m.a {
    public void b(g param1g, boolean param1Boolean) {}
    
    public boolean c(g param1g) {
      return false;
    }
  }
  
  private class c implements g.a {
    c(ActionMenuView this$0) {}
    
    public boolean a(g param1g, MenuItem param1MenuItem) {
      boolean bool;
      ActionMenuView.d d = this.b.B;
      if (d != null && d.onMenuItemClick(param1MenuItem)) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public void b(g param1g) {
      g.a a1 = this.b.w;
      if (a1 != null)
        a1.b(param1g); 
    }
  }
  
  public static interface d {
    boolean onMenuItemClick(MenuItem param1MenuItem);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ActionMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */