package cn.jzvd;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Map;

public class JZMediaSystem extends u implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnVideoSizeChangedListener {
  public MediaPlayer mediaPlayer;
  
  public JZMediaSystem(Jzvd paramJzvd) {
    super(paramJzvd);
  }
  
  public long getCurrentPosition() {
    MediaPlayer mediaPlayer = this.mediaPlayer;
    return (mediaPlayer != null) ? mediaPlayer.getCurrentPosition() : 0L;
  }
  
  public long getDuration() {
    MediaPlayer mediaPlayer = this.mediaPlayer;
    return (mediaPlayer != null) ? mediaPlayer.getDuration() : 0L;
  }
  
  public boolean isPlaying() {
    return this.mediaPlayer.isPlaying();
  }
  
  public void onBufferingUpdate(MediaPlayer paramMediaPlayer, int paramInt) {
    this.handler.post(new g(this, paramInt));
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer) {
    this.handler.post(new d(this));
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2) {
    this.handler.post(new f(this, paramInt1, paramInt2));
    return true;
  }
  
  public boolean onInfo(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2) {
    this.handler.post(new c(this, paramInt1, paramInt2));
    return false;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer) {
    this.handler.post(new j(this));
  }
  
  public void onSeekComplete(MediaPlayer paramMediaPlayer) {
    this.handler.post(new h(this));
  }
  
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
  
  public void onVideoSizeChanged(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2) {
    this.handler.post(new e(this, paramInt1, paramInt2));
  }
  
  public void pause() {
    this.mMediaHandler.post(new b(this));
  }
  
  public void prepare() {
    release();
    HandlerThread handlerThread = new HandlerThread("JZVD");
    this.mMediaHandlerThread = handlerThread;
    handlerThread.start();
    this.mMediaHandler = new Handler(this.mMediaHandlerThread.getLooper());
    this.handler = new Handler();
    this.mMediaHandler.post(new i(this));
  }
  
  public void release() {
    Handler handler = this.mMediaHandler;
    if (handler != null) {
      HandlerThread handlerThread = this.mMediaHandlerThread;
      if (handlerThread != null) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
          handler.post(new l(mediaPlayer, handlerThread));
          this.mediaPlayer = null;
        } 
      } 
    } 
  }
  
  public void seekTo(long paramLong) {
    this.mMediaHandler.post(new a(this, paramLong));
  }
  
  public void setSpeed(float paramFloat) {
    PlaybackParams playbackParams = this.mediaPlayer.getPlaybackParams();
    playbackParams.setSpeed(paramFloat);
    this.mediaPlayer.setPlaybackParams(playbackParams);
  }
  
  public void setSurface(Surface paramSurface) {
    this.mediaPlayer.setSurface(paramSurface);
  }
  
  public void setVolume(float paramFloat1, float paramFloat2) {
    Handler handler = this.mMediaHandler;
    if (handler == null)
      return; 
    handler.post(new k(this, paramFloat1, paramFloat2));
  }
  
  public void start() {
    this.mMediaHandler.post(new m(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/cn/jzvd/JZMediaSystem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */