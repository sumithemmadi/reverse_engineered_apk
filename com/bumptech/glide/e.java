package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.h.f;
import com.bumptech.glide.request.h.i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class e extends ContextWrapper {
  static final j<?, ?> a = new b();
  
  private final b b;
  
  private final Registry c;
  
  private final f d;
  
  private final c.a e;
  
  private final List<d<Object>> f;
  
  private final Map<Class<?>, j<?, ?>> g;
  
  private final i h;
  
  private final f i;
  
  private final int j;
  
  private e k;
  
  public e(Context paramContext, b paramb, Registry paramRegistry, f paramf, c.a parama, Map<Class<?>, j<?, ?>> paramMap, List<d<Object>> paramList, i parami, f paramf1, int paramInt) {
    super(paramContext.getApplicationContext());
    this.b = paramb;
    this.c = paramRegistry;
    this.d = paramf;
    this.e = parama;
    this.f = paramList;
    this.g = paramMap;
    this.h = parami;
    this.i = paramf1;
    this.j = paramInt;
  }
  
  public <X> i<ImageView, X> a(ImageView paramImageView, Class<X> paramClass) {
    return this.d.a(paramImageView, paramClass);
  }
  
  public b b() {
    return this.b;
  }
  
  public List<d<Object>> c() {
    return this.f;
  }
  
  public e d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Lcom/bumptech/glide/request/e;
    //   6: ifnonnull -> 28
    //   9: aload_0
    //   10: aload_0
    //   11: getfield e : Lcom/bumptech/glide/c$a;
    //   14: invokeinterface a : ()Lcom/bumptech/glide/request/e;
    //   19: invokevirtual U : ()Lcom/bumptech/glide/request/a;
    //   22: checkcast com/bumptech/glide/request/e
    //   25: putfield k : Lcom/bumptech/glide/request/e;
    //   28: aload_0
    //   29: getfield k : Lcom/bumptech/glide/request/e;
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: areturn
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	37	finally
    //   28	33	37	finally
  }
  
  public <T> j<?, T> e(Class<T> paramClass) {
    j<?, ?> j1;
    Map.Entry entry2;
    j j2 = this.g.get(paramClass);
    j j3 = j2;
    if (j2 == null) {
      Iterator<Map.Entry> iterator = this.g.entrySet().iterator();
      while (true) {
        j3 = j2;
        if (iterator.hasNext()) {
          entry2 = iterator.next();
          if (((Class)entry2.getKey()).isAssignableFrom(paramClass))
            j2 = (j)entry2.getValue(); 
          continue;
        } 
        break;
      } 
    } 
    Map.Entry entry1 = entry2;
    if (entry2 == null)
      j1 = a; 
    return (j)j1;
  }
  
  public i f() {
    return this.h;
  }
  
  public f g() {
    return this.i;
  }
  
  public int h() {
    return this.j;
  }
  
  public Registry i() {
    return this.c;
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */