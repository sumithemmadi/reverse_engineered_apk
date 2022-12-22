package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.s;
import java.util.Map;

final class d7 implements s {
  private boolean a = false;
  
  d7(b7 paramb7, Map paramMap1, Map paramMap2, bq2 parambq2) {}
  
  public final void a(zzacr paramzzacr) {}
  
  public final void b(boolean paramBoolean) {
    if (!this.a) {
      this.a = true;
      this.b.put((String)this.c.get("event_id"), Boolean.valueOf(paramBoolean));
      ((r8)this.d).B("openIntentAsync", this.b);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/d7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */