package com.google.android.exoplayer2.mediacodec;

import android.media.MediaFormat;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

public final class g {
  public static void a(MediaFormat paramMediaFormat, String paramString, byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null)
      paramMediaFormat.setByteBuffer(paramString, ByteBuffer.wrap(paramArrayOfbyte)); 
  }
  
  public static void b(MediaFormat paramMediaFormat, ColorInfo paramColorInfo) {
    if (paramColorInfo != null) {
      d(paramMediaFormat, "color-transfer", paramColorInfo.d);
      d(paramMediaFormat, "color-standard", paramColorInfo.b);
      d(paramMediaFormat, "color-range", paramColorInfo.c);
      a(paramMediaFormat, "hdr-static-info", paramColorInfo.e);
    } 
  }
  
  public static void c(MediaFormat paramMediaFormat, String paramString, float paramFloat) {
    if (paramFloat != -1.0F)
      paramMediaFormat.setFloat(paramString, paramFloat); 
  }
  
  public static void d(MediaFormat paramMediaFormat, String paramString, int paramInt) {
    if (paramInt != -1)
      paramMediaFormat.setInteger(paramString, paramInt); 
  }
  
  public static void e(MediaFormat paramMediaFormat, List<byte[]> paramList) {
    for (byte b = 0; b < paramList.size(); b++) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("csd-");
      stringBuilder.append(b);
      paramMediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap(paramList.get(b)));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/mediacodec/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */