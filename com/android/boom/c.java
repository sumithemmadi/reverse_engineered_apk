package com.android.boom;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class c {
  public static boolean a(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 23) ? (Settings.canDrawOverlays(paramContext)) : true;
  }
  
  public static boolean b(Context paramContext) {
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
  
  public static String c(Context paramContext) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this("");
      File file = new File();
      this(paramContext.getFilesDir(), "dtyz.txt");
      FileInputStream fileInputStream = new FileInputStream();
      this(file);
      byte[] arrayOfByte = new byte[1024];
      for (int i = fileInputStream.read(arrayOfByte); i > 0; i = fileInputStream.read(arrayOfByte)) {
        String str = new String();
        this(arrayOfByte, 0, i);
        stringBuilder.append(str);
      } 
      fileInputStream.close();
      return stringBuilder.toString();
    } catch (Exception exception) {
      exception.printStackTrace();
      return "";
    } 
  }
  
  public static void d(Context paramContext, String paramString1, String paramString2) {
    if (paramContext != null)
      try {
        TextView textView = (TextView)LayoutInflater.from(paramContext).inflate(b.dialog_signature_track, null);
        textView.setText(paramString2);
        AlertDialog.Builder builder = new AlertDialog.Builder();
        this(paramContext);
        AlertDialog alertDialog = builder.setTitle(paramString1).setView((View)textView).setPositiveButton("OK", null).setCancelable(false).show();
        if (alertDialog != null) {
          Button button = alertDialog.getButton(-1);
          a a = new a();
          this(paramContext);
          button.setOnClickListener(a);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        System.exit(0);
      }  
  }
  
  public static void e(Context paramContext, String paramString) {
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
      try {
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("https://play.google.com/store/apps/details?id=");
        stringBuilder.append(paramString);
        this("android.intent.action.VIEW", Uri.parse(stringBuilder.toString()));
        intent.setFlags(268435456);
        paramContext.startActivity(intent);
      } catch (Exception exception1) {
        exception1.printStackTrace();
      } 
    } 
  }
  
  public static void f(Context paramContext, String paramString1, String paramString2) {
    if (paramContext != null)
      try {
        Handler handler = new Handler();
        this(Looper.getMainLooper());
        b b = new b();
        this(paramContext, paramString2, paramString1);
        handler.post(b);
      } catch (Exception exception) {
        exception.printStackTrace();
        System.exit(0);
      }  
  }
  
  public static void g(Context paramContext, String paramString) {
    try {
      File file = new File();
      this(paramContext.getFilesDir(), "dtyz.txt");
      if (file.exists())
        file.delete(); 
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file);
      fileOutputStream.write(paramString.getBytes());
      fileOutputStream.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static final class a implements View.OnClickListener {
    a(Context param1Context) {}
    
    public void onClick(View param1View) {
      Context context = this.b;
      c.e(context, context.getPackageName());
    }
  }
  
  static final class b implements Runnable {
    b(Context param1Context, String param1String1, String param1String2) {}
    
    public void run() {
      if (c.a(this.b)) {
        TextView textView = (TextView)LayoutInflater.from(this.b).inflate(b.dialog_signature_track, null);
        textView.setText(this.c);
        AlertDialog alertDialog = (new AlertDialog.Builder(this.b)).setTitle(this.d).setView((View)textView).setPositiveButton("OK", null).setCancelable(false).create();
        if (alertDialog != null) {
          if (alertDialog.getWindow() != null) {
            if (Build.VERSION.SDK_INT >= 26) {
              alertDialog.getWindow().setType(2038);
            } else {
              alertDialog.getWindow().setType(2003);
            } 
            alertDialog.show();
          } 
          alertDialog.getButton(-1).setOnClickListener(new a(this));
        } 
      } else {
        System.exit(0);
      } 
    }
    
    class a implements View.OnClickListener {
      a(c.b this$0) {}
      
      public void onClick(View param2View) {
        Context context = this.b.b;
        c.e(context, context.getPackageName());
        param2View.postDelayed(new a(this), 2000L);
      }
      
      class a implements Runnable {
        a(c.b.a this$0) {}
        
        public void run() {
          System.exit(0);
        }
      }
    }
    
    class a implements Runnable {
      a(c.b this$0) {}
      
      public void run() {
        System.exit(0);
      }
    }
  }
  
  class a implements View.OnClickListener {
    a(c this$0) {}
    
    public void onClick(View param1View) {
      Context context = this.b.b;
      c.e(context, context.getPackageName());
      param1View.postDelayed(new a(this), 2000L);
    }
    
    class a implements Runnable {
      a(c.b.a this$0) {}
      
      public void run() {
        System.exit(0);
      }
    }
  }
  
  class a implements Runnable {
    a(c this$0) {}
    
    public void run() {
      System.exit(0);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/boom/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */