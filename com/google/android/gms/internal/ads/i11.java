package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

public final class i11 {
  private final ConcurrentHashMap<String, kd> a = new ConcurrentHashMap<String, kd>();
  
  private final hm0 b;
  
  public i11(hm0 paramhm0) {
    this.b = paramhm0;
  }
  
  public final void a(String paramString) {
    try {
      kd kd = this.b.e(paramString);
      this.a.put(paramString, kd);
      return;
    } catch (RemoteException remoteException) {
      cm.c("Couldn't create RTB adapter : ", (Throwable)remoteException);
      return;
    } 
  }
  
  public final kd b(String paramString) {
    return this.a.containsKey(paramString) ? this.a.get(paramString) : null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/i11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */