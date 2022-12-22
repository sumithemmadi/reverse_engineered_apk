package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

public final class b60 extends k82 {
  private int A;
  
  private int B;
  
  private Date o;
  
  private Date p;
  
  private long q;
  
  private long r;
  
  private double s = 1.0D;
  
  private float t = 1.0F;
  
  private u82 u = u82.a;
  
  private long v;
  
  private int w;
  
  private int x;
  
  private int y;
  
  private int z;
  
  public b60() {
    super("mvhd");
  }
  
  public final void e(ByteBuffer paramByteBuffer) {
    g(paramByteBuffer);
    if (f() == 1) {
      this.o = n82.a(x10.d(paramByteBuffer));
      this.p = n82.a(x10.d(paramByteBuffer));
      this.q = x10.b(paramByteBuffer);
      this.r = x10.d(paramByteBuffer);
    } else {
      this.o = n82.a(x10.b(paramByteBuffer));
      this.p = n82.a(x10.b(paramByteBuffer));
      this.q = x10.b(paramByteBuffer);
      this.r = x10.b(paramByteBuffer);
    } 
    this.s = x10.e(paramByteBuffer);
    byte[] arrayOfByte = new byte[2];
    paramByteBuffer.get(arrayOfByte);
    short s = (short)(0x0 | arrayOfByte[0] << 8 & 0xFF00);
    this.t = (short)(arrayOfByte[1] & 0xFF | s) / 256.0F;
    x10.c(paramByteBuffer);
    x10.b(paramByteBuffer);
    x10.b(paramByteBuffer);
    this.u = u82.a(paramByteBuffer);
    this.w = paramByteBuffer.getInt();
    this.x = paramByteBuffer.getInt();
    this.y = paramByteBuffer.getInt();
    this.z = paramByteBuffer.getInt();
    this.A = paramByteBuffer.getInt();
    this.B = paramByteBuffer.getInt();
    this.v = x10.b(paramByteBuffer);
  }
  
  public final long h() {
    return this.r;
  }
  
  public final long i() {
    return this.q;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MovieHeaderBox[");
    stringBuilder.append("creationTime=");
    stringBuilder.append(this.o);
    stringBuilder.append(";");
    stringBuilder.append("modificationTime=");
    stringBuilder.append(this.p);
    stringBuilder.append(";");
    stringBuilder.append("timescale=");
    stringBuilder.append(this.q);
    stringBuilder.append(";");
    stringBuilder.append("duration=");
    stringBuilder.append(this.r);
    stringBuilder.append(";");
    stringBuilder.append("rate=");
    stringBuilder.append(this.s);
    stringBuilder.append(";");
    stringBuilder.append("volume=");
    stringBuilder.append(this.t);
    stringBuilder.append(";");
    stringBuilder.append("matrix=");
    stringBuilder.append(this.u);
    stringBuilder.append(";");
    stringBuilder.append("nextTrackId=");
    stringBuilder.append(this.v);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/b60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */