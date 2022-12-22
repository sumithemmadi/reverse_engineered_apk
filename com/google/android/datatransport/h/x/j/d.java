package com.google.android.datatransport.h.x.j;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;

@AutoValue
abstract class d {
  static final d a = a().f(10485760L).d(200).b(10000).c(604800000L).e(81920).a();
  
  static a a() {
    return new a.b();
  }
  
  abstract int b();
  
  abstract long c();
  
  abstract int d();
  
  abstract int e();
  
  abstract long f();
  
  @Builder
  static abstract class a {
    abstract d a();
    
    abstract a b(int param1Int);
    
    abstract a c(long param1Long);
    
    abstract a d(int param1Int);
    
    abstract a e(int param1Int);
    
    abstract a f(long param1Long);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/x/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */