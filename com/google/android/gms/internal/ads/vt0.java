package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class vt0 implements et1<SQLiteDatabase> {
  vt0(tt0 paramtt0, kl1 paramkl1) {}
  
  public final void a(Throwable paramThrowable) {
    String str = String.valueOf(paramThrowable.getMessage());
    if (str.length() != 0) {
      str = "Failed to get offline signal database: ".concat(str);
    } else {
      str = new String("Failed to get offline signal database: ");
    } 
    cm.g(str);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */