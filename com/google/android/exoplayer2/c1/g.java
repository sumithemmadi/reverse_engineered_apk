package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;

public final class g implements v {
  public int a(i parami, int paramInt, boolean paramBoolean) {
    paramInt = parami.f(paramInt);
    if (paramInt == -1) {
      if (paramBoolean)
        return -1; 
      throw new EOFException();
    } 
    return paramInt;
  }
  
  public void b(v paramv, int paramInt) {
    paramv.N(paramInt);
  }
  
  public void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, v.a parama) {}
  
  public void d(Format paramFormat) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */