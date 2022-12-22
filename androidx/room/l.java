package androidx.room;

import b.r.a.f;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class l {
  private final AtomicBoolean a = new AtomicBoolean(false);
  
  private final RoomDatabase b;
  
  private volatile f c;
  
  public l(RoomDatabase paramRoomDatabase) {
    this.b = paramRoomDatabase;
  }
  
  private f c() {
    String str = d();
    return this.b.d(str);
  }
  
  private f e(boolean paramBoolean) {
    f f1;
    if (paramBoolean) {
      if (this.c == null)
        this.c = c(); 
      f1 = this.c;
    } else {
      f1 = c();
    } 
    return f1;
  }
  
  public f a() {
    b();
    return e(this.a.compareAndSet(false, true));
  }
  
  protected void b() {
    this.b.a();
  }
  
  protected abstract String d();
  
  public void f(f paramf) {
    if (paramf == this.c)
      this.a.set(false); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */