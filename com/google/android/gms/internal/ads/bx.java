package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class bx implements a92<Set<gb0<i50>>> {
  private final m92<sw> a;
  
  private final m92<Executor> b;
  
  private final m92<JSONObject> c;
  
  private bx(m92<sw> paramm92, m92<Executor> paramm921, m92<JSONObject> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static bx a(m92<sw> paramm92, m92<Executor> paramm921, m92<JSONObject> paramm922) {
    return new bx(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */