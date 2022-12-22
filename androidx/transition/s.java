package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

public class s extends q0 {
  private float b = 3.0F;
  
  private int c = 80;
  
  private int h(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : I
    //   4: istore #10
    //   6: iconst_0
    //   7: istore #11
    //   9: iconst_1
    //   10: istore #12
    //   12: iconst_1
    //   13: istore #13
    //   15: iload #10
    //   17: ldc 8388611
    //   19: if_icmpne -> 53
    //   22: aload_1
    //   23: invokestatic C : (Landroid/view/View;)I
    //   26: iconst_1
    //   27: if_icmpne -> 33
    //   30: goto -> 36
    //   33: iconst_0
    //   34: istore #13
    //   36: iload #13
    //   38: ifeq -> 47
    //   41: iconst_5
    //   42: istore #13
    //   44: goto -> 90
    //   47: iconst_3
    //   48: istore #13
    //   50: goto -> 90
    //   53: iload #10
    //   55: istore #13
    //   57: iload #10
    //   59: ldc 8388613
    //   61: if_icmpne -> 90
    //   64: aload_1
    //   65: invokestatic C : (Landroid/view/View;)I
    //   68: iconst_1
    //   69: if_icmpne -> 79
    //   72: iload #12
    //   74: istore #13
    //   76: goto -> 82
    //   79: iconst_0
    //   80: istore #13
    //   82: iload #13
    //   84: ifeq -> 41
    //   87: goto -> 47
    //   90: iload #13
    //   92: iconst_3
    //   93: if_icmpeq -> 170
    //   96: iload #13
    //   98: iconst_5
    //   99: if_icmpeq -> 154
    //   102: iload #13
    //   104: bipush #48
    //   106: if_icmpeq -> 138
    //   109: iload #13
    //   111: bipush #80
    //   113: if_icmpeq -> 122
    //   116: iload #11
    //   118: istore_2
    //   119: goto -> 183
    //   122: iload_3
    //   123: iload #7
    //   125: isub
    //   126: iload #4
    //   128: iload_2
    //   129: isub
    //   130: invokestatic abs : (I)I
    //   133: iadd
    //   134: istore_2
    //   135: goto -> 183
    //   138: iload #9
    //   140: iload_3
    //   141: isub
    //   142: iload #4
    //   144: iload_2
    //   145: isub
    //   146: invokestatic abs : (I)I
    //   149: iadd
    //   150: istore_2
    //   151: goto -> 183
    //   154: iload_2
    //   155: iload #6
    //   157: isub
    //   158: iload #5
    //   160: iload_3
    //   161: isub
    //   162: invokestatic abs : (I)I
    //   165: iadd
    //   166: istore_2
    //   167: goto -> 183
    //   170: iload #8
    //   172: iload_2
    //   173: isub
    //   174: iload #5
    //   176: iload_3
    //   177: isub
    //   178: invokestatic abs : (I)I
    //   181: iadd
    //   182: istore_2
    //   183: iload_2
    //   184: ireturn
  }
  
  private int i(ViewGroup paramViewGroup) {
    int i = this.c;
    return (i != 3 && i != 5 && i != 8388611 && i != 8388613) ? paramViewGroup.getHeight() : paramViewGroup.getWidth();
  }
  
  public long c(ViewGroup paramViewGroup, Transition paramTransition, y paramy1, y paramy2) {
    boolean bool;
    int i2;
    int i3;
    if (paramy1 == null && paramy2 == null)
      return 0L; 
    Rect rect = paramTransition.z();
    if (paramy2 == null || e(paramy1) == 0) {
      bool = true;
    } else {
      paramy1 = paramy2;
      bool = true;
    } 
    int i = f(paramy1);
    int j = g(paramy1);
    int[] arrayOfInt = new int[2];
    paramViewGroup.getLocationOnScreen(arrayOfInt);
    int k = arrayOfInt[0] + Math.round(paramViewGroup.getTranslationX());
    int m = arrayOfInt[1] + Math.round(paramViewGroup.getTranslationY());
    int n = k + paramViewGroup.getWidth();
    int i1 = m + paramViewGroup.getHeight();
    if (rect != null) {
      i2 = rect.centerX();
      i3 = rect.centerY();
    } else {
      i2 = (k + n) / 2;
      i3 = (m + i1) / 2;
    } 
    float f = h((View)paramViewGroup, i, j, i2, i3, k, m, n, i1) / i(paramViewGroup);
    long l1 = paramTransition.y();
    long l2 = l1;
    if (l1 < 0L)
      l2 = 300L; 
    return Math.round((float)(l2 * bool) / this.b * f);
  }
  
  public void j(int paramInt) {
    this.c = paramInt;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */