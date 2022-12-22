package com.bumptech.glide.load.engine.y;

import android.content.Context;
import java.io.File;

public final class f extends d {
  public f(Context paramContext) {
    this(paramContext, "image_manager_disk_cache", 262144000L);
  }
  
  public f(Context paramContext, String paramString, long paramLong) {
    super(new a(paramContext, paramString), paramLong);
  }
  
  class a implements d.a {
    a(f this$0, String param1String) {}
    
    public File a() {
      File file = this.a.getCacheDir();
      return (file == null) ? null : ((this.b != null) ? new File(file, this.b) : file);
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/y/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */