package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.util.List;
import java.util.Map;

public interface j {
  void close();
  
  Uri e0();
  
  void f0(x paramx);
  
  long g0(l paraml);
  
  Map<String, List<String>> getResponseHeaders();
  
  int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2);
  
  public static interface a {
    j a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/upstream/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */