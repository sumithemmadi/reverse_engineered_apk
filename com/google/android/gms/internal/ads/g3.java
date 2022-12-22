package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.a;
import java.util.ArrayList;
import java.util.List;

public final class g3 extends a.a {
  private final f3 a;
  
  private final List<a.b> b = new ArrayList<a.b>();
  
  private String c;
  
  public g3(f3 paramf3) {
    this.a = paramf3;
    try {
      this.c = paramf3.R1();
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      this.c = "";
    } 
    try {
      for (f3 paramf3 : paramf3.v4()) {
        if (paramf3 instanceof IBinder) {
          IBinder iBinder = (IBinder)paramf3;
          if (iBinder != null) {
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (iInterface instanceof m3) {
              iInterface = iInterface;
            } else {
              iInterface = new o3(iBinder);
            } 
            continue;
          } 
        } 
        paramf3 = null;
        continue;
        if (paramf3 != null) {
          List<a.b> list = this.b;
          n3 n3 = new n3();
          this((m3)paramf3);
          list.add(n3);
        } 
      } 
      return;
    } catch (RemoteException remoteException) {
      cm.c("", (Throwable)remoteException);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */