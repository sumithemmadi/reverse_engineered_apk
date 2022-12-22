package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {
  void c6(String paramString1, int paramInt, String paramString2);
  
  void i3(String paramString);
  
  void i9(String paramString1, int paramInt, String paramString2, Notification paramNotification);
  
  public static abstract class a extends Binder implements a {
    public a() {
      attachInterface(this, "android.support.v4.app.INotificationSideChannel");
    }
    
    public IBinder asBinder() {
      return (IBinder)this;
    }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      if (param1Int1 != 1) {
        if (param1Int1 != 2) {
          if (param1Int1 != 3) {
            if (param1Int1 != 1598968902)
              return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2); 
            param1Parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
          } 
          param1Parcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
          i3(param1Parcel1.readString());
          return true;
        } 
        param1Parcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
        c6(param1Parcel1.readString(), param1Parcel1.readInt(), param1Parcel1.readString());
        return true;
      } 
      param1Parcel1.enforceInterface("android.support.v4.app.INotificationSideChannel");
      String str1 = param1Parcel1.readString();
      param1Int1 = param1Parcel1.readInt();
      String str2 = param1Parcel1.readString();
      if (param1Parcel1.readInt() != 0) {
        Notification notification = (Notification)Notification.CREATOR.createFromParcel(param1Parcel1);
      } else {
        param1Parcel1 = null;
      } 
      i9(str1, param1Int1, str2, (Notification)param1Parcel1);
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */