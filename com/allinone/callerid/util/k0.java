package com.allinone.callerid.util;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import com.allinone.callerid.customview.FloatNormalView;

public class k0 {
  private static k0 a;
  
  private FloatNormalView b;
  
  public static k0 b() {
    if (a == null)
      a = new k0(); 
    return a;
  }
  
  public void a(Context paramContext) {
    Log.e("selfstarting", "创建小型悬浮窗啦");
    if (this.b == null)
      this.b = new FloatNormalView(paramContext); 
  }
  
  public void c(Context paramContext) {
    if (this.b != null) {
      ((WindowManager)paramContext.getSystemService("window")).removeView((View)this.b);
      this.b = null;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */