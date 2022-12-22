package androidx.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class f0 {
  private static LayoutTransition a;
  
  private static Field b;
  
  private static boolean c;
  
  private static Method d;
  
  private static boolean e;
  
  private static void a(LayoutTransition paramLayoutTransition) {
    if (!e) {
      try {
        Method method1 = LayoutTransition.class.getDeclaredMethod("cancel", new Class[0]);
        d = method1;
        method1.setAccessible(true);
      } catch (NoSuchMethodException noSuchMethodException) {
        Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
      } 
      e = true;
    } 
    Method method = d;
    if (method != null)
      try {
        method.invoke(paramLayoutTransition, new Object[0]);
      } catch (IllegalAccessException illegalAccessException) {
        Log.i("ViewGroupUtilsApi14", "Failed to access cancel method by reflection");
      } catch (InvocationTargetException invocationTargetException) {
        Log.i("ViewGroupUtilsApi14", "Failed to invoke cancel method by reflection");
      }  
  }
  
  static void b(ViewGroup paramViewGroup, boolean paramBoolean) {
    // Byte code:
    //   0: getstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   3: astore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: iconst_0
    //   7: istore #4
    //   9: aload_2
    //   10: ifnonnull -> 63
    //   13: new androidx/transition/f0$a
    //   16: dup
    //   17: invokespecial <init> : ()V
    //   20: astore_2
    //   21: aload_2
    //   22: putstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   25: aload_2
    //   26: iconst_2
    //   27: aconst_null
    //   28: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   31: getstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   34: iconst_0
    //   35: aconst_null
    //   36: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   39: getstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   42: iconst_1
    //   43: aconst_null
    //   44: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   47: getstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   50: iconst_3
    //   51: aconst_null
    //   52: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   55: getstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   58: iconst_4
    //   59: aconst_null
    //   60: invokevirtual setAnimator : (ILandroid/animation/Animator;)V
    //   63: iload_1
    //   64: ifeq -> 112
    //   67: aload_0
    //   68: invokevirtual getLayoutTransition : ()Landroid/animation/LayoutTransition;
    //   71: astore_2
    //   72: aload_2
    //   73: ifnull -> 102
    //   76: aload_2
    //   77: invokevirtual isRunning : ()Z
    //   80: ifeq -> 87
    //   83: aload_2
    //   84: invokestatic a : (Landroid/animation/LayoutTransition;)V
    //   87: aload_2
    //   88: getstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   91: if_acmpeq -> 102
    //   94: aload_0
    //   95: getstatic androidx/transition/p.transition_layout_save : I
    //   98: aload_2
    //   99: invokevirtual setTag : (ILjava/lang/Object;)V
    //   102: aload_0
    //   103: getstatic androidx/transition/f0.a : Landroid/animation/LayoutTransition;
    //   106: invokevirtual setLayoutTransition : (Landroid/animation/LayoutTransition;)V
    //   109: goto -> 241
    //   112: aload_0
    //   113: aconst_null
    //   114: invokevirtual setLayoutTransition : (Landroid/animation/LayoutTransition;)V
    //   117: getstatic androidx/transition/f0.c : Z
    //   120: ifne -> 156
    //   123: ldc android/view/ViewGroup
    //   125: ldc 'mLayoutSuppressed'
    //   127: invokevirtual getDeclaredField : (Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   130: astore_2
    //   131: aload_2
    //   132: putstatic androidx/transition/f0.b : Ljava/lang/reflect/Field;
    //   135: aload_2
    //   136: iconst_1
    //   137: invokevirtual setAccessible : (Z)V
    //   140: goto -> 152
    //   143: astore_2
    //   144: ldc 'ViewGroupUtilsApi14'
    //   146: ldc 'Failed to access mLayoutSuppressed field by reflection'
    //   148: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   151: pop
    //   152: iconst_1
    //   153: putstatic androidx/transition/f0.c : Z
    //   156: getstatic androidx/transition/f0.b : Ljava/lang/reflect/Field;
    //   159: astore_2
    //   160: iload_3
    //   161: istore_1
    //   162: aload_2
    //   163: ifnull -> 202
    //   166: aload_2
    //   167: aload_0
    //   168: invokevirtual getBoolean : (Ljava/lang/Object;)Z
    //   171: istore_1
    //   172: iload_1
    //   173: ifeq -> 191
    //   176: getstatic androidx/transition/f0.b : Ljava/lang/reflect/Field;
    //   179: aload_0
    //   180: iconst_0
    //   181: invokevirtual setBoolean : (Ljava/lang/Object;Z)V
    //   184: goto -> 191
    //   187: astore_2
    //   188: goto -> 194
    //   191: goto -> 202
    //   194: ldc 'ViewGroupUtilsApi14'
    //   196: ldc 'Failed to get mLayoutSuppressed field by reflection'
    //   198: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   201: pop
    //   202: iload_1
    //   203: ifeq -> 210
    //   206: aload_0
    //   207: invokevirtual requestLayout : ()V
    //   210: getstatic androidx/transition/p.transition_layout_save : I
    //   213: istore #5
    //   215: aload_0
    //   216: iload #5
    //   218: invokevirtual getTag : (I)Ljava/lang/Object;
    //   221: checkcast android/animation/LayoutTransition
    //   224: astore_2
    //   225: aload_2
    //   226: ifnull -> 241
    //   229: aload_0
    //   230: iload #5
    //   232: aconst_null
    //   233: invokevirtual setTag : (ILjava/lang/Object;)V
    //   236: aload_0
    //   237: aload_2
    //   238: invokevirtual setLayoutTransition : (Landroid/animation/LayoutTransition;)V
    //   241: return
    //   242: astore_2
    //   243: iload #4
    //   245: istore_1
    //   246: goto -> 194
    // Exception table:
    //   from	to	target	type
    //   123	140	143	java/lang/NoSuchFieldException
    //   166	172	242	java/lang/IllegalAccessException
    //   176	184	187	java/lang/IllegalAccessException
  }
  
  static final class a extends LayoutTransition {
    public boolean isChangingLayout() {
      return true;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */