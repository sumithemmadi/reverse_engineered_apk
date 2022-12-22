package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
  public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new e();
  
  private final int b;
  
  private final List<AccountChangeEvent> c;
  
  AccountChangeEventsResponse(int paramInt, List<AccountChangeEvent> paramList) {
    this.b = paramInt;
    this.c = (List<AccountChangeEvent>)t.j(paramList);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.v(paramParcel, 2, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEventsResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */