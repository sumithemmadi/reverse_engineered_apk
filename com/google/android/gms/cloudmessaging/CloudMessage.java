package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class CloudMessage extends AbstractSafeParcelable {
  public static final Parcelable.Creator<CloudMessage> CREATOR = new c();
  
  private Intent b;
  
  public CloudMessage(Intent paramIntent) {
    this.b = paramIntent;
  }
  
  public final Intent o0() {
    return this.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 1, (Parcelable)this.b, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/cloudmessaging/CloudMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */