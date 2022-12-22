package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.p.j;

final class e implements c {
  private final Context b;
  
  final c.a c;
  
  boolean d;
  
  private boolean e;
  
  private final BroadcastReceiver f = new a(this);
  
  e(Context paramContext, c.a parama) {
    this.b = paramContext.getApplicationContext();
    this.c = parama;
  }
  
  private void j() {
    if (this.e)
      return; 
    this.d = i(this.b);
    try {
      Context context = this.b;
      BroadcastReceiver broadcastReceiver = this.f;
      IntentFilter intentFilter = new IntentFilter();
      this("android.net.conn.CONNECTIVITY_CHANGE");
      context.registerReceiver(broadcastReceiver, intentFilter);
      this.e = true;
    } catch (SecurityException securityException) {
      if (Log.isLoggable("ConnectivityMonitor", 5))
        Log.w("ConnectivityMonitor", "Failed to register", securityException); 
    } 
  }
  
  private void k() {
    if (!this.e)
      return; 
    this.b.unregisterReceiver(this.f);
    this.e = false;
  }
  
  public void X() {
    k();
  }
  
  @SuppressLint({"MissingPermission"})
  boolean i(Context paramContext) {
    ConnectivityManager connectivityManager = (ConnectivityManager)j.d(paramContext.getSystemService("connectivity"));
    boolean bool = true;
    try {
      NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
      if (networkInfo == null || !networkInfo.isConnected())
        bool = false; 
      return bool;
    } catch (RuntimeException runtimeException) {
      if (Log.isLoggable("ConnectivityMonitor", 5))
        Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", runtimeException); 
      return true;
    } 
  }
  
  public void onDestroy() {}
  
  public void onStart() {
    j();
  }
  
  class a extends BroadcastReceiver {
    a(e this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      e e1 = this.a;
      boolean bool = e1.d;
      e1.d = e1.i(param1Context);
      if (bool != this.a.d) {
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("connectivity changed, isConnected: ");
          stringBuilder.append(this.a.d);
          Log.d("ConnectivityMonitor", stringBuilder.toString());
        } 
        e e2 = this.a;
        e2.c.a(e2.d);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */