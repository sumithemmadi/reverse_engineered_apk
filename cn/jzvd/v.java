package cn.jzvd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import b.a.o.d;
import java.util.Formatter;
import java.util.Locale;

public class v {
  public static int a;
  
  public static AppCompatActivity a(Context paramContext) {
    return (paramContext == null) ? null : ((paramContext instanceof AppCompatActivity) ? (AppCompatActivity)paramContext : ((paramContext instanceof d) ? a(((d)paramContext).getBaseContext()) : null));
  }
  
  public static long b(Context paramContext, Object paramObject) {
    if (!Jzvd.g)
      return 0L; 
    SharedPreferences sharedPreferences = paramContext.getSharedPreferences("JZVD_PROGRESS", 0);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("newVersion:");
    stringBuilder.append(paramObject.toString());
    return sharedPreferences.getLong(stringBuilder.toString(), 0L);
  }
  
  public static Window c(Context paramContext) {
    return (a(paramContext) != null) ? a(paramContext).getWindow() : h(paramContext).getWindow();
  }
  
  @SuppressLint({"RestrictedApi"})
  public static void d(Context paramContext) {
    if (Jzvd.d)
      c(paramContext).setFlags(1024, 1024); 
  }
  
  @SuppressLint({"NewApi"})
  public static void e(Context paramContext) {
    char c;
    if (Build.VERSION.SDK_INT >= 19) {
      c = 'ᘆ';
    } else {
      c = '؆';
    } 
    a = c(paramContext).getDecorView().getSystemUiVisibility();
    c(paramContext).getDecorView().setSystemUiVisibility(c);
  }
  
  public static boolean f(Context paramContext) {
    NetworkInfo networkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool = true;
    if (networkInfo == null || networkInfo.getType() != 1)
      bool = false; 
    return bool;
  }
  
  public static void g(Context paramContext, Object paramObject, long paramLong) {
    if (!Jzvd.g)
      return; 
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append("saveProgress: ");
    stringBuilder2.append(paramLong);
    Log.i("JZVD", stringBuilder2.toString());
    long l = paramLong;
    if (paramLong < 5000L)
      l = 0L; 
    SharedPreferences.Editor editor = paramContext.getSharedPreferences("JZVD_PROGRESS", 0).edit();
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("newVersion:");
    stringBuilder1.append(paramObject.toString());
    editor.putLong(stringBuilder1.toString(), l).apply();
  }
  
  public static Activity h(Context paramContext) {
    return (paramContext == null) ? null : ((paramContext instanceof Activity) ? (Activity)paramContext : ((paramContext instanceof ContextWrapper) ? h(((ContextWrapper)paramContext).getBaseContext()) : null));
  }
  
  public static void i(Context paramContext, int paramInt) {
    if (a(paramContext) != null) {
      a(paramContext).setRequestedOrientation(paramInt);
    } else {
      h(paramContext).setRequestedOrientation(paramInt);
    } 
  }
  
  @SuppressLint({"RestrictedApi"})
  public static void j(Context paramContext) {
    if (Jzvd.d)
      c(paramContext).clearFlags(1024); 
  }
  
  @SuppressLint({"NewApi"})
  public static void k(Context paramContext) {
    c(paramContext).getDecorView().setSystemUiVisibility(a);
  }
  
  public static String l(long paramLong) {
    if (paramLong <= 0L || paramLong >= 86400000L)
      return "00:00"; 
    paramLong /= 1000L;
    int i = (int)(paramLong % 60L);
    int j = (int)(paramLong / 60L % 60L);
    int k = (int)(paramLong / 3600L);
    Formatter formatter = new Formatter(new StringBuilder(), Locale.getDefault());
    return (k > 0) ? formatter.format("%d:%02d:%02d", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i) }).toString() : formatter.format("%02d:%02d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) }).toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/cn/jzvd/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */