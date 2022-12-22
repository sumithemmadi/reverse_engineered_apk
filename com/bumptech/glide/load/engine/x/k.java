package com.bumptech.glide.load.engine.x;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class k implements e {
  private static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
  
  private final l b;
  
  private final Set<Bitmap.Config> c;
  
  private final long d;
  
  private final a e;
  
  private long f;
  
  private long g;
  
  private int h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  public k(long paramLong) {
    this(paramLong, l(), k());
  }
  
  k(long paramLong, l paraml, Set<Bitmap.Config> paramSet) {
    this.d = paramLong;
    this.f = paramLong;
    this.b = paraml;
    this.c = paramSet;
    this.e = new b();
  }
  
  @TargetApi(26)
  private static void f(Bitmap.Config paramConfig) {
    if (Build.VERSION.SDK_INT < 26)
      return; 
    if (paramConfig != Bitmap.Config.HARDWARE)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cannot create a mutable Bitmap with config: ");
    stringBuilder.append(paramConfig);
    stringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static Bitmap g(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    if (paramConfig == null)
      paramConfig = a; 
    return Bitmap.createBitmap(paramInt1, paramInt2, paramConfig);
  }
  
  private void h() {
    if (Log.isLoggable("LruBitmapPool", 2))
      i(); 
  }
  
  private void i() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Hits=");
    stringBuilder.append(this.h);
    stringBuilder.append(", misses=");
    stringBuilder.append(this.i);
    stringBuilder.append(", puts=");
    stringBuilder.append(this.j);
    stringBuilder.append(", evictions=");
    stringBuilder.append(this.k);
    stringBuilder.append(", currentSize=");
    stringBuilder.append(this.g);
    stringBuilder.append(", maxSize=");
    stringBuilder.append(this.f);
    stringBuilder.append("\nStrategy=");
    stringBuilder.append(this.b);
    Log.v("LruBitmapPool", stringBuilder.toString());
  }
  
  private void j() {
    q(this.f);
  }
  
  @TargetApi(26)
  private static Set<Bitmap.Config> k() {
    HashSet<? extends Bitmap.Config> hashSet = new HashSet(Arrays.asList((Object[])Bitmap.Config.values()));
    int i = Build.VERSION.SDK_INT;
    if (i >= 19)
      hashSet.add(null); 
    if (i >= 26)
      hashSet.remove(Bitmap.Config.HARDWARE); 
    return Collections.unmodifiableSet(hashSet);
  }
  
  private static l l() {
    c c;
    if (Build.VERSION.SDK_INT >= 19) {
      n n = new n();
    } else {
      c = new c();
    } 
    return c;
  }
  
  private Bitmap m(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_3
    //   3: invokestatic f : (Landroid/graphics/Bitmap$Config;)V
    //   6: aload_0
    //   7: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   10: astore #4
    //   12: aload_3
    //   13: ifnull -> 22
    //   16: aload_3
    //   17: astore #5
    //   19: goto -> 27
    //   22: getstatic com/bumptech/glide/load/engine/x/k.a : Landroid/graphics/Bitmap$Config;
    //   25: astore #5
    //   27: aload #4
    //   29: iload_1
    //   30: iload_2
    //   31: aload #5
    //   33: invokeinterface d : (IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   38: astore #5
    //   40: aload #5
    //   42: ifnonnull -> 114
    //   45: ldc 'LruBitmapPool'
    //   47: iconst_3
    //   48: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   51: ifeq -> 101
    //   54: new java/lang/StringBuilder
    //   57: astore #4
    //   59: aload #4
    //   61: invokespecial <init> : ()V
    //   64: aload #4
    //   66: ldc 'Missing bitmap='
    //   68: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: pop
    //   72: aload #4
    //   74: aload_0
    //   75: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   78: iload_1
    //   79: iload_2
    //   80: aload_3
    //   81: invokeinterface b : (IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: ldc 'LruBitmapPool'
    //   92: aload #4
    //   94: invokevirtual toString : ()Ljava/lang/String;
    //   97: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   100: pop
    //   101: aload_0
    //   102: aload_0
    //   103: getfield i : I
    //   106: iconst_1
    //   107: iadd
    //   108: putfield i : I
    //   111: goto -> 161
    //   114: aload_0
    //   115: aload_0
    //   116: getfield h : I
    //   119: iconst_1
    //   120: iadd
    //   121: putfield h : I
    //   124: aload_0
    //   125: aload_0
    //   126: getfield g : J
    //   129: aload_0
    //   130: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   133: aload #5
    //   135: invokeinterface e : (Landroid/graphics/Bitmap;)I
    //   140: i2l
    //   141: lsub
    //   142: putfield g : J
    //   145: aload_0
    //   146: getfield e : Lcom/bumptech/glide/load/engine/x/k$a;
    //   149: aload #5
    //   151: invokeinterface a : (Landroid/graphics/Bitmap;)V
    //   156: aload #5
    //   158: invokestatic p : (Landroid/graphics/Bitmap;)V
    //   161: ldc 'LruBitmapPool'
    //   163: iconst_2
    //   164: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   167: ifeq -> 217
    //   170: new java/lang/StringBuilder
    //   173: astore #4
    //   175: aload #4
    //   177: invokespecial <init> : ()V
    //   180: aload #4
    //   182: ldc 'Get bitmap='
    //   184: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: aload #4
    //   190: aload_0
    //   191: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   194: iload_1
    //   195: iload_2
    //   196: aload_3
    //   197: invokeinterface b : (IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;
    //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: ldc 'LruBitmapPool'
    //   208: aload #4
    //   210: invokevirtual toString : ()Ljava/lang/String;
    //   213: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   216: pop
    //   217: aload_0
    //   218: invokespecial h : ()V
    //   221: aload_0
    //   222: monitorexit
    //   223: aload #5
    //   225: areturn
    //   226: astore_3
    //   227: aload_0
    //   228: monitorexit
    //   229: aload_3
    //   230: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	226	finally
    //   22	27	226	finally
    //   27	40	226	finally
    //   45	101	226	finally
    //   101	111	226	finally
    //   114	161	226	finally
    //   161	217	226	finally
    //   217	221	226	finally
  }
  
  @TargetApi(19)
  private static void o(Bitmap paramBitmap) {
    if (Build.VERSION.SDK_INT >= 19)
      paramBitmap.setPremultiplied(true); 
  }
  
  private static void p(Bitmap paramBitmap) {
    paramBitmap.setHasAlpha(true);
    o(paramBitmap);
  }
  
  private void q(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield g : J
    //   6: lload_1
    //   7: lcmp
    //   8: ifle -> 159
    //   11: aload_0
    //   12: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   15: invokeinterface a : ()Landroid/graphics/Bitmap;
    //   20: astore_3
    //   21: aload_3
    //   22: ifnonnull -> 54
    //   25: ldc 'LruBitmapPool'
    //   27: iconst_5
    //   28: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   31: ifeq -> 46
    //   34: ldc 'LruBitmapPool'
    //   36: ldc 'Size mismatch, resetting'
    //   38: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   41: pop
    //   42: aload_0
    //   43: invokespecial i : ()V
    //   46: aload_0
    //   47: lconst_0
    //   48: putfield g : J
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: aload_0
    //   55: getfield e : Lcom/bumptech/glide/load/engine/x/k$a;
    //   58: aload_3
    //   59: invokeinterface a : (Landroid/graphics/Bitmap;)V
    //   64: aload_0
    //   65: aload_0
    //   66: getfield g : J
    //   69: aload_0
    //   70: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   73: aload_3
    //   74: invokeinterface e : (Landroid/graphics/Bitmap;)I
    //   79: i2l
    //   80: lsub
    //   81: putfield g : J
    //   84: aload_0
    //   85: aload_0
    //   86: getfield k : I
    //   89: iconst_1
    //   90: iadd
    //   91: putfield k : I
    //   94: ldc 'LruBitmapPool'
    //   96: iconst_3
    //   97: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   100: ifeq -> 148
    //   103: new java/lang/StringBuilder
    //   106: astore #4
    //   108: aload #4
    //   110: invokespecial <init> : ()V
    //   113: aload #4
    //   115: ldc 'Evicting bitmap='
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload #4
    //   123: aload_0
    //   124: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   127: aload_3
    //   128: invokeinterface f : (Landroid/graphics/Bitmap;)Ljava/lang/String;
    //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: pop
    //   137: ldc 'LruBitmapPool'
    //   139: aload #4
    //   141: invokevirtual toString : ()Ljava/lang/String;
    //   144: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   147: pop
    //   148: aload_0
    //   149: invokespecial h : ()V
    //   152: aload_3
    //   153: invokevirtual recycle : ()V
    //   156: goto -> 2
    //   159: aload_0
    //   160: monitorexit
    //   161: return
    //   162: astore_3
    //   163: aload_0
    //   164: monitorexit
    //   165: goto -> 170
    //   168: aload_3
    //   169: athrow
    //   170: goto -> 168
    // Exception table:
    //   from	to	target	type
    //   2	21	162	finally
    //   25	46	162	finally
    //   46	51	162	finally
    //   54	148	162	finally
    //   148	156	162	finally
  }
  
  @SuppressLint({"InlinedApi"})
  public void a(int paramInt) {
    if (Log.isLoggable("LruBitmapPool", 3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("trimMemory, level=");
      stringBuilder.append(paramInt);
      Log.d("LruBitmapPool", stringBuilder.toString());
    } 
    if (paramInt >= 40 || (Build.VERSION.SDK_INT >= 23 && paramInt >= 20)) {
      b();
      return;
    } 
    if (paramInt >= 20 || paramInt == 15)
      q(n() / 2L); 
  }
  
  public void b() {
    if (Log.isLoggable("LruBitmapPool", 3))
      Log.d("LruBitmapPool", "clearMemory"); 
    q(0L);
  }
  
  public void c(Bitmap paramBitmap) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull -> 288
    //   6: aload_1
    //   7: invokevirtual isRecycled : ()Z
    //   10: ifne -> 271
    //   13: aload_1
    //   14: invokevirtual isMutable : ()Z
    //   17: ifeq -> 171
    //   20: aload_0
    //   21: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   24: aload_1
    //   25: invokeinterface e : (Landroid/graphics/Bitmap;)I
    //   30: i2l
    //   31: aload_0
    //   32: getfield f : J
    //   35: lcmp
    //   36: ifgt -> 171
    //   39: aload_0
    //   40: getfield c : Ljava/util/Set;
    //   43: aload_1
    //   44: invokevirtual getConfig : ()Landroid/graphics/Bitmap$Config;
    //   47: invokeinterface contains : (Ljava/lang/Object;)Z
    //   52: ifne -> 58
    //   55: goto -> 171
    //   58: aload_0
    //   59: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   62: aload_1
    //   63: invokeinterface e : (Landroid/graphics/Bitmap;)I
    //   68: istore_2
    //   69: aload_0
    //   70: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   73: aload_1
    //   74: invokeinterface c : (Landroid/graphics/Bitmap;)V
    //   79: aload_0
    //   80: getfield e : Lcom/bumptech/glide/load/engine/x/k$a;
    //   83: aload_1
    //   84: invokeinterface b : (Landroid/graphics/Bitmap;)V
    //   89: aload_0
    //   90: aload_0
    //   91: getfield j : I
    //   94: iconst_1
    //   95: iadd
    //   96: putfield j : I
    //   99: aload_0
    //   100: aload_0
    //   101: getfield g : J
    //   104: iload_2
    //   105: i2l
    //   106: ladd
    //   107: putfield g : J
    //   110: ldc 'LruBitmapPool'
    //   112: iconst_2
    //   113: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   116: ifeq -> 160
    //   119: new java/lang/StringBuilder
    //   122: astore_3
    //   123: aload_3
    //   124: invokespecial <init> : ()V
    //   127: aload_3
    //   128: ldc_w 'Put bitmap in pool='
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload_3
    //   136: aload_0
    //   137: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   140: aload_1
    //   141: invokeinterface f : (Landroid/graphics/Bitmap;)Ljava/lang/String;
    //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: pop
    //   150: ldc 'LruBitmapPool'
    //   152: aload_3
    //   153: invokevirtual toString : ()Ljava/lang/String;
    //   156: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   159: pop
    //   160: aload_0
    //   161: invokespecial h : ()V
    //   164: aload_0
    //   165: invokespecial j : ()V
    //   168: aload_0
    //   169: monitorexit
    //   170: return
    //   171: ldc 'LruBitmapPool'
    //   173: iconst_2
    //   174: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   177: ifeq -> 264
    //   180: new java/lang/StringBuilder
    //   183: astore_3
    //   184: aload_3
    //   185: invokespecial <init> : ()V
    //   188: aload_3
    //   189: ldc_w 'Reject bitmap from pool, bitmap: '
    //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   195: pop
    //   196: aload_3
    //   197: aload_0
    //   198: getfield b : Lcom/bumptech/glide/load/engine/x/l;
    //   201: aload_1
    //   202: invokeinterface f : (Landroid/graphics/Bitmap;)Ljava/lang/String;
    //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   210: pop
    //   211: aload_3
    //   212: ldc_w ', is mutable: '
    //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: pop
    //   219: aload_3
    //   220: aload_1
    //   221: invokevirtual isMutable : ()Z
    //   224: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   227: pop
    //   228: aload_3
    //   229: ldc_w ', is allowed config: '
    //   232: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   235: pop
    //   236: aload_3
    //   237: aload_0
    //   238: getfield c : Ljava/util/Set;
    //   241: aload_1
    //   242: invokevirtual getConfig : ()Landroid/graphics/Bitmap$Config;
    //   245: invokeinterface contains : (Ljava/lang/Object;)Z
    //   250: invokevirtual append : (Z)Ljava/lang/StringBuilder;
    //   253: pop
    //   254: ldc 'LruBitmapPool'
    //   256: aload_3
    //   257: invokevirtual toString : ()Ljava/lang/String;
    //   260: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   263: pop
    //   264: aload_1
    //   265: invokevirtual recycle : ()V
    //   268: aload_0
    //   269: monitorexit
    //   270: return
    //   271: new java/lang/IllegalStateException
    //   274: astore_1
    //   275: aload_1
    //   276: ldc_w 'Cannot pool recycled bitmap'
    //   279: invokespecial <init> : (Ljava/lang/String;)V
    //   282: aload_1
    //   283: athrow
    //   284: astore_1
    //   285: goto -> 301
    //   288: new java/lang/NullPointerException
    //   291: astore_1
    //   292: aload_1
    //   293: ldc_w 'Bitmap must not be null'
    //   296: invokespecial <init> : (Ljava/lang/String;)V
    //   299: aload_1
    //   300: athrow
    //   301: aload_0
    //   302: monitorexit
    //   303: aload_1
    //   304: athrow
    // Exception table:
    //   from	to	target	type
    //   6	55	284	finally
    //   58	160	284	finally
    //   160	168	284	finally
    //   171	264	284	finally
    //   264	268	284	finally
    //   271	284	284	finally
    //   288	301	284	finally
  }
  
  public Bitmap d(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    Bitmap bitmap1;
    Bitmap bitmap2 = m(paramInt1, paramInt2, paramConfig);
    if (bitmap2 != null) {
      bitmap2.eraseColor(0);
      bitmap1 = bitmap2;
    } else {
      bitmap1 = g(paramInt1, paramInt2, (Bitmap.Config)bitmap1);
    } 
    return bitmap1;
  }
  
  public Bitmap e(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    Bitmap bitmap1 = m(paramInt1, paramInt2, paramConfig);
    Bitmap bitmap2 = bitmap1;
    if (bitmap1 == null)
      bitmap2 = g(paramInt1, paramInt2, paramConfig); 
    return bitmap2;
  }
  
  public long n() {
    return this.f;
  }
  
  private static interface a {
    void a(Bitmap param1Bitmap);
    
    void b(Bitmap param1Bitmap);
  }
  
  private static final class b implements a {
    public void a(Bitmap param1Bitmap) {}
    
    public void b(Bitmap param1Bitmap) {}
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/x/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */