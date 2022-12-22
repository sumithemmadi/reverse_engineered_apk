package b.h.h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import b.e.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

class e {
  static final b.e.e<String, Typeface> a = new b.e.e(16);
  
  private static final ExecutorService b = g.a("fonts-androidx", 10, 10000);
  
  static final Object c = new Object();
  
  static final g<String, ArrayList<b.h.j.a<e>>> d = new g();
  
  private static String a(d paramd, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramd.d());
    stringBuilder.append("-");
    stringBuilder.append(paramInt);
    return stringBuilder.toString();
  }
  
  @SuppressLint({"WrongConstant"})
  private static int b(f.a parama) {
    int i = parama.c();
    byte b = -3;
    byte b1 = 1;
    if (i != 0)
      return (parama.c() != 1) ? -3 : -2; 
    f.b[] arrayOfB = parama.b();
    i = b1;
    if (arrayOfB != null)
      if (arrayOfB.length == 0) {
        i = b1;
      } else {
        int j = arrayOfB.length;
        boolean bool = false;
        b1 = 0;
        while (true) {
          i = bool;
          if (b1 < j) {
            i = arrayOfB[b1].b();
            if (i != 0) {
              if (i < 0)
                i = b; 
              return i;
            } 
            b1++;
            continue;
          } 
          break;
        } 
      }  
    return i;
  }
  
  static e c(String paramString, Context paramContext, d paramd, int paramInt) {
    b.e.e<String, Typeface> e1 = a;
    Typeface typeface = (Typeface)e1.c(paramString);
    if (typeface != null)
      return new e(typeface); 
    try {
      f.a a = c.d(paramContext, paramd, null);
      int i = b(a);
      if (i != 0)
        return new e(i); 
      Typeface typeface1 = b.h.e.d.b(paramContext, null, a.b(), paramInt);
      if (typeface1 != null) {
        e1.d(paramString, typeface1);
        return new e(typeface1);
      } 
      return new e(-3);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return new e(-1);
    } 
  }
  
  static Typeface d(Context paramContext, d paramd, int paramInt, Executor paramExecutor, a parama) {
    String str = a(paramd, paramInt);
    Typeface typeface = (Typeface)a.c(str);
    if (typeface != null) {
      parama.b(new e(typeface));
      return typeface;
    } 
    b b = new b(parama);
    synchronized (c) {
      g<String, ArrayList<b.h.j.a<e>>> g1 = d;
      ArrayList<b> arrayList = (ArrayList)g1.get(str);
      if (arrayList != null) {
        arrayList.add(b);
        return null;
      } 
      arrayList = new ArrayList<b>();
      this();
      arrayList.add(b);
      g1.put(str, arrayList);
      c c = new c(str, paramContext, paramd, paramInt);
      Executor executor = paramExecutor;
      if (paramExecutor == null)
        executor = b; 
      g.b(executor, c, new d(str));
      return null;
    } 
  }
  
  static Typeface e(Context paramContext, d paramd, a parama, int paramInt1, int paramInt2) {
    e e1;
    String str = a(paramd, paramInt1);
    Typeface typeface = (Typeface)a.c(str);
    if (typeface != null) {
      parama.b(new e(typeface));
      return typeface;
    } 
    if (paramInt2 == -1) {
      e1 = c(str, paramContext, paramd, paramInt1);
      parama.b(e1);
      return e1.a;
    } 
    a a1 = new a(str, (Context)e1, paramd, paramInt1);
    try {
      e e2 = g.<e>c(b, a1, paramInt2);
      parama.b(e2);
      return e2.a;
    } catch (InterruptedException interruptedException) {
      parama.b(new e(-3));
      return null;
    } 
  }
  
  class a implements Callable<e> {
    a(e this$0, Context param1Context, d param1d, int param1Int) {}
    
    public e.e a() {
      return e.c(this.a, this.b, this.c, this.d);
    }
  }
  
  class b implements b.h.j.a<e> {
    b(e this$0) {}
    
    public void b(e.e param1e) {
      this.a.b(param1e);
    }
  }
  
  class c implements Callable<e> {
    c(e this$0, Context param1Context, d param1d, int param1Int) {}
    
    public e.e a() {
      return e.c(this.a, this.b, this.c, this.d);
    }
  }
  
  class d implements b.h.j.a<e> {
    d(e this$0) {}
    
    public void b(e.e param1e) {
      synchronized (e.c) {
        g<String, ArrayList<b.h.j.a<e.e>>> g = e.d;
        ArrayList<b.h.j.a> arrayList = (ArrayList)g.get(this.a);
        if (arrayList == null)
          return; 
        g.remove(this.a);
        for (byte b = 0; b < arrayList.size(); b++)
          ((b.h.j.a)arrayList.get(b)).a(param1e); 
        return;
      } 
    }
  }
  
  static final class e {
    final Typeface a = null;
    
    final int b;
    
    e(int param1Int) {
      this.b = param1Int;
    }
    
    @SuppressLint({"WrongConstant"})
    e(Typeface param1Typeface) {
      this.b = 0;
    }
    
    @SuppressLint({"WrongConstant"})
    boolean a() {
      boolean bool;
      if (this.b == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/h/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */