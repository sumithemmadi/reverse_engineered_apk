package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class BeginSignInResult extends AbstractSafeParcelable {
  public static final Parcelable.Creator<BeginSignInResult> CREATOR = new b();
  
  private final PendingIntent b;
  
  public BeginSignInResult(PendingIntent paramPendingIntent) {
    this.b = (PendingIntent)t.j(paramPendingIntent);
  }
  
  public final PendingIntent o0() {
    return this.b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.q(paramParcel, 1, (Parcelable)o0(), paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/identity/BeginSignInResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */