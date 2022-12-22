package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.nio.ByteBuffer;

final class s extends p {
  private static final int i = Float.floatToIntBits(Float.NaN);
  
  private static void m(int paramInt, ByteBuffer paramByteBuffer) {
    double d = paramInt;
    Double.isNaN(d);
    int i = Float.floatToIntBits((float)(d * 4.656612875245797E-10D));
    paramInt = i;
    if (i == i)
      paramInt = Float.floatToIntBits(0.0F); 
    paramByteBuffer.putInt(paramInt);
  }
  
  public void e(ByteBuffer paramByteBuffer) {
    boolean bool;
    e.f(h0.T(this.b.d));
    if (this.b.d == 805306368) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    if (!bool)
      k = k / 3 * 4; 
    ByteBuffer byteBuffer = l(k);
    k = i;
    if (bool) {
      while (i < j) {
        m(paramByteBuffer.get(i) & 0xFF | (paramByteBuffer.get(i + 1) & 0xFF) << 8 | (paramByteBuffer.get(i + 2) & 0xFF) << 16 | (paramByteBuffer.get(i + 3) & 0xFF) << 24, byteBuffer);
        i += 4;
      } 
    } else {
      while (k < j) {
        m((paramByteBuffer.get(k) & 0xFF) << 8 | (paramByteBuffer.get(k + 1) & 0xFF) << 16 | (paramByteBuffer.get(k + 2) & 0xFF) << 24, byteBuffer);
        k += 3;
      } 
    } 
    paramByteBuffer.position(paramByteBuffer.limit());
    byteBuffer.flip();
  }
  
  public AudioProcessor.a h(AudioProcessor.a parama) {
    if (h0.T(parama.d)) {
      if (h0.T(parama.d)) {
        parama = new AudioProcessor.a(parama.b, parama.c, 4);
      } else {
        parama = AudioProcessor.a.a;
      } 
      return parama;
    } 
    throw new AudioProcessor.UnhandledAudioFormatException(parama);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */