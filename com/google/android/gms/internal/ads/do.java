package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import com.google.android.gms.ads.internal.util.t;
import com.google.android.gms.ads.internal.util.u;
import com.google.android.gms.ads.internal.util.v;
import java.util.concurrent.TimeUnit;

public final class do {
  private final Context a;
  
  private final String b;
  
  private final zzazn c;
  
  private final x0 d;
  
  private final z0 e;
  
  private final t f = (new u()).a("min_1", Double.MIN_VALUE, 1.0D).a("1_5", 1.0D, 5.0D).a("5_10", 5.0D, 10.0D).a("10_20", 10.0D, 20.0D).a("20_30", 20.0D, 30.0D).a("30_max", 30.0D, Double.MAX_VALUE).e();
  
  private final long[] g;
  
  private final String[] h;
  
  private boolean i = false;
  
  private boolean j = false;
  
  private boolean k = false;
  
  private boolean l = false;
  
  private boolean m;
  
  private zzbav n;
  
  private boolean o;
  
  private boolean p;
  
  private long q = -1L;
  
  public do(Context paramContext, zzazn paramzzazn, String paramString, z0 paramz0, x0 paramx0) {
    this.a = paramContext;
    this.c = paramzzazn;
    this.b = paramString;
    this.e = paramz0;
    this.d = paramx0;
    x<String> x = m0.u;
    String str = er2.e().<String>c(x);
    if (str == null) {
      this.h = new String[0];
      this.g = new long[0];
      return;
    } 
    String[] arrayOfString = TextUtils.split(str, ",");
    this.h = new String[arrayOfString.length];
    this.g = new long[arrayOfString.length];
    for (byte b = 0; b < arrayOfString.length; b++) {
      try {
        this.g[b] = Long.parseLong(arrayOfString[b]);
      } catch (NumberFormatException numberFormatException) {
        cm.d("Unable to parse frame hash target time number.", numberFormatException);
        this.g[b] = -1L;
      } 
    } 
  }
  
  public final void a() {
    if (((Boolean)r2.a.a()).booleanValue() && !this.o) {
      Bundle bundle = new Bundle();
      bundle.putString("type", "native-player-metrics");
      bundle.putString("request", this.b);
      bundle.putString("player", this.n.l());
      for (v v : this.f.c()) {
        String str = String.valueOf(v.a);
        if (str.length() != 0) {
          str = "fps_c_".concat(str);
        } else {
          str = new String("fps_c_");
        } 
        bundle.putString(str, Integer.toString(v.e));
        str = String.valueOf(v.a);
        if (str.length() != 0) {
          str = "fps_p_".concat(str);
        } else {
          str = new String("fps_p_");
        } 
        bundle.putString(str, Double.toString(v.d));
      } 
      byte b = 0;
      while (true) {
        long[] arrayOfLong = this.g;
        if (b < arrayOfLong.length) {
          String str = this.h[b];
          if (str != null) {
            String str1 = String.valueOf(Long.valueOf(arrayOfLong[b]));
            StringBuilder stringBuilder = new StringBuilder(str1.length() + 3);
            stringBuilder.append("fh_");
            stringBuilder.append(str1);
            bundle.putString(stringBuilder.toString(), str);
          } 
          b++;
          continue;
        } 
        q.c().l(this.a, this.c.b, "gmob-apps", bundle, true);
        this.o = true;
        break;
      } 
    } 
  }
  
  public final void b() {
    this.m = true;
    if (this.j && !this.k) {
      u0.a(this.e, this.d, new String[] { "vfp2" });
      this.k = true;
    } 
  }
  
  public final void c() {
    this.m = false;
  }
  
  public final void d(zzbav paramzzbav) {
    u0.a(this.e, this.d, new String[] { "vpc2" });
    this.i = true;
    z0 z01 = this.e;
    if (z01 != null)
      z01.d("vpn", paramzzbav.l()); 
    this.n = paramzzbav;
  }
  
  public final void e(zzbav paramzzbav) {
    if (this.k && !this.l) {
      if (b1.n() && !this.l)
        b1.m("VideoMetricsMixin first frame"); 
      u0.a(this.e, this.d, new String[] { "vff2" });
      this.l = true;
    } 
    long l1 = q.j().c();
    if (this.m && this.p && this.q != -1L) {
      double d1 = TimeUnit.SECONDS.toNanos(1L);
      double d2 = (l1 - this.q);
      Double.isNaN(d1);
      Double.isNaN(d2);
      d1 /= d2;
      this.f.a(d1);
    } 
    this.p = this.m;
    this.q = l1;
    x<Long> x = m0.v;
    long l2 = ((Long)er2.e().<Long>c(x)).longValue();
    l1 = paramzzbav.getCurrentPosition();
    byte b = 0;
    while (true) {
      String[] arrayOfString = this.h;
      if (b < arrayOfString.length) {
        if (arrayOfString[b] == null && l2 > Math.abs(l1 - this.g[b])) {
          arrayOfString = this.h;
          Bitmap bitmap = paramzzbav.getBitmap(8, 8);
          l1 = 63L;
          byte b1 = 0;
          l2 = 0L;
          while (b1 < 8) {
            byte b2 = 0;
            while (b2 < 8) {
              long l;
              int i = bitmap.getPixel(b2, b1);
              if (Color.blue(i) + Color.red(i) + Color.green(i) > 128) {
                l = 1L;
              } else {
                l = 0L;
              } 
              l2 |= l << (int)l1;
              b2++;
              l1--;
            } 
            b1++;
          } 
          arrayOfString[b] = String.format("%016X", new Object[] { Long.valueOf(l2) });
          return;
        } 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final void f() {
    if (this.i && !this.j) {
      u0.a(this.e, this.d, new String[] { "vfr2" });
      this.j = true;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/do.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */