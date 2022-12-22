package com.bumptech.glide.load.engine.x;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.p.k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class n implements l {
  private static final Bitmap.Config[] a;
  
  private static final Bitmap.Config[] b;
  
  private static final Bitmap.Config[] c = new Bitmap.Config[] { Bitmap.Config.RGB_565 };
  
  private static final Bitmap.Config[] d = new Bitmap.Config[] { Bitmap.Config.ARGB_4444 };
  
  private static final Bitmap.Config[] e = new Bitmap.Config[] { Bitmap.Config.ALPHA_8 };
  
  private final c f = new c();
  
  private final h<b, Bitmap> g = new h<b, Bitmap>();
  
  private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> h = new HashMap<Bitmap.Config, NavigableMap<Integer, Integer>>();
  
  private void g(Integer paramInteger, Bitmap paramBitmap) {
    NavigableMap<Integer, Integer> navigableMap = k(paramBitmap.getConfig());
    Integer integer = navigableMap.get(paramInteger);
    if (integer != null) {
      if (integer.intValue() == 1) {
        navigableMap.remove(paramInteger);
      } else {
        navigableMap.put(paramInteger, Integer.valueOf(integer.intValue() - 1));
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Tried to decrement empty size, size: ");
    stringBuilder.append(paramInteger);
    stringBuilder.append(", removed: ");
    stringBuilder.append(f(paramBitmap));
    stringBuilder.append(", this: ");
    stringBuilder.append(this);
    throw new NullPointerException(stringBuilder.toString());
  }
  
  private b h(int paramInt, Bitmap.Config paramConfig) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Lcom/bumptech/glide/load/engine/x/n$c;
    //   4: iload_1
    //   5: aload_2
    //   6: invokevirtual e : (ILandroid/graphics/Bitmap$Config;)Lcom/bumptech/glide/load/engine/x/n$b;
    //   9: astore_3
    //   10: aload_2
    //   11: invokestatic j : (Landroid/graphics/Bitmap$Config;)[Landroid/graphics/Bitmap$Config;
    //   14: astore #4
    //   16: aload #4
    //   18: arraylength
    //   19: istore #5
    //   21: iconst_0
    //   22: istore #6
    //   24: aload_3
    //   25: astore #7
    //   27: iload #6
    //   29: iload #5
    //   31: if_icmpge -> 147
    //   34: aload #4
    //   36: iload #6
    //   38: aaload
    //   39: astore #8
    //   41: aload_0
    //   42: aload #8
    //   44: invokespecial k : (Landroid/graphics/Bitmap$Config;)Ljava/util/NavigableMap;
    //   47: iload_1
    //   48: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   51: invokeinterface ceilingKey : (Ljava/lang/Object;)Ljava/lang/Object;
    //   56: checkcast java/lang/Integer
    //   59: astore #9
    //   61: aload #9
    //   63: ifnull -> 141
    //   66: aload #9
    //   68: invokevirtual intValue : ()I
    //   71: iload_1
    //   72: bipush #8
    //   74: imul
    //   75: if_icmpgt -> 141
    //   78: aload #9
    //   80: invokevirtual intValue : ()I
    //   83: iload_1
    //   84: if_icmpne -> 114
    //   87: aload #8
    //   89: ifnonnull -> 102
    //   92: aload_3
    //   93: astore #7
    //   95: aload_2
    //   96: ifnull -> 147
    //   99: goto -> 114
    //   102: aload_3
    //   103: astore #7
    //   105: aload #8
    //   107: aload_2
    //   108: invokevirtual equals : (Ljava/lang/Object;)Z
    //   111: ifne -> 147
    //   114: aload_0
    //   115: getfield f : Lcom/bumptech/glide/load/engine/x/n$c;
    //   118: aload_3
    //   119: invokevirtual c : (Lcom/bumptech/glide/load/engine/x/m;)V
    //   122: aload_0
    //   123: getfield f : Lcom/bumptech/glide/load/engine/x/n$c;
    //   126: aload #9
    //   128: invokevirtual intValue : ()I
    //   131: aload #8
    //   133: invokevirtual e : (ILandroid/graphics/Bitmap$Config;)Lcom/bumptech/glide/load/engine/x/n$b;
    //   136: astore #7
    //   138: goto -> 147
    //   141: iinc #6, 1
    //   144: goto -> 24
    //   147: aload #7
    //   149: areturn
  }
  
  static String i(int paramInt, Bitmap.Config paramConfig) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    stringBuilder.append(paramInt);
    stringBuilder.append("](");
    stringBuilder.append(paramConfig);
    stringBuilder.append(")");
    return stringBuilder.toString();
  }
  
  private static Bitmap.Config[] j(Bitmap.Config paramConfig) {
    if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(paramConfig))
      return b; 
    int i = a.a[paramConfig.ordinal()];
    return (i != 1) ? ((i != 2) ? ((i != 3) ? ((i != 4) ? new Bitmap.Config[] { paramConfig } : e) : d) : c) : a;
  }
  
  private NavigableMap<Integer, Integer> k(Bitmap.Config paramConfig) {
    NavigableMap<Object, Object> navigableMap1 = (NavigableMap)this.h.get(paramConfig);
    NavigableMap<Object, Object> navigableMap2 = navigableMap1;
    if (navigableMap1 == null) {
      navigableMap2 = new TreeMap<Object, Object>();
      this.h.put(paramConfig, navigableMap2);
    } 
    return (NavigableMap)navigableMap2;
  }
  
  public Bitmap a() {
    Bitmap bitmap = this.g.f();
    if (bitmap != null)
      g(Integer.valueOf(k.g(bitmap)), bitmap); 
    return bitmap;
  }
  
  public String b(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return i(k.f(paramInt1, paramInt2, paramConfig), paramConfig);
  }
  
  public void c(Bitmap paramBitmap) {
    int i = k.g(paramBitmap);
    b b = this.f.e(i, paramBitmap.getConfig());
    this.g.d(b, paramBitmap);
    NavigableMap<Integer, Integer> navigableMap = k(paramBitmap.getConfig());
    Integer integer = navigableMap.get(Integer.valueOf(b.b));
    int j = b.b;
    i = 1;
    if (integer != null)
      i = 1 + integer.intValue(); 
    navigableMap.put(Integer.valueOf(j), Integer.valueOf(i));
  }
  
  public Bitmap d(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    b b = h(k.f(paramInt1, paramInt2, paramConfig), paramConfig);
    Bitmap bitmap = this.g.a(b);
    if (bitmap != null) {
      g(Integer.valueOf(b.b), bitmap);
      bitmap.reconfigure(paramInt1, paramInt2, paramConfig);
    } 
    return bitmap;
  }
  
  public int e(Bitmap paramBitmap) {
    return k.g(paramBitmap);
  }
  
  public String f(Bitmap paramBitmap) {
    return i(k.g(paramBitmap), paramBitmap.getConfig());
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SizeConfigStrategy{groupedMap=");
    stringBuilder.append(this.g);
    stringBuilder.append(", sortedSizes=(");
    for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.h.entrySet()) {
      stringBuilder.append(entry.getKey());
      stringBuilder.append('[');
      stringBuilder.append(entry.getValue());
      stringBuilder.append("], ");
    } 
    if (!this.h.isEmpty())
      stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length(), ""); 
    stringBuilder.append(")}");
    return stringBuilder.toString();
  }
  
  static {
    Bitmap.Config[] arrayOfConfig1 = new Bitmap.Config[2];
    arrayOfConfig1[0] = Bitmap.Config.ARGB_8888;
    arrayOfConfig1[1] = null;
    Bitmap.Config[] arrayOfConfig2 = arrayOfConfig1;
    if (Build.VERSION.SDK_INT >= 26) {
      arrayOfConfig2 = Arrays.<Bitmap.Config>copyOf(arrayOfConfig1, 3);
      arrayOfConfig2[arrayOfConfig2.length - 1] = Bitmap.Config.RGBA_F16;
    } 
    a = arrayOfConfig2;
    b = arrayOfConfig2;
  }
  
  static final class b implements m {
    private final n.c a;
    
    int b;
    
    private Bitmap.Config c;
    
    public b(n.c param1c) {
      this.a = param1c;
    }
    
    public void a() {
      this.a.c(this);
    }
    
    public void b(int param1Int, Bitmap.Config param1Config) {
      this.b = param1Int;
      this.c = param1Config;
    }
    
    public boolean equals(Object param1Object) {
      boolean bool = param1Object instanceof b;
      boolean bool1 = false;
      boolean bool2 = bool1;
      if (bool) {
        param1Object = param1Object;
        bool2 = bool1;
        if (this.b == ((b)param1Object).b) {
          bool2 = bool1;
          if (k.c(this.c, ((b)param1Object).c))
            bool2 = true; 
        } 
      } 
      return bool2;
    }
    
    public int hashCode() {
      byte b1;
      int i = this.b;
      Bitmap.Config config = this.c;
      if (config != null) {
        b1 = config.hashCode();
      } else {
        b1 = 0;
      } 
      return i * 31 + b1;
    }
    
    public String toString() {
      return n.i(this.b, this.c);
    }
  }
  
  static class c extends d<b> {
    protected n.b d() {
      return new n.b(this);
    }
    
    public n.b e(int param1Int, Bitmap.Config param1Config) {
      n.b b = (n.b)b();
      b.b(param1Int, param1Config);
      return b;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/x/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */