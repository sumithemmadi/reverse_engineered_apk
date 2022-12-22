package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.c;

public interface n extends IInterface {
  void N4(int paramInt, Bundle paramBundle);
  
  void N7(int paramInt, IBinder paramIBinder, zzc paramzzc);
  
  void t5(int paramInt, IBinder paramIBinder, Bundle paramBundle);
  
  public static abstract class a extends com.google.android.gms.internal.common.a implements n {
    public a() {
      super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    protected final boolean Y0(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      if (param1Int1 != 1) {
        if (param1Int1 != 2) {
          if (param1Int1 != 3)
            return false; 
          N7(param1Parcel1.readInt(), param1Parcel1.readStrongBinder(), (zzc)c.a(param1Parcel1, zzc.CREATOR));
        } else {
          N4(param1Parcel1.readInt(), (Bundle)c.a(param1Parcel1, Bundle.CREATOR));
        } 
      } else {
        t5(param1Parcel1.readInt(), param1Parcel1.readStrongBinder(), (Bundle)c.a(param1Parcel1, Bundle.CREATOR));
      } 
      param1Parcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */