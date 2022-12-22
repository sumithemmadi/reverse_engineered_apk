package com.google.android.datatransport.h;

import com.google.android.datatransport.b;
import com.google.android.datatransport.c;
import com.google.android.datatransport.d;
import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
abstract class l {
  public static a a() {
    return new b.b();
  }
  
  public abstract b b();
  
  abstract c<?> c();
  
  public byte[] d() {
    return (byte[])e().a(c().b());
  }
  
  abstract d<?, byte[]> e();
  
  public abstract m f();
  
  public abstract String g();
  
  @Builder
  public static abstract class a {
    public abstract l a();
    
    abstract a b(b param1b);
    
    abstract a c(c<?> param1c);
    
    abstract a d(d<?, byte[]> param1d);
    
    public abstract a e(m param1m);
    
    public abstract a f(String param1String);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */