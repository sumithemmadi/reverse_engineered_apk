package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public class GetSignInIntentRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new c();
  
  private final String b;
  
  private final String c;
  
  private String d;
  
  GetSignInIntentRequest(String paramString1, String paramString2, String paramString3) {
    t.j(paramString1);
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof GetSignInIntentRequest))
      return false; 
    paramObject = paramObject;
    return (r.a(this.b, ((GetSignInIntentRequest)paramObject).b) && r.a(this.c, ((GetSignInIntentRequest)paramObject).c) && r.a(this.d, ((GetSignInIntentRequest)paramObject).d));
  }
  
  public int hashCode() {
    return r.b(new Object[] { this.b, this.c, this.d });
  }
  
  public String o0() {
    return this.c;
  }
  
  public String p0() {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, p0(), false);
    a.r(paramParcel, 2, o0(), false);
    a.r(paramParcel, 3, this.d, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/identity/GetSignInIntentRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */