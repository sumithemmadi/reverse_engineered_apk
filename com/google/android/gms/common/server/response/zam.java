package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class zam extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zam> CREATOR = new c();
  
  private final int b;
  
  final String c;
  
  final ArrayList<zal> d;
  
  zam(int paramInt, String paramString, ArrayList<zal> paramArrayList) {
    this.b = paramInt;
    this.c = paramString;
    this.d = paramArrayList;
  }
  
  zam(String paramString, Map<String, FastJsonResponse.Field<?, ?>> paramMap) {
    String str;
    this.b = 1;
    this.c = paramString;
    if (paramMap == null) {
      paramString = null;
    } else {
      ArrayList<zal> arrayList = new ArrayList();
      Iterator<String> iterator = paramMap.keySet().iterator();
      while (true) {
        ArrayList<zal> arrayList1 = arrayList;
        if (iterator.hasNext()) {
          str = iterator.next();
          arrayList.add(new zal(str, paramMap.get(str)));
          continue;
        } 
        break;
      } 
    } 
    this.d = (ArrayList<zal>)str;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, this.c, false);
    a.v(paramParcel, 3, this.d, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/response/zam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */