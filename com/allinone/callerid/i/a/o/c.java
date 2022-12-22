package com.allinone.callerid.i.a.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import com.allinone.callerid.bean.BlockCall;
import com.allinone.callerid.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class c {
  public static void a(a parama) {
    try {
      a a1 = new a();
      this(parama);
      if (a1.getStatus() != AsyncTask.Status.RUNNING) {
        a1.cancel(true);
        a1 = new a();
        this(parama);
        a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(b paramb) {
    try {
      b b1 = new b();
      this(paramb);
      b1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(a parama, ArrayList<CallLogBean> paramArrayList) {
    try {
      c c1 = new c();
      this(parama, paramArrayList);
      if (c1.getStatus() != AsyncTask.Status.RUNNING) {
        c1.cancel(true);
        c1 = new c();
        this(parama, paramArrayList);
        c1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    ArrayList<CallLogBean> a;
    
    a b;
    
    a(a param1a) {
      this.b = param1a;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        List<?> list = com.allinone.callerid.f.b.a().b();
        if (list != null && list.size() > 0) {
          ArrayList<CallLogBean> arrayList = new ArrayList();
          this();
          this.a = arrayList;
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("blockedlist:");
            stringBuilder.append(list.toString());
            d0.a("blockcall", stringBuilder.toString());
          } 
          a a1 = new a();
          this(this);
          Collections.sort(list, a1);
          for (byte b = 0; b < list.size(); b++) {
            BlockCall blockCall = (BlockCall)list.get(b);
            CallLogBean callLogBean = new CallLogBean();
            this();
            callLogBean.D0(blockCall.getNumber());
            Date date = new Date();
            this(blockCall.getTime());
            callLogBean.d0(date);
            EZSearchContacts eZSearchContacts = f.b().d(callLogBean.p());
            if (eZSearchContacts != null) {
              callLogBean.O0(eZSearchContacts.isSearched());
              if (eZSearchContacts.getType() != null && ("Mobile".equals(eZSearchContacts.getType()) || "Fixed line".equals(eZSearchContacts.getType())))
                callLogBean.N0(i1.J((Context)EZCallApplication.c(), eZSearchContacts.getType())); 
              callLogBean.d1(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
              callLogBean.e1(eZSearchContacts.getType_label());
              callLogBean.w0(eZSearchContacts.getFormat_tel_number());
              callLogBean.G0(eZSearchContacts.getOperator());
              callLogBean.e0(eZSearchContacts.getBelong_area());
              callLogBean.K0(eZSearchContacts.getReport_count());
              callLogBean.L0(eZSearchContacts.getName());
              callLogBean.Z0(eZSearchContacts.getTel_number());
              callLogBean.Y0(eZSearchContacts.getT_p());
              callLogBean.F0(eZSearchContacts.getOld_tel_number());
              callLogBean.a0(eZSearchContacts.getAddress());
              callLogBean.b0(eZSearchContacts.getAvatar());
              callLogBean.v0(eZSearchContacts.getFb_avatar());
              callLogBean.f1(eZSearchContacts.getType_tags());
              callLogBean.C0(eZSearchContacts.getName_tags());
              callLogBean.n0(eZSearchContacts.getComment_tags());
              callLogBean.q0(eZSearchContacts.getCountry());
              callLogBean.M0(eZSearchContacts.getSearch_time());
              callLogBean.u0(eZSearchContacts.getFaild_error_log());
            } 
            this.a.add(callLogBean);
          } 
        } 
        return "6888";
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if ("6888".equals(param1String))
        this.b.a(this.a); 
    }
    
    class a implements Comparator<BlockCall> {
      a(c.a this$0) {}
      
      public int a(BlockCall param2BlockCall1, BlockCall param2BlockCall2) {
        return (int)param2BlockCall2.getTime() - (int)param2BlockCall1.getTime();
      }
    }
  }
  
  class a implements Comparator<BlockCall> {
    a(c this$0) {}
    
    public int a(BlockCall param1BlockCall1, BlockCall param1BlockCall2) {
      return (int)param1BlockCall2.getTime() - (int)param1BlockCall1.getTime();
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    b a;
    
    private int b;
    
    b(b param1b) {
      this.a = param1b;
    }
    
    protected String a(String... param1VarArgs) {
      String str1;
      String str2 = "0";
      try {
        List list = com.allinone.callerid.f.b.a().b();
        str1 = str2;
        if (list != null)
          str1 = String.valueOf(list.size()); 
      } catch (Exception exception) {
        exception.printStackTrace();
        str1 = str2;
      } 
      this.b = b1.w0();
      return str1;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(param1String, this.b);
    }
  }
  
  private static class c extends AsyncTask<String, Void, String> {
    ArrayList<CallLogBean> a;
    
    a b;
    
    c(a param1a, ArrayList<CallLogBean> param1ArrayList) {
      this.b = param1a;
      this.a = param1ArrayList;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        ArrayList<CallLogBean> arrayList = this.a;
        if (arrayList != null && arrayList.size() != 0) {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          byte b = 0;
          while (true) {
            int i = this.a.size();
            if (b < i) {
              try {
                CallLogBean callLogBean = this.a.get(b);
                String str = i1.w((Context)EZCallApplication.c(), callLogBean.p());
                if (str != null && !"".equals(str)) {
                  callLogBean.o0(true);
                  callLogBean.B0(str);
                  i = i1.Z((Context)EZCallApplication.c(), callLogBean.p());
                  callLogBean.I0(i);
                  Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                  StringBuilder stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append(i);
                  stringBuilder.append("");
                  String str1 = stringBuilder.toString();
                  Cursor cursor = contentResolver.query(uri, new String[] { "data2" }, "contact_id=?", new String[] { str1 }, null);
                  if (cursor != null && cursor.moveToNext()) {
                    String str2 = cursor.getString(cursor.getColumnIndex("data2"));
                    if (str2 != null && !"".equals(str2)) {
                      i = Integer.parseInt(str2);
                      if (i != 1) {
                        if (i != 2) {
                          if (i != 3) {
                            if (i == 4)
                              callLogBean.E0(EZCallApplication.c().getResources().getString(2131755865)); 
                          } else {
                            callLogBean.E0(EZCallApplication.c().getResources().getString(2131755864));
                          } 
                        } else {
                          callLogBean.E0(EZCallApplication.c().getResources().getString(2131755473));
                        } 
                      } else {
                        callLogBean.E0(EZCallApplication.c().getResources().getString(2131755410));
                      } 
                    } 
                  } 
                  if (cursor != null)
                    cursor.close(); 
                } else {
                  callLogBean.o0(false);
                } 
              } catch (Exception exception) {
                exception.printStackTrace();
              } 
              b++;
              continue;
            } 
            return "8888";
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if ("8888".equals(param1String))
        this.b.a(this.a); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/o/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */