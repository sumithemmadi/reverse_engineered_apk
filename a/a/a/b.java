package a.a.a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface b extends IInterface {
  boolean E6(a parama);
  
  boolean F7(a parama, Bundle paramBundle);
  
  Bundle G3(String paramString, Bundle paramBundle);
  
  boolean J4(long paramLong);
  
  boolean V1(a parama, Uri paramUri, Bundle paramBundle, List<Bundle> paramList);
  
  int d6(a parama, String paramString, Bundle paramBundle);
  
  boolean h2(a parama, int paramInt, Uri paramUri, Bundle paramBundle);
  
  boolean i8(a parama, Uri paramUri);
  
  public static abstract class a extends Binder implements b {
    public a() {
      attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }
    
    public static b Y0(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
      return (iInterface != null && iInterface instanceof b) ? (b)iInterface : new a(param1IBinder);
    }
    
    public IBinder asBinder() {
      return (IBinder)this;
    }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      if (param1Int1 != 1598968902) {
        boolean bool2;
        int i;
        Bundle bundle1;
        Bundle bundle3;
        Uri uri1;
        Bundle bundle2;
        a a1;
        String str1;
        a a3;
        String str2;
        Bundle bundle6;
        Uri uri2 = null;
        Bundle bundle4 = null;
        Uri uri3 = null;
        Bundle bundle5 = null;
        a a2 = null;
        Bundle bundle7 = null;
        switch (param1Int1) {
          default:
            return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2);
          case 9:
            param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
            a2 = a.a.Y0(param1Parcel1.readStrongBinder());
            param1Int1 = param1Parcel1.readInt();
            if (param1Parcel1.readInt() != 0) {
              uri2 = (Uri)Uri.CREATOR.createFromParcel(param1Parcel1);
            } else {
              uri2 = null;
            } 
            if (param1Parcel1.readInt() != 0)
              bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
            bool2 = h2(a2, param1Int1, uri2, bundle7);
            param1Parcel2.writeNoException();
            param1Parcel2.writeInt(bool2);
            return true;
          case 8:
            param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
            a3 = a.a.Y0(param1Parcel1.readStrongBinder());
            str1 = param1Parcel1.readString();
            if (param1Parcel1.readInt() != 0)
              bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
            i = d6(a3, str1, bundle3);
            param1Parcel2.writeNoException();
            param1Parcel2.writeInt(i);
            return true;
          case 7:
            param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
            a3 = a.a.Y0(param1Parcel1.readStrongBinder());
            bundle3 = bundle4;
            if (param1Parcel1.readInt() != 0)
              uri1 = (Uri)Uri.CREATOR.createFromParcel(param1Parcel1); 
            bool1 = i8(a3, uri1);
            param1Parcel2.writeNoException();
            param1Parcel2.writeInt(bool1);
            return true;
          case 6:
            param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
            a3 = a.a.Y0(param1Parcel1.readStrongBinder());
            uri1 = uri3;
            if (param1Parcel1.readInt() != 0)
              bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
            bool1 = F7(a3, bundle2);
            param1Parcel2.writeNoException();
            param1Parcel2.writeInt(bool1);
            return true;
          case 5:
            param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsService");
            str2 = param1Parcel1.readString();
            bundle2 = bundle5;
            if (param1Parcel1.readInt() != 0)
              bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
            bundle1 = G3(str2, bundle2);
            param1Parcel2.writeNoException();
            if (bundle1 != null) {
              param1Parcel2.writeInt(1);
              bundle1.writeToParcel(param1Parcel2, 1);
            } else {
              param1Parcel2.writeInt(0);
            } 
            return true;
          case 4:
            bundle1.enforceInterface("android.support.customtabs.ICustomTabsService");
            a1 = a.a.Y0(bundle1.readStrongBinder());
            if (bundle1.readInt() != 0) {
              Uri uri = (Uri)Uri.CREATOR.createFromParcel((Parcel)bundle1);
            } else {
              bundle2 = null;
            } 
            str2 = str1;
            if (bundle1.readInt() != 0)
              bundle6 = (Bundle)Bundle.CREATOR.createFromParcel((Parcel)bundle1); 
            bool1 = V1(a1, (Uri)bundle2, bundle6, bundle1.createTypedArrayList(Bundle.CREATOR));
            param1Parcel2.writeNoException();
            param1Parcel2.writeInt(bool1);
            return true;
          case 3:
            bundle1.enforceInterface("android.support.customtabs.ICustomTabsService");
            bool1 = E6(a.a.Y0(bundle1.readStrongBinder()));
            param1Parcel2.writeNoException();
            param1Parcel2.writeInt(bool1);
            return true;
          case 2:
            break;
        } 
        bundle1.enforceInterface("android.support.customtabs.ICustomTabsService");
        boolean bool1 = J4(bundle1.readLong());
        param1Parcel2.writeNoException();
        param1Parcel2.writeInt(bool1);
        return true;
      } 
      param1Parcel2.writeString("android.support.customtabs.ICustomTabsService");
      return true;
    }
    
    private static class a implements b {
      private IBinder b;
      
      a(IBinder param2IBinder) {
        this.b = param2IBinder;
      }
      
      public boolean E6(a param2a) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          if (param2a != null) {
            IBinder iBinder1 = param2a.asBinder();
          } else {
            param2a = null;
          } 
          parcel1.writeStrongBinder((IBinder)param2a);
          IBinder iBinder = this.b;
          boolean bool = false;
          iBinder.transact(3, parcel1, parcel2, 0);
          parcel2.readException();
          int i = parcel2.readInt();
          if (i != 0)
            bool = true; 
          return bool;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public boolean J4(long param2Long) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
          parcel1.writeLong(param2Long);
          IBinder iBinder = this.b;
          boolean bool = false;
          iBinder.transact(2, parcel1, parcel2, 0);
          parcel2.readException();
          int i = parcel2.readInt();
          if (i != 0)
            bool = true; 
          return bool;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public IBinder asBinder() {
        return this.b;
      }
    }
  }
  
  private static class a implements b {
    private IBinder b;
    
    a(IBinder param1IBinder) {
      this.b = param1IBinder;
    }
    
    public boolean E6(a param1a) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
        if (param1a != null) {
          IBinder iBinder1 = param1a.asBinder();
        } else {
          param1a = null;
        } 
        parcel1.writeStrongBinder((IBinder)param1a);
        IBinder iBinder = this.b;
        boolean bool = false;
        iBinder.transact(3, parcel1, parcel2, 0);
        parcel2.readException();
        int i = parcel2.readInt();
        if (i != 0)
          bool = true; 
        return bool;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public boolean J4(long param1Long) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
        parcel1.writeLong(param1Long);
        IBinder iBinder = this.b;
        boolean bool = false;
        iBinder.transact(2, parcel1, parcel2, 0);
        parcel2.readException();
        int i = parcel2.readInt();
        if (i != 0)
          bool = true; 
        return bool;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public IBinder asBinder() {
      return this.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/a/a/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */