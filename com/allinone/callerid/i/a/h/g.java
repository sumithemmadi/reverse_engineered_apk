package com.allinone.callerid.i.a.h;

import android.os.AsyncTask;
import com.allinone.callerid.bean.CollectInfo;
import com.allinone.callerid.f.c;
import java.util.List;

public class g {
  static void a() {
    try {
      a a = new a();
      this();
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static void b(f paramf) {
    try {
      b b = new b();
      this(paramf);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    protected String a(String... param1VarArgs) {
      c.b().a();
      return "ok";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
    }
  }
  
  private static class b extends AsyncTask<String, Void, List<CollectInfo>> {
    private f a;
    
    b(f param1f) {
      this.a = param1f;
    }
    
    protected List<CollectInfo> a(String... param1VarArgs) {
      return c.b().d();
    }
    
    protected void b(List<CollectInfo> param1List) {
      super.onPostExecute(param1List);
      this.a.a(param1List);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */