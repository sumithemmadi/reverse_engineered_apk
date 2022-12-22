package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.e;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class m extends c {
  private int g = -1;
  
  private String h = null;
  
  private int i;
  
  private String j;
  
  private String k;
  
  private int l;
  
  private int m;
  
  private View n;
  
  float o;
  
  private boolean p;
  
  private boolean q;
  
  private boolean r;
  
  private float s;
  
  private Method t;
  
  private Method u;
  
  private Method v;
  
  private float w;
  
  private boolean x;
  
  RectF y;
  
  RectF z;
  
  public m() {
    int i = c.a;
    this.i = i;
    this.j = null;
    this.k = null;
    this.l = i;
    this.m = i;
    this.n = null;
    this.o = 0.1F;
    this.p = true;
    this.q = true;
    this.r = true;
    this.s = Float.NaN;
    this.x = false;
    this.y = new RectF();
    this.z = new RectF();
    this.e = 5;
    this.f = new HashMap<String, ConstraintAttribute>();
  }
  
  private void s(RectF paramRectF, View paramView, boolean paramBoolean) {
    paramRectF.top = paramView.getTop();
    paramRectF.bottom = paramView.getBottom();
    paramRectF.left = paramView.getLeft();
    paramRectF.right = paramView.getRight();
    if (paramBoolean)
      paramView.getMatrix().mapRect(paramRectF); 
  }
  
  public void a(HashMap<String, s> paramHashMap) {}
  
  public void b(HashSet<String> paramHashSet) {}
  
  public void c(Context paramContext, AttributeSet paramAttributeSet) {
    a.a(this, paramContext.obtainStyledAttributes(paramAttributeSet, e.KeyTrigger), paramContext);
  }
  
  public void r(float paramFloat, View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : I
    //   4: istore_3
    //   5: getstatic androidx/constraintlayout/motion/widget/c.a : I
    //   8: istore #4
    //   10: iconst_1
    //   11: istore #5
    //   13: iload_3
    //   14: iload #4
    //   16: if_icmpeq -> 186
    //   19: aload_0
    //   20: getfield n : Landroid/view/View;
    //   23: ifnonnull -> 44
    //   26: aload_0
    //   27: aload_2
    //   28: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   31: checkcast android/view/ViewGroup
    //   34: aload_0
    //   35: getfield m : I
    //   38: invokevirtual findViewById : (I)Landroid/view/View;
    //   41: putfield n : Landroid/view/View;
    //   44: aload_0
    //   45: aload_0
    //   46: getfield y : Landroid/graphics/RectF;
    //   49: aload_0
    //   50: getfield n : Landroid/view/View;
    //   53: aload_0
    //   54: getfield x : Z
    //   57: invokespecial s : (Landroid/graphics/RectF;Landroid/view/View;Z)V
    //   60: aload_0
    //   61: aload_0
    //   62: getfield z : Landroid/graphics/RectF;
    //   65: aload_2
    //   66: aload_0
    //   67: getfield x : Z
    //   70: invokespecial s : (Landroid/graphics/RectF;Landroid/view/View;Z)V
    //   73: aload_0
    //   74: getfield y : Landroid/graphics/RectF;
    //   77: aload_0
    //   78: getfield z : Landroid/graphics/RectF;
    //   81: invokevirtual intersect : (Landroid/graphics/RectF;)Z
    //   84: ifeq -> 138
    //   87: aload_0
    //   88: getfield p : Z
    //   91: ifeq -> 104
    //   94: aload_0
    //   95: iconst_0
    //   96: putfield p : Z
    //   99: iconst_1
    //   100: istore_3
    //   101: goto -> 106
    //   104: iconst_0
    //   105: istore_3
    //   106: aload_0
    //   107: getfield r : Z
    //   110: ifeq -> 124
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield r : Z
    //   118: iconst_1
    //   119: istore #5
    //   121: goto -> 127
    //   124: iconst_0
    //   125: istore #5
    //   127: aload_0
    //   128: iconst_1
    //   129: putfield q : Z
    //   132: iconst_0
    //   133: istore #4
    //   135: goto -> 407
    //   138: aload_0
    //   139: getfield p : Z
    //   142: ifne -> 155
    //   145: aload_0
    //   146: iconst_1
    //   147: putfield p : Z
    //   150: iconst_1
    //   151: istore_3
    //   152: goto -> 157
    //   155: iconst_0
    //   156: istore_3
    //   157: aload_0
    //   158: getfield q : Z
    //   161: ifeq -> 175
    //   164: aload_0
    //   165: iconst_0
    //   166: putfield q : Z
    //   169: iconst_1
    //   170: istore #4
    //   172: goto -> 178
    //   175: iconst_0
    //   176: istore #4
    //   178: aload_0
    //   179: iconst_1
    //   180: putfield r : Z
    //   183: goto -> 404
    //   186: aload_0
    //   187: getfield p : Z
    //   190: ifeq -> 226
    //   193: aload_0
    //   194: getfield s : F
    //   197: fstore #6
    //   199: fload_1
    //   200: fload #6
    //   202: fsub
    //   203: aload_0
    //   204: getfield w : F
    //   207: fload #6
    //   209: fsub
    //   210: fmul
    //   211: fconst_0
    //   212: fcmpg
    //   213: ifge -> 248
    //   216: aload_0
    //   217: iconst_0
    //   218: putfield p : Z
    //   221: iconst_1
    //   222: istore_3
    //   223: goto -> 250
    //   226: fload_1
    //   227: aload_0
    //   228: getfield s : F
    //   231: fsub
    //   232: invokestatic abs : (F)F
    //   235: aload_0
    //   236: getfield o : F
    //   239: fcmpl
    //   240: ifle -> 248
    //   243: aload_0
    //   244: iconst_1
    //   245: putfield p : Z
    //   248: iconst_0
    //   249: istore_3
    //   250: aload_0
    //   251: getfield q : Z
    //   254: ifeq -> 302
    //   257: aload_0
    //   258: getfield s : F
    //   261: fstore #7
    //   263: fload_1
    //   264: fload #7
    //   266: fsub
    //   267: fstore #6
    //   269: aload_0
    //   270: getfield w : F
    //   273: fload #7
    //   275: fsub
    //   276: fload #6
    //   278: fmul
    //   279: fconst_0
    //   280: fcmpg
    //   281: ifge -> 324
    //   284: fload #6
    //   286: fconst_0
    //   287: fcmpg
    //   288: ifge -> 324
    //   291: aload_0
    //   292: iconst_0
    //   293: putfield q : Z
    //   296: iconst_1
    //   297: istore #4
    //   299: goto -> 327
    //   302: fload_1
    //   303: aload_0
    //   304: getfield s : F
    //   307: fsub
    //   308: invokestatic abs : (F)F
    //   311: aload_0
    //   312: getfield o : F
    //   315: fcmpl
    //   316: ifle -> 324
    //   319: aload_0
    //   320: iconst_1
    //   321: putfield q : Z
    //   324: iconst_0
    //   325: istore #4
    //   327: aload_0
    //   328: getfield r : Z
    //   331: ifeq -> 382
    //   334: aload_0
    //   335: getfield s : F
    //   338: fstore #6
    //   340: fload_1
    //   341: fload #6
    //   343: fsub
    //   344: fstore #7
    //   346: aload_0
    //   347: getfield w : F
    //   350: fload #6
    //   352: fsub
    //   353: fload #7
    //   355: fmul
    //   356: fconst_0
    //   357: fcmpg
    //   358: ifge -> 376
    //   361: fload #7
    //   363: fconst_0
    //   364: fcmpl
    //   365: ifle -> 376
    //   368: aload_0
    //   369: iconst_0
    //   370: putfield r : Z
    //   373: goto -> 379
    //   376: iconst_0
    //   377: istore #5
    //   379: goto -> 407
    //   382: fload_1
    //   383: aload_0
    //   384: getfield s : F
    //   387: fsub
    //   388: invokestatic abs : (F)F
    //   391: aload_0
    //   392: getfield o : F
    //   395: fcmpl
    //   396: ifle -> 404
    //   399: aload_0
    //   400: iconst_1
    //   401: putfield r : Z
    //   404: iconst_0
    //   405: istore #5
    //   407: aload_0
    //   408: fload_1
    //   409: putfield w : F
    //   412: iload #4
    //   414: ifne -> 426
    //   417: iload_3
    //   418: ifne -> 426
    //   421: iload #5
    //   423: ifeq -> 443
    //   426: aload_2
    //   427: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   430: checkcast androidx/constraintlayout/motion/widget/MotionLayout
    //   433: aload_0
    //   434: getfield l : I
    //   437: iload #5
    //   439: fload_1
    //   440: invokevirtual d0 : (IZF)V
    //   443: aload_0
    //   444: getfield i : I
    //   447: getstatic androidx/constraintlayout/motion/widget/c.a : I
    //   450: if_icmpne -> 456
    //   453: goto -> 471
    //   456: aload_2
    //   457: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   460: checkcast androidx/constraintlayout/motion/widget/MotionLayout
    //   463: aload_0
    //   464: getfield i : I
    //   467: invokevirtual findViewById : (I)Landroid/view/View;
    //   470: astore_2
    //   471: iload #4
    //   473: ifeq -> 686
    //   476: aload_0
    //   477: getfield j : Ljava/lang/String;
    //   480: ifnull -> 686
    //   483: aload_0
    //   484: getfield u : Ljava/lang/reflect/Method;
    //   487: ifnonnull -> 591
    //   490: aload_0
    //   491: aload_2
    //   492: invokevirtual getClass : ()Ljava/lang/Class;
    //   495: aload_0
    //   496: getfield j : Ljava/lang/String;
    //   499: iconst_0
    //   500: anewarray java/lang/Class
    //   503: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   506: putfield u : Ljava/lang/reflect/Method;
    //   509: goto -> 591
    //   512: astore #8
    //   514: new java/lang/StringBuilder
    //   517: dup
    //   518: invokespecial <init> : ()V
    //   521: astore #8
    //   523: aload #8
    //   525: ldc 'Could not find method "'
    //   527: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: pop
    //   531: aload #8
    //   533: aload_0
    //   534: getfield j : Ljava/lang/String;
    //   537: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   540: pop
    //   541: aload #8
    //   543: ldc '"on class '
    //   545: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   548: pop
    //   549: aload #8
    //   551: aload_2
    //   552: invokevirtual getClass : ()Ljava/lang/Class;
    //   555: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   558: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: pop
    //   562: aload #8
    //   564: ldc ' '
    //   566: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   569: pop
    //   570: aload #8
    //   572: aload_2
    //   573: invokestatic c : (Landroid/view/View;)Ljava/lang/String;
    //   576: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   579: pop
    //   580: ldc 'KeyTrigger'
    //   582: aload #8
    //   584: invokevirtual toString : ()Ljava/lang/String;
    //   587: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   590: pop
    //   591: aload_0
    //   592: getfield u : Ljava/lang/reflect/Method;
    //   595: aload_2
    //   596: iconst_0
    //   597: anewarray java/lang/Object
    //   600: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   603: pop
    //   604: goto -> 686
    //   607: astore #8
    //   609: new java/lang/StringBuilder
    //   612: dup
    //   613: invokespecial <init> : ()V
    //   616: astore #8
    //   618: aload #8
    //   620: ldc 'Exception in call "'
    //   622: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: pop
    //   626: aload #8
    //   628: aload_0
    //   629: getfield j : Ljava/lang/String;
    //   632: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   635: pop
    //   636: aload #8
    //   638: ldc '"on class '
    //   640: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   643: pop
    //   644: aload #8
    //   646: aload_2
    //   647: invokevirtual getClass : ()Ljava/lang/Class;
    //   650: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   653: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   656: pop
    //   657: aload #8
    //   659: ldc ' '
    //   661: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   664: pop
    //   665: aload #8
    //   667: aload_2
    //   668: invokestatic c : (Landroid/view/View;)Ljava/lang/String;
    //   671: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   674: pop
    //   675: ldc 'KeyTrigger'
    //   677: aload #8
    //   679: invokevirtual toString : ()Ljava/lang/String;
    //   682: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   685: pop
    //   686: iload #5
    //   688: ifeq -> 901
    //   691: aload_0
    //   692: getfield k : Ljava/lang/String;
    //   695: ifnull -> 901
    //   698: aload_0
    //   699: getfield v : Ljava/lang/reflect/Method;
    //   702: ifnonnull -> 806
    //   705: aload_0
    //   706: aload_2
    //   707: invokevirtual getClass : ()Ljava/lang/Class;
    //   710: aload_0
    //   711: getfield k : Ljava/lang/String;
    //   714: iconst_0
    //   715: anewarray java/lang/Class
    //   718: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   721: putfield v : Ljava/lang/reflect/Method;
    //   724: goto -> 806
    //   727: astore #8
    //   729: new java/lang/StringBuilder
    //   732: dup
    //   733: invokespecial <init> : ()V
    //   736: astore #8
    //   738: aload #8
    //   740: ldc 'Could not find method "'
    //   742: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   745: pop
    //   746: aload #8
    //   748: aload_0
    //   749: getfield k : Ljava/lang/String;
    //   752: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   755: pop
    //   756: aload #8
    //   758: ldc '"on class '
    //   760: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   763: pop
    //   764: aload #8
    //   766: aload_2
    //   767: invokevirtual getClass : ()Ljava/lang/Class;
    //   770: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   773: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   776: pop
    //   777: aload #8
    //   779: ldc ' '
    //   781: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   784: pop
    //   785: aload #8
    //   787: aload_2
    //   788: invokestatic c : (Landroid/view/View;)Ljava/lang/String;
    //   791: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   794: pop
    //   795: ldc 'KeyTrigger'
    //   797: aload #8
    //   799: invokevirtual toString : ()Ljava/lang/String;
    //   802: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   805: pop
    //   806: aload_0
    //   807: getfield v : Ljava/lang/reflect/Method;
    //   810: aload_2
    //   811: iconst_0
    //   812: anewarray java/lang/Object
    //   815: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   818: pop
    //   819: goto -> 901
    //   822: astore #8
    //   824: new java/lang/StringBuilder
    //   827: dup
    //   828: invokespecial <init> : ()V
    //   831: astore #8
    //   833: aload #8
    //   835: ldc 'Exception in call "'
    //   837: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   840: pop
    //   841: aload #8
    //   843: aload_0
    //   844: getfield k : Ljava/lang/String;
    //   847: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   850: pop
    //   851: aload #8
    //   853: ldc '"on class '
    //   855: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   858: pop
    //   859: aload #8
    //   861: aload_2
    //   862: invokevirtual getClass : ()Ljava/lang/Class;
    //   865: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   868: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   871: pop
    //   872: aload #8
    //   874: ldc ' '
    //   876: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   879: pop
    //   880: aload #8
    //   882: aload_2
    //   883: invokestatic c : (Landroid/view/View;)Ljava/lang/String;
    //   886: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   889: pop
    //   890: ldc 'KeyTrigger'
    //   892: aload #8
    //   894: invokevirtual toString : ()Ljava/lang/String;
    //   897: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   900: pop
    //   901: iload_3
    //   902: ifeq -> 1115
    //   905: aload_0
    //   906: getfield h : Ljava/lang/String;
    //   909: ifnull -> 1115
    //   912: aload_0
    //   913: getfield t : Ljava/lang/reflect/Method;
    //   916: ifnonnull -> 1020
    //   919: aload_0
    //   920: aload_2
    //   921: invokevirtual getClass : ()Ljava/lang/Class;
    //   924: aload_0
    //   925: getfield h : Ljava/lang/String;
    //   928: iconst_0
    //   929: anewarray java/lang/Class
    //   932: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   935: putfield t : Ljava/lang/reflect/Method;
    //   938: goto -> 1020
    //   941: astore #8
    //   943: new java/lang/StringBuilder
    //   946: dup
    //   947: invokespecial <init> : ()V
    //   950: astore #8
    //   952: aload #8
    //   954: ldc 'Could not find method "'
    //   956: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   959: pop
    //   960: aload #8
    //   962: aload_0
    //   963: getfield h : Ljava/lang/String;
    //   966: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   969: pop
    //   970: aload #8
    //   972: ldc '"on class '
    //   974: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   977: pop
    //   978: aload #8
    //   980: aload_2
    //   981: invokevirtual getClass : ()Ljava/lang/Class;
    //   984: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   987: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   990: pop
    //   991: aload #8
    //   993: ldc ' '
    //   995: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   998: pop
    //   999: aload #8
    //   1001: aload_2
    //   1002: invokestatic c : (Landroid/view/View;)Ljava/lang/String;
    //   1005: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1008: pop
    //   1009: ldc 'KeyTrigger'
    //   1011: aload #8
    //   1013: invokevirtual toString : ()Ljava/lang/String;
    //   1016: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   1019: pop
    //   1020: aload_0
    //   1021: getfield t : Ljava/lang/reflect/Method;
    //   1024: aload_2
    //   1025: iconst_0
    //   1026: anewarray java/lang/Object
    //   1029: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1032: pop
    //   1033: goto -> 1115
    //   1036: astore #8
    //   1038: new java/lang/StringBuilder
    //   1041: dup
    //   1042: invokespecial <init> : ()V
    //   1045: astore #8
    //   1047: aload #8
    //   1049: ldc 'Exception in call "'
    //   1051: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1054: pop
    //   1055: aload #8
    //   1057: aload_0
    //   1058: getfield h : Ljava/lang/String;
    //   1061: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1064: pop
    //   1065: aload #8
    //   1067: ldc '"on class '
    //   1069: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1072: pop
    //   1073: aload #8
    //   1075: aload_2
    //   1076: invokevirtual getClass : ()Ljava/lang/Class;
    //   1079: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   1082: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1085: pop
    //   1086: aload #8
    //   1088: ldc ' '
    //   1090: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1093: pop
    //   1094: aload #8
    //   1096: aload_2
    //   1097: invokestatic c : (Landroid/view/View;)Ljava/lang/String;
    //   1100: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1103: pop
    //   1104: ldc 'KeyTrigger'
    //   1106: aload #8
    //   1108: invokevirtual toString : ()Ljava/lang/String;
    //   1111: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   1114: pop
    //   1115: return
    // Exception table:
    //   from	to	target	type
    //   490	509	512	java/lang/NoSuchMethodException
    //   591	604	607	java/lang/Exception
    //   705	724	727	java/lang/NoSuchMethodException
    //   806	819	822	java/lang/Exception
    //   919	938	941	java/lang/NoSuchMethodException
    //   1020	1033	1036	java/lang/Exception
  }
  
  private static class a {
    private static SparseIntArray a;
    
    static {
      SparseIntArray sparseIntArray = new SparseIntArray();
      a = sparseIntArray;
      sparseIntArray.append(e.KeyTrigger_framePosition, 8);
      a.append(e.KeyTrigger_onCross, 4);
      a.append(e.KeyTrigger_onNegativeCross, 1);
      a.append(e.KeyTrigger_onPositiveCross, 2);
      a.append(e.KeyTrigger_motionTarget, 7);
      a.append(e.KeyTrigger_triggerId, 6);
      a.append(e.KeyTrigger_triggerSlack, 5);
      a.append(e.KeyTrigger_motion_triggerOnCollision, 9);
      a.append(e.KeyTrigger_motion_postLayoutCollision, 10);
      a.append(e.KeyTrigger_triggerReceiver, 11);
    }
    
    public static void a(m param1m, TypedArray param1TypedArray, Context param1Context) {
      int i = param1TypedArray.getIndexCount();
      for (byte b = 0;; b++) {
        if (b < i) {
          StringBuilder stringBuilder;
          int k;
          int j = param1TypedArray.getIndex(b);
          switch (a.get(j)) {
            default:
              stringBuilder = new StringBuilder();
              stringBuilder.append("unused attribute 0x");
              stringBuilder.append(Integer.toHexString(j));
              stringBuilder.append("   ");
              stringBuilder.append(a.get(j));
              Log.e("KeyTrigger", stringBuilder.toString());
              b++;
              continue;
            case 11:
              m.q(param1m, param1TypedArray.getResourceId(j, m.p(param1m)));
            case 10:
              m.o(param1m, param1TypedArray.getBoolean(j, m.n(param1m)));
              break;
            case 9:
              m.m(param1m, param1TypedArray.getResourceId(j, m.l(param1m)));
              break;
            case 8:
              k = param1TypedArray.getInteger(j, param1m.b);
              param1m.b = k;
              m.f(param1m, (k + 0.5F) / 100.0F);
              break;
            case 7:
              if (MotionLayout.y) {
                k = param1TypedArray.getResourceId(j, param1m.c);
                param1m.c = k;
                if (k == -1)
                  param1m.d = param1TypedArray.getString(j); 
                break;
              } 
              if ((param1TypedArray.peekValue(j)).type == 3) {
                param1m.d = param1TypedArray.getString(j);
                break;
              } 
              param1m.c = param1TypedArray.getResourceId(j, param1m.c);
              break;
            case 6:
              m.k(param1m, param1TypedArray.getResourceId(j, m.j(param1m)));
              break;
            case 5:
              param1m.o = param1TypedArray.getFloat(j, param1m.o);
              break;
            case 4:
              m.i(param1m, param1TypedArray.getString(j));
              break;
            case 2:
              m.h(param1m, param1TypedArray.getString(j));
              break;
            case 1:
              m.g(param1m, param1TypedArray.getString(j));
              break;
          } 
        } else {
          break;
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/motion/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */