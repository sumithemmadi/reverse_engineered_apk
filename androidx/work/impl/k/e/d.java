package androidx.work.impl.k.e;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.k.b;
import androidx.work.impl.k.f.g;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.j.a;

public class d extends c<b> {
  public d(Context paramContext, a parama) {
    super((androidx.work.impl.k.f.d<b>)g.c(paramContext, parama).d());
  }
  
  boolean b(j paramj) {
    boolean bool;
    if (paramj.l.b() == NetworkType.c) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean i(b paramb) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = true;
    if (i >= 26) {
      boolean bool1 = bool;
      if (paramb.a())
        if (!paramb.d()) {
          bool1 = bool;
        } else {
          bool1 = false;
        }  
      return bool1;
    } 
    return paramb.a() ^ true;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */