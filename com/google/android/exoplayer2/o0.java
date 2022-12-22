package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.j;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.video.k;
import com.google.android.exoplayer2.video.m;
import com.google.android.exoplayer2.video.p;
import com.google.android.exoplayer2.video.r.a;

public interface o0 {
  int V();
  
  l0 W();
  
  long X();
  
  boolean Y();
  
  long Z();
  
  void a0(int paramInt, long paramLong);
  
  boolean b0();
  
  void c0(boolean paramBoolean);
  
  ExoPlaybackException d0();
  
  boolean e0();
  
  void f0(a parama);
  
  int g0();
  
  long getCurrentPosition();
  
  long getDuration();
  
  void h0(a parama);
  
  boolean hasNext();
  
  boolean hasPrevious();
  
  int i0();
  
  boolean isPlaying();
  
  void j0(boolean paramBoolean);
  
  c k0();
  
  long l0();
  
  int m0();
  
  int n0();
  
  void o0(int paramInt);
  
  int p0();
  
  int q0();
  
  TrackGroupArray r0();
  
  int s0();
  
  y0 t0();
  
  Looper u0();
  
  boolean v0();
  
  long w0();
  
  g x0();
  
  int y0(int paramInt);
  
  b z0();
  
  public static interface a {
    void onIsPlayingChanged(boolean param1Boolean);
    
    void onLoadingChanged(boolean param1Boolean);
    
    void onPlaybackParametersChanged(l0 param1l0);
    
    void onPlaybackSuppressionReasonChanged(int param1Int);
    
    void onPlayerError(ExoPlaybackException param1ExoPlaybackException);
    
    void onPlayerStateChanged(boolean param1Boolean, int param1Int);
    
    void onPositionDiscontinuity(int param1Int);
    
    void onRepeatModeChanged(int param1Int);
    
    void onSeekProcessed();
    
    void onShuffleModeEnabledChanged(boolean param1Boolean);
    
    void onTimelineChanged(y0 param1y0, int param1Int);
    
    @Deprecated
    void onTimelineChanged(y0 param1y0, Object param1Object, int param1Int);
    
    void onTracksChanged(TrackGroupArray param1TrackGroupArray, g param1g);
  }
  
  public static interface b {
    void i(j param1j);
    
    void m(j param1j);
  }
  
  public static interface c {
    void a(Surface param1Surface);
    
    void b(a param1a);
    
    void c(m param1m);
    
    void d(Surface param1Surface);
    
    void e(a param1a);
    
    void f(TextureView param1TextureView);
    
    void g(k param1k);
    
    void h(SurfaceView param1SurfaceView);
    
    void j(p param1p);
    
    void k(m param1m);
    
    void l(SurfaceView param1SurfaceView);
    
    void n(TextureView param1TextureView);
    
    void o(p param1p);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */