package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class d80 extends i82 {
  private ByteBuffer m;
  
  public d80(String paramString) {
    super(paramString);
  }
  
  public final void e(ByteBuffer paramByteBuffer) {
    this.m = paramByteBuffer;
    paramByteBuffer.position(paramByteBuffer.position() + paramByteBuffer.remaining());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */