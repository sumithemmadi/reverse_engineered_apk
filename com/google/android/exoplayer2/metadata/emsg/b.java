package com.google.android.exoplayer2.metadata.emsg;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class b {
  private final ByteArrayOutputStream a;
  
  private final DataOutputStream b;
  
  public b() {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
    this.a = byteArrayOutputStream;
    this.b = new DataOutputStream(byteArrayOutputStream);
  }
  
  private static void b(DataOutputStream paramDataOutputStream, String paramString) {
    paramDataOutputStream.writeBytes(paramString);
    paramDataOutputStream.writeByte(0);
  }
  
  private static void c(DataOutputStream paramDataOutputStream, long paramLong) {
    paramDataOutputStream.writeByte((int)(paramLong >>> 24L) & 0xFF);
    paramDataOutputStream.writeByte((int)(paramLong >>> 16L) & 0xFF);
    paramDataOutputStream.writeByte((int)(paramLong >>> 8L) & 0xFF);
    paramDataOutputStream.writeByte((int)paramLong & 0xFF);
  }
  
  public byte[] a(EventMessage paramEventMessage) {
    this.a.reset();
    try {
      b(this.b, paramEventMessage.d);
      String str = paramEventMessage.e;
      if (str == null)
        str = ""; 
      b(this.b, str);
      c(this.b, paramEventMessage.f);
      c(this.b, paramEventMessage.g);
      this.b.write(paramEventMessage.h);
      this.b.flush();
      return this.a.toByteArray();
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/metadata/emsg/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */