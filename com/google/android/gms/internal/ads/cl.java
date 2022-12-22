package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.v.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class cl implements Runnable {
  cl(zk paramzk, Context paramContext, sm paramsm) {}
  
  public final void run() {
    try {
      a.a a = a.b(this.b);
      this.c.c(a);
      return;
    } catch (IOException iOException) {
    
    } catch (IllegalStateException illegalStateException) {
    
    } catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
    
    } catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException) {}
    this.c.d((Throwable)googlePlayServicesRepairableException);
    cm.c("Exception while getting advertising Id info", (Throwable)googlePlayServicesRepairableException);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */