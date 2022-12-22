package com.google.android.gms.internal.common;

import java.io.Serializable;

final class zzq<T> implements l<T>, Serializable {
  private volatile transient boolean b;
  
  private transient T c;
  
  private final l<T> zza;
  
  zzq(l<T> paraml) {
    this.zza = j.<l<T>>a(paraml);
  }
  
  public final String toString() {
    l<T> l1;
    if (this.b) {
      String str1 = String.valueOf(this.c);
      StringBuilder stringBuilder1 = new StringBuilder(str1.length() + 25);
      stringBuilder1.append("<supplier that returned ");
      stringBuilder1.append(str1);
      stringBuilder1.append(">");
      str1 = stringBuilder1.toString();
    } else {
      l1 = this.zza;
    } 
    String str = String.valueOf(l1);
    StringBuilder stringBuilder = new StringBuilder(str.length() + 19);
    stringBuilder.append("Suppliers.memoize(");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  public final T zza() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Z
    //   4: ifne -> 50
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield b : Z
    //   13: ifne -> 40
    //   16: aload_0
    //   17: getfield zza : Lcom/google/android/gms/internal/common/l;
    //   20: invokeinterface zza : ()Ljava/lang/Object;
    //   25: astore_1
    //   26: aload_0
    //   27: aload_1
    //   28: putfield c : Ljava/lang/Object;
    //   31: aload_0
    //   32: iconst_1
    //   33: putfield b : Z
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: areturn
    //   40: aload_0
    //   41: monitorexit
    //   42: goto -> 50
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_1
    //   49: athrow
    //   50: aload_0
    //   51: getfield c : Ljava/lang/Object;
    //   54: areturn
    // Exception table:
    //   from	to	target	type
    //   9	38	45	finally
    //   40	42	45	finally
    //   46	48	45	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/common/zzq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */