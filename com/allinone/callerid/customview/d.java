package com.allinone.callerid.customview;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;

public class d {
  private static d a;
  
  private SpeakerTiplView b;
  
  public static d b() {
    if (a == null)
      a = new d(); 
    return a;
  }
  
  public void a(Context paramContext) {
    try {
      if (this.b == null) {
        SpeakerTiplView speakerTiplView = new SpeakerTiplView();
        this(paramContext);
        this.b = speakerTiplView;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void c(Context paramContext) {
    try {
      if (this.b != null) {
        ((WindowManager)paramContext.getSystemService("window")).removeView((View)this.b);
        this.b = null;
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/customview/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */