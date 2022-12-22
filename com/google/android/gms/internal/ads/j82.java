package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class j82 implements z30, Closeable, Iterator<a50> {
  private static final a50 b = new m82("eof ");
  
  private static r82 c = r82.b(j82.class);
  
  protected wz d;
  
  protected l82 e;
  
  private a50 f = null;
  
  long g = 0L;
  
  long h = 0L;
  
  long i = 0L;
  
  private List<a50> j = new ArrayList<a50>();
  
  private final a50 h() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Lcom/google/android/gms/internal/ads/a50;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull -> 23
    //   9: aload_1
    //   10: getstatic com/google/android/gms/internal/ads/j82.b : Lcom/google/android/gms/internal/ads/a50;
    //   13: if_acmpeq -> 23
    //   16: aload_0
    //   17: aconst_null
    //   18: putfield f : Lcom/google/android/gms/internal/ads/a50;
    //   21: aload_1
    //   22: areturn
    //   23: aload_0
    //   24: getfield e : Lcom/google/android/gms/internal/ads/l82;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull -> 114
    //   32: aload_0
    //   33: getfield g : J
    //   36: aload_0
    //   37: getfield i : J
    //   40: lcmp
    //   41: ifge -> 114
    //   44: aload_1
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield e : Lcom/google/android/gms/internal/ads/l82;
    //   50: aload_0
    //   51: getfield g : J
    //   54: invokeinterface D : (J)V
    //   59: aload_0
    //   60: getfield d : Lcom/google/android/gms/internal/ads/wz;
    //   63: aload_0
    //   64: getfield e : Lcom/google/android/gms/internal/ads/l82;
    //   67: aload_0
    //   68: invokeinterface a : (Lcom/google/android/gms/internal/ads/l82;Lcom/google/android/gms/internal/ads/z30;)Lcom/google/android/gms/internal/ads/a50;
    //   73: astore_2
    //   74: aload_0
    //   75: aload_0
    //   76: getfield e : Lcom/google/android/gms/internal/ads/l82;
    //   79: invokeinterface K : ()J
    //   84: putfield g : J
    //   87: aload_1
    //   88: monitorexit
    //   89: aload_2
    //   90: areturn
    //   91: astore_2
    //   92: aload_1
    //   93: monitorexit
    //   94: aload_2
    //   95: athrow
    //   96: astore_1
    //   97: new java/util/NoSuchElementException
    //   100: dup
    //   101: invokespecial <init> : ()V
    //   104: athrow
    //   105: astore_1
    //   106: new java/util/NoSuchElementException
    //   109: dup
    //   110: invokespecial <init> : ()V
    //   113: athrow
    //   114: aload_0
    //   115: getstatic com/google/android/gms/internal/ads/j82.b : Lcom/google/android/gms/internal/ads/a50;
    //   118: putfield f : Lcom/google/android/gms/internal/ads/a50;
    //   121: new java/util/NoSuchElementException
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: athrow
    // Exception table:
    //   from	to	target	type
    //   44	46	105	java/io/EOFException
    //   44	46	96	java/io/IOException
    //   46	89	91	finally
    //   92	94	91	finally
    //   94	96	105	java/io/EOFException
    //   94	96	96	java/io/IOException
  }
  
  public void close() {
    this.e.close();
  }
  
  public void e(l82 paraml82, long paramLong, wz paramwz) {
    this.e = paraml82;
    long l = paraml82.K();
    this.h = l;
    this.g = l;
    paraml82.D(paraml82.K() + paramLong);
    this.i = paraml82.K();
    this.d = paramwz;
  }
  
  public final List<a50> g() {
    return (this.e != null && this.f != b) ? new p82<a50>(this.j, this) : this.j;
  }
  
  public boolean hasNext() {
    a50 a501 = this.f;
    if (a501 == b)
      return false; 
    if (a501 != null)
      return true; 
    try {
      this.f = (a50)next();
      return true;
    } catch (NoSuchElementException noSuchElementException) {
      this.f = b;
      return false;
    } 
  }
  
  public void remove() {
    throw new UnsupportedOperationException();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append("[");
    for (byte b = 0; b < this.j.size(); b++) {
      if (b > 0)
        stringBuilder.append(";"); 
      stringBuilder.append(((a50)this.j.get(b)).toString());
    } 
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/j82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */