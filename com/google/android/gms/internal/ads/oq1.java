package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

public final class oq1 {
  private final String a;
  
  private oq1(String paramString) {
    this.a = xq1.<String>b(paramString);
  }
  
  public static oq1 b(String paramString) {
    return new oq1(paramString);
  }
  
  private static CharSequence c(Object paramObject) {
    xq1.b(paramObject);
    return (paramObject instanceof CharSequence) ? (CharSequence)paramObject : paramObject.toString();
  }
  
  public final StringBuilder a(StringBuilder paramStringBuilder, Iterator<?> paramIterator) {
    try {
      xq1.b(paramStringBuilder);
      if (paramIterator.hasNext()) {
        paramStringBuilder.append(c(paramIterator.next()));
        while (paramIterator.hasNext()) {
          paramStringBuilder.append(this.a);
          paramStringBuilder.append(c(paramIterator.next()));
        } 
      } 
      return paramStringBuilder;
    } catch (IOException iOException) {
      AssertionError assertionError = new AssertionError(iOException);
      throw assertionError;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/oq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */