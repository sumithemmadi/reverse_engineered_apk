package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.zzaq;

final class us0 implements et1<ParcelFileDescriptor> {
  us0(is0 paramis0, mg parammg) {}
  
  public final void a(Throwable paramThrowable) {
    try {
      this.a.K4(zzaq.o0(paramThrowable));
      return;
    } catch (RemoteException remoteException) {
      b1.l("Service can't call client", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/us0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */