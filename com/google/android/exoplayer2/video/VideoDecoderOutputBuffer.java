package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.b1.f;
import java.nio.ByteBuffer;

public class VideoDecoderOutputBuffer extends f {
  public static final int COLORSPACE_BT2020 = 3;
  
  public static final int COLORSPACE_BT601 = 1;
  
  public static final int COLORSPACE_BT709 = 2;
  
  public static final int COLORSPACE_UNKNOWN = 0;
  
  public ColorInfo colorInfo;
  
  public int colorspace;
  
  public ByteBuffer data;
  
  public int decoderPrivate;
  
  public int height;
  
  public int mode;
  
  private final a owner;
  
  public ByteBuffer supplementalData;
  
  public int width;
  
  public ByteBuffer[] yuvPlanes;
  
  public int[] yuvStrides;
  
  public VideoDecoderOutputBuffer(a parama) {
    this.owner = parama;
  }
  
  private static boolean isSafeToMultiply(int paramInt1, int paramInt2) {
    boolean bool;
    if (paramInt1 >= 0 && paramInt2 >= 0 && (paramInt2 <= 0 || paramInt1 < Integer.MAX_VALUE / paramInt2)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void init(long paramLong, int paramInt, ByteBuffer paramByteBuffer) {
    this.timeUs = paramLong;
    this.mode = paramInt;
    if (paramByteBuffer != null && paramByteBuffer.hasRemaining()) {
      addFlag(268435456);
      paramInt = paramByteBuffer.limit();
      ByteBuffer byteBuffer = this.supplementalData;
      if (byteBuffer == null || byteBuffer.capacity() < paramInt) {
        this.supplementalData = ByteBuffer.allocate(paramInt);
      } else {
        this.supplementalData.clear();
      } 
      this.supplementalData.put(paramByteBuffer);
      this.supplementalData.flip();
      paramByteBuffer.position(0);
    } else {
      this.supplementalData = null;
    } 
  }
  
  public void initForPrivateFrame(int paramInt1, int paramInt2) {
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  public boolean initForYuvFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.width = paramInt1;
    this.height = paramInt2;
    this.colorspace = paramInt5;
    paramInt5 = (int)((paramInt2 + 1L) / 2L);
    if (isSafeToMultiply(paramInt3, paramInt2) && isSafeToMultiply(paramInt4, paramInt5)) {
      paramInt1 = paramInt2 * paramInt3;
      paramInt2 = paramInt5 * paramInt4;
      paramInt5 = paramInt2 * 2 + paramInt1;
      if (isSafeToMultiply(paramInt2, 2) && paramInt5 >= paramInt1) {
        ByteBuffer byteBuffer1 = this.data;
        if (byteBuffer1 == null || byteBuffer1.capacity() < paramInt5) {
          this.data = ByteBuffer.allocateDirect(paramInt5);
        } else {
          this.data.position(0);
          this.data.limit(paramInt5);
        } 
        if (this.yuvPlanes == null)
          this.yuvPlanes = new ByteBuffer[3]; 
        ByteBuffer byteBuffer2 = this.data;
        ByteBuffer[] arrayOfByteBuffer = this.yuvPlanes;
        arrayOfByteBuffer[0] = byteBuffer2.slice();
        arrayOfByteBuffer[0].limit(paramInt1);
        byteBuffer2.position(paramInt1);
        arrayOfByteBuffer[1] = byteBuffer2.slice();
        arrayOfByteBuffer[1].limit(paramInt2);
        byteBuffer2.position(paramInt1 + paramInt2);
        arrayOfByteBuffer[2] = byteBuffer2.slice();
        arrayOfByteBuffer[2].limit(paramInt2);
        if (this.yuvStrides == null)
          this.yuvStrides = new int[3]; 
        int[] arrayOfInt = this.yuvStrides;
        arrayOfInt[0] = paramInt3;
        arrayOfInt[1] = paramInt4;
        arrayOfInt[2] = paramInt4;
        return true;
      } 
    } 
    return false;
  }
  
  public void release() {
    this.owner.a(this);
  }
  
  public static interface a {
    void a(VideoDecoderOutputBuffer param1VideoDecoderOutputBuffer);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/video/VideoDecoderOutputBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */