package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

public final class ku0 {
  public static int a(SQLiteDatabase paramSQLiteDatabase, int paramInt) {
    boolean bool = false;
    if (paramInt == 2)
      return 0; 
    Cursor cursor = d(paramSQLiteDatabase, paramInt);
    paramInt = bool;
    if (cursor.getCount() > 0) {
      cursor.moveToNext();
      paramInt = 0 + cursor.getInt(cursor.getColumnIndexOrThrow("value"));
    } 
    cursor.close();
    return paramInt;
  }
  
  public static long b(SQLiteDatabase paramSQLiteDatabase, int paramInt) {
    Cursor cursor = d(paramSQLiteDatabase, 2);
    paramInt = cursor.getCount();
    long l = 0L;
    if (paramInt > 0) {
      cursor.moveToNext();
      l = 0L + cursor.getLong(cursor.getColumnIndexOrThrow("value"));
    } 
    cursor.close();
    return l;
  }
  
  public static ArrayList<zzug$zzo.a> c(SQLiteDatabase paramSQLiteDatabase) {
    ArrayList<zzug$zzo.a> arrayList = new ArrayList();
    Cursor cursor = paramSQLiteDatabase.query("offline_signal_contents", new String[] { "serialized_proto_data" }, null, null, null, null, null);
    while (cursor.moveToNext()) {
      byte[] arrayOfByte = cursor.getBlob(cursor.getColumnIndexOrThrow("serialized_proto_data"));
      try {
        arrayList.add(zzug$zzo.a.i0(arrayOfByte));
      } catch (zzelo zzelo) {
        cm.g("Unable to deserialize proto from offline signals database:");
        cm.g(zzelo.getMessage());
      } 
    } 
    cursor.close();
    return arrayList;
  }
  
  private static Cursor d(SQLiteDatabase paramSQLiteDatabase, int paramInt) {
    String[] arrayOfString = new String[1];
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2)
          arrayOfString[0] = "last_successful_request_time"; 
      } else {
        arrayOfString[0] = "total_requests";
      } 
    } else {
      arrayOfString[0] = "failed_requests";
    } 
    return paramSQLiteDatabase.query("offline_signal_statistics", new String[] { "value" }, "statistic_name = ?", arrayOfString, null, null, null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ku0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */