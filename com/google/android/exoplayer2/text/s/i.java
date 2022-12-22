package com.google.android.exoplayer2.text.s;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.text.e;
import com.google.android.exoplayer2.util.e;
import com.google.android.exoplayer2.util.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class i implements e {
  private final List<e> b;
  
  private final int c;
  
  private final long[] d;
  
  private final long[] e;
  
  public i(List<e> paramList) {
    this.b = paramList;
    int j = paramList.size();
    this.c = j;
    this.d = new long[j * 2];
    for (j = 0; j < this.c; j++) {
      e e1 = paramList.get(j);
      int k = j * 2;
      long[] arrayOfLong1 = this.d;
      arrayOfLong1[k] = e1.q;
      arrayOfLong1[k + 1] = e1.r;
    } 
    long[] arrayOfLong = this.d;
    arrayOfLong = Arrays.copyOf(arrayOfLong, arrayOfLong.length);
    this.e = arrayOfLong;
    Arrays.sort(arrayOfLong);
  }
  
  public int a(long paramLong) {
    int j = h0.d(this.e, paramLong, false, false);
    if (j >= this.e.length)
      j = -1; 
    return j;
  }
  
  public long e(int paramInt) {
    boolean bool2;
    boolean bool1 = true;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    if (paramInt < this.e.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    } 
    e.a(bool2);
    return this.e[paramInt];
  }
  
  public List<b> f(long paramLong) {
    ArrayList<e> arrayList = new ArrayList();
    SpannableStringBuilder spannableStringBuilder = null;
    e e1 = null;
    byte b = 0;
    while (b < this.c) {
      long[] arrayOfLong = this.d;
      int j = b * 2;
      SpannableStringBuilder spannableStringBuilder1 = spannableStringBuilder;
      e e2 = e1;
      if (arrayOfLong[j] <= paramLong) {
        spannableStringBuilder1 = spannableStringBuilder;
        e2 = e1;
        if (paramLong < arrayOfLong[j + 1]) {
          e2 = this.b.get(b);
          if (e2.a()) {
            if (e1 == null) {
              spannableStringBuilder1 = spannableStringBuilder;
            } else if (spannableStringBuilder == null) {
              spannableStringBuilder1 = new SpannableStringBuilder();
              spannableStringBuilder1.append((CharSequence)e.e(e1.c)).append("\n").append((CharSequence)e.e(e2.c));
              e2 = e1;
            } else {
              spannableStringBuilder.append("\n").append((CharSequence)e.e(e2.c));
              spannableStringBuilder1 = spannableStringBuilder;
              e2 = e1;
            } 
          } else {
            arrayList.add(e2);
            e2 = e1;
            spannableStringBuilder1 = spannableStringBuilder;
          } 
        } 
      } 
      b++;
      spannableStringBuilder = spannableStringBuilder1;
      e1 = e2;
    } 
    if (spannableStringBuilder != null) {
      arrayList.add((new e.b()).o((CharSequence)spannableStringBuilder).a());
    } else if (e1 != null) {
      arrayList.add(e1);
    } 
    return (List)arrayList;
  }
  
  public int i() {
    return this.e.length;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */