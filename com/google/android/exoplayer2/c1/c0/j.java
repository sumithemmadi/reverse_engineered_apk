package com.google.android.exoplayer2.c1.c0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.c1.x;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;

final class j extends i {
  private a n;
  
  private int o;
  
  private boolean p;
  
  private x.d q;
  
  private x.b r;
  
  static void l(v paramv, long paramLong) {
    paramv.L(paramv.d() + 4);
    paramv.a[paramv.d() - 4] = (byte)(byte)(int)(paramLong & 0xFFL);
    paramv.a[paramv.d() - 3] = (byte)(byte)(int)(paramLong >>> 8L & 0xFFL);
    paramv.a[paramv.d() - 2] = (byte)(byte)(int)(paramLong >>> 16L & 0xFFL);
    paramv.a[paramv.d() - 1] = (byte)(byte)(int)(paramLong >>> 24L & 0xFFL);
  }
  
  private static int m(byte paramByte, a parama) {
    int k = n(paramByte, parama.e, 1);
    if (!(parama.d[k]).a) {
      k = parama.a.g;
    } else {
      k = parama.a.h;
    } 
    return k;
  }
  
  static int n(byte paramByte, int paramInt1, int paramInt2) {
    return paramByte >> paramInt2 & 255 >>> 8 - paramInt1;
  }
  
  public static boolean p(v paramv) {
    try {
      return x.l(1, paramv, true);
    } catch (ParserException parserException) {
      return false;
    } 
  }
  
  protected void d(long paramLong) {
    boolean bool;
    super.d(paramLong);
    int k = 0;
    if (paramLong != 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    this.p = bool;
    x.d d1 = this.q;
    if (d1 != null)
      k = d1.g; 
    this.o = k;
  }
  
  protected long e(v paramv) {
    byte[] arrayOfByte = paramv.a;
    int k = 0;
    if ((arrayOfByte[0] & 0x1) == 1)
      return -1L; 
    int m = m(arrayOfByte[0], this.n);
    if (this.p)
      k = (this.o + m) / 4; 
    long l = k;
    l(paramv, l);
    this.p = true;
    this.o = m;
    return l;
  }
  
  protected boolean h(v paramv, long paramLong, i.b paramb) {
    if (this.n != null)
      return false; 
    a a1 = o(paramv);
    this.n = a1;
    if (a1 == null)
      return true; 
    ArrayList<byte[]> arrayList = new ArrayList();
    arrayList.add(this.n.a.j);
    arrayList.add(this.n.c);
    x.d d1 = this.n.a;
    paramb.a = Format.p(null, "audio/vorbis", null, d1.e, -1, d1.b, (int)d1.c, arrayList, null, 0, null);
    return true;
  }
  
  protected void j(boolean paramBoolean) {
    super.j(paramBoolean);
    if (paramBoolean) {
      this.n = null;
      this.q = null;
      this.r = null;
    } 
    this.o = 0;
    this.p = false;
  }
  
  a o(v paramv) {
    if (this.q == null) {
      this.q = x.j(paramv);
      return null;
    } 
    if (this.r == null) {
      this.r = x.h(paramv);
      return null;
    } 
    byte[] arrayOfByte = new byte[paramv.d()];
    System.arraycopy(paramv.a, 0, arrayOfByte, 0, paramv.d());
    x.c[] arrayOfC = x.k(paramv, this.q.b);
    int k = x.a(arrayOfC.length - 1);
    return new a(this.q, this.r, arrayOfByte, arrayOfC, k);
  }
  
  static final class a {
    public final x.d a;
    
    public final x.b b;
    
    public final byte[] c;
    
    public final x.c[] d;
    
    public final int e;
    
    public a(x.d param1d, x.b param1b, byte[] param1ArrayOfbyte, x.c[] param1ArrayOfc, int param1Int) {
      this.a = param1d;
      this.b = param1b;
      this.c = param1ArrayOfbyte;
      this.d = param1ArrayOfc;
      this.e = param1Int;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c0/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */