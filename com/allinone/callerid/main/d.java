package com.allinone.callerid.main;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.c;
import com.bumptech.glide.h;
import com.bumptech.glide.i;
import com.bumptech.glide.manager.l;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.request.a;
import com.bumptech.glide.request.e;

public class d extends i {
  public d(c paramc, l paraml, p paramp, Context paramContext) {
    super(paramc, paraml, paramp, paramContext);
  }
  
  public <ResourceType> c<ResourceType> B(Class<ResourceType> paramClass) {
    return new c<ResourceType>(this.e, this, paramClass, this.f);
  }
  
  public c<Bitmap> C() {
    return (c<Bitmap>)super.j();
  }
  
  public c<Drawable> D() {
    return (c<Drawable>)super.k();
  }
  
  public c<Drawable> E(Uri paramUri) {
    return (c<Drawable>)super.p(paramUri);
  }
  
  public c<Drawable> F(Object paramObject) {
    return (c<Drawable>)q(paramObject);
  }
  
  public c<Drawable> G(String paramString) {
    return (c<Drawable>)super.r(paramString);
  }
  
  public d H(e parame) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial w : (Lcom/bumptech/glide/request/e;)Lcom/bumptech/glide/i;
    //   7: checkcast com/allinone/callerid/main/d
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: areturn
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	15	finally
  }
  
  protected void x(e parame) {
    if (parame instanceof b) {
      super.x(parame);
    } else {
      super.x((new b()).t0((a<?>)parame));
    } 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/main/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */