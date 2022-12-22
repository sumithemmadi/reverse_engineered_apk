package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.v.a;
import com.google.android.gms.common.internal.t;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull.List;

final class e4 extends n5 {
  static final Pair<String, Long> c = new Pair("", Long.valueOf(0L));
  
  private SharedPreferences d;
  
  public b4 e;
  
  public final a4 f = new a4(this, "first_open_time", 0L);
  
  public final a4 g = new a4(this, "app_install_time", 0L);
  
  public final d4 h = new d4(this, "app_instance_id", null);
  
  private String i;
  
  private boolean j;
  
  private long k;
  
  public final a4 l = new a4(this, "session_timeout", 1800000L);
  
  public final y3 m = new y3(this, "start_new_session", true);
  
  public final d4 n = new d4(this, "non_personalized_ads", null);
  
  public final y3 o = new y3(this, "allow_remote_dynamite", false);
  
  public final a4 p = new a4(this, "last_pause_time", 0L);
  
  public boolean q;
  
  public final y3 r = new y3(this, "app_backgrounded", false);
  
  public final y3 s = new y3(this, "deep_link_retrieval_complete", false);
  
  public final a4 t = new a4(this, "deep_link_retrieval_attempts", 0L);
  
  public final d4 u = new d4(this, "firebase_feature_rollouts", null);
  
  public final d4 v = new d4(this, "deferred_attribution_cache", null);
  
  public final a4 w = new a4(this, "deferred_attribution_cache_timestamp", 0L);
  
  public final z3 x = new z3(this, "default_event_parameters", null);
  
  e4(s4 params4) {
    super(params4);
  }
  
  protected final boolean i() {
    return true;
  }
  
  @List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
  protected final void j() {
    SharedPreferences sharedPreferences = this.a.a().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    this.d = sharedPreferences;
    boolean bool = sharedPreferences.getBoolean("has_been_opened", false);
    this.q = bool;
    if (!bool) {
      SharedPreferences.Editor editor = this.d.edit();
      editor.putBoolean("has_been_opened", true);
      editor.apply();
    } 
    this.a.z();
    this.e = new b4(this, "health_monitor", Math.max(0L, ((Long)c3.d.b(null)).longValue()), null);
  }
  
  final Pair<String, Boolean> o(String paramString) {
    h();
    long l = this.a.b().b();
    String str = this.i;
    if (str == null || l >= this.k) {
      this.k = l + this.a.z().s(paramString, c3.c);
      a.e(true);
      try {
        a.a a = a.b(this.a.a());
        this.i = "";
        str = a.a();
        if (str != null)
          this.i = str; 
        this.j = a.b();
      } catch (Exception exception) {
        this.a.f().v().b("Unable to get advertising id", exception);
        this.i = "";
      } 
      a.e(false);
      return new Pair(this.i, Boolean.valueOf(this.j));
    } 
    return new Pair(str, Boolean.valueOf(this.j));
  }
  
  protected final SharedPreferences p() {
    h();
    l();
    t.j(this.d);
    return this.d;
  }
  
  final void q(Boolean paramBoolean) {
    h();
    SharedPreferences.Editor editor = p().edit();
    if (paramBoolean != null) {
      editor.putBoolean("measurement_enabled", paramBoolean.booleanValue());
    } else {
      editor.remove("measurement_enabled");
    } 
    editor.apply();
  }
  
  final Boolean r() {
    h();
    return p().contains("measurement_enabled") ? Boolean.valueOf(p().getBoolean("measurement_enabled", true)) : null;
  }
  
  final boolean s(int paramInt) {
    return f.m(paramInt, p().getInt("consent_source", 100));
  }
  
  final f t() {
    h();
    return f.c(p().getString("consent_settings", "G1"));
  }
  
  final void u(boolean paramBoolean) {
    h();
    this.a.f().w().b("App measurement setting deferred collection", Boolean.valueOf(paramBoolean));
    SharedPreferences.Editor editor = p().edit();
    editor.putBoolean("deferred_analytics_collection", paramBoolean);
    editor.apply();
  }
  
  final boolean v() {
    SharedPreferences sharedPreferences = this.d;
    return (sharedPreferences == null) ? false : sharedPreferences.contains("deferred_analytics_collection");
  }
  
  final boolean w(long paramLong) {
    return (paramLong - this.l.a() > this.p.a());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/measurement/internal/e4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */