package androidx.work.impl.k.e;

import android.content.Context;
import androidx.work.NetworkType;
import androidx.work.impl.k.b;
import androidx.work.impl.k.f.d;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.j.a;

public class g extends c<b> {
  public g(Context paramContext, a parama) {
    super((d<b>)androidx.work.impl.k.f.g.c(paramContext, parama).d());
  }
  
  boolean b(j paramj) {
    boolean bool;
    if (paramj.l.b() == NetworkType.d) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean i(b paramb) {
    return (!paramb.a() || paramb.b());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */