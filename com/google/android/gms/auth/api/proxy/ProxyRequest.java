package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class ProxyRequest extends AbstractSafeParcelable {
  public static final Parcelable.Creator<ProxyRequest> CREATOR = new b();
  
  public static final int b = 0;
  
  public static final int c = 1;
  
  public static final int d = 2;
  
  public static final int e = 3;
  
  public static final int f = 4;
  
  public static final int g = 5;
  
  public static final int h = 6;
  
  public static final int i = 7;
  
  public static final int j = 7;
  
  private final int k;
  
  public final String l;
  
  public final int m;
  
  public final long n;
  
  public final byte[] o;
  
  private Bundle p;
  
  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfbyte, Bundle paramBundle) {
    this.k = paramInt1;
    this.l = paramString;
    this.m = paramInt2;
    this.n = paramLong;
    this.o = paramArrayOfbyte;
    this.p = paramBundle;
  }
  
  public String toString() {
    String str = this.l;
    int i = this.m;
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
    stringBuilder.append("ProxyRequest[ url: ");
    stringBuilder.append(str);
    stringBuilder.append(", method: ");
    stringBuilder.append(i);
    stringBuilder.append(" ]");
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, this.l, false);
    a.k(paramParcel, 2, this.m);
    a.n(paramParcel, 3, this.n);
    a.f(paramParcel, 4, this.o, false);
    a.e(paramParcel, 5, this.p, false);
    a.k(paramParcel, 1000, this.k);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/proxy/ProxyRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */