package com.allinone.callerid.i.a.d0;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.service.MyService;
import com.allinone.callerid.util.i1;

public class b {
  public static void a(Context paramContext, a parama) {
    try {
      a a1 = new a();
      this(paramContext, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private Context b;
    
    a(Context param1Context, a param1a) {
      this.a = param1a;
      this.b = param1Context;
    }
    
    protected Boolean a(String... param1VarArgs) {
      boolean bool;
      try {
        bool = i1.s0(this.b, MyService.class.getName());
      } catch (Exception exception) {
        exception.printStackTrace();
        bool = false;
      } 
      return Boolean.valueOf(bool);
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      this.a.a(param1Boolean.booleanValue());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/d0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */