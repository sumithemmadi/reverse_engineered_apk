package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class b0 extends ContextWrapper {
  private static final Object a = new Object();
  
  private static ArrayList<WeakReference<b0>> b;
  
  private final Resources c;
  
  private final Resources.Theme d;
  
  private b0(Context paramContext) {
    super(paramContext);
    if (j0.b()) {
      j0 j0 = new j0((Context)this, paramContext.getResources());
      this.c = j0;
      Resources.Theme theme = j0.newTheme();
      this.d = theme;
      theme.setTo(paramContext.getTheme());
    } else {
      this.c = new d0((Context)this, paramContext.getResources());
      this.d = null;
    } 
  }
  
  private static boolean a(Context paramContext) {
    boolean bool = paramContext instanceof b0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (!bool) {
      bool2 = bool1;
      if (!(paramContext.getResources() instanceof d0))
        if (paramContext.getResources() instanceof j0) {
          bool2 = bool1;
        } else {
          if (Build.VERSION.SDK_INT >= 21) {
            bool2 = bool1;
            if (j0.b())
              bool2 = true; 
            return bool2;
          } 
          bool2 = true;
        }  
    } 
    return bool2;
  }
  
  public static Context b(Context paramContext) {
    if (a(paramContext))
      synchronized (a) {
        ArrayList<WeakReference<b0>> arrayList2 = b;
        if (arrayList2 == null) {
          arrayList2 = new ArrayList<WeakReference<b0>>();
          this();
          b = arrayList2;
        } else {
          int i;
          for (i = arrayList2.size() - 1; i >= 0; i--) {
            WeakReference weakReference1 = b.get(i);
            if (weakReference1 == null || weakReference1.get() == null)
              b.remove(i); 
          } 
          for (i = b.size() - 1; i >= 0; i--) {
            WeakReference<b0> weakReference1 = b.get(i);
            if (weakReference1 != null) {
              b0 b02 = weakReference1.get();
            } else {
              weakReference1 = null;
            } 
            if (weakReference1 != null && weakReference1.getBaseContext() == paramContext)
              return (Context)weakReference1; 
          } 
        } 
        b0 b01 = new b0();
        this(paramContext);
        ArrayList<WeakReference<b0>> arrayList1 = b;
        WeakReference<b0> weakReference = new WeakReference();
        this((T)b01);
        arrayList1.add(weakReference);
        return (Context)b01;
      }  
    return paramContext;
  }
  
  public AssetManager getAssets() {
    return this.c.getAssets();
  }
  
  public Resources getResources() {
    return this.c;
  }
  
  public Resources.Theme getTheme() {
    Resources.Theme theme1 = this.d;
    Resources.Theme theme2 = theme1;
    if (theme1 == null)
      theme2 = super.getTheme(); 
    return theme2;
  }
  
  public void setTheme(int paramInt) {
    Resources.Theme theme = this.d;
    if (theme == null) {
      super.setTheme(paramInt);
    } else {
      theme.applyStyle(paramInt, true);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */