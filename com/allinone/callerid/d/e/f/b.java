package com.allinone.callerid.d.e.f;

import android.os.AsyncTask;
import com.allinone.callerid.callscreen.bean.DownloadInfo;

public class b {
  public static void a(DownloadInfo paramDownloadInfo, a parama) {
    (new a(paramDownloadInfo, parama)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  private static class a extends AsyncTask<String, String, Boolean> {
    private a a;
    
    private DownloadInfo b;
    
    a(DownloadInfo param1DownloadInfo, a param1a) {
      this.b = param1DownloadInfo;
      this.a = param1a;
    }
    
    protected Boolean a(String... param1VarArgs) {
      try {
        boolean bool = com.allinone.callerid.d.b.b.b().a(this.b);
        return Boolean.valueOf(bool);
      } catch (Exception exception) {
        exception.printStackTrace();
        return Boolean.FALSE;
      } 
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a a1 = this.a;
      if (a1 != null)
        a1.a(param1Boolean.booleanValue(), this.b); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */