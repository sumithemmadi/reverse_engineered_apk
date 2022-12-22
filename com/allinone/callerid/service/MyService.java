package com.allinone.callerid.service;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.core.app.i;
import com.allinone.callerid.receiver.PhoneStateReceiver;
import com.allinone.callerid.start.PushControlActivity;
import com.allinone.callerid.util.b0;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;

public class MyService extends Service {
  private boolean b;
  
  private final a c = new a();
  
  private PhoneStateReceiver d;
  
  private void b() {
    try {
      AlarmManager alarmManager = (AlarmManager)getSystemService("alarm");
      Intent intent = new Intent();
      this((Context)getApplication(), MyService.class);
      PendingIntent pendingIntent = PendingIntent.getService(getApplicationContext(), 1024, intent, 134217728);
      alarmManager.cancel(pendingIntent);
      alarmManager.setInexactRepeating(2, SystemClock.elapsedRealtime() + 30000L, 30000L, pendingIntent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void a() {
    if (Build.VERSION.SDK_INT >= 26) {
      if (d0.a)
        d0.a("tony", "NotificationManager"); 
      androidx.core.content.a.l((Context)this, new Intent((Context)this, MyService.class));
      NotificationManager notificationManager = (NotificationManager)getSystemService("notification");
      if (notificationManager != null) {
        NotificationChannel notificationChannel = new NotificationChannel("com.allinone.callerid_notfication_N", getString(2131755094), 1);
        notificationChannel.setShowBadge(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setVibrationPattern(new long[] { 0L });
        notificationManager.createNotificationChannel(notificationChannel);
        i.e e = new i.e((Context)this, "com.allinone.callerid_notfication_N");
        Intent intent = new Intent((Context)this, PushControlActivity.class);
        intent.addFlags(268435456);
        e.i(PendingIntent.getActivity((Context)this, 0, intent, 134217728));
        e.k(getString(2131755741));
        e.v(2131231332);
        e.h(getResources().getColor(2131099706));
        startForeground(977, e.b());
      } 
    } 
  }
  
  public IBinder onBind(Intent paramIntent) {
    this.c.b(this);
    return (IBinder)this.c;
  }
  
  public void onCreate() {
    super.onCreate();
    if (d0.a)
      d0.a("tony", "MyService_onCreate"); 
    a();
    this.b = true;
    IntentFilter intentFilter = new IntentFilter();
    intentFilter.setPriority(1000);
    intentFilter.addAction("android.intent.action.NEW_OUTGOING_CALL");
    intentFilter.addAction("android.intent.action.PHONE_STATE");
    PhoneStateReceiver phoneStateReceiver = new PhoneStateReceiver();
    this.d = phoneStateReceiver;
    registerReceiver((BroadcastReceiver)phoneStateReceiver, intentFilter);
    int i = Build.VERSION.SDK_INT;
    if (i < 28)
      b0.b().c(getApplicationContext()); 
    if (i < 23)
      b(); 
  }
  
  public void onDestroy() {
    super.onDestroy();
    try {
      if (d0.a)
        d0.a("tony", "MyService_onDestroy"); 
      int i = Build.VERSION.SDK_INT;
      if (i < 28)
        b0.b().f(getApplicationContext()); 
      PhoneStateReceiver phoneStateReceiver = this.d;
      if (phoneStateReceiver != null)
        unregisterReceiver((BroadcastReceiver)phoneStateReceiver); 
      stopForeground(true);
      if (i >= 26) {
        Intent intent = new Intent();
        this(getApplicationContext(), MyService.class);
        Context context = getApplicationContext();
        a a1 = new a();
        this(this);
        context.bindService(intent, a1, 1);
      } else {
        Intent intent = new Intent();
        this((Context)this, MyService.class);
        startService(intent);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    if (d0.a)
      d0.a("tony", "onStartCommand"); 
    try {
      if (this.b) {
        paramInt1 = Build.VERSION.SDK_INT;
        if (paramInt1 < 18) {
          Notification notification = new Notification();
          this();
          startForeground(977, notification);
        } else if (paramInt1 < 26) {
          if (!i1.q0()) {
            Notification notification = new Notification();
            this();
            startForeground(977, notification);
            Intent intent = new Intent();
            this((Context)this, InnerService.class);
            startService(intent);
          } 
        } else {
          if (d0.a)
            d0.a("tony", "NotificationManager"); 
          NotificationManager notificationManager = (NotificationManager)getSystemService("notification");
          if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel();
            this("com.allinone.callerid_notfication_N", getString(2131755094), 1);
            notificationChannel.setShowBadge(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setVibrationPattern(new long[] { 0L });
            notificationManager.createNotificationChannel(notificationChannel);
            i.e e = new i.e();
            this((Context)this, "com.allinone.callerid_notfication_N");
            Intent intent = new Intent();
            this((Context)this, PushControlActivity.class);
            intent.addFlags(268435456);
            e.i(PendingIntent.getActivity((Context)this, 0, intent, 134217728));
            e.k(getString(2131755741));
            e.v(2131231332);
            e.h(getResources().getColor(2131099706));
            startForeground(977, e.b());
          } 
        } 
        this.b = false;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return 1;
  }
  
  public static class InnerService extends Service {
    public IBinder onBind(Intent param1Intent) {
      return null;
    }
    
    public int onStartCommand(Intent param1Intent, int param1Int1, int param1Int2) {
      startForeground(977, new Notification());
      stopForeground(true);
      stopSelf();
      return super.onStartCommand(param1Intent, param1Int1, param1Int2);
    }
  }
  
  class a implements ServiceConnection {
    a(MyService this$0) {}
    
    public void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      if (param1IBinder instanceof a) {
        MyService myService = ((a)param1IBinder).a();
        if (myService != null)
          myService.a(); 
      } 
      this.a.getApplicationContext().unbindService(this);
    }
    
    public void onServiceDisconnected(ComponentName param1ComponentName) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/MyService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */