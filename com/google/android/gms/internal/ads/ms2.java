package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;

public final class ms2 extends sb2 implements ks2 {
  ms2(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.client.IClientApi");
  }
  
  public final ur2 L3(a parama, String paramString, mb parammb, int paramInt) {
    ur2 ur2;
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(3, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
      if (iInterface instanceof ur2) {
        ur2 = (ur2)iInterface;
      } else {
        ur2 = new wr2((IBinder)ur2);
      } 
    } 
    parcel1.recycle();
    return ur2;
  }
  
  public final af M5(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel = Y0(8, parcel);
    af af = df.S9(parcel.readStrongBinder());
    parcel.recycle();
    return af;
  }
  
  public final xr2 Q9(a parama, zzvs paramzzvs, String paramString, mb parammb, int paramInt) {
    xr2 xr2;
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.d(parcel2, (Parcelable)paramzzvs);
    parcel2.writeString(paramString);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(2, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if (iInterface instanceof xr2) {
        xr2 = (xr2)iInterface;
      } else {
        xr2 = new zr2((IBinder)xr2);
      } 
    } 
    parcel1.recycle();
    return xr2;
  }
  
  public final li X4(a parama, String paramString, mb parammb, int paramInt) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(12, parcel2);
    li li = oi.S9(parcel1.readStrongBinder());
    parcel1.recycle();
    return li;
  }
  
  public final rh Y4(a parama, mb parammb, int paramInt) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(6, parcel2);
    rh rh = qh.S9(parcel1.readStrongBinder());
    parcel1.recycle();
    return rh;
  }
  
  public final xr2 a8(a parama, zzvs paramzzvs, String paramString, mb parammb, int paramInt) {
    xr2 xr2;
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.d(parcel2, (Parcelable)paramzzvs);
    parcel2.writeString(paramString);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(1, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if (iInterface instanceof xr2) {
        xr2 = (xr2)iInterface;
      } else {
        xr2 = new zr2((IBinder)xr2);
      } 
    } 
    parcel1.recycle();
    return xr2;
  }
  
  public final xr2 i2(a parama, zzvs paramzzvs, String paramString, mb parammb, int paramInt) {
    xr2 xr2;
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.d(parcel2, (Parcelable)paramzzvs);
    parcel2.writeString(paramString);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(13, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if (iInterface instanceof xr2) {
        xr2 = (xr2)iInterface;
      } else {
        xr2 = new zr2((IBinder)xr2);
      } 
    } 
    parcel1.recycle();
    return xr2;
  }
  
  public final te j0(a parama, mb parammb, int paramInt) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.c(parcel2, parammb);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(15, parcel2);
    te te = se.S9(parcel1.readStrongBinder());
    parcel1.recycle();
    return te;
  }
  
  public final xr2 o5(a parama, zzvs paramzzvs, String paramString, int paramInt) {
    IInterface iInterface;
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    tb2.d(parcel2, (Parcelable)paramzzvs);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = Y0(10, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      parama = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
      if (iInterface instanceof xr2) {
        iInterface = iInterface;
      } else {
        iInterface = new zr2(iBinder);
      } 
    } 
    parcel1.recycle();
    return (xr2)iInterface;
  }
  
  public final rs2 o8(a parama, int paramInt) {
    rs2 rs2;
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    parcel.writeInt(paramInt);
    parcel = Y0(9, parcel);
    IBinder iBinder = parcel.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
      if (iInterface instanceof rs2) {
        rs2 = (rs2)iInterface;
      } else {
        rs2 = new ts2((IBinder)rs2);
      } 
    } 
    parcel.recycle();
    return rs2;
  }
  
  public final q3 s5(a parama1, a parama2) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama1);
    tb2.c(parcel2, (IInterface)parama2);
    Parcel parcel1 = Y0(5, parcel2);
    q3 q3 = p3.S9(parcel1.readStrongBinder());
    parcel1.recycle();
    return q3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ms2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */