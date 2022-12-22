package com.bumptech.glide.load.j;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.d;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.q;

public abstract class a<T> implements f<ImageDecoder.Source, T> {
  final q a = q.b();
  
  protected abstract s<T> c(ImageDecoder.Source paramSource, int paramInt1, int paramInt2, ImageDecoder.OnHeaderDecodedListener paramOnHeaderDecodedListener);
  
  public final s<T> d(ImageDecoder.Source paramSource, int paramInt1, int paramInt2, e parame) {
    boolean bool;
    DecodeFormat decodeFormat = (DecodeFormat)parame.c(l.a);
    DownsampleStrategy downsampleStrategy = (DownsampleStrategy)parame.c(DownsampleStrategy.h);
    d d = l.e;
    if (parame.c(d) != null && ((Boolean)parame.c(d)).booleanValue()) {
      bool = true;
    } else {
      bool = false;
    } 
    return c(paramSource, paramInt1, paramInt2, new a(this, paramInt1, paramInt2, bool, decodeFormat, downsampleStrategy, (PreferredColorSpace)parame.c(l.b)));
  }
  
  public final boolean e(ImageDecoder.Source paramSource, e parame) {
    return true;
  }
  
  class a implements ImageDecoder.OnHeaderDecodedListener {
    a(a this$0, int param1Int1, int param1Int2, boolean param1Boolean, DecodeFormat param1DecodeFormat, DownsampleStrategy param1DownsampleStrategy, PreferredColorSpace param1PreferredColorSpace) {}
    
    @SuppressLint({"Override"})
    public void onHeaderDecoded(ImageDecoder param1ImageDecoder, ImageDecoder.ImageInfo param1ImageInfo, ImageDecoder.Source param1Source) {
      q q = this.g.a;
      int i = this.a;
      int j = this.b;
      boolean bool = this.c;
      boolean bool1 = false;
      if (q.e(i, j, bool, false)) {
        param1ImageDecoder.setAllocator(3);
      } else {
        param1ImageDecoder.setAllocator(1);
      } 
      if (this.d == DecodeFormat.c)
        param1ImageDecoder.setMemorySizePolicy(0); 
      param1ImageDecoder.setOnPartialImageListener(new a(this));
      Size size = param1ImageInfo.getSize();
      i = this.a;
      j = i;
      if (i == Integer.MIN_VALUE)
        j = size.getWidth(); 
      int k = this.b;
      i = k;
      if (k == Integer.MIN_VALUE)
        i = size.getHeight(); 
      float f = this.e.b(size.getWidth(), size.getHeight(), j, i);
      j = Math.round(size.getWidth() * f);
      i = Math.round(size.getHeight() * f);
      if (Log.isLoggable("ImageDecoder", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resizing from [");
        stringBuilder.append(size.getWidth());
        stringBuilder.append("x");
        stringBuilder.append(size.getHeight());
        stringBuilder.append("] to [");
        stringBuilder.append(j);
        stringBuilder.append("x");
        stringBuilder.append(i);
        stringBuilder.append("] scaleFactor: ");
        stringBuilder.append(f);
        Log.v("ImageDecoder", stringBuilder.toString());
      } 
      param1ImageDecoder.setTargetSize(j, i);
      j = Build.VERSION.SDK_INT;
      if (j >= 28) {
        ColorSpace.Named named;
        j = bool1;
        if (this.f == PreferredColorSpace.c) {
          j = bool1;
          if (param1ImageInfo.getColorSpace() != null) {
            j = bool1;
            if (param1ImageInfo.getColorSpace().isWideGamut())
              j = 1; 
          } 
        } 
        if (j != 0) {
          named = ColorSpace.Named.DISPLAY_P3;
        } else {
          named = ColorSpace.Named.SRGB;
        } 
        param1ImageDecoder.setTargetColorSpace(ColorSpace.get(named));
      } else if (j >= 26) {
        param1ImageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
      } 
    }
    
    class a implements ImageDecoder.OnPartialImageListener {
      a(a.a this$0) {}
      
      public boolean onPartialImage(ImageDecoder.DecodeException param2DecodeException) {
        return false;
      }
    }
  }
  
  class a implements ImageDecoder.OnPartialImageListener {
    a(a this$0) {}
    
    public boolean onPartialImage(ImageDecoder.DecodeException param1DecodeException) {
      return false;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */