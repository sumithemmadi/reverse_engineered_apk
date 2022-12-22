package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.r0;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.k.c;

public final class s {
  private final Context a;
  
  public s(Context paramContext) {
    t.k(paramContext, "Context can not be null");
    this.a = paramContext;
  }
  
  private final boolean a(Intent paramIntent) {
    t.k(paramIntent, "Intent can not be null");
    return !this.a.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty();
  }
  
  public final boolean b() {
    Intent intent = new Intent("android.intent.action.DIAL");
    intent.setData(Uri.parse("tel:"));
    return a(intent);
  }
  
  public final boolean c() {
    Intent intent = new Intent("android.intent.action.VIEW");
    intent.setData(Uri.parse("sms:"));
    return a(intent);
  }
  
  public final boolean d() {
    return (((Boolean)r0.a(this.a, new v())).booleanValue() && c.a(this.a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }
  
  @TargetApi(14)
  public final boolean e() {
    return a((new Intent("android.intent.action.INSERT")).setType("vnd.android.cursor.dir/event"));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */