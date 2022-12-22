package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class f {
  final a.a.a.a a;
  
  private final a b;
  
  f(a.a.a.a parama) {
    this.a = parama;
    this.b = new a(this);
  }
  
  IBinder a() {
    return this.a.asBinder();
  }
  
  public boolean equals(Object paramObject) {
    return !(paramObject instanceof f) ? false : ((f)paramObject).a().equals(this.a.asBinder());
  }
  
  public int hashCode() {
    return a().hashCode();
  }
  
  class a extends a {
    a(f this$0) {}
    
    public void a(String param1String, Bundle param1Bundle) {
      try {
        this.a.a.d7(param1String, param1Bundle);
      } catch (RemoteException remoteException) {
        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
      } 
    }
    
    public void b(Bundle param1Bundle) {
      try {
        this.a.a.b9(param1Bundle);
      } catch (RemoteException remoteException) {
        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
      } 
    }
    
    public void c(int param1Int, Bundle param1Bundle) {
      try {
        this.a.a.R7(param1Int, param1Bundle);
      } catch (RemoteException remoteException) {
        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
      } 
    }
    
    public void d(String param1String, Bundle param1Bundle) {
      try {
        this.a.a.P8(param1String, param1Bundle);
      } catch (RemoteException remoteException) {
        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
      } 
    }
    
    public void e(int param1Int, Uri param1Uri, boolean param1Boolean, Bundle param1Bundle) {
      try {
        this.a.a.l9(param1Int, param1Uri, param1Boolean, param1Bundle);
      } catch (RemoteException remoteException) {
        Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/browser/customtabs/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */