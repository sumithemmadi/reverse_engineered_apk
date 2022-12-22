package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class q {
  private static ThreadPoolExecutor a;
  
  public static Executor a() {
    if (a == null) {
      ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), new c());
      a = threadPoolExecutor;
      threadPoolExecutor.allowCoreThreadTimeOut(true);
    } 
    return a;
  }
  
  public static String b(byte[] paramArrayOfbyte) {
    try {
      MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
      messageDigest.update(paramArrayOfbyte);
      return Base64.encodeToString(messageDigest.digest(), 11);
    } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
      return "";
    } 
  }
  
  public static Context c(Context paramContext) {
    Context context = paramContext.getApplicationContext();
    return (context != null) ? context : paramContext;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/play/core/splitcompat/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */