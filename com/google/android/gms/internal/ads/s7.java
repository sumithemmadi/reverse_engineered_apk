package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.ads.internal.util.b1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class s7 implements bo2 {
  private volatile i7 a;
  
  private final Context b;
  
  public s7(Context paramContext) {
    this.b = paramContext;
  }
  
  private final void b() {
    if (this.a == null)
      return; 
    this.a.a();
    Binder.flushPendingCommands();
  }
  
  public final kt2 a(w<?> paramw) {
    null = zzait.o0(paramw);
    long l = q.j().b();
    try {
      sm<?> sm = new sm();
      this();
      w7 w7 = new w7();
      this(this, sm);
      v7 v7 = new v7();
      this(this, sm);
      i7 i71 = new i7();
      this(this.b, q.q().b(), w7, v7);
      this.a = i71;
      this.a.s();
      r7 r7 = new r7();
      this(this, null);
      nt1 nt1 = fm.a;
      ot1<?> ot11 = dt1.k(sm, r7, nt1);
      x<Integer> x = m0.f3;
      ot1<?> ot12 = dt1.d(ot11, ((Integer)er2.e().<Integer>c(x)).intValue(), TimeUnit.MILLISECONDS, fm.d);
      t7 t7 = new t7();
      this(this);
      ot12.a(t7, nt1);
      ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)ot12.get();
      long l1 = q.j().b();
      StringBuilder stringBuilder = new StringBuilder(52);
      stringBuilder.append("Http assets remote cache took ");
      stringBuilder.append(l1 - l);
      stringBuilder.append("ms");
      b1.m(stringBuilder.toString());
      zzaiv zzaiv = (new zzatp(parcelFileDescriptor)).<zzaiv>o0(zzaiv.CREATOR);
      if (zzaiv == null)
        return null; 
      if (!zzaiv.b) {
        if (zzaiv.f.length != zzaiv.g.length)
          return null; 
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        byte b = 0;
        while (true)
          return new kt2(zzaiv.d, zzaiv.e, (Map)hashMap, zzaiv.h, zzaiv.i); 
      } 
      throw new zzap(zzaiv.c);
    } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {
      return null;
    } finally {
      long l1 = q.j().b();
      StringBuilder stringBuilder = new StringBuilder(52);
      stringBuilder.append("Http assets remote cache took ");
      stringBuilder.append(l1 - l);
      stringBuilder.append("ms");
      b1.m(stringBuilder.toString());
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/s7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */