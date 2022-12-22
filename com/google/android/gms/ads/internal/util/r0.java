package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.cm;
import com.google.android.gms.internal.ads.dr1;
import com.google.android.gms.internal.ads.wf;
import java.util.concurrent.Callable;

public final class r0 {
  @Deprecated
  public static <T> T a(Context paramContext, Callable<T> paramCallable) {
    try {
      return (T)c((Callable)paramCallable);
    } finally {
      paramCallable = null;
      cm.c("Unexpected exception.", (Throwable)paramCallable);
      wf.g(paramContext).a((Throwable)paramCallable, "StrictModeUtil.runWithLaxStrictMode");
    } 
  }
  
  public static <T> T b(dr1<T> paramdr1) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
    try {
      StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
      this(threadPolicy);
      StrictMode.setThreadPolicy(builder.permitDiskReads().permitDiskWrites().build());
      return (T)paramdr1.get();
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
  
  private static <T> T c(Callable<T> paramCallable) {
    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
    try {
      StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
      this(threadPolicy);
      StrictMode.setThreadPolicy(builder.permitDiskReads().permitDiskWrites().build());
      paramCallable = (Callable<T>)paramCallable.call();
      return (T)paramCallable;
    } finally {
      StrictMode.setThreadPolicy(threadPolicy);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/util/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */