package com.bumptech.glide.load.i;

import android.util.Log;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.e;
import com.bumptech.glide.p.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class c implements a<ByteBuffer> {
  public boolean c(ByteBuffer paramByteBuffer, File paramFile, e parame) {
    boolean bool;
    try {
      a.e(paramByteBuffer, paramFile);
      bool = true;
    } catch (IOException iOException) {
      if (Log.isLoggable("ByteBufferEncoder", 3))
        Log.d("ByteBufferEncoder", "Failed to write data", iOException); 
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */