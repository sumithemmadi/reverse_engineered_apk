package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.x.b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {
  ImageType a(ByteBuffer paramByteBuffer);
  
  ImageType b(InputStream paramInputStream);
  
  int c(InputStream paramInputStream, b paramb);
  
  public enum ImageType {
    GIF, JPEG, PNG, PNG_A, RAW, UNKNOWN, WEBP, WEBP_A;
    
    private final boolean hasAlpha;
    
    static {
      ImageType imageType1 = new ImageType("GIF", 0, true);
      GIF = imageType1;
      ImageType imageType2 = new ImageType("JPEG", 1, false);
      JPEG = imageType2;
      ImageType imageType3 = new ImageType("RAW", 2, false);
      RAW = imageType3;
      ImageType imageType4 = new ImageType("PNG_A", 3, true);
      PNG_A = imageType4;
      ImageType imageType5 = new ImageType("PNG", 4, false);
      PNG = imageType5;
      ImageType imageType6 = new ImageType("WEBP_A", 5, true);
      WEBP_A = imageType6;
      ImageType imageType7 = new ImageType("WEBP", 6, false);
      WEBP = imageType7;
      ImageType imageType8 = new ImageType("UNKNOWN", 7, false);
      UNKNOWN = imageType8;
      $VALUES = new ImageType[] { imageType1, imageType2, imageType3, imageType4, imageType5, imageType6, imageType7, imageType8 };
    }
    
    ImageType(boolean param1Boolean) {
      this.hasAlpha = param1Boolean;
    }
    
    public boolean hasAlpha() {
      return this.hasAlpha;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/ImageHeaderParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */