package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

final class yu0 implements et1<SQLiteDatabase> {
  yu0(pu0 parampu0, kl1 paramkl1) {}
  
  public final void a(Throwable paramThrowable) {
    String str = String.valueOf(paramThrowable.getMessage());
    if (str.length() != 0) {
      str = "Failed to get offline buffered ping database: ".concat(str);
    } else {
      str = new String("Failed to get offline buffered ping database: ");
    } 
    cm.g(str);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/yu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */