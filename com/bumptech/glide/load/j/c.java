package com.bumptech.glide.load.j;

import android.content.Context;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.h;
import java.security.MessageDigest;

public final class c<T> implements h<T> {
  private static final h<?> b = new c();
  
  public static <T> c<T> c() {
    return (c)b;
  }
  
  public void a(MessageDigest paramMessageDigest) {}
  
  public s<T> b(Context paramContext, s<T> params, int paramInt1, int paramInt2) {
    return params;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/j/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */