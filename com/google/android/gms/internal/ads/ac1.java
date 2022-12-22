package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public final class ac1 implements a92<v91<JSONObject>> {
  public static v91<JSONObject> a(xk paramxk, Object<Boolean> paramObject, na1 paramna1, pb1 parampb1, t82<ga1> paramt82, t82<ra1> paramt821, t82<va1> paramt822, t82<bb1> paramt823, t82<kb1> paramt824, t82<qb1> paramt825, t82<cc1> paramt826, Executor paramExecutor, ScheduledExecutorService paramScheduledExecutorService) {
    paramObject = paramObject;
    HashSet<Object> hashSet = new HashSet();
    hashSet.add(paramObject);
    hashSet.add(paramna1);
    hashSet.add(parampb1);
    paramObject = (Object<Boolean>)m0.o4;
    if (((Boolean)er2.e().<Boolean>c((x<Boolean>)paramObject)).booleanValue())
      hashSet.add(paramt82.get()); 
    x<Boolean> x = m0.p4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      hashSet.add(paramt821.get()); 
    x = m0.q4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      hashSet.add(paramt822.get()); 
    x = m0.r4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      hashSet.add(paramt823.get()); 
    x = m0.w4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      hashSet.add(paramt825.get()); 
    x = m0.x4;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue())
      hashSet.add(paramt826.get()); 
    return g92.<v91<JSONObject>>b(new v91<JSONObject>(paramExecutor, hashSet), "Cannot return null from a non-@Nullable @Provides method");
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ac1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */