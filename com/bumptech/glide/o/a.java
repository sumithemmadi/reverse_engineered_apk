package com.bumptech.glide.o;

import android.content.Context;
import com.bumptech.glide.load.c;
import com.bumptech.glide.p.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class a implements c {
  private final int b;
  
  private final c c;
  
  private a(int paramInt, c paramc) {
    this.b = paramInt;
    this.c = paramc;
  }
  
  public static c c(Context paramContext) {
    c c1 = b.c(paramContext);
    return new a((paramContext.getResources().getConfiguration()).uiMode & 0x30, c1);
  }
  
  public void a(MessageDigest paramMessageDigest) {
    this.c.a(paramMessageDigest);
    paramMessageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof a;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (bool) {
      paramObject = paramObject;
      bool2 = bool1;
      if (this.b == ((a)paramObject).b) {
        bool2 = bool1;
        if (this.c.equals(((a)paramObject).c))
          bool2 = true; 
      } 
    } 
    return bool2;
  }
  
  public int hashCode() {
    return k.n(this.c, this.b);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */