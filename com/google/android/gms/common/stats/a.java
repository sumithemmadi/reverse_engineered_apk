package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.common.k;
import com.google.android.gms.internal.common.l;
import java.util.concurrent.ConcurrentHashMap;

public class a {
  private static final Object a = new Object();
  
  private static volatile a b;
  
  private static l<Boolean> c = k.a(e.b);
  
  private ConcurrentHashMap<ServiceConnection, ServiceConnection> d = new ConcurrentHashMap<ServiceConnection, ServiceConnection>();
  
  public static a b() {
    if (b == null)
      synchronized (a) {
        if (b == null) {
          a a1 = new a();
          this();
          b = a1;
        } 
      }  
    return b;
  }
  
  @SuppressLint({"UntrackedBindService"})
  private static void d(Context paramContext, ServiceConnection paramServiceConnection) {
    try {
      paramContext.unbindService(paramServiceConnection);
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
    
    } catch (IllegalStateException illegalStateException) {}
    Log.w("ConnectionTracker", "Exception thrown while unbinding", illegalStateException);
  }
  
  @SuppressLint({"UntrackedBindService"})
  private final boolean g(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt, boolean paramBoolean) {
    ComponentName componentName = paramIntent.getComponent();
    if (componentName == null) {
      paramBoolean = false;
    } else {
      paramBoolean = d.b(paramContext, componentName.getPackageName());
    } 
    if (paramBoolean) {
      Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
      return false;
    } 
    if (h(paramServiceConnection)) {
      ServiceConnection serviceConnection = this.d.putIfAbsent(paramServiceConnection, paramServiceConnection);
      if (serviceConnection != null && paramServiceConnection != serviceConnection)
        Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[] { paramServiceConnection, paramString, paramIntent.getAction() })); 
      try {
        boolean bool = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
        paramBoolean = bool;
      } finally {
        this.d.remove(paramServiceConnection, paramServiceConnection);
      } 
    } else {
      paramBoolean = paramContext.bindService(paramIntent, paramServiceConnection, paramInt);
    } 
    return paramBoolean;
  }
  
  private static boolean h(ServiceConnection paramServiceConnection) {
    return (((Boolean)c.zza()).booleanValue() && !(paramServiceConnection instanceof com.google.android.gms.common.internal.s0));
  }
  
  public boolean a(Context paramContext, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt) {
    return f(paramContext, paramContext.getClass().getName(), paramIntent, paramServiceConnection, paramInt);
  }
  
  @SuppressLint({"UntrackedBindService"})
  public void c(Context paramContext, ServiceConnection paramServiceConnection) {
    if (h(paramServiceConnection) && this.d.containsKey(paramServiceConnection))
      try {
        d(paramContext, this.d.get(paramServiceConnection));
        return;
      } finally {
        this.d.remove(paramServiceConnection);
      }  
    d(paramContext, paramServiceConnection);
  }
  
  public final boolean f(Context paramContext, String paramString, Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt) {
    return g(paramContext, paramString, paramIntent, paramServiceConnection, paramInt, true);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/stats/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */