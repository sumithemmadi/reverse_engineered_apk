package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;

public interface b extends IInterface {
  void D1(a parama);
  
  boolean x5(KeyEvent paramKeyEvent);
  
  public static abstract class a extends Binder implements b {
    public static b Y0(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
      return (iInterface != null && iInterface instanceof b) ? (b)iInterface : new a(param1IBinder);
    }
    
    private static class a implements b {
      private IBinder b;
      
      a(IBinder param2IBinder) {
        this.b = param2IBinder;
      }
      
      public void D1(a param2a) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          if (param2a != null) {
            IBinder iBinder = param2a.asBinder();
          } else {
            param2a = null;
          } 
          parcel1.writeStrongBinder((IBinder)param2a);
          this.b.transact(3, parcel1, parcel2, 0);
          parcel2.readException();
          return;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public IBinder asBinder() {
        return this.b;
      }
      
      public boolean x5(KeyEvent param2KeyEvent) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
          boolean bool = true;
          if (param2KeyEvent != null) {
            parcel1.writeInt(1);
            param2KeyEvent.writeToParcel(parcel1, 0);
          } else {
            parcel1.writeInt(0);
          } 
          this.b.transact(2, parcel1, parcel2, 0);
          parcel2.readException();
          int i = parcel2.readInt();
          if (i == 0)
            bool = false; 
          return bool;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
    }
  }
  
  private static class a implements b {
    private IBinder b;
    
    a(IBinder param1IBinder) {
      this.b = param1IBinder;
    }
    
    public void D1(a param1a) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        if (param1a != null) {
          IBinder iBinder = param1a.asBinder();
        } else {
          param1a = null;
        } 
        parcel1.writeStrongBinder((IBinder)param1a);
        this.b.transact(3, parcel1, parcel2, 0);
        parcel2.readException();
        return;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public IBinder asBinder() {
      return this.b;
    }
    
    public boolean x5(KeyEvent param1KeyEvent) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        boolean bool = true;
        if (param1KeyEvent != null) {
          parcel1.writeInt(1);
          param1KeyEvent.writeToParcel(parcel1, 0);
        } else {
          parcel1.writeInt(0);
        } 
        this.b.transact(2, parcel1, parcel2, 0);
        parcel2.readException();
        int i = parcel2.readInt();
        if (i == 0)
          bool = false; 
        return bool;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/android/support/v4/media/session/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */