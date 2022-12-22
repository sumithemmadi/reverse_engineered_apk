package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import b.e.a;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

public class zzo extends zzaz {
  public static final Parcelable.Creator<zzo> CREATOR = new b();
  
  private static final a<String, FastJsonResponse.Field<?, ?>> b;
  
  private final int c = 1;
  
  private List<String> d;
  
  private List<String> e;
  
  private List<String> f;
  
  private List<String> g;
  
  private List<String> h;
  
  static {
    a<String, FastJsonResponse.Field<?, ?>> a1 = new a();
    b = a1;
    a1.put("registered", FastJsonResponse.Field.t0("registered", 2));
    a1.put("in_progress", FastJsonResponse.Field.t0("in_progress", 3));
    a1.put("success", FastJsonResponse.Field.t0("success", 4));
    a1.put("failed", FastJsonResponse.Field.t0("failed", 5));
    a1.put("escrowed", FastJsonResponse.Field.t0("escrowed", 6));
  }
  
  public zzo() {}
  
  zzo(int paramInt, List<String> paramList1, List<String> paramList2, List<String> paramList3, List<String> paramList4, List<String> paramList5) {
    this.d = paramList1;
    this.e = paramList2;
    this.f = paramList3;
    this.g = paramList4;
    this.h = paramList5;
  }
  
  public Map<String, FastJsonResponse.Field<?, ?>> a() {
    return (Map<String, FastJsonResponse.Field<?, ?>>)b;
  }
  
  protected Object b(FastJsonResponse.Field paramField) {
    StringBuilder stringBuilder;
    int i;
    switch (paramField.u0()) {
      default:
        i = paramField.u0();
        stringBuilder = new StringBuilder(37);
        stringBuilder.append("Unknown SafeParcelable id=");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
      case 6:
        return this.h;
      case 5:
        return this.g;
      case 4:
        return this.f;
      case 3:
        return this.e;
      case 2:
        return this.d;
      case 1:
        break;
    } 
    return Integer.valueOf(this.c);
  }
  
  protected boolean d(FastJsonResponse.Field paramField) {
    return true;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.c);
    a.t(paramParcel, 2, this.d, false);
    a.t(paramParcel, 3, this.e, false);
    a.t(paramParcel, 4, this.f, false);
    a.t(paramParcel, 5, this.g, false);
    a.t(paramParcel, 6, this.h, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/accounttransfer/zzo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */