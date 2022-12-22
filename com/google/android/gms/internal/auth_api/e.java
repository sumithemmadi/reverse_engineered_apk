package com.google.android.gms.internal.auth_api;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class e {
  private static final ClassLoader a = com.google.android.gms.internal.auth-api.e.class.getClassLoader();
  
  public static <T extends Parcelable> T a(Parcel paramParcel, Parcelable.Creator<T> paramCreator) {
    return (T)((paramParcel.readInt() == 0) ? null : (Parcelable)paramCreator.createFromParcel(paramParcel));
  }
  
  public static void b(Parcel paramParcel, IInterface paramIInterface) {
    if (paramIInterface == null) {
      paramParcel.writeStrongBinder(null);
      return;
    } 
    paramParcel.writeStrongBinder(paramIInterface.asBinder());
  }
  
  public static void c(Parcel paramParcel, Parcelable paramParcelable) {
    if (paramParcelable == null) {
      paramParcel.writeInt(0);
      return;
    } 
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth_api/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */