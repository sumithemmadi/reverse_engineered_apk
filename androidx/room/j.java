package androidx.room;

import android.database.Cursor;
import b.r.a.b;
import b.r.a.c;
import b.r.a.e;

public class j extends c.a {
  private a b;
  
  private final a c;
  
  private final String d;
  
  private final String e;
  
  public j(a parama, a parama1, String paramString1, String paramString2) {
    super(parama1.a);
    this.b = parama;
    this.c = parama1;
    this.d = paramString1;
    this.e = paramString2;
  }
  
  private void h(b paramb) {
    String str;
    boolean bool = j(paramb);
    Cursor cursor = null;
    b b1 = null;
    if (bool) {
      cursor = paramb.X((e)new b.r.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
      paramb = b1;
      try {
        String str1;
        if (cursor.moveToFirst())
          str1 = cursor.getString(0); 
        cursor.close();
      } finally {
        str.close();
      } 
    } 
    if (this.d.equals(str) || this.e.equals(str))
      return; 
    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
  }
  
  private void i(b paramb) {
    paramb.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
  }
  
  private static boolean j(b paramb) {
    Cursor cursor = paramb.R("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
    try {
      boolean bool = cursor.moveToFirst();
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (bool) {
        int i = cursor.getInt(0);
        bool2 = bool1;
        if (i != 0)
          bool2 = true; 
      } 
      return bool2;
    } finally {
      cursor.close();
    } 
  }
  
  private void k(b paramb) {
    i(paramb);
    paramb.m(i.a(this.d));
  }
  
  public void b(b paramb) {
    super.b(paramb);
  }
  
  public void d(b paramb) {
    k(paramb);
    this.c.a(paramb);
    this.c.c(paramb);
  }
  
  public void e(b paramb, int paramInt1, int paramInt2) {
    g(paramb, paramInt1, paramInt2);
  }
  
  public void f(b paramb) {
    super.f(paramb);
    h(paramb);
    this.c.d(paramb);
    this.b = null;
  }
  
  public void g(b paramb, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Landroidx/room/a;
    //   4: astore #4
    //   6: aload #4
    //   8: ifnull -> 99
    //   11: aload #4
    //   13: getfield d : Landroidx/room/RoomDatabase$c;
    //   16: iload_2
    //   17: iload_3
    //   18: invokevirtual c : (II)Ljava/util/List;
    //   21: astore #4
    //   23: aload #4
    //   25: ifnull -> 99
    //   28: aload_0
    //   29: getfield c : Landroidx/room/j$a;
    //   32: aload_1
    //   33: invokevirtual f : (Lb/r/a/b;)V
    //   36: aload #4
    //   38: invokeinterface iterator : ()Ljava/util/Iterator;
    //   43: astore #4
    //   45: aload #4
    //   47: invokeinterface hasNext : ()Z
    //   52: ifeq -> 72
    //   55: aload #4
    //   57: invokeinterface next : ()Ljava/lang/Object;
    //   62: checkcast androidx/room/n/a
    //   65: aload_1
    //   66: invokevirtual a : (Lb/r/a/b;)V
    //   69: goto -> 45
    //   72: aload_0
    //   73: getfield c : Landroidx/room/j$a;
    //   76: aload_1
    //   77: invokevirtual g : (Lb/r/a/b;)V
    //   80: aload_0
    //   81: getfield c : Landroidx/room/j$a;
    //   84: aload_1
    //   85: invokevirtual e : (Lb/r/a/b;)V
    //   88: aload_0
    //   89: aload_1
    //   90: invokespecial k : (Lb/r/a/b;)V
    //   93: iconst_1
    //   94: istore #5
    //   96: goto -> 102
    //   99: iconst_0
    //   100: istore #5
    //   102: iload #5
    //   104: ifne -> 200
    //   107: aload_0
    //   108: getfield b : Landroidx/room/a;
    //   111: astore #4
    //   113: aload #4
    //   115: ifnull -> 147
    //   118: aload #4
    //   120: iload_2
    //   121: iload_3
    //   122: invokevirtual a : (II)Z
    //   125: ifne -> 147
    //   128: aload_0
    //   129: getfield c : Landroidx/room/j$a;
    //   132: aload_1
    //   133: invokevirtual b : (Lb/r/a/b;)V
    //   136: aload_0
    //   137: getfield c : Landroidx/room/j$a;
    //   140: aload_1
    //   141: invokevirtual a : (Lb/r/a/b;)V
    //   144: goto -> 200
    //   147: new java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial <init> : ()V
    //   154: astore_1
    //   155: aload_1
    //   156: ldc 'A migration from '
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload_1
    //   163: iload_2
    //   164: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   167: pop
    //   168: aload_1
    //   169: ldc ' to '
    //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   174: pop
    //   175: aload_1
    //   176: iload_3
    //   177: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   180: pop
    //   181: aload_1
    //   182: ldc ' was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.'
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: new java/lang/IllegalStateException
    //   191: dup
    //   192: aload_1
    //   193: invokevirtual toString : ()Ljava/lang/String;
    //   196: invokespecial <init> : (Ljava/lang/String;)V
    //   199: athrow
    //   200: return
  }
  
  public static abstract class a {
    public final int a;
    
    public a(int param1Int) {
      this.a = param1Int;
    }
    
    protected abstract void a(b param1b);
    
    protected abstract void b(b param1b);
    
    protected abstract void c(b param1b);
    
    protected abstract void d(b param1b);
    
    protected abstract void e(b param1b);
    
    protected abstract void f(b param1b);
    
    protected abstract void g(b param1b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */