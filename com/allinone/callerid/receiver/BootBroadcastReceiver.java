package com.allinone.callerid.receiver;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import com.allinone.callerid.service.DaemonService;
import com.allinone.callerid.service.MyService;
import com.allinone.callerid.util.q;

public class BootBroadcastReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    try {
      if ("android.intent.action.BOOT_COMPLETED".equals(paramIntent.getAction())) {
        q.b().c("action_boot_completed");
        int i = Build.VERSION.SDK_INT;
        if (i > 20) {
          if (i > 25) {
            Intent intent = new Intent();
            this(paramContext.getApplicationContext(), MyService.class);
            Context context = paramContext.getApplicationContext();
            a a = new a();
            this(this, paramContext);
            context.bindService(intent, a, 1);
          } else {
            Context context = paramContext.getApplicationContext();
            Intent intent = new Intent();
            this(paramContext.getApplicationContext(), MyService.class);
            context.startService(intent);
          } 
        } else {
          Context context = paramContext.getApplicationContext();
          Intent intent = new Intent();
          this(paramContext.getApplicationContext(), DaemonService.class);
          context.startService(intent);
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a implements ServiceConnection {
    a(BootBroadcastReceiver this$0, Context param1Context) {}
    
    public void onServiceConnected(ComponentName param1ComponentName, IBinder param1IBinder) {
      if (param1IBinder instanceof com.allinone.callerid.service.a) {
        MyService myService = ((com.allinone.callerid.service.a)param1IBinder).a();
        if (myService != null)
          myService.a(); 
      } 
      this.a.getApplicationContext().unbindService(this);
    }
    
    public void onServiceDisconnected(ComponentName param1ComponentName) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/receiver/BootBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */