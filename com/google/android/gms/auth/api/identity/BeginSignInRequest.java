package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class BeginSignInRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new a();
  
  private final PasswordRequestOptions b;
  
  private final GoogleIdTokenRequestOptions c;
  
  private final String d;
  
  private final boolean e;
  
  BeginSignInRequest(PasswordRequestOptions paramPasswordRequestOptions, GoogleIdTokenRequestOptions paramGoogleIdTokenRequestOptions, String paramString, boolean paramBoolean) {
    this.b = (PasswordRequestOptions)t.j(paramPasswordRequestOptions);
    this.c = (GoogleIdTokenRequestOptions)t.j(paramGoogleIdTokenRequestOptions);
    this.d = paramString;
    this.e = paramBoolean;
  }
  
  private static List<String> r0(List<String> paramList) {
    if (paramList == null || paramList.isEmpty())
      return null; 
    paramList = new ArrayList<String>(paramList);
    Collections.sort(paramList);
    return paramList;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof BeginSignInRequest))
      return false; 
    paramObject = paramObject;
    return (r.a(this.b, ((BeginSignInRequest)paramObject).b) && r.a(this.c, ((BeginSignInRequest)paramObject).c) && r.a(this.d, ((BeginSignInRequest)paramObject).d) && this.e == ((BeginSignInRequest)paramObject).e);
  }
  
  public final int hashCode() {
    return r.b(new Object[] { this.b, this.c, this.d, Boolean.valueOf(this.e) });
  }
  
  public final GoogleIdTokenRequestOptions o0() {
    return this.c;
  }
  
  public final PasswordRequestOptions p0() {
    return this.b;
  }
  
  public final boolean q0() {
    return this.e;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 1, (Parcelable)p0(), paramInt, false);
    a.q(paramParcel, 2, (Parcelable)o0(), paramInt, false);
    a.r(paramParcel, 3, this.d, false);
    a.c(paramParcel, 4, q0());
    a.b(paramParcel, i);
  }
  
  public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new d();
    
    private final boolean b;
    
    private final String c;
    
    private final String d;
    
    private final boolean e;
    
    private final String f;
    
    private final List<String> g;
    
    GoogleIdTokenRequestOptions(boolean param1Boolean1, String param1String1, String param1String2, boolean param1Boolean2, String param1String3, List<String> param1List) {
      this.b = param1Boolean1;
      if (param1Boolean1)
        t.k(param1String1, "serverClientId must be provided if Google ID tokens are requested"); 
      this.c = param1String1;
      this.d = param1String2;
      this.e = param1Boolean2;
      this.g = BeginSignInRequest.s0(param1List);
      this.f = param1String3;
    }
    
    public final boolean equals(Object param1Object) {
      if (!(param1Object instanceof GoogleIdTokenRequestOptions))
        return false; 
      param1Object = param1Object;
      return (this.b == ((GoogleIdTokenRequestOptions)param1Object).b && r.a(this.c, ((GoogleIdTokenRequestOptions)param1Object).c) && r.a(this.d, ((GoogleIdTokenRequestOptions)param1Object).d) && this.e == ((GoogleIdTokenRequestOptions)param1Object).e && r.a(this.f, ((GoogleIdTokenRequestOptions)param1Object).f) && r.a(this.g, ((GoogleIdTokenRequestOptions)param1Object).g));
    }
    
    public final int hashCode() {
      return r.b(new Object[] { Boolean.valueOf(this.b), this.c, this.d, Boolean.valueOf(this.e), this.f, this.g });
    }
    
    public final boolean o0() {
      return this.e;
    }
    
    public final String p0() {
      return this.d;
    }
    
    public final String q0() {
      return this.c;
    }
    
    public final boolean r0() {
      return this.b;
    }
    
    public final void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Int = a.a(param1Parcel);
      a.c(param1Parcel, 1, r0());
      a.r(param1Parcel, 2, q0(), false);
      a.r(param1Parcel, 3, p0(), false);
      a.c(param1Parcel, 4, o0());
      a.r(param1Parcel, 5, this.f, false);
      a.t(param1Parcel, 6, this.g, false);
      a.b(param1Parcel, param1Int);
    }
  }
  
  public static final class PasswordRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();
    
    private final boolean b;
    
    PasswordRequestOptions(boolean param1Boolean) {
      this.b = param1Boolean;
    }
    
    public final boolean equals(Object param1Object) {
      if (!(param1Object instanceof PasswordRequestOptions))
        return false; 
      param1Object = param1Object;
      return (this.b == ((PasswordRequestOptions)param1Object).b);
    }
    
    public final int hashCode() {
      return r.b(new Object[] { Boolean.valueOf(this.b) });
    }
    
    public final boolean o0() {
      return this.b;
    }
    
    public final void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Int = a.a(param1Parcel);
      a.c(param1Parcel, 1, o0());
      a.b(param1Parcel, param1Int);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/identity/BeginSignInRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */