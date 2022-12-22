package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzl extends zzaz {
  public static final Parcelable.Creator<zzl> CREATOR = new a();
  
  private static final HashMap<String, FastJsonResponse.Field<?, ?>> b;
  
  private final Set<Integer> c = new HashSet<Integer>(1);
  
  private final int d = 1;
  
  private ArrayList<zzr> e;
  
  private int f;
  
  private zzo g;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    b = (HashMap)hashMap;
    hashMap.put("authenticatorData", FastJsonResponse.Field.q0("authenticatorData", 2, zzr.class));
    hashMap.put("progress", FastJsonResponse.Field.p0("progress", 4, zzo.class));
  }
  
  public zzl() {}
  
  zzl(Set<Integer> paramSet, int paramInt1, ArrayList<zzr> paramArrayList, int paramInt2, zzo paramzzo) {
    this.e = paramArrayList;
    this.f = paramInt2;
    this.g = paramzzo;
  }
  
  protected final Object b(FastJsonResponse.Field paramField) {
    int i = paramField.u0();
    if (i != 1) {
      if (i != 2) {
        if (i == 4)
          return this.g; 
        i = paramField.u0();
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Unknown SafeParcelable id=");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      return this.e;
    } 
    return Integer.valueOf(this.d);
  }
  
  protected final boolean d(FastJsonResponse.Field paramField) {
    return this.c.contains(Integer.valueOf(paramField.u0()));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    Set<Integer> set = this.c;
    if (set.contains(Integer.valueOf(1)))
      a.k(paramParcel, 1, this.d); 
    if (set.contains(Integer.valueOf(2)))
      a.v(paramParcel, 2, this.e, true); 
    if (set.contains(Integer.valueOf(3)))
      a.k(paramParcel, 3, this.f); 
    if (set.contains(Integer.valueOf(4)))
      a.q(paramParcel, 4, (Parcelable)this.g, paramInt, true); 
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */