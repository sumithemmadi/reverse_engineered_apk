package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public class AccountChangeEvent extends AbstractSafeParcelable {
  public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new c();
  
  private final int b;
  
  private final long c;
  
  private final String d;
  
  private final int e;
  
  private final int f;
  
  private final String g;
  
  AccountChangeEvent(int paramInt1, long paramLong, String paramString1, int paramInt2, int paramInt3, String paramString2) {
    this.b = paramInt1;
    this.c = paramLong;
    this.d = (String)t.j(paramString1);
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramString2;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof AccountChangeEvent) {
      paramObject = paramObject;
      if (this.b == ((AccountChangeEvent)paramObject).b && this.c == ((AccountChangeEvent)paramObject).c && r.a(this.d, ((AccountChangeEvent)paramObject).d) && this.e == ((AccountChangeEvent)paramObject).e && this.f == ((AccountChangeEvent)paramObject).f && r.a(this.g, ((AccountChangeEvent)paramObject).g))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    return r.b(new Object[] { Integer.valueOf(this.b), Long.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g });
  }
  
  public String toString() {
    String str1;
    int i = this.e;
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i != 4) {
            str1 = "UNKNOWN";
          } else {
            str1 = "RENAMED_TO";
          } 
        } else {
          str1 = "RENAMED_FROM";
        } 
      } else {
        str1 = "REMOVED";
      } 
    } else {
      str1 = "ADDED";
    } 
    String str2 = this.d;
    String str3 = this.g;
    i = this.f;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 91 + str1.length() + String.valueOf(str3).length());
    stringBuilder.append("AccountChangeEvent {accountName = ");
    stringBuilder.append(str2);
    stringBuilder.append(", changeType = ");
    stringBuilder.append(str1);
    stringBuilder.append(", changeData = ");
    stringBuilder.append(str3);
    stringBuilder.append(", eventIndex = ");
    stringBuilder.append(i);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.n(paramParcel, 2, this.c);
    a.r(paramParcel, 3, this.d, false);
    a.k(paramParcel, 4, this.e);
    a.k(paramParcel, 5, this.f);
    a.r(paramParcel, 6, this.g, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/AccountChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */