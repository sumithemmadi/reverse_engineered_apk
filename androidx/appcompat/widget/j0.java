package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

public class j0 extends Resources {
  private static boolean a = false;
  
  private final WeakReference<Context> b;
  
  public j0(Context paramContext, Resources paramResources) {
    super(paramResources.getAssets(), paramResources.getDisplayMetrics(), paramResources.getConfiguration());
    this.b = new WeakReference<Context>(paramContext);
  }
  
  public static boolean a() {
    return a;
  }
  
  public static boolean b() {
    boolean bool;
    if (a() && Build.VERSION.SDK_INT <= 20) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  final Drawable c(int paramInt) {
    return super.getDrawable(paramInt);
  }
  
  public Drawable getDrawable(int paramInt) {
    Context context = this.b.get();
    return (context != null) ? v.h().t(context, this, paramInt) : super.getDrawable(paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */