package b.r.a.g;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import b.r.a.c;

class b implements c {
  private final a a;
  
  b(Context paramContext, String paramString, c.a parama) {
    this.a = c(paramContext, paramString, parama);
  }
  
  private a c(Context paramContext, String paramString, c.a parama) {
    return new a(paramContext, paramString, new a[1], parama);
  }
  
  public void a(boolean paramBoolean) {
    this.a.setWriteAheadLoggingEnabled(paramBoolean);
  }
  
  public b.r.a.b b() {
    return this.a.d();
  }
  
  static class a extends SQLiteOpenHelper {
    final a[] b;
    
    final c.a c;
    
    private boolean d;
    
    a(Context param1Context, String param1String, a[] param1ArrayOfa, c.a param1a) {
      super(param1Context, param1String, null, param1a.a, new a(param1a, param1ArrayOfa));
      this.c = param1a;
      this.b = param1ArrayOfa;
    }
    
    static a c(a[] param1ArrayOfa, SQLiteDatabase param1SQLiteDatabase) {
      a a1 = param1ArrayOfa[0];
      if (a1 == null || !a1.b(param1SQLiteDatabase))
        param1ArrayOfa[0] = new a(param1SQLiteDatabase); 
      return param1ArrayOfa[0];
    }
    
    a b(SQLiteDatabase param1SQLiteDatabase) {
      return c(this.b, param1SQLiteDatabase);
    }
    
    public void close() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: invokespecial close : ()V
      //   6: aload_0
      //   7: getfield b : [Lb/r/a/g/a;
      //   10: iconst_0
      //   11: aconst_null
      //   12: aastore
      //   13: aload_0
      //   14: monitorexit
      //   15: return
      //   16: astore_1
      //   17: aload_0
      //   18: monitorexit
      //   19: aload_1
      //   20: athrow
      // Exception table:
      //   from	to	target	type
      //   2	13	16	finally
    }
    
    b.r.a.b d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: iconst_0
      //   4: putfield d : Z
      //   7: aload_0
      //   8: invokespecial getWritableDatabase : ()Landroid/database/sqlite/SQLiteDatabase;
      //   11: astore_1
      //   12: aload_0
      //   13: getfield d : Z
      //   16: ifeq -> 32
      //   19: aload_0
      //   20: invokevirtual close : ()V
      //   23: aload_0
      //   24: invokevirtual d : ()Lb/r/a/b;
      //   27: astore_1
      //   28: aload_0
      //   29: monitorexit
      //   30: aload_1
      //   31: areturn
      //   32: aload_0
      //   33: aload_1
      //   34: invokevirtual b : (Landroid/database/sqlite/SQLiteDatabase;)Lb/r/a/g/a;
      //   37: astore_1
      //   38: aload_0
      //   39: monitorexit
      //   40: aload_1
      //   41: areturn
      //   42: astore_1
      //   43: aload_0
      //   44: monitorexit
      //   45: aload_1
      //   46: athrow
      // Exception table:
      //   from	to	target	type
      //   2	28	42	finally
      //   32	38	42	finally
    }
    
    public void onConfigure(SQLiteDatabase param1SQLiteDatabase) {
      this.c.b(b(param1SQLiteDatabase));
    }
    
    public void onCreate(SQLiteDatabase param1SQLiteDatabase) {
      this.c.d(b(param1SQLiteDatabase));
    }
    
    public void onDowngrade(SQLiteDatabase param1SQLiteDatabase, int param1Int1, int param1Int2) {
      this.d = true;
      this.c.e(b(param1SQLiteDatabase), param1Int1, param1Int2);
    }
    
    public void onOpen(SQLiteDatabase param1SQLiteDatabase) {
      if (!this.d)
        this.c.f(b(param1SQLiteDatabase)); 
    }
    
    public void onUpgrade(SQLiteDatabase param1SQLiteDatabase, int param1Int1, int param1Int2) {
      this.d = true;
      this.c.g(b(param1SQLiteDatabase), param1Int1, param1Int2);
    }
    
    class a implements DatabaseErrorHandler {
      a(b.a this$0, a[] param2ArrayOfa) {}
      
      public void onCorruption(SQLiteDatabase param2SQLiteDatabase) {
        this.a.c(b.a.c(this.b, param2SQLiteDatabase));
      }
    }
  }
  
  class a implements DatabaseErrorHandler {
    a(b this$0, a[] param1ArrayOfa) {}
    
    public void onCorruption(SQLiteDatabase param1SQLiteDatabase) {
      this.a.c(b.a.c(this.b, param1SQLiteDatabase));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/r/a/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */