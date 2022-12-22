package b.j.a;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class b {
  private static boolean a(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3) {
    boolean bool1 = b(paramInt, paramRect1, paramRect2);
    boolean bool2 = b(paramInt, paramRect1, paramRect3);
    boolean bool = false;
    if (bool2 || !bool1)
      return false; 
    if (!j(paramInt, paramRect1, paramRect3))
      return true; 
    if (paramInt == 17 || paramInt == 66)
      return true; 
    if (k(paramInt, paramRect1, paramRect2) < m(paramInt, paramRect1, paramRect3))
      bool = true; 
    return bool;
  }
  
  private static boolean b(int paramInt, Rect paramRect1, Rect paramRect2) {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_1
    //   3: istore #4
    //   5: iload_0
    //   6: bipush #17
    //   8: if_icmpeq -> 74
    //   11: iload_0
    //   12: bipush #33
    //   14: if_icmpeq -> 43
    //   17: iload_0
    //   18: bipush #66
    //   20: if_icmpeq -> 74
    //   23: iload_0
    //   24: sipush #130
    //   27: if_icmpne -> 33
    //   30: goto -> 43
    //   33: new java/lang/IllegalArgumentException
    //   36: dup
    //   37: ldc 'direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.'
    //   39: invokespecial <init> : (Ljava/lang/String;)V
    //   42: athrow
    //   43: aload_2
    //   44: getfield right : I
    //   47: aload_1
    //   48: getfield left : I
    //   51: if_icmplt -> 68
    //   54: aload_2
    //   55: getfield left : I
    //   58: aload_1
    //   59: getfield right : I
    //   62: if_icmpgt -> 68
    //   65: goto -> 71
    //   68: iconst_0
    //   69: istore #4
    //   71: iload #4
    //   73: ireturn
    //   74: aload_2
    //   75: getfield bottom : I
    //   78: aload_1
    //   79: getfield top : I
    //   82: if_icmplt -> 102
    //   85: aload_2
    //   86: getfield top : I
    //   89: aload_1
    //   90: getfield bottom : I
    //   93: if_icmpgt -> 102
    //   96: iload_3
    //   97: istore #4
    //   99: goto -> 105
    //   102: iconst_0
    //   103: istore #4
    //   105: iload #4
    //   107: ireturn
  }
  
  public static <L, T> T c(L paramL, b<L, T> paramb, a<T> parama, T paramT, Rect paramRect, int paramInt) {
    T t;
    Rect rect1 = new Rect(paramRect);
    byte b1 = 0;
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            rect1.offset(0, -(paramRect.height() + 1));
          } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
          } 
        } else {
          rect1.offset(-(paramRect.width() + 1), 0);
        } 
      } else {
        rect1.offset(0, paramRect.height() + 1);
      } 
    } else {
      rect1.offset(paramRect.width() + 1, 0);
    } 
    Object object = null;
    int i = paramb.b(paramL);
    Rect rect2 = new Rect();
    while (b1 < i) {
      T t1 = paramb.a(paramL, b1);
      if (t1 != paramT) {
        parama.a(t1, rect2);
        if (h(paramInt, paramRect, rect2, rect1)) {
          rect1.set(rect2);
          t = t1;
        } 
      } 
      b1++;
    } 
    return t;
  }
  
  public static <L, T> T d(L paramL, b<L, T> paramb, a<T> parama, T paramT, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    int i = paramb.b(paramL);
    ArrayList<?> arrayList = new ArrayList(i);
    for (byte b1 = 0; b1 < i; b1++)
      arrayList.add(paramb.a(paramL, b1)); 
    Collections.sort(arrayList, new c(paramBoolean1, parama));
    if (paramInt != 1) {
      if (paramInt == 2)
        return e(paramT, (ArrayList)arrayList, paramBoolean2); 
      throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    } 
    return f(paramT, (ArrayList)arrayList, paramBoolean2);
  }
  
  private static <T> T e(T paramT, ArrayList<T> paramArrayList, boolean paramBoolean) {
    int j;
    int i = paramArrayList.size();
    if (paramT == null) {
      j = -1;
    } else {
      j = paramArrayList.lastIndexOf(paramT);
    } 
    return (++j < i) ? paramArrayList.get(j) : ((paramBoolean && i > 0) ? paramArrayList.get(0) : null);
  }
  
  private static <T> T f(T paramT, ArrayList<T> paramArrayList, boolean paramBoolean) {
    int j;
    int i = paramArrayList.size();
    if (paramT == null) {
      j = i;
    } else {
      j = paramArrayList.indexOf(paramT);
    } 
    return (--j >= 0) ? paramArrayList.get(j) : ((paramBoolean && i > 0) ? paramArrayList.get(i - 1) : null);
  }
  
  private static int g(int paramInt1, int paramInt2) {
    return paramInt1 * 13 * paramInt1 + paramInt2 * paramInt2;
  }
  
  private static boolean h(int paramInt, Rect paramRect1, Rect paramRect2, Rect paramRect3) {
    boolean bool = i(paramRect1, paramRect2, paramInt);
    boolean bool1 = false;
    if (!bool)
      return false; 
    if (!i(paramRect1, paramRect3, paramInt))
      return true; 
    if (a(paramInt, paramRect1, paramRect2, paramRect3))
      return true; 
    if (a(paramInt, paramRect1, paramRect3, paramRect2))
      return false; 
    if (g(k(paramInt, paramRect1, paramRect2), o(paramInt, paramRect1, paramRect2)) < g(k(paramInt, paramRect1, paramRect3), o(paramInt, paramRect1, paramRect3)))
      bool1 = true; 
    return bool1;
  }
  
  private static boolean i(Rect paramRect1, Rect paramRect2, int paramInt) {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect1.top;
            int m = paramRect2.top;
            if ((paramInt >= m && paramRect1.bottom > m) || paramRect1.bottom >= paramRect2.bottom)
              bool4 = false; 
            return bool4;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        int k = paramRect1.left;
        paramInt = paramRect2.left;
        if ((k < paramInt || paramRect1.right <= paramInt) && paramRect1.right < paramRect2.right) {
          bool4 = bool1;
        } else {
          bool4 = false;
        } 
        return bool4;
      } 
      int j = paramRect1.bottom;
      paramInt = paramRect2.bottom;
      if ((j > paramInt || paramRect1.top >= paramInt) && paramRect1.top > paramRect2.top) {
        bool4 = bool2;
      } else {
        bool4 = false;
      } 
      return bool4;
    } 
    paramInt = paramRect1.right;
    int i = paramRect2.right;
    if ((paramInt > i || paramRect1.left >= i) && paramRect1.left > paramRect2.left) {
      bool4 = bool3;
    } else {
      bool4 = false;
    } 
    return bool4;
  }
  
  private static boolean j(int paramInt, Rect paramRect1, Rect paramRect2) {
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            if (paramRect1.bottom > paramRect2.top)
              bool4 = false; 
            return bool4;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        if (paramRect1.right <= paramRect2.left) {
          bool4 = bool1;
        } else {
          bool4 = false;
        } 
        return bool4;
      } 
      if (paramRect1.top >= paramRect2.bottom) {
        bool4 = bool2;
      } else {
        bool4 = false;
      } 
      return bool4;
    } 
    if (paramRect1.left >= paramRect2.right) {
      bool4 = bool3;
    } else {
      bool4 = false;
    } 
    return bool4;
  }
  
  private static int k(int paramInt, Rect paramRect1, Rect paramRect2) {
    return Math.max(0, l(paramInt, paramRect1, paramRect2));
  }
  
  private static int l(int paramInt, Rect paramRect1, Rect paramRect2) {
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect2.top;
            int m = paramRect1.bottom;
            return paramInt - m;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        paramInt = paramRect2.left;
        int k = paramRect1.right;
        return paramInt - k;
      } 
      paramInt = paramRect1.top;
      int j = paramRect2.bottom;
      return paramInt - j;
    } 
    paramInt = paramRect1.left;
    int i = paramRect2.right;
    return paramInt - i;
  }
  
  private static int m(int paramInt, Rect paramRect1, Rect paramRect2) {
    return Math.max(1, n(paramInt, paramRect1, paramRect2));
  }
  
  private static int n(int paramInt, Rect paramRect1, Rect paramRect2) {
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramInt = paramRect2.bottom;
            int m = paramRect1.bottom;
            return paramInt - m;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        paramInt = paramRect2.right;
        int k = paramRect1.right;
        return paramInt - k;
      } 
      paramInt = paramRect1.top;
      int j = paramRect2.top;
      return paramInt - j;
    } 
    paramInt = paramRect1.left;
    int i = paramRect2.left;
    return paramInt - i;
  }
  
  private static int o(int paramInt, Rect paramRect1, Rect paramRect2) {
    if (paramInt != 17)
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt != 130)
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."); 
          return Math.abs(paramRect1.left + paramRect1.width() / 2 - paramRect2.left + paramRect2.width() / 2);
        } 
      } else {
        return Math.abs(paramRect1.left + paramRect1.width() / 2 - paramRect2.left + paramRect2.width() / 2);
      }  
    return Math.abs(paramRect1.top + paramRect1.height() / 2 - paramRect2.top + paramRect2.height() / 2);
  }
  
  public static interface a<T> {
    void a(T param1T, Rect param1Rect);
  }
  
  public static interface b<T, V> {
    V a(T param1T, int param1Int);
    
    int b(T param1T);
  }
  
  private static class c<T> implements Comparator<T> {
    private final Rect b = new Rect();
    
    private final Rect c = new Rect();
    
    private final boolean d;
    
    private final b.a<T> e;
    
    c(boolean param1Boolean, b.a<T> param1a) {
      this.d = param1Boolean;
      this.e = param1a;
    }
    
    public int compare(T param1T1, T param1T2) {
      Rect rect1 = this.b;
      Rect rect2 = this.c;
      this.e.a(param1T1, rect1);
      this.e.a(param1T2, rect2);
      int i = rect1.top;
      int j = rect2.top;
      byte b = -1;
      if (i < j)
        return -1; 
      if (i > j)
        return 1; 
      j = rect1.left;
      i = rect2.left;
      if (j < i) {
        if (this.d)
          b = 1; 
        return b;
      } 
      if (j > i) {
        if (!this.d)
          b = 1; 
        return b;
      } 
      j = rect1.bottom;
      i = rect2.bottom;
      if (j < i)
        return -1; 
      if (j > i)
        return 1; 
      j = rect1.right;
      i = rect2.right;
      if (j < i) {
        if (this.d)
          b = 1; 
        return b;
      } 
      if (j > i) {
        if (!this.d)
          b = 1; 
        return b;
      } 
      return 0;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/j/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */