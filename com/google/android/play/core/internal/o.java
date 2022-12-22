package com.google.android.play.core.internal;

import android.util.Log;
import com.google.android.play.core.splitinstall.d;
import java.util.List;

final class o implements Runnable {
  o(p paramp, List paramList, d paramd) {}
  
  public final void run() {
    try {
      boolean bool = p.b(this.d).c(this.b);
      if (bool) {
        p.c(this.d, this.c);
        return;
      } 
      p.d(this.d, this.b, this.c);
      return;
    } catch (Exception exception) {
      Log.e("SplitCompat", "Error checking verified files.", exception);
      this.c.c(-11);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */