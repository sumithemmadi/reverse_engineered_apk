package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.d;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.l;

@Keep
public class CctBackendFactory implements d {
  public l create(g paramg) {
    return new d(paramg.b(), paramg.e(), paramg.d());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/cct/CctBackendFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */