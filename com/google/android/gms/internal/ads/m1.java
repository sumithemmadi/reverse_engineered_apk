package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import java.util.List;

public final class m1 implements n92 {
  private e a;
  
  private b b;
  
  private d c;
  
  private l1 d;
  
  public static boolean f(Context paramContext) {
    PackageManager packageManager = paramContext.getPackageManager();
    if (packageManager == null)
      return false; 
    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
    ResolveInfo resolveInfo = packageManager.resolveActivity(intent, 0);
    List<ResolveInfo> list = packageManager.queryIntentActivities(intent, 65536);
    if (list != null && resolveInfo != null)
      for (byte b1 = 0; b1 < list.size(); b1++) {
        ResolveInfo resolveInfo1 = list.get(b1);
        if (resolveInfo.activityInfo.name.equals(resolveInfo1.activityInfo.name))
          return resolveInfo.activityInfo.packageName.equals(l92.a(paramContext)); 
      }  
    return false;
  }
  
  public final void a(b paramb) {
    this.b = paramb;
    paramb.c(0L);
    l1 l11 = this.d;
    if (l11 != null)
      l11.a(); 
  }
  
  public final void b() {
    this.b = null;
    this.a = null;
    l1 l11 = this.d;
    if (l11 != null)
      l11.b(); 
  }
  
  public final void c(l1 paraml1) {
    this.d = paraml1;
  }
  
  public final void d(Activity paramActivity) {
    d d1 = this.c;
    if (d1 == null)
      return; 
    paramActivity.unbindService((ServiceConnection)d1);
    this.b = null;
    this.a = null;
    this.c = null;
  }
  
  public final void e(Activity paramActivity) {
    if (this.b != null)
      return; 
    String str = l92.a((Context)paramActivity);
    if (str == null)
      return; 
    o92 o92 = new o92(this);
    this.c = o92;
    b.a((Context)paramActivity, str, o92);
  }
  
  public final e g() {
    b b1 = this.b;
    if (b1 == null) {
      this.a = null;
    } else if (this.a == null) {
      this.a = b1.b(null);
    } 
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/m1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */