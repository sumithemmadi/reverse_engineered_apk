package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.l0;
import java.nio.ByteBuffer;

public interface AudioSink {
  l0 W();
  
  void a();
  
  void c1();
  
  void d1(l0 paraml0);
  
  boolean e1(int paramInt1, int paramInt2);
  
  void f1(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint, int paramInt5, int paramInt6);
  
  void flush();
  
  void g1();
  
  boolean h1();
  
  long i1(boolean paramBoolean);
  
  void j1();
  
  void k1(i parami);
  
  void l1();
  
  void m1(float paramFloat);
  
  boolean n1(ByteBuffer paramByteBuffer, long paramLong);
  
  boolean o();
  
  void o1(int paramInt);
  
  void p1(a parama);
  
  void pause();
  
  void q1(o paramo);
  
  public static final class ConfigurationException extends Exception {
    public ConfigurationException(String param1String) {
      super(param1String);
    }
    
    public ConfigurationException(Throwable param1Throwable) {
      super(param1Throwable);
    }
  }
  
  public static final class InitializationException extends Exception {
    public final int audioTrackState;
    
    public InitializationException(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      super(stringBuilder.toString());
      this.audioTrackState = param1Int1;
    }
  }
  
  public static final class WriteException extends Exception {
    public final int errorCode;
    
    public WriteException(int param1Int) {
      super(stringBuilder.toString());
      this.errorCode = param1Int;
    }
  }
  
  public static interface a {
    void a(int param1Int);
    
    void b(int param1Int, long param1Long1, long param1Long2);
    
    void c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/AudioSink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */