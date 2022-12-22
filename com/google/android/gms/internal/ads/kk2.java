package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;

@TargetApi(16)
public final class kk2 {
  private final jk2 a;
  
  private final boolean b;
  
  private final long c;
  
  private final long d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private boolean h;
  
  private long i;
  
  private long j;
  
  private long k;
  
  private kk2(double paramDouble) {
    boolean bool;
    if (paramDouble != -1.0D) {
      bool = true;
    } else {
      bool = false;
    } 
    this.b = bool;
    if (bool) {
      this.a = jk2.b();
      long l = (long)(1.0E9D / paramDouble);
      this.c = l;
      this.d = l * 80L / 100L;
      return;
    } 
    this.a = null;
    this.c = -1L;
    this.d = -1L;
  }
  
  public kk2(Context paramContext) {
    this(d);
  }
  
  private final boolean d(long paramLong1, long paramLong2) {
    long l = this.j;
    return (Math.abs(paramLong2 - this.i - paramLong1 - l) > 20000000L);
  }
  
  public final void a() {
    if (this.b)
      this.a.a(); 
  }
  
  public final void b() {
    this.h = false;
    if (this.b)
      this.a.c(); 
  }
  
  public final long c(long paramLong1, long paramLong2) {
    long l1 = 1000L * paramLong1;
    if (this.h) {
      if (paramLong1 != this.e) {
        this.k++;
        this.f = this.g;
      } 
      long l = this.k;
      if (l >= 6L) {
        l = (l1 - this.j) / l;
        long l4 = this.f + l;
        if (d(l4, paramLong2)) {
          this.h = false;
        } else {
          l = this.i + l4 - this.j;
          if (!this.h) {
            this.j = l1;
            this.i = paramLong2;
            this.k = 0L;
            this.h = true;
          } 
        } 
      } else if (d(l1, paramLong2)) {
        this.h = false;
      } 
    } 
    long l2 = paramLong2;
    long l3 = l1;
    if (!this.h) {
      this.j = l1;
      this.i = paramLong2;
      this.k = 0L;
      this.h = true;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/kk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */