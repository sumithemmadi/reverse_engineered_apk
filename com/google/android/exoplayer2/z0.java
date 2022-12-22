package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

final class z0 {
  private final PowerManager a;
  
  private PowerManager.WakeLock b;
  
  private boolean c;
  
  private boolean d;
  
  public z0(Context paramContext) {
    this.a = (PowerManager)paramContext.getSystemService("power");
  }
  
  @SuppressLint({"WakelockTimeout"})
  private void b() {
    PowerManager.WakeLock wakeLock = this.b;
    if (wakeLock != null)
      if (this.c) {
        if (this.d && !wakeLock.isHeld()) {
          this.b.acquire();
        } else if (!this.d && this.b.isHeld()) {
          this.b.release();
        } 
      } else if (wakeLock.isHeld()) {
        this.b.release();
      }  
  }
  
  public void a(boolean paramBoolean) {
    this.d = paramBoolean;
    b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */