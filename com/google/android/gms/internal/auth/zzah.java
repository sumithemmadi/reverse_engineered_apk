package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class zzah extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzah> CREATOR = new e();
  
  private final int b = 1;
  
  private final String c;
  
  private final PendingIntent d;
  
  zzah(int paramInt, String paramString, PendingIntent paramPendingIntent) {
    this.c = (String)t.j(paramString);
    this.d = (PendingIntent)t.j(paramPendingIntent);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.q(paramParcel, 3, (Parcelable)this.d, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/zzah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */