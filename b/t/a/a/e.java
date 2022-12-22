package b.t.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.content.d.g;
import b.h.e.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {
  private static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, float paramFloat) {
    return b(paramContext, paramResources, paramTheme, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser), null, 0, paramFloat);
  }
  
  private static Animator b(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, AnimatorSet paramAnimatorSet, int paramInt, float paramFloat) {
    byte b;
    int i = paramXmlPullParser.getDepth();
    TypedArray typedArray = null;
    ArrayList<TypedArray> arrayList = null;
    while (true) {
      int j = paramXmlPullParser.next();
      b = 0;
      boolean bool = false;
      if ((j != 3 || paramXmlPullParser.getDepth() > i) && j != 1) {
        ObjectAnimator objectAnimator;
        TypedArray typedArray1;
        if (j != 2)
          continue; 
        String str = paramXmlPullParser.getName();
        if (str.equals("objectAnimator")) {
          objectAnimator = n(paramContext, paramResources, paramTheme, paramAttributeSet, paramFloat, paramXmlPullParser);
        } else {
          ValueAnimator valueAnimator;
          if (objectAnimator.equals("animator")) {
            valueAnimator = l(paramContext, paramResources, paramTheme, paramAttributeSet, null, paramFloat, paramXmlPullParser);
          } else {
            AnimatorSet animatorSet;
            if (valueAnimator.equals("set")) {
              animatorSet = new AnimatorSet();
              typedArray = g.k(paramResources, paramTheme, paramAttributeSet, a.h);
              b(paramContext, paramResources, paramTheme, paramXmlPullParser, paramAttributeSet, animatorSet, g.g(typedArray, paramXmlPullParser, "ordering", 0, 0), paramFloat);
              typedArray.recycle();
            } else if (animatorSet.equals("propertyValuesHolder")) {
              PropertyValuesHolder[] arrayOfPropertyValuesHolder = p(paramContext, paramResources, paramTheme, paramXmlPullParser, Xml.asAttributeSet(paramXmlPullParser));
              if (arrayOfPropertyValuesHolder != null && typedArray instanceof ValueAnimator)
                ((ValueAnimator)typedArray).setValues(arrayOfPropertyValuesHolder); 
              bool = true;
              typedArray1 = typedArray;
            } else {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown animator name: ");
              stringBuilder.append(paramXmlPullParser.getName());
              throw new RuntimeException(stringBuilder.toString());
            } 
          } 
        } 
        typedArray = typedArray1;
        if (paramAnimatorSet != null) {
          typedArray = typedArray1;
          if (!bool) {
            ArrayList<TypedArray> arrayList1 = arrayList;
            if (arrayList == null)
              arrayList1 = new ArrayList(); 
            arrayList1.add(typedArray1);
            typedArray = typedArray1;
            arrayList = arrayList1;
          } 
        } 
        continue;
      } 
      break;
    } 
    if (paramAnimatorSet != null && arrayList != null) {
      Animator[] arrayOfAnimator = new Animator[arrayList.size()];
      Iterator<TypedArray> iterator = arrayList.iterator();
      for (byte b1 = b; iterator.hasNext(); b1++)
        arrayOfAnimator[b1] = (Animator)iterator.next(); 
      if (paramInt == 0) {
        paramAnimatorSet.playTogether(arrayOfAnimator);
      } else {
        paramAnimatorSet.playSequentially(arrayOfAnimator);
      } 
    } 
    return (Animator)typedArray;
  }
  
  private static Keyframe c(Keyframe paramKeyframe, float paramFloat) {
    if (paramKeyframe.getType() == float.class) {
      paramKeyframe = Keyframe.ofFloat(paramFloat);
    } else if (paramKeyframe.getType() == int.class) {
      paramKeyframe = Keyframe.ofInt(paramFloat);
    } else {
      paramKeyframe = Keyframe.ofObject(paramFloat);
    } 
    return paramKeyframe;
  }
  
  private static void d(Keyframe[] paramArrayOfKeyframe, float paramFloat, int paramInt1, int paramInt2) {
    paramFloat /= (paramInt2 - paramInt1 + 2);
    while (paramInt1 <= paramInt2) {
      paramArrayOfKeyframe[paramInt1].setFraction(paramArrayOfKeyframe[paramInt1 - 1].getFraction() + paramFloat);
      paramInt1++;
    } 
  }
  
  private static PropertyValuesHolder e(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: iload_2
    //   2: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   5: astore #5
    //   7: aload #5
    //   9: ifnull -> 18
    //   12: iconst_1
    //   13: istore #6
    //   15: goto -> 21
    //   18: iconst_0
    //   19: istore #6
    //   21: iload #6
    //   23: ifeq -> 36
    //   26: aload #5
    //   28: getfield type : I
    //   31: istore #7
    //   33: goto -> 39
    //   36: iconst_0
    //   37: istore #7
    //   39: aload_0
    //   40: iload_3
    //   41: invokevirtual peekValue : (I)Landroid/util/TypedValue;
    //   44: astore #5
    //   46: aload #5
    //   48: ifnull -> 57
    //   51: iconst_1
    //   52: istore #8
    //   54: goto -> 60
    //   57: iconst_0
    //   58: istore #8
    //   60: iload #8
    //   62: ifeq -> 75
    //   65: aload #5
    //   67: getfield type : I
    //   70: istore #9
    //   72: goto -> 78
    //   75: iconst_0
    //   76: istore #9
    //   78: iload_1
    //   79: istore #10
    //   81: iload_1
    //   82: iconst_4
    //   83: if_icmpne -> 121
    //   86: iload #6
    //   88: ifeq -> 99
    //   91: iload #7
    //   93: invokestatic h : (I)Z
    //   96: ifne -> 112
    //   99: iload #8
    //   101: ifeq -> 118
    //   104: iload #9
    //   106: invokestatic h : (I)Z
    //   109: ifeq -> 118
    //   112: iconst_3
    //   113: istore #10
    //   115: goto -> 121
    //   118: iconst_0
    //   119: istore #10
    //   121: iload #10
    //   123: ifne -> 131
    //   126: iconst_1
    //   127: istore_1
    //   128: goto -> 133
    //   131: iconst_0
    //   132: istore_1
    //   133: aconst_null
    //   134: astore #5
    //   136: aconst_null
    //   137: astore #11
    //   139: iload #10
    //   141: iconst_2
    //   142: if_icmpne -> 338
    //   145: aload_0
    //   146: iload_2
    //   147: invokevirtual getString : (I)Ljava/lang/String;
    //   150: astore #12
    //   152: aload_0
    //   153: iload_3
    //   154: invokevirtual getString : (I)Ljava/lang/String;
    //   157: astore #11
    //   159: aload #12
    //   161: invokestatic d : (Ljava/lang/String;)[Lb/h/e/c$b;
    //   164: astore #13
    //   166: aload #11
    //   168: invokestatic d : (Ljava/lang/String;)[Lb/h/e/c$b;
    //   171: astore #14
    //   173: aload #13
    //   175: ifnonnull -> 186
    //   178: aload #5
    //   180: astore_0
    //   181: aload #14
    //   183: ifnull -> 726
    //   186: aload #13
    //   188: ifnull -> 305
    //   191: new b/t/a/a/e$a
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: astore_0
    //   199: aload #14
    //   201: ifnull -> 286
    //   204: aload #13
    //   206: aload #14
    //   208: invokestatic b : ([Lb/h/e/c$b;[Lb/h/e/c$b;)Z
    //   211: ifeq -> 238
    //   214: aload #4
    //   216: aload_0
    //   217: iconst_2
    //   218: anewarray java/lang/Object
    //   221: dup
    //   222: iconst_0
    //   223: aload #13
    //   225: aastore
    //   226: dup
    //   227: iconst_1
    //   228: aload #14
    //   230: aastore
    //   231: invokestatic ofObject : (Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;
    //   234: astore_0
    //   235: goto -> 302
    //   238: new java/lang/StringBuilder
    //   241: dup
    //   242: invokespecial <init> : ()V
    //   245: astore_0
    //   246: aload_0
    //   247: ldc ' Can't morph from '
    //   249: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload_0
    //   254: aload #12
    //   256: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: pop
    //   260: aload_0
    //   261: ldc ' to '
    //   263: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload_0
    //   268: aload #11
    //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: pop
    //   274: new android/view/InflateException
    //   277: dup
    //   278: aload_0
    //   279: invokevirtual toString : ()Ljava/lang/String;
    //   282: invokespecial <init> : (Ljava/lang/String;)V
    //   285: athrow
    //   286: aload #4
    //   288: aload_0
    //   289: iconst_1
    //   290: anewarray java/lang/Object
    //   293: dup
    //   294: iconst_0
    //   295: aload #13
    //   297: aastore
    //   298: invokestatic ofObject : (Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;
    //   301: astore_0
    //   302: goto -> 726
    //   305: aload #5
    //   307: astore_0
    //   308: aload #14
    //   310: ifnull -> 726
    //   313: aload #4
    //   315: new b/t/a/a/e$a
    //   318: dup
    //   319: invokespecial <init> : ()V
    //   322: iconst_1
    //   323: anewarray java/lang/Object
    //   326: dup
    //   327: iconst_0
    //   328: aload #14
    //   330: aastore
    //   331: invokestatic ofObject : (Ljava/lang/String;Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/PropertyValuesHolder;
    //   334: astore_0
    //   335: goto -> 726
    //   338: iload #10
    //   340: iconst_3
    //   341: if_icmpne -> 352
    //   344: invokestatic a : ()Lb/t/a/a/f;
    //   347: astore #12
    //   349: goto -> 355
    //   352: aconst_null
    //   353: astore #12
    //   355: iload_1
    //   356: ifeq -> 503
    //   359: iload #6
    //   361: ifeq -> 458
    //   364: iload #7
    //   366: iconst_5
    //   367: if_icmpne -> 381
    //   370: aload_0
    //   371: iload_2
    //   372: fconst_0
    //   373: invokevirtual getDimension : (IF)F
    //   376: fstore #15
    //   378: goto -> 389
    //   381: aload_0
    //   382: iload_2
    //   383: fconst_0
    //   384: invokevirtual getFloat : (IF)F
    //   387: fstore #15
    //   389: iload #8
    //   391: ifeq -> 441
    //   394: iload #9
    //   396: iconst_5
    //   397: if_icmpne -> 411
    //   400: aload_0
    //   401: iload_3
    //   402: fconst_0
    //   403: invokevirtual getDimension : (IF)F
    //   406: fstore #16
    //   408: goto -> 419
    //   411: aload_0
    //   412: iload_3
    //   413: fconst_0
    //   414: invokevirtual getFloat : (IF)F
    //   417: fstore #16
    //   419: aload #4
    //   421: iconst_2
    //   422: newarray float
    //   424: dup
    //   425: iconst_0
    //   426: fload #15
    //   428: fastore
    //   429: dup
    //   430: iconst_1
    //   431: fload #16
    //   433: fastore
    //   434: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   437: astore_0
    //   438: goto -> 497
    //   441: aload #4
    //   443: iconst_1
    //   444: newarray float
    //   446: dup
    //   447: iconst_0
    //   448: fload #15
    //   450: fastore
    //   451: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   454: astore_0
    //   455: goto -> 497
    //   458: iload #9
    //   460: iconst_5
    //   461: if_icmpne -> 475
    //   464: aload_0
    //   465: iload_3
    //   466: fconst_0
    //   467: invokevirtual getDimension : (IF)F
    //   470: fstore #15
    //   472: goto -> 483
    //   475: aload_0
    //   476: iload_3
    //   477: fconst_0
    //   478: invokevirtual getFloat : (IF)F
    //   481: fstore #15
    //   483: aload #4
    //   485: iconst_1
    //   486: newarray float
    //   488: dup
    //   489: iconst_0
    //   490: fload #15
    //   492: fastore
    //   493: invokestatic ofFloat : (Ljava/lang/String;[F)Landroid/animation/PropertyValuesHolder;
    //   496: astore_0
    //   497: aload_0
    //   498: astore #5
    //   500: goto -> 700
    //   503: iload #6
    //   505: ifeq -> 635
    //   508: iload #7
    //   510: iconst_5
    //   511: if_icmpne -> 525
    //   514: aload_0
    //   515: iload_2
    //   516: fconst_0
    //   517: invokevirtual getDimension : (IF)F
    //   520: f2i
    //   521: istore_1
    //   522: goto -> 550
    //   525: iload #7
    //   527: invokestatic h : (I)Z
    //   530: ifeq -> 543
    //   533: aload_0
    //   534: iload_2
    //   535: iconst_0
    //   536: invokevirtual getColor : (II)I
    //   539: istore_1
    //   540: goto -> 550
    //   543: aload_0
    //   544: iload_2
    //   545: iconst_0
    //   546: invokevirtual getInt : (II)I
    //   549: istore_1
    //   550: iload #8
    //   552: ifeq -> 618
    //   555: iload #9
    //   557: iconst_5
    //   558: if_icmpne -> 572
    //   561: aload_0
    //   562: iload_3
    //   563: fconst_0
    //   564: invokevirtual getDimension : (IF)F
    //   567: f2i
    //   568: istore_2
    //   569: goto -> 597
    //   572: iload #9
    //   574: invokestatic h : (I)Z
    //   577: ifeq -> 590
    //   580: aload_0
    //   581: iload_3
    //   582: iconst_0
    //   583: invokevirtual getColor : (II)I
    //   586: istore_2
    //   587: goto -> 597
    //   590: aload_0
    //   591: iload_3
    //   592: iconst_0
    //   593: invokevirtual getInt : (II)I
    //   596: istore_2
    //   597: aload #4
    //   599: iconst_2
    //   600: newarray int
    //   602: dup
    //   603: iconst_0
    //   604: iload_1
    //   605: iastore
    //   606: dup
    //   607: iconst_1
    //   608: iload_2
    //   609: iastore
    //   610: invokestatic ofInt : (Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;
    //   613: astore #5
    //   615: goto -> 700
    //   618: aload #4
    //   620: iconst_1
    //   621: newarray int
    //   623: dup
    //   624: iconst_0
    //   625: iload_1
    //   626: iastore
    //   627: invokestatic ofInt : (Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;
    //   630: astore #5
    //   632: goto -> 700
    //   635: aload #11
    //   637: astore #5
    //   639: iload #8
    //   641: ifeq -> 700
    //   644: iload #9
    //   646: iconst_5
    //   647: if_icmpne -> 661
    //   650: aload_0
    //   651: iload_3
    //   652: fconst_0
    //   653: invokevirtual getDimension : (IF)F
    //   656: f2i
    //   657: istore_1
    //   658: goto -> 686
    //   661: iload #9
    //   663: invokestatic h : (I)Z
    //   666: ifeq -> 679
    //   669: aload_0
    //   670: iload_3
    //   671: iconst_0
    //   672: invokevirtual getColor : (II)I
    //   675: istore_1
    //   676: goto -> 686
    //   679: aload_0
    //   680: iload_3
    //   681: iconst_0
    //   682: invokevirtual getInt : (II)I
    //   685: istore_1
    //   686: aload #4
    //   688: iconst_1
    //   689: newarray int
    //   691: dup
    //   692: iconst_0
    //   693: iload_1
    //   694: iastore
    //   695: invokestatic ofInt : (Ljava/lang/String;[I)Landroid/animation/PropertyValuesHolder;
    //   698: astore #5
    //   700: aload #5
    //   702: astore_0
    //   703: aload #5
    //   705: ifnull -> 726
    //   708: aload #5
    //   710: astore_0
    //   711: aload #12
    //   713: ifnull -> 726
    //   716: aload #5
    //   718: aload #12
    //   720: invokevirtual setEvaluator : (Landroid/animation/TypeEvaluator;)V
    //   723: aload #5
    //   725: astore_0
    //   726: aload_0
    //   727: areturn
  }
  
  private static int f(TypedArray paramTypedArray, int paramInt1, int paramInt2) {
    boolean bool2;
    TypedValue typedValue2 = paramTypedArray.peekValue(paramInt1);
    int i = 1;
    boolean bool1 = false;
    if (typedValue2 != null) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if (paramInt1 != 0) {
      bool2 = typedValue2.type;
    } else {
      bool2 = false;
    } 
    TypedValue typedValue1 = paramTypedArray.peekValue(paramInt2);
    if (typedValue1 != null) {
      paramInt2 = i;
    } else {
      paramInt2 = 0;
    } 
    if (paramInt2 != 0) {
      i = typedValue1.type;
    } else {
      i = 0;
    } 
    if (paramInt1 == 0 || !h(bool2)) {
      paramInt1 = bool1;
      if (paramInt2 != 0) {
        paramInt1 = bool1;
        if (h(i))
          return 3; 
      } 
      return paramInt1;
    } 
    return 3;
  }
  
  private static int g(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser) {
    boolean bool;
    TypedArray typedArray = g.k(paramResources, paramTheme, paramAttributeSet, a.j);
    byte b1 = 0;
    TypedValue typedValue = g.l(typedArray, paramXmlPullParser, "value", 0);
    if (typedValue != null) {
      bool = true;
    } else {
      bool = false;
    } 
    byte b2 = b1;
    if (bool) {
      b2 = b1;
      if (h(typedValue.type))
        b2 = 3; 
    } 
    typedArray.recycle();
    return b2;
  }
  
  private static boolean h(int paramInt) {
    boolean bool;
    if (paramInt >= 28 && paramInt <= 31) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static Animator i(Context paramContext, int paramInt) {
    Animator animator;
    if (Build.VERSION.SDK_INT >= 24) {
      animator = AnimatorInflater.loadAnimator(paramContext, paramInt);
    } else {
      animator = j((Context)animator, animator.getResources(), animator.getTheme(), paramInt);
    } 
    return animator;
  }
  
  public static Animator j(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt) {
    return k(paramContext, paramResources, paramTheme, paramInt, 1.0F);
  }
  
  public static Animator k(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt, float paramFloat) {
    XmlResourceParser xmlResourceParser1 = null;
    XmlResourceParser xmlResourceParser2 = null;
    XmlResourceParser xmlResourceParser3 = null;
    try {
      XmlResourceParser xmlResourceParser = paramResources.getAnimation(paramInt);
      xmlResourceParser3 = xmlResourceParser;
      xmlResourceParser1 = xmlResourceParser;
      xmlResourceParser2 = xmlResourceParser;
      Animator animator = a(paramContext, paramResources, paramTheme, (XmlPullParser)xmlResourceParser, paramFloat);
      if (xmlResourceParser != null)
        xmlResourceParser.close(); 
      return animator;
    } catch (XmlPullParserException xmlPullParserException) {
      xmlResourceParser3 = xmlResourceParser2;
      Resources.NotFoundException notFoundException = new Resources.NotFoundException();
      xmlResourceParser3 = xmlResourceParser2;
      StringBuilder stringBuilder = new StringBuilder();
      xmlResourceParser3 = xmlResourceParser2;
      this();
      xmlResourceParser3 = xmlResourceParser2;
      stringBuilder.append("Can't load animation resource ID #0x");
      xmlResourceParser3 = xmlResourceParser2;
      stringBuilder.append(Integer.toHexString(paramInt));
      xmlResourceParser3 = xmlResourceParser2;
      this(stringBuilder.toString());
      xmlResourceParser3 = xmlResourceParser2;
      notFoundException.initCause((Throwable)xmlPullParserException);
      xmlResourceParser3 = xmlResourceParser2;
      throw notFoundException;
    } catch (IOException iOException) {
      xmlResourceParser3 = xmlResourceParser1;
      Resources.NotFoundException notFoundException = new Resources.NotFoundException();
      xmlResourceParser3 = xmlResourceParser1;
      StringBuilder stringBuilder = new StringBuilder();
      xmlResourceParser3 = xmlResourceParser1;
      this();
      xmlResourceParser3 = xmlResourceParser1;
      stringBuilder.append("Can't load animation resource ID #0x");
      xmlResourceParser3 = xmlResourceParser1;
      stringBuilder.append(Integer.toHexString(paramInt));
      xmlResourceParser3 = xmlResourceParser1;
      this(stringBuilder.toString());
      xmlResourceParser3 = xmlResourceParser1;
      notFoundException.initCause(iOException);
      xmlResourceParser3 = xmlResourceParser1;
      throw notFoundException;
    } finally {}
    if (xmlResourceParser3 != null)
      xmlResourceParser3.close(); 
    throw paramContext;
  }
  
  private static ValueAnimator l(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, ValueAnimator paramValueAnimator, float paramFloat, XmlPullParser paramXmlPullParser) {
    TypedArray typedArray2 = g.k(paramResources, paramTheme, paramAttributeSet, a.g);
    TypedArray typedArray1 = g.k(paramResources, paramTheme, paramAttributeSet, a.k);
    ValueAnimator valueAnimator = paramValueAnimator;
    if (paramValueAnimator == null)
      valueAnimator = new ValueAnimator(); 
    q(valueAnimator, typedArray2, typedArray1, paramFloat, paramXmlPullParser);
    int i = g.h(typedArray2, paramXmlPullParser, "interpolator", 0, 0);
    if (i > 0)
      valueAnimator.setInterpolator((TimeInterpolator)d.b(paramContext, i)); 
    typedArray2.recycle();
    if (typedArray1 != null)
      typedArray1.recycle(); 
    return valueAnimator;
  }
  
  private static Keyframe m(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int paramInt, XmlPullParser paramXmlPullParser) {
    Keyframe keyframe;
    boolean bool;
    TypedArray typedArray = g.k(paramResources, paramTheme, paramAttributeSet, a.j);
    float f = g.f(typedArray, paramXmlPullParser, "fraction", 3, -1.0F);
    TypedValue typedValue = g.l(typedArray, paramXmlPullParser, "value", 0);
    if (typedValue != null) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = paramInt;
    if (paramInt == 4)
      if (bool && h(typedValue.type)) {
        i = 3;
      } else {
        i = 0;
      }  
    if (bool) {
      if (i != 0) {
        if (i != 1 && i != 3) {
          typedValue = null;
        } else {
          keyframe = Keyframe.ofInt(f, g.g(typedArray, paramXmlPullParser, "value", 0, 0));
        } 
      } else {
        keyframe = Keyframe.ofFloat(f, g.f(typedArray, paramXmlPullParser, "value", 0, 0.0F));
      } 
    } else if (i == 0) {
      keyframe = Keyframe.ofFloat(f);
    } else {
      keyframe = Keyframe.ofInt(f);
    } 
    paramInt = g.h(typedArray, paramXmlPullParser, "interpolator", 1, 0);
    if (paramInt > 0)
      keyframe.setInterpolator((TimeInterpolator)d.b(paramContext, paramInt)); 
    typedArray.recycle();
    return keyframe;
  }
  
  private static ObjectAnimator n(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, float paramFloat, XmlPullParser paramXmlPullParser) {
    ObjectAnimator objectAnimator = new ObjectAnimator();
    l(paramContext, paramResources, paramTheme, paramAttributeSet, (ValueAnimator)objectAnimator, paramFloat, paramXmlPullParser);
    return objectAnimator;
  }
  
  private static PropertyValuesHolder o(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, String paramString, int paramInt) {
    PropertyValuesHolder propertyValuesHolder;
    Context context = null;
    ArrayList<Keyframe> arrayList = null;
    int i = paramInt;
    while (true) {
      paramInt = paramXmlPullParser.next();
      if (paramInt != 3 && paramInt != 1) {
        if (paramXmlPullParser.getName().equals("keyframe")) {
          paramInt = i;
          if (i == 4)
            paramInt = g(paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), paramXmlPullParser); 
          Keyframe keyframe = m(paramContext, paramResources, paramTheme, Xml.asAttributeSet(paramXmlPullParser), paramInt, paramXmlPullParser);
          ArrayList<Keyframe> arrayList1 = arrayList;
          if (keyframe != null) {
            arrayList1 = arrayList;
            if (arrayList == null)
              arrayList1 = new ArrayList(); 
            arrayList1.add(keyframe);
          } 
          paramXmlPullParser.next();
          arrayList = arrayList1;
          i = paramInt;
        } 
        continue;
      } 
      break;
    } 
    paramContext = context;
    if (arrayList != null) {
      int j = arrayList.size();
      paramContext = context;
      if (j > 0) {
        int k = 0;
        Keyframe keyframe2 = arrayList.get(0);
        Keyframe keyframe1 = arrayList.get(j - 1);
        float f = keyframe1.getFraction();
        paramInt = j;
        if (f < 1.0F)
          if (f < 0.0F) {
            keyframe1.setFraction(1.0F);
            paramInt = j;
          } else {
            arrayList.add(arrayList.size(), c(keyframe1, 1.0F));
            paramInt = j + 1;
          }  
        f = keyframe2.getFraction();
        j = paramInt;
        if (f != 0.0F)
          if (f < 0.0F) {
            keyframe2.setFraction(0.0F);
            j = paramInt;
          } else {
            arrayList.add(0, c(keyframe2, 0.0F));
            j = paramInt + 1;
          }  
        Keyframe[] arrayOfKeyframe = new Keyframe[j];
        arrayList.toArray(arrayOfKeyframe);
        for (paramInt = k; paramInt < j; paramInt++) {
          keyframe2 = arrayOfKeyframe[paramInt];
          if (keyframe2.getFraction() < 0.0F)
            if (paramInt == 0) {
              keyframe2.setFraction(0.0F);
            } else {
              int m = j - 1;
              if (paramInt == m) {
                keyframe2.setFraction(1.0F);
              } else {
                k = paramInt + 1;
                int n = paramInt;
                while (k < m && arrayOfKeyframe[k].getFraction() < 0.0F) {
                  n = k;
                  k++;
                } 
                d(arrayOfKeyframe, arrayOfKeyframe[n + 1].getFraction() - arrayOfKeyframe[paramInt - 1].getFraction(), paramInt, n);
              } 
            }  
        } 
        PropertyValuesHolder propertyValuesHolder1 = PropertyValuesHolder.ofKeyframe(paramString, arrayOfKeyframe);
        propertyValuesHolder = propertyValuesHolder1;
        if (i == 3) {
          propertyValuesHolder1.setEvaluator(f.a());
          propertyValuesHolder = propertyValuesHolder1;
        } 
      } 
    } 
    return propertyValuesHolder;
  }
  
  private static PropertyValuesHolder[] p(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet) {
    PropertyValuesHolder[] arrayOfPropertyValuesHolder;
    ArrayList<PropertyValuesHolder> arrayList;
    int i;
    Context context = null;
    PropertyValuesHolder propertyValuesHolder = null;
    while (true) {
      int j = paramXmlPullParser.getEventType();
      i = 0;
      if (j != 3 && j != 1) {
        if (j != 2) {
          paramXmlPullParser.next();
          continue;
        } 
        if (paramXmlPullParser.getName().equals("propertyValuesHolder")) {
          ArrayList<PropertyValuesHolder> arrayList1;
          TypedArray typedArray = g.k(paramResources, paramTheme, paramAttributeSet, a.i);
          String str = g.i(typedArray, paramXmlPullParser, "propertyName", 3);
          i = g.g(typedArray, paramXmlPullParser, "valueType", 2, 4);
          PropertyValuesHolder propertyValuesHolder1 = o(paramContext, paramResources, paramTheme, paramXmlPullParser, str, i);
          PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder1;
          if (propertyValuesHolder1 == null)
            propertyValuesHolder2 = e(typedArray, i, 0, 1, str); 
          propertyValuesHolder1 = propertyValuesHolder;
          if (propertyValuesHolder2 != null) {
            propertyValuesHolder1 = propertyValuesHolder;
            if (propertyValuesHolder == null)
              arrayList1 = new ArrayList(); 
            arrayList1.add(propertyValuesHolder2);
          } 
          typedArray.recycle();
          arrayList = arrayList1;
        } 
        paramXmlPullParser.next();
        continue;
      } 
      break;
    } 
    paramContext = context;
    if (arrayList != null) {
      int j = arrayList.size();
      PropertyValuesHolder[] arrayOfPropertyValuesHolder1 = new PropertyValuesHolder[j];
      while (true) {
        arrayOfPropertyValuesHolder = arrayOfPropertyValuesHolder1;
        if (i < j) {
          arrayOfPropertyValuesHolder1[i] = arrayList.get(i);
          i++;
          continue;
        } 
        break;
      } 
    } 
    return arrayOfPropertyValuesHolder;
  }
  
  private static void q(ValueAnimator paramValueAnimator, TypedArray paramTypedArray1, TypedArray paramTypedArray2, float paramFloat, XmlPullParser paramXmlPullParser) {
    long l1 = g.g(paramTypedArray1, paramXmlPullParser, "duration", 1, 300);
    long l2 = g.g(paramTypedArray1, paramXmlPullParser, "startOffset", 2, 0);
    int i = g.g(paramTypedArray1, paramXmlPullParser, "valueType", 7, 4);
    int j = i;
    if (g.j(paramXmlPullParser, "valueFrom")) {
      j = i;
      if (g.j(paramXmlPullParser, "valueTo")) {
        int k = i;
        if (i == 4)
          k = f(paramTypedArray1, 5, 6); 
        PropertyValuesHolder propertyValuesHolder = e(paramTypedArray1, k, 5, 6, "");
        j = k;
        if (propertyValuesHolder != null) {
          paramValueAnimator.setValues(new PropertyValuesHolder[] { propertyValuesHolder });
          j = k;
        } 
      } 
    } 
    paramValueAnimator.setDuration(l1);
    paramValueAnimator.setStartDelay(l2);
    paramValueAnimator.setRepeatCount(g.g(paramTypedArray1, paramXmlPullParser, "repeatCount", 3, 0));
    paramValueAnimator.setRepeatMode(g.g(paramTypedArray1, paramXmlPullParser, "repeatMode", 4, 1));
    if (paramTypedArray2 != null)
      r(paramValueAnimator, paramTypedArray2, j, paramFloat, paramXmlPullParser); 
  }
  
  private static void r(ValueAnimator paramValueAnimator, TypedArray paramTypedArray, int paramInt, float paramFloat, XmlPullParser paramXmlPullParser) {
    // Byte code:
    //   0: aload_0
    //   1: checkcast android/animation/ObjectAnimator
    //   4: astore #5
    //   6: aload_1
    //   7: aload #4
    //   9: ldc_w 'pathData'
    //   12: iconst_1
    //   13: invokestatic i : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   16: astore_0
    //   17: aload_0
    //   18: ifnull -> 121
    //   21: aload_1
    //   22: aload #4
    //   24: ldc_w 'propertyXName'
    //   27: iconst_2
    //   28: invokestatic i : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   31: astore #6
    //   33: aload_1
    //   34: aload #4
    //   36: ldc_w 'propertyYName'
    //   39: iconst_3
    //   40: invokestatic i : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   43: astore #4
    //   45: iload_2
    //   46: iconst_2
    //   47: if_icmpeq -> 50
    //   50: aload #6
    //   52: ifnonnull -> 100
    //   55: aload #4
    //   57: ifnull -> 63
    //   60: goto -> 100
    //   63: new java/lang/StringBuilder
    //   66: dup
    //   67: invokespecial <init> : ()V
    //   70: astore_0
    //   71: aload_0
    //   72: aload_1
    //   73: invokevirtual getPositionDescription : ()Ljava/lang/String;
    //   76: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: pop
    //   80: aload_0
    //   81: ldc_w ' propertyXName or propertyYName is needed for PathData'
    //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: pop
    //   88: new android/view/InflateException
    //   91: dup
    //   92: aload_0
    //   93: invokevirtual toString : ()Ljava/lang/String;
    //   96: invokespecial <init> : (Ljava/lang/String;)V
    //   99: athrow
    //   100: aload_0
    //   101: invokestatic e : (Ljava/lang/String;)Landroid/graphics/Path;
    //   104: aload #5
    //   106: fload_3
    //   107: ldc_w 0.5
    //   110: fmul
    //   111: aload #6
    //   113: aload #4
    //   115: invokestatic s : (Landroid/graphics/Path;Landroid/animation/ObjectAnimator;FLjava/lang/String;Ljava/lang/String;)V
    //   118: goto -> 136
    //   121: aload #5
    //   123: aload_1
    //   124: aload #4
    //   126: ldc_w 'propertyName'
    //   129: iconst_0
    //   130: invokestatic i : (Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;I)Ljava/lang/String;
    //   133: invokevirtual setPropertyName : (Ljava/lang/String;)V
    //   136: return
  }
  
  private static void s(Path paramPath, ObjectAnimator paramObjectAnimator, float paramFloat, String paramString1, String paramString2) {
    PathMeasure pathMeasure = new PathMeasure(paramPath, false);
    ArrayList<Float> arrayList = new ArrayList();
    float f1 = 0.0F;
    arrayList.add(Float.valueOf(0.0F));
    float f2 = 0.0F;
    while (true) {
      float f = f2 + pathMeasure.getLength();
      arrayList.add(Float.valueOf(f));
      f2 = f;
      if (!pathMeasure.nextContour()) {
        PathMeasure pathMeasure1 = new PathMeasure(paramPath, false);
        int i = Math.min(100, (int)(f / paramFloat) + 1);
        float[] arrayOfFloat1 = new float[i];
        float[] arrayOfFloat2 = new float[i];
        float[] arrayOfFloat3 = new float[2];
        f2 = f / (i - 1);
        byte b = 0;
        int j = 0;
        paramFloat = f1;
        while (true) {
          PropertyValuesHolder propertyValuesHolder;
          pathMeasure = null;
          if (b < i) {
            pathMeasure1.getPosTan(paramFloat - ((Float)arrayList.get(j)).floatValue(), arrayOfFloat3, null);
            arrayOfFloat1[b] = arrayOfFloat3[0];
            arrayOfFloat2[b] = arrayOfFloat3[1];
            paramFloat += f2;
            int k = j + 1;
            int m = j;
            if (k < arrayList.size()) {
              m = j;
              if (paramFloat > ((Float)arrayList.get(k)).floatValue()) {
                pathMeasure1.nextContour();
                m = k;
              } 
            } 
            b++;
            j = m;
            continue;
          } 
          if (paramString1 != null) {
            PropertyValuesHolder propertyValuesHolder1 = PropertyValuesHolder.ofFloat(paramString1, arrayOfFloat1);
          } else {
            pathMeasure1 = null;
          } 
          PathMeasure pathMeasure2 = pathMeasure;
          if (paramString2 != null)
            propertyValuesHolder = PropertyValuesHolder.ofFloat(paramString2, arrayOfFloat2); 
          if (pathMeasure1 == null) {
            paramObjectAnimator.setValues(new PropertyValuesHolder[] { propertyValuesHolder });
          } else if (propertyValuesHolder == null) {
            paramObjectAnimator.setValues(new PropertyValuesHolder[] { (PropertyValuesHolder)pathMeasure1 });
          } else {
            paramObjectAnimator.setValues(new PropertyValuesHolder[] { (PropertyValuesHolder)pathMeasure1, propertyValuesHolder });
          } 
          return;
        } 
        break;
      } 
    } 
  }
  
  private static class a implements TypeEvaluator<c.b[]> {
    private c.b[] a;
    
    public c.b[] a(float param1Float, c.b[] param1ArrayOfb1, c.b[] param1ArrayOfb2) {
      if (c.b(param1ArrayOfb1, param1ArrayOfb2)) {
        if (!c.b(this.a, param1ArrayOfb1))
          this.a = c.f(param1ArrayOfb1); 
        for (byte b1 = 0; b1 < param1ArrayOfb1.length; b1++)
          this.a[b1].d(param1ArrayOfb1[b1], param1ArrayOfb2[b1], param1Float); 
        return this.a;
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't interpolate between two incompatible pathData");
      throw illegalArgumentException;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/t/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */