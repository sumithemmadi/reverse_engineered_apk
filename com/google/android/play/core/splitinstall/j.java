package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

public final class j {
  private static final AtomicReference<i> a = new AtomicReference<i>(null);
  
  public static void a(i parami) {
    a.compareAndSet(null, parami);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitinstall/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */