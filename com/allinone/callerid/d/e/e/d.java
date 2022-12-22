package com.allinone.callerid.d.e.e;

import android.os.AsyncTask;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.d.b.c;
import com.allinone.callerid.d.b.e;
import com.allinone.callerid.util.f1;

public class d {
  public static void a(HomeInfo paramHomeInfo, c paramc) {
    (new a(paramHomeInfo, paramc)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static void b(c paramc) {
    (new b(paramc)).executeOnExecutor(f1.a(), (Object[])new String[0]);
  }
  
  private static class a extends AsyncTask<String, String, HomeInfo> {
    private c a;
    
    private HomeInfo b;
    
    public a(HomeInfo param1HomeInfo, c param1c) {
      this.a = param1c;
      this.b = param1HomeInfo;
    }
    
    protected HomeInfo a(String... param1VarArgs) {
      try {
        e.e().a(this.b);
        c.d().c(this.b.getPath());
        return this.b;
      } catch (Exception exception) {
        exception.printStackTrace();
        this.b = null;
        return null;
      } 
    }
    
    protected void b(HomeInfo param1HomeInfo) {
      super.onPostExecute(param1HomeInfo);
      c c1 = this.a;
      if (c1 != null)
        c1.a(true, param1HomeInfo); 
    }
  }
  
  private static class b extends AsyncTask<String, String, HomeInfo> {
    private c a;
    
    public b(c param1c) {
      this.a = param1c;
    }
    
    protected HomeInfo a(String... param1VarArgs) {
      try {
        return e.e().f();
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(HomeInfo param1HomeInfo) {
      super.onPostExecute(param1HomeInfo);
      c c1 = this.a;
      if (c1 != null)
        c1.a(true, param1HomeInfo); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */