package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
final class ld2 extends md2 {
  private final AudioTimestamp j = new AudioTimestamp();
  
  private long k;
  
  private long l;
  
  private long m;
  
  public ld2() {
    super(null);
  }
  
  public final void b(AudioTrack paramAudioTrack, boolean paramBoolean) {
    super.b(paramAudioTrack, paramBoolean);
    this.k = 0L;
    this.l = 0L;
    this.m = 0L;
  }
  
  public final boolean d() {
    boolean bool = this.a.getTimestamp(this.j);
    if (bool) {
      long l = this.j.framePosition;
      if (this.l > l)
        this.k++; 
      this.l = l;
      this.m = l + (this.k << 32L);
    } 
    return bool;
  }
  
  public final long e() {
    return this.j.nanoTime;
  }
  
  public final long f() {
    return this.m;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ld2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */