package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ib2 {
  private final z92 a;
  
  private final String b;
  
  private final String c;
  
  private final int d = 2;
  
  private volatile Method e = null;
  
  private final Class<?>[] f;
  
  private CountDownLatch g = new CountDownLatch(1);
  
  public ib2(z92 paramz92, String paramString1, String paramString2, Class<?>... paramVarArgs) {
    this.a = paramz92;
    this.b = paramString1;
    this.c = paramString2;
    this.f = paramVarArgs;
    paramz92.r().submit(new lb2(this));
  }
  
  private final String b(byte[] paramArrayOfbyte, String paramString) {
    return new String(this.a.t().b(paramArrayOfbyte, paramString), "UTF-8");
  }
  
  private final void c() {
    try {
      Class clazz = this.a.s().loadClass(b(this.a.u(), this.b));
      if (clazz == null)
        return; 
      this.e = clazz.getMethod(b(this.a.u(), this.c), this.f);
      Method method = this.e;
      if (method == null)
        return; 
      return;
    } catch (zzej zzej) {
      return;
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      return;
    } catch (ClassNotFoundException classNotFoundException) {
      return;
    } catch (NoSuchMethodException noSuchMethodException) {
      return;
    } catch (NullPointerException nullPointerException) {
      return;
    } finally {
      this.g.countDown();
    } 
  }
  
  public final Method d() {
    if (this.e != null)
      return this.e; 
    Method method = null;
    try {
      if (!this.g.await(2L, TimeUnit.SECONDS))
        return null; 
      Method method1 = this.e;
      method = method1;
    } catch (InterruptedException interruptedException) {}
    return method;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ib2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */