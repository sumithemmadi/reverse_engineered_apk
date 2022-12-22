package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzr extends zzaz {
  public static final Parcelable.Creator<zzr> CREATOR = new c();
  
  private static final HashMap<String, FastJsonResponse.Field<?, ?>> b;
  
  private final Set<Integer> c = new HashSet<Integer>(3);
  
  private final int d = 1;
  
  private zzt e;
  
  private String f;
  
  private String g;
  
  private String h;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    b = (HashMap)hashMap;
    hashMap.put("authenticatorInfo", FastJsonResponse.Field.p0("authenticatorInfo", 2, zzt.class));
    hashMap.put("signature", FastJsonResponse.Field.s0("signature", 3));
    hashMap.put("package", FastJsonResponse.Field.s0("package", 4));
  }
  
  public zzr() {}
  
  zzr(Set<Integer> paramSet, int paramInt, zzt paramzzt, String paramString1, String paramString2, String paramString3) {
    this.e = paramzzt;
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramString3;
  }
  
  protected Object b(FastJsonResponse.Field paramField) {
    int i = paramField.u0();
    if (i != 1) {
      if (i != 2) {
        if (i != 3) {
          if (i == 4)
            return this.g; 
          i = paramField.u0();
          StringBuilder stringBuilder = new StringBuilder(37);
          stringBuilder.append("Unknown SafeParcelable id=");
          stringBuilder.append(i);
          throw new IllegalStateException(stringBuilder.toString());
        } 
        return this.f;
      } 
      return this.e;
    } 
    return Integer.valueOf(this.d);
  }
  
  protected boolean d(FastJsonResponse.Field paramField) {
    return this.c.contains(Integer.valueOf(paramField.u0()));
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    Set<Integer> set = this.c;
    if (set.contains(Integer.valueOf(1)))
      a.k(paramParcel, 1, this.d); 
    if (set.contains(Integer.valueOf(2)))
      a.q(paramParcel, 2, (Parcelable)this.e, paramInt, true); 
    if (set.contains(Integer.valueOf(3)))
      a.r(paramParcel, 3, this.f, true); 
    if (set.contains(Integer.valueOf(4)))
      a.r(paramParcel, 4, this.g, true); 
    if (set.contains(Integer.valueOf(5)))
      a.r(paramParcel, 5, this.h, true); 
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */