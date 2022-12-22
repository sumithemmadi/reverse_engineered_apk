package b.a.l.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.v;
import androidx.core.graphics.drawable.b;
import b.e.h;
import b.t.a.a.i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint({"RestrictedAPI"})
public class a extends d implements b {
  private static final String p = a.class.getSimpleName();
  
  private c q;
  
  private g r;
  
  private int s = -1;
  
  private int t = -1;
  
  private boolean u;
  
  public a() {
    this(null, null);
  }
  
  a(c paramc, Resources paramResources) {
    super(null);
    h(new c(paramc, this, paramResources));
    onStateChange(getState());
    jumpToCurrentState();
  }
  
  public static a m(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    a a1;
    String str = paramXmlPullParser.getName();
    if (str.equals("animated-selector")) {
      a1 = new a();
      a1.n(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return a1;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": invalid animated-selector tag ");
    stringBuilder.append((String)a1);
    throw new XmlPullParserException(stringBuilder.toString());
  }
  
  private void o(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    int i = paramXmlPullParser.getDepth() + 1;
    while (true) {
      int j = paramXmlPullParser.next();
      if (j != 1) {
        int k = paramXmlPullParser.getDepth();
        if (k >= i || j != 3) {
          if (j != 2 || k > i)
            continue; 
          if (paramXmlPullParser.getName().equals("item")) {
            q(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
            continue;
          } 
          if (paramXmlPullParser.getName().equals("transition"))
            r(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme); 
          continue;
        } 
      } 
      break;
    } 
  }
  
  private void p() {
    onStateChange(getState());
  }
  
  private int q(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    XmlPullParserException xmlPullParserException2;
    Context context;
    TypedArray typedArray = androidx.core.content.d.g.k(paramResources, paramTheme, paramAttributeSet, b.a.m.b.AnimatedStateListDrawableItem);
    int i = typedArray.getResourceId(b.a.m.b.AnimatedStateListDrawableItem_android_id, 0);
    int j = typedArray.getResourceId(b.a.m.b.AnimatedStateListDrawableItem_android_drawable, -1);
    if (j > 0) {
      context = (Context)v.h().j(paramContext, j);
    } else {
      context = null;
    } 
    typedArray.recycle();
    int[] arrayOfInt = k(paramAttributeSet);
    paramContext = context;
    if (context == null)
      while (true) {
        j = paramXmlPullParser.next();
        if (j == 4)
          continue; 
        if (j == 2) {
          if (paramXmlPullParser.getName().equals("vector")) {
            i i1 = i.c(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
            break;
          } 
          if (Build.VERSION.SDK_INT >= 21) {
            Drawable drawable = Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
          } else {
            Drawable drawable = Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet);
          } 
        } else {
          stringBuilder1 = new StringBuilder();
          stringBuilder1.append(paramXmlPullParser.getPositionDescription());
          stringBuilder1.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
          throw new XmlPullParserException(stringBuilder1.toString());
        } 
        if (stringBuilder1 != null)
          return this.q.B(arrayOfInt, (Drawable)stringBuilder1, i); 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramXmlPullParser.getPositionDescription());
        stringBuilder1.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        xmlPullParserException2 = new XmlPullParserException(stringBuilder1.toString());
        throw xmlPullParserException2;
      }  
    if (xmlPullParserException2 != null)
      return this.q.B(arrayOfInt, (Drawable)xmlPullParserException2, i); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramXmlPullParser.getPositionDescription());
    stringBuilder.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    XmlPullParserException xmlPullParserException1 = new XmlPullParserException(stringBuilder.toString());
    throw xmlPullParserException1;
  }
  
  private int r(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_2
    //   1: aload #5
    //   3: aload #4
    //   5: getstatic b/a/m/b.AnimatedStateListDrawableTransition : [I
    //   8: invokestatic k : (Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   11: astore #6
    //   13: aload #6
    //   15: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_fromId : I
    //   18: iconst_m1
    //   19: invokevirtual getResourceId : (II)I
    //   22: istore #7
    //   24: aload #6
    //   26: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_toId : I
    //   29: iconst_m1
    //   30: invokevirtual getResourceId : (II)I
    //   33: istore #8
    //   35: aload #6
    //   37: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_drawable : I
    //   40: iconst_m1
    //   41: invokevirtual getResourceId : (II)I
    //   44: istore #9
    //   46: iload #9
    //   48: ifle -> 65
    //   51: invokestatic h : ()Landroidx/appcompat/widget/v;
    //   54: aload_1
    //   55: iload #9
    //   57: invokevirtual j : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   60: astore #10
    //   62: goto -> 68
    //   65: aconst_null
    //   66: astore #10
    //   68: aload #6
    //   70: getstatic b/a/m/b.AnimatedStateListDrawableTransition_android_reversible : I
    //   73: iconst_0
    //   74: invokevirtual getBoolean : (IZ)Z
    //   77: istore #11
    //   79: aload #6
    //   81: invokevirtual recycle : ()V
    //   84: aload #10
    //   86: astore #6
    //   88: aload #10
    //   90: ifnonnull -> 217
    //   93: aload_3
    //   94: invokeinterface next : ()I
    //   99: istore #9
    //   101: iload #9
    //   103: iconst_4
    //   104: if_icmpne -> 110
    //   107: goto -> 93
    //   110: iload #9
    //   112: iconst_2
    //   113: if_icmpne -> 179
    //   116: aload_3
    //   117: invokeinterface getName : ()Ljava/lang/String;
    //   122: ldc 'animated-vector'
    //   124: invokevirtual equals : (Ljava/lang/Object;)Z
    //   127: ifeq -> 145
    //   130: aload_1
    //   131: aload_2
    //   132: aload_3
    //   133: aload #4
    //   135: aload #5
    //   137: invokestatic a : (Landroid/content/Context;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Lb/t/a/a/c;
    //   140: astore #6
    //   142: goto -> 217
    //   145: getstatic android/os/Build$VERSION.SDK_INT : I
    //   148: bipush #21
    //   150: if_icmplt -> 167
    //   153: aload_2
    //   154: aload_3
    //   155: aload #4
    //   157: aload #5
    //   159: invokestatic createFromXmlInner : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    //   162: astore #6
    //   164: goto -> 217
    //   167: aload_2
    //   168: aload_3
    //   169: aload #4
    //   171: invokestatic createFromXmlInner : (Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)Landroid/graphics/drawable/Drawable;
    //   174: astore #6
    //   176: goto -> 217
    //   179: new java/lang/StringBuilder
    //   182: dup
    //   183: invokespecial <init> : ()V
    //   186: astore_1
    //   187: aload_1
    //   188: aload_3
    //   189: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   194: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload_1
    //   199: ldc ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: new org/xmlpull/v1/XmlPullParserException
    //   208: dup
    //   209: aload_1
    //   210: invokevirtual toString : ()Ljava/lang/String;
    //   213: invokespecial <init> : (Ljava/lang/String;)V
    //   216: athrow
    //   217: aload #6
    //   219: ifnull -> 288
    //   222: iload #7
    //   224: iconst_m1
    //   225: if_icmpeq -> 250
    //   228: iload #8
    //   230: iconst_m1
    //   231: if_icmpeq -> 250
    //   234: aload_0
    //   235: getfield q : Lb/a/l/a/a$c;
    //   238: iload #7
    //   240: iload #8
    //   242: aload #6
    //   244: iload #11
    //   246: invokevirtual C : (IILandroid/graphics/drawable/Drawable;Z)I
    //   249: ireturn
    //   250: new java/lang/StringBuilder
    //   253: dup
    //   254: invokespecial <init> : ()V
    //   257: astore_1
    //   258: aload_1
    //   259: aload_3
    //   260: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   265: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   268: pop
    //   269: aload_1
    //   270: ldc ': <transition> tag requires 'fromId' & 'toId' attributes'
    //   272: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   275: pop
    //   276: new org/xmlpull/v1/XmlPullParserException
    //   279: dup
    //   280: aload_1
    //   281: invokevirtual toString : ()Ljava/lang/String;
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: athrow
    //   288: new java/lang/StringBuilder
    //   291: dup
    //   292: invokespecial <init> : ()V
    //   295: astore_1
    //   296: aload_1
    //   297: aload_3
    //   298: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   306: pop
    //   307: aload_1
    //   308: ldc ': <transition> tag requires a 'drawable' attribute or child tag defining a drawable'
    //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: pop
    //   314: new org/xmlpull/v1/XmlPullParserException
    //   317: dup
    //   318: aload_1
    //   319: invokevirtual toString : ()Ljava/lang/String;
    //   322: invokespecial <init> : (Ljava/lang/String;)V
    //   325: astore_1
    //   326: goto -> 331
    //   329: aload_1
    //   330: athrow
    //   331: goto -> 329
  }
  
  private boolean s(int paramInt) {
    b b1;
    int i;
    g g1 = this.r;
    if (g1 != null) {
      if (paramInt == this.s)
        return true; 
      if (paramInt == this.t && g1.a()) {
        g1.b();
        this.s = this.t;
        this.t = paramInt;
        return true;
      } 
      i = this.s;
      g1.d();
    } else {
      i = c();
    } 
    this.r = null;
    this.t = -1;
    this.s = -1;
    c c1 = this.q;
    int j = c1.E(i);
    int k = c1.E(paramInt);
    if (k == 0 || j == 0)
      return false; 
    int m = c1.G(j, k);
    if (m < 0)
      return false; 
    boolean bool = c1.I(j, k);
    g(m);
    Drawable drawable = getCurrent();
    if (drawable instanceof AnimationDrawable) {
      boolean bool1 = c1.H(j, k);
      e e = new e((AnimationDrawable)drawable, bool1, bool);
    } else if (drawable instanceof b.t.a.a.c) {
      d d1 = new d((b.t.a.a.c)drawable);
    } else {
      if (drawable instanceof Animatable) {
        b1 = new b((Animatable)drawable);
        b1.c();
        this.r = b1;
        this.t = i;
        this.s = paramInt;
        return true;
      } 
      return false;
    } 
    b1.c();
    this.r = b1;
    this.t = i;
    this.s = paramInt;
    return true;
  }
  
  private void t(TypedArray paramTypedArray) {
    c c1 = this.q;
    if (Build.VERSION.SDK_INT >= 21)
      c1.d |= paramTypedArray.getChangingConfigurations(); 
    c1.x(paramTypedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_variablePadding, c1.i));
    c1.t(paramTypedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_constantSize, c1.l));
    c1.u(paramTypedArray.getInt(b.a.m.b.AnimatedStateListDrawableCompat_android_enterFadeDuration, c1.A));
    c1.v(paramTypedArray.getInt(b.a.m.b.AnimatedStateListDrawableCompat_android_exitFadeDuration, c1.B));
    setDither(paramTypedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_dither, c1.x));
  }
  
  void h(b.d paramd) {
    super.h(paramd);
    if (paramd instanceof c)
      this.q = (c)paramd; 
  }
  
  public boolean isStateful() {
    return true;
  }
  
  public void jumpToCurrentState() {
    super.jumpToCurrentState();
    g g1 = this.r;
    if (g1 != null) {
      g1.d();
      this.r = null;
      g(this.s);
      this.s = -1;
      this.t = -1;
    } 
  }
  
  c l() {
    return new c(this.q, this, null);
  }
  
  public Drawable mutate() {
    if (!this.u && super.mutate() == this) {
      this.q.r();
      this.u = true;
    } 
    return this;
  }
  
  public void n(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    TypedArray typedArray = androidx.core.content.d.g.k(paramResources, paramTheme, paramAttributeSet, b.a.m.b.AnimatedStateListDrawableCompat);
    setVisible(typedArray.getBoolean(b.a.m.b.AnimatedStateListDrawableCompat_android_visible, true), true);
    t(typedArray);
    i(paramResources);
    typedArray.recycle();
    o(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    p();
  }
  
  protected boolean onStateChange(int[] paramArrayOfint) {
    boolean bool1;
    int i = this.q.F(paramArrayOfint);
    if (i != c() && (s(i) || g(i))) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    Drawable drawable = getCurrent();
    boolean bool2 = bool1;
    if (drawable != null)
      bool2 = bool1 | drawable.setState(paramArrayOfint); 
    return bool2;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    g g1 = this.r;
    if (g1 != null && (bool || paramBoolean2))
      if (paramBoolean1) {
        g1.c();
      } else {
        jumpToCurrentState();
      }  
    return bool;
  }
  
  private static class b extends g {
    private final Animatable a;
    
    b(Animatable param1Animatable) {
      super(null);
      this.a = param1Animatable;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  static class c extends d.a {
    b.e.d<Long> K;
    
    h<Integer> L;
    
    c(c param1c, a param1a, Resources param1Resources) {
      super(param1c, param1a, param1Resources);
      if (param1c != null) {
        this.K = param1c.K;
        this.L = param1c.L;
      } else {
        this.K = new b.e.d();
        this.L = new h();
      } 
    }
    
    private static long D(int param1Int1, int param1Int2) {
      long l = param1Int1;
      return param1Int2 | l << 32L;
    }
    
    int B(int[] param1ArrayOfint, Drawable param1Drawable, int param1Int) {
      int i = z(param1ArrayOfint, param1Drawable);
      this.L.n(i, Integer.valueOf(param1Int));
      return i;
    }
    
    int C(int param1Int1, int param1Int2, Drawable param1Drawable, boolean param1Boolean) {
      long l2;
      int i = a(param1Drawable);
      long l1 = D(param1Int1, param1Int2);
      if (param1Boolean) {
        l2 = 8589934592L;
      } else {
        l2 = 0L;
      } 
      b.e.d<Long> d1 = this.K;
      long l3 = i;
      d1.a(l1, Long.valueOf(l3 | l2));
      if (param1Boolean) {
        l1 = D(param1Int2, param1Int1);
        this.K.a(l1, Long.valueOf(0x100000000L | l3 | l2));
      } 
      return i;
    }
    
    int E(int param1Int) {
      boolean bool = false;
      if (param1Int < 0) {
        param1Int = bool;
      } else {
        param1Int = ((Integer)this.L.k(param1Int, Integer.valueOf(0))).intValue();
      } 
      return param1Int;
    }
    
    int F(int[] param1ArrayOfint) {
      int i = A(param1ArrayOfint);
      return (i >= 0) ? i : A(StateSet.WILD_CARD);
    }
    
    int G(int param1Int1, int param1Int2) {
      long l = D(param1Int1, param1Int2);
      return (int)((Long)this.K.k(l, Long.valueOf(-1L))).longValue();
    }
    
    boolean H(int param1Int1, int param1Int2) {
      boolean bool;
      long l = D(param1Int1, param1Int2);
      if ((((Long)this.K.k(l, Long.valueOf(-1L))).longValue() & 0x100000000L) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    boolean I(int param1Int1, int param1Int2) {
      boolean bool;
      long l = D(param1Int1, param1Int2);
      if ((((Long)this.K.k(l, Long.valueOf(-1L))).longValue() & 0x200000000L) != 0L) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    public Drawable newDrawable() {
      return new a(this, null);
    }
    
    public Drawable newDrawable(Resources param1Resources) {
      return new a(this, param1Resources);
    }
    
    void r() {
      this.K = this.K.f();
      this.L = this.L.f();
    }
  }
  
  private static class d extends g {
    private final b.t.a.a.c a;
    
    d(b.t.a.a.c param1c) {
      super(null);
      this.a = param1c;
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.stop();
    }
  }
  
  private static class e extends g {
    private final ObjectAnimator a;
    
    private final boolean b;
    
    e(AnimationDrawable param1AnimationDrawable, boolean param1Boolean1, boolean param1Boolean2) {
      super(null);
      boolean bool;
      int i = param1AnimationDrawable.getNumberOfFrames();
      if (param1Boolean1) {
        bool = i - 1;
      } else {
        bool = false;
      } 
      if (param1Boolean1) {
        i = 0;
      } else {
        i--;
      } 
      a.f f = new a.f(param1AnimationDrawable, param1Boolean1);
      ObjectAnimator objectAnimator = ObjectAnimator.ofInt(param1AnimationDrawable, "currentIndex", new int[] { bool, i });
      if (Build.VERSION.SDK_INT >= 18)
        objectAnimator.setAutoCancel(true); 
      objectAnimator.setDuration(f.a());
      objectAnimator.setInterpolator(f);
      this.b = param1Boolean2;
      this.a = objectAnimator;
    }
    
    public boolean a() {
      return this.b;
    }
    
    public void b() {
      this.a.reverse();
    }
    
    public void c() {
      this.a.start();
    }
    
    public void d() {
      this.a.cancel();
    }
  }
  
  private static class f implements TimeInterpolator {
    private int[] a;
    
    private int b;
    
    private int c;
    
    f(AnimationDrawable param1AnimationDrawable, boolean param1Boolean) {
      b(param1AnimationDrawable, param1Boolean);
    }
    
    int a() {
      return this.c;
    }
    
    int b(AnimationDrawable param1AnimationDrawable, boolean param1Boolean) {
      int i = param1AnimationDrawable.getNumberOfFrames();
      this.b = i;
      int[] arrayOfInt = this.a;
      if (arrayOfInt == null || arrayOfInt.length < i)
        this.a = new int[i]; 
      arrayOfInt = this.a;
      byte b = 0;
      int j = 0;
      while (b < i) {
        if (param1Boolean) {
          k = i - b - 1;
        } else {
          k = b;
        } 
        int k = param1AnimationDrawable.getDuration(k);
        arrayOfInt[b] = k;
        j += k;
        b++;
      } 
      this.c = j;
      return j;
    }
    
    public float getInterpolation(float param1Float) {
      int i = (int)(param1Float * this.c + 0.5F);
      int j = this.b;
      int[] arrayOfInt = this.a;
      byte b;
      for (b = 0; b < j && i >= arrayOfInt[b]; b++)
        i -= arrayOfInt[b]; 
      if (b < j) {
        param1Float = i / this.c;
      } else {
        param1Float = 0.0F;
      } 
      return b / j + param1Float;
    }
  }
  
  private static abstract class g {
    private g() {}
    
    public boolean a() {
      return false;
    }
    
    public void b() {}
    
    public abstract void c();
    
    public abstract void d();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/a/l/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */