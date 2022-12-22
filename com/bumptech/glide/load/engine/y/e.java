package com.bumptech.glide.load.engine.y;

import android.util.Log;
import com.bumptech.glide.k.a;
import com.bumptech.glide.load.c;
import java.io.File;
import java.io.IOException;

public class e implements a {
  private final j a;
  
  private final File b;
  
  private final long c;
  
  private final c d = new c();
  
  private a e;
  
  @Deprecated
  protected e(File paramFile, long paramLong) {
    this.b = paramFile;
    this.c = paramLong;
    this.a = new j();
  }
  
  public static a c(File paramFile, long paramLong) {
    return new e(paramFile, paramLong);
  }
  
  private a d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : Lcom/bumptech/glide/k/a;
    //   6: ifnonnull -> 26
    //   9: aload_0
    //   10: aload_0
    //   11: getfield b : Ljava/io/File;
    //   14: iconst_1
    //   15: iconst_1
    //   16: aload_0
    //   17: getfield c : J
    //   20: invokestatic F : (Ljava/io/File;IIJ)Lcom/bumptech/glide/k/a;
    //   23: putfield e : Lcom/bumptech/glide/k/a;
    //   26: aload_0
    //   27: getfield e : Lcom/bumptech/glide/k/a;
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: areturn
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	26	35	finally
    //   26	31	35	finally
  }
  
  public void a(c paramc, a.b paramb) {
    String str = this.a.b(paramc);
    this.d.a(str);
    try {
      if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
        StringBuilder stringBuilder = new StringBuilder();
        this();
        stringBuilder.append("Put: Obtained: ");
        stringBuilder.append(str);
        stringBuilder.append(" for for Key: ");
        stringBuilder.append(paramc);
        Log.v("DiskLruCacheWrapper", stringBuilder.toString());
      } 
      try {
        a a1 = d();
        a.e e1 = a1.B(str);
        if (e1 != null)
          return; 
        a.c c1 = a1.x(str);
        if (c1 != null) {
          try {
            if (paramb.a(c1.f(0)))
              c1.e(); 
          } finally {
            c1.b();
          } 
        } else {
          IllegalStateException illegalStateException = new IllegalStateException();
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Had two simultaneous puts for: ");
          stringBuilder.append(str);
          this(stringBuilder.toString());
          throw illegalStateException;
        } 
      } catch (IOException iOException) {
        if (Log.isLoggable("DiskLruCacheWrapper", 5))
          Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", iOException); 
      } 
      return;
    } finally {
      this.d.b(str);
    } 
  }
  
  public File b(c paramc) {
    String str = this.a.b(paramc);
    if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Get: Obtained: ");
      stringBuilder.append(str);
      stringBuilder.append(" for for Key: ");
      stringBuilder.append(paramc);
      Log.v("DiskLruCacheWrapper", stringBuilder.toString());
    } 
    c c1 = null;
    try {
      a.e e1 = d().B(str);
      paramc = c1;
      if (e1 != null)
        File file = e1.a(0); 
    } catch (IOException iOException) {
      paramc = c1;
      if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
        Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", iOException);
        paramc = c1;
      } 
    } 
    return (File)paramc;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/y/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */