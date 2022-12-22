package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.o;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

final class l {
  private float A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private int E;
  
  private StaticLayout F;
  
  private int G;
  
  private int H;
  
  private int I;
  
  private Rect J;
  
  private final float a;
  
  private final float b;
  
  private final float c;
  
  private final float d;
  
  private final float e;
  
  private final TextPaint f;
  
  private final Paint g;
  
  private CharSequence h;
  
  private Layout.Alignment i;
  
  private Bitmap j;
  
  private float k;
  
  private int l;
  
  private int m;
  
  private float n;
  
  private int o;
  
  private float p;
  
  private float q;
  
  private boolean r;
  
  private boolean s;
  
  private int t;
  
  private int u;
  
  private int v;
  
  private int w;
  
  private int x;
  
  private float y;
  
  private float z;
  
  public l(Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, new int[] { 16843287, 16843288 }, 0, 0);
    this.e = typedArray.getDimensionPixelSize(0, 0);
    this.d = typedArray.getFloat(1, 1.0F);
    typedArray.recycle();
    float f = Math.round((paramContext.getResources().getDisplayMetrics()).densityDpi * 2.0F / 160.0F);
    this.a = f;
    this.b = f;
    this.c = f;
    TextPaint textPaint = new TextPaint();
    this.f = textPaint;
    textPaint.setAntiAlias(true);
    textPaint.setSubpixelText(true);
    Paint paint = new Paint();
    this.g = paint;
    paint.setAntiAlias(true);
    paint.setStyle(Paint.Style.FILL);
  }
  
  private static boolean a(CharSequence paramCharSequence1, CharSequence paramCharSequence2) {
    return (paramCharSequence1 == paramCharSequence2 || (paramCharSequence1 != null && paramCharSequence1.equals(paramCharSequence2)));
  }
  
  @RequiresNonNull({"cueBitmap", "bitmapRect"})
  private void c(Canvas paramCanvas) {
    paramCanvas.drawBitmap(this.j, null, this.J, null);
  }
  
  private void d(Canvas paramCanvas, boolean paramBoolean) {
    if (paramBoolean) {
      e(paramCanvas);
    } else {
      e.e(this.J);
      e.e(this.j);
      c(paramCanvas);
    } 
  }
  
  private void e(Canvas paramCanvas) {
    StaticLayout staticLayout = this.F;
    if (staticLayout == null)
      return; 
    int i = paramCanvas.save();
    paramCanvas.translate(this.G, this.H);
    if (Color.alpha(this.v) > 0) {
      this.g.setColor(this.v);
      paramCanvas.drawRect(-this.I, 0.0F, (staticLayout.getWidth() + this.I), staticLayout.getHeight(), this.g);
    } 
    int j = this.x;
    boolean bool = true;
    if (j == 1) {
      this.f.setStrokeJoin(Paint.Join.ROUND);
      this.f.setStrokeWidth(this.a);
      this.f.setColor(this.w);
      this.f.setStyle(Paint.Style.FILL_AND_STROKE);
      staticLayout.draw(paramCanvas);
    } else if (j == 2) {
      TextPaint textPaint = this.f;
      float f1 = this.b;
      float f2 = this.c;
      textPaint.setShadowLayer(f1, f2, f2, this.w);
    } else if (j == 3 || j == 4) {
      if (j != 3)
        bool = false; 
      int k = -1;
      if (bool) {
        j = -1;
      } else {
        j = this.w;
      } 
      if (bool)
        k = this.w; 
      float f3 = this.b / 2.0F;
      this.f.setColor(this.t);
      this.f.setStyle(Paint.Style.FILL);
      TextPaint textPaint = this.f;
      float f2 = this.b;
      float f1 = -f3;
      textPaint.setShadowLayer(f2, f1, f1, j);
      staticLayout.draw(paramCanvas);
      this.f.setShadowLayer(this.b, f3, f3, k);
    } 
    this.f.setColor(this.t);
    this.f.setStyle(Paint.Style.FILL);
    staticLayout.draw(paramCanvas);
    this.f.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
    paramCanvas.restoreToCount(i);
  }
  
  @RequiresNonNull({"cueBitmap"})
  private void f() {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : Landroid/graphics/Bitmap;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield D : I
    //   9: istore_2
    //   10: aload_0
    //   11: getfield B : I
    //   14: istore_3
    //   15: aload_0
    //   16: getfield E : I
    //   19: istore #4
    //   21: aload_0
    //   22: getfield C : I
    //   25: istore #5
    //   27: iload_3
    //   28: i2f
    //   29: fstore #6
    //   31: iload_2
    //   32: iload_3
    //   33: isub
    //   34: i2f
    //   35: fstore #7
    //   37: fload #6
    //   39: aload_0
    //   40: getfield n : F
    //   43: fload #7
    //   45: fmul
    //   46: fadd
    //   47: fstore #8
    //   49: iload #5
    //   51: i2f
    //   52: fstore #9
    //   54: iload #4
    //   56: iload #5
    //   58: isub
    //   59: i2f
    //   60: fstore #6
    //   62: fload #9
    //   64: aload_0
    //   65: getfield k : F
    //   68: fload #6
    //   70: fmul
    //   71: fadd
    //   72: fstore #9
    //   74: fload #7
    //   76: aload_0
    //   77: getfield p : F
    //   80: fmul
    //   81: invokestatic round : (F)I
    //   84: istore_3
    //   85: aload_0
    //   86: getfield q : F
    //   89: fstore #7
    //   91: fload #7
    //   93: ldc_w -3.4028235E38
    //   96: fcmpl
    //   97: ifeq -> 113
    //   100: fload #6
    //   102: fload #7
    //   104: fmul
    //   105: invokestatic round : (F)I
    //   108: istore #4
    //   110: goto -> 132
    //   113: iload_3
    //   114: i2f
    //   115: aload_1
    //   116: invokevirtual getHeight : ()I
    //   119: i2f
    //   120: aload_1
    //   121: invokevirtual getWidth : ()I
    //   124: i2f
    //   125: fdiv
    //   126: fmul
    //   127: invokestatic round : (F)I
    //   130: istore #4
    //   132: aload_0
    //   133: getfield o : I
    //   136: istore_2
    //   137: iload_2
    //   138: iconst_2
    //   139: if_icmpne -> 156
    //   142: iload_3
    //   143: i2f
    //   144: fstore #6
    //   146: fload #8
    //   148: fload #6
    //   150: fsub
    //   151: fstore #6
    //   153: goto -> 174
    //   156: fload #8
    //   158: fstore #6
    //   160: iload_2
    //   161: iconst_1
    //   162: if_icmpne -> 174
    //   165: iload_3
    //   166: iconst_2
    //   167: idiv
    //   168: i2f
    //   169: fstore #6
    //   171: goto -> 146
    //   174: fload #6
    //   176: invokestatic round : (F)I
    //   179: istore_2
    //   180: aload_0
    //   181: getfield m : I
    //   184: istore #5
    //   186: iload #5
    //   188: iconst_2
    //   189: if_icmpne -> 207
    //   192: iload #4
    //   194: i2f
    //   195: fstore #6
    //   197: fload #9
    //   199: fload #6
    //   201: fsub
    //   202: fstore #6
    //   204: goto -> 227
    //   207: fload #9
    //   209: fstore #6
    //   211: iload #5
    //   213: iconst_1
    //   214: if_icmpne -> 227
    //   217: iload #4
    //   219: iconst_2
    //   220: idiv
    //   221: i2f
    //   222: fstore #6
    //   224: goto -> 197
    //   227: fload #6
    //   229: invokestatic round : (F)I
    //   232: istore #5
    //   234: aload_0
    //   235: new android/graphics/Rect
    //   238: dup
    //   239: iload_2
    //   240: iload #5
    //   242: iload_3
    //   243: iload_2
    //   244: iadd
    //   245: iload #4
    //   247: iload #5
    //   249: iadd
    //   250: invokespecial <init> : (IIII)V
    //   253: putfield J : Landroid/graphics/Rect;
    //   256: return
  }
  
  @RequiresNonNull({"cueText"})
  private void g() {
    SpannableStringBuilder spannableStringBuilder;
    CharSequence charSequence = this.h;
    int i = this.D - this.B;
    int j = this.E - this.C;
    this.f.setTextSize(this.y);
    int k = (int)(this.y * 0.125F + 0.5F);
    int m = k * 2;
    int n = i - m;
    float f = this.p;
    int i1 = n;
    if (f != -3.4028235E38F)
      i1 = (int)(n * f); 
    if (i1 <= 0) {
      o.f("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
      return;
    } 
    if (!this.r) {
      String str = charSequence.toString();
    } else {
      SpannableStringBuilder spannableStringBuilder1;
      if (!this.s) {
        spannableStringBuilder1 = new SpannableStringBuilder(charSequence);
        n = spannableStringBuilder1.length();
        AbsoluteSizeSpan[] arrayOfAbsoluteSizeSpan = (AbsoluteSizeSpan[])spannableStringBuilder1.getSpans(0, n, AbsoluteSizeSpan.class);
        RelativeSizeSpan[] arrayOfRelativeSizeSpan = (RelativeSizeSpan[])spannableStringBuilder1.getSpans(0, n, RelativeSizeSpan.class);
        int i5 = arrayOfAbsoluteSizeSpan.length;
        for (n = 0; n < i5; n++)
          spannableStringBuilder1.removeSpan(arrayOfAbsoluteSizeSpan[n]); 
        i5 = arrayOfRelativeSizeSpan.length;
        n = 0;
        while (true) {
          spannableStringBuilder = spannableStringBuilder1;
          if (n < i5) {
            spannableStringBuilder1.removeSpan(arrayOfRelativeSizeSpan[n]);
            n++;
            continue;
          } 
          break;
        } 
      } else {
        spannableStringBuilder = spannableStringBuilder1;
        if (this.z > 0.0F) {
          spannableStringBuilder = new SpannableStringBuilder((CharSequence)spannableStringBuilder1);
          spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)this.z), 0, spannableStringBuilder.length(), 16711680);
        } 
      } 
    } 
    if (Color.alpha(this.u) > 0) {
      spannableStringBuilder = new SpannableStringBuilder((CharSequence)spannableStringBuilder);
      spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), 0, spannableStringBuilder.length(), 16711680);
    } 
    Layout.Alignment alignment2 = this.i;
    Layout.Alignment alignment1 = alignment2;
    if (alignment2 == null)
      alignment1 = Layout.Alignment.ALIGN_CENTER; 
    StaticLayout staticLayout = new StaticLayout((CharSequence)spannableStringBuilder, this.f, i1, alignment1, this.d, this.e, true);
    this.F = staticLayout;
    int i3 = staticLayout.getHeight();
    int i4 = this.F.getLineCount();
    n = 0;
    int i2;
    for (i2 = 0; i2 < i4; i2++)
      n = Math.max((int)Math.ceil(this.F.getLineWidth(i2)), n); 
    if (this.p == -3.4028235E38F || n >= i1)
      i1 = n; 
    n = i1 + m;
    f = this.n;
    if (f != -3.4028235E38F) {
      i1 = Math.round(i * f);
      i2 = this.B;
      i1 += i2;
      i = this.o;
      if (i != 1) {
        if (i == 2)
          i1 -= n; 
      } else {
        i1 = (i1 * 2 - n) / 2;
      } 
      i2 = Math.max(i1, i2);
      i1 = Math.min(n + i2, this.D);
    } else {
      i2 = (i - n) / 2 + this.B;
      i1 = i2 + n;
    } 
    i = i1 - i2;
    if (i <= 0) {
      o.f("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
      return;
    } 
    f = this.k;
    if (f != -3.4028235E38F) {
      if (this.l == 0) {
        i1 = Math.round(j * f);
        n = this.C;
      } else {
        i1 = this.F.getLineBottom(0) - this.F.getLineTop(0);
        f = this.k;
        if (f >= 0.0F) {
          i1 = Math.round(f * i1);
          n = this.C;
        } else {
          i1 = Math.round((f + 1.0F) * i1);
          n = this.E;
        } 
      } 
      n = i1 + n;
      j = this.m;
      if (j == 2) {
        i1 = n - i3;
      } else {
        i1 = n;
        if (j == 1)
          i1 = (n * 2 - i3) / 2; 
      } 
      n = this.E;
      if (i1 + i3 > n) {
        n -= i3;
      } else {
        i3 = this.C;
        n = i1;
        if (i1 < i3)
          n = i3; 
      } 
    } else {
      n = this.E - i3 - (int)(j * this.A);
    } 
    this.F = new StaticLayout((CharSequence)spannableStringBuilder, this.f, i, alignment1, this.d, this.e, true);
    this.G = i2;
    this.H = n;
    this.I = k;
  }
  
  public void b(b paramb, boolean paramBoolean1, boolean paramBoolean2, a parama, float paramFloat1, float paramFloat2, float paramFloat3, Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool;
    if (paramb.e == null) {
      bool = true;
    } else {
      bool = false;
    } 
    int i = -16777216;
    if (bool) {
      if (TextUtils.isEmpty(paramb.c))
        return; 
      if (paramb.m && paramBoolean1) {
        i = paramb.n;
      } else {
        i = parama.d;
      } 
    } 
    if (a(this.h, paramb.c) && h0.b(this.i, paramb.d) && this.j == paramb.e && this.k == paramb.f && this.l == paramb.g && h0.b(Integer.valueOf(this.m), Integer.valueOf(paramb.h)) && this.n == paramb.i && h0.b(Integer.valueOf(this.o), Integer.valueOf(paramb.j)) && this.p == paramb.k && this.q == paramb.l && this.r == paramBoolean1 && this.s == paramBoolean2 && this.t == parama.b && this.u == parama.c && this.v == i && this.x == parama.e && this.w == parama.f && h0.b(this.f.getTypeface(), parama.g) && this.y == paramFloat1 && this.z == paramFloat2 && this.A == paramFloat3 && this.B == paramInt1 && this.C == paramInt2 && this.D == paramInt3 && this.E == paramInt4) {
      d(paramCanvas, bool);
      return;
    } 
    this.h = paramb.c;
    this.i = paramb.d;
    this.j = paramb.e;
    this.k = paramb.f;
    this.l = paramb.g;
    this.m = paramb.h;
    this.n = paramb.i;
    this.o = paramb.j;
    this.p = paramb.k;
    this.q = paramb.l;
    this.r = paramBoolean1;
    this.s = paramBoolean2;
    this.t = parama.b;
    this.u = parama.c;
    this.v = i;
    this.x = parama.e;
    this.w = parama.f;
    this.f.setTypeface(parama.g);
    this.y = paramFloat1;
    this.z = paramFloat2;
    this.A = paramFloat3;
    this.B = paramInt1;
    this.C = paramInt2;
    this.D = paramInt3;
    this.E = paramInt4;
    if (bool) {
      e.e(this.h);
      g();
    } else {
      e.e(this.j);
      f();
    } 
    d(paramCanvas, bool);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */