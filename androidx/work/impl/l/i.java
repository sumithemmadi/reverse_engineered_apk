package androidx.work.impl.l;

import androidx.room.RoomDatabase;
import androidx.room.b;
import b.r.a.f;

public final class i implements h {
  private final RoomDatabase a;
  
  private final b b;
  
  public i(RoomDatabase paramRoomDatabase) {
    this.a = paramRoomDatabase;
    this.b = new a(this, paramRoomDatabase);
  }
  
  public void a(g paramg) {
    this.a.b();
    this.a.c();
    try {
      this.b.h(paramg);
      this.a.q();
      return;
    } finally {
      this.a.g();
    } 
  }
  
  class a extends b<g> {
    a(i this$0, RoomDatabase param1RoomDatabase) {
      super(param1RoomDatabase);
    }
    
    public String d() {
      return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
    }
    
    public void i(f param1f, g param1g) {
      String str2 = param1g.a;
      if (str2 == null) {
        param1f.Y(1);
      } else {
        param1f.n(1, str2);
      } 
      String str1 = param1g.b;
      if (str1 == null) {
        param1f.Y(2);
      } else {
        param1f.n(2, str1);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/l/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */