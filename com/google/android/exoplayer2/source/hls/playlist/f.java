package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.Collections;
import java.util.List;

public final class f extends g {
  public final int d;
  
  public final long e;
  
  public final long f;
  
  public final boolean g;
  
  public final int h;
  
  public final long i;
  
  public final int j;
  
  public final long k;
  
  public final boolean l;
  
  public final boolean m;
  
  public final DrmInitData n;
  
  public final List<a> o;
  
  public final long p;
  
  public f(int paramInt1, String paramString, List<String> paramList, long paramLong1, long paramLong2, boolean paramBoolean1, int paramInt2, long paramLong3, int paramInt3, long paramLong4, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, DrmInitData paramDrmInitData, List<a> paramList1) {
    super(paramString, paramList, paramBoolean2);
    this.d = paramInt1;
    this.f = paramLong2;
    this.g = paramBoolean1;
    this.h = paramInt2;
    this.i = paramLong3;
    this.j = paramInt3;
    this.k = paramLong4;
    this.l = paramBoolean3;
    this.m = paramBoolean4;
    this.n = paramDrmInitData;
    this.o = Collections.unmodifiableList(paramList1);
    if (!paramList1.isEmpty()) {
      a a = paramList1.get(paramList1.size() - 1);
      this.p = a.g + a.d;
    } else {
      this.p = 0L;
    } 
    if (paramLong1 == -9223372036854775807L) {
      paramLong1 = -9223372036854775807L;
    } else if (paramLong1 < 0L) {
      paramLong1 = this.p + paramLong1;
    } 
    this.e = paramLong1;
  }
  
  public f b(List<StreamKey> paramList) {
    return this;
  }
  
  public f c(long paramLong, int paramInt) {
    return new f(this.d, this.a, this.b, this.e, paramLong, true, paramInt, this.i, this.j, this.k, this.c, this.l, this.m, this.n, this.o);
  }
  
  public f d() {
    return this.l ? this : new f(this.d, this.a, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.c, true, this.m, this.n, this.o);
  }
  
  public long e() {
    return this.f + this.p;
  }
  
  public boolean f(f paramf) {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramf != null) {
      long l1 = this.i;
      long l2 = paramf.i;
      if (l1 > l2) {
        bool2 = bool1;
      } else {
        if (l1 < l2)
          return false; 
        int i = this.o.size();
        int j = paramf.o.size();
        bool2 = bool1;
        if (i <= j)
          if (i == j && this.l && !paramf.l) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }  
      } 
    } 
    return bool2;
  }
  
  public static final class a implements Comparable<Long> {
    public final String b;
    
    public final a c;
    
    public final long d;
    
    public final String e;
    
    public final int f;
    
    public final long g;
    
    public final DrmInitData h;
    
    public final String i;
    
    public final String j;
    
    public final long k;
    
    public final long l;
    
    public final boolean m;
    
    public a(String param1String1, long param1Long1, long param1Long2, String param1String2, String param1String3) {
      this(param1String1, null, "", 0L, -1, -9223372036854775807L, null, param1String2, param1String3, param1Long1, param1Long2, false);
    }
    
    public a(String param1String1, a param1a, String param1String2, long param1Long1, int param1Int, long param1Long2, DrmInitData param1DrmInitData, String param1String3, String param1String4, long param1Long3, long param1Long4, boolean param1Boolean) {
      this.b = param1String1;
      this.c = param1a;
      this.e = param1String2;
      this.d = param1Long1;
      this.f = param1Int;
      this.g = param1Long2;
      this.h = param1DrmInitData;
      this.i = param1String3;
      this.j = param1String4;
      this.k = param1Long3;
      this.l = param1Long4;
      this.m = param1Boolean;
    }
    
    public int a(Long param1Long) {
      boolean bool;
      if (this.g > param1Long.longValue()) {
        bool = true;
      } else if (this.g < param1Long.longValue()) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/source/hls/playlist/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */