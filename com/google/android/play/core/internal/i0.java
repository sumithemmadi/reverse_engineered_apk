package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class i0 extends WeakReference<Throwable> {
  private final int a;
  
  public i0(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue) {
    super(paramThrowable, paramReferenceQueue);
    this.a = System.identityHashCode(paramThrowable);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && paramObject.getClass() == i0.class) {
      if (this == paramObject)
        return true; 
      paramObject = paramObject;
      if (this.a == ((i0)paramObject).a && get() == paramObject.get())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */