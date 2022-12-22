package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.b1.e;
import com.google.android.exoplayer2.b1.f;
import com.google.android.exoplayer2.b1.g;
import com.google.android.exoplayer2.util.e;
import java.nio.ByteBuffer;

public abstract class c extends g<h, i, SubtitleDecoderException> implements f {
  private final String n;
  
  protected c(String paramString) {
    super((e[])new h[2], (f[])new i[2]);
    this.n = paramString;
    v(1024);
  }
  
  protected final SubtitleDecoderException A(h paramh, i parami, boolean paramBoolean) {
    try {
      ByteBuffer byteBuffer = (ByteBuffer)e.e(paramh.c);
      e e = z(byteBuffer.array(), byteBuffer.limit(), paramBoolean);
      parami.k(paramh.d, e, paramh.g);
      parami.clearFlag(-2147483648);
      return null;
    } catch (SubtitleDecoderException null) {
      return null;
    } 
  }
  
  protected final void B(i parami) {
    s(parami);
  }
  
  public void b(long paramLong) {}
  
  protected final h w() {
    return new h();
  }
  
  protected final i x() {
    return new d(this);
  }
  
  protected final SubtitleDecoderException y(Throwable paramThrowable) {
    return new SubtitleDecoderException("Unexpected decode error", paramThrowable);
  }
  
  protected abstract e z(byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean);
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */