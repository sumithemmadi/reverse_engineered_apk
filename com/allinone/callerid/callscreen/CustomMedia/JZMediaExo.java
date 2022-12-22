package com.allinone.callerid.callscreen.CustomMedia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import cn.jzvd.Jzvd;
import cn.jzvd.u;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.q;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.b0;
import com.google.android.exoplayer2.g0;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.o0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.s;
import com.google.android.exoplayer2.source.v;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.trackselection.h;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.j;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.upstream.n;
import com.google.android.exoplayer2.upstream.p;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.video.o;
import com.google.android.exoplayer2.video.p;
import com.google.android.exoplayer2.x0;
import com.google.android.exoplayer2.y;
import com.google.android.exoplayer2.y0;

public class JZMediaExo extends u implements o0.a, p {
  private String TAG = "JZMediaExo";
  
  private Runnable callback;
  
  private long previousSeek = 0L;
  
  private x0 simpleExoPlayer;
  
  private long startTime;
  
  public JZMediaExo(Jzvd paramJzvd) {
    super(paramJzvd);
  }
  
  public long getCurrentPosition() {
    x0 x01 = this.simpleExoPlayer;
    return (x01 != null) ? x01.getCurrentPosition() : 0L;
  }
  
  public long getDuration() {
    x0 x01 = this.simpleExoPlayer;
    return (x01 != null) ? x01.getDuration() : 0L;
  }
  
  public boolean isPlaying() {
    return this.simpleExoPlayer.b0();
  }
  
  public void onLoadingChanged(boolean paramBoolean) {
    Log.e(this.TAG, "onLoadingChanged");
  }
  
  public void onPlaybackParametersChanged(l0 paraml0) {}
  
  public void onPlayerError(ExoPlaybackException paramExoPlaybackException) {
    String str = this.TAG;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onPlayerError");
    stringBuilder.append(paramExoPlaybackException.toString());
    Log.e(str, stringBuilder.toString());
    g0.d(paramExoPlaybackException.getMessage());
    q.b().m(paramExoPlaybackException.getMessage());
    this.handler.post(new c(this));
  }
  
  public void onPlayerStateChanged(boolean paramBoolean, int paramInt) {
    String str = this.TAG;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onPlayerStateChanged");
    stringBuilder.append(paramInt);
    stringBuilder.append("/ready=");
    stringBuilder.append(String.valueOf(paramBoolean));
    Log.e(str, stringBuilder.toString());
    this.handler.post(new e(this, paramInt, paramBoolean));
  }
  
  public void onPositionDiscontinuity(int paramInt) {}
  
  public void onRenderedFirstFrame() {
    String str = this.TAG;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onRenderedFirstFrame-loadingtime:");
    stringBuilder.append(System.currentTimeMillis() - this.startTime);
    stringBuilder.append("ms");
    Log.e(str, stringBuilder.toString());
  }
  
  public void onRepeatModeChanged(int paramInt) {}
  
  public void onSeekProcessed() {
    this.handler.post(new a(this));
  }
  
  public void onShuffleModeEnabledChanged(boolean paramBoolean) {}
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {
    SurfaceTexture surfaceTexture = u.SAVED_SURFACE;
    if (surfaceTexture == null) {
      u.SAVED_SURFACE = paramSurfaceTexture;
      prepare();
    } else {
      this.jzvd.G.setSurfaceTexture(surfaceTexture);
    } 
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture) {
    return false;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {}
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
  
  public void onTimelineChanged(y0 paramy0, Object paramObject, int paramInt) {
    Log.e(this.TAG, "onTimelineChanged");
  }
  
  public void onTracksChanged(TrackGroupArray paramTrackGroupArray, g paramg) {}
  
  public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
    this.handler.post(new g(this, paramInt1, paramInt2));
  }
  
  public void pause() {
    try {
      x0 x01 = this.simpleExoPlayer;
      if (x01 != null)
        x01.j0(false); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void prepare() {
    Log.e(this.TAG, "prepare");
    this.startTime = System.currentTimeMillis();
    Context context = this.jzvd.getContext();
    release();
    HandlerThread handlerThread = new HandlerThread("JZVD");
    this.mMediaHandlerThread = handlerThread;
    handlerThread.start();
    this.mMediaHandler = new Handler(this.mMediaHandlerThread.getLooper());
    this.handler = new Handler();
    this.mMediaHandler.post(new d(this, context));
  }
  
  public void release() {
    Handler handler = this.mMediaHandler;
    if (handler != null) {
      HandlerThread handlerThread = this.mMediaHandlerThread;
      if (handlerThread != null) {
        x0 x01 = this.simpleExoPlayer;
        if (x01 != null) {
          handler.post(new b(x01, handlerThread));
          this.simpleExoPlayer = null;
        } 
      } 
    } 
  }
  
  public void seekTo(long paramLong) {
    if (paramLong != this.previousSeek) {
      this.simpleExoPlayer.s(paramLong);
      this.previousSeek = paramLong;
      this.jzvd.x = paramLong;
    } 
  }
  
  public void setSpeed(float paramFloat) {
    l0 l0 = new l0(paramFloat, 1.0F);
    this.simpleExoPlayer.E0(l0);
  }
  
  public void setSurface(Surface paramSurface) {
    this.simpleExoPlayer.a(paramSurface);
  }
  
  public void setVolume(float paramFloat1, float paramFloat2) {
    try {
      x0 x01 = this.simpleExoPlayer;
      if (x01 != null) {
        x01.I0(paramFloat1);
        this.simpleExoPlayer.I0(paramFloat2);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void start() {
    this.simpleExoPlayer.j0(true);
  }
  
  private class b implements Runnable {
    private b(JZMediaExo this$0) {}
    
    public void run() {
      if (this.b.simpleExoPlayer != null) {
        int i = this.b.simpleExoPlayer.p();
        this.b.handler.post(new f(this, i));
        if (i < 100) {
          JZMediaExo jZMediaExo = this.b;
          jZMediaExo.handler.postDelayed(jZMediaExo.callback, 300L);
        } else {
          JZMediaExo jZMediaExo = this.b;
          jZMediaExo.handler.removeCallbacks(jZMediaExo.callback);
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/callscreen/CustomMedia/JZMediaExo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */