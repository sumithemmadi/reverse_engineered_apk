package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.k;
import androidx.room.l;
import b.r.a.e;

public final class f implements e {
  private final RoomDatabase a;
  
  private final androidx.room.b b;
  
  private final l c;
  
  public f(RoomDatabase paramRoomDatabase) {
    this.a = paramRoomDatabase;
    this.b = new a(this, paramRoomDatabase);
    this.c = new b(this, paramRoomDatabase);
  }
  
  public void a(d paramd) {
    this.a.b();
    this.a.c();
    try {
      this.b.h(paramd);
      this.a.q();
      return;
    } finally {
      this.a.g();
    } 
  }
  
  public d b(String paramString) {
    k k = k.d("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
    if (paramString == null) {
      k.Y(1);
    } else {
      k.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = androidx.room.o.b.b(this.a, (e)k, false);
    try {
      int i = androidx.room.o.a.b(cursor, "work_spec_id");
      int j = androidx.room.o.a.b(cursor, "system_id");
      if (cursor.moveToFirst()) {
        d d = new d(cursor.getString(i), cursor.getInt(j));
      } else {
        paramString = null;
      } 
      return (d)paramString;
    } finally {
      cursor.close();
      k.h();
    } 
  }
  
  public void c(String paramString) {
    this.a.b();
    b.r.a.f f1 = this.c.a();
    if (paramString == null) {
      f1.Y(1);
    } else {
      f1.n(1, paramString);
    } 
    this.a.c();
    try {
      f1.r();
      this.a.q();
      return;
    } finally {
      this.a.g();
      this.c.f(f1);
    } 
  }
  
  class a extends androidx.room.b<d> {
    a(f this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
    }
    
    public void i(b.r.a.f param1f, d param1d) {
      String str = param1d.a;
      if (str == null) {
        param1f.Y(1);
      } else {
        param1f.n(1, str);
      } 
      param1f.I(2, param1d.b);
    }
  }
  
  class b extends l {
    b(f this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */