package androidx.work;

import android.content.Context;
import androidx.work.impl.h;
import java.util.Collections;
import java.util.List;

public abstract class k {
  public static k d(Context paramContext) {
    return (k)h.j(paramContext);
  }
  
  public static void e(Context paramContext, a parama) {
    h.e(paramContext, parama);
  }
  
  public abstract h a(String paramString);
  
  public final h b(l paraml) {
    return c(Collections.singletonList(paraml));
  }
  
  public abstract h c(List<? extends l> paramList);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/work/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */