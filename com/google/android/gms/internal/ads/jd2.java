package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

final class jd2 extends Thread {
  jd2(kd2 paramkd2, AudioTrack paramAudioTrack) {}
  
  public final void run() {
    try {
      this.b.flush();
      this.b.release();
      return;
    } finally {
      kd2.h(this.c).open();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */