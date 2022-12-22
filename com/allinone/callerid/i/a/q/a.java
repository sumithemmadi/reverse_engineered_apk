package com.allinone.callerid.i.a.q;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.allinone.callerid.customview.SortToken;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q0;
import com.allinone.callerid.util.v;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class a {
  private static ArrayList<CallLogBean> a;
  
  public static void f(f paramf) {
    try {
      a a1 = new a();
      this(paramf);
      if (a1.getStatus() != AsyncTask.Status.RUNNING) {
        a1.cancel(true);
        a1 = new a();
        this(paramf);
        a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void g(Context paramContext, e parame) {
    try {
      b b = new b();
      this(paramContext, parame);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void h(Context paramContext, boolean paramBoolean, g paramg) {
    if (a != null && !paramBoolean) {
      if (d0.a)
        d0.a("tony", "mAllList"); 
      paramg.a(a);
    } else {
      if (d0.a)
        d0.a("tony", "LoadContactTask"); 
      try {
        c c = new c();
        this(paramContext, paramg);
        c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  private static String i(String paramString) {
    String str1 = "#";
    if (paramString == null)
      return "#"; 
    String str2 = ((v.a)v.c().b(paramString).get(0)).c.substring(0, 1).toUpperCase(Locale.CHINESE);
    paramString = str1;
    if (str2.matches("[A-Z]"))
      paramString = str2.toUpperCase(Locale.CHINESE); 
    return paramString;
  }
  
  private static String j(String paramString) {
    if (paramString == null || "".equals(paramString.trim()))
      return null; 
    paramString = ((v.a)v.c().b(paramString).get(0)).c.trim().substring(0, 1).toUpperCase(Locale.CHINESE);
    if (paramString.matches("[A-Z]")) {
      paramString = paramString.toUpperCase(Locale.CHINESE);
    } else {
      paramString = "#";
    } 
    return paramString;
  }
  
  public static void k(List<String> paramList1, List<String> paramList2, List<CallLogBean> paramList, c paramc) {
    try {
      d d = new d();
      this(paramList1, paramList2, paramList, paramc);
      d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void l(Context paramContext, g paramg) {
    try {
      c c = new c();
      this(paramContext, paramg);
      c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static SortToken m(String paramString) {
    SortToken sortToken = new SortToken();
    if (paramString != null && paramString.length() > 0)
      for (String str : paramString.replace(" ", "").split("[\\u4E00-\\u9FA5]+")) {
        if (str.length() > 0) {
          StringBuilder stringBuilder = new StringBuilder(sortToken.b);
          stringBuilder.append(str.charAt(0));
          sortToken.b = String.valueOf(stringBuilder);
          stringBuilder = new StringBuilder(sortToken.c);
          stringBuilder.append(str);
          sortToken.c = String.valueOf(stringBuilder);
        } 
      }  
    return sortToken;
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private f a;
    
    private boolean b;
    
    a(f param1f) {
      this.a = param1f;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        this.b = i1.b0();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.b);
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private e a;
    
    private ArrayList<CallLogBean> b;
    
    private Context c;
    
    b(Context param1Context, e param1e) {
      this.c = param1Context;
      this.a = param1e;
    }
    
    protected String a(String... param1VarArgs) {
      this.b = new ArrayList<CallLogBean>();
      try {
        if (com.allinone.callerid.util.k1.a.c((Context)EZCallApplication.c())) {
          Cursor cursor = EZCallApplication.c().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, "starred = 1 ", null, null);
          if (cursor == null)
            return null; 
          while (true) {
            boolean bool = cursor.moveToNext();
            int i = 0;
            if (bool) {
              String str1;
              String[] arrayOfString;
              String str4;
              long l = cursor.getLong(cursor.getColumnIndex("_id"));
              ContentResolver contentResolver = this.c.getContentResolver();
              Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append("contact_id=");
              stringBuilder.append(Long.toString(l));
              Cursor cursor1 = contentResolver.query(uri, null, stringBuilder.toString(), null, null);
              String str3 = "";
              String str2 = "";
              i = 0;
              while (true) {
                bool = cursor1.moveToNext();
                if (bool) {
                  String str = cursor1.getString(cursor1.getColumnIndex("data1"));
                  StringBuilder stringBuilder1 = new StringBuilder();
                  this();
                  stringBuilder1.append(str2);
                  stringBuilder1.append(str);
                  stringBuilder1.append(":");
                  str2 = stringBuilder1.toString();
                  i = cursor1.getInt(cursor1.getColumnIndex("data2"));
                  continue;
                } 
                cursor1.close();
                str4 = cursor.getString(cursor.getColumnIndex("display_name"));
                try {
                  String str = cursor.getString(cursor.getColumnIndex("photo_uri"));
                } catch (Exception exception) {
                  exception.printStackTrace();
                  stringBuilder = null;
                  continue;
                } 
                str1 = str3;
                if (i != 0)
                  if (i != 1) {
                    if (i != 2) {
                      if (i != 3) {
                        if (i != 4) {
                          str1 = str3;
                        } else {
                          str1 = this.c.getResources().getString(2131755865);
                        } 
                      } else {
                        str1 = this.c.getResources().getString(2131755864);
                      } 
                    } else {
                      str1 = this.c.getResources().getString(2131755473);
                    } 
                  } else {
                    str1 = this.c.getResources().getString(2131755410);
                  }  
                arrayOfString = str2.split(":");
                if (d0.a) {
                  StringBuilder stringBuilder1 = new StringBuilder();
                  this();
                  stringBuilder1.append("numbers:");
                  stringBuilder1.append(str2);
                  d0.a("favourite", stringBuilder1.toString());
                } 
                i = arrayOfString.length;
                if (i == 1) {
                  CallLogBean callLogBean = new CallLogBean();
                  this();
                  callLogBean.B0(str4);
                  callLogBean.D0(arrayOfString[0]);
                  callLogBean.w0(q0.b(arrayOfString[0]));
                  callLogBean.I0((int)l);
                  callLogBean.E0(str1);
                  callLogBean.U0("1");
                  callLogBean.o0(true);
                  callLogBean.H0((String)stringBuilder);
                  this.b.add(callLogBean);
                  continue;
                } 
                break;
              } 
              if (arrayOfString.length > 1) {
                CallLogBean callLogBean = new CallLogBean();
                this();
                callLogBean.B0(str4);
                callLogBean.D0(arrayOfString[0]);
                callLogBean.w0(q0.b(arrayOfString[0]));
                callLogBean.I0((int)l);
                callLogBean.E0(str1);
                callLogBean.U0("1");
                callLogBean.o0(true);
                callLogBean.H0((String)stringBuilder);
                this.b.add(callLogBean);
              } 
              continue;
            } 
            cursor.close();
            ArrayList<CallLogBean> arrayList = this.b;
            if (arrayList != null && arrayList.size() != 0) {
              while (i < this.b.size()) {
                for (int j = this.b.size() - 1; j > i; j--) {
                  if (((CallLogBean)this.b.get(i)).p().equals(((CallLogBean)this.b.get(j)).p()))
                    this.b.remove(j); 
                } 
                i++;
              } 
              ArrayList<CallLogBean> arrayList1 = this.b;
              a a = new a();
              this(this);
              Collections.sort(arrayList1, a);
            } 
            return "999";
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if ("999".equals(param1String))
        this.a.a(this.b); 
    }
    
    class a implements Comparator<CallLogBean> {
      a(a.b this$0) {}
      
      public int a(CallLogBean param2CallLogBean1, CallLogBean param2CallLogBean2) {
        return Collator.getInstance(Locale.getDefault()).compare(param2CallLogBean1.n(), param2CallLogBean2.n());
      }
    }
  }
  
  class a implements Comparator<CallLogBean> {
    a(a this$0) {}
    
    public int a(CallLogBean param1CallLogBean1, CallLogBean param1CallLogBean2) {
      return Collator.getInstance(Locale.getDefault()).compare(param1CallLogBean1.n(), param1CallLogBean2.n());
    }
  }
  
  private static class c extends AsyncTask<String, Void, String> {
    private Context a;
    
    private g b;
    
    c(Context param1Context, g param1g) {
      this.a = param1Context;
      this.b = param1g;
    }
    
    protected String a(String... param1VarArgs) {
      String str1 = "data2";
      String str2 = "starred";
      try {
        if (com.allinone.callerid.util.k1.a.c((Context)EZCallApplication.c())) {
          Cursor cursor = EZCallApplication.c().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "display_name", "data1", "sort_key", "contact_id", "photo_id", "starred", "data2" }, null, null, "sort_key COLLATE LOCALIZED ASC");
          if (cursor == null || cursor.getCount() == 0)
            return null; 
          int i = cursor.getColumnIndex("data1");
          int j = cursor.getColumnIndex("display_name");
          int k = cursor.getColumnIndex("sort_key");
          if (cursor.getCount() > 0) {
            ArrayList arrayList = new ArrayList();
            this();
            a.b(arrayList);
            a.a().clear();
            while (cursor.moveToNext()) {
              String str3;
              String str4 = cursor.getString(i);
              if (TextUtils.isEmpty(str4))
                continue; 
              String str5 = cursor.getString(j);
              String str6 = cursor.getString(k);
              String str7 = cursor.getString(cursor.getColumnIndex(str2));
              String str8 = cursor.getString(cursor.getColumnIndex("photo_id"));
              int m = cursor.getInt(cursor.getColumnIndex("contact_id"));
              int n = cursor.getInt(cursor.getColumnIndex(str1));
              if (n != 1) {
                if (n != 2) {
                  if (n != 3) {
                    if (n != 4) {
                      str3 = "";
                    } else {
                      str3 = this.a.getResources().getString(2131755865);
                    } 
                  } else {
                    str3 = this.a.getResources().getString(2131755864);
                  } 
                } else {
                  str3 = this.a.getResources().getString(2131755473);
                } 
              } else {
                str3 = this.a.getResources().getString(2131755410);
              } 
              CallLogBean callLogBean = new CallLogBean();
              this();
              callLogBean.I0(m);
              callLogBean.U0(str7);
              callLogBean.S0(str6);
              String str9 = a.c(str6);
              str7 = str9;
              if (str9 == null)
                str7 = a.d(str5); 
              callLogBean.r = str7;
              callLogBean.f0 = a.e(str6);
              if (str3 != null && !"".equals(str3)) {
                callLogBean.E0(str3);
                callLogBean.N0(str3);
              } 
              callLogBean.D0(str4);
              callLogBean.w0(q0.b(str4));
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str4);
              stringBuilder.append(":");
              callLogBean.A0(stringBuilder.toString());
              if (str8 != null && !"".equals(str8) && !"0".equals(str8))
                callLogBean.H0(str8); 
              if (str5 != null) {
                callLogBean.B0(str5);
                a.a().add(callLogBean);
              } 
            } 
          } 
          cursor.close();
          try {
            if (a.a() != null && a.a().size() != 0)
              for (j = 0; j < a.a().size(); j++) {
                CallLogBean callLogBean = a.a().get(j);
                if (callLogBean != null) {
                  i = callLogBean.v();
                  for (k = a.a().size() - 1; k > j; k--) {
                    CallLogBean callLogBean1 = a.a().get(k);
                    if (callLogBean1 != null && i == callLogBean1.v()) {
                      String str3 = callLogBean.m();
                      String str4 = callLogBean1.m();
                      if (str3.contains(str4)) {
                        a.a().remove(k);
                      } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        this();
                        stringBuilder.append(str3);
                        stringBuilder.append(str4);
                        callLogBean.A0(stringBuilder.toString());
                        a.a().remove(k);
                      } 
                    } 
                  } 
                } 
              }  
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
          return "777";
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if (param1String != null) {
        this.b.a(a.a());
      } else {
        this.b.b();
      } 
    }
  }
  
  private static class d extends AsyncTask<String, Void, String> {
    private c a;
    
    private List<String> b;
    
    private ArrayList<String> c;
    
    private ArrayList<CallLogBean> d;
    
    d(List<String> param1List1, List<String> param1List2, List<CallLogBean> param1List, c param1c) {
      this.a = param1c;
      this.b = param1List1;
      this.c = (ArrayList<String>)param1List2;
      this.d = (ArrayList<CallLogBean>)param1List;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          Cursor cursor = contentResolver.query(CallLog.Calls.CONTENT_URI, new String[] { "number" }, null, null, "date DESC");
          if (cursor != null && cursor.getCount() > 0) {
            this.b.clear();
            this.c.clear();
            cursor.moveToFirst();
            int i;
            for (i = 0; i < cursor.getCount(); i++) {
              cursor.moveToPosition(i);
              String str = cursor.getString(cursor.getColumnIndex("number"));
              if (!this.c.contains(str)) {
                this.c.add(str);
                this.b.add(str);
              } 
            } 
            List<String> list = this.b;
            if (list != null && list.size() > 0) {
              ArrayList<CallLogBean> arrayList1 = this.d;
              if (arrayList1 != null) {
                arrayList1.clear();
              } else {
                arrayList1 = new ArrayList<CallLogBean>();
                this();
                this.d = arrayList1;
              } 
              i = 0;
              while (true) {
                int j = this.b.size();
                if (i < j) {
                  try {
                    if (!i1.v0(this.b.get(i))) {
                      Cursor cursor1 = contentResolver.query(CallLog.Calls.CONTENT_URI, null, "number=?", new String[] { this.b.get(i) }, "date DESC");
                      if (cursor1 != null) {
                        CallLogBean callLogBean = new CallLogBean();
                        this();
                        callLogBean.D0(this.b.get(i));
                        callLogBean.p0(cursor1.getCount());
                        if (i1.Y((Context)EZCallApplication.c(), callLogBean.p())) {
                          callLogBean.o0(true);
                          String str = i1.w((Context)EZCallApplication.c(), callLogBean.p());
                          if (str != null && !"".equals(str)) {
                            callLogBean.B0(str);
                            j = i1.Z((Context)EZCallApplication.c(), callLogBean.p());
                            callLogBean.I0(j);
                            ContentResolver contentResolver1 = EZCallApplication.c().getContentResolver();
                            Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                            StringBuilder stringBuilder = new StringBuilder();
                            this();
                            stringBuilder.append(j);
                            stringBuilder.append("");
                            String str1 = stringBuilder.toString();
                            Cursor cursor2 = contentResolver1.query(uri, new String[] { "data2" }, "contact_id=?", new String[] { str1 }, null);
                            if (cursor2.moveToNext()) {
                              String str2 = cursor2.getString(cursor2.getColumnIndex("data2"));
                              if (str2 != null && !"".equals(str2)) {
                                j = Integer.parseInt(str2);
                                if (j != 1) {
                                  if (j != 2) {
                                    if (j != 3) {
                                      if (j == 4)
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
                            cursor2.close();
                          } 
                          this.d.add(callLogBean);
                        } 
                      } 
                      if (cursor1 != null)
                        cursor1.close(); 
                    } 
                  } catch (Exception exception) {
                    exception.printStackTrace();
                  } 
                  i++;
                  continue;
                } 
                break;
              } 
            } 
            ArrayList<CallLogBean> arrayList = this.d;
            if (arrayList != null) {
              i = arrayList.size();
              if (i > 0) {
                try {
                  ArrayList<CallLogBean> arrayList1 = this.d;
                  a a = new a();
                  this(this);
                  Collections.sort(arrayList1, a);
                } catch (Exception exception) {
                  exception.printStackTrace();
                } 
                if (d0.a) {
                  StringBuilder stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("fav_contact:");
                  stringBuilder.append(((CallLogBean)this.d.get(0)).toString());
                  d0.a("favourite", stringBuilder.toString());
                } 
              } 
            } 
            cursor.close();
            return "2222";
          } 
          if (cursor != null)
            cursor.close(); 
          return "3333";
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if ("2222".equals(param1String)) {
        this.a.a(this.b, this.c, this.d);
      } else {
        this.a.b();
      } 
    }
    
    class a implements Comparator<CallLogBean> {
      a(a.d this$0) {}
      
      public int a(CallLogBean param2CallLogBean1, CallLogBean param2CallLogBean2) {
        return param2CallLogBean2.f() - param2CallLogBean1.f();
      }
    }
  }
  
  class a implements Comparator<CallLogBean> {
    a(a this$0) {}
    
    public int a(CallLogBean param1CallLogBean1, CallLogBean param1CallLogBean2) {
      return param1CallLogBean2.f() - param1CallLogBean1.f();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */