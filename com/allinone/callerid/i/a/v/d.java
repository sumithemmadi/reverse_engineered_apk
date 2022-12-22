package com.allinone.callerid.i.a.v;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.CallLog;
import android.provider.ContactsContract;
import com.allinone.callerid.bean.ReportedContent;
import com.allinone.callerid.f.f;
import com.allinone.callerid.f.g;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i;
import com.allinone.callerid.util.i1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class d {
  public static void a(Context paramContext, List<CallLogBean> paramList, List<String> paramList1, HashMap<String, Integer> paramHashMap, c paramc) {
    try {
      a a = new a();
      this(paramContext, paramList, paramList1, paramHashMap, paramc);
      a.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(Context paramContext, List<CallLogBean> paramList, List<String> paramList1, HashMap<String, Integer> paramHashMap, c paramc) {
    try {
      b b = new b();
      this(paramContext, paramList, paramList1, paramHashMap, paramc);
      b.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(int paramInt1, int paramInt2, int paramInt3, e parame) {
    try {
      c c = new c();
      this(paramInt1, paramInt2, paramInt3, parame);
      c.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(ReportedContent paramReportedContent) {
    try {
      d d1 = new d();
      this(paramReportedContent);
      d1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private ArrayList<CallLogBean> a = new ArrayList<CallLogBean>();
    
    private Context b;
    
    private List<CallLogBean> c;
    
    private List<String> d;
    
    private HashMap<String, Integer> e;
    
    private c f;
    
    a(Context param1Context, List<CallLogBean> param1List, List<String> param1List1, HashMap<String, Integer> param1HashMap, c param1c) {
      this.b = param1Context;
      this.c = param1List;
      this.d = param1List1;
      this.e = param1HashMap;
      this.f = param1c;
    }
    
    protected String a(String... param1VarArgs) {
      String str2 = "formatted_number";
      String str3 = "numbertype";
      String str4 = "_id";
      String str5 = "name";
      String str6 = "type";
      String str7 = "number";
      String str1 = "date";
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
          byte b = 0;
          Cursor cursor = this.b.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[] { "date", "number", "type", "name", "_id", "numbertype", "numberlabel", "formatted_number" }, null, null, "date DESC");
          if (cursor != null && cursor.getCount() > 0) {
            ArrayList<CallLogBean> arrayList1 = new ArrayList();
            this();
            this.a = arrayList1;
            this.c.clear();
            this.d.clear();
            this.e.clear();
            cursor.moveToFirst();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            this("yyyyMMdd", Locale.getDefault());
            while (b < cursor.getCount()) {
              String str8;
              cursor.moveToPosition(b);
              Date date = new Date();
              this(cursor.getLong(cursor.getColumnIndex(str1)));
              String str9 = cursor.getString(cursor.getColumnIndex(str7));
              int i = cursor.getInt(cursor.getColumnIndex(str6));
              String str10 = cursor.getString(cursor.getColumnIndex(str5));
              int j = Build.VERSION.SDK_INT;
              if (j >= 21) {
                str8 = cursor.getString(cursor.getColumnIndex(str2));
              } else {
                str8 = "";
              } 
              int k = cursor.getInt(cursor.getColumnIndex(str4));
              j = cursor.getInt(cursor.getColumnIndex(str3));
              String str11 = simpleDateFormat.format(date);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str9);
              stringBuilder.append(i);
              stringBuilder.append(str11);
              stringBuilder.append("");
              str11 = stringBuilder.toString();
              if (this.d.contains(str11)) {
                i = ((Integer)this.e.get(str11)).intValue();
                this.e.put(str11, Integer.valueOf(i + 1));
              } else {
                this.d.add(str11);
                this.e.put(str11, Integer.valueOf(1));
                String str = cursor.getString(cursor.getColumnIndex("numberlabel"));
                if (j == 0 && str == null) {
                  str = "";
                } else {
                  str = (String)ContactsContract.CommonDataKinds.Phone.getTypeLabel(EZCallApplication.c().getResources(), j, str);
                } 
                if (str10 == null || "".equals(str10)) {
                  EZSearchContacts eZSearchContacts = f.b().d(str9);
                  if (eZSearchContacts != null && ((eZSearchContacts.getName() != null && !"".equals(eZSearchContacts.getName())) || (eZSearchContacts.getType_label() != null && !"".equals(eZSearchContacts.getType_label())))) {
                    CallLogBean callLogBean = new CallLogBean();
                    this();
                    callLogBean.x0(k);
                    callLogBean.a1(str11);
                    callLogBean.D0(str9);
                    callLogBean.g0(str8);
                    callLogBean.B0("");
                    callLogBean.E0(str);
                    callLogBean.c1(i);
                    callLogBean.r0(i.c(date));
                    callLogBean.h1(i.h(date));
                    callLogBean.d0(date);
                    callLogBean.O0(eZSearchContacts.isSearched());
                    callLogBean.d1(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
                    callLogBean.e1(eZSearchContacts.getType_label());
                    callLogBean.K0(eZSearchContacts.getReport_count());
                    callLogBean.e0(eZSearchContacts.getBelong_area());
                    callLogBean.L0(eZSearchContacts.getName());
                    if (eZSearchContacts.getType() != null && ("Mobile".equals(eZSearchContacts.getType()) || "Fixed line".equals(eZSearchContacts.getType())))
                      callLogBean.N0(i1.J((Context)EZCallApplication.c(), eZSearchContacts.getType())); 
                    callLogBean.Z0(eZSearchContacts.getTel_number());
                    callLogBean.Y0(eZSearchContacts.getT_p());
                    callLogBean.F0(eZSearchContacts.getOld_tel_number());
                    callLogBean.w0(eZSearchContacts.getFormat_tel_number());
                    callLogBean.G0(eZSearchContacts.getOperator());
                    callLogBean.a0(eZSearchContacts.getAddress());
                    callLogBean.b0(eZSearchContacts.getAvatar());
                    callLogBean.v0(eZSearchContacts.getFb_avatar());
                    callLogBean.f1(eZSearchContacts.getType_tags());
                    callLogBean.C0(eZSearchContacts.getName_tags());
                    callLogBean.n0(eZSearchContacts.getComment_tags());
                    callLogBean.q0(eZSearchContacts.getCountry());
                    callLogBean.M0(eZSearchContacts.getSearch_time());
                    callLogBean.u0(eZSearchContacts.getFaild_error_log());
                    this.a.add(callLogBean);
                  } 
                } 
              } 
              b++;
            } 
          } 
          if (cursor != null)
            cursor.close(); 
          ArrayList<CallLogBean> arrayList = this.a;
          if (arrayList != null && arrayList.size() > 0) {
            this.c.clear();
            this.c.addAll(this.a);
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if (this.c.size() > 0)
        this.f.a(this.c, this.e); 
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private ArrayList<CallLogBean> a = new ArrayList<CallLogBean>();
    
    private Context b;
    
    private List<CallLogBean> c;
    
    private List<String> d;
    
    private HashMap<String, Integer> e;
    
    private c f;
    
    b(Context param1Context, List<CallLogBean> param1List, List<String> param1List1, HashMap<String, Integer> param1HashMap, c param1c) {
      this.b = param1Context;
      this.c = param1List;
      this.d = param1List1;
      this.e = param1HashMap;
      this.f = param1c;
    }
    
    protected String a(String... param1VarArgs) {
      String str2 = "formatted_number";
      String str3 = "numbertype";
      String str4 = "_id";
      String str5 = "name";
      String str6 = "type";
      String str7 = "number";
      String str1 = "date";
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
          Cursor cursor = this.b.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[] { "date", "number", "type", "name", "_id", "numbertype", "numberlabel", "formatted_number" }, null, null, "date DESC");
          if (cursor != null && cursor.getCount() > 0) {
            ArrayList<CallLogBean> arrayList1 = new ArrayList();
            this();
            this.a = arrayList1;
            this.c.clear();
            this.d.clear();
            this.e.clear();
            cursor.moveToFirst();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            this("yyyyMMdd", Locale.getDefault());
            for (byte b1 = 0; b1 < cursor.getCount(); b1++) {
              String str8;
              cursor.moveToPosition(b1);
              Date date = new Date();
              this(cursor.getLong(cursor.getColumnIndex(str1)));
              String str9 = cursor.getString(cursor.getColumnIndex(str7));
              int i = cursor.getInt(cursor.getColumnIndex(str6));
              String str10 = cursor.getString(cursor.getColumnIndex(str5));
              int j = Build.VERSION.SDK_INT;
              if (j >= 21) {
                str8 = cursor.getString(cursor.getColumnIndex(str2));
              } else {
                str8 = "";
              } 
              j = cursor.getInt(cursor.getColumnIndex(str4));
              int k = cursor.getInt(cursor.getColumnIndex(str3));
              String str11 = simpleDateFormat.format(date);
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str9);
              stringBuilder.append(i);
              stringBuilder.append(str11);
              stringBuilder.append("");
              String str12 = stringBuilder.toString();
              if (this.d.contains(str12)) {
                i = ((Integer)this.e.get(str12)).intValue();
                this.e.put(str12, Integer.valueOf(i + 1));
              } else {
                this.d.add(str12);
                this.e.put(str12, Integer.valueOf(1));
                str11 = cursor.getString(cursor.getColumnIndex("numberlabel"));
                if (k == 0 && str11 == null) {
                  str11 = "";
                } else {
                  str11 = (String)ContactsContract.CommonDataKinds.Phone.getTypeLabel(EZCallApplication.c().getResources(), k, str11);
                } 
                if (str10 == null || "".equals(str10)) {
                  CallLogBean callLogBean = new CallLogBean();
                  this();
                  callLogBean.x0(j);
                  callLogBean.a1(str12);
                  callLogBean.D0(str9);
                  callLogBean.g0(str8);
                  callLogBean.B0("");
                  callLogBean.E0(str11);
                  callLogBean.c1(i);
                  callLogBean.r0(i.c(date));
                  callLogBean.h1(i.h(date));
                  callLogBean.d0(date);
                  this.a.add(callLogBean);
                } 
              } 
            } 
          } 
          if (cursor != null)
            cursor.close(); 
          ArrayList<CallLogBean> arrayList = this.a;
          if (arrayList != null && arrayList.size() > 0) {
            this.c.clear();
            this.c.addAll(this.a);
          } 
          List<CallLogBean> list = this.c;
          if (list != null && list.size() != 0)
            for (byte b1 = 0; b1 < this.c.size(); b1++) {
              CallLogBean callLogBean = this.c.get(b1);
              EZSearchContacts eZSearchContacts = f.b().d(callLogBean.p());
              if (eZSearchContacts != null) {
                callLogBean.O0(eZSearchContacts.isSearched());
                callLogBean.d1(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
                callLogBean.e1(eZSearchContacts.getType_label());
                callLogBean.K0(eZSearchContacts.getReport_count());
                callLogBean.e0(eZSearchContacts.getBelong_area());
                callLogBean.L0(eZSearchContacts.getName());
                if (eZSearchContacts.getType() != null && ("Mobile".equals(eZSearchContacts.getType()) || "Fixed line".equals(eZSearchContacts.getType())))
                  callLogBean.N0(i1.J((Context)EZCallApplication.c(), eZSearchContacts.getType())); 
                callLogBean.Z0(eZSearchContacts.getTel_number());
                callLogBean.Y0(eZSearchContacts.getT_p());
                callLogBean.F0(eZSearchContacts.getOld_tel_number());
                callLogBean.w0(eZSearchContacts.getFormat_tel_number());
                callLogBean.G0(eZSearchContacts.getOperator());
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
            }  
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if (this.c.size() > 0)
        this.f.a(this.c, this.e); 
    }
  }
  
  private static class c extends AsyncTask<String, Void, String> {
    private ArrayList<CallLogBean> a;
    
    int b;
    
    int c;
    
    int d;
    
    e e;
    
    c(int param1Int1, int param1Int2, int param1Int3, e param1e) {
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1e;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        List<?> list = g.a().b();
        if (list != null && list.size() > 0) {
          ArrayList<CallLogBean> arrayList = new ArrayList();
          this();
          this.a = arrayList;
          a a = new a();
          this(this);
          Collections.sort(list, a);
          for (byte b = 0; b < list.size(); b++) {
            ReportedContent reportedContent = (ReportedContent)list.get(b);
            CallLogBean callLogBean = new CallLogBean();
            this();
            callLogBean.D0(reportedContent.getNumber());
            Date date = new Date();
            this(reportedContent.getTime());
            callLogBean.d0(date);
            String str = reportedContent.getType();
            byte b1 = -1;
            int i = str.hashCode();
            if (i != -906718361) {
              if (i != 2082217073) {
                if (i == 2082229566 && str.equals("is_spam"))
                  b1 = 1; 
              } else if (str.equals("is_scam")) {
                b1 = 0;
              } 
            } else if (str.equals("is_telemarketing")) {
              b1 = 2;
            } 
            if (b1 != 0) {
              if (b1 != 1) {
                if (b1 == 2)
                  this.d++; 
              } else {
                this.c++;
              } 
            } else {
              this.b++;
            } 
            callLogBean.a1(reportedContent.getType());
            EZSearchContacts eZSearchContacts = f.b().d(callLogBean.p());
            if (eZSearchContacts != null) {
              callLogBean.O0(eZSearchContacts.isSearched());
              String str1 = callLogBean.N();
              if (str1 == null || "".equals(callLogBean.N())) {
                callLogBean.d1(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
                callLogBean.e1(eZSearchContacts.getType_label());
              } 
              if (callLogBean.B() == null || "".equals(callLogBean.B()))
                callLogBean.N0(eZSearchContacts.getType()); 
              if (callLogBean.i() == null || "".equals(callLogBean.i()))
                callLogBean.w0(eZSearchContacts.getFormat_tel_number()); 
              if (callLogBean.t() == null || "".equals(callLogBean.t()))
                callLogBean.G0(eZSearchContacts.getOperator()); 
              if (callLogBean.c() == null || "".equals(callLogBean.c()))
                callLogBean.e0(eZSearchContacts.getBelong_area()); 
              if (callLogBean.x() == null || "".equals(callLogBean.x()))
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
        return "5887";
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if ("5887".equals(param1String))
        this.e.a(this.a, this.b, this.c, this.d); 
    }
    
    class a implements Comparator<ReportedContent> {
      a(d.c this$0) {}
      
      public int a(ReportedContent param2ReportedContent1, ReportedContent param2ReportedContent2) {
        return (int)param2ReportedContent2.getTime() - (int)param2ReportedContent1.getTime();
      }
    }
  }
  
  class a implements Comparator<ReportedContent> {
    a(d this$0) {}
    
    public int a(ReportedContent param1ReportedContent1, ReportedContent param1ReportedContent2) {
      return (int)param1ReportedContent2.getTime() - (int)param1ReportedContent1.getTime();
    }
  }
  
  private static class d extends AsyncTask<String, Void, Boolean> {
    private ReportedContent a;
    
    d(ReportedContent param1ReportedContent) {
      this.a = param1ReportedContent;
    }
    
    protected Boolean a(String... param1VarArgs) {
      g.a().c(this.a);
      return Boolean.TRUE;
    }
    
    protected void b(Boolean param1Boolean) {
      super.onPostExecute(param1Boolean);
      b.p.a.a.b((Context)EZCallApplication.c()).d(new Intent("com.allinone.callerid.REPROT_NUMBER"));
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/v/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */