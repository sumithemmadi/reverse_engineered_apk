package com.danikula.videocache;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.danikula.videocache.q.b;
import java.io.File;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

final class g {
  private final AtomicInteger a = new AtomicInteger(0);
  
  private final String b;
  
  private volatile e c;
  
  private final List<b> d;
  
  private final b e;
  
  private final c f;
  
  public g(String paramString, c paramc) {
    CopyOnWriteArrayList<b> copyOnWriteArrayList = new CopyOnWriteArrayList();
    this.d = copyOnWriteArrayList;
    this.b = k.<String>d(paramString);
    this.f = k.<c>d(paramc);
    this.e = new a(paramString, copyOnWriteArrayList);
  }
  
  private void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/concurrent/atomic/AtomicInteger;
    //   6: invokevirtual decrementAndGet : ()I
    //   9: ifgt -> 24
    //   12: aload_0
    //   13: getfield c : Lcom/danikula/videocache/e;
    //   16: invokevirtual m : ()V
    //   19: aload_0
    //   20: aconst_null
    //   21: putfield c : Lcom/danikula/videocache/e;
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	27	finally
  }
  
  private e c() {
    String str = this.b;
    c c1 = this.f;
    e e1 = new e(new h(str, c1.d, c1.e), new b(this.f.a(this.b), this.f.c));
    e1.t(this.e);
    return e1;
  }
  
  private void e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/danikula/videocache/e;
    //   6: ifnonnull -> 17
    //   9: aload_0
    //   10: invokespecial c : ()Lcom/danikula/videocache/e;
    //   13: astore_1
    //   14: goto -> 22
    //   17: aload_0
    //   18: getfield c : Lcom/danikula/videocache/e;
    //   21: astore_1
    //   22: aload_0
    //   23: aload_1
    //   24: putfield c : Lcom/danikula/videocache/e;
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	30	finally
    //   17	22	30	finally
    //   22	27	30	finally
  }
  
  public int b() {
    return this.a.get();
  }
  
  public void d(d paramd, Socket paramSocket) {
    e();
    try {
      this.a.incrementAndGet();
      this.c.s(paramd, paramSocket);
      return;
    } finally {
      a();
    } 
  }
  
  private static final class a extends Handler implements b {
    private final String b;
    
    private final List<b> c;
    
    public a(String param1String, List<b> param1List) {
      super(Looper.getMainLooper());
      this.b = param1String;
      this.c = param1List;
    }
    
    public void a(File param1File, String param1String, int param1Int) {
      Message message = obtainMessage();
      message.arg1 = param1Int;
      message.obj = param1File;
      sendMessage(message);
    }
    
    public void handleMessage(Message param1Message) {
      Iterator<b> iterator = this.c.iterator();
      while (iterator.hasNext())
        ((b)iterator.next()).a((File)param1Message.obj, this.b, param1Message.arg1); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/danikula/videocache/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */