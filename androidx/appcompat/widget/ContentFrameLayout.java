package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import b.h.k.w;

public class ContentFrameLayout extends FrameLayout {
  private TypedValue b;
  
  private TypedValue c;
  
  private TypedValue d;
  
  private TypedValue e;
  
  private TypedValue f;
  
  private TypedValue g;
  
  private final Rect h = new Rect();
  
  private a i;
  
  public ContentFrameLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ContentFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(Rect paramRect) {
    fitSystemWindows(paramRect);
  }
  
  public TypedValue getFixedHeightMajor() {
    if (this.f == null)
      this.f = new TypedValue(); 
    return this.f;
  }
  
  public TypedValue getFixedHeightMinor() {
    if (this.g == null)
      this.g = new TypedValue(); 
    return this.g;
  }
  
  public TypedValue getFixedWidthMajor() {
    if (this.d == null)
      this.d = new TypedValue(); 
    return this.d;
  }
  
  public TypedValue getFixedWidthMinor() {
    if (this.e == null)
      this.e = new TypedValue(); 
    return this.e;
  }
  
  public TypedValue getMinWidthMajor() {
    if (this.b == null)
      this.b = new TypedValue(); 
    return this.b;
  }
  
  public TypedValue getMinWidthMinor() {
    if (this.c == null)
      this.c = new TypedValue(); 
    return this.c;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    a a1 = this.i;
    if (a1 != null)
      a1.a(); 
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    a a1 = this.i;
    if (a1 != null)
      a1.onDetachedFromWindow(); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getContext : ()Landroid/content/Context;
    //   4: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   7: invokevirtual getDisplayMetrics : ()Landroid/util/DisplayMetrics;
    //   10: astore_3
    //   11: aload_3
    //   12: getfield widthPixels : I
    //   15: istore #4
    //   17: aload_3
    //   18: getfield heightPixels : I
    //   21: istore #5
    //   23: iconst_1
    //   24: istore #6
    //   26: iload #4
    //   28: iload #5
    //   30: if_icmpge -> 39
    //   33: iconst_1
    //   34: istore #5
    //   36: goto -> 42
    //   39: iconst_0
    //   40: istore #5
    //   42: iload_1
    //   43: invokestatic getMode : (I)I
    //   46: istore #7
    //   48: iload_2
    //   49: invokestatic getMode : (I)I
    //   52: istore #8
    //   54: iload #7
    //   56: ldc -2147483648
    //   58: if_icmpne -> 196
    //   61: iload #5
    //   63: ifeq -> 75
    //   66: aload_0
    //   67: getfield e : Landroid/util/TypedValue;
    //   70: astore #9
    //   72: goto -> 81
    //   75: aload_0
    //   76: getfield d : Landroid/util/TypedValue;
    //   79: astore #9
    //   81: aload #9
    //   83: ifnull -> 196
    //   86: aload #9
    //   88: getfield type : I
    //   91: istore #4
    //   93: iload #4
    //   95: ifeq -> 196
    //   98: iload #4
    //   100: iconst_5
    //   101: if_icmpne -> 120
    //   104: aload #9
    //   106: aload_3
    //   107: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   110: fstore #10
    //   112: fload #10
    //   114: f2i
    //   115: istore #4
    //   117: goto -> 152
    //   120: iload #4
    //   122: bipush #6
    //   124: if_icmpne -> 149
    //   127: aload_3
    //   128: getfield widthPixels : I
    //   131: istore #4
    //   133: aload #9
    //   135: iload #4
    //   137: i2f
    //   138: iload #4
    //   140: i2f
    //   141: invokevirtual getFraction : (FF)F
    //   144: fstore #10
    //   146: goto -> 112
    //   149: iconst_0
    //   150: istore #4
    //   152: iload #4
    //   154: ifle -> 196
    //   157: aload_0
    //   158: getfield h : Landroid/graphics/Rect;
    //   161: astore #9
    //   163: iload #4
    //   165: aload #9
    //   167: getfield left : I
    //   170: aload #9
    //   172: getfield right : I
    //   175: iadd
    //   176: isub
    //   177: iload_1
    //   178: invokestatic getSize : (I)I
    //   181: invokestatic min : (II)I
    //   184: ldc 1073741824
    //   186: invokestatic makeMeasureSpec : (II)I
    //   189: istore #11
    //   191: iconst_1
    //   192: istore_1
    //   193: goto -> 205
    //   196: iconst_0
    //   197: istore #4
    //   199: iload_1
    //   200: istore #11
    //   202: iload #4
    //   204: istore_1
    //   205: iload_2
    //   206: istore #4
    //   208: iload #8
    //   210: ldc -2147483648
    //   212: if_icmpne -> 354
    //   215: iload #5
    //   217: ifeq -> 229
    //   220: aload_0
    //   221: getfield f : Landroid/util/TypedValue;
    //   224: astore #9
    //   226: goto -> 235
    //   229: aload_0
    //   230: getfield g : Landroid/util/TypedValue;
    //   233: astore #9
    //   235: iload_2
    //   236: istore #4
    //   238: aload #9
    //   240: ifnull -> 354
    //   243: aload #9
    //   245: getfield type : I
    //   248: istore #8
    //   250: iload_2
    //   251: istore #4
    //   253: iload #8
    //   255: ifeq -> 354
    //   258: iload #8
    //   260: iconst_5
    //   261: if_icmpne -> 280
    //   264: aload #9
    //   266: aload_3
    //   267: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   270: fstore #10
    //   272: fload #10
    //   274: f2i
    //   275: istore #8
    //   277: goto -> 312
    //   280: iload #8
    //   282: bipush #6
    //   284: if_icmpne -> 309
    //   287: aload_3
    //   288: getfield heightPixels : I
    //   291: istore #4
    //   293: aload #9
    //   295: iload #4
    //   297: i2f
    //   298: iload #4
    //   300: i2f
    //   301: invokevirtual getFraction : (FF)F
    //   304: fstore #10
    //   306: goto -> 272
    //   309: iconst_0
    //   310: istore #8
    //   312: iload_2
    //   313: istore #4
    //   315: iload #8
    //   317: ifle -> 354
    //   320: aload_0
    //   321: getfield h : Landroid/graphics/Rect;
    //   324: astore #9
    //   326: iload #8
    //   328: aload #9
    //   330: getfield top : I
    //   333: aload #9
    //   335: getfield bottom : I
    //   338: iadd
    //   339: isub
    //   340: iload_2
    //   341: invokestatic getSize : (I)I
    //   344: invokestatic min : (II)I
    //   347: ldc 1073741824
    //   349: invokestatic makeMeasureSpec : (II)I
    //   352: istore #4
    //   354: aload_0
    //   355: iload #11
    //   357: iload #4
    //   359: invokespecial onMeasure : (II)V
    //   362: aload_0
    //   363: invokevirtual getMeasuredWidth : ()I
    //   366: istore #8
    //   368: iload #8
    //   370: ldc 1073741824
    //   372: invokestatic makeMeasureSpec : (II)I
    //   375: istore #11
    //   377: iload_1
    //   378: ifne -> 515
    //   381: iload #7
    //   383: ldc -2147483648
    //   385: if_icmpne -> 515
    //   388: iload #5
    //   390: ifeq -> 402
    //   393: aload_0
    //   394: getfield c : Landroid/util/TypedValue;
    //   397: astore #9
    //   399: goto -> 408
    //   402: aload_0
    //   403: getfield b : Landroid/util/TypedValue;
    //   406: astore #9
    //   408: aload #9
    //   410: ifnull -> 515
    //   413: aload #9
    //   415: getfield type : I
    //   418: istore_1
    //   419: iload_1
    //   420: ifeq -> 515
    //   423: iload_1
    //   424: iconst_5
    //   425: if_icmpne -> 443
    //   428: aload #9
    //   430: aload_3
    //   431: invokevirtual getDimension : (Landroid/util/DisplayMetrics;)F
    //   434: fstore #10
    //   436: fload #10
    //   438: f2i
    //   439: istore_1
    //   440: goto -> 470
    //   443: iload_1
    //   444: bipush #6
    //   446: if_icmpne -> 468
    //   449: aload_3
    //   450: getfield widthPixels : I
    //   453: istore_1
    //   454: aload #9
    //   456: iload_1
    //   457: i2f
    //   458: iload_1
    //   459: i2f
    //   460: invokevirtual getFraction : (FF)F
    //   463: fstore #10
    //   465: goto -> 436
    //   468: iconst_0
    //   469: istore_1
    //   470: iload_1
    //   471: istore_2
    //   472: iload_1
    //   473: ifle -> 496
    //   476: aload_0
    //   477: getfield h : Landroid/graphics/Rect;
    //   480: astore #9
    //   482: iload_1
    //   483: aload #9
    //   485: getfield left : I
    //   488: aload #9
    //   490: getfield right : I
    //   493: iadd
    //   494: isub
    //   495: istore_2
    //   496: iload #8
    //   498: iload_2
    //   499: if_icmpge -> 515
    //   502: iload_2
    //   503: ldc 1073741824
    //   505: invokestatic makeMeasureSpec : (II)I
    //   508: istore_1
    //   509: iload #6
    //   511: istore_2
    //   512: goto -> 520
    //   515: iconst_0
    //   516: istore_2
    //   517: iload #11
    //   519: istore_1
    //   520: iload_2
    //   521: ifeq -> 531
    //   524: aload_0
    //   525: iload_1
    //   526: iload #4
    //   528: invokespecial onMeasure : (II)V
    //   531: return
  }
  
  public void setAttachListener(a parama) {
    this.i = parama;
  }
  
  public void setDecorPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.h.set(paramInt1, paramInt2, paramInt3, paramInt4);
    if (w.V((View)this))
      requestLayout(); 
  }
  
  public static interface a {
    void a();
    
    void onDetachedFromWindow();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/ContentFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */