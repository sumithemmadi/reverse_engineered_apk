package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzap;
import com.google.android.gms.ads.internal.util.zzaq;

public final class lr0 extends pg {
  protected lr0(ir0 paramir0) {}
  
  public final void A1(ParcelFileDescriptor paramParcelFileDescriptor) {
    this.b.a.c(new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor));
  }
  
  public final void K4(zzaq paramzzaq) {
    this.b.a.d((Throwable)new zzap(paramzzaq.b, paramzzaq.c));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */