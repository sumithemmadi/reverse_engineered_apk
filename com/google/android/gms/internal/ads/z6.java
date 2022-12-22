package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

public final class z6 implements x6<Object> {
  private final Context a;
  
  public z6(Context paramContext) {
    this.a = paramContext;
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    if (!q.A().H(this.a))
      return; 
    paramObject = paramMap.get("eventName");
    String str = paramMap.get("eventId");
    paramObject.hashCode();
    byte b = -1;
    switch (paramObject.hashCode()) {
      case 94407:
        if (!paramObject.equals("_ai"))
          break; 
        b = 2;
        break;
      case 94401:
        if (!paramObject.equals("_ac"))
          break; 
        b = 1;
        break;
      case 94399:
        if (!paramObject.equals("_aa"))
          break; 
        b = 0;
        break;
    } 
    switch (b) {
      default:
        cm.g("logScionEvent gmsg contained unsupported eventName");
        return;
      case 2:
        q.A().w(this.a, str);
        return;
      case 1:
        q.A().v(this.a, str);
        return;
      case 0:
        break;
    } 
    q.A().z(this.a, str);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/z6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */