package com.allinone.callerid.i.a.p;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import com.allinone.callerid.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.i1;
import java.util.ArrayList;
import java.util.List;

public class a {
  public static void a(String paramString, c paramc) {
    try {
      a a1 = new a();
      this(paramString, paramc);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(String paramString, e parame) {
    try {
      b b = new b();
      this(paramString, parame);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void c(int paramInt, String paramString, b paramb) {
    try {
      c c = new c();
      this(paramInt, paramString, paramb);
      c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void d(Context paramContext, int paramInt, d paramd) {
    try {
      d d1 = new d();
      this(paramContext, paramInt, paramd);
      d1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void e(Context paramContext, int paramInt, String paramString, com.allinone.callerid.i.a.q.d paramd) {
    try {
      e e = new e();
      this(paramContext, paramInt, paramString, paramd);
      e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, Integer> {
    String a;
    
    c b;
    
    a(String param1String, c param1c) {
      this.a = param1String;
      this.b = param1c;
    }
    
    protected Integer a(String... param1VarArgs) {
      return Integer.valueOf(i1.Z((Context)EZCallApplication.c(), this.a));
    }
    
    protected void b(Integer param1Integer) {
      super.onPostExecute(param1Integer);
      this.b.a(param1Integer.intValue());
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    String a;
    
    e b;
    
    b(String param1String, e param1e) {
      this.a = param1String;
      this.b = param1e;
    }
    
    protected String a(String... param1VarArgs) {
      return i1.w((Context)EZCallApplication.c(), this.a);
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.b.a(param1String);
    }
  }
  
  private static class c extends AsyncTask<String, Void, String> {
    int a;
    
    int b = -999;
    
    String c;
    
    b d;
    
    c(int param1Int, String param1String, b param1b) {
      this.a = param1Int;
      this.c = param1String;
      this.d = param1b;
    }
    
    protected String a(String... param1VarArgs) {
      String str2 = "";
      String str1 = str2;
      try {
        if (this.a == 0) {
          str1 = str2;
          int j = i1.Z((Context)EZCallApplication.c(), this.c);
          str1 = str2;
          this.b = j;
          str1 = str2;
          this.a = j;
        } 
        str1 = str2;
        ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
        str1 = str2;
        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        str1 = str2;
        int i = this.a;
        str1 = str2;
        Cursor cursor = contentResolver.query(uri, new String[] { "starred" }, "contact_id=?", new String[] { String.valueOf(i) }, null);
        String str = str2;
        if (cursor != null) {
          str = str2;
          str1 = str2;
          if (cursor.moveToNext()) {
            str1 = str2;
            str2 = cursor.getString(cursor.getColumnIndex("starred"));
            str = str2;
            str1 = str2;
            if (d0.a) {
              str1 = str2;
              StringBuilder stringBuilder = new StringBuilder();
              str1 = str2;
              this();
              str1 = str2;
              stringBuilder.append("starred:");
              str1 = str2;
              stringBuilder.append(str2);
              str1 = str2;
              d0.a("favtest", stringBuilder.toString());
              str = str2;
            } 
          } 
        } 
        str1 = str;
        if (cursor != null) {
          str1 = str;
          cursor.close();
          str1 = str;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return str1;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.d.a(this.b, param1String);
    }
  }
  
  private static class d extends AsyncTask<String, Void, String> {
    Context a;
    
    int b;
    
    private d c;
    
    d(Context param1Context, int param1Int, d param1d) {
      this.a = param1Context;
      this.b = param1Int;
      this.c = param1d;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        Uri uri = ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, this.b);
        if (ContactsContract.Contacts.getLookupUri(this.a.getContentResolver(), uri) != Uri.EMPTY)
          this.a.getContentResolver().delete(uri, null, null); 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.c.a();
    }
  }
  
  private static class e extends AsyncTask<String, Void, String> {
    List<CallLogBean> a = null;
    
    Context b;
    
    int c;
    
    String d;
    
    com.allinone.callerid.i.a.q.d e;
    
    e(Context param1Context, int param1Int, String param1String, com.allinone.callerid.i.a.q.d param1d) {
      this.b = param1Context;
      this.c = param1Int;
      this.d = param1String;
      this.e = param1d;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        ContentResolver contentResolver = this.b.getContentResolver();
        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("contact_id=");
        stringBuilder.append(Long.toString(this.c));
        Cursor cursor = contentResolver.query(uri, null, stringBuilder.toString(), null, null);
        ArrayList<CallLogBean> arrayList = new ArrayList();
        this();
        this.a = arrayList;
        if (cursor != null) {
          while (cursor.moveToNext()) {
            String str = cursor.getString(cursor.getColumnIndex("data1"));
            CallLogBean callLogBean = new CallLogBean();
            this();
            callLogBean.D0(str);
            if (!str.replaceAll(" ", "").equals(this.d.replaceAll(" ", "")))
              this.a.add(callLogBean); 
          } 
          cursor.close();
        } 
        int i = this.a.size();
        boolean bool = false;
        if (i > 0)
          for (i = 0; i < this.a.size(); i++) {
            for (int j = this.a.size() - 1; j > i; j--) {
              if (((CallLogBean)this.a.get(i)).p().replaceAll(" ", "").equals(((CallLogBean)this.a.get(j)).p().replaceAll(" ", "")))
                this.a.remove(j); 
            } 
          }  
        if (this.a.size() > 0)
          for (i = bool; i < this.a.size(); i++) {
            CallLogBean callLogBean = this.a.get(i);
            EZSearchContacts eZSearchContacts = f.b().d(callLogBean.p());
            if (eZSearchContacts != null) {
              callLogBean.e0(eZSearchContacts.getBelong_area());
              callLogBean.N0(eZSearchContacts.getType());
              callLogBean.w0(eZSearchContacts.getFormat_tel_number());
              callLogBean.G0(eZSearchContacts.getOperator());
              callLogBean.E0(eZSearchContacts.getType());
            } 
          }  
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.e.a((ArrayList)this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/p/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */