package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.y.b;

public final class zh implements b {
  private final kh a;
  
  public zh(kh paramkh) {
    this.a = paramkh;
  }
  
  public final int P() {
    kh kh1 = this.a;
    if (kh1 == null)
      return 0; 
    try {
      return kh1.P();
    } catch (RemoteException remoteException) {
      cm.d("Could not forward getAmount to RewardItem", (Throwable)remoteException);
      return 0;
    } 
  }
  
  public final String l() {
    kh kh1 = this.a;
    if (kh1 == null)
      return null; 
    try {
      return kh1.l();
    } catch (RemoteException remoteException) {
      cm.d("Could not forward getType to RewardItem", (Throwable)remoteException);
      return null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */