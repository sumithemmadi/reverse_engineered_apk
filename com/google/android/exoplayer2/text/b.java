package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;

public class b {
  public static final b b = new b("");
  
  public final CharSequence c;
  
  public final Layout.Alignment d;
  
  public final Bitmap e;
  
  public final float f;
  
  public final int g;
  
  public final int h;
  
  public final float i;
  
  public final int j;
  
  public final float k;
  
  public final float l;
  
  public final boolean m;
  
  public final int n;
  
  public final int o;
  
  public final float p;
  
  public b(Bitmap paramBitmap, float paramFloat1, int paramInt1, float paramFloat2, int paramInt2, float paramFloat3, float paramFloat4) {
    this(null, null, paramBitmap, paramFloat2, 0, paramInt2, paramFloat1, paramInt1, -2147483648, -3.4028235E38F, paramFloat3, paramFloat4, false, -16777216);
  }
  
  public b(CharSequence paramCharSequence) {
    this(paramCharSequence, null, -3.4028235E38F, -2147483648, -2147483648, -3.4028235E38F, -2147483648, -3.4028235E38F);
  }
  
  public b(CharSequence paramCharSequence, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, float paramFloat3) {
    this(paramCharSequence, paramAlignment, paramFloat1, paramInt1, paramInt2, paramFloat2, paramInt3, paramFloat3, false, -16777216);
  }
  
  public b(CharSequence paramCharSequence, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, float paramFloat3, int paramInt4, float paramFloat4) {
    this(paramCharSequence, paramAlignment, null, paramFloat1, paramInt1, paramInt2, paramFloat2, paramInt3, paramInt4, paramFloat4, paramFloat3, -3.4028235E38F, false, -16777216);
  }
  
  public b(CharSequence paramCharSequence, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, float paramFloat3, boolean paramBoolean, int paramInt4) {
    this(paramCharSequence, paramAlignment, null, paramFloat1, paramInt1, paramInt2, paramFloat2, paramInt3, -2147483648, -3.4028235E38F, paramFloat3, -3.4028235E38F, paramBoolean, paramInt4);
  }
  
  private b(CharSequence paramCharSequence, Layout.Alignment paramAlignment, Bitmap paramBitmap, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, int paramInt4, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean, int paramInt5) {
    this.c = paramCharSequence;
    this.d = paramAlignment;
    this.e = paramBitmap;
    this.f = paramFloat1;
    this.g = paramInt1;
    this.h = paramInt2;
    this.i = paramFloat2;
    this.j = paramInt3;
    this.k = paramFloat4;
    this.l = paramFloat5;
    this.m = paramBoolean;
    this.n = paramInt5;
    this.o = paramInt4;
    this.p = paramFloat3;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */