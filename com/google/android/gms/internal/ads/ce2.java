package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class ce2 extends wd2 {
  public final zd2 b = new zd2();
  
  public ByteBuffer c;
  
  public long d;
  
  private final int e = 0;
  
  public ce2(int paramInt) {}
  
  private final ByteBuffer j(int paramInt) {
    int i;
    ByteBuffer byteBuffer = this.c;
    if (byteBuffer == null) {
      i = 0;
    } else {
      i = byteBuffer.capacity();
    } 
    StringBuilder stringBuilder = new StringBuilder(44);
    stringBuilder.append("Buffer too small (");
    stringBuilder.append(i);
    stringBuilder.append(" < ");
    stringBuilder.append(paramInt);
    stringBuilder.append(")");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public final void a() {
    super.a();
    ByteBuffer byteBuffer = this.c;
    if (byteBuffer != null)
      byteBuffer.clear(); 
  }
  
  public final boolean h() {
    return d(1073741824);
  }
  
  public final void i(int paramInt) {
    ByteBuffer byteBuffer = this.c;
    if (byteBuffer == null) {
      this.c = j(paramInt);
      return;
    } 
    int i = byteBuffer.capacity();
    int j = this.c.position();
    paramInt += j;
    if (i >= paramInt)
      return; 
    byteBuffer = j(paramInt);
    if (j > 0) {
      this.c.position(0);
      this.c.limit(j);
      byteBuffer.put(this.c);
    } 
    this.c = byteBuffer;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/gms/internal/ads/ce2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */