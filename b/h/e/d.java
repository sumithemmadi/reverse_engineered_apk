package b.h.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.d.c;
import androidx.core.content.d.f;
import b.e.e;
import b.h.h.f;

@SuppressLint({"NewApi"})
public class d {
  private static final j a;
  
  private static final e<String, Typeface> b = new e(16);
  
  public static Typeface a(Context paramContext, Typeface paramTypeface, int paramInt) {
    if (paramContext != null) {
      if (Build.VERSION.SDK_INT < 21) {
        Typeface typeface = g(paramContext, paramTypeface, paramInt);
        if (typeface != null)
          return typeface; 
      } 
      return Typeface.create(paramTypeface, paramInt);
    } 
    throw new IllegalArgumentException("Context cannot be null");
  }
  
  public static Typeface b(Context paramContext, CancellationSignal paramCancellationSignal, f.b[] paramArrayOfb, int paramInt) {
    return a.c(paramContext, paramCancellationSignal, paramArrayOfb, paramInt);
  }
  
  public static Typeface c(Context paramContext, c.a parama, Resources paramResources, int paramInt1, int paramInt2, f.a parama1, Handler paramHandler, boolean paramBoolean) {
    Typeface typeface;
    c.d d1;
    a a1;
    if (parama instanceof c.d) {
      boolean bool;
      byte b;
      d1 = (c.d)parama;
      Typeface typeface1 = h(d1.c());
      if (typeface1 != null) {
        if (parama1 != null)
          parama1.b(typeface1, paramHandler); 
        return typeface1;
      } 
      if (paramBoolean ? (d1.a() == 0) : (parama1 == null)) {
        bool = true;
      } else {
        bool = false;
      } 
      if (paramBoolean) {
        b = d1.d();
      } else {
        b = -1;
      } 
      paramHandler = f.a.c(paramHandler);
      a1 = new a(parama1);
      typeface = f.a(paramContext, d1.b(), paramInt2, bool, b, paramHandler, a1);
    } else {
      Typeface typeface1 = a.b((Context)typeface, (c.b)d1, paramResources, paramInt2);
      typeface = typeface1;
      if (a1 != null)
        if (typeface1 != null) {
          a1.b(typeface1, paramHandler);
          typeface = typeface1;
        } else {
          a1.a(-3, paramHandler);
          typeface = typeface1;
        }  
    } 
    if (typeface != null)
      b.d(e(paramResources, paramInt1, paramInt2), typeface); 
    return typeface;
  }
  
  public static Typeface d(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    Typeface typeface = a.e(paramContext, paramResources, paramInt1, paramString, paramInt2);
    if (typeface != null) {
      String str = e(paramResources, paramInt1, paramInt2);
      b.d(str, typeface);
    } 
    return typeface;
  }
  
  private static String e(Resources paramResources, int paramInt1, int paramInt2) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramResources.getResourcePackageName(paramInt1));
    stringBuilder.append("-");
    stringBuilder.append(paramInt1);
    stringBuilder.append("-");
    stringBuilder.append(paramInt2);
    return stringBuilder.toString();
  }
  
  public static Typeface f(Resources paramResources, int paramInt1, int paramInt2) {
    return (Typeface)b.c(e(paramResources, paramInt1, paramInt2));
  }
  
  private static Typeface g(Context paramContext, Typeface paramTypeface, int paramInt) {
    j j1 = a;
    c.b b = j1.i(paramTypeface);
    return (b == null) ? null : j1.b(paramContext, b, paramContext.getResources(), paramInt);
  }
  
  private static Typeface h(String paramString) {
    Typeface typeface1 = null;
    Typeface typeface2 = typeface1;
    if (paramString != null)
      if (paramString.isEmpty()) {
        typeface2 = typeface1;
      } else {
        Typeface typeface3 = Typeface.create(paramString, 0);
        Typeface typeface4 = Typeface.create(Typeface.DEFAULT, 0);
        typeface2 = typeface1;
        if (typeface3 != null) {
          typeface2 = typeface1;
          if (!typeface3.equals(typeface4))
            typeface2 = typeface3; 
        } 
      }  
    return typeface2;
  }
  
  static {
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      a = new i();
    } else if (i >= 28) {
      a = new h();
    } else if (i >= 26) {
      a = new g();
    } else if (i >= 24 && f.m()) {
      a = new f();
    } else if (i >= 21) {
      a = new e();
    } else {
      a = new j();
    } 
  }
  
  public static class a extends f.c {
    private f.a a;
    
    public a(f.a param1a) {
      this.a = param1a;
    }
    
    public void a(int param1Int) {
      f.a a1 = this.a;
      if (a1 != null)
        a1.d(param1Int); 
    }
    
    public void b(Typeface param1Typeface) {
      f.a a1 = this.a;
      if (a1 != null)
        a1.e(param1Typeface); 
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */