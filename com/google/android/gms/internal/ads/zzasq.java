package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class zzasq extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzasq> CREATOR = new xf();
  
  public final View b;
  
  public final Map<String, WeakReference<View>> c;
  
  public zzasq(IBinder paramIBinder1, IBinder paramIBinder2) {
    this.b = (View)b.o1(a.a.i1(paramIBinder1));
    this.c = (Map<String, WeakReference<View>>)b.o1(a.a.i1(paramIBinder2));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.j(paramParcel, 1, b.a2(this.b).asBinder(), false);
    a.j(paramParcel, 2, b.a2(this.c).asBinder(), false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzasq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */