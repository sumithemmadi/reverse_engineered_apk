package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Iterator;

public final class lp {
  private long a;
  
  public final long a(ByteBuffer paramByteBuffer) {
    long l = this.a;
    if (l > 0L)
      return l; 
    try {
      ByteBuffer byteBuffer = paramByteBuffer.duplicate();
      byteBuffer.flip();
      mp mp = new mp();
      this(byteBuffer);
      y20 y20 = new y20();
      this(mp, np.c);
      Iterator<a50> iterator = y20.g().iterator();
      while (true) {
        a50 a50;
        boolean bool = iterator.hasNext();
        y20 = null;
        if (bool) {
          a50 = iterator.next();
          if (a50 instanceof c70) {
            a50 = a50;
          } else {
            continue;
          } 
        } else {
          mp = null;
        } 
        iterator = mp.g().iterator();
        while (true) {
          y20 y201 = y20;
          if (iterator.hasNext()) {
            a50 = iterator.next();
            if (a50 instanceof b60) {
              a50 = a50;
              break;
            } 
            continue;
          } 
          break;
        } 
        l = a50.h() * 1000L / a50.i();
        this.a = l;
        return l;
      } 
    } catch (RuntimeException|java.io.IOException runtimeException) {
      return 0L;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/lp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */