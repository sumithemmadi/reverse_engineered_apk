package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zaj extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zaj> CREATOR = new d();
  
  private final int b;
  
  private final HashMap<String, Map<String, FastJsonResponse.Field<?, ?>>> c;
  
  private final ArrayList<zam> d;
  
  private final String e;
  
  zaj(int paramInt, ArrayList<zam> paramArrayList, String paramString) {
    this.b = paramInt;
    this.d = null;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    int i = paramArrayList.size();
    for (paramInt = 0; paramInt < i; paramInt++) {
      zam zam = paramArrayList.get(paramInt);
      String str = zam.c;
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      int j = zam.d.size();
      for (byte b = 0; b < j; b++) {
        zal zal = zam.d.get(b);
        hashMap1.put(zal.c, zal.d);
      } 
      hashMap.put(str, hashMap1);
    } 
    this.c = (HashMap)hashMap;
    this.e = (String)t.j(paramString);
    o0();
  }
  
  public final void o0() {
    for (String str : this.c.keySet()) {
      Map map = this.c.get(str);
      Iterator<String> iterator = map.keySet().iterator();
      while (iterator.hasNext())
        ((FastJsonResponse.Field)map.get(iterator.next())).w0(this); 
    } 
  }
  
  public final String p0() {
    return this.e;
  }
  
  public final Map<String, FastJsonResponse.Field<?, ?>> q0(String paramString) {
    return this.c.get(paramString);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    for (String str : this.c.keySet()) {
      stringBuilder.append(str);
      stringBuilder.append(":\n");
      Map map = this.c.get(str);
      for (String str1 : map.keySet()) {
        stringBuilder.append("  ");
        stringBuilder.append(str1);
        stringBuilder.append(": ");
        stringBuilder.append(map.get(str1));
      } 
    } 
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    ArrayList<zam> arrayList = new ArrayList();
    for (String str : this.c.keySet())
      arrayList.add(new zam(str, this.c.get(str))); 
    a.v(paramParcel, 2, arrayList, false);
    a.r(paramParcel, 3, this.e, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/response/zaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */