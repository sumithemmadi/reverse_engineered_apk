package com.google.android.play.core.splitcompat;

import android.util.Log;

final class o implements Runnable {
  o(a parama) {}
  
  public final void run() {
    try {
      a.c(this.b).a();
      return;
    } catch (Exception exception) {
      Log.e("SplitCompat", "Failed to cleanup splitcompat storage", exception);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */