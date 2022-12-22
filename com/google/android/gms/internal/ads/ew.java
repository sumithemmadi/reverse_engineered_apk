package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.q;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ew implements yv {
  private final CookieManager a;
  
  public ew(Context paramContext) {
    this.a = q.e().l(paramContext);
  }
  
  public final void a(Map<String, String> paramMap) {
    String str1;
    if (this.a == null)
      return; 
    if ((String)paramMap.get("clear") != null) {
      x<String> x1 = m0.w0;
      String str = er2.e().<String>c(x1);
      str1 = this.a.getCookie(str);
      if (str1 != null) {
        List<String> list = wq1.b(fq1.b(';')).g(str1);
        for (byte b = 0; b < list.size(); b++) {
          StringBuilder stringBuilder;
          CookieManager cookieManager1 = this.a;
          str1 = list.get(b);
          Iterable<String> iterable = wq1.b(fq1.b('=')).c(str1);
          xq1.b(iterable);
          if (iterable instanceof List) {
            iterable = ((List)iterable).get(0);
          } else {
            Iterator<String> iterator = iterable.iterator();
            xq1.b(iterator);
            xq1.a(true, "numberToAdvance must be nonnegative");
            if (iterator.hasNext()) {
              iterator = (Iterator<String>)iterator.next();
            } else {
              stringBuilder = new StringBuilder(91);
              stringBuilder.append("position (0) must be less than the number of elements that remained (0");
              stringBuilder.append(")");
              throw new IndexOutOfBoundsException(stringBuilder.toString());
            } 
          } 
          str1 = String.valueOf(stringBuilder);
          x<String> x2 = m0.l0;
          String str3 = String.valueOf(er2.e().<String>c(x2));
          if (str3.length() != 0) {
            str1 = str1.concat(str3);
          } else {
            str1 = new String(str1);
          } 
          cookieManager1.setCookie(str, str1);
        } 
      } 
      return;
    } 
    String str2 = (String)str1.get("cookie");
    if (TextUtils.isEmpty(str2))
      return; 
    CookieManager cookieManager = this.a;
    x<String> x = m0.w0;
    cookieManager.setCookie(er2.e().<String>c(x), str2);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */