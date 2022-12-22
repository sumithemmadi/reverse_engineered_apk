package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.e;
import java.io.IOException;

public final class ExoPlaybackException extends Exception {
  private final Throwable cause;
  
  public final Format rendererFormat;
  
  public final int rendererFormatSupport;
  
  public final int rendererIndex;
  
  public final long timestampMs;
  
  public final int type;
  
  private ExoPlaybackException(int paramInt, String paramString) {
    super(paramString);
    this.type = paramInt;
    this.rendererIndex = -1;
    this.rendererFormat = null;
    this.rendererFormatSupport = 0;
    this.cause = null;
    this.timestampMs = SystemClock.elapsedRealtime();
  }
  
  private ExoPlaybackException(int paramInt, Throwable paramThrowable) {
    this(paramInt, paramThrowable, -1, null, 4);
  }
  
  private ExoPlaybackException(int paramInt1, Throwable paramThrowable, int paramInt2, Format paramFormat, int paramInt3) {
    super(paramThrowable);
    this.type = paramInt1;
    this.cause = paramThrowable;
    this.rendererIndex = paramInt2;
    this.rendererFormat = paramFormat;
    this.rendererFormatSupport = paramInt3;
    this.timestampMs = SystemClock.elapsedRealtime();
  }
  
  public static ExoPlaybackException createForOutOfMemoryError(OutOfMemoryError paramOutOfMemoryError) {
    return new ExoPlaybackException(4, paramOutOfMemoryError);
  }
  
  public static ExoPlaybackException createForRemote(String paramString) {
    return new ExoPlaybackException(3, paramString);
  }
  
  public static ExoPlaybackException createForRenderer(Exception paramException, int paramInt1, Format paramFormat, int paramInt2) {
    if (paramFormat == null)
      paramInt2 = 4; 
    return new ExoPlaybackException(1, paramException, paramInt1, paramFormat, paramInt2);
  }
  
  public static ExoPlaybackException createForSource(IOException paramIOException) {
    return new ExoPlaybackException(0, paramIOException);
  }
  
  public static ExoPlaybackException createForUnexpected(RuntimeException paramRuntimeException) {
    return new ExoPlaybackException(2, paramRuntimeException);
  }
  
  public OutOfMemoryError getOutOfMemoryError() {
    boolean bool;
    if (this.type == 4) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    return (OutOfMemoryError)e.e(this.cause);
  }
  
  public Exception getRendererException() {
    int i = this.type;
    boolean bool = true;
    if (i != 1)
      bool = false; 
    e.f(bool);
    return (Exception)e.e(this.cause);
  }
  
  public IOException getSourceException() {
    boolean bool;
    if (this.type == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    return (IOException)e.e(this.cause);
  }
  
  public RuntimeException getUnexpectedException() {
    boolean bool;
    if (this.type == 2) {
      bool = true;
    } else {
      bool = false;
    } 
    e.f(bool);
    return (RuntimeException)e.e(this.cause);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ExoPlaybackException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */