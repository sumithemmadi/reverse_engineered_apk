package com.google.android.exoplayer2.video.r;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.h0;
import com.google.android.exoplayer2.util.v;
import java.nio.ByteBuffer;

public class b extends u {
  private final e m = new e(1);
  
  private final v n = new v();
  
  private long o;
  
  private a p;
  
  private long q;
  
  public b() {
    super(5);
  }
  
  private float[] O(ByteBuffer paramByteBuffer) {
    if (paramByteBuffer.remaining() != 16)
      return null; 
    this.n.K(paramByteBuffer.array(), paramByteBuffer.limit());
    this.n.M(paramByteBuffer.arrayOffset() + 4);
    float[] arrayOfFloat = new float[3];
    for (byte b1 = 0; b1 < 3; b1++)
      arrayOfFloat[b1] = Float.intBitsToFloat(this.n.n()); 
    return arrayOfFloat;
  }
  
  private void P() {
    this.q = 0L;
    a a1 = this.p;
    if (a1 != null)
      a1.b(); 
  }
  
  protected void E() {
    P();
  }
  
  protected void G(long paramLong, boolean paramBoolean) {
    P();
  }
  
  protected void K(Format[] paramArrayOfFormat, long paramLong) {
    this.o = paramLong;
  }
  
  public int b(Format paramFormat) {
    int i;
    if ("application/x-camera-motion".equals(paramFormat.j)) {
      i = s0.a(4);
    } else {
      i = s0.a(0);
    } 
    return i;
  }
  
  public void e(int paramInt, Object paramObject) {
    if (paramInt == 7) {
      this.p = (a)paramObject;
    } else {
      super.e(paramInt, paramObject);
    } 
  }
  
  public boolean m() {
    return true;
  }
  
  public boolean o() {
    return s();
  }
  
  public void w(long paramLong1, long paramLong2) {
    while (!s() && this.q < 100000L + paramLong1) {
      this.m.clear();
      if (L(h(), this.m, false) != -4 || this.m.isEndOfStream())
        break; 
      this.m.m();
      e e1 = this.m;
      this.q = e1.d;
      if (this.p != null) {
        float[] arrayOfFloat = O((ByteBuffer)h0.g(e1.c));
        if (arrayOfFloat != null)
          ((a)h0.g(this.p)).a(this.q - this.o, arrayOfFloat); 
      } 
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/r/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */