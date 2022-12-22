package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.p.j;
import java.io.InputStream;
import java.util.List;

interface r {
  int a();
  
  Bitmap b(BitmapFactory.Options paramOptions);
  
  void c();
  
  ImageHeaderParser.ImageType d();
  
  public static final class a implements r {
    private final k a;
    
    private final com.bumptech.glide.load.engine.x.b b;
    
    private final List<ImageHeaderParser> c;
    
    a(InputStream param1InputStream, List<ImageHeaderParser> param1List, com.bumptech.glide.load.engine.x.b param1b) {
      this.b = (com.bumptech.glide.load.engine.x.b)j.d(param1b);
      this.c = (List<ImageHeaderParser>)j.d(param1List);
      this.a = new k(param1InputStream, param1b);
    }
    
    public int a() {
      return com.bumptech.glide.load.b.b(this.c, this.a.d(), this.b);
    }
    
    public Bitmap b(BitmapFactory.Options param1Options) {
      return BitmapFactory.decodeStream(this.a.d(), null, param1Options);
    }
    
    public void c() {
      this.a.c();
    }
    
    public ImageHeaderParser.ImageType d() {
      return com.bumptech.glide.load.b.e(this.c, this.a.d(), this.b);
    }
  }
  
  public static final class b implements r {
    private final com.bumptech.glide.load.engine.x.b a;
    
    private final List<ImageHeaderParser> b;
    
    private final ParcelFileDescriptorRewinder c;
    
    b(ParcelFileDescriptor param1ParcelFileDescriptor, List<ImageHeaderParser> param1List, com.bumptech.glide.load.engine.x.b param1b) {
      this.a = (com.bumptech.glide.load.engine.x.b)j.d(param1b);
      this.b = (List<ImageHeaderParser>)j.d(param1List);
      this.c = new ParcelFileDescriptorRewinder(param1ParcelFileDescriptor);
    }
    
    public int a() {
      return com.bumptech.glide.load.b.a(this.b, this.c, this.a);
    }
    
    public Bitmap b(BitmapFactory.Options param1Options) {
      return BitmapFactory.decodeFileDescriptor(this.c.d().getFileDescriptor(), null, param1Options);
    }
    
    public void c() {}
    
    public ImageHeaderParser.ImageType d() {
      return com.bumptech.glide.load.b.d(this.b, this.c, this.a);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */