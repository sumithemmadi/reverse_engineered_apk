package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.t;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<Scope> CREATOR = new m();
  
  private final int b;
  
  private final String c;
  
  Scope(int paramInt, String paramString) {
    t.g(paramString, "scopeUri must not be null or empty");
    this.b = paramInt;
    this.c = paramString;
  }
  
  public Scope(String paramString) {
    this(1, paramString);
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (!(paramObject instanceof Scope) ? false : this.c.equals(((Scope)paramObject).c));
  }
  
  public final int hashCode() {
    return this.c.hashCode();
  }
  
  public final String o0() {
    return this.c;
  }
  
  public final String toString() {
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.r(paramParcel, 2, o0(), false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */