package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.f;
import java.util.ArrayList;
import java.util.List;

public final class ki1 {
  public static qh1 a(List<qh1> paramList, qh1 paramqh1) {
    return paramList.get(0);
  }
  
  public static zzvs b(Context paramContext, List<qh1> paramList) {
    ArrayList<f> arrayList = new ArrayList();
    for (qh1 qh1 : paramList) {
      if (qh1.c) {
        arrayList.add(f.h);
        continue;
      } 
      arrayList.add(new f(qh1.a, qh1.b));
    } 
    return new zzvs(paramContext, arrayList.<f>toArray(new f[arrayList.size()]));
  }
  
  public static qh1 c(zzvs paramzzvs) {
    return paramzzvs.j ? new qh1(-3, 0, true) : new qh1(paramzzvs.f, paramzzvs.c, false);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ki1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */