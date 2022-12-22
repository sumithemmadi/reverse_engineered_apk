package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.doubleclick.d;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.common.c;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

public final class sl {
  public static final Handler a = new xp1(Looper.getMainLooper());
  
  private static final String b = AdView.class.getName();
  
  private static final String c = k.class.getName();
  
  private static final String d = PublisherAdView.class.getName();
  
  private static final String e = d.class.getName();
  
  private static final String f = SearchAdView.class.getName();
  
  private static final String g = d.class.getName();
  
  private float h = -1.0F;
  
  public static int a(DisplayMetrics paramDisplayMetrics, int paramInt) {
    return (int)TypedValue.applyDimension(1, paramInt, paramDisplayMetrics);
  }
  
  public static String b(StackTraceElement[] paramArrayOfStackTraceElement, String paramString) {
    int i = 0;
    while (true) {
      int j = i + 1;
      if (j < paramArrayOfStackTraceElement.length) {
        StackTraceElement stackTraceElement = paramArrayOfStackTraceElement[i];
        String str = stackTraceElement.getClassName();
        if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (b.equalsIgnoreCase(str) || c.equalsIgnoreCase(str) || d.equalsIgnoreCase(str) || e.equalsIgnoreCase(str) || f.equalsIgnoreCase(str) || g.equalsIgnoreCase(str))) {
          String str1 = paramArrayOfStackTraceElement[j].getClassName();
          break;
        } 
        i = j;
        continue;
      } 
      paramArrayOfStackTraceElement = null;
      break;
    } 
    if (paramString != null) {
      StringTokenizer stringTokenizer = new StringTokenizer(paramString, ".");
      StringBuilder stringBuilder = new StringBuilder();
      i = 2;
      if (stringTokenizer.hasMoreElements()) {
        stringBuilder.append(stringTokenizer.nextToken());
        while (i > 0 && stringTokenizer.hasMoreElements()) {
          stringBuilder.append(".");
          stringBuilder.append(stringTokenizer.nextToken());
          i--;
        } 
        paramString = stringBuilder.toString();
      } 
      if (paramArrayOfStackTraceElement != null && !paramArrayOfStackTraceElement.contains(paramString))
        return (String)paramArrayOfStackTraceElement; 
    } 
    return null;
  }
  
  public static void d(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean, tl paramtl) {
    Context context1 = paramContext.getApplicationContext();
    Context context2 = context1;
    if (context1 == null)
      context2 = paramContext; 
    paramBundle.putString("os", Build.VERSION.RELEASE);
    paramBundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
    paramBundle.putString("appid", context2.getPackageName());
    String str = paramString1;
    if (paramString1 == null) {
      int i = c.f().a(paramContext);
      StringBuilder stringBuilder = new StringBuilder(23);
      stringBuilder.append(i);
      stringBuilder.append(".204204000");
      str = stringBuilder.toString();
    } 
    paramBundle.putString("js", str);
    Uri.Builder builder = (new Uri.Builder()).scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", paramString2);
    for (String paramString2 : paramBundle.keySet())
      builder.appendQueryParameter(paramString2, paramBundle.getString(paramString2)); 
    paramtl.a(builder.toString());
  }
  
  private static void f(ViewGroup paramViewGroup, zzvs paramzzvs, String paramString, int paramInt1, int paramInt2) {
    if (paramViewGroup.getChildCount() != 0)
      return; 
    Context context = paramViewGroup.getContext();
    TextView textView = new TextView(context);
    textView.setGravity(17);
    textView.setText(paramString);
    textView.setTextColor(paramInt1);
    textView.setBackgroundColor(paramInt2);
    FrameLayout frameLayout = new FrameLayout(context);
    frameLayout.setBackgroundColor(paramInt1);
    paramInt1 = r(context, 3);
    frameLayout.addView((View)textView, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(paramzzvs.g - paramInt1, paramzzvs.d - paramInt1, 17));
    paramViewGroup.addView((View)frameLayout, paramzzvs.g, paramzzvs.d);
  }
  
  public static void h(boolean paramBoolean, HttpURLConnection paramHttpURLConnection, String paramString) {
    paramHttpURLConnection.setConnectTimeout(60000);
    paramHttpURLConnection.setInstanceFollowRedirects(true);
    paramHttpURLConnection.setReadTimeout(60000);
    if (paramString != null)
      paramHttpURLConnection.setRequestProperty("User-Agent", paramString); 
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public static int i(DisplayMetrics paramDisplayMetrics, int paramInt) {
    return Math.round(paramInt / paramDisplayMetrics.density);
  }
  
  public static String j(Context paramContext) {
    String str;
    ContentResolver contentResolver = paramContext.getContentResolver();
    if (contentResolver == null) {
      contentResolver = null;
    } else {
      str = Settings.Secure.getString(contentResolver, "android_id");
    } 
    if (str == null || v())
      str = "emulator"; 
    return s(str);
  }
  
  public static String k(Context paramContext) {
    ContentResolver contentResolver = paramContext.getContentResolver();
    return (contentResolver == null) ? null : Settings.Secure.getString(contentResolver, "android_id");
  }
  
  public static boolean l(Context paramContext) {
    int i = c.f().h(paramContext, 12451000);
    return (i == 0 || i == 2);
  }
  
  public static boolean m(Context paramContext) {
    if ((paramContext.getResources().getConfiguration()).orientation != 2)
      return false; 
    DisplayMetrics displayMetrics = paramContext.getResources().getDisplayMetrics();
    return ((int)(displayMetrics.heightPixels / displayMetrics.density) < 600);
  }
  
  @TargetApi(17)
  public static boolean n(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   4: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   7: astore_1
    //   8: aload_0
    //   9: ldc_w 'window'
    //   12: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   15: checkcast android/view/WindowManager
    //   18: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
    //   23: astore_0
    //   24: invokestatic d : ()Z
    //   27: ifeq -> 48
    //   30: aload_0
    //   31: aload_1
    //   32: invokevirtual getRealMetrics : (Landroid/util/DisplayMetrics;)V
    //   35: aload_1
    //   36: getfield heightPixels : I
    //   39: istore_2
    //   40: aload_1
    //   41: getfield widthPixels : I
    //   44: istore_3
    //   45: goto -> 104
    //   48: ldc_w android/view/Display
    //   51: ldc_w 'getRawHeight'
    //   54: iconst_0
    //   55: anewarray java/lang/Class
    //   58: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   61: aload_0
    //   62: iconst_0
    //   63: anewarray java/lang/Object
    //   66: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   69: checkcast java/lang/Integer
    //   72: invokevirtual intValue : ()I
    //   75: istore_2
    //   76: ldc_w android/view/Display
    //   79: ldc_w 'getRawWidth'
    //   82: iconst_0
    //   83: anewarray java/lang/Class
    //   86: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   89: aload_0
    //   90: iconst_0
    //   91: anewarray java/lang/Object
    //   94: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   97: checkcast java/lang/Integer
    //   100: invokevirtual intValue : ()I
    //   103: istore_3
    //   104: aload_0
    //   105: aload_1
    //   106: invokevirtual getMetrics : (Landroid/util/DisplayMetrics;)V
    //   109: aload_1
    //   110: getfield heightPixels : I
    //   113: istore #4
    //   115: aload_1
    //   116: getfield widthPixels : I
    //   119: istore #5
    //   121: iload #4
    //   123: iload_2
    //   124: if_icmpne -> 135
    //   127: iload #5
    //   129: iload_3
    //   130: if_icmpne -> 135
    //   133: iconst_1
    //   134: ireturn
    //   135: iconst_0
    //   136: ireturn
    //   137: astore_0
    //   138: goto -> 135
    // Exception table:
    //   from	to	target	type
    //   48	104	137	java/lang/Exception
  }
  
  public static int o(Context paramContext) {
    int i = paramContext.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
    return (i > 0) ? paramContext.getResources().getDimensionPixelSize(i) : 0;
  }
  
  public static Throwable q(Throwable paramThrowable) {
    if (((Boolean)o2.f.a()).booleanValue())
      return paramThrowable; 
    LinkedList<Throwable> linkedList = new LinkedList();
    while (paramThrowable != null) {
      linkedList.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    } 
    paramThrowable = null;
    while (!linkedList.isEmpty()) {
      Throwable throwable = linkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = throwable.getStackTrace();
      ArrayList<StackTraceElement> arrayList = new ArrayList();
      arrayList.add(new StackTraceElement(throwable.getClass().getName(), "<filtered>", "<filtered>", 1));
      int i = arrayOfStackTraceElement.length;
      byte b = 0;
      boolean bool = false;
      while (b < i) {
        StackTraceElement stackTraceElement = arrayOfStackTraceElement[b];
        if (t(stackTraceElement.getClassName())) {
          arrayList.add(stackTraceElement);
          bool = true;
        } else {
          boolean bool1;
          String str = stackTraceElement.getClassName();
          if (!TextUtils.isEmpty(str) && (str.startsWith("android.") || str.startsWith("java."))) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          if (bool1) {
            arrayList.add(stackTraceElement);
          } else {
            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
          } 
        } 
        b++;
      } 
      if (bool) {
        if (paramThrowable == null) {
          paramThrowable = new Throwable(throwable.getMessage());
        } else {
          paramThrowable = new Throwable(throwable.getMessage(), paramThrowable);
        } 
        paramThrowable.setStackTrace(arrayList.<StackTraceElement>toArray(new StackTraceElement[0]));
      } 
    } 
    return paramThrowable;
  }
  
  public static int r(Context paramContext, int paramInt) {
    return a(paramContext.getResources().getDisplayMetrics(), paramInt);
  }
  
  public static String s(String paramString) {
    byte b = 0;
    while (b < 2) {
      try {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(paramString.getBytes());
        Locale locale = Locale.US;
        BigInteger bigInteger = new BigInteger();
        this(1, messageDigest.digest());
        return String.format(locale, "%032X", new Object[] { bigInteger });
      } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        b++;
      } catch (ArithmeticException arithmeticException) {
        return null;
      } 
    } 
    return null;
  }
  
  public static boolean t(String paramString) {
    return TextUtils.isEmpty(paramString) ? false : paramString.startsWith(o2.d.a());
  }
  
  public static boolean u(Context paramContext, int paramInt) {
    return (c.f().h(paramContext, paramInt) == 0);
  }
  
  public static boolean v() {
    return Build.DEVICE.startsWith("generic");
  }
  
  public static boolean w() {
    return (Looper.myLooper() == Looper.getMainLooper());
  }
  
  public static String x() {
    UUID uUID = UUID.randomUUID();
    byte[] arrayOfByte1 = BigInteger.valueOf(uUID.getLeastSignificantBits()).toByteArray();
    byte[] arrayOfByte2 = BigInteger.valueOf(uUID.getMostSignificantBits()).toByteArray();
    String str = (new BigInteger(1, arrayOfByte1)).toString();
    byte b = 0;
    while (true) {
      if (b < 2) {
        try {
          MessageDigest messageDigest = MessageDigest.getInstance("MD5");
          messageDigest.update(arrayOfByte1);
          messageDigest.update(arrayOfByte2);
          byte[] arrayOfByte = new byte[8];
          System.arraycopy(messageDigest.digest(), 0, arrayOfByte, 0, 8);
          BigInteger bigInteger = new BigInteger();
          this(1, arrayOfByte);
          String str1 = bigInteger.toString();
          str = str1;
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
        b++;
        continue;
      } 
      return str;
    } 
  }
  
  public final void c(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean) {
    d(paramContext, paramString1, paramString2, paramBundle, true, new ql(this));
  }
  
  public final void e(ViewGroup paramViewGroup, zzvs paramzzvs, String paramString) {
    f(paramViewGroup, paramzzvs, paramString, -16777216, -1);
  }
  
  public final void g(ViewGroup paramViewGroup, zzvs paramzzvs, String paramString1, String paramString2) {
    cm.i(paramString2);
    f(paramViewGroup, paramzzvs, paramString1, -65536, -16777216);
  }
  
  public final int p(Context paramContext, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : F
    //   4: fconst_0
    //   5: fcmpg
    //   6: ifge -> 67
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: getfield h : F
    //   15: fconst_0
    //   16: fcmpg
    //   17: ifge -> 57
    //   20: aload_1
    //   21: ldc_w 'window'
    //   24: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   27: checkcast android/view/WindowManager
    //   30: invokeinterface getDefaultDisplay : ()Landroid/view/Display;
    //   35: astore_3
    //   36: new android/util/DisplayMetrics
    //   39: astore_1
    //   40: aload_1
    //   41: invokespecial <init> : ()V
    //   44: aload_3
    //   45: aload_1
    //   46: invokevirtual getMetrics : (Landroid/util/DisplayMetrics;)V
    //   49: aload_0
    //   50: aload_1
    //   51: getfield density : F
    //   54: putfield h : F
    //   57: aload_0
    //   58: monitorexit
    //   59: goto -> 67
    //   62: astore_1
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_1
    //   66: athrow
    //   67: iload_2
    //   68: i2f
    //   69: aload_0
    //   70: getfield h : F
    //   73: fdiv
    //   74: invokestatic round : (F)I
    //   77: ireturn
    // Exception table:
    //   from	to	target	type
    //   11	57	62	finally
    //   57	59	62	finally
    //   63	65	62	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/sl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */