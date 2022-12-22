package com.allinone.callerid.util.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;

public class a {
  private static byte[] a = new byte[] { 35, 33, 65, 77, 82, 10 };
  
  protected int b = 8000;
  
  protected int c = 64;
  
  protected int d = 1;
  
  protected String e;
  
  public void a(String paramString) {
    try {
      MediaCodec mediaCodec = MediaCodec.createEncoderByType("audio/3gpp");
      MediaFormat mediaFormat = new MediaFormat();
      this();
      mediaFormat.setString("mime", "audio/3gpp");
      mediaFormat.setInteger("sample-rate", this.b);
      mediaFormat.setInteger("channel-count", this.d);
      mediaFormat.setInteger("bitrate", this.c);
      boolean bool = true;
      mediaCodec.configure(mediaFormat, null, null, 1);
      File file2 = new File();
      this(paramString);
      FileInputStream fileInputStream = new FileInputStream();
      this(file2);
      File file1 = new File();
      this(this.e);
      FileOutputStream fileOutputStream = new FileOutputStream();
      this(file1);
      fileOutputStream.write(a);
      mediaCodec.start();
      ByteBuffer[] arrayOfByteBuffer1 = mediaCodec.getInputBuffers();
      ByteBuffer[] arrayOfByteBuffer2 = mediaCodec.getOutputBuffers();
      byte[] arrayOfByte = new byte[88200];
      MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
      this();
      double d = 0.0D;
      int i = 0;
      while (true) {
        int j = 0;
        while (j != -1 && bool) {
          j = mediaCodec.dequeueInputBuffer(0L);
          if (j >= 0) {
            ByteBuffer byteBuffer = arrayOfByteBuffer1[j];
            byteBuffer.clear();
            int k = fileInputStream.read(arrayOfByte, 0, byteBuffer.limit());
            if (k == -1) {
              mediaCodec.queueInputBuffer(j, 0, 0, (long)d, 4);
              bool = false;
              continue;
            } 
            i += k;
            byteBuffer.put(arrayOfByte, 0, k);
            mediaCodec.queueInputBuffer(j, 0, k, (long)d, 0);
            d = ((i / 2) * 1000000L / this.b);
          } 
        } 
        j = 0;
        while (j != -1) {
          j = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
          if (j >= 0) {
            ByteBuffer byteBuffer = arrayOfByteBuffer2[j];
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            int k = bufferInfo.size;
            byte[] arrayOfByte1 = new byte[k];
            byteBuffer.get(arrayOfByte1, 0, k);
            fileOutputStream.write(arrayOfByte1, 0, bufferInfo.size);
            mediaCodec.releaseOutputBuffer(j, false);
          } 
        } 
        if (bufferInfo.flags == 4) {
          fileInputStream.close();
          fileOutputStream.flush();
          fileOutputStream.close();
          return;
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
  }
  
  public void b(int paramInt1, int paramInt2, int paramInt3) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
  }
  
  public void c(String paramString) {
    this.e = paramString;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/util/recorder/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */