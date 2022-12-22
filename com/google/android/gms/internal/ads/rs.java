package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;

public class rs {
  private final zzazn a;
  
  private final Context b;
  
  private final WeakReference<Context> c;
  
  private rs(a parama) {
    this.a = a.a(parama);
    this.b = a.c(parama);
    this.c = a.e(parama);
  }
  
  final Context a() {
    return this.b;
  }
  
  final WeakReference<Context> b() {
    return this.c;
  }
  
  final zzazn c() {
    return this.a;
  }
  
  final String d() {
    return q.c().r0(this.b, this.a.b);
  }
  
  public final p12 e() {
    return new p12((xr1)new f(this.b, this.a));
  }
  
  public static final class a {
    private zzazn a;
    
    private Context b;
    
    private WeakReference<Context> c;
    
    public final a b(zzazn param1zzazn) {
      this.a = param1zzazn;
      return this;
    }
    
    public final a d(Context param1Context) {
      this.c = new WeakReference<Context>(param1Context);
      Context context = param1Context;
      if (param1Context.getApplicationContext() != null)
        context = param1Context.getApplicationContext(); 
      this.b = context;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/rs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */