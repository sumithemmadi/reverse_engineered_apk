package b.r.a.g;

import android.database.sqlite.SQLiteProgram;
import b.r.a.d;

class d implements d {
  private final SQLiteProgram b;
  
  d(SQLiteProgram paramSQLiteProgram) {
    this.b = paramSQLiteProgram;
  }
  
  public void I(int paramInt, long paramLong) {
    this.b.bindLong(paramInt, paramLong);
  }
  
  public void O(int paramInt, byte[] paramArrayOfbyte) {
    this.b.bindBlob(paramInt, paramArrayOfbyte);
  }
  
  public void Y(int paramInt) {
    this.b.bindNull(paramInt);
  }
  
  public void close() {
    this.b.close();
  }
  
  public void n(int paramInt, String paramString) {
    this.b.bindString(paramInt, paramString);
  }
  
  public void w(int paramInt, double paramDouble) {
    this.b.bindDouble(paramInt, paramDouble);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/r/a/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */