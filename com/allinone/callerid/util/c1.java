package com.allinone.callerid.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.provider.CallLog;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListAdapter;
import com.allinone.callerid.b.v;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import java.util.List;

public class c1 {
  public static int a;
  
  public static boolean b;
  
  public static Uri c;
  
  public static String d;
  
  private static Cursor e;
  
  private static List<PhoneAccountHandle> f;
  
  private static TelecomManager g;
  
  public static void a(Boolean paramBoolean, CallLogBean paramCallLogBean, Context paramContext) {
    try {
      Intent intent;
      int i = Build.VERSION.SDK_INT;
      if (i >= 23 && androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_PHONE_STATE") == 0) {
        TelecomManager telecomManager = (TelecomManager)paramContext.getSystemService("telecom");
        g = telecomManager;
        f = telecomManager.getCallCapablePhoneAccounts();
      } 
      if (paramBoolean.booleanValue()) {
        if (androidx.core.content.a.a(paramContext, "android.permission.CALL_PHONE") == 0) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("tel:");
          stringBuilder.append(paramCallLogBean.p());
          Uri uri = Uri.parse(stringBuilder.toString());
          intent = new Intent();
          this("android.intent.action.CALL", uri);
          intent.setFlags(268435456);
          if (i >= 23) {
            intent.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", (Parcelable)f.get(0));
            paramContext.startActivity(intent);
          } 
        } 
      } else {
        q0.a(paramContext, intent.p());
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Boolean paramBoolean, CallLogBean paramCallLogBean, Context paramContext) {
    try {
      List<PhoneAccountHandle> list;
      int i = Build.VERSION.SDK_INT;
      if (i >= 23 && androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_PHONE_STATE") == 0) {
        TelecomManager telecomManager = (TelecomManager)paramContext.getSystemService("telecom");
        g = telecomManager;
        f = telecomManager.getCallCapablePhoneAccounts();
      } 
      if (paramBoolean.booleanValue()) {
        if (androidx.core.content.a.a(paramContext, "android.permission.CALL_PHONE") == 0) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("tel:");
          stringBuilder.append(paramCallLogBean.p());
          Uri uri = Uri.parse(stringBuilder.toString());
          Intent intent = new Intent();
          this("android.intent.action.CALL", uri);
          intent.setFlags(268435456);
          if (i >= 23) {
            list = f;
            if (list != null && list.size() > 1) {
              intent.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", (Parcelable)f.get(1));
              paramContext.startActivity(intent);
            } 
          } 
        } 
      } else {
        q0.a(paramContext, list.p());
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static Boolean c(Activity paramActivity) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21) {
      int j = androidx.core.content.a.a((Context)paramActivity, "android.permission.READ_PHONE_STATE");
      if (i >= 16) {
        i = androidx.core.content.a.a((Context)paramActivity, "android.permission.READ_CALL_LOG");
      } else {
        i = 0;
      } 
      int k = androidx.core.content.a.a((Context)paramActivity, "android.permission.CALL_PHONE");
      int m = androidx.core.content.a.a((Context)paramActivity, "android.permission.READ_CONTACTS");
      if (j == 0 && i == 0 && k == 0 && m == 0) {
        if (h((Context)EZCallApplication.c())) {
          q.b().c("is_doublesim");
          b = true;
        } else if (!h((Context)EZCallApplication.c())) {
          q.b().c("no_doublesim");
          b = false;
        } 
        return Boolean.valueOf(b);
      } 
      return Boolean.FALSE;
    } 
    return Boolean.FALSE;
  }
  
  public static void d(Context paramContext, int paramInt, String paramString) {
    Intent intent;
    int i = Build.VERSION.SDK_INT;
    if (i >= 23 && androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_PHONE_STATE") == 0) {
      TelecomManager telecomManager = (TelecomManager)paramContext.getSystemService("telecom");
      g = telecomManager;
      f = telecomManager.getCallCapablePhoneAccounts();
    } 
    if (i >= 21) {
      try {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("tel:");
        stringBuilder.append(Uri.encode(paramString));
        Uri uri = Uri.parse(stringBuilder.toString());
        Intent intent1 = new Intent();
        this("android.intent.action.CALL", uri);
        intent1.setFlags(268435456);
        intent = intent1;
        if (i >= 23) {
          intent1.putExtra("android.telecom.extra.PHONE_ACCOUNT_HANDLE", (Parcelable)f.get(paramInt));
          intent = intent1;
        } 
        paramContext.startActivity(intent);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } else {
      Intent intent1 = new Intent();
      this("android.intent.action.CALL");
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append("tel:");
      stringBuilder.append(Uri.encode((String)intent));
      intent1.setData(Uri.parse(stringBuilder.toString()));
      intent = intent1;
      exception.startActivity(intent);
    } 
  }
  
  private static String e() {
    return Build.MANUFACTURER;
  }
  
  public static String f(Cursor paramCursor) {
    e = paramCursor;
    try {
      if (k()) {
        int i = e.getColumnIndex("sim_id");
        if (i != -1)
          d = e.getString(i); 
      } else if (j()) {
        int i = e.getColumnIndex("simid");
        if (i != -1)
          d = e.getString(i); 
      } else if (i()) {
        int i = e.getColumnIndex("subscription_id");
        if (i != -1)
          d = e.getString(i); 
      } else {
        d = "4";
      } 
    } catch (Exception exception) {}
    return d;
  }
  
  public static Uri g() {
    if (23 <= Build.VERSION.SDK_INT && k()) {
      c = Uri.parse("content://logs/call");
    } else {
      c = CallLog.Calls.CONTENT_URI;
    } 
    return c;
  }
  
  public static boolean h(Context paramContext) {
    if (Build.VERSION.SDK_INT >= 22 && androidx.core.content.a.a(paramContext, "android.permission.READ_PHONE_STATE") == 0) {
      int i = SubscriptionManager.from(paramContext).getActiveSubscriptionInfoCount();
      a = i;
      if (i == 2)
        return true; 
    } 
    return false;
  }
  
  public static boolean i() {
    return e().equals("HUAWEI");
  }
  
  public static boolean j() {
    return e().equals("Meizu");
  }
  
  public static boolean k() {
    return e().equals("samsung");
  }
  
  public static boolean l() {
    return e().equals("Xiaomi");
  }
  
  public static void m(Context paramContext, String paramString) {
    q.b().c(h1.j);
    if (androidx.core.content.a.a(paramContext, "android.permission.READ_PHONE_STATE") == 0) {
      List list = SubscriptionManager.from(paramContext).getActiveSubscriptionInfoList();
      View view = LayoutInflater.from(paramContext).inflate(2131493171, null, false);
      CheckBox checkBox = (CheckBox)view.findViewById(2131296549);
      checkBox.setOnClickListener(new a(checkBox));
      String str = paramContext.getResources().getString(2131755163);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("'");
      stringBuilder.append(paramString);
      stringBuilder.append("'");
      str = str.replace("X", stringBuilder.toString());
      AlertDialog.Builder builder = new AlertDialog.Builder(paramContext);
      builder.setCancelable(true);
      builder.setTitle(str);
      builder.setView(view);
      builder.setAdapter((ListAdapter)new v(paramContext, list), new b(paramContext, paramString));
      builder.show();
    } 
  }
  
  static final class a implements View.OnClickListener {
    a(CheckBox param1CheckBox) {}
    
    public void onClick(View param1View) {
      if (this.b.isChecked()) {
        this.b.setChecked(true);
        b1.m1(true);
        q.b().c(h1.m);
      } else {
        this.b.setChecked(false);
        b1.m1(false);
      } 
    }
  }
  
  static final class b implements DialogInterface.OnClickListener {
    b(Context param1Context, String param1String) {}
    
    public void onClick(DialogInterface param1DialogInterface, int param1Int) {
      if (b1.H())
        b1.U0(param1Int); 
      c1.d(this.b, param1Int, this.c);
      if (param1Int == 0) {
        q.b().c(h1.k);
      } else {
        q.b().c(h1.l);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */