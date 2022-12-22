package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class wq1 {
  private final fq1 a;
  
  private final boolean b;
  
  private final cr1 c;
  
  private final int d;
  
  private wq1(cr1 paramcr1) {
    this(paramcr1, false, jq1.b, 2147483647);
  }
  
  private wq1(cr1 paramcr1, boolean paramBoolean, fq1 paramfq1, int paramInt) {
    this.c = paramcr1;
    this.b = false;
    this.a = paramfq1;
    this.d = Integer.MAX_VALUE;
  }
  
  public static wq1 b(fq1 paramfq1) {
    xq1.b(paramfq1);
    return new wq1(new zq1(paramfq1));
  }
  
  private final Iterator<String> f(CharSequence paramCharSequence) {
    return this.c.a(this, paramCharSequence);
  }
  
  public final Iterable<String> c(CharSequence paramCharSequence) {
    xq1.b(paramCharSequence);
    return new br1(this, paramCharSequence);
  }
  
  public final List<String> g(CharSequence paramCharSequence) {
    xq1.b(paramCharSequence);
    Iterator<String> iterator = f(paramCharSequence);
    ArrayList<String> arrayList = new ArrayList();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return Collections.unmodifiableList(arrayList);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/wq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */