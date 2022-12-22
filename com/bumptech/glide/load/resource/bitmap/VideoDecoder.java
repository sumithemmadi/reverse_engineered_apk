package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public class VideoDecoder<T> implements f<T, Bitmap> {
  public static final com.bumptech.glide.load.d<Long> a = com.bumptech.glide.load.d.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1L), new a());
  
  public static final com.bumptech.glide.load.d<Integer> b = com.bumptech.glide.load.d.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new b());
  
  private static final e c = new e();
  
  private final f<T> d;
  
  private final com.bumptech.glide.load.engine.x.e e;
  
  private final e f;
  
  VideoDecoder(com.bumptech.glide.load.engine.x.e parame, f<T> paramf) {
    this(parame, paramf, c);
  }
  
  VideoDecoder(com.bumptech.glide.load.engine.x.e parame, f<T> paramf, e parame1) {
    this.e = parame;
    this.d = paramf;
    this.f = parame1;
  }
  
  public static f<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.x.e parame) {
    return new VideoDecoder<AssetFileDescriptor>(parame, new c(null));
  }
  
  public static f<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.x.e parame) {
    return new VideoDecoder<ByteBuffer>(parame, new d());
  }
  
  private static Bitmap e(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3, DownsampleStrategy paramDownsampleStrategy) {
    Bitmap bitmap;
    if (Build.VERSION.SDK_INT >= 27 && paramInt2 != Integer.MIN_VALUE && paramInt3 != Integer.MIN_VALUE && paramDownsampleStrategy != DownsampleStrategy.f) {
      Bitmap bitmap1 = g(paramMediaMetadataRetriever, paramLong, paramInt1, paramInt2, paramInt3, paramDownsampleStrategy);
    } else {
      paramDownsampleStrategy = null;
    } 
    DownsampleStrategy downsampleStrategy = paramDownsampleStrategy;
    if (paramDownsampleStrategy == null)
      bitmap = f(paramMediaMetadataRetriever, paramLong, paramInt1); 
    if (bitmap != null)
      return bitmap; 
    throw new VideoDecoderException();
  }
  
  private static Bitmap f(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt) {
    return paramMediaMetadataRetriever.getFrameAtTime(paramLong, paramInt);
  }
  
  @TargetApi(27)
  private static Bitmap g(MediaMetadataRetriever paramMediaMetadataRetriever, long paramLong, int paramInt1, int paramInt2, int paramInt3, DownsampleStrategy paramDownsampleStrategy) {
    try {
      int i = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(18));
      int j = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(19));
      int k = Integer.parseInt(paramMediaMetadataRetriever.extractMetadata(24));
      if (k != 90) {
        int i1 = i;
        int i2 = j;
        return paramMediaMetadataRetriever.getScaledFrameAtTime(paramLong, paramInt1, Math.round(i1 * f2), Math.round(f2 * i2));
      } 
      int n = i;
      return paramMediaMetadataRetriever.getScaledFrameAtTime(paramLong, paramInt1, Math.round(m * f1), Math.round(f1 * n));
    } finally {
      paramMediaMetadataRetriever = null;
      if (Log.isLoggable("VideoDecoder", 3))
        Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", (Throwable)paramMediaMetadataRetriever); 
    } 
  }
  
  public static f<ParcelFileDescriptor, Bitmap> h(com.bumptech.glide.load.engine.x.e parame) {
    return new VideoDecoder<ParcelFileDescriptor>(parame, new g());
  }
  
  public boolean a(T paramT, com.bumptech.glide.load.e parame) {
    return true;
  }
  
  public s<Bitmap> b(T paramT, int paramInt1, int paramInt2, com.bumptech.glide.load.e parame) {
    long l = ((Long)parame.c(a)).longValue();
    if (l >= 0L || l == -1L) {
      Integer integer1 = (Integer)parame.c(b);
      Integer integer2 = integer1;
      if (integer1 == null)
        integer2 = Integer.valueOf(2); 
      DownsampleStrategy downsampleStrategy2 = (DownsampleStrategy)parame.c(DownsampleStrategy.h);
      DownsampleStrategy downsampleStrategy1 = downsampleStrategy2;
      if (downsampleStrategy2 == null)
        downsampleStrategy1 = DownsampleStrategy.g; 
      MediaMetadataRetriever mediaMetadataRetriever = this.f.a();
      try {
        this.d.a(mediaMetadataRetriever, paramT);
        Bitmap bitmap = e(mediaMetadataRetriever, l, integer2.intValue(), paramInt1, paramInt2, downsampleStrategy1);
        return e.e(bitmap, this.e);
      } finally {
        mediaMetadataRetriever.release();
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
    stringBuilder.append(l);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static final class VideoDecoderException extends RuntimeException {
    private static final long serialVersionUID = -2556382523004027815L;
    
    VideoDecoderException() {
      super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
    }
  }
  
  class a implements com.bumptech.glide.load.d.b<Long> {
    private final ByteBuffer a = ByteBuffer.allocate(8);
    
    public void b(byte[] param1ArrayOfbyte, Long param1Long, MessageDigest param1MessageDigest) {
      param1MessageDigest.update(param1ArrayOfbyte);
      synchronized (this.a) {
        this.a.position(0);
        param1MessageDigest.update(this.a.putLong(param1Long.longValue()).array());
        return;
      } 
    }
  }
  
  class b implements com.bumptech.glide.load.d.b<Integer> {
    private final ByteBuffer a = ByteBuffer.allocate(4);
    
    public void b(byte[] param1ArrayOfbyte, Integer param1Integer, MessageDigest param1MessageDigest) {
      if (param1Integer == null)
        return; 
      param1MessageDigest.update(param1ArrayOfbyte);
      synchronized (this.a) {
        this.a.position(0);
        param1MessageDigest.update(this.a.putInt(param1Integer.intValue()).array());
        return;
      } 
    }
  }
  
  private static final class c implements f<AssetFileDescriptor> {
    private c() {}
    
    public void b(MediaMetadataRetriever param1MediaMetadataRetriever, AssetFileDescriptor param1AssetFileDescriptor) {
      param1MediaMetadataRetriever.setDataSource(param1AssetFileDescriptor.getFileDescriptor(), param1AssetFileDescriptor.getStartOffset(), param1AssetFileDescriptor.getLength());
    }
  }
  
  static final class d implements f<ByteBuffer> {
    public void b(MediaMetadataRetriever param1MediaMetadataRetriever, ByteBuffer param1ByteBuffer) {
      param1MediaMetadataRetriever.setDataSource(new a(this, param1ByteBuffer));
    }
    
    class a extends MediaDataSource {
      a(VideoDecoder.d this$0, ByteBuffer param2ByteBuffer) {}
      
      public void close() {}
      
      public long getSize() {
        return this.b.limit();
      }
      
      public int readAt(long param2Long, byte[] param2ArrayOfbyte, int param2Int1, int param2Int2) {
        if (param2Long >= this.b.limit())
          return -1; 
        this.b.position((int)param2Long);
        param2Int2 = Math.min(param2Int2, this.b.remaining());
        this.b.get(param2ArrayOfbyte, param2Int1, param2Int2);
        return param2Int2;
      }
    }
  }
  
  class a extends MediaDataSource {
    a(VideoDecoder this$0, ByteBuffer param1ByteBuffer) {}
    
    public void close() {}
    
    public long getSize() {
      return this.b.limit();
    }
    
    public int readAt(long param1Long, byte[] param1ArrayOfbyte, int param1Int1, int param1Int2) {
      if (param1Long >= this.b.limit())
        return -1; 
      this.b.position((int)param1Long);
      param1Int2 = Math.min(param1Int2, this.b.remaining());
      this.b.get(param1ArrayOfbyte, param1Int1, param1Int2);
      return param1Int2;
    }
  }
  
  static class e {
    public MediaMetadataRetriever a() {
      return new MediaMetadataRetriever();
    }
  }
  
  static interface f<T> {
    void a(MediaMetadataRetriever param1MediaMetadataRetriever, T param1T);
  }
  
  static final class g implements f<ParcelFileDescriptor> {
    public void b(MediaMetadataRetriever param1MediaMetadataRetriever, ParcelFileDescriptor param1ParcelFileDescriptor) {
      param1MediaMetadataRetriever.setDataSource(param1ParcelFileDescriptor.getFileDescriptor());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/VideoDecoder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */