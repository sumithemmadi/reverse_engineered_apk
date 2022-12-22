package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.w0;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

public final class zzj extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzj> CREATOR = new w();
  
  private final String b;
  
  private final o c;
  
  private final boolean d;
  
  private final boolean e;
  
  zzj(String paramString, IBinder paramIBinder, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramString;
    this.c = o0(paramIBinder);
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  zzj(String paramString, o paramo, boolean paramBoolean1, boolean paramBoolean2) {
    this.b = paramString;
    this.c = paramo;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
  }
  
  private static o o0(IBinder paramIBinder) {
    byte[] arrayOfByte = null;
    if (paramIBinder == null)
      return null; 
    try {
      byte[] arrayOfByte1;
      a a = w0.i1(paramIBinder).b();
      if (a == null) {
        a = null;
      } else {
        arrayOfByte1 = (byte[])b.o1(a);
      } 
      if (arrayOfByte1 != null) {
        r r = new r(arrayOfByte1);
      } else {
        Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
        arrayOfByte1 = arrayOfByte;
      } 
      return (o)arrayOfByte1;
    } catch (RemoteException remoteException) {
      Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", (Throwable)remoteException);
      return null;
    } 
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    IBinder iBinder;
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    o o1 = this.c;
    if (o1 == null) {
      Log.w("GoogleCertificatesQuery", "certificate binder is null");
      o1 = null;
    } else {
      iBinder = o1.asBinder();
    } 
    a.j(paramParcel, 2, iBinder, false);
    a.c(paramParcel, 3, this.d);
    a.c(paramParcel, 4, this.e);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */