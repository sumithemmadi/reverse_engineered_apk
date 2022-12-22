package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class VideoDecoderGLSurfaceView extends GLSurfaceView {
  private final l b;
  
  public VideoDecoderGLSurfaceView(Context paramContext) {
    this(paramContext, null);
  }
  
  public VideoDecoderGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    l l1 = new l(this);
    this.b = l1;
    setPreserveEGLContextOnPause(true);
    setEGLContextClientVersion(2);
    setRenderer(l1);
    setRenderMode(0);
  }
  
  public k getVideoDecoderOutputBufferRenderer() {
    return this.b;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/VideoDecoderGLSurfaceView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */