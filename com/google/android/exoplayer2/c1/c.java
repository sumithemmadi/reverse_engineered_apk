package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;

public final class c implements t {
  public final int a;
  
  public final int[] b;
  
  public final long[] c;
  
  public final long[] d;
  
  public final long[] e;
  
  private final long f;
  
  public c(int[] paramArrayOfint, long[] paramArrayOflong1, long[] paramArrayOflong2, long[] paramArrayOflong3) {
    this.b = paramArrayOfint;
    this.c = paramArrayOflong1;
    this.d = paramArrayOflong2;
    this.e = paramArrayOflong3;
    int i = paramArrayOfint.length;
    this.a = i;
    if (i > 0) {
      this.f = paramArrayOflong2[i - 1] + paramArrayOflong3[i - 1];
    } else {
      this.f = 0L;
    } 
  }
  
  public int a(long paramLong) {
    return h0.f(this.e, paramLong, true, true);
  }
  
  public boolean b() {
    return true;
  }
  
  public long c() {
    return this.f;
  }
  
  public t.a j(long paramLong) {
    int i = a(paramLong);
    u u = new u(this.e[i], this.c[i]);
    if (u.b >= paramLong || i == this.a - 1)
      return new t.a(u); 
    long[] arrayOfLong = this.e;
    return new t.a(u, new u(arrayOfLong[++i], this.c[i]));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ChunkIndex(length=");
    stringBuilder.append(this.a);
    stringBuilder.append(", sizes=");
    stringBuilder.append(Arrays.toString(this.b));
    stringBuilder.append(", offsets=");
    stringBuilder.append(Arrays.toString(this.c));
    stringBuilder.append(", timeUs=");
    stringBuilder.append(Arrays.toString(this.e));
    stringBuilder.append(", durationsUs=");
    stringBuilder.append(Arrays.toString(this.d));
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */