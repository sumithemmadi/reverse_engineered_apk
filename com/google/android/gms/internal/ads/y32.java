package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

public class y32 {
  private static volatile y32 a;
  
  private static volatile y32 b;
  
  private static final y32 c = new y32(true);
  
  private final Map<a, k42.f<?, ?>> d = new HashMap<a, k42.f<?, ?>>();
  
  y32() {}
  
  private y32(boolean paramBoolean) {}
  
  public static y32 b() {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/y32.a : Lcom/google/android/gms/internal/ads/y32;
    //   3: astore_0
    //   4: aload_0
    //   5: astore_1
    //   6: aload_0
    //   7: ifnonnull -> 43
    //   10: ldc com/google/android/gms/internal/ads/y32
    //   12: monitorenter
    //   13: getstatic com/google/android/gms/internal/ads/y32.a : Lcom/google/android/gms/internal/ads/y32;
    //   16: astore_0
    //   17: aload_0
    //   18: astore_1
    //   19: aload_0
    //   20: ifnonnull -> 31
    //   23: getstatic com/google/android/gms/internal/ads/y32.c : Lcom/google/android/gms/internal/ads/y32;
    //   26: astore_1
    //   27: aload_1
    //   28: putstatic com/google/android/gms/internal/ads/y32.a : Lcom/google/android/gms/internal/ads/y32;
    //   31: ldc com/google/android/gms/internal/ads/y32
    //   33: monitorexit
    //   34: goto -> 43
    //   37: astore_1
    //   38: ldc com/google/android/gms/internal/ads/y32
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    //   43: aload_1
    //   44: areturn
    // Exception table:
    //   from	to	target	type
    //   13	17	37	finally
    //   23	31	37	finally
    //   31	34	37	finally
    //   38	41	37	finally
  }
  
  public static y32 c() {
    // Byte code:
    //   0: getstatic com/google/android/gms/internal/ads/y32.b : Lcom/google/android/gms/internal/ads/y32;
    //   3: astore_0
    //   4: aload_0
    //   5: ifnull -> 10
    //   8: aload_0
    //   9: areturn
    //   10: ldc com/google/android/gms/internal/ads/y32
    //   12: monitorenter
    //   13: getstatic com/google/android/gms/internal/ads/y32.b : Lcom/google/android/gms/internal/ads/y32;
    //   16: astore_0
    //   17: aload_0
    //   18: ifnull -> 26
    //   21: ldc com/google/android/gms/internal/ads/y32
    //   23: monitorexit
    //   24: aload_0
    //   25: areturn
    //   26: ldc com/google/android/gms/internal/ads/y32
    //   28: invokestatic b : (Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/y32;
    //   31: astore_0
    //   32: aload_0
    //   33: putstatic com/google/android/gms/internal/ads/y32.b : Lcom/google/android/gms/internal/ads/y32;
    //   36: ldc com/google/android/gms/internal/ads/y32
    //   38: monitorexit
    //   39: aload_0
    //   40: areturn
    //   41: astore_0
    //   42: ldc com/google/android/gms/internal/ads/y32
    //   44: monitorexit
    //   45: aload_0
    //   46: athrow
    // Exception table:
    //   from	to	target	type
    //   13	17	41	finally
    //   21	24	41	finally
    //   26	39	41	finally
    //   42	45	41	finally
  }
  
  public final <ContainingType extends u52> k42.f<ContainingType, ?> a(ContainingType paramContainingType, int paramInt) {
    return (k42.f<ContainingType, ?>)this.d.get(new a(paramContainingType, paramInt));
  }
  
  private static final class a {
    private final Object a;
    
    private final int b;
    
    a(Object param1Object, int param1Int) {
      this.a = param1Object;
      this.b = param1Int;
    }
    
    public final boolean equals(Object param1Object) {
      if (!(param1Object instanceof a))
        return false; 
      param1Object = param1Object;
      return (this.a == ((a)param1Object).a && this.b == ((a)param1Object).b);
    }
    
    public final int hashCode() {
      return System.identityHashCode(this.a) * 65535 + this.b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */