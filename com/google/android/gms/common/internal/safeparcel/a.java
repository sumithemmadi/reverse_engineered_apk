package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class a {
  public static int a(Parcel paramParcel) {
    return w(paramParcel, 20293);
  }
  
  public static void b(Parcel paramParcel, int paramInt) {
    z(paramParcel, paramInt);
  }
  
  public static void c(Parcel paramParcel, int paramInt, boolean paramBoolean) {
    x(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void d(Parcel paramParcel, int paramInt, Boolean paramBoolean, boolean paramBoolean1) {
    if (paramBoolean == null) {
      if (paramBoolean1)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    x(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramBoolean.booleanValue());
  }
  
  public static void e(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean) {
    if (paramBundle == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = w(paramParcel, paramInt);
    paramParcel.writeBundle(paramBundle);
    z(paramParcel, paramInt);
  }
  
  public static void f(Parcel paramParcel, int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    if (paramArrayOfbyte == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = w(paramParcel, paramInt);
    paramParcel.writeByteArray(paramArrayOfbyte);
    z(paramParcel, paramInt);
  }
  
  public static void g(Parcel paramParcel, int paramInt, Double paramDouble, boolean paramBoolean) {
    if (paramDouble == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    x(paramParcel, paramInt, 8);
    paramParcel.writeDouble(paramDouble.doubleValue());
  }
  
  public static void h(Parcel paramParcel, int paramInt, float paramFloat) {
    x(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat);
  }
  
  public static void i(Parcel paramParcel, int paramInt, Float paramFloat, boolean paramBoolean) {
    if (paramFloat == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    x(paramParcel, paramInt, 4);
    paramParcel.writeFloat(paramFloat.floatValue());
  }
  
  public static void j(Parcel paramParcel, int paramInt, IBinder paramIBinder, boolean paramBoolean) {
    if (paramIBinder == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = w(paramParcel, paramInt);
    paramParcel.writeStrongBinder(paramIBinder);
    z(paramParcel, paramInt);
  }
  
  public static void k(Parcel paramParcel, int paramInt1, int paramInt2) {
    x(paramParcel, paramInt1, 4);
    paramParcel.writeInt(paramInt2);
  }
  
  public static void l(Parcel paramParcel, int paramInt, List<Integer> paramList, boolean paramBoolean) {
    boolean bool = false;
    if (paramList == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    int i = w(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = bool; paramInt < j; paramInt++)
      paramParcel.writeInt(((Integer)paramList.get(paramInt)).intValue()); 
    z(paramParcel, i);
  }
  
  public static void m(Parcel paramParcel, int paramInt, Integer paramInteger, boolean paramBoolean) {
    if (paramInteger == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    x(paramParcel, paramInt, 4);
    paramParcel.writeInt(paramInteger.intValue());
  }
  
  public static void n(Parcel paramParcel, int paramInt, long paramLong) {
    x(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong);
  }
  
  public static void o(Parcel paramParcel, int paramInt, Long paramLong, boolean paramBoolean) {
    if (paramLong == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    x(paramParcel, paramInt, 8);
    paramParcel.writeLong(paramLong.longValue());
  }
  
  public static void p(Parcel paramParcel1, int paramInt, Parcel paramParcel2, boolean paramBoolean) {
    if (paramParcel2 == null) {
      if (paramBoolean)
        x(paramParcel1, paramInt, 0); 
      return;
    } 
    paramInt = w(paramParcel1, paramInt);
    paramParcel1.appendFrom(paramParcel2, 0, paramParcel2.dataSize());
    z(paramParcel1, paramInt);
  }
  
  public static void q(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean) {
    if (paramParcelable == null) {
      if (paramBoolean)
        x(paramParcel, paramInt1, 0); 
      return;
    } 
    paramInt1 = w(paramParcel, paramInt1);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    z(paramParcel, paramInt1);
  }
  
  public static void r(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean) {
    if (paramString == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = w(paramParcel, paramInt);
    paramParcel.writeString(paramString);
    z(paramParcel, paramInt);
  }
  
  public static void s(Parcel paramParcel, int paramInt, String[] paramArrayOfString, boolean paramBoolean) {
    if (paramArrayOfString == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = w(paramParcel, paramInt);
    paramParcel.writeStringArray(paramArrayOfString);
    z(paramParcel, paramInt);
  }
  
  public static void t(Parcel paramParcel, int paramInt, List<String> paramList, boolean paramBoolean) {
    if (paramList == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    paramInt = w(paramParcel, paramInt);
    paramParcel.writeStringList(paramList);
    z(paramParcel, paramInt);
  }
  
  public static <T extends Parcelable> void u(Parcel paramParcel, int paramInt1, T[] paramArrayOfT, int paramInt2, boolean paramBoolean) {
    if (paramArrayOfT == null) {
      if (paramBoolean)
        x(paramParcel, paramInt1, 0); 
      return;
    } 
    int i = w(paramParcel, paramInt1);
    int j = paramArrayOfT.length;
    paramParcel.writeInt(j);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
      T t = paramArrayOfT[paramInt1];
      if (t == null) {
        paramParcel.writeInt(0);
      } else {
        y(paramParcel, t, paramInt2);
      } 
    } 
    z(paramParcel, i);
  }
  
  public static <T extends Parcelable> void v(Parcel paramParcel, int paramInt, List<T> paramList, boolean paramBoolean) {
    if (paramList == null) {
      if (paramBoolean)
        x(paramParcel, paramInt, 0); 
      return;
    } 
    int i = w(paramParcel, paramInt);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = 0; paramInt < j; paramInt++) {
      Parcelable parcelable = (Parcelable)paramList.get(paramInt);
      if (parcelable == null) {
        paramParcel.writeInt(0);
      } else {
        y(paramParcel, parcelable, 0);
      } 
    } 
    z(paramParcel, i);
  }
  
  private static int w(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(paramInt | 0xFFFF0000);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  private static void x(Parcel paramParcel, int paramInt1, int paramInt2) {
    if (paramInt2 >= 65535) {
      paramParcel.writeInt(paramInt1 | 0xFFFF0000);
      paramParcel.writeInt(paramInt2);
      return;
    } 
    paramParcel.writeInt(paramInt1 | paramInt2 << 16);
  }
  
  private static <T extends Parcelable> void y(Parcel paramParcel, T paramT, int paramInt) {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramT.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
  }
  
  private static void z(Parcel paramParcel, int paramInt) {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/safeparcel/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */