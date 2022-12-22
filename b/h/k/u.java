package b.h.k;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

public final class u {
  private Object a;
  
  private u(Object paramObject) {
    this.a = paramObject;
  }
  
  public static u b(Context paramContext, int paramInt) {
    return (Build.VERSION.SDK_INT >= 24) ? new u(PointerIcon.getSystemIcon(paramContext, paramInt)) : new u(null);
  }
  
  public Object a() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */