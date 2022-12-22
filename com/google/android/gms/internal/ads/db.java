package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.h1;
import org.json.JSONObject;

public final class db<I, O> implements qs1<I, O> {
  private final la<O> a;
  
  private final ka<I> b;
  
  private final String c;
  
  private final ot1<ga> d;
  
  db(ot1<ga> paramot1, String paramString, ka<I> paramka, la<O> paramla) {
    this.d = paramot1;
    this.c = paramString;
    this.b = paramka;
    this.a = paramla;
  }
  
  public final ot1<O> a(I paramI) {
    return dt1.k(this.d, new cb(this, paramI), fm.f);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */