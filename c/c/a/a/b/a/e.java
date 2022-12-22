package c.c.a.a.b.a;

import android.os.IBinder;
import android.os.IInterface;

public abstract class e extends b implements d {
  public static d Y0(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    return (iInterface instanceof d) ? (d)iInterface : new f(paramIBinder);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */