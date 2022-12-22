package androidx.work.impl.k;

import android.content.Context;
import androidx.work.f;
import androidx.work.impl.k.e.a;
import androidx.work.impl.k.e.b;
import androidx.work.impl.k.e.c;
import androidx.work.impl.k.e.d;
import androidx.work.impl.k.e.e;
import androidx.work.impl.k.e.f;
import androidx.work.impl.k.e.g;
import androidx.work.impl.k.e.h;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.j.a;
import java.util.ArrayList;
import java.util.List;

public class d implements c.a {
  private static final String a = f.f("WorkConstraintsTracker");
  
  private final c b;
  
  private final c<?>[] c;
  
  private final Object d;
  
  public d(Context paramContext, a parama, c paramc) {
    paramContext = paramContext.getApplicationContext();
    this.b = paramc;
    this.c = (c<?>[])new c[] { (c)new a(paramContext, parama), (c)new b(paramContext, parama), (c)new h(paramContext, parama), (c)new d(paramContext, parama), (c)new g(paramContext, parama), (c)new f(paramContext, parama), (c)new e(paramContext, parama) };
    this.d = new Object();
  }
  
  public void a(List<String> paramList) {
    synchronized (this.d) {
      ArrayList<String> arrayList = new ArrayList();
      this();
      for (String str : paramList) {
        if (c(str)) {
          f.c().a(a, String.format("Constraints met for %s", new Object[] { str }), new Throwable[0]);
          arrayList.add(str);
        } 
      } 
      c c1 = this.b;
      if (c1 != null)
        c1.e(arrayList); 
      return;
    } 
  }
  
  public void b(List<String> paramList) {
    synchronized (this.d) {
      c c1 = this.b;
      if (c1 != null)
        c1.b(paramList); 
      return;
    } 
  }
  
  public boolean c(String paramString) {
    synchronized (this.d) {
      for (c<?> c1 : this.c) {
        if (c1.d(paramString)) {
          f.c().a(a, String.format("Work %s constrained by %s", new Object[] { paramString, c1.getClass().getSimpleName() }), new Throwable[0]);
          return false;
        } 
      } 
      return true;
    } 
  }
  
  public void d(List<j> paramList) {
    synchronized (this.d) {
      c<?>[] arrayOfC2 = this.c;
      int i = arrayOfC2.length;
      boolean bool = false;
      byte b;
      for (b = 0; b < i; b++)
        arrayOfC2[b].g(null); 
      arrayOfC2 = this.c;
      i = arrayOfC2.length;
      for (b = 0; b < i; b++)
        arrayOfC2[b].e(paramList); 
      c<?>[] arrayOfC1 = this.c;
      i = arrayOfC1.length;
      for (b = bool; b < i; b++)
        arrayOfC1[b].g(this); 
      return;
    } 
  }
  
  public void e() {
    synchronized (this.d) {
      c<?>[] arrayOfC = this.c;
      int i = arrayOfC.length;
      for (byte b = 0; b < i; b++)
        arrayOfC[b].f(); 
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */