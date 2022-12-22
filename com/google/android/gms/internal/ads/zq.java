package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

final class zq implements et1<Map<String, String>> {
  zq(wq paramwq, List paramList, String paramString, Uri paramUri) {}
  
  public final void a(Throwable paramThrowable) {
    String str = String.valueOf(this.c);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 33);
    stringBuilder.append("Failed to parse gmsg params for: ");
    stringBuilder.append(str);
    cm.i(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */