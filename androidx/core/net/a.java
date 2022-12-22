package androidx.core.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;

public final class a {
  public static boolean a(ConnectivityManager paramConnectivityManager) {
    if (Build.VERSION.SDK_INT >= 16)
      return paramConnectivityManager.isActiveNetworkMetered(); 
    NetworkInfo networkInfo = paramConnectivityManager.getActiveNetworkInfo();
    if (networkInfo == null)
      return true; 
    int i = networkInfo.getType();
    return (i != 1 && i != 7 && i != 9);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/core/net/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */