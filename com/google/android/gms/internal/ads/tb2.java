package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class tb2 {
  private static final ClassLoader a = tb2.class.getClassLoader();
  
  public static void a(Parcel paramParcel, boolean paramBoolean) {
    paramParcel.writeInt(paramBoolean);
  }
  
  public static <T extends Parcelable> T b(Parcel paramParcel, Parcelable.Creator<T> paramCreator) {
    return (T)((paramParcel.readInt() == 0) ? null : (Parcelable)paramCreator.createFromParcel(paramParcel));
  }
  
  public static void c(Parcel paramParcel, IInterface paramIInterface) {
    if (paramIInterface == null) {
      paramParcel.writeStrongBinder(null);
      return;
    } 
    paramParcel.writeStrongBinder(paramIInterface.asBinder());
  }
  
  public static void d(Parcel paramParcel, Parcelable paramParcelable) {
    if (paramParcelable == null) {
      paramParcel.writeInt(0);
      return;
    } 
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
  
  public static boolean e(Parcel paramParcel) {
    return (paramParcel.readInt() != 0);
  }
  
  public static ArrayList f(Parcel paramParcel) {
    return paramParcel.readArrayList(a);
  }
  
  public static void g(Parcel paramParcel, Parcelable paramParcelable) {
    if (paramParcelable == null) {
      paramParcel.writeInt(0);
      return;
    } 
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 1);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/tb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */