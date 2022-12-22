package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class w22<MessageType extends w22<MessageType, BuilderType>, BuilderType extends v22<MessageType, BuilderType>> implements u52 {
  protected int zzilm = 0;
  
  protected static <T> void c(Iterable<T> paramIterable, List<? super T> paramList) {
    String str;
    m42.a(paramIterable);
    if (paramIterable instanceof b52) {
      List<?> list = ((b52)paramIterable).o();
      paramIterable = (b52)paramList;
      int j = paramList.size();
      Iterator<?> iterator = list.iterator();
      while (iterator.hasNext()) {
        list = (List<?>)iterator.next();
        if (list == null) {
          int k = paramIterable.size();
          StringBuilder stringBuilder = new StringBuilder(37);
          stringBuilder.append("Element at index ");
          stringBuilder.append(k - j);
          stringBuilder.append(" is null.");
          str = stringBuilder.toString();
          for (k = paramIterable.size() - 1; k >= j; k--)
            paramIterable.remove(k); 
          throw new NullPointerException(str);
        } 
        if (list instanceof zzejr) {
          paramIterable.L((zzejr)list);
          continue;
        } 
        paramIterable.add((T)list);
      } 
      return;
    } 
    if (paramIterable instanceof g62) {
      str.addAll((Collection)paramIterable);
      return;
    } 
    if (str instanceof ArrayList && paramIterable instanceof Collection)
      ((ArrayList)str).ensureCapacity(str.size() + ((Collection)paramIterable).size()); 
    int i = str.size();
    for (Iterable<T> paramIterable : paramIterable) {
      String str1;
      if (paramIterable == null) {
        int j = str.size();
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Element at index ");
        stringBuilder.append(j - i);
        stringBuilder.append(" is null.");
        str1 = stringBuilder.toString();
        for (j = str.size() - 1; j >= i; j--)
          str.remove(j); 
        throw new NullPointerException(str1);
      } 
      str.add(str1);
    } 
  }
  
  public final zzejr a() {
    try {
      l32 l32 = zzejr.zzgb(b());
      i(l32.b());
      return l32.a();
    } catch (IOException iOException) {
      String str = getClass().getName();
      StringBuilder stringBuilder = new StringBuilder(str.length() + 62 + "ByteString".length());
      stringBuilder.append("Serializing ");
      stringBuilder.append(str);
      stringBuilder.append(" to a ");
      stringBuilder.append("ByteString");
      stringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(stringBuilder.toString(), iOException);
    } 
  }
  
  int e() {
    throw new UnsupportedOperationException();
  }
  
  public final byte[] g() {
    try {
      byte[] arrayOfByte = new byte[b()];
      zzekl zzekl = zzekl.D0(arrayOfByte);
      i(zzekl);
      zzekl.D();
      return arrayOfByte;
    } catch (IOException iOException) {
      String str = getClass().getName();
      StringBuilder stringBuilder = new StringBuilder(str.length() + 62 + "byte array".length());
      stringBuilder.append("Serializing ");
      stringBuilder.append(str);
      stringBuilder.append(" to a ");
      stringBuilder.append("byte array");
      stringBuilder.append(" threw an IOException (should never happen).");
      throw new RuntimeException(stringBuilder.toString(), iOException);
    } 
  }
  
  void m(int paramInt) {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/w22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */