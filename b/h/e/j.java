package b.h.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import b.h.h.f;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

class j {
  @SuppressLint({"BanConcurrentHashMap"})
  private ConcurrentHashMap<Long, androidx.core.content.d.c.b> a = new ConcurrentHashMap<Long, androidx.core.content.d.c.b>();
  
  private void a(Typeface paramTypeface, androidx.core.content.d.c.b paramb) {
    long l = j(paramTypeface);
    if (l != 0L)
      this.a.put(Long.valueOf(l), paramb); 
  }
  
  private androidx.core.content.d.c.c f(androidx.core.content.d.c.b paramb, int paramInt) {
    return g(paramb.a(), paramInt, new b(this));
  }
  
  private static <T> T g(T[] paramArrayOfT, int paramInt, c<T> paramc) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_1
    //   2: iand
    //   3: ifne -> 13
    //   6: sipush #400
    //   9: istore_3
    //   10: goto -> 17
    //   13: sipush #700
    //   16: istore_3
    //   17: iload_1
    //   18: iconst_2
    //   19: iand
    //   20: ifeq -> 29
    //   23: iconst_1
    //   24: istore #4
    //   26: goto -> 32
    //   29: iconst_0
    //   30: istore #4
    //   32: aconst_null
    //   33: astore #5
    //   35: ldc 2147483647
    //   37: istore #6
    //   39: aload_0
    //   40: arraylength
    //   41: istore #7
    //   43: iconst_0
    //   44: istore_1
    //   45: iload_1
    //   46: iload #7
    //   48: if_icmpge -> 136
    //   51: aload_0
    //   52: iload_1
    //   53: aaload
    //   54: astore #8
    //   56: aload_2
    //   57: aload #8
    //   59: invokeinterface a : (Ljava/lang/Object;)I
    //   64: iload_3
    //   65: isub
    //   66: invokestatic abs : (I)I
    //   69: istore #9
    //   71: aload_2
    //   72: aload #8
    //   74: invokeinterface b : (Ljava/lang/Object;)Z
    //   79: iload #4
    //   81: if_icmpne -> 90
    //   84: iconst_0
    //   85: istore #10
    //   87: goto -> 93
    //   90: iconst_1
    //   91: istore #10
    //   93: iload #9
    //   95: iconst_2
    //   96: imul
    //   97: iload #10
    //   99: iadd
    //   100: istore #9
    //   102: aload #5
    //   104: ifnull -> 118
    //   107: iload #6
    //   109: istore #10
    //   111: iload #6
    //   113: iload #9
    //   115: if_icmple -> 126
    //   118: aload #8
    //   120: astore #5
    //   122: iload #9
    //   124: istore #10
    //   126: iinc #1, 1
    //   129: iload #10
    //   131: istore #6
    //   133: goto -> 45
    //   136: aload #5
    //   138: areturn
  }
  
  private static long j(Typeface paramTypeface) {
    if (paramTypeface == null)
      return 0L; 
    try {
      Field field = Typeface.class.getDeclaredField("native_instance");
      field.setAccessible(true);
      return ((Number)field.get(paramTypeface)).longValue();
    } catch (NoSuchFieldException noSuchFieldException) {
      Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", noSuchFieldException);
      return 0L;
    } catch (IllegalAccessException illegalAccessException) {
      Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", illegalAccessException);
      return 0L;
    } 
  }
  
  public Typeface b(Context paramContext, androidx.core.content.d.c.b paramb, Resources paramResources, int paramInt) {
    androidx.core.content.d.c.c c = f(paramb, paramInt);
    if (c == null)
      return null; 
    Typeface typeface = d.d(paramContext, paramResources, c.b(), c.a(), paramInt);
    a(typeface, paramb);
    return typeface;
  }
  
  public Typeface c(Context paramContext, CancellationSignal paramCancellationSignal, f.b[] paramArrayOfb, int paramInt) {
    int i = paramArrayOfb.length;
    f.b b2 = null;
    if (i < 1)
      return null; 
    f.b b1 = h(paramArrayOfb, paramInt);
    try {
      InputStream inputStream = paramContext.getContentResolver().openInputStream(b1.d());
      try {
        return typeface;
      } catch (IOException iOException) {
      
      } finally {}
      k.a(inputStream);
      throw paramContext;
    } catch (IOException iOException) {
    
    } finally {
      b1 = b2;
      k.a((Closeable)b1);
    } 
    k.a((Closeable)b1);
    return null;
  }
  
  protected Typeface d(Context paramContext, InputStream paramInputStream) {
    File file = k.e(paramContext);
    if (file == null)
      return null; 
    try {
      boolean bool = k.d(file, paramInputStream);
      if (!bool)
        return null; 
      return Typeface.createFromFile(file.getPath());
    } catch (RuntimeException runtimeException) {
      return null;
    } finally {
      file.delete();
    } 
  }
  
  public Typeface e(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2) {
    File file = k.e(paramContext);
    if (file == null)
      return null; 
    try {
      boolean bool = k.c(file, paramResources, paramInt1);
      if (!bool)
        return null; 
      return Typeface.createFromFile(file.getPath());
    } catch (RuntimeException runtimeException) {
      return null;
    } finally {
      file.delete();
    } 
  }
  
  protected f.b h(f.b[] paramArrayOfb, int paramInt) {
    return g(paramArrayOfb, paramInt, new a(this));
  }
  
  androidx.core.content.d.c.b i(Typeface paramTypeface) {
    long l = j(paramTypeface);
    return (l == 0L) ? null : this.a.get(Long.valueOf(l));
  }
  
  class a implements c<f.b> {
    a(j this$0) {}
    
    public int c(f.b param1b) {
      return param1b.e();
    }
    
    public boolean d(f.b param1b) {
      return param1b.f();
    }
  }
  
  class b implements c<androidx.core.content.d.c.c> {
    b(j this$0) {}
    
    public int c(androidx.core.content.d.c.c param1c) {
      return param1c.e();
    }
    
    public boolean d(androidx.core.content.d.c.c param1c) {
      return param1c.f();
    }
  }
  
  private static interface c<T> {
    int a(T param1T);
    
    boolean b(T param1T);
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/b/h/e/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */