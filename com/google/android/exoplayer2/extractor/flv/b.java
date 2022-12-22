package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c1.v;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;

final class b extends TagPayloadReader {
  private static final int[] b = new int[] { 5512, 11025, 22050, 44100 };
  
  private boolean c;
  
  private boolean d;
  
  private int e;
  
  public b(v paramv) {
    super(paramv);
  }
  
  protected boolean b(v paramv) {
    StringBuilder stringBuilder;
    if (!this.c) {
      int i = paramv.z();
      int j = i >> 4 & 0xF;
      this.e = j;
      if (j == 2) {
        Format format = Format.p(null, "audio/mpeg", null, -1, -1, 1, b[i >> 2 & 0x3], null, null, 0, null);
        this.a.d(format);
        this.d = true;
      } else if (j == 7 || j == 8) {
        String str;
        if (j == 7) {
          str = "audio/g711-alaw";
        } else {
          str = "audio/g711-mlaw";
        } 
        Format format = Format.o(null, str, null, -1, -1, 1, 8000, -1, null, null, 0, null);
        this.a.d(format);
        this.d = true;
      } else if (j != 10) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Audio format not supported: ");
        stringBuilder.append(this.e);
        throw new TagPayloadReader.UnsupportedFormatException(stringBuilder.toString());
      } 
      this.c = true;
    } else {
      stringBuilder.N(1);
    } 
    return true;
  }
  
  protected boolean c(v paramv, long paramLong) {
    Format format;
    if (this.e == 2) {
      int j = paramv.a();
      this.a.b(paramv, j);
      this.a.c(paramLong, 1, j, 0, null);
      return true;
    } 
    int i = paramv.z();
    if (i == 0 && !this.d) {
      i = paramv.a();
      byte[] arrayOfByte = new byte[i];
      paramv.h(arrayOfByte, 0, i);
      Pair pair = g.g(arrayOfByte);
      format = Format.p(null, "audio/mp4a-latm", null, -1, -1, ((Integer)pair.second).intValue(), ((Integer)pair.first).intValue(), Collections.singletonList(arrayOfByte), null, 0, null);
      this.a.d(format);
      this.d = true;
      return false;
    } 
    if (this.e != 10 || i == 1) {
      i = format.a();
      this.a.b((v)format, i);
      this.a.c(paramLong, 1, i, 0, null);
      return true;
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/flv/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */