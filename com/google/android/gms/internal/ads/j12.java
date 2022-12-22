package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class j12 implements ju1 {
  private static final byte[] a = new byte[0];
  
  private final l12 b;
  
  private final String c;
  
  private final byte[] d;
  
  private final zzeic e;
  
  private final h12 f;
  
  public j12(ECPublicKey paramECPublicKey, byte[] paramArrayOfbyte, String paramString, zzeic paramzzeic, h12 paramh12) {
    n12.f(paramECPublicKey.getW(), paramECPublicKey.getParams().getCurve());
    this.b = new l12(paramECPublicKey);
    this.d = paramArrayOfbyte;
    this.c = paramString;
    this.e = paramzzeic;
    this.f = paramh12;
  }
  
  public final byte[] a(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    o12 o12 = this.b.a(this.c, this.d, paramArrayOfbyte2, this.f.b(), this.e);
    paramArrayOfbyte1 = this.f.a(o12.b()).a(paramArrayOfbyte1, a);
    byte[] arrayOfByte = o12.a();
    return ByteBuffer.allocate(arrayOfByte.length + paramArrayOfbyte1.length).put(arrayOfByte).put(paramArrayOfbyte1).array();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */