package androidx.room;

import android.content.Context;
import b.r.a.c;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class a {
  public final c.c a;
  
  public final Context b;
  
  public final String c;
  
  public final RoomDatabase.c d;
  
  public final List<RoomDatabase.b> e;
  
  public final boolean f;
  
  public final RoomDatabase.JournalMode g;
  
  public final Executor h;
  
  public final Executor i;
  
  public final boolean j;
  
  public final boolean k;
  
  public final boolean l;
  
  private final Set<Integer> m;
  
  public a(Context paramContext, String paramString, c.c paramc, RoomDatabase.c paramc1, List<RoomDatabase.b> paramList, boolean paramBoolean1, RoomDatabase.JournalMode paramJournalMode, Executor paramExecutor1, Executor paramExecutor2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, Set<Integer> paramSet) {
    this.a = paramc;
    this.b = paramContext;
    this.c = paramString;
    this.d = paramc1;
    this.e = paramList;
    this.f = paramBoolean1;
    this.g = paramJournalMode;
    this.h = paramExecutor1;
    this.i = paramExecutor2;
    this.j = paramBoolean2;
    this.k = paramBoolean3;
    this.l = paramBoolean4;
    this.m = paramSet;
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    boolean bool = true;
    if (paramInt1 > paramInt2) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    if (paramInt2 != 0 && this.l)
      return false; 
    if (this.k) {
      Set<Integer> set = this.m;
      boolean bool1 = bool;
      if (set != null) {
        if (!set.contains(Integer.valueOf(paramInt1)))
          return bool; 
      } else {
        return bool1;
      } 
    } 
    return false;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/room/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */