package com.allinone.callerid.main;

import android.content.Context;
import com.allinone.callerid.d.f.b.a;
import com.allinone.callerid.d.f.b.b;
import com.allinone.callerid.d.f.b.e;
import com.allinone.callerid.d.f.b.f;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.j.h.e;
import com.bumptech.glide.m.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import pl.droidsonroids.gif.c;

public class CustomAppGlideModule extends a {
  private void d(c paramc, Registry paramRegistry) {
    f f = new f(paramc, paramc.h().getDir("glide_temp", 0));
    paramRegistry.o(InputStream.class, b.class, (f)f);
    paramRegistry.o(ByteBuffer.class, b.class, (f)new a(f));
    paramRegistry.s(b.class, c.class, (e)new e());
  }
  
  public void a(Context paramContext, c paramc, Registry paramRegistry) {
    d(paramc, paramRegistry);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/main/CustomAppGlideModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */