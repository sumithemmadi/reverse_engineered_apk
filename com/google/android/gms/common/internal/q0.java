package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class q0 implements ServiceConnection, s0 {
  private final Map<ServiceConnection, ServiceConnection> a;
  
  private int b;
  
  private boolean c;
  
  private IBinder d;
  
  private final i.a e;
  
  private ComponentName f;
  
  public q0(o0 paramo0, i.a parama) {
    this.e = parama;
    this.a = new HashMap<ServiceConnection, ServiceConnection>();
    this.b = 2;
  }
  
  public final void a(ServiceConnection paramServiceConnection1, ServiceConnection paramServiceConnection2, String paramString) {
    this.a.put(paramServiceConnection1, paramServiceConnection2);
  }
  
  public final void b(ServiceConnection paramServiceConnection, String paramString) {
    this.a.remove(paramServiceConnection);
  }
  
  public final void c(String paramString) {
    this.b = 3;
    boolean bool = o0.k(this.g).f(o0.j(this.g), paramString, this.e.a(o0.j(this.g)), this, this.e.e());
    this.c = bool;
    if (bool) {
      Message message = o0.i(this.g).obtainMessage(1, this.e);
      o0.i(this.g).sendMessageDelayed(message, o0.l(this.g));
      return;
    } 
    this.b = 2;
    try {
      o0.k(this.g).c(o0.j(this.g), this);
    } catch (IllegalArgumentException illegalArgumentException) {}
  }
  
  public final boolean d() {
    return this.c;
  }
  
  public final boolean e(ServiceConnection paramServiceConnection) {
    return this.a.containsKey(paramServiceConnection);
  }
  
  public final int f() {
    return this.b;
  }
  
  public final void g(String paramString) {
    o0.i(this.g).removeMessages(1, this.e);
    o0.k(this.g).c(o0.j(this.g), this);
    this.c = false;
    this.b = 2;
  }
  
  public final boolean h() {
    return this.a.isEmpty();
  }
  
  public final IBinder i() {
    return this.d;
  }
  
  public final ComponentName j() {
    return this.f;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    synchronized (o0.h(this.g)) {
      o0.i(this.g).removeMessages(1, this.e);
      this.d = paramIBinder;
      this.f = paramComponentName;
      Iterator<ServiceConnection> iterator = this.a.values().iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceConnected(paramComponentName, paramIBinder); 
      this.b = 1;
      return;
    } 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    synchronized (o0.h(this.g)) {
      o0.i(this.g).removeMessages(1, this.e);
      this.d = null;
      this.f = paramComponentName;
      Iterator<ServiceConnection> iterator = this.a.values().iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceDisconnected(paramComponentName); 
      this.b = 2;
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */