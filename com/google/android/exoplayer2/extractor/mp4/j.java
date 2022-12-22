package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class j {
  public static byte[] a(UUID paramUUID, byte[] paramArrayOfbyte) {
    return b(paramUUID, null, paramArrayOfbyte);
  }
  
  public static byte[] b(UUID paramUUID, UUID[] paramArrayOfUUID, byte[] paramArrayOfbyte) {
    boolean bool = false;
    if (paramArrayOfbyte != null) {
      i = paramArrayOfbyte.length;
    } else {
      i = 0;
    } 
    int k = i + 32;
    int i = k;
    if (paramArrayOfUUID != null)
      i = k + paramArrayOfUUID.length * 16 + 4; 
    ByteBuffer byteBuffer = ByteBuffer.allocate(i);
    byteBuffer.putInt(i);
    byteBuffer.putInt(1886614376);
    if (paramArrayOfUUID != null) {
      i = 16777216;
    } else {
      i = 0;
    } 
    byteBuffer.putInt(i);
    byteBuffer.putLong(paramUUID.getMostSignificantBits());
    byteBuffer.putLong(paramUUID.getLeastSignificantBits());
    if (paramArrayOfUUID != null) {
      byteBuffer.putInt(paramArrayOfUUID.length);
      k = paramArrayOfUUID.length;
      for (i = bool; i < k; i++) {
        paramUUID = paramArrayOfUUID[i];
        byteBuffer.putLong(paramUUID.getMostSignificantBits());
        byteBuffer.putLong(paramUUID.getLeastSignificantBits());
      } 
    } 
    if (paramArrayOfbyte != null && paramArrayOfbyte.length != 0) {
      byteBuffer.putInt(paramArrayOfbyte.length);
      byteBuffer.put(paramArrayOfbyte);
    } 
    return byteBuffer.array();
  }
  
  private static a c(byte[] paramArrayOfbyte) {
    v v = new v(paramArrayOfbyte);
    if (v.d() < 32)
      return null; 
    v.M(0);
    if (v.k() != v.a() + 4)
      return null; 
    if (v.k() != 1886614376)
      return null; 
    int i = c.c(v.k());
    if (i > 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unsupported pssh version: ");
      stringBuilder.append(i);
      o.f("PsshAtomUtil", stringBuilder.toString());
      return null;
    } 
    UUID uUID = new UUID(v.s(), v.s());
    if (i == 1)
      v.N(v.D() * 16); 
    int k = v.D();
    if (k != v.a())
      return null; 
    paramArrayOfbyte = new byte[k];
    v.h(paramArrayOfbyte, 0, k);
    return new a(uUID, i, paramArrayOfbyte);
  }
  
  public static UUID d(byte[] paramArrayOfbyte) {
    a a = c(paramArrayOfbyte);
    return (a == null) ? null : a.a(a);
  }
  
  private static class a {
    private final UUID a;
    
    private final int b;
    
    private final byte[] c;
    
    public a(UUID param1UUID, int param1Int, byte[] param1ArrayOfbyte) {
      this.a = param1UUID;
      this.b = param1Int;
      this.c = param1ArrayOfbyte;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */