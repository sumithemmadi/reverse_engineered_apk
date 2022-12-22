package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.util.k;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzatp extends AbstractSafeParcelable {
  public static final Parcelable.Creator<zzatp> CREATOR = new rg();
  
  private ParcelFileDescriptor b;
  
  private Parcelable c;
  
  private boolean d;
  
  public zzatp(ParcelFileDescriptor paramParcelFileDescriptor) {
    this.b = paramParcelFileDescriptor;
    this.c = null;
    this.d = true;
  }
  
  private static <T> ParcelFileDescriptor q0(byte[] paramArrayOfbyte) {
    Closeable closeable;
    try {
      ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
      ParcelFileDescriptor parcelFileDescriptor = arrayOfParcelFileDescriptor[1];
      closeable = (Closeable)new ParcelFileDescriptor.AutoCloseOutputStream();
      this(parcelFileDescriptor);
      try {
        nt1 nt1 = fm.a;
        qg qg = new qg();
        this((OutputStream)closeable, paramArrayOfbyte);
        nt1.execute(qg);
        return arrayOfParcelFileDescriptor[0];
      } catch (IOException null) {}
    } catch (IOException iOException) {
      closeable = null;
    } 
    cm.c("Error transporting the ad response", iOException);
    q.g().e(iOException, "LargeParcelTeleporter.pipeData.2");
    k.a(closeable);
    return null;
  }
  
  private final ParcelFileDescriptor r0() {
    if (this.b == null) {
      Parcel parcel = Parcel.obtain();
      try {
        this.c.writeToParcel(parcel, 0);
        byte[] arrayOfByte = parcel.marshall();
        parcel.recycle();
      } finally {
        parcel.recycle();
      } 
    } 
    return this.b;
  }
  
  public final <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T o0(Parcelable.Creator<T> paramCreator) {
    if (this.d) {
      Parcel parcel;
      if (this.b == null) {
        cm.g("File descriptor is empty, returning null.");
        return null;
      } 
      DataInputStream dataInputStream = new DataInputStream((InputStream)new ParcelFileDescriptor.AutoCloseInputStream(this.b));
      try {
        int i = dataInputStream.readInt();
        byte[] arrayOfByte = new byte[i];
        dataInputStream.readFully(arrayOfByte, 0, i);
        k.a(dataInputStream);
        parcel = Parcel.obtain();
        try {
          parcel.unmarshall(arrayOfByte, 0, i);
          parcel.setDataPosition(0);
          this.c = (Parcelable)paramCreator.createFromParcel(parcel);
          parcel.recycle();
        } finally {
          parcel.recycle();
        } 
      } catch (IOException iOException) {
        cm.c("Could not read from parcel file descriptor", iOException);
        k.a((Closeable)parcel);
        return null;
      } finally {}
    } 
    return (T)this.c;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    r0();
    int i = a.a(paramParcel);
    a.q(paramParcel, 2, (Parcelable)this.b, paramInt, false);
    a.b(paramParcel, i);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzatp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */