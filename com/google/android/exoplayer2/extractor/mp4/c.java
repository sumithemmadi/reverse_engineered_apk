package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class c {
  public final int a;
  
  public c(int paramInt) {
    this.a = paramInt;
  }
  
  public static String a(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");
    stringBuilder.append((char)(paramInt >> 24 & 0xFF));
    stringBuilder.append((char)(paramInt >> 16 & 0xFF));
    stringBuilder.append((char)(paramInt >> 8 & 0xFF));
    stringBuilder.append((char)(paramInt & 0xFF));
    return stringBuilder.toString();
  }
  
  public static int b(int paramInt) {
    return paramInt & 0xFFFFFF;
  }
  
  public static int c(int paramInt) {
    return paramInt >> 24 & 0xFF;
  }
  
  public String toString() {
    return a(this.a);
  }
  
  static final class a extends c {
    public final long b;
    
    public final List<c.b> c;
    
    public final List<a> d;
    
    public a(int param1Int, long param1Long) {
      super(param1Int);
      this.b = param1Long;
      this.c = new ArrayList<c.b>();
      this.d = new ArrayList<a>();
    }
    
    public void d(a param1a) {
      this.d.add(param1a);
    }
    
    public void e(c.b param1b) {
      this.c.add(param1b);
    }
    
    public a f(int param1Int) {
      int i = this.d.size();
      for (byte b = 0; b < i; b++) {
        a a1 = this.d.get(b);
        if (a1.a == param1Int)
          return a1; 
      } 
      return null;
    }
    
    public c.b g(int param1Int) {
      int i = this.c.size();
      for (byte b = 0; b < i; b++) {
        c.b b1 = this.c.get(b);
        if (b1.a == param1Int)
          return b1; 
      } 
      return null;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(c.a(this.a));
      stringBuilder.append(" leaves: ");
      stringBuilder.append(Arrays.toString(this.c.toArray()));
      stringBuilder.append(" containers: ");
      stringBuilder.append(Arrays.toString(this.d.toArray()));
      return stringBuilder.toString();
    }
  }
  
  static final class b extends c {
    public final v b;
    
    public b(int param1Int, v param1v) {
      super(param1Int);
      this.b = param1v;
    }
  }
}


/* Location:              /home/sumith/decompile/test/classes-dex2jar.jar!/com/google/android/exoplayer2/extractor/mp4/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */