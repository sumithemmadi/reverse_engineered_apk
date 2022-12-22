package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.o;

@TargetApi(19)
public final class am0 {
  private Context a;
  
  private PopupWindow b;
  
  private static PopupWindow c(Context paramContext, View paramView) {
    Window window;
    if (paramContext instanceof Activity) {
      window = ((Activity)paramContext).getWindow();
    } else {
      window = null;
    } 
    if (window != null && window.getDecorView() != null) {
      if (((Activity)paramContext).isDestroyed())
        return null; 
      FrameLayout frameLayout = new FrameLayout(paramContext);
      frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      frameLayout.addView(paramView, -1, -1);
      PopupWindow popupWindow = new PopupWindow((View)frameLayout, 1, 1, false);
      popupWindow.setOutsideTouchable(true);
      popupWindow.setClippingEnabled(false);
      cm.e("Displaying the 1x1 popup off the screen.");
      try {
        popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
        return popupWindow;
      } catch (Exception exception) {}
    } 
    return null;
  }
  
  public final void a() {
    Context context = this.a;
    if (context != null && this.b != null) {
      if (context instanceof Activity && ((Activity)context).isDestroyed()) {
        this.a = null;
        this.b = null;
        return;
      } 
      if (this.b.isShowing())
        this.b.dismiss(); 
      this.a = null;
      this.b = null;
    } 
  }
  
  public final void b(Context paramContext, View paramView) {
    if (o.f() && !o.h()) {
      PopupWindow popupWindow = c(paramContext, paramView);
      this.b = popupWindow;
      if (popupWindow == null)
        paramContext = null; 
      this.a = paramContext;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/am0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */