package b.h.k;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class z {
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    StringBuilder stringBuilder;
    if (Build.VERSION.SDK_INT >= 21) {
      try {
        return paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
      } catch (AbstractMethodError abstractMethodError) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("ViewParent ");
        stringBuilder.append(paramViewParent);
        stringBuilder.append(" does not implement interface method onNestedFling");
        Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
      } 
    } else if (paramViewParent instanceof o) {
      return ((o)paramViewParent).onNestedFling((View)stringBuilder, paramFloat1, paramFloat2, paramBoolean);
    } 
    return false;
  }
  
  public static boolean b(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2) {
    StringBuilder stringBuilder;
    if (Build.VERSION.SDK_INT >= 21) {
      try {
        return paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
      } catch (AbstractMethodError abstractMethodError) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("ViewParent ");
        stringBuilder.append(paramViewParent);
        stringBuilder.append(" does not implement interface method onNestedPreFling");
        Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
      } 
    } else if (paramViewParent instanceof o) {
      return ((o)paramViewParent).onNestedPreFling((View)stringBuilder, paramFloat1, paramFloat2);
    } 
    return false;
  }
  
  public static void c(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    if (paramViewParent instanceof m) {
      ((m)paramViewParent).m(paramView, paramInt1, paramInt2, paramArrayOfint, paramInt3);
    } else if (paramInt3 == 0) {
      StringBuilder stringBuilder;
      if (Build.VERSION.SDK_INT >= 21) {
        try {
          paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfint);
        } catch (AbstractMethodError abstractMethodError) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("ViewParent ");
          stringBuilder.append(paramViewParent);
          stringBuilder.append(" does not implement interface method onNestedPreScroll");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } else if (paramViewParent instanceof o) {
        ((o)paramViewParent).onNestedPreScroll((View)stringBuilder, paramInt1, paramInt2, (int[])abstractMethodError);
      } 
    } 
  }
  
  public static void d(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfint) {
    if (paramViewParent instanceof n) {
      ((n)paramViewParent).h(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfint);
    } else {
      paramArrayOfint[0] = paramArrayOfint[0] + paramInt3;
      paramArrayOfint[1] = paramArrayOfint[1] + paramInt4;
      if (paramViewParent instanceof m) {
        ((m)paramViewParent).i(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      } else if (paramInt5 == 0) {
        StringBuilder stringBuilder;
        if (Build.VERSION.SDK_INT >= 21) {
          try {
            paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
          } catch (AbstractMethodError abstractMethodError) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(paramViewParent);
            stringBuilder.append(" does not implement interface method onNestedScroll");
            Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
          } 
        } else if (paramViewParent instanceof o) {
          ((o)paramViewParent).onNestedScroll((View)stringBuilder, paramInt1, paramInt2, paramInt3, paramInt4);
        } 
      } 
    } 
  }
  
  public static void e(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2) {
    if (paramViewParent instanceof m) {
      ((m)paramViewParent).k(paramView1, paramView2, paramInt1, paramInt2);
    } else if (paramInt2 == 0) {
      StringBuilder stringBuilder;
      if (Build.VERSION.SDK_INT >= 21) {
        try {
          paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt1);
        } catch (AbstractMethodError abstractMethodError) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("ViewParent ");
          stringBuilder.append(paramViewParent);
          stringBuilder.append(" does not implement interface method onNestedScrollAccepted");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } else if (paramViewParent instanceof o) {
        ((o)paramViewParent).onNestedScrollAccepted((View)abstractMethodError, (View)stringBuilder, paramInt1);
      } 
    } 
  }
  
  public static boolean f(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt1, int paramInt2) {
    if (paramViewParent instanceof m)
      return ((m)paramViewParent).j(paramView1, paramView2, paramInt1, paramInt2); 
    if (paramInt2 == 0) {
      StringBuilder stringBuilder;
      if (Build.VERSION.SDK_INT >= 21) {
        try {
          return paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt1);
        } catch (AbstractMethodError abstractMethodError) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("ViewParent ");
          stringBuilder.append(paramViewParent);
          stringBuilder.append(" does not implement interface method onStartNestedScroll");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } else if (paramViewParent instanceof o) {
        return ((o)paramViewParent).onStartNestedScroll((View)abstractMethodError, (View)stringBuilder, paramInt1);
      } 
    } 
    return false;
  }
  
  public static void g(ViewParent paramViewParent, View paramView, int paramInt) {
    if (paramViewParent instanceof m) {
      ((m)paramViewParent).l(paramView, paramInt);
    } else if (paramInt == 0) {
      if (Build.VERSION.SDK_INT >= 21) {
        try {
          paramViewParent.onStopNestedScroll(paramView);
        } catch (AbstractMethodError abstractMethodError) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("ViewParent ");
          stringBuilder.append(paramViewParent);
          stringBuilder.append(" does not implement interface method onStopNestedScroll");
          Log.e("ViewParentCompat", stringBuilder.toString(), abstractMethodError);
        } 
      } else if (paramViewParent instanceof o) {
        ((o)paramViewParent).onStopNestedScroll((View)abstractMethodError);
      } 
    } 
  }
  
  @Deprecated
  public static boolean h(ViewParent paramViewParent, View paramView, AccessibilityEvent paramAccessibilityEvent) {
    return paramViewParent.requestSendAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/k/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */