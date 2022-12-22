package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.l;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public abstract class d {
  private static final Set<d> a = Collections.newSetFromMap(new WeakHashMap<d, Boolean>());
  
  public static Set<d> b() {
    synchronized (a) {
      return null;
    } 
  }
  
  public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends i, A>> T a(T paramT) {
    throw new UnsupportedOperationException();
  }
  
  public Looper c() {
    throw new UnsupportedOperationException();
  }
  
  public boolean d(l paraml) {
    throw new UnsupportedOperationException();
  }
  
  public void e() {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public static interface a extends e {}
  
  @Deprecated
  public static interface b extends j {}
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/api/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */