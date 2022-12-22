package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public final class rt0 extends SQLiteOpenHelper {
  public rt0(Context paramContext) {
    super(paramContext, "OfflineUpload.db", null, 1);
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    paramSQLiteDatabase.execSQL("CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)");
    paramSQLiteDatabase.execSQL("CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, value INTEGER)");
    ContentValues contentValues1 = new ContentValues();
    contentValues1.put("statistic_name", "failed_requests");
    Integer integer = Integer.valueOf(0);
    contentValues1.put("value", integer);
    paramSQLiteDatabase.insert("offline_signal_statistics", null, contentValues1);
    contentValues1 = new ContentValues();
    contentValues1.put("statistic_name", "total_requests");
    contentValues1.put("value", integer);
    paramSQLiteDatabase.insert("offline_signal_statistics", null, contentValues1);
    ContentValues contentValues2 = new ContentValues();
    contentValues2.put("statistic_name", "last_successful_request_time");
    contentValues2.put("value", Long.valueOf(0L));
    paramSQLiteDatabase.insert("offline_signal_statistics", null, contentValues2);
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_contents");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_signal_statistics");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */