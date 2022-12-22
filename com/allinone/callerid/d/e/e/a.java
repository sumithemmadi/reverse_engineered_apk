package com.allinone.callerid.d.e.e;

import android.content.Context;
import android.os.AsyncTask;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.d.b.e;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import java.util.List;

public class a {
  public static void a(String paramString, b paramb) {
    (new c(paramString, paramb)).executeOnExecutor(f1.a(), (Object[])new String[0]);
  }
  
  public static void b(HomeInfo paramHomeInfo, List<PersonaliseContact> paramList, a parama) {
    (new b(paramHomeInfo, paramList, parama)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
  }
  
  public static interface a {
    void a(boolean param1Boolean);
  }
  
  private static class b extends AsyncTask<String, Void, Boolean> {
    private a.a a;
    
    private HomeInfo b;
    
    private List<PersonaliseContact> c;
    
    b(HomeInfo param1HomeInfo, List<PersonaliseContact> param1List, a.a param1a) {
      this.a = param1a;
      this.b = param1HomeInfo;
      this.c = param1List;
    }
    
    protected Boolean a(String... param1VarArgs) {
      try {
        List<PersonaliseContact> list = this.c;
        if (list != null && list.size() > 0) {
          for (PersonaliseContact personaliseContact2 : this.c) {
            PersonaliseContact personaliseContact1 = new PersonaliseContact();
            this();
            personaliseContact1.setDataId(this.b.getData_id());
            personaliseContact1.setContacts_id(personaliseContact2.getContacts_id());
            personaliseContact1.setName(personaliseContact2.getName());
            personaliseContact1.setNumber(personaliseContact2.getNumber());
            personaliseContact1.setPath(this.b.getPath());
            personaliseContact1.setThemtname(this.b.getName());
            personaliseContact1.setSortLetters(personaliseContact2.getSortLetters());
            personaliseContact1.setIsdiy(this.b.isIsdiy());
            personaliseContact1.setUseVideoAudioRing(this.b.isUseVideoAudioRing());
            com.allinone.callerid.d.b.c.d().a(personaliseContact1);
          } 
          if (this.b.isIsdefault())
            e.e().c(this.b.getPath()); 
        } 
        return Boolean.TRUE;
      } catch (Exception exception) {
        exception.printStackTrace();
        return Boolean.FALSE;
      } 
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      a.a a1 = this.a;
      if (a1 != null)
        a1.a(param1Boolean.booleanValue()); 
    }
  }
  
  private static class c extends AsyncTask<String, String, PersonaliseContact> {
    private b a;
    
    private String b;
    
    c(String param1String, b param1b) {
      this.a = param1b;
      this.b = param1String;
    }
    
    protected PersonaliseContact a(String... param1VarArgs) {
      try {
        int i = i1.Z((Context)EZCallApplication.c(), this.b);
        return (i != 0) ? com.allinone.callerid.d.b.c.d().f(String.valueOf(i)) : com.allinone.callerid.d.b.c.d().g(this.b);
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(PersonaliseContact param1PersonaliseContact) {
      super.onPostExecute(param1PersonaliseContact);
      b b1 = this.a;
      if (b1 != null)
        b1.a(param1PersonaliseContact); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */