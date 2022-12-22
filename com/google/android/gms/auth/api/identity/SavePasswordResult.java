package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public class SavePasswordResult extends AbstractSafeParcelable {
  public static final Parcelable.Creator<SavePasswordResult> CREATOR = new g();
  
  private final PendingIntent b;
  
  public SavePasswordResult(PendingIntent paramPendingIntent) {
    this.b = (PendingIntent)t.j(paramPendingIntent);
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof SavePasswordResult))
      return false; 
    paramObject = paramObject;
    return r.a(this.b, ((SavePasswordResult)paramObject).b);
  }
  
  public int hashCode() {
    return r.b(new Object[] { this.b });
  }
  
  public PendingIntent o0() {
    return this.b;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 1, (Parcelable)o0(), paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/identity/SavePasswordResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */