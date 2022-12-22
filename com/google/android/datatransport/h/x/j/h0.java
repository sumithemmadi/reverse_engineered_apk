package com.google.android.datatransport.h.x.j;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

final class h0 extends SQLiteOpenHelper {
  static int b = 4;
  
  private static final a c;
  
  private static final a d;
  
  private static final a e;
  
  private static final a f;
  
  private static final List<a> g;
  
  private final int h;
  
  private boolean i = false;
  
  static {
    a a1 = d0.b();
    c = a1;
    a a2 = e0.b();
    d = a2;
    a a3 = f0.b();
    e = a3;
    a a4 = g0.b();
    f = a4;
    g = Arrays.asList(new a[] { a1, a2, a3, a4 });
  }
  
  h0(Context paramContext, String paramString, int paramInt) {
    super(paramContext, paramString, null, paramInt);
    this.h = paramInt;
  }
  
  private void b(SQLiteDatabase paramSQLiteDatabase) {
    if (!this.i)
      onConfigure(paramSQLiteDatabase); 
  }
  
  private void h(SQLiteDatabase paramSQLiteDatabase, int paramInt) {
    b(paramSQLiteDatabase);
    j(paramSQLiteDatabase, 0, paramInt);
  }
  
  private void j(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    List<a> list = g;
    if (paramInt2 <= list.size()) {
      while (paramInt1 < paramInt2) {
        ((a)g.get(paramInt1)).a(paramSQLiteDatabase);
        paramInt1++;
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Migration from ");
    stringBuilder.append(paramInt1);
    stringBuilder.append(" to ");
    stringBuilder.append(paramInt2);
    stringBuilder.append(" was requested, but cannot be performed. Only ");
    stringBuilder.append(list.size());
    stringBuilder.append(" migrations are provided");
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public void onConfigure(SQLiteDatabase paramSQLiteDatabase) {
    this.i = true;
    paramSQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
    if (Build.VERSION.SDK_INT >= 16)
      paramSQLiteDatabase.setForeignKeyConstraintsEnabled(true); 
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase) {
    h(paramSQLiteDatabase, this.h);
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    paramSQLiteDatabase.execSQL("DROP TABLE events");
    paramSQLiteDatabase.execSQL("DROP TABLE event_metadata");
    paramSQLiteDatabase.execSQL("DROP TABLE transport_contexts");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
    h(paramSQLiteDatabase, paramInt2);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase) {
    b(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {
    b(paramSQLiteDatabase);
    j(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public static interface a {
    void a(SQLiteDatabase param1SQLiteDatabase);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/j/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */