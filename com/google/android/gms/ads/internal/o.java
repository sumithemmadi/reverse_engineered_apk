package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.cm;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class o extends AsyncTask<Void, Void, String> {
  private o(k paramk) {}
  
  private final String a(Void... paramVarArgs) {
    try {
      k k1 = this.a;
      k.T9(k1, k.ea(k1).get(1000L, TimeUnit.MILLISECONDS));
    } catch (InterruptedException interruptedException) {
      cm.d("", interruptedException);
    } catch (ExecutionException executionException) {
    
    } catch (TimeoutException timeoutException) {}
    return this.a.ga();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/ads/internal/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */