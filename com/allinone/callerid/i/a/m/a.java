package com.allinone.callerid.i.a.m;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.o0;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;

public class a {
  public static void a(Context paramContext, String paramString1, String paramString2, b paramb) {
    try {
      a a1 = new a();
      this(paramContext, paramString1, paramString2, paramb);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, EZSearchContacts> {
    private b a;
    
    private String b;
    
    private EZSearchContacts c;
    
    private Context d;
    
    private String e;
    
    a(Context param1Context, String param1String1, String param1String2, b param1b) {
      this.a = param1b;
      this.b = param1String1;
      this.d = param1Context.getApplicationContext();
      this.e = param1String2;
    }
    
    protected EZSearchContacts a(String... param1VarArgs) {
      try {
        boolean bool = d0.a;
        if (bool) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("通话记录数据库没查到，去离线数据库查询: ");
          stringBuilder.append(this.e);
          d0.a("wbb", stringBuilder.toString());
        } 
        String str = p.d(this.d).getCountry_code();
        if (str != null && !"".equals(str)) {
          String str1 = this.e;
          if (str1 != null && !"".equals(str1)) {
            str1 = this.e;
          } else {
            str1 = i1.g(this.d, this.b, str);
          } 
          if (str1 != null && !"".equals(str1)) {
            if (d0.a) {
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("离线数据库search_number: ");
              stringBuilder.append(str1);
              d0.a("wbb", stringBuilder.toString());
            } 
            if (i1.k0()) {
              g0.K(this.d);
              q.b().d("search_offline_db_new");
              g0.L(this.d);
              if (d0.a)
                d0.a("wbb", "离线数据库 isHaveOfflineDb"); 
              o0 o0 = new o0();
              this(this.d);
              EZSearchContacts eZSearchContacts = o0.a(str1, this.b);
              this.c = eZSearchContacts;
              if (eZSearchContacts != null) {
                g0.M(this.d);
                q.b().d("search_offline_db_success_new");
                g0.N(this.d);
                if (d0.a)
                  d0.a("wbb", "SearchOfflineData查询成功"); 
                f.b().c(this.c);
              } 
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return this.c;
    }
    
    protected void b(EZSearchContacts param1EZSearchContacts) {
      super.onPostExecute(param1EZSearchContacts);
      this.a.a(param1EZSearchContacts);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/m/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */