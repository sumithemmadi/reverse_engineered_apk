package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.xp1;

public final class e1 extends xp1 {
  public e1(Looper paramLooper) {
    super(paramLooper);
  }
  
  protected final void a(Message paramMessage) {
    try {
      return;
    } finally {
      q.c();
      h1.n(q.g().a(), (Throwable)paramMessage);
    } 
  }
  
  public final void handleMessage(Message paramMessage) {
    try {
      super.handleMessage(paramMessage);
      return;
    } catch (Exception exception) {
      q.g().e(exception, "AdMobHandler.handleMessage");
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/e1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */