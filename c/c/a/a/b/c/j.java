package c.c.a.a.b.c;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class j extends WeakReference<Throwable> {
  private final int a;
  
  public j(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue) {
    super(paramThrowable, paramReferenceQueue);
    this.a = System.identityHashCode(paramThrowable);
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject != null && paramObject.getClass() == j.class) {
      if (this == paramObject)
        return true; 
      paramObject = paramObject;
      if (this.a == ((j)paramObject).a && get() == paramObject.get())
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/c/c/a/a/b/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */