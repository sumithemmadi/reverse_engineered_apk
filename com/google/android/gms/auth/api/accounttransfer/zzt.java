package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b.e.b;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zzt extends zzaz {
  public static final Parcelable.Creator<zzt> CREATOR = new d();
  
  private static final HashMap<String, FastJsonResponse.Field<?, ?>> b;
  
  private final Set<Integer> c = (Set<Integer>)new b(3);
  
  private final int d = 1;
  
  private String e;
  
  private int f;
  
  private byte[] g;
  
  private PendingIntent h;
  
  private DeviceMetaData i;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    b = (HashMap)hashMap;
    hashMap.put("accountType", FastJsonResponse.Field.s0("accountType", 2));
    hashMap.put("status", FastJsonResponse.Field.r0("status", 3));
    hashMap.put("transferBytes", FastJsonResponse.Field.o0("transferBytes", 4));
  }
  
  public zzt() {}
  
  zzt(Set<Integer> paramSet, int paramInt1, String paramString, int paramInt2, byte[] paramArrayOfbyte, PendingIntent paramPendingIntent, DeviceMetaData paramDeviceMetaData) {
    this.e = paramString;
    this.f = paramInt2;
    this.g = paramArrayOfbyte;
    this.h = paramPendingIntent;
    this.i = paramDeviceMetaData;
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
        return Integer.valueOf(this.f);
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
      a.r(paramParcel, 2, this.e, true); 
    if (set.contains(Integer.valueOf(3)))
      a.k(paramParcel, 3, this.f); 
    if (set.contains(Integer.valueOf(4)))
      a.f(paramParcel, 4, this.g, true); 
    if (set.contains(Integer.valueOf(5)))
      a.q(paramParcel, 5, (Parcelable)this.h, paramInt, true); 
    if (set.contains(Integer.valueOf(6)))
      a.q(paramParcel, 6, (Parcelable)this.i, paramInt, true); 
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */