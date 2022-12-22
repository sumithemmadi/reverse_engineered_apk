package androidx.work.impl;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.h;
import androidx.work.impl.utils.b;
import androidx.work.j;
import androidx.work.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class f extends j {
  private static final String a = androidx.work.f.f("WorkContinuationImpl");
  
  private final h b;
  
  private final String c;
  
  private final ExistingWorkPolicy d;
  
  private final List<? extends l> e;
  
  private final List<String> f;
  
  private final List<String> g;
  
  private final List<f> h;
  
  private boolean i;
  
  private h j;
  
  f(h paramh, String paramString, ExistingWorkPolicy paramExistingWorkPolicy, List<? extends l> paramList, List<f> paramList1) {
    this.b = paramh;
    this.c = paramString;
    this.d = paramExistingWorkPolicy;
    this.e = paramList;
    this.h = paramList1;
    this.f = new ArrayList<String>(paramList.size());
    this.g = new ArrayList<String>();
    if (paramList1 != null)
      for (f f1 : paramList1)
        this.g.addAll(f1.g);  
    for (byte b = 0; b < paramList.size(); b++) {
      String str = ((l)paramList.get(b)).a();
      this.f.add(str);
      this.g.add(str);
    } 
  }
  
  f(h paramh, List<? extends l> paramList) {
    this(paramh, null, ExistingWorkPolicy.c, paramList, null);
  }
  
  private static boolean i(f paramf, Set<String> paramSet) {
    paramSet.addAll(paramf.c());
    Set<String> set = l(paramf);
    Iterator<String> iterator = paramSet.iterator();
    while (iterator.hasNext()) {
      if (set.contains(iterator.next()))
        return true; 
    } 
    List<f> list = paramf.e();
    if (list != null && !list.isEmpty()) {
      Iterator<f> iterator1 = list.iterator();
      while (iterator1.hasNext()) {
        if (i(iterator1.next(), paramSet))
          return true; 
      } 
    } 
    paramSet.removeAll(paramf.c());
    return false;
  }
  
  public static Set<String> l(f paramf) {
    HashSet<String> hashSet = new HashSet();
    List<f> list = paramf.e();
    if (list != null && !list.isEmpty()) {
      Iterator<f> iterator = list.iterator();
      while (iterator.hasNext())
        hashSet.addAll(((f)iterator.next()).c()); 
    } 
    return hashSet;
  }
  
  public h a() {
    if (!this.i) {
      b b = new b(this);
      this.b.o().b((Runnable)b);
      this.j = b.d();
    } else {
      androidx.work.f.c().h(a, String.format("Already enqueued work ids (%s)", new Object[] { TextUtils.join(", ", this.f) }), new Throwable[0]);
    } 
    return this.j;
  }
  
  public ExistingWorkPolicy b() {
    return this.d;
  }
  
  public List<String> c() {
    return this.f;
  }
  
  public String d() {
    return this.c;
  }
  
  public List<f> e() {
    return this.h;
  }
  
  public List<? extends l> f() {
    return this.e;
  }
  
  public h g() {
    return this.b;
  }
  
  public boolean h() {
    return i(this, new HashSet<String>());
  }
  
  public boolean j() {
    return this.i;
  }
  
  public void k() {
    this.i = true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */