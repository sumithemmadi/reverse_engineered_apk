package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Collections;
import java.util.List;

public final class zzatf extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzatf> CREATOR = new hg();
  
  public final boolean b;
  
  public final List<String> c;
  
  public zzatf() {
    this(false, Collections.emptyList());
  }
  
  public zzatf(boolean paramBoolean, List<String> paramList) {
    this.b = paramBoolean;
    this.c = paramList;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.c(paramParcel, 2, this.b);
    a.t(paramParcel, 3, this.c, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzatf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */