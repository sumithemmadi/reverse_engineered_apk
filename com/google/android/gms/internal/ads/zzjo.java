package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class zzjo implements Parcelable, Comparator<zzjo.zza> {
  public static final Parcelable.Creator<zzjo> CREATOR = new de2();
  
  private final zza[] b;
  
  private int c;
  
  public final int d;
  
  zzjo(Parcel paramParcel) {
    zza[] arrayOfZza = (zza[])paramParcel.createTypedArray(zza.CREATOR);
    this.b = arrayOfZza;
    this.d = arrayOfZza.length;
  }
  
  public zzjo(List<zza> paramList) {
    this(false, paramList.<zza>toArray(new zza[paramList.size()]));
  }
  
  private zzjo(boolean paramBoolean, zza... paramVarArgs) {
    String str;
    zza[] arrayOfZza = paramVarArgs;
    if (paramBoolean)
      arrayOfZza = (zza[])paramVarArgs.clone(); 
    Arrays.sort(arrayOfZza, this);
    byte b = 1;
    while (b < arrayOfZza.length) {
      if (!zza.a(arrayOfZza[b - 1]).equals(zza.a(arrayOfZza[b]))) {
        b++;
        continue;
      } 
      str = String.valueOf(zza.a(arrayOfZza[b]));
      StringBuilder stringBuilder = new StringBuilder(str.length() + 25);
      stringBuilder.append("Duplicate data for uuid: ");
      stringBuilder.append(str);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    this.b = (zza[])str;
    this.d = str.length;
  }
  
  public zzjo(zza... paramVarArgs) {
    this(true, paramVarArgs);
  }
  
  public final zza a(int paramInt) {
    return this.b[paramInt];
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : ((paramObject == null || zzjo.class != paramObject.getClass()) ? false : Arrays.equals((Object[])this.b, (Object[])((zzjo)paramObject).b));
  }
  
  public final int hashCode() {
    if (this.c == 0)
      this.c = Arrays.hashCode((Object[])this.b); 
    return this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeTypedArray((Parcelable[])this.b, 0);
  }
  
  public static final class zza implements Parcelable {
    public static final Parcelable.Creator<zza> CREATOR = new fe2();
    
    private int b;
    
    private final UUID c;
    
    private final String d;
    
    private final byte[] e;
    
    public final boolean f;
    
    zza(Parcel param1Parcel) {
      boolean bool;
      this.c = new UUID(param1Parcel.readLong(), param1Parcel.readLong());
      this.d = param1Parcel.readString();
      this.e = param1Parcel.createByteArray();
      if (param1Parcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.f = bool;
    }
    
    public zza(UUID param1UUID, String param1String, byte[] param1ArrayOfbyte) {
      this(param1UUID, param1String, param1ArrayOfbyte, false);
    }
    
    private zza(UUID param1UUID, String param1String, byte[] param1ArrayOfbyte, boolean param1Boolean) {
      this.c = jj2.<UUID>d(param1UUID);
      this.d = jj2.<String>d(param1String);
      this.e = jj2.<byte[]>d(param1ArrayOfbyte);
      this.f = false;
    }
    
    public final int describeContents() {
      return 0;
    }
    
    public final boolean equals(Object param1Object) {
      if (!(param1Object instanceof zza))
        return false; 
      if (param1Object == this)
        return true; 
      param1Object = param1Object;
      return (this.d.equals(((zza)param1Object).d) && wj2.g(this.c, ((zza)param1Object).c) && Arrays.equals(this.e, ((zza)param1Object).e));
    }
    
    public final int hashCode() {
      if (this.b == 0)
        this.b = (this.c.hashCode() * 31 + this.d.hashCode()) * 31 + Arrays.hashCode(this.e); 
      return this.b;
    }
    
    public final void writeToParcel(Parcel param1Parcel, int param1Int) {
      param1Parcel.writeLong(this.c.getMostSignificantBits());
      param1Parcel.writeLong(this.c.getLeastSignificantBits());
      param1Parcel.writeString(this.d);
      param1Parcel.writeByteArray(this.e);
      param1Parcel.writeByte((byte)this.f);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzjo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */