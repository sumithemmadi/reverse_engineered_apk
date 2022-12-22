package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.h0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {
  public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
  
  void a();
  
  boolean c();
  
  ByteBuffer d();
  
  void e(ByteBuffer paramByteBuffer);
  
  a f(a parama);
  
  void flush();
  
  void g();
  
  boolean o();
  
  public static final class UnhandledAudioFormatException extends Exception {
    public UnhandledAudioFormatException(AudioProcessor.a param1a) {
      super(stringBuilder.toString());
    }
  }
  
  public static final class a {
    public static final a a = new a(-1, -1, -1);
    
    public final int b;
    
    public final int c;
    
    public final int d;
    
    public final int e;
    
    public a(int param1Int1, int param1Int2, int param1Int3) {
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      if (h0.U(param1Int3)) {
        param1Int1 = h0.I(param1Int3, param1Int2);
      } else {
        param1Int1 = -1;
      } 
      this.e = param1Int1;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("AudioFormat[sampleRate=");
      stringBuilder.append(this.b);
      stringBuilder.append(", channelCount=");
      stringBuilder.append(this.c);
      stringBuilder.append(", encoding=");
      stringBuilder.append(this.d);
      stringBuilder.append(']');
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/AudioProcessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */