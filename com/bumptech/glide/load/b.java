package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class b {
  public static int a(List<ImageHeaderParser> paramList, ParcelFileDescriptorRewinder paramParcelFileDescriptorRewinder, b paramb) {
    return c(paramList, new e(paramParcelFileDescriptorRewinder, paramb));
  }
  
  public static int b(List<ImageHeaderParser> paramList, InputStream paramInputStream, b paramb) {
    RecyclableBufferedInputStream recyclableBufferedInputStream;
    if (paramInputStream == null)
      return -1; 
    InputStream inputStream = paramInputStream;
    if (!paramInputStream.markSupported())
      recyclableBufferedInputStream = new RecyclableBufferedInputStream(paramInputStream, paramb); 
    recyclableBufferedInputStream.mark(5242880);
    return c(paramList, new d((InputStream)recyclableBufferedInputStream, paramb));
  }
  
  private static int c(List<ImageHeaderParser> paramList, f paramf) {
    int i = paramList.size();
    for (byte b1 = 0; b1 < i; b1++) {
      int j = paramf.a(paramList.get(b1));
      if (j != -1)
        return j; 
    } 
    return -1;
  }
  
  public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> paramList, ParcelFileDescriptorRewinder paramParcelFileDescriptorRewinder, b paramb) {
    return g(paramList, new c(paramParcelFileDescriptorRewinder, paramb));
  }
  
  public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> paramList, InputStream paramInputStream, b paramb) {
    RecyclableBufferedInputStream recyclableBufferedInputStream;
    if (paramInputStream == null)
      return ImageHeaderParser.ImageType.UNKNOWN; 
    InputStream inputStream = paramInputStream;
    if (!paramInputStream.markSupported())
      recyclableBufferedInputStream = new RecyclableBufferedInputStream(paramInputStream, paramb); 
    recyclableBufferedInputStream.mark(5242880);
    return g(paramList, new a((InputStream)recyclableBufferedInputStream));
  }
  
  public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> paramList, ByteBuffer paramByteBuffer) {
    return (paramByteBuffer == null) ? ImageHeaderParser.ImageType.UNKNOWN : g(paramList, new b(paramByteBuffer));
  }
  
  private static ImageHeaderParser.ImageType g(List<ImageHeaderParser> paramList, g paramg) {
    int i = paramList.size();
    for (byte b1 = 0; b1 < i; b1++) {
      ImageHeaderParser.ImageType imageType = paramg.a(paramList.get(b1));
      if (imageType != ImageHeaderParser.ImageType.UNKNOWN)
        return imageType; 
    } 
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
  
  class a implements g {
    a(b this$0) {}
    
    public ImageHeaderParser.ImageType a(ImageHeaderParser param1ImageHeaderParser) {
      try {
        return param1ImageHeaderParser.b(this.a);
      } finally {
        this.a.reset();
      } 
    }
  }
  
  class b implements g {
    b(b this$0) {}
    
    public ImageHeaderParser.ImageType a(ImageHeaderParser param1ImageHeaderParser) {
      return param1ImageHeaderParser.a(this.a);
    }
  }
  
  class c implements g {
    c(b this$0, b param1b) {}
    
    public ImageHeaderParser.ImageType a(ImageHeaderParser param1ImageHeaderParser) {
      InputStream inputStream2;
      InputStream inputStream1 = null;
      try {
        inputStream2 = (InputStream)new RecyclableBufferedInputStream();
        FileInputStream fileInputStream = new FileInputStream();
        this(this.a.d().getFileDescriptor());
        this(fileInputStream, this.b);
      } finally {
        param1ImageHeaderParser = null;
      } 
      if (inputStream2 != null)
        try {
          inputStream2.close();
        } catch (IOException iOException) {} 
      this.a.d();
      throw param1ImageHeaderParser;
    }
  }
  
  class d implements f {
    d(b this$0, b param1b) {}
    
    public int a(ImageHeaderParser param1ImageHeaderParser) {
      try {
        return param1ImageHeaderParser.c(this.a, this.b);
      } finally {
        this.a.reset();
      } 
    }
  }
  
  class e implements f {
    e(b this$0, b param1b) {}
    
    public int a(ImageHeaderParser param1ImageHeaderParser) {
      RecyclableBufferedInputStream recyclableBufferedInputStream = null;
      try {
        RecyclableBufferedInputStream recyclableBufferedInputStream1 = new RecyclableBufferedInputStream();
        FileInputStream fileInputStream = new FileInputStream();
        this(this.a.d().getFileDescriptor());
        this(fileInputStream, this.b);
        try {
          int i = param1ImageHeaderParser.c((InputStream)recyclableBufferedInputStream1, this.b);
        } finally {
          param1ImageHeaderParser = null;
        } 
      } finally {}
      if (recyclableBufferedInputStream != null)
        try {
          recyclableBufferedInputStream.close();
        } catch (IOException iOException) {} 
      this.a.d();
      throw param1ImageHeaderParser;
    }
  }
  
  private static interface f {
    int a(ImageHeaderParser param1ImageHeaderParser);
  }
  
  private static interface g {
    ImageHeaderParser.ImageType a(ImageHeaderParser param1ImageHeaderParser);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */