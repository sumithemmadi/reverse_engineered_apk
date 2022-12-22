package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.mb;
import com.google.android.gms.internal.ads.nb;
import com.google.android.gms.internal.ads.sq2;

public class AdService extends IntentService {
  public AdService() {
    super("AdService");
  }
  
  protected void onHandleIntent(Intent paramIntent) {
    try {
      sq2 sq2 = er2.b();
      nb nb = new nb();
      this();
      sq2.e((Context)this, (mb)nb).g1(paramIntent);
      return;
    } catch (RemoteException remoteException) {
      String str = String.valueOf(remoteException);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 50);
      stringBuilder.append("RemoteException calling handleNotificationIntent: ");
      stringBuilder.append(str);
      cm.g(stringBuilder.toString());
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/AdService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */