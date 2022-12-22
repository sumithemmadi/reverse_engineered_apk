package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

class md2 {
  protected AudioTrack a;
  
  private boolean b;
  
  private int c;
  
  private long d;
  
  private long e;
  
  private long f;
  
  private long g;
  
  private long h;
  
  private long i;
  
  private md2() {}
  
  public final void a() {
    if (this.g != -9223372036854775807L)
      return; 
    this.a.pause();
  }
  
  public void b(AudioTrack paramAudioTrack, boolean paramBoolean) {
    this.a = paramAudioTrack;
    this.b = paramBoolean;
    this.g = -9223372036854775807L;
    this.d = 0L;
    this.e = 0L;
    this.f = 0L;
    if (paramAudioTrack != null)
      this.c = paramAudioTrack.getSampleRate(); 
  }
  
  public final void c(long paramLong) {
    this.h = g();
    this.g = SystemClock.elapsedRealtime() * 1000L;
    this.i = paramLong;
    this.a.stop();
  }
  
  public boolean d() {
    return false;
  }
  
  public long e() {
    throw new UnsupportedOperationException();
  }
  
  public long f() {
    throw new UnsupportedOperationException();
  }
  
  public final long g() {
    if (this.g != -9223372036854775807L) {
      long l = (SystemClock.elapsedRealtime() * 1000L - this.g) * this.c / 1000000L;
      return Math.min(this.i, this.h + l);
    } 
    int i = this.a.getPlayState();
    if (i == 1)
      return 0L; 
    long l2 = 0xFFFFFFFFL & this.a.getPlaybackHeadPosition();
    long l1 = l2;
    if (this.b) {
      if (i == 2 && l2 == 0L)
        this.f = this.d; 
      l1 = l2 + this.f;
    } 
    if (this.d > l1)
      this.e++; 
    this.d = l1;
    return l1 + (this.e << 32L);
  }
  
  public final long h() {
    return g() * 1000000L / this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/md2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */