package com.google.android.gms.internal.ads;

import java.io.Closeable;

public class y20 extends j82 implements Closeable {
  private static r82 k = r82.b(y20.class);
  
  public y20(l82 paraml82, wz paramwz) {
    e(paraml82, paraml82.size(), paramwz);
  }
  
  public void close() {
    this.e.close();
  }
  
  public String toString() {
    String str = this.e.toString();
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 7);
    stringBuilder.append("model(");
    stringBuilder.append(str);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/y20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */