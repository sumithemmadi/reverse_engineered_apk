package com.bumptech.glide.manager;

import android.content.Context;
import android.util.Log;
import androidx.core.content.a;

public class f implements d {
  public c a(Context paramContext, c.a parama) {
    n n;
    boolean bool;
    if (a.a(paramContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (Log.isLoggable("ConnectivityMonitor", 3)) {
      String str;
      if (bool) {
        str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
      } else {
        str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
      } 
      Log.d("ConnectivityMonitor", str);
    } 
    if (bool) {
      e e = new e(paramContext, parama);
    } else {
      n = new n();
    } 
    return n;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/manager/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */