package com.danikula.videocache.s;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.danikula.videocache.k;
import com.danikula.videocache.o;

class a extends SQLiteOpenHelper implements c {
  private static final String[] b = new String[] { "_id", "url", "length", "mime" };
  
  a(Context paramContext) {
    super(paramContext, "AndroidVideoCache.db", null, 1);
    k.d(paramContext);
  }
  
  private ContentValues c(o paramo) {
    ContentValues contentValues = new ContentValues();
    contentValues.put("url", paramo.a);
    contentValues.put("length", Long.valueOf(paramo.b));
    contentValues.put("mime", paramo.c);
    return contentValues;
  }
  
  private o d(Cursor paramCursor) {
    return new o(paramCursor.getString(paramCursor.getColumnIndexOrThrow("url")), paramCursor.getLong(paramCursor.getColumnIndexOrThrow("length")), paramCursor.getString(paramCursor.getColumnIndexOrThrow("mime")));
  }
  
  public void b(String paramString, o paramo) {
    boolean bool;
    k.a(new Object[] { paramString, paramo });
    if (get(paramString) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    ContentValues contentValues = c(paramo);
    if (bool) {
      getWritableDatabase().update("SourceInfo", contentValues, "url=?", new String[] { paramString });
    } else {
      getWritableDatabase().insert("SourceInfo", null, contentValues);
    } 
  }
  
  public o get(String paramString) {
    k.d(paramString);
    null = null;
    try {
      Cursor cursor1;
      Cursor cursor2 = getReadableDatabase().query("SourceInfo", b, "url=?", new String[] { paramString }, null, null, null);
      paramString = null;
      return (o)cursor1;
    } finally {
      paramString = null;
      if (paramString != null)
        paramString.close(); 
    } 
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    k.d(paramSQLiteDatabase);
    paramSQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    throw new IllegalStateException("Should not be called. There is no any migration");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */