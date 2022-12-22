package androidx.work.impl.k.e;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.k.b;
import androidx.work.impl.k.f.d;
import androidx.work.impl.k.f.g;
import androidx.work.impl.l.j;
import androidx.work.impl.utils.j.a;

public class f extends c<b> {
  private static final String e = androidx.work.f.f("NetworkNotRoamingCtrlr");
  
  public f(Context paramContext, a parama) {
    super((d<b>)g.c(paramContext, parama).d());
  }
  
  boolean b(j paramj) {
    boolean bool;
    if (paramj.l.b() == NetworkType.e) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  boolean i(b paramb) {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = true;
    if (i < 24) {
      androidx.work.f.c().a(e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
      return paramb.a() ^ true;
    } 
    boolean bool2 = bool1;
    if (paramb.a())
      if (!paramb.c()) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }  
    return bool2;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/impl/k/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */