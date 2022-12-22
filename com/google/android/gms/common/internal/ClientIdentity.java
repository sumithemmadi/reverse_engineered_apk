package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class ClientIdentity extends AbstractSafeParcelable {
  public static final Parcelable.Creator<ClientIdentity> CREATOR = new y();
  
  private final int b;
  
  private final String c;
  
  public ClientIdentity(int paramInt, String paramString) {
    this.b = paramInt;
    this.c = paramString;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject != null && paramObject instanceof ClientIdentity) {
      paramObject = paramObject;
      if (((ClientIdentity)paramObject).b == this.b && r.a(((ClientIdentity)paramObject).c, this.c))
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b;
  }
  
  public String toString() {
    int i = this.b;
    String str = this.c;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
    stringBuilder.append(i);
    stringBuilder.append(":");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/ClientIdentity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */