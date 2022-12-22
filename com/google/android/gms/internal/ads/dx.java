package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.p;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class dx implements a92<Set<gb0<p>>> {
  private final m92<sw> a;
  
  private final m92<Executor> b;
  
  private final m92<JSONObject> c;
  
  private dx(m92<sw> paramm92, m92<Executor> paramm921, m92<JSONObject> paramm922) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
  }
  
  public static dx a(m92<sw> paramm92, m92<Executor> paramm921, m92<JSONObject> paramm922) {
    return new dx(paramm92, paramm921, paramm922);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */