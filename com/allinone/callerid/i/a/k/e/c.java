package com.allinone.callerid.i.a.k.e;

import android.os.AsyncTask;
import com.allinone.callerid.bean.NoDisturbBean;
import java.util.ArrayList;

public class c {
  public static void a(NoDisturbBean paramNoDisturbBean, b paramb) {
    try {
      a a = new a();
      this(paramNoDisturbBean, paramb);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(String paramString, b paramb) {
    try {
      b b1 = new b();
      this(paramb);
      b1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[] { paramString });
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(a parama) {
    try {
      c c1 = new c();
      this(parama);
      c1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Boolean> {
    private b a;
    
    private NoDisturbBean b;
    
    a(NoDisturbBean param1NoDisturbBean, b param1b) {
      this.a = param1b;
      this.b = param1NoDisturbBean;
    }
    
    protected Boolean a(String... param1VarArgs) {
      try {
        boolean bool = com.allinone.callerid.f.j.a.b().e(this.b);
        return Boolean.valueOf(bool);
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      b b1 = this.a;
      if (b1 != null)
        b1.a(param1Boolean.booleanValue()); 
    }
  }
  
  private static class b extends AsyncTask<String, Void, Boolean> {
    b a;
    
    b(b param1b) {
      this.a = param1b;
    }
    
    protected Boolean a(String... param1VarArgs) {
      String str = param1VarArgs[0];
      try {
        boolean bool = com.allinone.callerid.f.j.a.b().a(str);
        return Boolean.valueOf(bool);
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      b b1 = this.a;
      if (b1 != null)
        b1.a(param1Boolean.booleanValue()); 
    }
  }
  
  private static class c extends AsyncTask<String, Void, ArrayList<NoDisturbBean>> {
    a a;
    
    c(a param1a) {
      this.a = param1a;
    }
    
    protected ArrayList<NoDisturbBean> a(String... param1VarArgs) {
      try {
        return (ArrayList)com.allinone.callerid.f.j.a.b().d();
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(ArrayList<NoDisturbBean> param1ArrayList) {
      super.onPostExecute(param1ArrayList);
      a a1 = this.a;
      if (a1 != null)
        a1.a(param1ArrayList); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/k/e/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */