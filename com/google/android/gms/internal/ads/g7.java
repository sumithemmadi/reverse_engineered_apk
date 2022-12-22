package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class g7 implements x6<Object> {
  private final j7 a;
  
  private g7(j7 paramj7) {
    this.a = paramj7;
  }
  
  public static void b(tq paramtq, j7 paramj7) {
    paramtq.d("/reward", new g7(paramj7));
  }
  
  public final void a(Object paramObject, Map<String, String> paramMap) {
    paramObject = paramMap.get("action");
    if ("grant".equals(paramObject)) {
      NumberFormatException numberFormatException1 = null;
      try {
        int i = Integer.parseInt(paramMap.get("amount"));
        String str = paramMap.get("type");
        paramObject = numberFormatException1;
        if (!TextUtils.isEmpty(str)) {
          paramObject = new zzavj();
          super(str, i);
        } 
      } catch (NumberFormatException numberFormatException) {
        cm.d("Unable to parse reward amount.", numberFormatException);
        numberFormatException = numberFormatException1;
      } 
      this.a.t((zzavj)numberFormatException);
      return;
    } 
    if ("video_start".equals(numberFormatException)) {
      this.a.P0();
      return;
    } 
    if ("video_complete".equals(numberFormatException))
      this.a.G0(); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/g7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */