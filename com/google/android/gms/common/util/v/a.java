package com.google.android.gms.common.util.v;

import com.google.android.gms.common.internal.t;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class a implements ThreadFactory {
  private final String a;
  
  private final int b;
  
  private final ThreadFactory c = Executors.defaultThreadFactory();
  
  public a(String paramString) {
    this(paramString, 0);
  }
  
  private a(String paramString, int paramInt) {
    this.a = (String)t.k(paramString, "Name must not be null");
    this.b = 0;
  }
  
  public Thread newThread(Runnable paramRunnable) {
    paramRunnable = this.c.newThread(new b(paramRunnable, 0));
    paramRunnable.setName(this.a);
    return (Thread)paramRunnable;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/common/util/v/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */