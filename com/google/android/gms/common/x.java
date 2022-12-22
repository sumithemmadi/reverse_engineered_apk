package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class x extends v {
  private final Callable<String> e;
  
  private x(Callable<String> paramCallable) {
    super(false, null, null);
    this.e = paramCallable;
  }
  
  final String f() {
    try {
      return this.e.call();
    } catch (Exception exception) {
      throw new RuntimeException(exception);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */