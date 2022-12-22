package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

public final class cu1 {
  public static <V> V a(Future<V> paramFuture) {
    boolean bool = false;
    while (true) {
      try {
        return paramFuture.get();
      } catch (InterruptedException interruptedException) {
      
      } finally {
        if (bool)
          Thread.currentThread().interrupt(); 
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */