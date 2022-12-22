package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.l.a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.x.b;
import com.bumptech.glide.load.engine.x.e;
import com.bumptech.glide.load.engine.y.h;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i.a;
import com.bumptech.glide.load.i.b;
import com.bumptech.glide.load.i.c;
import com.bumptech.glide.load.i.d;
import com.bumptech.glide.load.i.e;
import com.bumptech.glide.load.i.f;
import com.bumptech.glide.load.i.g;
import com.bumptech.glide.load.i.k;
import com.bumptech.glide.load.i.o;
import com.bumptech.glide.load.i.s;
import com.bumptech.glide.load.i.t;
import com.bumptech.glide.load.i.u;
import com.bumptech.glide.load.i.v;
import com.bumptech.glide.load.i.w;
import com.bumptech.glide.load.i.x;
import com.bumptech.glide.load.i.y.a;
import com.bumptech.glide.load.i.y.b;
import com.bumptech.glide.load.i.y.c;
import com.bumptech.glide.load.i.y.d;
import com.bumptech.glide.load.i.y.e;
import com.bumptech.glide.load.j.d.a;
import com.bumptech.glide.load.j.e.d;
import com.bumptech.glide.load.j.e.e;
import com.bumptech.glide.load.j.f.a;
import com.bumptech.glide.load.j.g.a;
import com.bumptech.glide.load.j.g.c;
import com.bumptech.glide.load.j.g.d;
import com.bumptech.glide.load.j.g.h;
import com.bumptech.glide.load.j.g.j;
import com.bumptech.glide.load.j.h.a;
import com.bumptech.glide.load.j.h.b;
import com.bumptech.glide.load.j.h.c;
import com.bumptech.glide.load.j.h.d;
import com.bumptech.glide.load.j.h.e;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bitmap.a;
import com.bumptech.glide.load.resource.bitmap.b;
import com.bumptech.glide.load.resource.bitmap.c;
import com.bumptech.glide.load.resource.bitmap.g;
import com.bumptech.glide.load.resource.bitmap.h;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.w;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.m.b;
import com.bumptech.glide.m.d;
import com.bumptech.glide.manager.d;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.p.j;
import com.bumptech.glide.p.k;
import com.bumptech.glide.request.d;
import com.bumptech.glide.request.e;
import com.bumptech.glide.request.h.f;
import com.bumptech.glide.request.h.h;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c implements ComponentCallbacks2 {
  private static volatile c b;
  
  private static volatile boolean c;
  
  private final i d;
  
  private final e e;
  
  private final h f;
  
  private final e g;
  
  private final Registry h;
  
  private final b i;
  
  private final o j;
  
  private final d k;
  
  private final List<i> l;
  
  private final a m;
  
  private MemoryCategory n;
  
  c(Context paramContext, i parami, h paramh, e parame, b paramb, o paramo, d paramd, int paramInt, a parama, Map<Class<?>, j<?, ?>> paramMap, List<d<Object>> paramList, f paramf) {
    g g;
    w w;
    this.l = new ArrayList<i>();
    this.n = MemoryCategory.c;
    this.d = parami;
    this.e = parame;
    this.i = paramb;
    this.f = paramh;
    this.j = paramo;
    this.k = paramd;
    this.m = parama;
    Resources resources = paramContext.getResources();
    Registry registry = new Registry();
    this.h = registry;
    registry.q((ImageHeaderParser)new DefaultImageHeaderParser());
    int j = Build.VERSION.SDK_INT;
    if (j >= 27)
      registry.q((ImageHeaderParser)new o()); 
    List<ImageHeaderParser> list = registry.g();
    a a1 = new a(paramContext, list, parame, paramb);
    f<ParcelFileDescriptor, Bitmap> f1 = VideoDecoder.h(parame);
    l l = new l(registry.g(), resources.getDisplayMetrics(), parame, paramb);
    if (paramf.a(d.b.class) && j >= 28) {
      s s = new s();
      h h1 = new h();
    } else {
      g = new g(l);
      w = new w(l, paramb);
    } 
    d d1 = new d(paramContext);
    s.c c1 = new s.c(resources);
    s.d d2 = new s.d(resources);
    s.b b1 = new s.b(resources);
    s.a a2 = new s.a(resources);
    c c2 = new c(paramb);
    a a3 = new a();
    d d3 = new d();
    ContentResolver contentResolver = paramContext.getContentResolver();
    registry.<ByteBuffer>a(ByteBuffer.class, (a<ByteBuffer>)new c()).<InputStream>a(InputStream.class, (a<InputStream>)new t(paramb)).<ByteBuffer, Bitmap>e("Bitmap", ByteBuffer.class, Bitmap.class, (f<ByteBuffer, Bitmap>)g).e("Bitmap", InputStream.class, Bitmap.class, (f<InputStream, Bitmap>)w);
    if (ParcelFileDescriptorRewinder.c())
      registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, (f<ParcelFileDescriptor, Bitmap>)new u(l)); 
    registry.<ParcelFileDescriptor, Bitmap>e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, f1).<AssetFileDescriptor, Bitmap>e("Bitmap", AssetFileDescriptor.class, Bitmap.class, VideoDecoder.c(parame)).<Bitmap, Bitmap>d(Bitmap.class, Bitmap.class, (o<Bitmap, Bitmap>)v.a.a()).<Bitmap, Bitmap>e("Bitmap", Bitmap.class, Bitmap.class, (f<Bitmap, Bitmap>)new y()).<Bitmap>b(Bitmap.class, (g<Bitmap>)c2).<ByteBuffer, BitmapDrawable>e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, (f<ByteBuffer, BitmapDrawable>)new a(resources, (f)g)).<InputStream, BitmapDrawable>e("BitmapDrawable", InputStream.class, BitmapDrawable.class, (f<InputStream, BitmapDrawable>)new a(resources, (f)w)).<ParcelFileDescriptor, BitmapDrawable>e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, (f<ParcelFileDescriptor, BitmapDrawable>)new a(resources, f1)).<BitmapDrawable>b(BitmapDrawable.class, (g<BitmapDrawable>)new b(parame, (g)c2)).<InputStream, c>e("Gif", InputStream.class, c.class, (f<InputStream, c>)new j(list, (f)a1, paramb)).<ByteBuffer, c>e("Gif", ByteBuffer.class, c.class, (f<ByteBuffer, c>)a1).<c>b(c.class, (g<c>)new d()).<a, a>d(a.class, a.class, (o<a, a>)v.a.a()).<a, Bitmap>e("Bitmap", a.class, Bitmap.class, (f<a, Bitmap>)new h(parame)).<Uri, Drawable>c(Uri.class, Drawable.class, (f<Uri, Drawable>)d1).<Uri, Bitmap>c(Uri.class, Bitmap.class, (f<Uri, Bitmap>)new v(d1, parame)).r((e.a<?>)new a.a()).<File, ByteBuffer>d(File.class, ByteBuffer.class, (o<File, ByteBuffer>)new d.b()).<File, InputStream>d(File.class, InputStream.class, (o<File, InputStream>)new f.e()).<File, File>c(File.class, File.class, (f<File, File>)new a()).<File, ParcelFileDescriptor>d(File.class, ParcelFileDescriptor.class, (o<File, ParcelFileDescriptor>)new f.b()).<File, File>d(File.class, File.class, (o<File, File>)v.a.a()).r((e.a<?>)new k.a(paramb));
    if (ParcelFileDescriptorRewinder.c())
      registry.r((e.a<?>)new ParcelFileDescriptorRewinder.a()); 
    Class<int> clazz = int.class;
    registry.<int, InputStream>d(clazz, InputStream.class, (o<int, InputStream>)c1).<int, ParcelFileDescriptor>d(clazz, ParcelFileDescriptor.class, (o<int, ParcelFileDescriptor>)b1).<Integer, InputStream>d(Integer.class, InputStream.class, (o<Integer, InputStream>)c1).<Integer, ParcelFileDescriptor>d(Integer.class, ParcelFileDescriptor.class, (o<Integer, ParcelFileDescriptor>)b1).<Integer, Uri>d(Integer.class, Uri.class, (o<Integer, Uri>)d2).<int, AssetFileDescriptor>d(clazz, AssetFileDescriptor.class, (o<int, AssetFileDescriptor>)a2).<Integer, AssetFileDescriptor>d(Integer.class, AssetFileDescriptor.class, (o<Integer, AssetFileDescriptor>)a2).<int, Uri>d(clazz, Uri.class, (o<int, Uri>)d2).<String, InputStream>d(String.class, InputStream.class, (o<String, InputStream>)new e.c()).<Uri, InputStream>d(Uri.class, InputStream.class, (o<Uri, InputStream>)new e.c()).<String, InputStream>d(String.class, InputStream.class, (o<String, InputStream>)new u.c()).<String, ParcelFileDescriptor>d(String.class, ParcelFileDescriptor.class, (o<String, ParcelFileDescriptor>)new u.b()).<String, AssetFileDescriptor>d(String.class, AssetFileDescriptor.class, (o<String, AssetFileDescriptor>)new u.a()).<Uri, InputStream>d(Uri.class, InputStream.class, (o<Uri, InputStream>)new a.c(paramContext.getAssets())).<Uri, ParcelFileDescriptor>d(Uri.class, ParcelFileDescriptor.class, (o<Uri, ParcelFileDescriptor>)new a.b(paramContext.getAssets())).<Uri, InputStream>d(Uri.class, InputStream.class, (o<Uri, InputStream>)new b.a(paramContext)).d(Uri.class, InputStream.class, (o<Uri, InputStream>)new c.a(paramContext));
    if (j >= 29) {
      registry.d(Uri.class, InputStream.class, (o<Uri, InputStream>)new d.c(paramContext));
      registry.d(Uri.class, ParcelFileDescriptor.class, (o<Uri, ParcelFileDescriptor>)new d.b(paramContext));
    } 
    registry.<Uri, InputStream>d(Uri.class, InputStream.class, (o<Uri, InputStream>)new w.d(contentResolver)).<Uri, ParcelFileDescriptor>d(Uri.class, ParcelFileDescriptor.class, (o<Uri, ParcelFileDescriptor>)new w.b(contentResolver)).<Uri, AssetFileDescriptor>d(Uri.class, AssetFileDescriptor.class, (o<Uri, AssetFileDescriptor>)new w.a(contentResolver)).<Uri, InputStream>d(Uri.class, InputStream.class, (o<Uri, InputStream>)new x.a()).<URL, InputStream>d(URL.class, InputStream.class, (o<URL, InputStream>)new e.a()).<Uri, File>d(Uri.class, File.class, (o<Uri, File>)new k.a(paramContext)).<g, InputStream>d(g.class, InputStream.class, (o<g, InputStream>)new a.a()).<byte[], ByteBuffer>d((Class)byte[].class, ByteBuffer.class, (o<byte, ByteBuffer>)new b.a()).<byte[], InputStream>d((Class)byte[].class, InputStream.class, (o<byte, InputStream>)new b.d()).<Uri, Uri>d(Uri.class, Uri.class, (o<Uri, Uri>)v.a.a()).<Drawable, Drawable>d(Drawable.class, Drawable.class, (o<Drawable, Drawable>)v.a.a()).<Drawable, Drawable>c(Drawable.class, Drawable.class, (f<Drawable, Drawable>)new e()).<Bitmap, BitmapDrawable>s(Bitmap.class, BitmapDrawable.class, (e<Bitmap, BitmapDrawable>)new b(resources)).<Bitmap, byte[]>s(Bitmap.class, (Class)byte[].class, (e<Bitmap, byte>)a3).<Drawable, byte[]>s(Drawable.class, (Class)byte[].class, (e<Drawable, byte>)new c(parame, (e)a3, (e)d3)).s(c.class, (Class)byte[].class, (e<c, byte>)d3);
    if (j >= 23) {
      f<ByteBuffer, Bitmap> f2 = VideoDecoder.d(parame);
      registry.c(ByteBuffer.class, Bitmap.class, f2);
      registry.c(ByteBuffer.class, BitmapDrawable.class, (f<ByteBuffer, BitmapDrawable>)new a(resources, f2));
    } 
    this.g = new e(paramContext, paramb, registry, new f(), parama, paramMap, paramList, parami, paramf, paramInt);
  }
  
  private static void a(Context paramContext, GeneratedAppGlideModule paramGeneratedAppGlideModule) {
    if (!c) {
      c = true;
      m(paramContext, paramGeneratedAppGlideModule);
      c = false;
      return;
    } 
    throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
  }
  
  public static c c(Context paramContext) {
    // Byte code:
    //   0: getstatic com/bumptech/glide/c.b : Lcom/bumptech/glide/c;
    //   3: ifnonnull -> 40
    //   6: aload_0
    //   7: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   10: invokestatic d : (Landroid/content/Context;)Lcom/bumptech/glide/GeneratedAppGlideModule;
    //   13: astore_1
    //   14: ldc com/bumptech/glide/c
    //   16: monitorenter
    //   17: getstatic com/bumptech/glide/c.b : Lcom/bumptech/glide/c;
    //   20: ifnonnull -> 28
    //   23: aload_0
    //   24: aload_1
    //   25: invokestatic a : (Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    //   28: ldc com/bumptech/glide/c
    //   30: monitorexit
    //   31: goto -> 40
    //   34: astore_0
    //   35: ldc com/bumptech/glide/c
    //   37: monitorexit
    //   38: aload_0
    //   39: athrow
    //   40: getstatic com/bumptech/glide/c.b : Lcom/bumptech/glide/c;
    //   43: areturn
    // Exception table:
    //   from	to	target	type
    //   17	28	34	finally
    //   28	31	34	finally
    //   35	38	34	finally
  }
  
  private static GeneratedAppGlideModule d(Context paramContext) {
    try {
      GeneratedAppGlideModule generatedAppGlideModule = Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[] { Context.class }).newInstance(new Object[] { paramContext.getApplicationContext() });
    } catch (ClassNotFoundException classNotFoundException) {
      if (Log.isLoggable("Glide", 5))
        Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"); 
      classNotFoundException = null;
    } catch (InstantiationException instantiationException) {
      q(instantiationException);
    } catch (IllegalAccessException illegalAccessException) {
      q(illegalAccessException);
    } catch (NoSuchMethodException noSuchMethodException) {
      q(noSuchMethodException);
    } catch (InvocationTargetException invocationTargetException) {
      q(invocationTargetException);
    } 
    return (GeneratedAppGlideModule)invocationTargetException;
  }
  
  private static o l(Context paramContext) {
    j.e(paramContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    return c(paramContext).k();
  }
  
  private static void m(Context paramContext, GeneratedAppGlideModule paramGeneratedAppGlideModule) {
    n(paramContext, new d(), paramGeneratedAppGlideModule);
  }
  
  private static void n(Context paramContext, d paramd, GeneratedAppGlideModule paramGeneratedAppGlideModule) {
    StringBuilder stringBuilder;
    o.b b1;
    Context context = paramContext.getApplicationContext();
    List<?> list = Collections.emptyList();
    if (paramGeneratedAppGlideModule == null || paramGeneratedAppGlideModule.c())
      list = (new d(context)).a(); 
    if (paramGeneratedAppGlideModule != null && !paramGeneratedAppGlideModule.d().isEmpty()) {
      Set<Class<?>> set = paramGeneratedAppGlideModule.d();
      Iterator<?> iterator = list.iterator();
      while (iterator.hasNext()) {
        b b2 = (b)iterator.next();
        if (!set.contains(b2.getClass()))
          continue; 
        if (Log.isLoggable("Glide", 3)) {
          b1 = (o.b)new StringBuilder();
          b1.append("AppGlideModule excludes manifest GlideModule: ");
          b1.append(b2);
          Log.d("Glide", b1.toString());
        } 
        iterator.remove();
      } 
    } 
    if (Log.isLoggable("Glide", 3))
      for (b null : list) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Discovered GlideModule from manifest: ");
        stringBuilder1.append(b1.getClass());
        Log.d("Glide", stringBuilder1.toString());
      }  
    if (paramGeneratedAppGlideModule != null) {
      b1 = paramGeneratedAppGlideModule.e();
    } else {
      b1 = null;
    } 
    paramd.b(b1);
    null = list.iterator();
    while (null.hasNext())
      ((b)null.next()).a(context, paramd); 
    if (paramGeneratedAppGlideModule != null)
      paramGeneratedAppGlideModule.b(context, paramd); 
    c c1 = paramd.a(context);
    for (b b2 : list) {
      try {
        b2.b(context, c1, c1.h);
      } catch (AbstractMethodError abstractMethodError) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
        stringBuilder.append(b2.getClass().getName());
        throw new IllegalStateException(stringBuilder.toString(), abstractMethodError);
      } 
    } 
    if (abstractMethodError != null)
      abstractMethodError.a(context, (c)stringBuilder, ((c)stringBuilder).h); 
    context.registerComponentCallbacks((ComponentCallbacks)stringBuilder);
    b = (c)stringBuilder;
  }
  
  private static void q(Exception paramException) {
    throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", paramException);
  }
  
  public static i t(Activity paramActivity) {
    return l((Context)paramActivity).e(paramActivity);
  }
  
  public static i u(Context paramContext) {
    return l(paramContext).f(paramContext);
  }
  
  public static i v(FragmentActivity paramFragmentActivity) {
    return l((Context)paramFragmentActivity).g(paramFragmentActivity);
  }
  
  public void b() {
    k.a();
    this.f.b();
    this.e.b();
    this.i.b();
  }
  
  public b e() {
    return this.i;
  }
  
  public e f() {
    return this.e;
  }
  
  d g() {
    return this.k;
  }
  
  public Context h() {
    return this.g.getBaseContext();
  }
  
  e i() {
    return this.g;
  }
  
  public Registry j() {
    return this.h;
  }
  
  public o k() {
    return this.j;
  }
  
  void o(i parami) {
    synchronized (this.l) {
      if (!this.l.contains(parami)) {
        this.l.add(parami);
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("Cannot register already registered manager");
      throw illegalStateException;
    } 
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {}
  
  public void onLowMemory() {
    b();
  }
  
  public void onTrimMemory(int paramInt) {
    r(paramInt);
  }
  
  boolean p(h<?> paramh) {
    synchronized (this.l) {
      Iterator<i> iterator = this.l.iterator();
      while (iterator.hasNext()) {
        if (((i)iterator.next()).z(paramh))
          return true; 
      } 
      return false;
    } 
  }
  
  public void r(int paramInt) {
    k.a();
    synchronized (this.l) {
      Iterator<i> iterator = this.l.iterator();
      while (iterator.hasNext())
        ((i)iterator.next()).onTrimMemory(paramInt); 
      this.f.a(paramInt);
      this.e.a(paramInt);
      this.i.a(paramInt);
      return;
    } 
  }
  
  void s(i parami) {
    synchronized (this.l) {
      if (this.l.contains(parami)) {
        this.l.remove(parami);
        return;
      } 
      IllegalStateException illegalStateException = new IllegalStateException();
      this("Cannot unregister not yet registered manager");
      throw illegalStateException;
    } 
  }
  
  public static interface a {
    e a();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */