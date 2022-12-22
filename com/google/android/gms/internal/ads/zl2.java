package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class zl2 {
  private ByteArrayOutputStream a = new ByteArrayOutputStream(4096);
  
  private Base64OutputStream b = new Base64OutputStream(this.a, 10);
  
  public final void a(byte[] paramArrayOfbyte) {
    this.b.write(paramArrayOfbyte);
  }
  
  public final String toString() {
    Exception exception;
    try {
      this.b.close();
    } catch (IOException null) {
      cm.c("HashManager: Unable to convert to Base64.", exception);
    } 
    try {
      this.a.close();
      String str = this.a.toString();
      this.a = null;
      this.b = null;
      return str;
    } catch (IOException null) {
      cm.c("HashManager: Unable to convert to Base64.", exception);
      this.a = null;
      this.b = null;
      return "";
    } finally {}
    this.a = null;
    this.b = null;
    throw exception;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */