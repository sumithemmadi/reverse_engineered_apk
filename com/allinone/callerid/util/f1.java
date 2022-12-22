package com.allinone.callerid.util;

import android.os.AsyncTask;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class f1 {
  private static final ExecutorService a = Executors.newCachedThreadPool();
  
  private static final Executor b = AsyncTask.THREAD_POOL_EXECUTOR;
  
  public static Executor a() {
    return (Build.VERSION.SDK_INT >= 30) ? b : a;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/f1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */