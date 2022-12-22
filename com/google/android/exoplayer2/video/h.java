package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.s;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.List;

public final class h {
  public final List<byte[]> a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final float e;
  
  private h(List<byte[]> paramList, int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.a = paramList;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramFloat;
  }
  
  private static byte[] a(v paramv) {
    int i = paramv.F();
    int j = paramv.c();
    paramv.N(i);
    return g.c(paramv.a, j, i);
  }
  
  public static h b(v paramv) {
    try {
      paramv.N(4);
      int i = (paramv.z() & 0x3) + 1;
      if (i != 3) {
        float f;
        ArrayList<byte[]> arrayList = new ArrayList();
        this();
        int j = paramv.z() & 0x1F;
        int k;
        for (k = 0; k < j; k++)
          arrayList.add(a(paramv)); 
        int m = paramv.z();
        for (k = 0; k < m; k++)
          arrayList.add(a(paramv)); 
        if (j > 0) {
          byte[] arrayOfByte = arrayList.get(0);
          s.b b = s.i(arrayList.get(0), i, arrayOfByte.length);
          j = b.e;
          k = b.f;
          f = b.g;
        } else {
          j = -1;
          k = -1;
          f = 1.0F;
        } 
        return new h((List<byte[]>)arrayList, i, j, k, f);
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this();
      throw illegalStateException;
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      ParserException parserException = new ParserException("Error parsing AVC config", arrayIndexOutOfBoundsException);
      throw parserException;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */