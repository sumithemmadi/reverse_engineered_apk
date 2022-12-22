package com.google.android.exoplayer2.text.s;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Collections;

public final class b extends c {
  private final v o = new v();
  
  private final e.b p = new e.b();
  
  public b() {
    super("Mp4WebvttDecoder");
  }
  
  private static com.google.android.exoplayer2.text.b C(v paramv, e.b paramb, int paramInt) {
    paramb.g();
    while (paramInt > 0) {
      if (paramInt >= 8) {
        int i = paramv.k();
        int j = paramv.k();
        i -= 8;
        String str = h0.w(paramv.a, paramv.c(), i);
        paramv.N(i);
        i = paramInt - 8 - i;
        if (j == 1937011815) {
          f.j(str, paramb);
          paramInt = i;
          continue;
        } 
        paramInt = i;
        if (j == 1885436268) {
          f.k(null, str.trim(), paramb, Collections.emptyList());
          paramInt = i;
        } 
        continue;
      } 
      throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
    } 
    return paramb.a();
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    this.o.K(paramArrayOfbyte, paramInt);
    ArrayList<com.google.android.exoplayer2.text.b> arrayList = new ArrayList();
    while (this.o.a() > 0) {
      if (this.o.a() >= 8) {
        paramInt = this.o.k();
        if (this.o.k() == 1987343459) {
          arrayList.add(C(this.o, this.p, paramInt - 8));
          continue;
        } 
        this.o.N(paramInt - 8);
        continue;
      } 
      throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
    } 
    return new c(arrayList);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */