package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class e3 extends ub2 implements f3 {
  public e3() {
    super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
  }
  
  public static f3 S9(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    return (iInterface instanceof f3) ? (f3)iInterface : new h3(paramIBinder);
  }
  
  protected final boolean R9(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 2) {
      if (paramInt1 != 3)
        return false; 
      List<m3> list = v4();
      paramParcel2.writeNoException();
      paramParcel2.writeList(list);
    } else {
      String str = R1();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str);
    } 
    return true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/e3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */