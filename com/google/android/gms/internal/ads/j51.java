package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

final class j51 implements s91<t91<Bundle>> {
  private final Set<String> a;
  
  j51(Set<String> paramSet) {
    this.a = paramSet;
  }
  
  public final ot1<t91<Bundle>> a() {
    ArrayList<String> arrayList = new ArrayList();
    Iterator<String> iterator = this.a.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    return dt1.h(new i51(arrayList));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */