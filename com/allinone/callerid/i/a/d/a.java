package com.allinone.callerid.i.a.d;

import android.os.AsyncTask;

public class a {
  public static void a(b paramb) {
    try {
      a a1 = new a();
      this(paramb);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(c paramc) {
    try {
      b b = new b();
      this(paramc);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c() {
    try {
      c c = new c();
      this();
      c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Boolean> {
    private b a;
    
    a(b param1b) {
      this.a = param1b;
    }
    
    protected Boolean a(String... param1VarArgs) {
      return Boolean.valueOf(com.allinone.callerid.f.a.c().a());
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
  
  private static class b extends AsyncTask<String, Void, Void> {
    private c a;
    
    b(c param1c) {
      this.a = param1c;
    }
    
    protected Void a(String... param1VarArgs) {
      com.allinone.callerid.f.a.c().b();
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      this.a.close();
    }
  }
  
  private static class c extends AsyncTask<String, Void, Void> {
    protected Void a(String... param1VarArgs) {
      com.allinone.callerid.f.a.c().d();
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */