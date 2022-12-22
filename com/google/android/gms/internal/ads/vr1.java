package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class vr1 {
  static boolean a(Set<?> paramSet, Object paramObject) {
    if (paramSet == paramObject)
      return true; 
    if (paramObject instanceof Set) {
      paramObject = paramObject;
      try {
        if (paramSet.size() == paramObject.size()) {
          boolean bool = paramSet.containsAll((Collection<?>)paramObject);
          if (bool)
            return true; 
        } 
      } catch (NullPointerException|ClassCastException nullPointerException) {}
    } 
    return false;
  }
  
  static int b(Set<?> paramSet) {
    Iterator<?> iterator = paramSet.iterator();
    int i;
    for (i = 0; iterator.hasNext(); i = i + b ^ 0xFFFFFFFF ^ 0xFFFFFFFF) {
      byte b;
      paramSet = (Set<?>)iterator.next();
      if (paramSet != null) {
        b = paramSet.hashCode();
      } else {
        b = 0;
      } 
    } 
    return i;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/vr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */