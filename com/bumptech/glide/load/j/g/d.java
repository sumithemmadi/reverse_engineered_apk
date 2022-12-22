package com.bumptech.glide.load.j.g;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.g;
import com.bumptech.glide.p.a;
import java.io.File;
import java.io.IOException;

public class d implements g<c> {
  public EncodeStrategy b(e parame) {
    return EncodeStrategy.b;
  }
  
  public boolean c(s<c> params, File paramFile, e parame) {
    boolean bool;
    c c = (c)params.get();
    try {
      a.e(c.c(), paramFile);
      bool = true;
    } catch (IOException iOException) {
      if (Log.isLoggable("GifEncoder", 5))
        Log.w("GifEncoder", "Failed to encode GIF drawable data", iOException); 
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */