package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<TokenData> CREATOR = new j();
  
  private final int b;
  
  private final String c;
  
  private final Long d;
  
  private final boolean e;
  
  private final boolean f;
  
  private final List<String> g;
  
  private final String h;
  
  TokenData(int paramInt, String paramString1, Long paramLong, boolean paramBoolean1, boolean paramBoolean2, List<String> paramList, String paramString2) {
    this.b = paramInt;
    this.c = t.f(paramString1);
    this.d = paramLong;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
    this.g = paramList;
    this.h = paramString2;
  }
  
  public static TokenData o0(Bundle paramBundle, String paramString) {
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    paramBundle = paramBundle.getBundle(paramString);
    if (paramBundle == null)
      return null; 
    paramBundle.setClassLoader(TokenData.class.getClassLoader());
    return (TokenData)paramBundle.getParcelable("TokenData");
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof TokenData))
      return false; 
    paramObject = paramObject;
    return (TextUtils.equals(this.c, ((TokenData)paramObject).c) && r.a(this.d, ((TokenData)paramObject).d) && this.e == ((TokenData)paramObject).e && this.f == ((TokenData)paramObject).f && r.a(this.g, ((TokenData)paramObject).g) && r.a(this.h, ((TokenData)paramObject).h));
  }
  
  public int hashCode() {
    return r.b(new Object[] { this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), this.g, this.h });
  }
  
  public final String p0() {
    return this.c;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.o(paramParcel, 3, this.d, false);
    a.c(paramParcel, 4, this.e);
    a.c(paramParcel, 5, this.f);
    a.t(paramParcel, 6, this.g, false);
    a.r(paramParcel, 7, this.h, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/TokenData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */