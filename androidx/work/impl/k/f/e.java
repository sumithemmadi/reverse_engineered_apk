package androidx.work.impl.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.f;
import androidx.work.impl.k.b;

public class e extends d<b> {
  static final String g = f.f("NetworkStateTracker");
  
  private final ConnectivityManager h = (ConnectivityManager)this.c.getSystemService("connectivity");
  
  private b i;
  
  private a j;
  
  public e(Context paramContext, androidx.work.impl.utils.j.a parama) {
    super(paramContext, parama);
    if (j()) {
      this.i = new b(this);
    } else {
      this.j = new a(this);
    } 
  }
  
  private boolean i() {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    if (i < 23)
      return false; 
    Network network = this.h.getActiveNetwork();
    NetworkCapabilities networkCapabilities = this.h.getNetworkCapabilities(network);
    boolean bool2 = bool1;
    if (networkCapabilities != null) {
      bool2 = bool1;
      if (networkCapabilities.hasCapability(16))
        bool2 = true; 
    } 
    return bool2;
  }
  
  private static boolean j() {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 24) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void e() {
    if (j()) {
      f.c().a(g, "Registering network callback", new Throwable[0]);
      this.h.registerDefaultNetworkCallback(this.i);
    } else {
      f.c().a(g, "Registering broadcast receiver", new Throwable[0]);
      this.c.registerReceiver(this.j, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    } 
  }
  
  public void f() {
    if (j()) {
      try {
        f.c().a(g, "Unregistering network callback", new Throwable[0]);
        this.h.unregisterNetworkCallback(this.i);
      } catch (IllegalArgumentException illegalArgumentException) {
        f.c().b(g, "Received exception while unregistering network callback", new Throwable[] { illegalArgumentException });
      } 
    } else {
      f.c().a(g, "Unregistering broadcast receiver", new Throwable[0]);
      this.c.unregisterReceiver(this.j);
    } 
  }
  
  b g() {
    boolean bool2;
    NetworkInfo networkInfo = this.h.getActiveNetworkInfo();
    boolean bool1 = true;
    if (networkInfo != null && networkInfo.isConnected()) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    boolean bool3 = i();
    boolean bool4 = androidx.core.net.a.a(this.h);
    if (networkInfo == null || networkInfo.isRoaming())
      bool1 = false; 
    return new b(bool2, bool3, bool4, bool1);
  }
  
  public b h() {
    return g();
  }
  
  private class a extends BroadcastReceiver {
    a(e this$0) {}
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      if (param1Intent != null && param1Intent.getAction() != null && param1Intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
        f.c().a(e.g, "Network broadcast received", new Throwable[0]);
        e e1 = this.a;
        e1.d(e1.g());
      } 
    }
  }
  
  private class b extends ConnectivityManager.NetworkCallback {
    b(e this$0) {}
    
    public void onCapabilitiesChanged(Network param1Network, NetworkCapabilities param1NetworkCapabilities) {
      f.c().a(e.g, String.format("Network capabilities changed: %s", new Object[] { param1NetworkCapabilities }), new Throwable[0]);
      e e1 = this.a;
      e1.d(e1.g());
    }
    
    public void onLost(Network param1Network) {
      f.c().a(e.g, "Network connection lost", new Throwable[0]);
      e e1 = this.a;
      e1.d(e1.g());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */