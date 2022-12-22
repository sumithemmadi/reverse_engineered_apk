package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class GetServiceRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<GetServiceRequest> CREATOR = new m0();
  
  private final int b = 4;
  
  private final int c;
  
  private int d;
  
  String e;
  
  IBinder f;
  
  Scope[] g;
  
  Bundle h;
  
  Account i;
  
  Feature[] j;
  
  Feature[] k;
  
  private boolean l;
  
  private int m;
  
  public GetServiceRequest(int paramInt) {
    this.d = c.a;
    this.c = paramInt;
    this.l = true;
  }
  
  GetServiceRequest(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, Feature[] paramArrayOfFeature1, Feature[] paramArrayOfFeature2, boolean paramBoolean, int paramInt4) {
    this.c = paramInt2;
    this.d = paramInt3;
    if ("com.google.android.gms".equals(paramString)) {
      this.e = "com.google.android.gms";
    } else {
      this.e = paramString;
    } 
    if (paramInt1 < 2) {
      Account account;
      paramString = null;
      if (paramIBinder != null)
        account = a.o1(l.a.i1(paramIBinder)); 
      this.i = account;
    } else {
      this.f = paramIBinder;
      this.i = paramAccount;
    } 
    this.g = paramArrayOfScope;
    this.h = paramBundle;
    this.j = paramArrayOfFeature1;
    this.k = paramArrayOfFeature2;
    this.l = paramBoolean;
    this.m = paramInt4;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.k(paramParcel, 2, this.c);
    a.k(paramParcel, 3, this.d);
    a.r(paramParcel, 4, this.e, false);
    a.j(paramParcel, 5, this.f, false);
    a.u(paramParcel, 6, (Parcelable[])this.g, paramInt, false);
    a.e(paramParcel, 7, this.h, false);
    a.q(paramParcel, 8, (Parcelable)this.i, paramInt, false);
    a.u(paramParcel, 10, (Parcelable[])this.j, paramInt, false);
    a.u(paramParcel, 11, (Parcelable[])this.k, paramInt, false);
    a.c(paramParcel, 12, this.l);
    a.k(paramParcel, 13, this.m);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/GetServiceRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */