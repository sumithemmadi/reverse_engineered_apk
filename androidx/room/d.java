package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface d extends IInterface {
  void V8(int paramInt, String[] paramArrayOfString);
  
  int r3(c paramc, String paramString);
  
  void y9(c paramc, int paramInt);
  
  public static abstract class a extends Binder implements d {
    public a() {
      attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }
    
    public static d Y0(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
      return (iInterface != null && iInterface instanceof d) ? (d)iInterface : new a(param1IBinder);
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
            param1Parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
          } 
          param1Parcel1.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
          V8(param1Parcel1.readInt(), param1Parcel1.createStringArray());
          return true;
        } 
        param1Parcel1.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        y9(c.a.Y0(param1Parcel1.readStrongBinder()), param1Parcel1.readInt());
        param1Parcel2.writeNoException();
        return true;
      } 
      param1Parcel1.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
      param1Int1 = r3(c.a.Y0(param1Parcel1.readStrongBinder()), param1Parcel1.readString());
      param1Parcel2.writeNoException();
      param1Parcel2.writeInt(param1Int1);
      return true;
    }
    
    private static class a implements d {
      private IBinder b;
      
      a(IBinder param2IBinder) {
        this.b = param2IBinder;
      }
      
      public void V8(int param2Int, String[] param2ArrayOfString) {
        Parcel parcel = Parcel.obtain();
        try {
          parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
          parcel.writeInt(param2Int);
          parcel.writeStringArray(param2ArrayOfString);
          this.b.transact(3, parcel, null, 1);
          return;
        } finally {
          parcel.recycle();
        } 
      }
      
      public IBinder asBinder() {
        return this.b;
      }
      
      public int r3(c param2c, String param2String) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
          if (param2c != null) {
            IBinder iBinder = param2c.asBinder();
          } else {
            param2c = null;
          } 
          parcel1.writeStrongBinder((IBinder)param2c);
          parcel1.writeString(param2String);
          this.b.transact(1, parcel1, parcel2, 0);
          parcel2.readException();
          return parcel2.readInt();
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public void y9(c param2c, int param2Int) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
          if (param2c != null) {
            IBinder iBinder = param2c.asBinder();
          } else {
            param2c = null;
          } 
          parcel1.writeStrongBinder((IBinder)param2c);
          parcel1.writeInt(param2Int);
          this.b.transact(2, parcel1, parcel2, 0);
          parcel2.readException();
          return;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
    }
  }
  
  private static class a implements d {
    private IBinder b;
    
    a(IBinder param1IBinder) {
      this.b = param1IBinder;
    }
    
    public void V8(int param1Int, String[] param1ArrayOfString) {
      Parcel parcel = Parcel.obtain();
      try {
        parcel.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
        parcel.writeInt(param1Int);
        parcel.writeStringArray(param1ArrayOfString);
        this.b.transact(3, parcel, null, 1);
        return;
      } finally {
        parcel.recycle();
      } 
    }
    
    public IBinder asBinder() {
      return this.b;
    }
    
    public int r3(c param1c, String param1String) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
        if (param1c != null) {
          IBinder iBinder = param1c.asBinder();
        } else {
          param1c = null;
        } 
        parcel1.writeStrongBinder((IBinder)param1c);
        parcel1.writeString(param1String);
        this.b.transact(1, parcel1, parcel2, 0);
        parcel2.readException();
        return parcel2.readInt();
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public void y9(c param1c, int param1Int) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
        if (param1c != null) {
          IBinder iBinder = param1c.asBinder();
        } else {
          param1c = null;
        } 
        parcel1.writeStrongBinder((IBinder)param1c);
        parcel1.writeInt(param1Int);
        this.b.transact(2, parcel1, parcel2, 0);
        parcel2.readException();
        return;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */