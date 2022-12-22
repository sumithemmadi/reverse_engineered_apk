package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.v.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.wl;
import java.io.IOException;

final class c1 extends a {
  private Context d;
  
  c1(Context paramContext) {
    this.d = paramContext;
  }
  
  public final void b() {
    boolean bool;
    try {
      bool = a.d(this.d);
    } catch (IOException iOException) {
      cm.c("Fail to get isAdIdFakeForDebugLogging", iOException);
      bool = false;
    } catch (IllegalStateException illegalStateException) {
    
    } catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
    
    } catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException) {}
    wl.m(bool);
    StringBuilder stringBuilder = new StringBuilder(43);
    stringBuilder.append("Update ad debug logging enablement as ");
    stringBuilder.append(bool);
    cm.i(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/c1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */