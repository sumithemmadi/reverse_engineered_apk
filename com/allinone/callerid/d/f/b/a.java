package com.allinone.callerid.d.f.b;

import android.util.Log;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import java.nio.ByteBuffer;

public class a implements f<ByteBuffer, b> {
  private final f a;
  
  public a(f paramf) {
    this.a = paramf;
  }
  
  private static boolean e(e parame) {
    return true;
  }
  
  public s<b> c(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, e parame) {
    return this.a.c(com.bumptech.glide.p.a.f(paramByteBuffer), paramInt1, paramInt2, parame);
  }
  
  public boolean d(ByteBuffer paramByteBuffer, e parame) {
    boolean bool;
    Log.d("<ytr>", "handles: BufferFileDecoder");
    if (e(parame) && this.a.e(com.bumptech.glide.p.a.f(paramByteBuffer), parame)) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */