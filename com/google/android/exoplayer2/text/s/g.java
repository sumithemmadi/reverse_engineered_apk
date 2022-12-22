package com.google.android.exoplayer2.text.s;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.List;

public final class g extends c {
  private final f o = new f();
  
  private final v p = new v();
  
  private final e.b q = new e.b();
  
  private final a r = new a();
  
  private final List<d> s = new ArrayList<d>();
  
  public g() {
    super("WebvttDecoder");
  }
  
  private static int C(v paramv) {
    byte b1 = -1;
    int i = 0;
    while (b1 == -1) {
      i = paramv.c();
      String str = paramv.m();
      if (str == null) {
        b1 = 0;
        continue;
      } 
      if ("STYLE".equals(str)) {
        b1 = 2;
        continue;
      } 
      if (str.startsWith("NOTE")) {
        b1 = 1;
        continue;
      } 
      b1 = 3;
    } 
    paramv.M(i);
    return b1;
  }
  
  private static void D(v paramv) {
    while (!TextUtils.isEmpty(paramv.m()));
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    this.p.K(paramArrayOfbyte, paramInt);
    this.q.g();
    this.s.clear();
    try {
      h.e(this.p);
      while (!TextUtils.isEmpty(this.p.m()));
      ArrayList<e> arrayList = new ArrayList();
      while (true) {
        paramInt = C(this.p);
        if (paramInt != 0) {
          if (paramInt == 1) {
            D(this.p);
            continue;
          } 
          if (paramInt == 2) {
            if (arrayList.isEmpty()) {
              this.p.m();
              this.s.addAll(this.r.d(this.p));
              continue;
            } 
            throw new SubtitleDecoderException("A style block was found after the first cue.");
          } 
          if (paramInt == 3 && this.o.h(this.p, this.q, this.s)) {
            arrayList.add(this.q.a());
            this.q.g();
          } 
          continue;
        } 
        return new i(arrayList);
      } 
    } catch (ParserException parserException) {
      SubtitleDecoderException subtitleDecoderException = new SubtitleDecoderException((Exception)parserException);
      throw subtitleDecoderException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */