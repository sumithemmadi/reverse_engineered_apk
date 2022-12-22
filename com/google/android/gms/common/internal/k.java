package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.c;

public class k {
  private final SparseIntArray a = new SparseIntArray();
  
  private c b;
  
  public k(c paramc) {
    t.j(paramc);
    this.b = paramc;
  }
  
  public void a() {
    this.a.clear();
  }
  
  public int b(Context paramContext, a.f paramf) {
    t.j(paramContext);
    t.j(paramf);
    boolean bool = paramf.n();
    byte b = 0;
    if (!bool)
      return 0; 
    int i = paramf.o();
    int j = this.a.get(i, -1);
    if (j != -1)
      return j; 
    int m = 0;
    while (true) {
      if (m < this.a.size()) {
        int n = this.a.keyAt(m);
        if (n > i && this.a.get(n) == 0) {
          m = b;
          break;
        } 
        m++;
        continue;
      } 
      m = j;
      break;
    } 
    j = m;
    if (m == -1)
      j = this.b.h(paramContext, i); 
    this.a.put(i, j);
    return j;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */