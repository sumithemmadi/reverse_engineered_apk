package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;

public class y implements g0 {
  private final m a;
  
  private final long b;
  
  private final long c;
  
  private final long d;
  
  private final long e;
  
  private final long f;
  
  private final int g;
  
  private final boolean h;
  
  private final long i;
  
  private final boolean j;
  
  private int k;
  
  private boolean l;
  
  private boolean m;
  
  protected y(m paramm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean1, int paramInt7, boolean paramBoolean2) {
    j(paramInt4, 0, "bufferForPlaybackMs", "0");
    j(paramInt5, 0, "bufferForPlaybackAfterRebufferMs", "0");
    j(paramInt1, paramInt4, "minBufferAudioMs", "bufferForPlaybackMs");
    j(paramInt2, paramInt4, "minBufferVideoMs", "bufferForPlaybackMs");
    j(paramInt1, paramInt5, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
    j(paramInt2, paramInt5, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
    j(paramInt3, paramInt1, "maxBufferMs", "minBufferAudioMs");
    j(paramInt3, paramInt2, "maxBufferMs", "minBufferVideoMs");
    j(paramInt7, 0, "backBufferDurationMs", "0");
    this.a = paramm;
    this.b = v.a(paramInt1);
    this.c = v.a(paramInt2);
    this.d = v.a(paramInt3);
    this.e = v.a(paramInt4);
    this.f = v.a(paramInt5);
    this.g = paramInt6;
    this.h = paramBoolean1;
    this.i = v.a(paramInt7);
    this.j = paramBoolean2;
  }
  
  @Deprecated
  public y(m paramm, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean) {
    this(paramm, paramInt1, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, 0, false);
  }
  
  private static void j(int paramInt1, int paramInt2, String paramString1, String paramString2) {
    boolean bool;
    if (paramInt1 >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramString1);
    stringBuilder.append(" cannot be less than ");
    stringBuilder.append(paramString2);
    e.b(bool, stringBuilder.toString());
  }
  
  private static int l(int paramInt) {
    switch (paramInt) {
      default:
        throw new IllegalArgumentException();
      case 6:
        return 0;
      case 3:
      case 4:
      case 5:
        return 131072;
      case 2:
        return 32768000;
      case 1:
        return 3538944;
      case 0:
        break;
    } 
    return 36438016;
  }
  
  private static boolean m(r0[] paramArrayOfr0, g paramg) {
    for (byte b = 0; b < paramArrayOfr0.length; b++) {
      if (paramArrayOfr0[b].n() == 2 && paramg.a(b) != null)
        return true; 
    } 
    return false;
  }
  
  private void n(boolean paramBoolean) {
    this.k = 0;
    this.l = false;
    if (paramBoolean)
      this.a.g(); 
  }
  
  public void a() {
    n(false);
  }
  
  public void b() {
    n(true);
  }
  
  public boolean c() {
    return this.j;
  }
  
  public long d() {
    return this.i;
  }
  
  public boolean e(long paramLong, float paramFloat, boolean paramBoolean) {
    long l = h0.J(paramLong, paramFloat);
    if (paramBoolean) {
      paramLong = this.f;
    } else {
      paramLong = this.e;
    } 
    return (paramLong <= 0L || l >= paramLong || (!this.h && this.a.f() >= this.k));
  }
  
  public boolean f(long paramLong, float paramFloat) {
    long l1;
    int i = this.a.f();
    int j = this.k;
    boolean bool = true;
    if (i >= j) {
      j = 1;
    } else {
      j = 0;
    } 
    if (this.m) {
      l1 = this.c;
    } else {
      l1 = this.b;
    } 
    long l2 = l1;
    if (paramFloat > 1.0F)
      l2 = Math.min(h0.E(l1, paramFloat), this.d); 
    if (paramLong < l2) {
      boolean bool1 = bool;
      if (!this.h)
        if (j == 0) {
          bool1 = bool;
        } else {
          bool1 = false;
        }  
      this.l = bool1;
    } else if (paramLong >= this.d || j != 0) {
      this.l = false;
    } 
    return this.l;
  }
  
  public void g(r0[] paramArrayOfr0, TrackGroupArray paramTrackGroupArray, g paramg) {
    this.m = m(paramArrayOfr0, paramg);
    int i = this.g;
    int j = i;
    if (i == -1)
      j = k(paramArrayOfr0, paramg); 
    this.k = j;
    this.a.h(j);
  }
  
  public void h() {
    n(true);
  }
  
  public e i() {
    return (e)this.a;
  }
  
  protected int k(r0[] paramArrayOfr0, g paramg) {
    byte b = 0;
    int i;
    for (i = 0; b < paramArrayOfr0.length; i = j) {
      int j = i;
      if (paramg.a(b) != null)
        j = i + l(paramArrayOfr0[b].n()); 
      b++;
    } 
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */