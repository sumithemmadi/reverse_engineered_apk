package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;

public class k {
  private static final ClassLoader a = k.class.getClassLoader();
  
  public static <T extends Parcelable> T a(Parcel paramParcel, Parcelable.Creator<T> paramCreator) {
    return (T)((paramParcel.readInt() == 0) ? null : (Parcelable)paramCreator.createFromParcel(paramParcel));
  }
  
  public static void b(Parcel paramParcel, Parcelable paramParcelable) {
    if (paramParcelable == null) {
      paramParcel.writeInt(0);
      return;
    } 
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */