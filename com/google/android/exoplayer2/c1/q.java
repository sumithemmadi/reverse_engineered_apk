package com.google.android.exoplayer2.c1;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.b;
import com.google.android.exoplayer2.util.v;
import java.io.EOFException;

public final class q {
  private final v a = new v(10);
  
  public Metadata a(i parami, b.a parama) {
    Metadata metadata;
    byte[] arrayOfByte = null;
    int j = 0;
    try {
      while (true) {
        parami.k(this.a.a, 0, 10);
        this.a.M(0);
        if (this.a.C() != 4801587)
          break; 
        this.a.N(3);
        int k = this.a.y();
        int m = k + 10;
        if (arrayOfByte == null) {
          arrayOfByte = new byte[m];
          System.arraycopy(this.a.a, 0, arrayOfByte, 0, 10);
          parami.k(arrayOfByte, 10, k);
          metadata = (new b(parama)).c(arrayOfByte, m);
        } else {
          parami.e(k);
        } 
        j += m;
      } 
    } catch (EOFException eOFException) {}
    parami.h();
    parami.e(j);
    return metadata;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/c1/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */