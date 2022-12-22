package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import java.util.Comparator;

final class a {
  private static final ViewGroup.MarginLayoutParams a;
  
  private LinearLayoutManager b;
  
  static {
    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
    a = marginLayoutParams;
    marginLayoutParams.setMargins(0, 0, 0, 0);
  }
  
  a(LinearLayoutManager paramLinearLayoutManager) {
    this.b = paramLinearLayoutManager;
  }
  
  private boolean a() {
    int i = this.b.J();
    if (i == 0)
      return true; 
    if (this.b.m2() == 0) {
      j = 1;
    } else {
      j = 0;
    } 
    int[][] arrayOfInt = new int[i][2];
    int k = 0;
    while (k < i) {
      View view = this.b.I(k);
      if (view != null) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int m;
        int n;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
          marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
        } else {
          marginLayoutParams = a;
        } 
        int[] arrayOfInt1 = arrayOfInt[k];
        if (j) {
          m = view.getLeft();
          n = marginLayoutParams.leftMargin;
        } else {
          m = view.getTop();
          n = marginLayoutParams.topMargin;
        } 
        arrayOfInt1[0] = m - n;
        arrayOfInt1 = arrayOfInt[k];
        if (j) {
          m = view.getRight();
          n = marginLayoutParams.rightMargin;
        } else {
          m = view.getBottom();
          n = marginLayoutParams.bottomMargin;
        } 
        arrayOfInt1[1] = m + n;
        k++;
        continue;
      } 
      throw new IllegalStateException("null view contained in the view hierarchy");
    } 
    Arrays.sort(arrayOfInt, new a(this));
    int j;
    for (j = 1; j < i; j++) {
      if (arrayOfInt[j - 1][1] != arrayOfInt[j][0])
        return false; 
    } 
    j = arrayOfInt[0][1];
    k = arrayOfInt[0][0];
    return !(arrayOfInt[0][0] > 0 || arrayOfInt[i - 1][1] < j - k);
  }
  
  private boolean b() {
    int i = this.b.J();
    for (byte b = 0; b < i; b++) {
      if (c(this.b.I(b)))
        return true; 
    } 
    return false;
  }
  
  private static boolean c(View paramView) {
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
      if (layoutTransition != null && layoutTransition.isChangingLayout())
        return true; 
      int i = viewGroup.getChildCount();
      for (byte b = 0; b < i; b++) {
        if (c(viewGroup.getChildAt(b)))
          return true; 
      } 
    } 
    return false;
  }
  
  boolean d() {
    boolean bool = a();
    boolean bool1 = true;
    if ((bool && this.b.J() > 1) || !b())
      bool1 = false; 
    return bool1;
  }
  
  class a implements Comparator<int[]> {
    a(a this$0) {}
    
    public int a(int[] param1ArrayOfint1, int[] param1ArrayOfint2) {
      return param1ArrayOfint1[0] - param1ArrayOfint2[0];
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/viewpager2/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */