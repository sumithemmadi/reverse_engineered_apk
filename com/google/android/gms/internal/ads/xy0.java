package com.google.android.gms.internal.ads;

public final class xy0 {
  private final ti1 a;
  
  private final gm0 b;
  
  private final jo0 c;
  
  private final pm1 d;
  
  public xy0(ti1 paramti1, gm0 paramgm0, jo0 paramjo0, pm1 parampm1) {
    this.a = paramti1;
    this.b = paramgm0;
    this.c = paramjo0;
    this.d = parampm1;
  }
  
  public final void a(sh1 paramsh1, nh1 paramnh1, int paramInt, zzcrn paramzzcrn, long paramLong) {
    rm1 rm1;
    zzapy zzapy1;
    zzapy zzapy2;
    x<Boolean> x = m0.c6;
    if (((Boolean)er2.e().<Boolean>c(x)).booleanValue()) {
      rm1 = rm1.d("adapter_status").b(paramsh1).c(paramnh1).i("adapter_l", String.valueOf(paramLong)).i("sc", Integer.toString(paramInt));
      if (paramzzcrn != null) {
        rm1.i("arec", Integer.toString((paramzzcrn.zzary()).b));
        String str = this.a.a(paramzzcrn.getMessage());
        if (str != null)
          rm1.i("areec", str); 
      } 
      dm0 dm01 = this.b.d(paramnh1.s);
      if (dm01 != null) {
        rm1.i("ancn", dm01.a);
        zzapy2 = dm01.b;
        if (zzapy2 != null)
          rm1.i("adapter_v", zzapy2.toString()); 
        zzapy1 = dm01.c;
        if (zzapy1 != null)
          rm1.i("adapter_sv", zzapy1.toString()); 
      } 
      this.d.b(rm1);
      return;
    } 
    mo0 mo0 = this.c.b().a((sh1)rm1).g((nh1)zzapy1).h("action", "adapter_status").h("adapter_l", String.valueOf(paramLong));
    mo0.h("sc", Integer.toString(paramInt));
    if (zzapy2 != null) {
      mo0.h("arec", Integer.toString((zzapy2.zzary()).b));
      String str = this.a.a(zzapy2.getMessage());
      if (str != null)
        mo0.h("areec", str); 
    } 
    dm0 dm0 = this.b.d(((nh1)zzapy1).s);
    if (dm0 != null) {
      mo0.h("ancn", dm0.a);
      zzapy1 = dm0.b;
      if (zzapy1 != null)
        mo0.h("adapter_v", zzapy1.toString()); 
      zzapy1 = dm0.c;
      if (zzapy1 != null)
        mo0.h("adapter_sv", zzapy1.toString()); 
    } 
    mo0.c();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/xy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */