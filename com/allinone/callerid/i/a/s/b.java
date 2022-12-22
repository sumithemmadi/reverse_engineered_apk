package com.allinone.callerid.i.a.s;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import com.allinone.callerid.l.a.f;
import com.allinone.callerid.util.b1;
import com.allinone.callerid.util.c1;
import com.allinone.callerid.util.d;
import com.allinone.callerid.util.d0;
import com.allinone.callerid.util.g;
import com.allinone.callerid.util.g0;
import com.allinone.callerid.util.h1;
import com.allinone.callerid.util.i1;
import com.allinone.callerid.util.q;

public class b {
  public static void a(Context paramContext) {
    if (b1.J()) {
      b1.o1(false);
      if (i1.n0(paramContext, i1.M(paramContext)))
        q.b().c("install_googleplay"); 
      g0.c(paramContext);
      if (com.allinone.callerid.util.b.b(paramContext))
        q.b().c("is_ou_meng_country"); 
      q.b().d("first_enter_main_online");
      g0.r(paramContext);
      if (c1.h(paramContext)) {
        q.b().c(h1.a);
        if (c1.l()) {
          q.b().c(h1.b);
        } else if (c1.i()) {
          q.b().c(h1.c);
        } else if (c1.k()) {
          q.b().c(h1.d);
        } else if (c1.j()) {
          q.b().c(h1.e);
        } 
      } 
      int i = Build.VERSION.SDK_INT;
      if (i >= 26 && i < 28) {
        if (d0.a) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("oldcallend:");
          stringBuilder.append(i1.g0(paramContext));
          d0.a("tony", stringBuilder.toString());
        } 
        if (!i1.g0(paramContext))
          b1.R2(Boolean.FALSE); 
      } 
      if (b1.B()) {
        d.g(paramContext);
        b1.f1(false);
      } 
    } 
  }
  
  public static void b(int paramInt, Context paramContext) {
    switch (paramInt) {
      default:
        return;
      case 8:
        q.b().c("response_8");
      case 7:
        q.b().c("response_7");
      case 6:
        q.b().c("response_6");
      case 5:
        q.b().c("response_5");
      case 4:
        q.b().c("response_4");
      case 3:
        q.b().c("response_3");
      case 2:
        q.b().c("response_2");
      case 1:
        break;
    } 
    q.b().c("response_1");
  }
  
  public static void c(String paramString, Context paramContext) {
    if (i1.r0(paramContext)) {
      if (paramString != null && !"".equals(paramString))
        (new g(paramContext, paramString)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]); 
    } else {
      if (d0.a)
        d0.a("wbb", "剪贴板离线查询"); 
      f.e(paramString);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/i/a/s/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */