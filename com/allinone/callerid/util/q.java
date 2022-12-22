package com.allinone.callerid.util;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.allinone.callerid.main.EZCallApplication;
import com.google.firebase.analytics.FirebaseAnalytics;

public class q {
  private static q a;
  
  private Context b;
  
  private FirebaseAnalytics c;
  
  public q(Context paramContext) {
    this.b = paramContext;
  }
  
  private FirebaseAnalytics a() {
    if (this.c == null)
      try {
        this.c = FirebaseAnalytics.getInstance(this.b);
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return this.c;
  }
  
  public static q b() {
    if (a == null)
      a = new q((Context)EZCallApplication.c()); 
    return a;
  }
  
  public void c(String paramString) {
    a.a().a(paramString, null);
  }
  
  public void d(String paramString) {
    String str = p.d((Context)EZCallApplication.c()).getCountry_name();
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("country", str);
    firebaseAnalytics.a(paramString, bundle);
  }
  
  public void e(String paramString) {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("device", i1.N());
    bundle.putString("manufacturer", Build.MANUFACTURER);
    bundle.putString("osversion", Build.VERSION.RELEASE);
    firebaseAnalytics.a(paramString, bundle);
  }
  
  public void f(String paramString) {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("DownloadError", paramString);
    firebaseAnalytics.a("DownloadException", bundle);
  }
  
  public void g(String paramString) {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("error", paramString);
    firebaseAnalytics.a("search_error", bundle);
  }
  
  public void h() {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("device", i1.N());
    bundle.putString("manufacturer", Build.MANUFACTURER);
    bundle.putString("osversion", Build.VERSION.RELEASE);
    firebaseAnalytics.a("not_alive", bundle);
  }
  
  public void i() {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("device", i1.N());
    bundle.putString("manufacturer", Build.MANUFACTURER);
    bundle.putString("osversion", Build.VERSION.RELEASE);
    firebaseAnalytics.a("not_alive_current_day_date", bundle);
  }
  
  public void j() {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("device", i1.N());
    bundle.putString("manufacturer", Build.MANUFACTURER);
    bundle.putString("osversion", Build.VERSION.RELEASE);
    firebaseAnalytics.a("not_alive_current_day_time", bundle);
  }
  
  public void k() {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("device", i1.N());
    bundle.putString("manufacturer", Build.MANUFACTURER);
    bundle.putString("osversion", Build.VERSION.RELEASE);
    firebaseAnalytics.a("not_alive_more_day_time", bundle);
  }
  
  public void l() {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("device", i1.N());
    bundle.putString("manufacturer", Build.MANUFACTURER);
    bundle.putString("osversion", Build.VERSION.RELEASE);
    firebaseAnalytics.a("not_alive_next_day_time", bundle);
  }
  
  public void m(String paramString) {
    FirebaseAnalytics firebaseAnalytics = a.a();
    Bundle bundle = new Bundle();
    bundle.putString("play_error", paramString);
    firebaseAnalytics.a("exo_play_error", bundle);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */