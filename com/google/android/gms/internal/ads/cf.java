package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class cf extends sb2 implements af {
  cf(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
  }
  
  public final void G9(Bundle paramBundle) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramBundle);
    i1(1, parcel);
  }
  
  public final void L7() {
    i1(2, a2());
  }
  
  public final void M0() {
    i1(14, a2());
  }
  
  public final boolean S8() {
    Parcel parcel = Y0(11, a2());
    boolean bool = tb2.e(parcel);
    parcel.recycle();
    return bool;
  }
  
  public final void U7(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(13, parcel);
  }
  
  public final void X() {
    i1(7, a2());
  }
  
  public final void c5(Bundle paramBundle) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramBundle);
    parcel = Y0(6, parcel);
    if (parcel.readInt() != 0)
      paramBundle.readFromParcel(parcel); 
    parcel.recycle();
  }
  
  public final void onDestroy() {
    i1(8, a2());
  }
  
  public final void onPause() {
    i1(5, a2());
  }
  
  public final void onResume() {
    i1(4, a2());
  }
  
  public final void onStart() {
    i1(3, a2());
  }
  
  public final void x1(int paramInt1, int paramInt2, Intent paramIntent) {
    Parcel parcel = a2();
    parcel.writeInt(paramInt1);
    parcel.writeInt(paramInt2);
    tb2.d(parcel, (Parcelable)paramIntent);
    i1(12, parcel);
  }
  
  public final void x4() {
    i1(9, a2());
  }
  
  public final void z8() {
    i1(10, a2());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */