package a.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface c extends IInterface {
  void j4(a parama, Bundle paramBundle);
  
  void q5(a parama, String paramString, Bundle paramBundle);
  
  public static abstract class a extends Binder implements c {
    public a() {
      attachInterface(this, "android.support.customtabs.IPostMessageService");
    }
    
    public IBinder asBinder() {
      return (IBinder)this;
    }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      Bundle bundle1;
      a a1 = null;
      Bundle bundle2 = null;
      if (param1Int1 != 2) {
        if (param1Int1 != 3) {
          if (param1Int1 != 1598968902)
            return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2); 
          param1Parcel2.writeString("android.support.customtabs.IPostMessageService");
          return true;
        } 
        param1Parcel1.enforceInterface("android.support.customtabs.IPostMessageService");
        a1 = a.a.Y0(param1Parcel1.readStrongBinder());
        String str = param1Parcel1.readString();
        if (param1Parcel1.readInt() != 0)
          bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
        q5(a1, str, bundle2);
        param1Parcel2.writeNoException();
        return true;
      } 
      param1Parcel1.enforceInterface("android.support.customtabs.IPostMessageService");
      a a3 = a.a.Y0(param1Parcel1.readStrongBinder());
      a a2 = a1;
      if (param1Parcel1.readInt() != 0)
        bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
      j4(a3, bundle1);
      param1Parcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/a/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */