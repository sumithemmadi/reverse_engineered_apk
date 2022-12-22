package com.allinone.callerid.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings;
import android.view.View;
import com.allinone.callerid.bean.recorder.RecordCall;
import com.allinone.callerid.callscreen.bean.HomeInfo;
import com.allinone.callerid.callscreen.bean.PersonaliseContact;
import com.allinone.callerid.main.EZCallApplication;
import com.allinone.callerid.model.EZSearchContacts;
import com.allinone.callerid.mvc.controller.MainActivity;
import com.allinone.callerid.mvc.controller.block.BlockSettingActivity;
import com.allinone.callerid.mvc.controller.recommend.RecommendActivity;
import com.allinone.callerid.util.a1;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.j0;
import com.allinone.callerid.util.q;
import com.allinone.callerid.util.q0;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PhoneSceneService extends Service {
  private int b;
  
  private String c;
  
  private p d = new p(this, null);
  
  private com.allinone.callerid.util.m e;
  
  private int f = 0;
  
  private com.allinone.callerid.dialog.l g;
  
  private void A(Context paramContext) {
    try {
      com.allinone.callerid.dialog.l l1 = new com.allinone.callerid.dialog.l();
      g g = new g();
      this(this, paramContext);
      this(paramContext, 2131820783, g);
      this.g = l1;
      if (Build.VERSION.SDK_INT >= 26) {
        l1.getWindow().setType(2038);
      } else {
        l1.getWindow().setType(2003);
      } 
      q.b().c("private_number_dialog");
      this.g.show();
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void B(Context paramContext, String paramString1, int paramInt1, String paramString2, int paramInt2) {
    q.b().d("incoming");
    if (paramString1 == null || "".equals(paramString1)) {
      q.b().d("incoming_number_null_empty");
      if (com.allinone.callerid.d.f.f.b()) {
        u(paramContext, paramString1, 3, "", paramInt2);
      } else {
        com.allinone.callerid.h.c.A0().Q0((Context)EZCallApplication.c(), paramString1, paramInt1, 3, "", paramInt2);
      } 
      return;
    } 
    if (paramString2 != null && !"".equals(paramString2)) {
      q.b().c("incoming_contact");
      if (b1.v0()) {
        if (com.allinone.callerid.d.f.f.b()) {
          u(paramContext, paramString1, 0, paramString2, paramInt2);
        } else {
          com.allinone.callerid.h.c.A0().Q0((Context)EZCallApplication.c(), paramString1, paramInt1, 0, paramString2, paramInt2);
        } 
        q.b().c("showfloat");
        q.b().d("showfloat_incoming_contact");
      } else {
        q.b().c("show_close_is_contact");
      } 
      g0.i((Context)EZCallApplication.c());
    } else {
      if (d0.a)
        d0.a("callstatus", "showfloat"); 
      if (com.allinone.callerid.d.f.f.b()) {
        u(paramContext, paramString1, 1, "", paramInt2);
      } else {
        com.allinone.callerid.h.c.A0().Q0((Context)EZCallApplication.c(), paramString1, paramInt1, 1, "", paramInt2);
      } 
      q.b().c("showfloat");
      q.b().d("incoming_not_contact");
      g0.Q((Context)EZCallApplication.c());
    } 
  }
  
  private void C(int paramInt, String paramString) {
    this.b = 0;
    switch (paramInt) {
      default:
        return;
      case 6:
        r(getApplicationContext(), paramString);
        if (b1.s())
          com.allinone.callerid.i.a.h.d.b(getApplicationContext()); 
        stopSelf();
      case 5:
        i1.d = false;
        n(getApplicationContext(), paramString);
        if (b1.s())
          com.allinone.callerid.i.a.h.d.b(getApplicationContext()); 
        stopSelf();
      case 4:
        p(getApplicationContext(), paramString);
        if (b1.s())
          com.allinone.callerid.i.a.h.d.b(getApplicationContext()); 
      case 3:
        i1.d = true;
        o(getApplicationContext(), paramString);
      case 2:
        q(getApplicationContext(), paramString);
        com.allinone.callerid.util.d.c(getApplicationContext());
        stopSelf();
      case 1:
        break;
    } 
    m(getApplicationContext(), paramString);
    com.allinone.callerid.util.d.c(getApplicationContext());
    i1.h(getApplicationContext());
  }
  
  private void a(Context paramContext, String paramString1, String paramString2) {
    if (paramString1 != null && !paramString1.equals(""))
      com.allinone.callerid.i.a.j.h.a(paramContext, paramString1, paramString2, new c(this, paramContext)); 
  }
  
  private void l() {
    com.allinone.callerid.h.c.A0().C0();
  }
  
  private void m(Context paramContext, String paramString) {
    try {
      if (d0.a)
        d0.a("callstatus", "inComingRingingToDo"); 
      com.allinone.callerid.util.a.b();
      (com.allinone.callerid.h.c.A0()).N = false;
      if (paramString == null || "".equals(paramString) || paramString.isEmpty()) {
        q.b().c("unknown_number_call");
        if (b1.w()) {
          q.b().c("unknown_number_call_blocked");
          i1.m(paramContext);
          stopSelf();
        } else {
          v(paramContext, paramString, "", 0);
          stopSelf();
        } 
      } else {
        a a = new a();
        this(this, paramContext, paramString);
        com.allinone.callerid.i.a.k.b.d(paramString, a);
      } 
      b1.e1(System.currentTimeMillis());
      Boolean bool = Boolean.FALSE;
      b1.K2(bool);
      b1.I2(bool);
      b1.i1(false);
      b1.V2(bool);
      b1.P2(bool);
      h h = new h();
      this(this);
      com.allinone.callerid.i.a.t.b.b(paramContext, paramString, h);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void n(Context paramContext, String paramString) {
    b.f().m(false);
    com.allinone.callerid.h.c.A0().H0();
    com.allinone.callerid.d.c.a.y().J();
    i1.I0(paramContext);
    if (com.allinone.callerid.util.j1.a.c() == 1)
      q0.e(paramContext); 
    if (paramString != null && !"".equals(paramString)) {
      try {
        if (b1.q2().booleanValue())
          w(paramContext, 1, paramString); 
        String str = this.c;
        l l1 = new l();
        this(this, paramContext, paramString);
        com.allinone.callerid.i.a.j.f.a(paramContext, str, l1);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } else if (b1.O()) {
      if (Build.VERSION.SDK_INT >= 23) {
        if (Settings.canDrawOverlays((Context)EZCallApplication.c()))
          A((Context)exception); 
      } else {
        A((Context)exception);
      } 
    } 
    if (b1.w2().booleanValue()) {
      q.b().e("new_end_call_failed");
      if (d0.a)
        d0.a("tony", "8.0挂断方法失败"); 
      b1.O2(Boolean.FALSE);
    } 
  }
  
  private void o(Context paramContext, String paramString) {
    if ((com.allinone.callerid.h.c.A0()).l0 != null) {
      l();
      com.allinone.callerid.h.c.A0().G0(this.c, 1);
    } 
    if ((com.allinone.callerid.d.c.a.y()).x != null) {
      com.allinone.callerid.d.c.a.y().B();
      com.allinone.callerid.d.c.a.y().H(this.c, 1);
    } 
    if (com.allinone.callerid.d.f.f.d()) {
      com.allinone.callerid.d.f.f.p(false);
      q0.e(paramContext);
    } 
    b.p.a.a.b(paramContext).d(new Intent("com.allinone.callerid.ACCEPT_END_ACTION"));
    if (com.allinone.callerid.util.j1.a.c() == 1)
      q0.e(paramContext); 
    if (paramString != null && !"".equals(paramString))
      (j0.a()).b.execute(new i(this, paramContext, paramString)); 
  }
  
  private void p(Context paramContext, String paramString) {
    b.p.a.a.b(paramContext).d(new Intent("com.allinone.callerid.ACCEPT_END_ACTION"));
    if ((com.allinone.callerid.h.c.A0()).l0 != null)
      l(); 
    if ((com.allinone.callerid.d.c.a.y()).x != null) {
      com.allinone.callerid.d.c.a.y().B();
    } else if (!((com.allinone.callerid.h.b)com.allinone.callerid.h.c.A0()).a) {
      (com.allinone.callerid.h.c.A0()).N = true;
    } else {
      (com.allinone.callerid.h.c.A0()).N = false;
    } 
    ((com.allinone.callerid.h.b)com.allinone.callerid.h.c.A0()).a = false;
    if (com.allinone.callerid.d.f.f.d()) {
      com.allinone.callerid.d.f.f.p(false);
      q0.e(paramContext);
    } 
    i1.I0(paramContext);
    b.f().m(false);
    com.allinone.callerid.h.c.A0().H0();
    com.allinone.callerid.d.c.a.y().J();
    if (com.allinone.callerid.util.j1.a.c() == 1)
      q0.e(paramContext); 
    if (paramString == null || "".equals(paramString)) {
      if (b1.O())
        if (Build.VERSION.SDK_INT >= 23) {
          if (Settings.canDrawOverlays((Context)EZCallApplication.c()))
            A(paramContext); 
        } else {
          A(paramContext);
        }  
      stopSelf();
      return;
    } 
    try {
      if (b1.D()) {
        t(paramContext, paramString);
      } else if (!b1.r2().booleanValue()) {
        String str = this.c;
        j j = new j();
        this(this, paramContext, paramString);
        com.allinone.callerid.i.a.j.c.a(paramContext, str, j);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    (j0.a()).b.execute(new k(this, paramContext, paramString));
    stopSelf();
  }
  
  private void q(Context paramContext, String paramString) {
    try {
      com.allinone.callerid.util.a.b();
      if (b1.z2().booleanValue() && paramString != null && !"".equals(paramString))
        y(paramContext, paramString, 0); 
      com.allinone.callerid.i.a.t.b.a(paramContext, paramString, null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void r(Context paramContext, String paramString) {
    b.f().m(false);
    com.allinone.callerid.h.c.A0().H0();
    if ((com.allinone.callerid.h.c.A0()).l0 != null) {
      l();
    } else if (b1.v0()) {
      if (!((com.allinone.callerid.h.b)com.allinone.callerid.h.c.A0()).a) {
        (com.allinone.callerid.h.c.A0()).N = true;
      } else {
        (com.allinone.callerid.h.c.A0()).N = false;
      } 
    } 
    ((com.allinone.callerid.h.b)com.allinone.callerid.h.c.A0()).a = false;
    i1.I0(paramContext);
    if (paramString != null && !paramString.equals("")) {
      if (b1.R() && b1.E())
        b1.r1(true); 
      try {
        if (i1.e(paramContext)) {
          n n = new n();
          this(this, paramContext, paramString);
          com.allinone.callerid.i.a.d.a.a(n);
        } else if (b1.z2().booleanValue()) {
          z(paramContext, 0, paramString);
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  private void s(Context paramContext, String paramString1, String paramString2) {
    try {
      if (i1.a(paramContext) && !i1.v0(paramString1)) {
        b b = new b();
        this(this, paramContext);
        com.allinone.callerid.i.a.h.j.b.a(paramContext, paramString1, paramString2, b);
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  private void t(Context paramContext, String paramString) {
    if (b1.n0()) {
      a1.c(paramContext, paramString);
    } else {
      q.b().c("showmissed_close");
    } 
  }
  
  private void u(Context paramContext, String paramString1, int paramInt1, String paramString2, int paramInt2) {
    com.allinone.callerid.d.e.e.a.a(paramString1, new f(this, paramContext, paramString1, paramInt1, paramString2, paramInt2));
  }
  
  private void v(Context paramContext, String paramString1, String paramString2, int paramInt) {
    if (b1.u0())
      B(paramContext, paramString1, 1, paramString2, paramInt); 
  }
  
  private void w(Context paramContext, int paramInt, String paramString) {
    com.allinone.callerid.i.a.j.f.a(paramContext, paramString, new m(this, paramContext, paramInt, paramString));
  }
  
  private void x(Context paramContext, int paramInt, boolean paramBoolean, String paramString) {
    if (b1.n0()) {
      com.allinone.callerid.i.a.j.f.a(paramContext, paramString, new d(this, paramContext, paramInt, paramString, paramBoolean));
    } else {
      q.b().c("showmissed_close");
    } 
  }
  
  private void y(Context paramContext, String paramString, int paramInt) {
    q.b().c("showcaller");
    q.b().c("outgoing");
    q.b().d("outgoing");
    com.allinone.callerid.i.a.j.f.b(paramContext, paramString, new e(this, paramString, paramInt));
  }
  
  private void z(Context paramContext, int paramInt, String paramString) {
    com.allinone.callerid.i.a.j.f.a(paramContext, paramString, new o(this, paramContext, paramInt, paramString));
  }
  
  public IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public void onCreate() {
    super.onCreate();
    if (d0.a)
      d0.a("callstatus", "onCreate"); 
  }
  
  public void onDestroy() {
    super.onDestroy();
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    if (d0.a)
      d0.a("callstatus", "onStartCommand"); 
    if (paramIntent != null) {
      this.b = paramIntent.getIntExtra("telephonering_sence", 0);
      String str = paramIntent.getStringExtra("telephonering_num");
      this.c = str;
      int i = this.b;
      if (i != 0)
        C(i, str); 
    } 
    return super.onStartCommand(paramIntent, paramInt1, paramInt2);
  }
  
  class a implements com.allinone.callerid.i.a.k.a {
    a(PhoneSceneService this$0, Context param1Context, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean) {
        if (com.allinone.callerid.util.j1.a.c() == 1) {
          if (b1.v()) {
            com.allinone.callerid.i.a.j.f.a(this.a, this.b, new a(this));
          } else {
            q0.f(this.a);
          } 
        } else {
          i1.m(this.a);
          com.allinone.callerid.util.d.h(this.b, System.currentTimeMillis());
          com.allinone.callerid.i.a.j.c.a(this.a, this.b, new b(this));
        } 
        this.c.stopSelf();
      } else {
        if (d0.a)
          d0.a("callstatus", "NotDisturb"); 
        (j0.a()).b.execute(new c(this));
      } 
    }
    
    class a implements com.allinone.callerid.i.a.j.d {
      a(PhoneSceneService.a this$0) {}
      
      public void a(String param2String) {
        boolean bool;
        if (param2String != null) {
          bool = true;
        } else {
          bool = false;
        } 
        if ((("".equals(param2String) ^ true) & bool) != 0) {
          q0.f(this.a.a);
        } else {
          i1.m(this.a.c.getApplicationContext());
          com.allinone.callerid.util.d.h(this.a.b, System.currentTimeMillis());
          q.b().c("block_list");
          com.allinone.callerid.i.a.j.c.a(this.a.c.getApplicationContext(), this.a.b, new a(this));
          this.a.c.stopSelf();
        } 
      }
      
      class a implements com.allinone.callerid.i.a.j.b {
        a(PhoneSceneService.a.a this$0) {}
        
        public void a(boolean param3Boolean, String param3String) {
          PhoneSceneService phoneSceneService = this.a.a.c;
          PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.a.a.b, param3String);
        }
      }
    }
    
    class a implements com.allinone.callerid.i.a.j.b {
      a(PhoneSceneService.a this$0) {}
      
      public void a(boolean param2Boolean, String param2String) {
        PhoneSceneService phoneSceneService = this.a.a.c;
        PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.a.a.b, param2String);
      }
    }
    
    class b implements com.allinone.callerid.i.a.j.b {
      b(PhoneSceneService.a this$0) {}
      
      public void a(boolean param2Boolean, String param2String) {
        PhoneSceneService phoneSceneService = this.a.c;
        PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.a.b, param2String);
      }
    }
    
    class c implements Runnable {
      c(PhoneSceneService.a this$0) {}
      
      public void run() {
        boolean bool4;
        boolean bool1 = false;
        b1.l1(false);
        PhoneSceneService.a a1 = this.b;
        boolean bool2 = com.allinone.callerid.util.h.c(a1.a, a1.b);
        if (PhoneSceneService.e(this.b.c) == null) {
          a1 = this.b;
          PhoneSceneService.f(a1.c, new com.allinone.callerid.util.m(a1.a));
        } 
        boolean bool3 = PhoneSceneService.e(this.b.c).j(this.b.b).booleanValue();
        a1 = this.b;
        String str = i1.w(a1.a, a1.b);
        if (str != null && !"".equals(str)) {
          bool1 = true;
          PhoneSceneService.a a2 = this.b;
          bool4 = i1.Z(a2.a, a2.b);
        } else {
          bool4 = false;
        } 
        boolean bool5 = b1.u();
        boolean bool6 = b1.v();
        Message message = PhoneSceneService.g(this.b.c).obtainMessage();
        message.what = 120;
        Bundle bundle = new Bundle();
        bundle.putString("num", this.b.b);
        bundle.putBoolean("isInBlackList", bool3);
        bundle.putBoolean("is_in_custom_list", bool2);
        bundle.putBoolean("contact_exist", bool1);
        bundle.putString("contact_name", str);
        bundle.putBoolean("is_enable_block", bool5);
        bundle.putBoolean("is_enable_unknow", bool6);
        bundle.putInt("contacts_id", bool4);
        message.setData(bundle);
        PhoneSceneService.g(this.b.c).sendMessage(message);
        if (d0.a)
          d0.a("callstatus", "handler.sendMessage"); 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.j.d {
    a(PhoneSceneService this$0) {}
    
    public void a(String param1String) {
      boolean bool;
      if (param1String != null) {
        bool = true;
      } else {
        bool = false;
      } 
      if ((("".equals(param1String) ^ true) & bool) != 0) {
        q0.f(this.a.a);
      } else {
        i1.m(this.a.c.getApplicationContext());
        com.allinone.callerid.util.d.h(this.a.b, System.currentTimeMillis());
        q.b().c("block_list");
        com.allinone.callerid.i.a.j.c.a(this.a.c.getApplicationContext(), this.a.b, new a(this));
        this.a.c.stopSelf();
      } 
    }
    
    class a implements com.allinone.callerid.i.a.j.b {
      a(PhoneSceneService.a.a this$0) {}
      
      public void a(boolean param3Boolean, String param3String) {
        PhoneSceneService phoneSceneService = this.a.a.c;
        PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.a.a.b, param3String);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.j.b {
    a(PhoneSceneService this$0) {}
    
    public void a(boolean param1Boolean, String param1String) {
      PhoneSceneService phoneSceneService = this.a.a.c;
      PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.a.a.b, param1String);
    }
  }
  
  class b implements com.allinone.callerid.i.a.j.b {
    b(PhoneSceneService this$0) {}
    
    public void a(boolean param1Boolean, String param1String) {
      PhoneSceneService phoneSceneService = this.a.c;
      PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.a.b, param1String);
    }
  }
  
  class c implements Runnable {
    c(PhoneSceneService this$0) {}
    
    public void run() {
      boolean bool4;
      boolean bool1 = false;
      b1.l1(false);
      PhoneSceneService.a a1 = this.b;
      boolean bool2 = com.allinone.callerid.util.h.c(a1.a, a1.b);
      if (PhoneSceneService.e(this.b.c) == null) {
        a1 = this.b;
        PhoneSceneService.f(a1.c, new com.allinone.callerid.util.m(a1.a));
      } 
      boolean bool3 = PhoneSceneService.e(this.b.c).j(this.b.b).booleanValue();
      a1 = this.b;
      String str = i1.w(a1.a, a1.b);
      if (str != null && !"".equals(str)) {
        bool1 = true;
        PhoneSceneService.a a2 = this.b;
        bool4 = i1.Z(a2.a, a2.b);
      } else {
        bool4 = false;
      } 
      boolean bool5 = b1.u();
      boolean bool6 = b1.v();
      Message message = PhoneSceneService.g(this.b.c).obtainMessage();
      message.what = 120;
      Bundle bundle = new Bundle();
      bundle.putString("num", this.b.b);
      bundle.putBoolean("isInBlackList", bool3);
      bundle.putBoolean("is_in_custom_list", bool2);
      bundle.putBoolean("contact_exist", bool1);
      bundle.putString("contact_name", str);
      bundle.putBoolean("is_enable_block", bool5);
      bundle.putBoolean("is_enable_unknow", bool6);
      bundle.putInt("contacts_id", bool4);
      message.setData(bundle);
      PhoneSceneService.g(this.b.c).sendMessage(message);
      if (d0.a)
        d0.a("callstatus", "handler.sendMessage"); 
    }
  }
  
  class b implements com.allinone.callerid.i.a.h.j.a {
    b(PhoneSceneService this$0, Context param1Context) {}
    
    public void a(JSONArray param1JSONArray) {
      com.allinone.callerid.i.a.h.b.a(this.a, param1JSONArray, new a(this));
    }
    
    class a implements com.allinone.callerid.i.a.h.a {
      a(PhoneSceneService.b this$0) {}
      
      public void a(String param2String) {
        if (param2String != null && !"".equals(param2String))
          try {
            JSONObject jSONObject = new JSONObject();
            this(param2String);
            if (jSONObject.getInt("status") == 1)
              com.allinone.callerid.i.a.h.h.a(this.a.a); 
          } catch (JSONException jSONException) {
            jSONException.printStackTrace();
          }  
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.h.a {
    a(PhoneSceneService this$0) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String))
        try {
          JSONObject jSONObject = new JSONObject();
          this(param1String);
          if (jSONObject.getInt("status") == 1)
            com.allinone.callerid.i.a.h.h.a(this.a.a); 
        } catch (JSONException jSONException) {
          jSONException.printStackTrace();
        }  
    }
  }
  
  class c implements com.allinone.callerid.i.a.j.g {
    c(PhoneSceneService this$0, Context param1Context) {}
    
    public void a(String param1String1, String param1String2, boolean param1Boolean1, boolean param1Boolean2, boolean param1Boolean3) {
      try {
        if (!i1.q0()) {
          NotificationManager notificationManager = (NotificationManager)this.a.getSystemService("notification");
          Intent intent = new Intent();
          this(this.a, MainActivity.class);
          if (param1Boolean1)
            intent.putExtra("blockedcall", true); 
          intent.putExtra("missedcall", true);
          PendingIntent pendingIntent = PendingIntent.getActivity(this.a, 1, intent, 134217728);
          androidx.core.app.i.e e = new androidx.core.app.i.e();
          this(this.a, "Showcaller");
          e.j(param1String1).k(param1String2).i(pendingIntent).y(this.a.getResources().getString(2131755466)).B(System.currentTimeMillis()).t(-2).s(false).f(true);
          try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
              NotificationChannel notificationChannel = new NotificationChannel();
              this("com.allinone.callerid_notfication_N", "Showcaller", 3);
              if (notificationManager != null) {
                notificationChannel.setShowBadge(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setVibrationPattern(new long[] { 0L });
                notificationManager.createNotificationChannel(notificationChannel);
                e.g("com.allinone.callerid_notfication_N");
              } 
            } 
          } finally {
            param1String1 = null;
          } 
          if (!param1Boolean1 && param1Boolean2 && notificationManager != null)
            notificationManager.notify(1, e.b()); 
          if (param1Boolean1 && param1Boolean3 && notificationManager != null)
            notificationManager.notify(1, e.b()); 
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    }
  }
  
  class d implements com.allinone.callerid.i.a.j.d {
    d(PhoneSceneService this$0, Context param1Context, int param1Int, String param1String, boolean param1Boolean) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String)) {
        if (b1.v0())
          a1.d(this.a, this.b, 1, this.c, this.d, 1, PhoneSceneService.i(this.e)); 
      } else {
        a1.d(this.a, this.b, 0, this.c, this.d, 1, PhoneSceneService.i(this.e));
      } 
    }
  }
  
  class e implements com.allinone.callerid.i.a.j.e {
    e(PhoneSceneService this$0, String param1String, int param1Int) {}
    
    public void a(int param1Int, String param1String) {
      if (param1String != null && !"".equals(param1String)) {
        q.b().c("outgoing_contact");
        if (b1.v0()) {
          q.b().c("showfloat_outgoing");
          q.b().c("showfloat_outgoing_contact");
          q.b().d("showfloat_outgoing_contact");
          com.allinone.callerid.h.c.A0().Q0((Context)EZCallApplication.c(), this.a, this.b, 0, param1String, param1Int);
        } 
        g0.j((Context)EZCallApplication.c());
        com.allinone.callerid.util.recorder.f.s(this.a, 0, 0);
      } else {
        q.b().d("outgoing_unkonwn");
        com.allinone.callerid.h.c.A0().Q0((Context)EZCallApplication.c(), this.a, this.b, 1, "", 0);
        g0.S((Context)EZCallApplication.c());
        com.allinone.callerid.util.recorder.f.s(this.a, 1, 0);
      } 
    }
  }
  
  class f implements com.allinone.callerid.d.e.e.b {
    f(PhoneSceneService this$0, Context param1Context, String param1String1, int param1Int1, String param1String2, int param1Int2) {}
    
    public void a(PersonaliseContact param1PersonaliseContact) {
      if (param1PersonaliseContact != null) {
        HomeInfo homeInfo = new HomeInfo();
        homeInfo.setPath(param1PersonaliseContact.getPath());
        homeInfo.setName(param1PersonaliseContact.getName());
        homeInfo.setPhone(param1PersonaliseContact.getNumber());
        homeInfo.setIsdiy(param1PersonaliseContact.isIsdiy());
        homeInfo.setUseVideoAudioRing(param1PersonaliseContact.isUseVideoAudioRing());
        if (com.allinone.callerid.util.k1.a.f()) {
          if (homeInfo.isIsdiy() && homeInfo.isUseVideoAudioRing()) {
            q0.f(this.a);
            com.allinone.callerid.d.f.f.p(true);
          } 
          com.allinone.callerid.d.c.a.y().N(this.a, this.b, homeInfo, this.c, this.d, this.e);
        } 
        this.f.stopSelf();
      } else {
        com.allinone.callerid.d.e.e.d.b(new a(this));
      } 
    }
    
    class a implements com.allinone.callerid.d.e.e.c {
      a(PhoneSceneService.f this$0) {}
      
      public void a(boolean param2Boolean, HomeInfo param2HomeInfo) {
        if (param2HomeInfo != null) {
          try {
            if (com.allinone.callerid.util.k1.a.f()) {
              if (param2HomeInfo.isIsdiy() && param2HomeInfo.isUseVideoAudioRing()) {
                q0.f(this.a.a);
                com.allinone.callerid.d.f.f.p(true);
              } 
              com.allinone.callerid.d.c.a a1 = com.allinone.callerid.d.c.a.y();
              PhoneSceneService.f f1 = this.a;
              a1.N(f1.a, f1.b, param2HomeInfo, f1.c, f1.d, f1.e);
            } 
          } catch (Exception exception) {
            exception.printStackTrace();
          } 
        } else {
          com.allinone.callerid.h.c c1 = com.allinone.callerid.h.c.A0();
          EZCallApplication eZCallApplication = EZCallApplication.c();
          PhoneSceneService.f f1 = this.a;
          c1.Q0((Context)eZCallApplication, f1.b, 1, f1.c, f1.d, f1.e);
        } 
        this.a.f.stopSelf();
      }
    }
  }
  
  class a implements com.allinone.callerid.d.e.e.c {
    a(PhoneSceneService this$0) {}
    
    public void a(boolean param1Boolean, HomeInfo param1HomeInfo) {
      if (param1HomeInfo != null) {
        try {
          if (com.allinone.callerid.util.k1.a.f()) {
            if (param1HomeInfo.isIsdiy() && param1HomeInfo.isUseVideoAudioRing()) {
              q0.f(this.a.a);
              com.allinone.callerid.d.f.f.p(true);
            } 
            com.allinone.callerid.d.c.a a1 = com.allinone.callerid.d.c.a.y();
            PhoneSceneService.f f1 = this.a;
            a1.N(f1.a, f1.b, param1HomeInfo, f1.c, f1.d, f1.e);
          } 
        } catch (Exception exception) {
          exception.printStackTrace();
        } 
      } else {
        com.allinone.callerid.h.c c1 = com.allinone.callerid.h.c.A0();
        EZCallApplication eZCallApplication = EZCallApplication.c();
        PhoneSceneService.f f1 = this.a;
        c1.Q0((Context)eZCallApplication, f1.b, 1, f1.c, f1.d, f1.e);
      } 
      this.a.f.stopSelf();
    }
  }
  
  class g implements View.OnClickListener {
    g(PhoneSceneService this$0, Context param1Context) {}
    
    public void onClick(View param1View) {
      int i = param1View.getId();
      if (i != 2131296485) {
        if (i != 2131296741) {
          if (i == 2131296752) {
            q.b().c("private_number_dialog_ingore");
            PhoneSceneService.k(this.c).dismiss();
          } 
        } else {
          q.b().c("private_number_dialog_enable");
          Intent intent = new Intent();
          intent.setClass(this.b, BlockSettingActivity.class);
          intent.addFlags(268435456);
          this.b.startActivity(intent);
          PhoneSceneService.k(this.c).dismiss();
        } 
      } else {
        q.b().c("private_number_dialog_close");
        PhoneSceneService.k(this.c).dismiss();
      } 
    }
  }
  
  class h implements com.allinone.callerid.i.a.t.a {
    h(PhoneSceneService this$0) {}
    
    public void a(EZSearchContacts param1EZSearchContacts) {}
  }
  
  class i implements Runnable {
    i(PhoneSceneService this$0, Context param1Context, String param1String) {}
    
    public void run() {
      boolean bool2;
      boolean bool1 = i1.Y(this.b, this.c);
      if (!com.allinone.callerid.util.recorder.b.e() || !com.allinone.callerid.i.a.u.a.a()) {
        bool2 = false;
      } else {
        bool2 = com.allinone.callerid.util.recorder.f.n(this.c, bool1 ^ true);
      } 
      if (!bool1) {
        b1.E0(System.currentTimeMillis());
        g0.P(this.b);
      } 
      if (b1.S()) {
        q.b().c("is_spam_answered_all");
        g0.u(this.b);
      } 
      Message message = PhoneSceneService.g(this.d).obtainMessage();
      message.what = 122;
      Bundle bundle = new Bundle();
      bundle.putBoolean("can_record", bool2);
      bundle.putString("incoming_number", this.c);
      message.setData(bundle);
      PhoneSceneService.g(this.d).sendMessage(message);
    }
  }
  
  class j implements com.allinone.callerid.i.a.j.b {
    j(PhoneSceneService this$0, Context param1Context, String param1String) {}
    
    public void a(boolean param1Boolean, String param1String) {
      PhoneSceneService.h(this.c, this.a, 1, param1Boolean, this.b);
      if (!param1Boolean)
        PhoneSceneService.b(this.c, this.a, this.b, param1String); 
    }
  }
  
  class k implements Runnable {
    k(PhoneSceneService this$0, Context param1Context, String param1String) {}
    
    public void run() {
      boolean bool = i1.Y(this.b, this.c);
      Message message = PhoneSceneService.g(this.d).obtainMessage();
      message.what = 121;
      Bundle bundle = new Bundle();
      bundle.putString("num", this.c);
      bundle.putBoolean("get_contact_exist", bool);
      message.setData(bundle);
      PhoneSceneService.g(this.d).sendMessage(message);
      if (b1.B2().booleanValue()) {
        if (d0.a)
          d0.a("tony", "NEW_END_CALL_SUCCESS"); 
        q.b().e("new_end_call_success");
        b1.V2(Boolean.FALSE);
      } else if (b1.w2().booleanValue()) {
        q.b().e("new_end_call_failed");
        if (d0.a)
          d0.a("tony", "8.0挂断方法失败"); 
        b1.P2(Boolean.FALSE);
      } 
    }
  }
  
  class l implements com.allinone.callerid.i.a.j.d {
    l(PhoneSceneService this$0, Context param1Context, String param1String) {}
    
    public void a(String param1String) {
      if (param1String == null || "".equals(param1String))
        PhoneSceneService.d(this.c, this.a, this.b, "1"); 
    }
  }
  
  class m implements com.allinone.callerid.i.a.j.d {
    m(PhoneSceneService this$0, Context param1Context, int param1Int, String param1String) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String)) {
        if (b1.v0())
          a1.d(this.a, this.b, 1, this.c, false, 0, PhoneSceneService.i(this.d)); 
      } else {
        a1.d(this.a, this.b, 0, this.c, false, 0, PhoneSceneService.i(this.d));
      } 
    }
  }
  
  class n implements com.allinone.callerid.i.a.d.b {
    n(PhoneSceneService this$0, Context param1Context, String param1String) {}
    
    public void a(boolean param1Boolean) {
      if (param1Boolean)
        com.allinone.callerid.i.a.j.f.a(this.a, this.b, new a(this)); 
    }
    
    class a implements com.allinone.callerid.i.a.j.d {
      a(PhoneSceneService.n this$0) {}
      
      public void a(String param2String) {
        if (param2String != null && !"".equals(param2String)) {
          if (b1.z2().booleanValue()) {
            PhoneSceneService.n n1 = this.a;
            PhoneSceneService.j(n1.c, n1.a, 0, n1.b);
          } 
        } else {
          Intent intent = new Intent(this.a.a, RecommendActivity.class);
          intent.setFlags(268435456);
          this.a.a.startActivity(intent);
        } 
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.j.d {
    a(PhoneSceneService this$0) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String)) {
        if (b1.z2().booleanValue()) {
          PhoneSceneService.n n1 = this.a;
          PhoneSceneService.j(n1.c, n1.a, 0, n1.b);
        } 
      } else {
        Intent intent = new Intent(this.a.a, RecommendActivity.class);
        intent.setFlags(268435456);
        this.a.a.startActivity(intent);
      } 
    }
  }
  
  class o implements com.allinone.callerid.i.a.j.d {
    o(PhoneSceneService this$0, Context param1Context, int param1Int, String param1String) {}
    
    public void a(String param1String) {
      if (param1String != null && !"".equals(param1String)) {
        if (b1.v0())
          a1.d(this.a, this.b, 1, this.c, false, 1, PhoneSceneService.i(this.d)); 
      } else {
        a1.d(this.a, this.b, 0, this.c, false, 1, PhoneSceneService.i(this.d));
      } 
    }
  }
  
  private static class p extends Handler {
    private final WeakReference<PhoneSceneService> a;
    
    private p(PhoneSceneService param1PhoneSceneService) {
      this.a = new WeakReference<PhoneSceneService>(param1PhoneSceneService);
    }
    
    public void handleMessage(Message param1Message) {
      PhoneSceneService phoneSceneService = this.a.get();
      if (phoneSceneService != null) {
        Bundle bundle1;
        String str1;
        boolean bool1;
        String str3;
        Bundle bundle2;
        String str2;
        StringBuilder stringBuilder;
        Bundle bundle3;
        boolean bool2;
        boolean bool3;
        boolean bool4;
        boolean bool5;
        int i;
        switch (param1Message.what) {
          case 122:
            bundle1 = param1Message.getData();
            bool1 = bundle1.getBoolean("can_record");
            str3 = bundle1.getString("incoming_number");
            if (bool1) {
              RecordCall recordCall = new RecordCall();
              if (Build.VERSION.SDK_INT >= 28) {
                recordCall.setNumber("");
              } else {
                recordCall.setNumber(str3);
              } 
              recordCall.setPhonestatus(110);
              if (d0.a) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("开始自动录音");
                stringBuilder.append(recordCall.getPhonestatus());
                d0.a("wbb", stringBuilder.toString());
              } 
              b.f().k(recordCall);
            } 
            phoneSceneService.stopSelf();
            break;
          case 121:
            bundle2 = param1Message.getData();
            str1 = bundle2.getString("num");
            if (!bundle2.getBoolean("get_contact_exist")) {
              PhoneSceneService.d(phoneSceneService, phoneSceneService.getApplicationContext(), str1, "0");
              g0.R(phoneSceneService.getApplicationContext());
            } 
            break;
          case 120:
            bundle3 = param1Message.getData();
            str1 = bundle3.getString("num");
            bool2 = bundle3.getBoolean("isInBlackList");
            bool3 = bundle3.getBoolean("is_in_custom_list");
            bool4 = bundle3.getBoolean("contact_exist");
            str2 = bundle3.getString("contact_name");
            bool5 = bundle3.getBoolean("is_enable_block");
            bool1 = bundle3.getBoolean("is_enable_unknow");
            i = bundle3.getInt("contacts_id");
            if ((bool5 && (bool2 || bool3)) || (bool1 && !bool4)) {
              if (d0.a) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("isCalling:");
                stringBuilder.append(i1.d);
                d0.a("tony", stringBuilder.toString());
              } 
              if (!i1.d) {
                i1.m(phoneSceneService.getApplicationContext());
                com.allinone.callerid.util.d.h(str1, System.currentTimeMillis());
                q.b().c("block_list");
                com.allinone.callerid.i.a.j.c.a(phoneSceneService.getApplicationContext(), str1, new a(this, phoneSceneService, str1));
              } 
              phoneSceneService.stopSelf();
              break;
            } 
            PhoneSceneService.c(phoneSceneService, phoneSceneService.getApplicationContext(), str1, (String)stringBuilder, i);
            phoneSceneService.stopSelf();
            break;
        } 
      } 
      super.handleMessage(param1Message);
    }
    
    class a implements com.allinone.callerid.i.a.j.b {
      a(PhoneSceneService.p this$0, PhoneSceneService param2PhoneSceneService, String param2String) {}
      
      public void a(boolean param2Boolean, String param2String) {
        PhoneSceneService phoneSceneService = this.a;
        PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.b, param2String);
      }
    }
  }
  
  class a implements com.allinone.callerid.i.a.j.b {
    a(PhoneSceneService this$0, PhoneSceneService param1PhoneSceneService, String param1String) {}
    
    public void a(boolean param1Boolean, String param1String) {
      PhoneSceneService phoneSceneService = this.a;
      PhoneSceneService.b(phoneSceneService, phoneSceneService.getApplicationContext(), this.b, param1String);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/service/PhoneSceneService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */