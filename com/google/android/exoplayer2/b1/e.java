package com.google.android.exoplayer2.b1;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

public class e extends a {
  public final b b = new b();
  
  public ByteBuffer c;
  
  public long d;
  
  public ByteBuffer e;
  
  private final int f;
  
  public e(int paramInt) {
    this.f = paramInt;
  }
  
  private ByteBuffer k(int paramInt) {
    int i = this.f;
    if (i == 1)
      return ByteBuffer.allocate(paramInt); 
    if (i == 2)
      return ByteBuffer.allocateDirect(paramInt); 
    ByteBuffer byteBuffer = this.c;
    if (byteBuffer == null) {
      i = 0;
    } else {
      i = byteBuffer.capacity();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Buffer too small (");
    stringBuilder.append(i);
    stringBuilder.append(" < ");
    stringBuilder.append(paramInt);
    stringBuilder.append(")");
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public static e r() {
    return new e(0);
  }
  
  public void clear() {
    super.clear();
    ByteBuffer byteBuffer = this.c;
    if (byteBuffer != null)
      byteBuffer.clear(); 
    byteBuffer = this.e;
    if (byteBuffer != null)
      byteBuffer.clear(); 
  }
  
  @EnsuresNonNull({"data"})
  public void l(int paramInt) {
    ByteBuffer byteBuffer = this.c;
    if (byteBuffer == null) {
      this.c = k(paramInt);
      return;
    } 
    int i = byteBuffer.capacity();
    int j = this.c.position();
    paramInt += j;
    if (i >= paramInt)
      return; 
    byteBuffer = k(paramInt);
    if (j > 0) {
      this.c.flip();
      byteBuffer.put(this.c);
    } 
    this.c = byteBuffer;
  }
  
  public final void m() {
    this.c.flip();
    ByteBuffer byteBuffer = this.e;
    if (byteBuffer != null)
      byteBuffer.flip(); 
  }
  
  public final boolean n() {
    return getFlag(1073741824);
  }
  
  public final boolean q() {
    boolean bool;
    if (this.c == null && this.f == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  @EnsuresNonNull({"supplementalData"})
  public void s(int paramInt) {
    ByteBuffer byteBuffer = this.e;
    if (byteBuffer == null || byteBuffer.capacity() < paramInt) {
      this.e = ByteBuffer.allocate(paramInt);
      return;
    } 
    this.e.clear();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/b1/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */