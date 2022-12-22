package com.allinone.callerid.i.a.j;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import com.allinone.callerid.main.EZCallApplication;

public class a {
  public static void a(int paramInt, com.allinone.callerid.i.a.a parama) {
    try {
      a a1 = new a();
      this(paramInt, parama);
      a1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(int paramInt, com.allinone.callerid.i.a.a parama) {
    try {
      b b = new b();
      this(paramInt, parama);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class a extends AsyncTask<String, Void, String> {
    private com.allinone.callerid.i.a.a a;
    
    private int b;
    
    a(int param1Int, com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
      this.b = param1Int;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.WRITE_CONTACTS") == 0) {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          ContentValues contentValues = new ContentValues();
          this();
          Uri uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, Long.toString(this.b));
          contentValues.put("starred", Integer.valueOf(1));
          contentResolver.update(uri, contentValues, null, null);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a();
    }
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private com.allinone.callerid.i.a.a a;
    
    private int b;
    
    b(int param1Int, com.allinone.callerid.i.a.a param1a) {
      this.a = param1a;
      this.b = param1Int;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.WRITE_CONTACTS") == 0) {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          ContentValues contentValues = new ContentValues();
          this();
          Uri uri = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, Long.toString(this.b));
          contentValues.put("starred", Integer.valueOf(0));
          contentResolver.update(uri, contentValues, null, null);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return "";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      this.a.a();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */