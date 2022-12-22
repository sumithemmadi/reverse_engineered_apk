package com.allinone.callerid.util.k1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.telecom.TelecomManager;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.mvc.controller.permission.OverlayGuideActivity;
import com.allinone.callerid.util.d0;
import java.util.List;

public class a {
  private static final String[] a = new String[] { "android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.PROCESS_OUTGOING_CALLS" };
  
  private static final String[] b = new String[] { "android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.ANSWER_PHONE_CALLS", "android.permission.PROCESS_OUTGOING_CALLS" };
  
  private static final String[] c = new String[] { "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS" };
  
  public static final String[] d = new String[] { "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE" };
  
  private static String[] e = new String[] { "android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS" };
  
  private static String[] f = new String[] { "android.permission.READ_PHONE_STATE", "android.permission.READ_PHONE_NUMBERS", "android.permission.CALL_PHONE", "android.permission.ANSWER_PHONE_CALLS", "android.permission.READ_CALL_LOG", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS" };
  
  private static String[] g = new String[] { "android.permission.RECORD_AUDIO", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE" };
  
  public static boolean a(Context paramContext) {
    boolean bool;
    if (f() && e(paramContext) && h() && i(paramContext)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean b(Context paramContext, String paramString) {
    boolean bool;
    if (androidx.core.content.a.a(paramContext, paramString) == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean c(Context paramContext) {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i >= 23)
      if (b(paramContext, "android.permission.READ_CONTACTS") && b(paramContext, "android.permission.WRITE_CONTACTS") && b(paramContext, "android.permission.GET_ACCOUNTS")) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    return bool2;
  }
  
  public static boolean d(Context paramContext) {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = bool1;
    if (i >= 23) {
      if (i >= 28) {
        if (b(paramContext, "android.permission.CALL_PHONE") && b(paramContext, "android.permission.READ_PHONE_STATE") && b(paramContext, "android.permission.READ_CALL_LOG") && b(paramContext, "android.permission.ANSWER_PHONE_CALLS") && b(paramContext, "android.permission.PROCESS_OUTGOING_CALLS")) {
          bool3 = bool2;
        } else {
          bool3 = false;
        } 
        return bool3;
      } 
      if (b(paramContext, "android.permission.CALL_PHONE") && b(paramContext, "android.permission.READ_PHONE_STATE") && b(paramContext, "android.permission.READ_CALL_LOG") && b(paramContext, "android.permission.PROCESS_OUTGOING_CALLS")) {
        bool3 = bool1;
      } else {
        bool3 = false;
      } 
    } 
    return bool3;
  }
  
  public static boolean e(Context paramContext) {
    boolean bool;
    if (b(paramContext, "android.permission.READ_EXTERNAL_STORAGE") && b(paramContext, "android.permission.WRITE_EXTERNAL_STORAGE")) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static boolean f() {
    return (Build.VERSION.SDK_INT >= 23) ? (Settings.canDrawOverlays((Context)EZCallApplication.c())) : true;
  }
  
  public static boolean g(Context paramContext) {
    try {
      if (Build.VERSION.SDK_INT >= 23) {
        TelecomManager telecomManager = (TelecomManager)paramContext.getSystemService("telecom");
        if (telecomManager != null) {
          String str = telecomManager.getDefaultDialerPackage();
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("name:");
            stringBuilder.append(str);
            d0.a("default_dialer", stringBuilder.toString());
          } 
          return str.equals(paramContext.getPackageName());
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return false;
  }
  
  public static boolean h() {
    return (Build.VERSION.SDK_INT >= 21) ? (j()) : true;
  }
  
  public static boolean i(Context paramContext) {
    return (Build.VERSION.SDK_INT >= 23) ? Settings.System.canWrite(paramContext) : true;
  }
  
  public static boolean j() {
    boolean bool;
    String str1 = EZCallApplication.c().getPackageName();
    String str2 = Settings.Secure.getString(EZCallApplication.c().getContentResolver(), "enabled_notification_listeners");
    if (str2 != null) {
      bool = str2.contains(str1);
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static void k(Activity paramActivity, g paramg) {
    if (paramActivity != null)
      try {
        com.hjq.permissions.d d = com.hjq.permissions.d.d(paramActivity).b(c);
        c c = new c();
        this(paramg, paramActivity);
        d.c(c);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static void l(Activity paramActivity, g paramg) {
    if (paramActivity != null)
      try {
        com.hjq.permissions.d d = com.hjq.permissions.d.d(paramActivity).b(g);
        d d1 = new d();
        this(paramg, paramActivity);
        d.c(d1);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static void m(Activity paramActivity, g paramg) {
    if (paramActivity != null)
      try {
        String[] arrayOfString;
        com.hjq.permissions.d d = com.hjq.permissions.d.d(paramActivity);
        if (Build.VERSION.SDK_INT >= 28) {
          arrayOfString = f;
        } else {
          arrayOfString = e;
        } 
        d = d.b(arrayOfString);
        a a1 = new a();
        this(paramg, paramActivity);
        d.c(a1);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static void n(Context paramContext) {
    try {
      if (Build.VERSION.SDK_INT >= 23) {
        Handler handler = new Handler();
        this();
        f f = new f();
        this(paramContext);
        handler.postDelayed(f, 500L);
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("package:");
        stringBuilder.append(paramContext.getPackageName());
        this("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(stringBuilder.toString()));
        intent.setFlags(268435456);
        paramContext.startActivity(intent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void o(Activity paramActivity, g paramg) {
    if (paramActivity != null)
      try {
        String[] arrayOfString;
        com.hjq.permissions.d d1 = com.hjq.permissions.d.d(paramActivity);
        if (Build.VERSION.SDK_INT >= 28) {
          arrayOfString = b;
        } else {
          arrayOfString = a;
        } 
        com.hjq.permissions.d d2 = d1.b(arrayOfString);
        b b = new b();
        this(paramg, paramActivity);
        d2.c(b);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static void p(Activity paramActivity, g paramg) {
    if (paramActivity != null)
      try {
        com.hjq.permissions.d d = com.hjq.permissions.d.d(paramActivity).b(d);
        e e = new e();
        this(paramg, paramActivity);
        d.c(e);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static void q(Context paramContext) {
    if (Build.VERSION.SDK_INT >= 23) {
      Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("package:");
      stringBuilder.append(paramContext.getPackageName());
      intent.setData(Uri.parse(stringBuilder.toString()));
      intent.setFlags(268435456);
      paramContext.startActivity(intent);
    } 
  }
  
  static final class a implements com.hjq.permissions.a {
    a(a.g param1g, Activity param1Activity) {}
    
    public void a(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("quick:");
        stringBuilder.append(param1Boolean);
        stringBuilder.append(" denied:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean && (param1List.contains("android.permission.READ_PHONE_STATE") || param1List.contains("android.permission.CALL_PHONE") || param1List.contains("android.permission.READ_CALL_LOG") || param1List.contains("android.permission.PROCESS_OUTGOING_CALLS") || param1List.contains("android.permission.READ_CONTACTS") || param1List.contains("android.permission.WRITE_CONTACTS") || param1List.contains("android.permission.GET_ACCOUNTS")))
        com.hjq.permissions.d.a((Context)this.b); 
    }
    
    public void b(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("granted:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean)
        this.a.a(); 
    }
  }
  
  static final class b implements com.hjq.permissions.a {
    b(a.g param1g, Activity param1Activity) {}
    
    public void a(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("quick:");
        stringBuilder.append(param1Boolean);
        stringBuilder.append(" denied:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean)
        com.hjq.permissions.d.a((Context)this.b); 
    }
    
    public void b(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("granted:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean)
        this.a.a(); 
    }
  }
  
  static final class c implements com.hjq.permissions.a {
    c(a.g param1g, Activity param1Activity) {}
    
    public void a(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("quick:");
        stringBuilder.append(param1Boolean);
        stringBuilder.append(" denied:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean)
        com.hjq.permissions.d.a((Context)this.b); 
    }
    
    public void b(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("granted:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean)
        this.a.a(); 
    }
  }
  
  static final class d implements com.hjq.permissions.a {
    d(a.g param1g, Activity param1Activity) {}
    
    public void a(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("quick:");
        stringBuilder.append(param1Boolean);
        stringBuilder.append(" denied:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean && (param1List.contains("android.permission.RECORD_AUDIO") || param1List.contains("android.permission.READ_EXTERNAL_STORAGE") || param1List.contains("android.permission.WRITE_EXTERNAL_STORAGE")))
        com.hjq.permissions.d.a((Context)this.b); 
    }
    
    public void b(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("granted:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean)
        this.a.a(); 
    }
  }
  
  static final class e implements com.hjq.permissions.a {
    e(a.g param1g, Activity param1Activity) {}
    
    public void a(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("quick:");
        stringBuilder.append(param1Boolean);
        stringBuilder.append(" denied:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean && (param1List.contains("android.permission.READ_EXTERNAL_STORAGE") || param1List.contains("android.permission.WRITE_EXTERNAL_STORAGE")))
        com.hjq.permissions.d.a((Context)this.b); 
    }
    
    public void b(List<String> param1List, boolean param1Boolean) {
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("granted:");
        stringBuilder.append(param1List.toString());
        d0.a("wbb", stringBuilder.toString());
      } 
      if (param1Boolean)
        this.a.a(); 
    }
  }
  
  static final class f implements Runnable {
    f(Context param1Context) {}
    
    public void run() {
      Intent intent = new Intent(this.b, OverlayGuideActivity.class);
      intent.addFlags(268435456);
      this.b.startActivity(intent);
    }
  }
  
  public static interface g {
    void a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/k1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */