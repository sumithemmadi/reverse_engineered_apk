package com.bumptech.glide.load.j.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.d.f;
import b.a.o.d;

public final class a {
  private static volatile boolean a = true;
  
  public static Drawable a(Context paramContext, int paramInt, Resources.Theme paramTheme) {
    return c(paramContext, paramContext, paramInt, paramTheme);
  }
  
  public static Drawable b(Context paramContext1, Context paramContext2, int paramInt) {
    return c(paramContext1, paramContext2, paramInt, null);
  }
  
  private static Drawable c(Context paramContext1, Context paramContext2, int paramInt, Resources.Theme paramTheme) {
    Resources.Theme theme;
    try {
      if (a)
        return e(paramContext2, paramInt, paramTheme); 
    } catch (NoClassDefFoundError noClassDefFoundError) {
      a = false;
    } catch (IllegalStateException illegalStateException) {
      if (!noClassDefFoundError.getPackageName().equals(paramContext2.getPackageName()))
        return androidx.core.content.a.f(paramContext2, paramInt); 
      throw illegalStateException;
    } catch (android.content.res.Resources.NotFoundException notFoundException) {}
    if (illegalStateException == null)
      theme = paramContext2.getTheme(); 
    return d(paramContext2, paramInt, theme);
  }
  
  private static Drawable d(Context paramContext, int paramInt, Resources.Theme paramTheme) {
    return f.a(paramContext.getResources(), paramInt, paramTheme);
  }
  
  private static Drawable e(Context paramContext, int paramInt, Resources.Theme paramTheme) {
    d d;
    Context context = paramContext;
    if (paramTheme != null)
      d = new d(paramContext, paramTheme); 
    return b.a.k.a.a.d((Context)d, paramInt);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */