package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.a;
import com.google.firebase.encoders.h.d;
import java.util.List;

@AutoValue
public abstract class j {
  public static j a(List<l> paramList) {
    return new d(paramList);
  }
  
  public static a b() {
    return (new d()).g(b.a).h(true).f();
  }
  
  public abstract List<l> c();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */