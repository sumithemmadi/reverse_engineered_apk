package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.o;
import java.util.Locale;

public final class xg {
  private int A;
  
  private String B;
  
  private boolean C;
  
  private int a;
  
  private boolean b;
  
  private boolean c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private String g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private boolean k;
  
  private int l;
  
  private double m;
  
  private boolean n;
  
  private String o;
  
  private String p;
  
  private boolean q;
  
  private boolean r;
  
  private String s;
  
  private boolean t;
  
  private final boolean u;
  
  private boolean v;
  
  private String w;
  
  private String x;
  
  private float y;
  
  private int z;
  
  public xg(Context paramContext) {
    boolean bool2;
    PackageManager packageManager = paramContext.getPackageManager();
    c(paramContext);
    d(paramContext);
    e(paramContext);
    Locale locale = Locale.getDefault();
    ResolveInfo resolveInfo = a(packageManager, "geo:0,0?q=donuts");
    boolean bool1 = true;
    if (resolveInfo != null) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    this.q = bool2;
    if (a(packageManager, "http://www.google.com") != null) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    this.r = bool2;
    this.s = locale.getCountry();
    er2.a();
    this.t = sl.v();
    this.u = i.a(paramContext);
    this.v = i.b(paramContext);
    this.w = locale.getLanguage();
    this.x = b(paramContext, packageManager);
    this.B = f(paramContext);
    Resources resources = paramContext.getResources();
    if (resources == null)
      return; 
    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
    if (displayMetrics == null)
      return; 
    this.y = displayMetrics.density;
    this.z = displayMetrics.widthPixels;
    this.A = displayMetrics.heightPixels;
  }
  
  public xg(Context paramContext, yg paramyg) {
    boolean bool;
    c(paramContext);
    d(paramContext);
    e(paramContext);
    this.o = Build.FINGERPRINT;
    this.p = Build.DEVICE;
    if (o.b() && m1.f(paramContext)) {
      bool = true;
    } else {
      bool = false;
    } 
    this.C = bool;
    this.q = paramyg.b;
    this.r = paramyg.c;
    this.s = paramyg.e;
    this.t = paramyg.f;
    this.u = paramyg.g;
    this.v = paramyg.h;
    this.w = paramyg.k;
    this.x = paramyg.l;
    this.B = paramyg.m;
    this.y = paramyg.t;
    this.z = paramyg.u;
    this.A = paramyg.v;
  }
  
  private static ResolveInfo a(PackageManager paramPackageManager, String paramString) {
    try {
      Intent intent;
      return paramPackageManager.resolveActivity(intent, 65536);
    } finally {
      paramPackageManager = null;
      q.g().e((Throwable)paramPackageManager, "DeviceInfo.getResolveInfo");
    } 
  }
  
  private static String b(Context paramContext, PackageManager paramPackageManager) {
    ResolveInfo resolveInfo = a(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (resolveInfo == null)
      return null; 
    ActivityInfo activityInfo = resolveInfo.activityInfo;
    if (activityInfo == null)
      return null; 
    try {
      PackageInfo packageInfo = c.a(paramContext).e(activityInfo.packageName, 0);
      if (packageInfo != null) {
        int i = packageInfo.versionCode;
        null = activityInfo.packageName;
        int j = String.valueOf(null).length();
        StringBuilder stringBuilder = new StringBuilder();
        this(j + 12);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(null);
        return stringBuilder.toString();
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return null;
  }
  
  private final void c(Context paramContext) {
    AudioManager audioManager = (AudioManager)paramContext.getSystemService("audio");
    if (audioManager != null)
      try {
        this.a = audioManager.getMode();
        this.b = audioManager.isMusicActive();
        this.c = audioManager.isSpeakerphoneOn();
        this.d = audioManager.getStreamVolume(3);
        this.e = audioManager.getRingerMode();
        return;
      } finally {
        audioManager = null;
      }  
    this.a = -2;
    this.b = false;
    this.c = false;
    this.d = 0;
    this.e = 2;
    this.f = 0;
  }
  
  @TargetApi(16)
  private final void d(Context paramContext) {
    // Byte code:
    //   0: aload_1
    //   1: ldc_w 'phone'
    //   4: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   7: checkcast android/telephony/TelephonyManager
    //   10: astore_2
    //   11: aload_1
    //   12: ldc_w 'connectivity'
    //   15: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   18: checkcast android/net/ConnectivityManager
    //   21: astore_3
    //   22: aload_0
    //   23: aload_2
    //   24: invokevirtual getNetworkOperator : ()Ljava/lang/String;
    //   27: putfield g : Ljava/lang/String;
    //   30: invokestatic n : ()Z
    //   33: ifeq -> 64
    //   36: getstatic com/google/android/gms/internal/ads/m0.X5 : Lcom/google/android/gms/internal/ads/x;
    //   39: astore #4
    //   41: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   44: aload #4
    //   46: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   49: checkcast java/lang/Boolean
    //   52: invokevirtual booleanValue : ()Z
    //   55: ifeq -> 64
    //   58: iconst_0
    //   59: istore #5
    //   61: goto -> 70
    //   64: aload_2
    //   65: invokevirtual getNetworkType : ()I
    //   68: istore #5
    //   70: aload_0
    //   71: iload #5
    //   73: putfield i : I
    //   76: aload_0
    //   77: aload_2
    //   78: invokevirtual getPhoneType : ()I
    //   81: putfield j : I
    //   84: aload_0
    //   85: bipush #-2
    //   87: putfield h : I
    //   90: aload_0
    //   91: iconst_0
    //   92: putfield k : Z
    //   95: aload_0
    //   96: iconst_m1
    //   97: putfield l : I
    //   100: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   103: pop
    //   104: aload_1
    //   105: ldc_w 'android.permission.ACCESS_NETWORK_STATE'
    //   108: invokestatic q0 : (Landroid/content/Context;Ljava/lang/String;)Z
    //   111: ifeq -> 158
    //   114: aload_3
    //   115: invokevirtual getActiveNetworkInfo : ()Landroid/net/NetworkInfo;
    //   118: astore_1
    //   119: aload_1
    //   120: ifnull -> 145
    //   123: aload_0
    //   124: aload_1
    //   125: invokevirtual getType : ()I
    //   128: putfield h : I
    //   131: aload_0
    //   132: aload_1
    //   133: invokevirtual getDetailedState : ()Landroid/net/NetworkInfo$DetailedState;
    //   136: invokevirtual ordinal : ()I
    //   139: putfield l : I
    //   142: goto -> 150
    //   145: aload_0
    //   146: iconst_m1
    //   147: putfield h : I
    //   150: aload_0
    //   151: aload_3
    //   152: invokevirtual isActiveNetworkMetered : ()Z
    //   155: putfield k : Z
    //   158: return
  }
  
  private final void e(Context paramContext) {
    Intent intent = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool = false;
    if (intent != null) {
      int i = intent.getIntExtra("status", -1);
      int j = intent.getIntExtra("level", -1);
      int k = intent.getIntExtra("scale", -1);
      this.m = (j / k);
      if (i == 2 || i == 5)
        bool = true; 
      this.n = bool;
      return;
    } 
    this.m = -1.0D;
    this.n = false;
  }
  
  private static String f(Context paramContext) {
    try {
      PackageInfo packageInfo = c.a(paramContext).e("com.android.vending", 128);
      if (packageInfo != null) {
        int i = packageInfo.versionCode;
        String str = packageInfo.packageName;
        int j = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder();
        this(j + 12);
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(str);
        return stringBuilder.toString();
      } 
    } catch (Exception exception) {}
    return null;
  }
  
  public final yg g() {
    return new yg(this.a, this.q, this.r, this.g, this.s, this.t, this.u, this.v, this.b, this.c, this.w, this.x, this.B, this.d, this.h, this.i, this.j, this.e, this.f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.o, this.C, this.p);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */