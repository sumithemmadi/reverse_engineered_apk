package com.allinone.callerid.i.a.e;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.bean.EZBlackList;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.m;

public class b {
  public static void a(EZBlackList paramEZBlackList, com.allinone.callerid.i.a.a parama) {
    try {
      a a1 = new a();
      this(paramEZBlackList, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(String paramString, a parama) {
    try {
      f f = new f();
      this(paramString, parama);
      f.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(com.allinone.callerid.i.a.a parama) {
    try {
      c c = new c();
      this(parama);
      c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(com.allinone.callerid.i.a.a parama) {
    try {
      b b1 = new b();
      this(parama);
      b1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void e(String paramString, com.allinone.callerid.i.a.a parama) {
    (new e(paramString, parama)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static void f(String paramString, com.allinone.callerid.i.a.a parama) {
    try {
      d d = new d();
      this(paramString, parama);
      d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void g(EZBlackList paramEZBlackList, com.allinone.callerid.i.a.a parama) {
    try {
      g g = new g();
      this(paramEZBlackList, parama);
      g.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Void> {
    private com.allinone.callerid.i.a.a a;
    
    private EZBlackList b;
    
    a(EZBlackList param1EZBlackList, com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
      this.b = param1EZBlackList;
    }
    
    protected Void a(String... param1VarArgs) {
      (new m((Context)EZCallApplication.c())).l(this.b);
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.a();
    }
  }
  
  private static class b extends AsyncTask<String, Void, Void> {
    private com.allinone.callerid.i.a.a a;
    
    b(com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
    }
    
    protected Void a(String... param1VarArgs) {
      (new m((Context)EZCallApplication.c())).b();
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.a();
    }
  }
  
  private static class c extends AsyncTask<String, Void, Void> {
    private com.allinone.callerid.i.a.a a;
    
    c(com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
    }
    
    protected Void a(String... param1VarArgs) {
      (new m((Context)EZCallApplication.c())).a();
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.a();
    }
  }
  
  private static class d extends AsyncTask<String, Void, Void> {
    private com.allinone.callerid.i.a.a a;
    
    private String b;
    
    d(String param1String, com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Void a(String... param1VarArgs) {
      (new m((Context)EZCallApplication.c())).e(this.b);
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.a();
    }
  }
  
  private static class e extends AsyncTask<String, Void, Void> {
    private com.allinone.callerid.i.a.a a;
    
    private String b;
    
    e(String param1String, com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Void a(String... param1VarArgs) {
      (new m((Context)EZCallApplication.c())).d(this.b);
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.a();
    }
  }
  
  private static class f extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    f(String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
    }
    
    protected Boolean a(String... param1VarArgs) {
      return (new m((Context)EZCallApplication.c())).j(this.b);
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
  
  private static class g extends AsyncTask<String, Void, Void> {
    private com.allinone.callerid.i.a.a a;
    
    private EZBlackList b;
    
    g(EZBlackList param1EZBlackList, com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
      this.b = param1EZBlackList;
    }
    
    protected Void a(String... param1VarArgs) {
      (new m((Context)EZCallApplication.c())).n(this.b);
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.a();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */