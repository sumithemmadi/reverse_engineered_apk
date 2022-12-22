package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class Status extends AbstractSafeParcelable implements i, ReflectedParcelable {
  public static final Parcelable.Creator<Status> CREATOR;
  
  public static final Status b = new Status(0);
  
  public static final Status c = new Status(14);
  
  public static final Status d = new Status(8);
  
  public static final Status e = new Status(15);
  
  public static final Status f = new Status(16);
  
  private static final Status g = new Status(17);
  
  public static final Status h = new Status(18);
  
  private final int i;
  
  private final int j;
  
  private final String k;
  
  private final PendingIntent l;
  
  static {
    CREATOR = new n();
  }
  
  public Status(int paramInt) {
    this(paramInt, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent) {
    this.i = paramInt1;
    this.j = paramInt2;
    this.k = paramString;
    this.l = paramPendingIntent;
  }
  
  public Status(int paramInt, String paramString) {
    this(1, paramInt, paramString, null);
  }
  
  public Status(int paramInt, String paramString, PendingIntent paramPendingIntent) {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  public final Status c() {
    return this;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof Status))
      return false; 
    paramObject = paramObject;
    return (this.i == ((Status)paramObject).i && this.j == ((Status)paramObject).j && r.a(this.k, ((Status)paramObject).k) && r.a(this.l, ((Status)paramObject).l));
  }
  
  public final int hashCode() {
    return r.b(new Object[] { Integer.valueOf(this.i), Integer.valueOf(this.j), this.k, this.l });
  }
  
  public final PendingIntent o0() {
    return this.l;
  }
  
  public final int p0() {
    return this.j;
  }
  
  public final String q0() {
    return this.k;
  }
  
  public final boolean r0() {
    return (this.l != null);
  }
  
  public final boolean s0() {
    return (this.j <= 0);
  }
  
  public final void t0(Activity paramActivity, int paramInt) {
    if (!r0())
      return; 
    paramActivity.startIntentSenderForResult(((PendingIntent)t.j(this.l)).getIntentSender(), paramInt, null, 0, 0, 0);
  }
  
  public final String toString() {
    return r.c(this).a("statusCode", u0()).a("resolution", this.l).toString();
  }
  
  public final String u0() {
    String str = this.k;
    return (str != null) ? str : b.a(this.j);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int j = a.a(paramParcel);
    a.k(paramParcel, 1, p0());
    a.r(paramParcel, 2, q0(), false);
    a.q(paramParcel, 3, (Parcelable)this.l, paramInt, false);
    a.k(paramParcel, 1000, this.i);
    a.b(paramParcel, j);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */