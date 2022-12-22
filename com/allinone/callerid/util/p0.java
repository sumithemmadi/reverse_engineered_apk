package com.allinone.callerid.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class p0 extends SQLiteOpenHelper {
  public p0(Context paramContext) {
    super(paramContext, "offlinedata.sqlite", null, 1);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase) {}
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */