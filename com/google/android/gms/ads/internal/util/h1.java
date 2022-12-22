package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import androidx.browser.customtabs.c;
import androidx.core.app.l;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.w.a;
import com.google.android.gms.common.k.c;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.k;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.dt1;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.l92;
import com.google.android.gms.internal.ads.lh;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.m1;
import com.google.android.gms.internal.ads.o2;
import com.google.android.gms.internal.ads.ot1;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.wl;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.xp1;
import com.google.android.gms.internal.ads.zzacr;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h1 {
  public static final xp1 a = new e1(Looper.getMainLooper());
  
  private AtomicReference<Pattern> b = new AtomicReference<Pattern>(null);
  
  private AtomicReference<Pattern> c = new AtomicReference<Pattern>(null);
  
  private boolean d = true;
  
  private final Object e = new Object();
  
  private String f;
  
  private boolean g = false;
  
  private boolean h = false;
  
  private final Executor i = Executors.newSingleThreadExecutor();
  
  @SuppressLint({"NewApi"})
  public static String A(Context paramContext) {
    try {
      ActivityManager activityManager = (ActivityManager)paramContext.getSystemService("activity");
      if (activityManager == null)
        return null; 
      List<ActivityManager.RunningTaskInfo> list = activityManager.getRunningTasks(1);
      if (list != null && !list.isEmpty()) {
        ActivityManager.RunningTaskInfo runningTaskInfo = list.get(0);
        if (runningTaskInfo != null) {
          ComponentName componentName = runningTaskInfo.topActivity;
          if (componentName != null)
            return componentName.getClassName(); 
        } 
      } 
    } catch (Exception exception) {}
    return null;
  }
  
  public static String A0() {
    String str;
    Resources resources = q.g().b();
    if (resources != null) {
      str = resources.getString(a.s7);
    } else {
      str = "Test Ad";
    } 
    return str;
  }
  
  public static boolean B(Context paramContext) {
    try {
      ActivityManager activityManager = (ActivityManager)paramContext.getSystemService("activity");
      KeyguardManager keyguardManager = (KeyguardManager)paramContext.getSystemService("keyguard");
      if (activityManager != null && keyguardManager != null) {
        List list = activityManager.getRunningAppProcesses();
        if (list == null)
          return false; 
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
          if (Process.myPid() == runningAppProcessInfo.pid) {
            if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode()) {
              boolean bool;
              PowerManager powerManager = (PowerManager)paramContext.getSystemService("power");
              if (powerManager == null) {
                bool = false;
              } else {
                bool = powerManager.isScreenOn();
              } 
              if (bool)
                return false; 
            } 
            break;
          } 
        } 
        return true;
      } 
    } finally {}
    return false;
  }
  
  public static int C(Context paramContext) {
    ApplicationInfo applicationInfo = paramContext.getApplicationInfo();
    return (applicationInfo == null) ? 0 : applicationInfo.targetSdkVersion;
  }
  
  private static KeyguardManager D(Context paramContext) {
    Object object = paramContext.getSystemService("keyguard");
    if (object != null && object instanceof KeyguardManager) {
      object = object;
    } else {
      object = null;
    } 
    return (KeyguardManager)object;
  }
  
  @TargetApi(16)
  public static boolean E(Context paramContext) {
    if (paramContext != null && o.c()) {
      KeyguardManager keyguardManager = D(paramContext);
      if (keyguardManager != null && keyguardManager.isKeyguardLocked())
        return true; 
    } 
    return false;
  }
  
  public static boolean F(Context paramContext) {
    try {
      return false;
    } catch (ClassNotFoundException classNotFoundException) {
      return true;
    } finally {
      paramContext = null;
      cm.c("Error loading class.", (Throwable)paramContext);
      q.g().e((Throwable)paramContext, "AdUtil.isLiteSdk");
    } 
  }
  
  public static String G(Context paramContext) {
    x x = m0.I4;
    return !((Boolean)er2.e().c(x)).booleanValue() ? "" : paramContext.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
  }
  
  public static Bundle H(Context paramContext) {
    x x = m0.J4;
    if (!((Boolean)er2.e().c(x)).booleanValue())
      return null; 
    SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    Bundle bundle = new Bundle();
    boolean bool = sharedPreferences.contains("IABConsent_CMPPresent");
    byte b = 0;
    if (bool)
      bundle.putBoolean("IABConsent_CMPPresent", sharedPreferences.getBoolean("IABConsent_CMPPresent", false)); 
    while (b < 4) {
      (new String[4])[0] = "IABConsent_SubjectToGDPR";
      (new String[4])[1] = "IABConsent_ConsentString";
      (new String[4])[2] = "IABConsent_ParsedPurposeConsents";
      (new String[4])[3] = "IABConsent_ParsedVendorConsents";
      String str = (new String[4])[b];
      if (sharedPreferences.contains(str))
        bundle.putString(str, sharedPreferences.getString(str, null)); 
      b++;
    } 
    return bundle;
  }
  
  public static boolean I(Context paramContext) {
    if (!(paramContext instanceof Activity))
      return false; 
    Window window = ((Activity)paramContext).getWindow();
    if (window != null && window.getDecorView() != null) {
      Rect rect1 = new Rect();
      Rect rect2 = new Rect();
      window.getDecorView().getGlobalVisibleRect(rect1, null);
      window.getDecorView().getWindowVisibleDisplayFrame(rect2);
      if (rect1.bottom != 0 && rect2.bottom != 0 && rect1.top == rect2.top)
        return true; 
    } 
    return false;
  }
  
  public static String J(Context paramContext) {
    if (paramContext.getApplicationContext() != null)
      paramContext = paramContext.getApplicationContext(); 
    return Y(a(paramContext));
  }
  
  public static boolean K(Context paramContext) {
    Bundle bundle = a(paramContext);
    String str = bundle.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
    return (TextUtils.isEmpty(Y(bundle)) && !TextUtils.isEmpty(str));
  }
  
  @TargetApi(18)
  public static void L(Context paramContext, Intent paramIntent) {
    if (paramIntent == null)
      return; 
    if (o.e()) {
      Bundle bundle;
      if (paramIntent.getExtras() != null) {
        bundle = paramIntent.getExtras();
      } else {
        bundle = new Bundle();
      } 
      bundle.putBinder("android.support.customtabs.extra.SESSION", null);
      bundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramIntent.putExtras(bundle);
    } 
  }
  
  @TargetApi(18)
  public static void M(Context paramContext, Uri paramUri) {
    try {
      Intent intent = new Intent();
      this("android.intent.action.VIEW", paramUri);
      Bundle bundle = new Bundle();
      this();
      intent.putExtras(bundle);
      L(paramContext, intent);
      bundle.putString("com.android.browser.application_id", paramContext.getPackageName());
      paramContext.startActivity(intent);
      String str = paramUri.toString();
      int i = String.valueOf(str).length();
      StringBuilder stringBuilder = new StringBuilder();
      this(i + 26);
      stringBuilder.append("Opening ");
      stringBuilder.append(str);
      stringBuilder.append(" in a new browser.");
      cm.e(stringBuilder.toString());
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      cm.c("No browser is found.", (Throwable)activityNotFoundException);
      return;
    } 
  }
  
  public static void N(Context paramContext, String paramString1, String paramString2) {
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add(paramString2);
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      paramString2 = arrayList.get(b);
      b++;
      (new q0(paramContext, paramString1, paramString2)).c();
    } 
  }
  
  public static boolean O(Context paramContext) {
    NetworkInfo networkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (networkInfo != null && networkInfo.isConnected());
  }
  
  @TargetApi(26)
  public static void P(Context paramContext) {
    if (!o.k())
      return; 
    NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
    notificationChannel.setShowBadge(false);
    ((NotificationManager)paramContext.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
  }
  
  public static boolean Q(Context paramContext) {
    return l.b(paramContext).a();
  }
  
  public static g0 R(Context paramContext) {
    try {
      paramContext = paramContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      if (!(paramContext instanceof IBinder)) {
        cm.g("Instantiated WorkManagerUtil not instance of IBinder.");
        return null;
      } 
      IBinder iBinder = (IBinder)paramContext;
      if (iBinder == null)
        return null; 
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
      return (iInterface instanceof g0) ? (g0)iInterface : new i0(iBinder);
    } catch (Exception exception) {
      q.g().e(exception, "Failed to instantiate WorkManagerUtil");
      return null;
    } 
  }
  
  public static AlertDialog.Builder S(Context paramContext, int paramInt) {
    return new AlertDialog.Builder(paramContext, paramInt);
  }
  
  public static void U(Context paramContext, String paramString1, String paramString2) {
    try {
      FileOutputStream fileOutputStream = paramContext.openFileOutput(paramString1, 0);
      fileOutputStream.write(paramString2.getBytes("UTF-8"));
      fileOutputStream.close();
      return;
    } catch (Exception exception) {
      cm.c("Error writing to file in internal storage.", exception);
      return;
    } 
  }
  
  public static void V(Runnable paramRunnable) {
    if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
      paramRunnable.run();
      return;
    } 
    fm.a.execute(paramRunnable);
  }
  
  public static WebResourceResponse W(Context paramContext, String paramString1, String paramString2) {
    try {
      HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
      this();
      hashMap.put("User-Agent", q.c().r0(paramContext, paramString1));
      hashMap.put("Cache-Control", "max-stale=3600");
      x x = new x();
      this(paramContext);
      String str = x.b(paramString2, (Map)hashMap).get(60L, TimeUnit.SECONDS);
      if (str != null) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
        this(str.getBytes("UTF-8"));
        return new WebResourceResponse("application/javascript", "UTF-8", byteArrayInputStream);
      } 
    } catch (IOException iOException) {
      cm.d("Could not fetch MRAID JS.", iOException);
    } catch (ExecutionException executionException) {
    
    } catch (InterruptedException interruptedException) {
    
    } catch (TimeoutException timeoutException) {}
    return null;
  }
  
  public static WebResourceResponse X(HttpURLConnection paramHttpURLConnection) {
    q.c();
    String str1 = paramHttpURLConnection.getContentType();
    boolean bool = TextUtils.isEmpty(str1);
    String str2 = "";
    if (bool) {
      str1 = "";
    } else {
      str1 = str1.split(";")[0].trim();
    } 
    q.c();
    String str3 = paramHttpURLConnection.getContentType();
    String str4 = str2;
    if (!TextUtils.isEmpty(str3)) {
      String[] arrayOfString = str3.split(";");
      str4 = str2;
      if (arrayOfString.length != 1) {
        byte b = 1;
        while (true) {
          str4 = str2;
          if (b < arrayOfString.length) {
            if (arrayOfString[b].trim().startsWith("charset")) {
              String[] arrayOfString1 = arrayOfString[b].trim().split("=");
              if (arrayOfString1.length > 1) {
                str4 = arrayOfString1[1].trim();
                break;
              } 
            } 
            b++;
            continue;
          } 
          break;
        } 
      } 
    } 
    Map<String, List<String>> map = paramHttpURLConnection.getHeaderFields();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(map.size());
    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
      if (entry.getKey() != null && entry.getValue() != null && ((List)entry.getValue()).size() > 0)
        hashMap.put(entry.getKey(), ((List<String>)entry.getValue()).get(0)); 
    } 
    return q.e().e(str1, str4, paramHttpURLConnection.getResponseCode(), paramHttpURLConnection.getResponseMessage(), (Map)hashMap, paramHttpURLConnection.getInputStream());
  }
  
  private static String Y(Bundle paramBundle) {
    if (paramBundle == null)
      return ""; 
    String str = paramBundle.getString("com.google.android.gms.ads.APPLICATION_ID");
    return TextUtils.isEmpty(str) ? "" : ((str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || str.matches("^/\\d+~.+$")) ? str : "");
  }
  
  public static int Z(int paramInt) {
    if (paramInt >= 5000)
      return paramInt; 
    if (paramInt > 0) {
      StringBuilder stringBuilder = new StringBuilder(97);
      stringBuilder.append("HTTP timeout too low: ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
      cm.i(stringBuilder.toString());
    } 
    return 60000;
  }
  
  private static Bundle a(Context paramContext) {
    try {
      return (c.a(paramContext).c(paramContext.getPackageName(), 128)).metaData;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
    
    } catch (NullPointerException nullPointerException) {}
    b1.l("Error getting metadata", nullPointerException);
    return null;
  }
  
  public static int a0(String paramString) {
    try {
      return Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      String str = String.valueOf(numberFormatException);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 22);
      stringBuilder.append("Could not parse value:");
      stringBuilder.append(str);
      cm.i(stringBuilder.toString());
      return 0;
    } 
  }
  
  public static DisplayMetrics b(WindowManager paramWindowManager) {
    DisplayMetrics displayMetrics = new DisplayMetrics();
    paramWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
    return displayMetrics;
  }
  
  public static boolean b0(String paramString) {
    return TextUtils.isEmpty(paramString) ? false : paramString.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
  }
  
  public static PopupWindow c(View paramView, int paramInt1, int paramInt2, boolean paramBoolean) {
    return new PopupWindow(paramView, paramInt1, paramInt2, false);
  }
  
  public static boolean e0(String paramString) {
    if (!wl.a())
      return false; 
    x x2 = m0.z3;
    if (!((Boolean)er2.e().c(x2)).booleanValue())
      return false; 
    x2 = m0.B3;
    String str2 = (String)er2.e().c(x2);
    if (!str2.isEmpty()) {
      String[] arrayOfString1 = str2.split(";");
      int j = arrayOfString1.length;
      for (byte b1 = 0; b1 < j; b1++) {
        if (arrayOfString1[b1].equals(paramString))
          return false; 
      } 
    } 
    x x1 = m0.A3;
    String str1 = (String)er2.e().c(x1);
    if (str1.isEmpty())
      return true; 
    String[] arrayOfString = str1.split(";");
    int i = arrayOfString.length;
    for (byte b = 0; b < i; b++) {
      if (arrayOfString[b].equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public static int[] f0(Activity paramActivity) {
    Window window = paramActivity.getWindow();
    if (window != null) {
      View view = window.findViewById(16908290);
      if (view != null)
        return new int[] { view.getWidth(), view.getHeight() }; 
    } 
    return z0();
  }
  
  public static String g(InputStreamReader paramInputStreamReader) {
    StringBuilder stringBuilder = new StringBuilder(8192);
    char[] arrayOfChar = new char[2048];
    while (true) {
      int i = paramInputStreamReader.read(arrayOfChar);
      if (i != -1) {
        stringBuilder.append(arrayOfChar, 0, i);
        continue;
      } 
      return stringBuilder.toString();
    } 
  }
  
  public static Map<String, String> g0(Uri paramUri) {
    if (paramUri == null)
      return null; 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (String str : paramUri.getQueryParameterNames()) {
      if (!TextUtils.isEmpty(str))
        hashMap.put(str, paramUri.getQueryParameter(str)); 
    } 
    return (Map)hashMap;
  }
  
  private final JSONArray h(Collection<?> paramCollection) {
    JSONArray jSONArray = new JSONArray();
    Iterator<?> iterator = paramCollection.iterator();
    while (iterator.hasNext())
      o(jSONArray, iterator.next()); 
    return jSONArray;
  }
  
  public static int[] h0(Activity paramActivity) {
    int[] arrayOfInt = f0(paramActivity);
    return new int[] { er2.a().p((Context)paramActivity, arrayOfInt[0]), er2.a().p((Context)paramActivity, arrayOfInt[1]) };
  }
  
  public static void j(DownloadManager.Request paramRequest) {
    paramRequest.allowScanningByMediaScanner();
    paramRequest.setNotificationVisibility(1);
  }
  
  public static int[] j0(Activity paramActivity) {
    Window window = paramActivity.getWindow();
    if (window != null) {
      View view = window.findViewById(16908290);
      if (view != null) {
        int[] arrayOfInt1 = new int[2];
        arrayOfInt1[0] = view.getTop();
        arrayOfInt1[1] = view.getBottom();
        return new int[] { er2.a().p((Context)paramActivity, arrayOfInt1[0]), er2.a().p((Context)paramActivity, arrayOfInt1[1]) };
      } 
    } 
    int[] arrayOfInt = z0();
    return new int[] { er2.a().p((Context)paramActivity, arrayOfInt[0]), er2.a().p((Context)paramActivity, arrayOfInt[1]) };
  }
  
  public static void k(Context paramContext, Intent paramIntent) {
    try {
      return;
    } finally {
      Exception exception = null;
      paramIntent.addFlags(268435456);
      paramContext.startActivity(paramIntent);
    } 
  }
  
  public static Bitmap m0(View paramView) {
    paramView.setDrawingCacheEnabled(true);
    Bitmap bitmap = Bitmap.createBitmap(paramView.getDrawingCache());
    paramView.setDrawingCacheEnabled(false);
    return bitmap;
  }
  
  public static void n(Context paramContext, Throwable paramThrowable) {
    boolean bool2;
    if (paramContext == null)
      return; 
    boolean bool1 = false;
    try {
      bool2 = ((Boolean)o2.b.a()).booleanValue();
    } catch (IllegalStateException illegalStateException) {
      bool2 = bool1;
    } 
    if (bool2)
      g.a(paramContext, paramThrowable); 
  }
  
  public static Bitmap n0(View paramView) {
    if (paramView == null)
      return null; 
    Bitmap bitmap1 = p0(paramView);
    Bitmap bitmap2 = bitmap1;
    if (bitmap1 == null)
      bitmap2 = o0(paramView); 
    return bitmap2;
  }
  
  private final void o(JSONArray paramJSONArray, Object paramObject) {
    if (paramObject instanceof Bundle) {
      paramJSONArray.put(T((Bundle)paramObject));
      return;
    } 
    if (paramObject instanceof Map) {
      paramJSONArray.put(l0((Map<String, ?>)paramObject));
      return;
    } 
    if (paramObject instanceof Collection) {
      paramJSONArray.put(h((Collection)paramObject));
      return;
    } 
    if (paramObject instanceof Object[]) {
      paramObject = paramObject;
      JSONArray jSONArray = new JSONArray();
      int i = paramObject.length;
      for (byte b = 0; b < i; b++)
        o(jSONArray, paramObject[b]); 
      paramJSONArray.put(jSONArray);
      return;
    } 
    paramJSONArray.put(paramObject);
  }
  
  private static Bitmap o0(View paramView) {
    try {
      int i = paramView.getWidth();
      int j = paramView.getHeight();
      if (i == 0 || j == 0) {
        cm.i("Width or height of view is zero");
        return null;
      } 
      Bitmap bitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.RGB_565);
      Canvas canvas = new Canvas();
      this(bitmap);
      paramView.layout(0, 0, i, j);
      paramView.draw(canvas);
      return bitmap;
    } catch (RuntimeException runtimeException) {
      cm.c("Fail to capture the webview", runtimeException);
      return null;
    } 
  }
  
  private final void p(JSONObject paramJSONObject, String paramString, Object paramObject) {
    if (paramObject instanceof Bundle) {
      paramJSONObject.put(paramString, T((Bundle)paramObject));
      return;
    } 
    if (paramObject instanceof Map) {
      paramJSONObject.put(paramString, l0((Map<String, ?>)paramObject));
      return;
    } 
    if (paramObject instanceof Collection) {
      if (paramString == null)
        paramString = "null"; 
      paramJSONObject.put(paramString, h((Collection)paramObject));
      return;
    } 
    if (paramObject instanceof Object[]) {
      paramJSONObject.put(paramString, h(Arrays.asList((Object[])paramObject)));
      return;
    } 
    paramJSONObject.put(paramString, paramObject);
  }
  
  private static Bitmap p0(View paramView) {
    Bitmap bitmap1 = null;
    Bitmap bitmap2 = null;
    Bitmap bitmap3 = bitmap1;
    try {
      boolean bool = paramView.isDrawingCacheEnabled();
      bitmap3 = bitmap1;
      paramView.setDrawingCacheEnabled(true);
      bitmap3 = bitmap1;
      Bitmap bitmap = paramView.getDrawingCache();
      if (bitmap != null) {
        bitmap3 = bitmap1;
        bitmap2 = Bitmap.createBitmap(bitmap);
      } 
      bitmap3 = bitmap2;
      paramView.setDrawingCacheEnabled(bool);
    } catch (RuntimeException runtimeException) {
      cm.c("Fail to capture the web view", runtimeException);
      bitmap2 = bitmap3;
    } 
    return bitmap2;
  }
  
  public static boolean q0(Context paramContext, String paramString) {
    paramContext = lh.a(paramContext);
    String str = paramContext.getPackageName();
    return (c.a(paramContext).b(paramString, str) == 0);
  }
  
  public static boolean r(View paramView, PowerManager paramPowerManager, KeyguardManager paramKeyguardManager) {
    // Byte code:
    //   0: invokestatic c : ()Lcom/google/android/gms/ads/internal/util/h1;
    //   3: getfield d : Z
    //   6: ifne -> 43
    //   9: aload_2
    //   10: ifnonnull -> 18
    //   13: iconst_0
    //   14: istore_3
    //   15: goto -> 23
    //   18: aload_2
    //   19: invokevirtual inKeyguardRestrictedInputMode : ()Z
    //   22: istore_3
    //   23: iload_3
    //   24: ifeq -> 43
    //   27: aload_0
    //   28: invokestatic s0 : (Landroid/view/View;)Z
    //   31: ifeq -> 37
    //   34: goto -> 43
    //   37: iconst_0
    //   38: istore #4
    //   40: goto -> 46
    //   43: iconst_1
    //   44: istore #4
    //   46: aload_0
    //   47: invokevirtual getVisibility : ()I
    //   50: ifne -> 143
    //   53: aload_0
    //   54: invokevirtual isShown : ()Z
    //   57: ifeq -> 143
    //   60: aload_1
    //   61: ifnull -> 80
    //   64: aload_1
    //   65: invokevirtual isScreenOn : ()Z
    //   68: ifeq -> 74
    //   71: goto -> 80
    //   74: iconst_0
    //   75: istore #5
    //   77: goto -> 83
    //   80: iconst_1
    //   81: istore #5
    //   83: iload #5
    //   85: ifeq -> 143
    //   88: iload #4
    //   90: ifeq -> 143
    //   93: getstatic com/google/android/gms/internal/ads/m0.h1 : Lcom/google/android/gms/internal/ads/x;
    //   96: astore_1
    //   97: invokestatic e : ()Lcom/google/android/gms/internal/ads/i0;
    //   100: aload_1
    //   101: invokevirtual c : (Lcom/google/android/gms/internal/ads/x;)Ljava/lang/Object;
    //   104: checkcast java/lang/Boolean
    //   107: invokevirtual booleanValue : ()Z
    //   110: ifeq -> 141
    //   113: aload_0
    //   114: new android/graphics/Rect
    //   117: dup
    //   118: invokespecial <init> : ()V
    //   121: invokevirtual getLocalVisibleRect : (Landroid/graphics/Rect;)Z
    //   124: ifne -> 141
    //   127: aload_0
    //   128: new android/graphics/Rect
    //   131: dup
    //   132: invokespecial <init> : ()V
    //   135: invokevirtual getGlobalVisibleRect : (Landroid/graphics/Rect;)Z
    //   138: ifeq -> 143
    //   141: iconst_1
    //   142: ireturn
    //   143: iconst_0
    //   144: ireturn
  }
  
  public static boolean s0(View paramView) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getRootView : ()Landroid/view/View;
    //   4: astore_0
    //   5: aconst_null
    //   6: astore_1
    //   7: aload_0
    //   8: ifnull -> 31
    //   11: aload_0
    //   12: invokevirtual getContext : ()Landroid/content/Context;
    //   15: astore_0
    //   16: aload_0
    //   17: instanceof android/app/Activity
    //   20: ifeq -> 31
    //   23: aload_0
    //   24: checkcast android/app/Activity
    //   27: astore_0
    //   28: goto -> 33
    //   31: aconst_null
    //   32: astore_0
    //   33: aload_0
    //   34: ifnonnull -> 39
    //   37: iconst_0
    //   38: ireturn
    //   39: aload_0
    //   40: invokevirtual getWindow : ()Landroid/view/Window;
    //   43: astore_0
    //   44: aload_0
    //   45: ifnonnull -> 53
    //   48: aload_1
    //   49: astore_0
    //   50: goto -> 58
    //   53: aload_0
    //   54: invokevirtual getAttributes : ()Landroid/view/WindowManager$LayoutParams;
    //   57: astore_0
    //   58: aload_0
    //   59: ifnull -> 75
    //   62: aload_0
    //   63: getfield flags : I
    //   66: ldc_w 524288
    //   69: iand
    //   70: ifeq -> 75
    //   73: iconst_1
    //   74: ireturn
    //   75: iconst_0
    //   76: ireturn
  }
  
  public static boolean t(ClassLoader paramClassLoader, Class<?> paramClass, List<String> paramList) {
    for (String str : paramList) {
      try {
        boolean bool = Class.forName(str, false, paramClassLoader).isAssignableFrom(paramClass);
        if (bool)
          return true; 
      } finally {}
    } 
    return false;
  }
  
  public static int t0(View paramView) {
    if (paramView == null)
      return -1; 
    ViewParent viewParent;
    for (viewParent = paramView.getParent(); viewParent != null && !(viewParent instanceof AdapterView); viewParent = viewParent.getParent());
    return (viewParent == null) ? -1 : ((AdapterView)viewParent).getPositionForView(paramView);
  }
  
  private static boolean u(String paramString1, AtomicReference<Pattern> paramAtomicReference, String paramString2) {
    if (TextUtils.isEmpty(paramString1))
      return false; 
    try {
      Pattern pattern1 = paramAtomicReference.get();
      if (pattern1 != null) {
        Pattern pattern = pattern1;
        if (!paramString2.equals(pattern1.pattern())) {
          pattern = Pattern.compile(paramString2);
          paramAtomicReference.set(pattern);
          return pattern.matcher(paramString1).matches();
        } 
        return pattern.matcher(paramString1).matches();
      } 
      Pattern pattern2 = Pattern.compile(paramString2);
      paramAtomicReference.set(pattern2);
      return pattern2.matcher(paramString1).matches();
    } catch (PatternSyntaxException patternSyntaxException) {
      return false;
    } 
  }
  
  public static String u0(Context paramContext, String paramString) {
    try {
      return new String(k.d(paramContext.openFileInput(paramString), true), "UTF-8");
    } catch (IOException iOException) {
      cm.e("Error reading from internal storage.");
      return "";
    } 
  }
  
  public static boolean v0(View paramView) {
    if (paramView == null)
      return false; 
    ViewParent viewParent;
    for (viewParent = paramView.getParent(); viewParent != null && !(viewParent instanceof android.widget.ScrollView); viewParent = viewParent.getParent());
    return !(viewParent == null);
  }
  
  private static String w0() {
    StringBuilder stringBuilder = new StringBuilder(256);
    stringBuilder.append("Mozilla/5.0 (Linux; U; Android");
    String str = Build.VERSION.RELEASE;
    if (str != null) {
      stringBuilder.append(" ");
      stringBuilder.append(str);
    } 
    stringBuilder.append("; ");
    stringBuilder.append(Locale.getDefault());
    str = Build.DEVICE;
    if (str != null) {
      stringBuilder.append("; ");
      stringBuilder.append(str);
      str = Build.DISPLAY;
      if (str != null) {
        stringBuilder.append(" Build/");
        stringBuilder.append(str);
      } 
    } 
    stringBuilder.append(") AppleWebKit/533 Version/4.0 Safari/533");
    return stringBuilder.toString();
  }
  
  protected static String x(Context paramContext) {
    try {
      WebView webView = new WebView();
      return webView.getSettings().getUserAgentString();
    } finally {
      paramContext = null;
    } 
  }
  
  public static String x0() {
    return UUID.randomUUID().toString();
  }
  
  public static AlertDialog.Builder y(Context paramContext) {
    return new AlertDialog.Builder(paramContext);
  }
  
  public static String y0() {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1))
      return str2; 
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 1 + str2.length());
    stringBuilder.append(str1);
    stringBuilder.append(" ");
    stringBuilder.append(str2);
    return stringBuilder.toString();
  }
  
  public static s z(Context paramContext) {
    return new s(paramContext);
  }
  
  private static int[] z0() {
    return new int[] { 0, 0 };
  }
  
  public final JSONObject T(Bundle paramBundle) {
    JSONObject jSONObject = new JSONObject();
    for (String str : paramBundle.keySet())
      p(jSONObject, str, paramBundle.get(str)); 
    return jSONObject;
  }
  
  public final boolean c0(String paramString) {
    AtomicReference<Pattern> atomicReference = this.b;
    x x = m0.V;
    return u(paramString, atomicReference, (String)er2.e().c(x));
  }
  
  @TargetApi(18)
  public final zzacr d(Context paramContext, Uri paramUri) {
    zzacr zzacr;
    Intent intent;
    if (!o.e()) {
      b1.m("Chrome Custom Tabs can only work with version Jellybean onwards.");
      zzacr = zzacr.b;
    } else if (paramContext == null) {
      b1.m("Trying to open chrome custom tab on a null context");
      zzacr = zzacr.d;
    } else if (!(paramContext instanceof Activity)) {
      b1.m("Chrome Custom Tabs can only work with Activity context.");
      zzacr = zzacr.c;
    } else if (l92.a(paramContext) == null) {
      b1.m("Default browser does not support custom tabs.");
      zzacr = zzacr.e;
    } else {
      zzacr = null;
    } 
    x x1 = m0.j3;
    Boolean bool = (Boolean)er2.e().c(x1);
    x x2 = m0.k3;
    if (bool.equals(er2.e().c(x2)))
      zzacr = zzacr.j; 
    if (zzacr != null) {
      intent = new Intent("android.intent.action.VIEW");
      intent.setData(paramUri);
      intent.addFlags(268435456);
      paramContext.startActivity(intent);
      return zzacr;
    } 
    if (((Boolean)er2.e().c(x1)).booleanValue()) {
      m1 m1 = new m1();
      m1.c(new m1(this, m1, paramContext, paramUri));
      m1.e((Activity)paramContext);
    } 
    if (((Boolean)er2.e().c((x)intent)).booleanValue())
      (new c.a()).a().a(paramContext, paramUri); 
    return zzacr.f;
  }
  
  public final boolean d0(String paramString) {
    AtomicReference<Pattern> atomicReference = this.c;
    x x = m0.W;
    return u(paramString, atomicReference, (String)er2.e().c(x));
  }
  
  public final JSONObject i(Bundle paramBundle, JSONObject paramJSONObject) {
    if (paramBundle != null)
      try {
        return T(paramBundle);
      } catch (JSONException jSONException) {
        cm.c("Error converting Bundle to JSON", (Throwable)jSONException);
      }  
    return null;
  }
  
  public final ot1<Map<String, String>> i0(Uri paramUri) {
    return dt1.e(new k1(paramUri), this.i);
  }
  
  public final void l(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean) {
    q.c();
    paramBundle.putString("device", y0());
    paramBundle.putString("eids", TextUtils.join(",", m0.d()));
    er2.a();
    sl.d(paramContext, paramString1, paramString2, paramBundle, true, new o1(this, paramContext, paramString1));
  }
  
  public final JSONObject l0(Map<String, ?> paramMap) {
    try {
      JSONObject jSONObject = new JSONObject();
      this();
      for (String str : paramMap.keySet())
        p(jSONObject, str, paramMap.get(str)); 
      return jSONObject;
    } catch (ClassCastException classCastException) {
      String str = String.valueOf(classCastException.getMessage());
      if (str.length() != 0) {
        str = "Could not convert map to JSON: ".concat(str);
      } else {
        str = new String("Could not convert map to JSON: ");
      } 
      JSONException jSONException = new JSONException(str);
      throw jSONException;
    } 
  }
  
  public final void m(Context paramContext, String paramString, boolean paramBoolean1, HttpURLConnection paramHttpURLConnection, boolean paramBoolean2, int paramInt) {
    paramInt = Z(paramInt);
    StringBuilder stringBuilder = new StringBuilder(39);
    stringBuilder.append("HTTP timeout: ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" milliseconds.");
    cm.h(stringBuilder.toString());
    paramHttpURLConnection.setConnectTimeout(paramInt);
    paramHttpURLConnection.setInstanceFollowRedirects(false);
    paramHttpURLConnection.setReadTimeout(paramInt);
    paramHttpURLConnection.setRequestProperty("User-Agent", r0(paramContext, paramString));
    paramHttpURLConnection.setUseCaches(false);
  }
  
  public final boolean q(View paramView, Context paramContext) {
    Context context = paramContext.getApplicationContext();
    if (context != null) {
      PowerManager powerManager = (PowerManager)context.getSystemService("power");
    } else {
      context = null;
    } 
    return r(paramView, (PowerManager)context, D(paramContext));
  }
  
  public final String r0(Context paramContext, String paramString) {
    synchronized (this.e) {
      String str2 = this.f;
      if (str2 != null)
        return str2; 
      if (paramString == null) {
        str1 = w0();
        return str1;
      } 
      try {
        this.f = q.e().a((Context)str1);
      } catch (Exception exception) {}
      if (TextUtils.isEmpty(this.f)) {
        er2.a();
        if (!sl.w()) {
          this.f = null;
          xp1 xp11 = a;
          l1 l1 = new l1();
          this(this, (Context)str1);
          xp11.post(l1);
          while (true) {
            String str = this.f;
            if (str == null) {
              try {
                this.e.wait();
              } catch (InterruptedException interruptedException) {
                String str3 = w0();
                this.f = str3;
                str3 = String.valueOf(str3);
                if (str3.length() != 0) {
                  str3 = "Interrupted, use default user agent: ".concat(str3);
                } else {
                  str3 = new String("Interrupted, use default user agent: ");
                } 
                cm.i(str3);
              } 
              continue;
            } 
            break;
          } 
        } else {
          this.f = x((Context)str1);
        } 
      } 
      str2 = String.valueOf(this.f);
      int i = str2.length();
      int j = paramString.length();
      StringBuilder stringBuilder = new StringBuilder();
      this(i + 10 + j);
      stringBuilder.append(str2);
      stringBuilder.append(" (Mobile; ");
      stringBuilder.append(paramString);
      this.f = stringBuilder.toString();
      try {
        if (c.a((Context)str1).f())
          this.f = String.valueOf(this.f).concat(";aia"); 
      } catch (Exception exception) {
        q.g().e(exception, "AdUtil.getUserAgent");
      } 
      String str1 = String.valueOf(this.f).concat(")");
      this.f = str1;
      return str1;
    } 
  }
  
  public final boolean v(Context paramContext) {
    if (this.g)
      return false; 
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("android.intent.action.USER_PRESENT");
    intentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.getApplicationContext().registerReceiver(new q1(this, null), intentFilter);
    this.g = true;
    return true;
  }
  
  public final boolean w(Context paramContext) {
    if (this.h)
      return false; 
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
    paramContext.getApplicationContext().registerReceiver(new n1(this, null), intentFilter);
    this.h = true;
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/h1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */