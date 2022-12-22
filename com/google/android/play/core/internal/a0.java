package com.google.android.play.core.internal;

import java.io.File;
import java.util.List;

final class a0 implements z {
  a0() {}
  
  a0(byte[] paramArrayOfbyte) {}
  
  public final Object[] a(Object paramObject, List paramList1, List paramList2) {
    if (this.a != 0) {
      paramObject = d0.b(paramObject, "makePathElements", Object[].class, List.class, paramList1, File.class, null, List.class, paramList2);
      return (Object[])paramObject;
    } 
    paramObject = d0.a(paramObject, "makePathElements", Object[].class, List.class, paramList1);
    return (Object[])paramObject;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/internal/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */