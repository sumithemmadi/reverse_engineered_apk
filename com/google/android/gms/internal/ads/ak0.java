package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class ak0 implements x6<Object> {
  private final s4 a;
  
  private final dk0 b;
  
  private final t82<xj0> c;
  
  public ak0(ag0 paramag0, pf0 parampf0, dk0 paramdk0, t82<xj0> paramt82) {
    this.a = paramag0.i(parampf0.e());
    this.b = paramdk0;
    this.c = paramt82;
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    paramObject = paramMap.get("asset");
    try {
      this.a.I0(this.c.get(), (String)paramObject);
      return;
    } catch (RemoteException remoteException) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramObject).length() + 40);
      stringBuilder.append("Failed to call onCustomClick for asset ");
      stringBuilder.append((String)paramObject);
      stringBuilder.append(".");
      cm.d(stringBuilder.toString(), (Throwable)remoteException);
      return;
    } 
  }
  
  public final void b() {
    if (this.a == null)
      return; 
    this.b.e("/nativeAdCustomClick", this);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ak0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */