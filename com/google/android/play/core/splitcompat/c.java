package com.google.android.play.core.splitcompat;

import java.util.concurrent.ThreadFactory;

final class c implements ThreadFactory {
  public final Thread newThread(Runnable paramRunnable) {
    return new Thread(paramRunnable, "SplitCompatBackgroundThread");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */