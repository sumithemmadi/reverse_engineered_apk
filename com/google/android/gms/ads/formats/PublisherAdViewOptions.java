package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.internal.ads.fs2;
import com.google.android.gms.internal.ads.g5;
import com.google.android.gms.internal.ads.h5;
import com.google.android.gms.internal.ads.is2;

@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
  public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new j();
  
  private final boolean b;
  
  private final fs2 c;
  
  private final IBinder d;
  
  PublisherAdViewOptions(boolean paramBoolean, IBinder paramIBinder1, IBinder paramIBinder2) {
    this.b = paramBoolean;
    if (paramIBinder1 != null) {
      fs2 fs21 = is2.S9(paramIBinder1);
    } else {
      paramIBinder1 = null;
    } 
    this.c = (fs2)paramIBinder1;
    this.d = paramIBinder2;
  }
  
  public final boolean o0() {
    return this.b;
  }
  
  public final h5 p0() {
    return g5.S9(this.d);
  }
  
  public final fs2 q0() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    IBinder iBinder;
    paramInt = a.a(paramParcel);
    a.c(paramParcel, 1, o0());
    fs2 fs21 = this.c;
    if (fs21 == null) {
      fs21 = null;
    } else {
      iBinder = fs21.asBinder();
    } 
    a.j(paramParcel, 2, iBinder, false);
    a.j(paramParcel, 3, this.d, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/formats/PublisherAdViewOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */