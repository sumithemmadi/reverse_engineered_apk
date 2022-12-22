package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class c7 {
  private final Context a;
  
  private final p12 b;
  
  private final View c;
  
  public c7(Context paramContext, p12 paramp12, View paramView) {
    this.a = paramContext;
    this.b = paramp12;
    this.c = paramView;
  }
  
  private static Intent a(Intent paramIntent, ResolveInfo paramResolveInfo) {
    paramIntent = new Intent(paramIntent);
    ActivityInfo activityInfo = paramResolveInfo.activityInfo;
    paramIntent.setClassName(activityInfo.packageName, activityInfo.name);
    return paramIntent;
  }
  
  private final ResolveInfo b(Intent paramIntent, ArrayList<ResolveInfo> paramArrayList) {
    ResolveInfo resolveInfo1;
    ResolveInfo resolveInfo2 = null;
    Intent intent = null;
    ResolveInfo resolveInfo3 = resolveInfo2;
    try {
      PackageManager packageManager = this.a.getPackageManager();
      if (packageManager == null)
        return null; 
      resolveInfo3 = resolveInfo2;
      List<ResolveInfo> list = packageManager.queryIntentActivities(paramIntent, 65536);
      resolveInfo3 = resolveInfo2;
      ResolveInfo resolveInfo = packageManager.resolveActivity(paramIntent, 65536);
      paramIntent = intent;
      if (list != null) {
        paramIntent = intent;
        if (resolveInfo != null) {
          byte b = 0;
          while (true) {
            paramIntent = intent;
            resolveInfo3 = resolveInfo2;
            if (b < list.size()) {
              resolveInfo3 = resolveInfo2;
              resolveInfo1 = list.get(b);
              resolveInfo3 = resolveInfo2;
              if (resolveInfo.activityInfo.name.equals(resolveInfo1.activityInfo.name)) {
                resolveInfo1 = resolveInfo;
                break;
              } 
              b++;
              continue;
            } 
            break;
          } 
        } 
      } 
    } finally {
      paramIntent = null;
      q.g().e((Throwable)paramIntent, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
    } 
    return resolveInfo1;
  }
  
  private final ResolveInfo c(Intent paramIntent) {
    return b(paramIntent, new ArrayList<ResolveInfo>());
  }
  
  private static Intent e(Uri paramUri) {
    if (paramUri == null)
      return null; 
    Intent intent = new Intent("android.intent.action.VIEW");
    intent.addFlags(268435456);
    intent.setData(paramUri);
    intent.setAction("android.intent.action.VIEW");
    return intent;
  }
  
  public final Intent d(Map<String, String> paramMap) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/content/Context;
    //   4: ldc 'activity'
    //   6: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   9: checkcast android/app/ActivityManager
    //   12: astore_2
    //   13: aload_1
    //   14: ldc 'u'
    //   16: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   21: checkcast java/lang/String
    //   24: astore_3
    //   25: aload_3
    //   26: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   29: istore #4
    //   31: aconst_null
    //   32: astore #5
    //   34: iload #4
    //   36: ifeq -> 41
    //   39: aconst_null
    //   40: areturn
    //   41: aload_3
    //   42: invokestatic parse : (Ljava/lang/String;)Landroid/net/Uri;
    //   45: astore_3
    //   46: aload_0
    //   47: getfield a : Landroid/content/Context;
    //   50: aload_0
    //   51: getfield b : Lcom/google/android/gms/internal/ads/p12;
    //   54: aload_3
    //   55: aload_0
    //   56: getfield c : Landroid/view/View;
    //   59: aconst_null
    //   60: invokestatic b : (Landroid/content/Context;Lcom/google/android/gms/internal/ads/p12;Landroid/net/Uri;Landroid/view/View;Landroid/app/Activity;)Landroid/net/Uri;
    //   63: invokestatic i : (Landroid/net/Uri;)Landroid/net/Uri;
    //   66: astore_3
    //   67: aload_1
    //   68: ldc 'use_first_package'
    //   70: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   75: checkcast java/lang/String
    //   78: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   81: istore #6
    //   83: aload_1
    //   84: ldc 'use_running_process'
    //   86: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   91: checkcast java/lang/String
    //   94: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   97: istore #4
    //   99: aload_1
    //   100: ldc 'use_custom_tabs'
    //   102: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   107: checkcast java/lang/String
    //   110: invokestatic parseBoolean : (Ljava/lang/String;)Z
    //   113: ifne -> 145
    //   116: getstatic com/google/android/gms/internal/ads/m0.g3 : Lcom/google/android/gms/internal/ads/x;
    //   119: astore_1
    //   120: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   123: aload_1
    //   124: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   127: checkcast java/lang/Boolean
    //   130: invokevirtual booleanValue : ()Z
    //   133: ifeq -> 139
    //   136: goto -> 145
    //   139: iconst_0
    //   140: istore #7
    //   142: goto -> 148
    //   145: iconst_1
    //   146: istore #7
    //   148: ldc 'http'
    //   150: aload_3
    //   151: invokevirtual getScheme : ()Ljava/lang/String;
    //   154: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   157: ifeq -> 176
    //   160: aload_3
    //   161: invokevirtual buildUpon : ()Landroid/net/Uri$Builder;
    //   164: ldc 'https'
    //   166: invokevirtual scheme : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   169: invokevirtual build : ()Landroid/net/Uri;
    //   172: astore_1
    //   173: goto -> 204
    //   176: aload #5
    //   178: astore_1
    //   179: ldc 'https'
    //   181: aload_3
    //   182: invokevirtual getScheme : ()Ljava/lang/String;
    //   185: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   188: ifeq -> 204
    //   191: aload_3
    //   192: invokevirtual buildUpon : ()Landroid/net/Uri$Builder;
    //   195: ldc 'http'
    //   197: invokevirtual scheme : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   200: invokevirtual build : ()Landroid/net/Uri;
    //   203: astore_1
    //   204: new java/util/ArrayList
    //   207: dup
    //   208: invokespecial <init> : ()V
    //   211: astore #5
    //   213: aload_3
    //   214: invokestatic e : (Landroid/net/Uri;)Landroid/content/Intent;
    //   217: astore_3
    //   218: aload_1
    //   219: invokestatic e : (Landroid/net/Uri;)Landroid/content/Intent;
    //   222: astore_1
    //   223: iload #7
    //   225: ifeq -> 252
    //   228: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   231: pop
    //   232: aload_0
    //   233: getfield a : Landroid/content/Context;
    //   236: aload_3
    //   237: invokestatic L : (Landroid/content/Context;Landroid/content/Intent;)V
    //   240: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   243: pop
    //   244: aload_0
    //   245: getfield a : Landroid/content/Context;
    //   248: aload_1
    //   249: invokestatic L : (Landroid/content/Context;Landroid/content/Intent;)V
    //   252: aload_0
    //   253: aload_3
    //   254: aload #5
    //   256: invokespecial b : (Landroid/content/Intent;Ljava/util/ArrayList;)Landroid/content/pm/ResolveInfo;
    //   259: astore #8
    //   261: aload #8
    //   263: ifnull -> 273
    //   266: aload_3
    //   267: aload #8
    //   269: invokestatic a : (Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)Landroid/content/Intent;
    //   272: areturn
    //   273: aload_1
    //   274: ifnull -> 303
    //   277: aload_0
    //   278: aload_1
    //   279: invokespecial c : (Landroid/content/Intent;)Landroid/content/pm/ResolveInfo;
    //   282: astore_1
    //   283: aload_1
    //   284: ifnull -> 303
    //   287: aload_3
    //   288: aload_1
    //   289: invokestatic a : (Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)Landroid/content/Intent;
    //   292: astore_1
    //   293: aload_0
    //   294: aload_1
    //   295: invokespecial c : (Landroid/content/Intent;)Landroid/content/pm/ResolveInfo;
    //   298: ifnull -> 303
    //   301: aload_1
    //   302: areturn
    //   303: aload #5
    //   305: invokevirtual size : ()I
    //   308: ifne -> 313
    //   311: aload_3
    //   312: areturn
    //   313: iload #4
    //   315: ifeq -> 421
    //   318: aload_2
    //   319: ifnull -> 421
    //   322: aload_2
    //   323: invokevirtual getRunningAppProcesses : ()Ljava/util/List;
    //   326: astore_1
    //   327: aload_1
    //   328: ifnull -> 421
    //   331: aload #5
    //   333: invokevirtual size : ()I
    //   336: istore #9
    //   338: iconst_0
    //   339: istore #7
    //   341: iload #7
    //   343: iload #9
    //   345: if_icmpge -> 421
    //   348: aload #5
    //   350: iload #7
    //   352: invokevirtual get : (I)Ljava/lang/Object;
    //   355: astore_2
    //   356: iload #7
    //   358: iconst_1
    //   359: iadd
    //   360: istore #10
    //   362: aload_2
    //   363: checkcast android/content/pm/ResolveInfo
    //   366: astore_2
    //   367: aload_1
    //   368: invokeinterface iterator : ()Ljava/util/Iterator;
    //   373: astore #8
    //   375: iload #10
    //   377: istore #7
    //   379: aload #8
    //   381: invokeinterface hasNext : ()Z
    //   386: ifeq -> 341
    //   389: aload #8
    //   391: invokeinterface next : ()Ljava/lang/Object;
    //   396: checkcast android/app/ActivityManager$RunningAppProcessInfo
    //   399: getfield processName : Ljava/lang/String;
    //   402: aload_2
    //   403: getfield activityInfo : Landroid/content/pm/ActivityInfo;
    //   406: getfield packageName : Ljava/lang/String;
    //   409: invokevirtual equals : (Ljava/lang/Object;)Z
    //   412: ifeq -> 375
    //   415: aload_3
    //   416: aload_2
    //   417: invokestatic a : (Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)Landroid/content/Intent;
    //   420: areturn
    //   421: iload #6
    //   423: ifeq -> 440
    //   426: aload_3
    //   427: aload #5
    //   429: iconst_0
    //   430: invokevirtual get : (I)Ljava/lang/Object;
    //   433: checkcast android/content/pm/ResolveInfo
    //   436: invokestatic a : (Landroid/content/Intent;Landroid/content/pm/ResolveInfo;)Landroid/content/Intent;
    //   439: areturn
    //   440: aload_3
    //   441: areturn
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/c7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */