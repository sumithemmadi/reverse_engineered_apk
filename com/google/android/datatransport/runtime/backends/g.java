package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.h.y.a;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {
  public static g a(Context paramContext, a parama1, a parama2, String paramString) {
    return new c(paramContext, parama1, parama2, paramString);
  }
  
  public abstract Context b();
  
  public abstract String c();
  
  public abstract a d();
  
  public abstract a e();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/runtime/backends/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */