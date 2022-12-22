package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public class Feature extends AbstractSafeParcelable {
  public static final Parcelable.Creator<Feature> CREATOR = new m();
  
  private final String b;
  
  @Deprecated
  private final int c;
  
  private final long d;
  
  public Feature(String paramString, int paramInt, long paramLong) {
    this.b = paramString;
    this.c = paramInt;
    this.d = paramLong;
  }
  
  public Feature(String paramString, long paramLong) {
    this.b = paramString;
    this.d = paramLong;
    this.c = -1;
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject instanceof Feature) {
      paramObject = paramObject;
      if (((o0() != null && o0().equals(paramObject.o0())) || (o0() == null && paramObject.o0() == null)) && p0() == paramObject.p0())
        return true; 
    } 
    return false;
  }
  
  public int hashCode() {
    return r.b(new Object[] { o0(), Long.valueOf(p0()) });
  }
  
  public String o0() {
    return this.b;
  }
  
  public long p0() {
    long l1 = this.d;
    long l2 = l1;
    if (l1 == -1L)
      l2 = this.c; 
    return l2;
  }
  
  public String toString() {
    return r.c(this).a("name", o0()).a("version", Long.valueOf(p0())).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.r(paramParcel, 1, o0(), false);
    a.k(paramParcel, 2, this.c);
    a.n(paramParcel, 3, p0());
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/Feature.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */