package com.google.android.gms.internal.common;

final class m<T> implements l<T> {
  private volatile l<T> b;
  
  private volatile boolean c;
  
  private T d;
  
  m(l<T> paraml) {
    this.b = j.<l<T>>a(paraml);
  }
  
  public final String toString() {
    String str2;
    l<T> l1 = this.b;
    l<T> l2 = l1;
    if (l1 == null) {
      String str = String.valueOf(this.d);
      StringBuilder stringBuilder1 = new StringBuilder(str.length() + 25);
      stringBuilder1.append("<supplier that returned ");
      stringBuilder1.append(str);
      stringBuilder1.append(">");
      str2 = stringBuilder1.toString();
    } 
    String str1 = String.valueOf(str2);
    StringBuilder stringBuilder = new StringBuilder(str1.length() + 19);
    stringBuilder.append("Suppliers.memoize(");
    stringBuilder.append(str1);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public final T zza() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Z
    //   4: ifne -> 55
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield c : Z
    //   13: ifne -> 45
    //   16: aload_0
    //   17: getfield b : Lcom/google/android/gms/internal/common/l;
    //   20: invokeinterface zza : ()Ljava/lang/Object;
    //   25: astore_1
    //   26: aload_0
    //   27: aload_1
    //   28: putfield d : Ljava/lang/Object;
    //   31: aload_0
    //   32: iconst_1
    //   33: putfield c : Z
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield b : Lcom/google/android/gms/internal/common/l;
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: aload_0
    //   46: monitorexit
    //   47: goto -> 55
    //   50: astore_1
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    //   55: aload_0
    //   56: getfield d : Ljava/lang/Object;
    //   59: areturn
    // Exception table:
    //   from	to	target	type
    //   9	43	50	finally
    //   45	47	50	finally
    //   51	53	50	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/common/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */