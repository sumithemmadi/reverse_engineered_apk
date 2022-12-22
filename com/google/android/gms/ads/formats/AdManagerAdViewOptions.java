package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.internal.ads.g5;
import com.google.android.gms.internal.ads.h5;

public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
  public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new h();
  
  private final boolean b;
  
  private final IBinder c;
  
  AdManagerAdViewOptions(boolean paramBoolean, IBinder paramIBinder) {
    this.b = paramBoolean;
    this.c = paramIBinder;
  }
  
  public final boolean o0() {
    return this.b;
  }
  
  public final h5 p0() {
    return g5.S9(this.c);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.c(paramParcel, 1, o0());
    a.j(paramParcel, 2, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/formats/AdManagerAdViewOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */