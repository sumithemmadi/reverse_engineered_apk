package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Iterator;
import java.util.Map;

public final class zzait extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzait> CREATOR = new k7();
  
  private final String b;
  
  private final String[] c;
  
  private final String[] d;
  
  zzait(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2) {
    this.b = paramString;
    this.c = paramArrayOfString1;
    this.d = paramArrayOfString2;
  }
  
  public static zzait o0(w<?> paramw) {
    Map<String, String> map = paramw.a();
    int i = map.size();
    String[] arrayOfString1 = new String[i];
    String[] arrayOfString2 = new String[i];
    Iterator<Map.Entry> iterator = map.entrySet().iterator();
    for (i = 0; iterator.hasNext(); i++) {
      Map.Entry entry = iterator.next();
      arrayOfString1[i] = (String)entry.getKey();
      arrayOfString2[i] = (String)entry.getValue();
    } 
    return new zzait(paramw.f(), arrayOfString1, arrayOfString2);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, this.b, false);
    a.s(paramParcel, 2, this.c, false);
    a.s(paramParcel, 3, this.d, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzait.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */