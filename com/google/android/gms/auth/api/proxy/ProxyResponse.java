package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class ProxyResponse extends AbstractSafeParcelable {
  public static final Parcelable.Creator<ProxyResponse> CREATOR = new c();
  
  private final int b;
  
  public final int c;
  
  public final PendingIntent d;
  
  public final int e;
  
  private final Bundle f;
  
  public final byte[] g;
  
  ProxyResponse(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3, Bundle paramBundle, byte[] paramArrayOfbyte) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramInt3;
    this.f = paramBundle;
    this.g = paramArrayOfbyte;
    this.d = paramPendingIntent;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.c);
    a.q(paramParcel, 2, (Parcelable)this.d, paramInt, false);
    a.k(paramParcel, 3, this.e);
    a.e(paramParcel, 4, this.f, false);
    a.f(paramParcel, 5, this.g, false);
    a.k(paramParcel, 1000, this.b);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/proxy/ProxyResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */