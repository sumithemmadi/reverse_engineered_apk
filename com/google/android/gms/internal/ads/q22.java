package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class q22 extends WeakReference<Throwable> {
  private final int a;
  
  public q22(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue) {
    super(paramThrowable, paramReferenceQueue);
    if (paramThrowable != null) {
      this.a = System.identityHashCode(paramThrowable);
      return;
    } 
    throw new NullPointerException("The referent cannot be null");
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && paramObject.getClass() == q22.class) {
      if (this == paramObject)
        return true; 
      paramObject = paramObject;
      if (this.a == ((q22)paramObject).a && get() == paramObject.get())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/q22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */