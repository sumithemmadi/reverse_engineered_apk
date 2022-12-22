package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new d();
  
  private final int b = 1;
  
  private int c;
  
  @Deprecated
  private String d;
  
  private Account e;
  
  public AccountChangeEventsRequest() {}
  
  AccountChangeEventsRequest(int paramInt1, int paramInt2, String paramString, Account paramAccount) {
    this.c = paramInt2;
    this.d = paramString;
    if (paramAccount == null && !TextUtils.isEmpty(paramString)) {
      this.e = new Account(paramString, "com.google");
      return;
    } 
    this.e = paramAccount;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, this.c);
    a.r(paramParcel, 3, this.d, false);
    a.q(paramParcel, 4, (Parcelable)this.e, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEventsRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */