package com.android.billingclient.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c.c.a.a.b.d.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

class d extends c {
  private int a = 0;
  
  private final String b;
  
  private final Handler c = new Handler(Looper.getMainLooper());
  
  private i0 d;
  
  private Context e;
  
  private Context f;
  
  private c.c.a.a.b.d.d g;
  
  private v h;
  
  private boolean i;
  
  private boolean j;
  
  private int k = 0;
  
  private boolean l;
  
  private boolean m;
  
  private boolean n;
  
  private boolean o;
  
  private boolean p;
  
  private boolean q;
  
  private boolean r;
  
  private boolean s;
  
  private boolean t;
  
  private ExecutorService u;
  
  private d(Context paramContext, boolean paramBoolean, k paramk, String paramString1, String paramString2) {
    this.b = paramString1;
    i(paramContext, paramk, paramBoolean);
  }
  
  d(String paramString, boolean paramBoolean, Context paramContext, k paramk) {
    this(paramContext, true, paramk, str, null);
  }
  
  private final g I(g paramg) {
    this.d.b().a(paramg, null);
    return paramg;
  }
  
  private final <T> Future<T> J(Callable<T> paramCallable, long paramLong, Runnable paramRunnable) {
    double d1 = paramLong;
    Double.isNaN(d1);
    paramLong = (long)(d1 * 0.95D);
    if (this.u == null)
      this.u = Executors.newFixedThreadPool(a.a, new r0(this)); 
    try {
      Future<T> future = this.u.submit(paramCallable);
      this.c.postDelayed(new s0(this, future, paramRunnable), paramLong);
      return future;
    } catch (Exception exception) {
      String str = String.valueOf(exception);
      StringBuilder stringBuilder = new StringBuilder(str.length() + 28);
      stringBuilder.append("Async task throws exception ");
      stringBuilder.append(str);
      a.b("BillingClient", stringBuilder.toString());
      return null;
    } 
  }
  
  private void i(Context paramContext, k paramk, boolean paramBoolean) {
    Context context = paramContext.getApplicationContext();
    this.f = context;
    this.d = new i0(context, paramk);
    this.e = paramContext;
    this.t = paramBoolean;
  }
  
  private final void j(Runnable paramRunnable) {
    if (Thread.interrupted())
      return; 
    this.c.post(paramRunnable);
  }
  
  private final g k() {
    int i = this.a;
    return (i == 0 || i == 3) ? y.q : y.l;
  }
  
  public final void a(a parama, b paramb) {
    if (!c()) {
      paramb.a(y.q);
      return;
    } 
    if (TextUtils.isEmpty(parama.a())) {
      a.b("BillingClient", "Please provide a valid purchase token.");
      paramb.a(y.k);
      return;
    } 
    if (!this.n) {
      paramb.a(y.b);
      return;
    } 
    if (J(new p0(this, parama, paramb), 30000L, new q0(this, paramb)) == null)
      paramb.a(k()); 
  }
  
  public final void b(h paramh, i parami) {
    if (!c()) {
      parami.a(y.q, paramh.a());
      return;
    } 
    if (J(new l0(this, paramh, parami), 30000L, new m0(this, parami, paramh)) == null)
      parami.a(k(), paramh.a()); 
  }
  
  public final boolean c() {
    return (this.a == 2 && this.g != null && this.h != null);
  }
  
  public final g d(Activity paramActivity, f paramf) {
    String str1 = "BUY_INTENT";
    if (!c()) {
      g g1 = y.q;
      I(g1);
      return g1;
    } 
    ArrayList<SkuDetails> arrayList = paramf.f();
    SkuDetails skuDetails = arrayList.get(0);
    String str2 = skuDetails.d();
    if (!str2.equals("subs") || this.i) {
      String str = paramf.a();
      if (str == null || this.j) {
        if (!paramf.h() || this.l) {
          if (arrayList.size() <= 1 || this.s) {
            Future<?> future;
            Bundle bundle;
            String str3 = "";
            String str4 = "";
            int i;
            for (i = 0; i < arrayList.size(); i++) {
              str4 = String.valueOf(str4);
              String str5 = String.valueOf(arrayList.get(i));
              StringBuilder stringBuilder1 = new StringBuilder(str4.length() + str5.length());
              stringBuilder1.append(str4);
              stringBuilder1.append(str5);
              str5 = stringBuilder1.toString();
              str4 = str5;
              if (i < arrayList.size() - 1)
                str4 = String.valueOf(str5).concat(", "); 
            } 
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str4).length() + 41 + str2.length());
            stringBuilder.append("Constructing buy intent for ");
            stringBuilder.append(str4);
            stringBuilder.append(", item type: ");
            stringBuilder.append(str2);
            a.a("BillingClient", stringBuilder.toString());
            if (this.l) {
              g g4;
              bundle = a.g(paramf, this.n, this.t, this.b);
              ArrayList<String> arrayList2 = new ArrayList();
              ArrayList<String> arrayList1 = new ArrayList();
              ArrayList<String> arrayList3 = new ArrayList();
              ArrayList<Integer> arrayList4 = new ArrayList();
              int j = arrayList.size();
              byte b = 0;
              int k = 0;
              int m = 0;
              i = 0;
              while (b < j) {
                String str5;
                SkuDetails skuDetails1 = arrayList.get(b);
                if (!skuDetails1.f().isEmpty())
                  arrayList2.add(skuDetails1.f()); 
                String str6 = skuDetails1.a();
                try {
                  JSONObject jSONObject = new JSONObject();
                  this(str6);
                  str5 = jSONObject.optString("offer_id_token");
                } catch (JSONException jSONException) {
                  str5 = str3;
                } 
                str6 = skuDetails1.g();
                int n = skuDetails1.h();
                arrayList1.add(str5);
                k |= TextUtils.isEmpty(str5) ^ true;
                arrayList3.add(str6);
                int i1 = m | TextUtils.isEmpty(str6) ^ true;
                arrayList4.add(Integer.valueOf(n));
                if (n != 0) {
                  m = 1;
                } else {
                  m = 0;
                } 
                i |= m;
                b++;
                m = i1;
              } 
              if (!arrayList2.isEmpty())
                bundle.putStringArrayList("skuDetailsTokens", arrayList2); 
              if (k != 0) {
                if (!this.q) {
                  g4 = y.i;
                  I(g4);
                  return g4;
                } 
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList1);
              } 
              if (m != 0)
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3); 
              if (i != 0)
                bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList4); 
              if (!TextUtils.isEmpty(skuDetails.e())) {
                bundle.putString("skuPackageName", skuDetails.e());
                i = 1;
              } else {
                i = 0;
              } 
              if (!TextUtils.isEmpty(null))
                bundle.putString("accountName", null); 
              if (arrayList.size() > 1) {
                ArrayList<String> arrayList6 = new ArrayList(arrayList.size() - 1);
                ArrayList<String> arrayList5 = new ArrayList(arrayList.size() - 1);
                for (j = 1; j < arrayList.size(); j++) {
                  arrayList6.add(((SkuDetails)arrayList.get(j)).c());
                  arrayList5.add(((SkuDetails)arrayList.get(j)).d());
                } 
                bundle.putStringArrayList("additionalSkus", arrayList6);
                bundle.putStringArrayList("additionalSkuTypes", arrayList5);
              } 
              if (!TextUtils.isEmpty(g4.getIntent().getStringExtra("PROXY_PACKAGE"))) {
                str3 = g4.getIntent().getStringExtra("PROXY_PACKAGE");
                bundle.putString("proxyPackage", str3);
                try {
                  bundle.putString("proxyPackageVersion", (this.f.getPackageManager().getPackageInfo(str3, 0)).versionName);
                } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
                  bundle.putString("proxyPackageVersion", "package not found");
                } 
              } 
              if (this.r && i != 0) {
                i = 15;
              } else if (this.n) {
                i = 9;
              } else if (paramf.d()) {
                i = 7;
              } else {
                i = 6;
              } 
              future = J(new x0(this, i, skuDetails, str2, paramf, bundle), 5000L, null);
            } else {
              str1 = "BUY_INTENT";
              if (bundle != null) {
                future = J(new y0(this, (f)future, skuDetails), 5000L, null);
              } else {
                future = J(new o(this, skuDetails, str2), 5000L, null);
              } 
            } 
            try {
              g g4;
              Bundle bundle1 = (Bundle)future.get(5000L, TimeUnit.MILLISECONDS);
              i = a.d(bundle1, "BillingClient");
              String str5 = a.e(bundle1, "BillingClient");
              if (i != 0) {
                StringBuilder stringBuilder1 = new StringBuilder();
                this(52);
                stringBuilder1.append("Unable to buy item, Error response code: ");
                stringBuilder1.append(i);
                a.b("BillingClient", stringBuilder1.toString());
                g.a a = g.c();
                a.c(i);
                a.b(str5);
                g4 = a.a();
                I(g4);
                return g4;
              } 
              Intent intent = new Intent();
              this((Context)g4, ProxyBillingActivity.class);
              intent.putExtra(str1, bundle1.getParcelable(str1));
              g4.startActivity(intent);
              return y.p;
            } catch (TimeoutException|java.util.concurrent.CancellationException timeoutException) {
              StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str4).length() + 68);
              stringBuilder1.append("Time out while launching billing flow: ; for sku: ");
              stringBuilder1.append(str4);
              stringBuilder1.append("; try to reconnect");
              a.b("BillingClient", stringBuilder1.toString());
              g g4 = y.r;
              I(g4);
              return g4;
            } catch (Exception exception) {
              StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str4).length() + 69);
              stringBuilder1.append("Exception while launching billing flow: ; for sku: ");
              stringBuilder1.append(str4);
              stringBuilder1.append("; try to reconnect");
              a.b("BillingClient", stringBuilder1.toString());
              g g4 = y.q;
              I(g4);
              return g4;
            } 
          } 
          a.b("BillingClient", "Current client doesn't support multi-item purchases.");
          g g3 = y.u;
          I(g3);
          return g3;
        } 
        a.b("BillingClient", "Current client doesn't support extra params for buy intent.");
        g g2 = y.h;
        I(g2);
        return g2;
      } 
      a.b("BillingClient", "Current client doesn't support subscriptions update.");
      g g1 = y.t;
      I(g1);
      return g1;
    } 
    a.b("BillingClient", "Current client doesn't support subscriptions.");
    g g = y.s;
    I(g);
    return g;
  }
  
  public final Purchase.a f(String paramString) {
    if (!c())
      return new Purchase.a(y.q, null); 
    if (TextUtils.isEmpty(paramString)) {
      a.b("BillingClient", "Please provide a valid SKU type.");
      return new Purchase.a(y.g, null);
    } 
    Future<?> future = J(new p(this, paramString), 5000L, null);
    try {
      return (Purchase.a)future.get(5000L, TimeUnit.MILLISECONDS);
    } catch (TimeoutException|java.util.concurrent.CancellationException timeoutException) {
      return new Purchase.a(y.r, null);
    } catch (Exception exception) {
      return new Purchase.a(y.l, null);
    } 
  }
  
  public final void g(l paraml, m paramm) {
    if (!c()) {
      paramm.a(y.q, null);
      return;
    } 
    String str = paraml.a();
    List<String> list = paraml.b();
    if (TextUtils.isEmpty(str)) {
      a.b("BillingClient", "Please fix the input params. SKU type can't be empty.");
      paramm.a(y.g, null);
      return;
    } 
    if (list != null) {
      ArrayList<f0> arrayList = new ArrayList();
      for (String str1 : list) {
        e0 e0 = new e0(null);
        e0.a(str1);
        arrayList.add(e0.b());
      } 
      if (J(new r(this, str, arrayList, null, paramm), 30000L, new k0(this, paramm)) == null)
        paramm.a(k(), null); 
      return;
    } 
    a.b("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
    paramm.a(y.f, null);
  }
  
  public final void h(e parame) {
    if (c()) {
      a.a("BillingClient", "Service connection is valid. No need to re-initialize.");
      parame.a(y.p);
      return;
    } 
    int i = this.a;
    if (i == 1) {
      a.b("BillingClient", "Client is already in the process of connecting to billing service.");
      parame.a(y.d);
      return;
    } 
    if (i == 3) {
      a.b("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
      parame.a(y.q);
      return;
    } 
    this.a = 1;
    this.d.a();
    a.a("BillingClient", "Starting in-app billing setup.");
    this.h = new v(this, parame, null);
    Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
    intent.setPackage("com.android.vending");
    List list = this.f.getPackageManager().queryIntentServices(intent, 0);
    if (list != null && !list.isEmpty()) {
      ServiceInfo serviceInfo = ((ResolveInfo)list.get(0)).serviceInfo;
      if (serviceInfo != null) {
        String str1 = serviceInfo.packageName;
        String str2 = serviceInfo.name;
        if ("com.android.vending".equals(str1) && str2 != null) {
          ComponentName componentName = new ComponentName(str1, str2);
          intent = new Intent(intent);
          intent.setComponent(componentName);
          intent.putExtra("playBillingLibraryVersion", this.b);
          if (this.f.bindService(intent, this.h, 1)) {
            a.a("BillingClient", "Service was bonded successfully.");
            return;
          } 
          a.b("BillingClient", "Connection to Billing service is blocked.");
        } else {
          a.b("BillingClient", "The device doesn't have valid Play Store.");
        } 
      } 
    } 
    this.a = 0;
    a.a("BillingClient", "Billing service unavailable on device.");
    parame.a(y.c);
  }
  
  final b0 l(String paramString1, List<f0> paramList, String paramString2) {
    ArrayList<SkuDetails> arrayList = new ArrayList();
    int i = paramList.size();
    int j = 0;
    while (j < i) {
      int k = j + 20;
      if (k > i) {
        m = i;
      } else {
        m = k;
      } 
      ArrayList<f0> arrayList2 = new ArrayList(paramList.subList(j, m));
      ArrayList<String> arrayList1 = new ArrayList();
      int m = arrayList2.size();
      for (j = 0; j < m; j++)
        arrayList1.add(((f0)arrayList2.get(j)).a()); 
      Bundle bundle = new Bundle();
      bundle.putStringArrayList("ITEM_ID_LIST", arrayList1);
      bundle.putString("playBillingLibraryVersion", this.b);
      try {
        Bundle bundle1;
        if (this.o) {
          bundle1 = this.g.Z4(10, this.f.getPackageName(), paramString1, bundle, a.i(this.k, this.t, this.b, null, arrayList2));
        } else {
          bundle1 = this.g.y7(3, this.f.getPackageName(), paramString1, bundle);
        } 
        if (bundle1 == null) {
          a.b("BillingClient", "querySkuDetailsAsync got null sku details list");
          return new b0(4, "Item is unavailable for purchase.", null);
        } 
        if (!bundle1.containsKey("DETAILS_LIST")) {
          k = a.d(bundle1, "BillingClient");
          String str = a.e(bundle1, "BillingClient");
          if (k != 0) {
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("getSkuDetails() failed. Response code: ");
            stringBuilder.append(k);
            a.b("BillingClient", stringBuilder.toString());
            return new b0(k, str, arrayList);
          } 
          a.b("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
          return new b0(6, str, arrayList);
        } 
        ArrayList<String> arrayList3 = bundle1.getStringArrayList("DETAILS_LIST");
        if (arrayList3 != null) {
          j = 0;
          while (j < arrayList3.size()) {
            String str = arrayList3.get(j);
            try {
              SkuDetails skuDetails = new SkuDetails(str);
              String str1 = String.valueOf(skuDetails);
              StringBuilder stringBuilder = new StringBuilder(str1.length() + 17);
              stringBuilder.append("Got sku details: ");
              stringBuilder.append(str1);
              a.a("BillingClient", stringBuilder.toString());
              arrayList.add(skuDetails);
              j++;
            } catch (JSONException jSONException) {
              a.b("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
              return new b0(6, "Error trying to decode SkuDetails.", null);
            } 
          } 
          j = k;
          continue;
        } 
        a.b("BillingClient", "querySkuDetailsAsync got null response list");
        return new b0(4, "Item is unavailable for purchase.", null);
      } catch (Exception exception) {
        String str = String.valueOf(exception);
        StringBuilder stringBuilder = new StringBuilder(str.length() + 63);
        stringBuilder.append("querySkuDetailsAsync got a remote exception (try to reconnect).");
        stringBuilder.append(str);
        a.b("BillingClient", stringBuilder.toString());
        return new b0(-1, "Service connection is disconnected.", null);
      } 
    } 
    return new b0(0, "", arrayList);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/android/billingclient/api/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */