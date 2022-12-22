package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import org.json.JSONObject;

public final class zw implements a92<vk2> {
  private final m92<nh1> a;
  
  private final m92<zzazn> b;
  
  private final m92<JSONObject> c;
  
  private final m92<String> d;
  
  private zw(m92<nh1> paramm92, m92<zzazn> paramm921, m92<JSONObject> paramm922, m92<String> paramm923) {
    this.a = paramm92;
    this.b = paramm921;
    this.c = paramm922;
    this.d = paramm923;
  }
  
  public static zw a(m92<nh1> paramm92, m92<zzazn> paramm921, m92<JSONObject> paramm922, m92<String> paramm923) {
    return new zw(paramm92, paramm921, paramm922, paramm923);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */