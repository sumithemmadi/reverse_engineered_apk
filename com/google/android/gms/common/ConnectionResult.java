package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class ConnectionResult extends AbstractSafeParcelable {
  public static final Parcelable.Creator<ConnectionResult> CREATOR;
  
  public static final ConnectionResult b = new ConnectionResult(0);
  
  private final int c;
  
  private final int d;
  
  private final PendingIntent e;
  
  private final String f;
  
  static {
    CREATOR = new l();
  }
  
  public ConnectionResult(int paramInt) {
    this(paramInt, null, null);
  }
  
  ConnectionResult(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramPendingIntent;
    this.f = paramString;
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent) {
    this(paramInt, paramPendingIntent, null);
  }
  
  public ConnectionResult(int paramInt, PendingIntent paramPendingIntent, String paramString) {
    this(1, paramInt, paramPendingIntent, paramString);
  }
  
  static String t0(int paramInt) {
    if (paramInt != 99) {
      if (paramInt != 1500) {
        StringBuilder stringBuilder;
        switch (paramInt) {
          default:
            switch (paramInt) {
              default:
                stringBuilder = new StringBuilder(31);
                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                stringBuilder.append(paramInt);
                stringBuilder.append(")");
                return stringBuilder.toString();
              case 21:
                return "API_VERSION_UPDATE_REQUIRED";
              case 20:
                return "RESTRICTED_PROFILE";
              case 19:
                return "SERVICE_MISSING_PERMISSION";
              case 18:
                return "SERVICE_UPDATING";
              case 17:
                return "SIGN_IN_FAILED";
              case 16:
                return "API_UNAVAILABLE";
              case 15:
                return "INTERRUPTED";
              case 14:
                return "TIMEOUT";
              case 13:
                break;
            } 
            return "CANCELED";
          case 11:
            return "LICENSE_CHECK_FAILED";
          case 10:
            return "DEVELOPER_ERROR";
          case 9:
            return "SERVICE_INVALID";
          case 8:
            return "INTERNAL_ERROR";
          case 7:
            return "NETWORK_ERROR";
          case 6:
            return "RESOLUTION_REQUIRED";
          case 5:
            return "INVALID_ACCOUNT";
          case 4:
            return "SIGN_IN_REQUIRED";
          case 3:
            return "SERVICE_DISABLED";
          case 2:
            return "SERVICE_VERSION_UPDATE_REQUIRED";
          case 1:
            return "SERVICE_MISSING";
          case 0:
            return "SUCCESS";
          case -1:
            break;
        } 
        return "UNKNOWN";
      } 
      return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
    } 
    return "UNFINISHED";
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof ConnectionResult))
      return false; 
    paramObject = paramObject;
    return (this.d == ((ConnectionResult)paramObject).d && r.a(this.e, ((ConnectionResult)paramObject).e) && r.a(this.f, ((ConnectionResult)paramObject).f));
  }
  
  public final int hashCode() {
    return r.b(new Object[] { Integer.valueOf(this.d), this.e, this.f });
  }
  
  public final int o0() {
    return this.d;
  }
  
  public final String p0() {
    return this.f;
  }
  
  public final PendingIntent q0() {
    return this.e;
  }
  
  public final boolean r0() {
    return (this.d != 0 && this.e != null);
  }
  
  public final boolean s0() {
    return (this.d == 0);
  }
  
  public final String toString() {
    return r.c(this).a("statusCode", t0(this.d)).a("resolution", this.e).a("message", this.f).toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.c);
    a.k(paramParcel, 2, o0());
    a.q(paramParcel, 3, (Parcelable)q0(), paramInt, false);
    a.r(paramParcel, 4, p0(), false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/ConnectionResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */