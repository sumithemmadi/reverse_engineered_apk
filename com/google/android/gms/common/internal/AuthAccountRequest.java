package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class AuthAccountRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new x();
  
  private final int b;
  
  @Deprecated
  private final IBinder c;
  
  private final Scope[] d;
  
  private Integer e;
  
  private Integer f;
  
  private Account g;
  
  AuthAccountRequest(int paramInt, IBinder paramIBinder, Scope[] paramArrayOfScope, Integer paramInteger1, Integer paramInteger2, Account paramAccount) {
    this.b = paramInt;
    this.c = paramIBinder;
    this.d = paramArrayOfScope;
    this.e = paramInteger1;
    this.f = paramInteger2;
    this.g = paramAccount;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.j(paramParcel, 2, this.c, false);
    a.u(paramParcel, 3, (Parcelable[])this.d, paramInt, false);
    a.m(paramParcel, 4, this.e, false);
    a.m(paramParcel, 5, this.f, false);
    a.q(paramParcel, 6, (Parcelable)this.g, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/AuthAccountRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */