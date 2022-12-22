package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

final class u extends p {
  public void e(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    int j = paramByteBuffer.limit();
    int k = j - i;
    int m = this.b.d;
    int n = k;
    if (m != 3) {
      n = k;
      if (m != 268435456)
        if (m != 536870912) {
          if (m == 805306368) {
            n = k / 2;
          } else {
            throw new IllegalStateException();
          } 
        } else {
          n = k / 3;
          n *= 2;
        }  
      ByteBuffer byteBuffer = l(n);
      k = this.b.d;
      n = i;
      if (k != 3) {
        n = i;
        if (k != 268435456) {
          n = i;
          if (k != 536870912) {
            if (k == 805306368) {
              while (i < j) {
                byteBuffer.put(paramByteBuffer.get(i + 2));
                byteBuffer.put(paramByteBuffer.get(i + 3));
                i += 4;
              } 
            } else {
              throw new IllegalStateException();
            } 
          } else {
            while (n < j) {
              byteBuffer.put(paramByteBuffer.get(n + 1));
              byteBuffer.put(paramByteBuffer.get(n + 2));
              n += 3;
            } 
          } 
        } else {
          while (n < j) {
            byteBuffer.put(paramByteBuffer.get(n + 1));
            byteBuffer.put(paramByteBuffer.get(n));
            n += 2;
          } 
        } 
      } else {
        while (n < j) {
          byteBuffer.put((byte)0);
          byteBuffer.put((byte)((paramByteBuffer.get(n) & 0xFF) - 128));
          n++;
        } 
      } 
      paramByteBuffer.position(paramByteBuffer.limit());
      byteBuffer.flip();
      return;
    } 
    n *= 2;
  }
  
  public AudioProcessor.a h(AudioProcessor.a parama) {
    int i = parama.d;
    if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368) {
      if (i != 2) {
        parama = new AudioProcessor.a(parama.b, parama.c, 2);
      } else {
        parama = AudioProcessor.a.a;
      } 
      return parama;
    } 
    throw new AudioProcessor.UnhandledAudioFormatException(parama);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/audio/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */