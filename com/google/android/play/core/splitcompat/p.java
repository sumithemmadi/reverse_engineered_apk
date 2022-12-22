package com.google.android.play.core.splitcompat;

import android.util.Log;
import java.util.Set;

final class p implements Runnable {
  p(a parama, Set paramSet) {}
  
  public final void run() {
    try {
      for (String str : this.b)
        a.c(this.c).n(str); 
      return;
    } catch (Exception exception) {
      Log.e("SplitCompat", "Failed to remove from splitcompat storage split that is already installed", exception);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */