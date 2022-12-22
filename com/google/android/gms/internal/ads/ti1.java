package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class ti1 {
  private final Pattern a;
  
  public ti1() {
    try {
      x<String> x = m0.s5;
      Pattern pattern = Pattern.compile(er2.e().<String>c(x));
    } catch (PatternSyntaxException patternSyntaxException) {
      patternSyntaxException = null;
    } 
    this.a = (Pattern)patternSyntaxException;
  }
  
  public final String a(String paramString) {
    Pattern pattern = this.a;
    if (pattern != null && paramString != null) {
      Matcher matcher = pattern.matcher(paramString);
      if (matcher.find())
        return matcher.group(); 
    } 
    return null;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ti1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */