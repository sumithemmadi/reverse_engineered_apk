package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.base.b;
import com.google.android.gms.internal.base.c;

public final class d0 extends b implements q {
  d0(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
  }
  
  public final a C4(a parama, SignInButtonConfig paramSignInButtonConfig) {
    Parcel parcel2 = Y0();
    c.b(parcel2, (IInterface)parama);
    c.c(parcel2, (Parcelable)paramSignInButtonConfig);
    Parcel parcel1 = i1(2, parcel2);
    parama = a.a.i1(parcel1.readStrongBinder());
    parcel1.recycle();
    return parama;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */