package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;

public final class zzdum extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzdum> CREATOR = new ap1();
  
  private final int b;
  
  private zzcf$zza c;
  
  private byte[] d;
  
  zzdum(int paramInt, byte[] paramArrayOfbyte) {
    this.b = paramInt;
    this.c = null;
    this.d = paramArrayOfbyte;
    p0();
  }
  
  private final void p0() {
    zzcf$zza zzcf$zza1 = this.c;
    if (zzcf$zza1 == null && this.d != null)
      return; 
    if (zzcf$zza1 != null && this.d == null)
      return; 
    if (zzcf$zza1 == null || this.d == null) {
      if (zzcf$zza1 == null && this.d == null)
        throw new IllegalStateException("Invalid internal representation - empty"); 
      throw new IllegalStateException("Impossible");
    } 
    throw new IllegalStateException("Invalid internal representation - full");
  }
  
  public final zzcf$zza o0() {
    boolean bool;
    if (this.c != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool)
      try {
        this.c = zzcf$zza.J(this.d, y32.b());
        this.d = null;
      } catch (zzelo zzelo) {
        throw new IllegalStateException(zzelo);
      } catch (NullPointerException nullPointerException) {} 
    p0();
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    byte[] arrayOfByte = this.d;
    if (arrayOfByte == null)
      arrayOfByte = this.c.g(); 
    a.f(paramParcel, 2, arrayOfByte, false);
    a.b(paramParcel, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdum.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */