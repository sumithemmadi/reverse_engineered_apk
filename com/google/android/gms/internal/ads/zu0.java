package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.i;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.w.a;
import com.google.android.gms.common.util.o;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.HashMap;
import java.util.Map;

public final class zu0 extends se {
  private final Context b;
  
  private final jo0 c;
  
  private final em d;
  
  private final pu0 e;
  
  private final pm1 f;
  
  public zu0(Context paramContext, pu0 parampu0, em paramem, jo0 paramjo0, pm1 parampm1) {
    this.b = paramContext;
    this.c = paramjo0;
    this.d = paramem;
    this.e = parampu0;
    this.f = parampm1;
  }
  
  public static void T9(Activity paramActivity, f paramf, g0 paramg0, pu0 parampu0, jo0 paramjo0, pm1 parampm1, String paramString1, String paramString2) {
    String str1;
    String str2;
    q.c();
    AlertDialog.Builder builder2 = h1.S((Context)paramActivity, q.e().r());
    Resources resources = q.g().b();
    if (resources == null) {
      str2 = "Open ad when you're back online.";
    } else {
      str2 = resources.getString(a.offline_opt_in_title);
    } 
    AlertDialog.Builder builder3 = builder2.setTitle(str2);
    if (resources == null) {
      str2 = "We'll send you a notification with a link to the advertiser site.";
    } else {
      str2 = resources.getString(a.offline_opt_in_message);
    } 
    builder3 = builder3.setMessage(str2);
    if (resources == null) {
      str2 = "OK";
    } else {
      str2 = resources.getString(a.offline_opt_in_confirm);
    } 
    AlertDialog.Builder builder1 = builder3.setPositiveButton(str2, new cv0(paramjo0, paramActivity, parampm1, parampu0, paramString1, paramg0, paramString2, resources, paramf));
    if (resources == null) {
      str1 = "No thanks";
    } else {
      str1 = resources.getString(a.offline_opt_in_decline);
    } 
    builder1.setNegativeButton(str1, new bv0(parampu0, paramString1, paramjo0, paramActivity, parampm1, paramf)).setOnCancelListener(new ev0(parampu0, paramString1, paramjo0, paramActivity, parampm1, paramf));
    builder2.create().show();
  }
  
  public static void U9(Context paramContext, jo0 paramjo0, pm1 parampm1, pu0 parampu0, String paramString1, String paramString2) {
    V9(paramContext, paramjo0, parampm1, parampu0, paramString1, paramString2, new HashMap<String, String>());
  }
  
  public static void V9(Context paramContext, jo0 paramjo0, pm1 parampm1, pu0 parampu0, String paramString1, String paramString2, Map<String, String> paramMap) {
    String str1;
    x<Boolean> x = m0.c6;
    boolean bool = ((Boolean)er2.e().<Boolean>c(x)).booleanValue();
    String str2 = "online";
    if (bool) {
      rm1 rm12 = rm1.d(paramString2).i("gqi", paramString1);
      q.c();
      if (!h1.O(paramContext))
        str2 = "offline"; 
      rm1 rm11 = rm12.i("device_connectivity", str2).i("event_timestamp", String.valueOf(q.j().a()));
      for (Map.Entry<String, String> entry : paramMap.entrySet())
        rm11.i((String)entry.getKey(), (String)entry.getValue()); 
      str1 = parampm1.a(rm11);
    } else {
      mo0 mo0 = entry.b();
      mo0.h("gqi", paramString1);
      mo0.h("action", paramString2);
      q.c();
      if (!h1.O((Context)str1))
        str2 = "offline"; 
      mo0.h("device_connectivity", str2);
      mo0.h("event_timestamp", String.valueOf(q.j().a()));
      for (Map.Entry<String, String> entry1 : paramMap.entrySet())
        mo0.h((String)entry1.getKey(), (String)entry1.getValue()); 
      str1 = mo0.d();
    } 
    parampu0.o(new av0(q.j().a(), paramString1, str1, qu0.b));
  }
  
  private final void W9(String paramString1, String paramString2, Map<String, String> paramMap) {
    V9(this.b, this.c, this.f, this.e, paramString1, paramString2, paramMap);
  }
  
  public final void A3() {
    this.e.l(this.d);
  }
  
  public final void O7(a parama, String paramString1, String paramString2) {
    String str;
    int i;
    Context context = (Context)b.o1(parama);
    if (o.i()) {
      i = 1140850688;
    } else {
      i = 1073741824;
    } 
    Intent intent = new Intent();
    intent.setClass(context, AdService.class);
    intent.setAction("offline_notification_clicked");
    intent.putExtra("offline_notification_action", "offline_notification_clicked");
    intent.putExtra("gws_query_id", paramString2);
    intent.putExtra("uri", paramString1);
    PendingIntent pendingIntent1 = zp1.a(context, 0, intent, i);
    intent = new Intent();
    intent.setClass(context, AdService.class);
    intent.setAction("offline_notification_dismissed");
    intent.putExtra("offline_notification_action", "offline_notification_dismissed");
    intent.putExtra("gws_query_id", paramString2);
    PendingIntent pendingIntent2 = zp1.a(context, 0, intent, i);
    Resources resources = q.g().b();
    i.e e2 = new i.e(context, "offline_notification_channel");
    if (resources == null) {
      str = "View the ad you saved when you were offline";
    } else {
      str = resources.getString(a.offline_notification_title);
    } 
    e2 = e2.k(str);
    if (resources == null) {
      str = "Tap to open ad";
    } else {
      str = resources.getString(a.offline_notification_text);
    } 
    i.e e1 = e2.j(str).f(true).m(pendingIntent2).i(pendingIntent1).v((context.getApplicationInfo()).icon);
    ((NotificationManager)context.getSystemService("notification")).notify(paramString2, 54321, e1.b());
    W9(paramString2, "offline_notification_impression", new HashMap<String, String>());
  }
  
  public final void g1(Intent paramIntent) {
    String str1 = paramIntent.getStringExtra("offline_notification_action");
    if (!str1.equals("offline_notification_clicked") && !str1.equals("offline_notification_dismissed"))
      return; 
    String str2 = paramIntent.getStringExtra("gws_query_id");
    String str3 = paramIntent.getStringExtra("uri");
    q.c();
    boolean bool = h1.O(this.b);
    int i = fv0.b;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    if (str1.equals("offline_notification_clicked")) {
      hashMap.put("offline_notification_action", "offline_notification_clicked");
      if (bool)
        i = fv0.a; 
      hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
      hashMap.put("olaih", String.valueOf(str3.startsWith("http")));
      try {
        Context context = this.b;
        Intent intent = context.getPackageManager().getLaunchIntentForPackage(str3);
        paramIntent = intent;
        if (intent == null) {
          paramIntent = new Intent();
          this("android.intent.action.VIEW");
          paramIntent.setData(Uri.parse(str3));
        } 
        paramIntent.addFlags(268435456);
        context.startActivity(paramIntent);
        hashMap.put("olaa", "olas");
      } catch (ActivityNotFoundException activityNotFoundException) {
        hashMap.put("olaa", "olaf");
      } 
    } else {
      hashMap.put("offline_notification_action", "offline_notification_dismissed");
    } 
    W9(str2, "offline_notification_action", (Map)hashMap);
    try {
      SQLiteDatabase sQLiteDatabase = this.e.getWritableDatabase();
      if (i == fv0.a) {
        this.e.g(sQLiteDatabase, this.d, str2);
        return;
      } 
      pu0.h(sQLiteDatabase, str2);
      return;
    } catch (SQLiteException sQLiteException) {
      str1 = String.valueOf(sQLiteException);
      StringBuilder stringBuilder = new StringBuilder(str1.length() + 51);
      stringBuilder.append("Failed to get writable offline buffering database: ");
      stringBuilder.append(str1);
      cm.g(stringBuilder.toString());
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */