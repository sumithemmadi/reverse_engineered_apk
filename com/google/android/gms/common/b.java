package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import androidx.core.app.i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import c.c.a.a.a.c;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.base.e;

public class b extends c {
  private static final Object c = new Object();
  
  private static final b d = new b();
  
  public static final int e = c.a;
  
  private String f;
  
  public static b n() {
    return d;
  }
  
  public static Dialog q(Activity paramActivity, DialogInterface.OnCancelListener paramOnCancelListener) {
    ProgressBar progressBar = new ProgressBar((Context)paramActivity, null, 16842874);
    progressBar.setIndeterminate(true);
    progressBar.setVisibility(0);
    AlertDialog.Builder builder = new AlertDialog.Builder((Context)paramActivity);
    builder.setView((View)progressBar);
    builder.setMessage(f.d((Context)paramActivity, 18));
    builder.setPositiveButton("", null);
    AlertDialog alertDialog = builder.create();
    t(paramActivity, (Dialog)alertDialog, "GooglePlayServicesUpdatingDialog", paramOnCancelListener);
    return (Dialog)alertDialog;
  }
  
  static Dialog r(Context paramContext, int paramInt, g paramg, DialogInterface.OnCancelListener paramOnCancelListener) {
    AlertDialog.Builder builder1 = null;
    if (paramInt == 0)
      return null; 
    TypedValue typedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(16843529, typedValue, true);
    if ("Theme.Dialog.Alert".equals(paramContext.getResources().getResourceEntryName(typedValue.resourceId)))
      builder1 = new AlertDialog.Builder(paramContext, 5); 
    AlertDialog.Builder builder2 = builder1;
    if (builder1 == null)
      builder2 = new AlertDialog.Builder(paramContext); 
    builder2.setMessage(f.d(paramContext, paramInt));
    if (paramOnCancelListener != null)
      builder2.setOnCancelListener(paramOnCancelListener); 
    String str2 = f.c(paramContext, paramInt);
    if (str2 != null)
      builder2.setPositiveButton(str2, (DialogInterface.OnClickListener)paramg); 
    String str1 = f.g(paramContext, paramInt);
    if (str1 != null)
      builder2.setTitle(str1); 
    return (Dialog)builder2.create();
  }
  
  static void t(Activity paramActivity, Dialog paramDialog, String paramString, DialogInterface.OnCancelListener paramOnCancelListener) {
    FragmentManager fragmentManager1;
    if (paramActivity instanceof FragmentActivity) {
      fragmentManager1 = ((FragmentActivity)paramActivity).s();
      h.f2(paramDialog, paramOnCancelListener).e2(fragmentManager1, paramString);
      return;
    } 
    FragmentManager fragmentManager = fragmentManager1.getFragmentManager();
    ErrorDialogFragment.a(paramDialog, paramOnCancelListener).show(fragmentManager, paramString);
  }
  
  @TargetApi(20)
  private final void v(Context paramContext, int paramInt, String paramString, PendingIntent paramPendingIntent) {
    if (paramInt == 18) {
      u(paramContext);
      return;
    } 
    if (paramPendingIntent == null) {
      if (paramInt == 6)
        Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead."); 
      return;
    } 
    String str = f.f(paramContext, paramInt);
    paramString = f.e(paramContext, paramInt);
    Resources resources = paramContext.getResources();
    NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
    i.e e = (new i.e(paramContext)).q(true).f(true).k(str).x((i.f)(new i.c()).h(paramString));
    if (i.d(paramContext)) {
      t.m(o.g());
      e.v((paramContext.getApplicationInfo()).icon).t(2);
      if (i.f(paramContext)) {
        e.a(c.c.a.a.a.b.common_full_open_on_phone, resources.getString(c.common_open_on_phone), paramPendingIntent);
      } else {
        e.i(paramPendingIntent);
      } 
    } else {
      e.v(17301642).y(resources.getString(c.common_google_play_services_notification_ticker)).B(System.currentTimeMillis()).i(paramPendingIntent).j(paramString);
    } 
    if (o.k()) {
      t.m(o.k());
      String str1 = y();
      paramString = str1;
      if (str1 == null) {
        str1 = "com.google.android.gms.availability";
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String str2 = f.b(paramContext);
        if (notificationChannel == null) {
          notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", str2, 4));
          paramString = str1;
        } else {
          paramString = str1;
          if (!str2.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(str2);
            notificationManager.createNotificationChannel(notificationChannel);
            paramString = str1;
          } 
        } 
      } 
      e.g(paramString);
    } 
    Notification notification = e.b();
    if (paramInt != 1 && paramInt != 2 && paramInt != 3) {
      paramInt = 39789;
    } else {
      paramInt = 10436;
      e.d.set(false);
    } 
    notificationManager.notify(paramInt, notification);
  }
  
  private final String y() {
    synchronized (c) {
      return this.f;
    } 
  }
  
  public Intent b(Context paramContext, int paramInt, String paramString) {
    return super.b(paramContext, paramInt, paramString);
  }
  
  public PendingIntent c(Context paramContext, int paramInt1, int paramInt2) {
    return super.c(paramContext, paramInt1, paramInt2);
  }
  
  public final String e(int paramInt) {
    return super.e(paramInt);
  }
  
  public int g(Context paramContext) {
    return super.g(paramContext);
  }
  
  public int h(Context paramContext, int paramInt) {
    return super.h(paramContext, paramInt);
  }
  
  public final boolean j(int paramInt) {
    return super.j(paramInt);
  }
  
  public Dialog l(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener) {
    return r((Context)paramActivity, paramInt1, g.a(paramActivity, b((Context)paramActivity, paramInt1, "d"), paramInt2), paramOnCancelListener);
  }
  
  public PendingIntent m(Context paramContext, ConnectionResult paramConnectionResult) {
    return paramConnectionResult.r0() ? paramConnectionResult.q0() : c(paramContext, paramConnectionResult.o0(), 0);
  }
  
  public boolean o(Activity paramActivity, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener) {
    Dialog dialog = l(paramActivity, paramInt1, paramInt2, paramOnCancelListener);
    if (dialog == null)
      return false; 
    t(paramActivity, dialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public void p(Context paramContext, int paramInt) {
    v(paramContext, paramInt, null, d(paramContext, paramInt, 0, "n"));
  }
  
  public final zabq s(Context paramContext, a0 parama0) {
    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
    intentFilter.addDataScheme("package");
    zabq zabq = new zabq(parama0);
    paramContext.registerReceiver((BroadcastReceiver)zabq, intentFilter);
    zabq.b(paramContext);
    if (!i(paramContext, "com.google.android.gms")) {
      parama0.a();
      zabq.a();
      return null;
    } 
    return zabq;
  }
  
  final void u(Context paramContext) {
    (new a(this, paramContext)).sendEmptyMessageDelayed(1, 120000L);
  }
  
  public final boolean w(Activity paramActivity, h paramh, int paramInt1, int paramInt2, DialogInterface.OnCancelListener paramOnCancelListener) {
    Dialog dialog = r((Context)paramActivity, paramInt1, g.b(paramh, b((Context)paramActivity, paramInt1, "d"), 2), paramOnCancelListener);
    if (dialog == null)
      return false; 
    t(paramActivity, dialog, "GooglePlayServicesErrorDialog", paramOnCancelListener);
    return true;
  }
  
  public final boolean x(Context paramContext, ConnectionResult paramConnectionResult, int paramInt) {
    PendingIntent pendingIntent = m(paramContext, paramConnectionResult);
    if (pendingIntent != null) {
      v(paramContext, paramConnectionResult.o0(), null, GoogleApiActivity.a(paramContext, pendingIntent, paramInt));
      return true;
    } 
    return false;
  }
  
  @SuppressLint({"HandlerLeak"})
  private final class a extends e {
    private final Context a;
    
    public a(b this$0, Context param1Context) {
      super(looper);
      Looper looper;
      this.a = param1Context.getApplicationContext();
    }
    
    public final void handleMessage(Message param1Message) {
      int i = param1Message.what;
      if (i != 1) {
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("Don't know how to handle this message: ");
        stringBuilder.append(i);
        Log.w("GoogleApiAvailability", stringBuilder.toString());
      } else {
        i = this.b.g(this.a);
        if (this.b.j(i))
          this.b.p(this.a, i); 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */