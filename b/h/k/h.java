package b.h.k;

import android.os.Build;
import android.view.ViewGroup;

public final class h {
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    return (Build.VERSION.SDK_INT >= 17) ? paramMarginLayoutParams.getMarginEnd() : paramMarginLayoutParams.rightMargin;
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    return (Build.VERSION.SDK_INT >= 17) ? paramMarginLayoutParams.getMarginStart() : paramMarginLayoutParams.leftMargin;
  }
  
  public static void c(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt) {
    if (Build.VERSION.SDK_INT >= 17) {
      paramMarginLayoutParams.setMarginEnd(paramInt);
    } else {
      paramMarginLayoutParams.rightMargin = paramInt;
    } 
  }
  
  public static void d(ViewGroup.MarginLayoutParams paramMarginLayoutParams, int paramInt) {
    if (Build.VERSION.SDK_INT >= 17) {
      paramMarginLayoutParams.setMarginStart(paramInt);
    } else {
      paramMarginLayoutParams.leftMargin = paramInt;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */