package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

final class n62 {
  private final ArrayDeque<zzejr> a = new ArrayDeque<zzejr>();
  
  private n62() {}
  
  private final void b(zzejr paramzzejr) {
    while (true) {
      if (paramzzejr.zzbgn()) {
        int i = d(paramzzejr.size());
        int j = zzeng.zzhr(i + 1);
        if (this.a.isEmpty() || ((zzejr)this.a.peek()).size() >= j) {
          this.a.push(paramzzejr);
          return;
        } 
        i = zzeng.zzhr(i);
        zzejr zzejr1;
        for (zzejr1 = this.a.pop(); !this.a.isEmpty() && ((zzejr)this.a.peek()).size() < i; zzejr1 = new zzeng(this.a.pop(), zzejr1, null));
        paramzzejr = new zzeng(zzejr1, paramzzejr, null);
        while (!this.a.isEmpty()) {
          i = zzeng.zzhr(d(paramzzejr.size()) + 1);
          if (((zzejr)this.a.peek()).size() < i)
            paramzzejr = new zzeng(this.a.pop(), paramzzejr, null); 
        } 
        this.a.push(paramzzejr);
        return;
      } 
      if (paramzzejr instanceof zzeng) {
        paramzzejr = paramzzejr;
        b(zzeng.zza((zzeng)paramzzejr));
        paramzzejr = zzeng.zzb((zzeng)paramzzejr);
        continue;
      } 
      String str = String.valueOf(paramzzejr.getClass());
      StringBuilder stringBuilder = new StringBuilder(str.length() + 49);
      stringBuilder.append("Has a new type of ByteString been created? Found ");
      stringBuilder.append(str);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    } 
  }
  
  private final zzejr c(zzejr paramzzejr1, zzejr paramzzejr2) {
    b(paramzzejr1);
    b(paramzzejr2);
    for (paramzzejr1 = this.a.pop(); !this.a.isEmpty(); paramzzejr1 = new zzeng(this.a.pop(), paramzzejr1, null));
    return paramzzejr1;
  }
  
  private static int d(int paramInt) {
    int i = Arrays.binarySearch(zzeng.e, paramInt);
    paramInt = i;
    if (i < 0)
      paramInt = -(i + 1) - 1; 
    return paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/n62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */