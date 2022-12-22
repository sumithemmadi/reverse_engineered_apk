package com.allinone.callerid.util;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.CallLog;
import com.allinone.callerid.f.f;
import com.allinone.callerid.i.a.h.h;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.mvc.controller.comment.SubmitCommentActivity;
import com.allinone.callerid.mvc.controller.guidep.GuideAddContantActivity;
import com.allinone.callerid.mvc.controller.guidep.GuideReportActivity;
import com.allinone.callerid.mvc.controller.guidep.MissedCallActivity;
import com.allinone.callerid.mvc.controller.report.ReportSubtypeActivity;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.start.AnsweredActivity;
import com.allinone.callerid.start.BlockedHangupActivity;
import com.allinone.callerid.start.MissedCallActivityNew;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a1 {
  public static void c(Context paramContext, String paramString) {
    (new c(paramString, paramContext)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
  }
  
  public static void d(Context paramContext, int paramInt1, int paramInt2, String paramString, boolean paramBoolean, int paramInt3, int paramInt4) {
    (new b(paramContext, paramString, paramInt4, paramInt1, paramInt2, paramBoolean, paramInt3)).executeOnExecutor(f1.a(), (Object[])new Void[0]);
  }
  
  private static void e(Context paramContext, EZSearchResult paramEZSearchResult) {
    try {
      Intent intent = new Intent();
      this(paramContext, BlockedHangupActivity.class);
      paramEZSearchResult.setIssetfav(false);
      Bundle bundle = new Bundle();
      this();
      bundle.putParcelable("contact_missed", (Parcelable)paramEZSearchResult);
      intent.putExtras(bundle);
      intent.setFlags(268435456);
      paramContext.startActivity(intent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static void f(Context paramContext, ArrayList<EZSearchResult> paramArrayList, int paramInt1, int paramInt2) {
    try {
      Intent intent = new Intent();
      this(paramContext, MissedCallActivity.class);
      Bundle bundle = new Bundle();
      this();
      bundle.putParcelableArrayList("contact_missed", paramArrayList);
      bundle.putInt("unreadkey", paramInt1);
      bundle.putInt("isContact", paramInt2);
      intent.putExtras(bundle);
      intent.setFlags(268435456);
      paramContext.startActivity(intent);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static void g(Context paramContext, ArrayList<EZSearchResult> paramArrayList, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3) {
    EZSearchResult eZSearchResult = paramArrayList.get(0);
    if (paramInt3 == 1) {
      if (paramInt1 == 1 && paramArrayList.size() > 1) {
        f(paramContext, paramArrayList, paramArrayList.size(), paramInt2);
      } else if (paramInt1 == 1 && paramInt2 == 0 && eZSearchResult.getWeekoutingnum() >= 3 && System.currentTimeMillis() - b1.z() > 86400000L) {
        try {
          b1.d1(System.currentTimeMillis());
          Intent intent = new Intent();
          this((Context)EZCallApplication.c(), GuideAddContantActivity.class);
          intent.putExtra("haoma", eZSearchResult.getOld_tel_number());
          intent.putExtra("touxiang", eZSearchResult.getIcon());
          intent.putExtra("cishu", eZSearchResult.getWeekoutingnum());
          intent.setFlags(268435456);
          paramContext.startActivity(intent);
        } catch (Exception null) {
          exception.printStackTrace();
        } 
      } else {
        try {
          Intent intent = new Intent();
          this((Context)exception, MissedCallActivityNew.class);
          eZSearchResult.setIssetfav(false);
          Bundle bundle = new Bundle();
          this();
          bundle.putParcelable("contact_missed", (Parcelable)eZSearchResult);
          bundle.putBoolean("isuserrejected", paramBoolean);
          bundle.putInt("isContact", paramInt2);
          intent.putExtras(bundle);
          intent.setFlags(268435456);
          exception.startActivity(intent);
          q.b().c("missed_call_dialog_single");
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
    } else if (paramInt3 == 0) {
      if (paramInt2 == 1) {
        try {
          Intent intent = new Intent();
          this((Context)exception, MissedCallActivityNew.class);
          eZSearchResult.setIssetfav(true);
          Bundle bundle = new Bundle();
          this();
          bundle.putParcelable("contact_missed", (Parcelable)eZSearchResult);
          bundle.putBoolean("isuserrejected", true);
          bundle.putBoolean("answer", true);
          bundle.putInt("isContact", paramInt2);
          intent.putExtras(bundle);
          intent.setFlags(268435456);
          exception.startActivity(intent);
          q.b().c("answered_dialog_contact");
        } catch (Exception exception1) {
          exception1.printStackTrace();
        } 
      } else {
        q.b().c("unknow_answered_hungup");
        com.allinone.callerid.i.a.l.b.b(eZSearchResult.getNumber(), new d(eZSearchResult, (Context)exception1, paramInt2));
      } 
    } 
  }
  
  public static void h(Context paramContext) {
    try {
      if (i1.a(paramContext)) {
        a a = new a();
        this(paramContext);
        com.allinone.callerid.i.a.h.i.b.a(paramContext, a);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  static final class a implements com.allinone.callerid.i.a.h.i.a {
    a(Context param1Context) {}
    
    public void a(JSONArray param1JSONArray) {
      if (param1JSONArray != null && param1JSONArray.length() > 0)
        com.allinone.callerid.i.a.h.b.a(this.a, param1JSONArray, new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.h.a {
      a(a1.a this$0) {}
      
      public void a(String param2String) {
        if (param2String != null && !"".equals(param2String))
          try {
            JSONObject jSONObject = new JSONObject();
            this(param2String);
            if (jSONObject.getInt("status") == 1)
              h.a(this.a.a); 
          } catch (JSONException jSONException) {
            jSONException.printStackTrace();
          }  
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.h.a {
    a(a1 this$0) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          if (jSONObject.getInt("status") == 1)
            h.a(this.a.a); 
        } catch (JSONException jSONException) {
          jSONException.printStackTrace();
        }  
    }
  }
  
  static final class b extends AsyncTask<Void, Void, Void> {
    private ArrayList<EZSearchResult> a;
    
    EZSearchResult b;
    
    b(Context param1Context, String param1String, int param1Int1, int param1Int2, int param1Int3, boolean param1Boolean, int param1Int4) {}
    
    protected Void a(Void... param1VarArgs) {
      this.a = new ArrayList<EZSearchResult>();
      ContentResolver contentResolver = this.c.getContentResolver();
      if (androidx.core.content.a.a((Context)EZCallApplication.c(), "android.permission.READ_CALL_LOG") == 0) {
        Uri uri = CallLog.Calls.CONTENT_URI;
        String str = this.d;
        Cursor cursor = contentResolver.query(uri, new String[] { "date", "number", "type" }, "number=?", new String[] { str }, "date DESC");
        if (cursor != null && cursor.getCount() > 0) {
          cursor.moveToFirst();
          cursor.moveToPosition(0);
          if (cursor.getInt(cursor.getColumnIndex("type")) == 3) {
            Cursor cursor1 = contentResolver.query(CallLog.Calls.CONTENT_URI, new String[] { "date", "number" }, "type=? and new=?", new String[] { "3", "1" }, "date DESC");
            if (cursor1 != null && cursor1.getCount() > 0) {
              cursor1.moveToFirst();
              for (byte b1 = 0; b1 < cursor1.getCount(); b1++) {
                cursor1.moveToPosition(b1);
                Date date = new Date(cursor1.getLong(cursor1.getColumnIndex("date")));
                String str1 = cursor1.getString(cursor1.getColumnIndex("number"));
                EZSearchResult eZSearchResult = new EZSearchResult();
                eZSearchResult.setNumber(str1);
                eZSearchResult.setIncomingtime(date.getTime());
                this.a.add(eZSearchResult);
              } 
            } 
            if (cursor1 != null)
              cursor1.close(); 
          } 
        } 
        if (cursor != null)
          cursor.close(); 
      } 
      if (this.a.size() == 0) {
        EZSearchResult eZSearchResult = new EZSearchResult();
        eZSearchResult.setNumber(this.d);
        this.a.add(eZSearchResult);
      } 
      ArrayList<EZSearchResult> arrayList = this.a;
      if (arrayList != null && arrayList.size() > 0)
        for (byte b1 = 0; b1 < this.a.size(); b1++) {
          EZSearchResult eZSearchResult = this.a.get(b1);
          this.b = eZSearchResult;
          String str1 = eZSearchResult.getNumber();
          EZSearchContacts eZSearchContacts = f.b().d(str1);
          String str2 = i1.w(this.c, this.d);
          if (str2 != null && !"".equals(str2)) {
            this.b.setName(str2);
            this.b.setContact(true);
            int i = i1.Z((Context)EZCallApplication.c(), this.b.getNumber());
            this.b.setRaw_contact_id(i);
          } else {
            this.b.setName("");
          } 
          this.b.setCount(this.e);
          if (this.f == 0) {
            this.b.setDate(0L);
          } else {
            this.b.setDate(1L);
          } 
          if (eZSearchContacts != null) {
            boolean bool;
            if (eZSearchContacts.getSubtype_pdt() != null && !"".equals(eZSearchContacts.getSubtype_pdt()))
              this.b.setSubtype_pdt(eZSearchContacts.getSubtype_pdt()); 
            this.b.setType_label(i1.D((Context)EZCallApplication.c(), eZSearchContacts.getType_label()));
            this.b.setType_label_id(eZSearchContacts.getType_label());
            if (str2 == null && eZSearchContacts.getName() != null && !eZSearchContacts.getName().equals(""))
              this.b.setName(eZSearchContacts.getName()); 
            str2 = eZSearchContacts.getOld_tel_number();
            if (str2 != null && !"".equals(str2))
              this.b.setOld_tel_number(str2); 
            str1 = q0.b(str1);
            if (str1 != null && !"".equals(str1)) {
              this.b.setFormat_tel_number(str1);
            } else {
              str1 = eZSearchContacts.getFormat_tel_number();
              if (str1 != null && !str1.equals(""))
                this.b.setFormat_tel_number(str1); 
            } 
            this.b.setSubtype(eZSearchContacts.getSubtype());
            this.b.setSubtype_cc(eZSearchContacts.getSubtype_cc());
            this.b.setKeyword(eZSearchContacts.getKeyword());
            this.b.setBlock_count(eZSearchContacts.getBlock_count());
            this.b.setDeclined_count(eZSearchContacts.getDeclined_count());
            str1 = eZSearchContacts.getReport_count();
            if (str1 != null && !"".equals(str1)) {
              bool = Integer.parseInt(str1);
              this.b.setReport_count(bool);
            } else {
              this.b.setReport_count(0);
              bool = false;
            } 
            if (eZSearchContacts.getType_label() != null && !"".equals(eZSearchContacts.getType_label()) && bool) {
              this.b.setIsSpam(true);
            } else {
              this.b.setIsSpam(false);
            } 
            this.b.setOperator(eZSearchContacts.getOperator());
            if (eZSearchContacts.getType() != null && ("Mobile".equals(eZSearchContacts.getType()) || "Fixed line".equals(eZSearchContacts.getType())))
              this.b.setType(i1.J((Context)EZCallApplication.c(), eZSearchContacts.getType())); 
            str1 = eZSearchContacts.getBelong_area();
            this.b.setLocation(str1);
            this.b.setAddress(eZSearchContacts.getAddress());
            this.b.setIcon(eZSearchContacts.getAvatar());
            this.b.setWebsite(eZSearchContacts.getWebsite());
            this.b.setTag_main(eZSearchContacts.getTag_main());
            this.b.setTag_sub(eZSearchContacts.getTag_sub());
            this.b.setSoft_comments(eZSearchContacts.getSoft_comments());
            this.b.setT_p(eZSearchContacts.getT_p());
            this.b.setTel_number(eZSearchContacts.getTel_number());
            this.b.setComment_tags(eZSearchContacts.getComment_tags());
            this.b.setCountry(eZSearchContacts.getCountry());
            this.b.setIs_activity(eZSearchContacts.getIs_activity());
            this.b.setActivity_count(eZSearchContacts.getActivity_count());
            this.b.setOnedayincomingah(eZSearchContacts.getOnedayincomingah());
            this.b.setWeekoutingnum(eZSearchContacts.getWeekoutingnum());
          } 
        }  
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      ArrayList<EZSearchResult> arrayList = this.a;
      if (arrayList != null)
        a1.a(this.c, arrayList, this.f, this.g, this.h, this.i); 
    }
  }
  
  static final class c extends AsyncTask<Void, Void, Void> {
    EZSearchResult a;
    
    EZSearchContacts b;
    
    c(String param1String, Context param1Context) {}
    
    protected Void a(Void... param1VarArgs) {
      try {
        b1.i1(false);
        this.b = f.b().d(this.c);
        EZSearchResult eZSearchResult = new EZSearchResult();
        this();
        this.a = eZSearchResult;
        eZSearchResult.setNumber(this.c);
        String str = i1.w(this.d, this.c);
        if (str != null && !"".equals(str)) {
          this.a.setName(str);
          this.a.setContact(true);
          int i = i1.Z((Context)EZCallApplication.c(), this.a.getNumber());
          this.a.setRaw_contact_id(i);
        } else {
          this.a.setName("");
        } 
        if (this.b != null) {
          boolean bool;
          this.a.setType_label(i1.D((Context)EZCallApplication.c(), this.b.getType_label()));
          if (str == null && this.b.getName() != null && !this.b.getName().equals(""))
            this.a.setName(this.b.getName()); 
          this.a.setSubtype(this.b.getSubtype());
          this.a.setSubtype_cc(this.b.getSubtype_cc());
          this.a.setKeyword(this.b.getKeyword());
          str = this.b.getOld_tel_number();
          if (str != null && !"".equals(str))
            this.a.setOld_tel_number(str); 
          str = this.b.getFormat_tel_number();
          if (str != null && !str.equals(""))
            this.a.setFormat_tel_number(str); 
          str = this.b.getReport_count();
          if (str != null && !"".equals(str)) {
            bool = Integer.parseInt(str);
            this.a.setReport_count(bool);
          } else {
            this.a.setReport_count(0);
            bool = false;
          } 
          if (this.b.getType_label() != null && !"".equals(this.b.getType_label()) && bool) {
            this.a.setIsSpam(true);
          } else {
            this.a.setIsSpam(false);
          } 
          this.a.setOperator(this.b.getOperator());
          if (this.b.getType() != null && ("Mobile".equals(this.b.getType()) || "Fixed line".equals(this.b.getType())))
            this.a.setType(i1.J((Context)EZCallApplication.c(), this.b.getType())); 
          str = this.b.getBelong_area();
          this.a.setLocation(str);
          this.a.setAddress(this.b.getAddress());
          this.a.setIcon(this.b.getAvatar());
          this.a.setWebsite(this.b.getWebsite());
          this.a.setTag_main(this.b.getTag_main());
          this.a.setTag_sub(this.b.getTag_sub());
          this.a.setSoft_comments(this.b.getSoft_comments());
          this.a.setT_p(this.b.getT_p());
          this.a.setTel_number(this.b.getTel_number());
          this.a.setComment_tags(this.b.getComment_tags());
          this.a.setCountry(this.b.getCountry());
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      return null;
    }
    
    protected void b(Void param1Void) {
      super.onPostExecute(param1Void);
      EZSearchResult eZSearchResult = this.a;
      if (eZSearchResult != null)
        a1.b(this.d, eZSearchResult); 
    }
  }
  
  static final class d implements com.allinone.callerid.i.a.l.a {
    d(EZSearchResult param1EZSearchResult, Context param1Context, int param1Int) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        if (this.a.isSpam() || this.a.getIs_activity() == 1 || this.a.getReport_count() > 5) {
          param1Boolean = this.a.isSpam();
          if (this.a.isSpam()) {
            if (d0.a)
              d0.a("tony", "is_spam"); 
            q.b().c("spam_comment_show");
          } else {
            String str1;
            if (this.a.getIs_activity() == 1) {
              if (d0.a)
                d0.a("tony", "is_activity"); 
              str1 = this.a.getActivity_count();
              q.b().c("activity_comment_show");
            } else {
              if (d0.a)
                d0.a("tony", "is_reportcount5"); 
              q.b().c("reportcount_comment_show");
              str1 = "";
            } 
            try {
              CallLogBean callLogBean = new CallLogBean();
              this();
              callLogBean.D0(this.a.getNumber());
              callLogBean.K0(String.valueOf(this.a.getReport_count()));
              callLogBean.d1(this.a.getType_label());
              callLogBean.e1(this.a.getType_label_id());
              callLogBean.Y0(this.a.getT_p());
              Intent intent = new Intent();
              this();
              Bundle bundle = new Bundle();
              this();
              bundle.putParcelable("number_content", (Parcelable)callLogBean);
              bundle.putInt("is_activity", param1Boolean ^ true);
              bundle.putString("activity_count", str1);
              intent.putExtras(bundle);
              intent.setClass(this.b, SubmitCommentActivity.class);
              intent.setFlags(268435456);
              this.b.startActivity(intent);
              com.allinone.callerid.i.a.l.b.f(this.a.getNumber());
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
            return;
          } 
        } else {
          if (this.a.getOnedayincomingah() >= 3) {
            try {
              Intent intent = new Intent();
              this(this.b, GuideReportActivity.class);
              intent.setFlags(268435456);
              intent.putExtra("haoma", this.a.getOld_tel_number());
              intent.putExtra("cishu", this.a.getOnedayincomingah());
              intent.putExtra("Report_count", this.a.getIs_activity());
              intent.putExtra("Type_label", i1.D((Context)EZCallApplication.c(), this.a.getType_label()));
              intent.putExtra("Type_label_id", this.a.getType_label());
              intent.putExtra("T_p", this.a.getT_p());
              intent.putExtra("icon", this.a.getIcon());
              this.b.startActivity(intent);
              com.allinone.callerid.i.a.l.b.f(this.a.getNumber());
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } else {
            try {
              String str1 = p.d(this.b).getIso_code();
              if (str1 != null && str1.equals("US/USA")) {
                Intent intent = new Intent();
                this(this.b, ReportSubtypeActivity.class);
                Bundle bundle = new Bundle();
                this();
                bundle.putParcelable("contact_subtype", (Parcelable)this.a);
                bundle.putBoolean("is_answer_end", true);
                intent.putExtras(bundle);
                intent.setFlags(268435456);
                this.b.startActivity(intent);
              } else {
                Intent intent = new Intent();
                this(this.b, AnsweredActivity.class);
                Bundle bundle = new Bundle();
                this();
                bundle.putParcelable("contact_missed", (Parcelable)this.a);
                bundle.putInt("isContact", this.c);
                intent.putExtras(bundle);
                intent.setFlags(268435456);
                this.b.startActivity(intent);
              } 
            } catch (Exception exception) {
              exception.printStackTrace();
            } 
          } 
          return;
        } 
      } else {
        try {
          String str1 = p.d(this.b).getIso_code();
          if (str1 != null && str1.equals("US/USA")) {
            Intent intent = new Intent();
            this(this.b, ReportSubtypeActivity.class);
            Bundle bundle = new Bundle();
            this();
            bundle.putParcelable("contact_subtype", (Parcelable)this.a);
            bundle.putBoolean("is_answer_end", true);
            intent.putExtras(bundle);
            intent.setFlags(268435456);
            this.b.startActivity(intent);
          } else {
            Intent intent = new Intent();
            this(this.b, AnsweredActivity.class);
            Bundle bundle = new Bundle();
            this();
            bundle.putParcelable("contact_missed", (Parcelable)this.a);
            bundle.putInt("isContact", this.c);
            intent.putExtras(bundle);
            intent.setFlags(268435456);
            this.b.startActivity(intent);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
        return;
      } 
      String str = "";
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */