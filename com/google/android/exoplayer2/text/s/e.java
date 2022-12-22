package com.google.android.exoplayer2.text.s;

import android.text.Layout;
import com.google.android.exoplayer2.text.b;
import com.google.android.exoplayer2.util.o;

public final class e extends b {
  public final long q;
  
  public final long r;
  
  private e(long paramLong1, long paramLong2, CharSequence paramCharSequence, Layout.Alignment paramAlignment, float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, int paramInt3, float paramFloat3) {
    super(paramCharSequence, paramAlignment, paramFloat1, paramInt1, paramInt2, paramFloat2, paramInt3, paramFloat3);
    this.q = paramLong1;
    this.r = paramLong2;
  }
  
  public boolean a() {
    boolean bool;
    if (this.f == -3.4028235E38F && this.i == 0.5F) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public static class b {
    private long a;
    
    private long b;
    
    private CharSequence c;
    
    private int d;
    
    private float e;
    
    private int f;
    
    private int g;
    
    private float h;
    
    private int i;
    
    private float j;
    
    public b() {
      g();
    }
    
    private static float b(float param1Float, int param1Int) {
      return (param1Float != -3.4028235E38F && param1Int == 0 && (param1Float < 0.0F || param1Float > 1.0F)) ? 1.0F : ((param1Float != -3.4028235E38F) ? param1Float : ((param1Int == 0) ? 1.0F : -3.4028235E38F));
    }
    
    private static Layout.Alignment c(int param1Int) {
      if (param1Int != 1)
        if (param1Int != 2) {
          if (param1Int != 3) {
            if (param1Int != 4) {
              if (param1Int != 5) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown textAlignment: ");
                stringBuilder.append(param1Int);
                o.f("WebvttCueBuilder", stringBuilder.toString());
                return null;
              } 
              return Layout.Alignment.ALIGN_OPPOSITE;
            } 
          } else {
            return Layout.Alignment.ALIGN_OPPOSITE;
          } 
        } else {
          return Layout.Alignment.ALIGN_CENTER;
        }  
      return Layout.Alignment.ALIGN_NORMAL;
    }
    
    private static float d(int param1Int, float param1Float) {
      if (param1Int != 0) {
        if (param1Int != 1) {
          if (param1Int == 2)
            return param1Float; 
          throw new IllegalStateException(String.valueOf(param1Int));
        } 
        return (param1Float <= 0.5F) ? (param1Float * 2.0F) : ((1.0F - param1Float) * 2.0F);
      } 
      return 1.0F - param1Float;
    }
    
    private static float e(int param1Int) {
      return (param1Int != 4) ? ((param1Int != 5) ? 0.5F : 1.0F) : 0.0F;
    }
    
    private static int f(int param1Int) {
      if (param1Int != 1)
        if (param1Int != 3) {
          if (param1Int != 4)
            return (param1Int != 5) ? 1 : 2; 
        } else {
          return 2;
        }  
      return 0;
    }
    
    public e a() {
      this.e = b(this.e, this.f);
      if (this.h == -3.4028235E38F)
        this.h = e(this.d); 
      if (this.i == Integer.MIN_VALUE)
        this.i = f(this.d); 
      this.j = Math.min(this.j, d(this.i, this.h));
      return new e(this.a, this.b, (CharSequence)com.google.android.exoplayer2.util.e.e(this.c), c(this.d), this.e, this.f, this.g, this.h, this.i, this.j, null);
    }
    
    public void g() {
      this.a = 0L;
      this.b = 0L;
      this.c = null;
      this.d = 2;
      this.e = -3.4028235E38F;
      this.f = 1;
      this.g = 0;
      this.h = -3.4028235E38F;
      this.i = Integer.MIN_VALUE;
      this.j = 1.0F;
    }
    
    public b h(long param1Long) {
      this.b = param1Long;
      return this;
    }
    
    public b i(float param1Float) {
      this.e = param1Float;
      return this;
    }
    
    public b j(int param1Int) {
      this.g = param1Int;
      return this;
    }
    
    public b k(int param1Int) {
      this.f = param1Int;
      return this;
    }
    
    public b l(float param1Float) {
      this.h = param1Float;
      return this;
    }
    
    public b m(int param1Int) {
      this.i = param1Int;
      return this;
    }
    
    public b n(long param1Long) {
      this.a = param1Long;
      return this;
    }
    
    public b o(CharSequence param1CharSequence) {
      this.c = param1CharSequence;
      return this;
    }
    
    public b p(int param1Int) {
      this.d = param1Int;
      return this;
    }
    
    public b q(float param1Float) {
      this.j = param1Float;
      return this;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/text/s/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */