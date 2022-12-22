package com.bumptech.glide.n;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

public final class b {
  private final List<ImageHeaderParser> a = new ArrayList<ImageHeaderParser>();
  
  public void a(ImageHeaderParser paramImageHeaderParser) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: aload_1
    //   7: invokeinterface add : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
  
  public List<ImageHeaderParser> b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/List;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/n/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */