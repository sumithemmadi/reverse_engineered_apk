package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public final class cs1 implements FilenameFilter {
  private final Pattern a;
  
  public cs1(Pattern paramPattern) {
    this.a = xq1.<Pattern>b(paramPattern);
  }
  
  public final boolean accept(File paramFile, String paramString) {
    return this.a.matcher(paramString).matches();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/cs1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */