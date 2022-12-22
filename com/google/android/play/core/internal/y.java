package com.google.android.play.core.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

final class y implements v {
  y() {}
  
  y(byte[] paramArrayOfbyte) {}
  
  public final Object[] a(Object paramObject, ArrayList paramArrayList1, File paramFile, ArrayList paramArrayList2) {
    if (this.a != 0) {
      paramObject = d0.b(paramObject, "makeDexElements", Object[].class, ArrayList.class, paramArrayList1, File.class, paramFile, ArrayList.class, paramArrayList2);
      return (Object[])paramObject;
    } 
    paramObject = d0.b(paramObject, "makePathElements", Object[].class, List.class, paramArrayList1, File.class, paramFile, List.class, paramArrayList2);
    return (Object[])paramObject;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */