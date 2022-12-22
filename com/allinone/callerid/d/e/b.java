package com.allinone.callerid.d.e;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.d.b.c;
import com.allinone.callerid.d.b.e;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.util.f1;
import java.util.ArrayList;

public class b {
  public static void a(boolean paramBoolean, String paramString, a parama) {
    try {
      b b1 = new b();
      this(paramBoolean, paramString, parama);
      b1.executeOnExecutor(f1.a(), (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static interface a {
    void a(ArrayList<PersonaliseContact> param1ArrayList);
    
    void b();
  }
  
  private static class b extends AsyncTask<String, Void, String> {
    private ArrayList<PersonaliseContact> a;
    
    private b.a b;
    
    private boolean c;
    
    private String d;
    
    b(boolean param1Boolean, String param1String, b.a param1a) {
      this.b = param1a;
      this.c = param1Boolean;
      this.d = param1String;
    }
    
    protected String a(String... param1VarArgs) {
      try {
        if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CONTACTS") == 0) {
          ContentResolver contentResolver = EZCallApplication.c().getContentResolver();
          Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
          byte b1 = 0;
          Cursor cursor = contentResolver.query(uri, new String[] { "display_name", "data1", "sort_key", "contact_id", "photo_id", "starred", "data2" }, null, null, "sort_key COLLATE LOCALIZED ASC");
          if (cursor == null || cursor.getCount() == 0)
            return null; 
          HomeInfo homeInfo = e.e().f();
          if (homeInfo != null) {
            String str = homeInfo.getName();
          } else {
            homeInfo = null;
          } 
          int i = cursor.getColumnIndex("data1");
          int j = cursor.getColumnIndex("display_name");
          int k = cursor.getColumnIndex("sort_key");
          if (cursor.getCount() > 0) {
            ArrayList<PersonaliseContact> arrayList1 = new ArrayList();
            this();
            this.a = arrayList1;
            while (cursor.moveToNext()) {
              String str3 = cursor.getString(i);
              if (TextUtils.isEmpty(str3))
                continue; 
              String str4 = cursor.getString(j);
              String str5 = cursor.getString(k);
              cursor.getString(cursor.getColumnIndex("photo_id"));
              int m = cursor.getInt(cursor.getColumnIndex("contact_id"));
              PersonaliseContact personaliseContact2 = new PersonaliseContact();
              this();
              personaliseContact2.setContacts_id(m);
              personaliseContact2.setSortKey(str5);
              String str6 = com.allinone.callerid.d.f.a.d(str5);
              String str2 = str6;
              if (str6 == null)
                str2 = com.allinone.callerid.d.f.a.c(str4); 
              personaliseContact2.setSortLetters(str2);
              personaliseContact2.sortToken = com.allinone.callerid.d.f.a.f(str5);
              personaliseContact2.setNumber(str3.replaceAll(" ", ""));
              StringBuilder stringBuilder = new StringBuilder();
              this();
              stringBuilder.append(str3.replaceAll(" ", ""));
              stringBuilder.append(":");
              personaliseContact2.setMultiple_number(stringBuilder.toString());
              personaliseContact2.setDefault_themtname((String)homeInfo);
              PersonaliseContact personaliseContact1 = c.d().g(personaliseContact2.getNumber());
              if (personaliseContact1 != null) {
                personaliseContact2.setDataId(personaliseContact1.getDataId());
                personaliseContact2.setThemtname(personaliseContact1.getThemtname());
                personaliseContact2.setPath(personaliseContact1.getPath());
              } 
              String str1 = this.d;
              if (str1 != null)
                if (this.c) {
                  if (str1.equals(personaliseContact2.getDefault_themtname()) && (personaliseContact2.getThemtname() == null || !this.d.equals(personaliseContact2.getThemtname()))) {
                    if (personaliseContact2.getThemtname() != null && !"".equals(personaliseContact2.getThemtname())) {
                      if (!this.d.equals(personaliseContact2.getThemtname())) {
                        personaliseContact2.setIsselect(false);
                      } else {
                        personaliseContact2.setIsselect(true);
                      } 
                    } else {
                      personaliseContact2.setIsselect(true);
                    } 
                  } else {
                    personaliseContact2.setIsselect(false);
                  } 
                } else if (str1.equals(personaliseContact2.getThemtname()) || this.d.equals(personaliseContact2.getDefault_themtname())) {
                  personaliseContact2.setIsselect(true);
                } else {
                  personaliseContact2.setIsselect(false);
                }  
              if (str4 != null) {
                personaliseContact2.setName(str4);
                this.a.add(personaliseContact2);
              } 
            } 
          } 
          cursor.close();
          ArrayList<PersonaliseContact> arrayList = this.a;
          if (arrayList != null && arrayList.size() != 0)
            while (b1 < this.a.size()) {
              PersonaliseContact personaliseContact = this.a.get(b1);
              int m = personaliseContact.getContacts_id();
              for (k = this.a.size() - 1; k > b1; k--) {
                PersonaliseContact personaliseContact1 = this.a.get(k);
                if (m == personaliseContact1.getContacts_id()) {
                  StringBuilder stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append(personaliseContact.getMultiple_number());
                  stringBuilder.append(personaliseContact1.getMultiple_number());
                  personaliseContact.setMultiple_number(stringBuilder.toString());
                  this.a.remove(k);
                } 
              } 
              b1++;
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
        this.b.a(this.a);
      } else {
        this.b.b();
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */