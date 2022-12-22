package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.ot1;
import com.google.android.gms.internal.ads.x;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {
  private final Object a = new Object();
  
  private String b = "";
  
  private String c = "";
  
  private boolean d = false;
  
  private String e = "";
  
  private final void b(Context paramContext, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    if (!(paramContext instanceof android.app.Activity)) {
      cm.h("Can not create dialog without Activity Context");
      return;
    } 
    h1.a.post(new m(this, paramContext, paramString, paramBoolean1, paramBoolean2));
  }
  
  private final String d(Context paramContext) {
    synchronized (this.a) {
      if (TextUtils.isEmpty(this.b)) {
        q.c();
        String str = h1.u0(paramContext, "debug_signals_id.txt");
        this.b = str;
        if (TextUtils.isEmpty(str)) {
          q.c();
          this.b = h1.x0();
          q.c();
          h1.U(paramContext, "debug_signals_id.txt", this.b);
        } 
      } 
      return this.b;
    } 
  }
  
  private final void e(Context paramContext, String paramString1, String paramString2, String paramString3) {
    x x = m0.q3;
    Uri.Builder builder = f(paramContext, (String)er2.e().c(x), paramString3, paramString1).buildUpon();
    builder.appendQueryParameter("debugData", paramString2);
    q.c();
    h1.N(paramContext, paramString1, builder.build().toString());
  }
  
  private final Uri f(Context paramContext, String paramString1, String paramString2, String paramString3) {
    Uri.Builder builder = Uri.parse(paramString1).buildUpon();
    builder.appendQueryParameter("linkedDeviceId", d(paramContext));
    builder.appendQueryParameter("adSlotPath", paramString2);
    builder.appendQueryParameter("afmaVersion", paramString3);
    return builder.build();
  }
  
  private final boolean h(Context paramContext, String paramString1, String paramString2) {
    x x = m0.o3;
    String str = j(paramContext, f(paramContext, (String)er2.e().c(x), paramString1, paramString2).toString(), paramString2);
    if (TextUtils.isEmpty(str)) {
      cm.e("Not linked for in app preview.");
      return false;
    } 
    str = str.trim();
    try {
      JSONObject jSONObject = new JSONObject();
      this(str);
      str = jSONObject.optString("gct");
      this.e = jSONObject.optString("status");
      synchronized (this.a) {
        this.c = str;
        return true;
      } 
    } catch (JSONException jSONException) {
      cm.d("Fail to get in app preview response json.", (Throwable)jSONException);
      return false;
    } 
  }
  
  private final boolean i(Context paramContext, String paramString1, String paramString2) {
    x x = m0.p3;
    String str = j(paramContext, f(paramContext, (String)er2.e().c(x), paramString1, paramString2).toString(), paramString2);
    if (TextUtils.isEmpty(str)) {
      cm.e("Not linked for debug signals.");
      return false;
    } 
    str = str.trim();
    try {
      null = new JSONObject();
      this(str);
      str = null.optString("debug_mode");
      boolean bool = "1".equals(str);
      synchronized (this.a) {
        this.d = bool;
        return bool;
      } 
    } catch (JSONException jSONException) {
      cm.d("Fail to get debug mode response json.", (Throwable)jSONException);
      return false;
    } 
  }
  
  private static String j(Context paramContext, String paramString1, String paramString2) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("User-Agent", q.c().r0(paramContext, paramString2));
    ot1<String> ot1 = (new x(paramContext)).b(paramString1, (Map)hashMap);
    try {
      x x = m0.r3;
      return ot1.get(((Integer)er2.e().c(x)).intValue(), TimeUnit.MILLISECONDS);
    } catch (TimeoutException timeoutException) {
      String str = String.valueOf(paramString1);
      if (str.length() != 0) {
        str = "Timeout while retriving a response from: ".concat(str);
      } else {
        str = new String("Timeout while retriving a response from: ");
      } 
      cm.c(str, timeoutException);
      ot1.cancel(true);
    } catch (InterruptedException interruptedException) {
      String str = String.valueOf(paramString1);
      if (str.length() != 0) {
        str = "Interrupted while retriving a response from: ".concat(str);
      } else {
        str = new String("Interrupted while retriving a response from: ");
      } 
      cm.c(str, interruptedException);
      ot1.cancel(true);
    } catch (Exception exception) {
      String str = String.valueOf(paramString1);
      if (str.length() != 0) {
        str = "Error retriving a response from: ".concat(str);
      } else {
        str = new String("Error retriving a response from: ");
      } 
      cm.c(str, exception);
    } 
    return null;
  }
  
  private final void k(Context paramContext, String paramString1, String paramString2) {
    q.c();
    x x = m0.n3;
    h1.M(paramContext, f(paramContext, (String)er2.e().c(x), paramString1, paramString2));
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3) {
    boolean bool = m();
    if (i(paramContext, paramString1, paramString2)) {
      if (!bool && !TextUtils.isEmpty(paramString3))
        e(paramContext, paramString2, paramString3, paramString1); 
      cm.e("Device is linked for debug signals.");
      b(paramContext, "The device is successfully linked for troubleshooting.", false, true);
      return;
    } 
    k(paramContext, paramString1, paramString2);
  }
  
  public final boolean c(Context paramContext, String paramString1, String paramString2, String paramString3) {
    if (TextUtils.isEmpty(paramString2) || !q.m().m())
      return false; 
    cm.e("Sending troubleshooting signals to the server.");
    e(paramContext, paramString1, paramString2, paramString3);
    return true;
  }
  
  public final void g(Context paramContext, String paramString1, String paramString2) {
    if (!h(paramContext, paramString1, paramString2)) {
      b(paramContext, "In-app preview failed to load because of a system error. Please try again later.", true, true);
      return;
    } 
    if ("2".equals(this.e)) {
      cm.e("Creative is not pushed for this device.");
      b(paramContext, "There was no creative pushed from DFP to the device.", false, false);
      return;
    } 
    if ("1".equals(this.e)) {
      cm.e("The app is not linked for creative preview.");
      k(paramContext, paramString1, paramString2);
      return;
    } 
    if ("0".equals(this.e)) {
      cm.e("Device is linked for in app preview.");
      b(paramContext, "The device is successfully linked for creative preview.", false, true);
    } 
  }
  
  public final String l() {
    synchronized (this.a) {
      return this.c;
    } 
  }
  
  public final boolean m() {
    synchronized (this.a) {
      return this.d;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */