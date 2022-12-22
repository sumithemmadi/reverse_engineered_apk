package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.u;

public final class RevocationBoundService extends Service {
  public final IBinder onBind(Intent paramIntent) {
    if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(paramIntent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(paramIntent.getAction())) {
      if (Log.isLoggable("RevocationService", 2)) {
        str = String.valueOf(paramIntent.getAction());
        if (str.length() != 0) {
          str = "RevocationBoundService handling ".concat(str);
        } else {
          str = new String("RevocationBoundService handling ");
        } 
        Log.v("RevocationService", str);
      } 
      return (IBinder)new u((Context)this);
    } 
    String str = String.valueOf(str.getAction());
    if (str.length() != 0) {
      str = "Unknown action sent to RevocationBoundService: ".concat(str);
    } else {
      str = new String("Unknown action sent to RevocationBoundService: ");
    } 
    Log.w("RevocationService", str);
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/RevocationBoundService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */