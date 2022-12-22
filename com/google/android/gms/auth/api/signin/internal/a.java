package com.google.android.gms.auth.api.signin.internal;

public class a {
  private static int a = 31;
  
  private int b = 1;
  
  public a a(Object paramObject) {
    int k;
    int i = a;
    int j = this.b;
    if (paramObject == null) {
      k = 0;
    } else {
      k = paramObject.hashCode();
    } 
    this.b = i * j + k;
    return this;
  }
  
  public int b() {
    return this.b;
  }
  
  public final a c(boolean paramBoolean) {
    this.b = a * this.b + paramBoolean;
    return this;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/auth/api/signin/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */