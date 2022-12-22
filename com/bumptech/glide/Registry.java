package com.bumptech.glide;

import b.h.j.f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.q;
import com.bumptech.glide.load.engine.s;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i.n;
import com.bumptech.glide.load.i.o;
import com.bumptech.glide.load.i.p;
import com.bumptech.glide.load.j.h.e;
import com.bumptech.glide.load.j.h.f;
import com.bumptech.glide.n.a;
import com.bumptech.glide.n.b;
import com.bumptech.glide.n.c;
import com.bumptech.glide.n.d;
import com.bumptech.glide.n.e;
import com.bumptech.glide.n.f;
import com.bumptech.glide.p.l.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Registry {
  private final p a;
  
  private final a b;
  
  private final e c;
  
  private final f d;
  
  private final f e;
  
  private final f f;
  
  private final b g;
  
  private final d h = new d();
  
  private final c i = new c();
  
  private final f<List<Throwable>> j;
  
  public Registry() {
    f<List<Throwable>> f1 = a.e();
    this.j = f1;
    this.a = new p(f1);
    this.b = new a();
    this.c = new e();
    this.d = new f();
    this.e = new f();
    this.f = new f();
    this.g = new b();
    t(Arrays.asList(new String[] { "Gif", "Bitmap", "BitmapDrawable" }));
  }
  
  private <Data, TResource, Transcode> List<g<Data, TResource, Transcode>> f(Class<Data> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2) {
    ArrayList<g> arrayList = new ArrayList();
    for (Class clazz : this.c.d(paramClass, paramClass1)) {
      for (Class clazz1 : this.f.b(clazz, paramClass2))
        arrayList.add(new g(paramClass, clazz, clazz1, this.c.b(paramClass, clazz), this.f.a(clazz, clazz1), this.j)); 
    } 
    return (List)arrayList;
  }
  
  public <Data> Registry a(Class<Data> paramClass, a<Data> parama) {
    this.b.a(paramClass, parama);
    return this;
  }
  
  public <TResource> Registry b(Class<TResource> paramClass, g<TResource> paramg) {
    this.d.a(paramClass, paramg);
    return this;
  }
  
  public <Data, TResource> Registry c(Class<Data> paramClass, Class<TResource> paramClass1, f<Data, TResource> paramf) {
    e("legacy_append", paramClass, paramClass1, paramf);
    return this;
  }
  
  public <Model, Data> Registry d(Class<Model> paramClass, Class<Data> paramClass1, o<Model, Data> paramo) {
    this.a.a(paramClass, paramClass1, paramo);
    return this;
  }
  
  public <Data, TResource> Registry e(String paramString, Class<Data> paramClass, Class<TResource> paramClass1, f<Data, TResource> paramf) {
    this.c.a(paramString, paramf, paramClass, paramClass1);
    return this;
  }
  
  public List<ImageHeaderParser> g() {
    List<ImageHeaderParser> list = this.g.b();
    if (!list.isEmpty())
      return list; 
    throw new NoImageHeaderParserException();
  }
  
  public <Data, TResource, Transcode> q<Data, TResource, Transcode> h(Class<Data> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2) {
    q q = this.i.a(paramClass, paramClass1, paramClass2);
    if (this.i.c(q))
      return null; 
    q<Data, TResource, Transcode> q1 = q;
    if (q == null) {
      List<g<Data, TResource, Transcode>> list = f(paramClass, paramClass1, paramClass2);
      if (list.isEmpty()) {
        list = null;
      } else {
        q1 = new q(paramClass, paramClass1, paramClass2, list, this.j);
      } 
      this.i.d(paramClass, paramClass1, paramClass2, q1);
    } 
    return q1;
  }
  
  public <Model> List<n<Model, ?>> i(Model paramModel) {
    return this.a.d(paramModel);
  }
  
  public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> paramClass, Class<TResource> paramClass1, Class<Transcode> paramClass2) {
    List<Class<?>> list1 = this.h.a(paramClass, paramClass1, paramClass2);
    List<Class<?>> list2 = list1;
    if (list1 == null) {
      list2 = new ArrayList();
      for (Class<?> clazz : (Iterable<Class<?>>)this.a.c(paramClass)) {
        for (Class<?> clazz : (Iterable<Class<?>>)this.c.d(clazz, paramClass1)) {
          if (!this.f.b(clazz, paramClass2).isEmpty() && !list2.contains(clazz))
            list2.add(clazz); 
        } 
      } 
      this.h.b(paramClass, paramClass1, paramClass2, Collections.unmodifiableList(list2));
    } 
    return list2;
  }
  
  public <X> g<X> k(s<X> params) {
    g<X> g = this.d.b(params.c());
    if (g != null)
      return g; 
    throw new NoResultEncoderAvailableException(params.c());
  }
  
  public <X> e<X> l(X paramX) {
    return this.e.a(paramX);
  }
  
  public <X> a<X> m(X paramX) {
    a<X> a1 = this.b.b(paramX.getClass());
    if (a1 != null)
      return a1; 
    throw new NoSourceEncoderAvailableException(paramX.getClass());
  }
  
  public boolean n(s<?> params) {
    boolean bool;
    if (this.d.b(params.c()) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public <Data, TResource> Registry o(Class<Data> paramClass, Class<TResource> paramClass1, f<Data, TResource> paramf) {
    p("legacy_prepend_all", paramClass, paramClass1, paramf);
    return this;
  }
  
  public <Data, TResource> Registry p(String paramString, Class<Data> paramClass, Class<TResource> paramClass1, f<Data, TResource> paramf) {
    this.c.e(paramString, paramf, paramClass, paramClass1);
    return this;
  }
  
  public Registry q(ImageHeaderParser paramImageHeaderParser) {
    this.g.a(paramImageHeaderParser);
    return this;
  }
  
  public Registry r(e.a<?> parama) {
    this.e.b(parama);
    return this;
  }
  
  public <TResource, Transcode> Registry s(Class<TResource> paramClass, Class<Transcode> paramClass1, e<TResource, Transcode> parame) {
    this.f.c(paramClass, paramClass1, parame);
    return this;
  }
  
  public final Registry t(List<String> paramList) {
    ArrayList<String> arrayList = new ArrayList(paramList.size());
    arrayList.add("legacy_prepend_all");
    Iterator<String> iterator = paramList.iterator();
    while (iterator.hasNext())
      arrayList.add(iterator.next()); 
    arrayList.add("legacy_append");
    this.c.f(arrayList);
    return this;
  }
  
  public static class MissingComponentException extends RuntimeException {
    public MissingComponentException(String param1String) {
      super(param1String);
    }
  }
  
  public static final class NoImageHeaderParserException extends MissingComponentException {
    public NoImageHeaderParserException() {
      super("Failed to find image header parser.");
    }
  }
  
  public static class NoModelLoaderAvailableException extends MissingComponentException {
    public NoModelLoaderAvailableException(Class<?> param1Class1, Class<?> param1Class2) {
      super(stringBuilder.toString());
    }
    
    public NoModelLoaderAvailableException(Object param1Object) {
      super(stringBuilder.toString());
    }
    
    public <M> NoModelLoaderAvailableException(M param1M, List<n<M, ?>> param1List) {
      super(stringBuilder.toString());
    }
  }
  
  public static class NoResultEncoderAvailableException extends MissingComponentException {
    public NoResultEncoderAvailableException(Class<?> param1Class) {
      super(stringBuilder.toString());
    }
  }
  
  public static class NoSourceEncoderAvailableException extends MissingComponentException {
    public NoSourceEncoderAvailableException(Class<?> param1Class) {
      super(stringBuilder.toString());
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/Registry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */