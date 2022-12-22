package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.b;
import com.google.android.gms.internal.common.c;

public interface l extends IInterface {
  Account zza();
  
  public static abstract class a extends com.google.android.gms.internal.common.a implements l {
    public static l i1(IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      return (iInterface instanceof l) ? (l)iInterface : new a(param1IBinder);
    }
    
    public static final class a extends b implements l {
      a(IBinder param2IBinder) {
        super(param2IBinder, "com.google.android.gms.common.internal.IAccountAccessor");
      }
      
      public final Account zza() {
        Parcel parcel = i1(2, Y0());
        Account account = (Account)c.a(parcel, Account.CREATOR);
        parcel.recycle();
        return account;
      }
    }
  }
  
  public static final class a extends b implements l {
    a(IBinder param1IBinder) {
      super(param1IBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    public final Account zza() {
      Parcel parcel = i1(2, Y0());
      Account account = (Account)c.a(parcel, Account.CREATOR);
      parcel.recycle();
      return account;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */