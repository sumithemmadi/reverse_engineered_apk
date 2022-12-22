package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class zzdza<T> extends zzdzs<T> {
  private final Executor zziag;
  
  zzdza(us1 paramus1, Executor paramExecutor) {
    this.zziag = xq1.<Executor>b(paramExecutor);
  }
  
  final void execute() {
    try {
      this.zziag.execute(this);
      return;
    } catch (RejectedExecutionException rejectedExecutionException) {
      this.zziah.j(rejectedExecutionException);
      return;
    } 
  }
  
  final boolean isDone() {
    return this.zziah.isDone();
  }
  
  abstract void setValue(T paramT);
  
  final void zzb(T paramT, Throwable paramThrowable) {
    us1.V(this.zziah, null);
    if (paramThrowable != null) {
      if (paramThrowable instanceof java.util.concurrent.ExecutionException) {
        this.zziah.j(paramThrowable.getCause());
        return;
      } 
      if (paramThrowable instanceof java.util.concurrent.CancellationException) {
        this.zziah.cancel(false);
        return;
      } 
      this.zziah.j(paramThrowable);
      return;
    } 
    setValue(paramT);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/zzdza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */