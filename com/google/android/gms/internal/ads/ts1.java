package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

abstract class ts1<V, C> extends zzdyo<V, C> {
  private List<vs1<V>> q;
  
  ts1(zzdwy<? extends ot1<? extends V>> paramzzdwy, boolean paramBoolean) {
    super(paramzzdwy, true, true);
    ArrayList<?> arrayList;
    if (paramzzdwy.isEmpty()) {
      zzdxd<?> zzdxd = zzdxd.zzazm();
    } else {
      arrayList = rr1.b(paramzzdwy.size());
    } 
    for (byte b = 0; b < paramzzdwy.size(); b++)
      arrayList.add(null); 
    this.q = (List)arrayList;
  }
  
  final void N(zzdyo.zza paramzza) {
    super.N(paramzza);
    this.q = null;
  }
  
  final void R() {
    List<vs1<V>> list = this.q;
    if (list != null)
      i((V)V(list)); 
  }
  
  final void S(int paramInt, V paramV) {
    List<vs1<V>> list = this.q;
    if (list != null)
      list.set(paramInt, new vs1<V>(paramV)); 
  }
  
  abstract C V(List<vs1<V>> paramList);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ts1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */