package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.h1;
import com.google.android.gms.internal.ads.uj;
import com.google.android.gms.internal.ads.zzatf;
import java.util.List;

public final class a {
  private final Context a;
  
  private boolean b;
  
  private uj c;
  
  private zzatf d;
  
  public a(Context paramContext, uj paramuj, zzatf paramzzatf) {
    this.a = paramContext;
    this.c = paramuj;
    this.d = null;
    if (!false)
      this.d = new zzatf(); 
  }
  
  private final boolean c() {
    uj uj1 = this.c;
    return ((uj1 != null && (uj1.f()).g) || this.d.b);
  }
  
  public final void a() {
    this.b = true;
  }
  
  public final void b(String paramString) {
    if (!c())
      return; 
    if (paramString == null)
      paramString = ""; 
    uj uj1 = this.c;
    if (uj1 != null) {
      uj1.d(paramString, null, 3);
      return;
    } 
    zzatf zzatf1 = this.d;
    if (zzatf1.b) {
      List list = zzatf1.c;
      if (list != null)
        for (String str : list) {
          if (!TextUtils.isEmpty(str)) {
            str = str.replace("{NAVIGATION_URL}", Uri.encode(paramString));
            q.c();
            h1.N(this.a, "", str);
          } 
        }  
    } 
  }
  
  public final boolean d() {
    return (!c() || this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */