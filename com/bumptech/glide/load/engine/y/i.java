package com.bumptech.glide.load.engine.y;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class i {
  private final int a;
  
  private final int b;
  
  private final Context c;
  
  private final int d;
  
  i(a parama) {
    int j;
    this.c = parama.b;
    if (e(parama.c)) {
      j = parama.i / 2;
    } else {
      j = parama.i;
    } 
    this.d = j;
    int k = c(parama.c, parama.g, parama.h);
    float f = (parama.d.b() * parama.d.a() * 4);
    int m = Math.round(parama.f * f);
    int n = Math.round(f * parama.e);
    int i1 = k - j;
    int i2 = n + m;
    if (i2 <= i1) {
      this.b = n;
      this.a = m;
    } else {
      float f1 = i1;
      float f2 = parama.f;
      f = parama.e;
      f2 = f1 / (f2 + f);
      this.b = Math.round(f * f2);
      this.a = Math.round(f2 * parama.f);
    } 
    if (Log.isLoggable("MemorySizeCalculator", 3)) {
      boolean bool;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Calculation complete, Calculated memory cache size: ");
      stringBuilder.append(f(this.b));
      stringBuilder.append(", pool size: ");
      stringBuilder.append(f(this.a));
      stringBuilder.append(", byte array size: ");
      stringBuilder.append(f(j));
      stringBuilder.append(", memory class limited? ");
      if (i2 > k) {
        bool = true;
      } else {
        bool = false;
      } 
      stringBuilder.append(bool);
      stringBuilder.append(", max size: ");
      stringBuilder.append(f(k));
      stringBuilder.append(", memoryClass: ");
      stringBuilder.append(parama.c.getMemoryClass());
      stringBuilder.append(", isLowMemoryDevice: ");
      stringBuilder.append(e(parama.c));
      Log.d("MemorySizeCalculator", stringBuilder.toString());
    } 
  }
  
  private static int c(ActivityManager paramActivityManager, float paramFloat1, float paramFloat2) {
    int j = paramActivityManager.getMemoryClass();
    boolean bool = e(paramActivityManager);
    float f = (j * 1024 * 1024);
    if (bool)
      paramFloat1 = paramFloat2; 
    return Math.round(f * paramFloat1);
  }
  
  @TargetApi(19)
  static boolean e(ActivityManager paramActivityManager) {
    return (Build.VERSION.SDK_INT >= 19) ? paramActivityManager.isLowRamDevice() : true;
  }
  
  private String f(int paramInt) {
    return Formatter.formatFileSize(this.c, paramInt);
  }
  
  public int a() {
    return this.d;
  }
  
  public int b() {
    return this.a;
  }
  
  public int d() {
    return this.b;
  }
  
  public static final class a {
    static final int a;
    
    final Context b;
    
    ActivityManager c;
    
    i.c d;
    
    float e = 2.0F;
    
    float f = a;
    
    float g = 0.4F;
    
    float h = 0.33F;
    
    int i = 4194304;
    
    static {
      boolean bool;
      if (Build.VERSION.SDK_INT < 26) {
        bool = true;
      } else {
        bool = true;
      } 
      a = bool;
    }
    
    public a(Context param1Context) {
      this.b = param1Context;
      this.c = (ActivityManager)param1Context.getSystemService("activity");
      this.d = new i.b(param1Context.getResources().getDisplayMetrics());
      if (Build.VERSION.SDK_INT >= 26 && i.e(this.c))
        this.f = 0.0F; 
    }
    
    public i a() {
      return new i(this);
    }
  }
  
  private static final class b implements c {
    private final DisplayMetrics a;
    
    b(DisplayMetrics param1DisplayMetrics) {
      this.a = param1DisplayMetrics;
    }
    
    public int a() {
      return this.a.heightPixels;
    }
    
    public int b() {
      return this.a.widthPixels;
    }
  }
  
  static interface c {
    int a();
    
    int b();
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/engine/y/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */