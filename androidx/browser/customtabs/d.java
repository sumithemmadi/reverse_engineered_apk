package androidx.browser.customtabs;

import a.a.a.b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public abstract class d implements ServiceConnection {
  public abstract void a(ComponentName paramComponentName, b paramb);
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    a(paramComponentName, new a(this, b.a.Y0(paramIBinder), paramComponentName));
  }
  
  class a extends b {
    a(d this$0, b param1b, ComponentName param1ComponentName) {
      super(param1b, param1ComponentName);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/browser/customtabs/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */