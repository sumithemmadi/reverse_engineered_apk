package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.b;
import com.google.android.gms.internal.common.c;

public final class j extends b implements k {
  j(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
  }
  
  public final int G5(a parama, String paramString, boolean paramBoolean) {
    Parcel parcel2 = Y0();
    c.b(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    c.d(parcel2, paramBoolean);
    Parcel parcel1 = i1(5, parcel2);
    int i = parcel1.readInt();
    parcel1.recycle();
    return i;
  }
  
  public final a J3(a parama, String paramString, int paramInt) {
    Parcel parcel2 = Y0();
    c.b(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = i1(2, parcel2);
    parama = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return parama;
  }
  
  public final int X6(a parama, String paramString, boolean paramBoolean) {
    Parcel parcel2 = Y0();
    c.b(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    c.d(parcel2, paramBoolean);
    Parcel parcel1 = i1(3, parcel2);
    int i = parcel1.readInt();
    parcel1.recycle();
    return i;
  }
  
  public final int b() {
    Parcel parcel = i1(6, Y0());
    int i = parcel.readInt();
    parcel.recycle();
    return i;
  }
  
  public final a r7(a parama, String paramString, int paramInt) {
    Parcel parcel2 = Y0();
    c.b(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = i1(4, parcel2);
    a a1 = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/dynamite/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */