package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;

public interface v {
  int a(i parami, int paramInt, boolean paramBoolean);
  
  void b(com.google.android.exoplayer2.util.v paramv, int paramInt);
  
  void c(long paramLong, int paramInt1, int paramInt2, int paramInt3, a parama);
  
  void d(Format paramFormat);
  
  public static final class a {
    public final int a;
    
    public final byte[] b;
    
    public final int c;
    
    public final int d;
    
    public a(int param1Int1, byte[] param1ArrayOfbyte, int param1Int2, int param1Int3) {
      this.a = param1Int1;
      this.b = param1ArrayOfbyte;
      this.c = param1Int2;
      this.d = param1Int3;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = true;
      if (this == param1Object)
        return true; 
      if (param1Object == null || a.class != param1Object.getClass())
        return false; 
      param1Object = param1Object;
      if (this.a != ((a)param1Object).a || this.c != ((a)param1Object).c || this.d != ((a)param1Object).d || !Arrays.equals(this.b, ((a)param1Object).b))
        bool = false; 
      return bool;
    }
    
    public int hashCode() {
      return ((this.a * 31 + Arrays.hashCode(this.b)) * 31 + this.c) * 31 + this.d;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */