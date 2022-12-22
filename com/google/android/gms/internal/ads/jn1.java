package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

public final class jn1 {
  private final Executor a;
  
  private final em b;
  
  public jn1(Executor paramExecutor, em paramem) {
    this.a = paramExecutor;
    this.b = paramem;
  }
  
  public final void a(String paramString) {
    this.a.execute(new in1(this, paramString));
  }
  
  public final void c(List<String> paramList) {
    Iterator<String> iterator = paramList.iterator();
    while (iterator.hasNext())
      a(iterator.next()); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/jn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */