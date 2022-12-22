package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.b;
import com.google.android.gms.internal.common.c;

public final class l extends b implements m {
  l(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
  }
  
  public final a m2(a parama1, String paramString, int paramInt, a parama2) {
    Parcel parcel2 = Y0();
    c.b(parcel2, (IInterface)parama1);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    c.b(parcel2, (IInterface)parama2);
    Parcel parcel1 = i1(2, parcel2);
    parama1 = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return parama1;
  }
  
  public final a o2(a parama1, String paramString, int paramInt, a parama2) {
    Parcel parcel2 = Y0();
    c.b(parcel2, (IInterface)parama1);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    c.b(parcel2, (IInterface)parama2);
    Parcel parcel1 = i1(3, parcel2);
    a a1 = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamite/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */