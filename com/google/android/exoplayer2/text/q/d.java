package com.google.android.exoplayer2.text.q;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

final class d {
  public static void a(SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2, e parame) {
    if (parame.h() != -1)
      paramSpannableStringBuilder.setSpan(new StyleSpan(parame.h()), paramInt1, paramInt2, 33); 
    if (parame.m())
      paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), paramInt1, paramInt2, 33); 
    if (parame.n())
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33); 
    if (parame.k())
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(parame.c()), paramInt1, paramInt2, 33); 
    if (parame.j())
      paramSpannableStringBuilder.setSpan(new BackgroundColorSpan(parame.b()), paramInt1, paramInt2, 33); 
    if (parame.d() != null)
      paramSpannableStringBuilder.setSpan(new TypefaceSpan(parame.d()), paramInt1, paramInt2, 33); 
    if (parame.i() != null)
      paramSpannableStringBuilder.setSpan(new AlignmentSpan.Standard(parame.i()), paramInt1, paramInt2, 33); 
    int i = parame.f();
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(parame.e() / 100.0F), paramInt1, paramInt2, 33); 
      } else {
        paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(parame.e()), paramInt1, paramInt2, 33);
      } 
    } else {
      paramSpannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)parame.e(), true), paramInt1, paramInt2, 33);
    } 
  }
  
  static String b(String paramString) {
    return paramString.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
  }
  
  static void c(SpannableStringBuilder paramSpannableStringBuilder) {
    int i;
    for (i = paramSpannableStringBuilder.length() - 1; i >= 0 && paramSpannableStringBuilder.charAt(i) == ' '; i--);
    if (i >= 0 && paramSpannableStringBuilder.charAt(i) != '\n')
      paramSpannableStringBuilder.append('\n'); 
  }
  
  public static e d(e parame, String[] paramArrayOfString, Map<String, e> paramMap) {
    if (parame == null && paramArrayOfString == null)
      return null; 
    int i = 0;
    int j = 0;
    if (parame == null && paramArrayOfString.length == 1)
      return paramMap.get(paramArrayOfString[0]); 
    if (parame == null && paramArrayOfString.length > 1) {
      parame = new e();
      i = paramArrayOfString.length;
      while (j < i) {
        parame.a(paramMap.get(paramArrayOfString[j]));
        j++;
      } 
      return parame;
    } 
    if (parame != null && paramArrayOfString != null && paramArrayOfString.length == 1)
      return parame.a(paramMap.get(paramArrayOfString[0])); 
    if (parame != null && paramArrayOfString != null && paramArrayOfString.length > 1) {
      int k = paramArrayOfString.length;
      for (j = i; j < k; j++)
        parame.a(paramMap.get(paramArrayOfString[j])); 
    } 
    return parame;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/q/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */