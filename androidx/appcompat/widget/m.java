package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.d.f;
import b.a.j;
import b.h.k.w;
import java.lang.ref.WeakReference;

class m {
  private final TextView a;
  
  private c0 b;
  
  private c0 c;
  
  private c0 d;
  
  private c0 e;
  
  private c0 f;
  
  private c0 g;
  
  private c0 h;
  
  private final n i;
  
  private int j = 0;
  
  private int k = -1;
  
  private Typeface l;
  
  private boolean m;
  
  m(TextView paramTextView) {
    this.a = paramTextView;
    this.i = new n(paramTextView);
  }
  
  private void B(int paramInt, float paramFloat) {
    this.i.y(paramInt, paramFloat);
  }
  
  private void C(Context paramContext, e0 parame0) {
    this.j = parame0.k(j.TextAppearance_android_textStyle, this.j);
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 28) {
      int k = parame0.k(j.TextAppearance_android_textFontWeight, -1);
      this.k = k;
      if (k != -1)
        this.j = this.j & 0x2 | 0x0; 
    } 
    int j = j.TextAppearance_android_fontFamily;
    if (parame0.s(j) || parame0.s(j.TextAppearance_fontFamily)) {
      this.l = null;
      int k = j.TextAppearance_fontFamily;
      if (parame0.s(k))
        j = k; 
      k = this.k;
      int i1 = this.j;
      if (!paramContext.isRestricted()) {
        a a = new a(this, k, i1, new WeakReference<TextView>(this.a));
        try {
          boolean bool1;
          Typeface typeface = parame0.j(j, this.j, a);
          if (typeface != null)
            if (i >= 28 && this.k != -1) {
              typeface = Typeface.create(typeface, 0);
              k = this.k;
              if ((this.j & 0x2) != 0) {
                bool1 = true;
              } else {
                bool1 = false;
              } 
              this.l = Typeface.create(typeface, k, bool1);
            } else {
              this.l = typeface;
            }  
          if (this.l == null) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          this.m = bool1;
        } catch (UnsupportedOperationException|android.content.res.Resources.NotFoundException unsupportedOperationException) {}
      } 
      if (this.l == null) {
        String str = parame0.o(j);
        if (str != null) {
          Typeface typeface;
          if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            typeface = Typeface.create(str, 0);
            j = this.k;
            boolean bool1 = bool;
            if ((this.j & 0x2) != 0)
              bool1 = true; 
            this.l = Typeface.create(typeface, j, bool1);
          } else {
            this.l = Typeface.create((String)typeface, this.j);
          } 
        } 
      } 
      return;
    } 
    j = j.TextAppearance_android_typeface;
    if (parame0.s(j)) {
      this.m = false;
      j = parame0.k(j, 1);
      if (j != 1) {
        if (j != 2) {
          if (j == 3)
            this.l = Typeface.MONOSPACE; 
        } else {
          this.l = Typeface.SERIF;
        } 
      } else {
        this.l = Typeface.SANS_SERIF;
      } 
    } 
  }
  
  private void a(Drawable paramDrawable, c0 paramc0) {
    if (paramDrawable != null && paramc0 != null)
      f.i(paramDrawable, paramc0, this.a.getDrawableState()); 
  }
  
  private static c0 d(Context paramContext, f paramf, int paramInt) {
    ColorStateList colorStateList = paramf.f(paramContext, paramInt);
    if (colorStateList != null) {
      c0 c01 = new c0();
      c01.d = true;
      c01.a = colorStateList;
      return c01;
    } 
    return null;
  }
  
  private void y(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4, Drawable paramDrawable5, Drawable paramDrawable6) {
    TextView textView;
    Drawable[] arrayOfDrawable;
    int i = Build.VERSION.SDK_INT;
    if (i >= 17 && (paramDrawable5 != null || paramDrawable6 != null)) {
      arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      textView = this.a;
      if (paramDrawable5 == null)
        paramDrawable5 = arrayOfDrawable[0]; 
      if (paramDrawable2 == null)
        paramDrawable2 = arrayOfDrawable[1]; 
      if (paramDrawable6 == null)
        paramDrawable6 = arrayOfDrawable[2]; 
      if (paramDrawable4 == null)
        paramDrawable4 = arrayOfDrawable[3]; 
      textView.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable5, paramDrawable2, paramDrawable6, paramDrawable4);
    } else if (textView != null || paramDrawable2 != null || arrayOfDrawable != null || paramDrawable4 != null) {
      Drawable drawable1;
      TextView textView1;
      Drawable drawable2;
      if (i >= 17) {
        Drawable[] arrayOfDrawable2 = this.a.getCompoundDrawablesRelative();
        if (arrayOfDrawable2[0] != null || arrayOfDrawable2[2] != null) {
          textView1 = this.a;
          drawable1 = arrayOfDrawable2[0];
          if (paramDrawable2 == null)
            paramDrawable2 = arrayOfDrawable2[1]; 
          paramDrawable6 = arrayOfDrawable2[2];
          if (paramDrawable4 == null)
            paramDrawable4 = arrayOfDrawable2[3]; 
          textView1.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, paramDrawable2, paramDrawable6, paramDrawable4);
          return;
        } 
      } 
      Drawable[] arrayOfDrawable1 = this.a.getCompoundDrawables();
      TextView textView2 = this.a;
      if (drawable1 == null)
        drawable1 = arrayOfDrawable1[0]; 
      if (paramDrawable2 == null)
        paramDrawable2 = arrayOfDrawable1[1]; 
      if (textView1 == null)
        drawable2 = arrayOfDrawable1[2]; 
      if (paramDrawable4 == null)
        paramDrawable4 = arrayOfDrawable1[3]; 
      textView2.setCompoundDrawablesWithIntrinsicBounds(drawable1, paramDrawable2, drawable2, paramDrawable4);
    } 
  }
  
  private void z() {
    c0 c01 = this.h;
    this.b = c01;
    this.c = c01;
    this.d = c01;
    this.e = c01;
    this.f = c01;
    this.g = c01;
  }
  
  void A(int paramInt, float paramFloat) {
    if (!androidx.core.widget.b.a && !l())
      B(paramInt, paramFloat); 
  }
  
  void b() {
    if (this.b != null || this.c != null || this.d != null || this.e != null) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawables();
      a(arrayOfDrawable[0], this.b);
      a(arrayOfDrawable[1], this.c);
      a(arrayOfDrawable[2], this.d);
      a(arrayOfDrawable[3], this.e);
    } 
    if (Build.VERSION.SDK_INT >= 17 && (this.f != null || this.g != null)) {
      Drawable[] arrayOfDrawable = this.a.getCompoundDrawablesRelative();
      a(arrayOfDrawable[0], this.f);
      a(arrayOfDrawable[2], this.g);
    } 
  }
  
  void c() {
    this.i.b();
  }
  
  int e() {
    return this.i.j();
  }
  
  int f() {
    return this.i.k();
  }
  
  int g() {
    return this.i.l();
  }
  
  int[] h() {
    return this.i.m();
  }
  
  int i() {
    return this.i.n();
  }
  
  ColorStateList j() {
    c0 c01 = this.h;
    if (c01 != null) {
      ColorStateList colorStateList = c01.a;
    } else {
      c01 = null;
    } 
    return (ColorStateList)c01;
  }
  
  PorterDuff.Mode k() {
    c0 c01 = this.h;
    if (c01 != null) {
      PorterDuff.Mode mode = c01.b;
    } else {
      c01 = null;
    } 
    return (PorterDuff.Mode)c01;
  }
  
  boolean l() {
    return this.i.s();
  }
  
  @SuppressLint({"NewApi"})
  void m(AttributeSet paramAttributeSet, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroid/widget/TextView;
    //   4: invokevirtual getContext : ()Landroid/content/Context;
    //   7: astore_3
    //   8: invokestatic b : ()Landroidx/appcompat/widget/f;
    //   11: astore #4
    //   13: getstatic b/a/j.AppCompatTextHelper : [I
    //   16: astore #5
    //   18: aload_3
    //   19: aload_1
    //   20: aload #5
    //   22: iload_2
    //   23: iconst_0
    //   24: invokestatic v : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/e0;
    //   27: astore #6
    //   29: aload_0
    //   30: getfield a : Landroid/widget/TextView;
    //   33: astore #7
    //   35: aload #7
    //   37: aload #7
    //   39: invokevirtual getContext : ()Landroid/content/Context;
    //   42: aload #5
    //   44: aload_1
    //   45: aload #6
    //   47: invokevirtual r : ()Landroid/content/res/TypedArray;
    //   50: iload_2
    //   51: iconst_0
    //   52: invokestatic p0 : (Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V
    //   55: aload #6
    //   57: getstatic b/a/j.AppCompatTextHelper_android_textAppearance : I
    //   60: iconst_m1
    //   61: invokevirtual n : (II)I
    //   64: istore #8
    //   66: getstatic b/a/j.AppCompatTextHelper_android_drawableLeft : I
    //   69: istore #9
    //   71: aload #6
    //   73: iload #9
    //   75: invokevirtual s : (I)Z
    //   78: ifeq -> 99
    //   81: aload_0
    //   82: aload_3
    //   83: aload #4
    //   85: aload #6
    //   87: iload #9
    //   89: iconst_0
    //   90: invokevirtual n : (II)I
    //   93: invokestatic d : (Landroid/content/Context;Landroidx/appcompat/widget/f;I)Landroidx/appcompat/widget/c0;
    //   96: putfield b : Landroidx/appcompat/widget/c0;
    //   99: getstatic b/a/j.AppCompatTextHelper_android_drawableTop : I
    //   102: istore #9
    //   104: aload #6
    //   106: iload #9
    //   108: invokevirtual s : (I)Z
    //   111: ifeq -> 132
    //   114: aload_0
    //   115: aload_3
    //   116: aload #4
    //   118: aload #6
    //   120: iload #9
    //   122: iconst_0
    //   123: invokevirtual n : (II)I
    //   126: invokestatic d : (Landroid/content/Context;Landroidx/appcompat/widget/f;I)Landroidx/appcompat/widget/c0;
    //   129: putfield c : Landroidx/appcompat/widget/c0;
    //   132: getstatic b/a/j.AppCompatTextHelper_android_drawableRight : I
    //   135: istore #9
    //   137: aload #6
    //   139: iload #9
    //   141: invokevirtual s : (I)Z
    //   144: ifeq -> 165
    //   147: aload_0
    //   148: aload_3
    //   149: aload #4
    //   151: aload #6
    //   153: iload #9
    //   155: iconst_0
    //   156: invokevirtual n : (II)I
    //   159: invokestatic d : (Landroid/content/Context;Landroidx/appcompat/widget/f;I)Landroidx/appcompat/widget/c0;
    //   162: putfield d : Landroidx/appcompat/widget/c0;
    //   165: getstatic b/a/j.AppCompatTextHelper_android_drawableBottom : I
    //   168: istore #9
    //   170: aload #6
    //   172: iload #9
    //   174: invokevirtual s : (I)Z
    //   177: ifeq -> 198
    //   180: aload_0
    //   181: aload_3
    //   182: aload #4
    //   184: aload #6
    //   186: iload #9
    //   188: iconst_0
    //   189: invokevirtual n : (II)I
    //   192: invokestatic d : (Landroid/content/Context;Landroidx/appcompat/widget/f;I)Landroidx/appcompat/widget/c0;
    //   195: putfield e : Landroidx/appcompat/widget/c0;
    //   198: getstatic android/os/Build$VERSION.SDK_INT : I
    //   201: istore #9
    //   203: iload #9
    //   205: bipush #17
    //   207: if_icmplt -> 276
    //   210: getstatic b/a/j.AppCompatTextHelper_android_drawableStart : I
    //   213: istore #10
    //   215: aload #6
    //   217: iload #10
    //   219: invokevirtual s : (I)Z
    //   222: ifeq -> 243
    //   225: aload_0
    //   226: aload_3
    //   227: aload #4
    //   229: aload #6
    //   231: iload #10
    //   233: iconst_0
    //   234: invokevirtual n : (II)I
    //   237: invokestatic d : (Landroid/content/Context;Landroidx/appcompat/widget/f;I)Landroidx/appcompat/widget/c0;
    //   240: putfield f : Landroidx/appcompat/widget/c0;
    //   243: getstatic b/a/j.AppCompatTextHelper_android_drawableEnd : I
    //   246: istore #10
    //   248: aload #6
    //   250: iload #10
    //   252: invokevirtual s : (I)Z
    //   255: ifeq -> 276
    //   258: aload_0
    //   259: aload_3
    //   260: aload #4
    //   262: aload #6
    //   264: iload #10
    //   266: iconst_0
    //   267: invokevirtual n : (II)I
    //   270: invokestatic d : (Landroid/content/Context;Landroidx/appcompat/widget/f;I)Landroidx/appcompat/widget/c0;
    //   273: putfield g : Landroidx/appcompat/widget/c0;
    //   276: aload #6
    //   278: invokevirtual w : ()V
    //   281: aload_0
    //   282: getfield a : Landroid/widget/TextView;
    //   285: invokevirtual getTransformationMethod : ()Landroid/text/method/TransformationMethod;
    //   288: instanceof android/text/method/PasswordTransformationMethod
    //   291: istore #11
    //   293: iload #8
    //   295: iconst_m1
    //   296: if_icmpeq -> 565
    //   299: aload_3
    //   300: iload #8
    //   302: getstatic b/a/j.TextAppearance : [I
    //   305: invokestatic t : (Landroid/content/Context;I[I)Landroidx/appcompat/widget/e0;
    //   308: astore #12
    //   310: iload #11
    //   312: ifne -> 346
    //   315: getstatic b/a/j.TextAppearance_textAllCaps : I
    //   318: istore #8
    //   320: aload #12
    //   322: iload #8
    //   324: invokevirtual s : (I)Z
    //   327: ifeq -> 346
    //   330: aload #12
    //   332: iload #8
    //   334: iconst_0
    //   335: invokevirtual a : (IZ)Z
    //   338: istore #13
    //   340: iconst_1
    //   341: istore #8
    //   343: goto -> 352
    //   346: iconst_0
    //   347: istore #13
    //   349: iconst_0
    //   350: istore #8
    //   352: aload_0
    //   353: aload_3
    //   354: aload #12
    //   356: invokespecial C : (Landroid/content/Context;Landroidx/appcompat/widget/e0;)V
    //   359: iload #9
    //   361: bipush #23
    //   363: if_icmpge -> 469
    //   366: getstatic b/a/j.TextAppearance_android_textColor : I
    //   369: istore #10
    //   371: aload #12
    //   373: iload #10
    //   375: invokevirtual s : (I)Z
    //   378: ifeq -> 393
    //   381: aload #12
    //   383: iload #10
    //   385: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   388: astore #6
    //   390: goto -> 396
    //   393: aconst_null
    //   394: astore #6
    //   396: getstatic b/a/j.TextAppearance_android_textColorHint : I
    //   399: istore #10
    //   401: aload #12
    //   403: iload #10
    //   405: invokevirtual s : (I)Z
    //   408: ifeq -> 423
    //   411: aload #12
    //   413: iload #10
    //   415: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   418: astore #7
    //   420: goto -> 426
    //   423: aconst_null
    //   424: astore #7
    //   426: getstatic b/a/j.TextAppearance_android_textColorLink : I
    //   429: istore #10
    //   431: aload #6
    //   433: astore #14
    //   435: aload #7
    //   437: astore #5
    //   439: aload #12
    //   441: iload #10
    //   443: invokevirtual s : (I)Z
    //   446: ifeq -> 475
    //   449: aload #12
    //   451: iload #10
    //   453: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   456: astore #15
    //   458: aload #6
    //   460: astore #14
    //   462: aload #7
    //   464: astore #6
    //   466: goto -> 482
    //   469: aconst_null
    //   470: astore #14
    //   472: aconst_null
    //   473: astore #5
    //   475: aconst_null
    //   476: astore #15
    //   478: aload #5
    //   480: astore #6
    //   482: getstatic b/a/j.TextAppearance_textLocale : I
    //   485: istore #10
    //   487: aload #12
    //   489: iload #10
    //   491: invokevirtual s : (I)Z
    //   494: ifeq -> 509
    //   497: aload #12
    //   499: iload #10
    //   501: invokevirtual o : (I)Ljava/lang/String;
    //   504: astore #16
    //   506: goto -> 512
    //   509: aconst_null
    //   510: astore #16
    //   512: iload #9
    //   514: bipush #26
    //   516: if_icmplt -> 546
    //   519: getstatic b/a/j.TextAppearance_fontVariationSettings : I
    //   522: istore #10
    //   524: aload #12
    //   526: iload #10
    //   528: invokevirtual s : (I)Z
    //   531: ifeq -> 546
    //   534: aload #12
    //   536: iload #10
    //   538: invokevirtual o : (I)Ljava/lang/String;
    //   541: astore #5
    //   543: goto -> 549
    //   546: aconst_null
    //   547: astore #5
    //   549: aload #12
    //   551: invokevirtual w : ()V
    //   554: aload #14
    //   556: astore #7
    //   558: aload #16
    //   560: astore #14
    //   562: goto -> 586
    //   565: aconst_null
    //   566: astore #5
    //   568: aconst_null
    //   569: astore #7
    //   571: aconst_null
    //   572: astore #14
    //   574: iconst_0
    //   575: istore #13
    //   577: aconst_null
    //   578: astore #6
    //   580: aconst_null
    //   581: astore #15
    //   583: iconst_0
    //   584: istore #8
    //   586: aload_3
    //   587: aload_1
    //   588: getstatic b/a/j.TextAppearance : [I
    //   591: iload_2
    //   592: iconst_0
    //   593: invokestatic v : (Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroidx/appcompat/widget/e0;
    //   596: astore #17
    //   598: iload #11
    //   600: ifne -> 634
    //   603: getstatic b/a/j.TextAppearance_textAllCaps : I
    //   606: istore #10
    //   608: aload #17
    //   610: iload #10
    //   612: invokevirtual s : (I)Z
    //   615: ifeq -> 634
    //   618: aload #17
    //   620: iload #10
    //   622: iconst_0
    //   623: invokevirtual a : (IZ)Z
    //   626: istore #13
    //   628: iconst_1
    //   629: istore #8
    //   631: goto -> 634
    //   634: aload #7
    //   636: astore #12
    //   638: aload #6
    //   640: astore #18
    //   642: aload #15
    //   644: astore #16
    //   646: iload #9
    //   648: bipush #23
    //   650: if_icmpge -> 745
    //   653: getstatic b/a/j.TextAppearance_android_textColor : I
    //   656: istore #10
    //   658: aload #17
    //   660: iload #10
    //   662: invokevirtual s : (I)Z
    //   665: ifeq -> 677
    //   668: aload #17
    //   670: iload #10
    //   672: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   675: astore #7
    //   677: getstatic b/a/j.TextAppearance_android_textColorHint : I
    //   680: istore #10
    //   682: aload #17
    //   684: iload #10
    //   686: invokevirtual s : (I)Z
    //   689: ifeq -> 701
    //   692: aload #17
    //   694: iload #10
    //   696: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   699: astore #6
    //   701: getstatic b/a/j.TextAppearance_android_textColorLink : I
    //   704: istore #10
    //   706: aload #7
    //   708: astore #12
    //   710: aload #6
    //   712: astore #18
    //   714: aload #15
    //   716: astore #16
    //   718: aload #17
    //   720: iload #10
    //   722: invokevirtual s : (I)Z
    //   725: ifeq -> 745
    //   728: aload #17
    //   730: iload #10
    //   732: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   735: astore #16
    //   737: aload #6
    //   739: astore #18
    //   741: aload #7
    //   743: astore #12
    //   745: getstatic b/a/j.TextAppearance_textLocale : I
    //   748: istore #10
    //   750: aload #17
    //   752: iload #10
    //   754: invokevirtual s : (I)Z
    //   757: ifeq -> 769
    //   760: aload #17
    //   762: iload #10
    //   764: invokevirtual o : (I)Ljava/lang/String;
    //   767: astore #14
    //   769: iload #9
    //   771: bipush #26
    //   773: if_icmplt -> 803
    //   776: getstatic b/a/j.TextAppearance_fontVariationSettings : I
    //   779: istore #10
    //   781: aload #17
    //   783: iload #10
    //   785: invokevirtual s : (I)Z
    //   788: ifeq -> 803
    //   791: aload #17
    //   793: iload #10
    //   795: invokevirtual o : (I)Ljava/lang/String;
    //   798: astore #6
    //   800: goto -> 807
    //   803: aload #5
    //   805: astore #6
    //   807: iload #9
    //   809: bipush #28
    //   811: if_icmplt -> 852
    //   814: getstatic b/a/j.TextAppearance_android_textSize : I
    //   817: istore #10
    //   819: aload #17
    //   821: iload #10
    //   823: invokevirtual s : (I)Z
    //   826: ifeq -> 852
    //   829: aload #17
    //   831: iload #10
    //   833: iconst_m1
    //   834: invokevirtual f : (II)I
    //   837: ifne -> 852
    //   840: aload_0
    //   841: getfield a : Landroid/widget/TextView;
    //   844: iconst_0
    //   845: fconst_0
    //   846: invokevirtual setTextSize : (IF)V
    //   849: goto -> 852
    //   852: aload_0
    //   853: aload_3
    //   854: aload #17
    //   856: invokespecial C : (Landroid/content/Context;Landroidx/appcompat/widget/e0;)V
    //   859: aload #17
    //   861: invokevirtual w : ()V
    //   864: aload #12
    //   866: ifnull -> 878
    //   869: aload_0
    //   870: getfield a : Landroid/widget/TextView;
    //   873: aload #12
    //   875: invokevirtual setTextColor : (Landroid/content/res/ColorStateList;)V
    //   878: aload #18
    //   880: ifnull -> 892
    //   883: aload_0
    //   884: getfield a : Landroid/widget/TextView;
    //   887: aload #18
    //   889: invokevirtual setHintTextColor : (Landroid/content/res/ColorStateList;)V
    //   892: aload #16
    //   894: ifnull -> 906
    //   897: aload_0
    //   898: getfield a : Landroid/widget/TextView;
    //   901: aload #16
    //   903: invokevirtual setLinkTextColor : (Landroid/content/res/ColorStateList;)V
    //   906: iload #11
    //   908: ifne -> 922
    //   911: iload #8
    //   913: ifeq -> 922
    //   916: aload_0
    //   917: iload #13
    //   919: invokevirtual s : (Z)V
    //   922: aload_0
    //   923: getfield l : Landroid/graphics/Typeface;
    //   926: astore #7
    //   928: aload #7
    //   930: ifnull -> 966
    //   933: aload_0
    //   934: getfield k : I
    //   937: iconst_m1
    //   938: if_icmpne -> 957
    //   941: aload_0
    //   942: getfield a : Landroid/widget/TextView;
    //   945: aload #7
    //   947: aload_0
    //   948: getfield j : I
    //   951: invokevirtual setTypeface : (Landroid/graphics/Typeface;I)V
    //   954: goto -> 966
    //   957: aload_0
    //   958: getfield a : Landroid/widget/TextView;
    //   961: aload #7
    //   963: invokevirtual setTypeface : (Landroid/graphics/Typeface;)V
    //   966: aload #6
    //   968: ifnull -> 981
    //   971: aload_0
    //   972: getfield a : Landroid/widget/TextView;
    //   975: aload #6
    //   977: invokevirtual setFontVariationSettings : (Ljava/lang/String;)Z
    //   980: pop
    //   981: aload #14
    //   983: ifnull -> 1042
    //   986: iload #9
    //   988: bipush #24
    //   990: if_icmplt -> 1008
    //   993: aload_0
    //   994: getfield a : Landroid/widget/TextView;
    //   997: aload #14
    //   999: invokestatic forLanguageTags : (Ljava/lang/String;)Landroid/os/LocaleList;
    //   1002: invokevirtual setTextLocales : (Landroid/os/LocaleList;)V
    //   1005: goto -> 1042
    //   1008: iload #9
    //   1010: bipush #21
    //   1012: if_icmplt -> 1042
    //   1015: aload #14
    //   1017: iconst_0
    //   1018: aload #14
    //   1020: bipush #44
    //   1022: invokevirtual indexOf : (I)I
    //   1025: invokevirtual substring : (II)Ljava/lang/String;
    //   1028: astore #6
    //   1030: aload_0
    //   1031: getfield a : Landroid/widget/TextView;
    //   1034: aload #6
    //   1036: invokestatic forLanguageTag : (Ljava/lang/String;)Ljava/util/Locale;
    //   1039: invokevirtual setTextLocale : (Ljava/util/Locale;)V
    //   1042: aload_0
    //   1043: getfield i : Landroidx/appcompat/widget/n;
    //   1046: aload_1
    //   1047: iload_2
    //   1048: invokevirtual t : (Landroid/util/AttributeSet;I)V
    //   1051: getstatic androidx/core/widget/b.a : Z
    //   1054: ifeq -> 1139
    //   1057: aload_0
    //   1058: getfield i : Landroidx/appcompat/widget/n;
    //   1061: invokevirtual n : ()I
    //   1064: ifeq -> 1139
    //   1067: aload_0
    //   1068: getfield i : Landroidx/appcompat/widget/n;
    //   1071: invokevirtual m : ()[I
    //   1074: astore #6
    //   1076: aload #6
    //   1078: arraylength
    //   1079: ifle -> 1139
    //   1082: aload_0
    //   1083: getfield a : Landroid/widget/TextView;
    //   1086: invokevirtual getAutoSizeStepGranularity : ()I
    //   1089: i2f
    //   1090: ldc_w -1.0
    //   1093: fcmpl
    //   1094: ifeq -> 1129
    //   1097: aload_0
    //   1098: getfield a : Landroid/widget/TextView;
    //   1101: aload_0
    //   1102: getfield i : Landroidx/appcompat/widget/n;
    //   1105: invokevirtual k : ()I
    //   1108: aload_0
    //   1109: getfield i : Landroidx/appcompat/widget/n;
    //   1112: invokevirtual j : ()I
    //   1115: aload_0
    //   1116: getfield i : Landroidx/appcompat/widget/n;
    //   1119: invokevirtual l : ()I
    //   1122: iconst_0
    //   1123: invokevirtual setAutoSizeTextTypeUniformWithConfiguration : (IIII)V
    //   1126: goto -> 1139
    //   1129: aload_0
    //   1130: getfield a : Landroid/widget/TextView;
    //   1133: aload #6
    //   1135: iconst_0
    //   1136: invokevirtual setAutoSizeTextTypeUniformWithPresetSizes : ([II)V
    //   1139: aload_3
    //   1140: aload_1
    //   1141: getstatic b/a/j.AppCompatTextView : [I
    //   1144: invokestatic u : (Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/e0;
    //   1147: astore #16
    //   1149: aload #16
    //   1151: getstatic b/a/j.AppCompatTextView_drawableLeftCompat : I
    //   1154: iconst_m1
    //   1155: invokevirtual n : (II)I
    //   1158: istore_2
    //   1159: iload_2
    //   1160: iconst_m1
    //   1161: if_icmpeq -> 1175
    //   1164: aload #4
    //   1166: aload_3
    //   1167: iload_2
    //   1168: invokevirtual c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1171: astore_1
    //   1172: goto -> 1177
    //   1175: aconst_null
    //   1176: astore_1
    //   1177: aload #16
    //   1179: getstatic b/a/j.AppCompatTextView_drawableTopCompat : I
    //   1182: iconst_m1
    //   1183: invokevirtual n : (II)I
    //   1186: istore_2
    //   1187: iload_2
    //   1188: iconst_m1
    //   1189: if_icmpeq -> 1204
    //   1192: aload #4
    //   1194: aload_3
    //   1195: iload_2
    //   1196: invokevirtual c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1199: astore #6
    //   1201: goto -> 1207
    //   1204: aconst_null
    //   1205: astore #6
    //   1207: aload #16
    //   1209: getstatic b/a/j.AppCompatTextView_drawableRightCompat : I
    //   1212: iconst_m1
    //   1213: invokevirtual n : (II)I
    //   1216: istore_2
    //   1217: iload_2
    //   1218: iconst_m1
    //   1219: if_icmpeq -> 1234
    //   1222: aload #4
    //   1224: aload_3
    //   1225: iload_2
    //   1226: invokevirtual c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1229: astore #7
    //   1231: goto -> 1237
    //   1234: aconst_null
    //   1235: astore #7
    //   1237: aload #16
    //   1239: getstatic b/a/j.AppCompatTextView_drawableBottomCompat : I
    //   1242: iconst_m1
    //   1243: invokevirtual n : (II)I
    //   1246: istore_2
    //   1247: iload_2
    //   1248: iconst_m1
    //   1249: if_icmpeq -> 1264
    //   1252: aload #4
    //   1254: aload_3
    //   1255: iload_2
    //   1256: invokevirtual c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1259: astore #5
    //   1261: goto -> 1267
    //   1264: aconst_null
    //   1265: astore #5
    //   1267: aload #16
    //   1269: getstatic b/a/j.AppCompatTextView_drawableStartCompat : I
    //   1272: iconst_m1
    //   1273: invokevirtual n : (II)I
    //   1276: istore_2
    //   1277: iload_2
    //   1278: iconst_m1
    //   1279: if_icmpeq -> 1294
    //   1282: aload #4
    //   1284: aload_3
    //   1285: iload_2
    //   1286: invokevirtual c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1289: astore #14
    //   1291: goto -> 1297
    //   1294: aconst_null
    //   1295: astore #14
    //   1297: aload #16
    //   1299: getstatic b/a/j.AppCompatTextView_drawableEndCompat : I
    //   1302: iconst_m1
    //   1303: invokevirtual n : (II)I
    //   1306: istore_2
    //   1307: iload_2
    //   1308: iconst_m1
    //   1309: if_icmpeq -> 1324
    //   1312: aload #4
    //   1314: aload_3
    //   1315: iload_2
    //   1316: invokevirtual c : (Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    //   1319: astore #15
    //   1321: goto -> 1327
    //   1324: aconst_null
    //   1325: astore #15
    //   1327: aload_0
    //   1328: aload_1
    //   1329: aload #6
    //   1331: aload #7
    //   1333: aload #5
    //   1335: aload #14
    //   1337: aload #15
    //   1339: invokespecial y : (Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    //   1342: getstatic b/a/j.AppCompatTextView_drawableTint : I
    //   1345: istore_2
    //   1346: aload #16
    //   1348: iload_2
    //   1349: invokevirtual s : (I)Z
    //   1352: ifeq -> 1370
    //   1355: aload #16
    //   1357: iload_2
    //   1358: invokevirtual c : (I)Landroid/content/res/ColorStateList;
    //   1361: astore_1
    //   1362: aload_0
    //   1363: getfield a : Landroid/widget/TextView;
    //   1366: aload_1
    //   1367: invokestatic j : (Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V
    //   1370: getstatic b/a/j.AppCompatTextView_drawableTintMode : I
    //   1373: istore_2
    //   1374: aload #16
    //   1376: iload_2
    //   1377: invokevirtual s : (I)Z
    //   1380: ifeq -> 1406
    //   1383: aload #16
    //   1385: iload_2
    //   1386: iconst_m1
    //   1387: invokevirtual k : (II)I
    //   1390: aconst_null
    //   1391: invokestatic e : (ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;
    //   1394: astore_1
    //   1395: aload_0
    //   1396: getfield a : Landroid/widget/TextView;
    //   1399: aload_1
    //   1400: invokestatic k : (Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V
    //   1403: goto -> 1406
    //   1406: aload #16
    //   1408: getstatic b/a/j.AppCompatTextView_firstBaselineToTopHeight : I
    //   1411: iconst_m1
    //   1412: invokevirtual f : (II)I
    //   1415: istore #8
    //   1417: aload #16
    //   1419: getstatic b/a/j.AppCompatTextView_lastBaselineToBottomHeight : I
    //   1422: iconst_m1
    //   1423: invokevirtual f : (II)I
    //   1426: istore_2
    //   1427: aload #16
    //   1429: getstatic b/a/j.AppCompatTextView_lineHeight : I
    //   1432: iconst_m1
    //   1433: invokevirtual f : (II)I
    //   1436: istore #9
    //   1438: aload #16
    //   1440: invokevirtual w : ()V
    //   1443: iload #8
    //   1445: iconst_m1
    //   1446: if_icmpeq -> 1458
    //   1449: aload_0
    //   1450: getfield a : Landroid/widget/TextView;
    //   1453: iload #8
    //   1455: invokestatic m : (Landroid/widget/TextView;I)V
    //   1458: iload_2
    //   1459: iconst_m1
    //   1460: if_icmpeq -> 1471
    //   1463: aload_0
    //   1464: getfield a : Landroid/widget/TextView;
    //   1467: iload_2
    //   1468: invokestatic n : (Landroid/widget/TextView;I)V
    //   1471: iload #9
    //   1473: iconst_m1
    //   1474: if_icmpeq -> 1486
    //   1477: aload_0
    //   1478: getfield a : Landroid/widget/TextView;
    //   1481: iload #9
    //   1483: invokestatic o : (Landroid/widget/TextView;I)V
    //   1486: return
  }
  
  void n(WeakReference<TextView> paramWeakReference, Typeface paramTypeface) {
    if (this.m) {
      this.l = paramTypeface;
      TextView textView = paramWeakReference.get();
      if (textView != null)
        if (w.U((View)textView)) {
          textView.post(new b(this, textView, paramTypeface, this.j));
        } else {
          textView.setTypeface(paramTypeface, this.j);
        }  
    } 
  }
  
  void o(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (!androidx.core.widget.b.a)
      c(); 
  }
  
  void p() {
    b();
  }
  
  void q(Context paramContext, int paramInt) {
    e0 e0 = e0.t(paramContext, paramInt, j.TextAppearance);
    paramInt = j.TextAppearance_textAllCaps;
    if (e0.s(paramInt))
      s(e0.a(paramInt, false)); 
    paramInt = Build.VERSION.SDK_INT;
    if (paramInt < 23) {
      int j = j.TextAppearance_android_textColor;
      if (e0.s(j)) {
        ColorStateList colorStateList = e0.c(j);
        if (colorStateList != null)
          this.a.setTextColor(colorStateList); 
      } 
      j = j.TextAppearance_android_textColorLink;
      if (e0.s(j)) {
        ColorStateList colorStateList = e0.c(j);
        if (colorStateList != null)
          this.a.setLinkTextColor(colorStateList); 
      } 
      j = j.TextAppearance_android_textColorHint;
      if (e0.s(j)) {
        ColorStateList colorStateList = e0.c(j);
        if (colorStateList != null)
          this.a.setHintTextColor(colorStateList); 
      } 
    } 
    int i = j.TextAppearance_android_textSize;
    if (e0.s(i) && e0.f(i, -1) == 0)
      this.a.setTextSize(0, 0.0F); 
    C(paramContext, e0);
    if (paramInt >= 26) {
      paramInt = j.TextAppearance_fontVariationSettings;
      if (e0.s(paramInt)) {
        String str = e0.o(paramInt);
        if (str != null)
          this.a.setFontVariationSettings(str); 
      } 
    } 
    e0.w();
    Typeface typeface = this.l;
    if (typeface != null)
      this.a.setTypeface(typeface, this.j); 
  }
  
  void r(TextView paramTextView, InputConnection paramInputConnection, EditorInfo paramEditorInfo) {
    if (Build.VERSION.SDK_INT < 30 && paramInputConnection != null)
      b.h.k.g0.a.f(paramEditorInfo, paramTextView.getText()); 
  }
  
  void s(boolean paramBoolean) {
    this.a.setAllCaps(paramBoolean);
  }
  
  void t(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.i.u(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  void u(int[] paramArrayOfint, int paramInt) {
    this.i.v(paramArrayOfint, paramInt);
  }
  
  void v(int paramInt) {
    this.i.w(paramInt);
  }
  
  void w(ColorStateList paramColorStateList) {
    boolean bool;
    if (this.h == null)
      this.h = new c0(); 
    c0 c01 = this.h;
    c01.a = paramColorStateList;
    if (paramColorStateList != null) {
      bool = true;
    } else {
      bool = false;
    } 
    c01.d = bool;
    z();
  }
  
  void x(PorterDuff.Mode paramMode) {
    boolean bool;
    if (this.h == null)
      this.h = new c0(); 
    c0 c01 = this.h;
    c01.b = paramMode;
    if (paramMode != null) {
      bool = true;
    } else {
      bool = false;
    } 
    c01.c = bool;
    z();
  }
  
  class a extends f.a {
    a(m this$0, int param1Int1, int param1Int2, WeakReference param1WeakReference) {}
    
    public void d(int param1Int) {}
    
    public void e(Typeface param1Typeface) {
      Typeface typeface = param1Typeface;
      if (Build.VERSION.SDK_INT >= 28) {
        int i = this.a;
        typeface = param1Typeface;
        if (i != -1) {
          boolean bool;
          if ((this.b & 0x2) != 0) {
            bool = true;
          } else {
            bool = false;
          } 
          typeface = Typeface.create(param1Typeface, i, bool);
        } 
      } 
      this.d.n(this.c, typeface);
    }
  }
  
  class b implements Runnable {
    b(m this$0, TextView param1TextView, Typeface param1Typeface, int param1Int) {}
    
    public void run() {
      this.b.setTypeface(this.c, this.d);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/androidx/appcompat/widget/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */