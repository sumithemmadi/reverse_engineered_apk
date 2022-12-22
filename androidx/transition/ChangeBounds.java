package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import b.h.k.w;
import org.xmlpull.v1.XmlPullParser;

public class ChangeBounds extends Transition {
  private static final String[] L = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
  
  private static final Property<Drawable, PointF> M = new b(PointF.class, "boundsOrigin");
  
  private static final Property<k, PointF> N = new c(PointF.class, "topLeft");
  
  private static final Property<k, PointF> O = new d(PointF.class, "bottomRight");
  
  private static final Property<View, PointF> P = new e(PointF.class, "bottomRight");
  
  private static final Property<View, PointF> Q = new f(PointF.class, "topLeft");
  
  private static final Property<View, PointF> R = new g(PointF.class, "position");
  
  private static q S = new q();
  
  private int[] T = new int[2];
  
  private boolean U = false;
  
  private boolean V = false;
  
  public ChangeBounds() {}
  
  @SuppressLint({"RestrictedApi"})
  public ChangeBounds(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.d);
    boolean bool = androidx.core.content.d.g.a(typedArray, (XmlPullParser)paramAttributeSet, "resizeClip", 0, false);
    typedArray.recycle();
    q0(bool);
  }
  
  private void o0(y paramy) {
    View view = paramy.b;
    if (w.V(view) || view.getWidth() != 0 || view.getHeight() != 0) {
      paramy.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
      paramy.a.put("android:changeBounds:parent", paramy.b.getParent());
      if (this.V) {
        paramy.b.getLocationInWindow(this.T);
        paramy.a.put("android:changeBounds:windowX", Integer.valueOf(this.T[0]));
        paramy.a.put("android:changeBounds:windowY", Integer.valueOf(this.T[1]));
      } 
      if (this.U)
        paramy.a.put("android:changeBounds:clip", w.u(view)); 
    } 
  }
  
  private boolean p0(View paramView1, View paramView2) {
    boolean bool = this.V;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (bool) {
      y y = C(paramView1, true);
      if (y == null) {
        if (paramView1 == paramView2)
          return bool1; 
      } else if (paramView2 == y.b) {
        return bool1;
      } 
      bool2 = false;
    } 
    return bool2;
  }
  
  public String[] M() {
    return L;
  }
  
  public void l(y paramy) {
    o0(paramy);
  }
  
  public void q(y paramy) {
    o0(paramy);
  }
  
  public void q0(boolean paramBoolean) {
    this.U = paramBoolean;
  }
  
  public Animator v(ViewGroup paramViewGroup, y paramy1, y paramy2) {
    // Byte code:
    //   0: aload_2
    //   1: ifnull -> 1103
    //   4: aload_3
    //   5: ifnonnull -> 11
    //   8: goto -> 1103
    //   11: aload_2
    //   12: getfield a : Ljava/util/Map;
    //   15: astore #4
    //   17: aload_3
    //   18: getfield a : Ljava/util/Map;
    //   21: astore #5
    //   23: aload #4
    //   25: ldc 'android:changeBounds:parent'
    //   27: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   32: checkcast android/view/ViewGroup
    //   35: astore #4
    //   37: aload #5
    //   39: ldc 'android:changeBounds:parent'
    //   41: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   46: checkcast android/view/ViewGroup
    //   49: astore #6
    //   51: aload #4
    //   53: ifnull -> 1101
    //   56: aload #6
    //   58: ifnonnull -> 64
    //   61: goto -> 1101
    //   64: aload_3
    //   65: getfield b : Landroid/view/View;
    //   68: astore #5
    //   70: aload_0
    //   71: aload #4
    //   73: aload #6
    //   75: invokespecial p0 : (Landroid/view/View;Landroid/view/View;)Z
    //   78: ifeq -> 849
    //   81: aload_2
    //   82: getfield a : Ljava/util/Map;
    //   85: ldc 'android:changeBounds:bounds'
    //   87: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: checkcast android/graphics/Rect
    //   95: astore_1
    //   96: aload_3
    //   97: getfield a : Ljava/util/Map;
    //   100: ldc 'android:changeBounds:bounds'
    //   102: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   107: checkcast android/graphics/Rect
    //   110: astore #4
    //   112: aload_1
    //   113: getfield left : I
    //   116: istore #7
    //   118: aload #4
    //   120: getfield left : I
    //   123: istore #8
    //   125: aload_1
    //   126: getfield top : I
    //   129: istore #9
    //   131: aload #4
    //   133: getfield top : I
    //   136: istore #10
    //   138: aload_1
    //   139: getfield right : I
    //   142: istore #11
    //   144: aload #4
    //   146: getfield right : I
    //   149: istore #12
    //   151: aload_1
    //   152: getfield bottom : I
    //   155: istore #13
    //   157: aload #4
    //   159: getfield bottom : I
    //   162: istore #14
    //   164: iload #11
    //   166: iload #7
    //   168: isub
    //   169: istore #15
    //   171: iload #13
    //   173: iload #9
    //   175: isub
    //   176: istore #16
    //   178: iload #12
    //   180: iload #8
    //   182: isub
    //   183: istore #17
    //   185: iload #14
    //   187: iload #10
    //   189: isub
    //   190: istore #18
    //   192: aload_2
    //   193: getfield a : Ljava/util/Map;
    //   196: ldc 'android:changeBounds:clip'
    //   198: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   203: checkcast android/graphics/Rect
    //   206: astore_2
    //   207: aload_3
    //   208: getfield a : Ljava/util/Map;
    //   211: ldc 'android:changeBounds:clip'
    //   213: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   218: checkcast android/graphics/Rect
    //   221: astore #4
    //   223: iload #15
    //   225: ifeq -> 233
    //   228: iload #16
    //   230: ifne -> 243
    //   233: iload #17
    //   235: ifeq -> 296
    //   238: iload #18
    //   240: ifeq -> 296
    //   243: iload #7
    //   245: iload #8
    //   247: if_icmpne -> 266
    //   250: iload #9
    //   252: iload #10
    //   254: if_icmpeq -> 260
    //   257: goto -> 266
    //   260: iconst_0
    //   261: istore #19
    //   263: goto -> 269
    //   266: iconst_1
    //   267: istore #19
    //   269: iload #11
    //   271: iload #12
    //   273: if_icmpne -> 287
    //   276: iload #19
    //   278: istore #20
    //   280: iload #13
    //   282: iload #14
    //   284: if_icmpeq -> 299
    //   287: iload #19
    //   289: iconst_1
    //   290: iadd
    //   291: istore #20
    //   293: goto -> 299
    //   296: iconst_0
    //   297: istore #20
    //   299: aload_2
    //   300: ifnull -> 312
    //   303: aload_2
    //   304: aload #4
    //   306: invokevirtual equals : (Ljava/lang/Object;)Z
    //   309: ifeq -> 329
    //   312: iload #20
    //   314: istore #19
    //   316: aload_2
    //   317: ifnonnull -> 335
    //   320: iload #20
    //   322: istore #19
    //   324: aload #4
    //   326: ifnull -> 335
    //   329: iload #20
    //   331: iconst_1
    //   332: iadd
    //   333: istore #19
    //   335: iload #19
    //   337: ifle -> 942
    //   340: aload_0
    //   341: getfield U : Z
    //   344: ifne -> 604
    //   347: aload #5
    //   349: astore_1
    //   350: aload_1
    //   351: iload #7
    //   353: iload #9
    //   355: iload #11
    //   357: iload #13
    //   359: invokestatic g : (Landroid/view/View;IIII)V
    //   362: iload #19
    //   364: iconst_2
    //   365: if_icmpne -> 523
    //   368: iload #15
    //   370: iload #17
    //   372: if_icmpne -> 414
    //   375: iload #16
    //   377: iload #18
    //   379: if_icmpne -> 414
    //   382: aload_0
    //   383: invokevirtual E : ()Landroidx/transition/PathMotion;
    //   386: iload #7
    //   388: i2f
    //   389: iload #9
    //   391: i2f
    //   392: iload #8
    //   394: i2f
    //   395: iload #10
    //   397: i2f
    //   398: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   401: astore_2
    //   402: aload_1
    //   403: getstatic androidx/transition/ChangeBounds.R : Landroid/util/Property;
    //   406: aload_2
    //   407: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   410: astore_1
    //   411: goto -> 808
    //   414: new androidx/transition/ChangeBounds$k
    //   417: dup
    //   418: aload_1
    //   419: invokespecial <init> : (Landroid/view/View;)V
    //   422: astore_2
    //   423: aload_0
    //   424: invokevirtual E : ()Landroidx/transition/PathMotion;
    //   427: iload #7
    //   429: i2f
    //   430: iload #9
    //   432: i2f
    //   433: iload #8
    //   435: i2f
    //   436: iload #10
    //   438: i2f
    //   439: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   442: astore_1
    //   443: aload_2
    //   444: getstatic androidx/transition/ChangeBounds.N : Landroid/util/Property;
    //   447: aload_1
    //   448: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   451: astore_3
    //   452: aload_0
    //   453: invokevirtual E : ()Landroidx/transition/PathMotion;
    //   456: iload #11
    //   458: i2f
    //   459: iload #13
    //   461: i2f
    //   462: iload #12
    //   464: i2f
    //   465: iload #14
    //   467: i2f
    //   468: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   471: astore_1
    //   472: aload_2
    //   473: getstatic androidx/transition/ChangeBounds.O : Landroid/util/Property;
    //   476: aload_1
    //   477: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   480: astore #4
    //   482: new android/animation/AnimatorSet
    //   485: dup
    //   486: invokespecial <init> : ()V
    //   489: astore_1
    //   490: aload_1
    //   491: iconst_2
    //   492: anewarray android/animation/Animator
    //   495: dup
    //   496: iconst_0
    //   497: aload_3
    //   498: aastore
    //   499: dup
    //   500: iconst_1
    //   501: aload #4
    //   503: aastore
    //   504: invokevirtual playTogether : ([Landroid/animation/Animator;)V
    //   507: aload_1
    //   508: new androidx/transition/ChangeBounds$h
    //   511: dup
    //   512: aload_0
    //   513: aload_2
    //   514: invokespecial <init> : (Landroidx/transition/ChangeBounds;Landroidx/transition/ChangeBounds$k;)V
    //   517: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   520: goto -> 808
    //   523: iload #7
    //   525: iload #8
    //   527: if_icmpne -> 572
    //   530: iload #9
    //   532: iload #10
    //   534: if_icmpeq -> 540
    //   537: goto -> 572
    //   540: aload_0
    //   541: invokevirtual E : ()Landroidx/transition/PathMotion;
    //   544: iload #11
    //   546: i2f
    //   547: iload #13
    //   549: i2f
    //   550: iload #12
    //   552: i2f
    //   553: iload #14
    //   555: i2f
    //   556: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   559: astore_2
    //   560: aload_1
    //   561: getstatic androidx/transition/ChangeBounds.P : Landroid/util/Property;
    //   564: aload_2
    //   565: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   568: astore_1
    //   569: goto -> 808
    //   572: aload_0
    //   573: invokevirtual E : ()Landroidx/transition/PathMotion;
    //   576: iload #7
    //   578: i2f
    //   579: iload #9
    //   581: i2f
    //   582: iload #8
    //   584: i2f
    //   585: iload #10
    //   587: i2f
    //   588: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   591: astore_2
    //   592: aload_1
    //   593: getstatic androidx/transition/ChangeBounds.Q : Landroid/util/Property;
    //   596: aload_2
    //   597: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   600: astore_1
    //   601: goto -> 808
    //   604: aload #5
    //   606: astore #6
    //   608: aload #6
    //   610: iload #7
    //   612: iload #9
    //   614: iload #15
    //   616: iload #17
    //   618: invokestatic max : (II)I
    //   621: iload #7
    //   623: iadd
    //   624: iload #16
    //   626: iload #18
    //   628: invokestatic max : (II)I
    //   631: iload #9
    //   633: iadd
    //   634: invokestatic g : (Landroid/view/View;IIII)V
    //   637: iload #7
    //   639: iload #8
    //   641: if_icmpne -> 659
    //   644: iload #9
    //   646: iload #10
    //   648: if_icmpeq -> 654
    //   651: goto -> 659
    //   654: aconst_null
    //   655: astore_1
    //   656: goto -> 689
    //   659: aload_0
    //   660: invokevirtual E : ()Landroidx/transition/PathMotion;
    //   663: iload #7
    //   665: i2f
    //   666: iload #9
    //   668: i2f
    //   669: iload #8
    //   671: i2f
    //   672: iload #10
    //   674: i2f
    //   675: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   678: astore_1
    //   679: aload #6
    //   681: getstatic androidx/transition/ChangeBounds.R : Landroid/util/Property;
    //   684: aload_1
    //   685: invokestatic a : (Ljava/lang/Object;Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/ObjectAnimator;
    //   688: astore_1
    //   689: aload_2
    //   690: ifnonnull -> 710
    //   693: new android/graphics/Rect
    //   696: dup
    //   697: iconst_0
    //   698: iconst_0
    //   699: iload #15
    //   701: iload #16
    //   703: invokespecial <init> : (IIII)V
    //   706: astore_2
    //   707: goto -> 710
    //   710: aload #4
    //   712: ifnonnull -> 732
    //   715: new android/graphics/Rect
    //   718: dup
    //   719: iconst_0
    //   720: iconst_0
    //   721: iload #17
    //   723: iload #18
    //   725: invokespecial <init> : (IIII)V
    //   728: astore_3
    //   729: goto -> 735
    //   732: aload #4
    //   734: astore_3
    //   735: aload_2
    //   736: aload_3
    //   737: invokevirtual equals : (Ljava/lang/Object;)Z
    //   740: ifne -> 800
    //   743: aload #6
    //   745: aload_2
    //   746: invokestatic x0 : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   749: aload #6
    //   751: ldc_w 'clipBounds'
    //   754: getstatic androidx/transition/ChangeBounds.S : Landroidx/transition/q;
    //   757: iconst_2
    //   758: anewarray java/lang/Object
    //   761: dup
    //   762: iconst_0
    //   763: aload_2
    //   764: aastore
    //   765: dup
    //   766: iconst_1
    //   767: aload_3
    //   768: aastore
    //   769: invokestatic ofObject : (Ljava/lang/Object;Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ObjectAnimator;
    //   772: astore_2
    //   773: aload_2
    //   774: new androidx/transition/ChangeBounds$i
    //   777: dup
    //   778: aload_0
    //   779: aload #6
    //   781: aload #4
    //   783: iload #8
    //   785: iload #10
    //   787: iload #12
    //   789: iload #14
    //   791: invokespecial <init> : (Landroidx/transition/ChangeBounds;Landroid/view/View;Landroid/graphics/Rect;IIII)V
    //   794: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   797: goto -> 802
    //   800: aconst_null
    //   801: astore_2
    //   802: aload_1
    //   803: aload_2
    //   804: invokestatic c : (Landroid/animation/Animator;Landroid/animation/Animator;)Landroid/animation/Animator;
    //   807: astore_1
    //   808: aload #5
    //   810: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   813: instanceof android/view/ViewGroup
    //   816: ifeq -> 847
    //   819: aload #5
    //   821: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   824: checkcast android/view/ViewGroup
    //   827: astore_2
    //   828: aload_2
    //   829: iconst_1
    //   830: invokestatic d : (Landroid/view/ViewGroup;Z)V
    //   833: aload_0
    //   834: new androidx/transition/ChangeBounds$j
    //   837: dup
    //   838: aload_0
    //   839: aload_2
    //   840: invokespecial <init> : (Landroidx/transition/ChangeBounds;Landroid/view/ViewGroup;)V
    //   843: invokevirtual a : (Landroidx/transition/Transition$f;)Landroidx/transition/Transition;
    //   846: pop
    //   847: aload_1
    //   848: areturn
    //   849: aload_2
    //   850: getfield a : Ljava/util/Map;
    //   853: ldc 'android:changeBounds:windowX'
    //   855: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   860: checkcast java/lang/Integer
    //   863: invokevirtual intValue : ()I
    //   866: istore #20
    //   868: aload_2
    //   869: getfield a : Ljava/util/Map;
    //   872: ldc 'android:changeBounds:windowY'
    //   874: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   879: checkcast java/lang/Integer
    //   882: invokevirtual intValue : ()I
    //   885: istore #14
    //   887: aload_3
    //   888: getfield a : Ljava/util/Map;
    //   891: ldc 'android:changeBounds:windowX'
    //   893: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   898: checkcast java/lang/Integer
    //   901: invokevirtual intValue : ()I
    //   904: istore #15
    //   906: aload_3
    //   907: getfield a : Ljava/util/Map;
    //   910: ldc 'android:changeBounds:windowY'
    //   912: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   917: checkcast java/lang/Integer
    //   920: invokevirtual intValue : ()I
    //   923: istore #19
    //   925: iload #20
    //   927: iload #15
    //   929: if_icmpne -> 944
    //   932: iload #14
    //   934: iload #19
    //   936: if_icmpeq -> 942
    //   939: goto -> 944
    //   942: aconst_null
    //   943: areturn
    //   944: aload_1
    //   945: aload_0
    //   946: getfield T : [I
    //   949: invokevirtual getLocationInWindow : ([I)V
    //   952: aload #5
    //   954: invokevirtual getWidth : ()I
    //   957: aload #5
    //   959: invokevirtual getHeight : ()I
    //   962: getstatic android/graphics/Bitmap$Config.ARGB_8888 : Landroid/graphics/Bitmap$Config;
    //   965: invokestatic createBitmap : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   968: astore_2
    //   969: aload #5
    //   971: new android/graphics/Canvas
    //   974: dup
    //   975: aload_2
    //   976: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   979: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   982: new android/graphics/drawable/BitmapDrawable
    //   985: dup
    //   986: aload_2
    //   987: invokespecial <init> : (Landroid/graphics/Bitmap;)V
    //   990: astore_2
    //   991: aload #5
    //   993: invokestatic c : (Landroid/view/View;)F
    //   996: fstore #21
    //   998: aload #5
    //   1000: fconst_0
    //   1001: invokestatic h : (Landroid/view/View;F)V
    //   1004: aload_1
    //   1005: invokestatic b : (Landroid/view/View;)Landroidx/transition/i0;
    //   1008: aload_2
    //   1009: invokeinterface a : (Landroid/graphics/drawable/Drawable;)V
    //   1014: aload_0
    //   1015: invokevirtual E : ()Landroidx/transition/PathMotion;
    //   1018: astore_3
    //   1019: aload_0
    //   1020: getfield T : [I
    //   1023: astore #4
    //   1025: aload_3
    //   1026: iload #20
    //   1028: aload #4
    //   1030: iconst_0
    //   1031: iaload
    //   1032: isub
    //   1033: i2f
    //   1034: iload #14
    //   1036: aload #4
    //   1038: iconst_1
    //   1039: iaload
    //   1040: isub
    //   1041: i2f
    //   1042: iload #15
    //   1044: aload #4
    //   1046: iconst_0
    //   1047: iaload
    //   1048: isub
    //   1049: i2f
    //   1050: iload #19
    //   1052: aload #4
    //   1054: iconst_1
    //   1055: iaload
    //   1056: isub
    //   1057: i2f
    //   1058: invokevirtual a : (FFFF)Landroid/graphics/Path;
    //   1061: astore_3
    //   1062: aload_2
    //   1063: iconst_1
    //   1064: anewarray android/animation/PropertyValuesHolder
    //   1067: dup
    //   1068: iconst_0
    //   1069: getstatic androidx/transition/ChangeBounds.M : Landroid/util/Property;
    //   1072: aload_3
    //   1073: invokestatic a : (Landroid/util/Property;Landroid/graphics/Path;)Landroid/animation/PropertyValuesHolder;
    //   1076: aastore
    //   1077: invokestatic ofPropertyValuesHolder : (Ljava/lang/Object;[Landroid/animation/PropertyValuesHolder;)Landroid/animation/ObjectAnimator;
    //   1080: astore_3
    //   1081: aload_3
    //   1082: new androidx/transition/ChangeBounds$a
    //   1085: dup
    //   1086: aload_0
    //   1087: aload_1
    //   1088: aload_2
    //   1089: aload #5
    //   1091: fload #21
    //   1093: invokespecial <init> : (Landroidx/transition/ChangeBounds;Landroid/view/ViewGroup;Landroid/graphics/drawable/BitmapDrawable;Landroid/view/View;F)V
    //   1096: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   1099: aload_3
    //   1100: areturn
    //   1101: aconst_null
    //   1102: areturn
    //   1103: aconst_null
    //   1104: areturn
  }
  
  class a extends AnimatorListenerAdapter {
    a(ChangeBounds this$0, ViewGroup param1ViewGroup, BitmapDrawable param1BitmapDrawable, View param1View, float param1Float) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      j0.b((View)this.a).b((Drawable)this.b);
      j0.h(this.c, this.d);
    }
  }
  
  static final class b extends Property<Drawable, PointF> {
    private Rect a = new Rect();
    
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(Drawable param1Drawable) {
      param1Drawable.copyBounds(this.a);
      Rect rect = this.a;
      return new PointF(rect.left, rect.top);
    }
    
    public void b(Drawable param1Drawable, PointF param1PointF) {
      param1Drawable.copyBounds(this.a);
      this.a.offsetTo(Math.round(param1PointF.x), Math.round(param1PointF.y));
      param1Drawable.setBounds(this.a);
    }
  }
  
  static final class c extends Property<k, PointF> {
    c(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(ChangeBounds.k param1k) {
      return null;
    }
    
    public void b(ChangeBounds.k param1k, PointF param1PointF) {
      param1k.c(param1PointF);
    }
  }
  
  static final class d extends Property<k, PointF> {
    d(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(ChangeBounds.k param1k) {
      return null;
    }
    
    public void b(ChangeBounds.k param1k, PointF param1PointF) {
      param1k.a(param1PointF);
    }
  }
  
  static final class e extends Property<View, PointF> {
    e(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(View param1View) {
      return null;
    }
    
    public void b(View param1View, PointF param1PointF) {
      j0.g(param1View, param1View.getLeft(), param1View.getTop(), Math.round(param1PointF.x), Math.round(param1PointF.y));
    }
  }
  
  static final class f extends Property<View, PointF> {
    f(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(View param1View) {
      return null;
    }
    
    public void b(View param1View, PointF param1PointF) {
      j0.g(param1View, Math.round(param1PointF.x), Math.round(param1PointF.y), param1View.getRight(), param1View.getBottom());
    }
  }
  
  static final class g extends Property<View, PointF> {
    g(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public PointF a(View param1View) {
      return null;
    }
    
    public void b(View param1View, PointF param1PointF) {
      int i = Math.round(param1PointF.x);
      int j = Math.round(param1PointF.y);
      j0.g(param1View, i, j, param1View.getWidth() + i, param1View.getHeight() + j);
    }
  }
  
  class h extends AnimatorListenerAdapter {
    private ChangeBounds.k mViewBounds;
    
    h(ChangeBounds this$0, ChangeBounds.k param1k) {
      this.mViewBounds = param1k;
    }
  }
  
  class i extends AnimatorListenerAdapter {
    private boolean a;
    
    i(ChangeBounds this$0, View param1View, Rect param1Rect, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a) {
        w.x0(this.b, this.c);
        j0.g(this.b, this.d, this.e, this.f, this.g);
      } 
    }
  }
  
  class j extends u {
    boolean a = false;
    
    j(ChangeBounds this$0, ViewGroup param1ViewGroup) {}
    
    public void b(Transition param1Transition) {
      e0.d(this.b, false);
    }
    
    public void c(Transition param1Transition) {
      if (!this.a)
        e0.d(this.b, false); 
      param1Transition.a0(this);
    }
    
    public void d(Transition param1Transition) {
      e0.d(this.b, false);
      this.a = true;
    }
    
    public void e(Transition param1Transition) {
      e0.d(this.b, true);
    }
  }
  
  private static class k {
    private int a;
    
    private int b;
    
    private int c;
    
    private int d;
    
    private View e;
    
    private int f;
    
    private int g;
    
    k(View param1View) {
      this.e = param1View;
    }
    
    private void b() {
      j0.g(this.e, this.a, this.b, this.c, this.d);
      this.f = 0;
      this.g = 0;
    }
    
    void a(PointF param1PointF) {
      this.c = Math.round(param1PointF.x);
      this.d = Math.round(param1PointF.y);
      int i = this.g + 1;
      this.g = i;
      if (this.f == i)
        b(); 
    }
    
    void c(PointF param1PointF) {
      this.a = Math.round(param1PointF.x);
      this.b = Math.round(param1PointF.y);
      int i = this.f + 1;
      this.f = i;
      if (i == this.g)
        b(); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/ChangeBounds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */