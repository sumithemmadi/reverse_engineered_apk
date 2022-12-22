package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.f;
import java.util.Timer;
import java.util.TimerTask;

final class gv0 extends TimerTask {
  gv0(AlertDialog paramAlertDialog, Timer paramTimer, f paramf) {}
  
  public final void run() {
    this.b.dismiss();
    this.c.cancel();
    f f1 = this.d;
    if (f1 != null)
      f1.T9(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/gv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */