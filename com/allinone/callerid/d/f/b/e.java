package com.allinone.callerid.d.f.b;

import android.util.Log;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.j.h.e;
import java.io.File;
import java.io.IOException;
import pl.droidsonroids.gif.c;

public class e implements e<b, c> {
  public s<c> a(s<b> params, com.bumptech.glide.load.e parame) {
    Log.d("<ytr>", "transcode: GifDrawableTranscoder");
    File file = ((b)params.get()).a();
    try {
      c c = new c();
      this(file);
      return (s<c>)new d(c);
    } catch (IOException iOException) {
      throw new RuntimeException(iOException);
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */