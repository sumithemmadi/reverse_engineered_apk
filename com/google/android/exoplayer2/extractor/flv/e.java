package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.video.h;

final class e extends TagPayloadReader {
  private final v b = new v(s.a);
  
  private final v c = new v(4);
  
  private int d;
  
  private boolean e;
  
  private boolean f;
  
  private int g;
  
  public e(v paramv) {
    super(paramv);
  }
  
  protected boolean b(v paramv) {
    int i = paramv.z();
    int j = i >> 4 & 0xF;
    i &= 0xF;
    if (i == 7) {
      boolean bool;
      this.g = j;
      if (j != 5) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Video format not supported: ");
    stringBuilder.append(i);
    throw new TagPayloadReader.UnsupportedFormatException(stringBuilder.toString());
  }
  
  protected boolean c(v paramv, long paramLong) {
    Format format;
    int i = paramv.z();
    long l = paramv.l();
    if (i == 0 && !this.e) {
      v v1 = new v(new byte[paramv.a()]);
      paramv.h(v1.a, 0, paramv.a());
      h h = h.b(v1);
      this.d = h.b;
      format = Format.D(null, "video/avc", null, -1, -1, h.c, h.d, -1.0F, h.a, -1, h.e, null);
      this.a.d(format);
      this.e = true;
      return false;
    } 
    if (i == 1 && this.e) {
      if (this.g == 1) {
        i = 1;
      } else {
        i = 0;
      } 
      if (!this.f && i == 0)
        return false; 
      byte[] arrayOfByte = this.c.a;
      arrayOfByte[0] = (byte)0;
      arrayOfByte[1] = (byte)0;
      arrayOfByte[2] = (byte)0;
      int j = this.d;
      int k;
      for (k = 0; format.a() > 0; k = k + 4 + m) {
        format.h(this.c.a, 4 - j, this.d);
        this.c.M(0);
        int m = this.c.D();
        this.b.M(0);
        this.a.b(this.b, 4);
        this.a.b((v)format, m);
      } 
      this.a.c(paramLong + l * 1000L, i, k, 0, null);
      this.f = true;
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/flv/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */