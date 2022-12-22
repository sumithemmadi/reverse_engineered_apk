package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.common.internal.w0;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class o extends w0 {
  private int b;
  
  protected o(byte[] paramArrayOfbyte) {
    boolean bool;
    if (paramArrayOfbyte.length == 25) {
      bool = true;
    } else {
      bool = false;
    } 
    t.a(bool);
    this.b = Arrays.hashCode(paramArrayOfbyte);
  }
  
  protected static byte[] a2(String paramString) {
    try {
      return paramString.getBytes("ISO-8859-1");
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw new AssertionError(unsupportedEncodingException);
    } 
  }
  
  public final a b() {
    return b.a2(o1());
  }
  
  public final int c() {
    return hashCode();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject != null && paramObject instanceof com.google.android.gms.common.internal.u0)
      try {
        paramObject = paramObject;
        if (paramObject.c() != hashCode())
          return false; 
        paramObject = paramObject.b();
        if (paramObject == null)
          return false; 
        paramObject = b.o1((a)paramObject);
        return Arrays.equals(o1(), (byte[])paramObject);
      } catch (RemoteException remoteException) {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)remoteException);
      }  
    return false;
  }
  
  public int hashCode() {
    return this.b;
  }
  
  abstract byte[] o1();
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */