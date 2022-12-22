package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.Arrays;
import java.util.Comparator;

public abstract class b implements f {
  protected final TrackGroup a;
  
  protected final int b;
  
  protected final int[] c;
  
  private final Format[] d;
  
  private final long[] e;
  
  private int f;
  
  public b(TrackGroup paramTrackGroup, int... paramVarArgs) {
    boolean bool;
    int i = paramVarArgs.length;
    int j = 0;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    this.a = (TrackGroup)e.e(paramTrackGroup);
    i = paramVarArgs.length;
    this.b = i;
    this.d = new Format[i];
    for (i = 0; i < paramVarArgs.length; i++)
      this.d[i] = paramTrackGroup.a(paramVarArgs[i]); 
    Arrays.sort(this.d, new b(null));
    this.c = new int[this.b];
    i = j;
    while (true) {
      j = this.b;
      if (i < j) {
        this.c[i] = paramTrackGroup.b(this.d[i]);
        i++;
        continue;
      } 
      this.e = new long[j];
      return;
    } 
  }
  
  public final TrackGroup a() {
    return this.a;
  }
  
  public final boolean c(int paramInt, long paramLong) {
    long l = SystemClock.elapsedRealtime();
    boolean bool = q(paramInt, l);
    for (byte b1 = 0; b1 < this.b && !bool; b1++) {
      if (b1 != paramInt && !q(b1, l)) {
        bool = true;
      } else {
        bool = false;
      } 
    } 
    if (!bool)
      return false; 
    long[] arrayOfLong = this.e;
    arrayOfLong[paramInt] = Math.max(arrayOfLong[paramInt], h0.a(l, paramLong, Long.MAX_VALUE));
    return true;
  }
  
  public final Format d(int paramInt) {
    return this.d[paramInt];
  }
  
  public void e() {}
  
  public boolean equals(Object paramObject) {
    boolean bool = true;
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    if (this.a != ((b)paramObject).a || !Arrays.equals(this.c, ((b)paramObject).c))
      bool = false; 
    return bool;
  }
  
  public final int f(int paramInt) {
    return this.c[paramInt];
  }
  
  public final int h() {
    return this.c[b()];
  }
  
  public int hashCode() {
    if (this.f == 0)
      this.f = System.identityHashCode(this.a) * 31 + Arrays.hashCode(this.c); 
    return this.f;
  }
  
  public final Format i() {
    return this.d[b()];
  }
  
  public void k(float paramFloat) {}
  
  public final int length() {
    return this.c.length;
  }
  
  public final int n(int paramInt) {
    for (byte b1 = 0; b1 < this.b; b1++) {
      if (this.c[b1] == paramInt)
        return b1; 
    } 
    return -1;
  }
  
  public final int o(Format paramFormat) {
    for (byte b1 = 0; b1 < this.b; b1++) {
      if (this.d[b1] == paramFormat)
        return b1; 
    } 
    return -1;
  }
  
  public void p() {}
  
  protected final boolean q(int paramInt, long paramLong) {
    boolean bool;
    if (this.e[paramInt] > paramLong) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private static final class b implements Comparator<Format> {
    private b() {}
    
    public int a(Format param1Format1, Format param1Format2) {
      return param1Format2.f - param1Format1.f;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/trackselection/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */