package b.o.a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import b.e.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class b extends a {
  static boolean a = false;
  
  private final h b;
  
  private final c c;
  
  b(h paramh, t paramt) {
    this.b = paramh;
    this.c = c.g(paramt);
  }
  
  private <D> androidx.loader.content.b<D> e(int paramInt, Bundle paramBundle, a.a<D> parama, androidx.loader.content.b<D> paramb) {
    try {
      this.c.l();
      androidx.loader.content.b<D> b1 = parama.b(paramInt, paramBundle);
      if (b1 != null) {
        if (!b1.getClass().isMemberClass() || Modifier.isStatic(b1.getClass().getModifiers())) {
          a<D> a1 = (a<D>)new a();
          this(paramInt, paramBundle, b1, paramb);
          if (a) {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("  Created new loader ");
            stringBuilder1.append(a1);
            Log.v("LoaderManager", stringBuilder1.toString());
          } 
          this.c.k(paramInt, a1);
          return a1.s(this.b, parama);
        } 
        IllegalArgumentException illegalArgumentException1 = new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
        stringBuilder.append(b1);
        this(stringBuilder.toString());
        throw illegalArgumentException1;
      } 
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
      this("Object returned from onCreateLoader must not be null");
      throw illegalArgumentException;
    } finally {
      this.c.f();
    } 
  }
  
  @Deprecated
  public void a(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    this.c.e(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public <D> androidx.loader.content.b<D> c(int paramInt, Bundle paramBundle, a.a<D> parama) {
    if (!this.c.i()) {
      if (Looper.getMainLooper() == Looper.myLooper()) {
        a<?> a1 = this.c.h(paramInt);
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("initLoader in ");
          stringBuilder.append(this);
          stringBuilder.append(": args=");
          stringBuilder.append(paramBundle);
          Log.v("LoaderManager", stringBuilder.toString());
        } 
        if (a1 == null)
          return e(paramInt, paramBundle, parama, null); 
        if (a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("  Re-using existing loader ");
          stringBuilder.append(a1);
          Log.v("LoaderManager", stringBuilder.toString());
        } 
        return (androidx.loader.content.b)a1.s(this.b, parama);
      } 
      throw new IllegalStateException("initLoader must be called on the main thread");
    } 
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public void d() {
    this.c.j();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append("LoaderManager{");
    stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    stringBuilder.append(" in ");
    b.h.j.b.a(this.b, stringBuilder);
    stringBuilder.append("}}");
    return stringBuilder.toString();
  }
  
  public static class a<D> extends m<D> implements androidx.loader.content.b.b<D> {
    private final int l;
    
    private final Bundle m;
    
    private final androidx.loader.content.b<D> n;
    
    private h o;
    
    private b.b<D> p;
    
    private androidx.loader.content.b<D> q;
    
    a(int param1Int, Bundle param1Bundle, androidx.loader.content.b<D> param1b1, androidx.loader.content.b<D> param1b2) {
      this.l = param1Int;
      this.m = param1Bundle;
      this.n = param1b1;
      this.q = param1b2;
      param1b1.q(param1Int, this);
    }
    
    public void a(androidx.loader.content.b<D> param1b, D param1D) {
      if (b.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onLoadComplete: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      if (Looper.myLooper() == Looper.getMainLooper()) {
        n(param1D);
      } else {
        if (b.a)
          Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread"); 
        l(param1D);
      } 
    }
    
    protected void j() {
      if (b.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Starting: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.n.t();
    }
    
    protected void k() {
      if (b.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Stopping: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.n.u();
    }
    
    public void m(n<? super D> param1n) {
      super.m(param1n);
      this.o = null;
      this.p = null;
    }
    
    public void n(D param1D) {
      super.n(param1D);
      androidx.loader.content.b<D> b1 = this.q;
      if (b1 != null) {
        b1.r();
        this.q = null;
      } 
    }
    
    androidx.loader.content.b<D> o(boolean param1Boolean) {
      if (b.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  Destroying: ");
        stringBuilder.append(this);
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.n.b();
      this.n.a();
      b.b<D> b1 = this.p;
      if (b1 != null) {
        m(b1);
        if (param1Boolean)
          b1.d(); 
      } 
      this.n.v(this);
      if ((b1 != null && !b1.c()) || param1Boolean) {
        this.n.r();
        return this.q;
      } 
      return this.n;
    }
    
    public void p(String param1String, FileDescriptor param1FileDescriptor, PrintWriter param1PrintWriter, String[] param1ArrayOfString) {
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mId=");
      param1PrintWriter.print(this.l);
      param1PrintWriter.print(" mArgs=");
      param1PrintWriter.println(this.m);
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mLoader=");
      param1PrintWriter.println(this.n);
      androidx.loader.content.b<D> b1 = this.n;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1String);
      stringBuilder.append("  ");
      b1.g(stringBuilder.toString(), param1FileDescriptor, param1PrintWriter, param1ArrayOfString);
      if (this.p != null) {
        param1PrintWriter.print(param1String);
        param1PrintWriter.print("mCallbacks=");
        param1PrintWriter.println(this.p);
        b.b<D> b2 = this.p;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(param1String);
        stringBuilder1.append("  ");
        b2.b(stringBuilder1.toString(), param1PrintWriter);
      } 
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mData=");
      param1PrintWriter.println(q().d(f()));
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mStarted=");
      param1PrintWriter.println(g());
    }
    
    androidx.loader.content.b<D> q() {
      return this.n;
    }
    
    void r() {
      h h1 = this.o;
      b.b<D> b1 = this.p;
      if (h1 != null && b1 != null) {
        super.m(b1);
        h(h1, b1);
      } 
    }
    
    androidx.loader.content.b<D> s(h param1h, a.a<D> param1a) {
      b.b<D> b1 = new b.b<D>(this.n, param1a);
      h(param1h, b1);
      b.b<D> b2 = this.p;
      if (b2 != null)
        m(b2); 
      this.o = param1h;
      this.p = b1;
      return this.n;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(64);
      stringBuilder.append("LoaderInfo{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" #");
      stringBuilder.append(this.l);
      stringBuilder.append(" : ");
      b.h.j.b.a(this.n, stringBuilder);
      stringBuilder.append("}}");
      return stringBuilder.toString();
    }
  }
  
  static class b<D> implements n<D> {
    private final androidx.loader.content.b<D> a;
    
    private final a.a<D> b;
    
    private boolean c = false;
    
    b(androidx.loader.content.b<D> param1b, a.a<D> param1a) {
      this.a = param1b;
      this.b = param1a;
    }
    
    public void a(D param1D) {
      if (b.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  onLoadFinished in ");
        stringBuilder.append(this.a);
        stringBuilder.append(": ");
        stringBuilder.append(this.a.d(param1D));
        Log.v("LoaderManager", stringBuilder.toString());
      } 
      this.b.a(this.a, param1D);
      this.c = true;
    }
    
    public void b(String param1String, PrintWriter param1PrintWriter) {
      param1PrintWriter.print(param1String);
      param1PrintWriter.print("mDeliveredData=");
      param1PrintWriter.println(this.c);
    }
    
    boolean c() {
      return this.c;
    }
    
    void d() {
      if (this.c) {
        if (b.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("  Resetting: ");
          stringBuilder.append(this.a);
          Log.v("LoaderManager", stringBuilder.toString());
        } 
        this.b.c(this.a);
      } 
    }
    
    public String toString() {
      return this.b.toString();
    }
  }
  
  static class c extends r {
    private static final s.a c = new a();
    
    private h<b.a> d = new h();
    
    private boolean e = false;
    
    static c g(t param1t) {
      return (c)(new s(param1t, c)).a(c.class);
    }
    
    protected void d() {
      super.d();
      int i = this.d.r();
      for (byte b = 0; b < i; b++)
        ((b.a)this.d.s(b)).o(true); 
      this.d.b();
    }
    
    public void e(String param1String, FileDescriptor param1FileDescriptor, PrintWriter param1PrintWriter, String[] param1ArrayOfString) {
      if (this.d.r() > 0) {
        param1PrintWriter.print(param1String);
        param1PrintWriter.println("Loaders:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(param1String);
        stringBuilder.append("    ");
        String str = stringBuilder.toString();
        for (byte b = 0; b < this.d.r(); b++) {
          b.a a1 = (b.a)this.d.s(b);
          param1PrintWriter.print(param1String);
          param1PrintWriter.print("  #");
          param1PrintWriter.print(this.d.m(b));
          param1PrintWriter.print(": ");
          param1PrintWriter.println(a1.toString());
          a1.p(str, param1FileDescriptor, param1PrintWriter, param1ArrayOfString);
        } 
      } 
    }
    
    void f() {
      this.e = false;
    }
    
    <D> b.a<D> h(int param1Int) {
      return (b.a<D>)this.d.i(param1Int);
    }
    
    boolean i() {
      return this.e;
    }
    
    void j() {
      int i = this.d.r();
      for (byte b = 0; b < i; b++)
        ((b.a)this.d.s(b)).r(); 
    }
    
    void k(int param1Int, b.a param1a) {
      this.d.n(param1Int, param1a);
    }
    
    void l() {
      this.e = true;
    }
    
    static final class a implements s.a {
      public <T extends r> T a(Class<T> param2Class) {
        return (T)new b.c();
      }
    }
  }
  
  static final class a implements s.a {
    public <T extends r> T a(Class<T> param1Class) {
      return (T)new b.c();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/o/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */