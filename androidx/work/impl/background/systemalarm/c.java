package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.f;
import androidx.work.impl.k.d;
import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class c {
  private static final String a = f.f("ConstraintsCmdHandler");
  
  private final Context b;
  
  private final int c;
  
  private final e d;
  
  private final d e;
  
  c(Context paramContext, int paramInt, e parame) {
    this.b = paramContext;
    this.c = paramInt;
    this.d = parame;
    this.e = new d(paramContext, parame.f(), null);
  }
  
  void a() {
    List<j> list = this.d.g().n().y().g();
    ConstraintProxy.a(this.b, list);
    this.e.d(list);
    ArrayList<j> arrayList = new ArrayList(list.size());
    long l = System.currentTimeMillis();
    for (j j : list) {
      String str = j.c;
      if (l >= j.a() && (!j.b() || this.e.c(str)))
        arrayList.add(j); 
    } 
    Iterator<j> iterator = arrayList.iterator();
    while (iterator.hasNext()) {
      String str = ((j)iterator.next()).c;
      Intent intent = b.b(this.b, str);
      f.c().a(a, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[] { str }), new Throwable[0]);
      e e1 = this.d;
      e1.k(new e.b(e1, intent, this.c));
    } 
    this.e.e();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/background/systemalarm/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */