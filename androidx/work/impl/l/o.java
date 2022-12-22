package androidx.work.impl.l;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.b;
import androidx.room.k;
import androidx.room.o.b;
import b.r.a.e;
import b.r.a.f;
import java.util.ArrayList;
import java.util.List;

public final class o implements n {
  private final RoomDatabase a;
  
  private final b b;
  
  public o(RoomDatabase paramRoomDatabase) {
    this.a = paramRoomDatabase;
    this.b = new a(this, paramRoomDatabase);
  }
  
  public void a(m paramm) {
    this.a.b();
    this.a.c();
    try {
      this.b.h(paramm);
      this.a.q();
      return;
    } finally {
      this.a.g();
    } 
  }
  
  public List<String> b(String paramString) {
    k k = k.d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
    if (paramString == null) {
      k.Y(1);
    } else {
      k.n(1, paramString);
    } 
    this.a.b();
    Cursor cursor = b.b(this.a, (e)k, false);
    try {
      ArrayList<String> arrayList = new ArrayList();
      this(cursor.getCount());
      while (cursor.moveToNext())
        arrayList.add(cursor.getString(0)); 
      return arrayList;
    } finally {
      cursor.close();
      k.h();
    } 
  }
  
  class a extends b<m> {
    a(o this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
    }
    
    public void i(f param1f, m param1m) {
      String str2 = param1m.a;
      if (str2 == null) {
        param1f.Y(1);
      } else {
        param1f.n(1, str2);
      } 
      String str1 = param1m.b;
      if (str1 == null) {
        param1f.Y(2);
      } else {
        param1f.n(2, str1);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */