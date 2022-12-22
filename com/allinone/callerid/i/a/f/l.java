package com.allinone.callerid.i.a.f;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import android.provider.CallLog;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.f1;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class l {
  public static void a(List<CallLogBean> paramList, e parame) {
    try {
      b b = new b();
      this(paramList, parame);
      if (b.getStatus() != AsyncTask.Status.RUNNING) {
        b.cancel(true);
        b = new b();
        this(paramList, parame);
        b.executeOnExecutor(f1.a(), (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(int paramInt1, int paramInt2, List<CallLogBean> paramList, e parame) {
    try {
      a a = new a();
      this(paramInt1, paramInt2, paramList, parame);
      if (a.getStatus() != AsyncTask.Status.RUNNING) {
        a.cancel(true);
        a = new a();
        this(paramInt1, paramInt2, paramList, parame);
        a.executeOnExecutor(f1.a(), (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(Context paramContext, List<CallLogBean> paramList, n paramn) {
    try {
      c c = new c();
      this(paramContext, paramList, paramn);
      if (c.getStatus() != AsyncTask.Status.RUNNING) {
        c.cancel(true);
        c = new c();
        this(paramContext, paramList, paramn);
        c.executeOnExecutor(f1.a(), (Object[])new String[0]);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private e a;
    
    private List<CallLogBean> b;
    
    private ArrayList<String> c = new ArrayList<String>();
    
    private int d;
    
    private int e;
    
    a(int param1Int1, int param1Int2, List<CallLogBean> param1List, e param1e) {
      this.a = param1e;
      this.b = param1List;
      this.d = param1Int1;
      this.e = param1Int2;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        List<CallLogBean> list = this.b;
        if (list != null && list.size() != 0) {
          int i = Math.min(this.d + this.e, this.b.size());
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("length:");
            stringBuilder.append(i);
            d0.a("searchList", stringBuilder.toString());
          } 
          int j;
          for (j = this.d; j < i; j++) {
            CallLogBean callLogBean = this.b.get(j);
            if (callLogBean != null && !callLogBean.T() && !callLogBean.U() && callLogBean.R() && System.currentTimeMillis() - callLogBean.z() > 259200000L && callLogBean.p() != null && !"".equals(callLogBean.p())) {
              this.c.add(callLogBean.p());
              callLogBean.j0(true);
            } 
          } 
          ArrayList<String> arrayList = this.c;
          if (arrayList != null && arrayList.size() > 0)
            for (j = 0; j < this.c.size(); j++) {
              for (i = this.c.size() - 1; i > j; i--) {
                if (((String)this.c.get(j)).equals(this.c.get(i)))
                  this.c.remove(i); 
              } 
            }  
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.c);
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private e a;
    
    private List<CallLogBean> b;
    
    private ArrayList<String> c = new ArrayList<String>();
    
    b(List<CallLogBean> param1List, e param1e) {
      this.a = param1e;
      this.b = param1List;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        List<CallLogBean> list = this.b;
        if (list != null && list.size() != 0)
          for (byte b1 = 0; b1 < this.b.size(); b1++) {
            CallLogBean callLogBean = this.b.get(b1);
            if (callLogBean != null && !callLogBean.T() && callLogBean.S() && callLogBean.p() != null && !"".equals(callLogBean.p()) && !i1.v0(callLogBean.p()) && callLogBean.b() != null && System.currentTimeMillis() - callLogBean.b().getTime() <= 604800000L && !this.c.contains(callLogBean.p()))
              this.c.add(callLogBean.p()); 
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.c);
    }
  }
  
  private static class c extends AsyncTask<String, Void, String> {
    private n a;
    
    private Context b;
    
    private List<CallLogBean> c;
    
    private List<CallLogBean> d = new ArrayList<CallLogBean>();
    
    private List<String> e = new ArrayList<String>();
    
    private long f;
    
    c(Context param1Context, List<CallLogBean> param1List, n param1n) {
      this.a = param1n;
      this.b = param1Context;
      this.c = param1List;
      this.d.addAll(param1List);
    }
    
    protected String a(String... param1VarArgs) {
      try {
        ContentResolver contentResolver = this.b.getContentResolver();
        if (androidx.core.content.a.a(this.b, "android.permission.READ_CALL_LOG") == 0) {
          Cursor cursor = contentResolver.query(CallLog.Calls.CONTENT_URI, null, null, null, "date DESC");
          if (cursor != null && cursor.getCount() > 0) {
            cursor.moveToNext();
            this.f = cursor.getLong(cursor.getColumnIndex("date"));
          } 
          if (cursor != null)
            cursor.close(); 
          if (this.f != 0L) {
            List<CallLogBean> list = this.c;
            if (list != null && list.size() != 0) {
              StringBuilder stringBuilder;
              list = new ArrayList<CallLogBean>();
              super();
              int i = 0;
              int j;
              for (j = 0; j < this.c.size(); j++) {
                CallLogBean callLogBean = this.c.get(j);
                if (callLogBean != null && !callLogBean.T() && !callLogBean.U() && callLogBean.R() && System.currentTimeMillis() - callLogBean.z() > 259200000L && callLogBean.b() != null && (this.f - callLogBean.b().getTime()) / 86400000L < 7L && callLogBean.p() != null && !"".equals(callLogBean.p())) {
                  list.add(callLogBean.p());
                  if (list.size() < 20)
                    callLogBean.j0(true); 
                } 
              } 
              boolean bool = d0.a;
              if (bool) {
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("通话记录数量:");
                stringBuilder1.append(this.c.size());
                d0.d("searchList", stringBuilder1.toString());
                stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("7天内可查询数量:");
                stringBuilder1.append(list.size());
                d0.d("searchList", stringBuilder1.toString());
              } 
              j = list.size();
              if (j < 20) {
                if (d0.a)
                  d0.d("searchList", "7天内可查询量小于20:"); 
                if (this.c.size() < 20) {
                  for (CallLogBean callLogBean : this.c) {
                    if (callLogBean != null && !callLogBean.T() && !callLogBean.U() && callLogBean.R() && System.currentTimeMillis() - callLogBean.z() > 259200000L && callLogBean.p() != null && !"".equals(callLogBean.p())) {
                      this.e.add(callLogBean.p());
                      callLogBean.j0(true);
                    } 
                  } 
                  if (d0.a) {
                    stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("总数小于20:");
                    stringBuilder.append(this.e.size());
                    d0.d("searchList", stringBuilder.toString());
                  } 
                } else {
                  for (CallLogBean callLogBean : this.c) {
                    if (callLogBean != null && !callLogBean.T() && !callLogBean.U() && callLogBean.R() && System.currentTimeMillis() - callLogBean.z() > 259200000L && callLogBean.p() != null && !"".equals(callLogBean.p())) {
                      if (this.e.size() < 20) {
                        this.e.add(callLogBean.p());
                        callLogBean.j0(true);
                        continue;
                      } 
                      break;
                    } 
                  } 
                  if (d0.a) {
                    stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("总数大于20:");
                    stringBuilder.append(this.e.size());
                    d0.d("searchList", stringBuilder.toString());
                  } 
                } 
              } else if (j < 100) {
                this.e.addAll((Collection<? extends String>)stringBuilder);
                if (d0.a) {
                  stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("7天内可查询量大于20小于100:");
                  stringBuilder.append(this.e.size());
                  d0.d("searchList", stringBuilder.toString());
                } 
              } else {
                this.e.addAll(stringBuilder.subList(0, 100));
                if (d0.a) {
                  stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("7天内可查询量大于100:");
                  stringBuilder.append(this.e.size());
                  d0.d("searchList", stringBuilder.toString());
                } 
              } 
              List<String> list1 = this.e;
              if (list1 != null && list1.size() != 0)
                for (j = i; j < this.e.size(); j++) {
                  for (i = this.e.size() - 1; i > j; i--) {
                    if (((String)this.e.get(j)).equals(this.e.get(i)))
                      this.e.remove(i); 
                  } 
                }  
              if (d0.a) {
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append("去重后的可查询量：");
                stringBuilder1.append(this.e.size());
                d0.d("searchList", stringBuilder1.toString());
              } 
            } 
          } 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a(this.c, this.e);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/f/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */