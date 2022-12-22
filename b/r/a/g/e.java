package b.r.a.g;

import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;
import b.r.a.f;

class e extends d implements f {
  private final SQLiteStatement c;
  
  e(SQLiteStatement paramSQLiteStatement) {
    super((SQLiteProgram)paramSQLiteStatement);
    this.c = paramSQLiteStatement;
  }
  
  public long n0() {
    return this.c.executeInsert();
  }
  
  public int r() {
    return this.c.executeUpdateDelete();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/r/a/g/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */