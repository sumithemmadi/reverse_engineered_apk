package com.allinone.callerid.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.provider.CallLog;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.allinone.callerid.bean.NumberContent;
import com.allinone.callerid.customview.d;
import com.allinone.callerid.f.e;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.service.KeepAliveJobService;
import com.allinone.callerid.service.NLService;
import com.allinone.callerid.util.k1.a;
import com.allinone.callerid.util.k1.b;
import com.android.boom.w;
import com.android.internal.telephony.ITelephony;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

public class i1 {
  public static boolean a = false;
  
  public static boolean b = false;
  
  private static boolean c = true;
  
  public static boolean d = false;
  
  private static d e;
  
  public static String f = "";
  
  public static String A() {
    String str3;
    String str1 = "";
    String str2 = str1;
    try {
      Enumeration<NetworkInterface> enumeration = NetworkInterface.getNetworkInterfaces();
      label25: while (true) {
        str2 = str1;
        str3 = str1;
        if (enumeration.hasMoreElements()) {
          InetAddress inetAddress;
          str2 = str1;
          Enumeration<InetAddress> enumeration1 = ((NetworkInterface)enumeration.nextElement()).getInetAddresses();
          while (true) {
            str2 = str1;
            if (enumeration1.hasMoreElements()) {
              str2 = str1;
              inetAddress = enumeration1.nextElement();
              str2 = str1;
              if (inetAddress instanceof java.net.Inet6Address)
                continue; 
              str2 = str1;
              if (!"127.0.0.1".equals(inetAddress.getHostAddress())) {
                str2 = str1;
                break;
              } 
              continue;
            } 
            continue label25;
          } 
          str1 = inetAddress.getHostAddress();
          continue;
        } 
        break;
      } 
    } catch (SocketException socketException) {
      socketException.printStackTrace();
      str3 = str2;
    } 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ip:");
      stringBuilder.append(str3);
      d0.a("location", stringBuilder.toString());
    } 
    return str3;
  }
  
  public static void A0(Context paramContext) {
    try {
      if (Build.VERSION.SDK_INT >= 23) {
        boolean bool = ((PowerManager)paramContext.getSystemService("power")).isIgnoringBatteryOptimizations(M(paramContext));
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("hasIgnored:");
        stringBuilder.append(bool);
        Log.e("tony", stringBuilder.toString());
        if (bool) {
          q.b().c("battery_optimize_ok");
        } else {
          q.b().c("battery_optimize_no");
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static boolean B(Context paramContext) {
    String str = b1.p();
    return (str == null || str.equals(""));
  }
  
  public static void B0(Activity paramActivity, int paramInt) {
    try {
      if (Build.VERSION.SDK_INT >= 21) {
        Window window = paramActivity.getWindow();
        window.addFlags(-2147483648);
        window.setStatusBarColor(paramInt);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static boolean C(Context paramContext) {
    boolean bool;
    String str = b1.p();
    if (str != null && !"".equals(str) && !str.equals(W(paramContext))) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static void C0(Context paramContext, String paramString) {
    try {
      Intent intent = paramContext.getPackageManager().getLaunchIntentForPackage("com.android.vending");
      ComponentName componentName = new ComponentName();
      this("com.android.vending", "com.google.android.finsky.activities.LaunchUrlHandlerActivity");
      intent.setComponent(componentName);
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("market://details?id=");
      stringBuilder.append(paramString);
      intent.setData(Uri.parse(stringBuilder.toString()));
      intent.setFlags(268435456);
      paramContext.startActivity(intent);
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("https://play.google.com/store/apps/details?id=");
      stringBuilder.append(paramString);
      Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
      intent.setFlags(268435456);
      paramContext.startActivity(intent);
    } 
  }
  
  public static String D(Context paramContext, String paramString) {
    String str1 = "";
    String str2 = str1;
    if (paramString != null) {
      str2 = str1;
      if (!"".equals(paramString)) {
        str2 = paramContext.getResources().getString(2131755747);
        byte b = -1;
        switch (paramString.hashCode()) {
          case 1172387228:
            if (!paramString.equals("Telemarketing"))
              break; 
            b = 6;
            break;
          case 244385703:
            if (!paramString.equals("Collection agency"))
              break; 
            b = 5;
            break;
          case 77374588:
            if (!paramString.equals("Prank"))
              break; 
            b = 4;
            break;
          case 2583401:
            if (!paramString.equals("Spam"))
              break; 
            b = 3;
            break;
          case 2570908:
            if (!paramString.equals("Scam"))
              break; 
            b = 2;
            break;
          case -444093798:
            if (!paramString.equals("Other Commercial"))
              break; 
            b = 1;
            break;
          case -478566200:
            if (!paramString.equals("Robocall"))
              break; 
            b = 0;
            break;
        } 
        switch (b) {
          default:
            return str2;
          case 6:
            str2 = paramContext.getResources().getString(2131755776);
          case 5:
            str2 = paramContext.getResources().getString(2131755747);
          case 4:
            str2 = paramContext.getResources().getString(2131755747);
          case 3:
            str2 = paramContext.getResources().getString(2131755747);
          case 2:
            str2 = paramContext.getResources().getString(2131755683);
          case 1:
            str2 = paramContext.getResources().getString(2131755747);
          case 0:
            break;
        } 
        str2 = paramContext.getResources().getString(2131755747);
      } 
    } 
  }
  
  public static void D0(Context paramContext) {
    try {
      d d1 = d.b();
      e = d1;
      d1.a(paramContext);
      Handler handler = new Handler();
      this();
      c c = new c();
      this(paramContext);
      handler.postDelayed(c, 3000L);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static String E() {
    String str2;
    String str1 = "";
    try {
      Locale locale;
      if (Build.VERSION.SDK_INT >= 24) {
        locale = LocaleList.getDefault().get(0);
      } else {
        locale = Locale.getDefault();
      } 
      str2 = str1;
      if (locale != null)
        str2 = locale.getCountry(); 
    } catch (Exception exception) {
      exception.printStackTrace();
      str2 = str1;
    } 
    return str2;
  }
  
  public static void E0(Context paramContext, long paramLong) {
    if (Build.VERSION.SDK_INT >= 21) {
      JobScheduler jobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
      if (jobScheduler != null) {
        JobInfo.Builder builder = new JobInfo.Builder(6666, new ComponentName(paramContext, KeepAliveJobService.class));
        builder.setRequiredNetworkType(1);
        builder.setRequiresCharging(false);
        builder.setRequiresDeviceIdle(false);
        builder.setMinimumLatency(paramLong);
        jobScheduler.schedule(builder.build());
      } 
    } 
  }
  
  public static String F() {
    // Byte code:
    //   0: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
    //   3: ldc_w 'android.permission.GET_ACCOUNTS'
    //   6: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   9: ifne -> 107
    //   12: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
    //   15: invokestatic get : (Landroid/content/Context;)Landroid/accounts/AccountManager;
    //   18: ldc_w 'com.google'
    //   21: invokevirtual getAccountsByType : (Ljava/lang/String;)[Landroid/accounts/Account;
    //   24: astore_0
    //   25: aconst_null
    //   26: astore_1
    //   27: aload_1
    //   28: astore_2
    //   29: aload_0
    //   30: ifnull -> 44
    //   33: aload_1
    //   34: astore_2
    //   35: aload_0
    //   36: arraylength
    //   37: ifle -> 44
    //   40: aload_0
    //   41: iconst_0
    //   42: aaload
    //   43: astore_2
    //   44: aload_2
    //   45: ifnull -> 107
    //   48: aload_2
    //   49: getfield name : Ljava/lang/String;
    //   52: astore_0
    //   53: aload_0
    //   54: astore_1
    //   55: getstatic com/allinone/callerid/util/d0.a : Z
    //   58: ifeq -> 121
    //   61: new java/lang/StringBuilder
    //   64: astore_1
    //   65: aload_1
    //   66: invokespecial <init> : ()V
    //   69: aload_1
    //   70: ldc_w 'account='
    //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: pop
    //   77: aload_1
    //   78: aload_2
    //   79: getfield name : Ljava/lang/String;
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: ldc_w 'account'
    //   89: aload_1
    //   90: invokevirtual toString : ()Ljava/lang/String;
    //   93: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   96: aload_0
    //   97: astore_1
    //   98: goto -> 121
    //   101: astore_2
    //   102: aload_0
    //   103: astore_1
    //   104: goto -> 117
    //   107: ldc ''
    //   109: astore_1
    //   110: goto -> 121
    //   113: astore_2
    //   114: ldc ''
    //   116: astore_1
    //   117: aload_2
    //   118: invokevirtual printStackTrace : ()V
    //   121: aload_1
    //   122: ifnull -> 136
    //   125: ldc ''
    //   127: aload_1
    //   128: invokevirtual equals : (Ljava/lang/Object;)Z
    //   131: ifne -> 136
    //   134: aload_1
    //   135: areturn
    //   136: ldc_w 'email unknown'
    //   139: areturn
    // Exception table:
    //   from	to	target	type
    //   0	25	113	java/lang/Exception
    //   35	40	113	java/lang/Exception
    //   48	53	113	java/lang/Exception
    //   55	96	101	java/lang/Exception
  }
  
  public static void F0(Activity paramActivity) {
    if (!e0((Context)paramActivity))
      try {
        w.a(paramActivity);
      } finally {
        paramActivity = null;
      }  
  }
  
  public static String G() {
    String str2;
    String str1 = "en";
    try {
      Locale locale;
      if (Build.VERSION.SDK_INT >= 24) {
        locale = LocaleList.getDefault().get(0);
      } else {
        locale = Locale.getDefault();
      } 
      str2 = str1;
      if (locale != null)
        str2 = locale.getLanguage(); 
    } catch (Exception exception) {
      exception.printStackTrace();
      str2 = str1;
    } 
    return str2;
  }
  
  public static void G0(TextView paramTextView) {
    if (paramTextView != null && paramTextView.getText() instanceof Spannable) {
      Spannable spannable = (Spannable)paramTextView.getText();
      for (URLSpan uRLSpan : (URLSpan[])spannable.getSpans(0, spannable.length(), URLSpan.class)) {
        int i = spannable.getSpanStart(uRLSpan);
        int j = spannable.getSpanEnd(uRLSpan);
        spannable.removeSpan(uRLSpan);
        spannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), i, j, 0);
      } 
      paramTextView.setText((CharSequence)spannable);
    } 
  }
  
  public static String H(Context paramContext) {
    // Byte code:
    //   0: invokestatic c : ()Lcom/allinone/callerid/main/EZCallApplication;
    //   3: ldc_w 'android.permission.READ_PHONE_NUMBERS'
    //   6: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   9: ifne -> 44
    //   12: aload_0
    //   13: ldc_w 'android.permission.READ_PHONE_STATE'
    //   16: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   19: ifne -> 44
    //   22: aload_0
    //   23: ldc_w 'phone'
    //   26: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   29: checkcast android/telephony/TelephonyManager
    //   32: invokevirtual getLine1Number : ()Ljava/lang/String;
    //   35: astore_0
    //   36: goto -> 47
    //   39: astore_0
    //   40: aload_0
    //   41: invokevirtual printStackTrace : ()V
    //   44: ldc ''
    //   46: astore_0
    //   47: aload_0
    //   48: ifnull -> 92
    //   51: ldc ''
    //   53: aload_0
    //   54: invokevirtual equals : (Ljava/lang/Object;)Z
    //   57: ifne -> 92
    //   60: ldc_w '0'
    //   63: aload_0
    //   64: invokevirtual equals : (Ljava/lang/Object;)Z
    //   67: ifne -> 92
    //   70: ldc_w '1'
    //   73: aload_0
    //   74: invokevirtual equals : (Ljava/lang/Object;)Z
    //   77: ifne -> 92
    //   80: ldc_w '2'
    //   83: aload_0
    //   84: invokevirtual equals : (Ljava/lang/Object;)Z
    //   87: ifne -> 92
    //   90: aload_0
    //   91: areturn
    //   92: ldc ''
    //   94: areturn
    // Exception table:
    //   from	to	target	type
    //   0	36	39	java/lang/Exception
  }
  
  public static void H0(Context paramContext, String paramString) {
    Configuration configuration2;
    Resources resources = paramContext.getResources();
    Configuration configuration1 = resources.getConfiguration();
    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
    paramString.hashCode();
    int i = paramString.hashCode();
    String str1 = "es";
    String str2 = "el";
    String str3 = "bn";
    byte b = -1;
    switch (i) {
      case 115813762:
        if (!paramString.equals("zh-TW"))
          break; 
        b = 25;
        break;
      case 96646193:
        if (!paramString.equals("en_GB"))
          break; 
        b = 24;
        break;
      case 96646068:
        if (!paramString.equals("en_CA"))
          break; 
        b = 23;
        break;
      case 3886:
        if (!paramString.equals("zh"))
          break; 
        b = 22;
        break;
      case 3763:
        if (!paramString.equals("vi"))
          break; 
        b = 21;
        break;
      case 3741:
        if (!paramString.equals("ur"))
          break; 
        b = 20;
        break;
      case 3710:
        if (!paramString.equals("tr"))
          break; 
        b = 19;
        break;
      case 3700:
        if (!paramString.equals("th"))
          break; 
        b = 18;
        break;
      case 3697:
        if (!paramString.equals("te"))
          break; 
        b = 17;
        break;
      case 3651:
        if (!paramString.equals("ru"))
          break; 
        b = 16;
        break;
      case 3588:
        if (!paramString.equals("pt"))
          break; 
        b = 15;
        break;
      case 3494:
        if (!paramString.equals("ms"))
          break; 
        b = 14;
        break;
      case 3428:
        if (!paramString.equals("ko"))
          break; 
        b = 13;
        break;
      case 3424:
        if (!paramString.equals("kk"))
          break; 
        b = 12;
        break;
      case 3374:
        if (!paramString.equals("iw"))
          break; 
        b = 11;
        break;
      case 3371:
        if (!paramString.equals("it"))
          break; 
        b = 10;
        break;
      case 3365:
        if (!paramString.equals("in"))
          break; 
        b = 9;
        break;
      case 3329:
        if (!paramString.equals("hi"))
          break; 
        b = 8;
        break;
      case 3276:
        if (!paramString.equals("fr"))
          break; 
        b = 7;
        break;
      case 3259:
        if (!paramString.equals("fa"))
          break; 
        b = 6;
        break;
      case 3246:
        if (!paramString.equals(str1))
          break; 
        b = 5;
        break;
      case 3241:
        if (!paramString.equals("en"))
          break; 
        b = 4;
        break;
      case 3239:
        if (!paramString.equals(str2))
          break; 
        b = 3;
        break;
      case 3201:
        if (!paramString.equals("de"))
          break; 
        b = 2;
        break;
      case 3148:
        if (!paramString.equals(str3))
          break; 
        b = 1;
        break;
      case 3121:
        if (!paramString.equals("ar"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      case 25:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(Locale.TRADITIONAL_CHINESE);
          break;
        } 
        configuration1.locale = Locale.TRADITIONAL_CHINESE;
        break;
      case 24:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.UK);
          break;
        } 
        configuration2.locale = Locale.UK;
        break;
      case 23:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.CANADA);
          break;
        } 
        configuration2.locale = Locale.CANADA;
        break;
      case 22:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.SIMPLIFIED_CHINESE);
          break;
        } 
        configuration2.locale = Locale.SIMPLIFIED_CHINESE;
        break;
      case 21:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("vi", "VI"));
          break;
        } 
        configuration2.locale = new Locale("vi", "VI");
        break;
      case 20:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("ur"));
          break;
        } 
        configuration2.locale = new Locale("ur");
        break;
      case 19:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("tr", "TR"));
          break;
        } 
        configuration2.locale = new Locale("tr", "TR");
        break;
      case 18:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("th", "TH"));
          break;
        } 
        configuration2.locale = new Locale("th", "TH");
        break;
      case 17:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("te"));
          break;
        } 
        configuration2.locale = new Locale("te");
        break;
      case 16:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("ru", "RU"));
          break;
        } 
        configuration2.locale = new Locale("ru", "RU");
        break;
      case 15:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("pt", "PT"));
          break;
        } 
        configuration2.locale = new Locale("pt", "PT");
        break;
      case 14:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("ms", "MY"));
          break;
        } 
        configuration2.locale = new Locale("ms", "MY");
        break;
      case 13:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.KOREA);
          break;
        } 
        configuration2.locale = Locale.KOREA;
        break;
      case 12:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("kk", "KK"));
          break;
        } 
        configuration2.locale = new Locale("kk", "KK");
        break;
      case 11:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("iw", "IL"));
          break;
        } 
        configuration2.locale = new Locale("iw", "IL");
        break;
      case 10:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("it"));
          break;
        } 
        configuration2.locale = new Locale("it");
        break;
      case 9:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("in", "ID"));
          break;
        } 
        configuration2.locale = new Locale("in", "ID");
        break;
      case 8:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("hi", "IN"));
          break;
        } 
        configuration2.locale = new Locale("hi", "IN");
        break;
      case 7:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.FRANCE);
          break;
        } 
        configuration2.locale = Locale.FRANCE;
        break;
      case 6:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("fa", "IR"));
          break;
        } 
        configuration2.locale = new Locale("fa", "IR");
        break;
      case 5:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("es", "ES"));
          break;
        } 
        configuration2.locale = new Locale("es", "ES");
        break;
      case 4:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.US);
          break;
        } 
        configuration2.locale = Locale.US;
        break;
      case 3:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("el"));
          break;
        } 
        configuration2.locale = new Locale("el");
        break;
      case 2:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(Locale.GERMANY);
          break;
        } 
        configuration2.locale = Locale.GERMANY;
        break;
      case 1:
        configuration2 = configuration1;
        if (Build.VERSION.SDK_INT >= 17) {
          configuration2.setLocale(new Locale("bn", "BD"));
          break;
        } 
        configuration2.locale = new Locale("bn", "BD");
        break;
      case 0:
        if (Build.VERSION.SDK_INT >= 17) {
          configuration1.setLocale(new Locale("ar", "IQ"));
          break;
        } 
        configuration1.locale = new Locale("ar", "IQ");
        break;
    } 
    resources.updateConfiguration(configuration1, displayMetrics);
  }
  
  public static String I(Context paramContext) {
    int i = androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG");
    String str1 = "";
    String str2 = str1;
    if (i == 0) {
      ArrayList<String> arrayList = new ArrayList();
      ContentResolver contentResolver = paramContext.getContentResolver();
      Uri uri = CallLog.Calls.CONTENT_URI;
      boolean bool = false;
      Cursor cursor = contentResolver.query(uri, new String[] { "type", "number" }, " type=? and new=?", new String[] { "3", "1" }, "date desc");
      str2 = str1;
      i = bool;
      if (cursor != null) {
        cursor.moveToFirst();
        for (i = 0; i < cursor.getCount(); i++) {
          cursor.moveToPosition(i);
          str2 = cursor.getString(cursor.getColumnIndex("number"));
          if (!arrayList.contains(str2))
            arrayList.add(str2); 
        } 
        cursor.close();
        i = bool;
        str2 = str1;
      } 
      while (i < arrayList.size()) {
        if (x(paramContext, arrayList.get(i)) != 0 && x(paramContext, (String)arrayList.get(i)) > 1) {
          if (i == arrayList.size() - 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(arrayList.get(i));
            stringBuilder.append("(");
            stringBuilder.append(x(paramContext, arrayList.get(i)));
            stringBuilder.append(")");
            str2 = stringBuilder.toString();
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(arrayList.get(i));
            stringBuilder.append("(");
            stringBuilder.append(x(paramContext, arrayList.get(i)));
            stringBuilder.append("), ");
            str2 = stringBuilder.toString();
          } 
        } else if (i == arrayList.size() - 1) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str2);
          stringBuilder.append(arrayList.get(i));
          str2 = stringBuilder.toString();
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str2);
          stringBuilder.append(arrayList.get(i));
          stringBuilder.append(",");
          str2 = stringBuilder.toString();
        } 
        i++;
      } 
      if (arrayList.size() <= 1) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(y0(paramContext));
        stringBuilder.append(" ");
        stringBuilder.append(paramContext.getResources().getString(2131755470));
        stringBuilder.append(" ");
        stringBuilder.append(str2);
        str2 = stringBuilder.toString();
      } 
    } 
    return str2;
  }
  
  public static void I0(Context paramContext) {
    if (c) {
      c = false;
      (new Handler()).postDelayed(new a(paramContext), 500L);
      (new Handler()).postDelayed(new b(), 3000L);
    } 
  }
  
  public static String J(Context paramContext, String paramString) {
    String str1 = "";
    String str2 = str1;
    if (paramString != null) {
      str2 = str1;
      if (!"".equals(paramString)) {
        byte b = -1;
        switch (paramString.hashCode()) {
          case -652010176:
            if (!paramString.equals("Fixed line"))
              break; 
            b = 2;
            break;
          case -869651023:
            if (!paramString.equals("Fixed line ／Mobile"))
              break; 
            b = 1;
            break;
          case -1984987966:
            if (!paramString.equals("Mobile"))
              break; 
            b = 0;
            break;
        } 
        switch (b) {
          default:
            return str1;
          case 2:
            return paramContext.getResources().getString(2131755366);
          case 1:
            return paramContext.getResources().getString(2131755474);
          case 0:
            break;
        } 
        str2 = paramContext.getResources().getString(2131755473);
      } 
    } 
    return str2;
  }
  
  public static void J0(Context paramContext, String paramString1, String paramString2) {
    try {
      if (TextUtils.isEmpty(paramString1))
        return; 
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("market://details?id=");
      stringBuilder.append(paramString1);
      stringBuilder.append("&referrer=");
      stringBuilder.append(paramString2);
      Uri uri = Uri.parse(stringBuilder.toString());
      Intent intent = new Intent();
      this("android.intent.action.VIEW", uri);
      intent.setPackage("com.android.vending");
      intent.addFlags(268435456);
      paramContext.startActivity(intent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static String K(Context paramContext) {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkCountryIso().toUpperCase();
  }
  
  public static String L(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder2 = new StringBuilder();
    if (paramString1 != null && !"".equals(paramString1)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramString1);
      stringBuilder.append("\n");
      stringBuilder2.append(stringBuilder.toString());
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(EZCallApplication.c().getResources().getString(2131755775));
    stringBuilder1.append(":");
    stringBuilder1.append(paramString2);
    stringBuilder1.append("\n");
    stringBuilder2.append(stringBuilder1.toString());
    if (paramString3 != null && !"".equals(paramString3)) {
      stringBuilder1 = new StringBuilder();
      stringBuilder1.append(paramString3);
      stringBuilder1.append("\n");
      stringBuilder2.append(stringBuilder1.toString());
    } 
    stringBuilder2.append(EZCallApplication.c().getResources().getString(2131755565));
    return stringBuilder2.toString();
  }
  
  public static String M(Context paramContext) {
    return paramContext.getPackageName();
  }
  
  public static String N() {
    return Build.MODEL;
  }
  
  public static String O() {
    return Build.MANUFACTURER;
  }
  
  public static String P() {
    int[] arrayOfInt = new int[101];
    for (byte b = 0; b < 101; b++)
      arrayOfInt[b] = b + 100; 
    return String.valueOf(arrayOfInt[(new Random()).nextInt(100)]);
  }
  
  public static String Q(Context paramContext, String paramString) {
    if (paramString != null) {
      String str1;
      String str2 = String.valueOf(System.currentTimeMillis() / 1000L - b1.b0());
    } 
    String str = "";
  }
  
  public static String R() {
    return Build.VERSION.RELEASE;
  }
  
  public static boolean S(String paramString) {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramString != null) {
      bool2 = bool1;
      try {
        if (!"".equals(paramString)) {
          int i = Integer.parseInt(W((Context)EZCallApplication.c()).replaceAll("\\.", ""));
          int j = Integer.parseInt(paramString.replaceAll("\\.", ""));
          bool2 = bool1;
          if (i < j)
            bool2 = true; 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        bool2 = bool1;
      } 
    } 
    return bool2;
  }
  
  public static String T(Context paramContext) {
    String str2;
    String str1 = "";
    try {
      String str;
      int i = Build.VERSION.SDK_INT;
      if (i >= 29) {
        String str3 = U();
        String str4 = z(paramContext);
        StringBuilder stringBuilder2 = new StringBuilder();
        this();
        stringBuilder2.append("");
        stringBuilder2.append(Settings.Secure.getString(paramContext.getContentResolver(), "android_id"));
        str = stringBuilder2.toString();
        if (!"".equals(str4)) {
          str = str4;
        } else if ("".equals(str)) {
          str = b1.o();
          if ("".equals(str)) {
            str = UUID.randomUUID().toString();
            b1.S0(str);
          } 
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(str3);
        stringBuilder1.append(str);
        str2 = e0.b(stringBuilder1.toString());
      } else {
        str2 = str1;
        if (a.b((Context)str, "android.permission.READ_PHONE_STATE")) {
          String str3;
          TelephonyManager telephonyManager = (TelephonyManager)str.getSystemService("phone");
          String str5 = null;
          if (telephonyManager != null) {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("");
            stringBuilder1.append(telephonyManager.getDeviceId());
            str5 = stringBuilder1.toString();
            stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("");
            stringBuilder1.append(telephonyManager.getSimSerialNumber());
            str3 = stringBuilder1.toString();
          } else {
            str3 = null;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("");
          stringBuilder.append(Settings.Secure.getString(str.getContentResolver(), "android_id"));
          str = stringBuilder.toString();
          String str4 = str1;
          if (str5 != null) {
            UUID uUID = new UUID();
            long l1 = str.hashCode();
            long l2 = str5.hashCode();
            this(l1, str3.hashCode() | l2 << 32L);
            String str6 = e0.b(uUID.toString());
          } 
        } 
      } 
    } catch (Exception exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("tony", stringBuilder.toString());
      } 
      exception.printStackTrace();
      str2 = str1;
    } 
    return str2;
  }
  
  private static String U() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("35");
    stringBuilder.append(Build.BOARD.length() % 10);
    stringBuilder.append(Build.BRAND.length() % 10);
    stringBuilder.append(Build.CPU_ABI.length() % 10);
    stringBuilder.append(Build.DEVICE.length() % 10);
    stringBuilder.append(Build.DISPLAY.length() % 10);
    stringBuilder.append(Build.HOST.length() % 10);
    stringBuilder.append(Build.ID.length() % 10);
    stringBuilder.append(Build.MANUFACTURER.length() % 10);
    stringBuilder.append(Build.MODEL.length() % 10);
    stringBuilder.append(Build.PRODUCT.length() % 10);
    stringBuilder.append(Build.TAGS.length() % 10);
    stringBuilder.append(Build.TYPE.length() % 10);
    stringBuilder.append(Build.USER.length() % 10);
    return stringBuilder.toString();
  }
  
  public static String V() {
    String str1 = N();
    String str2 = O();
    String str3 = R();
    String str4 = W((Context)EZCallApplication.c());
    String str5 = p.d((Context)EZCallApplication.c()).getCountry_code();
    String str6 = (EZCallApplication.c()).f;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(" \n \n \n \n \n \n \n---------------------------------------------\nmanufactrer:");
    stringBuilder.append(str2);
    stringBuilder.append("\n");
    stringBuilder.append("device:");
    stringBuilder.append(str1);
    stringBuilder.append("\n");
    stringBuilder.append("systemVersion:");
    stringBuilder.append(str3);
    stringBuilder.append("\n");
    stringBuilder.append("appVersion:");
    stringBuilder.append(str4);
    stringBuilder.append("\n");
    stringBuilder.append("cc:");
    stringBuilder.append(str5);
    stringBuilder.append("\n");
    stringBuilder.append("language:");
    stringBuilder.append(str6);
    return stringBuilder.toString();
  }
  
  public static String W(Context paramContext) {
    String str = paramContext.getPackageName();
    try {
      String str1 = (paramContext.getPackageManager().getPackageInfo(str, 0)).versionName;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      nameNotFoundException.printStackTrace();
      nameNotFoundException = null;
    } 
    return (String)nameNotFoundException;
  }
  
  public static long X(long paramLong) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date(paramLong));
    calendar.setTimeZone(TimeZone.getTimeZone("GMT-8:00"));
    int i = calendar.get(11);
    int j = calendar.get(12);
    int k = calendar.get(13);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("time:");
      stringBuilder.append(paramLong);
      d0.a("alive", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("HOUR:");
      stringBuilder.append(i);
      d0.a("alive", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("MINUTE:");
      stringBuilder.append(j);
      d0.a("alive", stringBuilder.toString());
      stringBuilder = new StringBuilder();
      stringBuilder.append("SECOND:");
      stringBuilder.append(k);
      d0.a("alive", stringBuilder.toString());
    } 
    paramLong = ((23 - i) * 60 * 60 * 1000) + ((59 - j) * 60 * 1000) + ((59 - k) * 1000) - 60000L;
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("delay_time:");
      stringBuilder.append(paramLong);
      d0.a("alive", stringBuilder.toString());
    } 
    return paramLong;
  }
  
  public static boolean Y(Context paramContext, String paramString) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{com/allinone/callerid/util/i1}} */
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool1;
    try {
      if (androidx.core.content.a.a(paramContext, "android.permission.READ_CONTACTS") == 0) {
        Cursor cursor;
        bool4 = bool1;
        ContentResolver contentResolver = paramContext.getContentResolver();
        bool4 = bool1;
        String[] arrayOfString = new String[2];
        arrayOfString[0] = "_id";
        arrayOfString[1] = "display_name";
        paramContext = null;
        try {
          Cursor cursor1 = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(paramString)), arrayOfString, null, null, null);
          cursor = cursor1;
        } catch (Exception exception) {
          bool4 = bool1;
          exception.printStackTrace();
          try {
            Cursor cursor1 = contentResolver.query(Uri.withAppendedPath(Contacts.Phones.CONTENT_FILTER_URL, Uri.encode(paramString)), arrayOfString, null, null, null);
            cursor = cursor1;
          } catch (Exception exception1) {
            bool4 = bool1;
            exception1.printStackTrace();
          } 
        } 
        boolean bool = bool3;
        if (cursor != null) {
          bool = bool3;
          bool4 = bool1;
          if (cursor.getCount() > 0) {
            bool = bool3;
            bool4 = bool1;
            if (cursor.moveToFirst())
              bool = true; 
          } 
        } 
        bool2 = bool;
        if (cursor != null) {
          bool4 = bool;
          cursor.close();
          bool2 = bool;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool4;
    } finally {}
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{com/allinone/callerid/util/i1}} */
    return bool2;
  }
  
  public static int Z(Context paramContext, String paramString) {
    Cursor cursor1;
    byte b2;
    byte b1 = 0;
    Cursor cursor2 = null;
    Cursor cursor3 = cursor2;
    try {
      StringBuilder stringBuilder = new StringBuilder();
      cursor3 = cursor2;
      this();
      cursor3 = cursor2;
      stringBuilder.append("content://com.android.contacts/data/phones/filter/");
      cursor3 = cursor2;
      stringBuilder.append(paramString);
      cursor3 = cursor2;
      Uri uri = Uri.parse(stringBuilder.toString());
      cursor3 = cursor2;
      Cursor cursor = paramContext.getContentResolver().query(uri, new String[] { "contact_id" }, null, null, null);
      b2 = b1;
      cursor1 = cursor;
      if (cursor != null) {
        cursor3 = cursor;
        b2 = b1;
        cursor1 = cursor;
        if (cursor.getCount() > 0) {
          cursor3 = cursor;
          cursor.moveToFirst();
          cursor3 = cursor;
          b2 = cursor.getInt(0);
          cursor1 = cursor;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      cursor1 = cursor3;
      b2 = b1;
    } 
    if (cursor1 != null)
      cursor1.close(); 
    return b2;
  }
  
  public static boolean a(Context paramContext) {
    boolean bool = false;
    try {
      NetworkInfo networkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      boolean bool1 = bool;
      if (networkInfo != null) {
        boolean bool2 = networkInfo.isAvailable();
        bool1 = bool;
        if (bool2)
          bool1 = true; 
      } 
      return bool1;
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
  
  public static boolean a0() {
    boolean bool2;
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    if (i >= 23 && !Settings.canDrawOverlays((Context)EZCallApplication.c())) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (v((Context)EZCallApplication.c()))
      bool2 = true; 
    if (b1.n2().booleanValue() && i())
      bool2 = bool1; 
    return bool2;
  }
  
  public static String b(String paramString) {
    paramString = Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]").matcher(paramString).replaceAll("").trim();
    return Pattern.compile("[0-9]").matcher(paramString).replaceAll("");
  }
  
  public static boolean b0() {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool1;
    try {
      if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CONTACTS") == 0) {
        bool4 = bool1;
        Cursor cursor = EZCallApplication.c().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, "starred = 1 ", null, null);
        bool2 = bool3;
        bool4 = bool1;
        if (cursor.getCount() > 0)
          bool2 = true; 
        bool4 = bool2;
        cursor.close();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool4;
    } 
    return bool2;
  }
  
  public static boolean c0(Context paramContext) {
    boolean bool = true;
    try {
      int i = ((TelephonyManager)paramContext.getSystemService("phone")).getSimState();
      if (i == 0 || i == 1)
        bool = false; 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return bool;
  }
  
  public static void d0(Context paramContext, String paramString) {
    w.writeDf(paramContext, paramString);
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("read:");
      stringBuilder.append(w.readDf(paramContext));
      d0.a("servertime", stringBuilder.toString());
    } 
  }
  
  public static boolean e(Context paramContext) {
    return false;
  }
  
  public static boolean e0(Context paramContext) {
    boolean bool = false;
    try {
      int i = (paramContext.getApplicationInfo()).flags;
      if ((i & 0x2) != 0)
        bool = true; 
      return bool;
    } catch (Exception exception) {
      exception.printStackTrace();
      return false;
    } 
  }
  
  public static String f(String paramString) {
    if (paramString == null)
      paramString = ""; 
    return paramString;
  }
  
  public static Boolean f0(Context paramContext) {
    String str = (EZCallApplication.c()).f;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (str != null) {
      bool2 = bool1;
      if (!"".equals(str)) {
        byte b = -1;
        switch (str.hashCode()) {
          case 3741:
            if (!str.equals("ur"))
              break; 
            b = 3;
            break;
          case 3374:
            if (!str.equals("iw"))
              break; 
            b = 2;
            break;
          case 3259:
            if (!str.equals("fa"))
              break; 
            b = 1;
            break;
          case 3121:
            if (!str.equals("ar"))
              break; 
            b = 0;
            break;
        } 
        switch (b) {
          default:
            bool2 = bool1;
            return Boolean.valueOf(bool2);
          case 0:
          case 1:
          case 2:
          case 3:
            break;
        } 
        bool2 = true;
      } 
    } 
    return Boolean.valueOf(bool2);
  }
  
  public static String g(Context paramContext, String paramString1, String paramString2) {
    String str1 = "";
    String str2 = str1;
    if (paramString1 != null) {
      str2 = str1;
      if (!"".equals(paramString1))
        if (paramString1.startsWith("+")) {
          str2 = paramString1.substring(1, paramString1.length());
        } else if (paramString1.startsWith("00")) {
          str2 = paramString1.substring(2, paramString1.length());
        } else {
          String str = p.c(paramContext, paramString2);
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TC:");
            stringBuilder.append(str);
            d0.a("searchofflinedata", stringBuilder.toString());
          } 
          if (str != null && !"".equals(str)) {
            StringBuilder stringBuilder;
            if (paramString1.startsWith(paramString2)) {
              paramString1 = paramString1.substring(paramString2.length(), paramString1.length());
              if (paramString1.startsWith(str)) {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(paramString2);
                stringBuilder1.append(paramString1.substring(str.length(), paramString1.length()));
                String str3 = stringBuilder1.toString();
              } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(paramString2);
                stringBuilder.append(paramString1);
                str2 = stringBuilder.toString();
              } 
            } else if (paramString1.startsWith((String)stringBuilder)) {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append(paramString2);
              stringBuilder1.append(paramString1.substring(stringBuilder.length(), paramString1.length()));
              String str3 = stringBuilder1.toString();
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append(paramString2);
              stringBuilder.append(paramString1);
              str2 = stringBuilder.toString();
            } 
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(paramString2);
            stringBuilder.append(paramString1);
            str2 = stringBuilder.toString();
          } 
        }  
    } 
    return str2;
  }
  
  public static boolean g0(Context paramContext) {
    boolean bool = true;
    try {
      TelephonyManager telephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      Method method = TelephonyManager.class.getDeclaredMethod("getITelephony", null);
      method.setAccessible(true);
      ((ITelephony)method.invoke(telephonyManager, null)).endCall();
    } catch (Exception exception) {
      exception.printStackTrace();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getLocalizedMessage());
        d0.a("tony", stringBuilder.toString());
      } 
      bool = false;
    } 
    return bool;
  }
  
  public static void h(Context paramContext) {
    if (h0(paramContext)) {
      d.b(paramContext);
      q.b().c("checkPermission_show");
      b1.W1(System.currentTimeMillis() + 86400000L);
    } 
  }
  
  private static boolean h0(Context paramContext) {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(paramContext) && System.currentTimeMillis() - b1.q0() > 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean i() {
    boolean bool = h0.a().equalsIgnoreCase("Xiaomi");
    boolean bool1 = true;
    if (!bool && (!h0.a().equalsIgnoreCase("samsung") || !p0((Context)EZCallApplication.c())) && (Build.VERSION.SDK_INT >= 26 || !"HUAWEI".equalsIgnoreCase(h0.a())))
      bool1 = false; 
    return bool1;
  }
  
  public static boolean i0(Context paramContext) {
    boolean bool;
    if (((paramContext.getResources().getConfiguration()).uiMode & 0x20) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean j() {
    boolean bool = h0.a().equalsIgnoreCase("Xiaomi");
    boolean bool1 = true;
    if (!bool && (Build.VERSION.SDK_INT >= 26 || !"HUAWEI".equalsIgnoreCase(h0.a())))
      bool1 = false; 
    return bool1;
  }
  
  public static boolean j0(Context paramContext) {
    try {
      PackageInfo packageInfo = paramContext.getPackageManager().getPackageInfo("com.android.vending", 0);
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    return !(exception == null);
  }
  
  public static boolean k(String paramString) {
    boolean bool2;
    boolean bool1 = false;
    try {
      NumberContent numberContent = e.d().e(paramString);
      bool2 = bool1;
      if (numberContent != null) {
        long l1 = System.currentTimeMillis();
        long l2 = numberContent.getSubtype_mark_time();
        bool2 = bool1;
        if (l1 < l2)
          bool2 = true; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool1;
    } 
    return bool2;
  }
  
  public static boolean k0() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("data/data/");
    stringBuilder.append(M((Context)EZCallApplication.c()));
    stringBuilder.append("/databases/offlinedata.sqlite");
    return (new File(stringBuilder.toString())).exists();
  }
  
  public static void l(File paramFile) {
    try {
      if (paramFile.isDirectory()) {
        File[] arrayOfFile = paramFile.listFiles();
        int i = arrayOfFile.length;
        for (byte b = 0; b < i; b++)
          l(arrayOfFile[b]); 
        paramFile.delete();
      } else if (paramFile.exists()) {
        paramFile.delete();
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static boolean l0(String paramString) {
    return Pattern.compile("[`~@#$%^&*()+=|{}''\\[\\]<>/?~@#￥%&*（）——+|{}【】？]").matcher(paramString).find();
  }
  
  public static void m(Context paramContext) {
    // Byte code:
    //   0: ldc com/allinone/callerid/util/i1
    //   2: monitorenter
    //   3: getstatic android/os/Build$VERSION.SDK_INT : I
    //   6: bipush #28
    //   8: if_icmplt -> 40
    //   11: aload_0
    //   12: ldc_w 'telecom'
    //   15: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   18: checkcast android/telecom/TelecomManager
    //   21: astore_1
    //   22: aload_0
    //   23: ldc_w 'android.permission.ANSWER_PHONE_CALLS'
    //   26: invokestatic a : (Landroid/content/Context;Ljava/lang/String;)I
    //   29: ifne -> 178
    //   32: aload_1
    //   33: invokevirtual endCall : ()Z
    //   36: pop
    //   37: goto -> 178
    //   40: aload_0
    //   41: ldc_w 'phone'
    //   44: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   47: checkcast android/telephony/TelephonyManager
    //   50: astore_1
    //   51: ldc_w android/telephony/TelephonyManager
    //   54: ldc_w 'getITelephony'
    //   57: aconst_null
    //   58: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   61: astore_2
    //   62: aload_2
    //   63: iconst_1
    //   64: invokevirtual setAccessible : (Z)V
    //   67: aload_2
    //   68: aload_1
    //   69: aconst_null
    //   70: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   73: checkcast com/android/internal/telephony/ITelephony
    //   76: invokeinterface endCall : ()Z
    //   81: pop
    //   82: goto -> 178
    //   85: astore_1
    //   86: aload_1
    //   87: invokevirtual printStackTrace : ()V
    //   90: getstatic com/allinone/callerid/util/d0.a : Z
    //   93: ifeq -> 130
    //   96: new java/lang/StringBuilder
    //   99: astore_2
    //   100: aload_2
    //   101: invokespecial <init> : ()V
    //   104: aload_2
    //   105: ldc_w 'Exception:'
    //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   111: pop
    //   112: aload_2
    //   113: aload_1
    //   114: invokevirtual getLocalizedMessage : ()Ljava/lang/String;
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: ldc 'tony'
    //   123: aload_2
    //   124: invokevirtual toString : ()Ljava/lang/String;
    //   127: invokestatic a : (Ljava/lang/String;Ljava/lang/String;)V
    //   130: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   133: ldc_w 'old_end_call_failed'
    //   136: invokevirtual e : (Ljava/lang/String;)V
    //   139: getstatic android/os/Build$VERSION.SDK_INT : I
    //   142: bipush #21
    //   144: if_icmplt -> 161
    //   147: aload_0
    //   148: invokestatic d : (Landroid/content/Context;)Z
    //   151: ifeq -> 161
    //   154: iconst_1
    //   155: putstatic com/allinone/callerid/service/NLService.b : Z
    //   158: goto -> 178
    //   161: invokestatic b : ()Lcom/allinone/callerid/util/q;
    //   164: ldc_w 'old_end_call_failed_no_per'
    //   167: invokevirtual e : (Ljava/lang/String;)V
    //   170: goto -> 178
    //   173: astore_0
    //   174: aload_0
    //   175: invokevirtual printStackTrace : ()V
    //   178: ldc com/allinone/callerid/util/i1
    //   180: monitorexit
    //   181: return
    //   182: astore_0
    //   183: ldc com/allinone/callerid/util/i1
    //   185: monitorexit
    //   186: aload_0
    //   187: athrow
    // Exception table:
    //   from	to	target	type
    //   3	37	182	finally
    //   40	82	85	java/lang/Exception
    //   40	82	182	finally
    //   86	130	182	finally
    //   130	158	173	java/lang/Exception
    //   130	158	182	finally
    //   161	170	173	java/lang/Exception
    //   161	170	182	finally
    //   174	178	182	finally
  }
  
  public static boolean m0() {
    boolean bool;
    try {
      bool = "huawei".equals(Build.MANUFACTURER.toLowerCase(Locale.ENGLISH));
    } catch (Exception exception) {
      exception.printStackTrace();
      bool = false;
    } 
    return bool;
  }
  
  public static void n(Context paramContext) {
    try {
      q.b().e("new_end_call");
      if (Build.VERSION.SDK_INT >= 21 && b.d(paramContext)) {
        MediaSessionManager mediaSessionManager = (MediaSessionManager)paramContext.getSystemService("media_session");
        if (mediaSessionManager != null) {
          ComponentName componentName = new ComponentName();
          this(paramContext, NLService.class);
          for (MediaController mediaController : mediaSessionManager.getActiveSessions(componentName)) {
            if ("com.android.server.telecom".equals(mediaController.getPackageName())) {
              if (d0.a)
                d0.a("tony", "挂断"); 
              b1.U2(Boolean.TRUE);
              b.f(79, mediaController);
              break;
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      q.b().e("new_end_call_failed");
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("tony", stringBuilder.toString());
      } 
    } 
  }
  
  public static boolean n0(Context paramContext, String paramString) {
    boolean bool2;
    boolean bool1 = false;
    try {
      String str = paramContext.getPackageManager().getInstallerPackageName(paramString);
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
    return bool2;
  }
  
  public static String o(String paramString) {
    String str = "";
    if (paramString != null)
      str = paramString.replaceAll(" ", "").replaceAll("-", "").replaceAll("\\*", "").replaceAll("#", "").replaceAll("\\(", "").replaceAll("\\)", ""); 
    return str;
  }
  
  public static boolean o0(Context paramContext, String paramString) {
    try {
      PackageInfo packageInfo = paramContext.getPackageManager().getPackageInfo(paramString, 0);
    } catch (Exception exception) {
      exception.printStackTrace();
      exception = null;
    } 
    return !(exception == null);
  }
  
  public static Animation p() {
    return AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771980);
  }
  
  public static boolean p0(Context paramContext) {
    String str1;
    boolean bool3;
    boolean bool4;
    String str2 = "";
    boolean bool1 = false;
    boolean bool2 = false;
    String str3 = str2;
    try {
      PackageInfo packageInfo = paramContext.getPackageManager().getPackageInfo("com.samsung.android.sm", 0);
      str3 = str2;
      str1 = packageInfo.versionName;
      str3 = str1;
      bool3 = packageInfo.versionCode;
      bool4 = bool2;
      if (bool3 != 0) {
        bool4 = bool2;
        if (bool3 < 1616601310)
          bool4 = true; 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool4 = false;
      bool3 = bool1;
      str1 = str3;
    } 
    if (d0.a) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SMversion:");
      stringBuilder.append(str1);
      stringBuilder.append(" versionCode:");
      stringBuilder.append(bool3);
      stringBuilder.append(" ishas:");
      stringBuilder.append(bool4);
      d0.a("selfstarting", stringBuilder.toString());
    } 
    return bool4;
  }
  
  public static Animation q() {
    return AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771999);
  }
  
  public static boolean q0() {
    boolean bool;
    if ("Lenovo".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT == 23) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static Animation r() {
    return AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771996);
  }
  
  public static boolean r0(Context paramContext) {
    NetworkInfo[] arrayOfNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getAllNetworkInfo();
    if (arrayOfNetworkInfo != null)
      for (byte b = 0; b < arrayOfNetworkInfo.length; b++) {
        if (arrayOfNetworkInfo[b].getState() == NetworkInfo.State.CONNECTED)
          return true; 
      }  
    return false;
  }
  
  public static Animation s() {
    return AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130771992);
  }
  
  public static boolean s0(Context paramContext, String paramString) {
    boolean bool2;
    boolean bool1 = false;
    try {
      ActivityManager activityManager = (ActivityManager)paramContext.getSystemService("activity");
      bool2 = bool1;
      if (activityManager != null) {
        Iterator iterator = activityManager.getRunningServices(2147483647).iterator();
        bool2 = false;
        while (iterator.hasNext()) {
          if (paramString.equals(((ActivityManager.RunningServiceInfo)iterator.next()).service.getClassName())) {
            if (d0.a)
              d0.a("wjjj", "Service status:Running"); 
            bool2 = true;
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool1;
    } catch (NoClassDefFoundError noClassDefFoundError) {}
    return bool2;
  }
  
  public static Animation t() {
    return AnimationUtils.loadAnimation((Context)EZCallApplication.c(), 2130772001);
  }
  
  public static boolean t0() {
    boolean bool;
    if (b1.r0() && System.currentTimeMillis() > b1.s0()) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static int u(String paramString) {
    MediaPlayer mediaPlayer = new MediaPlayer();
    try {
      mediaPlayer.setDataSource(paramString);
      mediaPlayer.prepare();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    int i = mediaPlayer.getDuration();
    mediaPlayer.release();
    return i;
  }
  
  public static boolean u0() {
    String str = Build.MODEL;
    return ("Lenovo K5 Note".equalsIgnoreCase(str) || "Lenovo VIBE K6 Note".equalsIgnoreCase(str) || "Lenovo VIBE K6 Power".equalsIgnoreCase(str) || "Lenovo VIBE X3 Lite".equalsIgnoreCase(str) || "Vivo 1601".equalsIgnoreCase(str));
  }
  
  public static boolean v(Context paramContext) {
    boolean bool1 = false;
    boolean bool2 = bool1;
    try {
      if (Build.VERSION.SDK_INT >= 23) {
        bool2 = ((PowerManager)paramContext.getSystemService("power")).isIgnoringBatteryOptimizations(M(paramContext));
        int i = bool2 ^ true;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      bool2 = bool1;
    } 
    return bool2;
  }
  
  public static boolean v0(String paramString) {
    return ("".equals(paramString) || "-1".equals(paramString) || "-2".equals(paramString) || "-3".equals(paramString) || "0".equals(paramString) || "1".equals(paramString) || "2".equals(paramString));
  }
  
  public static String w(Context paramContext, String paramString) {
    String str1;
    boolean bool = TextUtils.isEmpty(paramString);
    String[] arrayOfString = null;
    String str2 = null;
    if (bool)
      return null; 
    if (androidx.core.content.a.a(paramContext, "android.permission.READ_CONTACTS") == 0) {
      ContentResolver contentResolver = paramContext.getContentResolver();
      arrayOfString = new String[2];
      arrayOfString[0] = "_id";
      arrayOfString[1] = "display_name";
      try {
        Cursor cursor = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(paramString)), arrayOfString, null, null, null);
      } catch (Exception null) {
        exception.printStackTrace();
        try {
          Cursor cursor = contentResolver.query(Uri.withAppendedPath(Contacts.Phones.CONTENT_FILTER_URL, Uri.encode(paramString)), arrayOfString, null, null, null);
        } catch (Exception exception) {
          exception.printStackTrace();
          exception = null;
        } 
      } 
      paramString = str2;
      if (exception != null) {
        paramString = str2;
        if (exception.getCount() > 0) {
          paramString = str2;
          if (exception.moveToFirst())
            paramString = exception.getString(1); 
        } 
      } 
      str1 = paramString;
      if (exception != null) {
        exception.close();
        str1 = paramString;
      } 
    } 
    return str1;
  }
  
  public static boolean w0() {
    boolean bool;
    if (Build.MANUFACTURER.equalsIgnoreCase("vivo") && Build.VERSION.SDK_INT >= 28) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static int x(Context paramContext, String paramString) {
    int i = androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG");
    byte b = 0;
    int j = b;
    if (i == 0) {
      Cursor cursor = paramContext.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[] { "type" }, " type=? and new=? and number=?", new String[] { "3", "1", paramString }, "date desc");
      j = b;
      if (cursor != null) {
        j = cursor.getCount();
        cursor.close();
      } 
    } 
    return j;
  }
  
  public static void x0(Context paramContext, String paramString) {
    try {
      if (d0.a)
        d0.a("tony", "调系统Map"); 
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("geo:0,0?q=");
      stringBuilder.append(paramString);
      Uri uri = Uri.parse(stringBuilder.toString());
      Intent intent = new Intent();
      this("android.intent.action.VIEW", uri);
      intent.addFlags(268435456);
      paramContext.startActivity(intent);
    } catch (Exception exception) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("tony", stringBuilder.toString());
      } 
      try {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("http://www.google.cn/maps/place/");
        stringBuilder.append(paramString);
        Uri uri = Uri.parse(stringBuilder.toString());
        Intent intent = new Intent();
        this("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        paramContext.startActivity(intent);
      } catch (Exception exception1) {
        exception1.printStackTrace();
      } 
    } 
  }
  
  public static Locale y() {
    Locale locale1 = null;
    Locale locale2 = locale1;
    try {
      if (Build.VERSION.SDK_INT >= 24) {
        locale2 = locale1;
        locale1 = LocaleList.getDefault().get(0);
      } else {
        locale2 = locale1;
        locale1 = Locale.getDefault();
      } 
      locale2 = locale1;
      if (locale1 == null) {
        locale2 = locale1;
        Locale locale = new Locale();
        locale2 = locale1;
        this(b1.y0());
        locale2 = locale;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return locale2;
  }
  
  public static int y0(Context paramContext) {
    int i = androidx.core.content.a.a(paramContext, "android.permission.READ_CALL_LOG");
    byte b = 0;
    int j = b;
    if (i == 0) {
      Cursor cursor = paramContext.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[] { "type", "number" }, " type=? and new=?", new String[] { "3", "1" }, "date desc");
      j = b;
      if (cursor != null) {
        j = cursor.getCount();
        cursor.close();
      } 
    } 
    return j;
  }
  
  private static String z(Context paramContext) {
    String str;
    try {
      str = com.google.android.gms.ads.v.a.b(paramContext).a();
    } catch (Exception exception) {
      exception.printStackTrace();
      str = "";
    } 
    return str;
  }
  
  public static void z0(Bitmap paramBitmap, String paramString1, String paramString2) {
    if (d0.a)
      d0.a("shareimage", "保存图片"); 
    File file = new File(paramString1, paramString2);
    if (file.exists())
      file.delete(); 
    try {
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file);
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
      fileOutputStream.flush();
      fileOutputStream.close();
      if (d0.a)
        d0.a("shareimage", "已经保存"); 
    } catch (FileNotFoundException fileNotFoundException) {
      fileNotFoundException.printStackTrace();
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } 
  }
  
  static final class a implements Runnable {
    a(Context param1Context) {}
    
    public void run() {
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.RELOAD_DATA");
      b.p.a.a.b(this.b).d(intent);
    }
  }
  
  static final class b implements Runnable {
    public void run() {
      i1.c(true);
    }
  }
  
  static final class c implements Runnable {
    c(Context param1Context) {}
    
    public void run() {
      i1.d().c(this.b);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/i1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */