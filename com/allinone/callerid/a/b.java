package com.allinone.callerid.a;

import android.content.Context;
import android.util.SparseArray;
import com.allinone.callerid.l.a.d;
import com.allinone.callerid.l.a.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.e;
import java.util.ArrayList;
import java.util.Timer;

public class b {
  private static b a;
  
  private SparseArray<a> b = new SparseArray();
  
  private ArrayList<c> c = new ArrayList<c>();
  
  private Timer d = new Timer();
  
  private void d(int paramInt) {
    try {
      SparseArray<a> sparseArray = this.b;
      if (sparseArray != null && sparseArray.size() > 0)
        this.b.remove(paramInt); 
      sparseArray = this.b;
      if (sparseArray != null && sparseArray.size() == 0)
        c(); 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static b e() {
    if (a == null)
      a = new b(); 
    return a;
  }
  
  public void c() {
    try {
      ArrayList<c> arrayList = this.c;
      if (arrayList != null && arrayList.size() > 0) {
        for (c c : this.c) {
          if (c != null)
            c.cancel(); 
        } 
        this.c.clear();
        this.c = null;
      } 
      Timer timer = this.d;
      if (timer != null) {
        timer.cancel();
        this.d = null;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void f(long paramLong, int paramInt) {
    try {
      if (this.b.get(paramInt) == null) {
        a a1 = new a();
        this();
        a1.f(System.currentTimeMillis());
        a1.g(paramLong);
        a1.h(paramInt);
        this.b.put(paramInt, a1);
      } 
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("开始方法，从主页开始: ");
        stringBuilder.append(paramInt);
        d0.a("wbb", stringBuilder.toString());
      } 
      a a = new a();
      this(this, paramInt);
      this.d.schedule(a, paramLong);
      this.c.add(a);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void g() {
    try {
      SparseArray<a> sparseArray = this.b;
      if (sparseArray != null && sparseArray.size() > 0) {
        int i = this.b.size();
        for (byte b1 = 0; b1 < i; b1++) {
          a a = (a)this.b.valueAt(b1);
          if (a.a() != 0L && !a.d() && e.d((Context)EZCallApplication.c()) && System.currentTimeMillis() - a.a() >= a.b()) {
            a.e(true);
            int j = a.c();
            if (j == 718) {
              if (d0.a)
                d0.a("wbb", "开始请求下载，有网的时候,处理718任务"); 
              b b2 = new b();
              this(this, a);
              f.j(b2);
            } else if (a.c() == 970) {
              if (d0.a)
                d0.a("wbb", "开始请求下载，有网的时候,处理970任务"); 
              EZCallApplication eZCallApplication = EZCallApplication.c();
              c c = new c();
              this(this, a);
              f.h((Context)eZCallApplication, true, c);
            } 
          } 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  class a extends c {
    a(b this$0, int param1Int) {
      super(param1Int);
    }
    
    public void run() {
      if (b.a(this.c) == null)
        return; 
      a a1 = (a)b.a(this.c).get(this.b);
      if (a1 != null && !a1.d() && e.d((Context)EZCallApplication.c())) {
        a1.e(true);
        if (a1.c() == 718) {
          if (d0.a)
            d0.a("wbb", "处理718任务"); 
          f.j(new a(this));
        } else if (a1.c() == 970) {
          if (d0.a)
            d0.a("wbb", "处理970任务"); 
          f.h((Context)EZCallApplication.c(), true, new b(this));
        } 
      } 
    }
    
    class a implements d {
      a(b.a this$0) {}
      
      public void a() {
        if (d0.a)
          d0.a("wbb", "onSuccess"); 
      }
      
      public void b() {
        if (d0.a)
          d0.a("wbb", "onEnd"); 
        b.b(this.a.c, 718);
      }
    }
    
    class b implements d {
      b(b.a this$0) {}
      
      public void a() {
        if (d0.a)
          d0.a("checkupdate", "onSuccess"); 
      }
      
      public void b() {
        if (d0.a)
          d0.a("checkupdate", "onEnd"); 
        b.b(this.a.c, 970);
      }
    }
  }
  
  class a implements d {
    a(b this$0) {}
    
    public void a() {
      if (d0.a)
        d0.a("wbb", "onSuccess"); 
    }
    
    public void b() {
      if (d0.a)
        d0.a("wbb", "onEnd"); 
      b.b(this.a.c, 718);
    }
  }
  
  class b implements d {
    b(b this$0) {}
    
    public void a() {
      if (d0.a)
        d0.a("checkupdate", "onSuccess"); 
    }
    
    public void b() {
      if (d0.a)
        d0.a("checkupdate", "onEnd"); 
      b.b(this.a.c, 970);
    }
  }
  
  class b implements d {
    b(b this$0, a param1a) {}
    
    public void a() {
      if (d0.a)
        d0.a("wbb", "onSuccess"); 
    }
    
    public void b() {
      if (d0.a)
        d0.a("wbb", "onEnd"); 
      b.b(this.b, this.a.c());
    }
  }
  
  class c implements d {
    c(b this$0, a param1a) {}
    
    public void a() {
      if (d0.a)
        d0.a("checkupdate", "onSuccess"); 
    }
    
    public void b() {
      if (d0.a)
        d0.a("checkupdate", "onEnd"); 
      b.b(this.b, this.a.c());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */