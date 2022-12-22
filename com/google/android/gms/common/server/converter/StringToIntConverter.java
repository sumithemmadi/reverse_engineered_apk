package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a<String, Integer> {
  public static final Parcelable.Creator<StringToIntConverter> CREATOR = new c();
  
  private final int b = 1;
  
  private final HashMap<String, Integer> c = new HashMap<String, Integer>();
  
  private final SparseArray<String> d = new SparseArray();
  
  private final ArrayList<zaa> e = null;
  
  public StringToIntConverter() {}
  
  StringToIntConverter(int paramInt, ArrayList<zaa> paramArrayList) {
    int i = paramArrayList.size();
    paramInt = 0;
    while (paramInt < i) {
      zaa zaa = (zaa)paramArrayList.get(paramInt);
      paramInt++;
      zaa = zaa;
      o0(zaa.c, zaa.d);
    } 
  }
  
  public final StringToIntConverter o0(String paramString, int paramInt) {
    this.c.put(paramString, Integer.valueOf(paramInt));
    this.d.put(paramInt, paramString);
    return this;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    ArrayList<zaa> arrayList = new ArrayList();
    for (String str : this.c.keySet())
      arrayList.add(new zaa(str, ((Integer)this.c.get(str)).intValue())); 
    a.v(paramParcel, 2, arrayList, false);
    a.b(paramParcel, paramInt);
  }
  
  public static final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new b();
    
    private final int b;
    
    final String c;
    
    final int d;
    
    zaa(int param1Int1, String param1String, int param1Int2) {
      this.b = param1Int1;
      this.c = param1String;
      this.d = param1Int2;
    }
    
    zaa(String param1String, int param1Int) {
      this.b = 1;
      this.c = param1String;
      this.d = param1Int;
    }
    
    public final void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Int = a.a(param1Parcel);
      a.k(param1Parcel, 1, this.b);
      a.r(param1Parcel, 2, this.c, false);
      a.k(param1Parcel, 3, this.d);
      a.b(param1Parcel, param1Int);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/server/converter/StringToIntConverter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */