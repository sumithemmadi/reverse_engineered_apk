package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.e;
import java.nio.ByteBuffer;

final class q extends p {
  private int[] i;
  
  private int[] j;
  
  public void e(ByteBuffer paramByteBuffer) {
    int[] arrayOfInt = (int[])e.e(this.j);
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    ByteBuffer byteBuffer = l((j - i) / this.b.e * this.c.e);
    while (i < j) {
      int k = arrayOfInt.length;
      for (byte b = 0; b < k; b++)
        byteBuffer.putShort(paramByteBuffer.getShort(arrayOfInt[b] * 2 + i)); 
      i += this.b.e;
    } 
    paramByteBuffer.position(j);
    byteBuffer.flip();
  }
  
  public AudioProcessor.a h(AudioProcessor.a parama) {
    int[] arrayOfInt = this.i;
    if (arrayOfInt == null)
      return AudioProcessor.a.a; 
    if (parama.d == 2) {
      int i;
      if (parama.c != arrayOfInt.length) {
        i = 1;
      } else {
        i = 0;
      } 
      byte b = 0;
      while (b < arrayOfInt.length) {
        int j = arrayOfInt[b];
        if (j < parama.c) {
          if (j != b) {
            j = 1;
          } else {
            j = 0;
          } 
          i |= j;
          b++;
          continue;
        } 
        throw new AudioProcessor.UnhandledAudioFormatException(parama);
      } 
      if (i != 0) {
        parama = new AudioProcessor.a(parama.b, arrayOfInt.length, 2);
      } else {
        parama = AudioProcessor.a.a;
      } 
      return parama;
    } 
    AudioProcessor.UnhandledAudioFormatException unhandledAudioFormatException = new AudioProcessor.UnhandledAudioFormatException(parama);
    throw unhandledAudioFormatException;
  }
  
  protected void i() {
    this.j = this.i;
  }
  
  protected void k() {
    this.j = null;
    this.i = null;
  }
  
  public void m(int[] paramArrayOfint) {
    this.i = paramArrayOfint;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */