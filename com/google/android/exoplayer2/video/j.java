package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;
import java.util.List;

public final class j {
  public final List<byte[]> a;
  
  public final int b;
  
  private j(List<byte[]> paramList, int paramInt) {
    this.a = paramList;
    this.b = paramInt;
  }
  
  public static j a(v paramv) {
    try {
      List<byte> list;
      paramv.N(21);
      int i = paramv.z();
      int k = paramv.z();
      int m = paramv.c();
      byte b = 0;
      int n = 0;
      while (b < k) {
        paramv.N(1);
        int i1 = paramv.F();
        for (byte b1 = 0; b1 < i1; b1++) {
          int i2 = paramv.F();
          n += i2 + 4;
          paramv.N(i2);
        } 
        b++;
      } 
      paramv.M(m);
      byte[] arrayOfByte = new byte[n];
      b = 0;
      m = 0;
      while (b < k) {
        paramv.N(1);
        int i1 = paramv.F();
        for (byte b1 = 0; b1 < i1; b1++) {
          int i2 = paramv.F();
          byte[] arrayOfByte1 = s.a;
          System.arraycopy(arrayOfByte1, 0, arrayOfByte, m, arrayOfByte1.length);
          m += arrayOfByte1.length;
          System.arraycopy(paramv.a, paramv.c(), arrayOfByte, m, i2);
          m += i2;
          paramv.N(i2);
        } 
        b++;
      } 
      if (n == 0) {
        paramv = null;
      } else {
        list = Collections.singletonList(arrayOfByte);
      } 
      return new j((List)list, (i & 0x3) + 1);
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      ParserException parserException = new ParserException("Error parsing HEVC config", arrayIndexOutOfBoundsException);
      throw parserException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */