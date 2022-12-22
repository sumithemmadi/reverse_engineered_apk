package com.google.android.exoplayer2.text;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.util.h0;

public final class a {
  public static final a a = new a(-1, -16777216, 0, 0, -1, null);
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final int e;
  
  public final int f;
  
  public final Typeface g;
  
  public a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, Typeface paramTypeface) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramTypeface;
  }
  
  @TargetApi(19)
  public static a a(CaptioningManager.CaptionStyle paramCaptionStyle) {
    return (h0.a >= 21) ? c(paramCaptionStyle) : b(paramCaptionStyle);
  }
  
  @TargetApi(19)
  private static a b(CaptioningManager.CaptionStyle paramCaptionStyle) {
    return new a(paramCaptionStyle.foregroundColor, paramCaptionStyle.backgroundColor, 0, paramCaptionStyle.edgeType, paramCaptionStyle.edgeColor, paramCaptionStyle.getTypeface());
  }
  
  @TargetApi(21)
  private static a c(CaptioningManager.CaptionStyle paramCaptionStyle) {
    int i;
    int j;
    int k;
    int m;
    int n;
    if (paramCaptionStyle.hasForegroundColor()) {
      i = paramCaptionStyle.foregroundColor;
    } else {
      i = a.b;
    } 
    if (paramCaptionStyle.hasBackgroundColor()) {
      j = paramCaptionStyle.backgroundColor;
    } else {
      j = a.c;
    } 
    if (paramCaptionStyle.hasWindowColor()) {
      k = paramCaptionStyle.windowColor;
    } else {
      k = a.d;
    } 
    if (paramCaptionStyle.hasEdgeType()) {
      m = paramCaptionStyle.edgeType;
    } else {
      m = a.e;
    } 
    if (paramCaptionStyle.hasEdgeColor()) {
      n = paramCaptionStyle.edgeColor;
    } else {
      n = a.f;
    } 
    return new a(i, j, k, m, n, paramCaptionStyle.getTypeface());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */