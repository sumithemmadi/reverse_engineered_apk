package com.allinone.callerid.i.a.t;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.util.i1;

public class b {
  public static void a(Context paramContext, String paramString, a parama) {
    try {
      a a1 = new a();
      this(paramContext, paramString, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Context paramContext, String paramString, a parama) {
    try {
      b b1 = new b();
      this(paramContext, paramString, parama);
      b1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, EZSearchContacts> {
    private a a;
    
    private String b;
    
    private EZSearchContacts c;
    
    private Context d;
    
    a(Context param1Context, String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
      this.d = param1Context;
    }
    
    protected EZSearchContacts a(String... param1VarArgs) {
      try {
        if (!i1.Y(this.d, this.b)) {
          EZSearchContacts eZSearchContacts = f.b().d(this.b);
          this.c = eZSearchContacts;
          if (eZSearchContacts == null) {
            eZSearchContacts = new EZSearchContacts();
            this();
            this.c = eZSearchContacts;
            eZSearchContacts.setOld_tel_number(this.b);
          } 
          if (System.currentTimeMillis() - this.c.getWeekoutingtime() < 604800000L) {
            eZSearchContacts = this.c;
            eZSearchContacts.setWeekoutingnum(eZSearchContacts.getWeekoutingnum() + 1);
          } else {
            this.c.setWeekoutingnum(1);
            this.c.setWeekoutingtime(0L);
          } 
          if (this.c.getWeekoutingtime() == 0L)
            this.c.setWeekoutingtime(System.currentTimeMillis()); 
          f.b().c(this.c);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return this.c;
    }
    
    protected void b(EZSearchContacts param1EZSearchContacts) {
      super.onPostExecute(param1EZSearchContacts);
      a a1 = this.a;
      if (a1 != null)
        a1.a(param1EZSearchContacts); 
    }
  }
  
  private static class b extends AsyncTask<String, Void, EZSearchContacts> {
    private a a;
    
    private String b;
    
    private EZSearchContacts c;
    
    private Context d;
    
    b(Context param1Context, String param1String, a param1a) {
      this.a = param1a;
      this.b = param1String;
      this.d = param1Context;
    }
    
    protected EZSearchContacts a(String... param1VarArgs) {
      try {
        if (!i1.Y(this.d, this.b)) {
          EZSearchContacts eZSearchContacts = f.b().d(this.b);
          this.c = eZSearchContacts;
          if (eZSearchContacts == null) {
            eZSearchContacts = new EZSearchContacts();
            this();
            this.c = eZSearchContacts;
            eZSearchContacts.setOld_tel_number(this.b);
          } 
          if (System.currentTimeMillis() - this.c.getLongnumberdate() < 604800000L) {
            eZSearchContacts = this.c;
            eZSearchContacts.setOnedayincomingah(eZSearchContacts.getOnedayincomingah() + 1);
          } else {
            this.c.setOnedayincomingah(1);
            this.c.setLongnumberdate(0L);
          } 
          if (this.c.getLongnumberdate() == 0L)
            this.c.setLongnumberdate(System.currentTimeMillis()); 
          f.b().c(this.c);
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


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/t/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */