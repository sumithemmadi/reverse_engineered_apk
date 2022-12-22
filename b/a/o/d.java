package b.a.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import b.a.i;

public class d extends ContextWrapper {
  private int a;
  
  private Resources.Theme b;
  
  private LayoutInflater c;
  
  private Configuration d;
  
  private Resources e;
  
  public d() {
    super(null);
  }
  
  public d(Context paramContext, int paramInt) {
    super(paramContext);
    this.a = paramInt;
  }
  
  public d(Context paramContext, Resources.Theme paramTheme) {
    super(paramContext);
    this.b = paramTheme;
  }
  
  private Resources b() {
    if (this.e == null) {
      Configuration configuration = this.d;
      if (configuration == null) {
        this.e = super.getResources();
      } else if (Build.VERSION.SDK_INT >= 17) {
        this.e = createConfigurationContext(configuration).getResources();
      } else {
        Resources resources = super.getResources();
        Configuration configuration1 = new Configuration(resources.getConfiguration());
        configuration1.updateFrom(this.d);
        this.e = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration1);
      } 
    } 
    return this.e;
  }
  
  private void d() {
    boolean bool;
    if (this.b == null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      this.b = getResources().newTheme();
      Resources.Theme theme = getBaseContext().getTheme();
      if (theme != null)
        this.b.setTo(theme); 
    } 
    e(this.b, this.a, bool);
  }
  
  public void a(Configuration paramConfiguration) {
    if (this.e == null) {
      if (this.d == null) {
        this.d = new Configuration(paramConfiguration);
        return;
      } 
      throw new IllegalStateException("Override configuration has already been set");
    } 
    throw new IllegalStateException("getResources() or getAssets() has already been called");
  }
  
  protected void attachBaseContext(Context paramContext) {
    super.attachBaseContext(paramContext);
  }
  
  public int c() {
    return this.a;
  }
  
  protected void e(Resources.Theme paramTheme, int paramInt, boolean paramBoolean) {
    paramTheme.applyStyle(paramInt, true);
  }
  
  public AssetManager getAssets() {
    return getResources().getAssets();
  }
  
  public Resources getResources() {
    return b();
  }
  
  public Object getSystemService(String paramString) {
    if ("layout_inflater".equals(paramString)) {
      if (this.c == null)
        this.c = LayoutInflater.from(getBaseContext()).cloneInContext((Context)this); 
      return this.c;
    } 
    return getBaseContext().getSystemService(paramString);
  }
  
  public Resources.Theme getTheme() {
    Resources.Theme theme = this.b;
    if (theme != null)
      return theme; 
    if (this.a == 0)
      this.a = i.Theme_AppCompat_Light; 
    d();
    return this.b;
  }
  
  public void setTheme(int paramInt) {
    if (this.a != paramInt) {
      this.a = paramInt;
      d();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */