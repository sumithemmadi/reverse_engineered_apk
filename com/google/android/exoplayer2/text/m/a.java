package com.google.android.exoplayer2.text.m;

import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.v;
import java.util.List;

public final class a extends c {
  private final b o;
  
  public a(List<byte[]> paramList) {
    super("DvbDecoder");
    v v = new v(paramList.get(0));
    this.o = new b(v.F(), v.F());
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      this.o.r(); 
    return new c(this.o.b(paramArrayOfbyte, paramInt));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */