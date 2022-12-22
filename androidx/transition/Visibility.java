package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.d.g;
import org.xmlpull.v1.XmlPullParser;

public abstract class Visibility extends Transition {
  private static final String[] L = new String[] { "android:visibility:visibility", "android:visibility:parent" };
  
  private int M = 3;
  
  public Visibility() {}
  
  @SuppressLint({"RestrictedApi"})
  public Visibility(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, t.e);
    int i = g.g(typedArray, (XmlPullParser)paramAttributeSet, "transitionVisibilityMode", 0, 0);
    typedArray.recycle();
    if (i != 0)
      v0(i); 
  }
  
  private void o0(y paramy) {
    int i = paramy.b.getVisibility();
    paramy.a.put("android:visibility:visibility", Integer.valueOf(i));
    paramy.a.put("android:visibility:parent", paramy.b.getParent());
    int[] arrayOfInt = new int[2];
    paramy.b.getLocationOnScreen(arrayOfInt);
    paramy.a.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  private c q0(y paramy1, y paramy2) {
    c c = new c();
    c.a = false;
    c.b = false;
    if (paramy1 != null && paramy1.a.containsKey("android:visibility:visibility")) {
      c.c = ((Integer)paramy1.a.get("android:visibility:visibility")).intValue();
      c.e = (ViewGroup)paramy1.a.get("android:visibility:parent");
    } else {
      c.c = -1;
      c.e = null;
    } 
    if (paramy2 != null && paramy2.a.containsKey("android:visibility:visibility")) {
      c.d = ((Integer)paramy2.a.get("android:visibility:visibility")).intValue();
      c.f = (ViewGroup)paramy2.a.get("android:visibility:parent");
    } else {
      c.d = -1;
      c.f = null;
    } 
    if (paramy1 != null && paramy2 != null) {
      int i = c.c;
      int j = c.d;
      if (i == j && c.e == c.f)
        return c; 
      if (i != j) {
        if (i == 0) {
          c.b = false;
          c.a = true;
        } else if (j == 0) {
          c.b = true;
          c.a = true;
        } 
      } else if (c.f == null) {
        c.b = false;
        c.a = true;
      } else if (c.e == null) {
        c.b = true;
        c.a = true;
      } 
    } else if (paramy1 == null && c.d == 0) {
      c.b = true;
      c.a = true;
    } else if (paramy2 == null && c.c == 0) {
      c.b = false;
      c.a = true;
    } 
    return c;
  }
  
  public String[] M() {
    return L;
  }
  
  public boolean O(y paramy1, y paramy2) {
    boolean bool = false;
    if (paramy1 == null && paramy2 == null)
      return false; 
    if (paramy1 != null && paramy2 != null && paramy2.a.containsKey("android:visibility:visibility") != paramy1.a.containsKey("android:visibility:visibility"))
      return false; 
    c c = q0(paramy1, paramy2);
    null = bool;
    if (c.a) {
      if (c.c != 0) {
        null = bool;
        return (c.d == 0) ? true : null;
      } 
    } else {
      return null;
    } 
    return true;
  }
  
  public void l(y paramy) {
    o0(paramy);
  }
  
  public int p0() {
    return this.M;
  }
  
  public void q(y paramy) {
    o0(paramy);
  }
  
  public Animator r0(ViewGroup paramViewGroup, View paramView, y paramy1, y paramy2) {
    return null;
  }
  
  public Animator s0(ViewGroup paramViewGroup, y paramy1, int paramInt1, y paramy2, int paramInt2) {
    if ((this.M & 0x1) != 1 || paramy2 == null)
      return null; 
    if (paramy1 == null) {
      View view = (View)paramy2.b.getParent();
      if ((q0(C(view, false), N(view, false))).a)
        return null; 
    } 
    return r0(paramViewGroup, paramy2.b, paramy1, paramy2);
  }
  
  public Animator t0(ViewGroup paramViewGroup, View paramView, y paramy1, y paramy2) {
    return null;
  }
  
  public Animator u0(ViewGroup paramViewGroup, y paramy1, int paramInt1, y paramy2, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield M : I
    //   4: iconst_2
    //   5: iand
    //   6: iconst_2
    //   7: if_icmpeq -> 12
    //   10: aconst_null
    //   11: areturn
    //   12: aload_2
    //   13: ifnonnull -> 18
    //   16: aconst_null
    //   17: areturn
    //   18: aload_2
    //   19: getfield b : Landroid/view/View;
    //   22: astore #6
    //   24: aload #4
    //   26: ifnull -> 39
    //   29: aload #4
    //   31: getfield b : Landroid/view/View;
    //   34: astore #7
    //   36: goto -> 42
    //   39: aconst_null
    //   40: astore #7
    //   42: getstatic androidx/transition/p.save_overlay_view : I
    //   45: istore #8
    //   47: aload #6
    //   49: iload #8
    //   51: invokevirtual getTag : (I)Ljava/lang/Object;
    //   54: checkcast android/view/View
    //   57: astore #9
    //   59: aload #9
    //   61: ifnull -> 72
    //   64: aconst_null
    //   65: astore #7
    //   67: iconst_1
    //   68: istore_3
    //   69: goto -> 292
    //   72: aload #7
    //   74: ifnull -> 116
    //   77: aload #7
    //   79: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   82: ifnonnull -> 88
    //   85: goto -> 116
    //   88: iload #5
    //   90: iconst_4
    //   91: if_icmpne -> 97
    //   94: goto -> 104
    //   97: aload #6
    //   99: aload #7
    //   101: if_acmpne -> 129
    //   104: aload #7
    //   106: astore #9
    //   108: iconst_0
    //   109: istore_3
    //   110: aconst_null
    //   111: astore #7
    //   113: goto -> 138
    //   116: aload #7
    //   118: ifnull -> 129
    //   121: aconst_null
    //   122: astore #9
    //   124: iconst_0
    //   125: istore_3
    //   126: goto -> 138
    //   129: aconst_null
    //   130: astore #7
    //   132: aload #7
    //   134: astore #9
    //   136: iconst_1
    //   137: istore_3
    //   138: aload #7
    //   140: astore #10
    //   142: iload_3
    //   143: ifeq -> 282
    //   146: aload #6
    //   148: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   151: ifnonnull -> 157
    //   154: goto -> 269
    //   157: aload #7
    //   159: astore #10
    //   161: aload #6
    //   163: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   166: instanceof android/view/View
    //   169: ifeq -> 282
    //   172: aload #6
    //   174: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   177: checkcast android/view/View
    //   180: astore #11
    //   182: aload_0
    //   183: aload_0
    //   184: aload #11
    //   186: iconst_1
    //   187: invokevirtual N : (Landroid/view/View;Z)Landroidx/transition/y;
    //   190: aload_0
    //   191: aload #11
    //   193: iconst_1
    //   194: invokevirtual C : (Landroid/view/View;Z)Landroidx/transition/y;
    //   197: invokespecial q0 : (Landroidx/transition/y;Landroidx/transition/y;)Landroidx/transition/Visibility$c;
    //   200: getfield a : Z
    //   203: ifne -> 219
    //   206: aload_1
    //   207: aload #6
    //   209: aload #11
    //   211: invokestatic a : (Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    //   214: astore #10
    //   216: goto -> 282
    //   219: aload #11
    //   221: invokevirtual getId : ()I
    //   224: istore_3
    //   225: aload #7
    //   227: astore #10
    //   229: aload #11
    //   231: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   234: ifnonnull -> 282
    //   237: aload #7
    //   239: astore #10
    //   241: iload_3
    //   242: iconst_m1
    //   243: if_icmpeq -> 282
    //   246: aload #7
    //   248: astore #10
    //   250: aload_1
    //   251: iload_3
    //   252: invokevirtual findViewById : (I)Landroid/view/View;
    //   255: ifnull -> 282
    //   258: aload #7
    //   260: astore #10
    //   262: aload_0
    //   263: getfield A : Z
    //   266: ifeq -> 282
    //   269: aload #9
    //   271: astore #7
    //   273: iconst_0
    //   274: istore_3
    //   275: aload #6
    //   277: astore #9
    //   279: goto -> 292
    //   282: iconst_0
    //   283: istore_3
    //   284: aload #9
    //   286: astore #7
    //   288: aload #10
    //   290: astore #9
    //   292: aload #9
    //   294: ifnull -> 449
    //   297: iload_3
    //   298: ifne -> 387
    //   301: aload_2
    //   302: getfield a : Ljava/util/Map;
    //   305: ldc 'android:visibility:screenLocation'
    //   307: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   312: checkcast [I
    //   315: astore #7
    //   317: aload #7
    //   319: iconst_0
    //   320: iaload
    //   321: istore #5
    //   323: aload #7
    //   325: iconst_1
    //   326: iaload
    //   327: istore #12
    //   329: iconst_2
    //   330: newarray int
    //   332: astore #7
    //   334: aload_1
    //   335: aload #7
    //   337: invokevirtual getLocationOnScreen : ([I)V
    //   340: aload #9
    //   342: iload #5
    //   344: aload #7
    //   346: iconst_0
    //   347: iaload
    //   348: isub
    //   349: aload #9
    //   351: invokevirtual getLeft : ()I
    //   354: isub
    //   355: invokevirtual offsetLeftAndRight : (I)V
    //   358: aload #9
    //   360: iload #12
    //   362: aload #7
    //   364: iconst_1
    //   365: iaload
    //   366: isub
    //   367: aload #9
    //   369: invokevirtual getTop : ()I
    //   372: isub
    //   373: invokevirtual offsetTopAndBottom : (I)V
    //   376: aload_1
    //   377: invokestatic b : (Landroid/view/ViewGroup;)Landroidx/transition/d0;
    //   380: aload #9
    //   382: invokeinterface c : (Landroid/view/View;)V
    //   387: aload_0
    //   388: aload_1
    //   389: aload #9
    //   391: aload_2
    //   392: aload #4
    //   394: invokevirtual t0 : (Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/y;Landroidx/transition/y;)Landroid/animation/Animator;
    //   397: astore_2
    //   398: iload_3
    //   399: ifne -> 447
    //   402: aload_2
    //   403: ifnonnull -> 420
    //   406: aload_1
    //   407: invokestatic b : (Landroid/view/ViewGroup;)Landroidx/transition/d0;
    //   410: aload #9
    //   412: invokeinterface d : (Landroid/view/View;)V
    //   417: goto -> 447
    //   420: aload #6
    //   422: iload #8
    //   424: aload #9
    //   426: invokevirtual setTag : (ILjava/lang/Object;)V
    //   429: aload_0
    //   430: new androidx/transition/Visibility$a
    //   433: dup
    //   434: aload_0
    //   435: aload_1
    //   436: aload #9
    //   438: aload #6
    //   440: invokespecial <init> : (Landroidx/transition/Visibility;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    //   443: invokevirtual a : (Landroidx/transition/Transition$f;)Landroidx/transition/Transition;
    //   446: pop
    //   447: aload_2
    //   448: areturn
    //   449: aload #7
    //   451: ifnull -> 521
    //   454: aload #7
    //   456: invokevirtual getVisibility : ()I
    //   459: istore_3
    //   460: aload #7
    //   462: iconst_0
    //   463: invokestatic i : (Landroid/view/View;I)V
    //   466: aload_0
    //   467: aload_1
    //   468: aload #7
    //   470: aload_2
    //   471: aload #4
    //   473: invokevirtual t0 : (Landroid/view/ViewGroup;Landroid/view/View;Landroidx/transition/y;Landroidx/transition/y;)Landroid/animation/Animator;
    //   476: astore_1
    //   477: aload_1
    //   478: ifnull -> 513
    //   481: new androidx/transition/Visibility$b
    //   484: dup
    //   485: aload #7
    //   487: iload #5
    //   489: iconst_1
    //   490: invokespecial <init> : (Landroid/view/View;IZ)V
    //   493: astore_2
    //   494: aload_1
    //   495: aload_2
    //   496: invokevirtual addListener : (Landroid/animation/Animator$AnimatorListener;)V
    //   499: aload_1
    //   500: aload_2
    //   501: invokestatic a : (Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V
    //   504: aload_0
    //   505: aload_2
    //   506: invokevirtual a : (Landroidx/transition/Transition$f;)Landroidx/transition/Transition;
    //   509: pop
    //   510: goto -> 519
    //   513: aload #7
    //   515: iload_3
    //   516: invokestatic i : (Landroid/view/View;I)V
    //   519: aload_1
    //   520: areturn
    //   521: aconst_null
    //   522: areturn
  }
  
  public Animator v(ViewGroup paramViewGroup, y paramy1, y paramy2) {
    c c = q0(paramy1, paramy2);
    return (c.a && (c.e != null || c.f != null)) ? (c.b ? s0(paramViewGroup, paramy1, c.c, paramy2, c.d) : u0(paramViewGroup, paramy1, c.c, paramy2, c.d)) : null;
  }
  
  public void v0(int paramInt) {
    if ((paramInt & 0xFFFFFFFC) == 0) {
      this.M = paramInt;
      return;
    } 
    throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
  }
  
  class a extends u {
    a(Visibility this$0, ViewGroup param1ViewGroup, View param1View1, View param1View2) {}
    
    public void b(Transition param1Transition) {
      e0.b(this.a).d(this.b);
    }
    
    public void c(Transition param1Transition) {
      this.c.setTag(p.save_overlay_view, null);
      e0.b(this.a).d(this.b);
      param1Transition.a0(this);
    }
    
    public void e(Transition param1Transition) {
      if (this.b.getParent() == null) {
        e0.b(this.a).c(this.b);
      } else {
        this.d.cancel();
      } 
    }
  }
  
  private static class b extends AnimatorListenerAdapter implements Transition.f, a.a {
    private final View a;
    
    private final int b;
    
    private final ViewGroup c;
    
    private final boolean d;
    
    private boolean e;
    
    boolean f = false;
    
    b(View param1View, int param1Int, boolean param1Boolean) {
      this.a = param1View;
      this.b = param1Int;
      this.c = (ViewGroup)param1View.getParent();
      this.d = param1Boolean;
      g(true);
    }
    
    private void f() {
      if (!this.f) {
        j0.i(this.a, this.b);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null)
          viewGroup.invalidate(); 
      } 
      g(false);
    }
    
    private void g(boolean param1Boolean) {
      if (this.d && this.e != param1Boolean) {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
          this.e = param1Boolean;
          e0.d(viewGroup, param1Boolean);
        } 
      } 
    }
    
    public void a(Transition param1Transition) {}
    
    public void b(Transition param1Transition) {
      g(false);
    }
    
    public void c(Transition param1Transition) {
      f();
      param1Transition.a0(this);
    }
    
    public void d(Transition param1Transition) {}
    
    public void e(Transition param1Transition) {
      g(true);
    }
    
    public void onAnimationCancel(Animator param1Animator) {
      this.f = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      f();
    }
    
    public void onAnimationPause(Animator param1Animator) {
      if (!this.f)
        j0.i(this.a, this.b); 
    }
    
    public void onAnimationRepeat(Animator param1Animator) {}
    
    public void onAnimationResume(Animator param1Animator) {
      if (!this.f)
        j0.i(this.a, 0); 
    }
    
    public void onAnimationStart(Animator param1Animator) {}
  }
  
  private static class c {
    boolean a;
    
    boolean b;
    
    int c;
    
    int d;
    
    ViewGroup e;
    
    ViewGroup f;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/transition/Visibility.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */