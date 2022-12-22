package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class h extends i {
  private static final byte[] n = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
  
  private boolean o;
  
  private long l(byte[] paramArrayOfbyte) {
    boolean bool;
    int j = paramArrayOfbyte[0] & 0xFF;
    int k = j & 0x3;
    int m = 2;
    if (k != 0) {
      bool = m;
      if (k != 1) {
        bool = m;
        if (k != 2)
          bool = paramArrayOfbyte[1] & 0x3F; 
      } 
    } else {
      bool = true;
    } 
    j >>= 3;
    m = j & 0x3;
    if (j >= 16) {
      m = 2500 << m;
    } else if (j >= 12) {
      m = 10000 << (m & 0x1);
    } else if (m == 3) {
      m = 60000;
    } else {
      m = 10000 << m;
    } 
    return bool * m;
  }
  
  private void m(List<byte[]> paramList, int paramInt) {
    long l = paramInt * 1000000000L / 48000L;
    paramList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(l).array());
  }
  
  public static boolean n(v paramv) {
    int j = paramv.a();
    byte[] arrayOfByte1 = n;
    if (j < arrayOfByte1.length)
      return false; 
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    paramv.h(arrayOfByte2, 0, arrayOfByte1.length);
    return Arrays.equals(arrayOfByte2, arrayOfByte1);
  }
  
  protected long e(v paramv) {
    return b(l(paramv.a));
  }
  
  protected boolean h(v paramv, long paramLong, i.b paramb) {
    ArrayList<byte[]> arrayList;
    boolean bool = this.o;
    boolean bool1 = true;
    if (!bool) {
      byte[] arrayOfByte = Arrays.copyOf(paramv.a, paramv.d());
      byte b1 = arrayOfByte[9];
      byte b2 = arrayOfByte[11];
      byte b3 = arrayOfByte[10];
      arrayList = new ArrayList(3);
      arrayList.add(arrayOfByte);
      m((List<byte[]>)arrayList, (b2 & 0xFF) << 8 | b3 & 0xFF);
      m((List<byte[]>)arrayList, 3840);
      paramb.a = Format.p(null, "audio/opus", null, -1, -1, b1 & 0xFF, 48000, arrayList, null, 0, null);
      this.o = true;
      return true;
    } 
    if (arrayList.k() != 1332770163)
      bool1 = false; 
    arrayList.M(0);
    return bool1;
  }
  
  protected void j(boolean paramBoolean) {
    super.j(paramBoolean);
    if (paramBoolean)
      this.o = false; 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */