package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class vf extends sb2 implements uf {
  vf(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
  }
  
  public final void e5(List<Uri> paramList) {
    Parcel parcel = a2();
    parcel.writeTypedList(paramList);
    i1(1, parcel);
  }
  
  public final void l1(String paramString) {
    Parcel parcel = a2();
    parcel.writeString(paramString);
    i1(2, parcel);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */