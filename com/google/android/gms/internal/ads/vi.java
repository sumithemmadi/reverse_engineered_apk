package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class vi extends sb2 implements ti {
  vi(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
  }
  
  public final void S1() {
    i1(1, a2());
  }
  
  public final void i7(int paramInt) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt);
    i1(2, parcel);
  }
  
  public final void s8(zzvg paramzzvg) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzvg);
    i1(3, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */