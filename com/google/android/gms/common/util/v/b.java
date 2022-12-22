package com.google.android.gms.common.util.v;

import android.os.Process;

final class b implements Runnable {
  private final Runnable b;
  
  private final int c;
  
  public b(Runnable paramRunnable, int paramInt) {
    this.b = paramRunnable;
    this.c = paramInt;
  }
  
  public final void run() {
    Process.setThreadPriority(this.c);
    this.b.run();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/v/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */