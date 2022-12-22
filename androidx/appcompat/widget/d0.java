package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class d0 extends w {
  private final WeakReference<Context> b;
  
  public d0(Context paramContext, Resources paramResources) {
    super(paramResources);
    this.b = new WeakReference<Context>(paramContext);
  }
  
  public Drawable getDrawable(int paramInt) {
    Drawable drawable = super.getDrawable(paramInt);
    Context context = this.b.get();
    if (drawable != null && context != null)
      v.h().x(context, paramInt, drawable); 
    return drawable;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */