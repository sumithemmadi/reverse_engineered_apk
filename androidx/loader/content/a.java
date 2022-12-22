package androidx.loader.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import b.h.j.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

public abstract class a<D> extends b<D> {
  private final Executor j;
  
  volatile a k;
  
  volatile a l;
  
  long m;
  
  long n = -10000L;
  
  Handler o;
  
  public a(Context paramContext) {
    this(paramContext, ModernAsyncTask.d);
  }
  
  private a(Context paramContext, Executor paramExecutor) {
    super(paramContext);
    this.j = paramExecutor;
  }
  
  public abstract D A();
  
  public void B(D paramD) {}
  
  protected D C() {
    return A();
  }
  
  @Deprecated
  public void g(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {
    super.g(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (this.k != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTask=");
      paramPrintWriter.print(this.k);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.k.m);
    } 
    if (this.l != null) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mCancellingTask=");
      paramPrintWriter.print(this.l);
      paramPrintWriter.print(" waiting=");
      paramPrintWriter.println(this.l.m);
    } 
    if (this.m != 0L) {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mUpdateThrottle=");
      j.c(this.m, paramPrintWriter);
      paramPrintWriter.print(" mLastLoadCompleteTime=");
      j.b(this.n, SystemClock.uptimeMillis(), paramPrintWriter);
      paramPrintWriter.println();
    } 
  }
  
  protected boolean k() {
    if (this.k != null) {
      if (!this.e)
        this.h = true; 
      if (this.l != null) {
        if (this.k.m) {
          this.k.m = false;
          this.o.removeCallbacks(this.k);
        } 
        this.k = null;
        return false;
      } 
      if (this.k.m) {
        this.k.m = false;
        this.o.removeCallbacks(this.k);
        this.k = null;
        return false;
      } 
      boolean bool = this.k.a(false);
      if (bool) {
        this.l = this.k;
        w();
      } 
      this.k = null;
      return bool;
    } 
    return false;
  }
  
  protected void m() {
    super.m();
    b();
    this.k = new a(this);
    z();
  }
  
  public void w() {}
  
  void x(a parama, D paramD) {
    B(paramD);
    if (this.l == parama) {
      s();
      this.n = SystemClock.uptimeMillis();
      this.l = null;
      e();
      z();
    } 
  }
  
  void y(a parama, D paramD) {
    if (this.k != parama) {
      x(parama, paramD);
    } else if (i()) {
      B(paramD);
    } else {
      c();
      this.n = SystemClock.uptimeMillis();
      this.k = null;
      f(paramD);
    } 
  }
  
  void z() {
    if (this.l == null && this.k != null) {
      if (this.k.m) {
        this.k.m = false;
        this.o.removeCallbacks(this.k);
      } 
      if (this.m > 0L && SystemClock.uptimeMillis() < this.n + this.m) {
        this.k.m = true;
        this.o.postAtTime(this.k, this.n + this.m);
        return;
      } 
      this.k.c(this.j, null);
    } 
  }
  
  final class a extends ModernAsyncTask<Void, Void, D> implements Runnable {
    private final CountDownLatch l = new CountDownLatch(1);
    
    boolean m;
    
    a(a this$0) {}
    
    protected void h(D param1D) {
      try {
        this.n.x(this, param1D);
        return;
      } finally {
        this.l.countDown();
      } 
    }
    
    protected void i(D param1D) {
      try {
        this.n.y(this, param1D);
        return;
      } finally {
        this.l.countDown();
      } 
    }
    
    protected D n(Void... param1VarArgs) {
      try {
        return (D)this.n.C();
      } catch (OperationCanceledException operationCanceledException) {
        if (f())
          return null; 
        throw operationCanceledException;
      } 
    }
    
    public void run() {
      this.m = false;
      this.n.z();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/loader/content/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */