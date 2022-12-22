package com.allinone.callerid.d.f;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.allinone.callerid.util.d0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c {
  private static void a(byte[] paramArrayOfbyte, int paramInt) {
    paramArrayOfbyte[0] = (byte)-1;
    paramArrayOfbyte[1] = (byte)-7;
    paramArrayOfbyte[2] = (byte)(byte)80;
    paramArrayOfbyte[3] = (byte)(byte)(128 + (paramInt >> 11));
    paramArrayOfbyte[4] = (byte)(byte)((paramInt & 0x7FF) >> 3);
    paramArrayOfbyte[5] = (byte)(byte)(((paramInt & 0x7) << 5) + 31);
    paramArrayOfbyte[6] = (byte)-4;
  }
  
  public static void b(String paramString1, String paramString2) {
    File file1 = new File(paramString1);
    if (!file1.exists()) {
      if (d0.a)
        d0.a("callscreen", "mp4文件不存在"); 
      return;
    } 
    MediaExtractor mediaExtractor = new MediaExtractor();
    try {
      mediaExtractor.setDataSource(file1.getAbsolutePath());
    } catch (IOException iOException) {
      iOException.printStackTrace();
    } catch (Exception exception) {}
    int i = mediaExtractor.getTrackCount();
    file1 = null;
    int j = 0;
    int k = 0;
    while (j < i) {
      MediaFormat mediaFormat1 = mediaExtractor.getTrackFormat(j);
      if (mediaFormat1.getString("mime").startsWith("audio")) {
        k = j;
        mediaFormat = mediaFormat1;
      } 
      j++;
    } 
    File file2 = new File();
    this((String)exception);
    MediaFormat mediaFormat;
    if (file2.exists())
      file2.delete(); 
    FileOutputStream fileOutputStream = new FileOutputStream();
    this(file2);
    j = 102400;
    if (mediaFormat != null)
      j = mediaFormat.getInteger("max-input-size"); 
    ByteBuffer byteBuffer = ByteBuffer.allocate(j);
    mediaExtractor.selectTrack(k);
    while (true) {
      j = mediaExtractor.readSampleData(byteBuffer, 0);
      if (j != -1) {
        byte[] arrayOfByte1 = new byte[j];
        byteBuffer.get(arrayOfByte1);
        k = j + 7;
        byte[] arrayOfByte2 = new byte[k];
        a(arrayOfByte2, k);
        System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 7, j);
        fileOutputStream.write(arrayOfByte2);
        byteBuffer.clear();
        mediaExtractor.advance();
        continue;
      } 
      fileOutputStream.flush();
      fileOutputStream.close();
      mediaExtractor.release();
      return;
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */