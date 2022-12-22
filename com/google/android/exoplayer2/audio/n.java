package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.v;
import java.lang.reflect.Method;

final class n {
  private final a a;
  
  private final long[] b;
  
  private AudioTrack c;
  
  private int d;
  
  private int e;
  
  private m f;
  
  private int g;
  
  private boolean h;
  
  private long i;
  
  private long j;
  
  private long k;
  
  private Method l;
  
  private long m;
  
  private boolean n;
  
  private boolean o;
  
  private long p;
  
  private long q;
  
  private long r;
  
  private long s;
  
  private int t;
  
  private int u;
  
  private long v;
  
  private long w;
  
  private long x;
  
  private long y;
  
  public n(a parama) {
    this.a = (a)e.e(parama);
    if (h0.a >= 18)
      try {
        this.l = AudioTrack.class.getMethod("getLatency", null);
      } catch (NoSuchMethodException noSuchMethodException) {} 
    this.b = new long[10];
  }
  
  private boolean a() {
    boolean bool;
    if (this.h && ((AudioTrack)e.e(this.c)).getPlayState() == 2 && e() == 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private long b(long paramLong) {
    return paramLong * 1000000L / this.g;
  }
  
  private long e() {
    AudioTrack audioTrack = (AudioTrack)e.e(this.c);
    if (this.v != -9223372036854775807L) {
      long l = (SystemClock.elapsedRealtime() * 1000L - this.v) * this.g / 1000000L;
      return Math.min(this.y, this.x + l);
    } 
    int i = audioTrack.getPlayState();
    if (i == 1)
      return 0L; 
    long l2 = 0xFFFFFFFFL & audioTrack.getPlaybackHeadPosition();
    long l1 = l2;
    if (this.h) {
      if (i == 2 && l2 == 0L)
        this.s = this.q; 
      l1 = l2 + this.s;
    } 
    if (h0.a <= 29) {
      if (l1 == 0L && this.q > 0L && i == 3) {
        if (this.w == -9223372036854775807L)
          this.w = SystemClock.elapsedRealtime(); 
        return this.q;
      } 
      this.w = -9223372036854775807L;
    } 
    if (this.q > l1)
      this.r++; 
    this.q = l1;
    return l1 + (this.r << 32L);
  }
  
  private long f() {
    return b(e());
  }
  
  private void l(long paramLong1, long paramLong2) {
    m m1 = (m)e.e(this.f);
    if (!m1.f(paramLong1))
      return; 
    long l1 = m1.c();
    long l2 = m1.b();
    if (Math.abs(l1 - paramLong1) > 5000000L) {
      this.a.d(l2, l1, paramLong1, paramLong2);
      m1.g();
    } else if (Math.abs(b(l2) - paramLong2) > 5000000L) {
      this.a.c(l2, l1, paramLong1, paramLong2);
      m1.g();
    } else {
      m1.a();
    } 
  }
  
  private void m() {
    long l1 = f();
    if (l1 == 0L)
      return; 
    long l2 = System.nanoTime() / 1000L;
    if (l2 - this.k >= 30000L) {
      long[] arrayOfLong = this.b;
      int i = this.t;
      arrayOfLong[i] = l1 - l2;
      this.t = (i + 1) % 10;
      i = this.u;
      if (i < 10)
        this.u = i + 1; 
      this.k = l2;
      this.j = 0L;
      i = 0;
      while (true) {
        int j = this.u;
        if (i < j) {
          this.j += this.b[i] / j;
          i++;
          continue;
        } 
        break;
      } 
    } 
    if (this.h)
      return; 
    l(l2, l1);
    n(l2);
  }
  
  private void n(long paramLong) {
    if (this.o) {
      Method method = this.l;
      if (method != null && paramLong - this.p >= 500000L) {
        try {
          long l = ((Integer)h0.g(method.invoke(e.e(this.c), new Object[0]))).intValue() * 1000L - this.i;
          this.m = l;
          l = Math.max(l, 0L);
          this.m = l;
          if (l > 5000000L) {
            this.a.b(l);
            this.m = 0L;
          } 
        } catch (Exception exception) {
          this.l = null;
        } 
        this.p = paramLong;
      } 
    } 
  }
  
  private static boolean o(int paramInt) {
    boolean bool;
    if (h0.a < 23 && (paramInt == 5 || paramInt == 6)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private void r() {
    this.j = 0L;
    this.u = 0;
    this.t = 0;
    this.k = 0L;
  }
  
  public int c(long paramLong) {
    int i = (int)(paramLong - e() * this.d);
    return this.e - i;
  }
  
  public long d(boolean paramBoolean) {
    long l2;
    if (((AudioTrack)e.e(this.c)).getPlayState() == 3)
      m(); 
    long l1 = System.nanoTime() / 1000L;
    m m1 = (m)e.e(this.f);
    if (m1.d()) {
      l2 = b(m1.b());
      return !m1.e() ? l2 : (l2 + l1 - m1.c());
    } 
    if (this.u == 0) {
      l2 = f();
    } else {
      l2 = l1 + this.j;
    } 
    l1 = l2;
    if (!paramBoolean)
      l1 = l2 - this.m; 
    return l1;
  }
  
  public void g(long paramLong) {
    this.x = e();
    this.v = SystemClock.elapsedRealtime() * 1000L;
    this.y = paramLong;
  }
  
  public boolean h(long paramLong) {
    return (paramLong > e() || a());
  }
  
  public boolean i() {
    boolean bool;
    if (((AudioTrack)e.e(this.c)).getPlayState() == 3) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean j(long paramLong) {
    boolean bool;
    if (this.w != -9223372036854775807L && paramLong > 0L && SystemClock.elapsedRealtime() - this.w >= 200L) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean k(long paramLong) {
    int i = ((AudioTrack)e.e(this.c)).getPlayState();
    if (this.h) {
      if (i == 2) {
        this.n = false;
        return false;
      } 
      if (i == 1 && e() == 0L)
        return false; 
    } 
    boolean bool1 = this.n;
    boolean bool2 = h(paramLong);
    this.n = bool2;
    if (bool1 && !bool2 && i != 1) {
      a a1 = this.a;
      if (a1 != null)
        a1.a(this.e, v.b(this.i)); 
    } 
    return true;
  }
  
  public boolean p() {
    r();
    if (this.v == -9223372036854775807L) {
      ((m)e.e(this.f)).h();
      return true;
    } 
    return false;
  }
  
  public void q() {
    r();
    this.c = null;
    this.f = null;
  }
  
  public void s(AudioTrack paramAudioTrack, int paramInt1, int paramInt2, int paramInt3) {
    long l;
    this.c = paramAudioTrack;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = new m(paramAudioTrack);
    this.g = paramAudioTrack.getSampleRate();
    this.h = o(paramInt1);
    boolean bool = h0.U(paramInt1);
    this.o = bool;
    if (bool) {
      l = b((paramInt3 / paramInt2));
    } else {
      l = -9223372036854775807L;
    } 
    this.i = l;
    this.q = 0L;
    this.r = 0L;
    this.s = 0L;
    this.n = false;
    this.v = -9223372036854775807L;
    this.w = -9223372036854775807L;
    this.m = 0L;
  }
  
  public void t() {
    ((m)e.e(this.f)).h();
  }
  
  public static interface a {
    void a(int param1Int, long param1Long);
    
    void b(long param1Long);
    
    void c(long param1Long1, long param1Long2, long param1Long3, long param1Long4);
    
    void d(long param1Long1, long param1Long2, long param1Long3, long param1Long4);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */