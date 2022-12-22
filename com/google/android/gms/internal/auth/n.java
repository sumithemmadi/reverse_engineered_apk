package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class n extends a implements l {
  n(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.auth.IAuthManagerService");
  }
  
  public final Bundle Y8(Account paramAccount, String paramString, Bundle paramBundle) {
    Parcel parcel2 = Y0();
    k.b(parcel2, (Parcelable)paramAccount);
    parcel2.writeString(paramString);
    k.b(parcel2, (Parcelable)paramBundle);
    Parcel parcel1 = i1(5, parcel2);
    Bundle bundle = k.<Bundle>a(parcel1, Bundle.CREATOR);
    parcel1.recycle();
    return bundle;
  }
  
  public final Bundle l0(String paramString, Bundle paramBundle) {
    Parcel parcel2 = Y0();
    parcel2.writeString(paramString);
    k.b(parcel2, (Parcelable)paramBundle);
    Parcel parcel1 = i1(2, parcel2);
    Bundle bundle = k.<Bundle>a(parcel1, Bundle.CREATOR);
    parcel1.recycle();
    return bundle;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */