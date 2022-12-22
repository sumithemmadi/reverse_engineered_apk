package b.a.o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import b.a.b;
import b.a.d;
import b.a.j;

public class a {
  private Context a;
  
  private a(Context paramContext) {
    this.a = paramContext;
  }
  
  public static a b(Context paramContext) {
    return new a(paramContext);
  }
  
  public boolean a() {
    boolean bool;
    if ((this.a.getApplicationInfo()).targetSdkVersion < 14) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public int c() {
    return (this.a.getResources().getDisplayMetrics()).widthPixels / 2;
  }
  
  public int d() {
    Configuration configuration = this.a.getResources().getConfiguration();
    int i = configuration.screenWidthDp;
    int j = configuration.screenHeightDp;
    return (configuration.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && j > 720) || (i > 720 && j > 960)) ? 5 : ((i >= 500 || (i > 640 && j > 480) || (i > 480 && j > 640)) ? 4 : ((i >= 360) ? 3 : 2));
  }
  
  public int e() {
    return this.a.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
  }
  
  public int f() {
    TypedArray typedArray = this.a.obtainStyledAttributes(null, j.ActionBar, b.a.a.actionBarStyle, 0);
    int i = typedArray.getLayoutDimension(j.ActionBar_height, 0);
    Resources resources = this.a.getResources();
    int j = i;
    if (!g())
      j = Math.min(i, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height)); 
    typedArray.recycle();
    return j;
  }
  
  public boolean g() {
    return this.a.getResources().getBoolean(b.abc_action_bar_embed_tabs);
  }
  
  public boolean h() {
    return (Build.VERSION.SDK_INT >= 19) ? true : (ViewConfiguration.get(this.a).hasPermanentMenuKey() ^ true);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */