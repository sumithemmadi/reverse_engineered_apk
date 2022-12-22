package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.allinone.callerid.main.CustomAppGlideModule;
import com.bumptech.glide.manager.o;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
  private final CustomAppGlideModule a = new CustomAppGlideModule();
  
  public GeneratedAppGlideModuleImpl(Context paramContext) {
    if (Log.isLoggable("Glide", 3))
      Log.d("Glide", "Discovered AppGlideModule from annotation: com.allinone.callerid.main.CustomAppGlideModule"); 
  }
  
  public void a(Context paramContext, c paramc, Registry paramRegistry) {
    this.a.a(paramContext, paramc, paramRegistry);
  }
  
  public void b(Context paramContext, d paramd) {
    this.a.b(paramContext, paramd);
  }
  
  public boolean c() {
    return this.a.c();
  }
  
  public Set<Class<?>> d() {
    return Collections.emptySet();
  }
  
  a f() {
    return new a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/GeneratedAppGlideModuleImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */