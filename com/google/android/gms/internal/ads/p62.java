package com.google.android.gms.internal.ads;

import java.io.InputStream;

final class p62 extends InputStream {
  private m62 b;
  
  private zzejy c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  private int g;
  
  public p62(zzeng paramzzeng) {
    b();
  }
  
  private final void b() {
    m62 m621 = new m62(this.h, null);
    this.b = m621;
    zzejy zzejy1 = (zzejy)m621.next();
    this.c = zzejy1;
    this.d = zzejy1.size();
    this.e = 0;
    this.f = 0;
  }
  
  private final void c() {
    if (this.c != null) {
      int i = this.e;
      int j = this.d;
      if (i == j) {
        this.f += j;
        this.e = 0;
        if (this.b.hasNext()) {
          zzejy zzejy1 = (zzejy)this.b.next();
          this.c = zzejy1;
          this.d = zzejy1.size();
          return;
        } 
        this.c = null;
        this.d = 0;
      } 
    } 
  }
  
  private final int d() {
    int i = this.f;
    int j = this.e;
    return this.h.size() - i + j;
  }
  
  private final int e(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = paramInt2;
    int j = paramInt1;
    paramInt1 = i;
    while (paramInt1 > 0) {
      c();
      if (this.c != null) {
        int k = Math.min(this.d - this.e, paramInt1);
        i = j;
        if (paramArrayOfbyte != null) {
          this.c.zza(paramArrayOfbyte, this.e, j, k);
          i = j + k;
        } 
        this.e += k;
        paramInt1 -= k;
        j = i;
      } 
    } 
    return paramInt2 - paramInt1;
  }
  
  public final int available() {
    return d();
  }
  
  public final void mark(int paramInt) {
    this.g = this.f + this.e;
  }
  
  public final boolean markSupported() {
    return true;
  }
  
  public final int read() {
    c();
    zzejy zzejy1 = this.c;
    if (zzejy1 == null)
      return -1; 
    int i = this.e;
    this.e = i + 1;
    return zzejy1.zzfz(i) & 0xFF;
  }
  
  public final int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramArrayOfbyte.getClass();
    if (paramInt1 >= 0 && paramInt2 >= 0 && paramInt2 <= paramArrayOfbyte.length - paramInt1) {
      int i = e(paramArrayOfbyte, paramInt1, paramInt2);
      paramInt1 = i;
      if (i == 0) {
        if (paramInt2 <= 0) {
          paramInt1 = i;
          return (d() == 0) ? -1 : paramInt1;
        } 
      } else {
        return paramInt1;
      } 
    } else {
      throw new IndexOutOfBoundsException();
    } 
    return -1;
  }
  
  public final void reset() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial b : ()V
    //   6: aload_0
    //   7: aconst_null
    //   8: iconst_0
    //   9: aload_0
    //   10: getfield g : I
    //   13: invokespecial e : ([BII)I
    //   16: pop
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	20	finally
  }
  
  public final long skip(long paramLong) {
    if (paramLong >= 0L) {
      long l = paramLong;
      if (paramLong > 2147483647L)
        l = 2147483647L; 
      return e(null, 0, (int)l);
    } 
    throw new IndexOutOfBoundsException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/p62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */