package com.allinone.callerid.d.f.b;

import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i.t;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class f implements f<InputStream, b> {
  private final b a;
  
  private final Registry b;
  
  private final t c;
  
  private final File d;
  
  private List<b> e;
  
  public f(c paramc, File paramFile) {
    this.b = paramc.j();
    b b1 = paramc.e();
    this.a = b1;
    this.c = new t(b1);
    this.d = paramFile;
  }
  
  private b d() {
    b b1;
    f();
    if (this.e.isEmpty()) {
      b1 = null;
    } else {
      b1 = this.e.remove(0);
    } 
    b b2 = b1;
    if (b1 == null)
      b2 = new b(this, new File(this.d, String.valueOf(System.currentTimeMillis()))); 
    File file = b2.a();
    if (file.exists() || file.createNewFile()) {
      b2.b(false);
      return b2;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("can not create file bridge in ");
    stringBuilder.append(this.d.getAbsolutePath());
    throw new IOException(stringBuilder.toString());
  }
  
  private void f() {
    if (this.e != null)
      return; 
    this.e = new ArrayList<b>();
    File[] arrayOfFile = this.d.listFiles();
    if (arrayOfFile == null)
      return; 
    int i = arrayOfFile.length;
    for (byte b1 = 0; b1 < i; b1++) {
      b b2 = new b(this, arrayOfFile[b1]);
      this.e.add(b2);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("inflateFileBridgeIfNeeded: ");
    stringBuilder.append(this.e);
    Log.d("<ytr>", stringBuilder.toString());
  }
  
  public s<b> c(InputStream paramInputStream, int paramInt1, int paramInt2, e parame) {
    b b1 = d();
    boolean bool = this.c.c(paramInputStream, b1.a(), parame);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("decode: ");
    stringBuilder.append(bool);
    Log.d("<ytr>", stringBuilder.toString());
    return (s<b>)(bool ? new c(b1) : null);
  }
  
  public boolean e(InputStream paramInputStream, e parame) {
    boolean bool;
    if (b.e(this.b.g(), paramInputStream, this.a) == ImageHeaderParser.ImageType.GIF) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void g(b paramb) {
    List<b> list = this.e;
    if (list != null)
      list.add(paramb); 
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/allinone/callerid/d/f/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */