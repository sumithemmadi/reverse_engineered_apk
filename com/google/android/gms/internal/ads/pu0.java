package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.g0;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.dynamic.b;

public final class pu0 extends SQLiteOpenHelper {
  private final Context b;
  
  private final nt1 c;
  
  public pu0(Context paramContext, nt1 paramnt1) {
    super(paramContext, "AdMobOfflineBufferedPings.db", null, ((Integer)er2.e().<Integer>c(x)).intValue());
    this.b = paramContext;
    this.c = paramnt1;
  }
  
  private static void e(SQLiteDatabase paramSQLiteDatabase, em paramem) {
    paramSQLiteDatabase.beginTransaction();
    boolean bool = false;
    try {
      StringBuilder stringBuilder = new StringBuilder();
      this(25);
      stringBuilder.append("event_state = 1");
      String str = stringBuilder.toString();
      Cursor cursor = paramSQLiteDatabase.query("offline_buffered_pings", new String[] { "url" }, str, null, null, null, "timestamp ASC", null);
      int i = cursor.getCount();
      String[] arrayOfString = new String[i];
      byte b;
      for (b = 0; cursor.moveToNext(); b++) {
        int j = cursor.getColumnIndex("url");
        if (j != -1)
          arrayOfString[b] = cursor.getString(j); 
      } 
      cursor.close();
      paramSQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[] { Integer.toString(1) });
      paramSQLiteDatabase.setTransactionSuccessful();
      paramSQLiteDatabase.endTransaction();
      return;
    } finally {
      paramSQLiteDatabase.endTransaction();
    } 
  }
  
  static void h(SQLiteDatabase paramSQLiteDatabase, String paramString) {
    paramSQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[] { paramString, Integer.toString(0) });
  }
  
  private final void p(kl1<SQLiteDatabase, Void> paramkl1) {
    dt1.g(this.c.a(new su0(this)), new yu0(this, paramkl1), this.c);
  }
  
  final void g(SQLiteDatabase paramSQLiteDatabase, em paramem, String paramString) {
    this.c.execute(new uu0(paramSQLiteDatabase, paramString, paramem));
  }
  
  public final void l(em paramem) {
    p(new ru0(paramem));
  }
  
  public final void o(av0 paramav0) {
    p(new vu0(this, paramav0));
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
  }
  
  public final void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    onUpgrade(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
  }
  
  public final void q(em paramem, String paramString) {
    p(new tu0(this, paramem, paramString));
  }
  
  public final void u(String paramString) {
    p(new wu0(this, paramString));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/pu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */