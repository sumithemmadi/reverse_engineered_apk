package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.util.h0;

final class i0 {
  public final v.a a;
  
  public final long b;
  
  public final long c;
  
  public final long d;
  
  public final long e;
  
  public final boolean f;
  
  public final boolean g;
  
  i0(v.a parama, long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean1, boolean paramBoolean2) {
    this.a = parama;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramLong3;
    this.e = paramLong4;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  public i0 a(long paramLong) {
    i0 i01;
    if (paramLong == this.c) {
      i01 = this;
    } else {
      i01 = new i0(this.a, this.b, paramLong, this.d, this.e, this.f, this.g);
    } 
    return i01;
  }
  
  public i0 b(long paramLong) {
    i0 i01;
    if (paramLong == this.b) {
      i01 = this;
    } else {
      i01 = new i0(this.a, paramLong, this.c, this.d, this.e, this.f, this.g);
    } 
    return i01;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || i0.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.b != ((i0)paramObject).b || this.c != ((i0)paramObject).c || this.d != ((i0)paramObject).d || this.e != ((i0)paramObject).e || this.f != ((i0)paramObject).f || this.g != ((i0)paramObject).g || !h0.b(this.a, ((i0)paramObject).a))
      bool = false; 
    return bool;
  }
  
  public int hashCode() {
    return ((((((527 + this.a.hashCode()) * 31 + (int)this.b) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + (int)this.e) * 31 + this.f) * 31 + this.g;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */