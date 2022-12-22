package com.allinone.callerid.d.e.g;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.d.f.e;
import com.allinone.callerid.main.EZCallApplication;
import java.util.List;

public class b {
  public static void a(String paramString1, String paramString2, List<PersonaliseContact> paramList, a parama) {
    (new a(paramString1, paramString2, paramList, parama)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static void b(String paramString1, String paramString2, a parama) {
    (new b(paramString1, paramString2, parama)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  private static class a extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    private String c;
    
    private List<PersonaliseContact> d;
    
    a(String param1String1, String param1String2, List<PersonaliseContact> param1List, a param1a) {
      this.a = param1a;
      this.b = param1String1;
      this.c = param1String2;
      this.d = param1List;
    }
    
    protected Boolean a(String... param1VarArgs) {
      try {
        List<PersonaliseContact> list = this.d;
        if (list != null && list.size() > 0)
          for (PersonaliseContact personaliseContact : this.d)
            e.b((Context)EZCallApplication.c(), this.b, this.c, personaliseContact.getContacts_id());  
        return Boolean.TRUE;
      } catch (Exception exception) {
        exception.printStackTrace();
        return Boolean.FALSE;
      } 
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a a1 = this.a;
      if (a1 != null)
        a1.a(param1Boolean.booleanValue()); 
    }
  }
  
  private static class b extends AsyncTask<String, Void, Boolean> {
    private a a;
    
    private String b;
    
    private String c;
    
    b(String param1String1, String param1String2, a param1a) {
      this.a = param1a;
      this.b = param1String1;
      this.c = param1String2;
    }
    
    protected Boolean a(String... param1VarArgs) {
      try {
        boolean bool = e.a((Context)EZCallApplication.c(), this.b, this.c);
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
        a1.a(param1Boolean.booleanValue()); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */