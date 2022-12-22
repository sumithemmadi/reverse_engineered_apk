package com.allinone.callerid.util;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.PhoneNumberUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.core.content.a;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.k1.a;

public class q0 {
  private static boolean a = false;
  
  private static int b;
  
  public static void a(Context paramContext, String paramString) {
    if (a.a(paramContext, "android.permission.CALL_PHONE") == 0)
      try {
        if (!i1.v0(paramString)) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("tel:");
          stringBuilder.append(Uri.encode(paramString));
          Uri uri = Uri.parse(stringBuilder.toString());
          Intent intent = new Intent();
          this("android.intent.action.CALL", uri);
          intent.setFlags(268435456);
          paramContext.startActivity(intent);
        } else {
          Toast.makeText(paramContext, paramContext.getResources().getString(2131755829), 1).show();
        } 
      } catch (Exception exception) {
        Toast.makeText(paramContext, paramContext.getResources().getString(2131755541), 1).show();
      }  
  }
  
  public static String b(String paramString) {
    String str;
    try {
      if (Build.VERSION.SDK_INT >= 21) {
        paramString = PhoneNumberUtils.formatNumber(paramString, p.d((Context)EZCallApplication.c()).getIso_code().split("/")[0]);
      } else {
        paramString = PhoneNumberUtils.formatNumber(paramString);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      str = "";
    } 
    return str;
  }
  
  public static String c(Context paramContext) {
    String str;
    try {
      WindowManager windowManager = (WindowManager)paramContext.getSystemService("window");
      DisplayMetrics displayMetrics = new DisplayMetrics();
      this();
      windowManager.getDefaultDisplay().getMetrics(displayMetrics);
      int i = displayMetrics.widthPixels;
      int j = displayMetrics.heightPixels;
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(i);
      stringBuilder.append("*");
      stringBuilder.append(j);
      str = stringBuilder.toString();
    } catch (Exception exception) {
      exception.printStackTrace();
      str = "";
    } 
    return str;
  }
  
  public static int d(Context paramContext) {
    boolean bool;
    try {
      WindowManager windowManager = (WindowManager)paramContext.getSystemService("window");
      DisplayMetrics displayMetrics = new DisplayMetrics();
      this();
      windowManager.getDefaultDisplay().getMetrics(displayMetrics);
      bool = displayMetrics.widthPixels;
    } catch (Exception exception) {
      exception.printStackTrace();
      bool = false;
    } 
    return bool;
  }
  
  public static void e(Context paramContext) {
    if (a) {
      AudioManager audioManager;
      if (Build.VERSION.SDK_INT >= 24) {
        if (a.j()) {
          audioManager = (AudioManager)paramContext.getSystemService("audio");
          if (audioManager != null) {
            audioManager.setRingerMode(b);
            audioManager.getStreamVolume(2);
            if (d0.a)
              d0.a("wbb", "RINGING 取消静音"); 
            a = false;
          } 
        } 
      } else {
        audioManager = (AudioManager)audioManager.getSystemService("audio");
        if (audioManager != null) {
          audioManager.setRingerMode(2);
          audioManager.getStreamVolume(2);
          if (d0.a)
            d0.a("wbb", "RINGING 取消静音"); 
          a = false;
        } 
      } 
    } 
  }
  
  public static void f(Context paramContext) {
    AudioManager audioManager;
    if (d0.a)
      d0.a("wbb", "静音"); 
    if (Build.VERSION.SDK_INT >= 24) {
      if (a.j()) {
        audioManager = (AudioManager)paramContext.getSystemService("audio");
        if (audioManager != null) {
          b = audioManager.getRingerMode();
          audioManager.setRingerMode(0);
          audioManager.getStreamVolume(2);
          if (d0.a)
            d0.a("wbb", "RINGING 已被静音"); 
          a = true;
        } 
      } 
    } else {
      audioManager = (AudioManager)audioManager.getSystemService("audio");
      if (audioManager != null) {
        b = audioManager.getRingerMode();
        audioManager.setRingerMode(0);
        audioManager.getStreamVolume(2);
        if (d0.a)
          d0.a("wbb", "RINGING 已被静音"); 
        a = true;
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */