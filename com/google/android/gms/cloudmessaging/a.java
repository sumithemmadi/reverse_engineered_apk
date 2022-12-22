package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;

interface a extends IInterface {
  void t2(Message paramMessage);
  
  public static class a implements a {
    private final IBinder b;
    
    a(IBinder param1IBinder) {
      this.b = param1IBinder;
    }
    
    public IBinder asBinder() {
      return this.b;
    }
    
    public void t2(Message param1Message) {
      Parcel parcel = Parcel.obtain();
      parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
      parcel.writeInt(1);
      param1Message.writeToParcel(parcel, 0);
      try {
        this.b.transact(1, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */