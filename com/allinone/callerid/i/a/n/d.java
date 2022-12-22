package com.allinone.callerid.i.a.n;

import android.os.AsyncTask;
import com.allinone.callerid.bean.ParserIpBean;

class d {
  static void a(b paramb) {
    try {
      a a = new a();
      this(paramb);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, ParserIpBean> {
    private b a;
    
    a(b param1b) {
      this.a = param1b;
    }
    
    protected ParserIpBean a(String... param1VarArgs) {
      return c.a().b();
    }
    
    protected void b(ParserIpBean param1ParserIpBean) {
      super.onPostExecute(param1ParserIpBean);
      this.a.a(param1ParserIpBean);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/n/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */