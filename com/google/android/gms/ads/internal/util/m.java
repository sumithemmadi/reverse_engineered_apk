package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;

final class m implements Runnable {
  m(n paramn, Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2) {}
  
  public final void run() {
    AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
    builder.setMessage(this.c);
    if (this.d) {
      builder.setTitle("Error");
    } else {
      builder.setTitle("Info");
    } 
    if (this.e) {
      builder.setNeutralButton("Dismiss", null);
    } else {
      builder.setPositiveButton("Learn More", new p(this));
      builder.setNegativeButton("Dismiss", null);
    } 
    builder.create().show();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */