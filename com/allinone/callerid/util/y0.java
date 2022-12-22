package com.allinone.callerid.util;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.allinone.callerid.f.f;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import org.json.JSONArray;
import org.json.JSONObject;

public class y0 {
  public static void a(JSONObject paramJSONObject, String paramString) {
    try {
      a a = new a();
      this(paramJSONObject, paramString);
      a.executeOnExecutor(f1.a(), new Object[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void b(JSONObject paramJSONObject, String paramString, boolean paramBoolean) {
    try {
      b b = new b();
      this(paramJSONObject, paramString, paramBoolean);
      b.executeOnExecutor(f1.a(), new Object[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static class a extends AsyncTask<Object, Void, Object> {
    JSONObject a;
    
    String b;
    
    private EZSearchContacts c;
    
    a(JSONObject param1JSONObject, String param1String) {
      this.a = param1JSONObject;
      this.b = param1String;
    }
    
    protected String a(Object[] param1ArrayOfObject) {
      try {
        if (this.a.getInt("status") == 1) {
          EZSearchContacts eZSearchContacts = f.b().d(this.b);
          this.c = eZSearchContacts;
          if (eZSearchContacts == null) {
            eZSearchContacts = new EZSearchContacts();
            this();
            if (this.a.getInt("faild_error_log") == 1)
              eZSearchContacts.setSearched(true); 
            eZSearchContacts.setSearched_buyu(true);
            eZSearchContacts.setOld_tel_number(this.b);
            eZSearchContacts.setFormat_tel_number(this.a.getString("format_tel_number"));
            eZSearchContacts.setOperator(this.a.getString("operator"));
            eZSearchContacts.setType(this.a.getString("type"));
            eZSearchContacts.setType_label(this.a.getString("type_label"));
            eZSearchContacts.setName(this.a.getString("name"));
            eZSearchContacts.setAvatar(this.a.getString("avatar"));
            f.b().c(eZSearchContacts);
          } else {
            if (this.a.getInt("faild_error_log") == 1)
              this.c.setSearched(true); 
            this.c.setSearched_buyu(true);
            String str = this.a.getString("name");
            if (str != null && !"".equals(str))
              this.c.setName(str); 
            str = this.a.getString("avatar");
            if (str != null && !"".equals(str))
              this.c.setAvatar(str); 
            str = this.a.getString("type_label");
            if (str != null && !"".equals(str))
              this.c.setType_label(str); 
            str = this.a.getString("type");
            if (str != null && !"".equals(str))
              this.c.setType(str); 
            str = this.a.getString("operator");
            if (str != null && !"".equals(str))
              this.c.setOperator(str); 
            str = this.a.getString("format_tel_number");
            if (str != null && !"".equals(str))
              this.c.setFormat_tel_number(str); 
            f.b().e(this.c, new String[] { "isSearched", "name", "belong_area", "avatar", "type_label", "type", "operator", "format_tel_number", "searched_buyu" });
          } 
        } 
      } catch (Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception:");
        stringBuilder.append(exception.getMessage());
        d0.a("buyu", stringBuilder.toString());
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void onPostExecute(Object param1Object) {
      super.onPostExecute(param1Object);
      d0.a("buyu", "save data OK");
      try {
        param1Object = new Intent();
        super();
        param1Object.setAction("com.allinone.callerid.INIT_HISTORY");
        b.p.a.a.b((Context)EZCallApplication.c()).d((Intent)param1Object);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  static class b extends AsyncTask<Object, Void, Object> {
    JSONObject a;
    
    String b;
    
    boolean c;
    
    private EZSearchContacts d;
    
    b(JSONObject param1JSONObject, String param1String, boolean param1Boolean) {
      this.a = param1JSONObject;
      this.b = param1String;
      this.c = param1Boolean;
    }
    
    protected String a(Object[] param1ArrayOfObject) {
      try {
        EZSearchContacts eZSearchContacts = f.b().d(this.b);
        this.d = eZSearchContacts;
        if (eZSearchContacts == null) {
          eZSearchContacts = new EZSearchContacts();
          this();
          if (this.a.getInt("faild_error_log") == 1) {
            eZSearchContacts.setSearched(true);
          } else {
            eZSearchContacts.setSearch_time(System.currentTimeMillis());
          } 
          eZSearchContacts.setOld_tel_number(this.a.getString("old_tel_number"));
          eZSearchContacts.setTel_number(this.a.getString("tel_number"));
          eZSearchContacts.setFormat_tel_number(this.a.getString("format_tel_number"));
          eZSearchContacts.setOperator(this.a.getString("operator"));
          eZSearchContacts.setType(this.a.getString("type"));
          eZSearchContacts.setType_label(this.a.getString("type_label"));
          eZSearchContacts.setReport_count(this.a.getString("report_count"));
          eZSearchContacts.setName(this.a.getString("name"));
          eZSearchContacts.setAddress(this.a.getString("address"));
          eZSearchContacts.setBelong_area(this.a.getString("belong_area"));
          eZSearchContacts.setAvatar(this.a.getString("avatar"));
          eZSearchContacts.setFaild_error_log(this.a.getInt("faild_error_log"));
          eZSearchContacts.setWebsite(this.a.getString("website"));
          eZSearchContacts.setT_p(this.a.getString("t_p"));
          eZSearchContacts.setName_tags(this.a.getString("name_tags"));
          eZSearchContacts.setType_tags(this.a.getString("type_tags"));
          eZSearchContacts.setComment_tags(this.a.getString("soft_comments_tags"));
          eZSearchContacts.setCountry(this.a.getString("country"));
          if (this.a.has("e164_tel_number"))
            eZSearchContacts.setE164_tel_number(this.a.getString("e164_tel_number")); 
          if (this.a.has("cc"))
            eZSearchContacts.setCc(this.a.getString("cc")); 
          eZSearchContacts.setDate(System.currentTimeMillis());
          eZSearchContacts.setSoft_comments(this.a.getJSONArray("soft_comments").toString());
          JSONArray jSONArray = this.a.getJSONArray("categories");
          if (jSONArray != null && !"".equals(jSONArray.toString()) && jSONArray.length() != 0) {
            if (jSONArray.length() == 1) {
              String str = jSONArray.getString(0);
              if (str != null && !"".equals(str))
                eZSearchContacts.setTag_main(str); 
            } 
            if (jSONArray.length() == 2) {
              String str2 = jSONArray.getString(0);
              String str1 = jSONArray.getString(1);
              if (str2 != null && !"".equals(str2))
                eZSearchContacts.setTag_main(str2); 
              if (str1 != null && !"".equals(str1))
                eZSearchContacts.setTag_sub(str1); 
            } 
          } 
          f.b().c(eZSearchContacts);
        } else {
          int i;
          int j;
          if (eZSearchContacts.getType() == null || "".equals(this.d.getType())) {
            String str1 = this.a.getString("type");
            if (str1 != null && !"".equals(str1)) {
              this.d.setType(str1);
              f.b().e(this.d, new String[] { "type" });
            } 
          } 
          if (this.d.getType_label() == null || "".equals(this.d.getType_label())) {
            String str1 = this.a.getString("type_label");
            if (str1 != null && !"".equals(str1)) {
              this.d.setType_label(str1);
              f.b().e(this.d, new String[] { "type_label" });
            } 
          } 
          if (this.d.getOperator() == null || "".equals(this.d.getOperator())) {
            String str1 = this.a.getString("operator");
            if (str1 != null && !"".equals(str1)) {
              this.d.setOperator(str1);
              f.b().e(this.d, new String[] { "operator" });
            } 
          } 
          if (this.d.getName() == null || "".equals(this.d.getName())) {
            String str1 = this.a.getString("name");
            if (str1 != null && !"".equals(str1)) {
              this.d.setName(str1);
              f.b().e(this.d, new String[] { "name" });
            } 
          } 
          if ("".equals(this.a.getString("report_count"))) {
            i = 0;
          } else {
            i = Integer.parseInt(this.a.getString("report_count"));
          } 
          if (this.d.getReport_count() == null || "".equals(this.d.getReport_count())) {
            j = 0;
          } else {
            j = Integer.parseInt(this.d.getReport_count());
          } 
          if (i > j) {
            this.d.setReport_count(this.a.getString("report_count"));
            f.b().e(this.d, new String[] { "report_count" });
          } 
          if (this.a.getInt("faild_error_log") == 1) {
            this.d.setSearched(true);
          } else {
            this.d.setSearch_time(System.currentTimeMillis());
          } 
          String str = this.a.getString("soft_comments_tags");
          if (str != null && !"".equals(str))
            this.d.setComment_tags(str); 
          str = this.a.getString("name_tags");
          if (str != null && !"".equals(str))
            this.d.setName_tags(str); 
          str = this.a.getString("type_tags");
          if (str != null && !"".equals(str))
            this.d.setType_tags(str); 
          str = this.a.getString("format_tel_number");
          if (str != null && !"".equals(str))
            this.d.setFormat_tel_number(str); 
          str = this.a.getString("tel_number");
          if (str != null && !"".equals(str))
            this.d.setTel_number(str); 
          this.d.setBelong_area(this.a.getString("belong_area"));
          this.d.setAddress(this.a.getString("address"));
          this.d.setAvatar(this.a.getString("avatar"));
          this.d.setT_p(this.a.getString("t_p"));
          if (this.a.has("e164_tel_number"))
            this.d.setE164_tel_number(this.a.getString("e164_tel_number")); 
          if (this.a.has("cc"))
            this.d.setCc(this.a.getString("cc")); 
          JSONArray jSONArray1 = this.a.getJSONArray("soft_comments");
          if (jSONArray1 != null && jSONArray1.length() != 0) {
            JSONArray jSONArray = new JSONArray();
            this(this.d.getSoft_comments());
            if (jSONArray1.length() > jSONArray.length())
              this.d.setSoft_comments(jSONArray1.toString()); 
          } 
          JSONArray jSONArray2 = this.a.getJSONArray("categories");
          if (jSONArray2 != null && !"".equals(jSONArray2.toString()) && jSONArray2.length() != 0) {
            if (jSONArray2.length() == 1) {
              String str1 = jSONArray2.getString(0);
              if (str1 != null && !"".equals(str1))
                this.d.setTag_main(str1); 
            } 
            if (jSONArray2.length() == 2) {
              String str1 = jSONArray2.getString(0);
              String str2 = jSONArray2.getString(1);
              if (str1 != null && !"".equals(str1))
                this.d.setTag_main(str1); 
              if (str2 != null && !"".equals(str2))
                this.d.setTag_sub(str2); 
            } 
          } 
          f.b().e(this.d, new String[] { 
                "isSearched", "search_time", "comment_tags", "name_tags", "type_tags", "format_tel_number", "tel_number", "belong_area", "address", "avatar", 
                "t_p", "soft_comments", "tag_main", "tag_sub", "e164_tel_number", "cc" });
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void onPostExecute(Object param1Object) {
      super.onPostExecute(param1Object);
      if (this.c) {
        param1Object = new Intent();
        param1Object.setAction("com.allinone.callerid.INIT_HISTORY");
        b.p.a.a.b((Context)EZCallApplication.c()).d((Intent)param1Object);
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */