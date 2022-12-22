package com.google.android.gms.internal.ads;

final class bg implements Thread.UncaughtExceptionHandler {
  bg(wf paramwf, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler) {}
  
  public final void uncaughtException(Thread paramThread, Throwable paramThrowable) {
    try {
      this.b.e(paramThread, paramThrowable);
      Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
    } finally {
      null = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */