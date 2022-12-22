package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import java.util.Set;

public final class f81 implements s91<c81> {
  private final nt1 a;
  
  private final Context b;
  
  private final Set<String> c;
  
  public f81(nt1 paramnt1, Context paramContext, Set<String> paramSet) {
    this.a = paramnt1;
    this.b = paramContext;
    this.c = paramSet;
  }
  
  public final ot1<c81> a() {
    return this.a.a(new e81(this));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/f81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */