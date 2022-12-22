package androidx.room;

import b.r.a.f;

public abstract class b<T> extends l {
  public b(RoomDatabase paramRoomDatabase) {
    super(paramRoomDatabase);
  }
  
  protected abstract void g(f paramf, T paramT);
  
  public final void h(T paramT) {
    f f = a();
    try {
      g(f, paramT);
      f.n0();
      return;
    } finally {
      f(f);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */