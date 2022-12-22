package cn.jzvd;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.TextureView;

public abstract class u implements TextureView.SurfaceTextureListener {
  public static SurfaceTexture SAVED_SURFACE;
  
  public Handler handler;
  
  public Jzvd jzvd;
  
  public Handler mMediaHandler;
  
  public HandlerThread mMediaHandlerThread;
  
  public u(Jzvd paramJzvd) {
    this.jzvd = paramJzvd;
  }
  
  public abstract long getCurrentPosition();
  
  public abstract long getDuration();
  
  public abstract boolean isPlaying();
  
  public abstract void pause();
  
  public abstract void prepare();
  
  public abstract void release();
  
  public abstract void seekTo(long paramLong);
  
  public abstract void setSpeed(float paramFloat);
  
  public abstract void setSurface(Surface paramSurface);
  
  public abstract void setVolume(float paramFloat1, float paramFloat2);
  
  public abstract void start();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/cn/jzvd/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */