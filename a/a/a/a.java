package a.a.a;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {
  void P8(String paramString, Bundle paramBundle);
  
  void R7(int paramInt, Bundle paramBundle);
  
  void b9(Bundle paramBundle);
  
  void d7(String paramString, Bundle paramBundle);
  
  void l9(int paramInt, Uri paramUri, boolean paramBoolean, Bundle paramBundle);
  
  public static abstract class a extends Binder implements a {
    public a() {
      attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }
    
    public static a Y0(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
      return (iInterface != null && iInterface instanceof a) ? (a)iInterface : new a(param1IBinder);
    }
    
    public IBinder asBinder() {
      return (IBinder)this;
    }
    
    public boolean onTransact(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      Bundle bundle1;
      Uri uri1 = null;
      Uri uri2 = null;
      Uri uri3 = null;
      Uri uri4 = null;
      Bundle bundle2 = null;
      if (param1Int1 != 2) {
        if (param1Int1 != 3) {
          if (param1Int1 != 4) {
            if (param1Int1 != 5) {
              boolean bool;
              if (param1Int1 != 6) {
                if (param1Int1 != 1598968902)
                  return super.onTransact(param1Int1, param1Parcel1, param1Parcel2, param1Int2); 
                param1Parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
              } 
              param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
              param1Int1 = param1Parcel1.readInt();
              if (param1Parcel1.readInt() != 0) {
                uri1 = (Uri)Uri.CREATOR.createFromParcel(param1Parcel1);
              } else {
                uri1 = null;
              } 
              if (param1Parcel1.readInt() != 0) {
                bool = true;
              } else {
                bool = false;
              } 
              if (param1Parcel1.readInt() != 0)
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
              l9(param1Int1, uri1, bool, bundle2);
              param1Parcel2.writeNoException();
              return true;
            } 
            param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            String str1 = param1Parcel1.readString();
            if (param1Parcel1.readInt() != 0)
              bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
            P8(str1, bundle1);
            param1Parcel2.writeNoException();
            return true;
          } 
          param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
          uri1 = uri2;
          if (param1Parcel1.readInt() != 0)
            bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
          b9(bundle1);
          param1Parcel2.writeNoException();
          return true;
        } 
        param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
        String str = param1Parcel1.readString();
        uri1 = uri3;
        if (param1Parcel1.readInt() != 0)
          bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
        d7(str, bundle1);
        param1Parcel2.writeNoException();
        return true;
      } 
      param1Parcel1.enforceInterface("android.support.customtabs.ICustomTabsCallback");
      param1Int1 = param1Parcel1.readInt();
      uri1 = uri4;
      if (param1Parcel1.readInt() != 0)
        bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(param1Parcel1); 
      R7(param1Int1, bundle1);
      param1Parcel2.writeNoException();
      return true;
    }
    
    private static class a implements a {
      private IBinder b;
      
      a(IBinder param2IBinder) {
        this.b = param2IBinder;
      }
      
      public void P8(String param2String, Bundle param2Bundle) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          parcel1.writeString(param2String);
          if (param2Bundle != null) {
            parcel1.writeInt(1);
            param2Bundle.writeToParcel(parcel1, 0);
          } else {
            parcel1.writeInt(0);
          } 
          this.b.transact(5, parcel1, parcel2, 0);
          parcel2.readException();
          return;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public void R7(int param2Int, Bundle param2Bundle) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          parcel1.writeInt(param2Int);
          if (param2Bundle != null) {
            parcel1.writeInt(1);
            param2Bundle.writeToParcel(parcel1, 0);
          } else {
            parcel1.writeInt(0);
          } 
          this.b.transact(2, parcel1, parcel2, 0);
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
      
      public void b9(Bundle param2Bundle) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          if (param2Bundle != null) {
            parcel1.writeInt(1);
            param2Bundle.writeToParcel(parcel1, 0);
          } else {
            parcel1.writeInt(0);
          } 
          this.b.transact(4, parcel1, parcel2, 0);
          parcel2.readException();
          return;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public void d7(String param2String, Bundle param2Bundle) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          parcel1.writeString(param2String);
          if (param2Bundle != null) {
            parcel1.writeInt(1);
            param2Bundle.writeToParcel(parcel1, 0);
          } else {
            parcel1.writeInt(0);
          } 
          this.b.transact(3, parcel1, parcel2, 0);
          parcel2.readException();
          return;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
      
      public void l9(int param2Int, Uri param2Uri, boolean param2Boolean, Bundle param2Bundle) {
        Parcel parcel1 = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
          parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
          parcel1.writeInt(param2Int);
          if (param2Uri != null) {
            parcel1.writeInt(1);
            param2Uri.writeToParcel(parcel1, 0);
          } else {
            parcel1.writeInt(0);
          } 
          if (param2Boolean) {
            param2Int = 1;
          } else {
            param2Int = 0;
          } 
          parcel1.writeInt(param2Int);
          if (param2Bundle != null) {
            parcel1.writeInt(1);
            param2Bundle.writeToParcel(parcel1, 0);
          } else {
            parcel1.writeInt(0);
          } 
          this.b.transact(6, parcel1, parcel2, 0);
          parcel2.readException();
          return;
        } finally {
          parcel2.recycle();
          parcel1.recycle();
        } 
      }
    }
  }
  
  private static class a implements a {
    private IBinder b;
    
    a(IBinder param1IBinder) {
      this.b = param1IBinder;
    }
    
    public void P8(String param1String, Bundle param1Bundle) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        parcel1.writeString(param1String);
        if (param1Bundle != null) {
          parcel1.writeInt(1);
          param1Bundle.writeToParcel(parcel1, 0);
        } else {
          parcel1.writeInt(0);
        } 
        this.b.transact(5, parcel1, parcel2, 0);
        parcel2.readException();
        return;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public void R7(int param1Int, Bundle param1Bundle) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        parcel1.writeInt(param1Int);
        if (param1Bundle != null) {
          parcel1.writeInt(1);
          param1Bundle.writeToParcel(parcel1, 0);
        } else {
          parcel1.writeInt(0);
        } 
        this.b.transact(2, parcel1, parcel2, 0);
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
    
    public void b9(Bundle param1Bundle) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        if (param1Bundle != null) {
          parcel1.writeInt(1);
          param1Bundle.writeToParcel(parcel1, 0);
        } else {
          parcel1.writeInt(0);
        } 
        this.b.transact(4, parcel1, parcel2, 0);
        parcel2.readException();
        return;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public void d7(String param1String, Bundle param1Bundle) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        parcel1.writeString(param1String);
        if (param1Bundle != null) {
          parcel1.writeInt(1);
          param1Bundle.writeToParcel(parcel1, 0);
        } else {
          parcel1.writeInt(0);
        } 
        this.b.transact(3, parcel1, parcel2, 0);
        parcel2.readException();
        return;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
    
    public void l9(int param1Int, Uri param1Uri, boolean param1Boolean, Bundle param1Bundle) {
      Parcel parcel1 = Parcel.obtain();
      Parcel parcel2 = Parcel.obtain();
      try {
        parcel1.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
        parcel1.writeInt(param1Int);
        if (param1Uri != null) {
          parcel1.writeInt(1);
          param1Uri.writeToParcel(parcel1, 0);
        } else {
          parcel1.writeInt(0);
        } 
        if (param1Boolean) {
          param1Int = 1;
        } else {
          param1Int = 0;
        } 
        parcel1.writeInt(param1Int);
        if (param1Bundle != null) {
          parcel1.writeInt(1);
          param1Bundle.writeToParcel(parcel1, 0);
        } else {
          parcel1.writeInt(0);
        } 
        this.b.transact(6, parcel1, parcel2, 0);
        parcel2.readException();
        return;
      } finally {
        parcel2.recycle();
        parcel1.recycle();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */