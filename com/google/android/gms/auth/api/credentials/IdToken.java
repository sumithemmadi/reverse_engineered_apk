package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<IdToken> CREATOR = new g();
  
  private final String b;
  
  private final String c;
  
  public IdToken(String paramString1, String paramString2) {
    t.b(TextUtils.isEmpty(paramString1) ^ true, "account type string cannot be null or empty");
    t.b(TextUtils.isEmpty(paramString2) ^ true, "id token string cannot be null or empty");
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof IdToken))
      return false; 
    paramObject = paramObject;
    return (r.a(this.b, ((IdToken)paramObject).b) && r.a(this.c, ((IdToken)paramObject).c));
  }
  
  public final String o0() {
    return this.b;
  }
  
  public final String p0() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, o0(), false);
    a.r(paramParcel, 2, p0(), false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/credentials/IdToken.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */