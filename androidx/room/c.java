package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface c extends IInterface {
  void z2(String[] paramArrayOfString);
  
  public static abstract class a extends Binder implements c {
    public a() {
      attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
    }
    
    public static c Y0(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
      return (iInterface != null && iInterface instanceof c) ? (c)iInterface : new a(param1IBinder);
    }
    
    public IBinder asBinder() {
      return (IBinder)this;
    }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      if (param1Int1 != 1) {
        if (param1Int1 != 1598968902)
          return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2); 
        param1Parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
        return true;
      } 
      param1Parcel1.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
      z2(param1Parcel1.createStringArray());
      return true;
    }
    
    private static class a implements c {
      private IBinder b;
      
      a(IBinder param2IBinder) {
        this.b = param2IBinder;
      }
      
      public IBinder asBinder() {
        return this.b;
      }
      
      public void z2(String[] param2ArrayOfString) {
        Parcel parcel = Parcel.obtain();
        try {
          parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
          parcel.writeStringArray(param2ArrayOfString);
          this.b.transact(1, parcel, null, 1);
          return;
        } finally {
          parcel.recycle();
        } 
      }
    }
  }
  
  private static class a implements c {
    private IBinder b;
    
    a(IBinder param1IBinder) {
      this.b = param1IBinder;
    }
    
    public IBinder asBinder() {
      return this.b;
    }
    
    public void z2(String[] param1ArrayOfString) {
      Parcel parcel = Parcel.obtain();
      try {
        parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
        parcel.writeStringArray(param1ArrayOfString);
        this.b.transact(1, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */