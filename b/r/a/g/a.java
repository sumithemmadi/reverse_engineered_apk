package b.r.a.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteQuery;
import android.util.Pair;
import b.r.a.b;
import b.r.a.e;
import b.r.a.f;
import java.util.List;

class a implements b {
  private static final String[] b = new String[] { "", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE " };
  
  private static final String[] c = new String[0];
  
  private final SQLiteDatabase d;
  
  a(SQLiteDatabase paramSQLiteDatabase) {
    this.d = paramSQLiteDatabase;
  }
  
  public void J() {
    this.d.setTransactionSuccessful();
  }
  
  public Cursor R(String paramString) {
    return X((e)new b.r.a.a(paramString));
  }
  
  public void T() {
    this.d.endTransaction();
  }
  
  public Cursor X(e parame) {
    return this.d.rawQueryWithFactory(new a(this, parame), parame.b(), c, null);
  }
  
  public void a() {
    this.d.beginTransaction();
  }
  
  boolean b(SQLiteDatabase paramSQLiteDatabase) {
    boolean bool;
    if (this.d == paramSQLiteDatabase) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public boolean b0() {
    return this.d.inTransaction();
  }
  
  public void close() {
    this.d.close();
  }
  
  public String getPath() {
    return this.d.getPath();
  }
  
  public boolean isOpen() {
    return this.d.isOpen();
  }
  
  public List<Pair<String, String>> k() {
    return this.d.getAttachedDbs();
  }
  
  public void m(String paramString) {
    this.d.execSQL(paramString);
  }
  
  public f s(String paramString) {
    return new e(this.d.compileStatement(paramString));
  }
  
  class a implements SQLiteDatabase.CursorFactory {
    a(a this$0, e param1e) {}
    
    public Cursor newCursor(SQLiteDatabase param1SQLiteDatabase, SQLiteCursorDriver param1SQLiteCursorDriver, String param1String, SQLiteQuery param1SQLiteQuery) {
      this.a.c(new d((SQLiteProgram)param1SQLiteQuery));
      return (Cursor)new SQLiteCursor(param1SQLiteCursorDriver, param1String, param1SQLiteQuery);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/r/a/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */