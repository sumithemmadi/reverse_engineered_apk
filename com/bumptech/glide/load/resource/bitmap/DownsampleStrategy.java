package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;

public abstract class DownsampleStrategy {
  public static final DownsampleStrategy a = new a();
  
  public static final DownsampleStrategy b = new b();
  
  public static final DownsampleStrategy c = new e();
  
  public static final DownsampleStrategy d = new c();
  
  public static final DownsampleStrategy e;
  
  public static final DownsampleStrategy f = new f();
  
  public static final DownsampleStrategy g;
  
  public static final com.bumptech.glide.load.d<DownsampleStrategy> h;
  
  static final boolean i;
  
  static {
    g = d1;
    h = com.bumptech.glide.load.d.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", d1);
    if (Build.VERSION.SDK_INT >= 19) {
      bool = true;
    } else {
      bool = false;
    } 
    i = bool;
  }
  
  public abstract SampleSizeRounding a(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract float b(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  static {
    boolean bool;
  }
  
  static {
    d d1 = new d();
    e = d1;
  }
  
  public enum SampleSizeRounding {
    b, c;
    
    static {
      SampleSizeRounding sampleSizeRounding1 = new SampleSizeRounding("MEMORY", 0);
      b = sampleSizeRounding1;
      SampleSizeRounding sampleSizeRounding2 = new SampleSizeRounding("QUALITY", 1);
      c = sampleSizeRounding2;
      d = new SampleSizeRounding[] { sampleSizeRounding1, sampleSizeRounding2 };
    }
  }
  
  private static class a extends DownsampleStrategy {
    public DownsampleStrategy.SampleSizeRounding a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return DownsampleStrategy.SampleSizeRounding.c;
    }
    
    public float b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      param1Int1 = Math.min(param1Int2 / param1Int4, param1Int1 / param1Int3);
      float f = 1.0F;
      if (param1Int1 != 0)
        f = 1.0F / Integer.highestOneBit(param1Int1); 
      return f;
    }
  }
  
  private static class b extends DownsampleStrategy {
    public DownsampleStrategy.SampleSizeRounding a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return DownsampleStrategy.SampleSizeRounding.b;
    }
    
    public float b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      param1Int3 = (int)Math.ceil(Math.max(param1Int2 / param1Int4, param1Int1 / param1Int3));
      param1Int2 = Integer.highestOneBit(param1Int3);
      param1Int1 = 1;
      param1Int2 = Math.max(1, param1Int2);
      if (param1Int2 >= param1Int3)
        param1Int1 = 0; 
      return 1.0F / (param1Int2 << param1Int1);
    }
  }
  
  private static class c extends DownsampleStrategy {
    public DownsampleStrategy.SampleSizeRounding a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      DownsampleStrategy.SampleSizeRounding sampleSizeRounding;
      if (b(param1Int1, param1Int2, param1Int3, param1Int4) == 1.0F) {
        sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.c;
      } else {
        sampleSizeRounding = DownsampleStrategy.c.a(param1Int1, param1Int2, param1Int3, param1Int4);
      } 
      return sampleSizeRounding;
    }
    
    public float b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return Math.min(1.0F, DownsampleStrategy.c.b(param1Int1, param1Int2, param1Int3, param1Int4));
    }
  }
  
  private static class d extends DownsampleStrategy {
    public DownsampleStrategy.SampleSizeRounding a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return DownsampleStrategy.SampleSizeRounding.c;
    }
    
    public float b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return Math.max(param1Int3 / param1Int1, param1Int4 / param1Int2);
    }
  }
  
  private static class e extends DownsampleStrategy {
    public DownsampleStrategy.SampleSizeRounding a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return DownsampleStrategy.i ? DownsampleStrategy.SampleSizeRounding.c : DownsampleStrategy.SampleSizeRounding.b;
    }
    
    public float b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      if (DownsampleStrategy.i)
        return Math.min(param1Int3 / param1Int1, param1Int4 / param1Int2); 
      param1Int1 = Math.max(param1Int2 / param1Int4, param1Int1 / param1Int3);
      float f = 1.0F;
      if (param1Int1 != 0)
        f = 1.0F / Integer.highestOneBit(param1Int1); 
      return f;
    }
  }
  
  private static class f extends DownsampleStrategy {
    public DownsampleStrategy.SampleSizeRounding a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return DownsampleStrategy.SampleSizeRounding.c;
    }
    
    public float b(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      return 1.0F;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/bumptech/glide/load/resource/bitmap/DownsampleStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */