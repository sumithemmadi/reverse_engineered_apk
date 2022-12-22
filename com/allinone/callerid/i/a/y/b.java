package com.allinone.callerid.i.a.y;

import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import java.util.List;

public class b {
  public static void a(List<CallLogBean> paramList, d paramd) {
    try {
      a a = new a();
      this(paramList, paramd);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, List<CallLogBean>> {
    private d a;
    
    private List<CallLogBean> b;
    
    a(List<CallLogBean> param1List, d param1d) {
      this.a = param1d;
      this.b = param1List;
    }
    
    protected List<CallLogBean> a(String... param1VarArgs) {
      try {
        List<CallLogBean> list = this.b;
        if (list != null && list.size() != 0)
          for (byte b = 0; b < this.b.size(); b++) {
            CallLogBean callLogBean = this.b.get(b);
            EZSearchContacts eZSearchContacts = f.b().d(callLogBean.p());
            if (eZSearchContacts != null)
              callLogBean.k0(eZSearchContacts.getComment_count()); 
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return this.b;
    }
    
    protected void b(List<CallLogBean> param1List) {
      super.onPostExecute(param1List);
      this.a.a(param1List);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/y/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */