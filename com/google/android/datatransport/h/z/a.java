package com.google.android.datatransport.h.z;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

public final class a {
  private static SparseArray<Priority> a = new SparseArray();
  
  private static HashMap<Priority, Integer> b;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    b = (HashMap)hashMap;
    hashMap.put(Priority.b, Integer.valueOf(0));
    b.put(Priority.c, Integer.valueOf(1));
    b.put(Priority.d, Integer.valueOf(2));
    for (Priority priority : b.keySet())
      a.append(((Integer)b.get(priority)).intValue(), priority); 
  }
  
  public static int a(Priority paramPriority) {
    Integer integer = b.get(paramPriority);
    if (integer != null)
      return integer.intValue(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("PriorityMapping is missing known Priority value ");
    stringBuilder.append(paramPriority);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public static Priority b(int paramInt) {
    Priority priority = (Priority)a.get(paramInt);
    if (priority != null)
      return priority; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown Priority for value ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/datatransport/h/z/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */