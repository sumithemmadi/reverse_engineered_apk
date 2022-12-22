package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.o;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.er2;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.m0;
import com.google.android.gms.internal.ads.ot1;
import com.google.android.gms.internal.ads.sl2;
import com.google.android.gms.internal.ads.x;
import com.google.android.gms.internal.ads.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g1 implements d1 {
  private final Object a = new Object();
  
  private boolean b;
  
  private final List<Runnable> c = new ArrayList<Runnable>();
  
  private ot1<?> d;
  
  private sl2 e = null;
  
  private SharedPreferences f;
  
  private SharedPreferences.Editor g;
  
  private boolean h = false;
  
  private boolean i = true;
  
  private String j;
  
  private String k;
  
  private boolean l = true;
  
  private String m = "";
  
  private long n = 0L;
  
  private long o = 0L;
  
  private long p = 0L;
  
  private int q = -1;
  
  private int r = 0;
  
  private Set<String> s = Collections.emptySet();
  
  private JSONObject t = new JSONObject();
  
  private boolean u = true;
  
  private boolean v = true;
  
  private String w = null;
  
  private int x = -1;
  
  private final void D() {
    ot1<?> ot11 = this.d;
    if (ot11 == null)
      return; 
    if (ot11.isDone())
      return; 
    try {
      this.d.get(1L, TimeUnit.SECONDS);
      return;
    } catch (InterruptedException interruptedException) {
      Thread.currentThread().interrupt();
      cm.d("Interrupted while waiting for preferences loaded.", interruptedException);
      return;
    } catch (CancellationException cancellationException) {
      cm.c("Fail to initialize AdSharedPreferenceManager.", cancellationException);
      return;
    } catch (ExecutionException executionException) {
      cm.c("Fail to initialize AdSharedPreferenceManager.", executionException);
      return;
    } catch (TimeoutException timeoutException) {
      cm.c("Fail to initialize AdSharedPreferenceManager.", timeoutException);
      return;
    } 
  }
  
  private final void E() {
    fm.a.execute(new i1(this));
  }
  
  public final long A() {
    D();
    synchronized (this.a) {
      return this.p;
    } 
  }
  
  public final int B() {
    D();
    synchronized (this.a) {
      return this.q;
    } 
  }
  
  public final void a(int paramInt) {
    D();
    synchronized (this.a) {
      if (this.q == paramInt)
        return; 
      this.q = paramInt;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putInt("request_in_session_count", paramInt);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final long b() {
    D();
    synchronized (this.a) {
      return this.o;
    } 
  }
  
  public final void c(Context paramContext) {
    synchronized (this.a) {
      if (this.f != null)
        return; 
      this.d = fm.a.e(new f1(this, paramContext, "admob"));
      this.b = true;
      return;
    } 
  }
  
  public final void d(String paramString1, String paramString2, boolean paramBoolean) {
    D();
    synchronized (this.a) {
      int j;
      JSONArray jSONArray1 = this.t.optJSONArray(paramString1);
      JSONArray jSONArray2 = jSONArray1;
      if (jSONArray1 == null) {
        jSONArray2 = new JSONArray();
        this();
      } 
      int i = jSONArray2.length();
      byte b = 0;
      while (true) {
        j = i;
        if (b < jSONArray2.length()) {
          JSONObject jSONObject = jSONArray2.optJSONObject(b);
          if (jSONObject == null)
            return; 
          if (paramString2.equals(jSONObject.optString("template_id"))) {
            if (paramBoolean && jSONObject.optBoolean("uses_media_view", false))
              return; 
            j = b;
            break;
          } 
          b++;
          continue;
        } 
        break;
      } 
      try {
        JSONObject jSONObject = new JSONObject();
        this();
        jSONObject.put("template_id", paramString2);
        jSONObject.put("uses_media_view", paramBoolean);
        jSONObject.put("timestamp_ms", q.j().a());
        jSONArray2.put(j, jSONObject);
        this.t.put(paramString1, jSONArray2);
      } catch (JSONException jSONException) {
        cm.d("Could not update native advanced settings", (Throwable)jSONException);
      } 
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putString("native_advanced_settings", this.t.toString());
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final void e(long paramLong) {
    D();
    synchronized (this.a) {
      if (this.o == paramLong)
        return; 
      this.o = paramLong;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putLong("app_last_background_time_ms", paramLong);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final gl f() {
    D();
    synchronized (this.a) {
      gl gl = new gl();
      this(this.m, this.n);
      return gl;
    } 
  }
  
  public final String g() {
    D();
    synchronized (this.a) {
      return this.k;
    } 
  }
  
  public final boolean h() {
    x x = m0.j0;
    if (!((Boolean)er2.e().c(x)).booleanValue())
      return false; 
    D();
    synchronized (this.a) {
      return this.l;
    } 
  }
  
  public final void i(boolean paramBoolean) {
    D();
    synchronized (this.a) {
      if (paramBoolean == this.l)
        return; 
      this.l = paramBoolean;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putBoolean("gad_idless", paramBoolean);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final void j(String paramString) {
    D();
    synchronized (this.a) {
      if (TextUtils.equals(this.w, paramString))
        return; 
      this.w = paramString;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putString("display_cutout", paramString);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final int k() {
    D();
    synchronized (this.a) {
      return this.r;
    } 
  }
  
  public final boolean l() {
    D();
    synchronized (this.a) {
      return this.v;
    } 
  }
  
  public final void m(int paramInt) {
    D();
    synchronized (this.a) {
      if (this.r == paramInt)
        return; 
      this.r = paramInt;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putInt("version_code", paramInt);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final String n() {
    D();
    synchronized (this.a) {
      return this.w;
    } 
  }
  
  public final void o(long paramLong) {
    D();
    synchronized (this.a) {
      if (this.p == paramLong)
        return; 
      this.p = paramLong;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putLong("first_ad_req_time_ms", paramLong);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final String p() {
    D();
    synchronized (this.a) {
      return this.j;
    } 
  }
  
  public final void q(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial D : ()V
    //   4: aload_0
    //   5: getfield a : Ljava/lang/Object;
    //   8: astore_2
    //   9: aload_2
    //   10: monitorenter
    //   11: aload_1
    //   12: ifnull -> 69
    //   15: aload_1
    //   16: aload_0
    //   17: getfield j : Ljava/lang/String;
    //   20: invokevirtual equals : (Ljava/lang/Object;)Z
    //   23: ifeq -> 29
    //   26: goto -> 69
    //   29: aload_0
    //   30: aload_1
    //   31: putfield j : Ljava/lang/String;
    //   34: aload_0
    //   35: getfield g : Landroid/content/SharedPreferences$Editor;
    //   38: astore_3
    //   39: aload_3
    //   40: ifnull -> 62
    //   43: aload_3
    //   44: ldc 'content_url_hashes'
    //   46: aload_1
    //   47: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   52: pop
    //   53: aload_0
    //   54: getfield g : Landroid/content/SharedPreferences$Editor;
    //   57: invokeinterface apply : ()V
    //   62: aload_0
    //   63: invokespecial E : ()V
    //   66: aload_2
    //   67: monitorexit
    //   68: return
    //   69: aload_2
    //   70: monitorexit
    //   71: return
    //   72: astore_1
    //   73: aload_2
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   15	26	72	finally
    //   29	39	72	finally
    //   43	62	72	finally
    //   62	68	72	finally
    //   69	71	72	finally
    //   73	75	72	finally
  }
  
  public final void r() {
    D();
    synchronized (this.a) {
      JSONObject jSONObject = new JSONObject();
      this();
      this.t = jSONObject;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.remove("native_advanced_settings");
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final void s(boolean paramBoolean) {
    D();
    synchronized (this.a) {
      if (this.u == paramBoolean)
        return; 
      this.u = paramBoolean;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putBoolean("content_url_opted_out", paramBoolean);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final void t(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial D : ()V
    //   4: aload_0
    //   5: getfield a : Ljava/lang/Object;
    //   8: astore_2
    //   9: aload_2
    //   10: monitorenter
    //   11: aload_1
    //   12: ifnull -> 69
    //   15: aload_1
    //   16: aload_0
    //   17: getfield k : Ljava/lang/String;
    //   20: invokevirtual equals : (Ljava/lang/Object;)Z
    //   23: ifeq -> 29
    //   26: goto -> 69
    //   29: aload_0
    //   30: aload_1
    //   31: putfield k : Ljava/lang/String;
    //   34: aload_0
    //   35: getfield g : Landroid/content/SharedPreferences$Editor;
    //   38: astore_3
    //   39: aload_3
    //   40: ifnull -> 62
    //   43: aload_3
    //   44: ldc 'content_vertical_hashes'
    //   46: aload_1
    //   47: invokeinterface putString : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   52: pop
    //   53: aload_0
    //   54: getfield g : Landroid/content/SharedPreferences$Editor;
    //   57: invokeinterface apply : ()V
    //   62: aload_0
    //   63: invokespecial E : ()V
    //   66: aload_2
    //   67: monitorexit
    //   68: return
    //   69: aload_2
    //   70: monitorexit
    //   71: return
    //   72: astore_1
    //   73: aload_2
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    // Exception table:
    //   from	to	target	type
    //   15	26	72	finally
    //   29	39	72	finally
    //   43	62	72	finally
    //   62	68	72	finally
    //   69	71	72	finally
    //   73	75	72	finally
  }
  
  public final boolean u() {
    D();
    synchronized (this.a) {
      return this.u;
    } 
  }
  
  public final JSONObject v() {
    D();
    synchronized (this.a) {
      return this.t;
    } 
  }
  
  public final void w(boolean paramBoolean) {
    D();
    synchronized (this.a) {
      if (this.v == paramBoolean)
        return; 
      this.v = paramBoolean;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putBoolean("content_vertical_opted_out", paramBoolean);
        this.g.apply();
      } 
      E();
      return;
    } 
  }
  
  public final void x(String paramString) {
    D();
    synchronized (this.a) {
      long l = q.j().a();
      this.n = l;
      if (paramString == null || paramString.equals(this.m))
        return; 
      this.m = paramString;
      SharedPreferences.Editor editor = this.g;
      if (editor != null) {
        editor.putString("app_settings_json", paramString);
        this.g.putLong("app_settings_last_update_ms", l);
        this.g.apply();
      } 
      E();
      Iterator<Runnable> iterator = this.c.iterator();
      while (iterator.hasNext())
        ((Runnable)iterator.next()).run(); 
      return;
    } 
  }
  
  public final void y(Runnable paramRunnable) {
    this.c.add(paramRunnable);
  }
  
  public final sl2 z() {
    if (!this.b)
      return null; 
    if (u() && l())
      return null; 
    if (!((Boolean)z1.b.a()).booleanValue())
      return null; 
    synchronized (this.a) {
      if (Looper.getMainLooper() == null)
        return null; 
      if (this.e == null) {
        sl2 sl21 = new sl2();
        this();
        this.e = sl21;
      } 
      this.e.e();
      cm.h("start fetching content...");
      return this.e;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/g1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */