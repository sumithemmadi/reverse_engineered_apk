package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class ResolveAccountRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new h0();
  
  private final int b;
  
  private final Account c;
  
  private final int d;
  
  private final GoogleSignInAccount e;
  
  ResolveAccountRequest(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount) {
    this.b = paramInt1;
    this.c = paramAccount;
    this.d = paramInt2;
    this.e = paramGoogleSignInAccount;
  }
  
  public ResolveAccountRequest(Account paramAccount, int paramInt, GoogleSignInAccount paramGoogleSignInAccount) {
    this(2, paramAccount, paramInt, paramGoogleSignInAccount);
  }
  
  public Account U() {
    return this.c;
  }
  
  public int o0() {
    return this.d;
  }
  
  public GoogleSignInAccount p0() {
    return this.e;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.q(paramParcel, 2, (Parcelable)U(), paramInt, false);
    a.k(paramParcel, 3, o0());
    a.q(paramParcel, 4, (Parcelable)p0(), paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/ResolveAccountRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */