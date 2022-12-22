package com.allinone.callerid.l.a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.search.CallLogBean;
import com.allinone.callerid.search.EZSearchResult;
import com.allinone.callerid.service.OfflineDbJobService;
import com.allinone.callerid.service.OfflineJobService;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.o0;
import com.allinone.callerid.util.p;
import com.allinone.callerid.util.q;
import com.phone.libphone.PhoneNumberUtil;
import com.phone.libphone.i;
import java.util.List;

public class f {
  public static com.phone.libphone.l.a a(String paramString1, String paramString2) {
    String str1 = p.d((Context)EZCallApplication.c()).getIso_code();
    String str2 = str1;
    if (str1.contains("/"))
      str2 = str1.substring(0, str1.indexOf("/")); 
    return b(paramString1, paramString2, str2);
  }
  
  private static com.phone.libphone.l.a b(String paramString1, String paramString2, String paramString3) {
    if (i.b()) {
      com.phone.libphone.l.a a = i.a(paramString1, paramString3, paramString2, com.phone.libphone.m.a.a((EZCallApplication.c()).f));
      if (a != null) {
        if (a.b() == null)
          a.k(""); 
        if (a.d() == null)
          a.m(""); 
        if (a.a() == null)
          a.j(""); 
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("mode:");
          stringBuilder.append(a.toString());
          d0.a("wbb", stringBuilder.toString());
        } 
        return a;
      } 
    } 
    return null;
  }
  
  public static void c(List<CallLogBean> paramList, String paramString) {
    if (d0.a)
      d0.a("wbb", "批量查詢數據"); 
    String str1 = p.d((Context)EZCallApplication.c()).getIso_code();
    String str2 = str1;
    if (str1.contains("/"))
      str2 = str1.substring(0, str1.indexOf("/")); 
    if (paramList != null && paramList.size() > 0)
      try {
        for (CallLogBean callLogBean : paramList) {
          com.phone.libphone.l.a a;
          EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(callLogBean.p());
          if (eZSearchContacts == null) {
            if (d0.a)
              d0.a("wbb", "本地数据库没有数据，调用离线解析库解析数据展示"); 
            a = b(callLogBean.p(), paramString, str2);
            if (a != null) {
              callLogBean.N0(i1.J((Context)EZCallApplication.c(), a.g()));
              callLogBean.w0(a.b());
              callLogBean.e0(a.d());
              callLogBean.G0(a.a());
              EZSearchContacts eZSearchContacts1 = new EZSearchContacts();
              this();
              eZSearchContacts1.setBelong_area(a.d());
              eZSearchContacts1.setType(a.g());
              eZSearchContacts1.setFormat_tel_number(a.b());
              eZSearchContacts1.setOperator(a.a());
              eZSearchContacts1.setOld_tel_number(callLogBean.p());
              com.allinone.callerid.f.f.b().c(eZSearchContacts1);
            } 
            continue;
          } 
          callLogBean.O0(a.isSearched());
          callLogBean.d1(i1.D((Context)EZCallApplication.c(), a.getType_label()));
          callLogBean.e1(a.getType_label());
          callLogBean.K0(a.getReport_count());
          callLogBean.e0(a.getBelong_area());
          callLogBean.L0(a.getName());
          if (a.getType() != null && ("Mobile".equals(a.getType()) || "Fixed line".equals(a.getType())))
            callLogBean.N0(i1.J((Context)EZCallApplication.c(), a.getType())); 
          callLogBean.Z0(a.getTel_number());
          callLogBean.F0(a.getOld_tel_number());
          callLogBean.w0(a.getFormat_tel_number());
          callLogBean.G0(a.getOperator());
          callLogBean.a0(a.getAddress());
          callLogBean.b0(a.getAvatar());
          callLogBean.v0(a.getFb_avatar());
          callLogBean.Y0(a.getT_p());
          callLogBean.u0(a.getFaild_error_log());
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
  }
  
  public static void d(String paramString, c paramc) {
    try {
      c c1 = new c();
      this(paramc);
      c1.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[] { paramString });
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void e(String paramString) {
    try {
      d d = new d();
      this(null);
      d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[] { paramString });
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void f(String paramString1, String paramString2, g paramg) {
    try {
      b b = new b();
      this(paramg);
      b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[] { paramString1, paramString2 });
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static void g(Context paramContext, long paramLong) {
    try {
      if (Build.VERSION.SDK_INT >= 21) {
        JobInfo.Builder builder = new JobInfo.Builder();
        ComponentName componentName = new ComponentName();
        this(paramContext, OfflineDbJobService.class);
        this(970, componentName);
        builder.setRequiredNetworkType(2);
        builder.setRequiresCharging(false);
        builder.setRequiresDeviceIdle(false);
        builder.setMinimumLatency(paramLong);
        JobInfo jobInfo = builder.build();
        JobScheduler jobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
        if (jobScheduler != null)
          jobScheduler.schedule(jobInfo); 
      } else {
        com.allinone.callerid.a.b.e().f(paramLong, 970);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void h(Context paramContext, boolean paramBoolean, d paramd) {
    try {
      com.allinone.callerid.k.c c = new com.allinone.callerid.k.c();
      this(paramContext, paramBoolean, paramd);
      c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static void i(Context paramContext, long paramLong) {
    try {
      if (Build.VERSION.SDK_INT >= 21) {
        JobInfo.Builder builder = new JobInfo.Builder();
        ComponentName componentName = new ComponentName();
        this(paramContext, OfflineJobService.class);
        this(718, componentName);
        builder.setRequiredNetworkType(2);
        builder.setRequiresCharging(false);
        builder.setRequiresDeviceIdle(false);
        builder.setMinimumLatency(paramLong);
        JobInfo jobInfo = builder.build();
        JobScheduler jobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
        if (jobScheduler != null)
          jobScheduler.schedule(jobInfo); 
      } else {
        com.allinone.callerid.a.b.e().f(paramLong, 718);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void j(d paramd) {
    try {
      e e = new e();
      this(paramd);
      e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new String[0]);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public static void k(Context paramContext) {
    try {
      long l = b1.x2();
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("time:");
        stringBuilder.append(l);
        d0.a("wbb", stringBuilder.toString());
      } 
      if (l != 0L && System.currentTimeMillis() - l <= 2592000000L) {
        if (System.currentTimeMillis() > b1.g0())
          g(paramContext, 120000L); 
      } else {
        i(paramContext, 180000L);
        if (System.currentTimeMillis() > b1.g0())
          g(paramContext, 120000L); 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private static class b extends AsyncTask<String, Void, EZSearchResult> {
    private g a;
    
    b(g param1g) {
      this.a = param1g;
    }
    
    protected EZSearchResult a(String... param1VarArgs) {
      String str1 = null;
      String str2 = param1VarArgs[0];
      String str3 = param1VarArgs[1];
      try {
        EZSearchResult eZSearchResult1;
        EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(str2);
        if (eZSearchContacts == null) {
          String str7;
          com.phone.libphone.l.a a = f.a(str2, str3);
          if (a != null) {
            EZSearchResult eZSearchResult = new EZSearchResult();
            this();
            eZSearchResult.setType(i1.J((Context)EZCallApplication.c(), a.g()));
            eZSearchResult.setFormat_tel_number(a.b());
            eZSearchResult.setLocation(a.e());
            eZSearchResult.setOperator(a.a());
            eZSearchResult.setNumber(str2);
            str1 = a.c();
            String str = str1;
            if (str1 != null) {
              str = str1;
              if (str1.contains("+"))
                str = str1.replace("+", ""); 
            } 
            if (str3 != null && !"".equals(str3)) {
              if (str == null || "".equals(str))
                str = i1.g((Context)EZCallApplication.c(), str2, str3); 
              if (str != null && !"".equals(str)) {
                if (d0.a) {
                  StringBuilder stringBuilder = new StringBuilder();
                  this();
                  stringBuilder.append("离线数据库search_number: ");
                  stringBuilder.append(str);
                  d0.a("wbb", stringBuilder.toString());
                } 
                if (i1.k0()) {
                  if (d0.a)
                    d0.a("wbb", "离线数据库 isHaveOfflineDb"); 
                  o0 o0 = new o0();
                  this((Context)EZCallApplication.c());
                  EZSearchContacts eZSearchContacts1 = o0.a(str, str2);
                  if (eZSearchContacts1 != null) {
                    eZSearchResult.setType(i1.J((Context)EZCallApplication.c(), eZSearchContacts1.getType()));
                    eZSearchResult.setLocation(eZSearchContacts1.getBelong_area());
                    eZSearchResult.setOperator(eZSearchContacts1.getOperator());
                    eZSearchResult.setOld_tel_number(eZSearchContacts1.getOld_tel_number());
                    eZSearchResult.setTel_number(eZSearchContacts1.getTel_number());
                    eZSearchResult.setName(eZSearchContacts1.getName());
                    eZSearchResult.setType_label_id(eZSearchContacts1.getType_label());
                    eZSearchResult.setType_label(i1.D((Context)EZCallApplication.c(), eZSearchContacts1.getType_label()));
                    eZSearchResult.setComplaint_times(eZSearchContacts1.getReport_count());
                    str7 = i1.w((Context)EZCallApplication.c(), str2);
                    if (str7 != null && !"".equals(str7)) {
                      eZSearchResult.setContact(true);
                      eZSearchResult.setName(str7);
                    } 
                    com.allinone.callerid.f.f.b().c(eZSearchContacts1);
                  } 
                } 
              } 
            } 
            return eZSearchResult;
          } 
          String str6 = str7;
          if (str3 != null) {
            str6 = str7;
            if (!"".equals(str3)) {
              String str = i1.g((Context)EZCallApplication.c(), str2, str3);
              str6 = str7;
              if (str != null) {
                str6 = str7;
                if (!"".equals(str)) {
                  if (d0.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    this();
                    stringBuilder.append("离线数据库search_number: ");
                    stringBuilder.append(str);
                    d0.a("wbb", stringBuilder.toString());
                  } 
                  str6 = str7;
                  if (i1.k0()) {
                    if (d0.a)
                      d0.a("wbb", "离线数据库 isHaveOfflineDb"); 
                    o0 o0 = new o0();
                    this((Context)EZCallApplication.c());
                    EZSearchContacts eZSearchContacts1 = o0.a(str, str2);
                    String str8 = str7;
                    if (eZSearchContacts1 != null) {
                      eZSearchResult1 = new EZSearchResult();
                      this();
                      eZSearchResult1.setNumber(str2);
                      eZSearchResult1.setType(i1.J((Context)EZCallApplication.c(), eZSearchContacts1.getType()));
                      eZSearchResult1.setLocation(eZSearchContacts1.getBelong_area());
                      eZSearchResult1.setOperator(eZSearchContacts1.getOperator());
                      eZSearchResult1.setOld_tel_number(eZSearchContacts1.getOld_tel_number());
                      eZSearchResult1.setTel_number(eZSearchContacts1.getTel_number());
                      eZSearchResult1.setName(eZSearchContacts1.getName());
                      eZSearchResult1.setType_label_id(eZSearchContacts1.getType_label());
                      eZSearchResult1.setType_label(i1.D((Context)EZCallApplication.c(), eZSearchContacts1.getType_label()));
                      eZSearchResult1.setComplaint_times(eZSearchContacts1.getReport_count());
                      str7 = i1.w((Context)EZCallApplication.c(), str2);
                      if (str7 != null && !"".equals(str7)) {
                        eZSearchResult1.setContact(true);
                        eZSearchResult1.setName(str7);
                      } 
                      com.allinone.callerid.f.f.b().c(eZSearchContacts1);
                    } 
                  } 
                } 
              } 
            } 
          } 
          return eZSearchResult1;
        } 
        EZSearchResult eZSearchResult2 = new EZSearchResult();
        this();
        String str5 = eZSearchResult1.getType_label();
        eZSearchResult2.setType_label_id(str5);
        eZSearchResult2.setType_label(i1.D((Context)EZCallApplication.c(), str5));
        str5 = eZSearchResult1.getType();
        if (str5 != null && ("Mobile".equals(str5) || "Fixed line".equals(str5)))
          eZSearchResult2.setType(i1.J((Context)EZCallApplication.c(), str5)); 
        str5 = eZSearchResult1.getName();
        if (str5 != null && !"".equals(str5)) {
          eZSearchResult2.setName(str5);
        } else {
          eZSearchResult2.setName("");
        } 
        eZSearchResult2.setNumber(eZSearchResult1.getOld_tel_number());
        str5 = eZSearchResult1.getOld_tel_number();
        if (str5 != null && !"".equals(str5))
          eZSearchResult2.setOld_tel_number(str5); 
        str5 = eZSearchResult1.getOperator();
        if (str5 != null && !"".equals(str5))
          eZSearchResult2.setOperator(str5); 
        str5 = eZSearchResult1.getFormat_tel_number();
        if (str5 != null && !"".equals(str5))
          eZSearchResult2.setFormat_tel_number(str5); 
        eZSearchResult2.setTel_number(eZSearchResult1.getTel_number());
        eZSearchResult2.setT_p(eZSearchResult1.getT_p());
        str5 = eZSearchResult1.getAvatar();
        if (str5 != null && !"".equals(str5))
          eZSearchResult2.setIcon(str5); 
        str5 = eZSearchResult1.getBelong_area();
        if (str5 != null && !"".equals(str5)) {
          eZSearchResult2.setLocation(str5);
        } else {
          eZSearchResult2.setLocation("");
        } 
        str5 = eZSearchResult1.getAddress();
        if (str5 != null && !"".equals(str5))
          eZSearchResult2.setAddress(str5); 
        eZSearchResult2.setComplaint_times(eZSearchResult1.getReport_count());
        String str4 = i1.w((Context)EZCallApplication.c(), str2);
        if (str4 != null && !"".equals(str4)) {
          eZSearchResult2.setContact(true);
          eZSearchResult2.setName(str4);
        } 
        return eZSearchResult2;
      } catch (Exception exception) {
        exception.printStackTrace();
        return null;
      } 
    }
    
    protected void b(EZSearchResult param1EZSearchResult) {
      super.onPostExecute(param1EZSearchResult);
      this.a.a(param1EZSearchResult);
      Intent intent = new Intent();
      intent.setAction("com.allinone.callerid.INIT_HISTORY");
      b.p.a.a.b((Context)EZCallApplication.c()).d(intent);
    }
  }
  
  private static class c extends AsyncTask<String, Void, String> {
    private c a;
    
    private EZSearchContacts b;
    
    private String c = null;
    
    c(c param1c) {
      this.a = param1c;
    }
    
    protected String a(String... param1VarArgs) {
      StringBuilder stringBuilder;
      EZSearchContacts eZSearchContacts1;
      String str2 = param1VarArgs[0];
      String str1 = p.d((Context)EZCallApplication.c()).getCountry_code();
      try {
        this.b = com.allinone.callerid.f.f.b().d(str2);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      EZSearchContacts eZSearchContacts2 = this.b;
      if (eZSearchContacts2 != null) {
        if (eZSearchContacts2.getSearch_time() == 0L && !this.b.isSearched()) {
          if (d0.a)
            d0.a("wbb", "searchContact: 离线查询"); 
          if (i.b()) {
            g0.f((Context)EZCallApplication.c());
            com.phone.libphone.l.a a = f.a(str2, str1);
            if (a != null) {
              if (d0.a) {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("mode:");
                stringBuilder1.append(a.toString());
                d0.a("wbb", stringBuilder1.toString());
              } 
              if (a.i()) {
                g0.s((Context)EZCallApplication.c());
                if (a.h())
                  g0.t((Context)EZCallApplication.c()); 
              } 
              str2 = a.e();
              if (str2 != null && !"".equals(str2))
                q.b().c("search_offline_parser_guishudi"); 
              if (a.f() != null) {
                int i = f.a.a[a.f().ordinal()];
                if (i != 1) {
                  if (i != 2) {
                    if (i == 3)
                      q.b().c("number_type_fixed_line_or_mobile"); 
                  } else {
                    q.b().c("number_type_fixed_line");
                  } 
                } else {
                  q.b().c("number_type_mobile");
                } 
              } 
              g0.h((Context)EZCallApplication.c());
              if (a.h())
                g0.g((Context)EZCallApplication.c()); 
              eZSearchContacts1 = new EZSearchContacts();
              this.b = eZSearchContacts1;
              eZSearchContacts1.setBelong_area(a.d());
              if (a.g() != null && ("Mobile".equals(a.g()) || "Fixed line".equals(a.g())))
                this.b.setType(i1.J((Context)EZCallApplication.c(), a.g())); 
              this.b.setFormat_tel_number(a.b());
              this.b.setOperator(a.a());
              String str = a.c();
              this.c = str;
              if (str != null && str.contains("+"))
                this.c = this.c.replace("+", ""); 
              if (d0.a) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("formatE164: ");
                stringBuilder.append(this.c);
                d0.a("wbb", stringBuilder.toString());
              } 
            } 
          } 
          return "search";
        } 
        if (d0.a)
          d0.a("wbb", "searchContact: 本地库查询"); 
        return "db";
      } 
      if (d0.a)
        d0.a("wbb", "searchContact: 离线查询"); 
      if (i.b()) {
        g0.f((Context)EZCallApplication.c());
        com.phone.libphone.l.a a = f.a((String)eZSearchContacts1, (String)stringBuilder);
        if (a != null) {
          if (d0.a) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("mode:");
            stringBuilder1.append(a.toString());
            d0.a("wbb", stringBuilder1.toString());
          } 
          if (a.i()) {
            g0.s((Context)EZCallApplication.c());
            if (a.h())
              g0.t((Context)EZCallApplication.c()); 
          } 
          String str4 = a.e();
          if (str4 != null && !"".equals(str4))
            q.b().c("search_offline_parser_guishudi"); 
          if (a.f() != null) {
            int i = f.a.a[a.f().ordinal()];
            if (i != 1) {
              if (i != 2) {
                if (i == 3)
                  q.b().c("number_type_fixed_line_or_mobile"); 
              } else {
                q.b().c("number_type_fixed_line");
              } 
            } else {
              q.b().c("number_type_mobile");
            } 
          } 
          g0.h((Context)EZCallApplication.c());
          if (a.h())
            g0.g((Context)EZCallApplication.c()); 
          EZSearchContacts eZSearchContacts = new EZSearchContacts();
          this.b = eZSearchContacts;
          eZSearchContacts.setBelong_area(a.d());
          if (a.g() != null && ("Mobile".equals(a.g()) || "Fixed line".equals(a.g())))
            this.b.setType(i1.J((Context)EZCallApplication.c(), a.g())); 
          this.b.setFormat_tel_number(a.b());
          this.b.setOperator(a.a());
          String str3 = a.c();
          this.c = str3;
          if (str3 != null && str3.contains("+"))
            this.c = this.c.replace("+", ""); 
          if (d0.a) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("formatE164: ");
            stringBuilder1.append(this.c);
            d0.a("wbb", stringBuilder1.toString());
          } 
        } 
      } 
      return "search";
    }
    
    protected void b(String param1String) {
      super.onPostExecute(param1String);
      if ("search".equals(param1String)) {
        this.a.a(this.b, this.c);
      } else if ("db".equals(param1String)) {
        this.a.b(this.b);
      } 
    }
  }
  
  private static class d extends AsyncTask<String, Void, CallLogBean> {
    private d() {}
    
    protected CallLogBean a(String... param1VarArgs) {
      CallLogBean callLogBean1;
      CallLogBean callLogBean2;
      String str1 = param1VarArgs[0];
      if (d0.a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("剪贴板查询开始： ");
        stringBuilder.append(str1);
        d0.a("wbb", stringBuilder.toString());
      } 
      String str2 = p.d((Context)EZCallApplication.c()).getCountry_code();
      EZSearchContacts eZSearchContacts = com.allinone.callerid.f.f.b().d(str1);
      param1VarArgs = null;
      if (eZSearchContacts == null) {
        com.phone.libphone.l.a a = f.a(str1, str2);
        if (a != null) {
          callLogBean2 = new CallLogBean();
          callLogBean2.N0(i1.J((Context)EZCallApplication.c(), a.g()));
          callLogBean2.w0(a.b());
          callLogBean2.e0(a.d());
          callLogBean2.G0(a.a());
          callLogBean2.D0(str1);
          EZSearchContacts eZSearchContacts1 = new EZSearchContacts();
          eZSearchContacts1.setBelong_area(a.d());
          eZSearchContacts1.setType(a.g());
          eZSearchContacts1.setFormat_tel_number(a.b());
          eZSearchContacts1.setOperator(a.a());
          eZSearchContacts1.setOld_tel_number(str1);
          com.allinone.callerid.f.f.b().c(eZSearchContacts1);
          callLogBean1 = callLogBean2;
          if (d0.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(callLogBean2.p());
            d0.a("wbb", stringBuilder.toString());
            CallLogBean callLogBean = callLogBean2;
          } 
        } 
      } else {
        callLogBean1 = new CallLogBean();
        callLogBean1.O0(callLogBean2.isSearched());
        callLogBean1.d1(i1.D((Context)EZCallApplication.c(), callLogBean2.getType_label()));
        callLogBean1.K0(callLogBean2.getReport_count());
        callLogBean1.e0(callLogBean2.getBelong_area());
        callLogBean1.L0(callLogBean2.getName());
        callLogBean1.B0(callLogBean2.getName());
        if (callLogBean2.getType() != null && ("Mobile".equals(callLogBean2.getType()) || "Fixed line".equals(callLogBean2.getType())))
          callLogBean1.N0(i1.J((Context)EZCallApplication.c(), callLogBean2.getType())); 
        callLogBean1.Z0(callLogBean2.getTel_number());
        callLogBean1.F0(callLogBean2.getOld_tel_number());
        callLogBean1.w0(callLogBean2.getFormat_tel_number());
        callLogBean1.G0(callLogBean2.getOperator());
        callLogBean1.a0(callLogBean2.getAddress());
        callLogBean1.b0(callLogBean2.getAvatar());
        callLogBean1.v0(callLogBean2.getFb_avatar());
        callLogBean1.Y0(callLogBean2.getT_p());
        callLogBean1.u0(callLogBean2.getFaild_error_log());
        callLogBean1.D0(str1);
      } 
      return callLogBean1;
    }
    
    protected void b(CallLogBean param1CallLogBean) {
      super.onPostExecute(param1CallLogBean);
      if (param1CallLogBean != null) {
        if (d0.a)
          d0.a("wbb", "剪贴板查询成功"); 
        try {
          com.allinone.callerid.h.a.o().u((Context)EZCallApplication.c(), param1CallLogBean);
          Handler handler = new Handler();
          this();
          a a = new a();
          this(this);
          handler.postDelayed(a, 6000L);
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } 
    }
    
    class a implements Runnable {
      a(f.d this$0) {}
      
      public void run() {
        com.allinone.callerid.h.a.o().q();
      }
    }
  }
  
  class a implements Runnable {
    a(f this$0) {}
    
    public void run() {
      com.allinone.callerid.h.a.o().q();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/l/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */