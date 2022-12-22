package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

final class qu1 implements Runnable {
  qu1(tt1 paramtt1, Context paramContext, View paramView, Activity paramActivity) {}
  
  public final void run() {
    try {
      tt1.v().e(this.b, this.c, this.d);
      return;
    } catch (Exception exception) {
      tt1.w().b(2020, -1L, exception);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */