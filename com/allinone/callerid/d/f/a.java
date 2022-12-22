package com.allinone.callerid.d.f;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.os.Environment;
import android.telecom.TelecomManager;
import android.view.KeyEvent;
import com.allinone.callerid.callscreen.activitys.acceptcall.AcceptCallActivity;
import com.allinone.callerid.customview.SortToken;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.service.NLService;
import com.allinone.callerid.util.v;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;

public class a {
  public static final String a;
  
  public static final String b;
  
  public static final String c;
  
  public static boolean d = false;
  
  public static boolean e = false;
  
  private static Pattern f = Pattern.compile("[\\\\/:*?\"<>|]");
  
  public static void a(Context paramContext) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      TelecomManager telecomManager = (TelecomManager)paramContext.getSystemService("telecom");
      if (androidx.core.content.a.a(paramContext, "android.permission.ANSWER_PHONE_CALLS") == 0)
        telecomManager.acceptRingingCall(); 
    } else if (i > 20) {
      i(paramContext);
    } else {
      Intent intent = new Intent(paramContext, AcceptCallActivity.class);
      intent.addFlags(276856832);
      paramContext.startActivity(intent);
    } 
  }
  
  public static String b(String paramString) {
    if (paramString == null) {
      paramString = null;
    } else {
      paramString = f.matcher(paramString).replaceAll("");
    } 
    return paramString;
  }
  
  public static String c(String paramString) {
    String str1 = "#";
    if (paramString == null)
      return "#"; 
    String str2 = ((v.a)v.c().b(paramString).get(0)).c.substring(0, 1).toUpperCase(Locale.CHINESE);
    paramString = str1;
    if (str2.matches("[A-Z]"))
      paramString = str2.toUpperCase(Locale.CHINESE); 
    return paramString;
  }
  
  public static String d(String paramString) {
    if (paramString == null || "".equals(paramString.trim()))
      return null; 
    paramString = ((v.a)v.c().b(paramString).get(0)).c.trim().substring(0, 1).toUpperCase(Locale.CHINESE);
    if (paramString.matches("[A-Z]")) {
      paramString = paramString.toUpperCase(Locale.CHINESE);
    } else {
      paramString = "#";
    } 
    return paramString;
  }
  
  public static boolean e() {
    return Environment.getExternalStorageState().equals("mounted");
  }
  
  public static SortToken f(String paramString) {
    SortToken sortToken = new SortToken();
    if (paramString != null && paramString.length() > 0) {
      String[] arrayOfString = paramString.replace(" ", "").split("[\\u4E00-\\u9FA5]+");
      int i = arrayOfString.length;
      for (byte b = 0; b < i; b++) {
        if (arrayOfString[b].length() > 0) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(sortToken.b);
          stringBuilder.append(arrayOfString[b].charAt(0));
          sortToken.b = stringBuilder.toString();
          stringBuilder = new StringBuilder();
          stringBuilder.append(sortToken.c);
          stringBuilder.append(arrayOfString[b]);
          sortToken.c = stringBuilder.toString();
        } 
      } 
    } 
    return sortToken;
  }
  
  public static byte[] g(String paramString) {
    try {
      byte[] arrayOfByte = new byte[1024];
      File file = new File();
      this(paramString);
      if (!file.exists())
        return null; 
      FileInputStream fileInputStream = new FileInputStream();
      this(file);
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      while (true) {
        int i = fileInputStream.read(arrayOfByte);
        if (i != -1) {
          byteArrayOutputStream.write(arrayOfByte, 0, i);
          continue;
        } 
        return byteArrayOutputStream.toByteArray();
      } 
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public static void h(Activity paramActivity, int paramInt) {
    Intent intent = new Intent("android.intent.action.GET_CONTENT");
    intent.setType("video/*");
    intent.addCategory("android.intent.category.OPENABLE");
    paramActivity.startActivityForResult(intent, paramInt);
  }
  
  @TargetApi(21)
  private static void i(Context paramContext) {
    MediaSessionManager mediaSessionManager = (MediaSessionManager)paramContext.getSystemService("media_session");
    if (mediaSessionManager != null)
      try {
        ComponentName componentName = new ComponentName();
        this(paramContext, NLService.class);
        Iterator<MediaController> iterator = mediaSessionManager.getActiveSessions(componentName).iterator();
        while (iterator.hasNext()) {
          MediaController mediaController = iterator.next();
          if ("com.android.server.telecom".equals(mediaController.getPackageName())) {
            KeyEvent keyEvent = new KeyEvent();
            this(0, 79);
            mediaController.dispatchMediaButtonEvent(keyEvent);
            keyEvent = new KeyEvent();
            this(1, 79);
            mediaController.dispatchMediaButtonEvent(keyEvent);
            break;
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  static {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder.append("/CallScreen/Video/");
    a = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder.append("/CallScreen/Audio/");
    b = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(EZCallApplication.c().getExternalFilesDir(""));
    stringBuilder.append("/CallScreen/Audio/diy.aac");
    c = stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */