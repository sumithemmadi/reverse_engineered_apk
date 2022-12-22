package com.google.android.gms.common.util;

import android.util.Base64;

public final class c {
  public static String a(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : Base64.encodeToString(paramArrayOfbyte, 0);
  }
  
  public static String b(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : Base64.encodeToString(paramArrayOfbyte, 10);
  }
  
  public static String c(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null) ? null : Base64.encodeToString(paramArrayOfbyte, 11);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */