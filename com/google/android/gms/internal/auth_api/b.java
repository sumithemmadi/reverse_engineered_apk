package com.google.android.gms.internal.auth_api;

import android.util.Base64;
import java.util.Random;

public final class b {
  private static final Random a = new Random();
  
  public static String a() {
    byte[] arrayOfByte = new byte[16];
    a.nextBytes(arrayOfByte);
    return Base64.encodeToString(arrayOfByte, 11);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/auth_api/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */