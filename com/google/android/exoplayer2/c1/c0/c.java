package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.c1.i;
import com.google.android.exoplayer2.c1.m;
import com.google.android.exoplayer2.c1.n;
import com.google.android.exoplayer2.c1.o;
import com.google.android.exoplayer2.c1.t;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.l;
import com.google.android.exoplayer2.util.v;
import java.util.Arrays;

final class c extends i {
  private l n;
  
  private a o;
  
  private int m(v paramv) {
    int j = (paramv.a[2] & 0xFF) >> 4;
    if (j == 6 || j == 7) {
      paramv.N(4);
      paramv.G();
    } 
    j = m.j(paramv, j);
    paramv.M(0);
    return j;
  }
  
  private static boolean n(byte[] paramArrayOfbyte) {
    boolean bool = false;
    if (paramArrayOfbyte[0] == -1)
      bool = true; 
    return bool;
  }
  
  public static boolean o(v paramv) {
    boolean bool;
    if (paramv.a() >= 5 && paramv.z() == 127 && paramv.B() == 1179402563L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  protected long e(v paramv) {
    return !n(paramv.a) ? -1L : m(paramv);
  }
  
  protected boolean h(v paramv, long paramLong, i.b paramb) {
    byte[] arrayOfByte1;
    byte[] arrayOfByte2 = paramv.a;
    if (this.n == null) {
      this.n = new l(arrayOfByte2, 17);
      arrayOfByte1 = Arrays.copyOfRange(arrayOfByte2, 9, paramv.d());
      paramb.a = this.n.i(arrayOfByte1, null);
    } else if ((arrayOfByte2[0] & Byte.MAX_VALUE) == 3) {
      this.o = new a(this);
      l.a a1 = n.h((v)arrayOfByte1);
      this.n = this.n.c(a1);
    } else if (n(arrayOfByte2)) {
      a a1 = this.o;
      if (a1 != null) {
        a1.d(paramLong);
        paramb.b = this.o;
      } 
      return false;
    } 
    return true;
  }
  
  protected void j(boolean paramBoolean) {
    super.j(paramBoolean);
    if (paramBoolean) {
      this.n = null;
      this.o = null;
    } 
  }
  
  private class a implements g {
    private long a = -1L;
    
    private long b = -1L;
    
    public a(c this$0) {}
    
    public t a() {
      boolean bool;
      if (this.a != -1L) {
        bool = true;
      } else {
        bool = false;
      } 
      e.f(bool);
      return (t)new o(c.l(this.c), this.a);
    }
    
    public long b(i param1i) {
      long l = this.b;
      if (l >= 0L) {
        l = -(l + 2L);
        this.b = -1L;
        return l;
      } 
      return -1L;
    }
    
    public void c(long param1Long) {
      e.e((c.l(this.c)).k);
      long[] arrayOfLong = (c.l(this.c)).k.a;
      this.b = arrayOfLong[h0.f(arrayOfLong, param1Long, true, true)];
    }
    
    public void d(long param1Long) {
      this.a = param1Long;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */