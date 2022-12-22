package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.d1;
import java.util.ArrayList;

public final class ju0 {
  private xn2 a;
  
  private Context b;
  
  private tt0 c;
  
  private zzazn d;
  
  private final String e;
  
  private final pm1 f;
  
  private final d1 g;
  
  public ju0(Context paramContext, zzazn paramzzazn, xn2 paramxn2, tt0 paramtt0, String paramString, pm1 parampm1) {
    this.b = paramContext;
    this.d = paramzzazn;
    this.a = paramxn2;
    this.c = paramtt0;
    this.e = paramString;
    this.f = parampm1;
    this.g = q.g().r();
  }
  
  private static void b(SQLiteDatabase paramSQLiteDatabase, ArrayList<zzug$zzo.a> paramArrayList) {
    int i = paramArrayList.size();
    int j = 0;
    long l = 0L;
    while (j < i) {
      zzug$zzo.a a = (zzug$zzo.a)paramArrayList.get(j);
      int k = j + 1;
      a = a;
      j = k;
      if (a.j0() == zzuq.c) {
        j = k;
        if (a.J() > l) {
          l = a.J();
          j = k;
        } 
      } 
    } 
    if (l != 0L) {
      ContentValues contentValues = new ContentValues();
      contentValues.put("value", Long.valueOf(l));
      paramSQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
    } 
  }
  
  public final void c() {
    try {
      tt0 tt01 = this.c;
      mu0 mu0 = new mu0();
      this(this);
      tt01.a(mu0);
      return;
    } catch (Exception exception) {
      String str = String.valueOf(exception.getMessage());
      if (str.length() != 0) {
        str = "Error in offline signals database startup: ".concat(str);
      } else {
        str = new String("Error in offline signals database startup: ");
      } 
      cm.g(str);
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ju0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */