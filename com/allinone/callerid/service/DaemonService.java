package com.allinone.callerid.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import c.a.a.b;

public class DaemonService extends Service {
  public IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public void onCreate() {
    super.onCreate();
    b.b((Context)this, DaemonService.class, 60);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    startService(new Intent(getApplicationContext(), MyService.class));
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/DaemonService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */