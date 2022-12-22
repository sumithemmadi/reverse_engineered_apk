package androidx.work.impl.j.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.WorkInfo;
import androidx.work.f;
import androidx.work.impl.a;
import androidx.work.impl.d;
import androidx.work.impl.h;
import androidx.work.impl.k.c;
import androidx.work.impl.k.d;
import androidx.work.impl.l.j;
import java.util.ArrayList;
import java.util.List;

public class a implements d, c, a {
  private static final String b = f.f("GreedyScheduler");
  
  private h c;
  
  private d d;
  
  private List<j> e = new ArrayList<j>();
  
  private boolean f;
  
  private final Object g;
  
  public a(Context paramContext, androidx.work.impl.utils.j.a parama, h paramh) {
    this.c = paramh;
    this.d = new d(paramContext, parama, this);
    this.g = new Object();
  }
  
  private void f() {
    if (!this.f) {
      this.c.l().a(this);
      this.f = true;
    } 
  }
  
  private void g(String paramString) {
    synchronized (this.g) {
      int i = this.e.size();
      for (byte b = 0; b < i; b++) {
        if (((j)this.e.get(b)).c.equals(paramString)) {
          f.c().a(b, String.format("Stopping tracking for %s", new Object[] { paramString }), new Throwable[0]);
          this.e.remove(b);
          this.d.d(this.e);
          break;
        } 
      } 
      return;
    } 
  }
  
  public void a(j... paramVarArgs) {
    f();
    ArrayList<j> arrayList = new ArrayList();
    null = new ArrayList();
    int i = paramVarArgs.length;
    for (byte b = 0; b < i; b++) {
      j j1 = paramVarArgs[b];
      if (j1.d == WorkInfo.State.b && !j1.d() && j1.i == 0L && !j1.c())
        if (j1.b()) {
          if (Build.VERSION.SDK_INT < 24 || !j1.l.e()) {
            arrayList.add(j1);
            null.add(j1.c);
          } 
        } else {
          f.c().a(b, String.format("Starting work for %s", new Object[] { j1.c }), new Throwable[0]);
          this.c.t(j1.c);
        }  
    } 
    synchronized (this.g) {
      if (!arrayList.isEmpty()) {
        f.c().a(b, String.format("Starting tracking for [%s]", new Object[] { TextUtils.join(",", null) }), new Throwable[0]);
        this.e.addAll(arrayList);
        this.d.d(this.e);
      } 
      return;
    } 
  }
  
  public void b(List<String> paramList) {
    for (String str : paramList) {
      f.c().a(b, String.format("Constraints not met: Cancelling work ID %s", new Object[] { str }), new Throwable[0]);
      this.c.v(str);
    } 
  }
  
  public void c(String paramString, boolean paramBoolean) {
    g(paramString);
  }
  
  public void d(String paramString) {
    f();
    f.c().a(b, String.format("Cancelling work ID %s", new Object[] { paramString }), new Throwable[0]);
    this.c.v(paramString);
  }
  
  public void e(List<String> paramList) {
    for (String str : paramList) {
      f.c().a(b, String.format("Constraints met: Scheduling work ID %s", new Object[] { str }), new Throwable[0]);
      this.c.t(str);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/j/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */