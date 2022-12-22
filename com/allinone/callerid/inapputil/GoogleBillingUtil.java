package com.allinone.callerid.inapputil;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.h;
import com.android.billingclient.api.i;
import com.android.billingclient.api.k;
import com.android.billingclient.api.l;
import com.android.billingclient.api.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GoogleBillingUtil {
  private static boolean a = false;
  
  private static String[] b = new String[0];
  
  private static String[] c = new String[0];
  
  private static com.android.billingclient.api.c d;
  
  private static com.android.billingclient.api.c.a e;
  
  private static List<c> f = new ArrayList<c>();
  
  private static Map<String, c> g = new HashMap<String, c>();
  
  private static boolean h = true;
  
  private static final GoogleBillingUtil i = new GoogleBillingUtil();
  
  private d j = new d(null);
  
  private void A(String paramString1, String paramString2) {
    o(paramString1, new b(this, paramString1, paramString2));
  }
  
  private void B(String paramString) {
    A(paramString, "inapp");
  }
  
  private List<Purchase> D(String paramString1, String paramString2) {
    com.android.billingclient.api.c c1 = d;
    if (c1 == null)
      return null; 
    if (!c1.c()) {
      K(paramString1);
    } else {
      Purchase.a a1 = d.f(paramString2);
      if (a1 != null && a1.c() == 0) {
        List<Purchase> list = a1.b();
        if (list != null && !list.isEmpty())
          for (Purchase purchase : list) {
            for (c c2 : f) {
              boolean bool1 = c2.a.equals(paramString1);
              boolean bool2 = c2.h(paramString2, purchase, bool1);
              if (bool1) {
                if (purchase.b() == 1) {
                  if (paramString2.equals("inapp")) {
                    if (bool2) {
                      m(paramString1, purchase.d());
                      continue;
                    } 
                    if (h && !purchase.g())
                      i(paramString1, purchase.d()); 
                    continue;
                  } 
                  if (paramString2.equals("subs") && h && !purchase.g())
                    i(paramString1, purchase.d()); 
                  continue;
                } 
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("未支付的订单:");
                stringBuilder.append(purchase.f());
                w(stringBuilder.toString());
              } 
            } 
          }  
        return list;
      } 
    } 
    return null;
  }
  
  private List<Purchase> E(String paramString) {
    return D(paramString, "inapp");
  }
  
  public static void I(String[] paramArrayOfString1, String[] paramArrayOfString2) {
    if (paramArrayOfString1 != null)
      b = Arrays.<String>copyOf(paramArrayOfString1, paramArrayOfString1.length); 
    if (paramArrayOfString2 != null)
      c = Arrays.<String>copyOf(paramArrayOfString2, paramArrayOfString2.length); 
  }
  
  private boolean K(String paramString) {
    com.android.billingclient.api.c c1 = d;
    if (c1 == null) {
      w("初始化失败:mBillingClient==null");
      return false;
    } 
    if (!c1.c()) {
      d.h(new a(this, paramString));
      return false;
    } 
    return true;
  }
  
  private void i(String paramString1, String paramString2) {
    j(paramString1, paramString2, null);
  }
  
  private void j(String paramString1, String paramString2, String paramString3) {
    if (d == null)
      return; 
    com.android.billingclient.api.a a1 = com.android.billingclient.api.a.b().b(paramString2).a();
    d.a(a1, new b(this, paramString1));
  }
  
  private void m(String paramString1, String paramString2) {
    n(paramString1, paramString2, null);
  }
  
  private void n(String paramString1, String paramString2, String paramString3) {
    if (d == null)
      return; 
    h h = h.b().b(paramString2).a();
    d.b(h, new c(this, paramString1));
  }
  
  private void o(String paramString, Runnable paramRunnable) {
    if (K(paramString))
      paramRunnable.run(); 
  }
  
  public static GoogleBillingUtil p() {
    return i;
  }
  
  private String r(Activity paramActivity) {
    return paramActivity.getLocalClassName();
  }
  
  public static void s(boolean paramBoolean) {
    a = paramBoolean;
  }
  
  private static void w(String paramString) {
    if (a)
      Log.e("GoogleBillingUtil-3.0.3", paramString); 
  }
  
  private void y(Activity paramActivity, String paramString1, String paramString2) {
    ArrayList<c> arrayList;
    String str = r(paramActivity);
    if (d == null) {
      for (c c1 : f)
        c1.d(GoogleBillingListenerTag.c, c1.a.equals(str)); 
      return;
    } 
    if (K(str)) {
      d d1 = this.j;
      d1.a = str;
      e.c(d1);
      arrayList = new ArrayList();
      arrayList.add(c1);
      l l = l.c().b(arrayList).c(paramString2).a();
      d.g(l, new a(paramActivity));
    } else {
      for (c c2 : f)
        c2.d(GoogleBillingListenerTag.c, c2.a.equals(arrayList)); 
    } 
  }
  
  public void C(String paramString) {
    A(paramString, "subs");
  }
  
  public List<Purchase> F(Activity paramActivity) {
    return D(r(paramActivity), "subs");
  }
  
  public void G(Activity paramActivity) {
    String str = r(paramActivity);
    for (int i = f.size() - 1; i >= 0; i--) {
      c c1 = f.get(i);
      if (c1.a.equals(str)) {
        H(c1);
        g.remove(str);
      } 
    } 
  }
  
  public void H(c paramc) {
    f.remove(paramc);
  }
  
  public boolean J(Activity paramActivity) {
    return K(r(paramActivity));
  }
  
  public GoogleBillingUtil k(Activity paramActivity, c paramc) {
    String str = r(paramActivity);
    paramc.a = str;
    g.put(r(paramActivity), paramc);
    for (int i = f.size() - 1; i >= 0; i--) {
      c c1 = f.get(i);
      if (c1.a.equals(str))
        f.remove(c1); 
    } 
    f.add(paramc);
    return this;
  }
  
  public GoogleBillingUtil l(Activity paramActivity) {
    this.j.a = r(paramActivity);
    if (d == null) {
      synchronized (i) {
        if (d == null) {
          com.android.billingclient.api.c.a a1 = com.android.billingclient.api.c.e((Context)paramActivity);
          e = a1;
          d = a1.c(this.j).b().a();
        } else {
          e.c(this.j);
        } 
      } 
    } else {
      e.c(this.j);
    } 
    synchronized (i) {
      if (null.J(paramActivity)) {
        null.B(r(paramActivity));
        null.C(r(paramActivity));
        null.E(r(paramActivity));
      } 
      return null;
    } 
  }
  
  public String q(String paramString) {
    return Arrays.<String>asList(b).contains(paramString) ? "inapp" : (Arrays.<String>asList(c).contains(paramString) ? "subs" : null);
  }
  
  public void x(Activity paramActivity) {
    com.android.billingclient.api.c.a a1 = e;
    if (a1 != null)
      a1.c(null); 
    G(paramActivity);
  }
  
  public void z(Activity paramActivity, String paramString) {
    y(paramActivity, paramString, "subs");
  }
  
  public enum GoogleBillingListenerTag {
    b, c, d, e, f, g;
    
    public String tag;
    
    static {
      GoogleBillingListenerTag googleBillingListenerTag1 = new GoogleBillingListenerTag("QUERY", 0, "query");
      b = googleBillingListenerTag1;
      GoogleBillingListenerTag googleBillingListenerTag2 = new GoogleBillingListenerTag("PURCHASE", 1, "purchase");
      c = googleBillingListenerTag2;
      GoogleBillingListenerTag googleBillingListenerTag3 = new GoogleBillingListenerTag("SETUP", 2, "setup");
      d = googleBillingListenerTag3;
      GoogleBillingListenerTag googleBillingListenerTag4 = new GoogleBillingListenerTag("COMSUME", 3, "comsume");
      e = googleBillingListenerTag4;
      GoogleBillingListenerTag googleBillingListenerTag5 = new GoogleBillingListenerTag("AcKnowledgePurchase", 4, "AcKnowledgePurchase");
      f = googleBillingListenerTag5;
      GoogleBillingListenerTag googleBillingListenerTag6 = new GoogleBillingListenerTag("HISTORY", 5, "history");
      g = googleBillingListenerTag6;
      h = new GoogleBillingListenerTag[] { googleBillingListenerTag1, googleBillingListenerTag2, googleBillingListenerTag3, googleBillingListenerTag4, googleBillingListenerTag5, googleBillingListenerTag6 };
    }
    
    GoogleBillingListenerTag(String param1String1) {
      this.tag = param1String1;
    }
  }
  
  class a implements com.android.billingclient.api.e {
    a(GoogleBillingUtil this$0, String param1String) {}
    
    public void a(g param1g) {
      if (param1g.b() == 0) {
        for (c c : GoogleBillingUtil.a())
          c.i(c.a.equals(this.a)); 
        GoogleBillingUtil.b(this.b, this.a);
        this.b.C(this.a);
        GoogleBillingUtil.c(this.b, this.a);
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("初始化失败:onSetupFail:code=");
        stringBuilder.append(c.b());
        GoogleBillingUtil.d(stringBuilder.toString());
        for (c c1 : GoogleBillingUtil.a())
          c1.e(GoogleBillingUtil.GoogleBillingListenerTag.d, c.b(), c1.a.equals(this.a)); 
      } 
    }
    
    public void b() {
      Iterator<c> iterator = GoogleBillingUtil.a().iterator();
      while (iterator.hasNext())
        ((c)iterator.next()).b(); 
      GoogleBillingUtil.d("初始化失败:onBillingServiceDisconnected");
    }
  }
  
  private class b implements com.android.billingclient.api.b {
    private String a;
    
    public b(GoogleBillingUtil this$0, String param1String) {
      this.a = param1String;
    }
    
    public void a(g param1g) {
      if (param1g.b() == 0) {
        for (c c : GoogleBillingUtil.a())
          c.a(c.a.equals(this.a)); 
      } else {
        for (c c : GoogleBillingUtil.a())
          c.e(GoogleBillingUtil.GoogleBillingListenerTag.f, param1g.b(), c.a.equals(this.a)); 
        if (GoogleBillingUtil.h()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("确认购买失败,responseCode:");
          stringBuilder.append(param1g.b());
          stringBuilder.append(",msg:");
          stringBuilder.append(param1g.a());
          GoogleBillingUtil.d(stringBuilder.toString());
        } 
      } 
    }
  }
  
  private class c implements i {
    private String a;
    
    public c(GoogleBillingUtil this$0, String param1String) {
      this.a = param1String;
    }
    
    public void a(g param1g, String param1String) {
      if (param1g.b() == 0) {
        for (c c1 : GoogleBillingUtil.a())
          c1.c(param1String, c1.a.equals(this.a)); 
      } else {
        for (c c1 : GoogleBillingUtil.a())
          c1.e(GoogleBillingUtil.GoogleBillingListenerTag.e, param1g.b(), c1.a.equals(this.a)); 
        if (GoogleBillingUtil.h()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("消耗失败,responseCode:");
          stringBuilder.append(param1g.b());
          stringBuilder.append(",msg:");
          stringBuilder.append(param1g.a());
          GoogleBillingUtil.d(stringBuilder.toString());
        } 
      } 
    }
  }
  
  private class d implements k {
    public String a;
    
    private d(GoogleBillingUtil this$0) {}
    
    public void a(g param1g, List<Purchase> param1List) {
      if (param1g.b() == 0 && param1List != null) {
        for (Purchase purchase : param1List) {
          for (c c : GoogleBillingUtil.a()) {
            boolean bool1 = c.a.equals(this.a);
            boolean bool2 = c.f(purchase, bool1);
            if (bool1 && purchase.b() == 1) {
              String str = this.b.q(purchase.f());
              if ("inapp".equals(str)) {
                if (bool2) {
                  GoogleBillingUtil.e(this.b, this.a, purchase.d());
                  continue;
                } 
                if (GoogleBillingUtil.f() && !purchase.g())
                  GoogleBillingUtil.g(this.b, this.a, purchase.d()); 
                continue;
              } 
              if ("subs".equals(str) && GoogleBillingUtil.f() && !purchase.g())
                GoogleBillingUtil.g(this.b, this.a, purchase.d()); 
              continue;
            } 
            if (purchase.b() == 2) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("待处理的订单:");
              stringBuilder.append(purchase.f());
              GoogleBillingUtil.d(stringBuilder.toString());
            } 
          } 
        } 
      } else {
        if (GoogleBillingUtil.h()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("购买失败,responseCode:");
          stringBuilder.append(param1g.b());
          stringBuilder.append(",msg:");
          stringBuilder.append(param1g.a());
          GoogleBillingUtil.d(stringBuilder.toString());
        } 
        for (c c : GoogleBillingUtil.a())
          c.e(GoogleBillingUtil.GoogleBillingListenerTag.c, param1g.b(), c.a.equals(this.a)); 
      } 
    }
  }
  
  private class e implements m {
    private String a;
    
    private String b;
    
    public e(GoogleBillingUtil this$0, String param1String1, String param1String2) {
      this.a = param1String1;
      this.b = param1String2;
    }
    
    public void a(g param1g, List<SkuDetails> param1List) {
      if (param1g.b() == 0 && param1List != null) {
        for (c c : GoogleBillingUtil.a())
          c.g(this.a, param1List, c.a.equals(this.b)); 
      } else {
        for (c c1 : GoogleBillingUtil.a())
          c1.e(GoogleBillingUtil.GoogleBillingListenerTag.b, c.b(), c1.a.equals(this.b)); 
        if (GoogleBillingUtil.h()) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("查询失败,responseCode:");
          stringBuilder.append(c.b());
          stringBuilder.append(",msg:");
          stringBuilder.append(c.a());
          GoogleBillingUtil.d(stringBuilder.toString());
        } 
      } 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/inapputil/GoogleBillingUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */