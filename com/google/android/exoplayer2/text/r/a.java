package com.google.android.exoplayer2.text.r;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.c;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import java.nio.charset.Charset;
import java.util.List;

public final class a extends c {
  private final v o = new v();
  
  private boolean p;
  
  private int q;
  
  private int r;
  
  private String s;
  
  private float t;
  
  private int u;
  
  public a(List<byte[]> paramList) {
    super("Tx3gDecoder");
    String str = "sans-serif";
    boolean bool = false;
    if (paramList != null && paramList.size() == 1 && (((byte[])paramList.get(0)).length == 48 || ((byte[])paramList.get(0)).length == 53)) {
      byte[] arrayOfByte = paramList.get(0);
      this.q = arrayOfByte[24];
      this.r = (arrayOfByte[26] & 0xFF) << 24 | (arrayOfByte[27] & 0xFF) << 16 | (arrayOfByte[28] & 0xFF) << 8 | arrayOfByte[29] & 0xFF;
      String str1 = str;
      if ("Serif".equals(h0.w(arrayOfByte, 43, arrayOfByte.length - 43)))
        str1 = "serif"; 
      this.s = str1;
      int i = arrayOfByte[25] * 20;
      this.u = i;
      if ((arrayOfByte[0] & 0x20) != 0)
        bool = true; 
      this.p = bool;
      if (bool) {
        byte b = arrayOfByte[10];
        float f = (arrayOfByte[11] & 0xFF | (b & 0xFF) << 8) / i;
        this.t = f;
        this.t = h0.m(f, 0.0F, 0.95F);
      } else {
        this.t = 0.85F;
      } 
    } else {
      this.q = 0;
      this.r = -1;
      this.s = "sans-serif";
      this.p = false;
      this.t = 0.85F;
    } 
  }
  
  private void C(v paramv, SpannableStringBuilder paramSpannableStringBuilder) {
    boolean bool;
    if (paramv.a() >= 12) {
      bool = true;
    } else {
      bool = false;
    } 
    D(bool);
    int i = paramv.F();
    int j = paramv.F();
    paramv.N(2);
    int k = paramv.z();
    paramv.N(1);
    int m = paramv.k();
    F(paramSpannableStringBuilder, k, this.q, i, j, 0);
    E(paramSpannableStringBuilder, m, this.r, i, j, 0);
  }
  
  private static void D(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new SubtitleDecoderException("Unexpected subtitle format.");
  }
  
  private static void E(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 != paramInt2)
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramInt1 >>> 8 | (paramInt1 & 0xFF) << 24), paramInt3, paramInt4, paramInt5 | 0x21); 
  }
  
  private static void F(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt1 != paramInt2) {
      int i = paramInt5 | 0x21;
      boolean bool = true;
      if ((paramInt1 & 0x1) != 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      } 
      if ((paramInt1 & 0x2) != 0) {
        paramInt5 = 1;
      } else {
        paramInt5 = 0;
      } 
      if (paramInt2 != 0) {
        if (paramInt5 != 0) {
          paramSpannableStringBuilder.setSpan(new StyleSpan(3), paramInt3, paramInt4, i);
        } else {
          paramSpannableStringBuilder.setSpan(new StyleSpan(1), paramInt3, paramInt4, i);
        } 
      } else if (paramInt5 != 0) {
        paramSpannableStringBuilder.setSpan(new StyleSpan(2), paramInt3, paramInt4, i);
      } 
      if ((paramInt1 & 0x4) != 0) {
        paramInt1 = bool;
      } else {
        paramInt1 = 0;
      } 
      if (paramInt1 != 0)
        paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt3, paramInt4, i); 
      if (paramInt1 == 0 && paramInt2 == 0 && paramInt5 == 0)
        paramSpannableStringBuilder.setSpan(new StyleSpan(0), paramInt3, paramInt4, i); 
    } 
  }
  
  private static void G(SpannableStringBuilder paramSpannableStringBuilder, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3) {
    if (paramString1 != paramString2)
      paramSpannableStringBuilder.setSpan(new TypefaceSpan(paramString1), paramInt1, paramInt2, paramInt3 | 0x21); 
  }
  
  private static String H(v paramv) {
    boolean bool;
    if (paramv.a() >= 2) {
      bool = true;
    } else {
      bool = false;
    } 
    D(bool);
    int i = paramv.F();
    if (i == 0)
      return ""; 
    if (paramv.a() >= 2) {
      char c1 = paramv.e();
      if (c1 == '﻿' || c1 == '￾')
        return paramv.x(i, Charset.forName("UTF-16")); 
    } 
    return paramv.x(i, Charset.forName("UTF-8"));
  }
  
  protected e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    this.o.K(paramArrayOfbyte, paramInt);
    String str = H(this.o);
    if (str.isEmpty())
      return b.b; 
    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
    F(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
    E(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
    G(spannableStringBuilder, this.s, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
    float f;
    for (f = this.t; this.o.a() >= 8; f = f1) {
      float f1;
      int i = this.o.c();
      int j = this.o.k();
      int k = this.o.k();
      boolean bool = true;
      paramBoolean = true;
      paramInt = 0;
      if (k == 1937013100) {
        if (this.o.a() < 2)
          paramBoolean = false; 
        D(paramBoolean);
        k = this.o.F();
        while (true) {
          f1 = f;
          if (paramInt < k) {
            C(this.o, spannableStringBuilder);
            paramInt++;
            continue;
          } 
          break;
        } 
      } else {
        f1 = f;
        if (k == 1952608120) {
          f1 = f;
          if (this.p) {
            if (this.o.a() >= 2) {
              paramBoolean = bool;
            } else {
              paramBoolean = false;
            } 
            D(paramBoolean);
            f1 = h0.m(this.o.F() / this.u, 0.0F, 0.95F);
          } 
        } 
      } 
      this.o.M(i + j);
    } 
    return new b(new b((CharSequence)spannableStringBuilder, null, f, 0, 0, -3.4028235E38F, -2147483648, -3.4028235E38F));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/r/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */