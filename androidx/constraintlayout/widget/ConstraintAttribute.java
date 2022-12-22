package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class ConstraintAttribute {
  String a;
  
  private AttributeType b;
  
  private int c;
  
  private float d;
  
  private String e;
  
  boolean f;
  
  private int g;
  
  public ConstraintAttribute(ConstraintAttribute paramConstraintAttribute, Object paramObject) {
    this.a = paramConstraintAttribute.a;
    this.b = paramConstraintAttribute.b;
    j(paramObject);
  }
  
  public ConstraintAttribute(String paramString, AttributeType paramAttributeType, Object paramObject) {
    this.a = paramString;
    this.b = paramAttributeType;
    j(paramObject);
  }
  
  private static int a(int paramInt) {
    paramInt = (paramInt & (paramInt >> 31 ^ 0xFFFFFFFF)) - 255;
    return (paramInt & paramInt >> 31) + 255;
  }
  
  public static HashMap<String, ConstraintAttribute> b(HashMap<String, ConstraintAttribute> paramHashMap, View paramView) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    Class<?> clazz = paramView.getClass();
    for (String str : paramHashMap.keySet()) {
      ConstraintAttribute constraintAttribute = paramHashMap.get(str);
      try {
        if (str.equals("BackgroundColor")) {
          int i = ((ColorDrawable)paramView.getBackground()).getColor();
          ConstraintAttribute constraintAttribute2 = new ConstraintAttribute();
          this(constraintAttribute, Integer.valueOf(i));
          hashMap.put(str, constraintAttribute2);
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("getMap");
        stringBuilder.append(str);
        Object object = clazz.getMethod(stringBuilder.toString(), new Class[0]).invoke(paramView, new Object[0]);
        ConstraintAttribute constraintAttribute1 = new ConstraintAttribute();
        this(constraintAttribute, object);
        hashMap.put(str, constraintAttribute1);
      } catch (NoSuchMethodException noSuchMethodException) {
        noSuchMethodException.printStackTrace();
      } catch (IllegalAccessException illegalAccessException) {
        illegalAccessException.printStackTrace();
      } catch (InvocationTargetException invocationTargetException) {
        invocationTargetException.printStackTrace();
      } 
    } 
    return (HashMap)hashMap;
  }
  
  public static void g(Context paramContext, XmlPullParser paramXmlPullParser, HashMap<String, ConstraintAttribute> paramHashMap) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic asAttributeSet : (Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   5: getstatic androidx/constraintlayout/widget/e.CustomAttribute : [I
    //   8: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   11: astore_3
    //   12: aload_3
    //   13: invokevirtual getIndexCount : ()I
    //   16: istore #4
    //   18: aconst_null
    //   19: astore #5
    //   21: aconst_null
    //   22: astore #6
    //   24: aload #6
    //   26: astore #7
    //   28: iconst_0
    //   29: istore #8
    //   31: iload #8
    //   33: iload #4
    //   35: if_icmpge -> 409
    //   38: aload_3
    //   39: iload #8
    //   41: invokevirtual getIndex : (I)I
    //   44: istore #9
    //   46: iload #9
    //   48: getstatic androidx/constraintlayout/widget/e.CustomAttribute_attributeName : I
    //   51: if_icmpne -> 146
    //   54: aload_3
    //   55: iload #9
    //   57: invokevirtual getString : (I)Ljava/lang/String;
    //   60: astore #5
    //   62: aload #5
    //   64: astore_1
    //   65: aload #6
    //   67: astore #10
    //   69: aload #7
    //   71: astore #11
    //   73: aload #5
    //   75: ifnull -> 392
    //   78: aload #5
    //   80: astore_1
    //   81: aload #6
    //   83: astore #10
    //   85: aload #7
    //   87: astore #11
    //   89: aload #5
    //   91: invokevirtual length : ()I
    //   94: ifle -> 392
    //   97: new java/lang/StringBuilder
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: astore_1
    //   105: aload_1
    //   106: aload #5
    //   108: iconst_0
    //   109: invokevirtual charAt : (I)C
    //   112: invokestatic toUpperCase : (C)C
    //   115: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   118: pop
    //   119: aload_1
    //   120: aload #5
    //   122: iconst_1
    //   123: invokevirtual substring : (I)Ljava/lang/String;
    //   126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: pop
    //   130: aload_1
    //   131: invokevirtual toString : ()Ljava/lang/String;
    //   134: astore_1
    //   135: aload #6
    //   137: astore #10
    //   139: aload #7
    //   141: astore #11
    //   143: goto -> 392
    //   146: iload #9
    //   148: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customBoolean : I
    //   151: if_icmpne -> 177
    //   154: aload_3
    //   155: iload #9
    //   157: iconst_0
    //   158: invokevirtual getBoolean : (IZ)Z
    //   161: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   164: astore #10
    //   166: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.g : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   169: astore #11
    //   171: aload #5
    //   173: astore_1
    //   174: goto -> 392
    //   177: iload #9
    //   179: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customColorValue : I
    //   182: if_icmpne -> 210
    //   185: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.d : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   188: astore_1
    //   189: aload_3
    //   190: iload #9
    //   192: iconst_0
    //   193: invokevirtual getColor : (II)I
    //   196: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   199: astore #10
    //   201: aload_1
    //   202: astore #11
    //   204: aload #5
    //   206: astore_1
    //   207: goto -> 392
    //   210: iload #9
    //   212: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customColorDrawableValue : I
    //   215: if_icmpne -> 237
    //   218: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.e : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   221: astore_1
    //   222: aload_3
    //   223: iload #9
    //   225: iconst_0
    //   226: invokevirtual getColor : (II)I
    //   229: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   232: astore #10
    //   234: goto -> 201
    //   237: iload #9
    //   239: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customPixelDimension : I
    //   242: if_icmpne -> 275
    //   245: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.h : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   248: astore_1
    //   249: iconst_1
    //   250: aload_3
    //   251: iload #9
    //   253: fconst_0
    //   254: invokevirtual getDimension : (IF)F
    //   257: aload_0
    //   258: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   261: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   264: invokestatic applyDimension : (IFLandroid/util/DisplayMetrics;)F
    //   267: invokestatic valueOf : (F)Ljava/lang/Float;
    //   270: astore #10
    //   272: goto -> 201
    //   275: iload #9
    //   277: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customDimension : I
    //   280: if_icmpne -> 302
    //   283: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.h : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   286: astore_1
    //   287: aload_3
    //   288: iload #9
    //   290: fconst_0
    //   291: invokevirtual getDimension : (IF)F
    //   294: invokestatic valueOf : (F)Ljava/lang/Float;
    //   297: astore #10
    //   299: goto -> 201
    //   302: iload #9
    //   304: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customFloatValue : I
    //   307: if_icmpne -> 331
    //   310: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.c : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   313: astore_1
    //   314: aload_3
    //   315: iload #9
    //   317: ldc_w NaN
    //   320: invokevirtual getFloat : (IF)F
    //   323: invokestatic valueOf : (F)Ljava/lang/Float;
    //   326: astore #10
    //   328: goto -> 201
    //   331: iload #9
    //   333: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customIntegerValue : I
    //   336: if_icmpne -> 358
    //   339: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.b : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   342: astore_1
    //   343: aload_3
    //   344: iload #9
    //   346: iconst_m1
    //   347: invokevirtual getInteger : (II)I
    //   350: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   353: astore #10
    //   355: goto -> 201
    //   358: aload #5
    //   360: astore_1
    //   361: aload #6
    //   363: astore #10
    //   365: aload #7
    //   367: astore #11
    //   369: iload #9
    //   371: getstatic androidx/constraintlayout/widget/e.CustomAttribute_customStringValue : I
    //   374: if_icmpne -> 392
    //   377: getstatic androidx/constraintlayout/widget/ConstraintAttribute$AttributeType.f : Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;
    //   380: astore_1
    //   381: aload_3
    //   382: iload #9
    //   384: invokevirtual getString : (I)Ljava/lang/String;
    //   387: astore #10
    //   389: goto -> 201
    //   392: iinc #8, 1
    //   395: aload_1
    //   396: astore #5
    //   398: aload #10
    //   400: astore #6
    //   402: aload #11
    //   404: astore #7
    //   406: goto -> 31
    //   409: aload #5
    //   411: ifnull -> 439
    //   414: aload #6
    //   416: ifnull -> 439
    //   419: aload_2
    //   420: aload #5
    //   422: new androidx/constraintlayout/widget/ConstraintAttribute
    //   425: dup
    //   426: aload #5
    //   428: aload #7
    //   430: aload #6
    //   432: invokespecial <init> : (Ljava/lang/String;Landroidx/constraintlayout/widget/ConstraintAttribute$AttributeType;Ljava/lang/Object;)V
    //   435: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   438: pop
    //   439: aload_3
    //   440: invokevirtual recycle : ()V
    //   443: return
  }
  
  public static void h(View paramView, HashMap<String, ConstraintAttribute> paramHashMap) {
    Class<?> clazz = paramView.getClass();
    for (String str1 : paramHashMap.keySet()) {
      StringBuilder stringBuilder1;
      ConstraintAttribute constraintAttribute = paramHashMap.get(str1);
      StringBuilder stringBuilder2 = new StringBuilder();
      stringBuilder2.append("set");
      stringBuilder2.append(str1);
      String str2 = stringBuilder2.toString();
      try {
        Method method;
        ColorDrawable colorDrawable;
        switch (a.a[constraintAttribute.b.ordinal()]) {
          default:
            continue;
          case 7:
            clazz.getMethod(str2, new Class[] { float.class }).invoke(paramView, new Object[] { Float.valueOf(constraintAttribute.d) });
            continue;
          case 6:
            clazz.getMethod(str2, new Class[] { boolean.class }).invoke(paramView, new Object[] { Boolean.valueOf(constraintAttribute.f) });
            continue;
          case 5:
            clazz.getMethod(str2, new Class[] { CharSequence.class }).invoke(paramView, new Object[] { constraintAttribute.e });
            continue;
          case 4:
            clazz.getMethod(str2, new Class[] { float.class }).invoke(paramView, new Object[] { Float.valueOf(constraintAttribute.d) });
            continue;
          case 3:
            clazz.getMethod(str2, new Class[] { int.class }).invoke(paramView, new Object[] { Integer.valueOf(constraintAttribute.c) });
            continue;
          case 2:
            method = clazz.getMethod(str2, new Class[] { Drawable.class });
            colorDrawable = new ColorDrawable();
            this();
            colorDrawable.setColor(constraintAttribute.g);
            method.invoke(paramView, new Object[] { colorDrawable });
            continue;
          case 1:
            break;
        } 
        clazz.getMethod(str2, new Class[] { int.class }).invoke(paramView, new Object[] { Integer.valueOf(constraintAttribute.g) });
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.e("TransitionLayout", noSuchMethodException.getMessage());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Custom Attribute \"");
        stringBuilder.append(str1);
        stringBuilder.append("\" not found on ");
        stringBuilder.append(clazz.getName());
        Log.e("TransitionLayout", stringBuilder.toString());
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append(clazz.getName());
        stringBuilder1.append(" must have a method ");
        stringBuilder1.append(str2);
        Log.e("TransitionLayout", stringBuilder1.toString());
      } catch (IllegalAccessException illegalAccessException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Custom Attribute \"");
        stringBuilder.append((String)stringBuilder1);
        stringBuilder.append("\" not found on ");
        stringBuilder.append(clazz.getName());
        Log.e("TransitionLayout", stringBuilder.toString());
        illegalAccessException.printStackTrace();
      } catch (InvocationTargetException invocationTargetException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Custom Attribute \"");
        stringBuilder.append((String)stringBuilder1);
        stringBuilder.append("\" not found on ");
        stringBuilder.append(clazz.getName());
        Log.e("TransitionLayout", stringBuilder.toString());
        invocationTargetException.printStackTrace();
      } 
    } 
  }
  
  public AttributeType c() {
    return this.b;
  }
  
  public float d() {
    float f;
    switch (a.a[this.b.ordinal()]) {
      default:
        return Float.NaN;
      case 7:
        return this.d;
      case 6:
        if (this.f) {
          f = 1.0F;
        } else {
          f = 0.0F;
        } 
        return f;
      case 5:
        throw new RuntimeException("Cannot interpolate String");
      case 4:
        return this.d;
      case 3:
        return this.c;
      case 1:
      case 2:
        break;
    } 
    throw new RuntimeException("Color does not have a single color to interpolate");
  }
  
  public void e(float[] paramArrayOffloat) {
    switch (a.a[this.b.ordinal()]) {
      default:
        return;
      case 7:
        paramArrayOffloat[0] = this.d;
      case 6:
        if (this.f) {
          f1 = 1.0F;
        } else {
          f1 = 0.0F;
        } 
        paramArrayOffloat[0] = f1;
      case 5:
        throw new RuntimeException("Color does not have a single color to interpolate");
      case 4:
        paramArrayOffloat[0] = this.d;
      case 3:
        paramArrayOffloat[0] = this.c;
      case 1:
      case 2:
        break;
    } 
    int i = this.g;
    float f1 = (float)Math.pow(((i >> 16 & 0xFF) / 255.0F), 2.2D);
    float f2 = (float)Math.pow(((i >> 8 & 0xFF) / 255.0F), 2.2D);
    float f3 = (float)Math.pow(((i & 0xFF) / 255.0F), 2.2D);
    paramArrayOffloat[0] = f1;
    paramArrayOffloat[1] = f2;
    paramArrayOffloat[2] = f3;
    paramArrayOffloat[3] = (i >> 24 & 0xFF) / 255.0F;
  }
  
  public int f() {
    int i = a.a[this.b.ordinal()];
    return (i != 1 && i != 2) ? 1 : 4;
  }
  
  public void i(View paramView, float[] paramArrayOffloat) {
    Class<?> clazz = paramView.getClass();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("set");
    stringBuilder.append(this.a);
    String str = stringBuilder.toString();
    try {
      StringBuilder stringBuilder1;
      ColorDrawable colorDrawable;
      Method method2;
      RuntimeException runtimeException;
      int m;
      int i = a.a[this.b.ordinal()];
      boolean bool = true;
      switch (i) {
        default:
          return;
        case 7:
          clazz.getMethod(str, new Class[] { float.class }).invoke(paramView, new Object[] { Float.valueOf(paramArrayOffloat[0]) });
        case 6:
          method2 = clazz.getMethod(str, new Class[] { boolean.class });
          if (paramArrayOffloat[0] <= 0.5F)
            bool = false; 
          method2.invoke(paramView, new Object[] { Boolean.valueOf(bool) });
        case 5:
          runtimeException = new RuntimeException();
          stringBuilder1 = new StringBuilder();
          this();
          stringBuilder1.append("unable to interpolate strings ");
          stringBuilder1.append(this.a);
          this(stringBuilder1.toString());
          throw runtimeException;
        case 4:
          runtimeException.getMethod(str, new Class[] { float.class }).invoke(paramView, new Object[] { Float.valueOf(stringBuilder1[0]) });
        case 3:
          runtimeException.getMethod(str, new Class[] { int.class }).invoke(paramView, new Object[] { Integer.valueOf((int)stringBuilder1[0]) });
        case 2:
          method1 = runtimeException.getMethod(str, new Class[] { Drawable.class });
          j = a((int)((float)Math.pow(stringBuilder1[0], 0.45454545454545453D) * 255.0F));
          k = a((int)((float)Math.pow(stringBuilder1[1], 0.45454545454545453D) * 255.0F));
          i = a((int)((float)Math.pow(stringBuilder1[2], 0.45454545454545453D) * 255.0F));
          m = a((int)(stringBuilder1[3] * 255.0F));
          colorDrawable = new ColorDrawable();
          this();
          colorDrawable.setColor(j << 16 | m << 24 | k << 8 | i);
          method1.invoke(paramView, new Object[] { colorDrawable });
        case 1:
          break;
      } 
      Method method1 = method1.getMethod(str, new Class[] { int.class });
      int k = a((int)((float)Math.pow(colorDrawable[0], 0.45454545454545453D) * 255.0F));
      i = a((int)((float)Math.pow(colorDrawable[1], 0.45454545454545453D) * 255.0F));
      int j = a((int)((float)Math.pow(colorDrawable[2], 0.45454545454545453D) * 255.0F));
      method1.invoke(paramView, new Object[] { Integer.valueOf(k << 16 | a((int)(colorDrawable[3] * 255.0F)) << 24 | i << 8 | j) });
    } catch (NoSuchMethodException noSuchMethodException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("no method ");
      stringBuilder1.append(str);
      stringBuilder1.append("on View \"");
      stringBuilder1.append(androidx.constraintlayout.motion.widget.a.c(paramView));
      stringBuilder1.append("\"");
      Log.e("TransitionLayout", stringBuilder1.toString());
      noSuchMethodException.printStackTrace();
    } catch (IllegalAccessException illegalAccessException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("cannot access method ");
      stringBuilder1.append(str);
      stringBuilder1.append("on View \"");
      stringBuilder1.append(androidx.constraintlayout.motion.widget.a.c(paramView));
      stringBuilder1.append("\"");
      Log.e("TransitionLayout", stringBuilder1.toString());
      illegalAccessException.printStackTrace();
    } catch (InvocationTargetException invocationTargetException) {
      invocationTargetException.printStackTrace();
    } 
  }
  
  public void j(Object paramObject) {
    switch (a.a[this.b.ordinal()]) {
      default:
        return;
      case 7:
        this.d = ((Float)paramObject).floatValue();
      case 6:
        this.f = ((Boolean)paramObject).booleanValue();
      case 5:
        this.e = (String)paramObject;
      case 4:
        this.d = ((Float)paramObject).floatValue();
      case 3:
        this.c = ((Integer)paramObject).intValue();
      case 1:
      case 2:
        break;
    } 
    this.g = ((Integer)paramObject).intValue();
  }
  
  public enum AttributeType {
    b, c, d, e, f, g, h;
    
    static {
      AttributeType attributeType1 = new AttributeType("INT_TYPE", 0);
      b = attributeType1;
      AttributeType attributeType2 = new AttributeType("FLOAT_TYPE", 1);
      c = attributeType2;
      AttributeType attributeType3 = new AttributeType("COLOR_TYPE", 2);
      d = attributeType3;
      AttributeType attributeType4 = new AttributeType("COLOR_DRAWABLE_TYPE", 3);
      e = attributeType4;
      AttributeType attributeType5 = new AttributeType("STRING_TYPE", 4);
      f = attributeType5;
      AttributeType attributeType6 = new AttributeType("BOOLEAN_TYPE", 5);
      g = attributeType6;
      AttributeType attributeType7 = new AttributeType("DIMENSION_TYPE", 6);
      h = attributeType7;
      i = new AttributeType[] { attributeType1, attributeType2, attributeType3, attributeType4, attributeType5, attributeType6, attributeType7 };
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/constraintlayout/widget/ConstraintAttribute.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */