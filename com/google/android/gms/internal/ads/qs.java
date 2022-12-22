package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

final class qs extends FilterInputStream {
  private final HttpURLConnection b;
  
  qs(HttpURLConnection paramHttpURLConnection) {
    super(qp.e(paramHttpURLConnection));
    this.b = paramHttpURLConnection;
  }
  
  public final void close() {
    super.close();
    this.b.disconnect();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/qs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */