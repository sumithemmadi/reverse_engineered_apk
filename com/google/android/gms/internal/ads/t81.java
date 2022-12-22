package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class t81 implements s91<u81> {
  private final nt1 a;
  
  private final ScheduledExecutorService b;
  
  private final k11 c;
  
  private final Context d;
  
  private final gi1 e;
  
  private final i11 f;
  
  private String g;
  
  public t81(nt1 paramnt1, ScheduledExecutorService paramScheduledExecutorService, String paramString, k11 paramk11, Context paramContext, gi1 paramgi1, i11 parami11) {
    this.a = paramnt1;
    this.b = paramScheduledExecutorService;
    this.g = paramString;
    this.c = paramk11;
    this.d = paramContext;
    this.e = paramgi1;
    this.f = parami11;
  }
  
  public final ot1<u81> a() {
    x<Boolean> x = m0.q1;
    return ((Boolean)er2.e().<Boolean>c(x)).booleanValue() ? dt1.c(new w81(this), this.a) : dt1.h(null);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/t81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */