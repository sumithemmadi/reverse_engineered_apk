package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;

public final class g {
  private static final int[] a = new int[] { 1, 2, 3, 6 };
  
  private static final int[] b = new int[] { 48000, 44100, 32000 };
  
  private static final int[] c = new int[] { 24000, 22050, 16000 };
  
  private static final int[] d = new int[] { 2, 1, 2, 3, 3, 4, 4, 5 };
  
  private static final int[] e = new int[] { 
      32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 
      192, 224, 256, 320, 384, 448, 512, 576, 640 };
  
  private static final int[] f = new int[] { 
      69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 
      417, 487, 557, 696, 835, 975, 1114, 1253, 1393 };
  
  public static int a(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    for (int k = i; k <= j - 10; k++) {
      if ((paramByteBuffer.getInt(k + 4) & 0xFEFFFFFF) == -1167101192)
        return k - i; 
    } 
    return -1;
  }
  
  private static int b(int paramInt1, int paramInt2) {
    int i = paramInt2 / 2;
    if (paramInt1 >= 0) {
      int[] arrayOfInt = b;
      if (paramInt1 < arrayOfInt.length && paramInt2 >= 0) {
        int[] arrayOfInt1 = f;
        if (i < arrayOfInt1.length) {
          paramInt1 = arrayOfInt[paramInt1];
          if (paramInt1 == 44100)
            return (arrayOfInt1[i] + paramInt2 % 2) * 2; 
          paramInt2 = e[i];
          return (paramInt1 == 32000) ? (paramInt2 * 6) : (paramInt2 * 4);
        } 
      } 
    } 
    return -1;
  }
  
  public static Format c(v paramv, String paramString1, String paramString2, DrmInitData paramDrmInitData) {
    int i = paramv.z();
    int j = b[(i & 0xC0) >> 6];
    int k = paramv.z();
    int m = d[(k & 0x38) >> 3];
    i = m;
    if ((k & 0x4) != 0)
      i = m + 1; 
    return Format.p(paramString1, "audio/ac3", null, -1, -1, i, j, null, paramDrmInitData, 0, paramString2);
  }
  
  public static int d(ByteBuffer paramByteBuffer) {
    byte b = paramByteBuffer.get(paramByteBuffer.position() + 5);
    byte b1 = 3;
    if ((b & 0xF8) >> 3 > 10) {
      b = 1;
    } else {
      b = 0;
    } 
    if (b != 0) {
      int i;
      if ((paramByteBuffer.get(paramByteBuffer.position() + 4) & 0xC0) >> 6 == 3) {
        b = b1;
      } else {
        i = (paramByteBuffer.get(paramByteBuffer.position() + 4) & 0x30) >> 4;
      } 
      return a[i] * 256;
    } 
    return 1536;
  }
  
  public static b e(u paramu) {
    String str1;
    int j;
    int k;
    char c;
    int m;
    String str2;
    int i = paramu.e();
    paramu.q(40);
    if (paramu.h(5) > 10) {
      j = 1;
    } else {
      j = 0;
    } 
    paramu.o(i);
    i = -1;
    if (j) {
      paramu.q(16);
      j = paramu.h(2);
      if (j != 0) {
        if (j != 1) {
          if (j != 2) {
            j = i;
          } else {
            j = 2;
          } 
        } else {
          j = 1;
        } 
      } else {
        j = 0;
      } 
      paramu.q(3);
      int n = paramu.h(11);
      int i1 = paramu.h(2);
      if (i1 == 3) {
        i = c[paramu.h(2)];
        k = 3;
        c = '\006';
      } else {
        k = paramu.h(2);
        c = a[k];
        i = b[i1];
      } 
      int i2 = paramu.h(3);
      boolean bool = paramu.g();
      int i3 = d[i2];
      paramu.q(10);
      if (paramu.g())
        paramu.q(8); 
      if (i2 == 0) {
        paramu.q(5);
        if (paramu.g())
          paramu.q(8); 
      } 
      if (j == 1 && paramu.g())
        paramu.q(16); 
      if (paramu.g()) {
        if (i2 > 2)
          paramu.q(2); 
        if ((i2 & 0x1) != 0 && i2 > 2)
          paramu.q(6); 
        if ((i2 & 0x4) != 0)
          paramu.q(6); 
        if (bool && paramu.g())
          paramu.q(5); 
        if (j == 0) {
          if (paramu.g())
            paramu.q(6); 
          if (i2 == 0 && paramu.g())
            paramu.q(6); 
          if (paramu.g())
            paramu.q(6); 
          int i4 = paramu.h(2);
          if (i4 == 1) {
            paramu.q(5);
          } else if (i4 == 2) {
            paramu.q(12);
          } else if (i4 == 3) {
            i4 = paramu.h(5);
            if (paramu.g()) {
              paramu.q(5);
              if (paramu.g())
                paramu.q(4); 
              if (paramu.g())
                paramu.q(4); 
              if (paramu.g())
                paramu.q(4); 
              if (paramu.g())
                paramu.q(4); 
              if (paramu.g())
                paramu.q(4); 
              if (paramu.g())
                paramu.q(4); 
              if (paramu.g())
                paramu.q(4); 
              if (paramu.g()) {
                if (paramu.g())
                  paramu.q(4); 
                if (paramu.g())
                  paramu.q(4); 
              } 
            } 
            if (paramu.g()) {
              paramu.q(5);
              if (paramu.g()) {
                paramu.q(7);
                if (paramu.g())
                  paramu.q(8); 
              } 
            } 
            paramu.q((i4 + 2) * 8);
            paramu.c();
          } 
          if (i2 < 2) {
            if (paramu.g())
              paramu.q(14); 
            if (i2 == 0 && paramu.g())
              paramu.q(14); 
          } 
          if (paramu.g())
            if (k == 0) {
              paramu.q(5);
            } else {
              for (i4 = 0; i4 < c; i4++) {
                if (paramu.g())
                  paramu.q(5); 
              } 
            }  
        } 
      } 
      if (paramu.g()) {
        paramu.q(5);
        if (i2 == 2)
          paramu.q(4); 
        if (i2 >= 6)
          paramu.q(2); 
        if (paramu.g())
          paramu.q(8); 
        if (i2 == 0 && paramu.g())
          paramu.q(8); 
        if (i1 < 3)
          paramu.p(); 
      } 
      if (j == 0 && k != 3)
        paramu.p(); 
      if (j == 2 && (k == 3 || paramu.g()))
        paramu.q(6); 
      if (paramu.g() && paramu.h(6) == 1 && paramu.h(8) == 1) {
        str1 = "audio/eac3-joc";
      } else {
        str1 = "audio/eac3";
      } 
      c *= 256;
      m = (n + 1) * 2;
      n = i3 + bool;
      str2 = str1;
      k = j;
      j = n;
    } else {
      str1.q(32);
      j = str1.h(2);
      if (j == 3) {
        str2 = null;
      } else {
        str2 = "audio/ac3";
      } 
      i = b(j, str1.h(6));
      str1.q(8);
      k = str1.h(3);
      if ((k & 0x1) != 0 && k != 1)
        str1.q(2); 
      if ((k & 0x4) != 0)
        str1.q(2); 
      if (k == 2)
        str1.q(2); 
      int[] arrayOfInt = b;
      if (j < arrayOfInt.length) {
        j = arrayOfInt[j];
      } else {
        j = -1;
      } 
      boolean bool = str1.g();
      k = d[k];
      int n = k + bool;
      k = -1;
      c = '؀';
      m = i;
      i = j;
      j = n;
    } 
    return new b(str2, k, j, i, m, c, null);
  }
  
  public static int f(byte[] paramArrayOfbyte) {
    byte b;
    if (paramArrayOfbyte.length < 6)
      return -1; 
    if ((paramArrayOfbyte[5] & 0xF8) >> 3 > 10) {
      b = 1;
    } else {
      b = 0;
    } 
    if (b) {
      b = paramArrayOfbyte[2];
      return ((paramArrayOfbyte[3] & 0xFF | (b & 0x7) << 8) + 1) * 2;
    } 
    return b((paramArrayOfbyte[4] & 0xC0) >> 6, paramArrayOfbyte[4] & 0x3F);
  }
  
  public static Format g(v paramv, String paramString1, String paramString2, DrmInitData paramDrmInitData) {
    String str;
    paramv.N(2);
    int i = paramv.z();
    int j = b[(i & 0xC0) >> 6];
    int k = paramv.z();
    int m = d[(k & 0xE) >> 1];
    i = m;
    if ((k & 0x1) != 0)
      i = m + 1; 
    m = i;
    if ((paramv.z() & 0x1E) >> 1 > 0) {
      m = i;
      if ((0x2 & paramv.z()) != 0)
        m = i + 2; 
    } 
    if (paramv.a() > 0 && (paramv.z() & 0x1) != 0) {
      str = "audio/eac3-joc";
    } else {
      str = "audio/eac3";
    } 
    return Format.p(paramString1, str, null, -1, -1, m, j, null, paramDrmInitData, 0, paramString2);
  }
  
  public static int h(ByteBuffer paramByteBuffer, int paramInt) {
    byte b;
    if ((paramByteBuffer.get(paramByteBuffer.position() + paramInt + 7) & 0xFF) == 187) {
      b = 1;
    } else {
      b = 0;
    } 
    int i = paramByteBuffer.position();
    if (b) {
      b = 9;
    } else {
      b = 8;
    } 
    return 40 << (paramByteBuffer.get(i + paramInt + b) >> 4 & 0x7);
  }
  
  public static int i(byte[] paramArrayOfbyte) {
    byte b = paramArrayOfbyte[4];
    byte b1 = 0;
    if (b != -8 || paramArrayOfbyte[5] != 114 || paramArrayOfbyte[6] != 111 || (paramArrayOfbyte[7] & 0xFE) != 186)
      return 0; 
    if ((paramArrayOfbyte[7] & 0xFF) == 187)
      b1 = 1; 
    if (b1) {
      b1 = 9;
    } else {
      b1 = 8;
    } 
    return 40 << (paramArrayOfbyte[b1] >> 4 & 0x7);
  }
  
  public static final class b {
    public final String a;
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    public final int f;
    
    private b(String param1String, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      this.a = param1String;
      this.b = param1Int1;
      this.d = param1Int2;
      this.c = param1Int3;
      this.e = param1Int4;
      this.f = param1Int5;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */