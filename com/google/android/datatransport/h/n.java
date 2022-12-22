package com.google.android.datatransport.h;

import com.google.android.datatransport.b;
import com.google.android.datatransport.d;
import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import java.util.Set;

final class n implements f {
  private final Set<b> a;
  
  private final m b;
  
  private final q c;
  
  n(Set<b> paramSet, m paramm, q paramq) {
    this.a = paramSet;
    this.b = paramm;
    this.c = paramq;
  }
  
  public <T> e<T> a(String paramString, Class<T> paramClass, b paramb, d<T, byte[]> paramd) {
    if (this.a.contains(paramb))
      return new p<T>(this.b, paramString, paramb, paramd, this.c); 
    throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[] { paramb, this.a }));
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */