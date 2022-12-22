package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import java.util.ArrayList;
import java.util.List;

public final class ts2 extends sb2 implements rs2 {
  ts2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
  }
  
  public final void D() {
    i1(1, a2());
  }
  
  public final void D8(mb parammb) {
    Parcel parcel = a2();
    tb2.c(parcel, parammb);
    i1(11, parcel);
  }
  
  public final void I5(a8 parama8) {
    Parcel parcel = a2();
    tb2.c(parcel, parama8);
    i1(12, parcel);
  }
  
  public final List<zzajh> O9() {
    Parcel parcel = Y0(13, a2());
    ArrayList<zzajh> arrayList = parcel.createTypedArrayList(zzajh.CREATOR);
    parcel.recycle();
    return arrayList;
  }
  
  public final void d8(zzaao paramzzaao) {
    Parcel parcel = a2();
    tb2.d(parcel, (Parcelable)paramzzaao);
    i1(14, parcel);
  }
  
  public final String j5() {
    Parcel parcel = Y0(9, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final void v5(String paramString, a parama) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    tb2.c(parcel, (IInterface)parama);
    i1(6, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ts2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */