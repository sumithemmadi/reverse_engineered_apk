package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.ads.w.a;
import java.util.Map;

public final class de extends oe {
  private final Map<String, String> c;
  
  private final Context d;
  
  private String e;
  
  private long f;
  
  private long g;
  
  private String h;
  
  private String i;
  
  public de(tq paramtq, Map<String, String> paramMap) {
    super(paramtq, "createCalendarEvent");
    this.c = paramMap;
    this.d = (Context)paramtq.a();
    this.e = k("description");
    this.h = k("summary");
    this.f = l("start_ticks");
    this.g = l("end_ticks");
    this.i = k("location");
  }
  
  private final String k(String paramString) {
    return TextUtils.isEmpty(this.c.get(paramString)) ? "" : this.c.get(paramString);
  }
  
  private final long l(String paramString) {
    long l2;
    paramString = this.c.get(paramString);
    long l1 = -1L;
    if (paramString == null)
      return -1L; 
    try {
      l2 = Long.parseLong(paramString);
    } catch (NumberFormatException numberFormatException) {
      l2 = l1;
    } 
    return l2;
  }
  
  @TargetApi(14)
  final Intent h() {
    Intent intent = (new Intent("android.intent.action.EDIT")).setData(CalendarContract.Events.CONTENT_URI);
    intent.putExtra("title", this.e);
    intent.putExtra("eventLocation", this.i);
    intent.putExtra("description", this.h);
    long l = this.f;
    if (l > -1L)
      intent.putExtra("beginTime", l); 
    l = this.g;
    if (l > -1L)
      intent.putExtra("endTime", l); 
    intent.setFlags(268435456);
    return intent;
  }
  
  public final void i() {
    String str;
    if (this.d == null) {
      e("Activity context is not available.");
      return;
    } 
    q.c();
    if (!h1.z(this.d).e()) {
      e("This feature is not available on the device.");
      return;
    } 
    q.c();
    AlertDialog.Builder builder = h1.y(this.d);
    Resources resources = q.g().b();
    if (resources != null) {
      str = resources.getString(a.s5);
    } else {
      str = "Create calendar event";
    } 
    builder.setTitle(str);
    if (resources != null) {
      str = resources.getString(a.s6);
    } else {
      str = "Allow Ad to create a calendar event?";
    } 
    builder.setMessage(str);
    if (resources != null) {
      str = resources.getString(a.s3);
    } else {
      str = "Accept";
    } 
    builder.setPositiveButton(str, new ce(this));
    if (resources != null) {
      str = resources.getString(a.s4);
    } else {
      str = "Decline";
    } 
    builder.setNegativeButton(str, new fe(this));
    builder.create().show();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */