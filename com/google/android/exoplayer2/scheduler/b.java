package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

public final class b {
  private final Context a;
  
  private final c b;
  
  private final Requirements c;
  
  private final Handler d;
  
  private b e;
  
  private int f;
  
  private d g;
  
  public b(Context paramContext, c paramc, Requirements paramRequirements) {
    this.a = paramContext.getApplicationContext();
    this.b = paramc;
    this.c = paramRequirements;
    this.d = new Handler(h0.D());
  }
  
  private void d() {
    int i = this.c.c(this.a);
    if (this.f != i) {
      this.f = i;
      this.b.a(this, i);
    } 
  }
  
  @TargetApi(24)
  private void f() {
    ConnectivityManager connectivityManager = (ConnectivityManager)e.e(this.a.getSystemService("connectivity"));
    d d1 = new d(null);
    this.g = d1;
    connectivityManager.registerDefaultNetworkCallback(d1);
  }
  
  @TargetApi(24)
  private void i() {
    ((ConnectivityManager)this.a.getSystemService("connectivity")).unregisterNetworkCallback((ConnectivityManager.NetworkCallback)e.e(this.g));
    this.g = null;
  }
  
  public Requirements e() {
    return this.c;
  }
  
  public int g() {
    this.f = this.c.c(this.a);
    IntentFilter intentFilter = new IntentFilter();
    if (this.c.i())
      if (h0.a >= 24) {
        f();
      } else {
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      }  
    if (this.c.d()) {
      intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
      intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    } 
    if (this.c.g())
      if (h0.a >= 23) {
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
      } else {
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
      }  
    b b1 = new b(null);
    this.e = b1;
    this.a.registerReceiver(b1, intentFilter, null, this.d);
    return this.f;
  }
  
  public void h() {
    this.a.unregisterReceiver((BroadcastReceiver)e.e(this.e));
    this.e = null;
    if (h0.a >= 24 && this.g != null)
      i(); 
  }
  
  private class b extends BroadcastReceiver {
    private b(b this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (!isInitialStickyBroadcast())
        b.a(this.a); 
    }
  }
  
  public static interface c {
    void a(b param1b, int param1Int);
  }
  
  private final class d extends ConnectivityManager.NetworkCallback {
    boolean a;
    
    boolean b;
    
    private d(b this$0) {}
    
    private void c() {
      b.b(this.c).post(new a(this));
    }
    
    public void onAvailable(Network param1Network) {
      c();
    }
    
    public void onCapabilitiesChanged(Network param1Network, NetworkCapabilities param1NetworkCapabilities) {
      boolean bool = param1NetworkCapabilities.hasCapability(16);
      if (!this.a || this.b != bool) {
        this.a = true;
        this.b = bool;
        c();
      } 
    }
    
    public void onLost(Network param1Network) {
      c();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/scheduler/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */