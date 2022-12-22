package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public class SavePasswordRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new f();
  
  private final SignInPassword b;
  
  private final String c;
  
  SavePasswordRequest(SignInPassword paramSignInPassword, String paramString) {
    this.b = (SignInPassword)t.j(paramSignInPassword);
    this.c = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof SavePasswordRequest))
      return false; 
    paramObject = paramObject;
    return (r.a(this.b, ((SavePasswordRequest)paramObject).b) && r.a(this.c, ((SavePasswordRequest)paramObject).c));
  }
  
  public int hashCode() {
    return r.b(new Object[] { this.b, this.c });
  }
  
  public SignInPassword o0() {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 1, (Parcelable)o0(), paramInt, false);
    a.r(paramParcel, 2, this.c, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/identity/SavePasswordRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */