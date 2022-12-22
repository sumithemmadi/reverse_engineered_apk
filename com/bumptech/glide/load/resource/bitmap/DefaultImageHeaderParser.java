package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.p.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser implements ImageHeaderParser {
  static final byte[] a = "Exif\000\000".getBytes(Charset.forName("UTF-8"));
  
  private static final int[] b = new int[] { 
      0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 
      8, 4, 8 };
  
  private static int d(int paramInt1, int paramInt2) {
    return paramInt1 + 2 + paramInt2 * 12;
  }
  
  private int e(Reader paramReader, com.bumptech.glide.load.engine.x.b paramb) {
    try {
      int i = paramReader.a();
      boolean bool = g(i);
      if (!bool) {
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
          null = new StringBuilder();
          this();
          null.append("Parser doesn't handle magic number: ");
          null.append(i);
          Log.d("DfltImageHeaderParser", null.toString());
        } 
        return -1;
      } 
      i = i((Reader)null);
      if (i == -1) {
        if (Log.isLoggable("DfltImageHeaderParser", 3))
          Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found"); 
        return -1;
      } 
      byte[] arrayOfByte = (byte[])paramb.e(i, byte[].class);
      try {
        i = k((Reader)null, arrayOfByte, i);
        return i;
      } finally {
        paramb.d(arrayOfByte);
      } 
    } catch (EndOfFileException endOfFileException) {
      return -1;
    } 
  }
  
  private ImageHeaderParser.ImageType f(Reader paramReader) {
    try {
      int i = paramReader.a();
      if (i == 65496)
        return ImageHeaderParser.ImageType.JPEG; 
      i = i << 8 | paramReader.c();
      if (i == 4671814)
        return ImageHeaderParser.ImageType.GIF; 
      i = i << 8 | paramReader.c();
      if (i == -1991225785) {
        paramReader.skip(21L);
        try {
          if (paramReader.c() >= 3) {
            null = ImageHeaderParser.ImageType.PNG_A;
          } else {
            null = ImageHeaderParser.ImageType.PNG;
          } 
          return null;
        } catch (EndOfFileException endOfFileException) {
          return ImageHeaderParser.ImageType.PNG;
        } 
      } 
      if (i != 1380533830)
        return ImageHeaderParser.ImageType.UNKNOWN; 
      endOfFileException.skip(4L);
      if ((endOfFileException.a() << 16 | endOfFileException.a()) != 1464156752)
        return ImageHeaderParser.ImageType.UNKNOWN; 
      i = endOfFileException.a() << 16 | endOfFileException.a();
      if ((i & 0xFFFFFF00) != 1448097792)
        return ImageHeaderParser.ImageType.UNKNOWN; 
      i &= 0xFF;
      if (i == 88) {
        endOfFileException.skip(4L);
        if ((endOfFileException.c() & 0x10) != 0) {
          null = ImageHeaderParser.ImageType.WEBP_A;
        } else {
          null = ImageHeaderParser.ImageType.WEBP;
        } 
        return null;
      } 
      if (i == 76) {
        null.skip(4L);
        if ((null.c() & 0x8) != 0) {
          null = ImageHeaderParser.ImageType.WEBP_A;
        } else {
          null = ImageHeaderParser.ImageType.WEBP;
        } 
        return null;
      } 
      return ImageHeaderParser.ImageType.WEBP;
    } catch (EndOfFileException endOfFileException) {
      return ImageHeaderParser.ImageType.UNKNOWN;
    } 
  }
  
  private static boolean g(int paramInt) {
    return ((paramInt & 0xFFD8) == 65496 || paramInt == 19789 || paramInt == 18761);
  }
  
  private boolean h(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool2;
    boolean bool1 = false;
    if (paramArrayOfbyte != null && paramInt > a.length) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool2) {
      paramInt = 0;
      while (true) {
        byte[] arrayOfByte = a;
        if (paramInt < arrayOfByte.length) {
          if (paramArrayOfbyte[paramInt] != arrayOfByte[paramInt]) {
            bool2 = bool1;
            break;
          } 
          paramInt++;
          continue;
        } 
        break;
      } 
    } 
    return bool2;
  }
  
  private int i(Reader paramReader) {
    while (true) {
      StringBuilder stringBuilder;
      short s1 = paramReader.c();
      if (s1 != 255) {
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown segmentId=");
          stringBuilder.append(s1);
          Log.d("DfltImageHeaderParser", stringBuilder.toString());
        } 
        return -1;
      } 
      short s2 = stringBuilder.c();
      if (s2 == 218)
        return -1; 
      if (s2 == 217) {
        if (Log.isLoggable("DfltImageHeaderParser", 3))
          Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment"); 
        return -1;
      } 
      int i = stringBuilder.a() - 2;
      if (s2 != 225) {
        long l1 = i;
        long l2 = stringBuilder.skip(l1);
        if (l2 != l1) {
          if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to skip enough data, type: ");
            stringBuilder.append(s2);
            stringBuilder.append(", wanted to skip: ");
            stringBuilder.append(i);
            stringBuilder.append(", but actually skipped: ");
            stringBuilder.append(l2);
            Log.d("DfltImageHeaderParser", stringBuilder.toString());
          } 
          return -1;
        } 
        continue;
      } 
      return i;
    } 
  }
  
  private static int j(b paramb) {
    ByteOrder byteOrder;
    short s1 = paramb.a(6);
    if (s1 != 18761) {
      if (s1 != 19789) {
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown endianness = ");
          stringBuilder.append(s1);
          Log.d("DfltImageHeaderParser", stringBuilder.toString());
        } 
        byteOrder = ByteOrder.BIG_ENDIAN;
      } else {
        byteOrder = ByteOrder.BIG_ENDIAN;
      } 
    } else {
      byteOrder = ByteOrder.LITTLE_ENDIAN;
    } 
    paramb.e(byteOrder);
    int i = paramb.b(10) + 6;
    short s2 = paramb.a(i);
    for (s1 = 0; s1 < s2; s1++) {
      int j = d(i, s1);
      short s = paramb.a(j);
      if (s == 274) {
        short s3 = paramb.a(j + 2);
        if (s3 < 1 || s3 > 12) {
          if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got invalid format code = ");
            stringBuilder.append(s3);
            Log.d("DfltImageHeaderParser", stringBuilder.toString());
          } 
        } else {
          int k = paramb.b(j + 4);
          if (k < 0) {
            if (Log.isLoggable("DfltImageHeaderParser", 3))
              Log.d("DfltImageHeaderParser", "Negative tiff component count"); 
          } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Got tagIndex=");
              stringBuilder.append(s1);
              stringBuilder.append(" tagType=");
              stringBuilder.append(s);
              stringBuilder.append(" formatCode=");
              stringBuilder.append(s3);
              stringBuilder.append(" componentCount=");
              stringBuilder.append(k);
              Log.d("DfltImageHeaderParser", stringBuilder.toString());
            } 
            k += b[s3];
            if (k > 4) {
              if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got byte count > 4, not orientation, continuing, formatCode=");
                stringBuilder.append(s3);
                Log.d("DfltImageHeaderParser", stringBuilder.toString());
              } 
            } else {
              int m = j + 8;
              if (m < 0 || m > paramb.d()) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Illegal tagValueOffset=");
                  stringBuilder.append(m);
                  stringBuilder.append(" tagType=");
                  stringBuilder.append(s);
                  Log.d("DfltImageHeaderParser", stringBuilder.toString());
                } 
              } else if (k < 0 || k + m > paramb.d()) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                  StringBuilder stringBuilder = new StringBuilder();
                  stringBuilder.append("Illegal number of bytes for TI tag data tagType=");
                  stringBuilder.append(s);
                  Log.d("DfltImageHeaderParser", stringBuilder.toString());
                } 
              } else {
                return paramb.a(m);
              } 
            } 
          } 
        } 
      } 
    } 
    return -1;
  }
  
  private int k(Reader paramReader, byte[] paramArrayOfbyte, int paramInt) {
    int i = paramReader.b(paramArrayOfbyte, paramInt);
    if (i != paramInt) {
      if (Log.isLoggable("DfltImageHeaderParser", 3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to read exif segment data, length: ");
        stringBuilder.append(paramInt);
        stringBuilder.append(", actually read: ");
        stringBuilder.append(i);
        Log.d("DfltImageHeaderParser", stringBuilder.toString());
      } 
      return -1;
    } 
    if (h(paramArrayOfbyte, paramInt))
      return j(new b(paramArrayOfbyte, paramInt)); 
    if (Log.isLoggable("DfltImageHeaderParser", 3))
      Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble"); 
    return -1;
  }
  
  public ImageHeaderParser.ImageType a(ByteBuffer paramByteBuffer) {
    return f(new a((ByteBuffer)j.d(paramByteBuffer)));
  }
  
  public ImageHeaderParser.ImageType b(InputStream paramInputStream) {
    return f(new c((InputStream)j.d(paramInputStream)));
  }
  
  public int c(InputStream paramInputStream, com.bumptech.glide.load.engine.x.b paramb) {
    return e(new c((InputStream)j.d(paramInputStream)), (com.bumptech.glide.load.engine.x.b)j.d(paramb));
  }
  
  private static interface Reader {
    int a();
    
    int b(byte[] param1ArrayOfbyte, int param1Int);
    
    short c();
    
    long skip(long param1Long);
    
    public static final class EndOfFileException extends IOException {
      private static final long serialVersionUID = 1L;
      
      EndOfFileException() {
        super("Unexpectedly reached end of a file");
      }
    }
  }
  
  public static final class EndOfFileException extends IOException {
    private static final long serialVersionUID = 1L;
    
    EndOfFileException() {
      super("Unexpectedly reached end of a file");
    }
  }
  
  private static final class a implements Reader {
    private final ByteBuffer a;
    
    a(ByteBuffer param1ByteBuffer) {
      this.a = param1ByteBuffer;
      param1ByteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
    
    public int a() {
      return c() << 8 | c();
    }
    
    public int b(byte[] param1ArrayOfbyte, int param1Int) {
      param1Int = Math.min(param1Int, this.a.remaining());
      if (param1Int == 0)
        return -1; 
      this.a.get(param1ArrayOfbyte, 0, param1Int);
      return param1Int;
    }
    
    public short c() {
      if (this.a.remaining() >= 1)
        return (short)(this.a.get() & 0xFF); 
      throw new DefaultImageHeaderParser.Reader.EndOfFileException();
    }
    
    public long skip(long param1Long) {
      int i = (int)Math.min(this.a.remaining(), param1Long);
      ByteBuffer byteBuffer = this.a;
      byteBuffer.position(byteBuffer.position() + i);
      return i;
    }
  }
  
  private static final class b {
    private final ByteBuffer a;
    
    b(byte[] param1ArrayOfbyte, int param1Int) {
      this.a = (ByteBuffer)ByteBuffer.wrap(param1ArrayOfbyte).order(ByteOrder.BIG_ENDIAN).limit(param1Int);
    }
    
    private boolean c(int param1Int1, int param1Int2) {
      boolean bool;
      if (this.a.remaining() - param1Int1 >= param1Int2) {
        bool = true;
      } else {
        bool = false;
      } 
      return bool;
    }
    
    short a(int param1Int) {
      int i;
      if (c(param1Int, 2)) {
        param1Int = this.a.getShort(param1Int);
        i = param1Int;
      } else {
        param1Int = -1;
        i = param1Int;
      } 
      return i;
    }
    
    int b(int param1Int) {
      if (c(param1Int, 4)) {
        param1Int = this.a.getInt(param1Int);
      } else {
        param1Int = -1;
      } 
      return param1Int;
    }
    
    int d() {
      return this.a.remaining();
    }
    
    void e(ByteOrder param1ByteOrder) {
      this.a.order(param1ByteOrder);
    }
  }
  
  private static final class c implements Reader {
    private final InputStream a;
    
    c(InputStream param1InputStream) {
      this.a = param1InputStream;
    }
    
    public int a() {
      return c() << 8 | c();
    }
    
    public int b(byte[] param1ArrayOfbyte, int param1Int) {
      int k;
      int i = 0;
      int j = 0;
      while (true) {
        k = j;
        if (i < param1Int) {
          j = this.a.read(param1ArrayOfbyte, i, param1Int - i);
          k = j;
          if (j != -1) {
            i += j;
            continue;
          } 
        } 
        break;
      } 
      if (i != 0 || k != -1)
        return i; 
      throw new DefaultImageHeaderParser.Reader.EndOfFileException();
    }
    
    public short c() {
      int i = this.a.read();
      if (i != -1)
        return (short)i; 
      throw new DefaultImageHeaderParser.Reader.EndOfFileException();
    }
    
    public long skip(long param1Long) {
      if (param1Long < 0L)
        return 0L; 
      long l;
      for (l = param1Long; l > 0L; l -= l1) {
        long l1 = this.a.skip(l);
        if (l1 <= 0L) {
          if (this.a.read() == -1)
            break; 
          l1 = 1L;
        } 
      } 
      return param1Long - l;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/DefaultImageHeaderParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */