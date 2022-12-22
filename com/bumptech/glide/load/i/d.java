package com.bumptech.glide.load.i;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.e;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class d implements n<File, ByteBuffer> {
  public n.a<ByteBuffer> c(File paramFile, int paramInt1, int paramInt2, e parame) {
    return new n.a<ByteBuffer>((c)new com.bumptech.glide.o.d(paramFile), new a(paramFile));
  }
  
  public boolean d(File paramFile) {
    return true;
  }
  
  private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {
    private final File b;
    
    a(File param1File) {
      this.b = param1File;
    }
    
    public Class<ByteBuffer> a() {
      return ByteBuffer.class;
    }
    
    public void b() {}
    
    public void cancel() {}
    
    public DataSource d() {
      return DataSource.b;
    }
    
    public void e(Priority param1Priority, com.bumptech.glide.load.data.d.a<? super ByteBuffer> param1a) {
      try {
        param1a.f(com.bumptech.glide.p.a.a(this.b));
      } catch (IOException iOException) {
        if (Log.isLoggable("ByteBufferFileLoader", 3))
          Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", iOException); 
        param1a.c(iOException);
      } 
    }
  }
  
  public static class b implements o<File, ByteBuffer> {
    public n<File, ByteBuffer> b(r param1r) {
      return new d();
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */