package com.allinone.callerid.i.a.v;

import android.os.AsyncTask;
import com.allinone.callerid.bean.SubType;
import com.allinone.callerid.f.e;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.q;

public class f {
  public static void a(SubType paramSubType, boolean paramBoolean1, boolean paramBoolean2, String paramString, CallLogBean paramCallLogBean) {
    try {
      a a = new a();
      this(paramSubType, paramBoolean1, paramBoolean2, paramString, paramCallLogBean);
      a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private SubType a;
    
    private boolean b;
    
    private boolean c;
    
    private String d;
    
    private CallLogBean e = null;
    
    a(SubType param1SubType, boolean param1Boolean1, boolean param1Boolean2, String param1String, CallLogBean param1CallLogBean) {
      this.a = param1SubType;
      this.b = param1Boolean1;
      this.c = param1Boolean2;
      this.d = param1String;
      this.e = param1CallLogBean;
    }
    
    protected String a(String... param1VarArgs) {
      if (this.b) {
        try {
          EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(this.d);
          if (eZSearchContacts != null) {
            byte b;
            String str1 = this.a.getSubtype();
            if (str1 != null && !"".equals(str1)) {
              if (this.c && !str1.equals(eZSearchContacts.getSubtype_pdt())) {
                CallLogBean callLogBean = this.e;
                if (callLogBean != null && !"".equals(callLogBean.H()))
                  q.b().c("subtype_editchild"); 
              } 
              eZSearchContacts.setSubtype_pdt(str1);
              com.allinone.callerid.f.f.b().e(eZSearchContacts, new String[] { "subtype_pdt" });
            } 
            String str2 = this.a.getType();
            if (str2 != null && !"".equals(str2)) {
              eZSearchContacts.setType_label(str2);
              com.allinone.callerid.f.f.b().e(eZSearchContacts, new String[] { "type_label" });
            } 
            if (eZSearchContacts.getReport_count() != null && !"".equals(eZSearchContacts.getReport_count())) {
              b = Integer.parseInt(eZSearchContacts.getReport_count());
            } else {
              b = 0;
            } 
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(b + 1);
            stringBuilder.append("");
            eZSearchContacts.setReport_count(stringBuilder.toString());
            com.allinone.callerid.f.f.b().e(eZSearchContacts, new String[] { "report_count" });
          } 
          e.d().h(this.d);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        try {
          EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(this.d);
          if (eZSearchContacts != null) {
            if (this.c && eZSearchContacts.getSubtype_pdt() != null)
              "".equals(eZSearchContacts.getSubtype_pdt()); 
            eZSearchContacts.setSubtype_pdt("");
            com.allinone.callerid.f.f.b().e(eZSearchContacts, new String[] { "subtype_pdt" });
            eZSearchContacts.setType_label("");
            com.allinone.callerid.f.f.b().e(eZSearchContacts, new String[] { "type_label" });
            eZSearchContacts.setReport_count("");
            com.allinone.callerid.f.f.b().e(eZSearchContacts, new String[] { "report_count" });
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/v/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */