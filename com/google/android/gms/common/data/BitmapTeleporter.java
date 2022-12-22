package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
  public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new a();
  
  private final int b;
  
  private ParcelFileDescriptor c;
  
  private final int d;
  
  private Bitmap e;
  
  private boolean f;
  
  private File g;
  
  BitmapTeleporter(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2) {
    this.b = paramInt1;
    this.c = paramParcelFileDescriptor;
    this.d = paramInt2;
    this.e = null;
    this.f = false;
  }
  
  private static void o0(Closeable paramCloseable) {
    try {
      paramCloseable.close();
      return;
    } catch (IOException iOException) {
      Log.w("BitmapTeleporter", "Could not close stream", iOException);
      return;
    } 
  }
  
  private final FileOutputStream p0() {
    File file = this.g;
    if (file != null)
      try {
        File file1 = File.createTempFile("teleporter", ".tmp", file);
        try {
          FileOutputStream fileOutputStream = new FileOutputStream();
          this(file1);
          this.c = ParcelFileDescriptor.open(file1, 268435456);
          file1.delete();
          return fileOutputStream;
        } catch (FileNotFoundException fileNotFoundException) {
          throw new IllegalStateException("Temporary file is somehow already deleted");
        } 
      } catch (IOException iOException) {
        throw new IllegalStateException("Could not create temporary file", iOException);
      }  
    throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    if (this.c == null) {
      Bitmap bitmap = this.e;
      ByteBuffer byteBuffer = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
      bitmap.copyPixelsToBuffer(byteBuffer);
      byte[] arrayOfByte = byteBuffer.array();
      DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(p0()));
      try {
        dataOutputStream.writeInt(arrayOfByte.length);
        dataOutputStream.writeInt(bitmap.getWidth());
        dataOutputStream.writeInt(bitmap.getHeight());
        dataOutputStream.writeUTF(bitmap.getConfig().toString());
        dataOutputStream.write(arrayOfByte);
        o0(dataOutputStream);
      } catch (IOException iOException) {
        IllegalStateException illegalStateException = new IllegalStateException();
        this("Could not write into unlinked file", iOException);
        throw illegalStateException;
      } finally {}
    } 
    int i = a.a(paramParcel);
    a.k(paramParcel, 1, this.b);
    a.q(paramParcel, 2, (Parcelable)this.c, paramInt | 0x1, false);
    a.k(paramParcel, 3, this.d);
    a.b(paramParcel, i);
    this.c = null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/data/BitmapTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */