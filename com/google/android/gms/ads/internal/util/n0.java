package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.fq1;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.nh1;
import com.google.android.gms.internal.ads.wq1;
import com.google.android.gms.internal.ads.x;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class n0 {
  public static Point a(MotionEvent paramMotionEvent, View paramView) {
    int[] arrayOfInt = m(paramView);
    return new Point((int)paramMotionEvent.getRawX() - arrayOfInt[0], (int)paramMotionEvent.getRawY() - arrayOfInt[1]);
  }
  
  private static JSONObject b(Context paramContext, Point paramPoint1, Point paramPoint2) {
    JSONObject jSONObject = new JSONObject();
    try {
      jSONObject.put("x", j(paramContext, paramPoint2.x));
      jSONObject.put("y", j(paramContext, paramPoint2.y));
      jSONObject.put("start_x", j(paramContext, paramPoint1.x));
      jSONObject.put("start_y", j(paramContext, paramPoint1.y));
      return jSONObject;
    } catch (JSONException jSONException) {
      cm.c("Error occurred while putting signals into JSON object.", (Throwable)jSONException);
      return null;
    } 
  }
  
  private static JSONObject c(Context paramContext, Rect paramRect) {
    JSONObject jSONObject = new JSONObject();
    jSONObject.put("width", j(paramContext, paramRect.right - paramRect.left));
    jSONObject.put("height", j(paramContext, paramRect.bottom - paramRect.top));
    jSONObject.put("x", j(paramContext, paramRect.left));
    jSONObject.put("y", j(paramContext, paramRect.top));
    jSONObject.put("relative_to", "self");
    return jSONObject;
  }
  
  public static JSONObject d(Context paramContext, View paramView) {
    // Byte code:
    //   0: new org/json/JSONObject
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_1
    //   9: ifnonnull -> 14
    //   12: aload_2
    //   13: areturn
    //   14: aload_1
    //   15: invokestatic m : (Landroid/view/View;)[I
    //   18: astore_3
    //   19: iconst_2
    //   20: newarray int
    //   22: astore #4
    //   24: aload #4
    //   26: iconst_0
    //   27: aload_1
    //   28: invokevirtual getMeasuredWidth : ()I
    //   31: iastore
    //   32: aload #4
    //   34: iconst_1
    //   35: aload_1
    //   36: invokevirtual getMeasuredHeight : ()I
    //   39: iastore
    //   40: aload_1
    //   41: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   44: astore #5
    //   46: aload #5
    //   48: instanceof android/view/ViewGroup
    //   51: ifeq -> 104
    //   54: aload #4
    //   56: iconst_0
    //   57: aload #5
    //   59: checkcast android/view/ViewGroup
    //   62: invokevirtual getMeasuredWidth : ()I
    //   65: aload #4
    //   67: iconst_0
    //   68: iaload
    //   69: invokestatic min : (II)I
    //   72: iastore
    //   73: aload #4
    //   75: iconst_1
    //   76: aload #5
    //   78: checkcast android/view/ViewGroup
    //   81: invokevirtual getMeasuredHeight : ()I
    //   84: aload #4
    //   86: iconst_1
    //   87: iaload
    //   88: invokestatic min : (II)I
    //   91: iastore
    //   92: aload #5
    //   94: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   99: astore #5
    //   101: goto -> 46
    //   104: new org/json/JSONObject
    //   107: astore #5
    //   109: aload #5
    //   111: invokespecial <init> : ()V
    //   114: aload #5
    //   116: ldc 'width'
    //   118: aload_0
    //   119: aload_1
    //   120: invokevirtual getMeasuredWidth : ()I
    //   123: invokestatic j : (Landroid/content/Context;I)I
    //   126: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   129: pop
    //   130: aload #5
    //   132: ldc 'height'
    //   134: aload_0
    //   135: aload_1
    //   136: invokevirtual getMeasuredHeight : ()I
    //   139: invokestatic j : (Landroid/content/Context;I)I
    //   142: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   145: pop
    //   146: aload #5
    //   148: ldc 'x'
    //   150: aload_0
    //   151: aload_3
    //   152: iconst_0
    //   153: iaload
    //   154: invokestatic j : (Landroid/content/Context;I)I
    //   157: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   160: pop
    //   161: aload #5
    //   163: ldc 'y'
    //   165: aload_0
    //   166: aload_3
    //   167: iconst_1
    //   168: iaload
    //   169: invokestatic j : (Landroid/content/Context;I)I
    //   172: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   175: pop
    //   176: aload #5
    //   178: ldc 'maximum_visible_width'
    //   180: aload_0
    //   181: aload #4
    //   183: iconst_0
    //   184: iaload
    //   185: invokestatic j : (Landroid/content/Context;I)I
    //   188: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   191: pop
    //   192: aload #5
    //   194: ldc 'maximum_visible_height'
    //   196: aload_0
    //   197: aload #4
    //   199: iconst_1
    //   200: iaload
    //   201: invokestatic j : (Landroid/content/Context;I)I
    //   204: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   207: pop
    //   208: aload #5
    //   210: ldc 'relative_to'
    //   212: ldc 'window'
    //   214: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   217: pop
    //   218: aload_2
    //   219: ldc 'frame'
    //   221: aload #5
    //   223: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   226: pop
    //   227: new android/graphics/Rect
    //   230: astore #5
    //   232: aload #5
    //   234: invokespecial <init> : ()V
    //   237: aload_1
    //   238: aload #5
    //   240: invokevirtual getGlobalVisibleRect : (Landroid/graphics/Rect;)Z
    //   243: ifeq -> 256
    //   246: aload_0
    //   247: aload #5
    //   249: invokestatic c : (Landroid/content/Context;Landroid/graphics/Rect;)Lorg/json/JSONObject;
    //   252: astore_0
    //   253: goto -> 327
    //   256: new org/json/JSONObject
    //   259: astore #5
    //   261: aload #5
    //   263: invokespecial <init> : ()V
    //   266: aload #5
    //   268: ldc 'width'
    //   270: iconst_0
    //   271: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   274: pop
    //   275: aload #5
    //   277: ldc 'height'
    //   279: iconst_0
    //   280: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   283: pop
    //   284: aload #5
    //   286: ldc 'x'
    //   288: aload_0
    //   289: aload_3
    //   290: iconst_0
    //   291: iaload
    //   292: invokestatic j : (Landroid/content/Context;I)I
    //   295: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   298: pop
    //   299: aload #5
    //   301: ldc 'y'
    //   303: aload_0
    //   304: aload_3
    //   305: iconst_1
    //   306: iaload
    //   307: invokestatic j : (Landroid/content/Context;I)I
    //   310: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   313: pop
    //   314: aload #5
    //   316: ldc 'relative_to'
    //   318: ldc 'window'
    //   320: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   323: pop
    //   324: aload #5
    //   326: astore_0
    //   327: aload_2
    //   328: ldc 'visible_bounds'
    //   330: aload_0
    //   331: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   334: pop
    //   335: goto -> 344
    //   338: astore_0
    //   339: ldc 'Unable to get native ad view bounding box'
    //   341: invokestatic i : (Ljava/lang/String;)V
    //   344: getstatic com/google/android/gms/internal/ads/m0.R4 : Lcom/google/android/gms/internal/ads/x;
    //   347: astore_0
    //   348: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   351: aload_0
    //   352: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   355: checkcast java/lang/Boolean
    //   358: invokevirtual booleanValue : ()Z
    //   361: ifeq -> 527
    //   364: aload_1
    //   365: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   368: astore_0
    //   369: aload_0
    //   370: ifnull -> 416
    //   373: aload_0
    //   374: invokevirtual getClass : ()Ljava/lang/Class;
    //   377: ldc 'getTemplateTypeName'
    //   379: iconst_0
    //   380: anewarray java/lang/Class
    //   383: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   386: aload_0
    //   387: iconst_0
    //   388: anewarray java/lang/Object
    //   391: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   394: checkcast java/lang/String
    //   397: astore_0
    //   398: goto -> 419
    //   401: astore_0
    //   402: goto -> 410
    //   405: astore_0
    //   406: goto -> 410
    //   409: astore_0
    //   410: ldc 'Cannot access method getTemplateTypeName: '
    //   412: aload_0
    //   413: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   416: ldc ''
    //   418: astore_0
    //   419: iconst_m1
    //   420: istore #6
    //   422: aload_0
    //   423: invokevirtual hashCode : ()I
    //   426: istore #7
    //   428: iload #7
    //   430: ldc -2066603854
    //   432: if_icmpeq -> 460
    //   435: iload #7
    //   437: ldc 2019754500
    //   439: if_icmpeq -> 445
    //   442: goto -> 476
    //   445: aload_0
    //   446: ldc 'medium_template'
    //   448: invokevirtual equals : (Ljava/lang/Object;)Z
    //   451: ifeq -> 476
    //   454: iconst_1
    //   455: istore #6
    //   457: goto -> 476
    //   460: aload_0
    //   461: ldc 'small_template'
    //   463: invokevirtual equals : (Ljava/lang/Object;)Z
    //   466: istore #8
    //   468: iload #8
    //   470: ifeq -> 476
    //   473: iconst_0
    //   474: istore #6
    //   476: iload #6
    //   478: ifeq -> 509
    //   481: iload #6
    //   483: iconst_1
    //   484: if_icmpeq -> 498
    //   487: aload_2
    //   488: ldc 'native_template_type'
    //   490: iconst_0
    //   491: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   494: pop
    //   495: goto -> 527
    //   498: aload_2
    //   499: ldc 'native_template_type'
    //   501: iconst_2
    //   502: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   505: pop
    //   506: goto -> 527
    //   509: aload_2
    //   510: ldc 'native_template_type'
    //   512: iconst_1
    //   513: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   516: pop
    //   517: goto -> 527
    //   520: astore_0
    //   521: ldc 'Could not log native template signal to JSON'
    //   523: aload_0
    //   524: invokestatic c : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   527: aload_2
    //   528: areturn
    //   529: astore_0
    //   530: goto -> 416
    // Exception table:
    //   from	to	target	type
    //   14	46	338	java/lang/Exception
    //   46	101	338	java/lang/Exception
    //   104	253	338	java/lang/Exception
    //   256	324	338	java/lang/Exception
    //   327	335	338	java/lang/Exception
    //   373	398	529	java/lang/NoSuchMethodException
    //   373	398	409	java/lang/SecurityException
    //   373	398	405	java/lang/IllegalAccessException
    //   373	398	401	java/lang/reflect/InvocationTargetException
    //   422	428	520	org/json/JSONException
    //   445	454	520	org/json/JSONException
    //   460	468	520	org/json/JSONException
    //   487	495	520	org/json/JSONException
    //   498	506	520	org/json/JSONException
    //   509	517	520	org/json/JSONException
  }
  
  public static JSONObject e(Context paramContext, Map<String, WeakReference<View>> paramMap1, Map<String, WeakReference<View>> paramMap2, View paramView) {
    // Byte code:
    //   0: ldc 'ad_view'
    //   2: astore #4
    //   4: ldc 'relative_to'
    //   6: astore #5
    //   8: new org/json/JSONObject
    //   11: dup
    //   12: invokespecial <init> : ()V
    //   15: astore #6
    //   17: aload_1
    //   18: ifnull -> 481
    //   21: aload_3
    //   22: ifnonnull -> 28
    //   25: goto -> 481
    //   28: aload_3
    //   29: invokestatic m : (Landroid/view/View;)[I
    //   32: astore #7
    //   34: aload_1
    //   35: invokeinterface entrySet : ()Ljava/util/Set;
    //   40: invokeinterface iterator : ()Ljava/util/Iterator;
    //   45: astore_3
    //   46: aload #5
    //   48: astore_1
    //   49: aload_3
    //   50: invokeinterface hasNext : ()Z
    //   55: ifeq -> 481
    //   58: aload_3
    //   59: invokeinterface next : ()Ljava/lang/Object;
    //   64: checkcast java/util/Map$Entry
    //   67: astore #8
    //   69: aload #8
    //   71: invokeinterface getValue : ()Ljava/lang/Object;
    //   76: checkcast java/lang/ref/WeakReference
    //   79: invokevirtual get : ()Ljava/lang/Object;
    //   82: checkcast android/view/View
    //   85: astore #9
    //   87: aload #9
    //   89: ifnull -> 49
    //   92: aload #9
    //   94: invokestatic m : (Landroid/view/View;)[I
    //   97: astore #10
    //   99: new org/json/JSONObject
    //   102: dup
    //   103: invokespecial <init> : ()V
    //   106: astore #11
    //   108: new org/json/JSONObject
    //   111: dup
    //   112: invokespecial <init> : ()V
    //   115: astore #5
    //   117: aload #5
    //   119: ldc 'width'
    //   121: aload_0
    //   122: aload #9
    //   124: invokevirtual getMeasuredWidth : ()I
    //   127: invokestatic j : (Landroid/content/Context;I)I
    //   130: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   133: pop
    //   134: aload #5
    //   136: ldc 'height'
    //   138: aload_0
    //   139: aload #9
    //   141: invokevirtual getMeasuredHeight : ()I
    //   144: invokestatic j : (Landroid/content/Context;I)I
    //   147: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   150: pop
    //   151: aload #5
    //   153: ldc 'x'
    //   155: aload_0
    //   156: aload #10
    //   158: iconst_0
    //   159: iaload
    //   160: aload #7
    //   162: iconst_0
    //   163: iaload
    //   164: isub
    //   165: invokestatic j : (Landroid/content/Context;I)I
    //   168: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   171: pop
    //   172: aload #5
    //   174: ldc 'y'
    //   176: aload_0
    //   177: aload #10
    //   179: iconst_1
    //   180: iaload
    //   181: aload #7
    //   183: iconst_1
    //   184: iaload
    //   185: isub
    //   186: invokestatic j : (Landroid/content/Context;I)I
    //   189: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   192: pop
    //   193: aload #5
    //   195: aload_1
    //   196: aload #4
    //   198: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   201: pop
    //   202: aload #11
    //   204: ldc 'frame'
    //   206: aload #5
    //   208: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   211: pop
    //   212: new android/graphics/Rect
    //   215: astore #5
    //   217: aload #5
    //   219: invokespecial <init> : ()V
    //   222: aload #9
    //   224: aload #5
    //   226: invokevirtual getLocalVisibleRect : (Landroid/graphics/Rect;)Z
    //   229: ifeq -> 243
    //   232: aload_0
    //   233: aload #5
    //   235: invokestatic c : (Landroid/content/Context;Landroid/graphics/Rect;)Lorg/json/JSONObject;
    //   238: astore #5
    //   240: goto -> 322
    //   243: new org/json/JSONObject
    //   246: astore #5
    //   248: aload #5
    //   250: invokespecial <init> : ()V
    //   253: aload #5
    //   255: ldc 'width'
    //   257: iconst_0
    //   258: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   261: pop
    //   262: aload #5
    //   264: ldc 'height'
    //   266: iconst_0
    //   267: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   270: pop
    //   271: aload #5
    //   273: ldc 'x'
    //   275: aload_0
    //   276: aload #10
    //   278: iconst_0
    //   279: iaload
    //   280: aload #7
    //   282: iconst_0
    //   283: iaload
    //   284: isub
    //   285: invokestatic j : (Landroid/content/Context;I)I
    //   288: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   291: pop
    //   292: aload #5
    //   294: ldc 'y'
    //   296: aload_0
    //   297: aload #10
    //   299: iconst_1
    //   300: iaload
    //   301: aload #7
    //   303: iconst_1
    //   304: iaload
    //   305: isub
    //   306: invokestatic j : (Landroid/content/Context;I)I
    //   309: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   312: pop
    //   313: aload #5
    //   315: aload_1
    //   316: aload #4
    //   318: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   321: pop
    //   322: aload #11
    //   324: ldc 'visible_bounds'
    //   326: aload #5
    //   328: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   331: pop
    //   332: aload #9
    //   334: instanceof android/widget/TextView
    //   337: ifeq -> 401
    //   340: aload #9
    //   342: checkcast android/widget/TextView
    //   345: astore #5
    //   347: aload #11
    //   349: ldc_w 'text_color'
    //   352: aload #5
    //   354: invokevirtual getCurrentTextColor : ()I
    //   357: invokevirtual put : (Ljava/lang/String;I)Lorg/json/JSONObject;
    //   360: pop
    //   361: aload #5
    //   363: invokevirtual getTextSize : ()F
    //   366: fstore #12
    //   368: fload #12
    //   370: f2d
    //   371: dstore #13
    //   373: aload #11
    //   375: ldc_w 'font_size'
    //   378: dload #13
    //   380: invokevirtual put : (Ljava/lang/String;D)Lorg/json/JSONObject;
    //   383: pop
    //   384: aload #11
    //   386: ldc_w 'text'
    //   389: aload #5
    //   391: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   394: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   397: pop
    //   398: goto -> 401
    //   401: aload_2
    //   402: ifnull -> 435
    //   405: aload_2
    //   406: aload #8
    //   408: invokeinterface getKey : ()Ljava/lang/Object;
    //   413: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   418: ifeq -> 435
    //   421: aload #9
    //   423: invokevirtual isClickable : ()Z
    //   426: ifeq -> 435
    //   429: iconst_1
    //   430: istore #15
    //   432: goto -> 438
    //   435: iconst_0
    //   436: istore #15
    //   438: aload #11
    //   440: ldc_w 'is_clickable'
    //   443: iload #15
    //   445: invokevirtual put : (Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   448: pop
    //   449: aload #6
    //   451: aload #8
    //   453: invokeinterface getKey : ()Ljava/lang/Object;
    //   458: checkcast java/lang/String
    //   461: aload #11
    //   463: invokevirtual put : (Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   466: pop
    //   467: goto -> 478
    //   470: astore #5
    //   472: ldc_w 'Unable to get asset views information'
    //   475: invokestatic i : (Ljava/lang/String;)V
    //   478: goto -> 49
    //   481: aload #6
    //   483: areturn
    //   484: astore #5
    //   486: goto -> 472
    // Exception table:
    //   from	to	target	type
    //   117	240	470	org/json/JSONException
    //   243	322	470	org/json/JSONException
    //   322	368	470	org/json/JSONException
    //   373	398	484	org/json/JSONException
    //   405	429	484	org/json/JSONException
    //   438	467	484	org/json/JSONException
  }
  
  public static JSONObject f(String paramString, Context paramContext, Point paramPoint1, Point paramPoint2) {
    String str = null;
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      try {
        jSONObject.put("click_point", b(paramContext, paramPoint1, paramPoint2));
        jSONObject.put("asset_id", paramString);
        JSONObject jSONObject1 = jSONObject;
      } catch (Exception null) {
        JSONObject jSONObject1 = jSONObject;
      } 
    } catch (Exception exception) {
      paramString = str;
    } 
    cm.c("Error occurred while grabbing click signals.", exception);
  }
  
  public static boolean g(Context paramContext, nh1 paramnh1) {
    x x1;
    if (!paramnh1.I)
      return false; 
    x x2 = m0.B5;
    if (((Boolean)er2.e().c(x2)).booleanValue()) {
      x1 = m0.E5;
      return ((Boolean)er2.e().c(x1)).booleanValue();
    } 
    x2 = m0.C5;
    String str = (String)er2.e().c(x2);
    if (!str.isEmpty() && x1 != null) {
      String str1 = x1.getPackageName();
      Iterator<String> iterator = wq1.b(fq1.b(';')).c(str).iterator();
      while (iterator.hasNext()) {
        if (((String)iterator.next()).equals(str1))
          return true; 
      } 
    } 
    return false;
  }
  
  public static JSONObject h(Context paramContext, View paramView) {
    JSONObject jSONObject = new JSONObject();
    if (paramView == null)
      return jSONObject; 
    try {
      q.c();
      jSONObject.put("can_show_on_lock_screen", h1.s0(paramView));
      q.c();
      jSONObject.put("is_keyguard_locked", h1.E(paramContext));
    } catch (JSONException jSONException) {
      cm.i("Unable to get lock screen information");
    } 
    return jSONObject;
  }
  
  public static JSONObject i(Context paramContext) {
    JSONObject jSONObject = new JSONObject();
    q.c();
    DisplayMetrics displayMetrics = h1.b((WindowManager)paramContext.getSystemService("window"));
    try {
      jSONObject.put("width", j(paramContext, displayMetrics.widthPixels));
      jSONObject.put("height", j(paramContext, displayMetrics.heightPixels));
      return jSONObject;
    } catch (JSONException jSONException) {
      return null;
    } 
  }
  
  private static int j(Context paramContext, int paramInt) {
    return er2.a().p(paramContext, paramInt);
  }
  
  public static boolean k(int paramInt) {
    x x = m0.f2;
    if (((Boolean)er2.e().c(x)).booleanValue()) {
      x = m0.g2;
      if (!((Boolean)er2.e().c(x)).booleanValue() && paramInt > 15299999)
        return false; 
    } 
    return true;
  }
  
  public static JSONObject l(View paramView) {
    JSONObject jSONObject = new JSONObject();
    if (paramView == null)
      return jSONObject; 
    try {
      x x = m0.A5;
      boolean bool = ((Boolean)er2.e().c(x)).booleanValue();
      if (bool) {
        q.c();
        jSONObject.put("contained_in_scroll_view", h1.v0(paramView));
      } else {
        q.c();
        if (h1.t0(paramView) != -1) {
          bool = true;
        } else {
          bool = false;
        } 
        jSONObject.put("contained_in_scroll_view", bool);
      } 
    } catch (Exception exception) {}
    return jSONObject;
  }
  
  private static int[] m(View paramView) {
    int[] arrayOfInt = new int[2];
    if (paramView != null)
      paramView.getLocationOnScreen(arrayOfInt); 
    return arrayOfInt;
  }
  
  public static WindowManager.LayoutParams n() {
    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
    x x = m0.D5;
    layoutParams.flags = ((Integer)er2.e().c(x)).intValue();
    layoutParams.type = 2;
    layoutParams.gravity = 8388659;
    return layoutParams;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/n0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */