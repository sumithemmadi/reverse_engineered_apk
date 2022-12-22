package com.allinone.callerid.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import android.provider.ContactsContract;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.search.CallLogBean;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class r0 {
  private ArrayList<CallLogBean> a;
  
  public List<String> b = new ArrayList<String>();
  
  public List<CallLogBean> c = new ArrayList<CallLogBean>();
  
  public List<CallLogBean> d = new ArrayList<CallLogBean>();
  
  private Context e;
  
  public r0(Context paramContext) {
    this.e = paramContext;
  }
  
  public List<CallLogBean> a() {
    try {
      if (androidx.core.content.a.a(this.e, "android.permission.READ_CALL_LOG") == 0) {
        Uri uri = CallLog.Calls.CONTENT_URI;
        int i = 0;
        Cursor cursor = EZCallApplication.c().getContentResolver().query(uri, new String[] { "number", "name" }, null, null, "date DESC limit 10");
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("查找通话记录,cursor:");
          stringBuilder.append(cursor.getCount());
          d0.a("short", stringBuilder.toString());
        } 
        if (cursor != null && cursor.getCount() > 0) {
          cursor.moveToFirst();
          int j;
          for (j = 0; j < cursor.getCount(); j++) {
            cursor.moveToPosition(j);
            String str1 = cursor.getString(cursor.getColumnIndex("number"));
            String str2 = cursor.getString(cursor.getColumnIndex("name"));
            CallLogBean callLogBean = new CallLogBean();
            this();
            callLogBean.D0(str1);
            if (str2 == null) {
              str2 = i1.w((Context)EZCallApplication.c(), str1);
              if (str2 == null) {
                callLogBean.B0(str1);
              } else {
                callLogBean.B0(str2);
              } 
            } else {
              callLogBean.B0(str2);
            } 
            this.d.add(callLogBean);
          } 
          List<CallLogBean> list = this.d;
          if (list != null && list.size() > 1)
            for (j = i; j < this.d.size(); j++) {
              for (i = this.d.size() - 1; i > j; i--) {
                if (((CallLogBean)this.d.get(j)).p().equals(((CallLogBean)this.d.get(i)).p()))
                  this.d.remove(i); 
              } 
            }  
        } 
        if (cursor != null)
          cursor.close(); 
      } 
    } catch (Exception exception) {
      exception.getMessage();
    } 
    return this.d;
  }
  
  public List<CallLogBean> b() {
    this.a = new ArrayList<CallLogBean>();
    try {
      if (androidx.core.content.a.a(this.e, "android.permission.READ_CONTACTS") == 0) {
        Cursor cursor = EZCallApplication.c().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, null, "starred = 1 ", null, null);
        if (cursor == null)
          return null; 
        while (true) {
          boolean bool = cursor.moveToNext();
          int i = 0;
          if (bool) {
            String[] arrayOfString;
            String str2;
            long l = cursor.getLong(cursor.getColumnIndex("_id"));
            ContentResolver contentResolver = this.e.getContentResolver();
            Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("contact_id=");
            stringBuilder.append(Long.toString(l));
            Cursor cursor1 = contentResolver.query(uri, null, stringBuilder.toString(), null, null);
            String str1 = "";
            while (true) {
              bool = cursor1.moveToNext();
              if (bool) {
                String str = cursor1.getString(cursor1.getColumnIndex("data1"));
                StringBuilder stringBuilder1 = new StringBuilder();
                this();
                stringBuilder1.append(str1);
                stringBuilder1.append(str);
                stringBuilder1.append(":");
                str1 = stringBuilder1.toString();
                continue;
              } 
              cursor1.close();
              str2 = cursor.getString(cursor.getColumnIndex("display_name"));
              arrayOfString = str1.split(":");
              i = arrayOfString.length;
              if (i == 1) {
                CallLogBean callLogBean = new CallLogBean();
                this();
                callLogBean.B0(str2);
                callLogBean.D0(arrayOfString[0]);
                callLogBean.U0("1");
                callLogBean.o0(true);
                this.a.add(callLogBean);
                continue;
              } 
              break;
            } 
            if (arrayOfString.length > 1) {
              CallLogBean callLogBean = new CallLogBean();
              this();
              callLogBean.B0(str2);
              callLogBean.D0(arrayOfString[0]);
              callLogBean.U0("1");
              callLogBean.o0(true);
              this.a.add(callLogBean);
            } 
            continue;
          } 
          cursor.close();
          ArrayList<CallLogBean> arrayList = this.a;
          if (arrayList != null && arrayList.size() != 0) {
            while (i < this.a.size()) {
              for (int j = this.a.size() - 1; j > i; j--) {
                if (((CallLogBean)this.a.get(i)).p().equals(((CallLogBean)this.a.get(j)).p()))
                  this.a.remove(j); 
              } 
              i++;
            } 
            ArrayList<CallLogBean> arrayList1 = this.a;
            a a = new a();
            this(this);
            Collections.sort(arrayList1, a);
          } 
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append("util中获取收藏的联系人：");
            stringBuilder.append(this.a.size());
            d0.a("short", stringBuilder.toString());
          } 
          break;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    return this.a;
  }
  
  class a implements Comparator<CallLogBean> {
    a(r0 this$0) {}
    
    public int a(CallLogBean param1CallLogBean1, CallLogBean param1CallLogBean2) {
      return Collator.getInstance(Locale.getDefault()).compare(param1CallLogBean1.n(), param1CallLogBean2.n());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */