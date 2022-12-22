package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;

public final class mn1 extends sb2 implements kn1 {
  mn1(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.omid.IOmid");
  }
  
  public final a C3(String paramString1, a parama, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8) {
    Parcel parcel2 = a2();
    parcel2.writeString(paramString1);
    tb2.c(parcel2, (IInterface)parama);
    parcel2.writeString(paramString2);
    parcel2.writeString(paramString3);
    parcel2.writeString(paramString4);
    parcel2.writeString(paramString5);
    parcel2.writeString(paramString6);
    parcel2.writeString(paramString7);
    parcel2.writeString(paramString8);
    Parcel parcel1 = Y0(10, parcel2);
    parama = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return parama;
  }
  
  public final void C6(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(7, parcel);
  }
  
  public final void H9(a parama) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama);
    i1(4, parcel);
  }
  
  public final boolean Q3(a parama) {
    Parcel parcel2 = a2();
    tb2.c(parcel2, (IInterface)parama);
    Parcel parcel1 = Y0(2, parcel2);
    boolean bool = tb2.e(parcel1);
    parcel1.recycle();
    return bool;
  }
  
  public final void U1(a parama1, a parama2) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama1);
    tb2.c(parcel, (IInterface)parama2);
    i1(8, parcel);
  }
  
  public final String a9() {
    Parcel parcel = Y0(6, a2());
    String str = parcel.readString();
    parcel.recycle();
    return str;
  }
  
  public final void b3(a parama1, a parama2) {
    Parcel parcel = a2();
    tb2.c(parcel, (IInterface)parama1);
    tb2.c(parcel, (IInterface)parama2);
    i1(5, parcel);
  }
  
  public final a n4(String paramString1, a parama, String paramString2, String paramString3, String paramString4, String paramString5) {
    Parcel parcel2 = a2();
    parcel2.writeString(paramString1);
    tb2.c(parcel2, (IInterface)parama);
    parcel2.writeString(paramString2);
    parcel2.writeString(paramString3);
    parcel2.writeString(paramString4);
    parcel2.writeString(paramString5);
    Parcel parcel1 = Y0(9, parcel2);
    a a1 = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
  
  public final a y2(String paramString1, a parama, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8) {
    Parcel parcel2 = a2();
    parcel2.writeString(paramString1);
    tb2.c(parcel2, (IInterface)parama);
    parcel2.writeString(paramString2);
    parcel2.writeString(paramString3);
    parcel2.writeString(paramString4);
    parcel2.writeString(paramString5);
    parcel2.writeString(paramString6);
    parcel2.writeString(paramString7);
    parcel2.writeString(paramString8);
    Parcel parcel1 = Y0(11, parcel2);
    parama = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return parama;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/mn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */