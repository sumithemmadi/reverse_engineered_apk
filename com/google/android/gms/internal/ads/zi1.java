package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

public final class zi1 {
  public static ParcelFileDescriptor a(InputStream paramInputStream) {
    ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
    ParcelFileDescriptor parcelFileDescriptor2 = arrayOfParcelFileDescriptor[0];
    ParcelFileDescriptor parcelFileDescriptor1 = arrayOfParcelFileDescriptor[1];
    fm.a.execute(new yi1(paramInputStream, parcelFileDescriptor1));
    return parcelFileDescriptor2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zi1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */